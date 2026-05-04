package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class BoundingBox implements Serializable {
    private static final long serialVersionUID = -1286036817192127343L;
    private static final Vector3 tmpVector = new Vector3();
    public final Vector3 min = new Vector3();
    public final Vector3 max = new Vector3();
    private final Vector3 cnt = new Vector3();
    private final Vector3 dim = new Vector3();

    public BoundingBox() {
        clr();
    }

    public static final float max(float f11, float f12) {
        return f11 > f12 ? f11 : f12;
    }

    public static final float min(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    public BoundingBox clr() {
        return set(this.min.set(0.0f, 0.0f, 0.0f), this.max.set(0.0f, 0.0f, 0.0f));
    }

    public boolean contains(BoundingBox boundingBox) {
        if (!isValid()) {
            return true;
        }
        Vector3 vector3 = this.min;
        float f11 = vector3.f12537x;
        Vector3 vector32 = boundingBox.min;
        if (f11 > vector32.f12537x || vector3.f12538y > vector32.f12538y || vector3.f12539z > vector32.f12539z) {
            return false;
        }
        Vector3 vector33 = this.max;
        float f12 = vector33.f12537x;
        Vector3 vector34 = boundingBox.max;
        return f12 >= vector34.f12537x && vector33.f12538y >= vector34.f12538y && vector33.f12539z >= vector34.f12539z;
    }

    public BoundingBox ext(Vector3 vector3) {
        Vector3 vector32 = this.min;
        Vector3 vector33 = vector32.set(min(vector32.f12537x, vector3.f12537x), min(this.min.f12538y, vector3.f12538y), min(this.min.f12539z, vector3.f12539z));
        Vector3 vector34 = this.max;
        return set(vector33, vector34.set(Math.max(vector34.f12537x, vector3.f12537x), Math.max(this.max.f12538y, vector3.f12538y), Math.max(this.max.f12539z, vector3.f12539z)));
    }

    public Vector3 getCenter(Vector3 vector3) {
        return vector3.set(this.cnt);
    }

    public float getCenterX() {
        return this.cnt.f12537x;
    }

    public float getCenterY() {
        return this.cnt.f12538y;
    }

    public float getCenterZ() {
        return this.cnt.f12539z;
    }

    public Vector3 getCorner000(Vector3 vector3) {
        Vector3 vector32 = this.min;
        return vector3.set(vector32.f12537x, vector32.f12538y, vector32.f12539z);
    }

    public Vector3 getCorner001(Vector3 vector3) {
        Vector3 vector32 = this.min;
        return vector3.set(vector32.f12537x, vector32.f12538y, this.max.f12539z);
    }

    public Vector3 getCorner010(Vector3 vector3) {
        Vector3 vector32 = this.min;
        return vector3.set(vector32.f12537x, this.max.f12538y, vector32.f12539z);
    }

    public Vector3 getCorner011(Vector3 vector3) {
        float f11 = this.min.f12537x;
        Vector3 vector32 = this.max;
        return vector3.set(f11, vector32.f12538y, vector32.f12539z);
    }

    public Vector3 getCorner100(Vector3 vector3) {
        float f11 = this.max.f12537x;
        Vector3 vector32 = this.min;
        return vector3.set(f11, vector32.f12538y, vector32.f12539z);
    }

    public Vector3 getCorner101(Vector3 vector3) {
        Vector3 vector32 = this.max;
        return vector3.set(vector32.f12537x, this.min.f12538y, vector32.f12539z);
    }

    public Vector3 getCorner110(Vector3 vector3) {
        Vector3 vector32 = this.max;
        return vector3.set(vector32.f12537x, vector32.f12538y, this.min.f12539z);
    }

    public Vector3 getCorner111(Vector3 vector3) {
        Vector3 vector32 = this.max;
        return vector3.set(vector32.f12537x, vector32.f12538y, vector32.f12539z);
    }

    public float getDepth() {
        return this.dim.f12539z;
    }

    public Vector3 getDimensions(Vector3 vector3) {
        return vector3.set(this.dim);
    }

    public float getHeight() {
        return this.dim.f12538y;
    }

    public Vector3 getMax(Vector3 vector3) {
        return vector3.set(this.max);
    }

    public Vector3 getMin(Vector3 vector3) {
        return vector3.set(this.min);
    }

    public float getWidth() {
        return this.dim.f12537x;
    }

    public BoundingBox inf() {
        this.min.set(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        this.max.set(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        this.cnt.set(0.0f, 0.0f, 0.0f);
        this.dim.set(0.0f, 0.0f, 0.0f);
        return this;
    }

    public boolean intersects(BoundingBox boundingBox) {
        if (isValid()) {
            return Math.abs(this.cnt.f12537x - boundingBox.cnt.f12537x) <= (this.dim.f12537x / 2.0f) + (boundingBox.dim.f12537x / 2.0f) && Math.abs(this.cnt.f12538y - boundingBox.cnt.f12538y) <= (this.dim.f12538y / 2.0f) + (boundingBox.dim.f12538y / 2.0f) && Math.abs(this.cnt.f12539z - boundingBox.cnt.f12539z) <= (this.dim.f12539z / 2.0f) + (boundingBox.dim.f12539z / 2.0f);
        }
        return false;
    }

    public boolean isValid() {
        Vector3 vector3 = this.min;
        float f11 = vector3.f12537x;
        Vector3 vector32 = this.max;
        return f11 <= vector32.f12537x && vector3.f12538y <= vector32.f12538y && vector3.f12539z <= vector32.f12539z;
    }

    public BoundingBox mul(Matrix4 matrix4) {
        Vector3 vector3 = this.min;
        float f11 = vector3.f12537x;
        float f12 = vector3.f12538y;
        float f13 = vector3.f12539z;
        Vector3 vector32 = this.max;
        float f14 = vector32.f12537x;
        float f15 = vector32.f12538y;
        float f16 = vector32.f12539z;
        inf();
        Vector3 vector33 = tmpVector;
        ext(vector33.set(f11, f12, f13).mul(matrix4));
        ext(vector33.set(f11, f12, f16).mul(matrix4));
        ext(vector33.set(f11, f15, f13).mul(matrix4));
        ext(vector33.set(f11, f15, f16).mul(matrix4));
        ext(vector33.set(f14, f12, f13).mul(matrix4));
        ext(vector33.set(f14, f12, f16).mul(matrix4));
        ext(vector33.set(f14, f15, f13).mul(matrix4));
        ext(vector33.set(f14, f15, f16).mul(matrix4));
        return this;
    }

    public BoundingBox set(BoundingBox boundingBox) {
        return set(boundingBox.min, boundingBox.max);
    }

    public String toString() {
        return "[" + this.min + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.max + "]";
    }

    public void update() {
        this.cnt.set(this.min).add(this.max).scl(0.5f);
        this.dim.set(this.max).sub(this.min);
    }

    public boolean contains(OrientedBoundingBox orientedBoundingBox) {
        Vector3 vector3 = tmpVector;
        return contains(orientedBoundingBox.getCorner000(vector3)) && contains(orientedBoundingBox.getCorner001(vector3)) && contains(orientedBoundingBox.getCorner010(vector3)) && contains(orientedBoundingBox.getCorner011(vector3)) && contains(orientedBoundingBox.getCorner100(vector3)) && contains(orientedBoundingBox.getCorner101(vector3)) && contains(orientedBoundingBox.getCorner110(vector3)) && contains(orientedBoundingBox.getCorner111(vector3));
    }

    public BoundingBox set(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = this.min;
        float f11 = vector3.f12537x;
        float f12 = vector32.f12537x;
        if (f11 >= f12) {
            f11 = f12;
        }
        float f13 = vector3.f12538y;
        float f14 = vector32.f12538y;
        if (f13 >= f14) {
            f13 = f14;
        }
        float f15 = vector3.f12539z;
        float f16 = vector32.f12539z;
        if (f15 >= f16) {
            f15 = f16;
        }
        vector33.set(f11, f13, f15);
        Vector3 vector34 = this.max;
        float f17 = vector3.f12537x;
        float f18 = vector32.f12537x;
        if (f17 <= f18) {
            f17 = f18;
        }
        float f19 = vector3.f12538y;
        float f21 = vector32.f12538y;
        if (f19 <= f21) {
            f19 = f21;
        }
        float f22 = vector3.f12539z;
        float f23 = vector32.f12539z;
        if (f22 <= f23) {
            f22 = f23;
        }
        vector34.set(f17, f19, f22);
        update();
        return this;
    }

    public BoundingBox ext(BoundingBox boundingBox) {
        Vector3 vector3 = this.min;
        Vector3 vector32 = vector3.set(min(vector3.f12537x, boundingBox.min.f12537x), min(this.min.f12538y, boundingBox.min.f12538y), min(this.min.f12539z, boundingBox.min.f12539z));
        Vector3 vector33 = this.max;
        return set(vector32, vector33.set(max(vector33.f12537x, boundingBox.max.f12537x), max(this.max.f12538y, boundingBox.max.f12538y), max(this.max.f12539z, boundingBox.max.f12539z)));
    }

    public boolean contains(Vector3 vector3) {
        Vector3 vector32 = this.min;
        float f11 = vector32.f12537x;
        float f12 = vector3.f12537x;
        if (f11 > f12) {
            return false;
        }
        Vector3 vector33 = this.max;
        if (vector33.f12537x < f12) {
            return false;
        }
        float f13 = vector32.f12538y;
        float f14 = vector3.f12538y;
        if (f13 > f14 || vector33.f12538y < f14) {
            return false;
        }
        float f15 = vector32.f12539z;
        float f16 = vector3.f12539z;
        return f15 <= f16 && vector33.f12539z >= f16;
    }

    public BoundingBox(BoundingBox boundingBox) {
        set(boundingBox);
    }

    public BoundingBox ext(Vector3 vector3, float f11) {
        Vector3 vector32 = this.min;
        Vector3 vector33 = vector32.set(min(vector32.f12537x, vector3.f12537x - f11), min(this.min.f12538y, vector3.f12538y - f11), min(this.min.f12539z, vector3.f12539z - f11));
        Vector3 vector34 = this.max;
        return set(vector33, vector34.set(max(vector34.f12537x, vector3.f12537x + f11), max(this.max.f12538y, vector3.f12538y + f11), max(this.max.f12539z, vector3.f12539z + f11)));
    }

    public BoundingBox set(Vector3[] vector3Arr) {
        inf();
        for (Vector3 vector3 : vector3Arr) {
            ext(vector3);
        }
        return this;
    }

    public BoundingBox ext(BoundingBox boundingBox, Matrix4 matrix4) {
        Vector3 vector3 = tmpVector;
        Vector3 vector32 = boundingBox.min;
        ext(vector3.set(vector32.f12537x, vector32.f12538y, vector32.f12539z).mul(matrix4));
        Vector3 vector33 = boundingBox.min;
        ext(vector3.set(vector33.f12537x, vector33.f12538y, boundingBox.max.f12539z).mul(matrix4));
        Vector3 vector34 = boundingBox.min;
        ext(vector3.set(vector34.f12537x, boundingBox.max.f12538y, vector34.f12539z).mul(matrix4));
        float f11 = boundingBox.min.f12537x;
        Vector3 vector35 = boundingBox.max;
        ext(vector3.set(f11, vector35.f12538y, vector35.f12539z).mul(matrix4));
        float f12 = boundingBox.max.f12537x;
        Vector3 vector36 = boundingBox.min;
        ext(vector3.set(f12, vector36.f12538y, vector36.f12539z).mul(matrix4));
        Vector3 vector37 = boundingBox.max;
        ext(vector3.set(vector37.f12537x, boundingBox.min.f12538y, vector37.f12539z).mul(matrix4));
        Vector3 vector38 = boundingBox.max;
        ext(vector3.set(vector38.f12537x, vector38.f12538y, boundingBox.min.f12539z).mul(matrix4));
        Vector3 vector39 = boundingBox.max;
        ext(vector3.set(vector39.f12537x, vector39.f12538y, vector39.f12539z).mul(matrix4));
        return this;
    }

    public BoundingBox set(List<Vector3> list) {
        inf();
        Iterator<Vector3> it = list.iterator();
        while (it.hasNext()) {
            ext(it.next());
        }
        return this;
    }

    public BoundingBox(Vector3 vector3, Vector3 vector32) {
        set(vector3, vector32);
    }

    public BoundingBox ext(float f11, float f12, float f13) {
        Vector3 vector3 = this.min;
        Vector3 vector32 = vector3.set(min(vector3.f12537x, f11), min(this.min.f12538y, f12), min(this.min.f12539z, f13));
        Vector3 vector33 = this.max;
        return set(vector32, vector33.set(max(vector33.f12537x, f11), max(this.max.f12538y, f12), max(this.max.f12539z, f13)));
    }
}
