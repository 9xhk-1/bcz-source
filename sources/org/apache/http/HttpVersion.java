package org.apache.http;

import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class HttpVersion extends ProtocolVersion {
    public static final String HTTP = "HTTP";
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public HttpVersion(int i11, int i12) {
        super(HTTP, i11, i12);
    }

    @Override // org.apache.http.ProtocolVersion
    public ProtocolVersion forVersion(int i11, int i12) {
        if (i11 == this.major && i12 == this.minor) {
            return this;
        }
        if (i11 == 1) {
            if (i12 == 0) {
                return HTTP_1_0;
            }
            if (i12 == 1) {
                return HTTP_1_1;
            }
        }
        return (i11 == 0 && i12 == 9) ? HTTP_0_9 : new HttpVersion(i11, i12);
    }
}
