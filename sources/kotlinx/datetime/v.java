package kotlinx.datetime;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nYearMonthRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthRange.kt\nkotlinx/datetime/YearMonthProgression\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1740#2,3:279\n*S KotlinDebug\n*F\n+ 1 YearMonthRange.kt\nkotlinx/datetime/YearMonthProgression\n*L\n73#1:279,3\n*E\n"})
/* loaded from: classes8.dex */
public class v implements Collection<YearMonth>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f68530d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g10.m f68531a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final YearMonth f68532b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final YearMonth f68533c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final v a(@m80.k YearMonth rangeStart, @m80.k YearMonth rangeEnd, long j11, @m80.k b.d stepUnit) {
            g0.p(rangeStart, "rangeStart");
            g0.p(rangeEnd, "rangeEnd");
            g0.p(stepUnit, "stepUnit");
            return new v(rangeStart, rangeEnd, t40.f.o(j11, stepUnit.p()));
        }

        public a() {
        }
    }

    public v(@m80.k g10.m longProgression) {
        g0.p(longProgression, "longProgression");
        this.f68531a = longProgression;
        YearMonth.a aVar = YearMonth.Companion;
        this.f68532b = u.b(aVar, longProgression.d());
        this.f68533c = u.b(aVar, longProgression.f());
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(YearMonth yearMonth) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends YearMonth> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof YearMonth) {
            return contains((YearMonth) obj);
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
            if (!(obj instanceof YearMonth) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean d(YearMonth yearMonth) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(@m80.l Object obj) {
        return (obj instanceof v) && g0.g(this.f68531a, ((v) obj).f68531a);
    }

    /* renamed from: f */
    public boolean contains(@m80.k YearMonth value) {
        g0.p(value, "value");
        return t40.f.b(this.f68531a, u.e(value));
    }

    @m80.k
    public final YearMonth g() {
        return this.f68532b;
    }

    @m80.k
    public final YearMonth h() {
        return this.f68533c;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f68531a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f68531a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<YearMonth> iterator() {
        return new w(this.f68531a.iterator());
    }

    @m80.k
    public final g10.m j() {
        return this.f68531a;
    }

    public int k() {
        return t40.f.d(this.f68531a);
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
    public boolean removeIf(Predicate<? super YearMonth> predicate) {
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
        if (this.f68531a.g() > 0) {
            return this.f68532b + zr.m.f102856e + this.f68533c + " step " + this.f68531a.g() + io.ktor.util.date.b.f62001g;
        }
        return this.f68532b + " downTo " + this.f68533c + " step " + this.f68531a.g() + io.ktor.util.date.b.f62001g;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(this, array);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(@m80.k YearMonth start, @m80.k YearMonth endInclusive, long j11) {
        this(g10.m.f52528d.a(u.e(start), u.e(endInclusive), j11));
        g0.p(start, "start");
        g0.p(endInclusive, "endInclusive");
    }
}
