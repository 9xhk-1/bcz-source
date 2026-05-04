package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i11, int i12, int i13, long j11, int i14);

    void queueSecureInputBuffer(int i11, int i12, CryptoInfo cryptoInfo, long j11, int i13);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete() throws InterruptedException;
}
