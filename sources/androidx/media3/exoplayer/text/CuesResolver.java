package androidx.media3.exoplayer.text;

import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
interface CuesResolver {
    boolean addCues(CuesWithTiming cuesWithTiming, long j11);

    void clear();

    void discardCuesBeforeTimeUs(long j11);

    ImmutableList<Cue> getCuesAtTimeUs(long j11);

    long getNextCueChangeTimeUs(long j11);

    long getPreviousCueChangeTimeUs(long j11);
}
