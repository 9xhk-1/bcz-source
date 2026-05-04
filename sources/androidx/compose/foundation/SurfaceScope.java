package androidx.compose.foundation;

import android.view.Surface;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SurfaceScope {
    void onChanged(@m80.k Surface surface, @m80.k q<? super Surface, ? super Integer, ? super Integer, g2> qVar);

    void onDestroyed(@m80.k Surface surface, @m80.k l<? super Surface, g2> lVar);
}
