package mx;

import ix.g1;
import ix.q0;
import ix.r0;
import ix.y0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;
import mx.v;
import xy.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompressedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedReadChannelResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,87:1\n1#2:88\n23#3:89\n*S KotlinDebug\n*F\n+ 1 CompressedContent.kt\nio/ktor/http/content/CompressedReadChannelResponse\n*L\n44#1:89\n*E\n"})
/* loaded from: classes8.dex */
public final class l extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v f73801b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.a<io.ktor.utils.io.g> f73802c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final xy.z f73803d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f73804e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f73805f;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@m80.k v original, @m80.k x00.a<? extends io.ktor.utils.io.g> delegateChannel, @m80.k xy.z encoder, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(original, "original");
        kotlin.jvm.internal.g0.p(delegateChannel, "delegateChannel");
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        this.f73801b = original;
        this.f73802c = delegateChannel;
        this.f73803d = encoder;
        this.f73804e = coroutineContext;
        this.f73805f = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: mx.j
            @Override // x00.a
            public final Object invoke() {
                q0 u11;
                u11 = l.u(l.this);
                return u11;
            }
        });
    }

    public static final q0 u(l lVar) {
        q0.a aVar = q0.f62976a;
        r0 r0Var = new r0(0, 1, null);
        c2.g(r0Var, lVar.f73801b.d(), false, new x00.p() { // from class: mx.k
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                boolean v11;
                v11 = l.v((String) obj, (String) obj2);
                return Boolean.valueOf(v11);
            }
        }, 2, null);
        r0Var.k(y0.f63006a.x(), lVar.f73803d.getName());
        return r0Var.build();
    }

    public static final boolean v(String name, String str) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(str, "<unused var>");
        return !u30.f0.c2(name, y0.f63006a.z(), true);
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        Long a11 = this.f73801b.a();
        if (a11 != null) {
            Long d11 = this.f73803d.d(a11.longValue());
            if (d11 != null && d11.longValue() >= 0) {
                return d11;
            }
        }
        return null;
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f73801b.b();
    }

    @Override // mx.v
    @m80.k
    public q0 d() {
        return (q0) this.f73805f.getValue();
    }

    @Override // mx.v
    @m80.l
    public <T> T e(@m80.k xy.a<T> key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return (T) this.f73801b.e(key);
    }

    @m80.k
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.f73804e;
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f73801b.h();
    }

    @Override // mx.v
    public <T> void i(@m80.k xy.a<T> key, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(key, "key");
        this.f73801b.i(key, t11);
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        return this.f73803d.b(this.f73802c.invoke(), this.f73804e);
    }

    @m80.k
    public final x00.a<io.ktor.utils.io.g> r() {
        return this.f73802c;
    }

    @m80.k
    public final xy.z s() {
        return this.f73803d;
    }

    @m80.k
    public final v t() {
        return this.f73801b;
    }
}
