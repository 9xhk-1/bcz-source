package w70;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class m0 extends w60.i implements t70.b {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f95605b;

    public m0(HttpEntity httpEntity) {
        super(httpEntity);
        this.f95605b = ByteBuffer.allocate(2048);
    }

    @Override // t70.b
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        do {
            this.f95605b.clear();
        } while (aVar.read(this.f95605b) > 0);
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public boolean q() {
        return true;
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public InputStream w() throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Does not support blocking methods");
    }

    @Override // w60.i, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Does not support blocking methods");
    }

    @Override // t70.b
    public void a() {
    }
}
