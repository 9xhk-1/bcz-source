package zp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class i extends h {
    public i(kp.a aVar) {
        super(aVar);
    }

    public abstract void h(StringBuilder sb2, int i11);

    public abstract int i(int i11);

    public final void j(StringBuilder sb2, int i11, int i12) {
        int f11 = b().f(i11, i12);
        h(sb2, f11);
        int i13 = i(f11);
        int i14 = 100000;
        for (int i15 = 0; i15 < 5; i15++) {
            if (i13 / i14 == 0) {
                sb2.append('0');
            }
            i14 /= 10;
        }
        sb2.append(i13);
    }
}
