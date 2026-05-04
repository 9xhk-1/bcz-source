package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface BandwidthStatistic {
    void addSample(long j11, long j12);

    long getBandwidthEstimate();

    void reset();
}
