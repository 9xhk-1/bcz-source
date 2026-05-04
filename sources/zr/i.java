package zr;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102844a = "SafeStringBuffer";

    /* renamed from: b, reason: collision with root package name */
    public static final String f102845b = "";

    public static String a(StringBuffer stringBuffer, int i11) {
        if (stringBuffer != null && stringBuffer.length() >= i11 && i11 >= 0) {
            try {
                return stringBuffer.substring(i11);
            } catch (Exception e11) {
                Log.e(f102844a, "substring exception: " + e11.getMessage());
            }
        }
        return "";
    }

    public static String b(StringBuffer stringBuffer, int i11, int i12) {
        if (stringBuffer != null && i11 >= 0 && i12 <= stringBuffer.length() && i12 >= i11) {
            try {
                return stringBuffer.substring(i11, i12);
            } catch (Exception e11) {
                Log.e(f102844a, "substring: " + e11.getMessage());
            }
        }
        return "";
    }
}
