//Math.ceil(45.1)   46
//Math.floor(55.6)  55
//Math.ceil(-45.1)  -45

public class MethodTest {
    public static void main(String[] args){
        //设置三个顶点坐标
        int x1=90,y1=180;
        int x2=205,y2=85;
        int x3=310,y3=240;
        //根据公式计算出三条边的边长
        double a=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        double b=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        double c=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        //根据公式计算三个角的弧度
        double radianA = Math.acos((a*a-b*b-c*c)/(-2*b*c));
        double radianB = Math.acos((b*b-a*a-c*c)/(-2*a*c));
        double radianC = Math.acos((c*c-b*b-a*a)/(-2*b*a));

        //根据弧度转换度
        double degreeA = Math.toDegrees(radianA);
        double degreeB = Math.toDegrees(radianB);
        double degreeC = Math.toDegrees(radianC);


    }

}
