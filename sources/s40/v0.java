package s40;

import kotlinx.datetime.YearMonth;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v0 implements j3, w40.c<v0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Integer f87796a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Integer f87797b;

    /* JADX WARN: Multi-variable type inference failed */
    public v0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // s40.j3
    public void F(@m80.l Integer num) {
        this.f87796a = num;
    }

    @Override // w40.c
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 copy() {
        return new v0(getYear(), m());
    }

    public final void d(@m80.k YearMonth yearMonth) {
        kotlin.jvm.internal.g0.p(yearMonth, "yearMonth");
        F(Integer.valueOf(yearMonth.getYear()));
        x(Integer.valueOf(r40.j2.d(yearMonth.getMonth())));
    }

    @m80.k
    public final YearMonth e() {
        return new YearMonth(((Number) o3.h(getYear(), n.r.f98259a)).intValue(), ((Number) o3.h(m(), "monthNumber")).intValue());
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.g0.g(getYear(), v0Var.getYear()) && kotlin.jvm.internal.g0.g(m(), v0Var.m());
    }

    @Override // s40.j3
    @m80.l
    public Integer getYear() {
        return this.f87796a;
    }

    public int hashCode() {
        Integer year = getYear();
        int hashCode = (year != null ? year.hashCode() : 0) * 31;
        Integer m11 = m();
        return hashCode + (m11 != null ? m11.hashCode() : 0);
    }

    @Override // s40.j3
    @m80.l
    public Integer m() {
        return this.f87797b;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Object year = getYear();
        if (year == null) {
            year = "??";
        }
        sb2.append(year);
        sb2.append('-');
        Integer m11 = m();
        sb2.append(m11 != null ? m11 : "??");
        return sb2.toString();
    }

    @Override // s40.j3
    public void x(@m80.l Integer num) {
        this.f87797b = num;
    }

    public v0(@m80.l Integer num, @m80.l Integer num2) {
        this.f87796a = num;
        this.f87797b = num2;
    }

    public /* synthetic */ v0(Integer num, Integer num2, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
    }
}
