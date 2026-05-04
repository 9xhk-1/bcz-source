package yk;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class k implements j, LifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Set<l> f100175a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Lifecycle f100176b;

    public k(Lifecycle lifecycle) {
        this.f100176b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // yk.j
    public void a(@NonNull l lVar) {
        this.f100175a.remove(lVar);
    }

    @Override // yk.j
    public void b(@NonNull l lVar) {
        this.f100175a.add(lVar);
        if (this.f100176b.getCurrentState() == Lifecycle.State.DESTROYED) {
            lVar.onDestroy();
        } else if (this.f100176b.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            lVar.onStart();
        } else {
            lVar.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = fl.o.l(this.f100175a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = fl.o.l(this.f100175a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = fl.o.l(this.f100175a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStop();
        }
    }
}
