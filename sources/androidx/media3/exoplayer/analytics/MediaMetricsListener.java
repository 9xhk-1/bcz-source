package androidx.media3.exoplayer.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.aa;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    @Nullable
    private String activeSessionId;
    private int audioUnderruns;
    private final Context context;

    @Nullable
    private Format currentAudioFormat;

    @Nullable
    private Format currentTextFormat;

    @Nullable
    private Format currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;

    @Nullable
    private PlaybackMetrics.Builder metricsBuilder;

    @Nullable
    private PendingFormatUpdate pendingAudioFormat;

    @Nullable
    private PlaybackException pendingPlayerError;

    @Nullable
    private PendingFormatUpdate pendingTextFormat;

    @Nullable
    private PendingFormatUpdate pendingVideoFormat;
    private final PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final PlaybackSessionManager sessionManager;
    private final Executor backgroundExecutor = BackgroundExecutor.get();
    private final Timeline.Window window = new Timeline.Window();
    private final Timeline.Period period = new Timeline.Period();
    private final HashMap<String, Long> bandwidthBytes = new HashMap<>();
    private final HashMap<String, Long> bandwidthTimeMs = new HashMap<>();
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ErrorInfo {
        public final int errorCode;
        public final int subErrorCode;

        public ErrorInfo(int i11, int i12) {
            this.errorCode = i11;
            this.subErrorCode = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PendingFormatUpdate {
        public final Format format;
        public final int selectionReason;
        public final String sessionId;

        public PendingFormatUpdate(Format format, int i11, String str) {
            this.format = format;
            this.selectionReason = i11;
            this.sessionId = str;
        }
    }

    private MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.setListener(this);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(@Nullable PendingFormatUpdate pendingFormatUpdate) {
        return pendingFormatUpdate != null && pendingFormatUpdate.sessionId.equals(this.sessionManager.getActiveSessionId());
    }

    @Nullable
    public static MediaMetricsListener create(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a11 = w2.a(context.getSystemService("media_metrics"));
        if (a11 == null) {
            return null;
        }
        createPlaybackSession = a11.createPlaybackSession();
        return new MediaMetricsListener(context, createPlaybackSession);
    }

    private void finishCurrentSession() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            Long l11 = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l11 == null ? 0L : l11.longValue());
            Long l12 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l12 == null ? 0L : l12.longValue());
            this.metricsBuilder.setStreamSource((l12 == null || l12.longValue() <= 0) ? 0 : 1);
            build = this.metricsBuilder.build();
            this.backgroundExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.z3
                @Override // java.lang.Runnable
                public final void run() {
                    MediaMetricsListener.this.playbackSession.reportPlaybackMetrics(build);
                }
            });
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int getDrmErrorCode(int i11) {
        switch (Util.getErrorCodeForMediaDrmErrorCode(i11)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    private static DrmInitData getDrmInitData(ImmutableList<Tracks.Group> immutableList) {
        DrmInitData drmInitData;
        aa<Tracks.Group> it = immutableList.iterator();
        while (it.hasNext()) {
            Tracks.Group next = it.next();
            for (int i11 = 0; i11 < next.length; i11++) {
                if (next.isTrackSelected(i11) && (drmInitData = next.getTrackFormat(i11).drmInitData) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int getDrmType(DrmInitData drmInitData) {
        for (int i11 = 0; i11 < drmInitData.schemeDataCount; i11++) {
            UUID uuid = drmInitData.get(i11).uuid;
            if (uuid.equals(C.WIDEVINE_UUID)) {
                return 3;
            }
            if (uuid.equals(C.PLAYREADY_UUID)) {
                return 2;
            }
            if (uuid.equals(C.CLEARKEY_UUID)) {
                return 6;
            }
        }
        return 1;
    }

    private static ErrorInfo getErrorInfo(PlaybackException playbackException, Context context, boolean z11) {
        int i11;
        boolean z12;
        if (playbackException.errorCode == 1001) {
            return new ErrorInfo(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z12 = exoPlaybackException.type == 1;
            i11 = exoPlaybackException.rendererFormatSupport;
        } else {
            i11 = 0;
            z12 = false;
        }
        Throwable th2 = (Throwable) Assertions.checkNotNull(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z12 && (i11 == 0 || i11 == 1)) {
                return new ErrorInfo(35, 0);
            }
            if (z12 && i11 == 3) {
                return new ErrorInfo(15, 0);
            }
            if (z12 && i11 == 2) {
                return new ErrorInfo(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new ErrorInfo(13, Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaCodecRenderer.DecoderInitializationException) th2).diagnosticInfo));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new ErrorInfo(14, ((MediaCodecDecoderException) th2).errorCode);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new ErrorInfo(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new ErrorInfo(17, ((AudioSink.InitializationException) th2).audioTrackState);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new ErrorInfo(18, ((AudioSink.WriteException) th2).errorCode);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new ErrorInfo(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new ErrorInfo(getDrmErrorCode(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource.InvalidResponseCodeException) {
            return new ErrorInfo(5, ((HttpDataSource.InvalidResponseCodeException) th2).responseCode);
        }
        if ((th2 instanceof HttpDataSource.InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new ErrorInfo(z11 ? 10 : 11, 0);
        }
        boolean z13 = th2 instanceof HttpDataSource.HttpDataSourceException;
        if (z13 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (NetworkTypeObserver.getInstance(context).getNetworkType() == 1) {
                return new ErrorInfo(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new ErrorInfo(6, 0) : cause instanceof SocketTimeoutException ? new ErrorInfo(7, 0) : (z13 && ((HttpDataSource.HttpDataSourceException) th2).type == 1) ? new ErrorInfo(4, 0) : new ErrorInfo(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new ErrorInfo(21, 0);
        }
        if (th2 instanceof DrmSession.DrmSessionException) {
            Throwable th3 = (Throwable) Assertions.checkNotNull(th2.getCause());
            if (!(th3 instanceof MediaDrm.MediaDrmStateException)) {
                return (Util.SDK_INT < 23 || !(th3 instanceof MediaDrmResetException)) ? th3 instanceof NotProvisionedException ? new ErrorInfo(24, 0) : th3 instanceof DeniedByServerException ? new ErrorInfo(29, 0) : th3 instanceof UnsupportedDrmException ? new ErrorInfo(23, 0) : th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new ErrorInfo(28, 0) : new ErrorInfo(30, 0) : new ErrorInfo(27, 0);
            }
            int errorCodeFromPlatformDiagnosticsInfo = Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new ErrorInfo(getDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo), errorCodeFromPlatformDiagnosticsInfo);
        }
        if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
            return new ErrorInfo(9, 0);
        }
        Throwable cause2 = ((Throwable) Assertions.checkNotNull(th2.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new ErrorInfo(32, 0) : new ErrorInfo(31, 0);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        String[] split = Util.split(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return Pair.create(split[0], split.length >= 2 ? split[1] : null);
    }

    private static int getNetworkType(Context context) {
        switch (NetworkTypeObserver.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return 0;
        }
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (inferContentTypeForUriAndMimeType == 0) {
            return 3;
        }
        if (inferContentTypeForUriAndMimeType != 1) {
            return inferContentTypeForUriAndMimeType != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int getTrackChangeReason(int i11) {
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i11 = 0; i11 < events.size(); i11++) {
            int i12 = events.get(i11);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i12);
            if (i12 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i12 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    private void maybeReportNetworkChange(long j11) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        final NetworkEvent build;
        int networkType2 = getNetworkType(this.context);
        if (networkType2 != this.currentNetworkType) {
            this.currentNetworkType = networkType2;
            networkType = m3.a().setNetworkType(networkType2);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j11 - this.startTimeMs);
            build = timeSinceCreatedMillis.build();
            this.backgroundExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.x3
                @Override // java.lang.Runnable
                public final void run() {
                    MediaMetricsListener.this.playbackSession.reportNetworkEvent(build);
                }
            });
        }
    }

    private void maybeReportPlaybackError(long j11) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build;
        PlaybackException playbackException = this.pendingPlayerError;
        if (playbackException == null) {
            return;
        }
        ErrorInfo errorInfo = getErrorInfo(playbackException, this.context, this.ioErrorType == 4);
        timeSinceCreatedMillis = p3.a().setTimeSinceCreatedMillis(j11 - this.startTimeMs);
        errorCode = timeSinceCreatedMillis.setErrorCode(errorInfo.errorCode);
        subErrorCode = errorCode.setSubErrorCode(errorInfo.subErrorCode);
        exception = subErrorCode.setException(playbackException);
        build = exception.build();
        this.backgroundExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.y3
            @Override // java.lang.Runnable
            public final void run() {
                MediaMetricsListener.this.playbackSession.reportPlaybackErrorEvent(build);
            }
        });
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeReportPlaybackStateChange(Player player, AnalyticsListener.Events events, long j11) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        if (player.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (player.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (events.contains(10)) {
            this.hasFatalError = true;
        }
        int resolveNewPlaybackState = resolveNewPlaybackState(player);
        if (this.currentPlaybackState != resolveNewPlaybackState) {
            this.currentPlaybackState = resolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            state = q3.a().setState(this.currentPlaybackState);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j11 - this.startTimeMs);
            build = timeSinceCreatedMillis.build();
            this.backgroundExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.a4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaMetricsListener.this.playbackSession.reportPlaybackStateEvent(build);
                }
            });
        }
    }

    private void maybeReportTrackChanges(Player player, AnalyticsListener.Events events, long j11) {
        if (events.contains(2)) {
            Tracks currentTracks = player.getCurrentTracks();
            boolean isTypeSelected = currentTracks.isTypeSelected(2);
            boolean isTypeSelected2 = currentTracks.isTypeSelected(1);
            boolean isTypeSelected3 = currentTracks.isTypeSelected(3);
            if (isTypeSelected || isTypeSelected2 || isTypeSelected3) {
                if (!isTypeSelected) {
                    maybeUpdateVideoFormat(j11, null, 0);
                }
                if (!isTypeSelected2) {
                    maybeUpdateAudioFormat(j11, null, 0);
                }
                if (!isTypeSelected3) {
                    maybeUpdateTextFormat(j11, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat)) {
            PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
            Format format = pendingFormatUpdate.format;
            if (format.height != -1) {
                maybeUpdateVideoFormat(j11, format, pendingFormatUpdate.selectionReason);
                this.pendingVideoFormat = null;
            }
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            PendingFormatUpdate pendingFormatUpdate2 = this.pendingAudioFormat;
            maybeUpdateAudioFormat(j11, pendingFormatUpdate2.format, pendingFormatUpdate2.selectionReason);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            PendingFormatUpdate pendingFormatUpdate3 = this.pendingTextFormat;
            maybeUpdateTextFormat(j11, pendingFormatUpdate3.format, pendingFormatUpdate3.selectionReason);
            this.pendingTextFormat = null;
        }
    }

    private void maybeUpdateAudioFormat(long j11, @Nullable Format format, int i11) {
        if (Objects.equals(this.currentAudioFormat, format)) {
            return;
        }
        if (this.currentAudioFormat == null && i11 == 0) {
            i11 = 1;
        }
        this.currentAudioFormat = format;
        reportTrackChangeEvent(0, j11, format, i11);
    }

    private void maybeUpdateMetricsBuilderValues(Player player, AnalyticsListener.Events events) {
        DrmInitData drmInitData;
        if (events.contains(0)) {
            AnalyticsListener.EventTime eventTime = events.getEventTime(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
            }
        }
        if (events.contains(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(player.getCurrentTracks().getGroups())) != null) {
            m2.a(Util.castNonNull(this.metricsBuilder)).setDrmType(getDrmType(drmInitData));
        }
        if (events.contains(1011)) {
            this.audioUnderruns++;
        }
    }

    private void maybeUpdateTextFormat(long j11, @Nullable Format format, int i11) {
        if (Objects.equals(this.currentTextFormat, format)) {
            return;
        }
        if (this.currentTextFormat == null && i11 == 0) {
            i11 = 1;
        }
        this.currentTextFormat = format;
        reportTrackChangeEvent(2, j11, format, i11);
    }

    @RequiresNonNull({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(Timeline timeline, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaPeriodId == null || (indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            return;
        }
        timeline.getPeriod(indexOfPeriod, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        builder.setStreamType(getStreamType(this.window.mediaItem));
        Timeline.Window window = this.window;
        if (window.durationUs != C.TIME_UNSET && !window.isPlaceholder && !window.isDynamic && !window.isLive()) {
            builder.setMediaDurationMillis(this.window.getDurationMs());
        }
        builder.setPlaybackType(this.window.isLive() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void maybeUpdateVideoFormat(long j11, @Nullable Format format, int i11) {
        if (Objects.equals(this.currentVideoFormat, format)) {
            return;
        }
        if (this.currentVideoFormat == null && i11 == 0) {
            i11 = 1;
        }
        this.currentVideoFormat = format;
        reportTrackChangeEvent(1, j11, format, i11);
    }

    private void reportTrackChangeEvent(int i11, long j11, @Nullable Format format, int i12) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = l3.a(i11).setTimeSinceCreatedMillis(j11 - this.startTimeMs);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i12));
            String str = format.containerMimeType;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.sampleMimeType;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.codecs;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = format.bitrate;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = format.width;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = format.height;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = format.channelCount;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = format.sampleRate;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = format.language;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f11 = format.frameRate;
            if (f11 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f11);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        build = timeSinceCreatedMillis.build();
        this.backgroundExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.analytics.w3
            @Override // java.lang.Runnable
            public final void run() {
                MediaMetricsListener.this.playbackSession.reportTrackChangeEvent(build);
            }
        });
    }

    private int resolveNewPlaybackState(Player player) {
        int playbackState = player.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i11 = this.currentPlaybackState;
            if (i11 == 0 || i11 == 2 || i11 == 12) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.currentPlaybackState == 0) {
            return this.currentPlaybackState;
        }
        return 12;
    }

    public LogSessionId getLogSessionId() {
        LogSessionId sessionId;
        sessionId = this.playbackSession.getSessionId();
        return sessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i11, long j11, long j12) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            String sessionForMediaPeriodId = this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId));
            Long l11 = this.bandwidthBytes.get(sessionForMediaPeriodId);
            Long l12 = this.bandwidthTimeMs.get(sessionForMediaPeriodId);
            this.bandwidthBytes.put(sessionForMediaPeriodId, Long.valueOf((l11 == null ? 0L : l11.longValue()) + j11));
            this.bandwidthTimeMs.put(sessionForMediaPeriodId, Long.valueOf((l12 != null ? l12.longValue() : 0L) + i11));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        if (eventTime.mediaPeriodId == null) {
            return;
        }
        PendingFormatUpdate pendingFormatUpdate = new PendingFormatUpdate((Format) Assertions.checkNotNull(mediaLoadData.trackFormat), mediaLoadData.trackSelectionReason, this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, (MediaSource.MediaPeriodId) Assertions.checkNotNull(eventTime.mediaPeriodId)));
        int i11 = mediaLoadData.trackType;
        if (i11 != 0) {
            if (i11 == 1) {
                this.pendingAudioFormat = pendingFormatUpdate;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.pendingTextFormat = pendingFormatUpdate;
                return;
            }
        }
        this.pendingVideoFormat = pendingFormatUpdate;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(player, events);
        maybeReportPlaybackError(elapsedRealtime);
        maybeReportTrackChanges(player, events, elapsedRealtime);
        maybeReportNetworkChange(elapsedRealtime);
        maybeReportPlaybackStateChange(player, events, elapsedRealtime);
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z11) {
        this.ioErrorType = mediaLoadData.dataType;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.pendingPlayerError = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
        if (i11 == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i11;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            playerName = o3.a().setPlayerName(MediaLibraryInfo.TAG);
            playerVersion = playerName.setPlayerVersion(MediaLibraryInfo.VERSION);
            this.metricsBuilder = playerVersion;
            maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z11) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if ((mediaPeriodId == null || !mediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
        if (pendingFormatUpdate != null) {
            Format format = pendingFormatUpdate.format;
            if (format.height == -1) {
                this.pendingVideoFormat = new PendingFormatUpdate(format.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build(), pendingFormatUpdate.selectionReason, pendingFormatUpdate.sessionId);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
    }
}
