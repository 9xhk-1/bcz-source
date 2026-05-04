package ya;

import java.io.IOException;
import java.io.OutputStream;
import ya.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final e f99728a;

    /* renamed from: b, reason: collision with root package name */
    public long f99729b;

    /* renamed from: c, reason: collision with root package name */
    public int f99730c;

    /* renamed from: d, reason: collision with root package name */
    public int f99731d = 0;

    /* renamed from: e, reason: collision with root package name */
    public e.a f99732e;

    public d(final e pack, e.a entry) {
        this.f99728a = pack;
        this.f99729b = entry.f99756b;
        this.f99730c = entry.f99758d;
        this.f99732e = entry;
    }

    @Override // java.io.OutputStream
    public void write(int b11) throws IOException {
        int i11 = this.f99731d;
        if (i11 >= this.f99730c) {
            throw new IOException("Cannt write anymore");
        }
        this.f99728a.F(this.f99729b + i11, b11);
        this.f99731d++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        int i11 = this.f99731d;
        if (i11 + byteCount <= this.f99730c) {
            this.f99728a.H(i11 + this.f99729b, buffer, byteOffset, byteCount);
            int i12 = this.f99731d + byteCount;
            this.f99731d = i12;
            if (this.f99728a.D(this.f99732e, i12)) {
                return;
            }
            this.f99730c = 0;
            return;
        }
        throw new IOException("Cannt write anymore");
    }
}
