public class CircleV3 {
    /*** 圆的半径*/
    private double radius;
    /**圆的周长*/
    private double perimeter;

    /**圆的面积*/
    private double area;

//    public //共有的
//    private //私有的
//    (default)  //默认  同一个包
//    protected //受保护的同一包或有父子关系


    public void show(){
        System.out.println("周长为：" + this.perimeter);
        System.out.println("面积为：" + this.getArea());
    }

    public CircleV3(double radius) {
        //this.radius = radius;
        this.setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius <=0){
            radius =1;
        }else {
            //this->自指针
            this.radius = radius;
        }
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI*radius;
        return perimeter;
    }

    public double getArea() {
        area= Math.PI*Math.pow(radius,2);
        return area;
    }
}
