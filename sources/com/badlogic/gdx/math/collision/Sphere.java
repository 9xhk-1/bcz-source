package com.badlogic.gdx.math.collision;

import a3.e0;
import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Sphere implements Serializable {
    private static final float PI_4_3 = 4.1887903f;
    private static final long serialVersionUID = -6487336868908521596L;
    public final Vector3 center;
    public float radius;

    public Sphere(Vector3 vector3, float f11) {
        this.center = new Vector3(vector3);
        this.radius = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Sphere sphere = (Sphere) obj;
            if (this.radius == sphere.radius && this.center.equals(sphere.center)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.center.hashCode() + 71) * 71) + e0.d(this.radius);
    }

    public boolean overlaps(Sphere sphere) {
        float dst2 = this.center.dst2(sphere.center);
        float f11 = this.radius;
        float f12 = sphere.radius;
        return dst2 < (f11 + f12) * (f11 + f12);
    }

    public float surfaceArea() {
        float f11 = this.radius;
        return 12.566371f * f11 * f11;
    }

    public float volume() {
        float f11 = this.radius;
        return PI_4_3 * f11 * f11 * f11;
    }
}
