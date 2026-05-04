package s10;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class m extends q10.b implements p10.h {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n20.f f87252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@m80.k q10.g gVar, @m80.k n20.f fVar) {
        super(gVar);
        if (gVar == null) {
            C(0);
        }
        if (fVar == null) {
            C(1);
        }
        this.f87252b = fVar;
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 5 || i11 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                objArr[2] = "toString";
            } else if (i11 != 5 && i11 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @m80.k
    public static String V(@m80.k p10.h hVar) {
        if (hVar == null) {
            C(4);
        }
        try {
            String str = p20.m.f78750k.Q(hVar) + "[" + hVar.getClass().getSimpleName() + EmailAutoCompleteEditText.f17091d + Integer.toHexString(System.identityHashCode(hVar)) + "]";
            if (str == null) {
                C(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = hVar.getClass().getSimpleName() + " " + hVar.getName();
            if (str2 == null) {
                C(6);
            }
            return str2;
        }
    }

    @Override // p10.c0
    @m80.k
    public n20.f getName() {
        n20.f fVar = this.f87252b;
        if (fVar == null) {
            C(2);
        }
        return fVar;
    }

    public String toString() {
        return V(this);
    }

    @m80.k
    public p10.h a() {
        return this;
    }
}
