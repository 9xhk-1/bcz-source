package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c2 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    public final Variance f48557a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f48558b;

    public c2(@m80.k Variance variance, @m80.k r0 r0Var) {
        if (variance == null) {
            c(0);
        }
        if (r0Var == null) {
            c(1);
        }
        this.f48557a = variance;
        this.f48558b = r0Var;
    }

    public static /* synthetic */ void c(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i11 == 3) {
            objArr[2] = "replaceType";
        } else if (i11 != 4 && i11 != 5) {
            if (i11 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // e30.a2
    public boolean a() {
        return false;
    }

    @Override // e30.a2
    @m80.k
    public Variance b() {
        Variance variance = this.f48557a;
        if (variance == null) {
            c(4);
        }
        return variance;
    }

    @Override // e30.a2
    @m80.k
    public a2 d(@m80.k f30.g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new c2(this.f48557a, gVar.a(this.f48558b));
    }

    @Override // e30.a2
    @m80.k
    public r0 getType() {
        r0 r0Var = this.f48558b;
        if (r0Var == null) {
            c(5);
        }
        return r0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(@m80.k r0 r0Var) {
        this(Variance.INVARIANT, r0Var);
        if (r0Var == null) {
            c(2);
        }
    }
}
