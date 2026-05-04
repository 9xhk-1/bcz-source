package k90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class h implements g {
    @Override // k90.g
    public void a(char[] cArr, int i11) {
        char c11;
        char c12 = 0;
        char c13 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            c11 = cArr[i12];
            if (c11 != '\n' && c11 != '\r') {
                if (c13 != 0) {
                    break;
                }
            } else if (c13 != 0) {
                break;
            } else {
                c13 = c11;
            }
        }
        c11 = 0;
        if (c13 == 0) {
            c12 = c11;
        } else if (c13 == '\n') {
            c13 = '\n';
        } else if (c11 == '\n') {
            c13 = '\r';
            c12 = '\n';
        } else {
            c13 = '\r';
        }
        b(c13, c12);
    }

    public abstract void b(char c11, char c12);
}
