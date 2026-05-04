package i7;

import c4.o;
import c40.l2;
import c40.l3;
import c40.r0;
import c40.s0;
import c40.x0;
import com.baicizhan.app.biz.auth.IAuthRepo;
import com.baicizhan.app.biz.auth.n;
import com.baicizhan.app.biz.auth.p;
import k3.f3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f3.class})
@u0({"SMAP\nSynServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynServiceImpl.kt\ncom/baicizhan/app/biz/synservice/SynServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,74:1\n12#2,3:75\n15#2,10:90\n12#3,12:78\n*S KotlinDebug\n*F\n+ 1 SynServiceImpl.kt\ncom/baicizhan/app/biz/synservice/SynServiceImpl\n*L\n-1#1:75,3\n-1#1:90,10\n-1#1:78,12\n*E\n"})
/* loaded from: classes3.dex */
public final class g implements f3, p {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i7.b f60222b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IAuthRepo f60223c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r0 f60224d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public x0<g2> f60225e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60226f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.SynServiceImpl$doSync$2", f = "SynServiceImpl.kt", i = {}, l = {46, 46}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60227a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return g.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (((i7.a) r5).a(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f60227a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L3d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L32
            L1e:
                kotlin.e.n(r5)
                i7.g r5 = i7.g.this
                i7.b r5 = i7.g.E(r5)
                com.baicizhan.app.biz.synservice.SynTaskType r1 = com.baicizhan.app.biz.synservice.SynTaskType.SYNC_ALL
                r4.f60227a = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L32
                goto L3c
            L32:
                i7.a r5 = (i7.a) r5
                r4.f60227a = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                i7.g r5 = i7.g.this
                r0 = 0
                i7.g.J(r5, r0)
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.SynServiceImpl$doSync$3", f = "SynServiceImpl.kt", i = {}, l = {52, 58, 58, 61, 61}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60229a;

        /* renamed from: b, reason: collision with root package name */
        public int f60230b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return g.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
        
