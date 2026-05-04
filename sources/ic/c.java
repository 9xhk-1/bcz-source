package ic;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static void a(@k c cVar, int i11, int i12, @l hc.d dVar) {
            c.super.c(i11, i12, dVar);
        }
    }

    static /* synthetic */ void e(c cVar, int i11, int i12, hc.d dVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            dVar = null;
        }
        cVar.c(i11, i12, dVar);
    }

    void a(@k x00.l<? super Bitmap, g2> lVar, @l x00.a<g2> aVar, @l ImageView imageView);

    void b(@k ImageView imageView, @l hc.d dVar, boolean z11);

    @k
    c f(@DrawableRes int i11);

    void g(@k ImageView imageView, @l hc.d dVar);

    @k
    Bitmap get();

    @k
    c h();

    @k
    c i(@k Drawable drawable);

    @k
    c j(@DrawableRes int i11);

    @k
    c k(@k Drawable drawable);

    void l(@k x00.l<? super Bitmap, g2> lVar, @l x00.a<g2> aVar);

    @k
    c m(int i11);

    @k
    c n(int i11, int i12);

    void o(@k ImageView imageView);

    default void c(int i11, int i12, @l hc.d dVar) {
    }
}
