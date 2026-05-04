package d4;

import c4.j;
import com.heytap.mcssdk.constant.IntentConstant;
import com.microsoft.thrifty.service.a;
import k3.e0;
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
import y7.f;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {e0.class})
@u0({"SMAP\nDakaCalendarServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaCalendarServiceImpl.kt\ncom/baicizhan/app/biz/dakacalendar/DakaCalendarServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,55:1\n6#2:56\n64#3,2:57\n66#3:60\n67#3,2:66\n6#4:59\n124#5,4:61\n142#6:65\n12#7,3:68\n15#7,10:89\n12#8,2:71\n14#8,10:79\n1563#9:73\n1634#9,3:74\n37#10,2:77\n*S KotlinDebug\n*F\n+ 1 DakaCalendarServiceImpl.kt\ncom/baicizhan/app/biz/dakacalendar/DakaCalendarServiceImpl\n*L\n22#1:56\n22#1:57,2\n22#1:60\n22#1:66,2\n22#1:59\n22#1:61,4\n22#1:65\n-1#1:68,3\n-1#1:89,10\n-1#1:71,2\n-1#1:79,10\n27#1:73\n27#1:74,3\n27#1:77,2\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f47160b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final o7.c f47161c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.dakacalendar.DakaCalendarServiceImpl", f = "DakaCalendarServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {32}, m = "calendarDailyInfo", n = {"tag$iv", "$this$calendarDailyInfo_u240", "date", "pageOffset", "pageSize", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DakaCalendarServiceImpl$calendarDailyInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-DakaCalendarServiceImpl$calendarDailyInfo$2$1", "$i$a$-run-DakaCalendarServiceImpl$calendarDailyInfo$2$1$1"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "J$0", "I$4", "I$5", "I$6", "I$7"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f47162a;

        /* renamed from: b, reason: collision with root package name */
        public int f47163b;

        /* renamed from: c, reason: collision with root package name */
        public int f47164c;

        /* renamed from: d, reason: collision with root package name */
        public int f47165d;

        /* renamed from: e, reason: collision with root package name */
        public int f47166e;

        /* renamed from: f, reason: collision with root package name */
        public int f47167f;

        /* renamed from: g, reason: collision with root package name */
        public int f47168g;

        /* renamed from: h, reason: collision with root package name */
        public int f47169h;

        /* renamed from: i, reason: collision with root package name */
        public Object f47170i;

        /* renamed from: j, reason: collision with root package name */
        public Object f47171j;

        /* renamed from: k, reason: collision with root package name */
        public long f47172k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f47173l;

        /* renamed from: n, reason: collision with root package name */
        public int f47175n;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f47173l = obj;
            this.f47175n |= Integer.MIN_VALUE;
            return c.this.f2(0, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.dakacalendar.DakaCalendarServiceImpl", f = "DakaCalendarServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {47}, m = "calendarResignInfo", n = {"tag$iv", "$this$calendarResignInfo_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DakaCalendarServiceImpl$calendarResignInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-DakaCalendarServiceImpl$calendarResignInfo$2$1", "$i$a$-run-DakaCalendarServiceImpl$calendarResignInfo$2$1$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f47176a;

        /* renamed from: b, reason: collision with root package name */
        public Object f47177b;

        /* renamed from: c, reason: collision with root package name */
        public int f47178c;

        /* renamed from: d, reason: collision with root package name */
        public int f47179d;

        /* renamed from: e, reason: collision with root package name */
        public int f47180e;

        /* renamed from: f, reason: collision with root package name */
        public int f47181f;

        /* renamed from: g, reason: collision with root package name */
        public int f47182g;

        /* renamed from: h, reason: collision with root package name */
        public long f47183h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f47184i;

        /* renamed from: k, reason: collision with root package name */
        public int f47186k;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f47184i = obj;
            this.f47186k |= Integer.MIN_VALUE;
            return c.this.F0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.dakacalendar.DakaCalendarServiceImpl", f = "DakaCalendarServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {26}, m = "dakaHistory", n = {"beginDate", IntentConstant.END_DATE, "tag$iv", "$this$dakaHistory_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DakaCalendarServiceImpl$dakaHistory$2", "$i$f$bizCatch", "$i$a$-bizCatch-DakaCalendarServiceImpl$dakaHistory$2$1", "$i$a$-run-DakaCalendarServiceImpl$dakaHistory$2$1$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    /* renamed from: d4.c$c, reason: collision with other inner class name */
    public static final class C0547c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f47187a;

        /* renamed from: b, reason: collision with root package name */
        public Object f47188b;

        /* renamed from: c, reason: collision with root package name */
        public Object f47189c;

        /* renamed from: d, reason: collision with root package name */
        public Object f47190d;

        /* renamed from: e, reason: collision with root package name */
        public int f47191e;

        /* renamed from: f, reason: collision with root package name */
        public int f47192f;

        /* renamed from: g, reason: collision with root package name */
        public int f47193g;

        /* renamed from: h, reason: collision with root package name */
        public int f47194h;

        /* renamed from: i, reason: collision with root package name */
        public int f47195i;

        /* renamed from: j, reason: collision with root package name */
        public long f47196j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47197k;

        /* renamed from: m, reason: collision with root package name */
        public int f47199m;

        public C0547c(j00.c<? super C0547c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f47197k = obj;
            this.f47199m |= Integer.MIN_VALUE;
            return c.this.t2(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.dakacalendar.DakaCalendarServiceImpl", f = "DakaCalendarServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {38}, m = "dakaRescue", n = {"yyyyMMdd", "tag$iv", "$this$dakaRescue_u240", "minuteTimezone", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DakaCalendarServiceImpl$dakaRescue$2", "$i$f$bizCatch", "$i$a$-bizCatch-DakaCalendarServiceImpl$dakaRescue$2$1", "$i$a$-run-DakaCalendarServiceImpl$dakaRescue$2$1$1"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f47200a;

        /* renamed from: b, reason: collision with root package name */
        public Object f47201b;

        /* renamed from: c, reason: collision with root package name */
        public Object f47202c;

        /* renamed from: d, reason: collision with root package name */
        public int f47203d;

        /* renamed from: e, reason: collision with root package name */
        public int f47204e;

        /* renamed from: f, reason: collision with root package name */
        public int f47205f;

        /* renamed from: g, reason: collision with root package name */
        public int f47206g;

        /* renamed from: h, reason: collision with root package name */
        public int f47207h;

        /* renamed from: i, reason: collision with root package name */
        public int f47208i;

        /* renamed from: j, reason: collision with root package name */
        public long f47209j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47210k;

        /* renamed from: m, reason: collision with root package name */
        public int f47212m;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f47210k = obj;
            this.f47212m |= Integer.MIN_VALUE;
            return c.this.q0(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f47213a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f47214b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f47215c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f47216a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f47217b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f47218c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f47216a = eVar;
                this.f47217b = cVar;
                this.f47218c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f47216a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f47216a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f47217b.b(this.f47218c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f47213a = dVar;
            this.f47214b = eVar;
            this.f47215c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            f.a(thriftBuilder, new a(this.f47214b, this.f47215c, this.f47213a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f47213a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@k p thriftService, @k o7.c cdnRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(cdnRepo, "cdnRepo");
        this.f47160b = thriftService;
        this.f47161c = cdnRepo;
    }

    private final b2 h() {
        return (b2) w7.f.b(new e(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.e0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F0(@m80.k j00.c<? super k3.y> r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c.F0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:22:0x00bc, B:24:0x00c3, B:26:0x00c7, B:28:0x00cb, B:30:0x00cf, B:32:0x00d3, B:43:0x013a, B:34:0x00de, B:36:0x00e9, B:38:0x00fd, B:40:0x0111, B:42:0x0126), top: B:21:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:22:0x00bc, B:24:0x00c3, B:26:0x00c7, B:28:0x00cb, B:30:0x00cf, B:32:0x00d3, B:43:0x013a, B:34:0x00de, B:36:0x00e9, B:38:0x00fd, B:40:0x0111, B:42:0x0126), top: B:21:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.e0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f2(int r11, int r12, int r13, @m80.k j00.c<? super k3.w> r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c.f2(int, int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0082, B:14:0x0088, B:20:0x00c1, B:21:0x00cc), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0082, B:14:0x0088, B:20:0x00c1, B:21:0x00cc), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:25:0x00d2, B:27:0x00d9, B:29:0x00dd, B:31:0x00e1, B:33:0x00e5, B:35:0x00e9, B:46:0x0150, B:37:0x00f4, B:39:0x00ff, B:41:0x0113, B:43:0x0127, B:45:0x013c), top: B:24:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:25:0x00d2, B:27:0x00d9, B:29:0x00dd, B:31:0x00e1, B:33:0x00e5, B:35:0x00e9, B:46:0x0150, B:37:0x00f4, B:39:0x00ff, B:41:0x0113, B:43:0x0127, B:45:0x013c), top: B:24:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.e0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q0(@m80.k java.lang.String r11, int r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c.q0(java.lang.String, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac A[Catch: all -> 0x003e, LOOP:0: B:13:0x00a6->B:15:0x00ac, LOOP_END, TryCatch #2 {all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0091, B:13:0x00a6, B:15:0x00ac, B:17:0x00ba), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:27:0x00fe, B:29:0x0105, B:31:0x0109, B:33:0x010d, B:35:0x0111, B:37:0x0115, B:48:0x017c, B:39:0x0120, B:41:0x012b, B:43:0x013f, B:45:0x0153, B:47:0x0168), top: B:26:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:27:0x00fe, B:29:0x0105, B:31:0x0109, B:33:0x010d, B:35:0x0111, B:37:0x0115, B:48:0x017c, B:39:0x0120, B:41:0x012b, B:43:0x013f, B:45:0x0153, B:47:0x0168), top: B:26:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.e0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t2(@m80.k k3.t3 r11, @m80.k k3.t3 r12, @m80.k j00.c<? super k3.t3[]> r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c.t2(k3.t3, k3.t3, j00.c):java.lang.Object");
    }
}
