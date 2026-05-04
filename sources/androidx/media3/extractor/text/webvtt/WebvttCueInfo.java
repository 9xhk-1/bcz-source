package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class WebvttCueInfo {
    public final Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue, long j11, long j12) {
        this.cue = cue;
        this.startTimeUs = j11;
        this.endTimeUs = j12;
    }
}
