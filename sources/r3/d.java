package r3;

import com.baicizhan.app.preferences.g;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import m80.l;
import oa0.r;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nUserStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStorage.kt\ncom/baicizhan/app/biz/auth/local/UserStorage\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,52:1\n113#2:53\n147#3:54\n*S KotlinDebug\n*F\n+ 1 UserStorage.kt\ncom/baicizhan/app/biz/auth/local/UserStorage\n*L\n26#1:53\n37#1:54\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f82894a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final k50.a f82895b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y<r3.a> f82896c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m0<r3.a> f82897d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f82898e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.local.UserStorage", f = "UserStorage.kt", i = {}, l = {45, 46}, m = "deleteUser", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f82899a;

        /* renamed from: c, reason: collision with root package name */
        public int f82901c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f82899a = obj;
            this.f82901c |= Integer.MIN_VALUE;
            return d.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.local.UserStorage", f = "UserStorage.kt", i = {}, l = {36}, m = "getUser", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f82902a;

        /* renamed from: c, reason: collision with root package name */
        public int f82904c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f82902a = obj;
            this.f82904c |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.local.UserStorage", f = "UserStorage.kt", i = {0, 1}, l = {26, 27}, m = "saveUser", n = {"userRecord", "userRecord"}, s = {"L$0", "L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f82905a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f82906b;

        /* renamed from: d, reason: collision with root package name */
        public int f82908d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f82906b = obj;
            this.f82908d |= Integer.MIN_VALUE;
            return d.this.g(null, this);
        }
    }

    public d(@k com.baicizhan.app.preferences.a factory, @k k50.a json) {
        g0.p(factory, "factory");
        g0.p(json, "json");
        this.f82894a = factory;
        this.f82895b = json;
        y<r3.a> a11 = o0.a(null);
        this.f82896c = a11;
        this.f82897d = a11;
        this.f82898e = e0.c(new x00.a() { // from class: r3.c
            @Override // x00.a
            public final Object invoke() {
                g h11;
                h11 = d.h(d.this);
                return h11;
            }
        });
    }

    public static final g h(d dVar) {
        return dVar.f82894a.a("userStorage");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r6.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.emit(null, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r3.d.a
            if (r0 == 0) goto L13
            r0 = r6
            r3.d$a r0 = (r3.d.a) r0
            int r1 = r0.f82901c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82901c = r1
            goto L18
        L13:
            r3.d$a r0 = new r3.d$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f82899a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f82901c
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
            goto L47
        L38:
            kotlin.e.n(r6)
            kotlinx.coroutines.flow.y<r3.a> r6 = r5.f82896c
            r0.f82901c = r4
            r2 = 0
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L47
            goto L53
        L47:
            com.baicizhan.app.preferences.g r6 = r5.c()
            r0.f82901c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.b(j00.c):java.lang.Object");
    }

    public final g c() {
        return (g) this.f82898e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k j00.c<? super r3.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r3.d.b
            if (r0 == 0) goto L13
            r0 = r6
            r3.d$b r0 = (r3.d.b) r0
            int r1 = r0.f82904c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82904c = r1
            goto L18
        L13:
            r3.d$b r0 = new r3.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f82902a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f82904c
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
            com.baicizhan.app.preferences.g r6 = r5.c()     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = "loginUser"
            java.lang.String r4 = ""
            r0.f82904c = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r6 = r6.j(r2, r4, r0)     // Catch: java.lang.Exception -> L5b
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L5b
            k50.a r0 = r5.f82895b     // Catch: java.lang.Exception -> L5b
            r0.getSerializersModule()     // Catch: java.lang.Exception -> L5b
            r3.a$b r1 = r3.a.Companion     // Catch: java.lang.Exception -> L5b
            f50.i r1 = r1.serializer()     // Catch: java.lang.Exception -> L5b
            f50.e r1 = (f50.e) r1     // Catch: java.lang.Exception -> L5b
            java.lang.Object r6 = r0.c(r1, r6)     // Catch: java.lang.Exception -> L5b
            r3.a r6 = (r3.a) r6     // Catch: java.lang.Exception -> L5b
            return r6
        L5b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.d(j00.c):java.lang.Object");
    }

    @k
    public final m0<r3.a> e() {
        return this.f82897d;
    }

    @l
    public final Object f(@k r3.a aVar, @k j00.c<? super g2> cVar) {
        Object emit = this.f82896c.emit(aVar, cVar);
        return emit == kotlin.coroutines.intrinsics.b.l() ? emit : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r8.k(r3.e.f82910b, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k r3.a r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof r3.d.c
            if (r0 == 0) goto L13
            r0 = r8
            r3.d$c r0 = (r3.d.c) r0
            int r1 = r0.f82908d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82908d = r1
            goto L18
        L13:
            r3.d$c r0 = new r3.d$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f82906b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f82908d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f82905a
            r3.a r7 = (r3.a) r7
            kotlin.e.n(r8)
            goto L76
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f82905a
            r3.a r7 = (r3.a) r7
            kotlin.e.n(r8)
            goto L65
        L40:
            kotlin.e.n(r8)
            com.baicizhan.app.preferences.g r8 = r6.c()
            k50.a r2 = r6.f82895b
            r2.getSerializersModule()
            r3.a$b r5 = r3.a.Companion
            f50.i r5 = r5.serializer()
            f50.b0 r5 = (f50.b0) r5
            java.lang.String r2 = r2.a(r5, r7)
            r0.f82905a = r7
            r0.f82908d = r4
            java.lang.String r4 = "loginUser"
            java.lang.Object r8 = r8.k(r4, r2, r0)
            if (r8 != r1) goto L65
            goto L75
        L65:
            kotlinx.coroutines.flow.y<r3.a> r8 = r6.f82896c
            java.lang.Object r2 = l00.k.a(r7)
            r0.f82905a = r2
            r0.f82908d = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.g(r3.a, j00.c):java.lang.Object");
    }
}
