package e70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends b {

    /* renamed from: e, reason: collision with root package name */
    public final int f49546e;

    /* renamed from: f, reason: collision with root package name */
    public final CharArrayBuffer f49547f;

    /* renamed from: g, reason: collision with root package name */
    public final k70.a f49548g;

    public f(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar, int i11) {
        super(writableByteChannel, kVar, vVar);
        this.f49546e = i11 <= 0 ? 0 : i11;
        this.f49547f = new CharArrayBuffer(16);
        if (kVar instanceof k70.a) {
            this.f49548g = (k70.a) kVar;
        } else {
            this.f49548g = null;
        }
    }

    @Override // e70.b, m70.c
    public void complete() throws IOException {
        b();
        this.f49547f.clear();
        this.f49547f.append("0");
        this.f49517b.c(this.f49547f);
        this.f49547f.clear();
        this.f49517b.c(this.f49547f);
        super.complete();
    }

    public String toString() {
        return "[chunk-coded; completed: " + e() + "]";
    }

    @Override // m70.c
    public int write(ByteBuffer byteBuffer) throws IOException {
        int i11 = 0;
        if (byteBuffer == null) {
            return 0;
        }
        b();
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            k70.a aVar = this.f49548g;
            int available = (aVar != null ? aVar.available() : 4096) - 12;
            if (available > 0) {
                if (available < remaining) {
                    this.f49547f.clear();
                    this.f49547f.append(Integer.toHexString(available));
                    this.f49517b.c(this.f49547f);
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + available);
                    this.f49517b.write(byteBuffer);
                    byteBuffer.limit(limit);
                    remaining = available;
                } else {
                    this.f49547f.clear();
                    this.f49547f.append(Integer.toHexString(remaining));
                    this.f49517b.c(this.f49547f);
                    this.f49517b.write(byteBuffer);
                }
                this.f49547f.clear();
                this.f49517b.c(this.f49547f);
                i11 += remaining;
            }
            if (this.f49517b.length() >= this.f49546e || byteBuffer.hasRemaining()) {
                if (f() == 0) {
                    break;
                }
            }
        }
        return i11;
    }

    public f(WritableByteChannel writableByteChannel, x70.k kVar, a70.v vVar) {
        this(writableByteChannel, kVar, vVar, 0);
    }
}
