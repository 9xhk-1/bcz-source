package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Ray implements Serializable {
    private static final long serialVersionUID = -620692054835390878L;
    static Vector3 tmp = new Vector3();
    public final Vector3 direction;
    public final Vector3 origin;

    public Ray() {
        this.origin = new Vector3();
        this.direction = new Vector3();
    }

    public Ray cpy() {
        return new Ray(this.origin, this.direction);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Ray ray = (Ray) obj;
            if (this.direction.equals(ray.direction) && this.origin.equals(ray.origin)) {
                return true;
            }
        }
        return false;
    }

    public Vector3 getEndPoint(Vector3 vector3, float f11) {
        return vector3.set(this.direction).scl(f11).add(this.origin);
    }

    public int hashCode() {
        return ((this.direction.hashCode() + 73) * 73) + this.origin.hashCode();
    }

    public Ray mul(Matrix4 matrix4) {
        tmp.set(this.origin).add(this.direction);
        tmp.mul(matrix4);
        this.origin.mul(matrix4);
        this.direction.set(tmp.sub(this.origin)).nor();
        return this;
    }

    public Ray set(Vector3 vector3, Vector3 vector32) {
        this.origin.set(vector3);
        this.direction.set(vector32).nor();
        return this;
    }

    public String toString() {
        return "ray [" + this.origin + ":" + this.direction + "]";
    }

    public Ray set(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.origin.set(f11, f12, f13);
        this.direction.set(f14, f15, f16).nor();
        return this;
    }

    public Ray(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = new Vector3();
        this.origin = vector33;
        Vector3 vector34 = new Vector3();
        this.direction = vector34;
        vector33.set(vector3);
        vector34.set(vector32).nor();
    }

    public Ray set(Ray ray) {
        this.origin.set(ray.origin);
        this.direction.set(ray.direction).nor();
        return this;
    }
}
