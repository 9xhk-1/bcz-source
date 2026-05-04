package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Segment implements Serializable {
    private static final long serialVersionUID = 2739667069736519602L;

    /* renamed from: a, reason: collision with root package name */
    public final Vector3 f12560a;

    /* renamed from: b, reason: collision with root package name */
    public final Vector3 f12561b;

    public Segment(Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = new Vector3();
        this.f12560a = vector33;
        Vector3 vector34 = new Vector3();
        this.f12561b = vector34;
        vector33.set(vector3);
        vector34.set(vector32);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Segment segment = (Segment) obj;
            if (this.f12560a.equals(segment.f12560a) && this.f12561b.equals(segment.f12561b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12560a.hashCode() + 71) * 71) + this.f12561b.hashCode();
    }

    public float len() {
        return this.f12560a.dst(this.f12561b);
    }

    public float len2() {
        return this.f12560a.dst2(this.f12561b);
    }

    public Segment(float f11, float f12, float f13, float f14, float f15, float f16) {
        Vector3 vector3 = new Vector3();
        this.f12560a = vector3;
        Vector3 vector32 = new Vector3();
        this.f12561b = vector32;
        vector3.set(f11, f12, f13);
        vector32.set(f14, f15, f16);
    }
}
