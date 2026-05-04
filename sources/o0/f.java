package o0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f extends Lifecycle {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f75459a = new f();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f75460b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements LifecycleOwner {
        @Override // androidx.lifecycle.LifecycleOwner
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f getLifecycle() {
            return f.f75459a;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@m80.k LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        a aVar = f75460b;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    @m80.k
    public Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    @m80.k
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@m80.k LifecycleObserver lifecycleObserver) {
    }
}
