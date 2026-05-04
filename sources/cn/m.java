package cn;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9360d = {1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9361e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    public int f9362c = 0;

    @Override // cn.g
    @NonNull
    public com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view) {
        float a11 = bVar.a();
        if (bVar.isHorizontal()) {
            a11 = bVar.b();
        }
        float f11 = a11;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.isHorizontal()) {
            f12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f13 = f12;
        float d11 = d() + f13;
        float max = Math.max(c() + f13, d11);
        float min = Math.min(measuredHeight + f13, f11);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f13, d11 + f13, max + f13);
        float f14 = (min + clamp) / 2.0f;
        int[] iArr = f9360d;
        if (f11 < 2.0f * d11) {
            iArr = new int[]{0};
        }
        int[] iArr2 = f9361e;
        if (bVar.c() == 1) {
            iArr = g.a(iArr);
            iArr2 = g.a(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        int max2 = (int) Math.max(1.0d, Math.floor(((f11 - (com.google.android.material.carousel.a.i(iArr3) * f14)) - (com.google.android.material.carousel.a.i(iArr4) * max)) / min));
        int ceil = (int) Math.ceil(f11 / min);
        int i11 = (ceil - max2) + 1;
        int[] iArr5 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr5[i12] = ceil - i12;
        }
        a c11 = a.c(f11, clamp, d11, max, iArr4, f14, iArr3, min, iArr5);
        this.f9362c = c11.e();
        if (k(c11, bVar.getItemCount())) {
            c11 = a.c(f11, clamp, d11, max, new int[]{c11.f8820c}, f14, new int[]{c11.f8821d}, min, new int[]{c11.f8824g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f13, f11, c11, bVar.c());
    }

    @Override // cn.g
    public boolean j(b bVar, int i11) {
        if (i11 >= this.f9362c || bVar.getItemCount() < this.f9362c) {
            return i11 >= this.f9362c && bVar.getItemCount() < this.f9362c;
        }
        return true;
    }

    public boolean k(a aVar, int i11) {
        int e11 = aVar.e() - i11;
        boolean z11 = e11 > 0 && (aVar.f8820c > 0 || aVar.f8821d > 1);
        while (e11 > 0) {
            int i12 = aVar.f8820c;
            if (i12 > 0) {
                aVar.f8820c = i12 - 1;
            } else {
                int i13 = aVar.f8821d;
                if (i13 > 1) {
                    aVar.f8821d = i13 - 1;
                }
            }
            e11--;
        }
        return z11;
    }
}
