package c40;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n426#2,11:160\n426#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
/* loaded from: classes8.dex */
public final class a1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f7815a;

        /* renamed from: b, reason: collision with root package name */
        public int f7816b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f7815a = obj;
            this.f7816b |= Integer.MIN_VALUE;
            return a1.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k j00.c<?> r4) {
        /*
            boolean r0 = r4 instanceof c40.a1.a
            if (r0 == 0) goto L13
            r0 = r4
            c40.a1$a r0 = (c40.a1.a) r0
            int r1 = r0.f7816b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7816b = r1
            goto L18
        L13:
            c40.a1$a r0 = new c40.a1$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f7815a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f7816b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.e.n(r4)
            goto L52
        L31:
            kotlin.e.n(r4)
            r0.f7816b = r3
            c40.p r4 = new c40.p
            j00.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r4.<init>(r2, r3)
            r4.y()
            java.lang.Object r4 = r4.F()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            if (r4 != r2) goto L4f
            l00.f.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.a1.a(j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object b(long j11, @m80.k j00.c<? super yz.g2> cVar) {
        if (j11 <= 0) {
            return yz.g2.f100423a;
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        if (j11 < Long.MAX_VALUE) {
            d(pVar.getContext()).j(j11, pVar);
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F == kotlin.coroutines.intrinsics.b.l() ? F : yz.g2.f100423a;
    }

    @m80.l
    public static final Object c(long j11, @m80.k j00.c<? super yz.g2> cVar) {
        Object b11 = b(e(j11), cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : yz.g2.f100423a;
    }

    @m80.k
    public static final z0 d(@m80.k kotlin.coroutines.d dVar) {
        d.b bVar = dVar.get(kotlin.coroutines.c.f66933w0);
        z0 z0Var = bVar instanceof z0 ? (z0) bVar : null;
        return z0Var == null ? w0.a() : z0Var;
    }

    public static final long e(long j11) {
        boolean R = kotlin.time.e.R(j11);
        if (R) {
            e.a aVar = kotlin.time.e.f67757b;
            return kotlin.time.e.x(kotlin.time.e.T(j11, kotlin.time.f.x(999999L, DurationUnit.NANOSECONDS)));
        }
        if (R) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
