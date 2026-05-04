package com.badlogic.gdx.graphics;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface g extends f {
    public static final int A5 = 33190;
    public static final int A6 = 33308;
    public static final int A7 = 36298;
    public static final int A8 = 36183;
    public static final int A9 = 35382;
    public static final int Aa = 34814;
    public static final int B5 = 34045;
    public static final int B6 = 33309;
    public static final int B7 = 36299;
    public static final int B8 = 5131;
    public static final int B9 = 35383;
    public static final int Ba = 34815;
    public static final int C5 = 34892;
    public static final int C6 = 34836;
    public static final int C7 = 36300;
    public static final int C8 = 1;
    public static final int C9 = 35384;
    public static final int Ca = 37488;
    public static final int D5 = 34893;
    public static final int D6 = 34837;
    public static final int D7 = 36303;
    public static final int D8 = 2;
    public static final int D9 = 35385;
    public static final int Da = 37489;
    public static final int E5 = 34917;
    public static final int E6 = 34842;
    public static final int E7 = 36306;
    public static final int E8 = 4;
    public static final int E9 = 35386;
    public static final int Ea = 37490;
    public static final int F5 = 34918;
    public static final int F6 = 34843;
    public static final int F7 = 36307;
    public static final int F8 = 8;
    public static final int F9 = 35387;
    public static final int Fa = 37491;
    public static final int G5 = 34919;
    public static final int G6 = 35069;
    public static final int G7 = 36308;
    public static final int G8 = 16;
    public static final int G9 = 35388;
    public static final int Ga = 37492;
    public static final int H5 = 35004;
    public static final int H6 = 35071;
    public static final int H7 = 36311;
    public static final int H8 = 32;
    public static final int H9 = 35389;
    public static final int Ha = 37493;
    public static final int I5 = 35005;
    public static final int I6 = 35076;
    public static final int I7 = 37151;
    public static final int I8 = 33319;
    public static final int I9 = 35390;
    public static final int Ia = 37494;
    public static final int J5 = 35041;
    public static final int J6 = 35077;
    public static final int J7 = 37152;
    public static final int J8 = 33320;
    public static final int J9 = 35391;
    public static final int Ja = 37495;
    public static final int K5 = 35042;
    public static final int K6 = 35659;
    public static final int K7 = 37153;
    public static final int K8 = 33321;
    public static final int K9 = 35392;
    public static final int Ka = 37496;
    public static final int L5 = 35045;
    public static final int L6 = 35866;
    public static final int L7 = 36012;
    public static final int L8 = 33323;
    public static final int L9 = 35393;
    public static final int La = 37497;
    public static final int M5 = 35046;
    public static final int M6 = 35869;
    public static final int M7 = 36013;
    public static final int M8 = 33325;
    public static final int M9 = 35394;
    public static final int Ma = 37167;
    public static final int N5 = 35049;
    public static final int N6 = 35898;
    public static final int N7 = 36269;
    public static final int N8 = 33326;
    public static final int N9 = 35395;
    public static final int Na = 36203;
    public static final int O5 = 35050;
    public static final int O6 = 35899;
    public static final int O7 = 33296;
    public static final int O8 = 33327;
    public static final int O9 = 35396;
    public static final int Oa = 37760;
    public static final int P5 = 34852;
    public static final int P6 = 35901;
    public static final int P7 = 33297;
    public static final int P8 = 33328;
    public static final int P9 = 35398;
    public static final int Pa = 33503;
    public static final int Q5 = 34853;
    public static final int Q6 = 35902;
    public static final int Q7 = 33298;
    public static final int Q8 = 33329;
    public static final int Q9 = -1;
    public static final int R5 = 34854;
    public static final int R6 = 35958;
    public static final int R7 = 33299;
    public static final int R8 = 33330;
    public static final int R9 = 37154;
    public static final int S5 = 34855;
    public static final int S6 = 35967;
    public static final int S7 = 33300;
    public static final int S8 = 33331;
    public static final int S9 = 37157;
    public static final int T5 = 34856;
    public static final int T6 = 35968;
    public static final int T7 = 33301;
    public static final int T8 = 33332;
    public static final int T9 = 37137;
    public static final int U5 = 34857;
    public static final int U6 = 35971;
    public static final int U7 = 33302;
    public static final int U8 = 33333;
    public static final int U9 = 37138;
    public static final int V5 = 34858;
    public static final int V6 = 35972;
    public static final int V7 = 33303;
    public static final int V8 = 33334;
    public static final int V9 = 37139;
    public static final int W5 = 34859;
    public static final int W6 = 35973;
    public static final int W7 = 33304;
    public static final int W8 = 33335;
    public static final int W9 = 37140;
    public static final int X4 = 3074;
    public static final int X5 = 34860;
    public static final int X6 = 35976;
    public static final int X7 = 33305;
    public static final int X8 = 33336;
    public static final int X9 = 37141;
    public static final int Y4 = 3314;
    public static final int Y5 = 34861;
    public static final int Y6 = 35977;
    public static final int Y7 = 33306;
    public static final int Y8 = 33337;
    public static final int Y9 = 37142;
    public static final int Z4 = 3315;
    public static final int Z5 = 34862;
    public static final int Z6 = 35978;
    public static final int Z7 = 34041;
    public static final int Z8 = 33338;
    public static final int Z9 = 37143;

    /* renamed from: a5, reason: collision with root package name */
    public static final int f11707a5 = 3316;

    /* renamed from: a6, reason: collision with root package name */
    public static final int f11708a6 = 34863;

    /* renamed from: a7, reason: collision with root package name */
    public static final int f11709a7 = 35979;

    /* renamed from: a8, reason: collision with root package name */
    public static final int f11710a8 = 34042;

    /* renamed from: a9, reason: collision with root package name */
    public static final int f11711a9 = 33339;

    /* renamed from: aa, reason: collision with root package name */
    public static final int f11712aa = 37144;

    /* renamed from: b5, reason: collision with root package name */
    public static final int f11713b5 = 3330;

    /* renamed from: b6, reason: collision with root package name */
    public static final int f11714b6 = 34864;

    /* renamed from: b7, reason: collision with root package name */
    public static final int f11715b7 = 35980;

    /* renamed from: b8, reason: collision with root package name */
    public static final int f11716b8 = 35056;

    /* renamed from: b9, reason: collision with root package name */
    public static final int f11717b9 = 33340;

    /* renamed from: ba, reason: collision with root package name */
    public static final int f11718ba = 37145;

    /* renamed from: c5, reason: collision with root package name */
    public static final int f11719c5 = 3331;

    /* renamed from: c6, reason: collision with root package name */
    public static final int f11720c6 = 34865;

    /* renamed from: c7, reason: collision with root package name */
    public static final int f11721c7 = 35981;

    /* renamed from: c8, reason: collision with root package name */
    public static final int f11722c8 = 35863;

    /* renamed from: c9, reason: collision with root package name */
    public static final int f11723c9 = 34229;

    /* renamed from: ca, reason: collision with root package name */
    public static final int f11724ca = 37146;

    /* renamed from: d5, reason: collision with root package name */
    public static final int f11725d5 = 3332;

    /* renamed from: d6, reason: collision with root package name */
    public static final int f11726d6 = 34866;

    /* renamed from: d7, reason: collision with root package name */
    public static final int f11727d7 = 35982;

    /* renamed from: d8, reason: collision with root package name */
    public static final int f11728d8 = 36006;

    /* renamed from: d9, reason: collision with root package name */
    public static final int f11729d9 = 36756;

    /* renamed from: da, reason: collision with root package name */
    public static final int f11730da = 37147;

    /* renamed from: e5, reason: collision with root package name */
    public static final int f11731e5 = 6144;

    /* renamed from: e6, reason: collision with root package name */
    public static final int f11732e6 = 34867;

    /* renamed from: e7, reason: collision with root package name */
    public static final int f11733e7 = 35983;

    /* renamed from: e8, reason: collision with root package name */
    public static final int f11734e8 = 36008;

    /* renamed from: e9, reason: collision with root package name */
    public static final int f11735e9 = 36757;

    /* renamed from: ea, reason: collision with root package name */
    public static final int f11736ea = 37148;

    /* renamed from: f5, reason: collision with root package name */
    public static final int f11737f5 = 6145;

    /* renamed from: f6, reason: collision with root package name */
    public static final int f11738f6 = 34868;

    /* renamed from: f7, reason: collision with root package name */
    public static final int f11739f7 = 36208;

    /* renamed from: f8, reason: collision with root package name */
    public static final int f11740f8 = 36009;

    /* renamed from: f9, reason: collision with root package name */
    public static final int f11741f9 = 36758;

    /* renamed from: fa, reason: collision with root package name */
    public static final int f11742fa = 37149;

    /* renamed from: g5, reason: collision with root package name */
    public static final int f11743g5 = 6146;

    /* renamed from: g6, reason: collision with root package name */
    public static final int f11744g6 = 35657;

    /* renamed from: g7, reason: collision with root package name */
    public static final int f11745g7 = 36209;

    /* renamed from: g8, reason: collision with root package name */
    public static final int f11746g8 = 36010;

    /* renamed from: g9, reason: collision with root package name */
    public static final int f11747g9 = 36759;

    /* renamed from: ga, reason: collision with root package name */
    public static final int f11748ga = 1;

    /* renamed from: h5, reason: collision with root package name */
    public static final int f11749h5 = 6403;

    /* renamed from: h6, reason: collision with root package name */
    public static final int f11750h6 = 35658;

    /* renamed from: h7, reason: collision with root package name */
    public static final int f11751h7 = 36214;

    /* renamed from: h8, reason: collision with root package name */
    public static final int f11752h8 = 36011;

    /* renamed from: h9, reason: collision with root package name */
    public static final int f11753h9 = 36764;

    /* renamed from: ha, reason: collision with root package name */
    public static final long f11754ha = -1;

    /* renamed from: i5, reason: collision with root package name */
    public static final int f11755i5 = 32849;

    /* renamed from: i6, reason: collision with root package name */
    public static final int f11756i6 = 35679;

    /* renamed from: i7, reason: collision with root package name */
    public static final int f11757i7 = 36215;

    /* renamed from: i8, reason: collision with root package name */
    public static final int f11758i8 = 36052;

    /* renamed from: i9, reason: collision with root package name */
    public static final int f11759i9 = 36201;

    /* renamed from: ia, reason: collision with root package name */
    public static final int f11760ia = 35070;

    /* renamed from: j5, reason: collision with root package name */
    public static final int f11761j5 = 32856;

    /* renamed from: j6, reason: collision with root package name */
    public static final int f11762j6 = 35682;

    /* renamed from: j7, reason: collision with root package name */
    public static final int f11763j7 = 36220;

    /* renamed from: j8, reason: collision with root package name */
    public static final int f11764j8 = 36063;

    /* renamed from: j9, reason: collision with root package name */
    public static final int f11765j9 = 36662;

    /* renamed from: ja, reason: collision with root package name */
    public static final int f11766ja = 35887;

    /* renamed from: k5, reason: collision with root package name */
    public static final int f11767k5 = 32857;

    /* renamed from: k6, reason: collision with root package name */
    public static final int f11768k6 = 35723;

    /* renamed from: k7, reason: collision with root package name */
    public static final int f11769k7 = 36221;

    /* renamed from: k8, reason: collision with root package name */
    public static final int f11770k8 = 36065;

    /* renamed from: k9, reason: collision with root package name */
    public static final int f11771k9 = 36663;

    /* renamed from: ka, reason: collision with root package name */
    public static final int f11772ka = 36202;

    /* renamed from: l5, reason: collision with root package name */
    public static final int f11773l5 = 32874;

    /* renamed from: l6, reason: collision with root package name */
    public static final int f11774l6 = 35051;

    /* renamed from: l7, reason: collision with root package name */
    public static final int f11775l7 = 36226;

    /* renamed from: l8, reason: collision with root package name */
    public static final int f11776l8 = 36066;

    /* renamed from: l9, reason: collision with root package name */
    public static final int f11777l9 = 36662;

    /* renamed from: la, reason: collision with root package name */
    public static final int f11778la = 35097;

    /* renamed from: m5, reason: collision with root package name */
    public static final int f11779m5 = 32877;

    /* renamed from: m6, reason: collision with root package name */
    public static final int f11780m6 = 35052;

    /* renamed from: m7, reason: collision with root package name */
    public static final int f11781m7 = 36227;

    /* renamed from: m8, reason: collision with root package name */
    public static final int f11782m8 = 36067;

    /* renamed from: m9, reason: collision with root package name */
    public static final int f11783m9 = 36663;

    /* renamed from: ma, reason: collision with root package name */
    public static final int f11784ma = 36975;

    /* renamed from: n5, reason: collision with root package name */
    public static final int f11785n5 = 32878;

    /* renamed from: n6, reason: collision with root package name */
    public static final int f11786n6 = 35053;

    /* renamed from: n7, reason: collision with root package name */
    public static final int f11787n7 = 36232;

    /* renamed from: n8, reason: collision with root package name */
    public static final int f11788n8 = 36068;

    /* renamed from: n9, reason: collision with root package name */
    public static final int f11789n9 = 35345;

    /* renamed from: na, reason: collision with root package name */
    public static final int f11790na = 36418;

    /* renamed from: o5, reason: collision with root package name */
    public static final int f11791o5 = 32879;

    /* renamed from: o6, reason: collision with root package name */
    public static final int f11792o6 = 35055;

    /* renamed from: o7, reason: collision with root package name */
    public static final int f11793o7 = 36233;

    /* renamed from: o8, reason: collision with root package name */
    public static final int f11794o8 = 36069;

    /* renamed from: o9, reason: collision with root package name */
    public static final int f11795o9 = 35368;

    /* renamed from: oa, reason: collision with root package name */
    public static final int f11796oa = 36419;

    /* renamed from: p5, reason: collision with root package name */
    public static final int f11797p5 = 32882;

    /* renamed from: p6, reason: collision with root package name */
    public static final int f11798p6 = 35685;

    /* renamed from: p7, reason: collision with root package name */
    public static final int f11799p7 = 36238;

    /* renamed from: p8, reason: collision with root package name */
    public static final int f11800p8 = 36070;

    /* renamed from: p9, reason: collision with root package name */
    public static final int f11801p9 = 35369;

    /* renamed from: pa, reason: collision with root package name */
    public static final int f11802pa = 36420;

    /* renamed from: q5, reason: collision with root package name */
    public static final int f11803q5 = 32883;

    /* renamed from: q6, reason: collision with root package name */
    public static final int f11804q6 = 35686;

    /* renamed from: q7, reason: collision with root package name */
    public static final int f11805q7 = 36239;

    /* renamed from: q8, reason: collision with root package name */
    public static final int f11806q8 = 36071;

    /* renamed from: q9, reason: collision with root package name */
    public static final int f11807q9 = 35370;

    /* renamed from: qa, reason: collision with root package name */
    public static final int f11808qa = 36421;

    /* renamed from: r5, reason: collision with root package name */
    public static final int f11809r5 = 33640;

    /* renamed from: r6, reason: collision with root package name */
    public static final int f11810r6 = 35687;

    /* renamed from: r7, reason: collision with root package name */
    public static final int f11811r7 = 36244;

    /* renamed from: r8, reason: collision with root package name */
    public static final int f11812r8 = 36072;

    /* renamed from: r9, reason: collision with root package name */
    public static final int f11813r9 = 35371;

    /* renamed from: ra, reason: collision with root package name */
    public static final int f11814ra = 6404;

    /* renamed from: s5, reason: collision with root package name */
    public static final int f11815s5 = 33000;

    /* renamed from: s6, reason: collision with root package name */
    public static final int f11816s6 = 35688;

    /* renamed from: s7, reason: collision with root package name */
    public static final int f11817s7 = 36248;

    /* renamed from: s8, reason: collision with root package name */
    public static final int f11818s8 = 36073;

    /* renamed from: s9, reason: collision with root package name */
    public static final int f11819s9 = 35373;

    /* renamed from: sa, reason: collision with root package name */
    public static final int f11820sa = 6405;

    /* renamed from: t5, reason: collision with root package name */
    public static final int f11821t5 = 33001;

    /* renamed from: t6, reason: collision with root package name */
    public static final int f11822t6 = 35689;

    /* renamed from: t7, reason: collision with root package name */
    public static final int f11823t7 = 36249;

    /* renamed from: t8, reason: collision with root package name */
    public static final int f11824t8 = 36074;

    /* renamed from: t9, reason: collision with root package name */
    public static final int f11825t9 = 35374;

    /* renamed from: ta, reason: collision with root package name */
    public static final int f11826ta = 36255;

    /* renamed from: u5, reason: collision with root package name */
    public static final int f11827u5 = 33082;

    /* renamed from: u6, reason: collision with root package name */
    public static final int f11828u6 = 35690;

    /* renamed from: u7, reason: collision with root package name */
    public static final int f11829u7 = 36289;

    /* renamed from: u8, reason: collision with root package name */
    public static final int f11830u8 = 36075;

    /* renamed from: u9, reason: collision with root package name */
    public static final int f11831u9 = 35375;

    /* renamed from: ua, reason: collision with root package name */
    public static final int f11832ua = 36386;

    /* renamed from: v5, reason: collision with root package name */
    public static final int f11833v5 = 33083;

    /* renamed from: v6, reason: collision with root package name */
    public static final int f11834v6 = 35904;

    /* renamed from: v7, reason: collision with root package name */
    public static final int f11835v7 = 36292;

    /* renamed from: v8, reason: collision with root package name */
    public static final int f11836v8 = 36076;

    /* renamed from: v9, reason: collision with root package name */
    public static final int f11837v9 = 35376;

    /* renamed from: va, reason: collision with root package name */
    public static final int f11838va = 36387;

    /* renamed from: w5, reason: collision with root package name */
    public static final int f11839w5 = 33084;

    /* renamed from: w6, reason: collision with root package name */
    public static final int f11840w6 = 35905;

    /* renamed from: w7, reason: collision with root package name */
    public static final int f11841w7 = 36293;

    /* renamed from: w8, reason: collision with root package name */
    public static final int f11842w8 = 36077;

    /* renamed from: w9, reason: collision with root package name */
    public static final int f11843w9 = 35377;

    /* renamed from: wa, reason: collision with root package name */
    public static final int f11844wa = 36388;

    /* renamed from: x5, reason: collision with root package name */
    public static final int f11845x5 = 33085;

    /* renamed from: x6, reason: collision with root package name */
    public static final int f11846x6 = 35907;

    /* renamed from: x7, reason: collision with root package name */
    public static final int f11847x7 = 36294;

    /* renamed from: x8, reason: collision with root package name */
    public static final int f11848x8 = 36078;

    /* renamed from: x9, reason: collision with root package name */
    public static final int f11849x9 = 35379;

    /* renamed from: xa, reason: collision with root package name */
    public static final int f11850xa = 36389;

    /* renamed from: y5, reason: collision with root package name */
    public static final int f11851y5 = 32775;

    /* renamed from: y6, reason: collision with root package name */
    public static final int f11852y6 = 34894;

    /* renamed from: y7, reason: collision with root package name */
    public static final int f11853y7 = 36295;

    /* renamed from: y8, reason: collision with root package name */
    public static final int f11854y8 = 36079;

    /* renamed from: y9, reason: collision with root package name */
    public static final int f11855y9 = 35380;

    /* renamed from: ya, reason: collision with root package name */
    public static final int f11856ya = 33367;

    /* renamed from: z5, reason: collision with root package name */
    public static final int f11857z5 = 32776;

    /* renamed from: z6, reason: collision with root package name */
    public static final int f11858z6 = 33307;

    /* renamed from: z7, reason: collision with root package name */
    public static final int f11859z7 = 36296;

    /* renamed from: z8, reason: collision with root package name */
    public static final int f11860z8 = 36182;

    /* renamed from: z9, reason: collision with root package name */
    public static final int f11861z9 = 35381;

    /* renamed from: za, reason: collision with root package name */
    public static final int f11862za = 34625;

    void A2(int i11, int i12, IntBuffer intBuffer);

    void B3(int i11, int i12);

    void C(int i11);

    void D0(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void D4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    void E2(int i11, int i12, int i13, int i14, int i15);

    void E3(int i11, int i12, int i13, int i14, int i15);

    void E4(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void F0(int i11, int i12, int i13, int i14);

    void F1(int i11, int i12);

    boolean F2(int i11);

    void G4(int i11, int i12, float f11, int i13);

    void H(int i11, int i12, int i13, int i14, int i15);

    void H1(int i11, int[] iArr, int i12);

    void H4(int i11, int i12, int i13, int i14, int i15);

    void I1(int i11, int i12, int i13);

    void I2(int i11, int i12);

    String J2(int i11, int i12);

    void J3(int i11, int i12, int i13, int i14, int i15, int i16);

    void J4(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void K0(int i11, IntBuffer intBuffer);

    void K3(int i11, int i12, Buffer buffer, Buffer buffer2);

    int L(int i11, String str);

    void L0(int i11);

    boolean L1(int i11);

    void M0(int i11, int i12, int i13);

    void N();

    void N3();

    void N4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Buffer buffer);

    void O(int i11, int[] iArr, int i12);

    void O3(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void P0(int i11, IntBuffer intBuffer);

    void P4();

    void Q0(int i11, IntBuffer intBuffer);

    boolean Q1(int i11);

    void Q3(int i11, String[] strArr, int i12);

    void Q4(int i11, int i12, IntBuffer intBuffer, int i13, int i14, int i15, int i16);

    void R0(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void R1(int i11, int i12, IntBuffer intBuffer);

    String S3(int i11, int i12);

    void T1(int i11, int[] iArr, int i12);

    void T2(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void T4(int i11, IntBuffer intBuffer);

    void U1(int i11, int i12, IntBuffer intBuffer);

    void V0(int i11, int i12, IntBuffer intBuffer);

    void V1(int i11, int i12, int i13, int i14, int i15);

    void V3(int i11);

    void W0(int i11, int i12, IntBuffer intBuffer);

    void W1(int i11, int i12, IntBuffer intBuffer, int i13, IntBuffer intBuffer2);

    void W2(int i11, IntBuffer intBuffer);

    void W3(int i11, IntBuffer intBuffer);

    void X4(int i11, int[] iArr, int i12);

    void Y(int i11, int i12, FloatBuffer floatBuffer);

    void Y0(int i11, int i12, IntBuffer intBuffer);

    void Z(int i11, int i12, IntBuffer intBuffer);

    void Z2(int i11, int i12, int i13, int i14, int i15);

    @Override // com.badlogic.gdx.graphics.f
    @Deprecated
    void a(int i11, int i12, int i13, boolean z11, int i14, Buffer buffer);

    void b0(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

    void b1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, Buffer buffer);

    void b2(int i11, int[] iArr, int i12);

    void b4(int i11, int i12, int i13, int i14, int i15, Buffer buffer);

    void c3(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    Buffer c4(int i11, int i12, int i13, int i14);

    void c5(int i11, String[] strArr, IntBuffer intBuffer);

    void d3(int i11);

    void d4(int i11, LongBuffer longBuffer);

    void e0(int i11, int[] iArr, int i12);

    void e4(int i11, int[] iArr, int i12);

    void f5(int i11, int i12, int i13, int i14, int i15);

    void g2(int i11, int i12, IntBuffer intBuffer);

    void g4(int i11, int i12, int i13);

    void h3(int i11, int[] iArr, int i12);

    void h5(int i11, int i12, IntBuffer intBuffer);

    void i(int i11, int i12, FloatBuffer floatBuffer);

    int j(int i11, String str);

    void k0(int i11, int i12, LongBuffer longBuffer);

    void k2(int i11, int i12, int i13, IntBuffer intBuffer);

    void l1(int i11, IntBuffer intBuffer);

    void l2(int i11, IntBuffer intBuffer);

    void n1(int i11, int i12, int i13, int i14, int i15);

    void n4(int i11, int i12, int i13);

    Buffer o1(int i11, int i12);

    void o3(int i11, int i12, float f11);

    void r0(int i11, int i12, IntBuffer intBuffer);

    void r1(int i11, int i12, int i13);

    void r3(int i11, int i12);

    void t0(int i11, int i12, FloatBuffer floatBuffer);

    void u(int i11, int i12, IntBuffer intBuffer);

    void v4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22);

    void w4(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    boolean x(int i11);

    void y(int i11, IntBuffer intBuffer);

    boolean y0(int i11);

    void y1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

    void y4(int i11, int i12, IntBuffer intBuffer);

    void z(int i11, int i12, IntBuffer intBuffer);
}
