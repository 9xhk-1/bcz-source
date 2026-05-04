package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import c40.r0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,457:1\n54#2:458\n59#2:460\n54#2:462\n59#2:464\n85#3:459\n90#3:461\n85#3:463\n90#3:465\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState\n*L\n331#1:458\n332#1:460\n351#1:462\n352#1:464\n331#1:459\n332#1:461\n351#1:463\n352#1:465\n*E\n"})
/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {

    @m80.k
    private final Matrix matrix;
    private long surfaceSize;

    @l
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(@m80.k r0 r0Var) {
        super(r0Var);
        this.surfaceSize = IntSize.Companion.m5291getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    @m80.k
    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m217getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@m80.k SurfaceTexture surfaceTexture, int i11, int i12) {
        if (!IntSize.m5284equalsimpl0(this.surfaceSize, IntSize.Companion.m5291getZeroYbymL2g())) {
            long j11 = this.surfaceSize;
            int i13 = (int) (j11 >> 32);
            i12 = (int) (j11 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i13, i12);
            i11 = i13;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@m80.k SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        g0.m(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@m80.k SurfaceTexture surfaceTexture, int i11, int i12) {
        if (!IntSize.m5284equalsimpl0(this.surfaceSize, IntSize.Companion.m5291getZeroYbymL2g())) {
            long j11 = this.surfaceSize;
            int i13 = (int) (j11 >> 32);
            i12 = (int) (j11 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i13, i12);
            i11 = i13;
        }
        Surface surface = this.surfaceTextureSurface;
        g0.m(surface);
        dispatchSurfaceChanged(surface, i11, i12);
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m218setSurfaceSizeozmzZPI(long j11) {
        this.surfaceSize = j11;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@m80.k SurfaceTexture surfaceTexture) {
    }
}
