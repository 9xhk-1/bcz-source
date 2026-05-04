package gy;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import m80.k;
import vx.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ZoneId f57834a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final DateTimeFormatter f57835b;

    static {
        ZoneId of2;
        DateTimeFormatter ofPattern;
        DateTimeFormatter withLocale;
        DateTimeFormatter withZone;
        of2 = ZoneId.of("GMT");
        g0.o(of2, "of(...)");
        f57834a = of2;
        ofPattern = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z");
        withLocale = ofPattern.withLocale(Locale.US);
        withZone = withLocale.withZone(of2);
        g0.m(withZone);
        f57835b = withZone;
    }

    @k
    public static final DateTimeFormatter a() {
        return f57835b;
    }

    @k
    public static final String b(@k Temporal temporal) {
        String format;
        g0.p(temporal, "<this>");
        format = f57835b.format(i.a(temporal));
        g0.o(format, "format(...)");
        return format;
    }
}
