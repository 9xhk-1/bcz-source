package com.badlogic.gdx.graphics;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface f {
    public static final int A = 32777;
    public static final int A0 = 2961;
    public static final int A1 = 5132;
    public static final int A2 = 9985;
    public static final int A3 = 33648;
    public static final int A4 = 36180;
    public static final int B = 34877;
    public static final int B0 = 2962;
    public static final int B1 = 6402;
    public static final int B2 = 9986;
    public static final int B3 = 35664;
    public static final int B4 = 36181;
    public static final int C = 32778;
    public static final int C0 = 2964;
    public static final int C1 = 6406;
    public static final int C2 = 9987;
    public static final int C3 = 35665;
    public static final int C4 = 36048;
    public static final int D = 32779;
    public static final int D0 = 2965;
    public static final int D1 = 6407;
    public static final int D2 = 10240;
    public static final int D3 = 35666;
    public static final int D4 = 36049;
    public static final int E = 32968;
    public static final int E0 = 2966;
    public static final int E1 = 6408;
    public static final int E2 = 10241;
    public static final int E3 = 35667;
    public static final int E4 = 36050;
    public static final int F = 32969;
    public static final int F0 = 2967;
    public static final int F1 = 6409;
    public static final int F2 = 10242;
    public static final int F3 = 35668;
    public static final int F4 = 36051;
    public static final int G = 32970;
    public static final int G0 = 2963;
    public static final int G1 = 6410;
    public static final int G2 = 10243;
    public static final int G3 = 35669;
    public static final int G4 = 36064;
    public static final int H = 32971;
    public static final int H0 = 2968;
    public static final int H1 = 32819;
    public static final int H2 = 5890;
    public static final int H3 = 35670;
    public static final int H4 = 36096;
    public static final int I = 32769;
    public static final int I0 = 34816;
    public static final int I1 = 32820;
    public static final int I2 = 34067;
    public static final int I3 = 35671;
    public static final int I4 = 36128;
    public static final int J = 32770;
    public static final int J0 = 34817;
    public static final int J1 = 33635;
    public static final int J2 = 34068;
    public static final int J3 = 35672;
    public static final int J4 = 0;
    public static final int K = 32771;
    public static final int K0 = 34818;
    public static final int K1 = 35632;
    public static final int K2 = 34069;
    public static final int K3 = 35673;
    public static final int K4 = 36053;
    public static final int L = 32772;
    public static final int L0 = 34819;
    public static final int L1 = 35633;
    public static final int L2 = 34070;
    public static final int L3 = 35674;
    public static final int L4 = 36054;
    public static final int M = 32773;
    public static final int M0 = 36003;
    public static final int M1 = 34921;
    public static final int M2 = 34071;
    public static final int M3 = 35675;
    public static final int M4 = 36055;
    public static final int N = 34962;
    public static final int N0 = 36004;
    public static final int N1 = 36347;
    public static final int N2 = 34072;
    public static final int N3 = 35676;
    public static final int N4 = 36057;
    public static final int O = 34963;
    public static final int O0 = 36005;
    public static final int O1 = 36348;
    public static final int O2 = 34073;
    public static final int O3 = 35678;
    public static final int O4 = 36061;
    public static final int P = 34964;
    public static final int P0 = 2978;
    public static final int P1 = 35661;
    public static final int P2 = 34074;
    public static final int P3 = 35680;
    public static final int P4 = 36006;
    public static final int Q = 34965;
    public static final int Q0 = 3088;
    public static final int Q1 = 35660;
    public static final int Q2 = 34076;
    public static final int Q3 = 34338;
    public static final int Q4 = 36007;
    public static final int R = 35040;
    public static final int R0 = 3106;
    public static final int R1 = 34930;
    public static final int R2 = 33984;
    public static final int R3 = 34339;
    public static final int R4 = 34024;
    public static final int S = 35044;
    public static final int S0 = 3107;
    public static final int S1 = 36349;
    public static final int S2 = 33985;
    public static final int S3 = 34340;
    public static final int S4 = 1286;
    public static final int T = 35048;
    public static final int T0 = 3317;
    public static final int T1 = 35663;
    public static final int T2 = 33986;
    public static final int T3 = 34341;
    public static final int T4 = 34370;
    public static final int U = 34660;
    public static final int U0 = 3333;
    public static final int U1 = 35712;
    public static final int U2 = 33987;
    public static final int U3 = 34922;
    public static final int U4 = 32768;
    public static final int V = 34661;
    public static final int V0 = 3379;
    public static final int V1 = 35714;
    public static final int V2 = 33988;
    public static final int V3 = 34373;
    public static final int V4 = 34046;
    public static final int W = 34342;
    public static final int W0 = 34018;
    public static final int W1 = 35715;
    public static final int W2 = 33989;
    public static final int W3 = 34975;
    public static final int W4 = 34047;
    public static final int X = 1028;
    public static final int X0 = 3386;
    public static final int X1 = 35717;
    public static final int X2 = 33990;
    public static final int X3 = 35738;
    public static final int Y = 1029;
    public static final int Y0 = 3408;
    public static final int Y1 = 35718;
    public static final int Y2 = 33991;
    public static final int Y3 = 35739;
    public static final int Z = 1032;
    public static final int Z0 = 3410;
    public static final int Z1 = 35719;
    public static final int Z2 = 33992;
    public static final int Z3 = 35713;

    /* renamed from: a, reason: collision with root package name */
    public static final int f11551a = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f11552a0 = 3553;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f11553a1 = 3411;

    /* renamed from: a2, reason: collision with root package name */
    public static final int f11554a2 = 35721;

    /* renamed from: a3, reason: collision with root package name */
    public static final int f11555a3 = 33993;

    /* renamed from: a4, reason: collision with root package name */
    public static final int f11556a4 = 35716;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11557b = 256;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f11558b0 = 2884;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f11559b1 = 3412;

    /* renamed from: b2, reason: collision with root package name */
    public static final int f11560b2 = 35722;

    /* renamed from: b3, reason: collision with root package name */
    public static final int f11561b3 = 33994;

    /* renamed from: b4, reason: collision with root package name */
    public static final int f11562b4 = 35720;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11563c = 1024;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f11564c0 = 3042;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f11565c1 = 3413;

    /* renamed from: c2, reason: collision with root package name */
    public static final int f11566c2 = 35724;

    /* renamed from: c3, reason: collision with root package name */
    public static final int f11567c3 = 33995;

    /* renamed from: c4, reason: collision with root package name */
    public static final int f11568c4 = 36346;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11569d = 16384;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f11570d0 = 3024;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f11571d1 = 3414;

    /* renamed from: d2, reason: collision with root package name */
    public static final int f11572d2 = 35725;

    /* renamed from: d3, reason: collision with root package name */
    public static final int f11573d3 = 33996;

    /* renamed from: d4, reason: collision with root package name */
    public static final int f11574d4 = 36344;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11575e = 0;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f11576e0 = 2960;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f11577e1 = 3415;

    /* renamed from: e2, reason: collision with root package name */
    public static final int f11578e2 = 512;

    /* renamed from: e3, reason: collision with root package name */
    public static final int f11579e3 = 33997;

    /* renamed from: e4, reason: collision with root package name */
    public static final int f11580e4 = 36345;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11581f = 1;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f11582f0 = 2929;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f11583f1 = 10752;

    /* renamed from: f2, reason: collision with root package name */
    public static final int f11584f2 = 513;

    /* renamed from: f3, reason: collision with root package name */
    public static final int f11585f3 = 33998;

    /* renamed from: f4, reason: collision with root package name */
    public static final int f11586f4 = 36336;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11587g = 0;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f11588g0 = 3089;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f11589g1 = 32824;

    /* renamed from: g2, reason: collision with root package name */
    public static final int f11590g2 = 514;

    /* renamed from: g3, reason: collision with root package name */
    public static final int f11591g3 = 33999;

    /* renamed from: g4, reason: collision with root package name */
    public static final int f11592g4 = 36337;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11593h = 1;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f11594h0 = 32823;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f11595h1 = 32873;

    /* renamed from: h2, reason: collision with root package name */
    public static final int f11596h2 = 515;

    /* renamed from: h3, reason: collision with root package name */
    public static final int f11597h3 = 34000;

    /* renamed from: h4, reason: collision with root package name */
    public static final int f11598h4 = 36338;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11599i = 2;

    /* renamed from: i0, reason: collision with root package name */
    public static final int f11600i0 = 32926;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f11601i1 = 32936;

    /* renamed from: i2, reason: collision with root package name */
    public static final int f11602i2 = 516;

    /* renamed from: i3, reason: collision with root package name */
    public static final int f11603i3 = 34001;

    /* renamed from: i4, reason: collision with root package name */
    public static final int f11604i4 = 36339;

    /* renamed from: j, reason: collision with root package name */
    public static final int f11605j = 3;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f11606j0 = 32928;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f11607j1 = 32937;

    /* renamed from: j2, reason: collision with root package name */
    public static final int f11608j2 = 517;

    /* renamed from: j3, reason: collision with root package name */
    public static final int f11609j3 = 34002;

    /* renamed from: j4, reason: collision with root package name */
    public static final int f11610j4 = 36340;

    /* renamed from: k, reason: collision with root package name */
    public static final int f11611k = 4;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f11612k0 = 0;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f11613k1 = 32938;

    /* renamed from: k2, reason: collision with root package name */
    public static final int f11614k2 = 518;

    /* renamed from: k3, reason: collision with root package name */
    public static final int f11615k3 = 34003;

    /* renamed from: k4, reason: collision with root package name */
    public static final int f11616k4 = 36341;

    /* renamed from: l, reason: collision with root package name */
    public static final int f11617l = 5;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f11618l0 = 1280;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f11619l1 = 32939;

    /* renamed from: l2, reason: collision with root package name */
    public static final int f11620l2 = 519;

    /* renamed from: l3, reason: collision with root package name */
    public static final int f11621l3 = 34004;

    /* renamed from: l4, reason: collision with root package name */
    public static final int f11622l4 = 36160;

    /* renamed from: m, reason: collision with root package name */
    public static final int f11623m = 6;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f11624m0 = 1281;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f11625m1 = 34466;

    /* renamed from: m2, reason: collision with root package name */
    public static final int f11626m2 = 7680;

    /* renamed from: m3, reason: collision with root package name */
    public static final int f11627m3 = 34005;

    /* renamed from: m4, reason: collision with root package name */
    public static final int f11628m4 = 36161;

    /* renamed from: n, reason: collision with root package name */
    public static final int f11629n = 0;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f11630n0 = 1282;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f11631n1 = 34467;

    /* renamed from: n2, reason: collision with root package name */
    public static final int f11632n2 = 7681;

    /* renamed from: n3, reason: collision with root package name */
    public static final int f11633n3 = 34006;

    /* renamed from: n4, reason: collision with root package name */
    public static final int f11634n4 = 32854;

    /* renamed from: o, reason: collision with root package name */
    public static final int f11635o = 1;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f11636o0 = 1285;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f11637o1 = 4352;

    /* renamed from: o2, reason: collision with root package name */
    public static final int f11638o2 = 7682;

    /* renamed from: o3, reason: collision with root package name */
    public static final int f11639o3 = 34007;

    /* renamed from: o4, reason: collision with root package name */
    public static final int f11640o4 = 32855;

    /* renamed from: p, reason: collision with root package name */
    public static final int f11641p = 768;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f11642p0 = 2304;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f11643p1 = 4353;

    /* renamed from: p2, reason: collision with root package name */
    public static final int f11644p2 = 7683;

    /* renamed from: p3, reason: collision with root package name */
    public static final int f11645p3 = 34008;

    /* renamed from: p4, reason: collision with root package name */
    public static final int f11646p4 = 36194;

    /* renamed from: q, reason: collision with root package name */
    public static final int f11647q = 769;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f11648q0 = 2305;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f11649q1 = 4354;

    /* renamed from: q2, reason: collision with root package name */
    public static final int f11650q2 = 5386;

    /* renamed from: q3, reason: collision with root package name */
    public static final int f11651q3 = 34009;

    /* renamed from: q4, reason: collision with root package name */
    public static final int f11652q4 = 33189;

    /* renamed from: r, reason: collision with root package name */
    public static final int f11653r = 770;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f11654r0 = 2849;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f11655r1 = 33169;

    /* renamed from: r2, reason: collision with root package name */
    public static final int f11656r2 = 34055;

    /* renamed from: r3, reason: collision with root package name */
    public static final int f11657r3 = 34010;

    /* renamed from: r4, reason: collision with root package name */
    public static final int f11658r4 = 6401;

    /* renamed from: s, reason: collision with root package name */
    public static final int f11659s = 771;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f11660s0 = 33901;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f11661s1 = 33170;

    /* renamed from: s2, reason: collision with root package name */
    public static final int f11662s2 = 34056;

    /* renamed from: s3, reason: collision with root package name */
    public static final int f11663s3 = 34011;

    /* renamed from: s4, reason: collision with root package name */
    public static final int f11664s4 = 36168;

    /* renamed from: t, reason: collision with root package name */
    public static final int f11665t = 772;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f11666t0 = 33902;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f11667t1 = 5120;

    /* renamed from: t2, reason: collision with root package name */
    public static final int f11668t2 = 7936;

    /* renamed from: t3, reason: collision with root package name */
    public static final int f11669t3 = 34012;

    /* renamed from: t4, reason: collision with root package name */
    public static final int f11670t4 = 36162;

    /* renamed from: u, reason: collision with root package name */
    public static final int f11671u = 773;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f11672u0 = 2885;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f11673u1 = 5121;

    /* renamed from: u2, reason: collision with root package name */
    public static final int f11674u2 = 7937;

    /* renamed from: u3, reason: collision with root package name */
    public static final int f11675u3 = 34013;

    /* renamed from: u4, reason: collision with root package name */
    public static final int f11676u4 = 36163;

    /* renamed from: v, reason: collision with root package name */
    public static final int f11677v = 774;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f11678v0 = 2886;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f11679v1 = 5122;

    /* renamed from: v2, reason: collision with root package name */
    public static final int f11680v2 = 7938;

    /* renamed from: v3, reason: collision with root package name */
    public static final int f11681v3 = 34014;

    /* renamed from: v4, reason: collision with root package name */
    public static final int f11682v4 = 36164;

    /* renamed from: w, reason: collision with root package name */
    public static final int f11683w = 775;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f11684w0 = 2928;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f11685w1 = 5123;

    /* renamed from: w2, reason: collision with root package name */
    public static final int f11686w2 = 7939;

    /* renamed from: w3, reason: collision with root package name */
    public static final int f11687w3 = 34015;

    /* renamed from: w4, reason: collision with root package name */
    public static final int f11688w4 = 36176;

    /* renamed from: x, reason: collision with root package name */
    public static final int f11689x = 776;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f11690x0 = 2930;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f11691x1 = 5124;

    /* renamed from: x2, reason: collision with root package name */
    public static final int f11692x2 = 9728;

    /* renamed from: x3, reason: collision with root package name */
    public static final int f11693x3 = 34016;

    /* renamed from: x4, reason: collision with root package name */
    public static final int f11694x4 = 36177;

    /* renamed from: y, reason: collision with root package name */
    public static final int f11695y = 32774;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f11696y0 = 2931;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f11697y1 = 5125;

    /* renamed from: y2, reason: collision with root package name */
    public static final int f11698y2 = 9729;

    /* renamed from: y3, reason: collision with root package name */
    public static final int f11699y3 = 10497;

    /* renamed from: y4, reason: collision with root package name */
    public static final int f11700y4 = 36178;

    /* renamed from: z, reason: collision with root package name */
    public static final int f11701z = 32777;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f11702z0 = 2932;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f11703z1 = 5126;

    /* renamed from: z2, reason: collision with root package name */
    public static final int f11704z2 = 9984;

    /* renamed from: z3, reason: collision with root package name */
    public static final int f11705z3 = 33071;

    /* renamed from: z4, reason: collision with root package name */
    public static final int f11706z4 = 36179;

    void A(int i11);

    boolean A0(int i11);

    void A1(int i11, int i12, String str);

    void B4(int i11, int i12, boolean z11, float[] fArr, int i13);

    void C0(int i11, int i12, int i13, int i14);

    void C2(int i11, int i12, int[] iArr, int i13);

    void D(int i11, int i12, IntBuffer intBuffer);

    void D1(int i11, Buffer buffer);

    void D2(int i11, int i12, float[] fArr, int i13);

    void E1(int i11, int i12, IntBuffer intBuffer);

    void F(int i11, int i12, IntBuffer intBuffer);

    void F3(int i11, float f11, float f12, float f13);

    boolean F4(int i11);

    void G(int i11, float f11);

    void G1(int i11, int i12, int i13, int i14, int i15);

    void G3(int i11, int i12, float[] fArr, int i13);

    void I0(int i11, int i12, IntBuffer intBuffer);

    void I4(int i11, int i12, FloatBuffer floatBuffer);

    void J(int i11, int i12, int i13, int i14);

    void J0(int i11, int i12, IntBuffer intBuffer);

    void K(int i11, int i12);

    void K4(int i11, float f11);

    void L2(int i11, String str);

    void M(int i11, int i12, IntBuffer intBuffer);

    void M1(int i11, int i12);

    String M2(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2);

    void M3(int i11, int i12, int i13, int i14);

    void O0(int i11, int i12);

    void O2(int i11, float f11, float f12);

    void P1(int i11);

    void Q2(int i11, int i12, boolean z11, float[] fArr, int i13);

    void R(int i11, int i12, int[] iArr, int i13);

    void S(int i11, int i12, float[] fArr, int i13);

    int S0();

    int S1(int i11);

    void S4(int i11, int i12, int[] iArr, int i13);

    void T0(int i11, IntBuffer intBuffer);

    boolean U2(int i11);

    void U3(int i11, FloatBuffer floatBuffer);

    void U4(int i11, float f11, float f12, float f13, float f14);

    void V(int i11, FloatBuffer floatBuffer);

    int V4();

    void X0(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void X1(int i11, float f11, float f12);

    void X2(int i11, int i12, int i13, boolean z11, int i14, int i15);

    void X3(int i11, int i12, IntBuffer intBuffer);

    void Y2(int i11, int i12, int i13, int i14, int i15);

    void Y4(int i11, int i12, IntBuffer intBuffer);

    void Z0(int i11, int i12, FloatBuffer floatBuffer);

    void Z3(int i11);

    void a(int i11, int i12, int i13, boolean z11, int i14, Buffer buffer);

    void a1(int i11, int i12, int[] iArr, int i13);

    void a4(int i11, int i12, IntBuffer intBuffer);

    void a5(int i11, int i12, int i13, int i14);

    void b5(int i11, int i12, Buffer buffer);

    void c0(int i11, int i12, int i13, int i14);

    void c1(int i11, int i12, float[] fArr, int i13);

    void c2(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2);

    void d0(int i11, IntBuffer intBuffer);

    boolean d1(int i11);

    void d2(int i11, int i12, IntBuffer intBuffer);

    void e(int i11, int i12, int i13);

    void e1(int i11);

    void e2(int i11, float f11, float f12, float f13);

    int e5();

    void f0(int i11, int i12, int i13, IntBuffer intBuffer);

    void f1(int i11, int i12, int i13, Buffer buffer);

    String f3(int i11, int i12, IntBuffer intBuffer, IntBuffer intBuffer2);

    void g3(int i11, int i12, int i13, int i14);

    void g5(int i11, FloatBuffer floatBuffer);

    void glActiveTexture(int i11);

    void glBindTexture(int i11, int i12);

    void glBlendFunc(int i11, int i12);

    void glClear(int i11);

    void glClearColor(float f11, float f12, float f13, float f14);

    void glClearDepthf(float f11);

    void glClearStencil(int i11);

    void glColorMask(boolean z11, boolean z12, boolean z13, boolean z14);

    void glCompressedTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Buffer buffer);

    void glCompressedTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer);

    void glCopyTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    void glCopyTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    void glCullFace(int i11);

    void glDeleteTextures(int i11, IntBuffer intBuffer);

    void glDepthFunc(int i11);

    void glDepthMask(boolean z11);

    void glDepthRangef(float f11, float f12);

    void glDisable(int i11);

    void glDrawArrays(int i11, int i12, int i13);

    void glDrawElements(int i11, int i12, int i13, Buffer buffer);

    void glEnable(int i11);

    void glFinish();

    void glFlush();

    void glFrontFace(int i11);

    void glGenTextures(int i11, IntBuffer intBuffer);

    int glGetError();

    void glGetIntegerv(int i11, IntBuffer intBuffer);

    String glGetString(int i11);

    void glHint(int i11, int i12);

    void glLineWidth(float f11);

    void glPixelStorei(int i11, int i12);

    void glPolygonOffset(float f11, float f12);

    void glReadPixels(int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer);

    void glSampleCoverage(float f11, boolean z11);

    void glScissor(int i11, int i12, int i13, int i14);

    void glStencilFunc(int i11, int i12, int i13);

    void glStencilMask(int i11);

    void glStencilOp(int i11, int i12, int i13);

    void glTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer);

    void glTexParameterf(int i11, int i12, float f11);

    void glTexSubImage2D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Buffer buffer);

    void glViewport(int i11, int i12, int i13, int i14);

    void h(int i11, int i12, FloatBuffer floatBuffer);

    void h2(float f11, float f12, float f13, float f14);

    void i1(int i11, int i12, IntBuffer intBuffer);

    void i3(int i11, int i12);

    void i4(int i11, int i12, FloatBuffer floatBuffer);

    void i5(int i11, IntBuffer intBuffer);

    void j3(int i11, int i12);

    void j4(int i11, int i12, FloatBuffer floatBuffer);

    int j5(int i11, String str);

    void k(int i11, int i12);

    void k3(int i11, IntBuffer intBuffer);

    void k5(int i11);

    void l3(int i11);

    void l4(int i11, float f11, float f12, float f13, float f14);

    void m0(int i11, int i12, FloatBuffer floatBuffer);

    void m1(int i11, int i12);

    void m2(int i11, int i12, Buffer buffer, int i13);

    void m3(int i11);

    int m5(int i11);

    void n(int i11);

    void n0(int i11);

    int n2(int i11, String str);

    boolean n3(int i11);

    void o0(int i11, int i12, FloatBuffer floatBuffer);

    String o4(int i11);

    int p();

    void p0(int i11, IntBuffer intBuffer, int i12, Buffer buffer, int i13);

    void q0(int i11);

    String q2(int i11);

    void q3(int i11, int i12, Buffer buffer, IntBuffer intBuffer);

    void r2(int i11, int i12, boolean z11, float[] fArr, int i13);

    void r4(int i11);

    void s(int i11);

    void s1(int i11);

    boolean s2(int i11);

    void s3(int i11, int i12, IntBuffer intBuffer);

    void s4(int i11, int i12);

    void t(int i11, FloatBuffer floatBuffer);

    void t1(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    boolean t3(int i11);

    void u0();

    void u3(int i11);

    void w0(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void w3(int i11, int i12, int i13, int i14);

    void x0(int i11, IntBuffer intBuffer);

    void x1(int i11, IntBuffer intBuffer);

    int x4();

    void z0(int i11, int i12, int i13);

    void z1(int i11, FloatBuffer floatBuffer);

    void z2(int i11, int i12, FloatBuffer floatBuffer);
}
