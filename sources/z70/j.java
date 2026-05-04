package z70;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j extends f implements c {

    /* renamed from: f, reason: collision with root package name */
    public boolean f101106f;

    public j(int i11, b bVar) {
        super(i11, bVar);
        this.f101106f = false;
    }

    @Override // z70.c
    public int h(m70.a aVar) throws IOException {
        int read;
        u();
        int i11 = 0;
        while (true) {
            read = aVar.read(this.f101094c);
            if (read == -1) {
                break;
            }
            if (read != 0) {
                i11 += read;
            } else {
                if (this.f101094c.hasRemaining()) {
                    break;
                }
                r();
            }
        }
        if (read != -1 && !aVar.e()) {
            return i11;
        }
        this.f101106f = true;
        return i11;
    }

    @Override // z70.c
    public int read() throws IOException {
        if (w()) {
            return -1;
        }
        v();
        return this.f101094c.get() & 255;
    }

    @Override // z70.c
    public void reset() {
        this.f101106f = false;
        super.p();
    }

    public boolean w() {
        return !a() && this.f101106f;
    }

    public int x(byte[] bArr) throws IOException {
        if (w()) {
            return -1;
        }
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    public void y() {
        this.f101106f = true;
    }

    public j(int i11) {
        this(i11, g.f101095a);
    }

    @Override // z70.c
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (w()) {
            return -1;
        }
        if (bArr == null) {
            return 0;
        }
        v();
        if (i12 > this.f101094c.remaining()) {
            i12 = this.f101094c.remaining();
        }
        this.f101094c.get(bArr, i11, i12);
        return i12;
    }
}
