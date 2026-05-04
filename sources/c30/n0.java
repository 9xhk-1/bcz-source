package c30;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n0 extends s10.k0 implements c {

    @m80.k
    public final ProtoBuf.Property E;

    @m80.k
    public final k20.c F;

    @m80.k
    public final k20.g G;

    @m80.k
    public final k20.h H;

    @m80.l
    public final s I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k p10.h containingDeclaration, @m80.l p10.q0 q0Var, @m80.k q10.g annotations, @m80.k Modality modality, @m80.k p10.p visibility, boolean z11, @m80.k n20.f name, @m80.k CallableMemberDescriptor.Kind kind, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @m80.k ProtoBuf.Property proto, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.k k20.h versionRequirementTable, @m80.l s sVar) {
        super(containingDeclaration, q0Var, annotations, modality, visibility, z11, name, kind, x0.f78622a, z12, z13, z16, false, z14, z15);
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(modality, "modality");
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        kotlin.jvm.internal.g0.p(versionRequirementTable, "versionRequirementTable");
        this.E = proto;
        this.F = nameResolver;
        this.G = typeTable;
        this.H = versionRequirementTable;
        this.I = sVar;
    }

    @Override // c30.t
    @m80.k
    public k20.g D() {
        return this.G;
    }

    @Override // s10.k0
    @m80.k
    public s10.k0 L0(@m80.k p10.h newOwner, @m80.k Modality newModality, @m80.k p10.p newVisibility, @m80.l p10.q0 q0Var, @m80.k CallableMemberDescriptor.Kind kind, @m80.k n20.f newName, @m80.k x0 source) {
        kotlin.jvm.internal.g0.p(newOwner, "newOwner");
        kotlin.jvm.internal.g0.p(newModality, "newModality");
        kotlin.jvm.internal.g0.p(newVisibility, "newVisibility");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(newName, "newName");
        kotlin.jvm.internal.g0.p(source, "source");
        return new n0(newOwner, q0Var, getAnnotations(), newModality, newVisibility, E(), newName, kind, B0(), isConst(), isExternal(), Y(), q0(), M(), b0(), D(), c1(), c0());
    }

    @Override // c30.t
    @m80.k
    public k20.c b0() {
        return this.F;
    }

    @Override // c30.t
    @m80.k
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Property M() {
        return this.E;
    }

    @Override // c30.t
    @m80.l
    public s c0() {
        return this.I;
    }

    @m80.k
    public k20.h c1() {
        return this.H;
    }

    @Override // s10.k0, p10.x
    public boolean isExternal() {
        Boolean d11 = k20.b.E.d(M().getFlags());
        kotlin.jvm.internal.g0.o(d11, "get(...)");
        return d11.booleanValue();
    }
}
