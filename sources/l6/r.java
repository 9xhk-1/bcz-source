package l6;

import c40.r0;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l3.y2;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nGetTopicWordPackResourceUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicWordPackResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/GetTopicWordPackResourceUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,30:1\n6#2:31\n64#3,2:32\n66#3:35\n67#3,2:41\n6#4:34\n124#5,4:36\n142#6:40\n*S KotlinDebug\n*F\n+ 1 GetTopicWordPackResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/GetTopicWordPackResourceUC\n*L\n16#1:31\n16#1:32,2\n16#1:35\n16#1:41,2\n16#1:34\n16#1:36,4\n16#1:40\n*E\n"})
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f70284a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k50.a f70285b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.GetTopicWordPackResourceUC$invoke$2", f = "GetTopicWordPackResourceUC.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nGetTopicWordPackResourceUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetTopicWordPackResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/GetTopicWordPackResourceUC$invoke$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,30:1\n147#2:31\n*S KotlinDebug\n*F\n+ 1 GetTopicWordPackResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/GetTopicWordPackResourceUC$invoke$2\n*L\n24#1:31\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super y2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f70286a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f70288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f70288c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return r.this.new a(this.f70288c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super y2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f70286a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                t8.g c11 = r.this.c();
                int i12 = this.f70288c;
                this.f70286a = 1;
                obj = c11.M4(i12, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            k50.a aVar = r.this.f70285b;
            aVar.getSerializersModule();
            return (y2) aVar.c(y2.Companion.serializer(), (String) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<t8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f70289a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f70290b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f70291c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f70292a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f70293b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f70294c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f70292a = eVar;
                this.f70293b = cVar;
                this.f70294c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f70292a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f70292a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f70293b.b(this.f70294c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f70289a = dVar;
            this.f70290b = eVar;
            this.f70291c = cVar;
        }

        public final void a(w7.d<t8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f70290b, this.f70291c, this.f70289a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f70289a);
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

    public r(@m80.k l7.p thriftService, @m80.k k50.a json) {
        g0.p(thriftService, "thriftService");
        g0.p(json, "json");
        this.f70284a = thriftService;
        this.f70285b = json;
    }

    public static /* synthetic */ Object e(r rVar, int i11, String str, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = n.f70249a;
        }
        return rVar.d(i11, str, cVar);
    }

    public final t8.g c() {
        return (t8.g) w7.f.b(new b(o0.d(t8.g.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.l
    public final Object d(int i11, @m80.k String str, @m80.k j00.c<? super y2> cVar) {
        return c40.i.h(c4.o.b(), new a(i11, null), cVar);
    }
}
