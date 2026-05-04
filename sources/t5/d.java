package t5;

import a00.m;
import c40.r0;
import com.baicizhan.app.biz.base.cache.CacheStrategy;
import com.microsoft.thrifty.service.a;
import h5.z;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import l7.i0;
import l7.p;
import m80.k;
import oa0.r;
import t3.a0;
import t3.e;
import t3.n;
import t3.z;
import x00.l;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {t5.a.class})
@u0({"SMAP\nNotificationRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRepo.kt\ncom/baicizhan/app/biz/game/repo/notifications/NotificationRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,198:1\n6#2:199\n64#3,2:200\n66#3:203\n67#3,2:209\n6#4:202\n124#5,4:204\n142#6:208\n116#7,11:211\n116#7,11:222\n116#7,11:233\n116#7,11:244\n116#7,11:255\n*S KotlinDebug\n*F\n+ 1 NotificationRepo.kt\ncom/baicizhan/app/biz/game/repo/notifications/NotificationRepoImpl\n*L\n52#1:199\n52#1:200,2\n52#1:203\n52#1:209,2\n52#1:202\n52#1:204,4\n52#1:208\n94#1:211,11\n100#1:222,11\n106#1:233,11\n112#1:244,11\n173#1:255,11\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements t5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f89503a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f89504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f89505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final t3.g<r8.c> f89506d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final m<r8.b> f89507e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final m<r8.b> f89508f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final n40.a f89509g;

    /* renamed from: h, reason: collision with root package name */
    public int f89510h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final y<z> f89511i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl$cache$1$1", f = "NotificationRepo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements l<j00.c<? super r8.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f89512a;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return d.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super r8.c> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f89512a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            r8.d u11 = d.this.u();
            f8.a a11 = t5.f.a();
            this.f89512a = 1;
            Object S2 = u11.S2(a11, this);
            return S2 == l11 ? l11 : S2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {}, l = {82}, m = "getLocalClickTime", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f89514a;

        /* renamed from: c, reason: collision with root package name */
        public int f89516c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89514a = obj;
            this.f89516c |= Integer.MIN_VALUE;
            return d.this.t(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {0, 0}, l = {204}, m = "getPopupAd", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89517a;

        /* renamed from: b, reason: collision with root package name */
        public int f89518b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89519c;

        /* renamed from: e, reason: collision with root package name */
        public int f89521e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89519c = obj;
            this.f89521e |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {0, 0}, l = {204}, m = "getPopupNotify", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    /* renamed from: t5.d$d, reason: collision with other inner class name */
    public static final class C1176d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89522a;

        /* renamed from: b, reason: collision with root package name */
        public int f89523b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89524c;

        /* renamed from: e, reason: collision with root package name */
        public int f89526e;

        public C1176d(j00.c<? super C1176d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89524c = obj;
            this.f89526e |= Integer.MIN_VALUE;
            return d.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {204, 176, 179}, m = "markAsRead", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$markAsRead$2", "serverTime", "$this$withLock_u24default$iv", "current", "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$markAsRead$2", "serverTime"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89527a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89528b;

        /* renamed from: c, reason: collision with root package name */
        public int f89529c;

        /* renamed from: d, reason: collision with root package name */
        public int f89530d;

        /* renamed from: e, reason: collision with root package name */
        public int f89531e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f89532f;

        /* renamed from: h, reason: collision with root package name */
        public int f89534h;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89532f = obj;
            this.f89534h |= Integer.MIN_VALUE;
            return d.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {0, 0, 0}, l = {204}, m = "removePopupAd", n = {q9.h.f81943g, "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89535a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89536b;

        /* renamed from: c, reason: collision with root package name */
        public int f89537c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f89538d;

        /* renamed from: f, reason: collision with root package name */
        public int f89540f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89538d = obj;
            this.f89540f |= Integer.MIN_VALUE;
            return d.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {0, 0, 0}, l = {204}, m = "removePopupNotify", n = {q9.h.f81943g, "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89541a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89542b;

        /* renamed from: c, reason: collision with root package name */
        public int f89543c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f89544d;

        /* renamed from: f, reason: collision with root package name */
        public int f89546f;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89544d = obj;
            this.f89546f |= Integer.MIN_VALUE;
            return d.this.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class h implements l<w7.d<r8.d>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f89547a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f89548b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f89549c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f89550a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f89551b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f89552c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f89550a = eVar;
                this.f89551b = cVar;
                this.f89552c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f89550a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f89550a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f89551b.b(this.f89552c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public h(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f89547a = dVar;
            this.f89548b = eVar;
            this.f89549c = cVar;
        }

        public final void a(w7.d<r8.d> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f89548b, this.f89549c, this.f89547a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f89547a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<r8.d> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl", f = "NotificationRepo.kt", i = {0, 0}, l = {121}, m = "sync", n = {"$this$sync_u24lambda_u240", "$i$a$-runCatching-NotificationRepoImpl$sync$2"}, s = {"L$0", "I$0"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89553a;

        /* renamed from: b, reason: collision with root package name */
        public int f89554b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89555c;

        /* renamed from: e, reason: collision with root package name */
        public int f89557e;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@k Object obj) {
            this.f89555c = obj;
            this.f89557e |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.notifications.NotificationRepoImpl$sync$2$1", f = "NotificationRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5}, l = {204, 123, 131, 135, 144, 151}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$sync$2$1$1", "$this$withLock_u24default$iv", q9.h.f81943g, "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$sync$2$1$1", "unreadCount", "serverTime", "$this$withLock_u24default$iv", q9.h.f81943g, "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$sync$2$1$1", "unreadCount", "serverTime", "localClickTime", "$this$withLock_u24default$iv", q9.h.f81943g, "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$sync$2$1$1", "unreadCount", "serverTime", "localClickTime", "$this$withLock_u24default$iv", q9.h.f81943g, "$i$f$withLock", "$i$a$-withLock$default-NotificationRepoImpl$sync$2$1$1", "unreadCount", "serverTime", "localClickTime", "hasNew"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "L$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$2", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$2", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$2", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    @u0({"SMAP\nNotificationRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRepo.kt\ncom/baicizhan/app/biz/game/repo/notifications/NotificationRepoImpl$sync$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,198:1\n116#2,11:199\n*S KotlinDebug\n*F\n+ 1 NotificationRepo.kt\ncom/baicizhan/app/biz/game/repo/notifications/NotificationRepoImpl$sync$2$1\n*L\n122#1:199,11\n*E\n"})
    public static final class j extends SuspendLambda implements x00.p<r0, j00.c<? super r8.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f89558a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89559b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89560c;

        /* renamed from: d, reason: collision with root package name */
        public int f89561d;

        /* renamed from: e, reason: collision with root package name */
        public int f89562e;

        /* renamed from: f, reason: collision with root package name */
        public int f89563f;

        /* renamed from: g, reason: collision with root package name */
        public int f89564g;

        /* renamed from: h, reason: collision with root package name */
        public int f89565h;

        /* renamed from: i, reason: collision with root package name */
        public int f89566i;

        /* renamed from: j, reason: collision with root package name */
        public int f89567j;

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return d.this.new j(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super r8.b> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Not initialized variable reg: 10, insn: 0x0044: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:69), block:B:83:0x0044 */
        /* JADX WARN: Removed duplicated region for block: B:12:0x01a6 A[Catch: all -> 0x0025, TryCatch #1 {all -> 0x0025, blocks: (B:9:0x0020, B:10:0x01a2, B:12:0x01a6, B:13:0x01ad, B:15:0x01b1), top: B:8:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x01b1 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #1 {all -> 0x0025, blocks: (B:9:0x0020, B:10:0x01a2, B:12:0x01a6, B:13:0x01ad, B:15:0x01b1), top: B:8:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00e0 A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:27:0x0179, B:39:0x014c, B:48:0x0114, B:51:0x011e, B:58:0x008a, B:59:0x00da, B:61:0x00e0, B:62:0x00e6, B:64:0x00ea, B:65:0x00f0), top: B:57:0x008a }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00ea A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:27:0x0179, B:39:0x014c, B:48:0x0114, B:51:0x011e, B:58:0x008a, B:59:0x00da, B:61:0x00e0, B:62:0x00e6, B:64:0x00ea, B:65:0x00f0), top: B:57:0x008a }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 472
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.d.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(@k p thrift, @k com.baicizhan.app.biz.auth.r tokenProvider, @k com.baicizhan.app.preferences.a preferenceFactory) {
        g0.p(thrift, "thrift");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(preferenceFactory, "preferenceFactory");
        this.f89503a = thrift;
        this.f89504b = tokenProvider;
        this.f89505c = preferenceFactory;
        this.f89506d = a0.a(new l() { // from class: t5.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s11;
                s11 = d.s(d.this, (t3.b) obj);
                return s11;
            }
        });
        this.f89507e = new m<>();
        this.f89508f = new m<>();
        this.f89509g = n40.g.b(false, 1, null);
        this.f89511i = o0.a(new z(t5.e.f89573e, false, 0, 0));
    }

    public static final g2 s(d dVar, t3.b cache) {
        g0.p(cache, "$this$cache");
        cache.f(t5.e.f89570b);
        cache.g(CacheStrategy.NETWORK_FIRST);
        cache.i(n.b.f89275a);
        cache.h(new e.a(new z.b(r8.c.f83615l), false, 2, null));
        cache.j(dVar.new a(null));
        return g2.f100423a;
    }

    public static final boolean w(r8.b bVar, r8.b it) {
        g0.p(it, "it");
        return g0.g(it.f83604g, bVar.f83604g);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r0 = kotlin.Result.Companion;
        r6 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // t5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t5.d.i
            if (r0 == 0) goto L13
            r0 = r6
            t5.d$i r0 = (t5.d.i) r0
            int r1 = r0.f89557e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89557e = r1
            goto L18
        L13:
            t5.d$i r0 = new t5.d$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f89555c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89557e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f89553a
            t5.d r0 = (t5.d) r0
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L58
        L2d:
            r6 = move-exception
            goto L5f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.e.n(r6)
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            c40.m0 r6 = c4.o.b()     // Catch: java.lang.Throwable -> L2d
            t5.d$j r2 = new t5.d$j     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = l00.k.a(r5)     // Catch: java.lang.Throwable -> L2d
            r0.f89553a = r4     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r0.f89554b = r4     // Catch: java.lang.Throwable -> L2d
            r0.f89557e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = c40.i.h(r6, r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L58
            return r1
        L58:
            r8.b r6 = (r8.b) r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = kotlin.Result.m6308constructorimpl(r6)     // Catch: java.lang.Throwable -> L2d
            goto L69
        L5f:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.e.a(r6)
            java.lang.Object r6 = kotlin.Result.m6308constructorimpl(r6)
        L69:
            java.lang.Throwable r6 = kotlin.Result.m6311exceptionOrNullimpl(r6)
            if (r6 == 0) goto L78
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "NotificationRepo"
            java.lang.String r2 = "sync failed"
            r0.e(r1, r2, r6)
        L78:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k final r8.b r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t5.d.f
            if (r0 == 0) goto L13
            r0 = r7
            t5.d$f r0 = (t5.d.f) r0
            int r1 = r0.f89540f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89540f = r1
            goto L18
        L13:
            t5.d$f r0 = new t5.d$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f89538d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89540f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f89536b
            n40.a r6 = (n40.a) r6
            java.lang.Object r0 = r0.f89535a
            r8.b r0 = (r8.b) r0
            kotlin.e.n(r7)
            r7 = r6
            r6 = r0
            goto L51
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.e.n(r7)
            n40.a r7 = r5.f89509g
            r0.f89535a = r6
            r0.f89536b = r7
            r2 = 0
            r0.f89537c = r2
            r0.f89540f = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            a00.m<r8.b> r0 = r5.f89508f     // Catch: java.lang.Throwable -> L61
            t5.c r1 = new t5.c     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            a00.m0.N0(r0, r1)     // Catch: java.lang.Throwable -> L61
            r7.unlock(r4)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L61:
            r6 = move-exception
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.b(r8.b, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k j00.c<? super r8.b> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t5.d.c
            if (r0 == 0) goto L13
            r0 = r6
            t5.d$c r0 = (t5.d.c) r0
            int r1 = r0.f89521e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89521e = r1
            goto L18
        L13:
            t5.d$c r0 = new t5.d$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f89519c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89521e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f89517a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            n40.a r6 = r5.f89509g
            r0.f89517a = r6
            r2 = 0
            r0.f89518b = r2
            r0.f89521e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            a00.m<r8.b> r6 = r5.f89508f     // Catch: java.lang.Throwable -> L56
            java.lang.Object r6 = r6.h()     // Catch: java.lang.Throwable -> L56
            r8.b r6 = (r8.b) r6     // Catch: java.lang.Throwable -> L56
            r0.unlock(r4)
            return r6
        L56:
            r6 = move-exception
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.c(j00.c):java.lang.Object");
    }

    @Override // t5.a
    @k
    public kotlinx.coroutines.flow.i<h5.z> d() {
        return this.f89511i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k j00.c<? super r8.b> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof t5.d.C1176d
            if (r0 == 0) goto L13
            r0 = r6
            t5.d$d r0 = (t5.d.C1176d) r0
            int r1 = r0.f89526e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89526e = r1
            goto L18
        L13:
            t5.d$d r0 = new t5.d$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f89524c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89526e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f89522a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            n40.a r6 = r5.f89509g
            r0.f89522a = r6
            r2 = 0
            r0.f89523b = r2
            r0.f89526e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            a00.m<r8.b> r6 = r5.f89507e     // Catch: java.lang.Throwable -> L56
            java.lang.Object r6 = r6.h()     // Catch: java.lang.Throwable -> L56
            r8.b r6 = (r8.b) r6     // Catch: java.lang.Throwable -> L56
            r0.unlock(r4)
            return r6
        L56:
            r6 = move-exception
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.e(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r0.emit(r11, r2) != r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:26:0x0053, B:27:0x0090, B:33:0x0079, B:35:0x007d), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r17v0, types: [t5.d] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    @Override // t5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@m80.k j00.c<? super yz.g2> r18) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.f(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // t5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k r8.b r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t5.d.g
            if (r0 == 0) goto L13
            r0 = r7
            t5.d$g r0 = (t5.d.g) r0
            int r1 = r0.f89546f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89546f = r1
            goto L18
        L13:
            t5.d$g r0 = new t5.d$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f89544d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89546f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f89542b
            n40.a r6 = (n40.a) r6
            java.lang.Object r0 = r0.f89541a
            r8.b r0 = (r8.b) r0
            kotlin.e.n(r7)
            r7 = r6
            r6 = r0
            goto L51
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            kotlin.e.n(r7)
            n40.a r7 = r5.f89509g
            r0.f89541a = r6
            r0.f89542b = r7
            r2 = 0
            r0.f89543c = r2
            r0.f89546f = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            a00.m<r8.b> r0 = r5.f89507e     // Catch: java.lang.Throwable -> L5c
            r0.remove(r6)     // Catch: java.lang.Throwable -> L5c
            r7.unlock(r4)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L5c:
            r6 = move-exception
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.g(r8.b, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(j00.c<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof t5.d.b
            if (r0 == 0) goto L13
            r0 = r5
            t5.d$b r0 = (t5.d.b) r0
            int r1 = r0.f89516c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89516c = r1
            goto L18
        L13:
            t5.d$b r0 = new t5.d$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f89514a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89516c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            com.baicizhan.app.preferences.g r5 = r4.v()
            r2 = 0
            if (r5 == 0) goto L4c
            r0.f89516c = r3
            java.lang.String r3 = "last_click_time"
            java.lang.Object r5 = r5.d(r3, r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
        L4c:
            java.lang.Integer r5 = l00.a.f(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.d.t(j00.c):java.lang.Object");
    }

    public final r8.d u() {
        return (r8.d) w7.f.b(new h(kotlin.jvm.internal.o0.d(r8.d.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }

    public final com.baicizhan.app.preferences.g v() {
        Long b11 = this.f89504b.b();
        if (b11 == null) {
            return null;
        }
        long longValue = b11.longValue();
        return this.f89505c.a("notify_click-" + longValue);
    }

    public final Object x(int i11, j00.c<? super g2> cVar) {
        com.baicizhan.app.preferences.g v11 = v();
        if (v11 == null) {
            return g2.f100423a;
        }
        Object f11 = v11.f(t5.e.f89572d, i11, cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }
}
