package s60;

import org.apache.commons.codec.DecoderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {
    public static int a(byte b11) throws DecoderException {
        int digit = Character.digit((char) b11, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b11));
    }
}
