package m60;

import kotlin.jvm.internal.g0;
import l60.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-BufferedSource")
/* loaded from: classes8.dex */
public final class b {
    @m80.l
    public static final <T> T a(@m80.k l60.m mVar, @m80.k j1<T> options) {
        g0.p(mVar, "<this>");
        g0.p(options, "options");
        int X2 = mVar.X2(options.f());
        if (X2 == -1) {
            return null;
        }
        return options.get(X2);
    }
}
