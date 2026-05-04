package x60;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {
    public static CharsetDecoder a(v60.a aVar) {
        if (aVar == null) {
            return null;
        }
        Charset e11 = aVar.e();
        CodingErrorAction g11 = aVar.g();
        CodingErrorAction i11 = aVar.i();
        if (e11 == null) {
            return null;
        }
        CharsetDecoder newDecoder = e11.newDecoder();
        if (g11 == null) {
            g11 = CodingErrorAction.REPORT;
        }
        CharsetDecoder onMalformedInput = newDecoder.onMalformedInput(g11);
        if (i11 == null) {
            i11 = CodingErrorAction.REPORT;
        }
        return onMalformedInput.onUnmappableCharacter(i11);
    }

    public static CharsetEncoder b(v60.a aVar) {
        Charset e11;
        if (aVar == null || (e11 = aVar.e()) == null) {
            return null;
        }
        CodingErrorAction g11 = aVar.g();
        CodingErrorAction i11 = aVar.i();
        CharsetEncoder newEncoder = e11.newEncoder();
        if (g11 == null) {
            g11 = CodingErrorAction.REPORT;
        }
        CharsetEncoder onMalformedInput = newEncoder.onMalformedInput(g11);
        if (i11 == null) {
            i11 = CodingErrorAction.REPORT;
        }
        return onMalformedInput.onUnmappableCharacter(i11);
    }
}
