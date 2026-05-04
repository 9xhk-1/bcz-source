package o40;

import c40.l2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.test.UncaughtExceptionsBeforeTest;
import kotlinx.coroutines.test.UncompletedCoroutinesError;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,330:1\n29#2:331\n29#2:334\n29#2:336\n29#2:338\n16#3:332\n16#3:335\n16#3:337\n16#3:339\n1#4:333\n159#5:340\n*S KotlinDebug\n*F\n+ 1 TestScope.kt\nkotlinx/coroutines/test/TestScopeImpl\n*L\n219#1:331\n246#1:334\n256#1:336\n282#1:338\n219#1:332\n246#1:335\n256#1:337\n282#1:339\n289#1:340\n*E\n"})
/* loaded from: classes8.dex */
public final class q0 extends c40.a<g2> implements n0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f75838d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75839e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<Throwable> f75840f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Object f75841g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c40.r0 f75842h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Throwable, g2> {
        public a(Object obj) {
            super(1, obj, q0.class, "reportException", "reportException(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((q0) this.receiver).l2(th2);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }
    }

    public q0(@m80.k kotlin.coroutines.d dVar) {
        super(dVar, true, true);
        this.f75840f = new ArrayList();
        this.f75841g = new Object();
        this.f75842h = c40.s0.a(getCoroutineContext().plus(b.f75721a).plus(new p40.c(null, new x00.l() { // from class: o40.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g22;
                g22 = q0.g2(q0.this, (Throwable) obj);
                return g22;
            }
        }, 1, null)));
    }

    public static final g2 g2(q0 q0Var, Throwable th2) {
        if (!(th2 instanceof CancellationException)) {
            q0Var.l2(th2);
        }
        return g2.f100423a;
    }

    public static final boolean k2(l2 l2Var) {
        return l2Var.isActive();
    }

    @Override // o40.n0
    @m80.k
    public b0 I() {
        d.b bVar = getContext().get(b0.f75722g);
        kotlin.jvm.internal.g0.m(bVar);
        return (b0) bVar;
    }

    @Override // o40.n0
    @m80.k
    public c40.r0 f0() {
        return this.f75842h;
    }

    public final void h2() {
        p40.a aVar;
        List<Throwable> list;
        synchronized (this.f75841g) {
            try {
                if (this.f75838d) {
                    throw new IllegalStateException("Only a single call to `runTest` can be performed during one test.");
                }
                this.f75838d = true;
                if (this.f75839e) {
                    throw new IllegalStateException("Check failed.");
                }
                aVar = p40.a.f78903a;
                h40.i.a(aVar);
                if (r0.g()) {
                    aVar.q(this.f75841g, new a(this));
                }
                list = this.f75840f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        aVar.E(this.f75841g);
        UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            yz.r.a(uncaughtExceptionsBeforeTest, it.next());
        }
        throw uncaughtExceptionsBeforeTest;
    }

    @m80.k
    public final List<Throwable> i2() {
        List<Throwable> list;
        synchronized (this.f75841g) {
            if (!this.f75838d || this.f75839e) {
                throw new IllegalStateException("Check failed.");
            }
            p40.a.f78903a.E(this.f75841g);
            this.f75839e = true;
            list = this.f75840f;
        }
        return list;
    }

    @m80.k
    public final List<Throwable> j2() {
        List<Throwable> list;
        synchronized (this.f75841g) {
            if (!this.f75838d || this.f75839e) {
                throw new IllegalStateException("Check failed.");
            }
            p40.a.f78903a.E(this.f75841g);
            this.f75839e = true;
            list = this.f75840f;
        }
        List I3 = q30.k0.I3(q30.k0.P0(C(), new x00.l() { // from class: o40.p0
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean k22;
                k22 = q0.k2((l2) obj);
                return Boolean.valueOf(k22);
            }
        }));
        if (list.isEmpty()) {
            if (!I3.isEmpty()) {
                throw new UncompletedCoroutinesError("Active jobs found during the tear-down. Ensure that all coroutines are completed or cancelled by your test. The active jobs: " + I3);
            }
            if (!b0.E0(I(), false, 1, null)) {
                throw new UncompletedCoroutinesError("Unfinished coroutines found during the tear-down. Ensure that all coroutines are completed or cancelled by your test.");
            }
        }
        return list;
    }

    public final void l2(@m80.k Throwable th2) {
        synchronized (this.f75841g) {
            if (this.f75839e) {
                throw th2;
            }
            Iterator<Throwable> it = this.f75840f.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.g0.g(th2, it.next())) {
                    return;
                }
            }
            this.f75840f.add(th2);
            if (this.f75838d) {
                g2 g2Var = g2.f100423a;
            } else {
                UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
                yz.r.a(uncaughtExceptionsBeforeTest, th2);
                throw uncaughtExceptionsBeforeTest;
            }
        }
    }

    @m80.l
    public final Throwable m2() {
        return U0();
    }

    @Override // c40.r2
    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TestScope[");
        sb2.append(this.f75839e ? "test ended" : this.f75838d ? "test started" : "test not started");
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }
}
