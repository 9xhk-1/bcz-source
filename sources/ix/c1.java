package ix;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpMessagePropertiesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpMessagePropertiesJvm.kt\nio/ktor/http/HttpMessagePropertiesJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes8.dex */
public final class c1 {
    @m80.l
    public static final Date a(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        String str = a1Var.a().get(y0.f63006a.G());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    @m80.l
    public static final Date b(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        String str = a1Var.a().get(y0.f63006a.L());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    @m80.l
    public static final Date c(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        String str = b1Var.a().get(y0.f63006a.L());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    public static final String d(Date date) {
        String format = e().format(date);
        kotlin.jvm.internal.g0.o(format, "format(...)");
        return format;
    }

    public static final SimpleDateFormat e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static final void f(@m80.k b1 b1Var, @m80.k Date date) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(date, "date");
        b1Var.a().d(y0.f63006a.S(), d(date));
    }

    @m80.l
    public static final Date g(@m80.k a1 a1Var) {
        kotlin.jvm.internal.g0.p(a1Var, "<this>");
        String str = a1Var.a().get(y0.f63006a.X());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    @m80.l
    public static final Date h(@m80.k b1 b1Var) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        String str = b1Var.a().get(y0.f63006a.X());
        if (str != null) {
            return i(str);
        }
        return null;
    }

    public static final Date i(String str) {
        Date parse = e().parse(str);
        kotlin.jvm.internal.g0.o(parse, "parse(...)");
        return parse;
    }
}
