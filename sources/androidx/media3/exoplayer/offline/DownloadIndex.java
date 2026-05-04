package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@WorkerThread
@UnstableApi
/* loaded from: classes2.dex */
public interface DownloadIndex {
    @Nullable
    Download getDownload(String str) throws IOException;

    DownloadCursor getDownloads(int... iArr) throws IOException;
}
