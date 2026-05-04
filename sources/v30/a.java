package v30;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import u30.m;
import u30.n;
import w00.j;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes8.dex */
public final class a {
    @l
    @y0(version = "1.2")
    public static final u30.l a(@k m mVar, @k String name) {
        g0.p(mVar, "<this>");
        g0.p(name, "name");
        n nVar = mVar instanceof n ? (n) mVar : null;
        if (nVar != null) {
            return nVar.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
