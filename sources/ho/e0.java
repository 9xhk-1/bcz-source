package ho;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class e0<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Equivalence<E> f59609a;

    public e0(Equivalence<E> elementEquivalence) {
        this.f59609a = (Equivalence) Preconditions.checkNotNull(elementEquivalence);
    }

    public boolean equals(@CheckForNull Object object) {
        if (object instanceof e0) {
            return this.f59609a.equals(((e0) object).f59609a);
        }
        return false;
    }

    public int hashCode() {
        return this.f59609a.hashCode() ^ 1185147655;
    }

    @Override // com.google.common.base.Equivalence
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean a(Iterable<T> iterableA, Iterable<T> iterableB) {
        Iterator<T> it = iterableA.iterator();
        Iterator<T> it2 = iterableB.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.f59609a.d(it.next(), it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // com.google.common.base.Equivalence
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public int b(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int i11 = 78721;
        while (it.hasNext()) {
            i11 = (i11 * 24943) + this.f59609a.f(it.next());
        }
        return i11;
    }

    public String toString() {
        return this.f59609a + ".pairwise()";
    }
}
