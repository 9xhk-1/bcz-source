package i6;

import c4.j;
import c4.o;
import c40.r0;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l00.d;
import l7.e;
import l7.i0;
import l7.p;
import m80.k;
import oa0.c;
import t8.g;
import ws.i;
import x00.l;
import y7.d;
import y7.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c
@u0({"SMAP\nLookupWordUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookupWordUC.kt\ncom/baicizhan/app/biz/game/uc/lookup/LookupWordUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,56:1\n6#2:57\n64#3,2:58\n66#3:61\n67#3,2:67\n6#4:60\n124#5,4:62\n142#6:66\n*S KotlinDebug\n*F\n+ 1 LookupWordUC.kt\ncom/baicizhan/app/biz/game/uc/lookup/LookupWordUC\n*L\n18#1:57\n18#1:58,2\n18#1:61\n18#1:67,2\n18#1:60\n18#1:62,4\n18#1:66\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u5.b f60181a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f60182b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o7.c f60183c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.lookup.LookupWordUC$invoke$2", f = "LookupWordUC.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {23, 26}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-LookupWordUC$invoke$2$remote$1", "$this$withContext", "remote", "$this$invokeSuspend_u24lambda_u241", "$i$a$-runCatching-LookupWordUC$invoke$2$local$1"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 1)
    @u0({"SMAP\nLookupWordUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookupWordUC.kt\ncom/baicizhan/app/biz/game/uc/lookup/LookupWordUC$invoke$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    /* renamed from: i6.a$a, reason: collision with other inner class name */
    public static final class C0692a extends SuspendLambda implements x00.p<r0, j00.c<? super i6.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60184a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60185b;

        /* renamed from: c, reason: collision with root package name */
        public int f60186c;

        /* renamed from: d, reason: collision with root package name */
        public int f60187d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f60188e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f60190g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0692a(String str, j00.c<? super C0692a> cVar) {
            super(2, cVar);
            this.f60190g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C0692a c0692a = a.this.new C0692a(this.f60190g, cVar);
            c0692a.f60188e = obj;
            return c0692a;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super i6.b> cVar) {
            return ((C0692a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|(1:(1:(9:6|7|8|9|10|11|(1:13)|14|(11:16|(1:18)(1:36)|19|(1:21)|22|(1:24)(1:35)|25|(1:27)(1:34)|(1:29)(1:33)|30|31)(1:(2:38|39)(1:40)))(2:44|45))(3:46|47|48))(3:63|64|(2:66|57))|49|50|(1:52)|53|54|55|(6:58|10|11|(0)|14|(0)(0))|57) */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00ae, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00af, code lost:
        
            r2 = r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 316
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i6.a.C0692a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements l<w7.d<g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f60191a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f60192b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f60193c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: i6.a$b$a, reason: collision with other inner class name */
        public static final class C0693a implements l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f60194a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f60195b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f60196c;

            public C0693a(e eVar, l7.c cVar, h10.d dVar) {
                this.f60194a = eVar;
                this.f60195b = cVar;
                this.f60196c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f60194a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f60194a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f60195b.b(this.f60196c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, e eVar, l7.c cVar) {
            this.f60191a = dVar;
            this.f60192b = eVar;
            this.f60193c = cVar;
        }

        public final void a(w7.d<g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            f.a(thriftBuilder, new C0693a(this.f60192b, this.f60193c, this.f60191a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f60191a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public a(@k u5.b plugin, @k p thrift, @k o7.c cdnDomainRepo) {
        g0.p(plugin, "plugin");
        g0.p(thrift, "thrift");
        g0.p(cdnDomainRepo, "cdnDomainRepo");
        this.f60181a = plugin;
        this.f60182b = thrift;
        this.f60183c = cdnDomainRepo;
    }

    public final g d() {
        return (g) w7.f.b(new b(o0.d(g.class), new e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.l
    public final Object e(@k String str, @k j00.c<? super i6.b> cVar) {
        return c40.i.h(o.b(), new C0692a(str, null), cVar);
    }
}
