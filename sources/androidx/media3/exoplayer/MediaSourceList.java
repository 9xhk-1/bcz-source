package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MediaSourceList {
    private static final String TAG = "MediaSourceList";
    private final HandlerWrapper eventHandler;
    private final AnalyticsCollector eventListener;
    private boolean isPrepared;
    private final MediaSourceListInfoRefreshListener mediaSourceListInfoListener;

    @Nullable
    private TransferListener mediaTransferListener;
    private final PlayerId playerId;
    private ShuffleOrder shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod = new IdentityHashMap<>();
    private final Map<Object, MediaSourceHolder> mediaSourceByUid = new HashMap();
    private final List<MediaSourceHolder> mediaSourceHolders = new ArrayList();
    private final HashMap<MediaSourceHolder, MediaSourceAndListener> childSources = new HashMap<>();
    private final Set<MediaSourceHolder> enabledMediaSourceHolders = new HashSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {

        /* renamed from: id, reason: collision with root package name */
        private final MediaSourceHolder f4605id;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.f4605id = mediaSourceHolder;
        }

        @Nullable
        private Pair<Integer, MediaSource.MediaPeriodId> getEventParameters(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId = MediaSourceList.getMediaPeriodIdForChildMediaPeriodId(this.f4605id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return null;
                }
                mediaPeriodId2 = mediaPeriodIdForChildMediaPeriodId;
            }
            return Pair.create(Integer.valueOf(MediaSourceList.getWindowIndexForChildWindowIndex(this.f4605id, i11)), mediaPeriodId2);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.m3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDownstreamFormatChanged(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, mediaLoadData);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.r3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDrmKeysLoaded(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.k3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDrmKeysRemoved(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDrmKeysRestored(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int i12) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.q3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDrmSessionAcquired(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, i12);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDrmSessionManagerError(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.o3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onDrmSessionReleased(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCanceled(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.j3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onLoadCanceled(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCompleted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.p3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onLoadCompleted(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z11) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.i3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onLoadError(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, loadEventInfo, mediaLoadData, iOException, z11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadStarted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final int i12) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onLoadStarted(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) eventParameters.second, loadEventInfo, mediaLoadData, i12);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
            final Pair<Integer, MediaSource.MediaPeriodId> eventParameters = getEventParameters(i11, mediaPeriodId);
            if (eventParameters != null) {
                MediaSourceList.this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSourceList.this.eventListener.onUpstreamDiscarded(((Integer) r1.first).intValue(), (MediaSource.MediaPeriodId) Assertions.checkNotNull((MediaSource.MediaPeriodId) eventParameters.second), mediaLoadData);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaSourceAndListener {
        public final MediaSource.MediaSourceCaller caller;
        public final ForwardingEventListener eventListener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaSourceHolder implements MediaSourceInfoHolder {
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z11) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z11);
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Timeline getTimeline() {
            return this.mediaSource.getTimeline();
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Object getUid() {
            return this.uid;
        }

        public void reset(int i11) {
            this.firstWindowIndexInChild = i11;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, PlayerId playerId) {
        this.playerId = playerId;
        this.mediaSourceListInfoListener = mediaSourceListInfoRefreshListener;
        this.eventListener = analyticsCollector;
        this.eventHandler = handlerWrapper;
    }

    private void correctOffsets(int i11, int i12) {
        while (i11 < this.mediaSourceHolders.size()) {
            this.mediaSourceHolders.get(i11).firstWindowIndexInChild += i12;
            i11++;
        }
    }

    private void disableChildSource(MediaSourceHolder mediaSourceHolder) {
        MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    private void disableUnusedMediaSources() {
        Iterator<MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        MediaSourceAndListener mediaSourceAndListener = this.childSources.get(mediaSourceHolder);
        if (mediaSourceAndListener != null) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i11 = 0; i11 < mediaSourceHolder.activeMediaPeriodIds.size(); i11++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i11).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i11) {
        return i11 + mediaSourceHolder.firstWindowIndexInChild;
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) Assertions.checkNotNull(this.childSources.remove(mediaSourceHolder));
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
        }
    }

    private void prepareChildSource(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.mediaSource;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.f3
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                MediaSourceList.this.mediaSourceListInfoListener.onPlaylistUpdateRequested();
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.childSources.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, mediaSourceCaller, forwardingEventListener));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), forwardingEventListener);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, this.playerId);
    }

    private void removeMediaSourcesInternal(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            MediaSourceHolder remove = this.mediaSourceHolders.remove(i13);
            this.mediaSourceByUid.remove(remove.uid);
            correctOffsets(i13, -remove.mediaSource.getTimeline().getWindowCount());
            remove.isRemoved = true;
            if (this.isPrepared) {
                maybeReleaseChildSource(remove);
            }
        }
    }

    public Timeline addMediaSources(int i11, List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.shuffleOrder = shuffleOrder;
            for (int i12 = i11; i12 < list.size() + i11; i12++) {
                MediaSourceHolder mediaSourceHolder = list.get(i12 - i11);
                if (i12 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i12 - 1);
                    mediaSourceHolder.reset(mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
                } else {
                    mediaSourceHolder.reset(0);
                }
                correctOffsets(i12, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
                this.mediaSourceHolders.add(i12, mediaSourceHolder);
                this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
                if (this.isPrepared) {
                    prepareChildSource(mediaSourceHolder);
                    if (this.mediaSourceByMediaPeriod.isEmpty()) {
                        this.enabledMediaSourceHolders.add(mediaSourceHolder);
                    } else {
                        disableChildSource(mediaSourceHolder);
                    }
                }
            }
        }
        return createTimeline();
    }

    public Timeline clear(@Nullable ShuffleOrder shuffleOrder) {
        if (shuffleOrder == null) {
            shuffleOrder = this.shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(0, getSize());
        return createTimeline();
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId copyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByUid.get(mediaSourceHolderUid));
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(copyWithPeriodUid);
        MaskingMediaPeriod createPeriod = mediaSourceHolder.mediaSource.createPeriod(copyWithPeriodUid, allocator, j11);
        this.mediaSourceByMediaPeriod.put(createPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return createPeriod;
    }

    public Timeline createTimeline() {
        if (this.mediaSourceHolders.isEmpty()) {
            return Timeline.EMPTY;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.mediaSourceHolders.size(); i12++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i12);
            mediaSourceHolder.firstWindowIndexInChild = i11;
            i11 += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
        }
        return new PlaylistTimeline(this.mediaSourceHolders, this.shuffleOrder);
    }

    public ShuffleOrder getShuffleOrder() {
        return this.shuffleOrder;
    }

    public int getSize() {
        return this.mediaSourceHolders.size();
    }

    public boolean isPrepared() {
        return this.isPrepared;
    }

    public Timeline moveMediaSource(int i11, int i12, ShuffleOrder shuffleOrder) {
        return moveMediaSourceRange(i11, i11 + 1, i12, shuffleOrder);
    }

    public Timeline moveMediaSourceRange(int i11, int i12, int i13, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i11 >= 0 && i11 <= i12 && i12 <= getSize() && i13 >= 0);
        this.shuffleOrder = shuffleOrder;
        if (i11 == i12 || i11 == i13) {
            return createTimeline();
        }
        int min = Math.min(i11, i13);
        int max = Math.max(((i12 - i11) + i13) - 1, i12 - 1);
        int i14 = this.mediaSourceHolders.get(min).firstWindowIndexInChild;
        Util.moveItems(this.mediaSourceHolders, i11, i12, i13);
        while (min <= max) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(min);
            mediaSourceHolder.firstWindowIndexInChild = i14;
            i14 += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            min++;
        }
        return createTimeline();
    }

    public void prepare(@Nullable TransferListener transferListener) {
        Assertions.checkState(!this.isPrepared);
        this.mediaTransferListener = transferListener;
        for (int i11 = 0; i11 < this.mediaSourceHolders.size(); i11++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i11);
            prepareChildSource(mediaSourceHolder);
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        }
        this.isPrepared = true;
    }

    public void release() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            try {
                mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            } catch (RuntimeException e11) {
                Log.e(TAG, "Failed to release child source.", e11);
            }
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.enabledMediaSourceHolders.clear();
        this.isPrepared = false;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).f5027id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    public Timeline removeMediaSourceRange(int i11, int i12, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(i11 >= 0 && i11 <= i12 && i12 <= getSize());
        this.shuffleOrder = shuffleOrder;
        removeMediaSourcesInternal(i11, i12);
        return createTimeline();
    }

    public Timeline setMediaSources(List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        removeMediaSourcesInternal(0, this.mediaSourceHolders.size());
        return addMediaSources(this.mediaSourceHolders.size(), list, shuffleOrder);
    }

    public Timeline setShuffleOrder(ShuffleOrder shuffleOrder) {
        int size = getSize();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
        }
        this.shuffleOrder = shuffleOrder;
        return createTimeline();
    }

    public Timeline updateMediaSourcesWithMediaItems(int i11, int i12, List<MediaItem> list) {
        Assertions.checkArgument(i11 >= 0 && i11 <= i12 && i12 <= getSize());
        Assertions.checkArgument(list.size() == i12 - i11);
        for (int i13 = i11; i13 < i12; i13++) {
            this.mediaSourceHolders.get(i13).mediaSource.updateMediaItem(list.get(i13 - i11));
        }
        return createTimeline();
    }
}
