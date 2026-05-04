package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultSuitableOutputChecker;
import androidx.media3.exoplayer.SuitableOutputChecker;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {

    @Nullable
    private final SuitableOutputChecker impl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static final class ImplApi23 implements SuitableOutputChecker {
        private AudioDeviceCallback audioDeviceCallback;

        @Nullable
        private AudioManager audioManager;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;

        private ImplApi23() {
        }

        public static /* synthetic */ void b(ImplApi23 implApi23, Context context) {
            AudioManager audioManager;
            Assertions.checkNotNull(implApi23.isSuitableForPlaybackState);
            if (Util.isWear(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                implApi23.audioManager = audioManager;
                AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.1
                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }
                };
                implApi23.audioDeviceCallback = audioDeviceCallback;
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler((Looper) Assertions.checkNotNull(Looper.myLooper())));
                implApi23.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(implApi23.hasSupportedAudioOutput()));
            }
        }

        public static /* synthetic */ void c(ImplApi23 implApi23) {
            AudioManager audioManager = implApi23.audioManager;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) Assertions.checkNotNull(implApi23.audioDeviceCallback));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasSupportedAudioOutput() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) Assertions.checkStateNotNull(this.audioManager)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i11 = Util.SDK_INT;
                if (i11 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i11 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i11 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i11 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkNotNull(this.isSuitableForPlaybackState)).runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.h
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi23.c(DefaultSuitableOutputChecker.ImplApi23.this);
                }
            });
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void enable(final SuitableOutputChecker.Callback callback, final Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(Boolean.TRUE, looper2, looper, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.i
                @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
                public final void onStateChanged(Object obj, Object obj2) {
                    SuitableOutputChecker.Callback.this.onSelectedOutputSuitabilityChanged(((Boolean) obj2).booleanValue());
                }
            });
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.j
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi23.b(DefaultSuitableOutputChecker.ImplApi23.this, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(35)
    public static final class ImplApi35 implements SuitableOutputChecker {
        private static final RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;

        @Nullable
        private MediaRouter2$ControllerCallback controllerCallback;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;
        private MediaRouter2$RouteCallback routeCallback;
        private MediaRouter2 router;

        static {
            RouteDiscoveryPreference build;
            t.a();
            build = s.a(ImmutableList.of(), false).build();
            EMPTY_DISCOVERY_PREFERENCE = build;
        }

        private ImplApi35() {
        }

        public static /* synthetic */ void a(ImplApi35 implApi35) {
            w.a(Assertions.checkNotNull(implApi35.router)).unregisterControllerCallback(n.a(Assertions.checkNotNull(implApi35.controllerCallback)));
            implApi35.controllerCallback = null;
            implApi35.router.unregisterRouteCallback(p.a(Assertions.checkNotNull(implApi35.routeCallback)));
        }

        public static /* synthetic */ void c(ImplApi35 implApi35, Context context) {
            MediaRouter2 mediaRouter2;
            Assertions.checkNotNull(implApi35.isSuitableForPlaybackState);
            mediaRouter2 = MediaRouter2.getInstance(context);
            implApi35.router = mediaRouter2;
            implApi35.routeCallback = new MediaRouter2$RouteCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.1
            };
            final BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = implApi35.isSuitableForPlaybackState;
            Objects.requireNonNull(backgroundThreadStateHandler);
            Executor executor = new Executor() { // from class: androidx.media3.exoplayer.d0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    BackgroundThreadStateHandler.this.runInBackground(runnable);
                }
            };
            implApi35.router.registerRouteCallback(executor, implApi35.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
            MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = new MediaRouter2$ControllerCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.2
                public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                    ImplApi35.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi35.isSelectedOutputSuitableForPlayback(ImplApi35.this.router)));
                }
            };
            implApi35.controllerCallback = mediaRouter2$ControllerCallback;
            implApi35.router.registerControllerCallback(executor, mediaRouter2$ControllerCallback);
            implApi35.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(isSelectedOutputSuitableForPlayback(implApi35.router)));
        }

        private static boolean isRouteSuitableForMediaPlayback(MediaRoute2Info mediaRoute2Info, int i11, boolean z11) {
            int suitabilityStatus;
            suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i11 == 1 || i11 == 2) && z11 : suitabilityStatus == 0;
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkStateNotNull(this.isSuitableForPlaybackState)).runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.e0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi35.a(DefaultSuitableOutputChecker.ImplApi35.this);
                }
            });
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        @SuppressLint({"ThreadSafe"})
        public void enable(final SuitableOutputChecker.Callback callback, final Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(Boolean.TRUE, looper2, looper, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.f0
                @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
                public final void onStateChanged(Object obj, Object obj2) {
                    SuitableOutputChecker.Callback.this.onSelectedOutputSuitabilityChanged(((Boolean) obj2).booleanValue());
                }
            });
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.g0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSuitableOutputChecker.ImplApi35.c(DefaultSuitableOutputChecker.ImplApi35.this, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSelectedOutputSuitableForPlayback(MediaRouter2 mediaRouter2) {
            MediaRouter2.RoutingController systemController;
            RoutingSessionInfo routingSessionInfo;
            int transferReason;
            MediaRouter2.RoutingController systemController2;
            boolean wasTransferInitiatedBySelf;
            MediaRouter2.RoutingController systemController3;
            List selectedRoutes;
            systemController = w.a(Assertions.checkNotNull(mediaRouter2)).getSystemController();
            routingSessionInfo = systemController.getRoutingSessionInfo();
            transferReason = routingSessionInfo.getTransferReason();
            systemController2 = mediaRouter2.getSystemController();
            wasTransferInitiatedBySelf = systemController2.wasTransferInitiatedBySelf();
            systemController3 = mediaRouter2.getSystemController();
            selectedRoutes = systemController3.getSelectedRoutes();
            Iterator it = selectedRoutes.iterator();
            while (it.hasNext()) {
                if (isRouteSuitableForMediaPlayback(c0.a(it.next()), transferReason, wasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }
    }

    public DefaultSuitableOutputChecker() {
        int i11 = Util.SDK_INT;
        if (i11 >= 35) {
            this.impl = new ImplApi35();
        } else if (i11 >= 23) {
            this.impl = new ImplApi23();
        } else {
            this.impl = null;
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.disable();
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void enable(SuitableOutputChecker.Callback callback, Context context, Looper looper, Looper looper2, Clock clock) {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.enable(callback, context, looper, looper2, clock);
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        return suitableOutputChecker == null || suitableOutputChecker.isSelectedOutputSuitableForPlayback();
    }
}
