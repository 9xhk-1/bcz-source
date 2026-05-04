package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
@eo.c
/* loaded from: classes.dex */
public abstract class StreamInfo {
    static final int STREAM_ID_ANY = 0;
    static final int STREAM_ID_ERROR = -1;
    static final StreamInfo STREAM_INFO_ANY_INACTIVE = of(0, StreamState.INACTIVE);
    static final Set<Integer> NON_SURFACE_STREAM_ID = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    static final Observable<StreamInfo> ALWAYS_ACTIVE_OBSERVABLE = ConstantObservable.withValue(of(0, StreamState.ACTIVE));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum StreamState {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    public static StreamInfo of(int i11, @NonNull StreamState streamState) {
        return new AutoValue_StreamInfo(i11, streamState, null);
    }

    public abstract int getId();

    @Nullable
    public abstract SurfaceRequest.TransformationInfo getInProgressTransformationInfo();

    @NonNull
    public abstract StreamState getStreamState();

    @NonNull
    public static StreamInfo of(int i11, @NonNull StreamState streamState, @Nullable SurfaceRequest.TransformationInfo transformationInfo) {
        return new AutoValue_StreamInfo(i11, streamState, transformationInfo);
    }
}
