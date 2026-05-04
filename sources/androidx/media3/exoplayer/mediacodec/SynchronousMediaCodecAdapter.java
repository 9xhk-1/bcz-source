package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements MediaCodecAdapter.Factory {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        @android.annotation.SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration r7) throws java.io.IOException {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.createCodec(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                androidx.media3.common.util.TraceUtil.beginSection(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.surface     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r3 = r7.codecInfo     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.detachedSurfaceSupported     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = androidx.media3.common.util.Util.SDK_INT     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.mediaFormat     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.crypto     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.common.util.TraceUtil.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                androidx.media3.common.util.TraceUtil.beginSection(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.common.util.TraceUtil.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter r2 = new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.exoplayer.mediacodec.LoudnessCodecController r7 = r7.loudnessCodecController     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.Factory.createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Configuration):androidx.media3.exoplayer.mediacodec.MediaCodecAdapter");
        }

        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
            Assertions.checkNotNull(configuration.codecInfo);
            String str = configuration.codecInfo.name;
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            return createByCodecName;
        }
    }

    public static /* synthetic */ void a(SynchronousMediaCodecAdapter synchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j11, long j12) {
        synchronousMediaCodecAdapter.getClass();
        onFrameRenderedListener.onFrameRendered(synchronousMediaCodecAdapter, j11, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(35)
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i11) {
        return this.codec.getInputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        PersistableBundle metrics;
        metrics = this.codec.getMetrics();
        return metrics;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i11) {
        return this.codec.getOutputBuffer(i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.codec.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i11, int i12, CryptoInfo cryptoInfo, long j11, int i13) {
        this.codec.queueSecureInputBuffer(i11, i12, cryptoInfo.getFrameworkCryptoInfo(), j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            int i11 = Util.SDK_INT;
            if (i11 >= 30 && i11 < 33) {
                this.codec.stop();
            }
            if (i11 >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                loudnessCodecController2.removeMediaCodec(this.codec);
            }
            this.codec.release();
        } catch (Throwable th2) {
            if (Util.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.codec.releaseOutputBuffer(i11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.c0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                SynchronousMediaCodecAdapter.a(SynchronousMediaCodecAdapter.this, onFrameRenderedListener, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(23)
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i11) {
        this.codec.setVideoScalingMode(i11);
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec, @Nullable LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Util.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i11, long j11) {
        this.codec.releaseOutputBuffer(i11, j11);
    }
}
