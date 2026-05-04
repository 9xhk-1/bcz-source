package w60;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f95448b;

    public c(HttpEntity httpEntity) throws IOException {
        super(httpEntity);
        if (httpEntity.n() && httpEntity.c0() >= 0) {
            this.f95448b = null;
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        httpEntity.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.flush();
        this.f95448b = byteArrayOutputStream.toByteArray();
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public boolean a0() {
        return this.f95448b == null && super.a0();
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public long c0() {
        return this.f95448b != null ? r0.length : super.c0();
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public boolean n() {
        return true;
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public boolean q() {
        return this.f95448b == null && super.q();
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public InputStream w() throws IOException {
        return this.f95448b != null ? new ByteArrayInputStream(this.f95448b) : super.w();
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        byte[] bArr = this.f95448b;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.writeTo(outputStream);
        }
    }
}
