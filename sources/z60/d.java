package z60;

import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.f;
import org.apache.http.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class d implements w60.e {

    /* renamed from: d, reason: collision with root package name */
    public static final d f101038d = new d();

    /* renamed from: c, reason: collision with root package name */
    public final int f101039c;

    public d(int i11) {
        this.f101039c = i11;
    }

    @Override // w60.e
    public long a(o oVar) throws HttpException {
        long j11;
        e80.a.j(oVar, "HTTP message");
        org.apache.http.e w11 = oVar.w("Transfer-Encoding");
        if (w11 != null) {
            try {
                f[] elements = w11.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(w11.getValue()) && length > 0 && c80.f.f8329r.equalsIgnoreCase(elements[length + (-1)].getName())) ? -2L : -1L;
            } catch (ParseException e11) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + w11, e11);
            }
        }
        if (oVar.w("Content-Length") == null) {
            return this.f101039c;
        }
        org.apache.http.e[] m11 = oVar.m("Content-Length");
        int length2 = m11.length - 1;
        while (true) {
            if (length2 < 0) {
                j11 = -1;
                break;
            }
            try {
                j11 = Long.parseLong(m11[length2].getValue());
                break;
            } catch (NumberFormatException unused) {
                length2--;
            }
        }
        if (j11 >= 0) {
            return j11;
        }
        return -1L;
    }

    public d() {
        this(-1);
    }
}
