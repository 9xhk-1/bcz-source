package org.apache.http.message;

import com.alipay.sdk.m.p.e;
import java.io.Serializable;
import l70.j;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.annotation.ThreadingBehavior;
import t60.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class BasicRequestLine implements RequestLine, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        this.method = (String) e80.a.j(str, "Method");
        this.uri = (String) e80.a.j(str2, "URI");
        this.protoversion = (ProtocolVersion) e80.a.j(protocolVersion, e.f10903g);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.RequestLine
    public String getMethod() {
        return this.method;
    }

    @Override // org.apache.http.RequestLine
    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    @Override // org.apache.http.RequestLine
    public String getUri() {
        return this.uri;
    }

    public String toString() {
        return j.f70706b.b(null, this).toString();
    }
}
