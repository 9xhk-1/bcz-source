package t70;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class c extends w60.i implements b {

    /* renamed from: b, reason: collision with root package name */
    public final f f89946b;

    public c(HttpEntity httpEntity, f fVar) {
        super(httpEntity);
        this.f89946b = fVar;
    }

    @Override // t70.b
    public void a() {
        this.f89946b.b();
    }

    public f b() {
        return this.f89946b;
    }

    @Override // t70.b
    public void h(m70.a aVar, m70.g gVar) throws IOException {
        this.f89946b.a(aVar, gVar);
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
}
