package t3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import w30.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IChecker.kt\ncom/baicizhan/app/biz/base/cache/TimeChecker\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,97:1\n41#2,6:98\n48#2:105\n142#3:104\n127#4:106\n*S KotlinDebug\n*F\n+ 1 IChecker.kt\ncom/baicizhan/app/biz/base/cache/TimeChecker\n*L\n77#1:98,6\n77#1:105\n77#1:104\n77#1:106\n*E\n"})
/* loaded from: classes3.dex */
public final class e0 implements h, c4.j {

    /* renamed from: b, reason: collision with root package name */
    public final long f89245b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f89246c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f89247d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.TimeChecker", f = "IChecker.kt", i = {0}, l = {84}, m = "isExpired", n = {"now"}, s = {"J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f89248a;

        /* renamed from: b, reason: collision with root package name */
        public long f89249b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89250c;

        /* renamed from: e, reason: collision with root package name */
        public int f89252e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89250c = obj;
            this.f89252e |= Integer.MIN_VALUE;
            return e0.this.a(this);
        }
    }

    public e0(long j11, @m80.k String key) {
        g0.p(key, "key");
        this.f89245b = j11;
        this.f89246c = key;
        this.f89247d = yz.e0.c(new x00.a() { // from class: t3.c0
            @Override // x00.a
            public final Object invoke() {
                com.baicizhan.app.preferences.g g11;
                g11 = e0.g(e0.this);
                return g11;
            }
        });
    }

    private final com.baicizhan.app.preferences.g f() {
        return (com.baicizhan.app.preferences.g) this.f89247d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.baicizhan.app.preferences.g g(e0 e0Var) {
        return (com.baicizhan.app.preferences.g) (e0Var instanceof pa0.c ? ((pa0.c) e0Var).getScope() : e0Var.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: t3.d0
            @Override // x00.a
            public final Object invoke() {
                ya0.a i11;
                i11 = e0.i();
                return i11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya0.a i() {
        return ya0.b.d(i.f89271a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // t3.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof t3.e0.a
            if (r0 == 0) goto L13
            r0 = r9
            t3.e0$a r0 = (t3.e0.a) r0
            int r1 = r0.f89252e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89252e = r1
            goto L18
        L13:
            t3.e0$a r0 = new t3.e0$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f89250c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89252e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r0 = r0.f89249b
            kotlin.e.n(r9)
            goto L56
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.e.n(r9)
            w30.b$b r9 = w30.b.C1273b.f94770b
            kotlin.time.Instant r9 = r9.a()
            long r4 = r9.toEpochMilliseconds()
            com.baicizhan.app.preferences.g r9 = r8.f()
            java.lang.String r2 = r8.f89246c
            r0.f89248a = r4
            r0.f89249b = r4
            r0.f89252e = r3
            r6 = 0
            java.lang.Object r9 = r9.h(r2, r6, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r0 = r4
        L56:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            long r0 = r0 - r4
            long r4 = r8.f89245b
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto L64
            goto L65
        L64:
            r3 = 0
        L65:
            java.lang.Boolean r9 = l00.a.a(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.e0.a(j00.c):java.lang.Object");
    }

    @Override // t3.h
    @m80.l
    public Object b(@m80.k j00.c<? super g2> cVar) {
        Object i11 = f().i(this.f89246c, b.C1273b.f94770b.a().toEpochMilliseconds(), cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    @Override // t3.h
    @m80.l
    public Object c(@m80.k j00.c<? super g2> cVar) {
        Object h11 = f().h(this.f89246c, 0L, cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
