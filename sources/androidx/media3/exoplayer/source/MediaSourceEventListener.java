package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface MediaSourceEventListener {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void dispatchEvent(final Consumer<MediaSourceEventListener> consumer) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final MediaSourceEventListener mediaSourceEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        Consumer.this.accept(mediaSourceEventListener);
                    }
                });
            }
        }

        public void downstreamFormatChanged(int i11, @Nullable Format format, int i12, @Nullable Object obj, long j11) {
            downstreamFormatChanged(new MediaLoadData(1, i11, format, i12, obj, Util.usToMs(j11), C.TIME_UNSET));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i11) {
            loadCanceled(loadEventInfo, i11, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i11) {
            loadCompleted(loadEventInfo, i11, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i11, IOException iOException, boolean z11) {
            loadError(loadEventInfo, i11, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z11);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i11) {
            loadStarted(loadEventInfo, i11, 0);
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
        }

        public void upstreamDiscarded(int i11, long j11, long j12) {
            upstreamDiscarded(new MediaLoadData(1, i11, null, 3, null, Util.usToMs(j11), Util.usToMs(j12)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i11, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i11;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
            loadCanceled(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
            loadCompleted(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12, IOException iOException, boolean z11) {
            loadError(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)), iOException, z11);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i11, int i12) {
            loadStarted(loadEventInfo, i11, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i12);
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j11) {
            return new EventDispatcher(this.listenerAndHandlers, i11, mediaPeriodId);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
            loadStarted(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.t
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onDownstreamFormatChanged(r0.windowIndex, MediaSourceEventListener.EventDispatcher.this.mediaPeriodId, mediaLoadData);
                }
            });
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.y
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onUpstreamDiscarded(MediaSourceEventListener.EventDispatcher.this.windowIndex, mediaPeriodId, mediaLoadData);
                }
            });
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.x
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onLoadCanceled(r0.windowIndex, MediaSourceEventListener.EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.v
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onLoadCompleted(r0.windowIndex, MediaSourceEventListener.EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z11) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.w
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onLoadError(r0.windowIndex, MediaSourceEventListener.EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z11);
                }
            });
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12, int i14) {
            loadStarted(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)), i14);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            loadStarted(loadEventInfo, mediaLoadData, 0);
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final int i11) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.u
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onLoadStarted(r0.windowIndex, MediaSourceEventListener.EventDispatcher.this.mediaPeriodId, loadEventInfo, mediaLoadData, i11);
                }
            });
        }
    }

    default void onDownstreamFormatChanged(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onUpstreamDiscarded(int i11, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadStarted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i12) {
    }

    default void onLoadError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z11) {
    }
}
