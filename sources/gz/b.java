package gz;

import h10.d;
import h10.r;
import h10.y;
import java.lang.reflect.Type;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final Type b(@k r rVar) {
        g0.p(rVar, "<this>");
        return y.f(rVar);
    }

    @k
    public static final Type d(@k a aVar) {
        Type f11;
        g0.p(aVar, "<this>");
        r a11 = aVar.a();
        return (a11 == null || (f11 = y.f(a11)) == null) ? w00.b.d(aVar.b()) : f11;
    }

    public static final boolean f(@k Object obj, @k d<?> type) {
        g0.p(obj, "<this>");
        g0.p(type, "type");
        return w00.b.d(type).isInstance(obj);
    }

    @n(message = "Use TypeInfo constructor instead.", replaceWith = @w0(expression = "TypeInfo(kClass, kType)", imports = {}))
    @k
    public static final a g(@k Type reifiedType, @k d<?> kClass, @l r rVar) {
        g0.p(reifiedType, "reifiedType");
        g0.p(kClass, "kClass");
        return new a(kClass, rVar);
    }

    @n(message = "Not used anymore in common code as it was needed only for JVM target.")
    public static /* synthetic */ void a() {
    }

    @n(message = "Use KType.javaType instead.", replaceWith = @w0(expression = "this.javaType", imports = {"kotlin.reflect.javaType"}))
    public static /* synthetic */ void c(r rVar) {
    }

    public static /* synthetic */ void e(a aVar) {
    }
}
