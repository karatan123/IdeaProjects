import java.util.Scanner;

/**
 * 1 定义类 Circle
 * 2 抽取属性
 * 3 定义方法 4  调用方法并打印结果
 */
public class CircleV2 {
    /*** 圆的半径*/
    public double radius;
    /**圆的周长*/
    public double perimeter;
    /**圆的面积*/
    public double area;

    public CircleV2(){
        inputRadius();
    }
/**带参构造*/
    public CircleV2(double radius1){
        if(radius1>0){
            radius=radius1;
        }else{
            inputRadius();
        }
    }

    private void inputRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆半径：");
        radius= input.nextDouble();
        input.close();
    }

    public void showPerimeter(){
        if(radius <=0){
            inputRadius();
        }
        perimeter = 2 * Math.PI*radius;
        System.out.println("周长为："+ perimeter);
    }

    public void showArea(){
        if (radius<=0){
            inputRadius();
        }
        area= Math.PI*Math.pow(radius,2);
        System.out.println("面积为：" + area);
    }

}
