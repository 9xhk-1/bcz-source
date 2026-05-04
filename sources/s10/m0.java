package s10;

import e30.c1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m0 extends j0 implements p10.s0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ boolean f87253p = false;

    /* renamed from: n, reason: collision with root package name */
    public j1 f87254n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final p10.s0 f87255o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(@m80.k p10.q0 q0Var, @m80.k q10.g gVar, @m80.k Modality modality, @m80.k p10.p pVar, boolean z11, boolean z12, boolean z13, @m80.k CallableMemberDescriptor.Kind kind, @m80.l p10.s0 s0Var, @m80.k p10.x0 x0Var) {
        super(modality, pVar, q0Var, gVar, n20.f.k("<set-" + q0Var.getName() + ">"), z11, z12, z13, kind, x0Var);
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
        this.f87255o = s0Var != null ? s0Var : this;
    }

    private static /* synthetic */ void C(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i11) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i11) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static u0 K0(@m80.k p10.s0 s0Var, @m80.k e30.r0 r0Var, @m80.k q10.g gVar) {
        if (s0Var == null) {
            C(7);
        }
        if (r0Var == null) {
            C(8);
        }
        if (gVar == null) {
            C(9);
        }
        return new u0(s0Var, null, 0, gVar, n20.h.f74314o, r0Var, false, false, false, null, p10.x0.f78622a);
    }

    @Override // s10.j0, s10.n
    @m80.k
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public p10.s0 a() {
        p10.s0 s0Var = this.f87255o;
        if (s0Var == null) {
            C(13);
        }
        return s0Var;
    }

    public void M0(@m80.k j1 j1Var) {
        if (j1Var == null) {
            C(6);
        }
        this.f87254n = j1Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public Collection<? extends p10.s0> e() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.f> G0 = super.G0(false);
        if (G0 == null) {
            C(10);
        }
        return G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<j1> g() {
        j1 j1Var = this.f87254n;
        if (j1Var == null) {
            throw new IllegalStateException();
        }
        List<j1> singletonList = Collections.singletonList(j1Var);
        if (singletonList == null) {
            C(11);
        }
        return singletonList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public e30.r0 getReturnType() {
        c1 Z = u20.e.m(this).Z();
        if (Z == null) {
            C(12);
        }
        return Z;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.m(this, d11);
    }
}
