package l6;

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
@u0({"SMAP\nGetWordRootUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetWordRootUC.kt\ncom/baicizhan/app/biz/game/uc/resource/GetWordRootUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,22:1\n6#2:23\n64#3,2:24\n66#3:27\n67#3,2:33\n6#4:26\n124#5,4:28\n142#6:32\n*S KotlinDebug\n*F\n+ 1 GetWordRootUC.kt\ncom/baicizhan/app/biz/game/uc/resource/GetWordRootUC\n*L\n13#1:23\n13#1:24,2\n13#1:27\n13#1:33,2\n13#1:26\n13#1:28,4\n13#1:32\n*E\n"})
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f70321a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class a implements x00.l<w7.d<t8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f70322a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f70323b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f70324c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: l6.u$a$a, reason: collision with other inner class name */
        public static final class C0844a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f70325a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f70326b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f70327c;

            public C0844a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f70325a = eVar;
                this.f70326b = cVar;
                this.f70327c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f70325a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f70325a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f70326b.b(this.f70327c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public a(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f70322a = dVar;
            this.f70323b = eVar;
            this.f70324c = cVar;
        }

        public final void a(w7.d<t8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0844a(this.f70323b, this.f70324c, this.f70322a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f70322a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<t8.g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public u(@m80.k l7.p thriftService) {
        g0.p(thriftService, "thriftService");
        this.f70321a = thriftService;
    }

    public final t8.g a() {
        return (t8.g) w7.f.b(new a(o0.d(t8.g.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.l
    public final Object b(int i11, @m80.k j00.c<? super t8.x> cVar) {
        return a().q5(i11, cVar);
    }
}
