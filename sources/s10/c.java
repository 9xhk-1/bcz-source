package s10;

import e30.f2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.c1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c extends m implements p10.t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k q10.g gVar) {
        super(gVar, n20.h.f74308i);
        if (gVar == null) {
            C(0);
        }
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
            case 11:
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
            case 11:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i11) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public <V> V P(a.InterfaceC0792a<V> interfaceC0792a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public p10.t0 d0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C(8);
        }
        return set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public p10.t0 f0() {
        return null;
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
    @m80.l
    public e30.r0 getReturnType() {
        return getType();
    }

    @Override // p10.k
    @m80.k
    public p10.x0 getSource() {
        p10.x0 x0Var = p10.x0.f78622a;
        if (x0Var == null) {
            C(11);
        }
        return x0Var;
    }

    @Override // p10.i1
    @m80.k
    public e30.r0 getType() {
        e30.r0 type = getValue().getType();
        if (type == null) {
            C(6);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<c1> getTypeParameters() {
        List<c1> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(5);
        }
        return list;
    }

    @Override // p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p pVar = p10.o.f78591f;
        if (pVar == null) {
            C(9);
        }
        return pVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean o0() {
        return false;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.f(this, d11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<p10.t0> z0() {
        List<p10.t0> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(4);
        }
        return list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.k q10.g gVar, @m80.k n20.f fVar) {
        super(gVar, fVar);
        if (gVar == null) {
            C(1);
        }
        if (fVar == null) {
            C(2);
        }
    }

    @Override // p10.z0
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.a c(@m80.k f2 f2Var) {
        if (f2Var == null) {
            C(3);
        }
        if (!f2Var.k()) {
            e30.r0 p11 = b() instanceof p10.b ? f2Var.p(getType(), Variance.OUT_VARIANCE) : f2Var.p(getType(), Variance.INVARIANT);
            if (p11 == null) {
                return null;
            }
            if (p11 != getType()) {
                return new n0(b(), new y20.k(p11), getAnnotations());
            }
        }
        return this;
    }

    @Override // s10.m, p10.h
    @m80.k
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public p10.o0 a() {
        return this;
    }
}
