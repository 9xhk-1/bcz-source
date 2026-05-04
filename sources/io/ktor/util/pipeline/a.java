package io.ktor.util.pipeline;

import io.ktor.utils.io.c0;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class a<TSubject, TContext> extends d<TSubject, TContext> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> f62037b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62038c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public TSubject f62039d;

    /* renamed from: e, reason: collision with root package name */
    public int f62040e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {0}, l = {79}, m = "proceedLoop", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.util.pipeline.a$a, reason: collision with other inner class name */
    public static final class C0719a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62041a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62042b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<TSubject, TContext> f62043c;

        /* renamed from: d, reason: collision with root package name */
        public int f62044d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0719a(a<TSubject, TContext> aVar, j00.c<? super C0719a> cVar) {
            super(cVar);
            this.f62043c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62042b = obj;
            this.f62044d |= Integer.MIN_VALUE;
            return this.f62043c.n(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.k TContext context, @m80.k List<? extends q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object>> interceptors, @m80.k TSubject subject, @m80.k kotlin.coroutines.d coroutineContext) {
        super(context);
        g0.p(context, "context");
        g0.p(interceptors, "interceptors");
        g0.p(subject, "subject");
        g0.p(coroutineContext, "coroutineContext");
        this.f62037b = interceptors;
        this.f62038c = coroutineContext;
        this.f62039d = subject;
    }

    @Override // io.ktor.util.pipeline.d
    @m80.l
    public Object a(@m80.k TSubject tsubject, @m80.k j00.c<? super TSubject> cVar) {
        this.f62040e = 0;
        l(tsubject);
        return h(cVar);
    }

    @Override // io.ktor.util.pipeline.d
    public void b() {
        this.f62040e = -1;
    }

    @Override // io.ktor.util.pipeline.d
    @m80.k
    public TSubject e() {
        return this.f62039d;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62038c;
    }

    @Override // io.ktor.util.pipeline.d
    @m80.l
    public Object h(@m80.k j00.c<? super TSubject> cVar) {
        int i11 = this.f62040e;
        if (i11 < 0) {
            return e();
        }
        if (i11 < this.f62037b.size()) {
            return n(cVar);
        }
        b();
        return e();
    }

    @Override // io.ktor.util.pipeline.d
    @m80.l
    public Object i(@m80.k TSubject tsubject, @m80.k j00.c<? super TSubject> cVar) {
        l(tsubject);
        return h(cVar);
    }

    @Override // io.ktor.util.pipeline.d
    public void l(@m80.k TSubject tsubject) {
        g0.p(tsubject, "<set-?>");
        this.f62039d = tsubject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(j00.c<? super TSubject> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.util.pipeline.a.C0719a
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.util.pipeline.a$a r0 = (io.ktor.util.pipeline.a.C0719a) r0
            int r1 = r0.f62044d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62044d = r1
            goto L18
        L13:
            io.ktor.util.pipeline.a$a r0 = new io.ktor.util.pipeline.a$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f62042b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62044d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f62041a
            io.ktor.util.pipeline.a r2 = (io.ktor.util.pipeline.a) r2
            kotlin.e.n(r7)
            goto L39
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.e.n(r7)
            r2 = r6
        L39:
            int r7 = r2.f62040e
            r4 = -1
            if (r7 != r4) goto L3f
            goto L4a
        L3f:
            java.util.List<x00.q<io.ktor.util.pipeline.d<TSubject, TContext>, TSubject, j00.c<? super yz.g2>, java.lang.Object>> r4 = r2.f62037b
            int r5 = r4.size()
            if (r7 < r5) goto L4f
            r2.b()
        L4a:
            java.lang.Object r7 = r2.e()
            return r7
        L4f:
            java.lang.Object r4 = r4.get(r7)
            x00.q r4 = (x00.q) r4
            int r7 = r7 + 1
            r2.f62040e = r7
            java.lang.Object r7 = r2.e()
            r0.f62041a = r2
            r0.f62044d = r3
            java.lang.Object r7 = r4.invoke(r2, r7, r0)
            if (r7 != r1) goto L39
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.a.n(j00.c):java.lang.Object");
    }
}
