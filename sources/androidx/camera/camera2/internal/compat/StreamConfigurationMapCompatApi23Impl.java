package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes.dex */
class StreamConfigurationMapCompatApi23Impl extends StreamConfigurationMapCompatBaseImpl {
    public StreamConfigurationMapCompatApi23Impl(@NonNull StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    @Nullable
    public Size[] getOutputSizes(int i11) {
        return this.mStreamConfigurationMap.getOutputSizes(i11);
    }
}
