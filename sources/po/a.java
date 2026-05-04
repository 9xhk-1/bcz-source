package po;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public class a extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f81008a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f81009b;

    public a(Appendable target) {
        this.f81008a = (Appendable) Preconditions.checkNotNull(target);
    }

    public final void a() throws IOException {
        if (this.f81009b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81009b = true;
        Appendable appendable = this.f81008a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        a();
        Appendable appendable = this.f81008a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cbuf, int off, int len) throws IOException {
        a();
        this.f81008a.append(new String(cbuf, off, len));
    }

    @Override // java.io.Writer
    public void write(int c11) throws IOException {
        a();
        this.f81008a.append((char) c11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c11) throws IOException {
        a();
        this.f81008a.append(c11);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        Preconditions.checkNotNull(str);
        a();
        this.f81008a.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSeq) throws IOException {
        a();
        this.f81008a.append(charSeq);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSeq, int start, int end) throws IOException {
        a();
        this.f81008a.append(charSeq, start, end);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int off, int len) throws IOException {
        Preconditions.checkNotNull(str);
        a();
        this.f81008a.append(str, off, len + off);
    }
}
