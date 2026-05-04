package c40;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes8.dex */
public final class g<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Thread f7859d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final o1 f7860e;

    public g(@m80.k kotlin.coroutines.d dVar, @m80.k Thread thread, @m80.l o1 o1Var) {
        super(dVar, true, true);
        this.f7859d = thread;
        this.f7860e = o1Var;
    }

    @Override // c40.r2
    public void e0(@m80.l Object obj) {
        if (kotlin.jvm.internal.g0.g(Thread.currentThread(), this.f7859d)) {
            return;
        }
        Thread thread = this.f7859d;
        b bVar = c.f7825a;
        if (bVar != null) {
            bVar.g(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T e2() {
        b bVar = c.f7825a;
        if (bVar != null) {
            bVar.d();
        }
        try {
            o1 o1Var = this.f7860e;
            if (o1Var != null) {
                o1.U(o1Var, false, 1, null);
            }
            while (true) {
                try {
                    o1 o1Var2 = this.f7860e;
                    long h02 = o1Var2 != null ? o1Var2.h0() : Long.MAX_VALUE;
                    if (e()) {
                        break;
                    }
                    b bVar2 = c.f7825a;
                    if (bVar2 != null) {
                        bVar2.c(this, h02);
                    } else {
                        LockSupport.parkNanos(this, h02);
                    }
                    if (Thread.interrupted()) {
                        l0(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    o1 o1Var3 = this.f7860e;
                    if (o1Var3 != null) {
                        o1.w(o1Var3, false, 1, null);
                    }
                    throw th2;
                }
            }
            o1 o1Var4 = this.f7860e;
            if (o1Var4 != null) {
                o1.w(o1Var4, false, 1, null);
            }
            T t11 = (T) s2.h(f1());
            c0 c0Var = t11 instanceof c0 ? (c0) t11 : null;
            if (c0Var == null) {
                return t11;
            }
            throw c0Var.f7827a;
        } finally {
            b bVar3 = c.f7825a;
            if (bVar3 != null) {
                bVar3.h();
            }
        }
    }

    @Override // c40.r2
    public boolean q1() {
        return true;
    }
}
