package xb;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class n {
    public static double a(String val, double defaultValue) {
        if (val == null) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(val);
        } catch (Exception unused) {
            return defaultValue;
        }
    }

    public static float b(String val, float defaultValue) {
        if (val == null) {
            return defaultValue;
        }
        try {
            return Float.parseFloat(val);
        } catch (Exception unused) {
            return defaultValue;
        }
    }

    public static int c(String val, int defaultValue) {
        if (val == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(val);
        } catch (Exception unused) {
            return defaultValue;
        }
    }

    public static long d(String val, long defaultValue) {
        if (val == null) {
            return defaultValue;
        }
        try {
            return Long.parseLong(val);
        } catch (Exception unused) {
            return defaultValue;
        }
    }
}
