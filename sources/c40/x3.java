package c40;

import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n103#2,13:320\n1#3:333\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:320,13\n*E\n"})
/* loaded from: classes8.dex */
public final class x3<T> extends h40.t0<T> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ThreadLocal<Pair<kotlin.coroutines.d, Object>> f8013e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x3(@m80.k kotlin.coroutines.d r3, @m80.k j00.c<? super T> r4) {
        /*
            r2 = this;
            c40.y3 r0 = c40.y3.f8015a
            kotlin.coroutines.d$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.d r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8013e = r0
            kotlin.coroutines.d r4 = r4.getContext()
            kotlin.coroutines.c$b r0 = kotlin.coroutines.c.f66933w0
            kotlin.coroutines.d$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof c40.m0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = h40.g1.i(r3, r4)
            h40.g1.f(r3, r4)
            r2.h2(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.x3.<init>(kotlin.coroutines.d, j00.c):void");
    }

    @Override // h40.t0, c40.a
    public void Z1(@m80.l Object obj) {
        g2();
        Object a11 = e0.a(obj, this.f58273d);
        j00.c<T> cVar = this.f58273d;
        kotlin.coroutines.d context = cVar.getContext();
        Object i11 = h40.g1.i(context, null);
        x3<?> m11 = i11 != h40.g1.f58220a ? k0.m(cVar, context, i11) : null;
        try {
            this.f58273d.resumeWith(a11);
            yz.g2 g2Var = yz.g2.f100423a;
            if (m11 == null || m11.f2()) {
                h40.g1.f(context, i11);
            }
        } catch (Throwable th2) {
            if (m11 == null || m11.f2()) {
                h40.g1.f(context, i11);
            }
            throw th2;
        }
    }

    @Override // h40.t0
    public void e2() {
        g2();
    }

    public final boolean f2() {
        boolean z11 = this.threadLocalIsSet && this.f8013e.get() == null;
        this.f8013e.remove();
        return !z11;
    }

    public final void g2() {
        if (this.threadLocalIsSet) {
            Pair<kotlin.coroutines.d, Object> pair = this.f8013e.get();
            if (pair != null) {
                h40.g1.f(pair.component1(), pair.component2());
            }
            this.f8013e.remove();
        }
    }

    public final void h2(@m80.k kotlin.coroutines.d dVar, @m80.l Object obj) {
        this.threadLocalIsSet = true;
        this.f8013e.set(yz.h1.a(dVar, obj));
    }
}
