package s10;

import e30.f2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p10.c1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i extends s implements kotlin.reflect.jvm.internal.impl.descriptors.b {
    public static final /* synthetic */ boolean F = false;
    public final boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k p10.b bVar, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.c cVar, @m80.k q10.g gVar, boolean z11, @m80.k CallableMemberDescriptor.Kind kind, @m80.k p10.x0 x0Var) {
        super(bVar, cVar, gVar, n20.h.f74309j, kind, x0Var);
        if (bVar == null) {
            C(0);
        }
        if (gVar == null) {
            C(1);
        }
        if (kind == null) {
            C(2);
        }
        if (x0Var == null) {
            C(3);
        }
        this.E = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void C(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s10.i.C(int):void");
    }

    @m80.k
    public static i i1(@m80.k p10.b bVar, @m80.k q10.g gVar, boolean z11, @m80.k p10.x0 x0Var) {
        if (bVar == null) {
            C(4);
        }
        if (gVar == null) {
            C(5);
        }
        if (x0Var == null) {
            C(6);
        }
        return new i(bVar, null, gVar, z11, CallableMemberDescriptor.Kind.DECLARATION, x0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    @m80.k
    public p10.b L() {
        p10.b b11 = b();
        if (b11 == null) {
            C(18);
        }
        return b11;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void T(@m80.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            C(22);
        }
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C(21);
        }
        return set;
    }

    @m80.k
    public final List<p10.t0> f1() {
        p10.b b11 = b();
        if (b11.l0().isEmpty()) {
            List<p10.t0> list = Collections.EMPTY_LIST;
            if (list == null) {
                C(16);
            }
            return list;
        }
        List<p10.t0> l02 = b11.l0();
        if (l02 == null) {
            C(15);
        }
        return l02;
    }

    @m80.l
    public p10.t0 g1() {
        p10.b b11 = b();
        if (!b11.i()) {
            return null;
        }
        p10.h b12 = b11.b();
        if (b12 instanceof p10.b) {
            return ((p10.b) b12).W();
        }
        return null;
    }

    @Override // s10.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.b g0(p10.h hVar, Modality modality, p10.p pVar, CallableMemberDescriptor.Kind kind, boolean z11) {
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) super.g0(hVar, modality, pVar, kind, z11);
        if (bVar == null) {
            C(27);
        }
        return bVar;
    }

    @Override // s10.s
    @m80.k
    public i j1(@m80.k p10.h hVar, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.l n20.f fVar, @m80.k q10.g gVar, @m80.k p10.x0 x0Var) {
        if (hVar == null) {
            C(23);
        }
        if (kind == null) {
            C(24);
        }
        if (gVar == null) {
            C(25);
        }
        if (x0Var == null) {
            C(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new i((p10.b) hVar, this, gVar, this.E, kind2, x0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + hVar + "\nkind: " + kind);
    }

    @Override // s10.n, p10.h
    @m80.k
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public p10.b b() {
        p10.b bVar = (p10.b) super.b();
        if (bVar == null) {
            C(17);
        }
        return bVar;
    }

    public i l1(@m80.k List<j1> list, @m80.k p10.p pVar) {
        if (list == null) {
            C(13);
        }
        if (pVar == null) {
            C(14);
        }
        m1(list, pVar, b().t());
        return this;
    }

    public i m1(@m80.k List<j1> list, @m80.k p10.p pVar, @m80.k List<c1> list2) {
        if (list == null) {
            C(10);
        }
        if (pVar == null) {
            C(11);
        }
        if (list2 == null) {
            C(12);
        }
        super.M0(null, g1(), f1(), list2, list, null, Modality.FINAL, pVar);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    public boolean n0() {
        return this.E;
    }

    @Override // s10.s, p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.e(this, d11);
    }

    @Override // s10.s, p10.z0
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.b c(@m80.k f2 f2Var) {
        if (f2Var == null) {
            C(20);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) super.c(f2Var);
    }

    @Override // s10.s, s10.n
    @m80.k
    public kotlin.reflect.jvm.internal.impl.descriptors.b a() {
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) super.a();
        if (bVar == null) {
            C(19);
        }
        return bVar;
    }
}
