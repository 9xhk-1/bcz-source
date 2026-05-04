package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PointKt {
    public static final int component1(@m80.k Point point) {
        return point.x;
    }

    public static final int component2(@m80.k Point point) {
        return point.y;
    }

    @m80.k
    public static final Point div(@m80.k Point point, float f11) {
        return new Point(Math.round(point.x / f11), Math.round(point.y / f11));
    }

    @m80.k
    public static final Point minus(@m80.k Point point, @m80.k Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @m80.k
    public static final Point plus(@m80.k Point point, @m80.k Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @m80.k
    public static final Point times(@m80.k Point point, float f11) {
        return new Point(Math.round(point.x * f11), Math.round(point.y * f11));
    }

    @m80.k
    public static final Point toPoint(@m80.k PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @m80.k
    public static final PointF toPointF(@m80.k Point point) {
        return new PointF(point);
    }

    @m80.k
    public static final Point unaryMinus(@m80.k Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final float component1(@m80.k PointF pointF) {
        return pointF.x;
    }

    public static final float component2(@m80.k PointF pointF) {
        return pointF.y;
    }

    @m80.k
    public static final PointF div(@m80.k PointF pointF, float f11) {
        return new PointF(pointF.x / f11, pointF.y / f11);
    }

    @m80.k
    public static final PointF times(@m80.k PointF pointF, float f11) {
        return new PointF(pointF.x * f11, pointF.y * f11);
    }

    @m80.k
    public static final PointF unaryMinus(@m80.k PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }

    @m80.k
    public static final PointF minus(@m80.k PointF pointF, @m80.k PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @m80.k
    public static final PointF plus(@m80.k PointF pointF, @m80.k PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @m80.k
    public static final Point minus(@m80.k Point point, int i11) {
        Point point2 = new Point(point.x, point.y);
        int i12 = -i11;
        point2.offset(i12, i12);
        return point2;
    }

    @m80.k
    public static final Point plus(@m80.k Point point, int i11) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i11, i11);
        return point2;
    }

    @m80.k
    public static final PointF minus(@m80.k PointF pointF, float f11) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f12 = -f11;
        pointF2.offset(f12, f12);
        return pointF2;
    }

    @m80.k
    public static final PointF plus(@m80.k PointF pointF, float f11) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f11, f11);
        return pointF2;
    }
}
