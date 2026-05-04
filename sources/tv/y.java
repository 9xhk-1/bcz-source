package tv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final String f90980b = "Set contributions cannot be null";

    /* renamed from: a, reason: collision with root package name */
    public final List<T> f90981a;

    public y(int estimatedSize) {
        this.f90981a = new ArrayList(estimatedSize);
    }

    public static <T> y<T> d(int estimatedSize) {
        return new y<>(estimatedSize);
    }

    public y<T> a(T t11) {
        this.f90981a.add(s.c(t11, f90980b));
        return this;
    }

    public y<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            s.c(it.next(), f90980b);
        }
        this.f90981a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        return this.f90981a.isEmpty() ? Collections.EMPTY_SET : this.f90981a.size() == 1 ? Collections.singleton(this.f90981a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f90981a));
    }
}
