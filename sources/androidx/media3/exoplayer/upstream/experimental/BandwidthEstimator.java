package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface BandwidthEstimator {
    public static final long ESTIMATE_NOT_AVAILABLE = Long.MIN_VALUE;

    void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener);

    long getBandwidthEstimate();

    void onBytesTransferred(DataSource dataSource, int i11);

    void onNetworkTypeChange(long j11);

    void onTransferEnd(DataSource dataSource);

    void onTransferInitializing(DataSource dataSource);

    void onTransferStart(DataSource dataSource);

    void removeEventListener(BandwidthMeter.EventListener eventListener);
}
