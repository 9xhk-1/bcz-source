package s40;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r0 implements j3, j, w40.c<r0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v0 f87759a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Integer f87760b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Integer f87761c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public Integer f87762d;

    public r0() {
        this(null, null, null, null, 15, null);
    }

    @Override // s40.j
    @m80.l
    public Integer E() {
        return this.f87762d;
    }

    @Override // s40.j3
    public void F(@m80.l Integer num) {
        this.f87759a.F(num);
    }

    @Override // w40.c
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 copy() {
        return new r0(this.f87759a.copy(), l(), c(), E());
    }

    @Override // s40.j
    @m80.l
    public Integer c() {
        return this.f87761c;
    }

    @m80.k
    public final v0 d() {
        return this.f87759a;
    }

    public final void e(@m80.k LocalDate date) {
        kotlin.jvm.internal.g0.p(date, "date");
        F(Integer.valueOf(date.getYear()));
        x(Integer.valueOf(r40.j2.d(date.m6324getMonth())));
        s(Integer.valueOf(date.getDay()));
        t(Integer.valueOf(r40.o.d(date.m6323getDayOfWeek())));
        v(Integer.valueOf(date.getDayOfYear()));
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.g0.g(this.f87759a, r0Var.f87759a) && kotlin.jvm.internal.g0.g(l(), r0Var.l()) && kotlin.jvm.internal.g0.g(c(), r0Var.c()) && kotlin.jvm.internal.g0.g(E(), r0Var.E());
    }

    @m80.k
    public final LocalDate f() {
        LocalDate localDate;
        int intValue;
        int intValue2 = ((Number) o3.h(getYear(), n.r.f98259a)).intValue();
        Integer E = E();
        if (E == null) {
            localDate = new LocalDate(intValue2, ((Number) o3.h(m(), "monthNumber")).intValue(), ((Number) o3.h(l(), "day")).intValue());
        } else {
            LocalDate m11 = kotlinx.datetime.i.m(new LocalDate(intValue2, 1, 1), E.intValue() - 1, kotlinx.datetime.b.Companion.b());
            if (m11.getYear() != intValue2) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + E + ", which is not a valid day of year for the year " + intValue2);
            }
            if (m() != null) {
                int d11 = r40.j2.d(m11.m6324getMonth());
                Integer m12 = m();
                if (m12 == null || d11 != m12.intValue()) {
                    throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + E + ", which is " + m11.m6324getMonth() + ", but " + m() + " was specified as the month number");
                }
            }
            if (l() != null) {
                int day = m11.getDay();
                Integer l11 = l();
                if (l11 == null || day != l11.intValue()) {
                    throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + E + ", which is the day " + m11.getDay() + " of " + m11.m6324getMonth() + ", but " + l() + " was specified as the day of month");
                }
            }
            localDate = m11;
        }
        Integer c11 = c();
        if (c11 == null || (intValue = c11.intValue()) == r40.o.d(localDate.m6323getDayOfWeek())) {
            return localDate;
        }
        throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of week is " + r40.o.b(intValue) + " but the date is " + localDate + ", which is a " + localDate.m6323getDayOfWeek());
    }

    @Override // s40.j3
    @m80.l
    public Integer getYear() {
        return this.f87759a.getYear();
    }

    public int hashCode() {
        int hashCode = this.f87759a.hashCode() * 29791;
        Integer l11 = l();
        int hashCode2 = hashCode + ((l11 != null ? l11.hashCode() : 0) * 961);
        Integer c11 = c();
        int hashCode3 = hashCode2 + ((c11 != null ? c11.hashCode() : 0) * 31);
        Integer E = E();
        return hashCode3 + (E != null ? E.hashCode() : 0);
    }

    @Override // s40.j
    @m80.l
    public Integer l() {
        return this.f87760b;
    }

    @Override // s40.j3
    @m80.l
    public Integer m() {
        return this.f87759a.m();
    }

    @Override // s40.j
    public void s(@m80.l Integer num) {
        this.f87760b = num;
    }

    @Override // s40.j
    public void t(@m80.l Integer num) {
        this.f87761c = num;
    }

    @m80.k
    public String toString() {
        if (E() == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f87759a);
            sb2.append('-');
            Object l11 = l();
            if (l11 == null) {
                l11 = "??";
            }
            sb2.append(l11);
            sb2.append(" (day of week is ");
            Integer c11 = c();
            sb2.append(c11 != null ? c11 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        if (l() == null && m() == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('(');
            Object year = this.f87759a.getYear();
            if (year == null) {
                year = "??";
            }
            sb3.append(year);
            sb3.append(")-");
            sb3.append(E());
            sb3.append(" (day of week is ");
            Integer c12 = c();
            sb3.append(c12 != null ? c12 : "??");
            sb3.append(')');
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f87759a);
        sb4.append('-');
        Object l12 = l();
        if (l12 == null) {
            l12 = "??";
        }
        sb4.append(l12);
        sb4.append(" (day of week is ");
        Integer c13 = c();
        sb4.append(c13 != null ? c13 : "??");
        sb4.append(", day of year is ");
        sb4.append(E());
        sb4.append(')');
        return sb4.toString();
    }

    @Override // s40.j
    public void v(@m80.l Integer num) {
        this.f87762d = num;
    }

    @Override // s40.j3
    public void x(@m80.l Integer num) {
        this.f87759a.x(num);
    }

    public r0(@m80.k v0 yearMonth, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        kotlin.jvm.internal.g0.p(yearMonth, "yearMonth");
        this.f87759a = yearMonth;
        this.f87760b = num;
        this.f87761c = num2;
        this.f87762d = num3;
    }

    public /* synthetic */ r0(v0 v0Var, Integer num, Integer num2, Integer num3, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new v0(null, null, 3, null) : v0Var, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }
}
