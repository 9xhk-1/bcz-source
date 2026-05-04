package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import cn.g;
import com.google.android.material.R;
import com.google.android.material.carousel.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {
    public static float a(float f11, float f12, int i11) {
        return f11 + (Math.max(0, i11 - 1) * f12);
    }

    public static float b(float f11, float f12, int i11) {
        return i11 > 0 ? f11 + (f12 / 2.0f) : f11;
    }

    public static b c(@NonNull Context context, float f11, float f12, @NonNull cn.a aVar) {
        float f13;
        float f14;
        float min = Math.min(f(context) + f11, aVar.f8823f);
        float f15 = min / 2.0f;
        float f16 = 0.0f - f15;
        float b11 = b(0.0f, aVar.f8819b, aVar.f8820c);
        float j11 = j(0.0f, a(b11, aVar.f8819b, (int) Math.floor(aVar.f8820c / 2.0f)), aVar.f8819b, aVar.f8820c);
        float b12 = b(j11, aVar.f8822e, aVar.f8821d);
        float j12 = j(j11, a(b12, aVar.f8822e, (int) Math.floor(aVar.f8821d / 2.0f)), aVar.f8822e, aVar.f8821d);
        float b13 = b(j12, aVar.f8823f, aVar.f8824g);
        float j13 = j(j12, a(b13, aVar.f8823f, aVar.f8824g), aVar.f8823f, aVar.f8824g);
        float b14 = b(j13, aVar.f8822e, aVar.f8821d);
        float b15 = b(j(j13, a(b14, aVar.f8822e, (int) Math.ceil(aVar.f8821d / 2.0f)), aVar.f8822e, aVar.f8821d), aVar.f8819b, aVar.f8820c);
        float f17 = f15 + f12;
        float b16 = g.b(min, aVar.f8823f, f11);
        float b17 = g.b(aVar.f8819b, aVar.f8823f, f11);
        float b18 = g.b(aVar.f8822e, aVar.f8823f, f11);
        b.C0368b a11 = new b.C0368b(aVar.f8823f, f12).a(f16, b16, min);
        if (aVar.f8820c > 0) {
            f13 = 2.0f;
            f14 = f17;
            a11.g(b11, b17, aVar.f8819b, (int) Math.floor(r7 / 2.0f));
        } else {
            f13 = 2.0f;
            f14 = f17;
        }
        if (aVar.f8821d > 0) {
            a11.g(b12, b18, aVar.f8822e, (int) Math.floor(r4 / f13));
        }
        a11.h(b13, 0.0f, aVar.f8823f, aVar.f8824g, true);
        if (aVar.f8821d > 0) {
            a11.g(b14, b18, aVar.f8822e, (int) Math.ceil(r4 / f13));
        }
        if (aVar.f8820c > 0) {
            a11.g(b15, b17, aVar.f8819b, (int) Math.ceil(r0 / f13));
        }
        a11.a(f14, b16, min);
        return a11.i();
    }

    public static b d(@NonNull Context context, float f11, float f12, @NonNull cn.a aVar, int i11) {
        return i11 == 1 ? c(context, f11, f12, aVar) : e(context, f11, f12, aVar);
    }

    public static b e(@NonNull Context context, float f11, float f12, @NonNull cn.a aVar) {
        float min = Math.min(f(context) + f11, aVar.f8823f);
        float f13 = min / 2.0f;
        float f14 = 0.0f - f13;
        float b11 = b(0.0f, aVar.f8823f, aVar.f8824g);
        float j11 = j(0.0f, a(b11, aVar.f8823f, aVar.f8824g), aVar.f8823f, aVar.f8824g);
        float b12 = b(j11, aVar.f8822e, aVar.f8821d);
        float b13 = b(j(j11, b12, aVar.f8822e, aVar.f8821d), aVar.f8819b, aVar.f8820c);
        float f15 = f13 + f12;
        float b14 = g.b(min, aVar.f8823f, f11);
        float b15 = g.b(aVar.f8819b, aVar.f8823f, f11);
        float b16 = g.b(aVar.f8822e, aVar.f8823f, f11);
        b.C0368b h11 = new b.C0368b(aVar.f8823f, f12).a(f14, b14, min).h(b11, 0.0f, aVar.f8823f, aVar.f8824g, true);
        if (aVar.f8821d > 0) {
            h11.b(b12, b16, aVar.f8822e);
        }
        int i11 = aVar.f8820c;
        if (i11 > 0) {
            h11.g(b13, b15, aVar.f8819b, i11);
        }
        h11.a(f15, b14, min);
        return h11.i();
    }

    public static float f(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    public static float g(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    public static float h(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    public static int i(int[] iArr) {
        int i11 = Integer.MIN_VALUE;
        for (int i12 : iArr) {
            if (i12 > i11) {
                i11 = i12;
            }
        }
        return i11;
    }

    public static float j(float f11, float f12, float f13, int i11) {
        return i11 > 0 ? f12 + (f13 / 2.0f) : f11;
    }
}
