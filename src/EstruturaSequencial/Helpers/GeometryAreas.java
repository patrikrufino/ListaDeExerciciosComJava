package EstruturaSequencial.Helpers;

public class GeometryAreas {
    public static final float PI = 3.142f;

    public static float circleArea (float raio) {
        return (PI * (raio * raio));
    }

    public static float squareArea (float sideSquare) {
        return (float) Math.pow(sideSquare, 2);
    }
}
