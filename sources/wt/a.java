package wt;

import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;
import com.rd.draw.data.RtlMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static final int B = 3;
    public static final int C = 1;
    public static final int D = -1;
    public static final int E = 6;
    public static final int F = 8;
    public static final int G = 250;
    public RtlMode A;

    /* renamed from: a, reason: collision with root package name */
    public int f96848a;

    /* renamed from: b, reason: collision with root package name */
    public int f96849b;

    /* renamed from: c, reason: collision with root package name */
    public int f96850c;

    /* renamed from: d, reason: collision with root package name */
    public int f96851d;

    /* renamed from: e, reason: collision with root package name */
    public int f96852e;

    /* renamed from: f, reason: collision with root package name */
    public int f96853f;

    /* renamed from: g, reason: collision with root package name */
    public int f96854g;

    /* renamed from: h, reason: collision with root package name */
    public int f96855h;

    /* renamed from: i, reason: collision with root package name */
    public int f96856i;

    /* renamed from: j, reason: collision with root package name */
    public float f96857j;

    /* renamed from: k, reason: collision with root package name */
    public int f96858k;

    /* renamed from: l, reason: collision with root package name */
    public int f96859l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f96860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f96861n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f96862o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f96863p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f96864q;

    /* renamed from: r, reason: collision with root package name */
    public long f96865r;

    /* renamed from: s, reason: collision with root package name */
    public long f96866s;

    /* renamed from: u, reason: collision with root package name */
    public int f96868u;

    /* renamed from: v, reason: collision with root package name */
    public int f96869v;

    /* renamed from: w, reason: collision with root package name */
    public int f96870w;

    /* renamed from: y, reason: collision with root package name */
    public Orientation f96872y;

    /* renamed from: z, reason: collision with root package name */
    public AnimationType f96873z;

    /* renamed from: t, reason: collision with root package name */
    public int f96867t = 3;

    /* renamed from: x, reason: collision with root package name */
    public int f96871x = -1;

    public boolean A() {
        return this.f96860m;
    }

    public void B(long j11) {
        this.f96866s = j11;
    }

    public void C(AnimationType animationType) {
        this.f96873z = animationType;
    }

    public void D(boolean z11) {
        this.f96861n = z11;
    }

    public void E(int i11) {
        this.f96867t = i11;
    }

    public void F(boolean z11) {
        this.f96862o = z11;
    }

    public void G(boolean z11) {
        this.f96863p = z11;
    }

    public void H(int i11) {
        this.f96848a = i11;
    }

    public void I(boolean z11) {
        this.f96864q = z11;
    }

    public void J(long j11) {
        this.f96865r = j11;
    }

    public void K(boolean z11) {
        this.f96860m = z11;
    }

    public void L(int i11) {
        this.f96870w = i11;
    }

    public void M(Orientation orientation) {
        this.f96872y = orientation;
    }

    public void N(int i11) {
        this.f96851d = i11;
    }

    public void O(int i11) {
        this.f96855h = i11;
    }

    public void P(int i11) {
        this.f96852e = i11;
    }

    public void Q(int i11) {
        this.f96854g = i11;
    }

    public void R(int i11) {
        this.f96853f = i11;
    }

    public void S(int i11) {
        this.f96850c = i11;
    }

    public void T(RtlMode rtlMode) {
        this.A = rtlMode;
    }

    public void U(float f11) {
        this.f96857j = f11;
    }

    public void V(int i11) {
        this.f96859l = i11;
    }

    public void W(int i11) {
        this.f96868u = i11;
    }

    public void X(int i11) {
        this.f96869v = i11;
    }

    public void Y(int i11) {
        this.f96856i = i11;
    }

    public void Z(int i11) {
        this.f96858k = i11;
    }

    public long a() {
        return this.f96866s;
    }

    public void a0(int i11) {
        this.f96871x = i11;
    }

    @NonNull
    public AnimationType b() {
        if (this.f96873z == null) {
            this.f96873z = AnimationType.NONE;
        }
        return this.f96873z;
    }

    public void b0(int i11) {
        this.f96849b = i11;
    }

    public int c() {
        return this.f96867t;
    }

    public int d() {
        return this.f96848a;
    }

    public long e() {
        return this.f96865r;
    }

    public int f() {
        return this.f96870w;
    }

    @NonNull
    public Orientation g() {
        if (this.f96872y == null) {
            this.f96872y = Orientation.HORIZONTAL;
        }
        return this.f96872y;
    }

    public int h() {
        return this.f96851d;
    }

    public int i() {
        return this.f96855h;
    }

    public int j() {
        return this.f96852e;
    }

    public int k() {
        return this.f96854g;
    }

    public int l() {
        return this.f96853f;
    }

    public int m() {
        return this.f96850c;
    }

    @NonNull
    public RtlMode n() {
        if (this.A == null) {
            this.A = RtlMode.Off;
        }
        return this.A;
    }

    public float o() {
        return this.f96857j;
    }

    public int p() {
        return this.f96859l;
    }

    public int q() {
        return this.f96868u;
    }

    public int r() {
        return this.f96869v;
    }

    public int s() {
        return this.f96856i;
    }

    public int t() {
        return this.f96858k;
    }

    public int u() {
        return this.f96871x;
    }

    public int v() {
        return this.f96849b;
    }

    public boolean w() {
        return this.f96861n;
    }

    public boolean x() {
        return this.f96862o;
    }

    public boolean y() {
        return this.f96863p;
    }

    public boolean z() {
        return this.f96864q;
    }
}
