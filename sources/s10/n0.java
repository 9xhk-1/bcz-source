package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n0 extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ boolean f87258e = false;

    /* renamed from: c, reason: collision with root package name */
    public final p10.h f87259c;

    /* renamed from: d, reason: collision with root package name */
    public y20.h f87260d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k p10.h hVar, @m80.k y20.h hVar2, @m80.k q10.g gVar) {
        this(hVar, hVar2, gVar, n20.h.f74308i);
        if (hVar == null) {
            C(0);
        }
        if (hVar2 == null) {
            C(1);
        }
        if (gVar == null) {
            C(2);
        }
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i11 == 7) {
            objArr[1] = "getValue";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i11) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p10.h
    @m80.k
    public p10.h b() {
        p10.h hVar = this.f87259c;
        if (hVar == null) {
            C(8);
        }
        return hVar;
    }

    @Override // p10.t0
    @m80.k
    public y20.h getValue() {
        y20.h hVar = this.f87260d;
        if (hVar == null) {
            C(7);
        }
        return hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k p10.h hVar, @m80.k y20.h hVar2, @m80.k q10.g gVar, @m80.k n20.f fVar) {
        super(gVar, fVar);
        if (hVar == null) {
            C(3);
        }
        if (hVar2 == null) {
            C(4);
        }
        if (gVar == null) {
            C(5);
        }
        if (fVar == null) {
            C(6);
        }
        this.f87259c = hVar;
        this.f87260d = hVar2;
    }
}
