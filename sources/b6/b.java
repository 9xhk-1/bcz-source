package b6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.x;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {b6.a.class})
/* loaded from: classes3.dex */
public final class b implements b6.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f6120a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f6121b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x<Boolean> f6122c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {}, l = {111, 113}, m = "disableAllNewUserGuides", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6123a;

        /* renamed from: c, reason: collision with root package name */
        public int f6125c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6123a = obj;
            this.f6125c |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {}, l = {59, 60, 62}, m = "enableNewUser", n = {}, s = {}, v = 1)
    /* renamed from: b6.b$b, reason: collision with other inner class name */
    public static final class C0107b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6126a;

        /* renamed from: c, reason: collision with root package name */
        public int f6128c;

        public C0107b(j00.c<? super C0107b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6126a = obj;
            this.f6128c |= Integer.MIN_VALUE;
            return b.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {}, l = {90, 91, 93}, m = "enableOldUserUpgrade", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6129a;

        /* renamed from: c, reason: collision with root package name */
        public int f6131c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6129a = obj;
            this.f6131c |= Integer.MIN_VALUE;
            return b.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {0, 1}, l = {72, 75}, m = "getGuideEnable", n = {"useGuideType", "useGuideType"}, s = {"L$0", "L$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6132a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6133b;

        /* renamed from: d, reason: collision with root package name */
        public int f6135d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6133b = obj;
            this.f6135d |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {}, l = {97, 98}, m = "getOldUserUpgradeGuideEnable", n = {}, s = {}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6136a;

        /* renamed from: c, reason: collision with root package name */
        public int f6138c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6136a = obj;
            this.f6138c |= Integer.MIN_VALUE;
            return b.this.h(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {0, 1, 1, 2, 2}, l = {81, 85, 86}, m = "setGuideDisable", n = {"useGuideType", "useGuideType", "old", "useGuideType", "old"}, s = {"L$0", "L$0", "Z$0", "L$0", "Z$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6139a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6140b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6141c;

        /* renamed from: e, reason: collision with root package name */
        public int f6143e;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6141c = obj;
            this.f6143e |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userguide.UseGuideRepoImpl", f = "UseGuideRepoImpl.kt", i = {}, l = {102, 105, 107}, m = "setOldUserUpgradeGuideDisable", n = {}, s = {}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6144a;

        /* renamed from: c, reason: collision with root package name */
        public int f6146c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6144a = obj;
            this.f6146c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    public b(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f6120a = factory;
        this.f6121b = tokenProvider;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.TRUE);
        this.f6122c = a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r10.emit(r4, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k com.baicizhan.app.biz.game.repo.userguide.UserGuideType r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b6.b.f
            if (r0 == 0) goto L13
            r0 = r10
            b6.b$f r0 = (b6.b.f) r0
            int r1 = r0.f6143e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6143e = r1
            goto L18
        L13:
            b6.b$f r0 = new b6.b$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6141c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6143e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f6139a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r9 = (com.baicizhan.app.biz.game.repo.userguide.UserGuideType) r9
            kotlin.e.n(r10)
            goto L99
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            boolean r9 = r0.f6140b
            java.lang.Object r2 = r0.f6139a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = (com.baicizhan.app.biz.game.repo.userguide.UserGuideType) r2
            kotlin.e.n(r10)
            goto L82
        L45:
            java.lang.Object r9 = r0.f6139a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r9 = (com.baicizhan.app.biz.game.repo.userguide.UserGuideType) r9
            kotlin.e.n(r10)
            goto L5b
        L4d:
            kotlin.e.n(r10)
            r0.f6139a = r9
            r0.f6143e = r5
            java.lang.Object r10 = r8.e(r9, r0)
            if (r10 != r1) goto L5b
            goto L98
        L5b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L66
            yz.g2 r9 = yz.g2.f100423a
            return r9
        L66:
            com.baicizhan.app.preferences.g r2 = r8.i()
            java.lang.String r6 = r9.getValue()
            java.lang.Object r7 = l00.k.a(r9)
            r0.f6139a = r7
            r0.f6140b = r10
            r0.f6143e = r4
            r4 = 0
            java.lang.Object r2 = r2.g(r6, r4, r0)
            if (r2 != r1) goto L80
            goto L98
        L80:
            r2 = r9
            r9 = r10
        L82:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r10 = r8.f6122c
            java.lang.Boolean r4 = l00.a.a(r5)
            java.lang.Object r2 = l00.k.a(r2)
            r0.f6139a = r2
            r0.f6140b = r9
            r0.f6143e = r3
            java.lang.Object r9 = r10.emit(r4, r0)
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.a(com.baicizhan.app.biz.game.repo.userguide.UserGuideType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r13.emit(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r13.g(b6.c.f6149c, true, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r13.a(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof b6.b.C0107b
            if (r0 == 0) goto L13
            r0 = r13
            b6.b$b r0 = (b6.b.C0107b) r0
            int r1 = r0.f6128c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6128c = r1
            goto L18
        L13:
            b6.b$b r0 = new b6.b$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6126a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6128c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r13)
            goto L79
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L37:
            kotlin.e.n(r13)
            goto L5e
        L3b:
            kotlin.e.n(r13)
            goto L4f
        L3f:
            kotlin.e.n(r13)
            com.baicizhan.app.preferences.g r13 = r12.i()
            r0.f6128c = r5
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto L4f
            goto L78
        L4f:
            com.baicizhan.app.preferences.g r13 = r12.i()
            r0.f6128c = r4
            java.lang.String r2 = "enable_new_user_key"
            java.lang.Object r13 = r13.g(r2, r5, r0)
            if (r13 != r1) goto L5e
            goto L78
        L5e:
            z6.b r6 = z6.b.f101032b
            r10 = 4
            r11 = 0
            java.lang.String r7 = "IUserGuideRepo"
            java.lang.String r8 = "enableNewUser"
            r9 = 0
            z6.b.j(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r12.f6122c
            java.lang.Boolean r2 = l00.a.a(r5)
            r0.f6128c = r3
            java.lang.Object r13 = r13.emit(r2, r0)
            if (r13 != r1) goto L79
        L78:
            return r1
        L79:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r12.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r12.g(b6.c.f6149c, false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof b6.b.a
            if (r0 == 0) goto L13
            r0 = r12
            b6.b$a r0 = (b6.b.a) r0
            int r1 = r0.f6125c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6125c = r1
            goto L18
        L13:
            b6.b$a r0 = new b6.b$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f6123a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6125c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r12)
            goto L66
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            kotlin.e.n(r12)
            goto L4b
        L38:
            kotlin.e.n(r12)
            com.baicizhan.app.preferences.g r12 = r11.i()
            r0.f6125c = r4
            java.lang.String r2 = "enable_new_user_key"
            r5 = 0
            java.lang.Object r12 = r12.g(r2, r5, r0)
            if (r12 != r1) goto L4b
            goto L65
        L4b:
            z6.b r5 = z6.b.f101032b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "IUserGuideRepo"
            java.lang.String r7 = "disableAllNewUserGuides"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r12 = r11.f6122c
            java.lang.Boolean r2 = l00.a.a(r4)
            r0.f6125c = r3
            java.lang.Object r12 = r12.emit(r2, r0)
            if (r12 != r1) goto L66
        L65:
            return r1
        L66:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r13.emit(r2, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r13.g(r2, false, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super yz.g2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof b6.b.g
            if (r0 == 0) goto L13
            r0 = r13
            b6.b$g r0 = (b6.b.g) r0
            int r1 = r0.f6146c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6146c = r1
            goto L18
        L13:
            b6.b$g r0 = new b6.b$g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6144a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6146c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r13)
            goto L85
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L37:
            kotlin.e.n(r13)
            goto L6a
        L3b:
            kotlin.e.n(r13)
            goto L4b
        L3f:
            kotlin.e.n(r13)
            r0.f6146c = r5
            java.lang.Object r13 = r12.h(r0)
            if (r13 != r1) goto L4b
            goto L84
        L4b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L56
            yz.g2 r13 = yz.g2.f100423a
            return r13
        L56:
            com.baicizhan.app.preferences.g r13 = r12.i()
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.OldUserUpgradeGuide
            java.lang.String r2 = r2.getValue()
            r0.f6146c = r4
            r4 = 0
            java.lang.Object r13 = r13.g(r2, r4, r0)
            if (r13 != r1) goto L6a
            goto L84
        L6a:
            z6.b r6 = z6.b.f101032b
            r10 = 4
            r11 = 0
            java.lang.String r7 = "IUserGuideRepo"
            java.lang.String r8 = "setOldUserUpgradeGuideDisable"
            r9 = 0
            z6.b.j(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r12.f6122c
            java.lang.Boolean r2 = l00.a.a(r5)
            r0.f6146c = r3
            java.lang.Object r13 = r13.emit(r2, r0)
            if (r13 != r1) goto L85
        L84:
            return r1
        L85:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k com.baicizhan.app.biz.game.repo.userguide.UserGuideType r7, @m80.k j00.c<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b6.b.d
            if (r0 == 0) goto L13
            r0 = r8
            b6.b$d r0 = (b6.b.d) r0
            int r1 = r0.f6135d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6135d = r1
            goto L18
        L13:
            b6.b$d r0 = new b6.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6133b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6135d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f6132a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r7 = (com.baicizhan.app.biz.game.repo.userguide.UserGuideType) r7
            kotlin.e.n(r8)
            return r8
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f6132a
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r7 = (com.baicizhan.app.biz.game.repo.userguide.UserGuideType) r7
            kotlin.e.n(r8)
            goto L55
        L41:
            kotlin.e.n(r8)
            com.baicizhan.app.preferences.g r8 = r6.i()
            r0.f6132a = r7
            r0.f6135d = r5
            java.lang.String r2 = "enable_new_user_key"
            java.lang.Object r8 = r8.b(r2, r3, r0)
            if (r8 != r1) goto L55
            goto L73
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            com.baicizhan.app.preferences.g r8 = r6.i()
            java.lang.String r2 = r7.getValue()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f6132a = r7
            r0.f6135d = r4
            java.lang.Object r7 = r8.b(r2, r5, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            return r7
        L75:
            java.lang.Boolean r7 = l00.a.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.e(com.baicizhan.app.biz.game.repo.userguide.UserGuideType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r13.emit(r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r13.g(r2, true, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r13.g(b6.c.f6150d, true, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@m80.k j00.c<? super yz.g2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof b6.b.c
            if (r0 == 0) goto L13
            r0 = r13
            b6.b$c r0 = (b6.b.c) r0
            int r1 = r0.f6131c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6131c = r1
            goto L18
        L13:
            b6.b$c r0 = new b6.b$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6129a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6131c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r13)
            goto L7f
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L37:
            kotlin.e.n(r13)
            goto L64
        L3b:
            kotlin.e.n(r13)
            goto L51
        L3f:
            kotlin.e.n(r13)
            com.baicizhan.app.preferences.g r13 = r12.i()
            r0.f6131c = r5
            java.lang.String r2 = "enable_old_user_upgrade_key"
            java.lang.Object r13 = r13.g(r2, r5, r0)
            if (r13 != r1) goto L51
            goto L7e
        L51:
            com.baicizhan.app.preferences.g r13 = r12.i()
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.OldUserUpgradeGuide
            java.lang.String r2 = r2.getValue()
            r0.f6131c = r4
            java.lang.Object r13 = r13.g(r2, r5, r0)
            if (r13 != r1) goto L64
            goto L7e
        L64:
            z6.b r6 = z6.b.f101032b
            r10 = 4
            r11 = 0
            java.lang.String r7 = "IUserGuideRepo"
            java.lang.String r8 = "enableOldUserUpgrade"
            r9 = 0
            z6.b.j(r6, r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r12.f6122c
            java.lang.Boolean r2 = l00.a.a(r5)
            r0.f6131c = r3
            java.lang.Object r13 = r13.emit(r2, r0)
            if (r13 != r1) goto L7f
        L7e:
            return r1
        L7f:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.f(j00.c):java.lang.Object");
    }

    @Override // b6.a
    @l
    public Object g(@k j00.c<? super i<Boolean>> cVar) {
        return this.f6122c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // b6.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(@m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof b6.b.e
            if (r0 == 0) goto L13
            r0 = r7
            b6.b$e r0 = (b6.b.e) r0
            int r1 = r0.f6138c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6138c = r1
            goto L18
        L13:
            b6.b$e r0 = new b6.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6136a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6138c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.e.n(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.e.n(r7)
            goto L4b
        L39:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r6.i()
            r0.f6138c = r5
            java.lang.String r2 = "enable_old_user_upgrade_key"
            java.lang.Object r7 = r7.b(r2, r3, r0)
            if (r7 != r1) goto L4b
            goto L65
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L67
            com.baicizhan.app.preferences.g r7 = r6.i()
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.OldUserUpgradeGuide
            java.lang.String r2 = r2.getValue()
            r0.f6138c = r4
            java.lang.Object r7 = r7.b(r2, r5, r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            return r7
        L67:
            java.lang.Boolean r7 = l00.a.a(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.h(j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g i() {
        com.baicizhan.app.preferences.a aVar = this.f6120a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("user_guide_scope-");
        Long b11 = this.f6121b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }
}
