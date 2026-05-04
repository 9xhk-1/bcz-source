package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import ho.p0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes2.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final MediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;

    @Nullable
    private final LoudnessCodecController loudnessCodecController;
    private int state;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements MediaCodecAdapter.Factory {
        private final p0<HandlerThread> callbackThreadSupplier;
        private boolean enableSynchronousBufferQueueingWithAsyncCryptoFlag;
        private final p0<HandlerThread> queueingThreadSupplier;

        public Factory(final int i11) {
            this(new p0() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // ho.p0
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.b(i11);
                }
            }, new p0() { // from class: androidx.media3.exoplayer.mediacodec.e
                @Override // ho.p0
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.a(i11);
                }
            });
        }

        public static /* synthetic */ HandlerThread a(int i11) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i11));
        }

        public static /* synthetic */ HandlerThread b(int i11) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i11));
        }

        @ChecksSdkIntAtLeast(api = 34)
        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag(Format format) {
            int i11 = Util.SDK_INT;
            if (i11 < 34) {
                return false;
            }
            return i11 >= 35 || MimeTypes.isVideo(format.sampleMimeType);
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z11) {
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = z11;
        }

        public Factory(p0<HandlerThread> p0Var, p0<HandlerThread> p0Var2) {
            this.callbackThreadSupplier = p0Var;
            this.queueingThreadSupplier = p0Var2;
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws IOException {
            Exception exc;
            MediaCodec mediaCodec;
            MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            int i11;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    if (this.enableSynchronousBufferQueueingWithAsyncCryptoFlag && useSynchronousBufferQueueingWithAsyncCryptoFlag(configuration.format)) {
                        asynchronousMediaCodecBufferEnqueuer = new SynchronousMediaCodecBufferEnqueuer(mediaCodec);
                        i11 = 4;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, this.queueingThreadSupplier.get());
                        i11 = 0;
                    }
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodec, this.callbackThreadSupplier.get(), asynchronousMediaCodecBufferEnqueuer, configuration.loudnessCodecController);
                    try {
                        TraceUtil.endSection();
                        Surface surface = configuration.surface;
                        if (surface == null && configuration.codecInfo.detachedSurfaceSupported && Util.SDK_INT >= 35) {
                            i11 |= 8;
                        }
                        asynchronousMediaCodecAdapter2.initialize(configuration.mediaFormat, surface, configuration.crypto, i11);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e11) {
                        exc = e11;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                            throw exc;
                        }
                        if (mediaCodec == null) {
                            throw exc;
                        }
                        mediaCodec.release();
                        throw exc;
                    }
                } catch (Exception e12) {
                    exc = e12;
                }
            } catch (Exception e13) {
                exc = e13;
                mediaCodec = null;
            }
        }
    }

    public static /* synthetic */ void a(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j11, long j12) {
        asynchronousMediaCodecAdapter.getClass();
        onFrameRenderedListener.onFrameRendered(asynchronousMediaCodecAdapter, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createCallbackThreadLabel(int i11) {
        return createThreadLabel(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createQueueingThreadLabel(int i11) {
        return createThreadLabel(i11, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 1) {
            sb2.append("Audio");
        } else if (i11 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i11);
            sb2.append(pn.j.f81007d);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i11) {
        LoudnessCodecController loudnessCodecController;
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i11);
        TraceUtil.endSection();
        this.bufferEnqueuer.start();
        TraceUtil.beginSection("startCodec");
        this.codec.start();
        TraceUtil.endSection();
        if (Util.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
            loudnessCodecController.addMediaCodec(this.codec);
        }
        this.state = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(35)
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
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
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @VisibleForTesting
    public void onError(MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    @VisibleForTesting
    public void onOutputFormatChanged(MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.bufferEnqueuer.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i11, int i12, CryptoInfo cryptoInfo, long j11, int i13) {
        this.bufferEnqueuer.queueSecureInputBuffer(i11, i12, cryptoInfo, j11, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        this.asynchronousMediaCodecCallback.setOnBufferAvailableListener(onBufferAvailableListener);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            try {
                int i11 = Util.SDK_INT;
                if (i11 >= 30 && i11 < 33) {
                    this.codec.stop();
                }
                if (i11 >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                    loudnessCodecController2.removeMediaCodec(this.codec);
                }
                this.codec.release();
                this.codecReleased = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.codecReleased) {
                try {
                    int i12 = Util.SDK_INT;
                    if (i12 >= 30 && i12 < 33) {
                        this.codec.stop();
                    }
                    if (i12 >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                        loudnessCodecController.removeMediaCodec(this.codec);
                    }
                    this.codec.release();
                    this.codecReleased = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.codec.releaseOutputBuffer(i11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.c
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                AsynchronousMediaCodecAdapter.a(AsynchronousMediaCodecAdapter.this, onFrameRenderedListener, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i11) {
        this.codec.setVideoScalingMode(i11);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, @Nullable LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.loudnessCodecController = loudnessCodecController;
        this.state = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i11, long j11) {
        this.codec.releaseOutputBuffer(i11, j11);
    }
}
