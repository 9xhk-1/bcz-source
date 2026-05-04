package r6;

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
@u0({"SMAP\nCheckUpdateWordRoadMapUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdateWordRoadMapUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/CheckUpdateWordRoadMapUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,39:1\n6#2:40\n64#3,2:41\n66#3:44\n67#3,2:50\n6#4:43\n124#5,4:45\n142#6:49\n*S KotlinDebug\n*F\n+ 1 CheckUpdateWordRoadMapUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/CheckUpdateWordRoadMapUC\n*L\n21#1:40\n21#1:41,2\n21#1:44\n21#1:50,2\n21#1:43\n21#1:45,4\n21#1:49\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83143a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f83144b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final o5.a f83145c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r5.a f83146d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.CheckUpdateWordRoadMapUC", f = "CheckUpdateWordRoadMapUC.kt", i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6}, l = {24, 26, 27, 29, 30, 31, 32}, m = "invoke", n = {"bookId", "bookId", "code", "bookId", "code", "bookId", "code", "bookId", "code", "remoteRoadMap", "bookId", "code", "remoteRoadMap", "bookId", "code"}, s = {"J$0", "J$0", "I$0", "J$0", "I$0", "J$0", "I$0", "J$0", "I$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83147a;

        /* renamed from: b, reason: collision with root package name */
        public int f83148b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83149c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f83150d;

        /* renamed from: f, reason: collision with root package name */
        public int f83152f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83150d = obj;
            this.f83152f |= Integer.MIN_VALUE;
            return i.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83153a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83155c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83156a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83157b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83158c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83156a = eVar;
                this.f83157b = cVar;
                this.f83158c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83156a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83156a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83157b.b(this.f83158c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83153a = dVar;
            this.f83154b = eVar;
            this.f83155c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83154b, this.f83155c, this.f83153a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83153a);
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

    public i(@m80.k l7.p thrift, @m80.k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @m80.k o5.a versionProvider, @m80.k r5.a sdkMigrateRepo) {
        g0.p(thrift, "thrift");
        g0.p(roadMapRepo, "roadMapRepo");
        g0.p(versionProvider, "versionProvider");
        g0.p(sdkMigrateRepo, "sdkMigrateRepo");
        this.f83143a = thrift;
        this.f83144b = roadMapRepo;
        this.f83145c = versionProvider;
        this.f83146d = sdkMigrateRepo;
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        if (r6.d(r4, r1, r9) == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        if (r1 == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r1 != r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r1.a(r7, 2, r9) != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (r1 == r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, @m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.i.b(long, j00.c):java.lang.Object");
    }
}
