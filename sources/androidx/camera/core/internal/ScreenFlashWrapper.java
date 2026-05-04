package androidx.camera.core.internal;

import androidx.annotation.GuardedBy;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String TAG = "ScreenFlashWrapper";

    @GuardedBy(vb.a.f93813p)
    private boolean isClearScreenFlashPending;

    @k
    private final Object lock;

    @l
    @GuardedBy(vb.a.f93813p)
    private ImageCapture.ScreenFlashListener pendingListener;

    @l
    private final ImageCapture.ScreenFlash screenFlash;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final ScreenFlashWrapper from(@l ImageCapture.ScreenFlash screenFlash) {
            return new ScreenFlashWrapper(screenFlash, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, v vVar) {
        this(screenFlash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(ScreenFlashWrapper this$0) {
        g0.p(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (this$0.pendingListener == null) {
                    Logger.w(TAG, "apply: pendingListener is null!");
                }
                this$0.completePendingScreenFlashListener();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void completePendingScreenFlashClear() {
        g2 g2Var;
        synchronized (this.lock) {
            try {
                if (this.isClearScreenFlashPending) {
                    ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                    if (screenFlash != null) {
                        screenFlash.clear();
                        g2Var = g2.f100423a;
                    } else {
                        g2Var = null;
                    }
                    if (g2Var == null) {
                        Logger.e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    Logger.w(TAG, "completePendingScreenFlashClear: none pending!");
                }
                this.isClearScreenFlashPending = false;
                g2 g2Var2 = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            try {
                ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
                if (screenFlashListener != null) {
                    screenFlashListener.onCompleted();
                }
                this.pendingListener = null;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @o
    @k
    public static final ScreenFlashWrapper from(@l ImageCapture.ScreenFlash screenFlash) {
        return Companion.from(screenFlash);
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long j11, @k ImageCapture.ScreenFlashListener screenFlashListener) {
        g2 g2Var;
        g0.p(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            g2Var = g2.f100423a;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j11, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.c
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$2(ScreenFlashWrapper.this);
                }
            });
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            Logger.e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }

    @l
    public final ImageCapture.ScreenFlash getBaseScreenFlash() {
        return this.screenFlash;
    }

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }
}
