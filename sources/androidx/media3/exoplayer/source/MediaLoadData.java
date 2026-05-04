package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaLoadData {
    public final int dataType;
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;

    @Nullable
    public final Format trackFormat;

    @Nullable
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int trackType;

    public MediaLoadData(int i11) {
        this(i11, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public MediaLoadData(int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
        this.dataType = i11;
        this.trackType = i12;
        this.trackFormat = format;
        this.trackSelectionReason = i13;
        this.trackSelectionData = obj;
        this.mediaStartTimeMs = j11;
        this.mediaEndTimeMs = j12;
    }
}
