package zf;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import zf.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class b<T, VH extends d> extends p50.e<T, VH> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f102598f = 8;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f102599b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Lifecycle f102600c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Lifecycle f102601d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public VH f102602e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, VH extends d> implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final WeakReference<b<T, VH>> f102603a;

        public a(@m80.k b<T, VH> binder) {
            g0.p(binder, "binder");
            this.f102603a = new WeakReference<>(binder);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@m80.k LifecycleOwner owner) {
            d dVar;
            g0.p(owner, "owner");
            b<T, VH> bVar = this.f102603a.get();
            if (bVar == 0 || (dVar = bVar.f102602e) == null) {
                return;
            }
            dVar.i();
            bVar.z(dVar);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(@m80.k LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(@m80.k LifecycleOwner lifecycleOwner) {
            super.onResume(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(@m80.k LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: zf.b$b, reason: collision with other inner class name */
    public static final class C1394b implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<T, VH> f102604a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ VH f102605b;

        public C1394b(b<T, VH> bVar, VH vh2) {
            this.f102604a = bVar;
            this.f102605b = vh2;
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
            this.f102604a.r(true, this.f102605b);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            g0.p(owner, "owner");
            super.onResume(owner);
            this.f102604a.r(false, this.f102605b);
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

    public b(@m80.k LifecycleOwner owner, @m80.l Lifecycle lifecycle) {
        g0.p(owner, "owner");
        this.f102599b = owner;
        this.f102600c = lifecycle;
        this.f102601d = owner.getLifecycle();
        owner.getLifecycle().addObserver(new a(this));
    }

    @Override // p50.e
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void l(@m80.k VH holder) {
        g0.p(holder, "holder");
        holder.j();
    }

    @Override // p50.e
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void m(@m80.k VH holder) {
        g0.p(holder, "holder");
        z(holder);
    }

    @m80.k
    public final Lifecycle p() {
        return this.f102601d;
    }

    @m80.k
    public final LifecycleOwner q() {
        return this.f102599b;
    }

    public final void r(boolean z11, VH vh2) {
        w(z11);
        x(z11, vh2);
    }

    public abstract void s(@m80.k VH vh2, T t11);

    @Override // p50.e
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void g(@m80.k VH holder, @m80.k T item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        s(holder, item);
    }

    @m80.k
    public abstract VH u(@m80.k LayoutInflater layoutInflater, @m80.k ViewGroup viewGroup);

    @Override // p50.e
    @m80.k
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final VH i(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        VH u11 = u(inflater, parent);
        this.f102602e = u11;
        u11.getLifecycle().addObserver(new C1394b(this, u11));
        u11.k(this.f102600c);
        u11.h();
        return u11;
    }

    public void x(boolean z11, @m80.k VH holder) {
        g0.p(holder, "holder");
    }

    @Override // p50.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void k(@m80.k VH holder) {
        g0.p(holder, "holder");
        holder.g();
    }

    public void z(@m80.k VH holder) {
        g0.p(holder, "holder");
    }

    public /* synthetic */ b(LifecycleOwner lifecycleOwner, Lifecycle lifecycle, int i11, v vVar) {
        this(lifecycleOwner, (i11 & 2) != 0 ? null : lifecycle);
    }

    public void w(boolean z11) {
    }
}
