package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ArrayRingBuffer;
import androidx.camera.core.internal.utils.RingBuffer;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.camera.video.internal.workaround.CorrectNegativeLatLongForMediaMuxer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.p1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Recorder implements VideoOutput {
    private static final int AUDIO_CACHE_SIZE = 60;
    private static final Executor AUDIO_EXECUTOR;

    @VisibleForTesting
    static final EncoderFactory DEFAULT_ENCODER_FACTORY;
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final String MEDIA_COLUMN = "_data";
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
    private static final long RETRY_SETUP_VIDEO_DELAY_MS = 1000;
    private static final int RETRY_SETUP_VIDEO_MAX_COUNT = 3;
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final String TAG = "Recorder";
    public static final int VIDEO_CAPABILITIES_SOURCE_CAMCORDER_PROFILE = 0;
    public static final int VIDEO_CAPABILITIES_SOURCE_CODEC_CAPABILITIES = 1;
    private static final VideoSpec VIDEO_SPEC_DEFAULT;

    @VisibleForTesting
    static long sRetrySetupVideoDelayMs;

    @VisibleForTesting
    static int sRetrySetupVideoMaxCount;

    @GuardedBy("mLock")
    RecordingRecord mActiveRecordingRecord;
    Surface mActiveSurface;
    double mAudioAmplitude;
    Encoder mAudioEncoder;
    private final EncoderFactory mAudioEncoderFactory;
    Throwable mAudioErrorCause;
    OutputConfig mAudioOutputConfig;
    AudioSource mAudioSource;
    AudioState mAudioState;
    Integer mAudioTrackIndex;
    long mDurationLimitNs;
    private final boolean mEncoderNotUsePersistentInputSurface;
    final List<p1<Void>> mEncodingFutures;
    private final Executor mExecutor;
    long mFileSizeLimitInBytes;

    @VisibleForTesting
    long mFirstRecordingAudioDataTimeUs;

    @VisibleForTesting
    int mFirstRecordingVideoBitrate;

    @VisibleForTesting
    long mFirstRecordingVideoDataTimeUs;
    RecordingRecord mInProgressRecording;
    boolean mInProgressRecordingStopping;

    @Nullable
    private SurfaceRequest.TransformationInfo mInProgressTransformationInfo;
    boolean mIsAudioSourceSilenced;
    private final MutableStateObservable<Boolean> mIsRecording;

    @GuardedBy("mLock")
    private long mLastGeneratedRecordingId;
    Surface mLatestSurface;
    SurfaceRequest mLatestSurfaceRequest;
    private final Object mLock = new Object();
    MediaMuxer mMediaMuxer;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    private boolean mNeedsResetBeforeNextStart;

    @GuardedBy("mLock")
    private State mNonPendingState;

    @NonNull
    Uri mOutputUri;

    @NonNull
    final RingBuffer<EncodedData> mPendingAudioRingBuffer;
    EncodedData mPendingFirstVideoData;

    @GuardedBy("mLock")
    RecordingRecord mPendingRecordingRecord;
    long mPreviousRecordingAudioDataTimeUs;
    long mPreviousRecordingVideoDataTimeUs;
    long mRecordingBytes;
    long mRecordingDurationNs;
    int mRecordingStopError;
    Throwable mRecordingStopErrorCause;
    private VideoValidatedEncoderProfilesProxy mResolvedEncoderProfiles;
    final Executor mSequentialExecutor;

    @Nullable
    private SetupVideoTask mSetupVideoTask;
    private boolean mShouldSendResumeEvent;
    ScheduledFuture<?> mSourceNonStreamingTimeout;
    VideoOutput.SourceState mSourceState;

    @Nullable
    private SurfaceRequest.TransformationInfo mSourceTransformationInfo;

    @GuardedBy("mLock")
    private State mState;

    @GuardedBy("mLock")
    int mStreamId;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    private final Executor mUserProvidedExecutor;
    private final int mVideoCapabilitiesSource;
    Encoder mVideoEncoder;

    @VisibleForTesting
    Range<Integer> mVideoEncoderBitrateRange;
    private final EncoderFactory mVideoEncoderFactory;

    @NonNull
    VideoEncoderSession mVideoEncoderSession;

    @Nullable
    VideoEncoderSession mVideoEncoderSessionToRelease;
    OutputConfig mVideoOutputConfig;
    Timebase mVideoSourceTimebase;
    Integer mVideoTrackIndex;
    private static final Set<State> PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.CONFIGURING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private EncoderFactory mAudioEncoderFactory;
        private final MediaSpec.Builder mMediaSpecBuilder;
        private EncoderFactory mVideoEncoderFactory;
        private int mVideoCapabilitiesSource = 0;
        private Executor mExecutor = null;

        public Builder() {
            EncoderFactory encoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
            this.mVideoEncoderFactory = encoderFactory;
            this.mAudioEncoderFactory = encoderFactory;
            this.mMediaSpecBuilder = MediaSpec.builder();
        }

        @NonNull
        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoCapabilitiesSource, this.mVideoEncoderFactory, this.mAudioEncoderFactory);
        }

        @NonNull
        public Builder setAspectRatio(final int i11) {
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.w
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(i11);
                }
            });
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setAudioEncoderFactory(@NonNull EncoderFactory encoderFactory) {
            this.mAudioEncoderFactory = encoderFactory;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setAudioSource(final int i11) {
            this.mMediaSpecBuilder.configureAudio(new Consumer() { // from class: androidx.camera.video.v
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((AudioSpec.Builder) obj).setSource(i11);
                }
            });
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        @NonNull
        public Builder setQualitySelector(@NonNull final QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.x
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setQualitySelector(QualitySelector.this);
                }
            });
            return this;
        }

        @NonNull
        public Builder setTargetVideoEncodingBitRate(@IntRange(from = 1) final int i11) {
            if (i11 > 0) {
                this.mMediaSpecBuilder.configureVideo(new Consumer() { // from class: androidx.camera.video.u
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        ((VideoSpec.Builder) obj).setBitrate(new Range<>(Integer.valueOf(r0), Integer.valueOf(i11)));
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i11 + " is not supported. Target bitrate must be greater than 0.");
        }

        @NonNull
        public Builder setVideoCapabilitiesSource(int i11) {
            boolean z11 = true;
            if (i11 != 0 && i11 != 1) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "Not a supported video capabilities source: " + i11);
            this.mVideoCapabilitiesSource = i11;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setVideoEncoderFactory(@NonNull EncoderFactory encoderFactory) {
            this.mVideoEncoderFactory = encoderFactory;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class SetupVideoTask {
        private final int mMaxRetryCount;
        private final SurfaceRequest mSurfaceRequest;
        private final Timebase mTimebase;
        private boolean mIsFailedRetryCanceled = false;
        private int mRetryCount = 0;

        @Nullable
        private ScheduledFuture<?> mRetryFuture = null;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: androidx.camera.video.Recorder$SetupVideoTask$1, reason: invalid class name */
        public class AnonymousClass1 implements FutureCallback<Encoder> {
            final /* synthetic */ VideoEncoderSession val$videoEncoderSession;

            public AnonymousClass1(VideoEncoderSession videoEncoderSession) {
                this.val$videoEncoderSession = videoEncoderSession;
            }

            public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
                if (SetupVideoTask.this.mIsFailedRetryCanceled) {
                    return;
                }
                Logger.d(Recorder.TAG, "Retry setupVideo #" + SetupVideoTask.this.mRetryCount);
                SetupVideoTask setupVideoTask = SetupVideoTask.this;
                setupVideoTask.setupVideo(setupVideoTask.mSurfaceRequest, SetupVideoTask.this.mTimebase);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Logger.w(Recorder.TAG, "VideoEncoder Setup error: " + th2, th2);
                if (SetupVideoTask.this.mRetryCount >= SetupVideoTask.this.mMaxRetryCount) {
                    Recorder.this.onEncoderSetupError(th2);
                    return;
                }
                SetupVideoTask.access$408(SetupVideoTask.this);
                SetupVideoTask.this.mRetryFuture = Recorder.scheduleTask(new Runnable() { // from class: androidx.camera.video.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.SetupVideoTask.AnonymousClass1.a(Recorder.SetupVideoTask.AnonymousClass1.this);
                    }
                }, Recorder.this.mSequentialExecutor, Recorder.sRetrySetupVideoDelayMs, TimeUnit.MILLISECONDS);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Encoder encoder) {
                Logger.d(Recorder.TAG, "VideoEncoder is created. " + encoder);
                if (encoder == null) {
                    return;
                }
                Preconditions.checkState(Recorder.this.mVideoEncoderSession == this.val$videoEncoderSession);
                Preconditions.checkState(Recorder.this.mVideoEncoder == null);
                Recorder.this.onVideoEncoderReady(this.val$videoEncoderSession);
                Recorder.this.onConfigured();
            }
        }

        public SetupVideoTask(@NonNull SurfaceRequest surfaceRequest, @NonNull Timebase timebase, int i11) {
            this.mSurfaceRequest = surfaceRequest;
            this.mTimebase = timebase;
            this.mMaxRetryCount = i11;
        }

        public static /* synthetic */ void a(SetupVideoTask setupVideoTask, SurfaceRequest surfaceRequest, Timebase timebase) {
            setupVideoTask.getClass();
            if (!surfaceRequest.isServiced() && (!Recorder.this.mVideoEncoderSession.isConfiguredSurfaceRequest(surfaceRequest) || Recorder.this.isPersistentRecordingInProgress())) {
                EncoderFactory encoderFactory = Recorder.this.mVideoEncoderFactory;
                Recorder recorder = Recorder.this;
                VideoEncoderSession videoEncoderSession = new VideoEncoderSession(encoderFactory, recorder.mSequentialExecutor, recorder.mExecutor);
                Recorder recorder2 = Recorder.this;
                p1<Encoder> configure = videoEncoderSession.configure(surfaceRequest, timebase, (MediaSpec) recorder2.getObservableData(recorder2.mMediaSpec), Recorder.this.mResolvedEncoderProfiles);
                Recorder.this.mVideoEncoderSession = videoEncoderSession;
                Futures.addCallback(configure, setupVideoTask.new AnonymousClass1(videoEncoderSession), Recorder.this.mSequentialExecutor);
                return;
            }
            Logger.w(Recorder.TAG, "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.isServiced() + " VideoEncoderSession: " + Recorder.this.mVideoEncoderSession + " has been configured with a persistent in-progress recording.");
        }

        public static /* synthetic */ int access$408(SetupVideoTask setupVideoTask) {
            int i11 = setupVideoTask.mRetryCount;
            setupVideoTask.mRetryCount = i11 + 1;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setupVideo(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase) {
            Recorder.this.safeToCloseVideoEncoder().addListener(new Runnable() { // from class: androidx.camera.video.f0
                @Override // java.lang.Runnable
                public final void run() {
                    Recorder.SetupVideoTask.a(Recorder.SetupVideoTask.this, surfaceRequest, timebase);
                }
            }, Recorder.this.mSequentialExecutor);
        }

        public void cancelFailedRetry() {
            if (this.mIsFailedRetryCanceled) {
                return;
            }
            this.mIsFailedRetryCanceled = true;
            ScheduledFuture<?> scheduledFuture = this.mRetryFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.mRetryFuture = null;
            }
        }

        public void start() {
            setupVideo(this.mSurfaceRequest, this.mTimebase);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        Quality quality = Quality.FHD;
        QualitySelector fromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.HD, Quality.SD), FallbackStrategy.higherQualityOrLowerThan(quality));
        DEFAULT_QUALITY_SELECTOR = fromOrderedList;
        VideoSpec build = VideoSpec.builder().setQualitySelector(fromOrderedList).setAspectRatio(-1).build();
        VIDEO_SPEC_DEFAULT = build;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(build).build();
        PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
        DEFAULT_ENCODER_FACTORY = new EncoderFactory() { // from class: androidx.camera.video.j
            @Override // androidx.camera.video.internal.encoder.EncoderFactory
            public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
                return new EncoderImpl(executor, encoderConfig);
            }
        };
        AUDIO_EXECUTOR = CameraXExecutors.newSequentialExecutor(CameraXExecutors.ioExecutor());
        sRetrySetupVideoMaxCount = 3;
        sRetrySetupVideoDelayMs = 1000L;
    }

    public Recorder(@Nullable Executor executor, @NonNull MediaSpec mediaSpec, int i11, @NonNull EncoderFactory encoderFactory, @NonNull EncoderFactory encoderFactory2) {
        this.mEncoderNotUsePersistentInputSurface = DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.mState = State.CONFIGURING;
        this.mNonPendingState = null;
        this.mStreamId = 0;
        this.mActiveRecordingRecord = null;
        this.mPendingRecordingRecord = null;
        this.mLastGeneratedRecordingId = 0L;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mInProgressTransformationInfo = null;
        this.mSourceTransformationInfo = null;
        this.mResolvedEncoderProfiles = null;
        this.mEncodingFutures = new ArrayList();
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mLatestSurface = null;
        this.mActiveSurface = null;
        this.mMediaMuxer = null;
        this.mAudioSource = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        this.mAudioEncoder = null;
        this.mAudioOutputConfig = null;
        this.mAudioState = AudioState.INITIALIZING;
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingVideoBitrate = 0;
        this.mVideoEncoderBitrateRange = null;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mFileSizeLimitInBytes = 0L;
        this.mDurationLimitNs = 0L;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mPendingFirstVideoData = null;
        this.mPendingAudioRingBuffer = new ArrayRingBuffer(60);
        this.mAudioErrorCause = null;
        this.mIsAudioSourceSilenced = false;
        this.mSourceState = VideoOutput.SourceState.INACTIVE;
        this.mSourceNonStreamingTimeout = null;
        this.mNeedsResetBeforeNextStart = false;
        this.mVideoEncoderSessionToRelease = null;
        this.mAudioAmplitude = 0.0d;
        this.mShouldSendResumeEvent = false;
        this.mSetupVideoTask = null;
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mSequentialExecutor = newSequentialExecutor;
        this.mMediaSpec = MutableStateObservable.withInitialState(composeRecorderMediaSpec(mediaSpec));
        this.mVideoCapabilitiesSource = i11;
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mIsRecording = MutableStateObservable.withInitialState(Boolean.FALSE);
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
        this.mVideoEncoderSession = new VideoEncoderSession(encoderFactory, newSequentialExecutor, executor);
    }

    private void clearPendingAudioRingBuffer() {
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            this.mPendingAudioRingBuffer.dequeue();
        }
    }

    @NonNull
    private MediaSpec composeRecorderMediaSpec(@NonNull MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new Consumer() { // from class: androidx.camera.video.k
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    ((VideoSpec.Builder) obj).setAspectRatio(Recorder.VIDEO_SPEC_DEFAULT.getAspectRatio());
                }
            });
        }
        return builder.build();
    }

    private void configureInternal(@NonNull SurfaceRequest surfaceRequest, @NonNull Timebase timebase, boolean z11) {
        if (surfaceRequest.isServiced()) {
            Logger.w(TAG, "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.video.n
            @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
            public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
                Recorder.this.mSourceTransformationInfo = transformationInfo;
            }
        });
        Size resolution = surfaceRequest.getResolution();
        DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
        VideoCapabilities videoCapabilities = getVideoCapabilities(surfaceRequest.getCamera().getCameraInfo());
        Quality findNearestHigherSupportedQualityFor = videoCapabilities.findNearestHigherSupportedQualityFor(resolution, dynamicRange);
        Logger.d(TAG, "Using supported quality of " + findNearestHigherSupportedQualityFor + " for surface size " + resolution);
        if (findNearestHigherSupportedQualityFor != Quality.NONE) {
            VideoValidatedEncoderProfilesProxy profiles = videoCapabilities.getProfiles(findNearestHigherSupportedQualityFor, dynamicRange);
            this.mResolvedEncoderProfiles = profiles;
            if (profiles == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        SetupVideoTask setupVideoTask = this.mSetupVideoTask;
        if (setupVideoTask != null) {
            setupVideoTask.cancelFailedRetry();
        }
        SetupVideoTask setupVideoTask2 = new SetupVideoTask(surfaceRequest, timebase, z11 ? sRetrySetupVideoMaxCount : 0);
        this.mSetupVideoTask = setupVideoTask2;
        setupVideoTask2.start();
    }

    public static /* synthetic */ Object f(final Recorder recorder, final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) {
        recorder.getClass();
        final Consumer consumer = new Consumer() { // from class: androidx.camera.video.i
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.l(Recorder.this, completer, (Throwable) obj);
            }
        };
        recorder.mAudioSource.setAudioSourceCallback(recorder.mSequentialExecutor, new AudioSource.AudioSourceCallback() { // from class: androidx.camera.video.Recorder.4
            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onAmplitudeValue(double d11) {
                Recorder.this.mAudioAmplitude = d11;
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onError(@NonNull Throwable th2) {
                Logger.e(Recorder.TAG, "Error occurred after audio source started.", th2);
                if (th2 instanceof AudioSourceAccessException) {
                    consumer.accept(th2);
                }
            }

            @Override // androidx.camera.video.internal.audio.AudioSource.AudioSourceCallback
            public void onSilenceStateChanged(boolean z11) {
                Recorder recorder2 = Recorder.this;
                if (recorder2.mIsAudioSourceSilenced != z11) {
                    recorder2.mIsAudioSourceSilenced = z11;
                    recorder2.updateInProgressStatusEvent();
                } else {
                    Logger.w(Recorder.TAG, "Audio source silenced transitions to the same state " + z11);
                }
            }
        });
        recorder.mAudioEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.5
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(@NonNull EncodeException encodeException) {
                if (Recorder.this.mAudioErrorCause == null) {
                    consumer.accept(encodeException);
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(@NonNull EncodedData encodedData) {
                Recorder recorder2 = Recorder.this;
                if (recorder2.mAudioState == AudioState.DISABLED) {
                    encodedData.close();
                    throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
                }
                if (recorder2.mMediaMuxer == null) {
                    if (recorder2.mInProgressRecordingStopping) {
                        Logger.d(Recorder.TAG, "Drop audio data since recording is stopping.");
                    } else {
                        recorder2.mPendingAudioRingBuffer.enqueue(new BufferCopiedEncodedData(encodedData));
                        if (Recorder.this.mPendingFirstVideoData != null) {
                            Logger.d(Recorder.TAG, "Received audio data. Starting muxer...");
                            Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                        } else {
                            Logger.d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    }
                    encodedData.close();
                    return;
                }
                try {
                    recorder2.writeAudioData(encodedData, recordingRecord);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                } catch (Throwable th2) {
                    if (encodedData != null) {
                        try {
                            encodedData.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(@NonNull OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }
        }, recorder.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    private void finalizePendingRecording(@NonNull RecordingRecord recordingRecord, int i11, @Nullable Throwable th2) {
        Uri uri = Uri.EMPTY;
        recordingRecord.finalizeRecording(uri);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.of(0L, 0L, AudioStats.of(1, this.mAudioErrorCause, 0.0d)), OutputResults.of(uri), i11, th2));
    }

    @NonNull
    private List<EncodedData> getAudioDataToWriteAndClearCache(long j11) {
        ArrayList arrayList = new ArrayList();
        while (!this.mPendingAudioRingBuffer.isEmpty()) {
            EncodedData dequeue = this.mPendingAudioRingBuffer.dequeue();
            if (dequeue.getPresentationTimeUs() >= j11) {
                arrayList.add(dequeue);
            }
        }
        return arrayList;
    }

    @NonNull
    public static VideoCapabilities getVideoCapabilities(@NonNull CameraInfo cameraInfo) {
        return getVideoCapabilities(cameraInfo, 0);
    }

    private int internalAudioStateToAudioStatsState(@NonNull AudioState audioState) {
        int ordinal = audioState.ordinal();
        if (ordinal == 0 || ordinal == 2) {
            return 1;
        }
        if (ordinal == 3) {
            RecordingRecord recordingRecord = this.mInProgressRecording;
            if (recordingRecord == null || !recordingRecord.isMuted()) {
                return this.mIsAudioSourceSilenced ? 2 : 0;
            }
            return 5;
        }
        if (ordinal == 4) {
            return 3;
        }
        if (ordinal == 5) {
            return 4;
        }
        throw new AssertionError("Invalid internal audio state: " + audioState);
    }

    @NonNull
    private StreamInfo.StreamState internalStateToStreamState(@NonNull State state) {
        return (state == State.RECORDING || (state == State.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    private static boolean isSameRecording(@NonNull Recording recording, @Nullable RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    public static /* synthetic */ void j(Encoder encoder) {
        Logger.d(TAG, "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            notifyEncoderSourceStopped(encoder);
        }
    }

    public static /* synthetic */ void k(Recorder recorder) {
        SurfaceRequest surfaceRequest = recorder.mLatestSurfaceRequest;
        if (surfaceRequest == null) {
            throw new AssertionError("surface request is required to retry initialization.");
        }
        recorder.configureInternal(surfaceRequest, recorder.mVideoSourceTimebase, false);
    }

    public static /* synthetic */ void l(Recorder recorder, CallbackToFutureAdapter.Completer completer, Throwable th2) {
        if (recorder.mAudioErrorCause == null) {
            if (th2 instanceof EncodeException) {
                recorder.setAudioState(AudioState.ERROR_ENCODER);
            } else {
                recorder.setAudioState(AudioState.ERROR_SOURCE);
            }
            recorder.mAudioErrorCause = th2;
            recorder.updateInProgressStatusEvent();
            completer.set(null);
        }
    }

    @NonNull
    @GuardedBy("mLock")
    private RecordingRecord makePendingRecordingActiveLocked(@NonNull State state) {
        boolean z11;
        if (state == State.PENDING_PAUSED) {
            z11 = true;
        } else {
            if (state != State.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z11 = false;
        }
        if (this.mActiveRecordingRecord != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        RecordingRecord recordingRecord = this.mPendingRecordingRecord;
        if (recordingRecord == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.mActiveRecordingRecord = recordingRecord;
        recordingRecord.getRecordingState().addObserver(CameraXExecutors.directExecutor(), new Observable.Observer<Boolean>() { // from class: androidx.camera.video.Recorder.7
            @Override // androidx.camera.core.impl.Observable.Observer
            public void onError(@NonNull Throwable th2) {
                Recorder.this.mIsRecording.setError(th2);
            }

            @Override // androidx.camera.core.impl.Observable.Observer
            public void onNewData(@Nullable Boolean bool) {
                Recorder.this.mIsRecording.setState(bool);
            }
        });
        this.mPendingRecordingRecord = null;
        if (z11) {
            setState(State.PAUSED);
            return recordingRecord;
        }
        setState(State.RECORDING);
        return recordingRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void muteInternal(@NonNull RecordingRecord recordingRecord, boolean z11) {
        AudioSource audioSource;
        if (recordingRecord.isMuted() == z11) {
            return;
        }
        recordingRecord.mute(z11);
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping || (audioSource = this.mAudioSource) == null) {
            return;
        }
        audioSource.mute(z11);
    }

    public static void notifyEncoderSourceStopped(@NonNull Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    public static /* synthetic */ Object o(Recorder recorder, final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) {
        recorder.mVideoEncoder.setEncoderCallback(new EncoderCallback() { // from class: androidx.camera.video.Recorder.3
            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeError(@NonNull EncodeException encodeException) {
                completer.setException(encodeException);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStop() {
                completer.set(null);
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodedData(@NonNull EncodedData encodedData) {
                boolean z11;
                Recorder recorder2 = Recorder.this;
                if (recorder2.mMediaMuxer != null) {
                    try {
                        recorder2.writeVideoData(encodedData, recordingRecord);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (encodedData != null) {
                            try {
                                encodedData.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                if (recorder2.mInProgressRecordingStopping) {
                    Logger.d(Recorder.TAG, "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                EncodedData encodedData2 = recorder2.mPendingFirstVideoData;
                if (encodedData2 != null) {
                    encodedData2.close();
                    Recorder.this.mPendingFirstVideoData = null;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!encodedData.isKeyFrame()) {
                    if (z11) {
                        Logger.d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    Logger.d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    Recorder.this.mVideoEncoder.requestKeyFrame();
                    encodedData.close();
                    return;
                }
                Recorder recorder3 = Recorder.this;
                recorder3.mPendingFirstVideoData = encodedData;
                if (!recorder3.isAudioEnabled() || !Recorder.this.mPendingAudioRingBuffer.isEmpty()) {
                    Logger.d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                    Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                } else if (z11) {
                    Logger.d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                } else {
                    Logger.d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                }
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onOutputConfigUpdate(@NonNull OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }

            @Override // androidx.camera.video.internal.encoder.EncoderCallback
            public void onEncodeStart() {
            }
        }, recorder.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:11:0x00b4, B:32:0x0025, B:34:0x0029, B:36:0x002f, B:39:0x003a, B:42:0x0045, B:43:0x0052, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:49:0x0084, B:51:0x0088, B:53:0x008e, B:56:0x0096, B:58:0x009f, B:60:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0019, B:11:0x00b4, B:32:0x0025, B:34:0x0029, B:36:0x002f, B:39:0x003a, B:42:0x0045, B:43:0x0052, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:49:0x0084, B:51:0x0088, B:53:0x008e, B:56:0x0096, B:58:0x009f, B:60:0x00a3, B:63:0x00dd, B:64:0x00e4), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onRecordingFinalized(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onRecordingFinalized(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    private void onResetVideo() {
        boolean z11;
        SurfaceRequest surfaceRequest;
        synchronized (this.mLock) {
            try {
                switch (this.mState.ordinal()) {
                    case 1:
                    case 2:
                        updateNonPendingState(State.CONFIGURING);
                        z11 = true;
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (isPersistentRecordingInProgress()) {
                            z11 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        setState(State.CONFIGURING);
                        z11 = true;
                        break;
                    default:
                        z11 = true;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mNeedsResetBeforeNextStart = false;
        if (!z11 || (surfaceRequest = this.mLatestSurfaceRequest) == null || surfaceRequest.isServiced()) {
            return;
        }
        configureInternal(this.mLatestSurfaceRequest, this.mVideoSourceTimebase, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceRequestedInternal(@NonNull SurfaceRequest surfaceRequest, @NonNull Timebase timebase) {
        SurfaceRequest surfaceRequest2 = this.mLatestSurfaceRequest;
        if (surfaceRequest2 != null && !surfaceRequest2.isServiced()) {
            this.mLatestSurfaceRequest.willNotProvideSurface();
        }
        this.mLatestSurfaceRequest = surfaceRequest;
        this.mVideoSourceTimebase = timebase;
        configureInternal(surfaceRequest, timebase, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseInternal(@NonNull RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.pause();
        }
        this.mVideoEncoder.pause();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    @NonNull
    private PendingRecording prepareRecordingInternal(@NonNull Context context, @NonNull OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    private void releaseCurrentAudioSource() {
        final AudioSource audioSource = this.mAudioSource;
        if (audioSource == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.mAudioSource = null;
        Logger.d(TAG, String.format("Releasing audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Futures.addCallback(audioSource.release(), new FutureCallback<Void>() { // from class: androidx.camera.video.Recorder.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Logger.d(Recorder.TAG, String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r22) {
                Logger.d(Recorder.TAG, String.format("Released audio source successfully: 0x%x", Integer.valueOf(audioSource.hashCode())));
            }
        }, CameraXExecutors.directExecutor());
    }

    private void reset() {
        if (this.mAudioEncoder != null) {
            Logger.d(TAG, "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        setAudioState(AudioState.INITIALIZING);
        resetVideo();
    }

    private void resetVideo() {
        if (this.mVideoEncoder != null) {
            Logger.d(TAG, "Releasing video encoder.");
            tryReleaseVideoEncoder();
        }
        onResetVideo();
    }

    @GuardedBy("mLock")
    private void restoreNonPendingState() {
        if (PENDING_STATES.contains(this.mState)) {
            setState(this.mNonPendingState);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.mState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resumeInternal(@NonNull RecordingRecord recordingRecord) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        if (isAudioEnabled()) {
            this.mAudioEncoder.start();
        }
        Encoder encoder = this.mVideoEncoder;
        if (encoder == null) {
            this.mShouldSendResumeEvent = true;
            return;
        }
        encoder.start();
        RecordingRecord recordingRecord2 = this.mInProgressRecording;
        recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public p1<Void> safeToCloseVideoEncoder() {
        Logger.d(TAG, "Try to safely release video encoder: " + this.mVideoEncoder);
        return this.mVideoEncoderSession.signalTermination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static ScheduledFuture<?> scheduleTask(@NonNull final Runnable runnable, @NonNull final Executor executor, long j11, TimeUnit timeUnit) {
        return CameraXExecutors.mainThreadExecutor().schedule(new Runnable() { // from class: androidx.camera.video.b
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        }, j11, timeUnit);
    }

    @GuardedBy("mLock")
    private void setStreamId(int i11) {
        if (this.mStreamId == i11) {
            return;
        }
        Logger.d(TAG, "Transitioning streamId: " + this.mStreamId + " --> " + i11);
        this.mStreamId = i11;
        this.mStreamInfo.setState(StreamInfo.of(i11, internalStateToStreamState(this.mState), this.mInProgressTransformationInfo));
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private void setupAudio(@NonNull RecordingRecord recordingRecord) throws AudioSourceAccessException, InvalidConfigException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        AudioMimeInfo resolveAudioMimeInfo = AudioConfigUtil.resolveAudioMimeInfo(mediaSpec, this.mResolvedEncoderProfiles);
        Timebase timebase = Timebase.UPTIME;
        AudioSettings resolveAudioSettings = AudioConfigUtil.resolveAudioSettings(resolveAudioMimeInfo, mediaSpec.getAudioSpec());
        if (this.mAudioSource != null) {
            releaseCurrentAudioSource();
        }
        AudioSource audioSource = setupAudioSource(recordingRecord, resolveAudioSettings);
        this.mAudioSource = audioSource;
        Logger.d(TAG, String.format("Set up new audio source: 0x%x", Integer.valueOf(audioSource.hashCode())));
        Encoder createEncoder = this.mAudioEncoderFactory.createEncoder(this.mExecutor, AudioConfigUtil.resolveAudioEncoderConfig(resolveAudioMimeInfo, timebase, resolveAudioSettings, mediaSpec.getAudioSpec()));
        this.mAudioEncoder = createEncoder;
        Encoder.EncoderInput input = createEncoder.getInput();
        if (!(input instanceof Encoder.ByteBufferInput)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    private AudioSource setupAudioSource(@NonNull RecordingRecord recordingRecord, @NonNull AudioSettings audioSettings) throws AudioSourceAccessException {
        return recordingRecord.performOneTimeAudioSourceCreation(audioSettings, AUDIO_EXECUTOR);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void startInternal(@androidx.annotation.NonNull androidx.camera.video.Recorder.RecordingRecord r9) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.startInternal(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    private void startRecording(@NonNull RecordingRecord recordingRecord, boolean z11) {
        startInternal(recordingRecord);
        if (z11) {
            pauseInternal(recordingRecord);
        }
    }

    private static int supportedMuxerFormatOrDefaultFrom(@Nullable VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy, int i11) {
        if (videoValidatedEncoderProfilesProxy != null) {
            int recommendedFileFormat = videoValidatedEncoderProfilesProxy.getRecommendedFileFormat();
            if (recommendedFileFormat == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (recommendedFileFormat == 2) {
                return 0;
            }
            if (recommendedFileFormat == 9) {
                return 1;
            }
        }
        return i11;
    }

    private void tryReleaseVideoEncoder() {
        VideoEncoderSession videoEncoderSession = this.mVideoEncoderSessionToRelease;
        if (videoEncoderSession == null) {
            safeToCloseVideoEncoder();
            return;
        }
        Preconditions.checkState(videoEncoderSession.getVideoEncoder() == this.mVideoEncoder);
        Logger.d(TAG, "Releasing video encoder: " + this.mVideoEncoder);
        this.mVideoEncoderSessionToRelease.terminateNow();
        this.mVideoEncoderSessionToRelease = null;
        this.mVideoEncoder = null;
        this.mVideoOutputConfig = null;
        setLatestSurface(null);
    }

    private void updateEncoderCallbacks(@NonNull final RecordingRecord recordingRecord, boolean z11) {
        if (!this.mEncodingFutures.isEmpty()) {
            p1 allAsList = Futures.allAsList(this.mEncodingFutures);
            if (!allAsList.isDone()) {
                allAsList.cancel(true);
            }
            this.mEncodingFutures.clear();
        }
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.c
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Recorder.o(Recorder.this, recordingRecord, completer);
            }
        }));
        if (isAudioEnabled() && !z11) {
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.d
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Recorder.f(Recorder.this, recordingRecord, completer);
                }
            }));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() { // from class: androidx.camera.video.Recorder.6
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Preconditions.checkState(Recorder.this.mInProgressRecording != null, "In-progress recording shouldn't be null");
                if (Recorder.this.mInProgressRecording.isPersistent()) {
                    return;
                }
                Logger.d(Recorder.TAG, "Encodings end with error: " + th2);
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mMediaMuxer == null ? 8 : 6, th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable List<Void> list) {
                Logger.d(Recorder.TAG, "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, recorder.mRecordingStopErrorCause);
            }
        }, CameraXExecutors.directExecutor());
    }

    @GuardedBy("mLock")
    private void updateNonPendingState(@NonNull State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.mState);
        }
        if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        }
        if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(state), this.mInProgressTransformationInfo));
        }
    }

    public void finalizeInProgressRecording(int i11, @Nullable Throwable th2) {
        if (this.mInProgressRecording == null) {
            throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
        }
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.mMediaMuxer.release();
            } catch (IllegalStateException e11) {
                Logger.e(TAG, "MediaMuxer failed to stop or release with error: " + e11.getMessage());
                if (i11 == 0) {
                    i11 = 1;
                }
            }
            this.mMediaMuxer = null;
        } else if (i11 == 0) {
            i11 = 8;
        }
        this.mInProgressRecording.finalizeRecording(this.mOutputUri);
        OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
        RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
        OutputResults of2 = OutputResults.of(this.mOutputUri);
        this.mInProgressRecording.updateVideoRecordEvent(i11 == 0 ? VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, of2) : VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, of2, i11, th2));
        RecordingRecord recordingRecord = this.mInProgressRecording;
        this.mInProgressRecording = null;
        this.mInProgressRecordingStopping = false;
        this.mAudioTrackIndex = null;
        this.mVideoTrackIndex = null;
        this.mEncodingFutures.clear();
        this.mOutputUri = Uri.EMPTY;
        this.mRecordingBytes = 0L;
        this.mRecordingDurationNs = 0L;
        this.mFirstRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mFirstRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingVideoDataTimeUs = Long.MAX_VALUE;
        this.mPreviousRecordingAudioDataTimeUs = Long.MAX_VALUE;
        this.mRecordingStopError = 1;
        this.mRecordingStopErrorCause = null;
        this.mAudioErrorCause = null;
        this.mAudioAmplitude = 0.0d;
        clearPendingAudioRingBuffer();
        setInProgressTransformationInfo(null);
        int ordinal = this.mAudioState.ordinal();
        if (ordinal == 1) {
            throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
        }
        if (ordinal == 2 || ordinal == 3) {
            setAudioState(AudioState.IDLING);
            this.mAudioSource.stop();
        } else if (ordinal == 4 || ordinal == 5) {
            setAudioState(AudioState.INITIALIZING);
        }
        onRecordingFinalized(recordingRecord);
    }

    public int getAspectRatio() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getAspectRatio();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getAudioSource() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getSource();
    }

    @Nullable
    public Executor getExecutor() {
        return this.mUserProvidedExecutor;
    }

    @NonNull
    public RecordingStats getInProgressRecordingStats() {
        return RecordingStats.of(this.mRecordingDurationNs, this.mRecordingBytes, AudioStats.of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause, this.mAudioAmplitude));
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public VideoCapabilities getMediaCapabilities(@NonNull CameraInfo cameraInfo) {
        return getVideoCapabilities(cameraInfo, this.mVideoCapabilitiesSource);
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    public <T> T getObservableData(@NonNull StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @NonNull
    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    public int getTargetVideoEncodingBitRate() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getBitrate().getLower().intValue();
    }

    public int getVideoCapabilitiesSource() {
        return this.mVideoCapabilitiesSource;
    }

    public boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ENABLED;
    }

    public boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    public boolean isPersistentRecordingInProgress() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        return recordingRecord != null && recordingRecord.isPersistent();
    }

    @Override // androidx.camera.video.VideoOutput
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Observable<Boolean> isSourceStreamRequired() {
        return this.mIsRecording;
    }

    public void mute(@NonNull Recording recording, final boolean z11) {
        synchronized (this.mLock) {
            try {
                if (isSameRecording(recording, this.mPendingRecordingRecord) || isSameRecording(recording, this.mActiveRecordingRecord)) {
                    final RecordingRecord recordingRecord = isSameRecording(recording, this.mPendingRecordingRecord) ? this.mPendingRecordingRecord : this.mActiveRecordingRecord;
                    this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            Recorder.this.muteInternal(recordingRecord, z11);
                        }
                    });
                } else {
                    Logger.d(TAG, "mute() called on a recording that is no longer active: " + recording.getOutputOptions());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:5:0x000c, B:9:0x0089, B:26:0x0011, B:27:0x001d, B:30:0x0023, B:31:0x002a, B:33:0x002e, B:35:0x003c, B:36:0x0054, B:38:0x0058, B:41:0x0061, B:43:0x0067, B:44:0x0073, B:46:0x007f), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConfigured() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onConfigured():void");
    }

    public void onEncoderSetupError(@Nullable Throwable th2) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            try {
                recordingRecord = null;
                switch (this.mState) {
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                        this.mPendingRecordingRecord = null;
                        recordingRecord = recordingRecord2;
                    case CONFIGURING:
                        setStreamId(-1);
                        setState(State.ERROR);
                        break;
                    case IDLING:
                    case RECORDING:
                    case PAUSED:
                    case STOPPING:
                    case RESETTING:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th2);
        }
    }

    public void onInProgressRecordingInternalError(@NonNull RecordingRecord recordingRecord, int i11, @Nullable Throwable th2) {
        Throwable th3;
        if (recordingRecord != this.mInProgressRecording) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.mLock) {
            try {
                try {
                    boolean z11 = false;
                    switch (this.mState) {
                        case CONFIGURING:
                        case IDLING:
                        case ERROR:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                        case RECORDING:
                        case PAUSED:
                            try {
                                setState(State.STOPPING);
                                z11 = true;
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        case PENDING_RECORDING:
                        case PENDING_PAUSED:
                        case STOPPING:
                        case RESETTING:
                            if (recordingRecord != this.mActiveRecordingRecord) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z11) {
                                stopInternal(recordingRecord, -1L, i11, th2);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSourceStateChanged(@NonNull final VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.f
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.this.onSourceStateChangedInternal(sourceState);
            }
        });
    }

    public void onSourceStateChangedInternal(@NonNull VideoOutput.SourceState sourceState) {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 == sourceState) {
            Logger.d(TAG, "Video source transitions to the same state: " + sourceState);
            return;
        }
        Logger.d(TAG, "Video source has transitioned to state: " + sourceState);
        if (sourceState != VideoOutput.SourceState.INACTIVE) {
            if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = this.mSourceNonStreamingTimeout) == null || !scheduledFuture.cancel(false) || (encoder = this.mVideoEncoder) == null) {
                return;
            }
            notifyEncoderSourceStopped(encoder);
            return;
        }
        if (this.mActiveSurface == null) {
            SetupVideoTask setupVideoTask = this.mSetupVideoTask;
            if (setupVideoTask != null) {
                setupVideoTask.cancelFailedRetry();
                this.mSetupVideoTask = null;
            }
            requestReset(4, null, false);
            return;
        }
        this.mNeedsResetBeforeNextStart = true;
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord == null || recordingRecord.isPersistent()) {
            return;
        }
        onInProgressRecordingInternalError(this.mInProgressRecording, 4, null);
    }

    @Override // androidx.camera.video.VideoOutput
    public void onSurfaceRequested(@NonNull SurfaceRequest surfaceRequest) {
        onSurfaceRequested(surfaceRequest, Timebase.UPTIME);
    }

    public void onVideoEncoderReady(@NonNull final VideoEncoderSession videoEncoderSession) {
        Encoder videoEncoder = videoEncoderSession.getVideoEncoder();
        this.mVideoEncoder = videoEncoder;
        this.mVideoEncoderBitrateRange = ((VideoEncoderInfo) videoEncoder.getEncoderInfo()).getSupportedBitrateRange();
        this.mFirstRecordingVideoBitrate = this.mVideoEncoder.getConfiguredBitrate();
        Surface activeSurface = videoEncoderSession.getActiveSurface();
        this.mActiveSurface = activeSurface;
        setLatestSurface(activeSurface);
        videoEncoderSession.setOnSurfaceUpdateListener(this.mSequentialExecutor, new Encoder.SurfaceInput.OnSurfaceUpdateListener() { // from class: androidx.camera.video.p
            @Override // androidx.camera.video.internal.encoder.Encoder.SurfaceInput.OnSurfaceUpdateListener
            public final void onSurfaceUpdate(Surface surface) {
                Recorder.this.setLatestSurface(surface);
            }
        });
        Futures.addCallback(videoEncoderSession.getReadyToReleaseFuture(), new FutureCallback<Encoder>() { // from class: androidx.camera.video.Recorder.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Logger.d(Recorder.TAG, "Error in ReadyToReleaseFuture: " + th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Encoder encoder) {
                Encoder encoder2;
                Logger.d(Recorder.TAG, "VideoEncoder can be released: " + encoder);
                if (encoder == null) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture = Recorder.this.mSourceNonStreamingTimeout;
                if (scheduledFuture != null && scheduledFuture.cancel(false) && (encoder2 = Recorder.this.mVideoEncoder) != null && encoder2 == encoder) {
                    Recorder.notifyEncoderSourceStopped(encoder2);
                }
                Recorder recorder = Recorder.this;
                recorder.mVideoEncoderSessionToRelease = videoEncoderSession;
                recorder.setLatestSurface(null);
                Recorder recorder2 = Recorder.this;
                recorder2.requestReset(4, null, recorder2.isPersistentRecordingInProgress());
            }
        }, this.mSequentialExecutor);
    }

    public void pause(@NonNull Recording recording) {
        synchronized (this.mLock) {
            try {
                if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                    Logger.d(TAG, "pause() called on a recording that is no longer active: " + recording.getOutputOptions());
                    return;
                }
                int ordinal = this.mState.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        setState(State.PENDING_PAUSED);
                    } else if (ordinal != 3) {
                        if (ordinal == 4) {
                            setState(State.PAUSED);
                            final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                            this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Recorder.this.pauseInternal(recordingRecord);
                                }
                            });
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Called pause() from invalid state: " + this.mState);
            } finally {
            }
        }
    }

    @NonNull
    public PendingRecording prepareRecording(@NonNull Context context, @NonNull FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void requestReset(int i11, @Nullable Throwable th2, boolean z11) {
        boolean z12;
        boolean z13;
        synchronized (this.mLock) {
            try {
                z12 = true;
                z13 = false;
                switch (this.mState) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        updateNonPendingState(State.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        Preconditions.checkState(this.mInProgressRecording != null, "In-progress recording shouldn't be null when in state " + this.mState);
                        if (this.mActiveRecordingRecord != this.mInProgressRecording) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!isPersistentRecordingInProgress()) {
                            setState(State.RESETTING);
                            z13 = true;
                            z12 = false;
                        }
                        break;
                    case STOPPING:
                        setState(State.RESETTING);
                        z12 = false;
                        break;
                    case RESETTING:
                    default:
                        z12 = false;
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z12) {
            if (z13) {
                stopInternal(this.mInProgressRecording, -1L, i11, th2);
            }
        } else if (z11) {
            resetVideo();
        } else {
            reset();
        }
    }

    public void resume(@NonNull Recording recording) {
        synchronized (this.mLock) {
            try {
                if (!isSameRecording(recording, this.mPendingRecordingRecord) && !isSameRecording(recording, this.mActiveRecordingRecord)) {
                    Logger.d(TAG, "resume() called on a recording that is no longer active: " + recording.getOutputOptions());
                    return;
                }
                int ordinal = this.mState.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 5) {
                        setState(State.RECORDING);
                        final RecordingRecord recordingRecord = this.mActiveRecordingRecord;
                        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                Recorder.this.resumeInternal(recordingRecord);
                            }
                        });
                    } else if (ordinal == 2) {
                        setState(State.PENDING_RECORDING);
                    } else if (ordinal != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Called resume() from invalid state: " + this.mState);
            } finally {
            }
        }
    }

    public void setAudioState(@NonNull AudioState audioState) {
        Logger.d(TAG, "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    public void setInProgressTransformationInfo(@Nullable SurfaceRequest.TransformationInfo transformationInfo) {
        Logger.d(TAG, "Update stream transformation info: " + transformationInfo);
        this.mInProgressTransformationInfo = transformationInfo;
        synchronized (this.mLock) {
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState), transformationInfo));
        }
    }

    public void setLatestSurface(@Nullable Surface surface) {
        int hashCode;
        if (this.mLatestSurface == surface) {
            return;
        }
        this.mLatestSurface = surface;
        synchronized (this.mLock) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                hashCode = 0;
            }
            setStreamId(hashCode);
        }
    }

    @GuardedBy("mLock")
    public void setState(@NonNull State state) {
        if (this.mState == state) {
            throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
        }
        Logger.d(TAG, "Transitioning Recorder internal state: " + this.mState + " --> " + state);
        Set<State> set = PENDING_STATES;
        StreamInfo.StreamState streamState = null;
        if (set.contains(state)) {
            if (!set.contains(this.mState)) {
                if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.mState);
                }
                State state2 = this.mState;
                this.mNonPendingState = state2;
                streamState = internalStateToStreamState(state2);
            }
        } else if (this.mNonPendingState != null) {
            this.mNonPendingState = null;
        }
        this.mState = state;
        if (streamState == null) {
            streamState = internalStateToStreamState(state);
        }
        this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, streamState, this.mInProgressTransformationInfo));
    }

    public void setupAndStartMediaMuxer(@NonNull RecordingRecord recordingRecord) {
        if (this.mMediaMuxer != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (isAudioEnabled() && this.mPendingAudioRingBuffer.isEmpty()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.mPendingFirstVideoData = null;
            List<EncodedData> audioDataToWriteAndClearCache = getAudioDataToWriteAndClearCache(encodedData.getPresentationTimeUs());
            long size = encodedData.size();
            Iterator<EncodedData> it = audioDataToWriteAndClearCache.iterator();
            while (it.hasNext()) {
                size += it.next().size();
            }
            long j11 = this.mFileSizeLimitInBytes;
            if (j11 != 0 && size > j11) {
                Logger.d(TAG, String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
                onInProgressRecordingInternalError(recordingRecord, 2, null);
                encodedData.close();
                return;
            }
            try {
                MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
                MediaMuxer performOneTimeMediaMuxerCreation = recordingRecord.performOneTimeMediaMuxerCreation(mediaSpec.getOutputFormat() == -1 ? supportedMuxerFormatOrDefaultFrom(this.mResolvedEncoderProfiles, MediaSpec.outputFormatToMuxerFormat(MEDIA_SPEC_DEFAULT.getOutputFormat())) : MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat()), new Consumer() { // from class: androidx.camera.video.q
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.this.mOutputUri = (Uri) obj;
                    }
                });
                SurfaceRequest.TransformationInfo transformationInfo = this.mSourceTransformationInfo;
                if (transformationInfo != null) {
                    setInProgressTransformationInfo(transformationInfo);
                    performOneTimeMediaMuxerCreation.setOrientationHint(transformationInfo.getRotationDegrees());
                }
                Location location = recordingRecord.getOutputOptions().getLocation();
                if (location != null) {
                    try {
                        Pair<Double, Double> adjustGeoLocation = CorrectNegativeLatLongForMediaMuxer.adjustGeoLocation(location.getLatitude(), location.getLongitude());
                        performOneTimeMediaMuxerCreation.setLocation((float) ((Double) adjustGeoLocation.first).doubleValue(), (float) ((Double) adjustGeoLocation.second).doubleValue());
                    } catch (IllegalArgumentException e11) {
                        performOneTimeMediaMuxerCreation.release();
                        onInProgressRecordingInternalError(recordingRecord, 5, e11);
                        encodedData.close();
                        return;
                    }
                }
                this.mVideoTrackIndex = Integer.valueOf(performOneTimeMediaMuxerCreation.addTrack(this.mVideoOutputConfig.getMediaFormat()));
                if (isAudioEnabled()) {
                    this.mAudioTrackIndex = Integer.valueOf(performOneTimeMediaMuxerCreation.addTrack(this.mAudioOutputConfig.getMediaFormat()));
                }
                performOneTimeMediaMuxerCreation.start();
                this.mMediaMuxer = performOneTimeMediaMuxerCreation;
                writeVideoData(encodedData, recordingRecord);
                Iterator<EncodedData> it2 = audioDataToWriteAndClearCache.iterator();
                while (it2.hasNext()) {
                    writeAudioData(it2.next(), recordingRecord);
                }
                encodedData.close();
            } catch (IOException e12) {
                onInProgressRecordingInternalError(recordingRecord, 5, e12);
                encodedData.close();
            }
        } catch (Throwable th2) {
            if (encodedData != null) {
                try {
                    encodedData.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NonNull
    public Recording start(@NonNull PendingRecording pendingRecording) {
        long j11;
        RecordingRecord recordingRecord;
        int i11;
        RecordingRecord recordingRecord2;
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        synchronized (this.mLock) {
            try {
                j11 = this.mLastGeneratedRecordingId + 1;
                this.mLastGeneratedRecordingId = j11;
                recordingRecord = null;
                i11 = 0;
                switch (this.mState) {
                    case CONFIGURING:
                    case IDLING:
                    case STOPPING:
                    case RESETTING:
                    case ERROR:
                        State state = this.mState;
                        State state2 = State.IDLING;
                        if (state == state2) {
                            Preconditions.checkState(this.mActiveRecordingRecord == null && this.mPendingRecordingRecord == null, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            RecordingRecord from = RecordingRecord.from(pendingRecording, j11);
                            from.initializeRecording(pendingRecording.getApplicationContext());
                            this.mPendingRecordingRecord = from;
                            State state3 = this.mState;
                            if (state3 == state2) {
                                setState(State.PENDING_RECORDING);
                                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Recorder.this.tryServicePendingRecording();
                                    }
                                });
                            } else if (state3 == State.ERROR) {
                                setState(State.PENDING_RECORDING);
                                this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.m
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Recorder.k(Recorder.this);
                                    }
                                });
                            } else {
                                setState(State.PENDING_RECORDING);
                            }
                            e = null;
                            break;
                        } catch (IOException e11) {
                            e = e11;
                            i11 = 5;
                            break;
                        }
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        recordingRecord2 = (RecordingRecord) Preconditions.checkNotNull(this.mPendingRecordingRecord);
                        recordingRecord = recordingRecord2;
                        e = null;
                        break;
                    case RECORDING:
                    case PAUSED:
                        recordingRecord2 = this.mActiveRecordingRecord;
                        recordingRecord = recordingRecord2;
                        e = null;
                        break;
                    default:
                        e = null;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (recordingRecord != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i11 == 0) {
            return Recording.from(pendingRecording, j11);
        }
        Logger.e(TAG, "Recording was started when the Recorder had encountered error " + e);
        finalizePendingRecording(RecordingRecord.from(pendingRecording, j11), i11, e);
        return Recording.createFinalizedFrom(pendingRecording, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void stop(@androidx.annotation.NonNull androidx.camera.video.Recording r13, int r14, @androidx.annotation.Nullable java.lang.Throwable r15) {
        /*
            r12 = this;
            java.lang.Object r1 = r12.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L6e
            boolean r0 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L34
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r0 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L34
            java.lang.String r14 = "Recorder"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r15.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            r15.append(r0)     // Catch: java.lang.Throwable -> L2f
            androidx.camera.video.OutputOptions r13 = r13.getOutputOptions()     // Catch: java.lang.Throwable -> L2f
            r15.append(r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L2f
            androidx.camera.core.Logger.d(r14, r13)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r0 = move-exception
            r13 = r0
            r6 = r12
            goto La9
        L34:
            androidx.camera.video.Recorder$State r0 = r12.mState     // Catch: java.lang.Throwable -> L6e
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            switch(r0) {
                case 0: goto La0;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto La0;
                case 4: goto L4c;
                case 5: goto L4c;
                case 6: goto L42;
                case 7: goto L42;
                default: goto L3e;
            }
        L3e:
            r6 = r12
            r10 = r14
            r11 = r15
            goto L85
        L42:
            androidx.camera.video.Recorder$RecordingRecord r0 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L2f
            boolean r13 = isSameRecording(r13, r0)     // Catch: java.lang.Throwable -> L2f
            androidx.core.util.Preconditions.checkState(r13)     // Catch: java.lang.Throwable -> L2f
            goto L3e
        L4c:
            androidx.camera.video.Recorder$State r13 = androidx.camera.video.Recorder.State.STOPPING     // Catch: java.lang.Throwable -> L6e
            r12.setState(r13)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L6e
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6e
            long r8 = r13.toMicros(r3)     // Catch: java.lang.Throwable -> L6e
            androidx.camera.video.Recorder$RecordingRecord r7 = r12.mActiveRecordingRecord     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r13 = r12.mSequentialExecutor     // Catch: java.lang.Throwable -> L6e
            androidx.camera.video.t r5 = new androidx.camera.video.t     // Catch: java.lang.Throwable -> L6e
            r6 = r12
            r10 = r14
            r11 = r15
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
            r13.execute(r5)     // Catch: java.lang.Throwable -> L6b
            goto L85
        L6b:
            r0 = move-exception
        L6c:
            r13 = r0
            goto La9
        L6e:
            r0 = move-exception
            r6 = r12
            goto L6c
        L71:
            r6 = r12
            r10 = r14
            r11 = r15
            androidx.camera.video.Recorder$RecordingRecord r14 = r6.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L6b
            boolean r13 = isSameRecording(r13, r14)     // Catch: java.lang.Throwable -> L6b
            androidx.core.util.Preconditions.checkState(r13)     // Catch: java.lang.Throwable -> L6b
            androidx.camera.video.Recorder$RecordingRecord r13 = r6.mPendingRecordingRecord     // Catch: java.lang.Throwable -> L6b
            r6.mPendingRecordingRecord = r2     // Catch: java.lang.Throwable -> L6b
            r12.restoreNonPendingState()     // Catch: java.lang.Throwable -> L6b
            r2 = r13
        L85:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L9f
            r13 = 10
            if (r10 != r13) goto L93
            java.lang.String r13 = "Recorder"
            java.lang.String r14 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            androidx.camera.core.Logger.e(r13, r14)
        L93:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Recording was stopped before any data could be produced."
            r13.<init>(r14, r11)
            r14 = 8
            r12.finalizePendingRecording(r2, r14, r13)
        L9f:
            return
        La0:
            r6 = r12
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r14 = "Calling stop() while idling or initializing is invalid."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L6b
            throw r13     // Catch: java.lang.Throwable -> L6b
        La9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.stop(androidx.camera.video.Recording, int, java.lang.Throwable):void");
    }

    public void stopInternal(@NonNull RecordingRecord recordingRecord, long j11, int i11, @Nullable Throwable th2) {
        if (this.mInProgressRecording != recordingRecord || this.mInProgressRecordingStopping) {
            return;
        }
        this.mInProgressRecordingStopping = true;
        this.mRecordingStopError = i11;
        this.mRecordingStopErrorCause = th2;
        if (isAudioEnabled()) {
            clearPendingAudioRingBuffer();
            this.mAudioEncoder.stop(j11);
        }
        EncodedData encodedData = this.mPendingFirstVideoData;
        if (encodedData != null) {
            encodedData.close();
            this.mPendingFirstVideoData = null;
        }
        if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
            final Encoder encoder = this.mVideoEncoder;
            this.mSourceNonStreamingTimeout = scheduleTask(new Runnable() { // from class: androidx.camera.video.s
                @Override // java.lang.Runnable
                public final void run() {
                    Recorder.j(Encoder.this);
                }
            }, this.mSequentialExecutor, 1000L, TimeUnit.MILLISECONDS);
        } else {
            notifyEncoderSourceStopped(this.mVideoEncoder);
        }
        this.mVideoEncoder.stop(j11);
    }

    public void tryServicePendingRecording() {
        boolean z11;
        RecordingRecord recordingRecord;
        int i11;
        RecordingRecord recordingRecord2;
        Throwable th2;
        synchronized (this.mLock) {
            try {
                int ordinal = this.mState.ordinal();
                boolean z12 = true;
                z11 = false;
                recordingRecord = null;
                if (ordinal == 1) {
                    z12 = false;
                } else if (ordinal != 2) {
                    i11 = 0;
                    recordingRecord2 = null;
                    th2 = recordingRecord2;
                }
                if (this.mActiveRecordingRecord == null && !this.mNeedsResetBeforeNextStart) {
                    if (this.mSourceState == VideoOutput.SourceState.INACTIVE) {
                        recordingRecord2 = this.mPendingRecordingRecord;
                        this.mPendingRecordingRecord = null;
                        restoreNonPendingState();
                        i11 = 4;
                        z11 = z12;
                        th2 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
                    } else if (this.mVideoEncoder != null) {
                        i11 = 0;
                        z11 = z12;
                        th2 = null;
                        recordingRecord = makePendingRecordingActiveLocked(this.mState);
                        recordingRecord2 = null;
                    }
                }
                i11 = 0;
                recordingRecord2 = null;
                z11 = z12;
                th2 = recordingRecord2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (recordingRecord != null) {
            startRecording(recordingRecord, z11);
        } else if (recordingRecord2 != null) {
            finalizePendingRecording(recordingRecord2, i11, th2);
        }
    }

    public void updateInProgressStatusEvent() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()));
        }
    }

    public void writeAudioData(@NonNull EncodedData encodedData, @NonNull RecordingRecord recordingRecord) {
        long size = this.mRecordingBytes + encodedData.size();
        long j11 = this.mFileSizeLimitInBytes;
        if (j11 != 0 && size > j11) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j12 = this.mFirstRecordingAudioDataTimeUs;
        if (j12 == Long.MAX_VALUE) {
            this.mFirstRecordingAudioDataTimeUs = presentationTimeUs;
            Logger.d(TAG, String.format("First audio time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingAudioDataTimeUs)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(presentationTimeUs - Math.min(this.mFirstRecordingVideoDataTimeUs, j12));
            Preconditions.checkState(this.mPreviousRecordingAudioDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(presentationTimeUs - this.mPreviousRecordingAudioDataTimeUs);
            long j13 = this.mDurationLimitNs;
            if (j13 != 0 && nanos2 > j13) {
                Logger.d(TAG, String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.mDurationLimitNs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
        }
        this.mMediaMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.mRecordingBytes = size;
        this.mPreviousRecordingAudioDataTimeUs = presentationTimeUs;
    }

    public void writeVideoData(@NonNull EncodedData encodedData, @NonNull RecordingRecord recordingRecord) {
        if (this.mVideoTrackIndex == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = this.mRecordingBytes + encodedData.size();
        long j11 = this.mFileSizeLimitInBytes;
        long j12 = 0;
        if (j11 != 0 && size > j11) {
            Logger.d(TAG, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)));
            onInProgressRecordingInternalError(recordingRecord, 2, null);
            return;
        }
        long presentationTimeUs = encodedData.getPresentationTimeUs();
        long j13 = this.mFirstRecordingVideoDataTimeUs;
        if (j13 == Long.MAX_VALUE) {
            this.mFirstRecordingVideoDataTimeUs = presentationTimeUs;
            Logger.d(TAG, String.format("First video time: %d (%s)", Long.valueOf(presentationTimeUs), DebugUtils.readableUs(this.mFirstRecordingVideoDataTimeUs)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            j12 = timeUnit.toNanos(presentationTimeUs - Math.min(j13, this.mFirstRecordingAudioDataTimeUs));
            Preconditions.checkState(this.mPreviousRecordingVideoDataTimeUs != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos = timeUnit.toNanos(presentationTimeUs - this.mPreviousRecordingVideoDataTimeUs) + j12;
            long j14 = this.mDurationLimitNs;
            if (j14 != 0 && nanos > j14) {
                Logger.d(TAG, String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos), Long.valueOf(this.mDurationLimitNs)));
                onInProgressRecordingInternalError(recordingRecord, 9, null);
                return;
            }
        }
        this.mMediaMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
        this.mRecordingBytes = size;
        this.mRecordingDurationNs = j12;
        this.mPreviousRecordingVideoDataTimeUs = presentationTimeUs;
        updateInProgressStatusEvent();
    }

    @NonNull
    public static VideoCapabilities getVideoCapabilities(@NonNull CameraInfo cameraInfo, int i11) {
        return new RecorderVideoCapabilities(i11, (CameraInfoInternal) cameraInfo, VideoEncoderInfoImpl.FINDER);
    }

    @Override // androidx.camera.video.VideoOutput
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onSurfaceRequested(@NonNull final SurfaceRequest surfaceRequest, @NonNull final Timebase timebase) {
        synchronized (this.mLock) {
            try {
                Logger.d(TAG, "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
                if (this.mState == State.ERROR) {
                    setState(State.CONFIGURING);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mSequentialExecutor.execute(new Runnable() { // from class: androidx.camera.video.e
            @Override // java.lang.Runnable
            public final void run() {
                Recorder.this.onSurfaceRequestedInternal(surfaceRequest, timebase);
            }
        });
    }

    @NonNull
    @RequiresApi(26)
    public PendingRecording prepareRecording(@NonNull Context context, @NonNull FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        if (Build.VERSION.SDK_INT >= 26) {
            return prepareRecordingInternal(context, fileDescriptorOutputOptions);
        }
        throw new UnsupportedOperationException("File descriptors as output destinations are not supported on pre-Android O (API 26) devices.");
    }

    @NonNull
    public PendingRecording prepareRecording(@NonNull Context context, @NonNull MediaStoreOutputOptions mediaStoreOutputOptions) {
        return prepareRecordingInternal(context, mediaStoreOutputOptions);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class RecordingRecord implements AutoCloseable {
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MediaMuxerSupplier> mMediaMuxerSupplier = new AtomicReference<>(null);
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>(null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new Consumer() { // from class: androidx.camera.video.d0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                Recorder.RecordingRecord.c((Uri) obj);
            }
        });
        private final AtomicBoolean mMuted = new AtomicBoolean(false);

        @NonNull
        private final MutableStateObservable<Boolean> mRecordingState = MutableStateObservable.withInitialState(Boolean.FALSE);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface AudioSourceSupplier {
            @NonNull
            @RequiresPermission("android.permission.RECORD_AUDIO")
            AudioSource get(@NonNull AudioSettings audioSettings, @NonNull Executor executor) throws AudioSourceAccessException;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface MediaMuxerSupplier {
            @NonNull
            MediaMuxer get(int i11, @NonNull Consumer<Uri> consumer) throws IOException;
        }

        public static /* synthetic */ void a(String str, Uri uri) {
            if (uri == null) {
                Logger.e(Recorder.TAG, String.format("File scanning operation failed [path: %s]", str));
            } else {
                Logger.d(Recorder.TAG, String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        public static /* synthetic */ void e(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
            if (absolutePathFromUri != null) {
                MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: androidx.camera.video.c0
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        Recorder.RecordingRecord.a(str, uri2);
                    }
                });
                return;
            }
            Logger.d(Recorder.TAG, "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        public static /* synthetic */ void f(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, null, null);
        }

        private void finalizeRecordingInternal(@Nullable Consumer<Uri> consumer, @NonNull Uri uri) {
            if (consumer != null) {
                this.mCloseGuard.close();
                consumer.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        @NonNull
        public static RecordingRecord from(@NonNull PendingRecording pendingRecording, long j11) {
            return new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.isAudioEnabled(), pendingRecording.isPersistent(), j11);
        }

        public static /* synthetic */ MediaMuxer j(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i11, Consumer consumer) {
            MediaMuxer createMediaMuxer;
            MediaMuxer mediaMuxer;
            Uri uri = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.w(Recorder.TAG, "Failed to create folder for " + file.getAbsolutePath());
                }
                mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i11);
                uri = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                if (Build.VERSION.SDK_INT < 26) {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
                mediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), i11);
            } else {
                if (!(outputOptions instanceof MediaStoreOutputOptions)) {
                    throw new AssertionError("Invalid output options type: " + outputOptions.getClass().getSimpleName());
                }
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    Uri insert = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                    if (insert == null) {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                    if (i12 < 26) {
                        String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), insert, Recorder.MEDIA_COLUMN);
                        if (absolutePathFromUri == null) {
                            throw new IOException("Unable to get path from uri " + insert);
                        }
                        if (!OutputUtil.createParentFolder(new File(absolutePathFromUri))) {
                            Logger.w(Recorder.TAG, "Failed to create folder for " + absolutePathFromUri);
                        }
                        createMediaMuxer = new MediaMuxer(absolutePathFromUri, i11);
                    } else {
                        ParcelFileDescriptor openFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(insert, "rw");
                        createMediaMuxer = Api26Impl.createMediaMuxer(openFileDescriptor.getFileDescriptor(), i11);
                        openFileDescriptor.close();
                    }
                    uri = insert;
                    mediaMuxer = createMediaMuxer;
                } catch (RuntimeException e11) {
                    throw new IOException("Unable to create MediaStore entry by " + e11, e11);
                }
            }
            consumer.accept(uri);
            return mediaMuxer;
        }

        public static /* synthetic */ void k(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e11) {
                Logger.e(Recorder.TAG, "Failed to close dup'd ParcelFileDescriptor", e11);
            }
        }

        private void updateRecordingState(@NonNull VideoRecordEvent videoRecordEvent) {
            if ((videoRecordEvent instanceof VideoRecordEvent.Start) || (videoRecordEvent instanceof VideoRecordEvent.Resume)) {
                this.mRecordingState.setState(Boolean.TRUE);
            } else if ((videoRecordEvent instanceof VideoRecordEvent.Pause) || (videoRecordEvent instanceof VideoRecordEvent.Finalize)) {
                this.mRecordingState.setState(Boolean.FALSE);
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        public void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer<Uri> andSet = this.mRecordingFinalizer.getAndSet(null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void finalizeRecording(@NonNull Uri uri) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet(null), uri);
            }
        }

        @Nullable
        public abstract Executor getCallbackExecutor();

        @Nullable
        public abstract Consumer<VideoRecordEvent> getEventListener();

        @NonNull
        public abstract OutputOptions getOutputOptions();

        public abstract long getRecordingId();

        @NonNull
        public StateObservable<Boolean> getRecordingState() {
            return this.mRecordingState;
        }

        public abstract boolean hasAudioEnabled();

        public void initializeRecording(@NonNull final Context context) throws IOException {
            if (this.mInitialized.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            final OutputOptions outputOptions = getOutputOptions();
            boolean z11 = outputOptions instanceof FileDescriptorOutputOptions;
            Consumer<Uri> consumer = null;
            final ParcelFileDescriptor dup = z11 ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
            this.mCloseGuard.open("finalizeRecording");
            this.mMediaMuxerSupplier.set(new MediaMuxerSupplier() { // from class: androidx.camera.video.y
                @Override // androidx.camera.video.Recorder.RecordingRecord.MediaMuxerSupplier
                public final MediaMuxer get(int i11, Consumer consumer2) {
                    return Recorder.RecordingRecord.j(OutputOptions.this, dup, i11, consumer2);
                }
            });
            if (hasAudioEnabled()) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.1
                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        @NonNull
                        @RequiresPermission("android.permission.RECORD_AUDIO")
                        public AudioSource get(@NonNull AudioSettings audioSettings, @NonNull Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(audioSettings, executor, context);
                        }
                    });
                } else {
                    this.mAudioSourceSupplier.set(new AudioSourceSupplier() { // from class: androidx.camera.video.Recorder.RecordingRecord.2
                        @Override // androidx.camera.video.Recorder.RecordingRecord.AudioSourceSupplier
                        @NonNull
                        @RequiresPermission("android.permission.RECORD_AUDIO")
                        public AudioSource get(@NonNull AudioSettings audioSettings, @NonNull Executor executor) throws AudioSourceAccessException {
                            return new AudioSource(audioSettings, executor, null);
                        }
                    });
                }
            }
            if (outputOptions instanceof MediaStoreOutputOptions) {
                final MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                consumer = Build.VERSION.SDK_INT >= 29 ? new Consumer() { // from class: androidx.camera.video.z
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.f(MediaStoreOutputOptions.this, (Uri) obj);
                    }
                } : new Consumer() { // from class: androidx.camera.video.a0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.e(MediaStoreOutputOptions.this, context, (Uri) obj);
                    }
                };
            } else if (z11) {
                consumer = new Consumer() { // from class: androidx.camera.video.b0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        Recorder.RecordingRecord.k(dup, (Uri) obj);
                    }
                };
            }
            if (consumer != null) {
                this.mRecordingFinalizer.set(consumer);
            }
        }

        public boolean isMuted() {
            return this.mMuted.get();
        }

        public abstract boolean isPersistent();

        public void mute(boolean z11) {
            this.mMuted.set(z11);
        }

        @NonNull
        @RequiresPermission("android.permission.RECORD_AUDIO")
        public AudioSource performOneTimeAudioSourceCreation(@NonNull AudioSettings audioSettings, @NonNull Executor executor) throws AudioSourceAccessException {
            if (!hasAudioEnabled()) {
                throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
            }
            AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet(null);
            if (andSet != null) {
                return andSet.get(audioSettings, executor);
            }
            throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
        }

        @NonNull
        public MediaMuxer performOneTimeMediaMuxerCreation(int i11, @NonNull Consumer<Uri> consumer) throws IOException {
            if (!this.mInitialized.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            MediaMuxerSupplier andSet = this.mMediaMuxerSupplier.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.get(i11, consumer);
            } catch (RuntimeException e11) {
                throw new IOException("Failed to create MediaMuxer by " + e11, e11);
            }
        }

        public void updateVideoRecordEvent(@NonNull final VideoRecordEvent videoRecordEvent) {
            if (!Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
            String str = "Sending VideoRecordEvent " + videoRecordEvent.getClass().getSimpleName();
            if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                if (finalize.hasError()) {
                    str = str + String.format(" [error: %s]", VideoRecordEvent.Finalize.errorToString(finalize.getError()));
                }
            }
            Logger.d(Recorder.TAG, str);
            updateRecordingState(videoRecordEvent);
            if (getCallbackExecutor() == null || getEventListener() == null) {
                return;
            }
            try {
                getCallbackExecutor().execute(new Runnable() { // from class: androidx.camera.video.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Recorder.RecordingRecord.this.getEventListener().accept(videoRecordEvent);
                    }
                });
            } catch (RejectedExecutionException e11) {
                Logger.e(Recorder.TAG, "The callback executor is invalid.", e11);
            }
        }

        public static /* synthetic */ void c(Uri uri) {
        }
    }
}
