package h40;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e0<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f58193a = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public e0(boolean z11) {
        this._cur$volatile = new f0(8, z11);
    }

    public final boolean a(@m80.k E e11) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58193a;
        while (true) {
            f0 f0Var = (f0) atomicReferenceFieldUpdater.get(this);
            int a11 = f0Var.a(e11);
            if (a11 == 0) {
                return true;
            }
            if (a11 == 1) {
                androidx.concurrent.futures.a.a(f58193a, this, f0Var, f0Var.r());
            } else if (a11 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58193a;
        while (true) {
            f0 f0Var = (f0) atomicReferenceFieldUpdater.get(this);
            if (f0Var.d()) {
                return;
            } else {
                androidx.concurrent.futures.a.a(f58193a, this, f0Var, f0Var.r());
            }
        }
    }

    public final int c() {
        return ((f0) f58193a.get(this)).g();
    }

    public final /* synthetic */ Object d() {
        return this._cur$volatile;
    }

    public final boolean f() {
        return ((f0) f58193a.get(this)).l();
    }

    public final boolean g() {
        return ((f0) f58193a.get(this)).m();
    }

    public final /* synthetic */ void h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @m80.k
    public final <R> List<R> i(@m80.k x00.l<? super E, ? extends R> lVar) {
        return ((f0) f58193a.get(this)).p(lVar);
    }

    @m80.l
    public final E j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f58193a;
        while (true) {
            f0 f0Var = (f0) atomicReferenceFieldUpdater.get(this);
            E e11 = (E) f0Var.s();
            if (e11 != f0.f58211t) {
                return e11;
            }
            androidx.concurrent.futures.a.a(f58193a, this, f0Var, f0Var.r());
        }
    }

    public final /* synthetic */ void k(Object obj) {
        this._cur$volatile = obj;
    }
}
