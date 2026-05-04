package a3;

import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e1 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final Writer f1500a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<String> f1501b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: c, reason: collision with root package name */
    public String f1502c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1503d;

    /* renamed from: e, reason: collision with root package name */
    public int f1504e;

    public e1(Writer writer) {
        this.f1500a = writer;
    }

    public e1 a(String str, Object obj) throws IOException {
        if (this.f1502c == null) {
            throw new IllegalStateException();
        }
        this.f1500a.write(32);
        this.f1500a.write(str);
        this.f1500a.write("=\"");
        this.f1500a.write(obj == null ? "null" : obj.toString());
        this.f1500a.write(34);
        return this;
    }

    public e1 c(String str) throws IOException {
        if (k()) {
            this.f1500a.write(10);
        }
        f();
        this.f1500a.write(60);
        this.f1500a.write(str);
        this.f1502c = str;
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f1501b.f13179b != 0) {
            j();
        }
        this.f1500a.close();
    }

    public e1 e(String str, Object obj) throws IOException {
        return c(str).q(obj).j();
    }

    public final void f() throws IOException {
        int i11 = this.f1504e;
        if (this.f1502c != null) {
            i11++;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1500a.write(9);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f1500a.flush();
    }

    public e1 j() throws IOException {
        if (this.f1502c != null) {
            this.f1500a.write("/>\n");
            this.f1502c = null;
        } else {
            this.f1504e = Math.max(this.f1504e - 1, 0);
            if (this.f1503d) {
                f();
            }
            this.f1500a.write("</");
            this.f1500a.write(this.f1501b.pop());
            this.f1500a.write(">\n");
        }
        this.f1503d = true;
        return this;
    }

    public final boolean k() throws IOException {
        String str = this.f1502c;
        if (str == null) {
            return false;
        }
        this.f1504e++;
        this.f1501b.a(str);
        this.f1502c = null;
        this.f1500a.write(">");
        return true;
    }

    public e1 q(Object obj) throws IOException {
        k();
        String obj2 = obj == null ? "null" : obj.toString();
        boolean z11 = obj2.length() > 64;
        this.f1503d = z11;
        if (z11) {
            this.f1500a.write(10);
            f();
        }
        this.f1500a.write(obj2);
        if (this.f1503d) {
            this.f1500a.write(10);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) throws IOException {
        k();
        this.f1500a.write(cArr, i11, i12);
    }
}
