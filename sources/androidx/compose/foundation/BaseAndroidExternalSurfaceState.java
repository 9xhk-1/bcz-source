package androidx.compose.foundation;

import android.view.Surface;
import c40.l2;
import c40.r0;
import kotlinx.coroutines.CoroutineStart;
import m80.l;
import x00.q;
import x00.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {

    @l
    private l2 job;

    @l
    private s<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super j00.c<? super g2>, ? extends Object> onSurface;

    @l
    private q<? super Surface, ? super Integer, ? super Integer, g2> onSurfaceChanged;

    @l
    private x00.l<? super Surface, g2> onSurfaceDestroyed;

    @m80.k
    private final r0 scope;

    public BaseAndroidExternalSurfaceState(@m80.k r0 r0Var) {
        this.scope = r0Var;
    }

    public final void dispatchSurfaceChanged(@m80.k Surface surface, int i11, int i12) {
        q<? super Surface, ? super Integer, ? super Integer, g2> qVar = this.onSurfaceChanged;
        if (qVar != null) {
            qVar.invoke(surface, Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public final void dispatchSurfaceCreated(@m80.k Surface surface, int i11, int i12) {
        l2 f11;
        if (this.onSurface != null) {
            f11 = c40.k.f(this.scope, null, CoroutineStart.UNDISPATCHED, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i11, i12, null), 1, null);
            this.job = f11;
        }
    }

    public final void dispatchSurfaceDestroyed(@m80.k Surface surface) {
        x00.l<? super Surface, g2> lVar = this.onSurfaceDestroyed;
        if (lVar != null) {
            lVar.invoke(surface);
        }
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.job = null;
    }

    @m80.k
    public final r0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(@m80.k Surface surface, @m80.k q<? super Surface, ? super Integer, ? super Integer, g2> qVar) {
        this.onSurfaceChanged = qVar;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(@m80.k Surface surface, @m80.k x00.l<? super Surface, g2> lVar) {
        this.onSurfaceDestroyed = lVar;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(@m80.k s<? super SurfaceCoroutineScope, ? super Surface, ? super Integer, ? super Integer, ? super j00.c<? super g2>, ? extends Object> sVar) {
        this.onSurface = sVar;
    }
}
