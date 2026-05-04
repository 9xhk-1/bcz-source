package d10;

import h10.n;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public T f47013a;

    @Override // d10.f, d10.e
    @k
    public T getValue(@l Object obj, @k n<?> property) {
        g0.p(property, "property");
        T t11 = this.f47013a;
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // d10.f
    public void setValue(@l Object obj, @k n<?> property, @k T value) {
        g0.p(property, "property");
        g0.p(value, "value");
        this.f47013a = value;
    }

    @k
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotNullProperty(");
        if (this.f47013a != null) {
            str = "value=" + this.f47013a;
        } else {
            str = "value not initialized yet";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}
