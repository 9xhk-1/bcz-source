package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LifecycleDispatcher {

    @k
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();

    @k
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            g0.p(activity, "activity");
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }

    private LifecycleDispatcher() {
    }

    @o
    public static final void init(@k Context context) {
        g0.p(context, "context");
        if (initialized.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        g0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}
