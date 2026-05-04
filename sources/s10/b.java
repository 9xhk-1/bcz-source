package s10;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.a1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@m80.k d30.n nVar, @m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.k Variance variance, boolean z11, int i11, @m80.k p10.x0 x0Var, @m80.k a1 a1Var) {
        super(nVar, hVar, gVar, fVar, variance, z11, i11, x0Var, a1Var);
        if (nVar == null) {
            C(0);
        }
        if (hVar == null) {
            C(1);
        }
        if (gVar == null) {
            C(2);
        }
        if (fVar == null) {
            C(3);
        }
        if (variance == null) {
            C(4);
        }
        if (x0Var == null) {
            C(5);
        }
        if (a1Var == null) {
            C(6);
        }
    }

    public static /* synthetic */ void C(int i11) {
        Object[] objArr = new Object[3];
        switch (i11) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // s10.m
    public String toString() {
        String str = "";
        String str2 = h() ? "reified " : "";
        if (j() != Variance.INVARIANT) {
            str = j() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
