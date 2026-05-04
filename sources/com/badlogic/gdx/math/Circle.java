package com.badlogic.gdx.math;

import a3.e0;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Circle implements Serializable, s {
    public float radius;

    /* renamed from: x, reason: collision with root package name */
    public float f12519x;

    /* renamed from: y, reason: collision with root package name */
    public float f12520y;

    public Circle() {
    }

    public float area() {
        float f11 = this.radius;
        return f11 * f11 * 3.1415927f;
    }

    public float circumference() {
        return this.radius * 6.2831855f;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(float f11, float f12) {
        float f13 = this.f12519x - f11;
        float f14 = this.f12520y - f12;
        float f15 = (f13 * f13) + (f14 * f14);
        float f16 = this.radius;
        return f15 <= f16 * f16;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Circle circle = (Circle) obj;
            if (this.f12519x == circle.f12519x && this.f12520y == circle.f12520y && this.radius == circle.radius) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((e0.d(this.radius) + 41) * 41) + e0.d(this.f12519x)) * 41) + e0.d(this.f12520y);
    }

    public boolean overlaps(Circle circle) {
        float f11 = this.f12519x - circle.f12519x;
        float f12 = this.f12520y - circle.f12520y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.radius + circle.radius;
        return f13 < f14 * f14;
    }

    public void set(float f11, float f12, float f13) {
        this.f12519x = f11;
        this.f12520y = f12;
        this.radius = f13;
    }

    public void setPosition(Vector2 vector2) {
        this.f12519x = vector2.f12535x;
        this.f12520y = vector2.f12536y;
    }

    public void setRadius(float f11) {
        this.radius = f11;
    }

    public void setX(float f11) {
        this.f12519x = f11;
    }

    public void setY(float f11) {
        this.f12520y = f11;
    }

    public String toString() {
        return this.f12519x + "," + this.f12520y + "," + this.radius;
    }

    public Circle(float f11, float f12, float f13) {
        this.f12519x = f11;
        this.f12520y = f12;
        this.radius = f13;
    }

    public void setPosition(float f11, float f12) {
        this.f12519x = f11;
        this.f12520y = f12;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(Vector2 vector2) {
        float f11 = this.f12519x - vector2.f12535x;
        float f12 = this.f12520y - vector2.f12536y;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.radius;
        return f13 <= f14 * f14;
    }

    public void set(Vector2 vector2, float f11) {
        this.f12519x = vector2.f12535x;
        this.f12520y = vector2.f12536y;
        this.radius = f11;
    }

    public Circle(Vector2 vector2, float f11) {
        this.f12519x = vector2.f12535x;
        this.f12520y = vector2.f12536y;
        this.radius = f11;
    }

    public boolean contains(Circle circle) {
        float f11 = this.radius;
        float f12 = circle.radius;
        float f13 = f11 - f12;
        if (f13 < 0.0f) {
            return false;
        }
        float f14 = this.f12519x - circle.f12519x;
        float f15 = this.f12520y - circle.f12520y;
        float f16 = (f14 * f14) + (f15 * f15);
        float f17 = f11 + f12;
        return f13 * f13 >= f16 && f16 < f17 * f17;
    }

    public void set(Circle circle) {
        this.f12519x = circle.f12519x;
        this.f12520y = circle.f12520y;
        this.radius = circle.radius;
    }

    public Circle(Circle circle) {
        this.f12519x = circle.f12519x;
        this.f12520y = circle.f12520y;
        this.radius = circle.radius;
    }

    public void set(Vector2 vector2, Vector2 vector22) {
        float f11 = vector2.f12535x;
        this.f12519x = f11;
        float f12 = vector2.f12536y;
        this.f12520y = f12;
        this.radius = Vector2.len(f11 - vector22.f12535x, f12 - vector22.f12536y);
    }

    public Circle(Vector2 vector2, Vector2 vector22) {
        float f11 = vector2.f12535x;
        this.f12519x = f11;
        float f12 = vector2.f12536y;
        this.f12520y = f12;
        this.radius = Vector2.len(f11 - vector22.f12535x, f12 - vector22.f12536y);
    }
}
