package com.badlogic.gdx.math;

import a3.e0;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Rectangle implements Serializable, s {
    private static final long serialVersionUID = 5733252015138115702L;
    public static final Rectangle tmp = new Rectangle();
    public static final Rectangle tmp2 = new Rectangle();
    public float height;
    public float width;

    /* renamed from: x, reason: collision with root package name */
    public float f12533x;

    /* renamed from: y, reason: collision with root package name */
    public float f12534y;

    public Rectangle() {
    }

    public float area() {
        return this.width * this.height;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(float f11, float f12) {
        float f13 = this.f12533x;
        if (f13 > f11 || f13 + this.width < f11) {
            return false;
        }
        float f14 = this.f12534y;
        return f14 <= f12 && f14 + this.height >= f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return e0.d(this.height) == e0.d(rectangle.height) && e0.d(this.width) == e0.d(rectangle.width) && e0.d(this.f12533x) == e0.d(rectangle.f12533x) && e0.d(this.f12534y) == e0.d(rectangle.f12534y);
    }

    public Rectangle fitInside(Rectangle rectangle) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio < rectangle.getAspectRatio()) {
            float f11 = rectangle.height;
            setSize(aspectRatio * f11, f11);
        } else {
            float f12 = rectangle.width;
            setSize(f12, f12 / aspectRatio);
        }
        setPosition((rectangle.f12533x + (rectangle.width / 2.0f)) - (this.width / 2.0f), (rectangle.f12534y + (rectangle.height / 2.0f)) - (this.height / 2.0f));
        return this;
    }

    public Rectangle fitOutside(Rectangle rectangle) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio > rectangle.getAspectRatio()) {
            float f11 = rectangle.height;
            setSize(aspectRatio * f11, f11);
        } else {
            float f12 = rectangle.width;
            setSize(f12, f12 / aspectRatio);
        }
        setPosition((rectangle.f12533x + (rectangle.width / 2.0f)) - (this.width / 2.0f), (rectangle.f12534y + (rectangle.height / 2.0f)) - (this.height / 2.0f));
        return this;
    }

    public Rectangle fromString(String str) {
        int indexOf = str.indexOf(44, 1);
        int i11 = indexOf + 1;
        int indexOf2 = str.indexOf(44, i11);
        int i12 = indexOf2 + 1;
        int indexOf3 = str.indexOf(44, i12);
        if (indexOf != -1 && indexOf2 != -1 && indexOf3 != -1 && str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            try {
                return set(Float.parseFloat(str.substring(1, indexOf)), Float.parseFloat(str.substring(i11, indexOf2)), Float.parseFloat(str.substring(i12, indexOf3)), Float.parseFloat(str.substring(indexOf3 + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Rectangle: " + str);
    }

    public float getAspectRatio() {
        float f11 = this.height;
        if (f11 == 0.0f) {
            return Float.NaN;
        }
        return this.width / f11;
    }

    public Vector2 getCenter(Vector2 vector2) {
        vector2.f12535x = this.f12533x + (this.width / 2.0f);
        vector2.f12536y = this.f12534y + (this.height / 2.0f);
        return vector2;
    }

    public float getHeight() {
        return this.height;
    }

    public Vector2 getPosition(Vector2 vector2) {
        return vector2.set(this.f12533x, this.f12534y);
    }

    public Vector2 getSize(Vector2 vector2) {
        return vector2.set(this.width, this.height);
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.f12533x;
    }

    public float getY() {
        return this.f12534y;
    }

    public int hashCode() {
        return ((((((e0.d(this.height) + 31) * 31) + e0.d(this.width)) * 31) + e0.d(this.f12533x)) * 31) + e0.d(this.f12534y);
    }

    public Rectangle merge(Rectangle rectangle) {
        float min = Math.min(this.f12533x, rectangle.f12533x);
        float max = Math.max(this.f12533x + this.width, rectangle.f12533x + rectangle.width);
        this.f12533x = min;
        this.width = max - min;
        float min2 = Math.min(this.f12534y, rectangle.f12534y);
        float max2 = Math.max(this.f12534y + this.height, rectangle.f12534y + rectangle.height);
        this.f12534y = min2;
        this.height = max2 - min2;
        return this;
    }

    public boolean overlaps(Rectangle rectangle) {
        float f11 = this.f12533x;
        float f12 = rectangle.f12533x;
        if (f11 >= rectangle.width + f12 || f11 + this.width <= f12) {
            return false;
        }
        float f13 = this.f12534y;
        float f14 = rectangle.f12534y;
        return f13 < rectangle.height + f14 && f13 + this.height > f14;
    }

    public float perimeter() {
        return (this.width + this.height) * 2.0f;
    }

    public Rectangle set(float f11, float f12, float f13, float f14) {
        this.f12533x = f11;
        this.f12534y = f12;
        this.width = f13;
        this.height = f14;
        return this;
    }

    public Rectangle setCenter(float f11, float f12) {
        setPosition(f11 - (this.width / 2.0f), f12 - (this.height / 2.0f));
        return this;
    }

    public Rectangle setHeight(float f11) {
        this.height = f11;
        return this;
    }

    public Rectangle setPosition(Vector2 vector2) {
        this.f12533x = vector2.f12535x;
        this.f12534y = vector2.f12536y;
        return this;
    }

    public Rectangle setSize(float f11, float f12) {
        this.width = f11;
        this.height = f12;
        return this;
    }

    public Rectangle setWidth(float f11) {
        this.width = f11;
        return this;
    }

    public Rectangle setX(float f11) {
        this.f12533x = f11;
        return this;
    }

    public Rectangle setY(float f11) {
        this.f12534y = f11;
        return this;
    }

    public String toString() {
        return "[" + this.f12533x + "," + this.f12534y + "," + this.width + "," + this.height + "]";
    }

    public Rectangle(float f11, float f12, float f13, float f14) {
        this.f12533x = f11;
        this.f12534y = f12;
        this.width = f13;
        this.height = f14;
    }

    @Override // com.badlogic.gdx.math.s
    public boolean contains(Vector2 vector2) {
        return contains(vector2.f12535x, vector2.f12536y);
    }

    public Rectangle setCenter(Vector2 vector2) {
        setPosition(vector2.f12535x - (this.width / 2.0f), vector2.f12536y - (this.height / 2.0f));
        return this;
    }

    public boolean contains(Circle circle) {
        float f11 = circle.f12519x;
        float f12 = circle.radius;
        float f13 = f11 - f12;
        float f14 = this.f12533x;
        if (f13 < f14 || f11 + f12 > f14 + this.width) {
            return false;
        }
        float f15 = circle.f12520y;
        float f16 = f15 - f12;
        float f17 = this.f12534y;
        return f16 >= f17 && f15 + f12 <= f17 + this.height;
    }

    public Rectangle setPosition(float f11, float f12) {
        this.f12533x = f11;
        this.f12534y = f12;
        return this;
    }

    public Rectangle setSize(float f11) {
        this.width = f11;
        this.height = f11;
        return this;
    }

    public boolean contains(Rectangle rectangle) {
        float f11 = rectangle.f12533x;
        float f12 = rectangle.width + f11;
        float f13 = rectangle.f12534y;
        float f14 = rectangle.height + f13;
        float f15 = this.f12533x;
        if (f11 <= f15) {
            return false;
        }
        float f16 = this.width;
        if (f11 >= f15 + f16 || f12 <= f15 || f12 >= f15 + f16) {
            return false;
        }
        float f17 = this.f12534y;
        if (f13 <= f17) {
            return false;
        }
        float f18 = this.height;
        return f13 < f17 + f18 && f14 > f17 && f14 < f17 + f18;
    }

    public Rectangle set(Rectangle rectangle) {
        this.f12533x = rectangle.f12533x;
        this.f12534y = rectangle.f12534y;
        this.width = rectangle.width;
        this.height = rectangle.height;
        return this;
    }

    public Rectangle(Rectangle rectangle) {
        this.f12533x = rectangle.f12533x;
        this.f12534y = rectangle.f12534y;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Rectangle merge(float f11, float f12) {
        float min = Math.min(this.f12533x, f11);
        float max = Math.max(this.f12533x + this.width, f11);
        this.f12533x = min;
        this.width = max - min;
        float min2 = Math.min(this.f12534y, f12);
        float max2 = Math.max(this.f12534y + this.height, f12);
        this.f12534y = min2;
        this.height = max2 - min2;
        return this;
    }

    public Rectangle merge(Vector2 vector2) {
        return merge(vector2.f12535x, vector2.f12536y);
    }

    public Rectangle merge(Vector2[] vector2Arr) {
        float f11 = this.f12533x;
        float f12 = this.width + f11;
        float f13 = this.f12534y;
        float f14 = this.height + f13;
        for (Vector2 vector2 : vector2Arr) {
            f11 = Math.min(f11, vector2.f12535x);
            f12 = Math.max(f12, vector2.f12535x);
            f13 = Math.min(f13, vector2.f12536y);
            f14 = Math.max(f14, vector2.f12536y);
        }
        this.f12533x = f11;
        this.width = f12 - f11;
        this.f12534y = f13;
        this.height = f14 - f13;
        return this;
    }
}
