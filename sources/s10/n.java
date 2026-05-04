package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class n extends m implements p10.i {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p10.h f87256c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final p10.x0 f87257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.k p10.x0 x0Var) {
        super(gVar, fVar);
        if (hVar == null) {
            C(0);
        }
        if (gVar == null) {
            C(1);
        }
        if (fVar == null) {
            C(2);
        }
        if (x0Var == null) {
            C(3);
        }
        this.f87256c = hVar;
        this.f87257d = x0Var;
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getOriginal";
        } else if (i11 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @m80.k
    public p10.h b() {
        p10.h hVar = this.f87256c;
        if (hVar == null) {
            C(5);
        }
        return hVar;
    }

    @m80.k
    public p10.x0 getSource() {
        p10.x0 x0Var = this.f87257d;
        if (x0Var == null) {
            C(6);
        }
        return x0Var;
    }

    @Override // s10.m, p10.h
    @m80.k
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public p10.k a() {
        p10.k kVar = (p10.k) super.a();
        if (kVar == null) {
            C(4);
        }
        return kVar;
    }
}
