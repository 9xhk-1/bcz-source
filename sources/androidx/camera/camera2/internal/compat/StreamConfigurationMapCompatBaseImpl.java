package androidx.camera.camera2.internal.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class StreamConfigurationMapCompatBaseImpl implements StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {
    private static final String TAG = "StreamConfigurationMapCompatBaseImpl";
    final StreamConfigurationMap mStreamConfigurationMap;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i11) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
    }

    public StreamConfigurationMapCompatBaseImpl(@NonNull StreamConfigurationMap streamConfigurationMap) {
        this.mStreamConfigurationMap = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @Nullable
    public Size[] getHighResolutionOutputSizes(int i11) {
        return Api23Impl.getHighResolutionOutputSizes(this.mStreamConfigurationMap, i11);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @Nullable
    public int[] getOutputFormats() {
        try {
            return this.mStreamConfigurationMap.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e11) {
            Logger.w(TAG, "Failed to get output formats from StreamConfigurationMap", e11);
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @Nullable
    public Size[] getOutputSizes(int i11) {
        return i11 == 34 ? this.mStreamConfigurationMap.getOutputSizes(SurfaceTexture.class) : this.mStreamConfigurationMap.getOutputSizes(i11);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @NonNull
    public StreamConfigurationMap unwrap() {
        return this.mStreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @Nullable
    public <T> Size[] getOutputSizes(@NonNull Class<T> cls) {
        return this.mStreamConfigurationMap.getOutputSizes(cls);
    }
}
