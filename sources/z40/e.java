package z40;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    public static final void a(@k d dVar, @k c byteString) {
        g0.p(dVar, "<this>");
        g0.p(byteString, "byteString");
        d.c(dVar, byteString.f(), 0, 0, 6, null);
    }

    public static final void b(@k d dVar, @k byte... bytes) {
        g0.p(dVar, "<this>");
        g0.p(bytes, "bytes");
        d.c(dVar, bytes, 0, 0, 6, null);
    }

    public static final void c(@k d append, byte b11) {
        g0.p(append, "$this$append");
        append.a(b11);
    }

    @k
    public static final c d(int i11, @k l<? super d, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        d dVar = new d(i11);
        builderAction.invoke(dVar);
        return dVar.g();
    }

    public static /* synthetic */ c e(int i11, l builderAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        g0.p(builderAction, "builderAction");
        d dVar = new d(i11);
        builderAction.invoke(dVar);
        return dVar.g();
    }
}
