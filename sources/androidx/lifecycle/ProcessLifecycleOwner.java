package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final long TIMEOUT_MS = 700;

    @l
    private Handler handler;
    private int resumedCounter;
    private int startedCounter;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private boolean pauseSent = true;
    private boolean stopSent = true;

    @k
    private final LifecycleRegistry registry = new LifecycleRegistry(this);

    @k
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.h
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(ProcessLifecycleOwner.this);
        }
    };

    @k
    private final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class Api29Impl {

        @k
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @o
        @DoNotInline
        public static final void registerActivityLifecycleCallbacks(@k Activity activity, @k Application.ActivityLifecycleCallbacks callback) {
            g0.p(activity, "activity");
            g0.p(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.newInstance;
        }

        @o
        public final void init$lifecycle_process_release(@k Context context) {
            g0.p(context, "context");
            ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner this$0) {
        g0.p(this$0, "this$0");
        this$0.dispatchPauseIfNeeded$lifecycle_process_release();
        this$0.dispatchStopIfNeeded$lifecycle_process_release();
    }

    @o
    @k
    public static final LifecycleOwner get() {
        return Companion.get();
    }

    public final void activityPaused$lifecycle_process_release() {
        int i11 = this.resumedCounter - 1;
        this.resumedCounter = i11;
        if (i11 == 0) {
            Handler handler = this.handler;
            g0.m(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i11 = this.resumedCounter + 1;
        this.resumedCounter = i11;
        if (i11 == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                g0.m(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i11 = this.startedCounter + 1;
        this.startedCounter = i11;
        if (i11 == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(@k Context context) {
        g0.p(context, "context");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        g0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@k Activity activity, @l Bundle bundle) {
                ReportFragment.ActivityInitializationListener activityInitializationListener;
                g0.p(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment reportFragment = ReportFragment.Companion.get(activity);
                    activityInitializationListener = ProcessLifecycleOwner.this.initializationListener;
                    reportFragment.setProcessListener(activityInitializationListener);
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@k Activity activity) {
                g0.p(activity, "activity");
                ProcessLifecycleOwner.this.activityPaused$lifecycle_process_release();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            @RequiresApi(29)
            public void onActivityPreCreated(@k Activity activity, @l Bundle bundle) {
                g0.p(activity, "activity");
                final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
                ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@k Activity activity2) {
                        g0.p(activity2, "activity");
                        ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@k Activity activity2) {
                        g0.p(activity2, "activity");
                        ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@k Activity activity) {
                g0.p(activity, "activity");
                ProcessLifecycleOwner.this.activityStopped$lifecycle_process_release();
            }
        });
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @k
    public Lifecycle getLifecycle() {
        return this.registry;
    }
}
