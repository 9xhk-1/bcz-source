package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SingleSampleSeekMap implements SeekMap {
    private final long durationUs;
    private final long startPosition;

    public SingleSampleSeekMap(long j11) {
        this(j11, 0L);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return new SeekMap.SeekPoints(new SeekPoint(j11, this.startPosition));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public SingleSampleSeekMap(long j11, long j12) {
        this.durationUs = j11;
        this.startPosition = j12;
    }
}
