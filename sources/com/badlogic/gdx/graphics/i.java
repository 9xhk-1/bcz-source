package com.badlogic.gdx.graphics;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface i extends h {
    public static final int Ae = 33346;
    public static final int Af = 35894;
    public static final int Ag = 36959;
    public static final int Ah = 37650;
    public static final int Be = 33347;
    public static final int Bf = 35895;
    public static final int Bg = 36967;
    public static final int Bh = 37655;
    public static final int Ce = 33348;
    public static final int Cf = 35975;
    public static final int Cg = 36970;
    public static final int Ch = 37761;
    public static final int De = 33349;
    public static final int Df = 36263;
    public static final int Dg = 37067;
    public static final int Dh = 37762;
    public static final int Ee = 33350;
    public static final int Ef = 36264;
    public static final int Eg = 37068;
    public static final int Eh = 37808;
    public static final int Fe = 33351;
    public static final int Ff = 36290;
    public static final int Fg = 37069;
    public static final int Fh = 37809;
    public static final int Ge = 33352;
    public static final int Gf = 36304;
    public static final int Gg = 37079;
    public static final int Gh = 37810;
    public static final int He = 33353;
    public static final int Hf = 36312;
    public static final int Hg = 37080;
    public static final int Hh = 37811;
    public static final int Ie = 33354;
    public static final int If = 36313;
    public static final int Ig = 37081;
    public static final int Ih = 37812;
    public static final int Je = 33355;
    public static final int Jf = 36319;
    public static final int Jg = 37122;
    public static final int Jh = 37813;
    public static final int Ke = 33356;
    public static final int Kf = 36320;
    public static final int Kg = 37125;
    public static final int Kh = 37814;
    public static final int Le = 33357;
    public static final int Lf = 36321;
    public static final int Lg = 37131;
    public static final int Lh = 37815;
    public static final int Me = 33358;
    public static final int Mf = 36382;
    public static final int Mg = 37132;
    public static final int Mh = 37816;
    public static final int Ne = 33359;
    public static final int Nf = 36383;
    public static final int Ng = 37133;
    public static final int Nh = 37817;
    public static final int Oe = 33360;
    public static final int Of = 36429;
    public static final int Og = 37155;
    public static final int Oh = 37818;
    public static final int Pe = 33361;
    public static final int Pf = 36430;
    public static final int Pg = 37156;
    public static final int Ph = 37819;
    public static final int Qe = 33362;
    public static final int Qf = 36442;
    public static final int Qg = 37187;
    public static final int Qh = 37820;
    public static final int Re = 33363;
    public static final int Rf = 36443;
    public static final int Rg = 37188;
    public static final int Rh = 37821;
    public static final int Se = 33364;
    public static final int Sf = 36444;
    public static final int Sg = 37189;
    public static final int Sh = 37840;
    public static final int Te = 33365;
    public static final int Tf = 36445;
    public static final int Tg = 37190;
    public static final int Th = 37841;
    public static final int Ue = 33366;
    public static final int Uf = 36466;
    public static final int Ug = 37191;
    public static final int Uh = 37842;
    public static final int Ve = 33374;
    public static final int Vf = 36469;
    public static final int Vg = 37192;
    public static final int Vh = 37843;
    public static final int We = 33376;
    public static final int Wf = 36470;
    public static final int Wg = 37277;
    public static final int Wh = 37844;
    public static final int Xe = 33377;
    public static final int Xf = 36471;
    public static final int Xg = 37278;
    public static final int Xh = 37845;
    public static final int Ye = 33384;
    public static final int Yf = 36472;
    public static final int Yg = 37279;
    public static final int Yh = 37846;
    public static final int Ze = 33385;
    public static final int Zf = 36473;
    public static final int Zg = 37524;
    public static final int Zh = 37847;

    /* renamed from: af, reason: collision with root package name */
    public static final int f12348af = 33386;

    /* renamed from: ag, reason: collision with root package name */
    public static final int f12349ag = 36474;

    /* renamed from: ah, reason: collision with root package name */
    public static final int f12350ah = 37525;

    /* renamed from: ai, reason: collision with root package name */
    public static final int f12351ai = 37848;

    /* renamed from: bf, reason: collision with root package name */
    public static final int f12352bf = 33387;

    /* renamed from: bg, reason: collision with root package name */
    public static final int f12353bg = 36475;

    /* renamed from: bh, reason: collision with root package name */
    public static final int f12354bh = 37526;

    /* renamed from: bi, reason: collision with root package name */
    public static final int f12355bi = 37849;

    /* renamed from: cf, reason: collision with root package name */
    public static final int f12356cf = 33388;

    /* renamed from: cg, reason: collision with root package name */
    public static final int f12357cg = 36476;

    /* renamed from: ch, reason: collision with root package name */
    public static final int f12358ch = 37527;

    /* renamed from: ci, reason: collision with root package name */
    public static final int f12359ci = 37850;

    /* renamed from: df, reason: collision with root package name */
    public static final int f12360df = 33389;

    /* renamed from: dg, reason: collision with root package name */
    public static final int f12361dg = 36477;

    /* renamed from: dh, reason: collision with root package name */
    public static final int f12362dh = 37528;

    /* renamed from: di, reason: collision with root package name */
    public static final int f12363di = 37851;

    /* renamed from: ef, reason: collision with root package name */
    public static final int f12364ef = 33504;

    /* renamed from: eg, reason: collision with root package name */
    public static final int f12365eg = 36478;

    /* renamed from: eh, reason: collision with root package name */
    public static final int f12366eh = 37529;

    /* renamed from: ei, reason: collision with root package name */
    public static final int f12367ei = 37852;

    /* renamed from: ff, reason: collision with root package name */
    public static final int f12368ff = 33505;

    /* renamed from: fg, reason: collision with root package name */
    public static final int f12369fg = 36479;

    /* renamed from: fh, reason: collision with root package name */
    public static final int f12370fh = 37530;

    /* renamed from: fi, reason: collision with root package name */
    public static final int f12371fi = 37853;

    /* renamed from: gf, reason: collision with root package name */
    public static final int f12372gf = 33506;

    /* renamed from: gg, reason: collision with root package name */
    public static final int f12373gg = 36480;

    /* renamed from: gh, reason: collision with root package name */
    public static final int f12374gh = 37531;

    /* renamed from: he, reason: collision with root package name */
    public static final int f12375he = 2;

    /* renamed from: hf, reason: collision with root package name */
    public static final int f12376hf = 33507;

    /* renamed from: hg, reason: collision with root package name */
    public static final int f12377hg = 36481;

    /* renamed from: hh, reason: collision with root package name */
    public static final int f12378hh = 37532;

    /* renamed from: ie, reason: collision with root package name */
    public static final int f12379ie = 4;

    /* renamed from: ig, reason: collision with root package name */
    public static final int f12380ig = 36482;

    /* renamed from: ih, reason: collision with root package name */
    public static final int f12381ih = 37534;

    /* renamed from: je, reason: collision with root package name */
    public static final int f12382je = 4;

    /* renamed from: jf, reason: collision with root package name */
    public static final int f12383jf = 33508;

    /* renamed from: jg, reason: collision with root package name */
    public static final int f12384jg = 36483;

    /* renamed from: jh, reason: collision with root package name */
    public static final int f12385jh = 37536;

    /* renamed from: ke, reason: collision with root package name */
    public static final int f12386ke = 8;

    /* renamed from: kf, reason: collision with root package name */
    public static final int f12387kf = 33510;

    /* renamed from: kg, reason: collision with root package name */
    public static final int f12388kg = 36484;

    /* renamed from: kh, reason: collision with root package name */
    public static final int f12389kh = 37549;

    /* renamed from: le, reason: collision with root package name */
    public static final int f12390le = 16;

    /* renamed from: lf, reason: collision with root package name */
    public static final int f12391lf = 33512;

    /* renamed from: lg, reason: collision with root package name */
    public static final int f12392lg = 36485;

    /* renamed from: lh, reason: collision with root package name */
    public static final int f12393lh = 37550;

    /* renamed from: me, reason: collision with root package name */
    public static final int f12394me = 7;

    /* renamed from: mf, reason: collision with root package name */
    public static final int f12395mf = 34924;

    /* renamed from: mg, reason: collision with root package name */
    public static final int f12396mg = 36486;

    /* renamed from: mh, reason: collision with root package name */
    public static final int f12397mh = 37551;

    /* renamed from: ne, reason: collision with root package name */
    public static final int f12398ne = 10;

    /* renamed from: nf, reason: collision with root package name */
    public static final int f12399nf = 34925;

    /* renamed from: ng, reason: collision with root package name */
    public static final int f12400ng = 36487;

    /* renamed from: nh, reason: collision with root package name */
    public static final int f12401nh = 37552;

    /* renamed from: oe, reason: collision with root package name */
    public static final int f12402oe = 11;

    /* renamed from: of, reason: collision with root package name */
    public static final int f12403of = 34943;

    /* renamed from: og, reason: collision with root package name */
    public static final int f12404og = 36488;

    /* renamed from: oh, reason: collision with root package name */
    public static final int f12405oh = 37566;

    /* renamed from: pe, reason: collision with root package name */
    public static final int f12406pe = 12;

    /* renamed from: pf, reason: collision with root package name */
    public static final int f12407pf = 35094;

    /* renamed from: pg, reason: collision with root package name */
    public static final int f12408pg = 36489;

    /* renamed from: ph, reason: collision with root package name */
    public static final int f12409ph = 37581;

    /* renamed from: qe, reason: collision with root package name */
    public static final int f12410qe = 13;

    /* renamed from: qf, reason: collision with root package name */
    public static final int f12411qf = 35095;

    /* renamed from: qg, reason: collision with root package name */
    public static final int f12412qg = 36490;

    /* renamed from: qh, reason: collision with root package name */
    public static final int f12413qh = 37582;

    /* renamed from: re, reason: collision with root package name */
    public static final int f12414re = 14;

    /* renamed from: rf, reason: collision with root package name */
    public static final int f12415rf = 35096;

    /* renamed from: rg, reason: collision with root package name */
    public static final int f12416rg = 36873;

    /* renamed from: rh, reason: collision with root package name */
    public static final int f12417rh = 37583;

    /* renamed from: se, reason: collision with root package name */
    public static final int f12418se = 1283;

    /* renamed from: sf, reason: collision with root package name */
    public static final int f12419sf = 35372;

    /* renamed from: sg, reason: collision with root package name */
    public static final int f12420sg = 36874;

    /* renamed from: sh, reason: collision with root package name */
    public static final int f12421sh = 37587;

    /* renamed from: te, reason: collision with root package name */
    public static final int f12422te = 1284;

    /* renamed from: tf, reason: collision with root package name */
    public static final int f12423tf = 35378;

    /* renamed from: tg, reason: collision with root package name */
    public static final int f12424tg = 36876;

    /* renamed from: th, reason: collision with root package name */
    public static final int f12425th = 37588;

    /* renamed from: ue, reason: collision with root package name */
    public static final int f12426ue = 1287;

    /* renamed from: uf, reason: collision with root package name */
    public static final int f12427uf = 35881;

    /* renamed from: ug, reason: collision with root package name */
    public static final int f12428ug = 36877;

    /* renamed from: uh, reason: collision with root package name */
    public static final int f12429uh = 37589;

    /* renamed from: ve, reason: collision with root package name */
    public static final int f12430ve = 4100;

    /* renamed from: vf, reason: collision with root package name */
    public static final int f12431vf = 35882;

    /* renamed from: vg, reason: collision with root package name */
    public static final int f12432vg = 36878;

    /* renamed from: vh, reason: collision with root package name */
    public static final int f12433vh = 37600;

    /* renamed from: we, reason: collision with root package name */
    public static final int f12434we = 32884;

    /* renamed from: wf, reason: collision with root package name */
    public static final int f12435wf = 35882;

    /* renamed from: wg, reason: collision with root package name */
    public static final int f12436wg = 36879;

    /* renamed from: wh, reason: collision with root package name */
    public static final int f12437wh = 37607;

    /* renamed from: xe, reason: collision with root package name */
    public static final int f12438xe = 33069;

    /* renamed from: xf, reason: collision with root package name */
    public static final int f12439xf = 35883;

    /* renamed from: xg, reason: collision with root package name */
    public static final int f12440xg = 36945;

    /* renamed from: xh, reason: collision with root package name */
    public static final int f12441xh = 37639;

    /* renamed from: ye, reason: collision with root package name */
    public static final int f12442ye = 33310;

    /* renamed from: yf, reason: collision with root package name */
    public static final int f12443yf = 35884;

    /* renamed from: yg, reason: collision with root package name */
    public static final int f12444yg = 36948;

    /* renamed from: yh, reason: collision with root package name */
    public static final int f12445yh = 37640;

    /* renamed from: ze, reason: collision with root package name */
    public static final int f12446ze = 33313;

    /* renamed from: zf, reason: collision with root package name */
    public static final int f12447zf = 35885;

    /* renamed from: zg, reason: collision with root package name */
    public static final int f12448zg = 36956;

    /* renamed from: zh, reason: collision with root package name */
    public static final int f12449zh = 37641;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(int i11, int i12, int i13, int i14, String str);
    }

    void A3(int i11, int i12, FloatBuffer floatBuffer);

    void A4(int i11, int i12, int i13);

    void B(int i11, int i12);

    void B2(int i11, int i12, int i13, int i14, int i15);

    void C1(int i11, int i12, int i13, int i14);

    void C3();

    void D3(int i11, int i12, int i13, Buffer buffer, int i14);

    void I(int i11, int i12, int i13, IntBuffer intBuffer, boolean z11);

    void K1(int i11, int i12, IntBuffer intBuffer);

    void L4(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11);

    void N0(int i11, int i12, IntBuffer intBuffer);

    void N2(int i11, int i12, int i13, int i14, String str);

    void O1(int i11, int i12);

    void O4(int i11, int i12, IntBuffer intBuffer);

    void P(int i11, int i12, int i13, int i14, int i15, int i16, int i17, Buffer buffer);

    void P2(int i11, int i12, int i13);

    void T(float f11);

    void U(int i11, int i12, IntBuffer intBuffer);

    void V2(int i11, int i12, String str);

    String W4(int i11, int i12);

    void Y1(int i11, int i12, IntBuffer intBuffer);

    void Y3(int i11, int i12, IntBuffer intBuffer);

    void Z1(int i11, int i12, int i13, Buffer buffer, int i14, int i15);

    void a3(int i11, int i12, String str);

    void g(int i11, int i12, IntBuffer intBuffer);

    long g0(int i11);

    void g1(int i11, int i12, IntBuffer intBuffer);

    void h0();

    void h1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26);

    void h4(int i11, int i12, IntBuffer intBuffer);

    void i0(int i11, boolean z11, boolean z12, boolean z13, boolean z14);

    void k1(int i11, int i12, int i13);

    void l5(int i11, int i12);

    int p2(int i11, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, IntBuffer intBuffer4, IntBuffer intBuffer5, ByteBuffer byteBuffer);

    void p3(int i11, int i12, int i13, int i14, int i15);

    void q1(int i11, int i12, int i13, int i14, int i15, int i16);

    int r();

    void s0(int i11, int i12, IntBuffer intBuffer);

    void u4(int i11, int i12);

    boolean v1(int i11, int i12);

    void w1(int i11, int i12, int i13, int i14, int i15, Buffer buffer, int i16);

    void y2(a aVar);
}
