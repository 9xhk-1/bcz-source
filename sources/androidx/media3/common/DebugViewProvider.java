package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.e
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i11, int i12) {
            return DebugViewProvider.a(i11, i12);
        }
    };

    static /* synthetic */ SurfaceView a(int i11, int i12) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i11, int i12);
}
