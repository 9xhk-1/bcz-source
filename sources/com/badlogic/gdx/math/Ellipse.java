package com.badlogic.gdx.math;

import a3.e0;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Ellipse implements Serializable, s {
    private static final long serialVersionUID = 7381533206532032099L;
    public float height;
    public float width;

    /* renamed from: x, reason: collision with root package name */
    public float f12521x;

    /* renamed from: y, reason: collision with root package name */
    public float f12522y;

    public Ellipse() {
    }

    public float area() {
        return ((this.width * this.height) * 3.1415927f) / 4.0f;
    }

    public float circumference() {
        float f11 = this.width / 2.0f;
        float f12 = this.height / 2.0f;
        return (f11 * 3.0f > f12 || f12 * 3.0f > f11) ? (float) ((((f11 + f12) * 3.0f) - Math.sqrt((r4 + f12) * (f11 + (f12 * 3.0f)))) * 3.1415927410125732d) : (float) (Math.sqrt(((f11 * f11) + (f12 * f12)) / 2.0f) * 6.2831854820251465d);
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(float f11, float f12) {
        float f13 = f11 - this.f12521x;
        float f14 = f12 - this.f12522y;
        float f15 = this.width;
        float f16 = (f13 * f13) / (((f15 * 0.5f) * f15) * 0.5f);
        float f17 = this.height;
        return f16 + ((f14 * f14) / (((f17 * 0.5f) * f17) * 0.5f)) <= 1.0f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Ellipse ellipse = (Ellipse) obj;
            if (this.f12521x == ellipse.f12521x && this.f12522y == ellipse.f12522y && this.width == ellipse.width && this.height == ellipse.height) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((e0.d(this.height) + 53) * 53) + e0.d(this.width)) * 53) + e0.d(this.f12521x)) * 53) + e0.d(this.f12522y);
    }

    public void set(float f11, float f12, float f13, float f14) {
        this.f12521x = f11;
        this.f12522y = f12;
        this.width = f13;
        this.height = f14;
    }

    public Ellipse setPosition(Vector2 vector2) {
        this.f12521x = vector2.f12535x;
        this.f12522y = vector2.f12536y;
        return this;
    }

    public Ellipse setSize(float f11, float f12) {
        this.width = f11;
        this.height = f12;
        return this;
    }

    public Ellipse(Ellipse ellipse) {
        this.f12521x = ellipse.f12521x;
        this.f12522y = ellipse.f12522y;
        this.width = ellipse.width;
        this.height = ellipse.height;
    }

    public Ellipse setPosition(float f11, float f12) {
        this.f12521x = f11;
        this.f12522y = f12;
        return this;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(Vector2 vector2) {
        return contains(vector2.f12535x, vector2.f12536y);
    }

    public void set(Ellipse ellipse) {
        this.f12521x = ellipse.f12521x;
        this.f12522y = ellipse.f12522y;
        this.width = ellipse.width;
        this.height = ellipse.height;
    }

    public Ellipse(float f11, float f12, float f13, float f14) {
        this.f12521x = f11;
        this.f12522y = f12;
        this.width = f13;
        this.height = f14;
    }

    public void set(Circle circle) {
        this.f12521x = circle.f12519x;
        this.f12522y = circle.f12520y;
        float f11 = circle.radius;
        this.width = f11 * 2.0f;
        this.height = f11 * 2.0f;
    }

    public Ellipse(Vector2 vector2, float f11, float f12) {
        this.f12521x = vector2.f12535x;
        this.f12522y = vector2.f12536y;
        this.width = f11;
        this.height = f12;
    }

    public void set(Vector2 vector2, Vector2 vector22) {
        this.f12521x = vector2.f12535x;
        this.f12522y = vector2.f12536y;
        this.width = vector22.f12535x;
        this.height = vector22.f12536y;
    }

    public Ellipse(Vector2 vector2, Vector2 vector22) {
        this.f12521x = vector2.f12535x;
        this.f12522y = vector2.f12536y;
        this.width = vector22.f12535x;
        this.height = vector22.f12536y;
    }

    public Ellipse(Circle circle) {
        this.f12521x = circle.f12519x;
        this.f12522y = circle.f12520y;
        float f11 = circle.radius;
        this.width = f11 * 2.0f;
        this.height = f11 * 2.0f;
    }
}
