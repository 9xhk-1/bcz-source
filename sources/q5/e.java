package q5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {q5.d.class})
@u0({"SMAP\nIpPopupRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IpPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpPopupRepoImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,89:1\n382#2,7:90\n116#3,10:97\n116#3,11:107\n116#3,11:118\n116#3,10:129\n*S KotlinDebug\n*F\n+ 1 IpPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpPopupRepoImpl\n*L\n45#1:90,7\n61#1:97,10\n69#1:107,11\n80#1:118,11\n86#1:129,10\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements q5.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f81739a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n40.a f81740b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<Long, Boolean> f81741c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Long, h8.f> f81742d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<Long, x<Boolean>> f81743e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpPopupRepoImpl", f = "IpPopupRepo.kt", i = {0, 0}, l = {95}, m = "getAutoUnlockIpAvatarFailed", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81744a;

        /* renamed from: b, reason: collision with root package name */
        public int f81745b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f81746c;

        /* renamed from: e, reason: collision with root package name */
        public int f81748e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81746c = obj;
            this.f81748e |= Integer.MIN_VALUE;
            return e.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpPopupRepoImpl", f = "IpPopupRepo.kt", i = {0, 0}, l = {95}, m = "getAvatarBasicInfo", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81749a;

        /* renamed from: b, reason: collision with root package name */
        public int f81750b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f81751c;

        /* renamed from: e, reason: collision with root package name */
        public int f81753e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81751c = obj;
            this.f81753e |= Integer.MIN_VALUE;
            return e.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpPopupRepoImpl", f = "IpPopupRepo.kt", i = {0, 0, 0}, l = {95}, m = "setAutoUnlockIpAvatarFailed", n = {"$this$withLock_u24default$iv", "failed", "$i$f$withLock"}, s = {"L$0", "Z$0", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f81754a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81755b;

        /* renamed from: c, reason: collision with root package name */
        public int f81756c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f81757d;

        /* renamed from: f, reason: collision with root package name */
        public int f81759f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81757d = obj;
            this.f81759f |= Integer.MIN_VALUE;
            return e.this.b(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpPopupRepoImpl", f = "IpPopupRepo.kt", i = {0, 0, 0}, l = {95}, m = "setAvatarBasicInfo", n = {"avatarBasicInfo", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81760a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81761b;

        /* renamed from: c, reason: collision with root package name */
        public int f81762c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f81763d;

        /* renamed from: f, reason: collision with root package name */
        public int f81765f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81763d = obj;
            this.f81765f |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    public e(@k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(tokenProvider, "tokenProvider");
        this.f81739a = tokenProvider;
        this.f81740b = n40.g.b(false, 1, null);
        this.f81741c = new LinkedHashMap();
        this.f81742d = new LinkedHashMap();
        this.f81743e = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // q5.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.l h8.f r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q5.e.d
            if (r0 == 0) goto L13
            r0 = r7
            q5.e$d r0 = (q5.e.d) r0
            int r1 = r0.f81765f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81765f = r1
            goto L18
        L13:
            q5.e$d r0 = new q5.e$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f81763d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81765f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f81761b
            n40.a r6 = (n40.a) r6
            java.lang.Object r0 = r0.f81760a
            h8.f r0 = (h8.f) r0
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
            n40.a r7 = r5.f81740b
            r0.f81760a = r6
            r0.f81761b = r7
            r2 = 0
            r0.f81762c = r2
            r0.f81765f = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            long r0 = r5.g()     // Catch: java.lang.Throwable -> L64
            java.util.Map<java.lang.Long, h8.f> r2 = r5.f81742d     // Catch: java.lang.Throwable -> L64
            java.lang.Long r0 = l00.a.g(r0)     // Catch: java.lang.Throwable -> L64
            r2.put(r0, r6)     // Catch: java.lang.Throwable -> L64
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L64
            r7.unlock(r4)
            return r6
        L64:
            r6 = move-exception
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.a(h8.f, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // q5.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof q5.e.c
            if (r0 == 0) goto L13
            r0 = r8
            q5.e$c r0 = (q5.e.c) r0
            int r1 = r0.f81759f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81759f = r1
            goto L18
        L13:
            q5.e$c r0 = new q5.e$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f81757d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81759f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r7 = r0.f81754a
            java.lang.Object r0 = r0.f81755b
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r8)
            goto L4e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.e.n(r8)
            n40.a r8 = r6.f81740b
            r0.f81755b = r8
            r0.f81754a = r7
            r2 = 0
            r0.f81756c = r2
            r0.f81759f = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r8
        L4e:
            long r1 = r6.g()     // Catch: java.lang.Throwable -> L70
            java.util.Map<java.lang.Long, java.lang.Boolean> r8 = r6.f81741c     // Catch: java.lang.Throwable -> L70
            java.lang.Long r3 = l00.a.g(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r5 = l00.a.a(r7)     // Catch: java.lang.Throwable -> L70
            r8.put(r3, r5)     // Catch: java.lang.Throwable -> L70
            kotlinx.coroutines.flow.x r8 = r6.f(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r7 = l00.a.a(r7)     // Catch: java.lang.Throwable -> L70
            r8.d(r7)     // Catch: java.lang.Throwable -> L70
            r0.unlock(r4)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L70:
            r7 = move-exception
            r0.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.b(boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x004a, B:13:0x005c, B:14:0x0063), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // q5.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof q5.e.a
            if (r0 == 0) goto L13
            r0 = r7
            q5.e$a r0 = (q5.e.a) r0
            int r1 = r0.f81748e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81748e = r1
            goto L18
        L13:
            q5.e$a r0 = new q5.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f81746c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81748e
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f81744a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            n40.a r7 = r6.f81740b
            r0.f81744a = r7
            r0.f81745b = r3
            r0.f81748e = r4
            java.lang.Object r0 = r7.lock(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r7
        L4a:
            java.util.Map<java.lang.Long, java.lang.Boolean> r7 = r6.f81741c     // Catch: java.lang.Throwable -> L61
            long r1 = r6.g()     // Catch: java.lang.Throwable -> L61
            java.lang.Long r1 = l00.a.g(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L63
            boolean r3 = r7.booleanValue()     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r7 = move-exception
            goto L6b
        L63:
            java.lang.Boolean r7 = l00.a.a(r3)     // Catch: java.lang.Throwable -> L61
            r0.unlock(r5)
            return r7
        L6b:
            r0.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.c(j00.c):java.lang.Object");
    }

    @Override // q5.d
    @k
    public kotlinx.coroutines.flow.i<Boolean> d() {
        return f(g());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // q5.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k j00.c<? super h8.f> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q5.e.b
            if (r0 == 0) goto L13
            r0 = r6
            q5.e$b r0 = (q5.e.b) r0
            int r1 = r0.f81753e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81753e = r1
            goto L18
        L13:
            q5.e$b r0 = new q5.e$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81751c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81753e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f81749a
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
            n40.a r6 = r5.f81740b
            r0.f81749a = r6
            r2 = 0
            r0.f81750b = r2
            r0.f81753e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            java.util.Map<java.lang.Long, h8.f> r6 = r5.f81742d     // Catch: java.lang.Throwable -> L5c
            long r1 = r5.g()     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r1 = l00.a.g(r1)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L5c
            r0.unlock(r4)
            return r6
        L5c:
            r6 = move-exception
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.e(j00.c):java.lang.Object");
    }

    public final x<Boolean> f(long j11) {
        Map<Long, x<Boolean>> map = this.f81743e;
        Long valueOf = Long.valueOf(j11);
        x<Boolean> xVar = map.get(valueOf);
        if (xVar == null) {
            xVar = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
            xVar.d(Boolean.FALSE);
            map.put(valueOf, xVar);
        }
        return xVar;
    }

    public final long g() {
        Long b11 = this.f81739a.b();
        if (b11 != null) {
            return b11.longValue();
        }
        throw new IllegalStateException("User not logged in");
    }
}
