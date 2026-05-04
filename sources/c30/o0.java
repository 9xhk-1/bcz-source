package c30;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o0 extends s10.o0 implements c {

    @m80.k
    public final ProtoBuf.Function E;

    @m80.k
    public final k20.c F;

    @m80.k
    public final k20.g G;

    @m80.k
    public final k20.h H;

    @m80.l
    public final s I;

    public /* synthetic */ o0(p10.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.g gVar, q10.g gVar2, n20.f fVar, CallableMemberDescriptor.Kind kind, ProtoBuf.Function function, k20.c cVar, k20.g gVar3, k20.h hVar2, s sVar, x0 x0Var, int i11, kotlin.jvm.internal.v vVar) {
        this(hVar, gVar, gVar2, fVar, kind, function, cVar, gVar3, hVar2, sVar, (i11 & 1024) != 0 ? null : x0Var);
    }

    @Override // c30.t
    @m80.k
    public k20.g D() {
        return this.G;
    }

    @Override // s10.o0, s10.s
    @m80.k
    /* renamed from: G0 */
    public s10.s j1(@m80.k p10.h newOwner, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.l n20.f fVar, @m80.k q10.g annotations, @m80.k x0 source) {
        n20.f fVar2;
        kotlin.jvm.internal.g0.p(newOwner, "newOwner");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.reflect.jvm.internal.impl.descriptors.g gVar = (kotlin.reflect.jvm.internal.impl.descriptors.g) eVar;
        if (fVar == null) {
            n20.f name = getName();
            kotlin.jvm.internal.g0.o(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        o0 o0Var = new o0(newOwner, gVar, annotations, fVar2, kind, M(), b0(), D(), l1(), c0(), source);
        o0Var.T0(L0());
        return o0Var;
    }

    @Override // c30.t
    @m80.k
    public k20.c b0() {
        return this.F;
    }

    @Override // c30.t
    @m80.l
    public s c0() {
        return this.I;
    }

    @Override // c30.t
    @m80.k
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Function M() {
        return this.E;
    }

    @m80.k
    public k20.h l1() {
        return this.H;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public o0(@m80.k p10.h r12, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.g r13, @m80.k q10.g r14, @m80.k n20.f r15, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, @m80.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r17, @m80.k k20.c r18, @m80.k k20.g r19, @m80.k k20.h r20, @m80.l c30.s r21, @m80.l p10.x0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r10, r0)
            if (r22 != 0) goto L3d
            p10.x0 r0 = p10.x0.f78622a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.E = r7
            r11.F = r8
            r11.G = r9
            r11.H = r10
            r1 = r21
            r11.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.o0.<init>(p10.h, kotlin.reflect.jvm.internal.impl.descriptors.g, q10.g, n20.f, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, k20.c, k20.g, k20.h, c30.s, p10.x0):void");
    }
}
