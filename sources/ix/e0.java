package ix;

import io.ktor.http.InvalidCookieDateException;
import io.ktor.util.date.InvalidDateStringException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<String> f62752a = a00.h0.Q("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz");

    @m80.k
    public static final bz.b a(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String obj = u30.k0.b6(str).toString();
        try {
            return new y().l(obj);
        } catch (InvalidCookieDateException unused) {
            return b(obj);
        }
    }

    @m80.k
    public static final bz.b b(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String obj = u30.k0.b6(str).toString();
        Iterator<String> it = f62752a.iterator();
        while (it.hasNext()) {
            try {
                return new io.ktor.util.date.b(it.next()).b(str);
            } catch (InvalidDateStringException unused) {
            }
        }
        throw new IllegalStateException(("Failed to parse date: " + obj).toString());
    }

    public static final String c(int i11, int i12) {
        return u30.k0.m4(String.valueOf(i11), i12, '0');
    }

    @m80.k
    public static final String d(@m80.k bz.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.t().getValue() + org.junit.jupiter.api.j2.O);
        sb2.append(c(bVar.s(), 2) + ' ');
        sb2.append(bVar.x().getValue() + ' ');
        sb2.append(c(bVar.A(), 4));
        sb2.append(' ' + c(bVar.v(), 2) + ':' + c(bVar.w(), 2) + ':' + c(bVar.y(), 2) + ' ');
        sb2.append("GMT");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }
}
