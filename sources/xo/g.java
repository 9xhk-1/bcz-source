package xo;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g extends cp.c {

    /* renamed from: p, reason: collision with root package name */
    public static final Writer f98169p = new a();

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.gson.n f98170q = new com.google.gson.n("closed");

    /* renamed from: m, reason: collision with root package name */
    public final List<com.google.gson.j> f98171m;

    /* renamed from: n, reason: collision with root package name */
    public String f98172n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.gson.j f98173o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f98169p);
        this.f98171m = new ArrayList();
        this.f98173o = com.google.gson.k.f35047a;
    }

    public final void A0(com.google.gson.j jVar) {
        if (this.f98172n != null) {
            if (!jVar.v() || q()) {
                ((com.google.gson.l) z0()).y(this.f98172n, jVar);
            }
            this.f98172n = null;
            return;
        }
        if (this.f98171m.isEmpty()) {
            this.f98173o = jVar;
            return;
        }
        com.google.gson.j z02 = z0();
        if (!(z02 instanceof com.google.gson.g)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.g) z02).y(jVar);
    }

    @Override // cp.c
    public cp.c H(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f98171m.isEmpty() || this.f98172n != null) {
            throw new IllegalStateException();
        }
        if (!(z0() instanceof com.google.gson.l)) {
            throw new IllegalStateException();
        }
        this.f98172n = str;
        return this;
    }

    @Override // cp.c
    public cp.c L() throws IOException {
        A0(com.google.gson.k.f35047a);
        return this;
    }

    @Override // cp.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f98171m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f98171m.add(f98170q);
    }

    @Override // cp.c
    public cp.c e() throws IOException {
        com.google.gson.g gVar = new com.google.gson.g();
        A0(gVar);
        this.f98171m.add(gVar);
        return this;
    }

    @Override // cp.c
    public cp.c f() throws IOException {
        com.google.gson.l lVar = new com.google.gson.l();
        A0(lVar);
        this.f98171m.add(lVar);
        return this;
    }

    @Override // cp.c
    public cp.c i0(double d11) throws IOException {
        if (w() || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            A0(new com.google.gson.n(Double.valueOf(d11)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d11);
    }

    @Override // cp.c
    public cp.c j() throws IOException {
        if (this.f98171m.isEmpty() || this.f98172n != null) {
            throw new IllegalStateException();
        }
        if (!(z0() instanceof com.google.gson.g)) {
            throw new IllegalStateException();
        }
        this.f98171m.remove(r0.size() - 1);
        return this;
    }

    @Override // cp.c
    public cp.c k() throws IOException {
        if (this.f98171m.isEmpty() || this.f98172n != null) {
            throw new IllegalStateException();
        }
        if (!(z0() instanceof com.google.gson.l)) {
            throw new IllegalStateException();
        }
        this.f98171m.remove(r0.size() - 1);
        return this;
    }

    @Override // cp.c
    public cp.c k0(float f11) throws IOException {
        if (w() || !(Float.isNaN(f11) || Float.isInfinite(f11))) {
            A0(new com.google.gson.n(Float.valueOf(f11)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f11);
    }

    @Override // cp.c
    public cp.c m0(long j11) throws IOException {
        A0(new com.google.gson.n(Long.valueOf(j11)));
        return this;
    }

    @Override // cp.c
    public cp.c o0(Boolean bool) throws IOException {
        if (bool == null) {
            return L();
        }
        A0(new com.google.gson.n(bool));
        return this;
    }

    @Override // cp.c
    public cp.c s0(Number number) throws IOException {
        if (number == null) {
            return L();
        }
        if (!w()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        A0(new com.google.gson.n(number));
        return this;
    }

    @Override // cp.c
    public cp.c v0(String str) throws IOException {
        if (str == null) {
            return L();
        }
        A0(new com.google.gson.n(str));
        return this;
    }

    @Override // cp.c
    public cp.c w0(boolean z11) throws IOException {
        A0(new com.google.gson.n(Boolean.valueOf(z11)));
        return this;
    }

    public com.google.gson.j y0() {
        if (this.f98171m.isEmpty()) {
            return this.f98173o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f98171m);
    }

    public final com.google.gson.j z0() {
        return this.f98171m.get(r0.size() - 1);
    }

    @Override // cp.c, java.io.Flushable
    public void flush() throws IOException {
    }
}
