package cn;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h extends g {
    @Override // cn.g
    @NonNull
    public com.google.android.material.carousel.b g(@NonNull b bVar, @NonNull View view) {
        float a11;
        int i11;
        int i12;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (bVar.isHorizontal()) {
            a11 = bVar.b();
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            a11 = bVar.a();
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        float f11 = i11 + i12;
        float f12 = a11;
        return com.google.android.material.carousel.a.e(view.getContext(), f11, f12, new a(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f12 + f11, f12), 1, f12));
    }
}
