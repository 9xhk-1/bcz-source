package l70;

import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class k implements q {

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final k f70707b = new k();

    /* renamed from: c, reason: collision with root package name */
    public static final k f70708c = new k();

    /* renamed from: a, reason: collision with root package name */
    public final ProtocolVersion f70709a;

    public k(ProtocolVersion protocolVersion) {
        this.f70709a = protocolVersion == null ? HttpVersion.HTTP_1_1 : protocolVersion;
    }

    public static org.apache.http.e i(String str, q qVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        if (qVar == null) {
            qVar = f70708c;
        }
        return qVar.d(charArrayBuffer);
    }

    public static ProtocolVersion j(String str, q qVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (qVar == null) {
            qVar = f70708c;
        }
        return qVar.e(charArrayBuffer, rVar);
    }

    public static RequestLine k(String str, q qVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (qVar == null) {
            qVar = f70708c;
        }
        return qVar.a(charArrayBuffer, rVar);
    }

    public static x l(String str, q qVar) throws ParseException {
        e80.a.j(str, "Value");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        r rVar = new r(0, str.length());
        if (qVar == null) {
            qVar = f70708c;
        }
        return qVar.b(charArrayBuffer, rVar);
    }

    @Override // l70.q
    public RequestLine a(CharArrayBuffer charArrayBuffer, r rVar) throws ParseException {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        int c11 = rVar.c();
        int d11 = rVar.d();
        try {
            m(charArrayBuffer, rVar);
            int c12 = rVar.c();
            int indexOf = charArrayBuffer.indexOf(32, c12, d11);
            if (indexOf < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(c11, d11));
            }
            String substringTrimmed = charArrayBuffer.substringTrimmed(c12, indexOf);
            rVar.e(indexOf);
            m(charArrayBuffer, rVar);
            int c13 = rVar.c();
            int indexOf2 = charArrayBuffer.indexOf(32, c13, d11);
            if (indexOf2 < 0) {
                throw new ParseException("Invalid request line: " + charArrayBuffer.substring(c11, d11));
            }
            String substringTrimmed2 = charArrayBuffer.substringTrimmed(c13, indexOf2);
            rVar.e(indexOf2);
            ProtocolVersion e11 = e(charArrayBuffer, rVar);
            m(charArrayBuffer, rVar);
            if (rVar.a()) {
                return g(substringTrimmed, substringTrimmed2, e11);
            }
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(c11, d11));
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid request line: " + charArrayBuffer.substring(c11, d11));
        }
    }

    @Override // l70.q
    public x b(CharArrayBuffer charArrayBuffer, r rVar) throws ParseException {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        int c11 = rVar.c();
        int d11 = rVar.d();
        try {
            ProtocolVersion e11 = e(charArrayBuffer, rVar);
            m(charArrayBuffer, rVar);
            int c12 = rVar.c();
            int indexOf = charArrayBuffer.indexOf(32, c12, d11);
            if (indexOf < 0) {
                indexOf = d11;
            }
            String substringTrimmed = charArrayBuffer.substringTrimmed(c12, indexOf);
            for (int i11 = 0; i11 < substringTrimmed.length(); i11++) {
                if (!Character.isDigit(substringTrimmed.charAt(i11))) {
                    throw new ParseException("Status line contains invalid status code: " + charArrayBuffer.substring(c11, d11));
                }
            }
            try {
                return h(e11, Integer.parseInt(substringTrimmed), indexOf < d11 ? charArrayBuffer.substringTrimmed(indexOf, d11) : "");
            } catch (NumberFormatException unused) {
                throw new ParseException("Status line contains invalid status code: " + charArrayBuffer.substring(c11, d11));
            }
        } catch (IndexOutOfBoundsException unused2) {
            throw new ParseException("Invalid status line: " + charArrayBuffer.substring(c11, d11));
        }
    }

    @Override // l70.q
    public boolean c(CharArrayBuffer charArrayBuffer, r rVar) {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        int c11 = rVar.c();
        String protocol = this.f70709a.getProtocol();
        int length = protocol.length();
        if (charArrayBuffer.length() < length + 4) {
            return false;
        }
        if (c11 < 0) {
            c11 = (charArrayBuffer.length() - 4) - length;
        } else if (c11 == 0) {
            while (c11 < charArrayBuffer.length() && c80.f.a(charArrayBuffer.charAt(c11))) {
                c11++;
            }
        }
        int i11 = c11 + length;
        if (i11 + 4 > charArrayBuffer.length()) {
            return false;
        }
        boolean z11 = true;
        for (int i12 = 0; z11 && i12 < length; i12++) {
            z11 = charArrayBuffer.charAt(c11 + i12) == protocol.charAt(i12);
        }
        return z11 ? charArrayBuffer.charAt(i11) == '/' : z11;
    }

    @Override // l70.q
    public org.apache.http.e d(CharArrayBuffer charArrayBuffer) throws ParseException {
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // l70.q
    public ProtocolVersion e(CharArrayBuffer charArrayBuffer, r rVar) throws ParseException {
        e80.a.j(charArrayBuffer, "Char array buffer");
        e80.a.j(rVar, "Parser cursor");
        String protocol = this.f70709a.getProtocol();
        int length = protocol.length();
        int c11 = rVar.c();
        int d11 = rVar.d();
        m(charArrayBuffer, rVar);
        int c12 = rVar.c();
        int i11 = c12 + length;
        if (i11 + 4 > d11) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(c11, d11));
        }
        boolean z11 = true;
        for (int i12 = 0; z11 && i12 < length; i12++) {
            z11 = charArrayBuffer.charAt(c12 + i12) == protocol.charAt(i12);
        }
        if (z11) {
            z11 = charArrayBuffer.charAt(i11) == '/';
        }
        if (!z11) {
            throw new ParseException("Not a valid protocol version: " + charArrayBuffer.substring(c11, d11));
        }
        int i13 = c12 + length + 1;
        int indexOf = charArrayBuffer.indexOf(46, i13, d11);
        if (indexOf == -1) {
            throw new ParseException("Invalid protocol version number: " + charArrayBuffer.substring(c11, d11));
        }
        try {
            int parseInt = Integer.parseInt(charArrayBuffer.substringTrimmed(i13, indexOf));
            int i14 = indexOf + 1;
            int indexOf2 = charArrayBuffer.indexOf(32, i14, d11);
            if (indexOf2 == -1) {
                indexOf2 = d11;
            }
            try {
                int parseInt2 = Integer.parseInt(charArrayBuffer.substringTrimmed(i14, indexOf2));
                rVar.e(indexOf2);
                return f(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                throw new ParseException("Invalid protocol minor version number: " + charArrayBuffer.substring(c11, d11));
            }
        } catch (NumberFormatException unused2) {
            throw new ParseException("Invalid protocol major version number: " + charArrayBuffer.substring(c11, d11));
        }
    }

    public ProtocolVersion f(int i11, int i12) {
        return this.f70709a.forVersion(i11, i12);
    }

    public RequestLine g(String str, String str2, ProtocolVersion protocolVersion) {
        return new BasicRequestLine(str, str2, protocolVersion);
    }

    public x h(ProtocolVersion protocolVersion, int i11, String str) {
        return new BasicStatusLine(protocolVersion, i11, str);
    }

    public void m(CharArrayBuffer charArrayBuffer, r rVar) {
        int c11 = rVar.c();
        int d11 = rVar.d();
        while (c11 < d11 && c80.f.a(charArrayBuffer.charAt(c11))) {
            c11++;
        }
        rVar.e(c11);
    }

    public k() {
        this(null);
    }
}
