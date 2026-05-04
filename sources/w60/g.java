package w60;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends a {

    /* renamed from: e, reason: collision with root package name */
    public final f f95455e;

    public g(f fVar) {
        this.f95455e = (f) e80.a.j(fVar, "Content producer");
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return -1L;
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeTo(byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        this.f95455e.writeTo(outputStream);
    }
}
