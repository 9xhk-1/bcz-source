package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class x0 extends w0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ boolean f87358j = false;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87359g;

    /* renamed from: h, reason: collision with root package name */
    public d30.j<s20.g<?>> f87360h;

    /* renamed from: i, reason: collision with root package name */
    public x00.a<d30.j<s20.g<?>>> f87361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.l e30.r0 r0Var, boolean z11, @m80.k p10.x0 x0Var) {
        super(hVar, gVar, fVar, r0Var, x0Var);
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
        this.f87359g = z11;
    }

    private static /* synthetic */ void C(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "annotations";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i11 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i11 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p10.l1
    public boolean E() {
        return this.f87359g;
    }

    public void G0(@m80.l d30.j<s20.g<?>> jVar, @m80.k x00.a<d30.j<s20.g<?>>> aVar) {
        if (aVar == null) {
            C(5);
        }
        this.f87361i = aVar;
        if (jVar == null) {
            jVar = aVar.invoke();
        }
        this.f87360h = jVar;
    }

    public void H0(@m80.k x00.a<d30.j<s20.g<?>>> aVar) {
        if (aVar == null) {
            C(4);
        }
        G0(null, aVar);
    }

    @Override // p10.l1
    @m80.l
    public s20.g<?> t0() {
        d30.j<s20.g<?>> jVar = this.f87360h;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }
}
