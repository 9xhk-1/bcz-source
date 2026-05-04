package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AtomSizeTooSmallSniffFailure implements SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i11, long j11, int i12) {
        this.atomType = i11;
        this.atomSize = j11;
        this.minimumHeaderSize = i12;
    }
}
