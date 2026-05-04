package o6;

import com.microsoft.thrifty.service.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nDoSynGameStateUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoSynGameStateUC.kt\ncom/baicizhan/app/biz/game/uc/study/DoSynGameStateUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,12:1\n6#2:13\n64#3,2:14\n66#3:17\n67#3,2:23\n6#4:16\n124#5,4:18\n142#6:22\n*S KotlinDebug\n*F\n+ 1 DoSynGameStateUC.kt\ncom/baicizhan/app/biz/game/uc/study/DoSynGameStateUC\n*L\n11#1:13\n11#1:14,2\n11#1:17\n11#1:23,2\n11#1:16\n11#1:18,4\n11#1:22\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f76138a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class a implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f76139a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f76140b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f76141c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: o6.i$a$a, reason: collision with other inner class name */
        public static final class C0930a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f76142a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f76143b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f76144c;

            public C0930a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f76142a = eVar;
                this.f76143b = cVar;
                this.f76144c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f76142a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f76142a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f76143b.b(this.f76144c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public a(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f76139a = dVar;
            this.f76140b = eVar;
            this.f76141c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0930a(this.f76140b, this.f76141c, this.f76139a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f76139a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<p8.s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public i(@m80.k l7.p thrift) {
        g0.p(thrift, "thrift");
        this.f76138a = thrift;
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new a(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
