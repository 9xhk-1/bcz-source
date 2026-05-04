package gz;

import h10.d;
import h10.r;
import java.lang.reflect.Type;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d<?> f57838a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final r f57839b;

    public a(@k d<?> type, @l r rVar) {
        g0.p(type, "type");
        this.f57838a = type;
        this.f57839b = rVar;
    }

    @l
    public final r a() {
        return this.f57839b;
    }

    @k
    public final d<?> b() {
        return this.f57838a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        r rVar = this.f57839b;
        if (rVar == null) {
            a aVar = (a) obj;
            if (aVar.f57839b == null) {
                return g0.g(this.f57838a, aVar.f57838a);
            }
        }
        return g0.g(rVar, ((a) obj).f57839b);
    }

    public int hashCode() {
        r rVar = this.f57839b;
        return rVar != null ? rVar.hashCode() : this.f57838a.hashCode();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TypeInfo(");
        Object obj = this.f57839b;
        if (obj == null) {
            obj = this.f57838a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ a(d dVar, r rVar, int i11, v vVar) {
        this(dVar, (i11 & 2) != 0 ? null : rVar);
    }

    public /* synthetic */ a(d dVar, Type type, r rVar, int i11, v vVar) {
        this(dVar, type, (i11 & 4) != 0 ? null : rVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @n(message = "Use constructor without reifiedType parameter.", replaceWith = @w0(expression = "TypeInfo(type, kotlinType)", imports = {}))
    public a(@k d<?> type, @k Type reifiedType, @l r rVar) {
        this(type, rVar);
        g0.p(type, "type");
        g0.p(reifiedType, "reifiedType");
    }
}
