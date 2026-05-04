package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.util.concurrent.h2;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    public static /* synthetic */ void a(OfflineLicenseHelper offlineLicenseHelper, DrmSession drmSession, h2 h2Var) {
        offlineLicenseHelper.getClass();
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(offlineLicenseHelper.eventDispatcher);
                offlineLicenseHelper.drmSessionManager.release();
            }
            h2Var.B(error);
        } catch (Throwable th2) {
            h2Var.C(th2);
            drmSession.release(offlineLicenseHelper.eventDispatcher);
            offlineLicenseHelper.drmSessionManager.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DrmSession acquireFirstSessionOnHandlerThread(final int i11, @Nullable final byte[] bArr, final Format format) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(format.drmInitData);
        final h2 F = h2.F();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.c0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.d(OfflineLicenseHelper.this, i11, bArr, F, format);
            }
        });
        try {
            final DrmSession drmSession = (DrmSession) F.get();
            this.drmListenerConditionVariable.block();
            final h2 F2 = h2.F();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.a(OfflineLicenseHelper.this, drmSession, F2);
                }
            });
            try {
                if (F2.get() == 0) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) F2.get());
            } catch (InterruptedException | ExecutionException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (InterruptedException | ExecutionException e12) {
            throw new IllegalStateException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i11, @Nullable byte[] bArr, Format format) throws DrmSession.DrmSessionException {
        final DrmSession acquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i11, bArr, format);
        final h2 F = h2.F();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.f0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.c(OfflineLicenseHelper.this, F, acquireFirstSessionOnHandlerThread);
            }
        });
        try {
            try {
                return (byte[]) Assertions.checkNotNull((byte[]) F.get());
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static /* synthetic */ void b(OfflineLicenseHelper offlineLicenseHelper, h2 h2Var) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.release();
            h2Var.B(null);
        } catch (Throwable th2) {
            h2Var.C(th2);
        }
    }

    public static /* synthetic */ void c(OfflineLicenseHelper offlineLicenseHelper, h2 h2Var, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            h2Var.B(drmSession.getOfflineLicenseKeySetId());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void d(OfflineLicenseHelper offlineLicenseHelper, int i11, byte[] bArr, h2 h2Var, Format format) {
        offlineLicenseHelper.getClass();
        try {
            offlineLicenseHelper.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), PlayerId.UNSET);
            offlineLicenseHelper.drmSessionManager.prepare();
            try {
                offlineLicenseHelper.drmSessionManager.setMode(i11, bArr);
                h2Var.B((DrmSession) Assertions.checkNotNull(offlineLicenseHelper.drmSessionManager.acquireSession(offlineLicenseHelper.eventDispatcher, format)));
            } finally {
            }
        } catch (Throwable th2) {
            h2Var.C(th2);
        }
    }

    public static /* synthetic */ void e(OfflineLicenseHelper offlineLicenseHelper, h2 h2Var, DrmSession drmSession) {
        offlineLicenseHelper.getClass();
        try {
            h2Var.B((Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(drmSession)));
        } finally {
            try {
            } finally {
            }
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        final h2 F = h2.F();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.e0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.b(OfflineLicenseHelper.this, F);
            }
        });
        try {
            F.get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) throws DrmSession.DrmSessionException {
        final h2 F;
        Assertions.checkNotNull(bArr);
        try {
            final DrmSession acquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            F = h2.F();
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.b0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineLicenseHelper.e(OfflineLicenseHelper.this, F, acquireFirstSessionOnHandlerThread);
                }
            });
            try {
                try {
                } finally {
                    releaseManagerOnHandlerThread();
                }
            } catch (InterruptedException | ExecutionException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (DrmSession.DrmSessionException e12) {
            if (e12.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e12;
        }
        return (Pair) F.get();
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(bArr);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z11, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z11, factory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z11, DataSource.Factory factory, @Nullable Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z11, factory)), eventDispatcher);
    }
}
