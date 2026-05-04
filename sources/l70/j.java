package l70;

import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class j implements p {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final j f70705a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final j f70706b = new j();

    public static String i(org.apache.http.e eVar, p pVar) {
        if (pVar == null) {
            pVar = f70706b;
        }
        return pVar.c(null, eVar).toString();
    }

    public static String j(ProtocolVersion protocolVersion, p pVar) {
        if (pVar == null) {
            pVar = f70706b;
        }
        return pVar.a(null, protocolVersion).toString();
    }

    public static String k(RequestLine requestLine, p pVar) {
        if (pVar == null) {
            pVar = f70706b;
        }
        return pVar.b(null, requestLine).toString();
    }

    public static String l(x xVar, p pVar) {
        if (pVar == null) {
            pVar = f70706b;
        }
        return pVar.d(null, xVar).toString();
    }

    @Override // l70.p
    public CharArrayBuffer a(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        e80.a.j(protocolVersion, "Protocol version");
        int h11 = h(protocolVersion);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(h11);
        } else {
            charArrayBuffer.ensureCapacity(h11);
        }
        charArrayBuffer.append(protocolVersion.getProtocol());
        charArrayBuffer.append('/');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMajor()));
        charArrayBuffer.append('.');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMinor()));
        return charArrayBuffer;
    }

    @Override // l70.p
    public CharArrayBuffer b(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        e80.a.j(requestLine, "Request line");
        CharArrayBuffer m11 = m(charArrayBuffer);
        f(m11, requestLine);
        return m11;
    }

    @Override // l70.p
    public CharArrayBuffer c(CharArrayBuffer charArrayBuffer, org.apache.http.e eVar) {
        e80.a.j(eVar, "Header");
        if (eVar instanceof org.apache.http.d) {
            return ((org.apache.http.d) eVar).getBuffer();
        }
        CharArrayBuffer m11 = m(charArrayBuffer);
        e(m11, eVar);
        return m11;
    }

    @Override // l70.p
    public CharArrayBuffer d(CharArrayBuffer charArrayBuffer, x xVar) {
        e80.a.j(xVar, "Status line");
        CharArrayBuffer m11 = m(charArrayBuffer);
        g(m11, xVar);
        return m11;
    }

    public void e(CharArrayBuffer charArrayBuffer, org.apache.http.e eVar) {
        String name = eVar.getName();
        String value = eVar.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        charArrayBuffer.ensureCapacity(length);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.ensureCapacity(charArrayBuffer.length() + value.length());
            for (int i11 = 0; i11 < value.length(); i11++) {
                char charAt = value.charAt(i11);
                if (charAt == '\r' || charAt == '\n' || charAt == '\f' || charAt == 11) {
                    charAt = ' ';
                }
                charArrayBuffer.append(charAt);
            }
        }
    }

    public void f(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        String method = requestLine.getMethod();
        String uri = requestLine.getUri();
        charArrayBuffer.ensureCapacity(method.length() + 1 + uri.length() + 1 + h(requestLine.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append(' ');
        charArrayBuffer.append(uri);
        charArrayBuffer.append(' ');
        a(charArrayBuffer, requestLine.getProtocolVersion());
    }

    public void g(CharArrayBuffer charArrayBuffer, x xVar) {
        int h11 = h(xVar.getProtocolVersion()) + 5;
        String reasonPhrase = xVar.getReasonPhrase();
        if (reasonPhrase != null) {
            h11 += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(h11);
        a(charArrayBuffer, xVar.getProtocolVersion());
        charArrayBuffer.append(' ');
        charArrayBuffer.append(Integer.toString(xVar.getStatusCode()));
        charArrayBuffer.append(' ');
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public int h(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    public CharArrayBuffer m(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return new CharArrayBuffer(64);
        }
        charArrayBuffer.clear();
        return charArrayBuffer;
    }
}
