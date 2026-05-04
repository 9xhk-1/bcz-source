package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class LifecycleService extends Service implements LifecycleOwner {

    @k
    private final ServiceLifecycleDispatcher dispatcher = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    @k
    public Lifecycle getLifecycle() {
        return this.dispatcher.getLifecycle();
    }

    @Override // android.app.Service
    @l
    @CallSuper
    public IBinder onBind(@k Intent intent) {
        g0.p(intent, "intent");
        this.dispatcher.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        this.dispatcher.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.dispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    @n(message = "Deprecated in Java")
    @CallSuper
    public void onStart(@l Intent intent, int i11) {
        this.dispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i11);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@l Intent intent, int i11, int i12) {
        return super.onStartCommand(intent, i11, i12);
    }
}
