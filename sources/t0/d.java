package t0;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.MainThread;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface d extends r0.c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @MainThread
        @Deprecated
        public static void a(@k d dVar, @l Drawable drawable) {
            d.super.g(drawable);
        }

        @MainThread
        @Deprecated
        public static void b(@k d dVar, @l Drawable drawable) {
            d.super.b(drawable);
        }

        @MainThread
        @Deprecated
        public static void c(@k d dVar, @k Drawable drawable) {
            d.super.a(drawable);
        }
    }

    @k
    View getView();

    @l
    Drawable h();
}
