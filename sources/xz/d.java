package xz;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    public static void a(View view, int i11) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(i11);
        view.startAnimation(alphaAnimation);
    }

    public static boolean b(int... iArr) {
        for (int i11 : iArr) {
            if (i11 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
