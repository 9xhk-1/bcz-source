package g20;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q10.g f52605a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final f f52606b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52607a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52607a = iArr;
        }
    }

    static {
        n20.c ENHANCED_NULLABILITY_ANNOTATION = y10.e0.f99051v;
        kotlin.jvm.internal.g0.o(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f52605a = new f(ENHANCED_NULLABILITY_ANNOTATION);
        n20.c ENHANCED_MUTABILITY_ANNOTATION = y10.e0.f99052w;
        kotlin.jvm.internal.g0.o(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f52606b = new f(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final q10.g e(List<? extends q10.g> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new q10.n((List<? extends q10.g>) a00.r0.a6(list)) : (q10.g) a00.r0.m5(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final p10.d f(p10.d dVar, h hVar, TypeComponentPosition typeComponentPosition) {
        o10.b bVar = o10.b.f75542a;
        if (!e1.a(typeComponentPosition) || !(dVar instanceof p10.b)) {
            return null;
        }
        if (hVar.e() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            p10.b bVar2 = (p10.b) dVar;
            if (bVar.c(bVar2)) {
                return bVar.a(bVar2);
            }
        }
        if (hVar.e() == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
            p10.b bVar3 = (p10.b) dVar;
            if (bVar.d(bVar3)) {
                return bVar.b(bVar3);
            }
        }
        return null;
    }

    @m80.k
    public static final q10.g g() {
        return f52605a;
    }

    public static final Boolean h(h hVar, TypeComponentPosition typeComponentPosition) {
        if (!e1.a(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier f11 = hVar.f();
        int i11 = f11 == null ? -1 : a.f52607a[f11.ordinal()];
        if (i11 == 1) {
            return Boolean.TRUE;
        }
        if (i11 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(@m80.k e30.r0 r0Var) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        return h1.c(f30.u.f50458a, r0Var);
    }
}
