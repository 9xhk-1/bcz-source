package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.4")
@u0({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes8.dex */
public final class y0 implements h10.s {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f67053f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Object f67054a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f67055b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final KVariance f67056c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67057d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public volatile List<? extends h10.r> f67058e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.jvm.internal.y0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0779a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f67059a;

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
                f67059a = iArr;
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final String a(@m80.k h10.s typeParameter) {
            g0.p(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i11 = C0779a.f67059a[typeParameter.j().ordinal()];
            if (i11 == 1) {
                g2 g2Var = g2.f100423a;
            } else if (i11 == 2) {
                sb2.append("in ");
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }

        public a() {
        }
    }

    public y0(@m80.l Object obj, @m80.k String name, @m80.k KVariance variance, boolean z11) {
        g0.p(name, "name");
        g0.p(variance, "variance");
        this.f67054a = obj;
        this.f67055b = name;
        this.f67056c = variance;
        this.f67057d = z11;
    }

    public final void b(@m80.k List<? extends h10.r> upperBounds) {
        g0.p(upperBounds, "upperBounds");
        if (this.f67058e == null) {
            this.f67058e = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return g0.g(this.f67054a, y0Var.f67054a) && g0.g(getName(), y0Var.getName());
    }

    @Override // h10.s
    @m80.k
    public String getName() {
        return this.f67055b;
    }

    @Override // h10.s
    @m80.k
    public List<h10.r> getUpperBounds() {
        List list = this.f67058e;
        if (list != null) {
            return list;
        }
        List<h10.r> l11 = a00.g0.l(o0.o(Object.class));
        this.f67058e = l11;
        return l11;
    }

    @Override // h10.s
    public boolean h() {
        return this.f67057d;
    }

    public int hashCode() {
        Object obj = this.f67054a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // h10.s
    @m80.k
    public KVariance j() {
        return this.f67056c;
    }

    @m80.k
    public String toString() {
        return f67053f.a(this);
    }

    public static /* synthetic */ void a() {
    }
}
