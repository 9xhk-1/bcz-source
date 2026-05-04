package vn;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l {
    @NonNull
    public static f a(int i11) {
        return i11 != 0 ? i11 != 1 ? b() : new g() : new o();
    }

    @NonNull
    public static f b() {
        return new o();
    }

    @NonNull
    public static h c() {
        return new h();
    }

    public static void d(@NonNull View view, float f11) {
        Drawable background = view.getBackground();
        if (background instanceof k) {
            ((k) background).o0(f11);
        }
    }

    public static void e(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof k) {
            f(view, (k) background);
        }
    }

    public static void f(@NonNull View view, @NonNull k kVar) {
        if (kVar.c0()) {
            kVar.t0(m0.p(view));
        }
    }
}
