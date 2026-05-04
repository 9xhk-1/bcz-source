package w60;

import a70.q;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public InputStream f95446e;

    /* renamed from: f, reason: collision with root package name */
    public long f95447f = -1;

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f95447f;
    }

    public void f0(InputStream inputStream) {
        this.f95446e = inputStream;
    }

    public void h0(long j11) {
        this.f95447f = j11;
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        InputStream inputStream = this.f95446e;
        return (inputStream == null || inputStream == q.f2264a) ? false : true;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() throws IllegalStateException {
        e80.b.a(this.f95446e != null, "Content has not been provided");
        return this.f95446e;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        InputStream w11 = w();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = w11.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } finally {
            w11.close();
        }
    }
}
