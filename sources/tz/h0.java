package tz;

import android.util.Base64;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public class h0 {
    public static String a(String str) {
        return b(str, 0);
    }

    public static String b(String str, int i11) {
        try {
            return new String(Base64.decode(str, i11), Charset.forName("UTF-8"));
        } catch (Exception unused) {
            return str;
        }
    }

    public static String c(String str, int i11) {
        try {
            return new String(Base64.encode(str.getBytes(Charset.forName("UTF-8")), i11), Charset.forName("UTF-8"));
        } catch (Exception unused) {
            return str;
        }
    }
}
