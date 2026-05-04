package d10;

import h10.n;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c<V> implements f<Object, V> {
    private V value;

    public c(V v11) {
        this.value = v11;
    }

    public void afterChange(@k n<?> property, V v11, V v12) {
        g0.p(property, "property");
    }

    public boolean beforeChange(@k n<?> property, V v11, V v12) {
        g0.p(property, "property");
        return true;
    }

    @Override // d10.f, d10.e
    public V getValue(@l Object obj, @k n<?> property) {
        g0.p(property, "property");
        return this.value;
    }

    @Override // d10.f
    public void setValue(@l Object obj, @k n<?> property, V v11) {
        g0.p(property, "property");
        V v12 = this.value;
        if (beforeChange(property, v12, v11)) {
            this.value = v11;
            afterChange(property, v12, v11);
        }
    }

    @k
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
