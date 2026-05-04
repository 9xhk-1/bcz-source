package com.baicizhan.app.biz.game.uc.ipavatar;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nUnlockIpAvatarUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlockIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/UnlockIpAvatarUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n6#2:49\n64#3,2:50\n66#3:53\n67#3,2:59\n6#4:52\n124#5,4:54\n142#6:58\n1#7:61\n*S KotlinDebug\n*F\n+ 1 UnlockIpAvatarUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/UnlockIpAvatarUC\n*L\n18#1:49\n18#1:50,2\n18#1:53\n18#1:59,2\n18#1:52\n18#1:54,4\n18#1:58\n*E\n"})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f14865a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c f14866b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q5.d f14867c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.UnlockIpAvatarUC", f = "UnlockIpAvatarUC.kt", i = {1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {22, 24, 26, 31, 34, 37, 38, 39}, m = "invoke", n = {"avatarBasicInfo", "avatarBasicInfo", "avatarBasicInfo", "$this$invoke_u24lambda_u240", "$i$a$-runCatching-UnlockIpAvatarUC$invoke$rsp$1", "avatarBasicInfo", HiAnalyticsConstant.Direction.RESPONSE, "avatarBasicInfo", HiAnalyticsConstant.Direction.RESPONSE, "avatarFetch", "avatarBasicInfo", HiAnalyticsConstant.Direction.RESPONSE, "avatarFetch", "$this$invoke_u24lambda_u241", "$i$a$-runCatching-UnlockIpAvatarUC$invoke$home$1", "avatarBasicInfo", HiAnalyticsConstant.Direction.RESPONSE, "avatarFetch", "home"}, s = {"L$0", "L$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14868a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14869b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14870c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14871d;

        /* renamed from: e, reason: collision with root package name */
        public int f14872e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14873f;

        /* renamed from: h, reason: collision with root package name */
        public int f14875h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14873f = obj;
            this.f14875h |= Integer.MIN_VALUE;
            return j.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<h8.b>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14876a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14877b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14878c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14879a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14880b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14881c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14879a = eVar;
                this.f14880b = cVar;
                this.f14881c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14879a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14879a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14880b.b(this.f14881c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14876a = dVar;
            this.f14877b = eVar;
            this.f14878c = cVar;
        }

        public final void a(w7.d<h8.b> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f14877b, this.f14878c, this.f14876a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14876a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<h8.b> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public j(@m80.k p thriftService, @m80.k c fetchIpAvatarHomeUC, @m80.k q5.d ipPopupRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(fetchIpAvatarHomeUC, "fetchIpAvatarHomeUC");
        g0.p(ipPopupRepo, "ipPopupRepo");
        this.f14865a = thriftService;
        this.f14866b = fetchIpAvatarHomeUC;
        this.f14867c = ipPopupRepo;
    }

    public final h8.b a() {
        return (h8.b) w7.f.b(new b(o0.d(h8.b.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|72|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014e, code lost:
    
        if (com.baicizhan.app.biz.game.uc.ipavatar.c.g(r0, false, r13, 1, null) != r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b2, code lost:
    
        if (r0 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x009e, code lost:
    
        if (r0 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        r6 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0093  */
    /* JADX WARN: Type inference failed for: r2v13, types: [h8.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23, types: [h8.f] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super h8.f> r13) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.j.b(j00.c):java.lang.Object");
    }
}
