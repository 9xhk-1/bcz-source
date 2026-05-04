package ix;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u0 extends xy.d2 implements q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@m80.k String name, @m80.k List<String> values) {
        super(true, name, values);
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
    }

    @Override // xy.d2
    @m80.k
    public String toString() {
        return "Headers " + entries();
    }
}
