package r0;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @MainThread
        @Deprecated
        public static void a(@k c cVar, @l Drawable drawable) {
            c.super.g(drawable);
        }

        @MainThread
        @Deprecated
        public static void b(@k c cVar, @l Drawable drawable) {
            c.super.b(drawable);
        }

        @MainThread
        @Deprecated
        public static void c(@k c cVar, @k Drawable drawable) {
            c.super.a(drawable);
        }
    }

    @MainThread
    default void a(@k Drawable drawable) {
    }

    @MainThread
    default void b(@l Drawable drawable) {
    }

    @MainThread
    default void g(@l Drawable drawable) {
    }
}
