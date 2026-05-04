package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import c40.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {
    private int lastHeight;
    private int lastWidth;

    public AndroidExternalSurfaceState(@m80.k r0 r0Var) {
        super(r0Var);
        this.lastWidth = -1;
        this.lastHeight = -1;
    }

    public final int getLastHeight() {
        return this.lastHeight;
    }

    public final int getLastWidth() {
        return this.lastWidth;
    }

    public final void setLastHeight(int i11) {
        this.lastHeight = i11;
    }

    public final void setLastWidth(int i11) {
        this.lastWidth = i11;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@m80.k SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        if (this.lastWidth == i12 && this.lastHeight == i13) {
            return;
        }
        this.lastWidth = i12;
        this.lastHeight = i13;
        dispatchSurfaceChanged(surfaceHolder.getSurface(), i12, i13);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@m80.k SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.lastWidth = surfaceFrame.width();
        this.lastHeight = surfaceFrame.height();
        dispatchSurfaceCreated(surfaceHolder.getSurface(), this.lastWidth, this.lastHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@m80.k SurfaceHolder surfaceHolder) {
        dispatchSurfaceDestroyed(surfaceHolder.getSurface());
    }
}
