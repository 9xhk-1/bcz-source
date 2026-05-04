package lq;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(11)
    public static class a {
        public static void a(View view, int layerType) {
            view.setLayerType(layerType, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(16)
    public static class b {
        public static void a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void b(View view, Drawable background) {
            view.setBackground(background);
        }
    }

    public static void a(View view, Runnable runnable) {
        b.a(view, runnable);
    }

    public static void b(View view, Drawable background) {
        b.b(view, background);
    }

    public static void c(View view, int layerType) {
        a.a(view, layerType);
    }
}
