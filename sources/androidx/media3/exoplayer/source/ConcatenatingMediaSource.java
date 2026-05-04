package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    private static final int MSG_ADD = 1;
    private static final int MSG_MOVE = 3;
    private static final int MSG_ON_COMPLETION = 6;
    private static final int MSG_REMOVE = 2;
    private static final int MSG_SET_SHUFFLE_ORDER = 4;
    private static final int MSG_UPDATE_TIMELINE = 5;
    private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;

    @GuardedBy("this")
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private Set<HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;

    @GuardedBy("this")
    private final Set<HandlerAndRunnable> pendingOnCompletionActions;

    @Nullable
    @GuardedBy("this")
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, ShuffleOrder shuffleOrder, boolean z11) {
            super(z11, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i13] = mediaSourceHolder.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i13] = i11;
                this.firstPeriodInChildIndices[i13] = i12;
                i11 += this.timelines[i13].getWindowCount();
                i12 += this.timelines[i13].getPeriodCount();
                Object[] objArr = this.uids;
                Object obj = mediaSourceHolder.uid;
                objArr[i13] = obj;
                this.childIndexByUid.put(obj, Integer.valueOf(i13));
                i13++;
            }
            this.windowCount = i11;
            this.periodCount = i12;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int i11) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i11 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int i11) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i11 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int i11) {
            return this.uids[i11];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int i11) {
            return this.firstPeriodInChildIndices[i11];
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int i11) {
            return this.firstWindowInChildIndices[i11];
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodCount;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int i11) {
            return this.timelines[i11];
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.windowCount;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HandlerAndRunnable {
        private final Handler handler;
        private final Runnable runnable;

        public HandlerAndRunnable(Handler handler, Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }

        public void dispatch() {
            this.handler.post(this.runnable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaSourceHolder {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z11) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z11);
        }

        public void reset(int i11, int i12) {
            this.childIndex = i11;
            this.firstWindowIndexInChild = i12;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MessageData<T> {
        public final T customData;
        public final int index;

        @Nullable
        public final HandlerAndRunnable onCompletionAction;

        public MessageData(int i11, T t11, @Nullable HandlerAndRunnable handlerAndRunnable) {
            this.index = i11;
            this.customData = t11;
            this.onCompletionAction = handlerAndRunnable;
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }

    private void addMediaSourceInternal(int i11, MediaSourceHolder mediaSourceHolder) {
        if (i11 > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i11 - 1);
            mediaSourceHolder.reset(i11, mediaSourceHolder2.firstWindowIndexInChild + mediaSourceHolder2.mediaSource.getTimeline().getWindowCount());
        } else {
            mediaSourceHolder.reset(i11, 0);
        }
        correctOffsets(i11, 1, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i11, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        } else {
            disableChildSource(mediaSourceHolder);
        }
    }

    private void addMediaSourcesInternal(int i11, Collection<MediaSourceHolder> collection) {
        Iterator<MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i11, it.next());
            i11++;
        }
    }

    @GuardedBy("this")
    private void addPublicMediaSources(int i11, Collection<MediaSource> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new MediaSourceHolder(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i11, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new MessageData(i11, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void correctOffsets(int i11, int i12, int i13) {
        while (i11 < this.mediaSourceHolders.size()) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i11);
            mediaSourceHolder.childIndex += i12;
            mediaSourceHolder.firstWindowIndexInChild += i13;
            i11++;
        }
    }

    @Nullable
    @GuardedBy("this")
    private HandlerAndRunnable createOnCompletionAction(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        HandlerAndRunnable handlerAndRunnable = new HandlerAndRunnable(handler, runnable);
        this.pendingOnCompletionActions.add(handlerAndRunnable);
        return handlerAndRunnable;
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

    private synchronized void dispatchOnCompletionActions(Set<HandlerAndRunnable> set) {
        try {
            Iterator<HandlerAndRunnable> it = set.iterator();
            while (it.hasNext()) {
                it.next().dispatch();
            }
            this.pendingOnCompletionActions.removeAll(set);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) Assertions.checkNotNull(this.playbackThreadHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                MessageData messageData = (MessageData) Util.castNonNull(message.obj);
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, ((Collection) messageData.customData).size());
                addMediaSourcesInternal(messageData.index, (Collection) messageData.customData);
                scheduleTimelineUpdate(messageData.onCompletionAction);
                return true;
            case 2:
                MessageData messageData2 = (MessageData) Util.castNonNull(message.obj);
                int i11 = messageData2.index;
                int intValue = ((Integer) messageData2.customData).intValue();
                if (i11 == 0 && intValue == this.shuffleOrder.getLength()) {
                    this.shuffleOrder = this.shuffleOrder.cloneAndClear();
                } else {
                    this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i11, intValue);
                }
                for (int i12 = intValue - 1; i12 >= i11; i12--) {
                    removeMediaSourceInternal(i12);
                }
                scheduleTimelineUpdate(messageData2.onCompletionAction);
                return true;
            case 3:
                MessageData messageData3 = (MessageData) Util.castNonNull(message.obj);
                ShuffleOrder shuffleOrder = this.shuffleOrder;
                int i13 = messageData3.index;
                ShuffleOrder cloneAndRemove = shuffleOrder.cloneAndRemove(i13, i13 + 1);
                this.shuffleOrder = cloneAndRemove;
                this.shuffleOrder = cloneAndRemove.cloneAndInsert(((Integer) messageData3.customData).intValue(), 1);
                moveMediaSourceInternal(messageData3.index, ((Integer) messageData3.customData).intValue());
                scheduleTimelineUpdate(messageData3.onCompletionAction);
                return true;
            case 4:
                MessageData messageData4 = (MessageData) Util.castNonNull(message.obj);
                this.shuffleOrder = (ShuffleOrder) messageData4.customData;
                scheduleTimelineUpdate(messageData4.onCompletionAction);
                return true;
            case 5:
                updateTimelineAndScheduleOnCompletionActions();
                return true;
            case 6:
                dispatchOnCompletionActions((Set) Util.castNonNull(message.obj));
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void moveMediaSourceInternal(int i11, int i12) {
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        int i13 = this.mediaSourceHolders.get(min).firstWindowIndexInChild;
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i12, list.remove(i11));
        while (min <= max) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(min);
            mediaSourceHolder.childIndex = min;
            mediaSourceHolder.firstWindowIndexInChild = i13;
            i13 += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            min++;
        }
    }

    @GuardedBy("this")
    private void movePublicMediaSource(int i11, int i12, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        List<MediaSourceHolder> list = this.mediaSourcesPublic;
        list.add(i12, list.remove(i11));
        if (handler2 != null) {
            handler2.obtainMessage(3, new MessageData(i11, Integer.valueOf(i12), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removeMediaSourceInternal(int i11) {
        MediaSourceHolder remove = this.mediaSourceHolders.remove(i11);
        this.mediaSourceByUid.remove(remove.uid);
        correctOffsets(i11, -1, -remove.mediaSource.getTimeline().getWindowCount());
        remove.isRemoved = true;
        maybeReleaseChildSource(remove);
    }

    @GuardedBy("this")
    private void removePublicMediaSources(int i11, int i12, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i11, i12);
        if (handler2 != null) {
            handler2.obtainMessage(2, new MessageData(i11, Integer.valueOf(i12), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    @GuardedBy("this")
    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(4, new MessageData(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(mediaSourceHolder.childIndex + 1).firstWindowIndexInChild - mediaSourceHolder.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<HandlerAndRunnable> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(6, set).sendToTarget();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId copyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new MediaSourceHolder(new FakeMediaSource(), this.useLazyPreparation);
            mediaSourceHolder.isRemoved = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(copyWithPeriodUid);
        MaskingMediaPeriod createPeriod = mediaSourceHolder.mediaSource.createPeriod(copyWithPeriodUid, allocator, j11);
        this.mediaSourceByMediaPeriod.put(createPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return createPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new ConcatenatedTimeline(this.mediaSourcesPublic, this.shuffleOrder.getLength() != this.mediaSourcesPublic.size() ? this.shuffleOrder.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size()) : this.shuffleOrder, this.isAtomic);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return PLACEHOLDER_MEDIA_ITEM;
    }

    public synchronized MediaSource getMediaSource(int i11) {
        return this.mediaSourcesPublic.get(i11).mediaSource;
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int i11, int i12) {
        movePublicMediaSource(i11, i12, null, null);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public synchronized void prepareSourceInternal(@Nullable TransferListener transferListener) {
        try {
            super.prepareSourceInternal(transferListener);
            this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.c
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean handleMessage;
                    handleMessage = ConcatenatingMediaSource.this.handleMessage(message);
                    return handleMessage;
                }
            });
            if (this.mediaSourcesPublic.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
                addMediaSourcesInternal(0, this.mediaSourcesPublic);
                scheduleTimelineUpdate();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).f5027id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public synchronized void releaseSourceInternal() {
        try {
            super.releaseSourceInternal();
            this.mediaSourceHolders.clear();
            this.enabledMediaSourceHolders.clear();
            this.mediaSourceByUid.clear();
            this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            Handler handler = this.playbackThreadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.playbackThreadHandler = null;
            }
            this.timelineUpdateScheduled = false;
            this.nextTimelineUpdateOnCompletionActions.clear();
            dispatchOnCompletionActions(this.pendingOnCompletionActions);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized MediaSource removeMediaSource(int i11) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i11);
        removePublicMediaSources(i11, i11 + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i11, int i12) {
        removePublicMediaSources(i11, i12, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    public ConcatenatingMediaSource(boolean z11, MediaSource... mediaSourceArr) {
        this(z11, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    private void scheduleTimelineUpdate(@Nullable HandlerAndRunnable handlerAndRunnable) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (handlerAndRunnable != null) {
            this.nextTimelineUpdateOnCompletionActions.add(handlerAndRunnable);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i11 = 0; i11 < mediaSourceHolder.activeMediaPeriodIds.size(); i11++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i11).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i11) {
        return i11 + mediaSourceHolder.firstWindowIndexInChild;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    public ConcatenatingMediaSource(boolean z11, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z11, false, shuffleOrder, mediaSourceArr);
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized void moveMediaSource(int i11, int i12, Handler handler, Runnable runnable) {
        movePublicMediaSource(i11, i12, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i11, int i12, Handler handler, Runnable runnable) {
        removePublicMediaSources(i11, i12, handler, runnable);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    public ConcatenatingMediaSource(boolean z11, boolean z12, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z11;
        this.useLazyPreparation = z12;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    public synchronized MediaSource removeMediaSource(int i11, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i11);
        removePublicMediaSources(i11, i11 + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i11, MediaSource mediaSource) {
        addPublicMediaSources(i11, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized void addMediaSources(int i11, Collection<MediaSource> collection) {
        addPublicMediaSources(i11, collection, null, null);
    }

    public synchronized void addMediaSource(int i11, MediaSource mediaSource, Handler handler, Runnable runnable) {
        addPublicMediaSources(i11, Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(int i11, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i11, collection, handler, runnable);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FakeMediaSource extends BaseMediaSource {
        private FakeMediaSource() {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.PLACEHOLDER_MEDIA_ITEM;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        public void releaseSourceInternal() {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }
}
