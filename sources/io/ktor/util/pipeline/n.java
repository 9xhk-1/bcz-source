package io.ktor.util.pipeline;

import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n<TSubject, TContext> extends d<TSubject, TContext> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> f62065b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final j00.c<g2> f62066c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public TSubject f62067d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j00.c<TSubject>[] f62068e;

    /* renamed from: f, reason: collision with root package name */
    public int f62069f;

    /* renamed from: g, reason: collision with root package name */
    public int f62070g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements j00.c<g2>, l00.c {

        /* renamed from: a, reason: collision with root package name */
        public int f62071a = Integer.MIN_VALUE;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n<TSubject, TContext> f62072b;

        public a(n<TSubject, TContext> nVar) {
            this.f62072b = nVar;
        }

        public final int b() {
            return this.f62071a;
        }

        public final j00.c<?> c() {
            if (this.f62071a == Integer.MIN_VALUE) {
                this.f62071a = this.f62072b.f62069f;
            }
            if (this.f62071a < 0) {
                this.f62071a = Integer.MIN_VALUE;
                return null;
            }
            try {
                j00.c<?>[] cVarArr = this.f62072b.f62068e;
                int i11 = this.f62071a;
                j00.c<?> cVar = cVarArr[i11];
                if (cVar == null) {
                    return m.f62064a;
                }
                this.f62071a = i11 - 1;
                return cVar;
            } catch (Throwable unused) {
                return m.f62064a;
            }
        }

        public final void d(int i11) {
            this.f62071a = i11;
        }

        @Override // l00.c
        public l00.c getCallerFrame() {
            j00.c<?> c11 = c();
            if (c11 instanceof l00.c) {
                return (l00.c) c11;
            }
            return null;
        }

        @Override // j00.c
        public kotlin.coroutines.d getContext() {
            j00.c cVar = this.f62072b.f62068e[this.f62072b.f62069f];
            if (cVar != this && cVar != null) {
                return cVar.getContext();
            }
            int i11 = this.f62072b.f62069f - 1;
            while (i11 >= 0) {
                int i12 = i11 - 1;
                j00.c cVar2 = this.f62072b.f62068e[i11];
                if (cVar2 != this && cVar2 != null) {
                    return cVar2.getContext();
                }
                i11 = i12;
            }
            throw new IllegalStateException("Not started");
        }

        @Override // l00.c
        public StackTraceElement getStackTraceElement() {
            return null;
        }

        @Override // j00.c
        public void resumeWith(Object obj) {
            if (!Result.m6314isFailureimpl(obj)) {
                this.f62072b.u(false);
                return;
            }
            n<TSubject, TContext> nVar = this.f62072b;
            Result.a aVar = Result.Companion;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
            g0.m(m6311exceptionOrNullimpl);
            nVar.v(Result.m6308constructorimpl(kotlin.e.a(m6311exceptionOrNullimpl)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(@m80.k TSubject initial, @m80.k TContext context, @m80.k List<? extends q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object>> blocks) {
        super(context);
        g0.p(initial, "initial");
        g0.p(context, "context");
        g0.p(blocks, "blocks");
        this.f62065b = blocks;
        this.f62066c = new a(this);
        this.f62067d = initial;
        this.f62068e = new j00.c[blocks.size()];
        this.f62069f = -1;
    }

    @Override // io.ktor.util.pipeline.d
    @m80.l
    public Object a(@m80.k TSubject tsubject, @m80.k j00.c<? super TSubject> cVar) {
        this.f62070g = 0;
        if (this.f62065b.size() == 0) {
            return tsubject;
        }
        l(tsubject);
        if (this.f62069f < 0) {
            return h(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // io.ktor.util.pipeline.d
    public void b() {
        this.f62070g = this.f62065b.size();
    }

    @Override // io.ktor.util.pipeline.d
    @m80.k
    public TSubject e() {
        return this.f62067d;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62066c.getContext();
    }

    @Override // io.ktor.util.pipeline.d
    @m80.l
    public Object h(@m80.k j00.c<? super TSubject> cVar) {
        Object l11;
        if (this.f62070g == this.f62065b.size()) {
            l11 = e();
        } else {
            r(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
            if (u(true)) {
                s();
                l11 = e();
            } else {
                l11 = kotlin.coroutines.intrinsics.b.l();
            }
        }
        if (l11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return l11;
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
        this.f62067d = tsubject;
    }

    public final void r(@m80.k j00.c<? super TSubject> continuation) {
        g0.p(continuation, "continuation");
        j00.c<TSubject>[] cVarArr = this.f62068e;
        int i11 = this.f62069f + 1;
        this.f62069f = i11;
        cVarArr[i11] = continuation;
    }

    public final void s() {
        int i11 = this.f62069f;
        if (i11 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        j00.c<TSubject>[] cVarArr = this.f62068e;
        this.f62069f = i11 - 1;
        cVarArr[i11] = null;
    }

    @m80.k
    public final j00.c<g2> t() {
        return this.f62066c;
    }

    public final boolean u(boolean z11) {
        int i11;
        do {
            i11 = this.f62070g;
            if (i11 == this.f62065b.size()) {
                if (z11) {
                    return true;
                }
                Result.a aVar = Result.Companion;
                v(Result.m6308constructorimpl(e()));
                return false;
            }
            this.f62070g = i11 + 1;
            try {
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                v(Result.m6308constructorimpl(kotlin.e.a(th2)));
                return false;
            }
        } while (g.a(this.f62065b.get(i11), this, e(), this.f62066c) != kotlin.coroutines.intrinsics.b.l());
        return false;
    }

    public final void v(Object obj) {
        int i11 = this.f62069f;
        if (i11 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        j00.c<TSubject> cVar = this.f62068e[i11];
        g0.m(cVar);
        j00.c<TSubject>[] cVarArr = this.f62068e;
        int i12 = this.f62069f;
        this.f62069f = i12 - 1;
        cVarArr[i12] = null;
        if (!Result.m6314isFailureimpl(obj)) {
            cVar.resumeWith(obj);
            return;
        }
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        g0.m(m6311exceptionOrNullimpl);
        Throwable a11 = k.a(m6311exceptionOrNullimpl, cVar);
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(a11)));
    }
}
