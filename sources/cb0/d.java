package cb0;

import kotlin.jvm.internal.g0;
import m80.l;
import w00.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {
    @k
    @m80.k
    public static final <T> T a(@m80.k b bVar, @m80.k Class<?> clazz) {
        g0.p(bVar, "<this>");
        g0.p(clazz, "clazz");
        return (T) d(bVar, clazz, null, null, 6, null);
    }

    @k
    @m80.k
    public static final <T> T b(@m80.k b bVar, @m80.k Class<?> clazz, @l za0.a aVar) {
        g0.p(bVar, "<this>");
        g0.p(clazz, "clazz");
        return (T) d(bVar, clazz, aVar, null, 4, null);
    }

    @k
    @m80.k
    public static final <T> T c(@m80.k b bVar, @m80.k Class<?> clazz, @l za0.a aVar, @l x00.a<? extends ya0.a> aVar2) {
        g0.p(bVar, "<this>");
        g0.p(clazz, "clazz");
        return (T) bVar.i(w00.b.i(clazz), aVar, aVar2);
    }

    public static /* synthetic */ Object d(b bVar, Class cls, za0.a aVar, x00.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        return c(bVar, cls, aVar, aVar2);
    }
}
