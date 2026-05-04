package s10;

import e30.f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import p10.c1;
import p10.k1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class j0 extends n implements kotlin.reflect.jvm.internal.impl.descriptors.f {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ boolean f87203m = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87204e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87205f;

    /* renamed from: g, reason: collision with root package name */
    public final Modality f87206g;

    /* renamed from: h, reason: collision with root package name */
    public final p10.q0 f87207h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87208i;

    /* renamed from: j, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f87209j;

    /* renamed from: k, reason: collision with root package name */
    public p10.p f87210k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e f87211l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@m80.k Modality modality, @m80.k p10.p pVar, @m80.k p10.q0 q0Var, @m80.k q10.g gVar, @m80.k n20.f fVar, boolean z11, boolean z12, boolean z13, CallableMemberDescriptor.Kind kind, @m80.k p10.x0 x0Var) {
        super(q0Var.b(), gVar, fVar, x0Var);
        if (modality == null) {
            C(0);
        }
        if (pVar == null) {
            C(1);
        }
        if (q0Var == null) {
            C(2);
        }
        if (gVar == null) {
            C(3);
        }
        if (fVar == null) {
            C(4);
        }
        if (x0Var == null) {
            C(5);
        }
        this.f87211l = null;
        this.f87206g = modality;
        this.f87210k = pVar;
        this.f87207h = q0Var;
        this.f87204e = z11;
        this.f87205f = z12;
        this.f87208i = z13;
        this.f87209j = kind;
    }

    private static /* synthetic */ void C(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i12 = 2;
                break;
            case 7:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i11) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean D0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.f g0(p10.h hVar, Modality modality, p10.p pVar, CallableMemberDescriptor.Kind kind, boolean z11) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // s10.n
    @m80.k
    /* renamed from: F0 */
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.f a();

    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.f> G0(boolean z11) {
        ArrayList arrayList = new ArrayList(0);
        for (p10.q0 q0Var : j0().e()) {
            k1 getter = z11 ? q0Var.getGetter() : q0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    public void H0(boolean z11) {
        this.f87204e = z11;
    }

    public void I0(@m80.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        this.f87211l = eVar;
    }

    public void J0(p10.p pVar) {
        this.f87210k = pVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public <V> V P(a.InterfaceC0792a<V> interfaceC0792a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void T(@m80.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            C(16);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean U() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    public boolean Z() {
        return this.f87204e;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p10.z0
    @m80.k
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@m80.k f2 f2Var) {
        if (f2Var == null) {
            C(7);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public p10.t0 d0() {
        return j0().d0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public p10.t0 f0() {
        return j0().f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f87209j;
        if (kind == null) {
            C(6);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<c1> getTypeParameters() {
        List<c1> list = Collections.EMPTY_LIST;
        if (list == null) {
            C(9);
        }
        return list;
    }

    @Override // p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p pVar = this.f87210k;
        if (pVar == null) {
            C(11);
        }
        return pVar;
    }

    @Override // p10.x
    public boolean isExternal() {
        return this.f87205f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return this.f87208i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @m80.k
    public p10.q0 j0() {
        p10.q0 q0Var = this.f87207h;
        if (q0Var == null) {
            C(13);
        }
        return q0Var;
    }

    @Override // p10.x
    @m80.k
    public Modality k() {
        Modality modality = this.f87206g;
        if (modality == null) {
            C(10);
        }
        return modality;
    }

    @Override // p10.x
    public boolean k0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.g
    @m80.k
    public e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> n() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean o0() {
        return false;
    }

    @Override // p10.x
    public boolean q0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e w0() {
        return this.f87211l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<p10.t0> z0() {
        List<p10.t0> z02 = j0().z0();
        if (z02 == null) {
            C(14);
        }
        return z02;
    }
}
