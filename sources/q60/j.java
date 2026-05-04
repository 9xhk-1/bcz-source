package q60;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j {
    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (Character.isLetter(str.charAt(i12))) {
                cArr[i11] = str.charAt(i12);
                i11++;
            }
        }
        return i11 == length ? str.toUpperCase(Locale.ENGLISH) : new String(cArr, 0, i11).toUpperCase(Locale.ENGLISH);
    }

    public static int b(n60.g gVar, String str, String str2) throws EncoderException {
        return c(gVar.a(str), gVar.a(str2));
    }

    public static int c(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int min = Math.min(str.length(), str2.length());
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            if (str.charAt(i12) == str2.charAt(i12)) {
                i11++;
            }
        }
        return i11;
    }
}
