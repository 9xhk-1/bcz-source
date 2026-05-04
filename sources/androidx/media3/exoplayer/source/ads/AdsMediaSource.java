package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final MediaSource.Factory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;

    @Nullable
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;

    @Nullable
    private ComponentListener componentListener;

    @Nullable
    final MediaItem.DrmConfiguration contentDrmConfiguration;
    private final MaskingMediaSource contentMediaSource;

    @Nullable
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i11, Exception exc) {
            super(exc);
            this.type = i11;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i11) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + i11, exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) Assertions.checkNotNull(getCause());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class AdMediaSourceHolder {
        private final List<MaskingMediaPeriod> activeMediaPeriods = new ArrayList();
        private MediaItem adMediaItem;
        private MediaSource adMediaSource;

        /* renamed from: id, reason: collision with root package name */
        private final MediaSource.MediaPeriodId f5029id;
        private Timeline timeline;

        public AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f5029id = mediaPeriodId;
        }

        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j11);
            this.activeMediaPeriods.add(maskingMediaPeriod);
            MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new AdPrepareListener((MediaItem) Assertions.checkNotNull(this.adMediaItem)));
            }
            Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return maskingMediaPeriod;
        }

        public long getDurationUs() {
            Timeline timeline = this.timeline;
            return timeline == null ? C.TIME_UNSET : timeline.getPeriod(0, AdsMediaSource.this.period).getDurationUs();
        }

        public void handleSourceInfoRefresh(Timeline timeline) {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i11 = 0; i11 < this.activeMediaPeriods.size(); i11++) {
                    MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i11);
                    maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.f5027id.windowSequenceNumber));
                }
            }
            this.timeline = timeline;
        }

        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        public void initializeWithMediaSource(MediaSource mediaSource, MediaItem mediaItem) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = mediaItem;
            for (int i11 = 0; i11 < this.activeMediaPeriods.size(); i11++) {
                MaskingMediaPeriod maskingMediaPeriod = this.activeMediaPeriods.get(i11);
                maskingMediaPeriod.setMediaSource(mediaSource);
                maskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new AdPrepareListener(mediaItem));
            }
            AdsMediaSource.this.prepareChildSource(this.f5029id, mediaSource);
        }

        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        public void release() {
            if (hasMediaSource()) {
                AdsMediaSource.this.releaseChildSource(this.f5029id);
            }
        }

        public void releaseMediaPeriod(MaskingMediaPeriod maskingMediaPeriod) {
            this.activeMediaPeriods.remove(maskingMediaPeriod);
            maskingMediaPeriod.releasePeriod();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final MediaItem adMediaItem;

        public AdPrepareListener(MediaItem mediaItem) {
            this.adMediaItem = mediaItem;
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(final MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.this.adsLoader.handlePrepareComplete(AdsMediaSource.this, r1.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(final MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            AdsMediaSource.this.createEventDispatcher(mediaPeriodId).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), new DataSpec(((MediaItem.LocalConfiguration) Assertions.checkNotNull(this.adMediaItem.localConfiguration)).uri), SystemClock.elapsedRealtime()), 6, (IOException) AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.this.adsLoader.handlePrepareError(AdsMediaSource.this, r1.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler = Util.createHandlerForCurrentLooper();
        private volatile boolean stopped;

        public ComponentListener() {
        }

        public static /* synthetic */ void a(ComponentListener componentListener, AdPlaybackState adPlaybackState) {
            if (componentListener.stopped) {
                return;
            }
            AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()), 6, (IOException) adLoadException, true);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(final AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.ComponentListener.a(AdsMediaSource.ComponentListener.this, adPlaybackState);
                }
            });
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this(mediaSource, dataSpec, obj, factory, adsLoader, adViewProvider, true);
    }

    private static int checkValidAdPlaybackStateUpdate(AdPlaybackState adPlaybackState, AdPlaybackState adPlaybackState2) {
        Assertions.checkState(adPlaybackState.endsWithLivePostrollPlaceHolder() == adPlaybackState2.endsWithLivePostrollPlaceHolder());
        int i11 = adPlaybackState2.adGroupCount - adPlaybackState.adGroupCount;
        Assertions.checkState(i11 >= 0);
        int i12 = adPlaybackState2.removedAdGroupCount;
        while (i12 < adPlaybackState.adGroupCount) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i12);
            if (adGroup.isLivePostrollPlaceholder()) {
                Assertions.checkState(i12 == adPlaybackState.adGroupCount - 1);
                return i11;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState2.getAdGroup(i12);
            Assertions.checkState(adGroup.count <= adGroup2.count);
            Assertions.checkState(adGroup.timeUs == adGroup2.timeUs);
            for (int i13 = 0; i13 < adGroup.count; i13++) {
                MediaItem mediaItem = adGroup.mediaItems[i13];
                if (mediaItem != null) {
                    Assertions.checkState(mediaItem.equals(adGroup2.mediaItems[i13]));
                }
            }
            i12++;
        }
        return i11;
    }

    @RequiresNonNull({"adPlaybackState"})
    private long[][] getAdDurationsUs() {
        boolean endsWithLivePostrollPlaceHolder = ((AdPlaybackState) Assertions.checkNotNull(this.adPlaybackState)).endsWithLivePostrollPlaceHolder();
        int length = this.adMediaSourceHolders.length + (endsWithLivePostrollPlaceHolder ? 1 : 0);
        long[][] jArr = new long[length][];
        int i11 = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i11 >= adMediaSourceHolderArr.length) {
                break;
            }
            jArr[i11] = new long[adMediaSourceHolderArr[i11].length];
            int i12 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i11];
                if (i12 < adMediaSourceHolderArr2.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i12];
                    jArr[i11][i12] = adMediaSourceHolder == null ? C.TIME_UNSET : adMediaSourceHolder.getDurationUs();
                    i12++;
                }
            }
            i11++;
        }
        if (endsWithLivePostrollPlaceHolder) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    @Nullable
    private static MediaItem.AdsConfiguration getAdsConfiguration(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return null;
        }
        return localConfiguration.adsConfiguration;
    }

    private static AdMediaSourceHolder[][] growAdMediaSourceHolderGrid(AdMediaSourceHolder[][] adMediaSourceHolderArr, int i11) {
        int length = adMediaSourceHolderArr.length + i11;
        AdMediaSourceHolder[][] adMediaSourceHolderArr2 = new AdMediaSourceHolder[length][];
        System.arraycopy(adMediaSourceHolderArr, 0, adMediaSourceHolderArr2, 0, adMediaSourceHolderArr.length);
        for (int length2 = adMediaSourceHolderArr.length; length2 < length; length2++) {
            adMediaSourceHolderArr2[length2] = new AdMediaSourceHolder[0];
        }
        return adMediaSourceHolderArr2;
    }

    private void maybeUpdateAdMediaSources() {
        MediaItem mediaItem;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i11 = 0; i11 < this.adMediaSourceHolders.length; i11++) {
            int i12 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i11];
                if (i12 < adMediaSourceHolderArr.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i12];
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i11);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource()) {
                        MediaItem[] mediaItemArr = adGroup.mediaItems;
                        if (i12 < mediaItemArr.length && (mediaItem = mediaItemArr[i12]) != null) {
                            if (this.contentDrmConfiguration != null) {
                                mediaItem = mediaItem.buildUpon().setDrmConfiguration(this.contentDrmConfiguration).build();
                            }
                            adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(mediaItem), mediaItem);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        Timeline timeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdMediaSourceHolder[adPlaybackState.adGroupCount - (adPlaybackState.endsWithLivePostrollPlaceHolder() ? 1 : 0)][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            Arrays.fill(adMediaSourceHolderArr, new AdMediaSourceHolder[0]);
        } else {
            int checkValidAdPlaybackStateUpdate = checkValidAdPlaybackStateUpdate(adPlaybackState2, adPlaybackState);
            if (checkValidAdPlaybackStateUpdate > 0) {
                this.adMediaSourceHolders = growAdMediaSourceHolderGrid(this.adMediaSourceHolders, checkValidAdPlaybackStateUpdate);
            }
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return Objects.equals(getAdsConfiguration(getMediaItem()), getAdsConfiguration(mediaItem)) && this.contentMediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        if (((AdPlaybackState) Assertions.checkNotNull(this.adPlaybackState)).adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j11);
            maskingMediaPeriod.setMediaSource(this.contentMediaSource);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i11 = mediaPeriodId.adGroupIndex;
        int i12 = mediaPeriodId.adIndexInAdGroup;
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i11];
        if (adMediaSourceHolderArr2.length <= i12) {
            adMediaSourceHolderArr[i11] = (AdMediaSourceHolder[]) Arrays.copyOf(adMediaSourceHolderArr2, i12 + 1);
        }
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[i11][i12];
        if (adMediaSourceHolder == null) {
            adMediaSourceHolder = new AdMediaSourceHolder(mediaPeriodId);
            this.adMediaSourceHolders[i11][i12] = adMediaSourceHolder;
            maybeUpdateAdMediaSources();
        }
        return adMediaSourceHolder.createMediaPeriod(mediaPeriodId, allocator, j11);
    }

    public Object getAdsId() {
        return this.adsId;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        final ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.a
            @Override // java.lang.Runnable
            public final void run() {
                r0.adsLoader.start(r0, r0.adTagDataSpec, r0.adsId, AdsMediaSource.this.adViewProvider, componentListener);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.f5027id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = (AdMediaSourceHolder) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
        adMediaSourceHolder.releaseMediaPeriod(maskingMediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            adMediaSourceHolder.release();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        final ComponentListener componentListener = (ComponentListener) Assertions.checkNotNull(this.componentListener);
        this.componentListener = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                r0.adsLoader.stop(AdsMediaSource.this, componentListener);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(MediaItem mediaItem) {
        this.contentMediaSource.updateMediaItem(mediaItem);
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider, boolean z11) {
        this.contentMediaSource = new MaskingMediaSource(mediaSource, z11);
        this.contentDrmConfiguration = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaSource.getMediaItem().localConfiguration)).drmConfiguration;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.period = new Timeline.Period();
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, final Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            ((AdMediaSourceHolder) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup])).handleSourceInfoRefresh(timeline);
        } else {
            Assertions.checkArgument(timeline.getPeriodCount() == 1);
            this.contentTimeline = timeline;
            this.mainHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.b
                @Override // java.lang.Runnable
                public final void run() {
                    r0.adsLoader.handleContentTimelineChanged(AdsMediaSource.this, timeline);
                }
            });
        }
        maybeUpdateSourceInfo();
    }
}
