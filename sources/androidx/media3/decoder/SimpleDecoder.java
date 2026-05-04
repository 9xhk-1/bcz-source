package androidx.media3.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;

    @Nullable
    private I dequeuedInputBuffer;

    @Nullable
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private long outputStartTimeUs = C.TIME_UNSET;
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i11 = 0; i11 < this.availableInputBufferCount; i11++) {
            this.availableInputBuffers[i11] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i12 = 0; i12 < this.availableOutputBufferCount; i12++) {
            this.availableOutputBuffers[i12] = createOutputBuffer();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: androidx.media3.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private boolean decode() throws InterruptedException {
        E createUnexpectedDecodeException;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            I removeFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i11 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i11;
            O o11 = oArr[i11];
            boolean z11 = this.flushed;
            this.flushed = false;
            if (removeFirst.isEndOfStream()) {
                o11.addFlag(4);
            } else {
                o11.timeUs = removeFirst.timeUs;
                if (removeFirst.isFirstSample()) {
                    o11.addFlag(C.BUFFER_FLAG_FIRST_SAMPLE);
                }
                if (!isAtLeastOutputStartTimeUs(removeFirst.timeUs)) {
                    o11.shouldBeSkipped = true;
                }
                try {
                    createUnexpectedDecodeException = decode(removeFirst, o11, z11);
                } catch (OutOfMemoryError e11) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e11);
                } catch (RuntimeException e12) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e12);
                }
                if (createUnexpectedDecodeException != null) {
                    synchronized (this.lock) {
                        this.exception = createUnexpectedDecodeException;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        o11.release();
                    } else if (o11.shouldBeSkipped) {
                        this.skippedOutputBufferCount++;
                        o11.release();
                    } else {
                        o11.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o11);
                    }
                    releaseInputBufferInternal(removeFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    private void maybeThrowException() throws DecoderException {
        E e11 = this.exception;
        if (e11 != null) {
            throw e11;
        }
    }

    private void releaseInputBufferInternal(I i11) {
        i11.clear();
        I[] iArr = this.availableInputBuffers;
        int i12 = this.availableInputBufferCount;
        this.availableInputBufferCount = i12 + 1;
        iArr[i12] = i11;
    }

    private void releaseOutputBufferInternal(O o11) {
        o11.clear();
        O[] oArr = this.availableOutputBuffers;
        int i11 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i11 + 1;
        oArr[i11] = o11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e11) {
                throw new IllegalStateException(e11);
            }
        } while (decode());
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable th2);

    @Nullable
    public abstract E decode(I i11, O o11, boolean z11);

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i11 = this.dequeuedInputBuffer;
                if (i11 != null) {
                    releaseInputBufferInternal(i11);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isAtLeastOutputStartTimeUs(long j11) {
        boolean z11;
        synchronized (this.lock) {
            long j12 = this.outputStartTimeUs;
            z11 = j12 == C.TIME_UNSET || j11 >= j12;
        }
        return z11;
    }

    @Override // androidx.media3.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @CallSuper
    public void releaseOutputBuffer(O o11) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o11);
            maybeNotifyDecodeLoop();
        }
    }

    public final void setInitialInputBufferSize(int i11) {
        Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i12 : this.availableInputBuffers) {
            i12.ensureSpaceForWrite(i11);
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j11) {
        boolean z11;
        synchronized (this.lock) {
            try {
                if (this.availableInputBufferCount != this.availableInputBuffers.length && !this.flushed) {
                    z11 = false;
                    Assertions.checkState(z11);
                    this.outputStartTimeUs = j11;
                }
                z11 = true;
                Assertions.checkState(z11);
                this.outputStartTimeUs = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public final I dequeueInputBuffer() throws DecoderException {
        I i11;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i12 = this.availableInputBufferCount;
            if (i12 == 0) {
                i11 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i13 = i12 - 1;
                this.availableInputBufferCount = i13;
                i11 = iArr[i13];
            }
            this.dequeuedInputBuffer = i11;
        }
        return i11;
    }

    @Override // androidx.media3.decoder.Decoder
    @Nullable
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(I i11) throws DecoderException {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i11 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i11);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }
}
