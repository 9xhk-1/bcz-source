package o30;

import a00.a0;
import a00.w1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes8.dex */
public final class l<T> extends a00.j<T> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f75704c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Object f75705a;

    /* renamed from: b, reason: collision with root package name */
    public int f75706b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements Iterator<T>, y00.d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Iterator<T> f75707a;

        public a(@m80.k T[] array) {
            g0.p(array, "array");
            this.f75707a = kotlin.jvm.internal.h.a(array);
        }

        @Override // java.util.Iterator
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f75707a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f75707a.next();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @o
        @m80.k
        public final <T> l<T> a() {
            return new l<>(null);
        }

        @o
        @m80.k
        public final <T> l<T> b(@m80.k Collection<? extends T> set) {
            g0.p(set, "set");
            l<T> lVar = new l<>(null);
            lVar.addAll(set);
            return lVar;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements Iterator<T>, y00.d {

        /* renamed from: a, reason: collision with root package name */
        public final T f75708a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f75709b = true;

        public c(T t11) {
            this.f75708a = t11;
        }

        @Override // java.util.Iterator
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f75709b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f75709b) {
                throw new NoSuchElementException();
            }
            this.f75709b = false;
            return this.f75708a;
        }
    }

    public /* synthetic */ l(v vVar) {
        this();
    }

    @o
    @m80.k
    public static final <T> l<T> a() {
        return f75704c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t11) {
        Object[] objArr;
        if (size() == 0) {
            this.f75705a = t11;
        } else if (size() == 1) {
            if (g0.g(this.f75705a, t11)) {
                return false;
            }
            this.f75705a = new Object[]{this.f75705a, t11};
        } else if (size() < 5) {
            Object obj = this.f75705a;
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (a0.B8(objArr2, t11)) {
                return false;
            }
            if (size() == 4) {
                ?? o11 = w1.o(Arrays.copyOf(objArr2, objArr2.length));
                o11.add(t11);
                objArr = o11;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size() + 1);
                g0.o(copyOf, "copyOf(...)");
                copyOf[copyOf.length - 1] = t11;
                objArr = copyOf;
            }
            this.f75705a = objArr;
        } else {
            Object obj2 = this.f75705a;
            g0.n(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!x0.o(obj2).add(t11)) {
                return false;
            }
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f75705a = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return g0.g(this.f75705a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f75705a;
            g0.n(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return a0.B8((Object[]) obj2, obj);
        }
        Object obj3 = this.f75705a;
        g0.n(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // a00.j
    public int getSize() {
        return this.f75706b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @m80.k
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f75705a);
        }
        if (size() < 5) {
            Object obj = this.f75705a;
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f75705a;
        g0.n(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return x0.o(obj2).iterator();
    }

    public void setSize(int i11) {
        this.f75706b = i11;
    }

    public l() {
    }
}
