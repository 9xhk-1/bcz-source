package com.xiaomi.push;

/* loaded from: classes8.dex */
public class ab {

    /* renamed from: a, reason: collision with root package name */
    private static int f45239a;

    /* renamed from: a, reason: collision with other field name */
    public static final String f124a;

    /* renamed from: a, reason: collision with other field name */
    public static final boolean f125a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f45240b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f45241c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f45242d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f45243e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f45244f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f45245g;

    static {
        int i11;
        String str = af.f126a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f124a = str;
        boolean contains = str.contains("2A2FE0D7");
        f125a = contains;
        f45240b = contains || "DEBUG".equalsIgnoreCase(str);
        f45241c = "LOGABLE".equalsIgnoreCase(str);
        f45242d = str.contains("YY");
        f45243e = str.equalsIgnoreCase("TEST");
        f45244f = "BETA".equalsIgnoreCase(str);
        f45245g = str.startsWith("RC");
        f45239a = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            i11 = 2;
        } else {
            if (!str.equalsIgnoreCase("ONEBOX")) {
                f45239a = 1;
                return;
            }
            i11 = 3;
        }
        f45239a = i11;
    }

    public static int a() {
        return f45239a;
    }

    public static boolean b() {
        return f45239a == 3;
    }

    public static void a(int i11) {
        f45239a = i11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5714a() {
        return f45239a == 2;
    }
}
