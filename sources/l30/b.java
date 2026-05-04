package l30;

import java.util.List;
import kotlin.jvm.internal.g0;
import l30.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b {
    @m80.k
    public final g a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(functionDescriptor)) {
                return hVar.a(functionDescriptor);
            }
        }
        return g.a.f69773b;
    }

    @m80.k
    public abstract List<h> b();
}
