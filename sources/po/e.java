package po;

import com.google.common.base.Preconditions;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public abstract class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f81014a;

        @Override // po.i
        public Writer b() throws IOException {
            return new OutputStreamWriter(e.this.c(), this.f81014a);
        }

        public String toString() {
            return e.this.toString() + ".asCharSink(" + this.f81014a + pn.j.f81007d;
        }

        public b(Charset charset) {
            this.f81014a = (Charset) Preconditions.checkNotNull(charset);
        }
    }

    public i a(Charset charset) {
        return new b(charset);
    }

    public OutputStream b() throws IOException {
        OutputStream c11 = c();
        return c11 instanceof BufferedOutputStream ? (BufferedOutputStream) c11 : new BufferedOutputStream(c11);
    }

    public abstract OutputStream c() throws IOException;

    public void d(byte[] bytes) throws IOException {
        Preconditions.checkNotNull(bytes);
        try {
            OutputStream outputStream = (OutputStream) n.c().e(c());
            outputStream.write(bytes);
            outputStream.flush();
        } finally {
        }
    }

    @uo.a
    public long e(InputStream input) throws IOException {
        Preconditions.checkNotNull(input);
        try {
            OutputStream outputStream = (OutputStream) n.c().e(c());
            long b11 = g.b(input, outputStream);
            outputStream.flush();
            return b11;
        } finally {
        }
    }
}
