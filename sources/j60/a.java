package j60;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.g0;
import l60.e1;
import l60.k;
import l60.p;
import m80.k;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63560a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l60.k f63561b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Deflater f63562c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f63563d;

    public a(boolean z11) {
        this.f63560a = z11;
        l60.k kVar = new l60.k();
        this.f63561b = kVar;
        Deflater deflater = new Deflater(-1, true);
        this.f63562c = deflater;
        this.f63563d = new p((e1) kVar, deflater);
    }

    public final void a(@k l60.k buffer) throws IOException {
        ByteString byteString;
        g0.p(buffer, "buffer");
        if (this.f63561b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f63560a) {
            this.f63562c.reset();
        }
        this.f63563d.y8(buffer, buffer.size());
        this.f63563d.flush();
        l60.k kVar = this.f63561b;
        byteString = b.f63564a;
        if (c(kVar, byteString)) {
            long size = this.f63561b.size() - 4;
            k.a W0 = l60.k.W0(this.f63561b, null, 1, null);
            try {
                W0.f(size);
                r00.b.a(W0, null);
            } finally {
            }
        } else {
            this.f63561b.writeByte(0);
        }
        l60.k kVar2 = this.f63561b;
        buffer.y8(kVar2, kVar2.size());
    }

    public final boolean c(l60.k kVar, ByteString byteString) {
        return kVar.J0(kVar.size() - byteString.size(), byteString);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63563d.close();
    }
}
