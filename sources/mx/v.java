package mx;

import c40.b2;
import c40.h1;
import c40.l2;
import io.ktor.utils.io.m0;
import ix.g1;
import ix.q0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOutgoingContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutgoingContent.kt\nio/ktor/http/content/OutgoingContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
/* loaded from: classes8.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public xy.b f73832a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends v {
        public a() {
            super(null);
        }

        @m80.k
        public abstract byte[] m();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends v {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final v f73833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k v delegate) {
            super(null);
            kotlin.jvm.internal.g0.p(delegate, "delegate");
            this.f73833b = delegate;
        }

        @Override // mx.v
        @m80.l
        public Long a() {
            return this.f73833b.a();
        }

        @Override // mx.v
        @m80.l
        public ix.k b() {
            return this.f73833b.b();
        }

        @Override // mx.v
        @m80.k
        public q0 d() {
            return this.f73833b.d();
        }

        @Override // mx.v
        @m80.l
        public <T> T e(@m80.k xy.a<T> key) {
            kotlin.jvm.internal.g0.p(key, "key");
            return (T) this.f73833b.e(key);
        }

        @Override // mx.v
        @m80.l
        public g1 h() {
            return this.f73833b.h();
        }

        @Override // mx.v
        public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
            kotlin.jvm.internal.g0.p(key, "key");
            this.f73833b.i(key, t11);
        }

        @m80.k
        public abstract b m(@m80.k v vVar);

        @m80.k
        public final v n() {
            return this.f73833b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c extends v {
        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d extends v {
        public d() {
            super(null);
        }

        @Override // mx.v
        @m80.k
        public final g1 h() {
            return g1.f62797c.S();
        }

        @m80.l
        public abstract Object m(@m80.k io.ktor.utils.io.g gVar, @m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d dVar, @m80.k kotlin.coroutines.d dVar2, @m80.k j00.c<? super l2> cVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e extends v {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {93, 95}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
        public static final class a extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f73834a;

            /* renamed from: b, reason: collision with root package name */
            public int f73835b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f73836c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g10.o f73838e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g10.o oVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f73838e = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = e.this.new a(this.f73838e, cVar);
                aVar.f73836c = obj;
                return aVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
                return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
            
                if (io.ktor.utils.io.j.g(r1, r9, r4, r8) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r8.f73835b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r9)
                    goto L69
                L12:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1a:
                    java.lang.Object r1 = r8.f73834a
                    io.ktor.utils.io.g r1 = (io.ktor.utils.io.g) r1
                    java.lang.Object r3 = r8.f73836c
                    io.ktor.utils.io.m0 r3 = (io.ktor.utils.io.m0) r3
                    kotlin.e.n(r9)
                    goto L47
                L26:
                    kotlin.e.n(r9)
                    java.lang.Object r9 = r8.f73836c
                    io.ktor.utils.io.m0 r9 = (io.ktor.utils.io.m0) r9
                    mx.v$e r1 = mx.v.e.this
                    io.ktor.utils.io.g r1 = r1.m()
                    g10.o r4 = r8.f73838e
                    long r4 = r4.d()
                    r8.f73836c = r9
                    r8.f73834a = r1
                    r8.f73835b = r3
                    java.lang.Object r3 = io.ktor.utils.io.j.i(r1, r4, r8)
                    if (r3 != r0) goto L46
                    goto L68
                L46:
                    r3 = r9
                L47:
                    g10.o r9 = r8.f73838e
                    long r4 = r9.f()
                    g10.o r9 = r8.f73838e
                    long r6 = r9.d()
                    long r4 = r4 - r6
                    r6 = 1
                    long r4 = r4 + r6
                    io.ktor.utils.io.m r9 = r3.a()
                    r3 = 0
                    r8.f73836c = r3
                    r8.f73834a = r3
                    r8.f73835b = r2
                    java.lang.Object r9 = io.ktor.utils.io.j.g(r1, r9, r4, r8)
                    if (r9 != r0) goto L69
                L68:
                    return r0
                L69:
                    yz.g2 r9 = yz.g2.f100423a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: mx.v.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public e() {
            super(null);
        }

        @m80.k
        public abstract io.ktor.utils.io.g m();

        @m80.k
        public io.ktor.utils.io.g n(@m80.k g10.o range) {
            kotlin.jvm.internal.g0.p(range, "range");
            return range.isEmpty() ? io.ktor.utils.io.g.f62105a.a() : io.ktor.utils.io.q.C(b2.f7824a, h1.g(), true, new a(range, null)).b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f extends v {
        public f() {
            super(null);
        }

        @m80.l
        public abstract Object m(@m80.k io.ktor.utils.io.m mVar, @m80.k j00.c<? super g2> cVar);
    }

    public /* synthetic */ v(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.l
    public Long a() {
        return null;
    }

    @m80.l
    public ix.k b() {
        return null;
    }

    @m80.k
    public q0 d() {
        return q0.f62976a.b();
    }

    @m80.l
    public <T> T e(@m80.k xy.a<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        xy.b bVar = this.f73832a;
        if (bVar != null) {
            return (T) bVar.a(key);
        }
        return null;
    }

    @m80.l
    public g1 h() {
        return null;
    }

    public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(key, "key");
        if (t11 == null && this.f73832a == null) {
            return;
        }
        if (t11 == null) {
            xy.b bVar = this.f73832a;
            if (bVar != null) {
                bVar.b(key);
                return;
            }
            return;
        }
        xy.b bVar2 = this.f73832a;
        if (bVar2 == null) {
            bVar2 = xy.d.b(false, 1, null);
        }
        this.f73832a = bVar2;
        bVar2.e(key, t11);
    }

    @m80.l
    public q0 l() {
        return null;
    }

    public v() {
    }
}
