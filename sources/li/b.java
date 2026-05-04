package li;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public class b<T extends ViewDataBinding> extends RecyclerView.ViewHolder implements LifecycleOwner {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71393d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final T f71394a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f71395b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f71396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k T binding) {
        super(binding.getRoot());
        g0.p(binding, "binding");
        this.f71394a = binding;
        this.f71395b = e0.c(new x00.a() { // from class: li.a
            @Override // x00.a
            public final Object invoke() {
                LifecycleRegistry d11;
                d11 = b.d(b.this);
                return d11;
            }
        });
        c().markState(Lifecycle.State.INITIALIZED);
    }

    public static final LifecycleRegistry d(b bVar) {
        return new LifecycleRegistry(bVar);
    }

    @k
    public final T b() {
        return this.f71394a;
    }

    public final LifecycleRegistry c() {
        return (LifecycleRegistry) this.f71395b.getValue();
    }

    public final void e() {
        if (!this.f71396c) {
            c().markState(Lifecycle.State.STARTED);
        } else {
            c().markState(Lifecycle.State.RESUMED);
            this.f71396c = false;
        }
    }

    public final void f() {
        c().markState(Lifecycle.State.CREATED);
    }

    public final void g() {
        c().markState(Lifecycle.State.DESTROYED);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @k
    public Lifecycle getLifecycle() {
        return c();
    }

    public final void h() {
        this.f71396c = true;
        c().markState(Lifecycle.State.CREATED);
    }
}
