package o70;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<T> extends w70.b<T> {

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f76340d;

    public a(int i11) {
        this.f76340d = ByteBuffer.allocate(i11);
    }

    @Override // w70.b
    public final void f(m70.a aVar, m70.g gVar) throws IOException {
        e80.b.f(this.f76340d, "Byte buffer");
        if (aVar.read(this.f76340d) <= 0) {
            return;
        }
        this.f76340d.flip();
        q(this.f76340d, gVar);
        this.f76340d.clear();
    }

    public abstract void q(ByteBuffer byteBuffer, m70.g gVar) throws IOException;

    public a() {
        this(8192);
    }

    @Override // w70.b
    public void k() {
    }

    @Override // w70.b
    public final void i(HttpEntity httpEntity, ContentType contentType) throws IOException {
    }
}
