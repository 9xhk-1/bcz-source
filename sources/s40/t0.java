package s40;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.AmPmMarker;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalTimeFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalTimeFormat.kt\nkotlinx/datetime/format/IncompleteLocalTime\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: classes8.dex */
public final class t0 implements y1, w40.c<t0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Integer f87774a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Integer f87775b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public AmPmMarker f87776c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public Integer f87777d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public Integer f87778e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public Integer f87779f;

    public t0() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // s40.y1
    public void H(@m80.l Integer num) {
        this.f87774a = num;
    }

    @Override // w40.c
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 copy() {
        return new t0(n(), e(), h(), y(), u(), d());
    }

    public final void c(@m80.k LocalTime localTime) {
        kotlin.jvm.internal.g0.p(localTime, "localTime");
        H(Integer.valueOf(localTime.getHour()));
        j(Integer.valueOf(((localTime.getHour() + 11) % 12) + 1));
        o(localTime.getHour() >= 12 ? AmPmMarker.PM : AmPmMarker.AM);
        z(Integer.valueOf(localTime.getMinute()));
        g(Integer.valueOf(localTime.getSecond()));
        k(Integer.valueOf(localTime.getNanosecond()));
    }

    @Override // s40.y1
    @m80.l
    public Integer d() {
        return this.f87779f;
    }

    @Override // s40.y1
    @m80.l
    public Integer e() {
        return this.f87775b;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.g0.g(n(), t0Var.n()) && kotlin.jvm.internal.g0.g(e(), t0Var.e()) && h() == t0Var.h() && kotlin.jvm.internal.g0.g(y(), t0Var.y()) && kotlin.jvm.internal.g0.g(u(), t0Var.u()) && kotlin.jvm.internal.g0.g(d(), t0Var.d());
    }

    @m80.k
    public final LocalTime f() {
        int intValue;
        int intValue2;
        Integer n11 = n();
        if (n11 != null) {
            intValue = n11.intValue();
            Integer e11 = e();
            if (e11 != null && ((intValue + 11) % 12) + 1 != (intValue2 = e11.intValue())) {
                throw new IllegalArgumentException(("Inconsistent hour and hour-of-am-pm: hour is " + intValue + ", but hour-of-am-pm is " + intValue2).toString());
            }
            AmPmMarker h11 = h();
            if (h11 != null) {
                if ((h11 == AmPmMarker.PM) != (intValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + intValue + ", but the AM/PM marker is " + h11).toString());
                }
            }
        } else {
            Integer e12 = e();
            Integer num = null;
            if (e12 != null) {
                int intValue3 = e12.intValue();
                AmPmMarker h12 = h();
                if (h12 != null) {
                    if (intValue3 == 12) {
                        intValue3 = 0;
                    }
                    num = Integer.valueOf(intValue3 + (h12 != AmPmMarker.PM ? 0 : 12));
                }
            }
            if (num == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            intValue = num.intValue();
        }
        int intValue4 = ((Number) o3.h(y(), n.r.f98263e)).intValue();
        Integer u11 = u();
        int intValue5 = u11 != null ? u11.intValue() : 0;
        Integer d11 = d();
        return new LocalTime(intValue, intValue4, intValue5, d11 != null ? d11.intValue() : 0);
    }

    @Override // s40.y1
    public void g(@m80.l Integer num) {
        this.f87778e = num;
    }

    @Override // s40.y1
    @m80.l
    public AmPmMarker h() {
        return this.f87776c;
    }

    public int hashCode() {
        Integer n11 = n();
        int intValue = (n11 != null ? n11.intValue() : 0) * 31;
        Integer e11 = e();
        int intValue2 = intValue + ((e11 != null ? e11.intValue() : 0) * 31);
        AmPmMarker h11 = h();
        int hashCode = intValue2 + ((h11 != null ? h11.hashCode() : 0) * 31);
        Integer y11 = y();
        int intValue3 = hashCode + ((y11 != null ? y11.intValue() : 0) * 31);
        Integer u11 = u();
        int intValue4 = intValue3 + ((u11 != null ? u11.intValue() : 0) * 31);
        Integer d11 = d();
        return intValue4 + (d11 != null ? d11.intValue() : 0);
    }

    @Override // s40.y1
    public void j(@m80.l Integer num) {
        this.f87775b = num;
    }

    @Override // s40.y1
    public void k(@m80.l Integer num) {
        this.f87779f = num;
    }

    @Override // s40.y1
    @m80.l
    public Integer n() {
        return this.f87774a;
    }

    @Override // s40.y1
    public void o(@m80.l AmPmMarker amPmMarker) {
        this.f87776c = amPmMarker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r1 == null) goto L16;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r4.n()
            java.lang.String r2 = "??"
            if (r1 != 0) goto Le
            r1 = r2
        Le:
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.Integer r3 = r4.y()
            if (r3 != 0) goto L1d
            r3 = r2
        L1d:
            r0.append(r3)
            r0.append(r1)
            java.lang.Integer r1 = r4.u()
            if (r1 != 0) goto L2a
            goto L2b
        L2a:
            r2 = r1
        L2b:
            r0.append(r2)
            r1 = 46
            r0.append(r1)
            java.lang.Integer r1 = r4.d()
            if (r1 == 0) goto L4f
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = 9 - r2
            r3 = 48
            java.lang.String r1 = u30.k0.m4(r1, r2, r3)
            if (r1 != 0) goto L51
        L4f:
            java.lang.String r1 = "???"
        L51:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s40.t0.toString():java.lang.String");
    }

    @Override // s40.y1
    @m80.l
    public Integer u() {
        return this.f87778e;
    }

    @Override // s40.y1
    @m80.l
    public Integer y() {
        return this.f87777d;
    }

    @Override // s40.y1
    public void z(@m80.l Integer num) {
        this.f87777d = num;
    }

    public t0(@m80.l Integer num, @m80.l Integer num2, @m80.l AmPmMarker amPmMarker, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        this.f87774a = num;
        this.f87775b = num2;
        this.f87776c = amPmMarker;
        this.f87777d = num3;
        this.f87778e = num4;
        this.f87779f = num5;
    }

    public /* synthetic */ t0(Integer num, Integer num2, AmPmMarker amPmMarker, Integer num3, Integer num4, Integer num5, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : amPmMarker, (i11 & 8) != 0 ? null : num3, (i11 & 16) != 0 ? null : num4, (i11 & 32) != 0 ? null : num5);
    }
}
