package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class n6<T> extends s7<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator<? super T> f33685c;

    public n6(Comparator<? super T> elementOrder) {
        this.f33685c = elementOrder;
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public int compare(Iterable<T> leftIterable, Iterable<T> rightIterable) {
        Iterator<T> it = leftIterable.iterator();
        Iterator<T> it2 = rightIterable.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare = this.f33685c.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n6) {
            return this.f33685c.equals(((n6) object).f33685c);
        }
        return false;
    }

    public int hashCode() {
        return this.f33685c.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f33685c + ".lexicographical()";
    }
}
