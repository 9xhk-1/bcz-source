package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import cn.g;
import com.google.android.material.carousel.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final float f30956c = 0.85f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public d() {
    }

    @Override // cn.g
    public boolean f() {
        return false;
    }

    @Override // cn.g
    @NonNull
    public b g(@NonNull cn.b bVar, @NonNull View view) {
        float b11 = bVar.isHorizontal() ? bVar.b() : bVar.a();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.isHorizontal()) {
            f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = measuredHeight;
        float f13 = f11;
        float f14 = f12 + f13;
        float f15 = a.f(view.getContext()) + f13;
        float f16 = a.f(view.getContext()) + f13;
        int max = Math.max(1, (int) Math.floor(b11 / f14));
        float f17 = b11 - (max * f14);
        if (bVar.c() == 1) {
            float f18 = f17 / 2.0f;
            return l(b11, f13, f14, max, Math.max(Math.min(3.0f * f18, f14), d() + f13), f16, f18);
        }
        int i11 = 1;
        if (f17 <= 0.0f) {
            i11 = 0;
        }
        return m(view.getContext(), f13, b11, f14, max, k(f15, f14, f17), i11, f16);
    }

    public final float k(float f11, float f12, float f13) {
        float max = Math.max(1.5f * f13, f11);
        float f14 = 0.85f * f12;
        if (max > f14) {
            max = Math.max(f14, f13 * 1.2f);
        }
        return Math.min(f12, max);
    }

    public final b l(float f11, float f12, float f13, int i11, float f14, float f15, float f16) {
        float min = Math.min(f15, f13);
        float b11 = g.b(min, f13, f12);
        float b12 = g.b(f14, f13, f12);
        float f17 = f14 / 2.0f;
        float f18 = (f16 + 0.0f) - f17;
        float f19 = f18 + f17;
        float f21 = min / 2.0f;
        float f22 = (i11 * f13) + f19;
        b.C0368b h11 = new b.C0368b(f13, f11).a((f18 - f17) - f21, b11, min).c(f18, b12, f14, false).h((f13 / 2.0f) + f19, 0.0f, f13, i11, true);
        h11.c(f17 + f22, b12, f14, false);
        h11.a(f22 + f14 + f21, b11, min);
        return h11.i();
    }

    public final b m(Context context, float f11, float f12, float f13, int i11, float f14, int i12, float f15) {
        float min = Math.min(f15, f13);
        float max = Math.max(min, 0.5f * f14);
        float b11 = g.b(max, f13, f11);
        float b12 = g.b(min, f13, f11);
        float b13 = g.b(f14, f13, f11);
        float f16 = (i11 * f13) + 0.0f;
        b.C0368b h11 = new b.C0368b(f13, f12).a(0.0f - (max / 2.0f), b11, max).h(f13 / 2.0f, 0.0f, f13, i11, true);
        if (i12 > 0) {
            float f17 = (f14 / 2.0f) + f16;
            f16 += f14;
            h11.c(f17, b13, f14, false);
        }
        h11.a(f16 + (a.f(context) / 2.0f), b12, min);
        return h11.i();
    }
}
