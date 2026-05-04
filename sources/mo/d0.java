package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.l6;
import java.util.AbstractSet;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public final class d0<E> extends AbstractSet<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<?, E> f73500a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f73501b;

    public d0(Map<?, E> nodeToEdgeMap, Object targetNode) {
        this.f73500a = (Map) Preconditions.checkNotNull(nodeToEdgeMap);
        this.f73501b = Preconditions.checkNotNull(targetNode);
    }

    @CheckForNull
    public final E a() {
        return this.f73500a.get(this.f73501b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public aa<E> iterator() {
        E a11 = a();
        return a11 == null ? ImmutableSet.of().iterator() : l6.X(a11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object edge) {
        E a11 = a();
        return a11 != null && a11.equals(edge);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return a() == null ? 0 : 1;
    }
}
