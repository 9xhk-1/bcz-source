package zf;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class d extends RecyclerView.ViewHolder implements LifecycleOwner {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102607d = 8;

    /* renamed from: a, reason: collision with root package name */
    public boolean f102608a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f102609b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Lifecycle f102610c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements DefaultLifecycleObserver {
        public a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onDestroy(LifecycleOwner lifecycleOwner) {
            super.onDestroy(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner owner) {
            g0.p(owner, "owner");
            super.onPause(owner);
            d.this.d().setCurrentState(Lifecycle.State.CREATED);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            g0.p(owner, "owner");
            super.onResume(owner);
            if (d.this.f102608a) {
                d.this.d().setCurrentState(Lifecycle.State.RESUMED);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k View itemView) {
        super(itemView);
        g0.p(itemView, "itemView");
        this.f102609b = e0.c(new x00.a() { // from class: zf.c
            @Override // x00.a
            public final Object invoke() {
                LifecycleRegistry f11;
                f11 = d.f(d.this);
                return f11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleRegistry d() {
        return (LifecycleRegistry) this.f102609b.getValue();
    }

    public static final LifecycleRegistry f(d dVar) {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(dVar);
        lifecycleRegistry.markState(Lifecycle.State.INITIALIZED);
        return lifecycleRegistry;
    }

    @m80.l
    public final Lifecycle e() {
        return this.f102610c;
    }

    public final void g() {
        this.f102608a = true;
        d().markState(Lifecycle.State.RESUMED);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @m80.k
    public Lifecycle getLifecycle() {
        return d();
    }

    public final void h() {
        d().markState(Lifecycle.State.CREATED);
    }

    public final void i() {
        d().markState(Lifecycle.State.DESTROYED);
    }

    public final void j() {
        this.f102608a = false;
        d().markState(Lifecycle.State.CREATED);
    }

    public final void k(@m80.l Lifecycle lifecycle) {
        this.f102610c = lifecycle;
        if (lifecycle != null) {
            lifecycle.addObserver(new a());
        }
    }
}
