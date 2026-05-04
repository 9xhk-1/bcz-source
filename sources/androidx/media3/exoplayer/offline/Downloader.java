package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface Downloader {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ProgressListener {
        void onProgress(long j11, long j12, float f11);
    }

    void cancel();

    void download(@Nullable ProgressListener progressListener) throws IOException, InterruptedException;

    void remove();
}
