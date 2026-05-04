package ix;

import io.ktor.http.RangeUnits;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {
    @m80.k
    public static final String a(@m80.l g10.o oVar, @m80.l Long l11, @m80.k RangeUnits unit) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        return b(oVar, l11, unit.getUnitToken());
    }

    @m80.k
    public static final String b(@m80.l g10.o oVar, @m80.l Long l11, @m80.k String unit) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(unit);
        sb2.append(" ");
        if (oVar != null) {
            sb2.append(oVar.d());
            sb2.append('-');
            sb2.append(oVar.f());
        } else {
            sb2.append('*');
        }
        sb2.append('/');
        Object obj = l11;
        if (l11 == null) {
            obj = "*";
        }
        sb2.append(obj);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static /* synthetic */ String c(g10.o oVar, Long l11, RangeUnits rangeUnits, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            rangeUnits = RangeUnits.Bytes;
        }
        return a(oVar, l11, rangeUnits);
    }

    public static /* synthetic */ String d(g10.o oVar, Long l11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        return b(oVar, l11, str);
    }
}
