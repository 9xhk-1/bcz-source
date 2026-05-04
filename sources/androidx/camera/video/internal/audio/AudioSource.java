package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AudioSource {

    @VisibleForTesting
    static final long DEFAULT_START_RETRY_INTERVAL_MS = 3000;
    private static final String TAG = "AudioSource";

    @Nullable
    private FutureCallback<InputBuffer> mAcquireBufferCallback;
    long mAmplitudeTimestamp;
    double mAudioAmplitude;
    private final int mAudioFormat;

    @VisibleForTesting
    public final int mAudioSource;

    @Nullable
    AudioSourceCallback mAudioSourceCallback;
    final AudioStream mAudioStream;
    boolean mAudioStreamSilenced;

    @Nullable
    BufferProvider<? extends InputBuffer> mBufferProvider;

    @NonNull
    BufferProvider.State mBufferProviderState;

    @Nullable
    Executor mCallbackExecutor;
    final Executor mExecutor;
    boolean mInSilentStartState;
    boolean mIsSendingAudio;
    private long mLatestFailedStartTimeNs;
    boolean mMuted;
    final AtomicReference<Boolean> mNotifiedSilenceState;
    final AtomicBoolean mNotifiedSuspendState;
    final SilentAudioStream mSilentAudioStream;
    private final long mStartRetryIntervalNs;

    @NonNull
    InternalState mState;

    @Nullable
    private Observable.Observer<BufferProvider.State> mStateObserver;

    @Nullable
    private byte[] mZeroBytes;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AudioStreamCallback implements AudioStream.AudioStreamCallback {
        public AudioStreamCallback() {
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.AudioStreamCallback
        public void onSilenceStateChanged(boolean z11) {
            AudioSource audioSource = AudioSource.this;
            audioSource.mAudioStreamSilenced = z11;
            if (audioSource.mState == InternalState.STARTED) {
                audioSource.notifySilenced();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioSource(@NonNull AudioSettings audioSettings, @NonNull Executor executor, @Nullable Context context) throws AudioSourceAccessException {
        this(audioSettings, executor, context, new AudioStreamFactory() { // from class: androidx.camera.video.internal.audio.d
            @Override // androidx.camera.video.internal.audio.AudioStreamFactory
            public final AudioStream create(AudioSettings audioSettings2, Context context2) {
                return new AudioStreamImpl(audioSettings2, context2);
            }
        }, 3000L);
    }

    public static /* synthetic */ Object a(final AudioSource audioSource, final CallbackToFutureAdapter.Completer completer) {
        audioSource.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.i
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.f(AudioSource.this, completer);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(AudioSource audioSource, Executor executor, AudioSourceCallback audioSourceCallback) {
        int ordinal = audioSource.mState.ordinal();
        if (ordinal == 0) {
            audioSource.mCallbackExecutor = executor;
            audioSource.mAudioSourceCallback = audioSourceCallback;
        } else if (ordinal == 1 || ordinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(AudioSource audioSource, BufferProvider bufferProvider) {
        int ordinal = audioSource.mState.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (audioSource.mBufferProvider != bufferProvider) {
            audioSource.resetBufferProvider(bufferProvider);
        }
    }

    public static /* synthetic */ void e(AudioSource audioSource, boolean z11) {
        int ordinal = audioSource.mState.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (audioSource.mMuted == z11) {
                return;
            }
            audioSource.mMuted = z11;
            if (audioSource.mState == InternalState.STARTED) {
                audioSource.notifySilenced();
            }
        }
    }

    public static /* synthetic */ void f(AudioSource audioSource, CallbackToFutureAdapter.Completer completer) {
        audioSource.getClass();
        try {
            int ordinal = audioSource.mState.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                audioSource.resetBufferProvider(null);
                audioSource.mSilentAudioStream.release();
                audioSource.mAudioStream.release();
                audioSource.stopSendingAudio();
                audioSource.setState(InternalState.RELEASED);
            }
            completer.set(null);
        } catch (Throwable th2) {
            completer.setException(th2);
        }
    }

    @Nullable
    private static BufferProvider.State fetchBufferProviderState(@NonNull BufferProvider<? extends InputBuffer> bufferProvider) {
        try {
            p1<? extends InputBuffer> fetchData = bufferProvider.fetchData();
            if (fetchData.isDone()) {
                return (BufferProvider.State) fetchData.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public static /* synthetic */ void g(AudioSource audioSource) {
        int ordinal = audioSource.mState.ordinal();
        if (ordinal == 1) {
            audioSource.setState(InternalState.CONFIGURED);
            audioSource.updateSendingAudio();
        } else {
            if (ordinal != 2) {
                return;
            }
            Logger.w(TAG, "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    private static long getCurrentSystemTimeNs() {
        return System.nanoTime();
    }

    public static boolean isSettingsSupported(int i11, int i12, int i13) {
        return AudioStreamImpl.isSettingsSupported(i11, i12, i13);
    }

    public static /* synthetic */ void k(AudioSource audioSource, boolean z11) {
        int ordinal = audioSource.mState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        audioSource.mNotifiedSilenceState.set(null);
        audioSource.mNotifiedSuspendState.set(false);
        audioSource.setState(InternalState.STARTED);
        audioSource.mute(z11);
        audioSource.updateSendingAudio();
    }

    private void resetBufferProvider(@Nullable final BufferProvider<? extends InputBuffer> bufferProvider) {
        BufferProvider<? extends InputBuffer> bufferProvider2 = this.mBufferProvider;
        if (bufferProvider2 != null) {
            Observable.Observer<BufferProvider.State> observer = this.mStateObserver;
            Objects.requireNonNull(observer);
            bufferProvider2.removeObserver(observer);
            this.mBufferProvider = null;
            this.mStateObserver = null;
            this.mAcquireBufferCallback = null;
            this.mBufferProviderState = BufferProvider.State.INACTIVE;
            updateSendingAudio();
        }
        if (bufferProvider != null) {
            this.mBufferProvider = bufferProvider;
            this.mStateObserver = new Observable.Observer<BufferProvider.State>() { // from class: androidx.camera.video.internal.audio.AudioSource.1
                @Override // androidx.camera.core.impl.Observable.Observer
                public void onError(@NonNull Throwable th2) {
                    AudioSource audioSource = AudioSource.this;
                    if (audioSource.mBufferProvider == bufferProvider) {
                        audioSource.notifyError(th2);
                    }
                }

                @Override // androidx.camera.core.impl.Observable.Observer
                public void onNewData(@Nullable BufferProvider.State state) {
                    Objects.requireNonNull(state);
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        Logger.d(AudioSource.TAG, "Receive BufferProvider state change: " + AudioSource.this.mBufferProviderState + " to " + state);
                        AudioSource audioSource = AudioSource.this;
                        if (audioSource.mBufferProviderState != state) {
                            audioSource.mBufferProviderState = state;
                            audioSource.updateSendingAudio();
                        }
                    }
                }
            };
            this.mAcquireBufferCallback = new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.audio.AudioSource.2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@NonNull Throwable th2) {
                    if (AudioSource.this.mBufferProvider != bufferProvider) {
                        return;
                    }
                    Logger.d(AudioSource.TAG, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                    if (th2 instanceof IllegalStateException) {
                        return;
                    }
                    AudioSource.this.notifyError(th2);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(InputBuffer inputBuffer) {
                    AudioSource audioSource = AudioSource.this;
                    if (!audioSource.mIsSendingAudio || audioSource.mBufferProvider != bufferProvider) {
                        inputBuffer.cancel();
                        return;
                    }
                    if (audioSource.mInSilentStartState && audioSource.isStartRetryIntervalReached()) {
                        AudioSource.this.retryStartAudioStream();
                    }
                    AudioStream currentAudioStream = AudioSource.this.getCurrentAudioStream();
                    ByteBuffer byteBuffer = inputBuffer.getByteBuffer();
                    AudioStream.PacketInfo read = currentAudioStream.read(byteBuffer);
                    if (read.getSizeInBytes() > 0) {
                        AudioSource audioSource2 = AudioSource.this;
                        if (audioSource2.mMuted) {
                            audioSource2.overrideBySilence(byteBuffer, read.getSizeInBytes());
                        }
                        if (AudioSource.this.mCallbackExecutor != null) {
                            long timestampNs = read.getTimestampNs();
                            AudioSource audioSource3 = AudioSource.this;
                            if (timestampNs - audioSource3.mAmplitudeTimestamp >= 200) {
                                audioSource3.mAmplitudeTimestamp = read.getTimestampNs();
                                AudioSource.this.postMaxAmplitude(byteBuffer);
                            }
                        }
                        byteBuffer.limit(byteBuffer.position() + read.getSizeInBytes());
                        inputBuffer.setPresentationTimeUs(TimeUnit.NANOSECONDS.toMicros(read.getTimestampNs()));
                        inputBuffer.submit();
                    } else {
                        Logger.w(AudioSource.TAG, "Unable to read data from AudioStream.");
                        inputBuffer.cancel();
                    }
                    AudioSource.this.sendNextAudio();
                }
            };
            BufferProvider.State fetchBufferProviderState = fetchBufferProviderState(bufferProvider);
            if (fetchBufferProviderState != null) {
                this.mBufferProviderState = fetchBufferProviderState;
                updateSendingAudio();
            }
            this.mBufferProvider.addObserver(this.mExecutor, this.mStateObserver);
        }
    }

    private void startSendingAudio() {
        if (this.mIsSendingAudio) {
            return;
        }
        try {
            Logger.d(TAG, "startSendingAudio");
            this.mAudioStream.start();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e11) {
            Logger.w(TAG, "Failed to start AudioStream", e11);
            this.mInSilentStartState = true;
            this.mSilentAudioStream.start();
            this.mLatestFailedStartTimeNs = getCurrentSystemTimeNs();
            notifySilenced();
        }
        this.mIsSendingAudio = true;
        sendNextAudio();
    }

    private void stopSendingAudio() {
        if (this.mIsSendingAudio) {
            this.mIsSendingAudio = false;
            Logger.d(TAG, "stopSendingAudio");
            this.mAudioStream.stop();
        }
    }

    @NonNull
    public AudioStream getCurrentAudioStream() {
        return this.mInSilentStartState ? this.mSilentAudioStream : this.mAudioStream;
    }

    public boolean isStartRetryIntervalReached() {
        Preconditions.checkState(this.mLatestFailedStartTimeNs > 0);
        return getCurrentSystemTimeNs() - this.mLatestFailedStartTimeNs >= this.mStartRetryIntervalNs;
    }

    public void mute(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.a
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.e(AudioSource.this, z11);
            }
        });
    }

    public void notifyError(@NonNull final Throwable th2) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.c
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.AudioSourceCallback.this.onError(th2);
            }
        });
    }

    public void notifySilenced() {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null) {
            return;
        }
        final boolean z11 = this.mMuted || this.mInSilentStartState || this.mAudioStreamSilenced;
        if (Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.h
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.AudioSourceCallback.this.onSilenceStateChanged(z11);
            }
        });
    }

    public void notifySuspended(final boolean z11) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (executor == null || audioSourceCallback == null || this.mNotifiedSuspendState.getAndSet(z11) == z11) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.m
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.AudioSourceCallback.this.onSuspendStateChanged(z11);
            }
        });
    }

    public void overrideBySilence(@NonNull ByteBuffer byteBuffer, int i11) {
        byte[] bArr = this.mZeroBytes;
        if (bArr == null || bArr.length < i11) {
            this.mZeroBytes = new byte[i11];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.mZeroBytes, 0, i11);
        byteBuffer.limit(byteBuffer.position()).position(position);
    }

    public void postMaxAmplitude(ByteBuffer byteBuffer) {
        Executor executor = this.mCallbackExecutor;
        final AudioSourceCallback audioSourceCallback = this.mAudioSourceCallback;
        if (this.mAudioFormat == 2) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            double d11 = 0.0d;
            while (asShortBuffer.hasRemaining()) {
                d11 = Math.max(d11, Math.abs((int) asShortBuffer.get()));
            }
            this.mAudioAmplitude = d11 / 32767.0d;
            if (executor == null || audioSourceCallback == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.l
                @Override // java.lang.Runnable
                public final void run() {
                    audioSourceCallback.onAmplitudeValue(AudioSource.this.mAudioAmplitude);
                }
            });
        }
    }

    @NonNull
    public p1<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.internal.audio.f
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return AudioSource.a(AudioSource.this, completer);
            }
        });
    }

    public void retryStartAudioStream() {
        Preconditions.checkState(this.mInSilentStartState);
        try {
            this.mAudioStream.start();
            Logger.d(TAG, "Retry start AudioStream succeed");
            this.mSilentAudioStream.stop();
            this.mInSilentStartState = false;
        } catch (AudioStream.AudioStreamException e11) {
            Logger.w(TAG, "Retry start AudioStream failed", e11);
            this.mLatestFailedStartTimeNs = getCurrentSystemTimeNs();
        }
    }

    public void sendNextAudio() {
        BufferProvider<? extends InputBuffer> bufferProvider = this.mBufferProvider;
        Objects.requireNonNull(bufferProvider);
        p1<? extends InputBuffer> acquireBuffer = bufferProvider.acquireBuffer();
        FutureCallback<InputBuffer> futureCallback = this.mAcquireBufferCallback;
        Objects.requireNonNull(futureCallback);
        Futures.addCallback(acquireBuffer, futureCallback, this.mExecutor);
    }

    public void setAudioSourceCallback(@NonNull final Executor executor, @NonNull final AudioSourceCallback audioSourceCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.k
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.b(AudioSource.this, executor, audioSourceCallback);
            }
        });
    }

    public void setBufferProvider(@NonNull final BufferProvider<? extends InputBuffer> bufferProvider) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.b
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.d(AudioSource.this, bufferProvider);
            }
        });
    }

    public void setState(InternalState internalState) {
        Logger.d(TAG, "Transitioning internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    public void start() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.j
            @Override // java.lang.Runnable
            public final void run() {
                r0.start(AudioSource.this.mMuted);
            }
        });
    }

    public void stop() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.e
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.g(AudioSource.this);
            }
        });
    }

    public void updateSendingAudio() {
        if (this.mState != InternalState.STARTED) {
            stopSendingAudio();
            return;
        }
        boolean z11 = this.mBufferProviderState == BufferProvider.State.ACTIVE;
        notifySuspended(!z11);
        if (z11) {
            startSendingAudio();
        } else {
            stopSendingAudio();
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    @VisibleForTesting
    public AudioSource(@NonNull AudioSettings audioSettings, @NonNull Executor executor, @Nullable Context context, @NonNull AudioStreamFactory audioStreamFactory, long j11) throws AudioSourceAccessException {
        this.mNotifiedSilenceState = new AtomicReference<>(null);
        this.mNotifiedSuspendState = new AtomicBoolean(false);
        this.mState = InternalState.CONFIGURED;
        this.mBufferProviderState = BufferProvider.State.INACTIVE;
        this.mAmplitudeTimestamp = 0L;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = newSequentialExecutor;
        this.mStartRetryIntervalNs = TimeUnit.MILLISECONDS.toNanos(j11);
        try {
            BufferedAudioStream bufferedAudioStream = new BufferedAudioStream(audioStreamFactory.create(audioSettings, context), audioSettings);
            this.mAudioStream = bufferedAudioStream;
            bufferedAudioStream.setCallback(new AudioStreamCallback(), newSequentialExecutor);
            this.mSilentAudioStream = new SilentAudioStream(audioSettings);
            this.mAudioFormat = audioSettings.getAudioFormat();
            this.mAudioSource = audioSettings.getAudioSource();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e11) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e11);
        }
    }

    public void start(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.g
            @Override // java.lang.Runnable
            public final void run() {
                AudioSource.k(AudioSource.this, z11);
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AudioSourceCallback {
        void onAmplitudeValue(double d11);

        void onError(@NonNull Throwable th2);

        void onSilenceStateChanged(boolean z11);

        @VisibleForTesting
        default void onSuspendStateChanged(boolean z11) {
        }
    }
}
