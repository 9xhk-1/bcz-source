package a00;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
/* loaded from: classes8.dex */
public abstract class k<E> extends b<E> implements Set<E>, y00.a {

    @m80.k
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final boolean a(@m80.k Set<?> c11, @m80.k Set<?> other) {
            kotlin.jvm.internal.g0.p(c11, "c");
            kotlin.jvm.internal.g0.p(other, "other");
            if (c11.size() != other.size()) {
                return false;
            }
            return c11.containsAll(other);
        }

        public final int b(@m80.k Collection<?> c11) {
            kotlin.jvm.internal.g0.p(c11, "c");
            Iterator<?> it = c11.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i11 += next != null ? next.hashCode() : 0;
            }
            return i11;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@m80.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return Companion.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.b(this);
    }

    @Override // a00.b, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
