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
@u0({"SMAP\nFetchStudyAndAbilityUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchStudyAndAbilityUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchStudyAndAbilityUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,37:1\n6#2:38\n64#3,2:39\n66#3:42\n67#3,2:48\n6#4:41\n124#5,4:43\n142#6:47\n*S KotlinDebug\n*F\n+ 1 FetchStudyAndAbilityUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchStudyAndAbilityUC\n*L\n20#1:38\n20#1:39,2\n20#1:42\n20#1:48,2\n20#1:41\n20#1:43,4\n20#1:47\n*E\n"})
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83237a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final j5.e f83238b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p6.m f83239c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final o5.a f83240d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchStudyAndAbilityUC", f = "FetchStudyAndAbilityUC.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {24, 32, 33, 34}, m = "invoke", n = {"bookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId", HiAnalyticsConstant.Direction.RESPONSE, "bookId"}, s = {"J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83241a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83242b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f83243c;

        /* renamed from: e, reason: collision with root package name */
        public int f83245e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83243c = obj;
            this.f83245e |= Integer.MIN_VALUE;
            return t.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83246a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83247b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83248c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83249a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83250b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83251c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83249a = eVar;
                this.f83250b = cVar;
                this.f83251c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83249a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83249a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83250b.b(this.f83251c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83246a = dVar;
            this.f83247b = eVar;
            this.f83248c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83247b, this.f83248c, this.f83246a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83246a);
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

    public t(@m80.k l7.p thrift, @m80.k j5.e abilityRepo, @m80.k p6.m mergeStudyRecordUC, @m80.k o5.a versionProvider) {
        g0.p(thrift, "thrift");
        g0.p(abilityRepo, "abilityRepo");
        g0.p(mergeStudyRecordUC, "mergeStudyRecordUC");
        g0.p(versionProvider, "versionProvider");
        this.f83237a = thrift;
        this.f83238b = abilityRepo;
        this.f83239c = mergeStudyRecordUC;
        this.f83240d = versionProvider;
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r11.a(r9, r4, r7) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r11 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, @m80.k j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.t.b(long, j00.c):java.lang.Object");
    }
}
