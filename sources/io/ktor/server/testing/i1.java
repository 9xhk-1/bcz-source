package io.ktor.server.testing;

import c40.l2;
import java.net.SocketTimeoutException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xy.f2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.UtilsKt$socketTimeoutKiller$killJob$1", f = "Utils.kt", i = {0}, l = {51}, m = "invokeSuspend", n = {"cur"}, s = {"J$0"})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f61888a;

        /* renamed from: b, reason: collision with root package name */
        public int f61889b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<Long> f61890c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l2 f61891d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f61892e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x00.a<Long> aVar, l2 l2Var, long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f61890c = aVar;
            this.f61891d = l2Var;
            this.f61892e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f61890c, this.f61891d, this.f61892e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f61889b
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                long r3 = r7.f61888a
                kotlin.e.n(r8)
                goto L3d
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                kotlin.e.n(r8)
                x00.a<java.lang.Long> r8 = r7.f61890c
                java.lang.Object r8 = r8.invoke()
                java.lang.Number r8 = (java.lang.Number) r8
                long r3 = r8.longValue()
            L28:
                c40.l2 r8 = r7.f61891d
                boolean r8 = r8.isActive()
                if (r8 == 0) goto L57
                long r5 = r7.f61892e
                r7.f61888a = r3
                r7.f61889b = r2
                java.lang.Object r8 = c40.a1.b(r5, r7)
                if (r8 != r0) goto L3d
                return r0
            L3d:
                x00.a<java.lang.Long> r8 = r7.f61890c
                java.lang.Object r8 = r8.invoke()
                java.lang.Number r8 = (java.lang.Number) r8
                long r5 = r8.longValue()
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 == 0) goto L4f
                r3 = r5
                goto L28
            L4f:
                java.net.SocketTimeoutException r8 = new java.net.SocketTimeoutException
                java.lang.String r0 = "Socket timeout elapsed"
                r8.<init>(r0)
                throw r8
            L57:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.i1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void b(@m80.k c40.r0 r0Var, @m80.l rw.d1 d1Var, @m80.k l2 job, @m80.k x00.a<Long> extract) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(job, "job");
        kotlin.jvm.internal.g0.p(extract, "extract");
        Long e11 = d1Var != null ? d1Var.e() : null;
        if (e11 != null) {
            f(r0Var, e11.longValue(), job, extract);
        }
    }

    public static final void c(@m80.k m mVar, @m80.k String description, @m80.k x00.l<? super l, g2> body) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(body, "body");
        body.invoke(l.f61900a);
    }

    @m80.k
    public static final Throwable d(@m80.k Throwable th2, @m80.k cx.z data) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        kotlin.jvm.internal.g0.p(data, "data");
        if (th2 instanceof SocketTimeoutException) {
            return rw.f1.h(data, th2);
        }
        Throwable cause = th2.getCause();
        if (!((cause != null ? f2.a(cause) : null) instanceof SocketTimeoutException)) {
            return th2;
        }
        Throwable cause2 = th2.getCause();
        return rw.f1.h(data, cause2 != null ? f2.a(cause2) : null);
    }

    public static final void e(@m80.k String comment, @m80.k x00.l<? super m, g2> body) {
        kotlin.jvm.internal.g0.p(comment, "comment");
        kotlin.jvm.internal.g0.p(body, "body");
        body.invoke(m.f61903a);
    }

    public static final void f(@m80.k c40.r0 r0Var, long j11, @m80.k l2 job, @m80.k x00.a<Long> extract) {
        final l2 f11;
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(job, "job");
        kotlin.jvm.internal.g0.p(extract, "extract");
        f11 = c40.k.f(r0Var, null, null, new a(extract, job, j11, null), 3, null);
        job.z0(new x00.l() { // from class: io.ktor.server.testing.h1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = i1.g(l2.this, (Throwable) obj);
                return g11;
            }
        });
    }

    public static final g2 g(l2 l2Var, Throwable th2) {
        l2.a.b(l2Var, null, 1, null);
        return g2.f100423a;
    }
}
