package jz;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    public static final boolean a(@m80.k y40.b bVar) {
        g0.p(bVar, "<this>");
        return bVar.r() == 0;
    }

    @m80.k
    public static final byte[] b(@m80.k y40.b bVar, int i11) {
        g0.p(bVar, "<this>");
        return y40.g0.d(bVar, i11);
    }

    public static /* synthetic */ byte[] c(y40.b bVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = (int) bVar.r();
        }
        return b(bVar, i11);
    }
}
