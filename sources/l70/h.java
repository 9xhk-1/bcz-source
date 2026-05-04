package l70;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicRequestLine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h extends a implements HttpRequest {

    /* renamed from: c, reason: collision with root package name */
    public final String f70695c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70696d;

    /* renamed from: e, reason: collision with root package name */
    public RequestLine f70697e;

    public h(String str, String str2) {
        this.f70695c = (String) e80.a.j(str, "Method name");
        this.f70696d = (String) e80.a.j(str2, "Request URI");
        this.f70697e = null;
    }

    @Override // org.apache.http.o
    public ProtocolVersion getProtocolVersion() {
        return getRequestLine().getProtocolVersion();
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        if (this.f70697e == null) {
            this.f70697e = new BasicRequestLine(this.f70695c, this.f70696d, HttpVersion.HTTP_1_1);
        }
        return this.f70697e;
    }

    public String toString() {
        return this.f70695c + ' ' + this.f70696d + ' ' + this.f70670a;
    }

    public h(String str, String str2, ProtocolVersion protocolVersion) {
        this(new BasicRequestLine(str, str2, protocolVersion));
    }

    public h(RequestLine requestLine) {
        this.f70697e = (RequestLine) e80.a.j(requestLine, "Request line");
        this.f70695c = requestLine.getMethod();
        this.f70696d = requestLine.getUri();
    }
}
