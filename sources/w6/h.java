package w6;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {j7.a.class})
@u0({"SMAP\nIUrlChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUrlChecker.kt\ncom/baicizhan/app/biz/h5/Syncer\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,120:1\n6#2:121\n64#3,2:122\n66#3:125\n67#3,2:131\n6#4:124\n124#5,4:126\n142#6:130\n*S KotlinDebug\n*F\n+ 1 IUrlChecker.kt\ncom/baicizhan/app/biz/h5/Syncer\n*L\n44#1:121\n44#1:122,2\n44#1:125\n44#1:131,2\n44#1:124\n44#1:126,4\n44#1:130\n*E\n"})
/* loaded from: classes3.dex */
public final class h implements j7.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d f95405a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l7.p f95406b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f95407c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class a implements x00.l<w7.d<j8.g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f95408a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f95409b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f95410c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: w6.h$a$a, reason: collision with other inner class name */
        public static final class C1283a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f95411a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f95412b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f95413c;

            public C1283a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f95411a = eVar;
                this.f95412b = cVar;
                this.f95413c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f95411a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f95411a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f95412b.b(this.f95413c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public a(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f95408a = dVar;
            this.f95409b = eVar;
            this.f95410c = cVar;
        }

        public final void a(w7.d<j8.g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C1283a(this.f95409b, this.f95410c, this.f95408a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f95408a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<j8.g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.h5.Syncer", f = "IUrlChecker.kt", i = {}, l = {46}, m = "sync", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f95414a;

        /* renamed from: c, reason: collision with root package name */
        public int f95416c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95414a = obj;
            this.f95416c |= Integer.MIN_VALUE;
            return h.this.a(this);
        }
    }

    public h(@m80.k d urlChecker, @m80.k l7.p thriftService) {
        g0.p(urlChecker, "urlChecker");
        g0.p(thriftService, "thriftService");
        this.f95405a = urlChecker;
        this.f95406b = thriftService;
        this.f95407c = "UrlChecker";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j7.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w6.h.b
            if (r0 == 0) goto L13
            r0 = r5
            w6.h$b r0 = (w6.h.b) r0
            int r1 = r0.f95416c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95416c = r1
            goto L18
        L13:
            w6.h$b r0 = new w6.h$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95414a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f95416c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            j8.g r5 = r4.b()
            r0.f95416c = r3
            java.lang.Object r5 = r5.Y7(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.List r5 = (java.util.List) r5
            w6.d r0 = r4.f95405a
            java.lang.String r1 = "null cannot be cast to non-null type com.baicizhan.app.biz.h5.UrlChecker"
            kotlin.jvm.internal.g0.n(r0, r1)
            w6.j r0 = (w6.j) r0
            r0.e(r5)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h.a(j00.c):java.lang.Object");
    }

    public final j8.g b() {
        return (j8.g) w7.f.b(new a(o0.d(j8.g.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.k
    public final l7.p c() {
        return this.f95406b;
    }

    @Override // j7.a
    @m80.k
    public String getKey() {
        return this.f95407c;
    }
}
