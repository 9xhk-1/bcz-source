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
@u0({"SMAP\nFetchVersionInfoUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchVersionInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchVersionInfoUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,36:1\n6#2:37\n64#3,2:38\n66#3:41\n67#3,2:47\n6#4:40\n124#5,4:42\n142#6:46\n*S KotlinDebug\n*F\n+ 1 FetchVersionInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchVersionInfoUC\n*L\n18#1:37\n18#1:38,2\n18#1:41\n18#1:47,2\n18#1:40\n18#1:42,4\n18#1:46\n*E\n"})
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83252a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o5.a f83253b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final w3.a f83254c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c6.b f83255d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchVersionInfoUC", f = "FetchVersionInfoUC.kt", i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, l = {22, 23, 24, 25, 27, 30}, m = "invoke", n = {"bookId", "synInfo", "bookId", "synInfo", "bookId", "synInfo", "bookId", "synInfo", "bookId", "it", "$i$a$-also-FetchVersionInfoUC$invoke$2", "synInfo", "it", "bookId", "$i$a$-also-FetchVersionInfoUC$invoke$3"}, s = {"J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "I$0", "I$1", "L$0", "L$2", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83256a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83257b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83258c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83259d;

        /* renamed from: e, reason: collision with root package name */
        public int f83260e;

        /* renamed from: f, reason: collision with root package name */
        public int f83261f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f83262g;

        /* renamed from: i, reason: collision with root package name */
        public int f83264i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83262g = obj;
            this.f83264i |= Integer.MIN_VALUE;
            return u.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83265a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83266b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83267c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83268a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83269b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83270c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83268a = eVar;
                this.f83269b = cVar;
                this.f83270c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83268a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83268a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83269b.b(this.f83270c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83265a = dVar;
            this.f83266b = eVar;
            this.f83267c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83266b, this.f83267c, this.f83265a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83265a);
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

    public u(@m80.k l7.p thrift, @m80.k o5.a versionProvider, @m80.k w3.a timeProvider, @m80.k c6.b userGameInfo) {
        g0.p(thrift, "thrift");
        g0.p(versionProvider, "versionProvider");
        g0.p(timeProvider, "timeProvider");
        g0.p(userGameInfo, "userGameInfo");
        this.f83252a = thrift;
        this.f83253b = versionProvider;
        this.f83254c = timeProvider;
        this.f83255d = userGameInfo;
    }

    public final p8.s a() {
        return (p8.s) w7.f.b(new b(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0114, code lost:
    
        if (r4.j(r2, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f4, code lost:
    
        if (r5.l(r4, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        if (r13.f(r4, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r13.c(r4, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r11, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.u.b(long, j00.c):java.lang.Object");
    }
}
