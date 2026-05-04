package w60;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends a implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public final byte[] f95449e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f95450f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95451g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95452h;

    public d(byte[] bArr, ContentType contentType) {
        e80.a.j(bArr, "Source byte array");
        this.f95449e = bArr;
        this.f95450f = bArr;
        this.f95451g = 0;
        this.f95452h = bArr.length;
        if (contentType != null) {
            i(contentType.toString());
        }
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f95452h;
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
    public InputStream w() {
        return new ByteArrayInputStream(this.f95450f, this.f95451g, this.f95452h);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        outputStream.write(this.f95450f, this.f95451g, this.f95452h);
        outputStream.flush();
    }

    public d(byte[] bArr, int i11, int i12, ContentType contentType) {
        int i13;
        e80.a.j(bArr, "Source byte array");
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) >= 0 && i13 <= bArr.length) {
            this.f95449e = bArr;
            this.f95450f = bArr;
            this.f95451g = i11;
            this.f95452h = i12;
            if (contentType != null) {
                i(contentType.toString());
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("off: " + i11 + " len: " + i12 + " b.length: " + bArr.length);
    }

    public d(byte[] bArr) {
        this(bArr, null);
    }

    public d(byte[] bArr, int i11, int i12) {
        this(bArr, i11, i12, null);
    }
}
