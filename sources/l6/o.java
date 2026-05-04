package l6;

import com.baicizhan.app.biz.game.repo.userresource.LanguageType;
import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import h5.v0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f70250c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f70251d = "GetEnergyUC";

    /* renamed from: e, reason: collision with root package name */
    public static final long f70252e = 86400000;

    /* renamed from: f, reason: collision with root package name */
    public static final long f70253f = 100;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c6.b f70254a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final GetABTestUC f70255b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.GetEnergyUC", f = "GetEnergyUC.kt", i = {0, 1, 1}, l = {33, 36}, m = "invoke", n = {"languageType", "languageType", "isMonetizationEnabled"}, s = {"L$0", "L$0", "Z$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f70256a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f70257b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f70258c;

        /* renamed from: e, reason: collision with root package name */
        public int f70260e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70258c = obj;
            this.f70260e |= Integer.MIN_VALUE;
            return o.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.GetEnergyUC", f = "GetEnergyUC.kt", i = {0}, l = {52}, m = "observe", n = {"languageType"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f70261a;

        /* renamed from: b, reason: collision with root package name */
        public Object f70262b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f70263c;

        /* renamed from: e, reason: collision with root package name */
        public int f70265e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70263c = obj;
            this.f70265e |= Integer.MIN_VALUE;
            return o.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.GetEnergyUC$observe$2", f = "GetEnergyUC.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"isMonetizationEnabled"}, s = {"Z$0"}, v = 1)
    public static final class d extends SuspendLambda implements x00.q<Boolean, Boolean, j00.c<? super h5.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f70266a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f70267b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LanguageType f70269d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LanguageType languageType, j00.c<? super d> cVar) {
            super(3, cVar);
            this.f70269d = languageType;
        }

        public final Object i(boolean z11, boolean z12, j00.c<? super h5.g> cVar) {
            d dVar = o.this.new d(this.f70269d, cVar);
            dVar.f70267b = z12;
            return dVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, j00.c<? super h5.g> cVar) {
            return i(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f70267b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f70266a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (!z11) {
                    return o.this.c();
                }
                o oVar = o.this;
                LanguageType languageType = this.f70269d;
                this.f70267b = z11;
                this.f70266a = 1;
                obj = oVar.d(languageType, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return (h5.g) obj;
        }
    }

    public o(@m80.k c6.b userGameInfoRepo, @m80.k GetABTestUC getABTestUC) {
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(getABTestUC, "getABTestUC");
        this.f70254a = userGameInfoRepo;
        this.f70255b = getABTestUC;
    }

    public final h5.g c() {
        long n11 = (w3.g.n() / 86400000) * 86400000;
        return new h5.g(2, new h5.x(100L, 100L, 0L, 0, n11), new v0(5270400000L + n11));
    }

    public final Object d(LanguageType languageType, j00.c<? super h5.g> cVar) {
        return languageType == LanguageType.En ? c() : this.f70254a.k(languageType, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r6, @m80.k j00.c<? super h5.g> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l6.o.b
            if (r0 == 0) goto L13
            r0 = r7
            l6.o$b r0 = (l6.o.b) r0
            int r1 = r0.f70260e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70260e = r1
            goto L18
        L13:
            l6.o$b r0 = new l6.o$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f70258c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f70260e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f70256a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r6 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r6
            kotlin.e.n(r7)
            return r7
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f70256a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r6 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r6
            kotlin.e.n(r7)
            goto L56
        L40:
            kotlin.e.n(r7)
            com.baicizhan.app.biz.game.uc.abtest.GetABTestUC r7 = r5.f70255b
            h5.b r2 = h5.b.f58318a
            h5.a$a r2 = r2.c()
            r0.f70256a = r6
            r0.f70260e = r4
            java.lang.Object r7 = r7.k(r2, r0)
            if (r7 != r1) goto L56
            goto L6e
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            java.lang.Object r2 = l00.k.a(r6)
            r0.f70256a = r2
            r0.f70257b = r7
            r0.f70260e = r3
            java.lang.Object r6 = r5.d(r6, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r6
        L70:
            h5.g r6 = r5.c()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.o.e(com.baicizhan.app.biz.game.repo.userresource.LanguageType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r7, @m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.g>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l6.o.c
            if (r0 == 0) goto L13
            r0 = r8
            l6.o$c r0 = (l6.o.c) r0
            int r1 = r0.f70265e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70265e = r1
            goto L18
        L13:
            l6.o$c r0 = new l6.o$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f70263c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f70265e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.f70262b
            kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.i) r7
            java.lang.Object r0 = r0.f70261a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r0 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r0
            kotlin.e.n(r8)
            goto L5b
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.e.n(r8)
            c6.b r8 = r6.f70254a
            kotlinx.coroutines.flow.i r8 = r8.n()
            com.baicizhan.app.biz.game.uc.abtest.GetABTestUC r2 = r6.f70255b
            h5.b r4 = h5.b.f58318a
            h5.a$a r4 = r4.c()
            r0.f70261a = r7
            r0.f70262b = r8
            r0.f70265e = r3
            java.lang.Object r0 = r2.m(r4, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L5b:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            l6.o$d r1 = new l6.o$d
            r2 = 0
            r1.<init>(r0, r2)
            kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.k.I(r7, r8, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.o.f(com.baicizhan.app.biz.game.repo.userresource.LanguageType, j00.c):java.lang.Object");
    }
}
