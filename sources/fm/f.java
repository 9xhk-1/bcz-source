package fm;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public float f52054a;

    /* renamed from: b, reason: collision with root package name */
    public Object f52055b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f52056c;

    public f() {
        this.f52054a = 0.0f;
        this.f52055b = null;
        this.f52056c = null;
    }

    public Object a() {
        return this.f52055b;
    }

    public Drawable b() {
        return this.f52056c;
    }

    public float c() {
        return this.f52054a;
    }

    public void d(Object obj) {
        this.f52055b = obj;
    }

    public void e(Drawable drawable) {
        this.f52056c = drawable;
    }

    public void g(float f11) {
        this.f52054a = f11;
    }

    public f(float f11) {
        this.f52055b = null;
        this.f52056c = null;
        this.f52054a = f11;
    }

    public f(float f11, Object obj) {
        this(f11);
        this.f52055b = obj;
    }

    public f(float f11, Drawable drawable) {
        this(f11);
        this.f52056c = drawable;
    }

    public f(float f11, Drawable drawable, Object obj) {
        this(f11);
        this.f52056c = drawable;
        this.f52055b = obj;
    }
}
