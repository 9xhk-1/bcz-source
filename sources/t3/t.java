package t3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IChecker.kt\ncom/baicizhan/app/biz/base/cache/NaturalDayChecker\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,97:1\n41#2,6:98\n48#2:105\n142#3:104\n127#4:106\n*S KotlinDebug\n*F\n+ 1 IChecker.kt\ncom/baicizhan/app/biz/base/cache/NaturalDayChecker\n*L\n55#1:98,6\n55#1:105\n55#1:104\n55#1:106\n*E\n"})
/* loaded from: classes3.dex */
public final class t implements h, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f89282b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f89283c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.NaturalDayChecker", f = "IChecker.kt", i = {0}, l = {62}, m = "isExpired", n = {"today"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89284a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89285b;

        /* renamed from: d, reason: collision with root package name */
        public int f89287d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89285b = obj;
            this.f89287d |= Integer.MIN_VALUE;
            return t.this.a(this);
        }
    }

    public t(@m80.k String key) {
        g0.p(key, "key");
        this.f89282b = key;
        this.f89283c = yz.e0.c(new x00.a() { // from class: t3.r
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g g11;
                g11 = t.g(t.this);
                return g11;
            }
        });
    }

    private final com.baicizhan.app.preferences.g f() {
        return (com.baicizhan.app.preferences.g) this.f89283c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.baicizhan.app.preferences.g g(t tVar) {
        return (com.baicizhan.app.preferences.g) (tVar instanceof pa0.c ? ((pa0.c) tVar).getScope() : tVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: t3.s
            @Override // x00.a
            public final Object invoke() {
                ya0.a i11;
                i11 = t.i();
                return i11;
            }
        });
    }

    public static final ya0.a i() {
        return ya0.b.d(i.f89271a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // t3.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof t3.t.a
            if (r0 == 0) goto L13
            r0 = r8
            t3.t$a r0 = (t3.t.a) r0
            int r1 = r0.f89287d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89287d = r1
            goto L18
        L13:
            t3.t$a r0 = new t3.t$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f89285b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89287d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f89284a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r8)
            goto L52
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.e.n(r8)
            java.lang.String r8 = w3.g.m()
            com.baicizhan.app.preferences.g r2 = r7.f()
            java.lang.String r4 = r7.f89282b
            r0.f89284a = r8
            r0.f89287d = r3
            java.lang.String r5 = ""
            java.lang.Object r0 = r2.j(r4, r5, r0)
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r6 = r0
            r0 = r8
            r8 = r6
        L52:
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r0)
            r8 = r8 ^ r3
            java.lang.Boolean r8 = l00.a.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.t.a(j00.c):java.lang.Object");
    }

    @Override // t3.h
    @m80.l
    public Object b(@m80.k j00.c<? super g2> cVar) {
        Object k11 = f().k(this.f89282b, w3.g.m(), cVar);
        return k11 == kotlin.coroutines.intrinsics.b.l() ? k11 : g2.f100423a;
    }

    @Override // t3.h
    @m80.l
    public Object c(@m80.k j00.c<? super g2> cVar) {
        Object j11 = f().j(this.f89282b, "", cVar);
        return j11 == kotlin.coroutines.intrinsics.b.l() ? j11 : g2.f100423a;
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
