package z70;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends f implements d {

    /* renamed from: f, reason: collision with root package name */
    public boolean f101107f;

    public k(int i11, b bVar) {
        super(i11, bVar);
        this.f101107f = false;
    }

    @Override // z70.d
    public void f() {
        this.f101107f = true;
    }

    @Override // z70.d
    public int k(m70.c cVar) throws IOException {
        v();
        int write = cVar.write(this.f101094c);
        if (!a() && this.f101107f) {
            cVar.complete();
        }
        return write;
    }

    @Override // z70.d
    public void reset() {
        super.p();
        this.f101107f = false;
    }

    public void w() {
        this.f101107f = true;
    }

    @Override // z70.d
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (bArr == null || this.f101107f) {
            return;
        }
        u();
        q(this.f101094c.position() + i12);
        this.f101094c.put(bArr, i11, i12);
    }

    public void x(byte[] bArr) throws IOException {
        if (bArr == null || this.f101107f) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    public k(int i11) {
        this(i11, g.f101095a);
    }

    @Override // z70.d
    public void write(int i11) throws IOException {
        if (this.f101107f) {
            return;
        }
        u();
        q(d() + 1);
        this.f101094c.put((byte) i11);
    }

    @Override // z70.d
    public void flush() {
    }
}
