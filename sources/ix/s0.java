package ix;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s0 extends xy.z1 implements q0 {
    /* JADX WARN: Multi-variable type inference failed */
    public s0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // xy.z1
    @m80.k
    public String toString() {
        return "Headers " + entries();
    }

    public /* synthetic */ s0(Map map, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? a00.l1.z() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(@m80.k Map<String, ? extends List<String>> values) {
        super(true, values);
        kotlin.jvm.internal.g0.p(values, "values");
    }
}
