package kotlinx.datetime;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x extends v implements g10.g<YearMonth>, g10.r<YearMonth> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f68535e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final x f68536f = new x(new YearMonth(0, 2), new YearMonth(0, 1));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final x a(@m80.k YearMonth start, @m80.k YearMonth endInclusive) {
            g0.p(start, "start");
            g0.p(endInclusive, "endInclusive");
            return new x(start, endInclusive);
        }

        @m80.k
        public final x b(@m80.k YearMonth start, @m80.k YearMonth endExclusive) {
            g0.p(start, "start");
            g0.p(endExclusive, "endExclusive");
            return g0.g(endExclusive, u.d(YearMonth.Companion)) ? c() : a(start, u.g(endExclusive, 1, b.Companion.g()));
        }

        @m80.k
        public final x c() {
            return x.f68536f;
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@m80.k YearMonth start, @m80.k YearMonth endInclusive) {
        super(start, endInclusive, 1L);
        g0.p(start, "start");
        g0.p(endInclusive, "endInclusive");
    }

    @Override // g10.g
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean contains(@m80.k YearMonth value) {
        g0.p(value, "value");
        return g().compareTo(value) <= 0 && value.compareTo(h()) <= 0;
    }

    @Override // kotlinx.datetime.v, java.util.Collection
    public boolean isEmpty() {
        return g().compareTo(h()) > 0;
    }

    @Override // g10.r
    @m80.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public YearMonth b() {
        if (g0.g(h(), u.c(YearMonth.Companion))) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes YearMonth.MAX.");
        }
        return u.m(getEndInclusive(), 1, b.Companion.g());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public YearMonth getEndInclusive() {
        return h();
    }

    @Override // g10.g
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public YearMonth getStart() {
        return g();
    }

    @Override // kotlinx.datetime.v
    @m80.k
    public String toString() {
        return g() + zr.m.f102856e + h();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "This throws an exception if the exclusive end if not inside the platform-specific boundaries for YearMonth. The 'endInclusive' property does not throw and should be preferred.")
    public static /* synthetic */ void n() {
    }
}
