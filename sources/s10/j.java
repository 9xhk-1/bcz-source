package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class j extends a {

    /* renamed from: g, reason: collision with root package name */
    public final p10.h f87200g;

    /* renamed from: h, reason: collision with root package name */
    public final p10.x0 f87201h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87202i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k d30.n nVar, @m80.k p10.h hVar, @m80.k n20.f fVar, @m80.k p10.x0 x0Var, boolean z11) {
        super(nVar, fVar);
        if (nVar == null) {
            p0(0);
        }
        if (hVar == null) {
            p0(1);
        }
        if (fVar == null) {
            p0(2);
        }
        if (x0Var == null) {
            p0(3);
        }
        this.f87200g = hVar;
        this.f87201h = x0Var;
        this.f87202i = z11;
    }

    private static /* synthetic */ void p0(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p10.b, p10.i, p10.h
    @m80.k
    public p10.h b() {
        p10.h hVar = this.f87200g;
        if (hVar == null) {
            p0(4);
        }
        return hVar;
    }

    @Override // p10.k
    @m80.k
    public p10.x0 getSource() {
        p10.x0 x0Var = this.f87201h;
        if (x0Var == null) {
            p0(5);
        }
        return x0Var;
    }

    public boolean isExternal() {
        return this.f87202i;
    }
}
