package qp;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l extends c {
    @Override // qp.c, qp.g
    public int b() {
        return 2;
    }

    @Override // qp.c
    public int d(char c11, StringBuilder sb2) {
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 >= 'a' && c11 <= 'z') {
            sb2.append((char) (c11 - 'S'));
            return 1;
        }
        if (c11 < ' ') {
            sb2.append((char) 0);
            sb2.append(c11);
            return 2;
        }
        if (c11 >= '!' && c11 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - PublicSuffixDatabase.f77441i));
            return 2;
        }
        if (c11 >= ':' && c11 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '+'));
            return 2;
        }
        if (c11 >= '[' && c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 == '`') {
            sb2.append((char) 2);
            sb2.append((char) (c11 - '`'));
            return 2;
        }
        if (c11 >= 'A' && c11 <= 'Z') {
            sb2.append((char) 2);
            sb2.append((char) (c11 - '@'));
            return 2;
        }
        if (c11 < '{' || c11 > 127) {
            sb2.append("\u0001\u001e");
            return d((char) (c11 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c11 - '`'));
        return 2;
    }
}
