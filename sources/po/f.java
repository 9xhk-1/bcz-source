package po;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public abstract class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f81017a;

        public a(Charset charset) {
            this.f81017a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // po.j
        public f a(Charset charset) {
            return charset.equals(this.f81017a) ? f.this : super.a(charset);
        }

        @Override // po.j
        public Reader m() throws IOException {
            return new InputStreamReader(f.this.m(), this.f81017a);
        }

        @Override // po.j
        public String n() throws IOException {
            return new String(f.this.o(), this.f81017a);
        }

        public String toString() {
            return f.this.toString() + ".asCharSource(" + this.f81017a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f81019a;

        /* renamed from: b, reason: collision with root package name */
        public final int f81020b;

        /* renamed from: c, reason: collision with root package name */
        public final int f81021c;

        public b(byte[] bytes) {
            this(bytes, 0, bytes.length);
        }

        @Override // po.f
        public long f(OutputStream output) throws IOException {
            output.write(this.f81019a, this.f81020b, this.f81021c);
            return this.f81021c;
        }

        @Override // po.f
        public no.m j(no.n hashFunction) throws IOException {
            return hashFunction.k(this.f81019a, this.f81020b, this.f81021c);
        }

        @Override // po.f
        public boolean k() {
            return this.f81021c == 0;
        }

        @Override // po.f
        public InputStream l() {
            return m();
        }

        @Override // po.f
        public InputStream m() {
            return new ByteArrayInputStream(this.f81019a, this.f81020b, this.f81021c);
        }

        @Override // po.f
        @d0
        public <T> T n(po.d<T> processor) throws IOException {
            processor.a(this.f81019a, this.f81020b, this.f81021c);
            return processor.getResult();
        }

        @Override // po.f
        public byte[] o() {
            byte[] bArr = this.f81019a;
            int i11 = this.f81020b;
            return Arrays.copyOfRange(bArr, i11, this.f81021c + i11);
        }

        @Override // po.f
        public long p() {
            return this.f81021c;
        }

        @Override // po.f
        public Optional<Long> q() {
            return Optional.of(Long.valueOf(this.f81021c));
        }

        @Override // po.f
        public f r(long offset, long length) {
            Preconditions.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            Preconditions.checkArgument(length >= 0, "length (%s) may not be negative", length);
            long min = Math.min(offset, this.f81021c);
            return new b(this.f81019a, this.f81020b + ((int) min), (int) Math.min(length, this.f81021c - min));
        }

        public String toString() {
            return "ByteSource.wrap(" + ho.c.k(BaseEncoding.a().m(this.f81019a, this.f81020b, this.f81021c), 30, "...") + pn.j.f81007d;
        }

        public b(byte[] bytes, int offset, int length) {
            this.f81019a = bytes;
            this.f81020b = offset;
            this.f81021c = length;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public final Iterable<? extends f> f81022a;

        public c(Iterable<? extends f> sources) {
            this.f81022a = (Iterable) Preconditions.checkNotNull(sources);
        }

        @Override // po.f
        public boolean k() throws IOException {
            Iterator<? extends f> it = this.f81022a.iterator();
            while (it.hasNext()) {
                if (!it.next().k()) {
                    return false;
                }
            }
            return true;
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return new b0(this.f81022a.iterator());
        }

        @Override // po.f
        public long p() throws IOException {
            Iterator<? extends f> it = this.f81022a.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                j11 += it.next().p();
                if (j11 < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j11;
        }

        @Override // po.f
        public Optional<Long> q() {
            Iterable<? extends f> iterable = this.f81022a;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            Iterator<? extends f> it = iterable.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                Optional<Long> q11 = it.next().q();
                if (!q11.isPresent()) {
                    return Optional.absent();
                }
                j11 += q11.get().longValue();
                if (j11 < 0) {
                    return Optional.of(Long.MAX_VALUE);
                }
            }
            return Optional.of(Long.valueOf(j11));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f81022a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends b {

        /* renamed from: d, reason: collision with root package name */
        public static final d f81023d = new d();

        public d() {
            super(new byte[0]);
        }

        @Override // po.f
        public j a(Charset charset) {
            Preconditions.checkNotNull(charset);
            return j.h();
        }

        @Override // po.f.b, po.f
        public byte[] o() {
            return this.f81019a;
        }

        @Override // po.f.b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends f {

        /* renamed from: a, reason: collision with root package name */
        public final long f81024a;

        /* renamed from: b, reason: collision with root package name */
        public final long f81025b;

        public e(long offset, long length) {
            Preconditions.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            Preconditions.checkArgument(length >= 0, "length (%s) may not be negative", length);
            this.f81024a = offset;
            this.f81025b = length;
        }

        @Override // po.f
        public boolean k() throws IOException {
            return this.f81025b == 0 || super.k();
        }

        @Override // po.f
        public InputStream l() throws IOException {
            return t(f.this.l());
        }

        @Override // po.f
        public InputStream m() throws IOException {
            return t(f.this.m());
        }

        @Override // po.f
        public Optional<Long> q() {
            Optional<Long> q11 = f.this.q();
            if (!q11.isPresent()) {
                return Optional.absent();
            }
            long longValue = q11.get().longValue();
            return Optional.of(Long.valueOf(Math.min(this.f81025b, longValue - Math.min(this.f81024a, longValue))));
        }

        @Override // po.f
        public f r(long offset, long length) {
            Preconditions.checkArgument(offset >= 0, "offset (%s) may not be negative", offset);
            Preconditions.checkArgument(length >= 0, "length (%s) may not be negative", length);
            long j11 = this.f81025b - offset;
            return j11 <= 0 ? f.i() : f.this.r(this.f81024a + offset, Math.min(length, j11));
        }

        public final InputStream t(InputStream in2) throws IOException {
            long j11 = this.f81024a;
            if (j11 > 0) {
                try {
                    if (g.t(in2, j11) < this.f81024a) {
                        in2.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return g.f(in2, this.f81025b);
        }

        public String toString() {
            return f.this.toString() + ".slice(" + this.f81024a + j2.O + this.f81025b + pn.j.f81007d;
        }
    }

    public static f b(Iterable<? extends f> sources) {
        return new c(sources);
    }

    public static f c(Iterator<? extends f> sources) {
        return b(ImmutableList.copyOf(sources));
    }

    public static f d(f... sources) {
        return b(ImmutableList.copyOf(sources));
    }

    public static f i() {
        return d.f81023d;
    }

    public static f s(byte[] b11) {
        return new b(b11);
    }

    public j a(Charset charset) {
        return new a(charset);
    }

    public boolean e(f other) throws IOException {
        int n11;
        Preconditions.checkNotNull(other);
        byte[] d11 = g.d();
        byte[] d12 = g.d();
        n c11 = n.c();
        try {
            InputStream inputStream = (InputStream) c11.e(m());
            InputStream inputStream2 = (InputStream) c11.e(other.m());
            do {
                n11 = g.n(inputStream, d11, 0, d11.length);
                if (n11 == g.n(inputStream2, d12, 0, d12.length) && Arrays.equals(d11, d12)) {
                }
                return false;
            } while (n11 == d11.length);
            c11.close();
            return true;
        } finally {
        }
    }

    @uo.a
    public long f(OutputStream output) throws IOException {
        Preconditions.checkNotNull(output);
        try {
            return g.b((InputStream) n.c().e(m()), output);
        } finally {
        }
    }

    @uo.a
    public long g(po.e sink) throws IOException {
        Preconditions.checkNotNull(sink);
        n c11 = n.c();
        try {
            return g.b((InputStream) c11.e(m()), (OutputStream) c11.e(sink.c()));
        } finally {
        }
    }

    public final long h(InputStream in2) throws IOException {
        long j11 = 0;
        while (true) {
            long t11 = g.t(in2, SieveCacheKt.NodeLinkMask);
            if (t11 <= 0) {
                return j11;
            }
            j11 += t11;
        }
    }

    public no.m j(no.n hashFunction) throws IOException {
        no.o i11 = hashFunction.i();
        f(no.l.a(i11));
        return i11.h();
    }

    public boolean k() throws IOException {
        Optional<Long> q11 = q();
        if (q11.isPresent()) {
            return q11.get().longValue() == 0;
        }
        try {
            return ((InputStream) n.c().e(m())).read() == -1;
        } finally {
        }
    }

    public InputStream l() throws IOException {
        InputStream m11 = m();
        return m11 instanceof BufferedInputStream ? (BufferedInputStream) m11 : new BufferedInputStream(m11);
    }

    public abstract InputStream m() throws IOException;

    @d0
    @uo.a
    public <T> T n(po.d<T> dVar) throws IOException {
        Preconditions.checkNotNull(dVar);
        try {
            return (T) g.o((InputStream) n.c().e(m()), dVar);
        } finally {
        }
    }

    public byte[] o() throws IOException {
        n c11 = n.c();
        try {
            InputStream inputStream = (InputStream) c11.e(m());
            Optional<Long> q11 = q();
            return q11.isPresent() ? g.v(inputStream, q11.get().longValue()) : g.u(inputStream);
        } catch (Throwable th2) {
            try {
                throw c11.f(th2);
            } finally {
                c11.close();
            }
        }
    }

    public long p() throws IOException {
        Optional<Long> q11 = q();
        if (q11.isPresent()) {
            return q11.get().longValue();
        }
        n c11 = n.c();
        try {
            return h((InputStream) c11.e(m()));
        } catch (IOException unused) {
            c11.close();
            try {
                return g.e((InputStream) n.c().e(m()));
            } finally {
            }
        } finally {
        }
    }

    public Optional<Long> q() {
        return Optional.absent();
    }

    public f r(long offset, long length) {
        return new e(offset, length);
    }
}
