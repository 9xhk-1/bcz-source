package s10;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class l0 extends j0 implements p10.r0 {

    /* renamed from: n, reason: collision with root package name */
    public e30.r0 f87250n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final p10.r0 f87251o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@m80.k p10.q0 q0Var, @m80.k q10.g gVar, @m80.k Modality modality, @m80.k p10.p pVar, boolean z11, boolean z12, boolean z13, @m80.k CallableMemberDescriptor.Kind kind, @m80.l p10.r0 r0Var, @m80.k p10.x0 x0Var) {
        super(modality, pVar, q0Var, gVar, n20.f.k("<get-" + q0Var.getName() + ">"), z11, z12, z13, kind, x0Var);
        if (q0Var == null) {
            C(0);
        }
        if (gVar == null) {
            C(1);
        }
        if (modality == null) {
            C(2);
        }
        if (pVar == null) {
            C(3);
        }
        if (kind == null) {
            C(4);
        }
        if (x0Var == null) {
            C(5);
        }
        this.f87251o = r0Var != null ? r0Var : this;
    }

    private static /* synthetic */ void C(int i11) {
        String str = (i11 == 6 || i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 6 || i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i11 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i11 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // s10.j0, s10.n
    @m80.k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public p10.r0 a() {
        p10.r0 r0Var = this.f87251o;
        if (r0Var == null) {
            C(8);
        }
        return r0Var;
    }

    public void L0(e30.r0 r0Var) {
        if (r0Var == null) {
            r0Var = j0().getType();
        }
        this.f87250n = r0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public Collection<? extends p10.r0> e() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.f> G0 = super.G0(true);
        if (G0 == null) {
            C(6);
        }
        return G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<j1> g() {
        List<j1> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(7);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public e30.r0 getReturnType() {
        return this.f87250n;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.j(this, d11);
    }
}
