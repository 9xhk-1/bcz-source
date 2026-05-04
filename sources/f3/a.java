package f3;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public short[] f50394a;

    /* renamed from: b, reason: collision with root package name */
    public int f50395b;

    public a(int i11) {
        this.f50395b = i11;
        this.f50394a = new short[1 << i11];
    }

    public static int d(short[] sArr, int i11, c cVar, int i12) throws IOException {
        int i13 = 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int a11 = cVar.a(sArr, i11 + i13);
            i13 = (i13 << 1) + a11;
            i14 |= a11 << i15;
        }
        return i14;
    }

    public int a(c cVar) throws IOException {
        int i11 = 1;
        for (int i12 = this.f50395b; i12 != 0; i12--) {
            i11 = cVar.a(this.f50394a, i11) + (i11 << 1);
        }
        return i11 - (1 << this.f50395b);
    }

    public void b() {
        c.d(this.f50394a);
    }

    public int c(c cVar) throws IOException {
        int i11 = 1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f50395b; i13++) {
            int a11 = cVar.a(this.f50394a, i11);
            i11 = (i11 << 1) + a11;
            i12 |= a11 << i13;
        }
        return i12;
    }
}
