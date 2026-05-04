package t70;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import org.apache.http.HttpEntity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class l extends w60.i implements n {

    /* renamed from: b, reason: collision with root package name */
    public final ReadableByteChannel f89964b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f89965c;

    public l(HttpEntity httpEntity) throws IOException {
        super(httpEntity);
        this.f89964b = Channels.newChannel(httpEntity.w());
        this.f89965c = ByteBuffer.allocate(4096);
    }

    @Override // t70.n
    public void a() {
        try {
            this.f89964b.close();
        } catch (IOException unused) {
        }
    }

    @Override // t70.n
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        int read = this.f89964b.read(this.f89965c);
        this.f89965c.flip();
        cVar.write(this.f89965c);
        boolean hasRemaining = this.f89965c.hasRemaining();
        this.f89965c.compact();
        if (read != -1 || hasRemaining) {
            return;
        }
        cVar.complete();
        this.f89964b.close();
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
