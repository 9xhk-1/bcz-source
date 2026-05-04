package qp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements g {
    public static char c(char c11, char c12) {
        if (j.g(c11) && j.g(c12)) {
            return (char) (((c11 - '0') * 10) + (c12 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c11 + c12);
    }

    @Override // qp.g
    public void a(h hVar) {
        if (j.a(hVar.e(), hVar.f82595f) >= 2) {
            hVar.s(c(hVar.e().charAt(hVar.f82595f), hVar.e().charAt(hVar.f82595f + 1)));
            hVar.f82595f += 2;
            return;
        }
        char d11 = hVar.d();
        int o11 = j.o(hVar.e(), hVar.f82595f, b());
        if (o11 == b()) {
            if (!j.h(d11)) {
                hVar.s((char) (d11 + 1));
                hVar.f82595f++;
                return;
            } else {
                hVar.s(j.f82607d);
                hVar.s((char) (d11 - 127));
                hVar.f82595f++;
                return;
            }
        }
        if (o11 == 1) {
            hVar.s(j.f82605b);
            hVar.p(1);
            return;
        }
        if (o11 == 2) {
            hVar.s(j.f82611h);
            hVar.p(2);
            return;
        }
        if (o11 == 3) {
            hVar.s(j.f82610g);
            hVar.p(3);
        } else if (o11 == 4) {
            hVar.s(j.f82612i);
            hVar.p(4);
        } else {
            if (o11 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(o11)));
            }
            hVar.s(j.f82606c);
            hVar.p(5);
        }
    }

    @Override // qp.g
    public int b() {
        return 0;
    }
}
