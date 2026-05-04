package cn;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9356d = {1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9357e = {0, 1};

    /* renamed from: c, reason: collision with root package name */
    public int f9358c = 0;

    @Override // cn.g
    @NonNull
    public com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view) {
        int a11 = bVar.a();
        if (bVar.isHorizontal()) {
            a11 = bVar.b();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (bVar.isHorizontal()) {
            f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float d11 = d() + f11;
        float max = Math.max(c() + f11, d11);
        float f12 = a11;
        float min = Math.min(measuredWidth + f11, f12);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f11, d11 + f11, max + f11);
        float f13 = (min + clamp) / 2.0f;
        int i11 = 0;
        int[] iArr = f12 < 2.0f * d11 ? new int[]{0} : f9356d;
        int max2 = (int) Math.max(1.0d, Math.floor((f12 - (com.google.android.material.carousel.a.i(r0) * max)) / min));
        int ceil = (((int) Math.ceil(f12 / min)) - max2) + 1;
        int[] iArr2 = new int[ceil];
        for (int i12 = 0; i12 < ceil; i12++) {
            iArr2[i12] = max2 + i12;
        }
        int i13 = bVar.c() == 1 ? 1 : 0;
        a c11 = a.c(f12, clamp, d11, max, i13 != 0 ? g.a(iArr) : iArr, f13, i13 != 0 ? g.a(f9357e) : f9357e, min, iArr2);
        this.f9358c = c11.e();
        if (c11.e() > bVar.getItemCount()) {
            c11 = a.c(f12, clamp, d11, max, iArr, f13, f9357e, min, iArr2);
        } else {
            i11 = i13;
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f11, f12, c11, i11);
    }

    @Override // cn.g
    public boolean j(@NonNull b bVar, int i11) {
        if (bVar.c() == 1) {
            return (i11 < this.f9358c && bVar.getItemCount() >= this.f9358c) || (i11 >= this.f9358c && bVar.getItemCount() < this.f9358c);
        }
        return false;
    }
}
