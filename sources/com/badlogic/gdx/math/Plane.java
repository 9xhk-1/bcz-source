package com.badlogic.gdx.math;

import java.io.Serializable;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Plane implements Serializable {
    private static final long serialVersionUID = -1240652082930747866L;

    /* renamed from: d, reason: collision with root package name */
    public float f12528d;
    public final Vector3 normal;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum PlaneSide {
        OnPlane,
        Back,
        Front
    }

    public Plane() {
        this.normal = new Vector3();
        this.f12528d = 0.0f;
    }

    public float distance(Vector3 vector3) {
        return this.normal.dot(vector3) + this.f12528d;
    }

    public float getD() {
        return this.f12528d;
    }

    public Vector3 getNormal() {
        return this.normal;
    }

    public boolean isFrontFacing(Vector3 vector3) {
        return this.normal.dot(vector3) <= 0.0f;
    }

    public void set(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        this.normal.set(vector3).sub(vector32).crs(vector32.f12537x - vector33.f12537x, vector32.f12538y - vector33.f12538y, vector32.f12539z - vector33.f12539z).nor();
        this.f12528d = -vector3.dot(this.normal);
    }

    public PlaneSide testPoint(Vector3 vector3) {
        float dot = this.normal.dot(vector3) + this.f12528d;
        return dot == 0.0f ? PlaneSide.OnPlane : dot < 0.0f ? PlaneSide.Back : PlaneSide.Front;
    }

    public String toString() {
        return this.normal.toString() + j2.O + this.f12528d;
    }

    public void set(float f11, float f12, float f13, float f14) {
        this.normal.set(f11, f12, f13);
        this.f12528d = f14;
    }

    public Plane(Vector3 vector3, float f11) {
        Vector3 vector32 = new Vector3();
        this.normal = vector32;
        this.f12528d = 0.0f;
        vector32.set(vector3).nor();
        this.f12528d = f11;
    }

    public void set(Vector3 vector3, Vector3 vector32) {
        this.normal.set(vector32);
        this.f12528d = -vector3.dot(vector32);
    }

    public PlaneSide testPoint(float f11, float f12, float f13) {
        float dot = this.normal.dot(f11, f12, f13) + this.f12528d;
        if (dot == 0.0f) {
            return PlaneSide.OnPlane;
        }
        if (dot < 0.0f) {
            return PlaneSide.Back;
        }
        return PlaneSide.Front;
    }

    public void set(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.normal.set(f14, f15, f16);
        this.f12528d = -((f11 * f14) + (f12 * f15) + (f13 * f16));
    }

    public Plane(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = new Vector3();
        this.normal = vector33;
        this.f12528d = 0.0f;
        vector33.set(vector3).nor();
        this.f12528d = -vector33.dot(vector32);
    }

    public void set(Plane plane) {
        this.normal.set(plane.normal);
        this.f12528d = plane.f12528d;
    }

    public Plane(Vector3 vector3, Vector3 vector32, Vector3 vector33) {
        this.normal = new Vector3();
        this.f12528d = 0.0f;
        set(vector3, vector32, vector33);
    }
}
