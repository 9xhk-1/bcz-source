package d1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a, reason: collision with root package name */
    public final List<k1.a<V>> f47009a;

    public n(V v11) {
        this(Collections.singletonList(new k1.a(v11)));
    }

    @Override // d1.m
    public boolean j() {
        return this.f47009a.isEmpty() || (this.f47009a.size() == 1 && this.f47009a.get(0).h());
    }

    @Override // d1.m
    public List<k1.a<V>> l() {
        return this.f47009a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f47009a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f47009a.toArray()));
        }
        return sb2.toString();
    }

    public n(List<k1.a<V>> list) {
        this.f47009a = list;
    }
}
