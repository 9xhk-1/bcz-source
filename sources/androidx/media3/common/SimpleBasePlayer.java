package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<com.google.common.util.concurrent.p1<?>> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class LivePositionSupplier implements PositionSupplier {
        private long finalValue = C.TIME_UNSET;
        private final PositionSupplier livePosition;

        public LivePositionSupplier(PositionSupplier positionSupplier) {
            this.livePosition = positionSupplier;
        }

        public void disconnect(long j11) {
            this.finalValue = j11;
        }

        @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
        public long get() {
            long j11 = this.finalValue;
            return j11 != C.TIME_UNSET ? j11 : this.livePosition.get();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;

        @Nullable
        public final MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public final Object manifest;
        public final MediaItem mediaItem;

        @Nullable
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final ImmutableList<PeriodData> periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;

            @Nullable
            private MediaItem.LiveConfiguration liveConfiguration;

            @Nullable
            private Object manifest;
            private MediaItem mediaItem;

            @Nullable
            private MediaMetadata mediaMetadata;
            private ImmutableList<PeriodData> periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            public MediaItemData build() {
                return new MediaItemData(this);
            }

            @uo.a
            public Builder setDefaultPositionUs(long j11) {
                Assertions.checkArgument(j11 >= 0);
                this.defaultPositionUs = j11;
                return this;
            }

            @uo.a
            public Builder setDurationUs(long j11) {
                Assertions.checkArgument(j11 == C.TIME_UNSET || j11 >= 0);
                this.durationUs = j11;
                return this;
            }

            @uo.a
            public Builder setElapsedRealtimeEpochOffsetMs(long j11) {
                this.elapsedRealtimeEpochOffsetMs = j11;
                return this;
            }

            @uo.a
            public Builder setIsDynamic(boolean z11) {
                this.isDynamic = z11;
                return this;
            }

            @uo.a
            public Builder setIsPlaceholder(boolean z11) {
                this.isPlaceholder = z11;
                return this;
            }

            @uo.a
            public Builder setIsSeekable(boolean z11) {
                this.isSeekable = z11;
                return this;
            }

            @uo.a
            public Builder setLiveConfiguration(@Nullable MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            @uo.a
            public Builder setManifest(@Nullable Object obj) {
                this.manifest = obj;
                return this;
            }

            @uo.a
            public Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            @uo.a
            public Builder setMediaMetadata(@Nullable MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            @uo.a
            public Builder setPeriods(List<PeriodData> list) {
                int size = list.size();
                int i11 = 0;
                while (i11 < size - 1) {
                    Assertions.checkArgument(list.get(i11).durationUs != C.TIME_UNSET, "Periods other than last need a duration");
                    int i12 = i11 + 1;
                    for (int i13 = i12; i13 < size; i13++) {
                        Assertions.checkArgument(!list.get(i11).uid.equals(list.get(i13).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i11 = i12;
                }
                this.periods = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @uo.a
            public Builder setPositionInFirstPeriodUs(long j11) {
                Assertions.checkArgument(j11 >= 0);
                this.positionInFirstPeriodUs = j11;
                return this;
            }

            @uo.a
            public Builder setPresentationStartTimeMs(long j11) {
                this.presentationStartTimeMs = j11;
                return this;
            }

            @uo.a
            public Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            @uo.a
            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            @uo.a
            public Builder setWindowStartTimeMs(long j11) {
                this.windowStartTimeMs = j11;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = C.TIME_UNSET;
                this.windowStartTimeMs = C.TIME_UNSET;
                this.elapsedRealtimeEpochOffsetMs = C.TIME_UNSET;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = C.TIME_UNSET;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = ImmutableList.of();
            }

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaItemData buildFromState(State state, int i11, Timeline.Period period, Timeline.Window window) {
            boolean z11 = SimpleBasePlayer.getCurrentMediaItemIndexInternal(state) == i11;
            state.timeline.getWindow(i11, window);
            ImmutableList.a builder = ImmutableList.builder();
            for (int i12 = window.firstPeriodIndex; i12 <= window.lastPeriodIndex; i12++) {
                state.timeline.getPeriod(i12, period, true);
                builder.g(new PeriodData.Builder(Assertions.checkNotNull(period.uid)).setAdPlaybackState(period.adPlaybackState).setDurationUs(period.durationUs).setIsPlaceholder(period.isPlaceholder).build());
            }
            return new Builder(window.uid).setDefaultPositionUs(window.defaultPositionUs).setDurationUs(window.durationUs).setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs).setIsDynamic(window.isDynamic).setIsPlaceholder(window.isPlaceholder).setIsSeekable(window.isSeekable).setLiveConfiguration(window.liveConfiguration).setManifest(window.manifest).setMediaItem(window.mediaItem).setMediaMetadata(z11 ? state.currentMetadata : null).setPeriods(builder.e()).setPositionInFirstPeriodUs(window.positionInFirstPeriodUs).setPresentationStartTimeMs(window.presentationStartTimeMs).setTracks(z11 ? state.currentTracks : Tracks.EMPTY).setWindowStartTimeMs(window.windowStartTimeMs).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Period getPeriod(int i11, int i12, Timeline.Period period) {
            if (this.periods.isEmpty()) {
                Object obj = this.uid;
                period.set(obj, obj, i11, this.positionInFirstPeriodUs + this.durationUs, 0L, AdPlaybackState.NONE, this.isPlaceholder);
                return period;
            }
            PeriodData periodData = this.periods.get(i12);
            Object obj2 = periodData.uid;
            period.set(obj2, Pair.create(this.uid, obj2), i11, periodData.durationUs, this.periodPositionInWindowUs[i12], periodData.adPlaybackState, periodData.isPlaceholder);
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i11) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, this.periods.get(i11).uid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Window getWindow(int i11, Timeline.Window window) {
            int size;
            boolean z11;
            if (this.periods.isEmpty()) {
                size = 1;
                z11 = true;
            } else {
                size = this.periods.size();
                z11 = true;
            }
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i11, (i11 + size) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Objects.equals(this.mediaMetadata, mediaItemData.mediaMetadata) && Objects.equals(this.manifest, mediaItemData.manifest) && Objects.equals(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        public int hashCode() {
            int hashCode = (((((217 + this.uid.hashCode()) * 31) + this.tracks.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int hashCode2 = (hashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            Object obj = this.manifest;
            int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode4 = (hashCode3 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j11 = this.presentationStartTimeMs;
            int i11 = (hashCode4 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.windowStartTimeMs;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.elapsedRealtimeEpochOffsetMs;
            int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j14 = this.defaultPositionUs;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.durationUs;
            int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.positionInFirstPeriodUs;
            return ((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        private MediaItemData(Builder builder) {
            int i11 = 0;
            if (builder.liveConfiguration == null) {
                Assertions.checkArgument(builder.presentationStartTimeMs == C.TIME_UNSET, "presentationStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.windowStartTimeMs == C.TIME_UNSET, "windowStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.elapsedRealtimeEpochOffsetMs == C.TIME_UNSET, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != C.TIME_UNSET && builder.windowStartTimeMs != C.TIME_UNSET) {
                Assertions.checkArgument(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != C.TIME_UNSET) {
                Assertions.checkArgument(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j11 = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j11;
            this.isPlaceholder = builder.isPlaceholder;
            ImmutableList<PeriodData> immutableList = builder.periods;
            this.periods = immutableList;
            long[] jArr = new long[immutableList.size()];
            this.periodPositionInWindowUs = jArr;
            if (immutableList.isEmpty()) {
                return;
            }
            jArr[0] = -j11;
            while (i11 < size - 1) {
                long[] jArr2 = this.periodPositionInWindowUs;
                int i12 = i11 + 1;
                jArr2[i12] = jArr2[i11] + this.periods.get(i11).durationUs;
                i11 = i12;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            public PeriodData build() {
                return new PeriodData(this);
            }

            @uo.a
            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            @uo.a
            public Builder setDurationUs(long j11) {
                Assertions.checkArgument(j11 == C.TIME_UNSET || j11 >= 0);
                this.durationUs = j11;
                return this;
            }

            @uo.a
            public Builder setIsPlaceholder(boolean z11) {
                this.isPlaceholder = z11;
                return this;
            }

            @uo.a
            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        public int hashCode() {
            int hashCode = (217 + this.uid.hashCode()) * 31;
            long j11 = this.durationUs;
            return ((((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final ImmutableList<MediaItemData> playlist;
        private final int[] windowIndexByPeriodIndex;

        public PlaylistTimeline(List<MediaItemData> list) {
            int size = list.size();
            this.playlist = ImmutableList.copyOf((Collection) list);
            this.firstPeriodIndexByWindowIndex = new int[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                MediaItemData mediaItemData = list.get(i12);
                this.firstPeriodIndexByWindowIndex[i12] = i11;
                i11 += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[i11];
            this.periodIndexByUid = new HashMap<>();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                MediaItemData mediaItemData2 = list.get(i14);
                for (int i15 = 0; i15 < getPeriodCountInMediaItem(mediaItemData2); i15++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i15), Integer.valueOf(i13));
                    this.windowIndexByPeriodIndex[i13] = i14;
                    i13++;
                }
            }
        }

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z11) {
            return super.getFirstWindowIndex(z11);
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z11) {
            return super.getLastWindowIndex(z11);
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i11, int i12, boolean z11) {
            return super.getNextWindowIndex(i11, i12, z11);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
            int i12 = this.windowIndexByPeriodIndex[i11];
            return this.playlist.get(i12).getPeriod(i12, i11 - this.firstPeriodIndexByWindowIndex[i12], period);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            return getPeriod(((Integer) Assertions.checkNotNull(this.periodIndexByUid.get(obj))).intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i11, int i12, boolean z11) {
            return super.getPreviousWindowIndex(i11, i12, z11);
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i11) {
            int i12 = this.windowIndexByPeriodIndex[i11];
            return this.playlist.get(i12).getPeriodUid(i11 - this.firstPeriodIndexByWindowIndex[i12]);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
            return this.playlist.get(i11).getWindow(this.firstPeriodIndexByWindowIndex[i11], window);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final MediaMetadata currentMetadata;
        public final Tracks currentTracks;
        public final DeviceInfo deviceInfo;

        @IntRange(from = 0)
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;

        @Nullable
        public final PlaybackException playerError;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        private final boolean usesDerivedMediaMetadata;
        public final VideoSize videoSize;

        @FloatRange(from = 0.0d, to = 1.0d)
        public final float volume;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;

            @Nullable
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;

            @Nullable
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;

            @Nullable
            private MediaMetadata currentMetadata;

            @Nullable
            private Tracks currentTracks;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;

            @Nullable
            private PlaybackException playerError;

            @Nullable
            private ImmutableList<MediaItemData> playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private VideoSize videoSize;
            private float volume;

            public State build() {
                return new State(this);
            }

            @uo.a
            public Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            @uo.a
            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            @uo.a
            public Builder setAdPositionMs(long j11) {
                this.adPositionMs = Long.valueOf(j11);
                return this;
            }

            @uo.a
            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            @uo.a
            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            @uo.a
            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            @uo.a
            public Builder setContentPositionMs(long j11) {
                this.contentPositionMs = Long.valueOf(j11);
                return this;
            }

            @uo.a
            public Builder setCurrentAd(int i11, int i12) {
                Assertions.checkArgument((i11 == -1) == (i12 == -1));
                this.currentAdGroupIndex = i11;
                this.currentAdIndexInAdGroup = i12;
                return this;
            }

            @uo.a
            public Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            @uo.a
            public Builder setCurrentMediaItemIndex(int i11) {
                this.currentMediaItemIndex = i11;
                return this;
            }

            @uo.a
            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            @uo.a
            public Builder setDeviceVolume(@IntRange(from = 0) int i11) {
                Assertions.checkArgument(i11 >= 0);
                this.deviceVolume = i11;
                return this;
            }

            @uo.a
            public Builder setIsDeviceMuted(boolean z11) {
                this.isDeviceMuted = z11;
                return this;
            }

            @uo.a
            public Builder setIsLoading(boolean z11) {
                this.isLoading = z11;
                return this;
            }

            @uo.a
            public Builder setMaxSeekToPreviousPositionMs(long j11) {
                this.maxSeekToPreviousPositionMs = j11;
                return this;
            }

            @uo.a
            public Builder setNewlyRenderedFirstFrame(boolean z11) {
                this.newlyRenderedFirstFrame = z11;
                return this;
            }

            @uo.a
            public Builder setPlayWhenReady(boolean z11, int i11) {
                this.playWhenReady = z11;
                this.playWhenReadyChangeReason = i11;
                return this;
            }

            @uo.a
            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            @uo.a
            public Builder setPlaybackState(int i11) {
                this.playbackState = i11;
                return this;
            }

            @uo.a
            public Builder setPlaybackSuppressionReason(int i11) {
                this.playbackSuppressionReason = i11;
                return this;
            }

            @uo.a
            public Builder setPlayerError(@Nullable PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            @uo.a
            public Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    Assertions.checkArgument(hashSet.add(list.get(i11).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = ImmutableList.copyOf((Collection) list);
                this.timeline = new PlaylistTimeline(this.playlist);
                this.currentTracks = null;
                this.currentMetadata = null;
                return this;
            }

            @uo.a
            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            @uo.a
            public Builder setPositionDiscontinuity(int i11, long j11) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i11;
                this.discontinuityPositionMs = j11;
                return this;
            }

            @uo.a
            public Builder setRepeatMode(int i11) {
                this.repeatMode = i11;
                return this;
            }

            @uo.a
            public Builder setSeekBackIncrementMs(long j11) {
                this.seekBackIncrementMs = j11;
                return this;
            }

            @uo.a
            public Builder setSeekForwardIncrementMs(long j11) {
                this.seekForwardIncrementMs = j11;
                return this;
            }

            @uo.a
            public Builder setShuffleModeEnabled(boolean z11) {
                this.shuffleModeEnabled = z11;
                return this;
            }

            @uo.a
            public Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            @uo.a
            public Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            @uo.a
            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            @uo.a
            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            @uo.a
            public Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            @uo.a
            public Builder setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
                Assertions.checkArgument(f11 >= 0.0f && f11 <= 1.0f);
                this.volume = f11;
                return this;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = 15000L;
                this.maxSeekToPreviousPositionMs = 3000L;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.volume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
                this.playlist = ImmutableList.of();
                this.timeline = Timeline.EMPTY;
                this.currentTracks = null;
                this.currentMetadata = null;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = PositionSupplier.getConstant(C.TIME_UNSET);
                this.adPositionMs = null;
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
                this.adPositionMsSupplier = positionSupplier;
                this.contentBufferedPositionMsSupplier = PositionSupplier.getConstant(C.TIME_UNSET);
                this.adBufferedPositionMsSupplier = positionSupplier;
                this.totalBufferedDurationMsSupplier = positionSupplier;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }

            @uo.a
            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            @uo.a
            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            @uo.a
            public Builder setPlaylist(Timeline timeline, Tracks tracks, @Nullable MediaMetadata mediaMetadata) {
                this.playlist = null;
                this.timeline = timeline;
                this.currentTracks = tracks;
                this.currentMetadata = mediaMetadata;
                return this;
            }

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.volume = state.volume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                Timeline timeline = state.timeline;
                this.timeline = timeline;
                if (timeline instanceof PlaylistTimeline) {
                    this.playlist = ((PlaylistTimeline) timeline).playlist;
                } else {
                    this.currentTracks = state.currentTracks;
                    this.currentMetadata = state.usesDerivedMediaMetadata ? null : state.currentMetadata;
                }
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        public ImmutableList<MediaItemData> getPlaylist() {
            Timeline timeline = this.timeline;
            if (timeline instanceof PlaylistTimeline) {
                return ((PlaylistTimeline) timeline).playlist;
            }
            Timeline.Window window = new Timeline.Window();
            Timeline.Period period = new Timeline.Period();
            ImmutableList.a builderWithExpectedSize = ImmutableList.builderWithExpectedSize(this.timeline.getWindowCount());
            for (int i11 = 0; i11 < this.timeline.getWindowCount(); i11++) {
                builderWithExpectedSize.g(MediaItemData.buildFromState(this, i11, period, window));
            }
            return builderWithExpectedSize.e();
        }

        public int hashCode() {
            int hashCode = (((((((((217 + this.availableCommands.hashCode()) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31;
            PlaybackException playbackException = this.playerError;
            int hashCode2 = (((((((hashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31;
            long j11 = this.seekBackIncrementMs;
            int i11 = (hashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.seekForwardIncrementMs;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.maxSeekToPreviousPositionMs;
            int hashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.playbackParameters.hashCode()) * 31) + this.trackSelectionParameters.hashCode()) * 31) + this.audioAttributes.hashCode()) * 31) + Float.floatToRawIntBits(this.volume)) * 31) + this.videoSize.hashCode()) * 31) + this.currentCues.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31) + this.surfaceSize.hashCode()) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31) + this.timedMetadata.hashCode()) * 31) + this.timeline.hashCode()) * 31) + this.currentTracks.hashCode()) * 31) + this.currentMetadata.hashCode()) * 31) + this.playlistMetadata.hashCode()) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31) + this.contentPositionMsSupplier.hashCode()) * 31) + this.adPositionMsSupplier.hashCode()) * 31) + this.contentBufferedPositionMsSupplier.hashCode()) * 31) + this.adBufferedPositionMsSupplier.hashCode()) * 31) + this.totalBufferedDurationMsSupplier.hashCode()) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j14 = this.discontinuityPositionMs;
            return hashCode3 + ((int) (j14 ^ (j14 >>> 32)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private State(androidx.media3.common.SimpleBasePlayer.State.Builder r18) {
            /*
                Method dump skipped, instructions count: 672
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.SimpleBasePlayer.State.<init>(androidx.media3.common.SimpleBasePlayer$State$Builder):void");
        }
    }

    public SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    public static /* synthetic */ void B(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    public static /* synthetic */ State D(SimpleBasePlayer simpleBasePlayer, State state, List list, int i11) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        for (int i12 = 0; i12 < list.size(); i12++) {
            buildMutablePlaylistFromState.add(i12 + i11, simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i12)));
        }
        return !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, buildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window) : getStateWithNewPlaylistAndPosition(state, buildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), simpleBasePlayer.window);
    }

    public static /* synthetic */ void F(int i11, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i11);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i11);
    }

    public static /* synthetic */ State I(SimpleBasePlayer simpleBasePlayer, State state, int i11, int i12, int i13) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        Util.moveItems(buildMutablePlaylistFromState, i11, i12, i13);
        return getStateWithNewPlaylist(state, buildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    public static /* synthetic */ State Q(SimpleBasePlayer simpleBasePlayer, State state) {
        simpleBasePlayer.getClass();
        return state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state, simpleBasePlayer.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    public static /* synthetic */ void R(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    public static /* synthetic */ State a(SimpleBasePlayer simpleBasePlayer, List list, State state, int i11, long j11) {
        simpleBasePlayer.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i12)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i11, j11, simpleBasePlayer.window);
    }

    private static List<MediaItemData> buildMutablePlaylistFromState(State state, Timeline.Period period, Timeline.Window window) {
        if (state.timeline instanceof PlaylistTimeline) {
            return new ArrayList(((PlaylistTimeline) state.timeline).playlist);
        }
        ArrayList arrayList = new ArrayList(state.timeline.getWindowCount());
        for (int i11 = 0; i11 < state.timeline.getWindowCount(); i11++) {
            arrayList.add(MediaItemData.buildFromState(state, i11, period, window));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static State buildStateForNewPosition(State.Builder builder, State state, long j11, Timeline timeline, int i11, long j12, boolean z11, Timeline.Window window) {
        long j13;
        int i12 = i11;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j11, state, window);
        boolean z12 = false;
        if (timeline.isEmpty() || (i12 != -1 && i12 < timeline.getWindowCount())) {
            j13 = j12;
        } else {
            j13 = -9223372036854775807L;
            i12 = 0;
        }
        if (!timeline.isEmpty() && j13 == C.TIME_UNSET) {
            j13 = timeline.getWindow(i12, window).getDefaultPositionMs();
        }
        boolean z13 = state.timeline.isEmpty() || timeline.isEmpty();
        boolean z14 = (z13 || state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid.equals(timeline.getWindow(i12, window).uid)) ? false : true;
        if (timeline.isEmpty()) {
            builder.setPlaylist(timeline, Tracks.EMPTY, null);
        } else if (timeline instanceof PlaylistTimeline) {
            MediaItemData mediaItemData = (MediaItemData) ((PlaylistTimeline) timeline).playlist.get(i12);
            builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
        } else {
            if (!z13 && !z14) {
                z12 = true;
            }
            builder.setPlaylist(timeline, z12 ? state.currentTracks : Tracks.EMPTY, z12 ? state.currentMetadata : null);
        }
        if (z13 || z14 || j13 < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i12).setCurrentAd(-1, -1).setContentPositionMs(j13).setContentBufferedPositionMs(PositionSupplier.getConstant(j13)).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (j13 == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i12);
            if (state.currentAdGroupIndex == -1 || !z11) {
                builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(PositionSupplier.getConstant(getContentBufferedPositionMsInternal(state, window) - positionOrDefaultInMediaItem));
            } else {
                builder.setTotalBufferedDurationMs(PositionSupplier.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            }
        } else {
            builder.setCurrentMediaItemIndex(i12).setCurrentAd(-1, -1).setContentPositionMs(j13).setContentBufferedPositionMs(PositionSupplier.getConstant(Math.max(getContentBufferedPositionMsInternal(state, window), j13))).setTotalBufferedDurationMs(PositionSupplier.getConstant(Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (j13 - positionOrDefaultInMediaItem))));
        }
        return builder.build();
    }

    public static /* synthetic */ State c(SimpleBasePlayer simpleBasePlayer, State state, int i11, int i12) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        Util.removeRange(buildMutablePlaylistFromState, i11, i12);
        return getStateWithNewPlaylist(state, buildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    private void clearVideoOutput(@Nullable Object obj) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            updateStateForPendingOperation(handleClearVideoOutput(obj), new ho.p0() { // from class: androidx.media3.common.n1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(Size.ZERO).build();
                    return build;
                }
            });
        }
    }

    public static /* synthetic */ State e(SimpleBasePlayer simpleBasePlayer, boolean z11, State state, int i11, long j11) {
        if (!z11) {
            return getStateWithNewPlaylistAndPosition(state, null, i11, j11, simpleBasePlayer.window);
        }
        simpleBasePlayer.getClass();
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i11 = 0; i11 < size; i11++) {
            Tracks.Group group = tracks.getGroups().get(i11);
            for (int i12 = 0; i12 < group.length; i12++) {
                if (group.isTrackSelected(i12)) {
                    Format trackFormat = group.getTrackFormat(i12);
                    if (trackFormat.metadata != null) {
                        for (int i13 = 0; i13 < trackFormat.metadata.length(); i13++) {
                            trackFormat.metadata.get(i13).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        return builder.populate(mediaItem.mediaMetadata).build();
    }

    private static long getContentBufferedPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state, window);
    }

    private static long getContentPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state, window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(State state) {
        int i11 = state.currentMediaItemIndex;
        if (i11 != -1) {
            return i11;
        }
        return 0;
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        return state.timeline.isEmpty() ? currentMediaItemIndexInternal : getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state, window), window, period);
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period, Timeline.Window window) {
        return state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : getContentPositionMsInternal(state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static int getMediaItemIndexInNewPlaylist(Timeline timeline, Timeline timeline2, int i11, Timeline.Period period, Timeline.Window window) {
        if (timeline.isEmpty()) {
            if (i11 < timeline2.getWindowCount()) {
                return i11;
            }
            return -1;
        }
        Object checkNotNull = Assertions.checkNotNull(timeline.getPeriod(timeline.getWindow(i11, window).firstPeriodIndex, period, true).uid);
        if (timeline2.getIndexOfPeriod(checkNotNull) == -1) {
            return -1;
        }
        return timeline2.getPeriodByUid(checkNotNull, period).windowIndex;
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i11, boolean z11, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i11 == 0) {
                return 1;
            }
            return i11 == 1 ? 2 : 3;
        }
        if (i11 != 0 || getContentPositionMsInternal(state, window) <= getContentPositionMsInternal(state2, window)) {
            return (i11 == 1 && z11) ? 2 : -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i11, long j11, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i11, Util.msToUs(j11)).first);
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        state.timeline.getPeriodByUid(obj, period);
        int i11 = state.currentAdGroupIndex;
        return Util.usToMs(i11 == -1 ? period.durationUs : period.getAdDurationUs(i11, state.currentAdIndexInAdGroup));
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z11, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z11) {
            return 1;
        }
        if (state.timeline.isEmpty()) {
            return -1;
        }
        if (state2.timeline.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && state.currentAdGroupIndex == state2.currentAdGroupIndex && state.currentAdIndexInAdGroup == state2.currentAdIndexInAdGroup) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period, window)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == C.TIME_UNSET || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == C.TIME_UNSET || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z11, Timeline.Window window, Timeline.Period period) {
        MediaItem mediaItem;
        Object obj;
        Object obj2;
        int i11;
        long contentPositionMsInternal;
        long j11;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (state.timeline.isEmpty()) {
            mediaItem = null;
            obj = null;
            obj2 = null;
            i11 = -1;
        } else {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            obj = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            obj2 = obj3;
            mediaItem = window.mediaItem;
            i11 = currentPeriodIndexInternal;
        }
        if (z11) {
            j11 = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j11 : getContentPositionMsInternal(state, window);
        } else {
            contentPositionMsInternal = getContentPositionMsInternal(state, window);
            j11 = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, i11, j11, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static long getPositionOrDefaultInMediaItem(long j11, State state, Timeline.Window window) {
        if (j11 != C.TIME_UNSET) {
            return j11;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).getDefaultPositionMs();
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period, Timeline.Window window) {
        State.Builder buildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(list);
        Timeline timeline = state.timeline;
        long j11 = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, currentMediaItemIndexInternal, period, window);
        long j12 = mediaItemIndexInNewPlaylist == -1 ? C.TIME_UNSET : j11;
        for (int i11 = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i11 < timeline.getWindowCount(); i11++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, i11, period, window);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            buildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(buildUpon, state, j11, playlistTimeline, mediaItemIndexInNewPlaylist, j12, true, window);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.media3.common.Timeline] */
    private static State getStateWithNewPlaylistAndPosition(State state, @Nullable List<MediaItemData> list, int i11, long j11, Timeline.Window window) {
        State.Builder buildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = list == null ? state.timeline : new PlaylistTimeline(list);
        if (state.playbackState != 1) {
            if (playlistTimeline.isEmpty() || (i11 != -1 && i11 >= playlistTimeline.getWindowCount())) {
                buildUpon.setPlaybackState(4).setIsLoading(false);
            } else {
                buildUpon.setPlaybackState(2);
            }
        }
        return buildStateForNewPosition(buildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i11, j11, false, window);
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(Timeline timeline, Timeline timeline2, Timeline.Window window) {
        if (timeline.getWindowCount() != timeline2.getWindowCount()) {
            return 0;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= timeline.getWindowCount()) {
                return 1;
            }
            Object obj = timeline.getWindow(i11, window).uid;
            Object obj2 = timeline2.getWindow(i11, window).uid;
            boolean z11 = (obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid);
            if (!obj.equals(obj2) && !z11) {
                return 0;
            }
            i11++;
        }
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    public static /* synthetic */ State o(SimpleBasePlayer simpleBasePlayer, State state, List list, int i11, int i12) {
        List<MediaItemData> buildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        for (int i13 = 0; i13 < list.size(); i13++) {
            buildMutablePlaylistFromState.add(i13 + i11, simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i13)));
        }
        State stateWithNewPlaylist = !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, buildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window) : getStateWithNewPlaylistAndPosition(state, buildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), simpleBasePlayer.window);
        if (i12 >= i11) {
            return stateWithNewPlaylist;
        }
        Util.removeRange(buildMutablePlaylistFromState, i12, i11);
        return getStateWithNewPlaylist(stateWithNewPlaylist, buildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    public static /* synthetic */ void p(SimpleBasePlayer simpleBasePlayer, com.google.common.util.concurrent.p1 p1Var) {
        Util.castNonNull(simpleBasePlayer.state);
        simpleBasePlayer.pendingOperations.remove(p1Var);
        if (!simpleBasePlayer.pendingOperations.isEmpty() || simpleBasePlayer.released) {
            return;
        }
        simpleBasePlayer.updateStateAndInformListeners(simpleBasePlayer.getState(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    public static /* synthetic */ void s(SimpleBasePlayer simpleBasePlayer, Player.Listener listener, FlagSet flagSet) {
        simpleBasePlayer.getClass();
        listener.onEvents(simpleBasePlayer, new Player.Events(flagSet));
    }

    @RequiresNonNull({"state"})
    private void setMediaItemsInternal(final List<MediaItem> list, final int i11, final long j11) {
        Assertions.checkArgument(i11 == -1 || i11 >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i11, j11), new ho.p0() { // from class: androidx.media3.common.u0
                @Override // ho.p0
                public final Object get() {
                    return SimpleBasePlayer.a(SimpleBasePlayer.this, list, state, i11, j11);
                }
            });
        }
    }

    @RequiresNonNull({"state"})
    private boolean shouldHandleCommand(int i11) {
        return !this.released && this.state.availableCommands.contains(i11);
    }

    @RequiresNonNull({"state"})
    private void updateStateAndInformListeners(final State state, boolean z11, boolean z12) {
        State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z13 = state2.playWhenReady != state.playWhenReady;
        boolean z14 = state2.playbackState != state.playbackState;
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z11, this.window, this.period);
        boolean equals = state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z12, this.window);
        if (!equals) {
            final int timelineChangeReason = getTimelineChangeReason(state2.timeline, state.timeline, this.window);
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.common.z0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(SimpleBasePlayer.State.this.timeline, timelineChangeReason);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.common.x
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.F(positionDiscontinuityReason, positionInfo, positionInfo2, (Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final MediaItem mediaItem = state.timeline.isEmpty() ? null : state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), this.window).mediaItem;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.common.j0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(MediaItem.this, mediaItemTransitionReason);
                }
            });
        }
        if (!Objects.equals(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.l0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(SimpleBasePlayer.State.this.playerError);
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.m0
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onPlayerError((PlaybackException) Util.castNonNull(SimpleBasePlayer.State.this.playerError));
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: androidx.media3.common.n0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(SimpleBasePlayer.State.this.trackSelectionParameters);
                }
            });
        }
        if (!state2.currentTracks.equals(state.currentTracks)) {
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.common.p0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(SimpleBasePlayer.State.this.currentTracks);
                }
            });
        }
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.common.q0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(SimpleBasePlayer.State.this.currentMetadata);
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.common.r0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.B(SimpleBasePlayer.State.this, (Player.Listener) obj);
                }
            });
        }
        if (z13 || z14) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.common.s0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerStateChanged(r0.playWhenReady, SimpleBasePlayer.State.this.playbackState);
                }
            });
        }
        if (z14) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.common.k1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(SimpleBasePlayer.State.this.playbackState);
                }
            });
        }
        if (z13 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.common.v1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayWhenReadyChanged(r0.playWhenReady, SimpleBasePlayer.State.this.playWhenReadyChangeReason);
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.common.b2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(SimpleBasePlayer.State.this.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.common.c2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(SimpleBasePlayer.isPlaying(SimpleBasePlayer.State.this));
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.common.d2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(SimpleBasePlayer.State.this.playbackParameters);
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.common.e2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(SimpleBasePlayer.State.this.repeatMode);
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.common.t
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(SimpleBasePlayer.State.this.shuffleModeEnabled);
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: androidx.media3.common.u
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekBackIncrementChanged(SimpleBasePlayer.State.this.seekBackIncrementMs);
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: androidx.media3.common.v
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekForwardIncrementChanged(SimpleBasePlayer.State.this.seekForwardIncrementMs);
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: androidx.media3.common.w
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(SimpleBasePlayer.State.this.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: androidx.media3.common.y
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(SimpleBasePlayer.State.this.audioAttributes);
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: androidx.media3.common.z
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(SimpleBasePlayer.State.this.videoSize);
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: androidx.media3.common.a0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(SimpleBasePlayer.State.this.deviceInfo);
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: androidx.media3.common.b0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaylistMetadataChanged(SimpleBasePlayer.State.this.playlistMetadata);
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new c0());
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: androidx.media3.common.e0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSurfaceSizeChanged(r0.surfaceSize.getWidth(), SimpleBasePlayer.State.this.surfaceSize.getHeight());
                }
            });
        }
        if (state2.volume != state.volume) {
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: androidx.media3.common.f0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVolumeChanged(SimpleBasePlayer.State.this.volume);
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.common.g0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceVolumeChanged(r0.deviceVolume, SimpleBasePlayer.State.this.isDeviceMuted);
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: androidx.media3.common.h0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.R(SimpleBasePlayer.State.this, (Player.Listener) obj);
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != C.TIME_UNSET) {
            this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: androidx.media3.common.i0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(SimpleBasePlayer.State.this.timedMetadata);
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: androidx.media3.common.k0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAvailableCommandsChanged(SimpleBasePlayer.State.this.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    @RequiresNonNull({"state"})
    private void updateStateForPendingOperation(com.google.common.util.concurrent.p1<?> p1Var, ho.p0<State> p0Var) {
        updateStateForPendingOperation(p1Var, p0Var, false, false);
    }

    @EnsuresNonNull({"state"})
    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override // androidx.media3.common.Player
    public final void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i11, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i11 >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || list.isEmpty()) {
            return;
        }
        final int min = Math.min(i11, windowCount);
        updateStateForPendingOperation(handleAddMediaItems(min, list), new ho.p0() { // from class: androidx.media3.common.a1
            @Override // ho.p0
            public final Object get() {
                return SimpleBasePlayer.D(SimpleBasePlayer.this, state, list, min);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(@Nullable TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new ho.p0() { // from class: androidx.media3.common.d1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    SimpleBasePlayer.State state2 = SimpleBasePlayer.State.this;
                    build = state2.buildUpon().setDeviceVolume(Math.max(0, state2.deviceVolume - 1)).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get()) : getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state, this.window), getContentPositionMsInternal(this.state, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        return isPlayingAd() ? this.state.adPositionMsSupplier.get() : getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.state.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
        Timeline.Period period = this.period;
        State state = this.state;
        return Util.usToMs(period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup));
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.currentMetadata;
    }

    @uo.g
    public MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        return new MediaItemData.Builder(new PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    @uo.g
    public abstract State getState();

    @Override // androidx.media3.common.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleAddMediaItems(int i11, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleClearVideoOutput(@Nullable Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleDecreaseDeviceVolume(int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleIncreaseDeviceVolume(int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleMoveMediaItems(int i11, int i12, int i13) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleRemoveMediaItems(int i11, int i12) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleReplaceMediaItems(int i11, int i12, List<MediaItem> list) {
        com.google.common.util.concurrent.p1<?> handleAddMediaItems = handleAddMediaItems(i12, list);
        if (i11 == i12) {
            return handleAddMediaItems;
        }
        final com.google.common.util.concurrent.p1<?> handleRemoveMediaItems = handleRemoveMediaItems(i11, i12);
        return Util.transformFutureAsync(handleAddMediaItems, new com.google.common.util.concurrent.x() { // from class: androidx.media3.common.t1
            @Override // com.google.common.util.concurrent.x
            public final com.google.common.util.concurrent.p1 apply(Object obj) {
                return SimpleBasePlayer.r(com.google.common.util.concurrent.p1.this, obj);
            }
        });
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSeek(int i11, long j11, int i12) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetDeviceMuted(boolean z11, int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetDeviceVolume(@IntRange(from = 0) int i11, int i12) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetMediaItems(List<MediaItem> list, int i11, long j11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetPlayWhenReady(boolean z11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetRepeatMode(int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetShuffleModeEnabled(boolean z11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleSetVolume(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @uo.g
    public com.google.common.util.concurrent.p1<?> handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new ho.p0() { // from class: androidx.media3.common.p1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = r0.buildUpon().setDeviceVolume(SimpleBasePlayer.State.this.deviceVolume + 1).build();
                    return build;
                }
            });
        }
    }

    public final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        updateStateAndInformListeners(getState(), false, false);
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex != -1;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i11, int i12, int i13) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i11 >= 0 && i12 >= i11 && i13 >= 0);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && windowCount != 0 && i11 < windowCount) {
            final int min = Math.min(i12, windowCount);
            final int min2 = Math.min(i13, windowCount - (min - i11));
            if (i11 != min && min2 != i11) {
                updateStateForPendingOperation(handleMoveMediaItems(i11, min, min2), new ho.p0() { // from class: androidx.media3.common.o1
                    @Override // ho.p0
                    public final Object get() {
                        return SimpleBasePlayer.I(SimpleBasePlayer.this, state, i11, min, min2);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(2)) {
            updateStateForPendingOperation(handlePrepare(), new ho.p0() { // from class: androidx.media3.common.w1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setPlayerError(null).setPlaybackState(r2.timeline.isEmpty() ? 4 : 2).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(32)) {
            updateStateForPendingOperation(handleRelease(), new ho.p0() { // from class: androidx.media3.common.j1
                @Override // ho.p0
                public final Object get() {
                    return SimpleBasePlayer.l0(SimpleBasePlayer.State.this);
                }
            });
            this.released = true;
            this.listeners.release();
            this.state = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i11, int i12) {
        final int min;
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i11 >= 0 && i12 >= i11);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || windowCount == 0 || i11 >= windowCount || i11 == (min = Math.min(i12, windowCount))) {
            return;
        }
        updateStateForPendingOperation(handleRemoveMediaItems(i11, min), new ho.p0() { // from class: androidx.media3.common.s1
            @Override // ho.p0
            public final Object get() {
                return SimpleBasePlayer.c(SimpleBasePlayer.this, state, i11, min);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i11, int i12, final List<MediaItem> list) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i11 >= 0 && i11 <= i12);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (!shouldHandleCommand(20) || i11 > windowCount) {
            return;
        }
        final int min = Math.min(i12, windowCount);
        updateStateForPendingOperation(handleReplaceMediaItems(i11, min, list), new ho.p0() { // from class: androidx.media3.common.t0
            @Override // ho.p0
            public final Object get() {
                return SimpleBasePlayer.o(SimpleBasePlayer.this, state, list, min, i11);
            }
        });
    }

    @Override // androidx.media3.common.BasePlayer
    public final void seekTo(final int i11, final long j11, int i12, boolean z11) {
        verifyApplicationThreadAndInitState();
        Assertions.checkArgument(i11 == -1 || i11 >= 0);
        final State state = this.state;
        if (shouldHandleCommand(i12)) {
            final boolean z12 = i11 == -1 || isPlayingAd() || (!state.timeline.isEmpty() && i11 >= state.timeline.getWindowCount());
            updateStateForPendingOperation(handleSeek(i11, j11, i12), new ho.p0() { // from class: androidx.media3.common.r1
                @Override // ho.p0
                public final Object get() {
                    return SimpleBasePlayer.e(SimpleBasePlayer.this, z12, state, i11, j11);
                }
            }, !z12, z11);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(final AudioAttributes audioAttributes, boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(35)) {
            updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z11), new ho.p0() { // from class: androidx.media3.common.q1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setAudioAttributes(audioAttributes).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceMuted(final boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z11, 1), new ho.p0() { // from class: androidx.media3.common.m1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setIsDeviceMuted(z11).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceVolume(final int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i11, 1), new ho.p0() { // from class: androidx.media3.common.d0
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setDeviceVolume(i11).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, boolean z11) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z11 ? -1 : this.state.currentMediaItemIndex, z11 ? C.TIME_UNSET : this.state.contentPositionMsSupplier.get());
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(final boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(1)) {
            updateStateForPendingOperation(handleSetPlayWhenReady(z11), new ho.p0() { // from class: androidx.media3.common.s
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setPlayWhenReady(z11, 1).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(final PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(13)) {
            updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new ho.p0() { // from class: androidx.media3.common.y1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setPlaybackParameters(playbackParameters).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(final MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(19)) {
            updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new ho.p0() { // from class: androidx.media3.common.f1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setPlaylistMetadata(mediaMetadata).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(15)) {
            updateStateForPendingOperation(handleSetRepeatMode(i11), new ho.p0() { // from class: androidx.media3.common.g1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setRepeatMode(i11).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(final boolean z11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(14)) {
            updateStateForPendingOperation(handleSetShuffleModeEnabled(z11), new ho.p0() { // from class: androidx.media3.common.b1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setShuffleModeEnabled(z11).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(29)) {
            updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new ho.p0() { // from class: androidx.media3.common.a2
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(@Nullable Surface surface) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surface == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surface), new ho.p0() { // from class: androidx.media3.common.v0
                    @Override // ho.p0
                    public final Object get() {
                        SimpleBasePlayer.State build;
                        build = SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(Size.UNKNOWN).build();
                        return build;
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(@Nullable final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new ho.p0() { // from class: androidx.media3.common.i1
                    @Override // ho.p0
                    public final Object get() {
                        SimpleBasePlayer.State build;
                        build = SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceHolder)).build();
                        return build;
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(@Nullable final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new ho.p0() { // from class: androidx.media3.common.l1
                    @Override // ho.p0
                    public final Object get() {
                        SimpleBasePlayer.State build;
                        build = SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceView.getHolder())).build();
                        return build;
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(27)) {
            if (textureView == null) {
                clearVideoSurface();
            } else {
                final Size size = textureView.isAvailable() ? new Size(textureView.getWidth(), textureView.getHeight()) : Size.ZERO;
                updateStateForPendingOperation(handleSetVideoOutput(textureView), new ho.p0() { // from class: androidx.media3.common.o0
                    @Override // ho.p0
                    public final Object get() {
                        SimpleBasePlayer.State build;
                        build = SimpleBasePlayer.State.this.buildUpon().setSurfaceSize(size).build();
                        return build;
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(24)) {
            updateStateForPendingOperation(handleSetVolume(f11), new ho.p0() { // from class: androidx.media3.common.h1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setVolume(f11).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(3)) {
            updateStateForPendingOperation(handleStop(), new ho.p0() { // from class: androidx.media3.common.u1
                @Override // ho.p0
                public final Object get() {
                    return SimpleBasePlayer.Q(SimpleBasePlayer.this, state);
                }
            });
        }
    }

    public final void verifyApplicationThread() {
        if (Thread.currentThread() != this.applicationLooper.getThread()) {
            throw new IllegalStateException(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
    }

    public SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new HashSet<>();
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.common.e1
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                SimpleBasePlayer.s(SimpleBasePlayer.this, (Player.Listener) obj, flagSet);
            }
        });
    }

    @RequiresNonNull({"state"})
    private void updateStateForPendingOperation(final com.google.common.util.concurrent.p1<?> p1Var, ho.p0<State> p0Var, boolean z11, boolean z12) {
        if (p1Var.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z11, z12);
            return;
        }
        this.pendingOperations.add(p1Var);
        updateStateAndInformListeners(getPlaceholderState(p0Var.get()), z11, z12);
        p1Var.addListener(new Runnable() { // from class: androidx.media3.common.w0
            @Override // java.lang.Runnable
            public final void run() {
                SimpleBasePlayer.p(SimpleBasePlayer.this, p1Var);
            }
        }, new Executor() { // from class: androidx.media3.common.x0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                SimpleBasePlayer.this.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(@Nullable Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, int i11, long j11) {
        verifyApplicationThreadAndInitState();
        if (i11 == -1) {
            State state = this.state;
            int i12 = state.currentMediaItemIndex;
            long j12 = state.contentPositionMsSupplier.get();
            i11 = i12;
            j11 = j12;
        }
        setMediaItemsInternal(list, i11, j11);
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i11), new ho.p0() { // from class: androidx.media3.common.x1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    SimpleBasePlayer.State state2 = SimpleBasePlayer.State.this;
                    build = state2.buildUpon().setDeviceVolume(Math.max(0, state2.deviceVolume - 1)).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i11), new ho.p0() { // from class: androidx.media3.common.y0
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = r0.buildUpon().setDeviceVolume(SimpleBasePlayer.State.this.deviceVolume + 1).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(final boolean z11, int i11) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z11, i11), new ho.p0() { // from class: androidx.media3.common.z1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setIsDeviceMuted(z11).build();
                    return build;
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(final int i11, int i12) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i11, i12), new ho.p0() { // from class: androidx.media3.common.c1
                @Override // ho.p0
                public final Object get() {
                    SimpleBasePlayer.State build;
                    build = SimpleBasePlayer.State.this.buildUpon().setDeviceVolume(i11).build();
                    return build;
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PositionSupplier {
        public static final PositionSupplier ZERO = getConstant(0);

        static /* synthetic */ long b(long j11, long j12, float f11) {
            return j11 + ((long) ((SystemClock.elapsedRealtime() - j12) * f11));
        }

        static PositionSupplier getConstant(final long j11) {
            return new PositionSupplier() { // from class: androidx.media3.common.g2
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.a(j11);
                }
            };
        }

        static PositionSupplier getExtrapolating(final long j11, final float f11) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            return new PositionSupplier() { // from class: androidx.media3.common.f2
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.b(j11, elapsedRealtime, f11);
                }
            };
        }

        long get();

        static /* synthetic */ long a(long j11) {
            return j11;
        }
    }

    public static /* synthetic */ State l0(State state) {
        return state;
    }

    @uo.g
    public State getPlaceholderState(State state) {
        return state;
    }

    public static /* synthetic */ com.google.common.util.concurrent.p1 r(com.google.common.util.concurrent.p1 p1Var, Object obj) {
        return p1Var;
    }
}
