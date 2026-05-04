package x60;

import com.badlogic.gdx.Net;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class i implements org.apache.http.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i f97640a = new i();

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0092, code lost:
    
        if (java.lang.Long.parseLong(r11[0].getValue()) < 0) goto L33;
     */
    @Override // org.apache.http.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(org.apache.http.HttpResponse r10, org.apache.http.protocol.HttpContext r11) {
        /*
            r9 = this;
            java.lang.String r0 = "HTTP response"
            e80.a.j(r10, r0)
            java.lang.String r0 = "HTTP context"
            e80.a.j(r11, r0)
            org.apache.http.x r0 = r10.n()
            int r0 = r0.getStatusCode()
            r1 = 204(0xcc, float:2.86E-43)
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r3 = "Content-Length"
            r4 = 0
            if (r0 != r1) goto L33
            org.apache.http.e r0 = r10.w(r3)
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.NumberFormatException -> L2c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2c
            if (r0 <= 0) goto L2c
            return r4
        L2c:
            org.apache.http.e r0 = r10.w(r2)
            if (r0 == 0) goto L33
            return r4
        L33:
            java.lang.String r0 = "http.request"
            java.lang.Object r11 = r11.getAttribute(r0)
            org.apache.http.HttpRequest r11 = (org.apache.http.HttpRequest) r11
            java.lang.String r0 = "Close"
            java.lang.String r1 = "Connection"
            if (r11 == 0) goto L5b
            l70.m r5 = new l70.m     // Catch: org.apache.http.ParseException -> L5a
            org.apache.http.h r6 = r11.t(r1)     // Catch: org.apache.http.ParseException -> L5a
            r5.<init>(r6)     // Catch: org.apache.http.ParseException -> L5a
        L4a:
            boolean r6 = r5.hasNext()     // Catch: org.apache.http.ParseException -> L5a
            if (r6 == 0) goto L5b
            java.lang.String r6 = r5.nextToken()     // Catch: org.apache.http.ParseException -> L5a
            boolean r6 = r0.equalsIgnoreCase(r6)     // Catch: org.apache.http.ParseException -> L5a
            if (r6 == 0) goto L4a
        L5a:
            return r4
        L5b:
            org.apache.http.x r5 = r10.n()
            org.apache.http.ProtocolVersion r5 = r5.getProtocolVersion()
            org.apache.http.e r2 = r10.w(r2)
            r6 = 1
            if (r2 == 0) goto L77
            java.lang.String r11 = "chunked"
            java.lang.String r2 = r2.getValue()
            boolean r11 = r11.equalsIgnoreCase(r2)
            if (r11 != 0) goto L95
            return r4
        L77:
            boolean r11 = r9.b(r11, r10)
            if (r11 == 0) goto L95
            org.apache.http.e[] r11 = r10.m(r3)
            int r2 = r11.length
            if (r2 != r6) goto L94
            r11 = r11[r4]
            java.lang.String r11 = r11.getValue()     // Catch: java.lang.NumberFormatException -> L94
            long r2 = java.lang.Long.parseLong(r11)     // Catch: java.lang.NumberFormatException -> L94
            r7 = 0
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 >= 0) goto L95
        L94:
            return r4
        L95:
            org.apache.http.h r11 = r10.t(r1)
            boolean r1 = r11.hasNext()
            if (r1 != 0) goto La5
            java.lang.String r11 = "Proxy-Connection"
            org.apache.http.h r11 = r10.t(r11)
        La5:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto Ld0
            l70.m r10 = new l70.m     // Catch: org.apache.http.ParseException -> Lcf
            r10.<init>(r11)     // Catch: org.apache.http.ParseException -> Lcf
            r11 = r4
        Lb1:
            boolean r1 = r10.hasNext()     // Catch: org.apache.http.ParseException -> Lcf
            if (r1 == 0) goto Lcc
            java.lang.String r1 = r10.nextToken()     // Catch: org.apache.http.ParseException -> Lcf
            boolean r2 = r0.equalsIgnoreCase(r1)     // Catch: org.apache.http.ParseException -> Lcf
            if (r2 == 0) goto Lc2
            return r4
        Lc2:
            java.lang.String r2 = "Keep-Alive"
            boolean r1 = r2.equalsIgnoreCase(r1)     // Catch: org.apache.http.ParseException -> Lcf
            if (r1 == 0) goto Lb1
            r11 = r6
            goto Lb1
        Lcc:
            if (r11 == 0) goto Ld0
            return r6
        Lcf:
            return r4
        Ld0:
            org.apache.http.HttpVersion r10 = org.apache.http.HttpVersion.HTTP_1_0
            boolean r10 = r5.lessEquals(r10)
            r10 = r10 ^ r6
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x60.i.a(org.apache.http.HttpResponse, org.apache.http.protocol.HttpContext):boolean");
    }

    public final boolean b(HttpRequest httpRequest, HttpResponse httpResponse) {
        int statusCode;
        return ((httpRequest != null && httpRequest.getRequestLine().getMethod().equalsIgnoreCase(Net.a.f11462a)) || (statusCode = httpResponse.n().getStatusCode()) < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) ? false : true;
    }

    public y c(org.apache.http.h hVar) {
        return new l70.m(hVar);
    }
}
