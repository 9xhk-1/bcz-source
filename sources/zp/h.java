package zp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h extends j {

    /* renamed from: c, reason: collision with root package name */
    public static final int f102793c = 40;

    public h(kp.a aVar) {
        super(aVar);
    }

    public static void e(StringBuilder sb2, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 13; i13++) {
            int charAt = sb2.charAt(i13 + i11) - '0';
            if ((i13 & 1) == 0) {
                charAt *= 3;
            }
            i12 += charAt;
        }
        int i14 = 10 - (i12 % 10);
        sb2.append(i14 != 10 ? i14 : 0);
    }

    public final void f(StringBuilder sb2, int i11) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        g(sb2, i11, length);
    }

    public final void g(StringBuilder sb2, int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            int f11 = b().f((i13 * 10) + i11, 10);
            if (f11 / 100 == 0) {
                sb2.append('0');
            }
            if (f11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f11);
        }
        e(sb2, i12);
    }
}
