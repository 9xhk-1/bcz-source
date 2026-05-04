package f30;

import f30.f;
import f30.g;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @m80.k
    public static final TypeCheckerState a(boolean z11, boolean z12, @m80.k b typeSystemContext, @m80.k f kotlinTypePreparator, @m80.k g kotlinTypeRefiner) {
        g0.p(typeSystemContext, "typeSystemContext");
        g0.p(kotlinTypePreparator, "kotlinTypePreparator");
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new TypeCheckerState(z11, z12, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ TypeCheckerState b(boolean z11, boolean z12, b bVar, f fVar, g gVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            bVar = u.f50458a;
        }
        if ((i11 & 8) != 0) {
            fVar = f.a.f50431a;
        }
        if ((i11 & 16) != 0) {
            gVar = g.a.f50432a;
        }
        return a(z11, z12, bVar, fVar, gVar);
    }
}
