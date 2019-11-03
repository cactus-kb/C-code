package package1;

import java.util.ArrayList;
import java.util.List;

public class Angel {
    //杨辉三角形
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        //先把第一行插进去
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1) {
            return result;
        }
        //再把第二行插进去
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) {
            return result;
        }
        //后续i行的情况
        for (int row = 3; row < numRows; row++) {
            //为了知道当前行的内容，需要先知道上一行
            //row 本来是从1开始计数的
            //row - 1是把从1开始计数的数字转成下标
            //row - 1 - 1取到上一行的下标
            List<Integer> pervLine = result.get(row - 1 - 1);
            //创建一个表示当前行的List
            List<Integer> curLine = new ArrayList<>();
            //把当前行中填充一些元素
            //当前行的第一列一定是1
            curLine.add(1);
            //后续的列都是根据pervLine来获取到的
            for (int col = 1; col < row - 1; col++) {
                curLine.add(pervLine.get(col - 1) + pervLine.get(col));
            }
            //加上最后一个1
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}
