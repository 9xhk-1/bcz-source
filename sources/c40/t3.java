package c40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t3 extends q2 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7986g = AtomicIntegerFieldUpdater.newUpdater(t3.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f7987e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public k1 f7988f;

    private final /* synthetic */ void J(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, x00.l<? super Integer, yz.g2> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    @Override // c40.q2
    public boolean C() {
        return true;
    }

    @Override // c40.q2
    public void D(@m80.l Throwable th2) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7986g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    return;
                }
                I(i11);
                throw new KotlinNothingValueException();
            }
        } while (!f7986g.compareAndSet(this, i11, 2));
        this.f7987e.interrupt();
        f7986g.set(this, 3);
    }

    public final void F() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7986g;
        while (true) {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        I(i11);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f7986g.compareAndSet(this, i11, 1)) {
                k1 k1Var = this.f7988f;
                if (k1Var != null) {
                    k1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final /* synthetic */ int G() {
        return this._state$volatile;
    }

    public final Void I(int i11) {
        throw new IllegalStateException(("Illegal state " + i11).toString());
    }

    public final /* synthetic */ void K(int i11) {
        this._state$volatile = i11;
    }

    public final void L(@m80.k l2 l2Var) {
        int i11;
        this.f7988f = p2.B(l2Var, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7986g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2 || i11 == 3) {
                    return;
                }
                I(i11);
                throw new KotlinNothingValueException();
            }
        } while (!f7986g.compareAndSet(this, i11, 0));
    }
}
