package u40;

import a00.h0;
import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/SignedFormatStructure\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1617#2,9:272\n1869#2:281\n1870#2:283\n1626#2:284\n1#3:282\n1#3:285\n*S KotlinDebug\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/SignedFormatStructure\n*L\n72#1:272,9\n72#1:281\n72#1:283\n72#1:284\n72#1:282\n*E\n"})
/* loaded from: classes8.dex */
public final class a0<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o<T> f91763a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91764b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<m<T>> f91765c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<T, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<T> f91766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a0<? super T> a0Var) {
            super(1, g0.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.f91766a = a0Var;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t11) {
            return Boolean.valueOf(a0.e(this.f91766a, t11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@m80.k o<? super T> format, boolean z11) {
        List b11;
        g0.p(format, "format");
        this.f91763a = format;
        this.f91764b = z11;
        b11 = p.b(format);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            m b12 = ((l) it.next()).c().b();
            if (b12 != null) {
                arrayList.add(b12);
            }
        }
        Set<m<T>> f62 = r0.f6(arrayList);
        this.f91765c = f62;
        if (f62.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    public static final <T> boolean e(a0<? super T> a0Var, T t11) {
        boolean z11 = false;
        for (m<? super T> mVar : a0Var.f91765c) {
            if (g0.g(mVar.isNegative().a(t11), Boolean.TRUE)) {
                z11 = true;
            } else if (!mVar.a(t11)) {
                return false;
            }
        }
        return z11;
    }

    public static final g2 h(a0 a0Var, Object obj, boolean z11) {
        for (m<T> mVar : a0Var.f91765c) {
            mVar.isNegative().d(obj, Boolean.valueOf(z11 != g0.g(mVar.isNegative().a(obj), Boolean.TRUE)));
        }
        return g2.f100423a;
    }

    @Override // u40.o
    @m80.k
    public v40.e<T> a() {
        return new v40.g(this.f91763a.a(), new a(this), this.f91764b);
    }

    @Override // u40.o
    @m80.k
    public w40.t<T> b() {
        return w40.p.c(h0.Q(new w40.t(a00.g0.l(new w40.z(new x00.p() { // from class: u40.z
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 h11;
                h11 = a0.h(a0.this, obj, ((Boolean) obj2).booleanValue());
                return h11;
            }
        }, this.f91764b, "sign for " + this.f91765c)), h0.J()), this.f91763a.b()));
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return g0.g(this.f91763a, a0Var.f91763a) && this.f91764b == a0Var.f91764b;
    }

    @m80.k
    public final o<T> f() {
        return this.f91763a;
    }

    public final boolean g() {
        return this.f91764b;
    }

    public int hashCode() {
        return (this.f91763a.hashCode() * 31) + Boolean.hashCode(this.f91764b);
    }

    @m80.k
    public String toString() {
        return "SignedFormatStructure(" + this.f91763a + ')';
    }
}
