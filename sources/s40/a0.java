package s40;

import kotlinx.datetime.format.AmPmMarker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 implements j, y1, h2, d0, w40.c<a0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r0 f87569a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t0 f87570b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final u0 f87571c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public String f87572d;

    public a0() {
        this(null, null, null, null, 15, null);
    }

    @Override // s40.y1
    @m80.l
    public t40.c A() {
        return this.f87570b.A();
    }

    @Override // s40.h2
    public void B(@m80.l Boolean bool) {
        this.f87571c.B(bool);
    }

    @Override // s40.j
    @m80.l
    public Integer E() {
        return this.f87569a.E();
    }

    @Override // s40.j3
    public void F(@m80.l Integer num) {
        this.f87569a.F(num);
    }

    @Override // s40.h2
    @m80.l
    public Integer G() {
        return this.f87571c.G();
    }

    @Override // s40.y1
    public void H(@m80.l Integer num) {
        this.f87570b.H(num);
    }

    @Override // s40.h2
    @m80.l
    public Boolean I() {
        return this.f87571c.I();
    }

    @Override // w40.c
    @m80.k
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public a0 copy() {
        return new a0(this.f87569a.copy(), this.f87570b.copy(), this.f87571c.copy(), this.f87572d);
    }

    @m80.k
    public final r0 K() {
        return this.f87569a;
    }

    @m80.k
    public final u0 L() {
        return this.f87571c;
    }

    @m80.k
    public final t0 M() {
        return this.f87570b;
    }

    @m80.l
    public final String N() {
        return this.f87572d;
    }

    public final void O(@m80.l String str) {
        this.f87572d = str;
    }

    @Override // s40.h2
    public void b(@m80.l Integer num) {
        this.f87571c.b(num);
    }

    @Override // s40.j
    @m80.l
    public Integer c() {
        return this.f87569a.c();
    }

    @Override // s40.y1
    @m80.l
    public Integer d() {
        return this.f87570b.d();
    }

    @Override // s40.y1
    @m80.l
    public Integer e() {
        return this.f87570b.e();
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.g0.g(a0Var.f87569a, this.f87569a) && kotlin.jvm.internal.g0.g(a0Var.f87570b, this.f87570b) && kotlin.jvm.internal.g0.g(a0Var.f87571c, this.f87571c) && kotlin.jvm.internal.g0.g(a0Var.f87572d, this.f87572d);
    }

    @Override // s40.h2
    @m80.l
    public Integer f() {
        return this.f87571c.f();
    }

    @Override // s40.y1
    public void g(@m80.l Integer num) {
        this.f87570b.g(num);
    }

    @Override // s40.j3
    @m80.l
    public Integer getYear() {
        return this.f87569a.getYear();
    }

    @Override // s40.y1
    @m80.l
    public AmPmMarker h() {
        return this.f87570b.h();
    }

    public int hashCode() {
        int hashCode = (this.f87569a.hashCode() ^ this.f87570b.hashCode()) ^ this.f87571c.hashCode();
        String str = this.f87572d;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // s40.h2
    public void i(@m80.l Integer num) {
        this.f87571c.i(num);
    }

    @Override // s40.y1
    public void j(@m80.l Integer num) {
        this.f87570b.j(num);
    }

    @Override // s40.y1
    public void k(@m80.l Integer num) {
        this.f87570b.k(num);
    }

    @Override // s40.j
    @m80.l
    public Integer l() {
        return this.f87569a.l();
    }

    @Override // s40.j3
    @m80.l
    public Integer m() {
        return this.f87569a.m();
    }

    @Override // s40.y1
    @m80.l
    public Integer n() {
        return this.f87570b.n();
    }

    @Override // s40.y1
    public void o(@m80.l AmPmMarker amPmMarker) {
        this.f87570b.o(amPmMarker);
    }

    @Override // s40.h2
    @m80.l
    public Integer p() {
        return this.f87571c.p();
    }

    @Override // s40.y1
    public void q(@m80.l t40.c cVar) {
        this.f87570b.q(cVar);
    }

    @Override // s40.h2
    public void r(@m80.l Integer num) {
        this.f87571c.r(num);
    }

    @Override // s40.j
    public void s(@m80.l Integer num) {
        this.f87569a.s(num);
    }

    @Override // s40.j
    public void t(@m80.l Integer num) {
        this.f87569a.t(num);
    }

    @Override // s40.y1
    @m80.l
    public Integer u() {
        return this.f87570b.u();
    }

    @Override // s40.j
    public void v(@m80.l Integer num) {
        this.f87569a.v(num);
    }

    @Override // s40.j3
    public void x(@m80.l Integer num) {
        this.f87569a.x(num);
    }

    @Override // s40.y1
    @m80.l
    public Integer y() {
        return this.f87570b.y();
    }

    @Override // s40.y1
    public void z(@m80.l Integer num) {
        this.f87570b.z(num);
    }

    public a0(@m80.k r0 date, @m80.k t0 time, @m80.k u0 offset, @m80.l String str) {
        kotlin.jvm.internal.g0.p(date, "date");
        kotlin.jvm.internal.g0.p(time, "time");
        kotlin.jvm.internal.g0.p(offset, "offset");
        this.f87569a = date;
        this.f87570b = time;
        this.f87571c = offset;
        this.f87572d = str;
    }

    public /* synthetic */ a0(r0 r0Var, t0 t0Var, u0 u0Var, String str, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new r0(null, null, null, null, 15, null) : r0Var, (i11 & 2) != 0 ? new t0(null, null, null, null, null, null, 63, null) : t0Var, (i11 & 4) != 0 ? new u0(null, null, null, null, 15, null) : u0Var, (i11 & 8) != 0 ? null : str);
    }
}
