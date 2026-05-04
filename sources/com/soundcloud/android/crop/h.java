package com.soundcloud.android.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f41721a;

    /* renamed from: b, reason: collision with root package name */
    public int f41722b;

    public h(Bitmap bitmap, int rotation) {
        this.f41721a = bitmap;
        this.f41722b = rotation % 360;
    }

    public Bitmap a() {
        return this.f41721a;
    }

    public int b() {
        if (this.f41721a == null) {
            return 0;
        }
        return f() ? this.f41721a.getWidth() : this.f41721a.getHeight();
    }

    public Matrix c() {
        Matrix matrix = new Matrix();
        if (this.f41721a != null && this.f41722b != 0) {
            matrix.preTranslate(-(r1.getWidth() / 2), -(this.f41721a.getHeight() / 2));
            matrix.postRotate(this.f41722b);
            matrix.postTranslate(e() / 2, b() / 2);
        }
        return matrix;
    }

    public int d() {
        return this.f41722b;
    }

    public int e() {
        if (this.f41721a == null) {
            return 0;
        }
        return f() ? this.f41721a.getHeight() : this.f41721a.getWidth();
    }

    public boolean f() {
        return (this.f41722b / 90) % 2 != 0;
    }

    public void g() {
        Bitmap bitmap = this.f41721a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f41721a = null;
        }
    }

    public void h(Bitmap bitmap) {
        this.f41721a = bitmap;
    }

    public void i(int rotation) {
        this.f41722b = rotation;
    }
}
