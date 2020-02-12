package servlet;

import entity.Goods;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/updateGoods")
public class UpdateGoodsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset = UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String goodsIdString = req.getParameter("goodsID");
        int goodsId = Integer.valueOf(goodsIdString);

        String name = req.getParameter("name");
        String introduce = req.getParameter("introduce");
        String stock = req.getParameter("stock");
        String unit = req.getParameter("unit");
        String price = req.getParameter("price");//此处价格为字符串“12.34”
        double doublePrice = Double.valueOf(price);//转为小数12.34
        int realPrice = new Double(doublePrice * 100).intValue();//转为整数1234，便于处理
        String discount = req.getParameter("discount");


        //1.查看当前的goodsId是否存在
        Goods goods = this.getGoods(goodsId);
        if (goods == null) {
            System.out.println("没有该商品");
            resp.sendRedirect("index.html");
        } else {
            //2.检查完成之后，如果存在对应的id，则进行删除
            goods.setName(name);
            goods.setIntroduce(introduce);
            goods.setStock(Integer.valueOf(stock));
            goods.setUnit(unit);
            goods.setPrice(Integer.valueOf(price));
            goods.setDiscount(Integer.valueOf(discount));
            //把查询的商品进行更新，随后对数据库进行操作，把当前的goods进行更新
            boolean effect = this.modifyGoods(goods);
            if (effect) {
                System.out.println("更新成功！");
                resp.sendRedirect("goodsbrowse.html");
            } else {
                System.out.println("更新失败！");
                resp.sendRedirect("index.html");
            }
        }
    }

    public boolean modifyGoods(Goods goods) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        boolean effect = false;
        try {
            String sql = "update goods set introduce=?,stock=?,price=?,discount=? where id = ?";
            connection = DBUtil.getConnection(true);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,goods.getIntroduce());
            preparedStatement.setInt(2,goods.getStock());
            preparedStatement.setInt(3,goods.getPrice());
            preparedStatement.setInt(4,goods.getDiscount());
            preparedStatement.setInt(5,goods.getId());
            effect = (preparedStatement.executeUpdate() == 1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,preparedStatement,null);
        }
        return effect;
    }

    private Goods getGoods(int goodsId) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Goods goods = null;

        try {
            String sql = "select * from goods where id = ?";
            connection = DBUtil.getConnection(true);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,goodsId);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                goods = this.extractGoods(resultSet);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection,preparedStatement,resultSet);
        }
        return goods;
    }

    //解析ResultSet当中的商品信息，组转从一个商品的对象goods
    public Goods extractGoods(ResultSet resultSet) throws SQLException{
        Goods goods = new Goods();
        goods.setId(resultSet.getInt("id"));
        goods.setName(resultSet.getString("name"));
        goods.setIntroduce(resultSet.getNString("introduce"));
        goods.setStock(resultSet.getInt("stock"));
        goods.setUnit(resultSet.getString("unit"));
        goods.setPrice(resultSet.getInt("price"));
        goods.setDiscount(resultSet.getInt("discount"));
        return goods;
    }
}
















