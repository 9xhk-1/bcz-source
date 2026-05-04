package androidx.compose.foundation;

import android.view.Surface;
import c40.r0;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, r0 {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ r0 $$delegate_1;

    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, r0 r0Var) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = r0Var;
    }

    @Override // c40.r0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, q<? super Surface, ? super Integer, ? super Integer, g2> qVar) {
        this.$$delegate_0.onChanged(surface, qVar);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, l<? super Surface, g2> lVar) {
        this.$$delegate_0.onDestroyed(surface, lVar);
    }
}
