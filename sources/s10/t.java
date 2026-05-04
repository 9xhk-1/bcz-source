package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t extends c {

    /* renamed from: c, reason: collision with root package name */
    public final p10.b f87333c;

    /* renamed from: d, reason: collision with root package name */
    public final y20.e f87334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k p10.b bVar) {
        super(q10.g.A0.b());
        if (bVar == null) {
            C(0);
        }
        this.f87333c = bVar;
        this.f87334d = new y20.e(bVar, null);
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i11 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i11 == 1) {
            objArr[1] = "getValue";
        } else if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p10.h
    @m80.k
    public p10.h b() {
        p10.b bVar = this.f87333c;
        if (bVar == null) {
            C(2);
        }
        return bVar;
    }

    @Override // p10.t0
    @m80.k
    public y20.h getValue() {
        y20.e eVar = this.f87334d;
        if (eVar == null) {
            C(1);
        }
        return eVar;
    }

    @Override // s10.m
    public String toString() {
        return "class " + this.f87333c.getName() + "::this";
    }
}
