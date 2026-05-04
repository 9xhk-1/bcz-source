package h10;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.reflect.KVariance;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.1")
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f57954c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final t f57955d = new t(null, null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final KVariance f57956a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final r f57957b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final t a(@m80.k r type) {
            g0.p(type, "type");
            return new t(KVariance.IN, type);
        }

        @w00.o
        @m80.k
        public final t b(@m80.k r type) {
            g0.p(type, "type");
            return new t(KVariance.OUT, type);
        }

        @m80.k
        public final t c() {
            return t.f57955d;
        }

        @w00.o
        @m80.k
        public final t e(@m80.k r type) {
            g0.p(type, "type");
            return new t(KVariance.INVARIANT, type);
        }

        public a() {
        }

        @v0
        public static /* synthetic */ void d() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57958a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57958a = iArr;
        }
    }

    public t(@m80.l KVariance kVariance, @m80.l r rVar) {
        String str;
        this.f57956a = kVariance;
        this.f57957b = rVar;
        if ((kVariance == null) == (rVar == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @w00.o
    @m80.k
    public static final t c(@m80.k r rVar) {
        return f57954c.a(rVar);
    }

    public static /* synthetic */ t e(t tVar, KVariance kVariance, r rVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVariance = tVar.f57956a;
        }
        if ((i11 & 2) != 0) {
            rVar = tVar.f57957b;
        }
        return tVar.d(kVariance, rVar);
    }

    @w00.o
    @m80.k
    public static final t f(@m80.k r rVar) {
        return f57954c.b(rVar);
    }

    @w00.o
    @m80.k
    public static final t i(@m80.k r rVar) {
        return f57954c.e(rVar);
    }

    @m80.l
    public final KVariance a() {
        return this.f57956a;
    }

    @m80.l
    public final r b() {
        return this.f57957b;
    }

    @m80.k
    public final t d(@m80.l KVariance kVariance, @m80.l r rVar) {
        return new t(kVariance, rVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f57956a == tVar.f57956a && g0.g(this.f57957b, tVar.f57957b);
    }

    @m80.l
    public final r g() {
        return this.f57957b;
    }

    @m80.l
    public final KVariance h() {
        return this.f57956a;
    }

    public int hashCode() {
        KVariance kVariance = this.f57956a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        r rVar = this.f57957b;
        return hashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        KVariance kVariance = this.f57956a;
        int i11 = kVariance == null ? -1 : b.f57958a[kVariance.ordinal()];
        if (i11 == -1) {
            return "*";
        }
        if (i11 == 1) {
            return String.valueOf(this.f57957b);
        }
        if (i11 == 2) {
            return "in " + this.f57957b;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + this.f57957b;
    }
}
