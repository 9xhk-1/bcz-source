package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface MediaSource {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public static final class MediaPeriodId {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final int nextAdGroupIndex;
        public final Object periodUid;
        public final long windowSequenceNumber;

        public MediaPeriodId(Object obj) {
            this(obj, -1L);
        }

        public MediaPeriodId copyWithPeriodUid(Object obj) {
            return this.periodUid.equals(obj) ? this : new MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
        }

        public MediaPeriodId copyWithWindowSequenceNumber(long j11) {
            return this.windowSequenceNumber == j11 ? this : new MediaPeriodId(this.periodUid, this.adGroupIndex, this.adIndexInAdGroup, j11, this.nextAdGroupIndex);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodId)) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            return this.periodUid.equals(mediaPeriodId.periodUid) && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber && this.nextAdGroupIndex == mediaPeriodId.nextAdGroupIndex;
        }

        public int hashCode() {
            return ((((((((527 + this.periodUid.hashCode()) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
        }

        public boolean isAd() {
            return this.adGroupIndex != -1;
        }

        public MediaPeriodId(Object obj, long j11) {
            this(obj, -1, -1, j11, -1);
        }

        public MediaPeriodId(Object obj, long j11, int i11) {
            this(obj, -1, -1, j11, i11);
        }

        public MediaPeriodId(Object obj, int i11, int i12, long j11) {
            this(obj, i11, i12, j11, -1);
        }

        private MediaPeriodId(Object obj, int i11, int i12, long j11, int i13) {
            this.periodUid = obj;
            this.adGroupIndex = i11;
            this.adIndexInAdGroup = i12;
            this.windowSequenceNumber = j11;
            this.nextAdGroupIndex = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline);
    }

    @UnstableApi
    void addDrmEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener);

    @UnstableApi
    void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    @UnstableApi
    default boolean canUpdateMediaItem(MediaItem mediaItem) {
        return false;
    }

    @UnstableApi
    MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator, long j11);

    @UnstableApi
    void disable(MediaSourceCaller mediaSourceCaller);

    @UnstableApi
    void enable(MediaSourceCaller mediaSourceCaller);

    @Nullable
    @UnstableApi
    default Timeline getInitialTimeline() {
        return null;
    }

    @UnstableApi
    MediaItem getMediaItem();

    @UnstableApi
    default boolean isSingleWindow() {
        return true;
    }

    @UnstableApi
    void maybeThrowSourceInfoRefreshError() throws IOException;

    @UnstableApi
    @Deprecated
    default void prepareSource(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener) {
        prepareSource(mediaSourceCaller, transferListener, PlayerId.UNSET);
    }

    @UnstableApi
    void prepareSource(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener, PlayerId playerId);

    @UnstableApi
    void releasePeriod(MediaPeriod mediaPeriod);

    @UnstableApi
    void releaseSource(MediaSourceCaller mediaSourceCaller);

    @UnstableApi
    void removeDrmEventListener(DrmSessionEventListener drmSessionEventListener);

    @UnstableApi
    void removeEventListener(MediaSourceEventListener mediaSourceEventListener);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {

        @UnstableApi
        public static final Factory UNSUPPORTED = MediaSourceFactory.UNSUPPORTED;

        @UnstableApi
        MediaSource createMediaSource(MediaItem mediaItem);

        @UnstableApi
        int[] getSupportedTypes();

        @UnstableApi
        Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider);

        @UnstableApi
        Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy);

        @UnstableApi
        @Deprecated
        default Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            return this;
        }

        @UnstableApi
        @uo.a
        default Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i11) {
            return this;
        }

        @UnstableApi
        default Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            return this;
        }

        @UnstableApi
        default Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }

    @UnstableApi
    default void updateMediaItem(MediaItem mediaItem) {
    }
}
