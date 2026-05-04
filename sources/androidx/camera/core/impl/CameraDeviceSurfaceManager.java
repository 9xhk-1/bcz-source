package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.InitializationException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraDeviceSurfaceManager {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Provider {
        @NonNull
        CameraDeviceSurfaceManager newInstance(@NonNull Context context, @Nullable Object obj, @NonNull Set<String> set) throws InitializationException;
    }

    @NonNull
    Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecs(int i11, @NonNull String str, @NonNull List<AttachedSurfaceInfo> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map, boolean z11, boolean z12);

    @Nullable
    SurfaceConfig transformSurfaceConfig(int i11, @NonNull String str, int i12, @NonNull Size size);
}
