package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.time.d;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@j2(markerClass = {w30.h.class})
/* loaded from: classes8.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f67792a = a.f67793a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f67793a = new a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements c {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f67794b = new b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @y0(version = "1.9")
        @w00.h
        @j2(markerClass = {w30.h.class})
        public static final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final long f67795a;

            public /* synthetic */ a(long j11) {
                this.f67795a = j11;
            }

            public static final /* synthetic */ a d(long j11) {
                return new a(j11);
            }

            public static final int e(long j11, long j12) {
                return e.i(q(j11, j12), e.f67757b.T());
            }

            public static int f(long j11, @m80.k d other) {
                g0.p(other, "other");
                return d(j11).compareTo(other);
            }

            public static long i(long j11) {
                return l.f67790b.d(j11);
            }

            public static boolean k(long j11, Object obj) {
                return (obj instanceof a) && j11 == ((a) obj).x();
            }

            public static final boolean l(long j11, long j12) {
                return j11 == j12;
            }

            public static boolean m(long j11) {
                return e.P(i(j11));
            }

            public static boolean o(long j11) {
                return !e.P(i(j11));
            }

            public static int p(long j11) {
                return Long.hashCode(j11);
            }

            public static final long q(long j11, long j12) {
                return l.f67790b.c(j11, j12);
            }

            public static long s(long j11, long j12) {
                return l.f67790b.b(j11, e.j0(j12));
            }

            public static long t(long j11, @m80.k d other) {
                g0.p(other, "other");
                if (other instanceof a) {
                    return q(j11, ((a) other).x());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) w(j11)) + " and " + other);
            }

            public static long v(long j11, long j12) {
                return l.f67790b.b(j11, j12);
            }

            public static String w(long j11) {
                return "ValueTimeMark(reading=" + j11 + ')';
            }

            @Override // kotlin.time.m
            public long a() {
                return i(this.f67795a);
            }

            @Override // kotlin.time.m
            public boolean b() {
                return m(this.f67795a);
            }

            @Override // java.lang.Comparable
            /* renamed from: b0, reason: merged with bridge method [inline-methods] */
            public /* bridge */ int compareTo(@m80.k d dVar) {
                return d.a.a(this, dVar);
            }

            @Override // kotlin.time.m
            public boolean c() {
                return o(this.f67795a);
            }

            @Override // kotlin.time.d
            public boolean equals(Object obj) {
                return k(this.f67795a, obj);
            }

            @Override // kotlin.time.d, kotlin.time.m
            public /* bridge */ /* synthetic */ d h(long j11) {
                return d(u(j11));
            }

            @Override // kotlin.time.d
            public int hashCode() {
                return p(this.f67795a);
            }

            @Override // kotlin.time.d, kotlin.time.m
            public /* bridge */ /* synthetic */ d j(long j11) {
                return d(r(j11));
            }

            @Override // kotlin.time.d
            public long n(@m80.k d other) {
                g0.p(other, "other");
                return t(this.f67795a, other);
            }

            public long r(long j11) {
                return s(this.f67795a, j11);
            }

            public String toString() {
                return w(this.f67795a);
            }

            public long u(long j11) {
                return v(this.f67795a, j11);
            }

            public final /* synthetic */ long x() {
                return this.f67795a;
            }

            @Override // kotlin.time.m
            public /* bridge */ /* synthetic */ m h(long j11) {
                return d(u(j11));
            }

            @Override // kotlin.time.m
            public /* bridge */ /* synthetic */ m j(long j11) {
                return d(r(j11));
            }

            public static long g(long j11) {
                return j11;
            }
        }

        @Override // kotlin.time.n.c, kotlin.time.n
        public /* bridge */ /* synthetic */ d a() {
            return a.d(b());
        }

        public long b() {
            return l.f67790b.e();
        }

        @m80.k
        public String toString() {
            return l.f67790b.toString();
        }

        @Override // kotlin.time.n
        public /* bridge */ /* synthetic */ m a() {
            return a.d(b());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @y0(version = "1.9")
    @j2(markerClass = {w30.h.class})
    public interface c extends n {
        @Override // kotlin.time.n
        @m80.k
        d a();
    }

    @m80.k
    m a();
}
