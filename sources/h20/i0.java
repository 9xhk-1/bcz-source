package h20;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f58096k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58097l;

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58098m;

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58099n;

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58100o;

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58101p;

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58102q;

    /* renamed from: r, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58103r;

    /* renamed from: s, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58104s;

    /* renamed from: t, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final i0 f58105t;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58106a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58107b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58108c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58109d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58110e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final i0 f58111f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58112g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final i0 f58113h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final i0 f58114i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f58115j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58116a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58116a = iArr;
        }
    }

    static {
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        i0 i0Var = new i0(z11, z12, z13, z14, z15, null, false, null, null, z16, 1023, null);
        f58097l = i0Var;
        i0 i0Var2 = new i0(false, false, z16, false, false, null, false, null, null, true, 511, null);
        f58098m = i0Var2;
        f58099n = new i0(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f58100o = new i0(z11, z12, z13, z14, z15, i0Var, false, null, null, z16, 988, null);
        f58101p = new i0(false, false, z16, false, false, i0Var2, false, null, null, true, 476, null);
        kotlin.jvm.internal.v vVar = null;
        boolean z17 = false;
        i0 i0Var3 = null;
        i0 i0Var4 = null;
        f58102q = new i0(z11, true, z13, z14, z15, i0Var, z17, i0Var3, i0Var4, z16, 988, vVar);
        boolean z18 = false;
        boolean z19 = true;
        f58103r = new i0(z11, z18, z13, z19, z15, i0Var, z17, i0Var3, i0Var4, z16, 983, vVar);
        f58104s = new i0(z11, z18, z13, z19, z15, i0Var, z17, i0Var3, i0Var4, z16, 919, vVar);
        f58105t = new i0(z11, z18, true, false, z15, i0Var, z17, i0Var3, i0Var4, z16, 984, vVar);
    }

    public i0() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean a() {
        return this.f58112g;
    }

    public final boolean b() {
        return this.f58115j;
    }

    public final boolean c() {
        return this.f58107b;
    }

    public final boolean d() {
        return this.f58106a;
    }

    public final boolean e() {
        return this.f58108c;
    }

    @m80.k
    public final i0 f(@m80.k Variance effectiveVariance, boolean z11) {
        kotlin.jvm.internal.g0.p(effectiveVariance, "effectiveVariance");
        if (!z11 || !this.f58108c) {
            int i11 = b.f58116a[effectiveVariance.ordinal()];
            if (i11 == 1) {
                i0 i0Var = this.f58113h;
                if (i0Var != null) {
                    return i0Var;
                }
            } else if (i11 != 2) {
                i0 i0Var2 = this.f58111f;
                if (i0Var2 != null) {
                    return i0Var2;
                }
            } else {
                i0 i0Var3 = this.f58114i;
                if (i0Var3 != null) {
                    return i0Var3;
                }
            }
        }
        return this;
    }

    @m80.k
    public final i0 g() {
        return new i0(this.f58106a, true, this.f58108c, this.f58109d, this.f58110e, this.f58111f, this.f58112g, this.f58113h, this.f58114i, false, 512, null);
    }

    public i0(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @m80.l i0 i0Var, boolean z16, @m80.l i0 i0Var2, @m80.l i0 i0Var3, boolean z17) {
        this.f58106a = z11;
        this.f58107b = z12;
        this.f58108c = z13;
        this.f58109d = z14;
        this.f58110e = z15;
        this.f58111f = i0Var;
        this.f58112g = z16;
        this.f58113h = i0Var2;
        this.f58114i = i0Var3;
        this.f58115j = z17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ i0(boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, h20.i0 r8, boolean r9, h20.i0 r10, h20.i0 r11, boolean r12, int r13, kotlin.jvm.internal.v r14) {
        /*
            r2 = this;
            r14 = r13 & 1
            r0 = 1
            if (r14 == 0) goto L6
            r3 = r0
        L6:
            r14 = r13 & 2
            if (r14 == 0) goto Lb
            r4 = r0
        Lb:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L11
            r5 = r1
        L11:
            r14 = r13 & 8
            if (r14 == 0) goto L16
            r6 = r1
        L16:
            r14 = r13 & 16
            if (r14 == 0) goto L1b
            r7 = r1
        L1b:
            r14 = r13 & 32
            if (r14 == 0) goto L20
            r8 = 0
        L20:
            r14 = r13 & 64
            if (r14 == 0) goto L25
            r9 = r0
        L25:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L2a
            r10 = r8
        L2a:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L2f
            r11 = r8
        L2f:
            r13 = r13 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L3f
            r13 = r1
        L34:
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L41
        L3f:
            r13 = r12
            goto L34
        L41:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h20.i0.<init>(boolean, boolean, boolean, boolean, boolean, h20.i0, boolean, h20.i0, h20.i0, boolean, int, kotlin.jvm.internal.v):void");
    }
}
