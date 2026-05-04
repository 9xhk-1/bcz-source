package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class ReportFragment extends Fragment {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    @l
    private ActivityInitializationListener processListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @o
        public final void dispatch$lifecycle_runtime_release(@k Activity activity, @k Lifecycle.Event event) {
            g0.p(activity, "activity");
            g0.p(event, "event");
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
            } else if (activity instanceof LifecycleOwner) {
                Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        @w00.j(name = ct.d.f46852f)
        @k
        public final ReportFragment get(@k Activity activity) {
            g0.p(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(ReportFragment.REPORT_FRAGMENT_TAG);
            g0.n(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) findFragmentByTag;
        }

        @o
        public final void injectIfNeededIn(@k Activity activity) {
            g0.p(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.Companion.registerIn(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(ReportFragment.REPORT_FRAGMENT_TAG) == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), ReportFragment.REPORT_FRAGMENT_TAG).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private Companion() {
        }

        @o
        public static /* synthetic */ void get$annotations(Activity activity) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        @k
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @o
            public final void registerIn(@k Activity activity) {
                g0.p(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            }

            private Companion() {
            }
        }

        @o
        public static final void registerIn(@k Activity activity) {
            Companion.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@k Activity activity) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@k Activity activity) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@k Activity activity, @l Bundle bundle) {
            g0.p(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@k Activity activity) {
            g0.p(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@k Activity activity) {
            g0.p(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@k Activity activity) {
            g0.p(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@k Activity activity) {
            g0.p(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@k Activity activity) {
            g0.p(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@k Activity activity) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@k Activity activity, @k Bundle bundle) {
            g0.p(activity, "activity");
            g0.p(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@k Activity activity) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@k Activity activity) {
            g0.p(activity, "activity");
        }
    }

    private final void dispatch(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = Companion;
            Activity activity = getActivity();
            g0.o(activity, "activity");
            companion.dispatch$lifecycle_runtime_release(activity, event);
        }
    }

    private final void dispatchCreate(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onCreate();
        }
    }

    private final void dispatchResume(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onResume();
        }
    }

    private final void dispatchStart(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onStart();
        }
    }

    @w00.j(name = ct.d.f46852f)
    @k
    public static final ReportFragment get(@k Activity activity) {
        return Companion.get(activity);
    }

    @o
    public static final void injectIfNeededIn(@k Activity activity) {
        Companion.injectIfNeededIn(activity);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@l Bundle bundle) {
        super.onActivityCreated(bundle);
        dispatchCreate(this.processListener);
        dispatch(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispatch(Lifecycle.Event.ON_DESTROY);
        this.processListener = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dispatch(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        dispatchResume(this.processListener);
        dispatch(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        dispatchStart(this.processListener);
        dispatch(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        dispatch(Lifecycle.Event.ON_STOP);
    }

    public final void setProcessListener(@l ActivityInitializationListener activityInitializationListener) {
        this.processListener = activityInitializationListener;
    }
}
