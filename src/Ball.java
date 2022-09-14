public class Ball {//ghvghv
    private double radius;
    private String color;
    public Ball(){
        radius = 0;
        color = "void";
    }
    public Ball(double r){
        radius = r;
        color = "void";
    }
    public Ball(double r, String c){
        radius = r;
        color = c;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public double GetRadius(double radius){
        return radius;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public String GetColor(String color){
        return color;
    }
    public void ReColor(String color){
        SetColor(color);
        System.out.println("Current color is "+ color);
    }
    public void BallStatus(){
        System.out.println("Ball radius is "+radius+" and color is " + color);
    }
}