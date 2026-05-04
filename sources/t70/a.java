package t70;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class a extends w60.i implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f89942e = 2048;

    /* renamed from: b, reason: collision with root package name */
    public final z70.j f89943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f89944c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f89945d;

    public a(HttpEntity httpEntity, z70.b bVar) {
        super(httpEntity);
        this.f89943b = new z70.j(2048, bVar);
    }

    @Override // t70.b
    public void a() {
        this.f89944c = true;
    }

    @Override // t70.b
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        this.f89943b.h(aVar);
        if (aVar.e()) {
            this.f89944c = true;
        }
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public boolean n() {
        return false;
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public boolean q() {
        return true;
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public InputStream w() throws IOException {
        e80.b.a(this.f89944c, "Entity content has not been fully received");
        e80.b.a(!this.f89945d, "Entity content has been consumed");
        this.f89945d = true;
        return new e(this.f89943b);
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        InputStream w11 = w();
        byte[] bArr = new byte[2048];
        while (true) {
            int read = w11.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
