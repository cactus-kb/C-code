import java.util.Scanner;
public class Main2 {
    static String output="人民币";
    static String[] money;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);//输入 
        while (sc.hasNextLine()) {
            String sentence=sc.nextLine();
            money=sentence.split("\\.");
            if(sentence.contains(".")){
                leftRead(money[0]);
                output+="元";
                rightRead(money[1]);
            }else{
                leftRead(money[0]);
                output+="元整";
            }

            if(output.contains("零元") && !output.equals("人民币零元整")){
                output= output.substring(0,3)+output.substring(5,output.length());
            }
            System.out.println(output);
            output="人民币";
        }
    }

    public static void rightRead(String money){
        char[] right=money.toCharArray();
        if(right[0]=='0' && right[1]=='0'){
            output+="整";
            return;
        }
        for(int i = 0 ; i<2;i++){
            if(!(i==1 && right[1]=='0')){// 1.40 时不打出0分
                output += number(Integer.parseInt(String.valueOf(right[i])));
                if(!output.endsWith("零")){
                    output += right(i);
                }else{
                    output=output.substring(0,output.length()-1);//去掉最后的文字
                }
            }
        }

    }
    public static void leftRead(String money){
        char[] left=money.toCharArray();
        int length = money.length();

        for(int i=left.length-1;i>=0;i--){
            if(output.endsWith("零")&&Integer.parseInt((String.valueOf(left[(left.length-1)-i])))==0){//连续多个零的情况
                if(Integer.parseInt((String.valueOf(left[(left.length-1)-i])))!=0 || i%4==0){ // i%4==0  打出万亿兆等单位
                    if( (left(i+1)=="万"||left(i+1)=="亿" ) &&output.endsWith("零")){
                        output=output.substring(0,output.length()-1);//去掉最后的文字
                    }
                    output += left(i+1);
                }
                continue;
            }
            if(!((left.length%4==2 )&& i==left.length-1 && Integer.parseInt((String.valueOf(left[(left.length-1)-i])))==1)){// 10输出十   100输出一百  
                output += number(Integer.parseInt((String.valueOf(left[(left.length-1)-i]))));
            }
            if(Integer.parseInt((String.valueOf(left[(left.length-1)-i])))!=0 || i%4==0){ // i%4==0  打出万亿兆等单位
                output += left(i+1);
            }
        }
    }
    public static String right(int i){
        switch(i){
            case 0:
                return "角";
            case 1:
                return "分";
        }
        return "";
    }
    public static String left(int i){
        if(i==0){
            return "";
        }
        int k= i%13;
        switch(k){
            case 0:
                return "兆";
            case 1:
                return "";
            case 2:
                return "拾";
            case 3:
                return "佰";
            case 4:
                return "仟";
            case 5:
                return "万";
            case 6:
                return "拾";
            case 7:
                return "佰";
            case 8:
                return "仟";
            case 9:
                return "亿";
            case 10:
                return "拾";
            case 11:
                return "佰";
            case 12:
                return "仟";

        }
        return "";
    }
    public static String number(int i){
        switch(i){
            case 0:
                return "零";
            case 1:
                return "壹";
            case 2:
                return "贰";
            case 3:
                return "叁";
            case 4:
                return "肆";
            case 5:
                return "伍";
            case 6:
                return "陆";
            case 7:
                return "柒";
            case 8:
                return "捌";
            case 9:
                return "玖";
        }
        return "";
    }

}