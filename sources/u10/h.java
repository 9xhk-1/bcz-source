package u10;

import kotlin.jvm.internal.g0;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    public static final String b(n20.b bVar) {
        String b11 = bVar.g().b();
        g0.o(b11, "asString(...)");
        String y22 = f0.y2(b11, '.', '$', false, 4, null);
        if (bVar.f().d()) {
            return y22;
        }
        return bVar.f() + '.' + y22;
    }
}
