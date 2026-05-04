package l70;

import org.apache.http.HttpEntity;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends h implements org.apache.http.l {

    /* renamed from: f, reason: collision with root package name */
    public HttpEntity f70694f;

    public g(String str, String str2) {
        super(str, str2);
    }

    @Override // org.apache.http.l
    public boolean expectContinue() {
        org.apache.http.e w11 = w("Expect");
        return w11 != null && c80.f.f8326o.equalsIgnoreCase(w11.getValue());
    }

    @Override // org.apache.http.l
    public HttpEntity getEntity() {
        return this.f70694f;
    }

    @Override // org.apache.http.l
    public void setEntity(HttpEntity httpEntity) {
        this.f70694f = httpEntity;
    }

    public g(String str, String str2, ProtocolVersion protocolVersion) {
        super(str, str2, protocolVersion);
    }

    public g(RequestLine requestLine) {
        super(requestLine);
    }
}
