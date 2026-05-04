package c40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d1<T> extends h40.t0<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7830e = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public d1(@m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super T> cVar) {
        super(dVar, cVar);
    }

    @Override // h40.t0, c40.a
    public void Z1(@m80.l Object obj) {
        if (k2()) {
            return;
        }
        h40.m.d(IntrinsicsKt__IntrinsicsJvmKt.e(this.f58273d), e0.a(obj, this.f58273d));
    }

    @Override // h40.t0, c40.r2
    public void e0(@m80.l Object obj) {
        Z1(obj);
    }

    @m80.l
    public final Object f2() {
        if (l2()) {
            return kotlin.coroutines.intrinsics.b.l();
        }
        Object h11 = s2.h(f1());
        if (h11 instanceof c0) {
            throw ((c0) h11).f7827a;
        }
        return h11;
    }

    public final /* synthetic */ int g2() {
        return this._decision$volatile;
    }

    public final /* synthetic */ void i2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, x00.l<? super Integer, yz.g2> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void j2(int i11) {
        this._decision$volatile = i11;
    }

    public final boolean k2() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7830e;
        do {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7830e.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean l2() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7830e;
        do {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7830e.compareAndSet(this, 0, 1));
        return true;
    }
}
