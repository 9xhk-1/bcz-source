package tz;

/* loaded from: classes8.dex */
public class z0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final z0 f91428a = new z0();
    }

    public z0() {
    }

    public static z0 b() {
        return a.f91428a;
    }

    public String a(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod(ct.d.f46852f, String.class).invoke(null, str);
            if (invoke != null) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
