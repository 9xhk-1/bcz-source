package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
abstract class PreviewViewImplementation {

    @NonNull
    FrameLayout mParent;

    @NonNull
    private final PreviewTransformation mPreviewTransform;

    @Nullable
    Size mResolution;
    private boolean mWasSurfaceProvided = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnSurfaceNotInUseListener {
        void onSurfaceNotInUse();
    }

    public PreviewViewImplementation(@NonNull FrameLayout frameLayout, @NonNull PreviewTransformation previewTransformation) {
        this.mParent = frameLayout;
        this.mPreviewTransform = previewTransformation;
    }

    @Nullable
    public Bitmap getBitmap() {
        Bitmap previewBitmap = getPreviewBitmap();
        if (previewBitmap == null) {
            return null;
        }
        return this.mPreviewTransform.createTransformedBitmap(previewBitmap, new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection());
    }

    @Nullable
    public abstract View getPreview();

    @Nullable
    public abstract Bitmap getPreviewBitmap();

    public abstract void initializePreview();

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public void onSurfaceProvided() {
        this.mWasSurfaceProvided = true;
        redrawPreview();
    }

    public abstract void onSurfaceRequested(@NonNull SurfaceRequest surfaceRequest, @Nullable OnSurfaceNotInUseListener onSurfaceNotInUseListener);

    public void redrawPreview() {
        View preview = getPreview();
        if (preview == null || !this.mWasSurfaceProvided) {
            return;
        }
        this.mPreviewTransform.transformView(new Size(this.mParent.getWidth(), this.mParent.getHeight()), this.mParent.getLayoutDirection(), preview);
    }

    @NonNull
    public abstract p1<Void> waitForNextFrame();

    public void setFrameUpdateListener(@NonNull Executor executor, @NonNull PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
    }
}
