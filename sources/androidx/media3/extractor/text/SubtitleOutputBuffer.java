package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;

    @Nullable
    private Subtitle subtitle;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j11) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getCues(j11 - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i11) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTime(i11) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j11) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getNextEventTimeIndex(j11 - this.subsampleOffsetUs);
    }

    public void setContent(long j11, Subtitle subtitle, long j12) {
        this.timeUs = j11;
        this.subtitle = subtitle;
        if (j12 != Long.MAX_VALUE) {
            j11 = j12;
        }
        this.subsampleOffsetUs = j11;
    }
}
