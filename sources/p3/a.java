package p3;

import c4.j;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import ws.i;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {k3.e.class})
@u0({"SMAP\nAdServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdServiceImpl.kt\ncom/baicizhan/app/biz/advertisement/AdServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,34:1\n6#2:35\n64#3,2:36\n66#3:39\n67#3,2:45\n6#4:38\n124#5,4:40\n142#6:44\n12#7,3:47\n15#7,10:68\n12#8,2:50\n14#8,10:58\n1563#9:52\n1634#9,3:53\n37#10,2:56\n*S KotlinDebug\n*F\n+ 1 AdServiceImpl.kt\ncom/baicizhan/app/biz/advertisement/AdServiceImpl\n*L\n18#1:35\n18#1:36,2\n18#1:39\n18#1:45,2\n18#1:38\n18#1:40,4\n18#1:44\n-1#1:47,3\n-1#1:68,10\n-1#1:50,2\n-1#1:58,10\n22#1:52\n22#1:53,3\n24#1:56,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements k3.e, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f78798b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f78799c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.advertisement.AdServiceImpl", f = "AdServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {22}, m = "homeBottomAds", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AdServiceImpl$homeBottomAds$2", "$i$f$bizCatch", "$i$a$-bizCatch-AdServiceImpl$homeBottomAds$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public static final class C0972a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78800a;

        /* renamed from: b, reason: collision with root package name */
        public int f78801b;

        /* renamed from: c, reason: collision with root package name */
        public int f78802c;

        /* renamed from: d, reason: collision with root package name */
        public int f78803d;

        /* renamed from: e, reason: collision with root package name */
        public int f78804e;

        /* renamed from: f, reason: collision with root package name */
        public long f78805f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f78806g;

        /* renamed from: i, reason: collision with root package name */
        public int f78808i;

        public C0972a(j00.c<? super C0972a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f78806g = obj;
            this.f78808i |= Integer.MIN_VALUE;
            return a.this.F1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<g8.c>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f78809a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f78810b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f78811c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: p3.a$b$a, reason: collision with other inner class name */
        public static final class C0973a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f78812a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f78813b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f78814c;

            public C0973a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f78812a = eVar;
                this.f78813b = cVar;
                this.f78814c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f78812a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f78812a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f78813b.b(this.f78814c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f78809a = dVar;
            this.f78810b = eVar;
            this.f78811c = cVar;
        }

        public final void a(w7.d<g8.c> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0973a(this.f78810b, this.f78811c, this.f78809a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f78809a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<g8.c> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.advertisement.AdServiceImpl", f = "AdServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {28}, m = "topBanner", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AdServiceImpl$topBanner$2", "$i$f$bizCatch", "$i$a$-bizCatch-AdServiceImpl$topBanner$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78815a;

        /* renamed from: b, reason: collision with root package name */
        public int f78816b;

        /* renamed from: c, reason: collision with root package name */
        public int f78817c;

        /* renamed from: d, reason: collision with root package name */
        public int f78818d;

        /* renamed from: e, reason: collision with root package name */
        public int f78819e;

        /* renamed from: f, reason: collision with root package name */
        public long f78820f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f78821g;

        /* renamed from: i, reason: collision with root package name */
        public int f78823i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f78821g = obj;
            this.f78823i |= Integer.MIN_VALUE;
            return a.this.x1(this);
        }
    }

    public a(@k p thriftService, @k e topRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(topRepo, "topRepo");
        this.f78798b = thriftService;
        this.f78799c = topRepo;
    }

    public final g8.c A2() {
        return (g8.c) w7.f.b(new b(o0.d(g8.c.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r12 == null) goto L31;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x006a, B:14:0x0070, B:15:0x0081, B:17:0x0087, B:19:0x0095, B:26:0x009f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:31:0x00dc, B:33:0x00e3, B:35:0x00e7, B:37:0x00eb, B:39:0x00ef, B:41:0x00f3, B:52:0x015a, B:43:0x00fe, B:45:0x0109, B:47:0x011d, B:49:0x0131, B:51:0x0146), top: B:30:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146 A[Catch: all -> 0x00fb, TryCatch #2 {all -> 0x00fb, blocks: (B:31:0x00dc, B:33:0x00e3, B:35:0x00e7, B:37:0x00eb, B:39:0x00ef, B:41:0x00f3, B:52:0x015a, B:43:0x00fe, B:45:0x0109, B:47:0x011d, B:49:0x0131, B:51:0x0146), top: B:30:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.e
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F1(@m80.k j00.c<? super k3.t[]> r12) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.a.F1(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x0068, B:14:0x006c), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4 A[Catch: all -> 0x00cc, TryCatch #2 {all -> 0x00cc, blocks: (B:25:0x00ad, B:27:0x00b4, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c4, B:46:0x012b, B:37:0x00cf, B:39:0x00da, B:41:0x00ee, B:43:0x0102, B:45:0x0117), top: B:24:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[Catch: all -> 0x00cc, TryCatch #2 {all -> 0x00cc, blocks: (B:25:0x00ad, B:27:0x00b4, B:29:0x00b8, B:31:0x00bc, B:33:0x00c0, B:35:0x00c4, B:46:0x012b, B:37:0x00cf, B:39:0x00da, B:41:0x00ee, B:43:0x0102, B:45:0x0117), top: B:24:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.e
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x1(@m80.k j00.c<? super k3.e4> r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.a.x1(j00.c):java.lang.Object");
    }
}
