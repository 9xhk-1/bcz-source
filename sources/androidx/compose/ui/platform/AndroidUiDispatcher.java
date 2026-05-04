package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.HandlerCompat;
import c40.h1;
import java.util.ArrayList;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n*L\n1#1,193:1\n32#2,2:194\n32#2,2:196\n32#2,2:198\n32#2,2:200\n32#2,2:202\n32#2,2:204\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:194,2\n87#1:196,2\n98#1:198,2\n114#1:200,2\n124#1:202,2\n134#1:204,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher extends c40.m0 {

    @m80.k
    private final Choreographer choreographer;

    @m80.k
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;

    @m80.k
    private final MonotonicFrameClock frameClock;

    @m80.k
    private final Handler handler;

    @m80.k
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;

    @m80.k
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    @m80.k
    private List<Choreographer.FrameCallback> toRunOnFrame;

    @m80.k
    private final a00.m<Runnable> toRunTrampolined;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final yz.c0<kotlin.coroutines.d> Main$delegate = yz.e0.c(new x00.a<kotlin.coroutines.d>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // x00.a
        public final kotlin.coroutines.d invoke() {
            boolean isMainThread;
            isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(isMainThread ? Choreographer.getInstance() : (Choreographer) c40.i.f(h1.e(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), HandlerCompat.createAsync(Looper.getMainLooper()), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    });

    @m80.k
    private static final ThreadLocal<kotlin.coroutines.d> currentThread = new ThreadLocal<kotlin.coroutines.d>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        public kotlin.coroutines.d initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(myLooper), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final kotlin.coroutines.d getCurrentThread() {
            boolean isMainThread;
            isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
            if (isMainThread) {
                return getMain();
            }
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) AndroidUiDispatcher.currentThread.get();
            if (dVar != null) {
                return dVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        @m80.k
        public final kotlin.coroutines.d getMain() {
            return (kotlin.coroutines.d) AndroidUiDispatcher.Main$delegate.getValue();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, kotlin.jvm.internal.v vVar) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable s11;
        synchronized (this.lock) {
            s11 = this.toRunTrampolined.s();
        }
        return s11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j11) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).doFrame(j11);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z11;
        do {
            Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z11 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(runnable);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m80.k
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @m80.k
    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(@m80.k Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(frameCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeFrameCallback$ui_release(@m80.k Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new a00.m<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }
}
