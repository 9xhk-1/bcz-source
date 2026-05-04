package mx;

import c40.r0;
import ix.g1;
import ix.q0;
import ix.y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import mx.v;
import xy.c2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompressedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,87:1\n1#2:88\n23#3:89\n*S KotlinDebug\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse\n*L\n65#1:89\n*E\n"})
/* loaded from: classes8.dex */
public final class o extends v.f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v.f f73807b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final xy.z f73808c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f73809d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f73810e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2", f = "CompressedContent.kt", i = {0}, l = {82}, m = "invokeSuspend", n = {"$this$use$iv"}, s = {"L$0"})
    @u0({"SMAP\nCompressedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse$writeTo$2\n+ 2 Readers.kt\nio/ktor/util/cio/ReadersKt\n*L\n1#1,87:1\n29#2,9:88\n*S KotlinDebug\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedWriteChannelResponse$writeTo$2\n*L\n81#1:88,9\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73811a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73812b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f73814d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.ktor.utils.io.m mVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f73814d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = o.this.new a(this.f73814d, cVar);
            aVar.f73812b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            io.ktor.utils.io.m mVar;
            Throwable th2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f73811a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.utils.io.m c11 = o.this.p().c(this.f73814d, ((r0) this.f73812b).getCoroutineContext());
                try {
                    v.f r11 = o.this.r();
                    this.f73812b = c11;
                    this.f73811a = 1;
                    if (r11.m(c11, this) == l11) {
                        return l11;
                    }
                    mVar = c11;
                } catch (Throwable th3) {
                    mVar = c11;
                    th2 = th3;
                    io.ktor.utils.io.q.e(mVar, th2);
                    throw th2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (io.ktor.utils.io.m) this.f73812b;
                try {
                    kotlin.e.n(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    try {
                        io.ktor.utils.io.q.e(mVar, th2);
                        throw th2;
                    } catch (Throwable th5) {
                        io.ktor.utils.io.n.c(mVar);
                        throw th5;
                    }
                }
            }
            io.ktor.utils.io.n.c(mVar);
            return g2.f100423a;
        }
    }

    public o(@m80.k v.f original, @m80.k xy.z encoder, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(original, "original");
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        this.f73807b = original;
        this.f73808c = encoder;
        this.f73809d = coroutineContext;
        this.f73810e = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: mx.n
            @Override // x00.a
            public final Object invoke() {
                q0 s11;
                s11 = o.s(o.this);
                return s11;
            }
        });
    }

    public static final q0 s(o oVar) {
        q0.a aVar = q0.f62976a;
        ix.r0 r0Var = new ix.r0(0, 1, null);
        c2.g(r0Var, oVar.f73807b.d(), false, new x00.p() { // from class: mx.m
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean t11;
                t11 = o.t((String) obj, (String) obj2);
                return Boolean.valueOf(t11);
            }
        }, 2, null);
        r0Var.k(y0.f63006a.x(), oVar.f73808c.getName());
        return r0Var.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(String name, String str) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(str, "<unused var>");
        return !u30.f0.c2(name, y0.f63006a.z(), true);
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        Long a11 = this.f73807b.a();
        if (a11 != null) {
            Long d11 = this.f73808c.d(a11.longValue());
            if (d11 != null && d11.longValue() >= 0) {
                return d11;
            }
        }
        return null;
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f73807b.b();
    }

    @Override // mx.v
    @m80.k
    public q0 d() {
        return (q0) this.f73810e.getValue();
    }

    @Override // mx.v
    @m80.l
    public <T> T e(@m80.k xy.a<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return (T) this.f73807b.e(key);
    }

    @m80.k
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.f73809d;
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f73807b.h();
    }

    @Override // mx.v
    public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(key, "key");
        this.f73807b.i(key, t11);
    }

    @Override // mx.v.f
    @m80.l
    public Object m(@m80.k io.ktor.utils.io.m mVar, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(this.f73809d, new a(mVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @m80.k
    public final xy.z p() {
        return this.f73808c;
    }

    @m80.k
    public final v.f r() {
        return this.f73807b;
    }
}
