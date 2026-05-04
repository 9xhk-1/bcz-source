package s10;

import e30.f2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import p10.c1;
import p10.j1;
import p10.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class w0 extends n implements l1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f87350f = false;

    /* renamed from: e, reason: collision with root package name */
    public e30.r0 f87351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(@m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k n20.f fVar, @m80.l e30.r0 r0Var, @m80.k p10.x0 x0Var) {
        super(hVar, gVar, fVar, x0Var);
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
        this.f87351e = r0Var;
    }

    private static /* synthetic */ void C(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // s10.n
    @m80.k
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public l1 a() {
        l1 l1Var = (l1) super.a();
        if (l1Var == null) {
            C(5);
        }
        return l1Var;
    }

    public void F0(e30.r0 r0Var) {
        this.f87351e = r0Var;
    }

    @m80.l
    public <V> V P(a.InterfaceC0792a<V> interfaceC0792a) {
        return null;
    }

    public /* bridge */ /* synthetic */ p10.i c(f2 f2Var) {
        return c(f2Var);
    }

    public p10.t0 d0() {
        return null;
    }

    @m80.k
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C(7);
        }
        return set;
    }

    public p10.t0 f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<j1> g() {
        List<j1> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(6);
        }
        return list;
    }

    @m80.k
    public e30.r0 getReturnType() {
        e30.r0 type = getType();
        if (type == null) {
            C(10);
        }
        return type;
    }

    @Override // p10.i1
    @m80.k
    public e30.r0 getType() {
        e30.r0 r0Var = this.f87351e;
        if (r0Var == null) {
            C(4);
        }
        return r0Var;
    }

    @m80.k
    public List<c1> getTypeParameters() {
        List<c1> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(8);
        }
        return list;
    }

    public boolean isConst() {
        return false;
    }

    public boolean o0() {
        return false;
    }

    @m80.k
    public List<p10.t0> z0() {
        List<p10.t0> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(9);
        }
        return list;
    }
}
