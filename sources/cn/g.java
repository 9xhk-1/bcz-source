package cn;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public float f9279a;

    /* renamed from: b, reason: collision with root package name */
    public float f9280b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = iArr[i11] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static float b(float f11, float f12, float f13) {
        return 1.0f - ((f11 - f13) / (f12 - f13));
    }

    public float c() {
        return this.f9280b;
    }

    public float d() {
        return this.f9279a;
    }

    public void e(Context context) {
        float f11 = this.f9279a;
        if (f11 <= 0.0f) {
            f11 = com.google.android.material.carousel.a.h(context);
        }
        this.f9279a = f11;
        float f12 = this.f9280b;
        if (f12 <= 0.0f) {
            f12 = com.google.android.material.carousel.a.g(context);
        }
        this.f9280b = f12;
    }

    public boolean f() {
        return true;
    }

    public abstract com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view);

    public void h(float f11) {
        this.f9280b = f11;
    }

    public void i(float f11) {
        this.f9279a = f11;
    }

    public boolean j(b bVar, int i11) {
        return false;
    }
}
