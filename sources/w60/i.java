package w60;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i implements HttpEntity {

    /* renamed from: a, reason: collision with root package name */
    public HttpEntity f95457a;

    public i(HttpEntity httpEntity) {
        this.f95457a = (HttpEntity) e80.a.j(httpEntity, "Wrapped entity");
    }

    @Override // org.apache.http.HttpEntity
    @Deprecated
    public void E() throws IOException {
        this.f95457a.E();
    }

    @Override // org.apache.http.HttpEntity
    public org.apache.http.e Z() {
        return this.f95457a.Z();
    }

    @Override // org.apache.http.HttpEntity
    public boolean a0() {
        return this.f95457a.a0();
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f95457a.c0();
    }

    @Override // org.apache.http.HttpEntity
    public org.apache.http.e getContentType() {
        return this.f95457a.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return this.f95457a.n();
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        return this.f95457a.q();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() throws IOException {
        return this.f95457a.w();
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f95457a.writeTo(outputStream);
    }
}
