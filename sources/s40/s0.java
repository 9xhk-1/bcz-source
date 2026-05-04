package s40;

import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.format.AmPmMarker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s0 implements d0, j, y1, w40.c<s0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r0 f87764a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t0 f87765b;

    /* JADX WARN: Multi-variable type inference failed */
    public s0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // s40.y1
    @m80.l
    public t40.c A() {
        return this.f87765b.A();
    }

    @Override // s40.j
    @m80.l
    public Integer E() {
        return this.f87764a.E();
    }

    @Override // s40.j3
    public void F(@m80.l Integer num) {
        this.f87764a.F(num);
    }

    @Override // s40.y1
    public void H(@m80.l Integer num) {
        this.f87765b.H(num);
    }

    @Override // w40.c
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 copy() {
        return new s0(this.f87764a.copy(), this.f87765b.copy());
    }

    @Override // s40.j
    @m80.l
    public Integer c() {
        return this.f87764a.c();
    }

    @Override // s40.y1
    @m80.l
    public Integer d() {
        return this.f87765b.d();
    }

    @Override // s40.y1
    @m80.l
    public Integer e() {
        return this.f87765b.e();
    }

    @m80.k
    public final r0 f() {
        return this.f87764a;
    }

    @Override // s40.y1
    public void g(@m80.l Integer num) {
        this.f87765b.g(num);
    }

    @Override // s40.j3
    @m80.l
    public Integer getYear() {
        return this.f87764a.getYear();
    }

    @Override // s40.y1
    @m80.l
    public AmPmMarker h() {
        return this.f87765b.h();
    }

    @m80.k
    public final t0 i() {
        return this.f87765b;
    }

    @Override // s40.y1
    public void j(@m80.l Integer num) {
        this.f87765b.j(num);
    }

    @Override // s40.y1
    public void k(@m80.l Integer num) {
        this.f87765b.k(num);
    }

    @Override // s40.j
    @m80.l
    public Integer l() {
        return this.f87764a.l();
    }

    @Override // s40.j3
    @m80.l
    public Integer m() {
        return this.f87764a.m();
    }

    @Override // s40.y1
    @m80.l
    public Integer n() {
        return this.f87765b.n();
    }

    @Override // s40.y1
    public void o(@m80.l AmPmMarker amPmMarker) {
        this.f87765b.o(amPmMarker);
    }

    public final void p(@m80.k LocalDateTime dateTime) {
        kotlin.jvm.internal.g0.p(dateTime, "dateTime");
        this.f87764a.e(dateTime.getDate());
        this.f87765b.c(dateTime.getTime());
    }

    @Override // s40.y1
    public void q(@m80.l t40.c cVar) {
        this.f87765b.q(cVar);
    }

    @m80.k
    public final LocalDateTime r() {
        return new LocalDateTime(this.f87764a.f(), this.f87765b.f());
    }

    @Override // s40.j
    public void s(@m80.l Integer num) {
        this.f87764a.s(num);
    }

    @Override // s40.j
    public void t(@m80.l Integer num) {
        this.f87764a.t(num);
    }

    @Override // s40.y1
    @m80.l
    public Integer u() {
        return this.f87765b.u();
    }

    @Override // s40.j
    public void v(@m80.l Integer num) {
        this.f87764a.v(num);
    }

    @Override // s40.j3
    public void x(@m80.l Integer num) {
        this.f87764a.x(num);
    }

    @Override // s40.y1
    @m80.l
    public Integer y() {
        return this.f87765b.y();
    }

    @Override // s40.y1
    public void z(@m80.l Integer num) {
        this.f87765b.z(num);
    }

    public s0(@m80.k r0 date, @m80.k t0 time) {
        kotlin.jvm.internal.g0.p(date, "date");
        kotlin.jvm.internal.g0.p(time, "time");
        this.f87764a = date;
        this.f87765b = time;
    }

    public /* synthetic */ s0(r0 r0Var, t0 t0Var, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new r0(null, null, null, null, 15, null) : r0Var, (i11 & 2) != 0 ? new t0(null, null, null, null, null, null, 63, null) : t0Var);
    }
}
