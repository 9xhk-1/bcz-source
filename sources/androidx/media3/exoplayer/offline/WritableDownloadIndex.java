package androidx.media3.exoplayer.offline;

import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@WorkerThread
@UnstableApi
/* loaded from: classes2.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download) throws IOException;

    void removeDownload(String str) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int i11) throws IOException;

    void setStopReason(String str, int i11) throws IOException;
}
