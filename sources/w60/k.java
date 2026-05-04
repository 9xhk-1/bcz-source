package w60;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k extends a {

    /* renamed from: e, reason: collision with root package name */
    public byte[] f95460e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f95461f;

    public k(Serializable serializable, boolean z11) throws IOException {
        e80.a.j(serializable, "Source object");
        if (z11) {
            f0(serializable);
        } else {
            this.f95461f = serializable;
        }
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        if (this.f95460e == null) {
            return -1L;
        }
        return r0.length;
    }

    public final void f0(Serializable serializable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.f95460e = byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        return this.f95460e == null;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() throws IOException, IllegalStateException {
        if (this.f95460e == null) {
            f0(this.f95461f);
        }
        return new ByteArrayInputStream(this.f95460e);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        byte[] bArr = this.f95460e;
        if (bArr != null) {
            outputStream.write(bArr);
            outputStream.flush();
        } else {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this.f95461f);
            objectOutputStream.flush();
        }
    }

    public k(Serializable serializable) {
        e80.a.j(serializable, "Source object");
        this.f95461f = serializable;
    }
}
