package s60;

import java.io.UnsupportedEncodingException;
import o60.l;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char f88057a = '?';

    /* renamed from: b, reason: collision with root package name */
    public static final String f88058b = "?=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f88059c = "=?";

    public String c(String str) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(f88059c) || !str.endsWith(f88058b)) {
            throw new DecoderException("RFC 1522 violation: malformed encoded content");
        }
        int length = str.length() - 2;
        int indexOf = str.indexOf(63, 2);
        if (indexOf == length) {
            throw new DecoderException("RFC 1522 violation: charset token not found");
        }
        String substring = str.substring(2, indexOf);
        if (substring.equals("")) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
        int i11 = indexOf + 1;
        int indexOf2 = str.indexOf(63, i11);
        if (indexOf2 == length) {
            throw new DecoderException("RFC 1522 violation: encoding token not found");
        }
        String substring2 = str.substring(i11, indexOf2);
        if (g().equalsIgnoreCase(substring2)) {
            int i12 = indexOf2 + 1;
            return new String(d(l.c(str.substring(i12, str.indexOf(63, i12)))), substring);
        }
        throw new DecoderException("This codec cannot decode " + substring2 + " encoded content");
    }

    public abstract byte[] d(byte[] bArr) throws DecoderException;

    public abstract byte[] e(byte[] bArr) throws EncoderException;

    public String f(String str, String str2) throws EncoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(f88059c);
        stringBuffer.append(str2);
        stringBuffer.append(f88057a);
        stringBuffer.append(g());
        stringBuffer.append(f88057a);
        stringBuffer.append(l.k(e(str.getBytes(str2))));
        stringBuffer.append(f88058b);
        return stringBuffer.toString();
    }

    public abstract String g();
}
