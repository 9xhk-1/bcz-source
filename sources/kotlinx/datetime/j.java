package kotlinx.datetime;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLocalDateRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateRange.kt\nkotlinx/datetime/LocalDateProgression\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1740#2,3:279\n*S KotlinDebug\n*F\n+ 1 LocalDateRange.kt\nkotlinx/datetime/LocalDateProgression\n*L\n73#1:279,3\n*E\n"})
/* loaded from: classes8.dex */
public class j implements Collection<LocalDate>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f68518d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g10.m f68519a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LocalDate f68520b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final LocalDate f68521c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final j a(@m80.k LocalDate rangeStart, @m80.k LocalDate rangeEnd, long j11, @m80.k b.c stepUnit) {
            g0.p(rangeStart, "rangeStart");
            g0.p(rangeEnd, "rangeEnd");
            g0.p(stepUnit, "stepUnit");
            return new j(rangeStart, rangeEnd, t40.f.o(j11, stepUnit.p()));
        }

        public a() {
        }
    }

    public j(@m80.k g10.m longProgression) {
        g0.p(longProgression, "longProgression");
        this.f68519a = longProgression;
        LocalDate.a aVar = LocalDate.Companion;
        this.f68520b = aVar.c(longProgression.d());
        this.f68521c = aVar.c(longProgression.f());
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(LocalDate localDate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends LocalDate> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof LocalDate) {
            return contains((LocalDate) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<?> elements) {
        g0.p(elements, "elements");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof LocalDate) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean d(LocalDate localDate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(@m80.l Object obj) {
        return (obj instanceof j) && g0.g(this.f68519a, ((j) obj).f68519a);
    }

    /* renamed from: f */
    public boolean contains(@m80.k LocalDate value) {
        g0.p(value, "value");
        return t40.f.b(this.f68519a, value.m6325toEpochDays());
    }

    @m80.k
    public final LocalDate g() {
        return this.f68520b;
    }

    @m80.k
    public final LocalDate h() {
        return this.f68521c;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f68519a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f68519a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<LocalDate> iterator() {
        return new k(this.f68519a.iterator());
    }

    @m80.k
    public final g10.m j() {
        return this.f68519a;
    }

    public int k() {
        return t40.f.d(this.f68519a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super LocalDate> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return k();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.u.a(this);
    }

    @m80.k
    public String toString() {
        if (this.f68519a.g() > 0) {
            return this.f68520b + zr.m.f102856e + this.f68521c + " step " + this.f68519a.g() + 'D';
        }
        return this.f68520b + " downTo " + this.f68521c + " step " + this.f68519a.g() + 'D';
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@m80.k LocalDate start, @m80.k LocalDate endInclusive, long j11) {
        this(g10.m.f52528d.a(start.m6325toEpochDays(), endInclusive.m6325toEpochDays(), j11));
        g0.p(start, "start");
        g0.p(endInclusive, "endInclusive");
    }
}
