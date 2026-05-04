package s7;

import c4.o;
import c40.l3;
import c40.r0;
import c40.s0;
import com.baicizhan.app.preferences.g;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import m80.l;
import oa0.r;
import x00.p;
import yz.c0;
import yz.e0;
import yz.g2;
import z8.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {s7.b.class})
@u0({"SMAP\nUserInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoRepo.kt\ncom/baicizhan/app/biz/userinfo/local/UserInfoRepoImpl\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,105:1\n113#2:106\n147#3:107\n*S KotlinDebug\n*F\n+ 1 UserInfoRepo.kt\ncom/baicizhan/app/biz/userinfo/local/UserInfoRepoImpl\n*L\n62#1:106\n69#1:107\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements s7.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f88078a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n7.e f88079b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final k50.a f88080c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r0 f88081d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f88082e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final y<s7.c> f88083f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.local.UserInfoRepoImpl$1", f = "UserInfoRepo.kt", i = {0, 0, 1, 1, 1}, l = {44, 46}, m = "invokeSuspend", n = {"it", "recordNew", "it", "recordNew", "old"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 1)
    public static final class a extends SuspendLambda implements p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f88084a;

        /* renamed from: b, reason: collision with root package name */
        public Object f88085b;

        /* renamed from: c, reason: collision with root package name */
        public int f88086c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f88087d;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = e.this.new a(cVar);
            aVar.f88087d = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((a) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
        
            if (r4.c(r5, r11) == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (r12 == r1) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f88087d
                z8.c1 r0 = (z8.c1) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r11.f88086c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2e
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r0 = r11.f88085b
                s7.c r0 = (s7.c) r0
                java.lang.Object r0 = r11.f88084a
                s7.c r0 = (s7.c) r0
                kotlin.e.n(r12)
                goto L87
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                java.lang.Object r2 = r11.f88084a
                s7.c r2 = (s7.c) r2
                kotlin.e.n(r12)
                goto L5e
            L2e:
                kotlin.e.n(r12)
                z6.b r5 = z6.b.f101032b
                r9 = 4
                r10 = 0
                java.lang.String r6 = "UserInfoService"
                java.lang.String r7 = "data change"
                r8 = 0
                z6.b.j(r5, r6, r7, r8, r9, r10)
                s7.c r2 = com.baicizhan.app.biz.userinfo.a.l(r0)
                s7.e r12 = s7.e.this
                kotlinx.coroutines.flow.y r12 = s7.e.e(r12)
                java.lang.Object r12 = r12.getValue()
                s7.c r12 = (s7.c) r12
                if (r12 != 0) goto L60
                s7.e r12 = s7.e.this
                r11.f88087d = r0
                r11.f88084a = r2
                r11.f88086c = r4
                java.lang.Object r12 = r12.b(r11)
                if (r12 != r1) goto L5e
                goto L86
            L5e:
                s7.c r12 = (s7.c) r12
            L60:
                boolean r4 = kotlin.jvm.internal.g0.g(r2, r12)
                if (r4 != 0) goto L87
                s7.e r4 = s7.e.this
                s7.c r5 = com.baicizhan.app.biz.userinfo.a.l(r0)
                java.lang.Object r0 = l00.k.a(r0)
                r11.f88087d = r0
                java.lang.Object r0 = l00.k.a(r2)
                r11.f88084a = r0
                java.lang.Object r12 = l00.k.a(r12)
                r11.f88085b = r12
                r11.f88086c = r3
                java.lang.Object r12 = r4.c(r5, r11)
                if (r12 != r1) goto L87
            L86:
                return r1
            L87:
                yz.g2 r12 = yz.g2.f100423a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: s7.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.local.UserInfoRepoImpl", f = "UserInfoRepo.kt", i = {}, l = {78, 79}, m = "clean", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f88089a;

        /* renamed from: c, reason: collision with root package name */
        public int f88091c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f88089a = obj;
            this.f88091c |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.local.UserInfoRepoImpl", f = "UserInfoRepo.kt", i = {1, 1, 1}, l = {68, 70}, m = "loadLocalUserInfo", n = {"userInfo", "it", "$i$a$-also-UserInfoRepoImpl$loadLocalUserInfo$2"}, s = {"L$0", "L$2", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f88092a;

        /* renamed from: b, reason: collision with root package name */
        public Object f88093b;

        /* renamed from: c, reason: collision with root package name */
        public Object f88094c;

        /* renamed from: d, reason: collision with root package name */
        public int f88095d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f88096e;

        /* renamed from: g, reason: collision with root package name */
        public int f88098g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f88096e = obj;
            this.f88098g |= Integer.MIN_VALUE;
            return e.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.local.UserInfoRepoImpl", f = "UserInfoRepo.kt", i = {0, 1}, l = {62, 63}, m = "updateRecord", n = {"userModel", "userModel"}, s = {"L$0", "L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f88099a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88100b;

        /* renamed from: d, reason: collision with root package name */
        public int f88102d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f88100b = obj;
            this.f88102d |= Integer.MIN_VALUE;
            return e.this.c(null, this);
        }
    }

    public e(@k com.baicizhan.app.preferences.a factory, @k n7.e basicInfo, @k k50.a json) {
        g0.p(factory, "factory");
        g0.p(basicInfo, "basicInfo");
        g0.p(json, "json");
        this.f88078a = factory;
        this.f88079b = basicInfo;
        this.f88080c = json;
        r0 a11 = s0.a(o.b().plus(l3.c(null, 1, null)));
        this.f88081d = a11;
        kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.v0(basicInfo.h()), new a(null)), a11);
        this.f88082e = e0.c(new x00.a() { // from class: s7.d
            @Override // x00.a
            public final Object invoke() {
                g g11;
                g11 = e.g(e.this);
                return g11;
            }
        });
        this.f88083f = o0.a(null);
    }

    public static final g g(e eVar) {
        return eVar.f88078a.a("userStorage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r6.emit(null, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // s7.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s7.e.b
            if (r0 == 0) goto L13
            r0 = r6
            s7.e$b r0 = (s7.e.b) r0
            int r1 = r0.f88091c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88091c = r1
            goto L18
        L13:
            s7.e$b r0 = new s7.e$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f88089a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f88091c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L48
        L38:
            kotlin.e.n(r6)
            com.baicizhan.app.preferences.g r6 = r5.f()
            r0.f88091c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            goto L53
        L48:
            kotlinx.coroutines.flow.y<s7.c> r6 = r5.f88083f
            r0.f88091c = r3
            r2 = 0
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.e.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // s7.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super s7.c> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof s7.e.c
            if (r0 == 0) goto L13
            r0 = r7
            s7.e$c r0 = (s7.e.c) r0
            int r1 = r0.f88098g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88098g = r1
            goto L18
        L13:
            s7.e$c r0 = new s7.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f88096e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f88098g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r1 = r0.f88094c
            s7.c r1 = (s7.c) r1
            java.lang.Object r1 = r0.f88093b
            java.lang.Object r0 = r0.f88092a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r7)     // Catch: java.lang.Exception -> L36
            goto L8b
        L36:
            r7 = move-exception
            goto L8e
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L40:
            kotlin.e.n(r7)     // Catch: java.lang.Exception -> L36
            goto L58
        L44:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r6.f()     // Catch: java.lang.Exception -> L36
            java.lang.String r2 = "currentUser"
            java.lang.String r5 = ""
            r0.f88098g = r4     // Catch: java.lang.Exception -> L36
            java.lang.Object r7 = r7.j(r2, r5, r0)     // Catch: java.lang.Exception -> L36
            if (r7 != r1) goto L58
            goto L89
        L58:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L36
            k50.a r2 = r6.f88080c     // Catch: java.lang.Exception -> L36
            r2.getSerializersModule()     // Catch: java.lang.Exception -> L36
            s7.c$b r4 = s7.c.Companion     // Catch: java.lang.Exception -> L36
            f50.i r4 = r4.serializer()     // Catch: java.lang.Exception -> L36
            f50.e r4 = (f50.e) r4     // Catch: java.lang.Exception -> L36
            java.lang.Object r2 = r2.c(r4, r7)     // Catch: java.lang.Exception -> L36
            r4 = r2
            s7.c r4 = (s7.c) r4     // Catch: java.lang.Exception -> L36
            kotlinx.coroutines.flow.y<s7.c> r5 = r6.f88083f     // Catch: java.lang.Exception -> L36
            java.lang.Object r7 = l00.k.a(r7)     // Catch: java.lang.Exception -> L36
            r0.f88092a = r7     // Catch: java.lang.Exception -> L36
            r0.f88093b = r2     // Catch: java.lang.Exception -> L36
            java.lang.Object r7 = l00.k.a(r4)     // Catch: java.lang.Exception -> L36
            r0.f88094c = r7     // Catch: java.lang.Exception -> L36
            r7 = 0
            r0.f88095d = r7     // Catch: java.lang.Exception -> L36
            r0.f88098g = r3     // Catch: java.lang.Exception -> L36
            java.lang.Object r7 = r5.emit(r4, r0)     // Catch: java.lang.Exception -> L36
            if (r7 != r1) goto L8a
        L89:
            return r1
        L8a:
            r1 = r2
        L8b:
            s7.c r1 = (s7.c) r1     // Catch: java.lang.Exception -> L36
            return r1
        L8e:
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "UserInfoService"
            java.lang.String r2 = "loadLocalUserInfo error:"
            r0.i(r1, r2, r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.e.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r8.k(s7.f.f88104b, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // s7.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k s7.c r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof s7.e.d
            if (r0 == 0) goto L13
            r0 = r8
            s7.e$d r0 = (s7.e.d) r0
            int r1 = r0.f88102d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88102d = r1
            goto L18
        L13:
            s7.e$d r0 = new s7.e$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f88100b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f88102d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f88099a
            s7.c r7 = (s7.c) r7
            kotlin.e.n(r8)
            goto L76
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f88099a
            s7.c r7 = (s7.c) r7
            kotlin.e.n(r8)
            goto L65
        L40:
            kotlin.e.n(r8)
            com.baicizhan.app.preferences.g r8 = r6.f()
            k50.a r2 = r6.f88080c
            r2.getSerializersModule()
            s7.c$b r5 = s7.c.Companion
            f50.i r5 = r5.serializer()
            f50.b0 r5 = (f50.b0) r5
            java.lang.String r2 = r2.a(r5, r7)
            r0.f88099a = r7
            r0.f88102d = r4
            java.lang.String r4 = "currentUser"
            java.lang.Object r8 = r8.k(r4, r2, r0)
            if (r8 != r1) goto L65
            goto L75
        L65:
            kotlinx.coroutines.flow.y<s7.c> r8 = r6.f88083f
            java.lang.Object r2 = l00.k.a(r7)
            r0.f88099a = r2
            r0.f88102d = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.e.c(s7.c, j00.c):java.lang.Object");
    }

    public final g f() {
        return (g) this.f88082e.getValue();
    }

    @Override // s7.b
    @k
    public m0<s7.c> h() {
        return this.f88083f;
    }
}
