package zr;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {
    public static String a(String str) {
        int lastIndexOf;
        int i11;
        return (str.isEmpty() || (lastIndexOf = str.lastIndexOf(".")) == -1 || (i11 = lastIndexOf + 1) == str.length()) ? "" : str.substring(i11).toLowerCase(Locale.ENGLISH);
    }

    public static boolean b(String str, String[] strArr) {
        if (str != null && !str.isEmpty() && strArr != null) {
            String a11 = a(str);
            for (String str2 : strArr) {
                if (a11.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(String str) throws UnsupportedEncodingException {
        if (str == null || str.equals("")) {
            return true;
        }
        if (str.contains("%")) {
            str = str.replaceAll("%(?![0-9a-fA-F]{2})", "%25");
        }
        String decode = URLDecoder.decode(str, "utf-8");
        return (decode.contains(m.f102856e) || decode.contains("./") || decode.contains(".\\.\\") || decode.contains("%00")) ? false : true;
    }

    public static boolean d(String str, String str2) throws IllegalArgumentException, IOException {
        if (str != null && !str.equals("") && str2 != null && !str2.equals("")) {
            try {
                String decode = URLDecoder.decode(str2, "utf-8");
                String decode2 = URLDecoder.decode(str, "utf-8");
                if (!decode2.contains(m.f102856e) && !decode2.contains("./") && !decode2.contains(".\\.\\") && !decode2.contains("%00") && !decode.contains(m.f102856e) && !decode.contains("./") && !decode.contains(".\\.\\") && !decode.contains("%00")) {
                    return new File(decode2, decode).getCanonicalPath().startsWith(new File(decode2).getCanonicalPath());
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }
}