            if (((i7.a) r10).a(r9) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        
            if (((i7.a) r10).a(r9) == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        
            if (r10 == r0) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
        
            if (r10 == r0) goto L39;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f60230b
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3d
                if (r1 == r6) goto L31
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                kotlin.e.n(r10)
                goto La7
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                kotlin.e.n(r10)
                goto L9c
            L29:
                kotlin.e.n(r10)
                goto L82
            L2d:
                kotlin.e.n(r10)
                goto L77
            L31:
                java.lang.Object r1 = r9.f60229a
                i7.g r1 = (i7.g) r1
                kotlin.e.n(r10)     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                goto L51
            L39:
                r0 = move-exception
                r10 = r0
                goto Laa
            L3d:
                kotlin.e.n(r10)
                i7.g r1 = i7.g.this     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                com.baicizhan.app.biz.auth.IAuthRepo r10 = i7.g.r(r1)     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                r9.f60229a = r1     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                r9.f60230b = r6     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                java.lang.Object r10 = r10.a(r9)     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                if (r10 != r0) goto L51
                goto La6
            L51:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                boolean r10 = r10.booleanValue()     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                r10 = r10 ^ r6
                i7.g.J(r1, r10)     // Catch: com.baicizhan.app.biz.auth.IAuthRepo.KickOffException -> L39
                i7.g r10 = i7.g.this
                boolean r10 = i7.g.v(r10)
                r1 = 0
                if (r10 == 0) goto L89
                i7.g r10 = i7.g.this
                i7.b r10 = i7.g.E(r10)
                com.baicizhan.app.biz.synservice.SynTaskType r2 = com.baicizhan.app.biz.synservice.SynTaskType.SYNC_ALL
                r9.f60229a = r1
                r9.f60230b = r5
                java.lang.Object r10 = r10.a(r2, r9)
                if (r10 != r0) goto L77
                goto La6
            L77:
                i7.a r10 = (i7.a) r10
                r9.f60230b = r4
                java.lang.Object r10 = r10.a(r9)
                if (r10 != r0) goto L82
                goto La6
            L82:
                i7.g r10 = i7.g.this
                r0 = 0
                i7.g.J(r10, r0)
                goto La7
            L89:
                i7.g r10 = i7.g.this
                i7.b r10 = i7.g.E(r10)
                com.baicizhan.app.biz.synservice.SynTaskType r4 = com.baicizhan.app.biz.synservice.SynTaskType.SYNC
                r9.f60229a = r1
                r9.f60230b = r3
                java.lang.Object r10 = r10.a(r4, r9)
                if (r10 != r0) goto L9c
                goto La6
            L9c:
                i7.a r10 = (i7.a) r10
                r9.f60230b = r2
                java.lang.Object r10 = r10.a(r9)
                if (r10 != r0) goto La7
            La6:
                return r0
            La7:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            Laa:
                z6.b r0 = z6.b.f101032b
                java.lang.String r1 = "SynService"
                java.lang.String r2 = "SYNC"
                r0.i(r1, r2, r10)
                com.baicizhan.app.api.service.BizException r3 = new com.baicizhan.app.api.service.BizException
                r7 = 2
                r8 = 0
                java.lang.String r4 = "kick off"
                r5 = 0
                r6 = 8
                r3.<init>(r4, r5, r6, r7, r8)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.SynServiceImpl", f = "SynServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {35, 37}, m = "sync", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SynServiceImpl$sync$2", "$i$f$bizCatch", "$i$a$-bizCatch-SynServiceImpl$sync$2$1", "tag$iv", "current", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SynServiceImpl$sync$2", "$i$f$bizCatch", "$i$a$-bizCatch-SynServiceImpl$sync$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60232a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60233b;

        /* renamed from: c, reason: collision with root package name */
        public int f60234c;

        /* renamed from: d, reason: collision with root package name */
        public int f60235d;

        /* renamed from: e, reason: collision with root package name */
        public int f60236e;

        /* renamed from: f, reason: collision with root package name */
        public int f60237f;

        /* renamed from: g, reason: collision with root package name */
        public long f60238g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f60239h;

        /* renamed from: j, reason: collision with root package name */
        public int f60241j;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f60239h = obj;
            this.f60241j |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    public g(@k i7.b taskFactory, @k IAuthRepo auth, @k n logoutHub) {
        g0.p(taskFactory, "taskFactory");
        g0.p(auth, "auth");
        g0.p(logoutHub, "logoutHub");
        this.f60222b = taskFactory;
        this.f60223c = auth;
        logoutHub.b(this);
        this.f60224d = s0.a(o.b().plus(l3.c(null, 1, null)));
        this.f60226f = true;
    }

    @Override // com.baicizhan.app.biz.auth.p
    @l
    public Object A2(@k j00.c<? super g2> cVar) {
        x0<g2> x0Var = this.f60225e;
        if (x0Var != null) {
            l2.a.b(x0Var, null, 1, null);
        }
        this.f60225e = null;
        this.f60226f = true;
        return g2.f100423a;
    }

    public final Object B0(j00.c<? super x0<g2>> cVar) {
        x0 b11;
        x0 b12;
        z6.b.j(z6.b.f101032b, h.f60242a, "doSync", null, 4, null);
        if (this.f60226f) {
            b12 = c40.k.b(this.f60224d, null, null, new a(null), 3, null);
            return b12;
        }
        b11 = c40.k.b(this.f60224d, null, null, new b(null), 3, null);
        return b11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:23:0x0113, B:25:0x011a, B:27:0x011e, B:29:0x0122, B:31:0x0126, B:33:0x012a, B:44:0x0190, B:35:0x0134, B:37:0x013f, B:39:0x0153, B:41:0x0167, B:43:0x017c), top: B:22:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:23:0x0113, B:25:0x011a, B:27:0x011e, B:29:0x0122, B:31:0x0126, B:33:0x012a, B:44:0x0190, B:35:0x0134, B:37:0x013f, B:39:0x0153, B:41:0x0167, B:43:0x017c), top: B:22:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.f3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.g.a(j00.c):java.lang.Object");
    }
}
