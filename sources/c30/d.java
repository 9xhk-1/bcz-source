package c30;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends s10.i implements c {

    @m80.k
    public final ProtoBuf.Constructor G;

    @m80.k
    public final k20.c H;

    @m80.k
    public final k20.g I;

    @m80.k
    public final k20.h J;

    @m80.l
    public final s K;

    public /* synthetic */ d(p10.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, q10.g gVar, boolean z11, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, k20.c cVar2, k20.g gVar2, k20.h hVar, s sVar, x0 x0Var, int i11, kotlin.jvm.internal.v vVar) {
        this(bVar, cVar, gVar, z11, kind, constructor, cVar2, gVar2, hVar, sVar, (i11 & 1024) != 0 ? null : x0Var);
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // c30.t
    @m80.k
    public k20.g D() {
        return this.I;
    }

    @Override // c30.t
    @m80.k
    public k20.c b0() {
        return this.H;
    }

    @Override // c30.t
    @m80.l
    public s c0() {
        return this.K;
    }

    @Override // s10.s, p10.x
    public boolean isExternal() {
        return false;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return false;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isSuspend() {
        return false;
    }

    @Override // s10.i
    @m80.k
    /* renamed from: n1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d j1(@m80.k p10.h newOwner, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.l n20.f fVar, @m80.k q10.g annotations, @m80.k x0 source) {
        kotlin.jvm.internal.g0.p(newOwner, "newOwner");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(source, "source");
        d dVar = new d((p10.b) newOwner, (kotlin.reflect.jvm.internal.impl.descriptors.c) eVar, annotations, this.E, kind, M(), b0(), D(), p1(), c0(), source);
        dVar.T0(L0());
        return dVar;
    }

    @Override // c30.t
    @m80.k
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Constructor M() {
        return this.G;
    }

    @m80.k
    public k20.h p1() {
        return this.J;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public d(@m80.k p10.b r12, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.c r13, @m80.k q10.g r14, boolean r15, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, @m80.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r17, @m80.k k20.c r18, @m80.k k20.g r19, @m80.k k20.h r20, @m80.l c30.s r21, @m80.l p10.x0 r22) {
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
            if (r22 != 0) goto L38
            p10.x0 r0 = p10.x0.f78622a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.G = r7
            r11.H = r8
            r11.I = r9
            r11.J = r10
            r1 = r21
            r11.K = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.d.<init>(p10.b, kotlin.reflect.jvm.internal.impl.descriptors.c, q10.g, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, k20.c, k20.g, k20.h, c30.s, p10.x0):void");
    }
}
