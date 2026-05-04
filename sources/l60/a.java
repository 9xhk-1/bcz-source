package l60;

import java.util.zip.Deflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-DeflaterSinkExtensions")
/* loaded from: classes8.dex */
public final class a {
    @m80.k
    public static final p a(@m80.k e1 e1Var, @m80.k Deflater deflater) {
        kotlin.jvm.internal.g0.p(e1Var, "<this>");
        kotlin.jvm.internal.g0.p(deflater, "deflater");
        return new p(e1Var, deflater);
    }

    public static /* synthetic */ p b(e1 e1Var, Deflater deflater, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.g0.p(e1Var, "<this>");
        kotlin.jvm.internal.g0.p(deflater, "deflater");
        return new p(e1Var, deflater);
    }
}
