package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.SessionResetPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    private static final String TAG = "SyncCaptureSessionImpl";
    private final ForceCloseDeferrableSurface mCloseSurfaceQuirk;
    private final AtomicBoolean mClosed;

    @Nullable
    @GuardedBy("mObjectLock")
    private List<DeferrableSurface> mDeferrableSurfaces;
    private final ForceCloseCaptureSession mForceCloseSessionQuirk;
    private final Object mObjectLock;

    @Nullable
    @GuardedBy("mObjectLock")
    com.google.common.util.concurrent.p1<List<Void>> mOpenSessionBlockerFuture;
    private final RequestMonitor mRequestMonitor;

    @NonNull
    private final ScheduledExecutorService mScheduledExecutorService;
    private final SessionResetPolicy mSessionResetPolicy;

    public SynchronizedCaptureSessionImpl(@NonNull Quirks quirks, @NonNull Quirks quirks2, @NonNull CaptureSessionRepository captureSessionRepository, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.mObjectLock = new Object();
        this.mClosed = new AtomicBoolean(false);
        this.mCloseSurfaceQuirk = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.mRequestMonitor = new RequestMonitor(quirks.contains(CaptureSessionStuckQuirk.class) || quirks.contains(IncorrectCaptureStateQuirk.class));
        this.mForceCloseSessionQuirk = new ForceCloseCaptureSession(quirks2);
        this.mSessionResetPolicy = new SessionResetPolicy(quirks2);
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    private void closeCreatedSession() {
        Iterator<SynchronizedCaptureSession> it = this.mCaptureSessionRepository.getCaptureSessions().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.p1 g(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list, List list2) {
        if (synchronizedCaptureSessionImpl.mSessionResetPolicy.needAbortCapture()) {
            synchronizedCaptureSessionImpl.closeCreatedSession();
        }
        synchronizedCaptureSessionImpl.debugLog("start openCaptureSession");
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    public static /* synthetic */ void h(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        synchronizedCaptureSessionImpl.debugLog("Session call super.close()");
        super.close();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.captureBurstRequests(list, this.mRequestMonitor.createMonitorListener(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        if (!this.mClosed.compareAndSet(false, true)) {
            debugLog("close() has been called. Skip this invocation.");
            return;
        }
        if (this.mSessionResetPolicy.needAbortCapture()) {
            try {
                debugLog("Call abortCaptures() before closing session.");
                abortCaptures();
            } catch (Exception e11) {
                debugLog("Exception when calling abortCaptures()" + e11);
            }
        }
        debugLog("Session call close()");
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.p3
            @Override // java.lang.Runnable
            public final void run() {
                SynchronizedCaptureSessionImpl.h(SynchronizedCaptureSessionImpl.this);
            }
        }, getExecutor());
    }

    public void debugLog(String str) {
        Logger.d(TAG, "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        super.finishClose();
        this.mRequestMonitor.stop();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    @NonNull
    public com.google.common.util.concurrent.p1<Void> getOpeningBlocker() {
        return Futures.makeTimeoutFuture(1500L, this.mScheduledExecutorService, this.mRequestMonitor.getRequestsProcessedFuture());
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void onCameraDeviceError(int i11) {
        super.onCameraDeviceError(i11);
        if (i11 == 5) {
            synchronized (this.mObjectLock) {
                try {
                    if (isCameraCaptureSessionOpen() && this.mDeferrableSurfaces != null) {
                        debugLog("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<DeferrableSurface> it = this.mDeferrableSurfaces.iterator();
                        while (it.hasNext()) {
                            it.next().close();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mObjectLock) {
            this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
        }
        debugLog("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        debugLog("Session onConfigured()");
        this.mForceCloseSessionQuirk.onSessionConfigured(synchronizedCaptureSession, this.mCaptureSessionRepository.getCreatingCaptureSessions(), this.mCaptureSessionRepository.getCaptureSessions(), new ForceCloseCaptureSession.OnConfigured() { // from class: androidx.camera.camera2.internal.o3
            @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
            public final void run(SynchronizedCaptureSession synchronizedCaptureSession2) {
                super/*androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl*/.onConfigured(synchronizedCaptureSession2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    @NonNull
    public com.google.common.util.concurrent.p1<Void> openCaptureSession(@NonNull final CameraDevice cameraDevice, @NonNull final SessionConfigurationCompat sessionConfigurationCompat, @NonNull final List<DeferrableSurface> list) {
        com.google.common.util.concurrent.p1<Void> nonCancellationPropagating;
        synchronized (this.mObjectLock) {
            try {
                List<SynchronizedCaptureSession> captureSessions = this.mCaptureSessionRepository.getCaptureSessions();
                ArrayList arrayList = new ArrayList();
                Iterator<SynchronizedCaptureSession> it = captureSessions.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getOpeningBlocker());
                }
                com.google.common.util.concurrent.p1<List<Void>> successfulAsList = Futures.successfulAsList(arrayList);
                this.mOpenSessionBlockerFuture = successfulAsList;
                nonCancellationPropagating = Futures.nonCancellationPropagating(FutureChain.from(successfulAsList).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.q3
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final com.google.common.util.concurrent.p1 apply(Object obj) {
                        return SynchronizedCaptureSessionImpl.g(SynchronizedCaptureSessionImpl.this, cameraDevice, sessionConfigurationCompat, list, (List) obj);
                    }
                }, getExecutor()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.setSingleRepeatingRequest(captureRequest, this.mRequestMonitor.createMonitorListener(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    @NonNull
    public com.google.common.util.concurrent.p1<List<Surface>> startWithDeferrableSurface(@NonNull List<DeferrableSurface> list, long j11) {
        com.google.common.util.concurrent.p1<List<Surface>> startWithDeferrableSurface;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = list;
            startWithDeferrableSurface = super.startWithDeferrableSurface(list, j11);
        }
        return startWithDeferrableSurface;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean stop;
        synchronized (this.mObjectLock) {
            try {
                if (isCameraCaptureSessionOpen()) {
                    this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
                } else {
                    com.google.common.util.concurrent.p1<List<Void>> p1Var = this.mOpenSessionBlockerFuture;
                    if (p1Var != null) {
                        p1Var.cancel(true);
                    }
                }
                stop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stop;
    }
}
