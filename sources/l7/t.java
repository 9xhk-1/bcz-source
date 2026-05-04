package l7;

import com.microsoft.thrifty.service.a;
import java.util.Map;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {p.class})
@u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,122:1\n58#2,6:123\n*S KotlinDebug\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImpl\n*L\n43#1:123,6\n*E\n"})
/* loaded from: classes3.dex */
public final class t extends p implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f70666b = yz.e0.b(jb0.c.f64013a.b(), new a(this, null, null));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class a implements x00.a<c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f70667a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f70668b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f70669c;

        public a(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f70667a = aVar;
            this.f70668b = aVar2;
            this.f70669c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l7.c] */
        @Override // x00.a
        public final c invoke() {
            pa0.a aVar = this.f70667a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(c.class), this.f70668b, this.f70669c);
        }
    }

    public static final g2 i(final h10.d dVar, final e eVar, final t tVar, w7.d thriftBuilder) {
        kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
        y7.f.a(thriftBuilder, new x00.l() { // from class: l7.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = t.j(e.this, tVar, dVar, (d.a) obj);
                return j11;
            }
        });
        x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(dVar);
        kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImpl.thrift>");
        thriftBuilder.f((x00.p) x0.q(pVar, 2));
        thriftBuilder.g(new x00.a() { // from class: l7.r
            @Override // x00.a
            public final Object invoke() {
                Map k11;
                k11 = t.k();
                return k11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 j(e eVar, t tVar, h10.d dVar, d.a randomRetry) {
        kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
        Integer a11 = eVar.a();
        if (a11 != null) {
            randomRetry.i(a11.intValue());
        }
        Long b11 = eVar.b();
        if (b11 != null) {
            randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
        }
        randomRetry.j(tVar.g().b(dVar));
        return g2.f100423a;
    }

    public static final Map k() {
        return i0.p();
    }

    @Override // l7.p
    @m80.k
    public <T> T b(@m80.l x00.l<? super e, g2> lVar, @m80.k final h10.d<T> cls) {
        kotlin.jvm.internal.g0.p(cls, "cls");
        final e eVar = new e(null, null, 3, null);
        if (lVar != null) {
            lVar.invoke(eVar);
        }
        return (T) w7.f.b(new x00.l() { // from class: l7.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = t.i(h10.d.this, eVar, this, (w7.d) obj);
                return i11;
            }
        });
    }

    public final c g() {
        return (c) this.f70666b.getValue();
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
