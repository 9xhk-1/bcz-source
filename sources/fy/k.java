package fy;

import java.util.Locale;
import kotlin.jvm.internal.g0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f52430a;

    static {
        String property = System.getProperty("os.name", "");
        g0.o(property, "getProperty(...)");
        String lowerCase = property.toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        f52430a = lowerCase;
    }

    @m80.k
    public static final String a(@m80.k String value) {
        g0.p(value, "value");
        return (k0.n3(f52430a, "windows", false, 2, null) && g0.g(value, "0.0.0.0")) ? "127.0.0.1" : value;
    }
}
