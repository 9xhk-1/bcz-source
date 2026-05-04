package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingSeekMap implements SeekMap {
    private final SeekMap seekMap;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return this.seekMap.getSeekPoints(j11);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }
}
