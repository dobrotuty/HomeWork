public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.3,"red");
        Ball b2 = new Ball(3);
        Ball b3 = new Ball();
        b1.ReColor("yellow");
        b1.BallStatus();
        b2.BallStatus();
        b3.BallStatus();
    }
}
