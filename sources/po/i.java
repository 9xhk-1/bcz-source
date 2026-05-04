package po;

import com.google.common.base.Preconditions;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public abstract class i {
    public Writer a() throws IOException {
        Writer b11 = b();
        return b11 instanceof BufferedWriter ? (BufferedWriter) b11 : new BufferedWriter(b11);
    }

    public abstract Writer b() throws IOException;

    public void c(CharSequence charSequence) throws IOException {
        Preconditions.checkNotNull(charSequence);
        try {
            Writer writer = (Writer) n.c().e(b());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    @uo.a
    public long d(Readable readable) throws IOException {
        Preconditions.checkNotNull(readable);
        try {
            Writer writer = (Writer) n.c().e(b());
            long b11 = k.b(readable, writer);
            writer.flush();
            return b11;
        } finally {
        }
    }

    public void e(Iterable<? extends CharSequence> lines) throws IOException {
        f(lines, System.getProperty("line.separator"));
    }

    public void f(Iterable<? extends CharSequence> lines, String lineSeparator) throws IOException {
        Preconditions.checkNotNull(lines);
        Preconditions.checkNotNull(lineSeparator);
        try {
            Writer writer = (Writer) n.c().e(a());
            Iterator<? extends CharSequence> it = lines.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((CharSequence) lineSeparator);
            }
            writer.flush();
        } finally {
        }
    }
}
