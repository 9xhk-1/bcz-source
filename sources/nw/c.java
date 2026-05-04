package nw;

import c40.b2;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.utils.io.g;
import io.ktor.utils.io.m;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import ix.g1;
import ix.q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import mx.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final v f75383b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final kotlin.coroutines.d f75384c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f75385d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g f75386e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.content.ObservableContent$getContent$1", f = "ObservableContent.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75387a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75388b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f75389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f75389c = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f75389c, cVar);
            aVar.f75388b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75387a;
            if (i11 == 0) {
                e.n(obj);
                m0 m0Var = (m0) this.f75388b;
                v.f fVar = (v.f) this.f75389c;
                m a11 = m0Var.a();
                this.f75387a = 1;
                if (fVar.m(a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public c(@k v delegate, @k kotlin.coroutines.d callContext, @k d listener) {
        g0.p(delegate, "delegate");
        g0.p(callContext, "callContext");
        g0.p(listener, "listener");
        this.f75383b = delegate;
        this.f75384c = callContext;
        this.f75385d = listener;
        this.f75386e = o(delegate);
    }

    @Override // mx.v
    @l
    public Long a() {
        return this.f75383b.a();
    }

    @Override // mx.v
    @l
    public ix.k b() {
        return this.f75383b.b();
    }

    @Override // mx.v
    @k
    public q0 d() {
        return this.f75383b.d();
    }

    @Override // mx.v
    @l
    public <T> T e(@k xy.a<T> key) {
        g0.p(key, "key");
        return (T) this.f75383b.e(key);
    }

    @Override // mx.v
    @l
    public g1 h() {
        return this.f75383b.h();
    }

    @Override // mx.v
    public <T> void i(@k xy.a<T> key, @l T t11) {
        g0.p(key, "key");
        this.f75383b.i(key, t11);
    }

    @Override // mx.v.e
    @k
    public g m() {
        return fx.a.a(this.f75386e, this.f75384c, a(), this.f75385d);
    }

    public final g o(v vVar) {
        if (vVar instanceof v.b) {
            return o(((v.b) vVar).n());
        }
        if (vVar instanceof v.a) {
            return io.ktor.utils.io.c.e(((v.a) vVar).m(), 0, 0, 6, null);
        }
        if (vVar instanceof v.d) {
            throw new UnsupportedContentTypeException(vVar);
        }
        if (vVar instanceof v.c) {
            return g.f62105a.a();
        }
        if (vVar instanceof v.e) {
            return ((v.e) vVar).m();
        }
        if (vVar instanceof v.f) {
            return q.C(b2.f7824a, this.f75384c, true, new a(vVar, null)).b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
