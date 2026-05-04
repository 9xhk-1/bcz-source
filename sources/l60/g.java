package l60;

import java.util.zip.Inflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-InflaterSourceExtensions")
/* loaded from: classes8.dex */
public final class g {
    @m80.k
    public static final c0 a(@m80.k g1 g1Var, @m80.k Inflater inflater) {
        kotlin.jvm.internal.g0.p(g1Var, "<this>");
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return new c0(g1Var, inflater);
    }

    public static /* synthetic */ c0 b(g1 g1Var, Inflater inflater, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.g0.p(g1Var, "<this>");
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        return new c0(g1Var, inflater);
    }
}
