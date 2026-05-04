package la0;

import ab0.d;
import kotlin.jvm.internal.g0;
import m80.k;
import na0.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {
    @k
    public static final b a(@k b bVar) {
        g0.p(bVar, "<this>");
        d.a(bVar.d().J());
        return bVar;
    }

    @k
    public static final b b(@k b bVar, @k String fileName) {
        g0.p(bVar, "<this>");
        g0.p(fileName, "fileName");
        d.b(bVar.d().J(), fileName);
        return bVar;
    }

    public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "/koin.properties";
        }
        return b(bVar, str);
    }
}
