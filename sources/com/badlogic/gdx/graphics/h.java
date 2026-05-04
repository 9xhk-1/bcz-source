package com.badlogic.gdx.graphics;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface h extends g {
    public static final int Ab = 33390;
    public static final int Ac = 37065;
    public static final int Ad = 37604;
    public static final int Bb = 33492;
    public static final int Bc = 37066;
    public static final int Bd = 37605;
    public static final int Cb = 33493;
    public static final int Cc = 37070;
    public static final int Cd = 37606;
    public static final int Db = 33494;
    public static final int Dc = 37071;
    public static final int Dd = 37620;
    public static final int Eb = 33495;
    public static final int Ec = 37074;
    public static final int Ed = 37621;
    public static final int Fb = 33496;
    public static final int Fc = 37075;
    public static final int Fd = 37622;
    public static final int Gb = 33497;
    public static final int Gc = 37076;
    public static final int Gd = 37623;
    public static final int Hb = 33498;
    public static final int Hc = 37077;
    public static final int Hd = 37625;
    public static final int Ib = 33509;
    public static final int Ic = 37078;
    public static final int Id = 37626;
    public static final int Jb = 34465;
    public static final int Jc = 37082;
    public static final int Jd = 37627;
    public static final int Kb = 34890;
    public static final int Kc = 37083;
    public static final int Kd = 37628;
    public static final int Lb = 35000;
    public static final int Lc = 37084;
    public static final int Ld = 37629;
    public static final int Mb = 35001;
    public static final int Mc = 37085;
    public static final int Md = 37630;
    public static final int Nb = 35002;
    public static final int Nc = 37086;
    public static final int Nd = 37631;
    public static final int Ob = 35057;
    public static final int Oc = 37087;
    public static final int Od = 37632;
    public static final int Pb = 35856;
    public static final int Pc = 37098;
    public static final int Pd = 37633;
    public static final int Qa = 1;
    public static final int Qb = 35857;
    public static final int Qc = 37099;
    public static final int Qd = 37634;
    public static final int Ra = 2;
    public static final int Rb = 35858;
    public static final int Rc = 37102;
    public static final int Rd = 37635;
    public static final int Sa = 32;
    public static final int Sb = 35859;
    public static final int Sc = 37103;
    public static final int Sd = 37636;
    public static final int Ta = -1;
    public static final int Tb = 35862;
    public static final int Tc = 37120;
    public static final int Td = 37637;
    public static final int Ua = 1;
    public static final int Ub = 35903;
    public static final int Uc = 37124;
    public static final int Ud = 37638;
    public static final int Va = 2;
    public static final int Vb = 36432;
    public static final int Vc = 37126;
    public static final int Vd = 37642;
    public static final int Wa = 4;
    public static final int Wb = 36433;
    public static final int Wc = 37127;
    public static final int Wd = 37643;
    public static final int Xa = 8;
    public static final int Xb = 36434;
    public static final int Xc = 37128;
    public static final int Xd = 37644;
    public static final int Ya = 32;
    public static final int Yb = 36441;
    public static final int Yc = 37129;
    public static final int Yd = 37645;
    public static final int Za = 64;
    public static final int Zb = 36446;
    public static final int Zc = 37130;
    public static final int Zd = 37646;

    /* renamed from: ab, reason: collision with root package name */
    public static final int f12263ab = 128;

    /* renamed from: ac, reason: collision with root package name */
    public static final int f12264ac = 36447;

    /* renamed from: ad, reason: collision with root package name */
    public static final int f12265ad = 37134;

    /* renamed from: ae, reason: collision with root package name */
    public static final int f12266ae = 37648;

    /* renamed from: bb, reason: collision with root package name */
    public static final int f12267bb = 256;

    /* renamed from: bc, reason: collision with root package name */
    public static final int f12268bc = 36664;

    /* renamed from: bd, reason: collision with root package name */
    public static final int f12269bd = 37135;

    /* renamed from: be, reason: collision with root package name */
    public static final int f12270be = 37649;

    /* renamed from: cb, reason: collision with root package name */
    public static final int f12271cb = 512;

    /* renamed from: cc, reason: collision with root package name */
    public static final int f12272cc = 36665;

    /* renamed from: cd, reason: collision with root package name */
    public static final int f12273cd = 37136;

    /* renamed from: ce, reason: collision with root package name */
    public static final int f12274ce = 37651;

    /* renamed from: db, reason: collision with root package name */
    public static final int f12275db = 1024;

    /* renamed from: dc, reason: collision with root package name */
    public static final int f12276dc = 36666;

    /* renamed from: dd, reason: collision with root package name */
    public static final int f12277dd = 37305;

    /* renamed from: de, reason: collision with root package name */
    public static final int f12278de = 37652;

    /* renamed from: eb, reason: collision with root package name */
    public static final int f12279eb = 2048;

    /* renamed from: ec, reason: collision with root package name */
    public static final int f12280ec = 36667;

    /* renamed from: ed, reason: collision with root package name */
    public static final int f12281ed = 37307;

    /* renamed from: ee, reason: collision with root package name */
    public static final int f12282ee = 37653;

    /* renamed from: fb, reason: collision with root package name */
    public static final int f12283fb = 4096;

    /* renamed from: fc, reason: collision with root package name */
    public static final int f12284fc = 36668;

    /* renamed from: fd, reason: collision with root package name */
    public static final int f12285fd = 37308;

    /* renamed from: fe, reason: collision with root package name */
    public static final int f12286fe = 37654;

    /* renamed from: gb, reason: collision with root package name */
    public static final int f12287gb = 8192;

    /* renamed from: gc, reason: collision with root package name */
    public static final int f12288gc = 36669;

    /* renamed from: gd, reason: collision with root package name */
    public static final int f12289gd = 37309;

    /* renamed from: ge, reason: collision with root package name */
    public static final int f12290ge = 37656;

    /* renamed from: hb, reason: collision with root package name */
    public static final int f12291hb = -1;

    /* renamed from: hc, reason: collision with root package name */
    public static final int f12292hc = 36670;

    /* renamed from: hd, reason: collision with root package name */
    public static final int f12293hd = 37310;

    /* renamed from: ib, reason: collision with root package name */
    public static final int f12294ib = 4096;

    /* renamed from: ic, reason: collision with root package name */
    public static final int f12295ic = 36671;

    /* renamed from: id, reason: collision with root package name */
    public static final int f12296id = 37311;

    /* renamed from: jb, reason: collision with root package name */
    public static final int f12297jb = 4097;

    /* renamed from: jc, reason: collision with root package name */
    public static final int f12298jc = 36675;

    /* renamed from: jd, reason: collision with root package name */
    public static final int f12299jd = 37568;

    /* renamed from: kb, reason: collision with root package name */
    public static final int f12300kb = 4099;

    /* renamed from: kc, reason: collision with root package name */
    public static final int f12301kc = 36687;

    /* renamed from: kd, reason: collision with root package name */
    public static final int f12302kd = 37569;

    /* renamed from: lb, reason: collision with root package name */
    public static final int f12303lb = 6401;

    /* renamed from: lc, reason: collision with root package name */
    public static final int f12304lc = 36941;

    /* renamed from: ld, reason: collision with root package name */
    public static final int f12305ld = 37570;

    /* renamed from: mb, reason: collision with root package name */
    public static final int f12306mb = 32860;

    /* renamed from: mc, reason: collision with root package name */
    public static final int f12307mc = 36942;

    /* renamed from: md, reason: collision with root package name */
    public static final int f12308md = 37571;

    /* renamed from: nb, reason: collision with root package name */
    public static final int f12309nb = 32861;

    /* renamed from: nc, reason: collision with root package name */
    public static final int f12310nc = 36944;

    /* renamed from: nd, reason: collision with root package name */
    public static final int f12311nd = 37580;

    /* renamed from: ob, reason: collision with root package name */
    public static final int f12312ob = 32862;

    /* renamed from: oc, reason: collision with root package name */
    public static final int f12313oc = 36947;

    /* renamed from: od, reason: collision with root package name */
    public static final int f12314od = 37584;

    /* renamed from: pb, reason: collision with root package name */
    public static final int f12315pb = 32863;

    /* renamed from: pc, reason: collision with root package name */
    public static final int f12316pc = 36952;

    /* renamed from: pd, reason: collision with root package name */
    public static final int f12317pd = 37585;

    /* renamed from: qb, reason: collision with root package name */
    public static final int f12318qb = 32881;

    /* renamed from: qc, reason: collision with root package name */
    public static final int f12319qc = 36953;

    /* renamed from: qd, reason: collision with root package name */
    public static final int f12320qd = 37586;

    /* renamed from: rb, reason: collision with root package name */
    public static final int f12321rb = 33368;

    /* renamed from: rc, reason: collision with root package name */
    public static final int f12322rc = 36955;

    /* renamed from: rd, reason: collision with root package name */
    public static final int f12323rd = 37590;

    /* renamed from: sb, reason: collision with root package name */
    public static final int f12324sb = 33369;

    /* renamed from: sc, reason: collision with root package name */
    public static final int f12325sc = 36958;

    /* renamed from: sd, reason: collision with root package name */
    public static final int f12326sd = 37591;

    /* renamed from: tb, reason: collision with root package name */
    public static final int f12327tb = 33370;

    /* renamed from: tc, reason: collision with root package name */
    public static final int f12328tc = 36963;

    /* renamed from: td, reason: collision with root package name */
    public static final int f12329td = 37592;

    /* renamed from: ub, reason: collision with root package name */
    public static final int f12330ub = 33378;

    /* renamed from: uc, reason: collision with root package name */
    public static final int f12331uc = 36964;

    /* renamed from: ud, reason: collision with root package name */
    public static final int f12332ud = 37593;

    /* renamed from: vb, reason: collision with root package name */
    public static final int f12333vb = 33379;

    /* renamed from: vc, reason: collision with root package name */
    public static final int f12334vc = 36966;

    /* renamed from: vd, reason: collision with root package name */
    public static final int f12335vd = 37595;

    /* renamed from: wb, reason: collision with root package name */
    public static final int f12336wb = 33380;

    /* renamed from: wc, reason: collision with root package name */
    public static final int f12337wc = 36969;

    /* renamed from: wd, reason: collision with root package name */
    public static final int f12338wd = 37596;

    /* renamed from: xb, reason: collision with root package name */
    public static final int f12339xb = 33381;

    /* renamed from: xc, reason: collision with root package name */
    public static final int f12340xc = 36974;

    /* renamed from: xd, reason: collision with root package name */
    public static final int f12341xd = 37601;

    /* renamed from: yb, reason: collision with root package name */
    public static final int f12342yb = 33382;

    /* renamed from: yc, reason: collision with root package name */
    public static final int f12343yc = 37063;

    /* renamed from: yd, reason: collision with root package name */
    public static final int f12344yd = 37602;

    /* renamed from: zb, reason: collision with root package name */
    public static final int f12345zb = 33383;

    /* renamed from: zc, reason: collision with root package name */
    public static final int f12346zc = 37064;

    /* renamed from: zd, reason: collision with root package name */
    public static final int f12347zd = 37603;

    void B0(int i11, int i12, int i13, FloatBuffer floatBuffer);

    void B1(int i11, int i12, FloatBuffer floatBuffer);

    void C4(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    boolean E(int i11);

    void E0(int i11, int i12, int i13, int i14, int i15, int i16);

    void G0(int i11, int i12, IntBuffer intBuffer);

    void G2(int i11, int i12, IntBuffer intBuffer);

    void H0(int i11, int i12, int i13);

    void H2(int i11, int i12, int i13, int i14);

    void H3(int i11, int i12);

    void I3(int i11, int i12, int i13, int i14, int i15, boolean z11);

    void J1(int i11, int i12, IntBuffer intBuffer);

    void K2(int i11, int i12, float f11, float f12);

    void L3(int i11, int i12);

    void M4(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void N1(int i11);

    void P3(int i11);

    void Q(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void R2(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void R3(int i11, int i12, int i13, int i14);

    void R4(long j11);

    void S2(int i11, int i12, IntBuffer intBuffer);

    void T3(int i11, int i12, FloatBuffer floatBuffer);

    void U0(int i11, int i12, int i13, boolean z11, int i14);

    void W(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void X(int i11, int i12, IntBuffer intBuffer);

    void Z4(int i11, int i12, float f11, float f12, float f13, float f14);

    void a0(int i11, IntBuffer intBuffer);

    void a2(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    int b(int i11, int i12, String str);

    void b3(int i11, int i12, int i13);

    void c(int i11, int i12, int i13, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3);

    void d(int i11, int i12, IntBuffer intBuffer);

    void d5(int i11, int i12, IntBuffer intBuffer);

    void e3(int i11, int i12, IntBuffer intBuffer);

    void f(int i11, int i12, IntBuffer intBuffer);

    void f2(int i11, int i12, long j11, int i13);

    void f4(int i11, int i12);

    void i2(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void j0(int i11, int i12, IntBuffer intBuffer);

    void j1(int i11, int i12, IntBuffer intBuffer);

    void j2(int i11, int i12, float f11);

    int k4(int i11, int i12, String str);

    String l(int i11, int i12, int i13);

    void l0(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void m(int i11, int i12, float f11, float f12, float f13);

    void m4(int i11, int i12, int i13);

    void o(int i11, int i12, int i13);

    void o2(int i11, int i12, int i13, IntBuffer intBuffer);

    void p1(int i11, int i12);

    void p4(int i11, int i12, int i13);

    void q(int i11, int i12, FloatBuffer floatBuffer);

    void q4(int i11, int i12, boolean z11, FloatBuffer floatBuffer);

    void t2(int i11);

    void t4(int i11);

    void u1(int i11, int i12, int i13, boolean z11, int i14, int i15, int i16);

    void u2(int i11, int i12, int i13, int i14, int i15, int i16);

    void v(int i11, int i12, FloatBuffer floatBuffer);

    void v0(int i11, int i12, int i13, int i14, int i15);

    void v2(int i11, int i12, long j11);

    int v3(int i11, String[] strArr);

    void w(int i11, int i12, int i13, int i14, int i15);

    void w2(int i11, int i12, int i13, IntBuffer intBuffer);

    void x2(int i11, IntBuffer intBuffer);

    void x3(int i11, long j11);

    String y3(int i11);

    void z3(int i11, int i12, FloatBuffer floatBuffer);

    void z4(int i11, int i12, int i13, int i14);
}
