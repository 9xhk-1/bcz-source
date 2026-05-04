package androidx.camera.video.internal.compat;

import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Impl {
    private Api26Impl() {
    }

    @NonNull
    public static MediaMuxer createMediaMuxer(@NonNull FileDescriptor fileDescriptor, int i11) throws IOException {
        return new MediaMuxer(fileDescriptor, i11);
    }
}
