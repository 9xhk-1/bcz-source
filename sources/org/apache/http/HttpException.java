package org.apache.http;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class HttpException extends Exception {
    private static final int FIRST_VALID_CHAR = 32;
    private static final long serialVersionUID = -5437299376222011036L;

    public HttpException() {
    }

    public static String clean(String str) {
        char[] charArray = str.toCharArray();
        int i11 = 0;
        while (i11 < charArray.length && charArray[i11] >= ' ') {
            i11++;
        }
        if (i11 == charArray.length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(charArray.length * 2);
        for (int i12 = 0; i12 < charArray.length; i12++) {
            char c11 = charArray[i12];
            if (c11 < ' ') {
                sb2.append("[0x");
                String hexString = Integer.toHexString(i12);
                if (hexString.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(hexString);
                sb2.append("]");
            } else {
                sb2.append(c11);
            }
        }
        return sb2.toString();
    }

    public HttpException(String str) {
        super(clean(str));
    }

    public HttpException(String str, Throwable th2) {
        super(clean(str));
        initCause(th2);
    }
}
