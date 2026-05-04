package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ChunkHolder {

    @Nullable
    public Chunk chunk;
    public boolean endOfStream;

    public void clear() {
        this.chunk = null;
        this.endOfStream = false;
    }
}
