package point3d_2d;

public class Point_2d {
    private float pointX;
    private float pointY;

    public Point_2d() {
    }

    public Point_2d(float pointX, float pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public float getPointX() {
        return pointX;
    }

    public void setPointX(float pointX) {
        this.pointX = pointX;
    }

    public float getPointY() {
        return pointY;
    }

    public void setPointY(float pointY) {
        this.pointY = pointY;
    }
    public void setXY(float pointX,float pointY){
        this.pointX=pointX;
        this.pointY=pointY;
    }
    public float[] getXY(){
        float[] xy={this.getPointX(),this.getPointY()};
        return xy;
    }
    public String toString(){
        return "with x="+getPointX()+" with y="+getPointY()+".Result Point 2d:{"+getPointX()+","+getPointY()+"}";
    }

}
