public class MovableCircle extends MovablePoint implements Movable{
    int radius;
    MovablePoint center;
    MovableCircle(int x, int xSpeed, int y, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return super.toString() + ",radius=" + radius;
    }
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
