package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import ho.p0;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class BasePreloadManager<T> {
    private final Handler applicationHandler;
    private final ListenerSet<PreloadManagerListener> listeners;
    private final Object lock = new Object();
    private final Map<MediaItem, BasePreloadManager<T>.MediaSourceHolder> mediaItemMediaSourceHolderMap;
    private final MediaSource.Factory mediaSourceFactory;
    protected final Comparator<T> rankingDataComparator;

    @GuardedBy(vb.a.f93813p)
    private final PriorityQueue<BasePreloadManager<T>.MediaSourceHolder> sourceHolderPriorityQueue;
    private final TargetPreloadStatusControl<T> targetPreloadStatusControl;

    @Nullable
    @GuardedBy(vb.a.f93813p)
    private TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class BuilderBase<T> {
        protected p0<MediaSource.Factory> mediaSourceFactorySupplier;
        protected final Comparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, p0<MediaSource.Factory> p0Var) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = p0Var;
        }

        public abstract BasePreloadManager<T> build();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class MediaSourceHolder implements Comparable<BasePreloadManager<T>.MediaSourceHolder> {
        public final MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public MediaSourceHolder(BasePreloadManager basePreloadManager, MediaSource mediaSource, T t11) {
            this(mediaSource, t11, C.TIME_UNSET);
        }

        public MediaSourceHolder(MediaSource mediaSource, T t11, long j11) {
            this.mediaSource = mediaSource;
            this.rankingData = t11;
            this.startPositionUs = j11;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }

    public BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.applicationHandler = createHandlerForCurrentOrMainLooper;
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new ListenerSet<>(createHandlerForCurrentOrMainLooper.getLooper(), Clock.DEFAULT, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.source.preload.f
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                BasePreloadManager.f((PreloadManagerListener) obj, flagSet);
            }
        });
        this.mediaItemMediaSourceHolderMap = new HashMap();
        this.sourceHolderPriorityQueue = new PriorityQueue<>();
    }

    public static /* synthetic */ void a(BasePreloadManager basePreloadManager, final MediaSource mediaSource) {
        basePreloadManager.listeners.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.a
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((PreloadManagerListener) obj).onCompleted(MediaSource.this.getMediaItem());
            }
        });
        basePreloadManager.maybeAdvanceToNextSource(mediaSource);
    }

    public static /* synthetic */ void c(BasePreloadManager basePreloadManager, final PreloadException preloadException, MediaSource mediaSource) {
        basePreloadManager.listeners.sendEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.source.preload.b
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((PreloadManagerListener) obj).onError(PreloadException.this);
            }
        });
        basePreloadManager.maybeAdvanceToNextSource(mediaSource);
    }

    @GuardedBy(vb.a.f93813p)
    private boolean isPreloading(MediaSource mediaSource) {
        return !this.sourceHolderPriorityQueue.isEmpty() && ((MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek())).mediaSource == mediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeAdvanceToNextSource(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    do {
                        this.sourceHolderPriorityQueue.poll();
                        if (this.sourceHolderPriorityQueue.isEmpty()) {
                            break;
                        }
                    } while (!maybeStartPreloadNextSource());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy(vb.a.f93813p)
    private boolean maybeStartPreloadNextSource() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.sourceHolderPriorityQueue.peek());
        TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolder.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        if (targetPreloadStatus != null) {
            preloadSourceInternal(mediaSourceHolder.mediaSource, mediaSourceHolder.startPositionUs);
            return true;
        }
        clearSourceInternal(mediaSourceHolder.mediaSource);
        return false;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public final void add(MediaItem mediaItem, T t11) {
        add(this.mediaSourceFactory.createMediaSource(mediaItem), (MediaSource) t11);
    }

    public void addListener(PreloadManagerListener preloadManagerListener) {
        this.listeners.add(preloadManagerListener);
    }

    public void clearListeners() {
        verifyApplicationThread();
        this.listeners.clear();
    }

    public abstract void clearSourceInternal(MediaSource mediaSource);

    @Nullable
    public final MediaSource getMediaSource(MediaItem mediaItem) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    @Nullable
    public final TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (!isPreloading(mediaSource)) {
                    return null;
                }
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                this.sourceHolderPriorityQueue.clear();
                this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
                while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.sourceHolderPriorityQueue.poll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPreloadCompleted(final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.a(BasePreloadManager.this, mediaSource);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPreloadError(final PreloadException preloadException, final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.c(BasePreloadManager.this, preloadException, mediaSource);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onPreloadSkipped(final MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasePreloadManager.this.maybeAdvanceToNextSource(mediaSource);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void preloadSourceInternal(MediaSource mediaSource, long j11);

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    public abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(MediaItem mediaItem) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public void removeListener(PreloadManagerListener preloadManagerListener) {
        verifyApplicationThread();
        this.listeners.remove(preloadManagerListener);
    }

    public final void reset() {
        Iterator<BasePreloadManager<T>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public final void add(MediaSource mediaSource, T t11) {
        MediaSource createMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(createMediaSourceForPreloading.getMediaItem(), new MediaSourceHolder(this, createMediaSourceForPreloading, t11));
    }

    public final boolean remove(MediaSource mediaSource) {
        MediaItem mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public void releaseInternal() {
    }

    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    public static /* synthetic */ void f(PreloadManagerListener preloadManagerListener, FlagSet flagSet) {
    }
}
