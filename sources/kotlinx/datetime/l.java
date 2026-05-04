package kotlinx.datetime;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l extends j implements g10.g<LocalDate>, g10.r<LocalDate> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f68523e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final l f68524f = new l(new LocalDate(1970, 1, 2), new LocalDate(1970, 1, 1));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final l a(@m80.k LocalDate start, @m80.k LocalDate endInclusive) {
            g0.p(start, "start");
            g0.p(endInclusive, "endInclusive");
            return new l(start, endInclusive);
        }

        @m80.k
        public final l b(@m80.k LocalDate start, @m80.k LocalDate endExclusive) {
            g0.p(start, "start");
            g0.p(endExclusive, "endExclusive");
            return g0.g(endExclusive, LocalDate.Companion.e()) ? c() : a(start, i.h(endExclusive, 1, b.Companion.b()));
        }

        @m80.k
        public final l c() {
            return l.f68524f;
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@m80.k LocalDate start, @m80.k LocalDate endInclusive) {
        super(start, endInclusive, 1L);
        g0.p(start, "start");
        g0.p(endInclusive, "endInclusive");
    }

    @Override // g10.g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean contains(@m80.k LocalDate value) {
        g0.p(value, "value");
        return g().compareTo(value) <= 0 && value.compareTo(h()) <= 0;
    }

    @Override // kotlinx.datetime.j, java.util.Collection
    public boolean isEmpty() {
        return g().compareTo(h()) > 0;
    }

    @Override // g10.r
    @m80.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LocalDate b() {
        if (g0.g(h(), LocalDate.Companion.d())) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes LocalDate.MAX.");
        }
        return i.m(getEndInclusive(), 1, b.Companion.b());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public LocalDate getEndInclusive() {
        return h();
    }

    @Override // g10.g
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LocalDate getStart() {
        return g();
    }

    @Override // kotlinx.datetime.j
    @m80.k
    public String toString() {
        return g() + zr.m.f102856e + h();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "This throws an exception if the exclusive end if not inside the platform-specific boundaries for LocalDate. The 'endInclusive' property does not throw and should be preferred.")
    public static /* synthetic */ void n() {
    }
}
