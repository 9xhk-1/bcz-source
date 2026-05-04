package l70;

import java.util.NoSuchElementException;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c implements org.apache.http.g {

    /* renamed from: a, reason: collision with root package name */
    public final org.apache.http.h f70675a;

    /* renamed from: b, reason: collision with root package name */
    public final o f70676b;

    /* renamed from: c, reason: collision with root package name */
    public org.apache.http.f f70677c;

    /* renamed from: d, reason: collision with root package name */
    public CharArrayBuffer f70678d;

    /* renamed from: e, reason: collision with root package name */
    public r f70679e;

    public c(org.apache.http.h hVar, o oVar) {
        this.f70677c = null;
        this.f70678d = null;
        this.f70679e = null;
        this.f70675a = (org.apache.http.h) e80.a.j(hVar, "Header iterator");
        this.f70676b = (o) e80.a.j(oVar, "Parser");
    }

    public final void a() {
        this.f70679e = null;
        this.f70678d = null;
        while (this.f70675a.hasNext()) {
            org.apache.http.e r11 = this.f70675a.r();
            if (r11 instanceof org.apache.http.d) {
                org.apache.http.d dVar = (org.apache.http.d) r11;
                CharArrayBuffer buffer = dVar.getBuffer();
                this.f70678d = buffer;
                r rVar = new r(0, buffer.length());
                this.f70679e = rVar;
                rVar.e(dVar.getValuePos());
                return;
            }
            String value = r11.getValue();
            if (value != null) {
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(value.length());
                this.f70678d = charArrayBuffer;
                charArrayBuffer.append(value);
                this.f70679e = new r(0, this.f70678d.length());
                return;
            }
        }
    }

    public final void b() {
        org.apache.http.f b11;
        loop0: while (true) {
            if (!this.f70675a.hasNext() && this.f70679e == null) {
                return;
            }
            r rVar = this.f70679e;
            if (rVar == null || rVar.a()) {
                a();
            }
            if (this.f70679e != null) {
                while (!this.f70679e.a()) {
                    b11 = this.f70676b.b(this.f70678d, this.f70679e);
                    if (!b11.getName().isEmpty() || b11.getValue() != null) {
                        break loop0;
                    }
                }
                if (this.f70679e.a()) {
                    this.f70679e = null;
                    this.f70678d = null;
                }
            }
        }
        this.f70677c = b11;
    }

    @Override // org.apache.http.g, java.util.Iterator
    public boolean hasNext() {
        if (this.f70677c == null) {
            b();
        }
        return this.f70677c != null;
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    @Override // org.apache.http.g
    public org.apache.http.f nextElement() throws NoSuchElementException {
        if (this.f70677c == null) {
            b();
        }
        org.apache.http.f fVar = this.f70677c;
        if (fVar == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        this.f70677c = null;
        return fVar;
    }

    @Override // java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public c(org.apache.http.h hVar) {
        this(hVar, f.f70688c);
    }
}
