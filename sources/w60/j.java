package w60;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j extends a {

    /* renamed from: e, reason: collision with root package name */
    public final InputStream f95458e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95459f;

    public j(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f95459f;
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() throws IOException {
        return this.f95458e;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        int read;
        e80.a.j(outputStream, "Output stream");
        InputStream inputStream = this.f95458e;
        try {
            byte[] bArr = new byte[4096];
            long j11 = this.f95459f;
            if (j11 < 0) {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read2);
                    }
                }
            } else {
                while (j11 > 0 && (read = inputStream.read(bArr, 0, (int) Math.min(4096L, j11))) != -1) {
                    outputStream.write(bArr, 0, read);
                    j11 -= read;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public j(InputStream inputStream, long j11) {
        this(inputStream, j11, null);
    }

    public j(InputStream inputStream, ContentType contentType) {
        this(inputStream, -1L, contentType);
    }

    public j(InputStream inputStream, long j11, ContentType contentType) {
        this.f95458e = (InputStream) e80.a.j(inputStream, "Source input stream");
        this.f95459f = j11;
        if (contentType != null) {
            i(contentType.toString());
        }
    }
}
