package be;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static g2 b() {
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean d(h hVar, boolean z11, x00.a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseGuides");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            aVar = new x00.a() { // from class: be.g
                @Override // x00.a
                public final Object invoke() {
                    g2 b11;
                    b11 = h.b();
                    return b11;
                }
            };
        }
        return hVar.c(z11, aVar);
    }

    boolean c(boolean z11, @m80.k x00.a<g2> aVar);

    void e(@m80.k k kVar);
}
