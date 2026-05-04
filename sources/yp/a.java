package yp;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {
    public static kp.a a(List<b> list) {
        int size = list.size() << 1;
        int i11 = size - 1;
        if (list.get(list.size() - 1).d() == null) {
            i11 = size - 2;
        }
        kp.a aVar = new kp.a(i11 * 12);
        int i12 = 0;
        int b11 = list.get(0).d().b();
        for (int i13 = 11; i13 >= 0; i13--) {
            if (((1 << i13) & b11) != 0) {
                aVar.s(i12);
            }
            i12++;
        }
        for (int i14 = 1; i14 < list.size(); i14++) {
            b bVar = list.get(i14);
            int b12 = bVar.c().b();
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & b12) != 0) {
                    aVar.s(i12);
                }
                i12++;
            }
            if (bVar.d() != null) {
                int b13 = bVar.d().b();
                for (int i16 = 11; i16 >= 0; i16--) {
                    if (((1 << i16) & b13) != 0) {
                        aVar.s(i12);
                    }
                    i12++;
                }
            }
        }
        return aVar;
    }
}
