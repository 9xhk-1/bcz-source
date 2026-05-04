package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes2.dex */
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    private final HandlerThread callbackThread;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private MediaFormat currentFormat;
    private Handler handler;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private IllegalStateException internalException;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private MediaCodec.CryptoException mediaCodecCryptoException;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private MediaCodec.CodecException mediaCodecException;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener;

    @GuardedBy(vb.a.f93813p)
    private long pendingFlushCount;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private MediaFormat pendingOutputFormat;

    @GuardedBy(vb.a.f93813p)
    private boolean shutDown;
    private final Object lock = new Object();

    @GuardedBy(vb.a.f93813p)
    private final CircularIntArray availableInputBuffers = new CircularIntArray();

    @GuardedBy(vb.a.f93813p)
    private final CircularIntArray availableOutputBuffers = new CircularIntArray();

    @GuardedBy(vb.a.f93813p)
    private final ArrayDeque<MediaCodec.BufferInfo> bufferInfos = new ArrayDeque<>();

    @GuardedBy(vb.a.f93813p)
    private final ArrayDeque<MediaFormat> formats = new ArrayDeque<>();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    @GuardedBy(vb.a.f93813p)
    private void addOutputFormat(MediaFormat mediaFormat) {
        this.availableOutputBuffers.addLast(-2);
        this.formats.add(mediaFormat);
    }

    @GuardedBy(vb.a.f93813p)
    private void flushInternal() {
        if (!this.formats.isEmpty()) {
            this.pendingOutputFormat = this.formats.getLast();
        }
        this.availableInputBuffers.clear();
        this.availableOutputBuffers.clear();
        this.bufferInfos.clear();
        this.formats.clear();
    }

    @GuardedBy(vb.a.f93813p)
    private boolean isFlushingOrShutdown() {
        return this.pendingFlushCount > 0 || this.shutDown;
    }

    @GuardedBy(vb.a.f93813p)
    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
        maybeThrowMediaCodecCryptoException();
    }

    @GuardedBy(vb.a.f93813p)
    private void maybeThrowInternalException() {
        IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException == null) {
            return;
        }
        this.internalException = null;
        throw illegalStateException;
    }

    @GuardedBy(vb.a.f93813p)
    private void maybeThrowMediaCodecCryptoException() {
        MediaCodec.CryptoException cryptoException = this.mediaCodecCryptoException;
        if (cryptoException == null) {
            return;
        }
        this.mediaCodecCryptoException = null;
        throw cryptoException;
    }

    @GuardedBy(vb.a.f93813p)
    private void maybeThrowMediaCodecException() {
        MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException == null) {
            return;
        }
        this.mediaCodecException = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.lock) {
            try {
                if (this.shutDown) {
                    return;
                }
                long j11 = this.pendingFlushCount - 1;
                this.pendingFlushCount = j11;
                if (j11 > 0) {
                    return;
                }
                if (j11 < 0) {
                    setInternalException(new IllegalStateException());
                } else {
                    flushInternal();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void setInternalException(IllegalStateException illegalStateException) {
        synchronized (this.lock) {
            this.internalException = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                int i11 = -1;
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (!this.availableInputBuffers.isEmpty()) {
                    i11 = this.availableInputBuffers.popFirst();
                }
                return i11;
            } finally {
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (this.availableOutputBuffers.isEmpty()) {
                    return -1;
                }
                int popFirst = this.availableOutputBuffers.popFirst();
                if (popFirst >= 0) {
                    Assertions.checkStateNotNull(this.currentFormat);
                    MediaCodec.BufferInfo remove = this.bufferInfos.remove();
                    bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                } else if (popFirst == -2) {
                    this.currentFormat = this.formats.remove();
                }
                return popFirst;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void flush() {
        synchronized (this.lock) {
            this.pendingFlushCount++;
            ((Handler) Util.castNonNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.f
                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback.this.onFlushCompleted();
                }
            });
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.lock) {
            try {
                mediaFormat = this.currentFormat;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void initialize(MediaCodec mediaCodec) {
        Assertions.checkState(this.handler == null);
        this.callbackThread.start();
        Handler handler = new Handler(this.callbackThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.handler = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.lock) {
            this.mediaCodecCryptoException = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        synchronized (this.lock) {
            try {
                this.availableInputBuffers.addLast(i11);
                MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.onBufferAvailableListener;
                if (onBufferAvailableListener != null) {
                    onBufferAvailableListener.onInputBufferAvailable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            try {
                MediaFormat mediaFormat = this.pendingOutputFormat;
                if (mediaFormat != null) {
                    addOutputFormat(mediaFormat);
                    this.pendingOutputFormat = null;
                }
                this.availableOutputBuffers.addLast(i11);
                this.bufferInfos.add(bufferInfo);
                MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.onBufferAvailableListener;
                if (onBufferAvailableListener != null) {
                    onBufferAvailableListener.onOutputBufferAvailable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.lock) {
            addOutputFormat(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }

    public void setOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        synchronized (this.lock) {
            this.onBufferAvailableListener = onBufferAvailableListener;
        }
    }

    public void shutdown() {
        synchronized (this.lock) {
            this.shutDown = true;
            this.callbackThread.quit();
            flushInternal();
        }
    }
}
