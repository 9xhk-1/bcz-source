package ab0;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.g;
import org.koin.core.option.KoinOption;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HashMap<KoinOption, Object> f2506a = new HashMap<>();

    public final <T> T a(@k KoinOption op2, T t11) {
        g0.p(op2, "op");
        T t12 = (T) b(op2);
        if (t12 == null) {
            t12 = null;
        }
        return t12 == null ? t11 : t12;
    }

    @l
    public final <T> T b(@k KoinOption op2) {
        g0.p(op2, "op");
        T t11 = (T) this.f2506a.get(op2);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public final void c(@k Map<KoinOption, ? extends Object> values) {
        g0.p(values, "values");
        this.f2506a.putAll(values);
    }
}
