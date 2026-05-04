package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface DrmSessionEventListener {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void drmKeysLoaded() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmKeysLoaded(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmKeysRemoved(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmKeysRestored(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i11) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmSessionAcquired(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId, i11);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmSessionManagerError(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                final DrmSessionEventListener drmSessionEventListener = next.listener;
                Util.postOrRun(next.handler, new Runnable() { // from class: androidx.media3.exoplayer.drm.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmSessionReleased(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            Iterator<ListenerAndHandler> it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(next);
                }
            }
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
    }

    default void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionReleased(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    default void onDrmSessionAcquired(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i12) {
    }

    default void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }
}
