package w60;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends a implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public final File f95456e;

    @Deprecated
    public h(File file, String str) {
        this.f95456e = (File) e80.a.j(file, "File");
        i(str);
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f95456e.length();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        return new FileInputStream(this.f95456e);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        FileInputStream fileInputStream = new FileInputStream(this.f95456e);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    outputStream.flush();
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    public h(File file, ContentType contentType) {
        this.f95456e = (File) e80.a.j(file, "File");
        if (contentType != null) {
            i(contentType.toString());
        }
    }

    public h(File file) {
        this.f95456e = (File) e80.a.j(file, "File");
    }
}
