package androidx.media3.extractor.text.cea;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class CeaSubtitle implements Subtitle {
    private final List<Cue> cues;

    public CeaSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j11) {
        return j11 >= 0 ? this.cues : Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i11) {
        Assertions.checkArgument(i11 == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j11) {
        return j11 < 0 ? 0 : -1;
    }
}
