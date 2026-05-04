package z60;

import c80.f;
import org.apache.http.HttpException;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class e implements w60.e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f101040d = new e();

    /* renamed from: c, reason: collision with root package name */
    public final int f101041c;

    public e(int i11) {
        this.f101041c = i11;
    }

    @Override // w60.e
    public long a(o oVar) throws HttpException {
        e80.a.j(oVar, "HTTP message");
        org.apache.http.e w11 = oVar.w("Transfer-Encoding");
        if (w11 != null) {
            String value = w11.getValue();
            if (f.f8329r.equalsIgnoreCase(value)) {
                if (!oVar.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    return -2L;
                }
                throw new ProtocolException("Chunked transfer encoding not allowed for " + oVar.getProtocolVersion());
            }
            if ("identity".equalsIgnoreCase(value)) {
                return -1L;
            }
            throw new ProtocolException("Unsupported transfer encoding: " + value);
        }
        org.apache.http.e w12 = oVar.w("Content-Length");
        if (w12 == null) {
            return this.f101041c;
        }
        String value2 = w12.getValue();
        try {
            long parseLong = Long.parseLong(value2);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new ProtocolException("Negative content length: " + value2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Invalid content length: " + value2);
        }
    }

    public e() {
        this(-1);
    }
}
