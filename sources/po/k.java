package po;

import com.google.common.base.Preconditions;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f81066a = 2048;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        public static final a f81067a = new a();

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int c11) {
        }

        @Override // java.io.Writer
        public void write(char[] cbuf) {
            Preconditions.checkNotNull(cbuf);
        }

        @Override // java.io.Writer
        public void write(char[] cbuf, int off, int len) {
            Preconditions.checkPositionIndexes(off, len + off, cbuf.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@CheckForNull CharSequence csq) {
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@CheckForNull CharSequence csq, int start, int end) {
            Preconditions.checkPositionIndexes(start, end, csq == null ? 4 : csq.length());
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int off, int len) {
            Preconditions.checkPositionIndexes(off, len + off, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c11) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static Writer a(Appendable target) {
        return target instanceof Writer ? (Writer) target : new po.a(target);
    }

    @uo.a
    public static long b(Readable from, Appendable to2) throws IOException {
        if (from instanceof Reader) {
            return to2 instanceof StringBuilder ? c((Reader) from, (StringBuilder) to2) : d((Reader) from, a(to2));
        }
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to2);
        CharBuffer e11 = e();
        long j11 = 0;
        while (from.read(e11) != -1) {
            v.b(e11);
            to2.append(e11);
            j11 += e11.remaining();
            v.a(e11);
        }
        return j11;
    }

    @uo.a
    public static long c(Reader from, StringBuilder to2) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to2);
        char[] cArr = new char[2048];
        long j11 = 0;
        while (true) {
            int read = from.read(cArr);
            if (read == -1) {
                return j11;
            }
            to2.append(cArr, 0, read);
            j11 += read;
        }
    }

    @uo.a
    public static long d(Reader from, Writer to2) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to2);
        char[] cArr = new char[2048];
        long j11 = 0;
        while (true) {
            int read = from.read(cArr);
            if (read == -1) {
                return j11;
            }
            to2.write(cArr, 0, read);
            j11 += read;
        }
    }

    public static CharBuffer e() {
        return CharBuffer.allocate(2048);
    }

    @uo.a
    public static long f(Readable readable) throws IOException {
        CharBuffer e11 = e();
        long j11 = 0;
        while (true) {
            long read = readable.read(e11);
            if (read == -1) {
                return j11;
            }
            j11 += read;
            v.a(e11);
        }
    }

    public static Writer g() {
        return a.f81067a;
    }

    @d0
    @uo.a
    public static <T> T h(Readable readable, x<T> processor) throws IOException {
        String b11;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(processor);
        y yVar = new y(readable);
        do {
            b11 = yVar.b();
            if (b11 == null) {
                break;
            }
        } while (processor.a(b11));
        return processor.getResult();
    }

    public static List<String> i(Readable r11) throws IOException {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(r11);
        while (true) {
            String b11 = yVar.b();
            if (b11 == null) {
                return arrayList;
            }
            arrayList.add(b11);
        }
    }

    public static void j(Reader reader, long n11) throws IOException {
        Preconditions.checkNotNull(reader);
        while (n11 > 0) {
            long skip = reader.skip(n11);
            if (skip == 0) {
                throw new EOFException();
            }
            n11 -= skip;
        }
    }

    public static String k(Readable r11) throws IOException {
        return l(r11).toString();
    }

    public static StringBuilder l(Readable r11) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (r11 instanceof Reader) {
            c((Reader) r11, sb2);
            return sb2;
        }
        b(r11, sb2);
        return sb2;
    }
}
