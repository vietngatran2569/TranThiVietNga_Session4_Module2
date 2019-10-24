package point3d_2d;

public class Point_3d extends Point_2d {
    private float pointZ;
    public Point_3d(){
    }

    public Point_3d(float pointZ) {
        this.pointZ = pointZ;
    }

    public Point_3d(float pointX, float pointY, float pointZ) {
        super(pointX, pointY);
        this.pointZ = pointZ;
    }

    public float getPointZ() {
        return pointZ;
    }

    public void setPointZ(float pointZ) {
        this.pointZ = pointZ;
    }
    public float[] getXYZ(){
        float[] xyz={super.getPointX(),super.getPointY(),getPointZ()};
        return xyz;
    }

    @Override
    public String toString() {
        return super.toString()+ "with Z="+getPointZ()+".Result 3d:{"+super.getPointX()+","+super.getPointY()+","+getPointZ()+"}";
    }
}
