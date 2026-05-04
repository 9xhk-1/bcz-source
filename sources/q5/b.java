package q5;

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
@r(binds = {q5.a.class})
@u0({"SMAP\nIpAvatarStateRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IpAvatarStateRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpAvatarStateRepoImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,94:1\n116#2,11:95\n116#2,8:106\n125#2,2:115\n113#3:114\n147#4:117\n*S KotlinDebug\n*F\n+ 1 IpAvatarStateRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpAvatarStateRepoImpl\n*L\n63#1:95,11\n73#1:106,8\n73#1:115,2\n74#1:114\n82#1:117\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements q5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f81708a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f81709b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final k50.a f81710c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n40.a f81711d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final x<Boolean> f81712e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpAvatarStateRepoImpl", f = "IpAvatarStateRepo.kt", i = {}, l = {81}, m = "getIpAvatarSpeechSnapshot", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81713a;

        /* renamed from: c, reason: collision with root package name */
        public int f81715c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81713a = obj;
            this.f81715c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpAvatarStateRepoImpl", f = "IpAvatarStateRepo.kt", i = {}, l = {58}, m = "getIpAvatarState", n = {}, s = {}, v = 1)
    /* renamed from: q5.b$b, reason: collision with other inner class name */
    public static final class C1003b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81716a;

        /* renamed from: c, reason: collision with root package name */
        public int f81718c;

        public C1003b(j00.c<? super C1003b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81716a = obj;
            this.f81718c |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpAvatarStateRepoImpl", f = "IpAvatarStateRepo.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {100, 75}, m = "updateIpAvatarSpeechSnapshot", n = {"ipAvatarSpeechSnapshot", "$this$withLock_u24default$iv", "$i$f$withLock", "ipAvatarSpeechSnapshot", "$this$withLock_u24default$iv", "jsonString", "$i$f$withLock", "$i$a$-withLock$default-IpAvatarStateRepoImpl$updateIpAvatarSpeechSnapshot$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81719a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81720b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81721c;

        /* renamed from: d, reason: collision with root package name */
        public int f81722d;

        /* renamed from: e, reason: collision with root package name */
        public int f81723e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f81724f;

        /* renamed from: h, reason: collision with root package name */
        public int f81726h;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81724f = obj;
            this.f81726h |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.ipavatar.IpAvatarStateRepoImpl", f = "IpAvatarStateRepo.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {100, 64}, m = "updateIpAvatarState", n = {"avatarAppHomePageInfo", "$this$withLock_u24default$iv", "$i$f$withLock", "avatarAppHomePageInfo", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-IpAvatarStateRepoImpl$updateIpAvatarState$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81727a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81728b;

        /* renamed from: c, reason: collision with root package name */
        public int f81729c;

        /* renamed from: d, reason: collision with root package name */
        public int f81730d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81731e;

        /* renamed from: g, reason: collision with root package name */
        public int f81733g;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81731e = obj;
            this.f81733g |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    public b(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider, @k k50.a json) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(json, "json");
        this.f81708a = factory;
        this.f81709b = tokenProvider;
        this.f81710c = json;
        this.f81711d = n40.g.b(false, 1, null);
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.FALSE);
        this.f81712e = a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // q5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super h8.d> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q5.b.C1003b
            if (r0 == 0) goto L13
            r0 = r6
            q5.b$b r0 = (q5.b.C1003b) r0
            int r1 = r0.f81718c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81718c = r1
            goto L18
        L13:
            q5.b$b r0 = new q5.b$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81716a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81718c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.e.n(r6)
            goto L44
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.e.n(r6)
            com.baicizhan.app.preferences.g r6 = r5.f()
            r0.f81718c = r4
            java.lang.String r2 = "ip_avatar_state"
            java.lang.Object r6 = r6.c(r2, r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L51
            ts.a<h8.d, h8.d$b> r0 = h8.d.f58870i
            java.lang.Object r6 = l7.d.c(r6, r0)
            h8.d r6 = (h8.d) r6
            return r6
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.a(j00.c):java.lang.Object");
    }

    @Override // q5.a
    @k
    public kotlinx.coroutines.flow.i<Boolean> b() {
        return this.f81712e;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // q5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k h5.v r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof q5.b.c
            if (r0 == 0) goto L13
            r0 = r12
            q5.b$c r0 = (q5.b.c) r0
            int r1 = r0.f81726h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81726h = r1
            goto L18
        L13:
            q5.b$c r0 = new q5.b$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f81724f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81726h
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L56
            if (r2 == r5) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r11 = r0.f81721c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f81720b
            n40.a r11 = (n40.a) r11
            java.lang.Object r0 = r0.f81719a
            h5.v r0 = (h5.v) r0
            kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L3a
            goto L9e
        L3a:
            r12 = move-exception
            goto La8
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L45:
            int r11 = r0.f81722d
            java.lang.Object r2 = r0.f81720b
            n40.a r2 = (n40.a) r2
            java.lang.Object r5 = r0.f81719a
            h5.v r5 = (h5.v) r5
            kotlin.e.n(r12)
            r12 = r2
            r2 = r11
            r11 = r5
            goto L6b
        L56:
            kotlin.e.n(r12)
            n40.a r12 = r10.f81711d
            r0.f81719a = r11
            r0.f81720b = r12
            r0.f81722d = r3
            r0.f81726h = r5
            java.lang.Object r2 = r12.lock(r6, r0)
            if (r2 != r1) goto L6a
            goto L9c
        L6a:
            r2 = r3
        L6b:
            k50.a r5 = r10.f81710c     // Catch: java.lang.Throwable -> La4
            r5.getSerializersModule()     // Catch: java.lang.Throwable -> La4
            h5.v$b r7 = h5.v.Companion     // Catch: java.lang.Throwable -> La4
            f50.i r7 = r7.serializer()     // Catch: java.lang.Throwable -> La4
            f50.b0 r7 = (f50.b0) r7     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = r5.a(r7, r11)     // Catch: java.lang.Throwable -> La4
            com.baicizhan.app.preferences.g r7 = r10.f()     // Catch: java.lang.Throwable -> La4
            java.lang.String r8 = "speech_snapshot"
            java.lang.Object r11 = l00.k.a(r11)     // Catch: java.lang.Throwable -> La4
            r0.f81719a = r11     // Catch: java.lang.Throwable -> La4
            r0.f81720b = r12     // Catch: java.lang.Throwable -> La4
            java.lang.Object r11 = l00.k.a(r5)     // Catch: java.lang.Throwable -> La4
            r0.f81721c = r11     // Catch: java.lang.Throwable -> La4
            r0.f81722d = r2     // Catch: java.lang.Throwable -> La4
            r0.f81723e = r3     // Catch: java.lang.Throwable -> La4
            r0.f81726h = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r11 = r7.k(r8, r5, r0)     // Catch: java.lang.Throwable -> La4
            if (r11 != r1) goto L9d
        L9c:
            return r1
        L9d:
            r11 = r12
        L9e:
            yz.g2 r12 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L3a
            r11.unlock(r6)
            return r12
        La4:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        La8:
            r11.unlock(r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.c(h5.v, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // q5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super h5.v> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q5.b.a
            if (r0 == 0) goto L13
            r0 = r6
            q5.b$a r0 = (q5.b.a) r0
            int r1 = r0.f81715c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81715c = r1
            goto L18
        L13:
            q5.b$a r0 = new q5.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f81713a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81715c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)     // Catch: java.lang.Exception -> L5b
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.e.n(r6)
            com.baicizhan.app.preferences.g r6 = r5.f()     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = "speech_snapshot"
            java.lang.String r4 = ""
            r0.f81715c = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r6 = r6.j(r2, r4, r0)     // Catch: java.lang.Exception -> L5b
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L5b
            k50.a r0 = r5.f81710c     // Catch: java.lang.Exception -> L5b
            r0.getSerializersModule()     // Catch: java.lang.Exception -> L5b
            h5.v$b r1 = h5.v.Companion     // Catch: java.lang.Exception -> L5b
            f50.i r1 = r1.serializer()     // Catch: java.lang.Exception -> L5b
            f50.e r1 = (f50.e) r1     // Catch: java.lang.Exception -> L5b
            java.lang.Object r6 = r0.c(r1, r6)     // Catch: java.lang.Exception -> L5b
            h5.v r6 = (h5.v) r6     // Catch: java.lang.Exception -> L5b
            return r6
        L5b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // q5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k h8.d r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof q5.b.d
            if (r0 == 0) goto L13
            r0 = r13
            q5.b$d r0 = (q5.b.d) r0
            int r1 = r0.f81733g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81733g = r1
            goto L18
        L13:
            q5.b$d r0 = new q5.b$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f81731e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81733g
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L51
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r12 = r0.f81728b
            n40.a r12 = (n40.a) r12
            java.lang.Object r0 = r0.f81727a
            h8.d r0 = (h8.d) r0
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L36
            goto L88
        L36:
            r13 = move-exception
            goto L9b
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            int r12 = r0.f81729c
            java.lang.Object r2 = r0.f81728b
            n40.a r2 = (n40.a) r2
            java.lang.Object r7 = r0.f81727a
            h8.d r7 = (h8.d) r7
            kotlin.e.n(r13)
            r13 = r2
            r2 = r12
            r12 = r7
            goto L66
        L51:
            kotlin.e.n(r13)
            n40.a r13 = r11.f81711d
            r0.f81727a = r12
            r0.f81728b = r13
            r0.f81729c = r3
            r0.f81733g = r5
            java.lang.Object r2 = r13.lock(r6, r0)
            if (r2 != r1) goto L65
            goto L86
        L65:
            r2 = r3
        L66:
            com.baicizhan.app.preferences.g r7 = r11.f()     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "ip_avatar_state"
            ts.a<h8.d, h8.d$b> r9 = h8.d.f58870i     // Catch: java.lang.Throwable -> L97
            byte[] r9 = l7.d.a(r12, r9)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r12 = l00.k.a(r12)     // Catch: java.lang.Throwable -> L97
            r0.f81727a = r12     // Catch: java.lang.Throwable -> L97
            r0.f81728b = r13     // Catch: java.lang.Throwable -> L97
            r0.f81729c = r2     // Catch: java.lang.Throwable -> L97
            r0.f81730d = r3     // Catch: java.lang.Throwable -> L97
            r0.f81733g = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r12 = r7.e(r8, r9, r0)     // Catch: java.lang.Throwable -> L97
            if (r12 != r1) goto L87
        L86:
            return r1
        L87:
            r12 = r13
        L88:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r11.f81712e     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = l00.a.a(r5)     // Catch: java.lang.Throwable -> L36
            r13.d(r0)     // Catch: java.lang.Throwable -> L36
            r12.unlock(r6)
            yz.g2 r12 = yz.g2.f100423a
            return r12
        L97:
            r12 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L9b:
            r12.unlock(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.b.e(h8.d, j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g f() {
        com.baicizhan.app.preferences.a aVar = this.f81708a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ip_avatar_scope-");
        Long b11 = this.f81709b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }
}
