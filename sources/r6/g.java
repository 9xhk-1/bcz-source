package r6;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
@oa0.r
@u0({"SMAP\nCheckUpdateStudyRecordUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdateStudyRecordUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/CheckUpdateStudyRecordUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,38:1\n6#2:39\n64#3,2:40\n66#3:43\n67#3,2:49\n6#4:42\n124#5,4:44\n142#6:48\n*S KotlinDebug\n*F\n+ 1 CheckUpdateStudyRecordUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/CheckUpdateStudyRecordUC\n*L\n18#1:39\n18#1:40,2\n18#1:43\n18#1:49,2\n18#1:42\n18#1:44,4\n18#1:48\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83128a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p6.m f83129b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final o5.a f83130c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.CheckUpdateStudyRecordUC", f = "CheckUpdateStudyRecordUC.kt", i = {0, 1, 2, 2, 3, 3}, l = {21, 25, 32, 33}, m = "invoke", n = {"bookId", "bookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId"}, s = {"J$0", "J$0", "L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83131a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83132b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f83133c;

        /* renamed from: e, reason: collision with root package name */
        public int f83135e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83133c = obj;
            this.f83135e |= Integer.MIN_VALUE;
            return g.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83136a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83137b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83138c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83139a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83140b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83141c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83139a = eVar;
                this.f83140b = cVar;
                this.f83141c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83139a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83139a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83140b.b(this.f83141c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83136a = dVar;
            this.f83137b = eVar;
            this.f83138c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83137b, this.f83138c, this.f83136a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83136a);
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

    public g(@m80.k l7.p thrift, @m80.k p6.m mergeStudyRecordUC, @m80.k o5.a versionProvider) {
        g0.p(thrift, "thrift");
        g0.p(mergeStudyRecordUC, "mergeStudyRecordUC");
        g0.p(versionProvider, "versionProvider");
        this.f83128a = thrift;
        this.f83129b = mergeStudyRecordUC;
        this.f83130c = versionProvider;
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        if (r3.b(r1, r8, r9, r11) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        if (r3.c(r1, r8, r11) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r3 == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r3 == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, @m80.k j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.g.b(long, j00.c):java.lang.Object");
    }
}
