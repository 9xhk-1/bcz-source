package org.apache.http.message;

import com.alipay.sdk.m.p.e;
import java.io.Serializable;
import l70.j;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.x;
import t60.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class BasicStatusLine implements x, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion protocolVersion, int i11, String str) {
        this.protoVersion = (ProtocolVersion) e80.a.j(protocolVersion, e.f10903g);
        this.statusCode = e80.a.h(i11, "Status code");
        this.reasonPhrase = str;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.x
    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    @Override // org.apache.http.x
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    @Override // org.apache.http.x
    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        return j.f70706b.d(null, this).toString();
    }
}
