package com.baicizhan.app.biz.synservice.version;

import com.baicizhan.app.biz.synservice.version.IVersionRepo;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import n7.e;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {IVersionRepo.class})
/* loaded from: classes3.dex */
public final class a implements IVersionRepo {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f15618a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.app.biz.synservice.version.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0233a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15619a;

        static {
            int[] iArr = new int[IVersionRepo.VersionType.values().length];
            try {
                iArr[IVersionRepo.VersionType.AllBooks.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IVersionRepo.VersionType.UserBooks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15619a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.synservice.version.VersionRepoImpl", f = "IVersionRepo.kt", i = {0}, l = {23}, m = "queryVersion", n = {"type"}, s = {"L$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15620a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15621b;

        /* renamed from: d, reason: collision with root package name */
        public int f15623d;

        public b(c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f15621b = obj;
            this.f15623d |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public a(@k e basicInfoRepo) {
        g0.p(basicInfoRepo, "basicInfoRepo");
        this.f15618a = basicInfoRepo;
    }

    @Override // com.baicizhan.app.biz.synservice.version.IVersionRepo
    @l
    public Object a(@k c<? super g2> cVar) {
        Object u22 = this.f15618a.u2(true, cVar);
        return u22 == kotlin.coroutines.intrinsics.b.l() ? u22 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0029, B:12:0x0047, B:16:0x0056, B:17:0x006f, B:20:0x0060, B:21:0x0065, B:22:0x0066, B:26:0x003a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.baicizhan.app.biz.synservice.version.IVersionRepo
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k com.baicizhan.app.biz.synservice.version.IVersionRepo.VersionType r5, @m80.k j00.c<? super java.lang.Long> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.synservice.version.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.synservice.version.a$b r0 = (com.baicizhan.app.biz.synservice.version.a.b) r0
            int r1 = r0.f15623d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15623d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.synservice.version.a$b r0 = new com.baicizhan.app.biz.synservice.version.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15621b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15623d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f15620a
            com.baicizhan.app.biz.synservice.version.IVersionRepo$VersionType r5 = (com.baicizhan.app.biz.synservice.version.IVersionRepo.VersionType) r5
            kotlin.e.n(r6)     // Catch: java.lang.Exception -> L2d
            goto L47
        L2d:
            r5 = move-exception
            goto L74
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.e.n(r6)
            n7.e r6 = r4.f15618a     // Catch: java.lang.Exception -> L2d
            r0.f15620a = r5     // Catch: java.lang.Exception -> L2d
            r0.f15623d = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r6 = r6.J(r0)     // Catch: java.lang.Exception -> L2d
            if (r6 != r1) goto L47
            return r1
        L47:
            z8.w1 r6 = (z8.w1) r6     // Catch: java.lang.Exception -> L2d
            int[] r0 = com.baicizhan.app.biz.synservice.version.a.C0233a.f15619a     // Catch: java.lang.Exception -> L2d
            int r5 = r5.ordinal()     // Catch: java.lang.Exception -> L2d
            r5 = r0[r5]     // Catch: java.lang.Exception -> L2d
            if (r5 == r3) goto L66
            r0 = 2
            if (r5 != r0) goto L60
            java.lang.Long r5 = r6.f102214h     // Catch: java.lang.Exception -> L2d
            kotlin.jvm.internal.g0.m(r5)     // Catch: java.lang.Exception -> L2d
            long r5 = r5.longValue()     // Catch: java.lang.Exception -> L2d
            goto L6f
        L60:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2d
            r5.<init>()     // Catch: java.lang.Exception -> L2d
            throw r5     // Catch: java.lang.Exception -> L2d
        L66:
            java.lang.Long r5 = r6.f102212f     // Catch: java.lang.Exception -> L2d
            kotlin.jvm.internal.g0.m(r5)     // Catch: java.lang.Exception -> L2d
            long r5 = r5.longValue()     // Catch: java.lang.Exception -> L2d
        L6f:
            java.lang.Long r5 = l00.a.g(r5)     // Catch: java.lang.Exception -> L2d
            return r5
        L74:
            z6.b r6 = z6.b.f101032b
            java.lang.String r0 = "VersionRepo"
            java.lang.String r1 = ""
            r6.i(r0, r1, r5)
            r5 = 0
            java.lang.Long r5 = l00.a.g(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.synservice.version.a.b(com.baicizhan.app.biz.synservice.version.IVersionRepo$VersionType, j00.c):java.lang.Object");
    }
}
