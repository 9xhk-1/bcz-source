package s10;

import e30.d2;
import e30.f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.c1;
import p10.j1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k0 extends x0 implements p10.q0 {
    public p10.s0 A;
    public boolean B;
    public p10.r C;
    public p10.r D;

    /* renamed from: k, reason: collision with root package name */
    public final Modality f87219k;

    /* renamed from: l, reason: collision with root package name */
    public p10.p f87220l;

    /* renamed from: m, reason: collision with root package name */
    public Collection<? extends p10.q0> f87221m;

    /* renamed from: n, reason: collision with root package name */
    public final p10.q0 f87222n;

    /* renamed from: o, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f87223o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f87224p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f87225q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f87226r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f87227s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f87228t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f87229u;

    /* renamed from: v, reason: collision with root package name */
    public List<p10.t0> f87230v;

    /* renamed from: w, reason: collision with root package name */
    public p10.t0 f87231w;

    /* renamed from: x, reason: collision with root package name */
    public p10.t0 f87232x;

    /* renamed from: y, reason: collision with root package name */
    public List<c1> f87233y;

    /* renamed from: z, reason: collision with root package name */
    public l0 f87234z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public p10.h f87235a;

        /* renamed from: b, reason: collision with root package name */
        public Modality f87236b;

        /* renamed from: c, reason: collision with root package name */
        public p10.p f87237c;

        /* renamed from: f, reason: collision with root package name */
        public CallableMemberDescriptor.Kind f87240f;

        /* renamed from: i, reason: collision with root package name */
        public p10.t0 f87243i;

        /* renamed from: k, reason: collision with root package name */
        public n20.f f87245k;

        /* renamed from: l, reason: collision with root package name */
        public e30.r0 f87246l;

        /* renamed from: d, reason: collision with root package name */
        public p10.q0 f87238d = null;

        /* renamed from: e, reason: collision with root package name */
        public boolean f87239e = false;

        /* renamed from: g, reason: collision with root package name */
        public d2 f87241g = d2.f48570b;

        /* renamed from: h, reason: collision with root package name */
        public boolean f87242h = true;

        /* renamed from: j, reason: collision with root package name */
        public List<c1> f87244j = null;

        public a() {
            this.f87235a = k0.this.b();
            this.f87236b = k0.this.k();
            this.f87237c = k0.this.getVisibility();
            this.f87240f = k0.this.getKind();
            this.f87243i = k0.this.f87231w;
            this.f87245k = k0.this.getName();
            this.f87246l = k0.this.getType();
        }

        public static /* synthetic */ void a(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 7 || i11 == 9 || i11 == 11 || i11 == 19 || i11 == 13 || i11 == 14 || i11 == 16 || i11 == 17) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "setOwner";
            } else if (i11 == 2) {
                objArr[1] = "setOriginal";
            } else if (i11 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i11 == 5) {
                objArr[1] = "setReturnType";
            } else if (i11 == 7) {
                objArr[1] = "setModality";
            } else if (i11 == 9) {
                objArr[1] = "setVisibility";
            } else if (i11 == 11) {
                objArr[1] = "setKind";
            } else if (i11 == 19) {
                objArr[1] = "setName";
            } else if (i11 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i11 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i11 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i11 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 5 && i11 != 7 && i11 != 9 && i11 != 11 && i11 != 19 && i11 != 13 && i11 != 14 && i11 != 16 && i11 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @m80.l
        public p10.q0 n() {
            return k0.this.M0(this);
        }

        public p10.r0 o() {
            p10.q0 q0Var = this.f87238d;
            if (q0Var == null) {
                return null;
            }
            return q0Var.getGetter();
        }

        public p10.s0 p() {
            p10.q0 q0Var = this.f87238d;
            if (q0Var == null) {
                return null;
            }
            return q0Var.getSetter();
        }

        @m80.k
        public a q(boolean z11) {
            this.f87242h = z11;
            return this;
        }

        @m80.k
        public a r(@m80.k CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                a(10);
            }
            this.f87240f = kind;
            return this;
        }

        @m80.k
        public a s(@m80.k Modality modality) {
            if (modality == null) {
                a(6);
            }
            this.f87236b = modality;
            return this;
        }

        @m80.k
        public a t(@m80.l CallableMemberDescriptor callableMemberDescriptor) {
            this.f87238d = (p10.q0) callableMemberDescriptor;
            return this;
        }

        @m80.k
        public a u(@m80.k p10.h hVar) {
            if (hVar == null) {
                a(0);
            }
            this.f87235a = hVar;
            return this;
        }

        @m80.k
        public a v(@m80.k d2 d2Var) {
            if (d2Var == null) {
                a(15);
            }
            this.f87241g = d2Var;
            return this;
        }

        @m80.k
        public a w(@m80.k p10.p pVar) {
            if (pVar == null) {
                a(8);
            }
            this.f87237c = pVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@m80.k p10.h hVar, @m80.l p10.q0 q0Var, @m80.k q10.g gVar, @m80.k Modality modality, @m80.k p10.p pVar, boolean z11, @m80.k n20.f fVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.k p10.x0 x0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(hVar, gVar, fVar, null, z11, x0Var);
        if (hVar == null) {
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
        if (fVar == null) {
            C(4);
        }
        if (kind == null) {
            C(5);
        }
        if (x0Var == null) {
            C(6);
        }
        this.f87221m = null;
        this.f87230v = Collections.EMPTY_LIST;
        this.f87219k = modality;
        this.f87220l = pVar;
        this.f87222n = q0Var == null ? this : q0Var;
        this.f87223o = kind;
        this.f87224p = z12;
        this.f87225q = z13;
        this.f87226r = z14;
        this.f87227s = z15;
        this.f87228t = z16;
        this.f87229u = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void C(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s10.k0.C(int):void");
    }

    @m80.k
    public static k0 K0(@m80.k p10.h hVar, @m80.k q10.g gVar, @m80.k Modality modality, @m80.k p10.p pVar, boolean z11, @m80.k n20.f fVar, @m80.k CallableMemberDescriptor.Kind kind, @m80.k p10.x0 x0Var, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        if (hVar == null) {
            C(7);
        }
        if (gVar == null) {
            C(8);
        }
        if (modality == null) {
            C(9);
        }
        if (pVar == null) {
            C(10);
        }
        if (fVar == null) {
            C(11);
        }
        if (kind == null) {
            C(12);
        }
        if (x0Var == null) {
            C(13);
        }
        return new k0(hVar, null, gVar, modality, pVar, z11, fVar, kind, x0Var, z12, z13, z14, z15, z16, z17);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.e P0(@m80.k f2 f2Var, @m80.k kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (f2Var == null) {
            C(30);
        }
        if (fVar == null) {
            C(31);
        }
        if (fVar.w0() != null) {
            return fVar.w0().c(f2Var);
        }
        return null;
    }

    public static p10.p U0(p10.p pVar, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && p10.o.g(pVar.f())) ? p10.o.f78593h : pVar;
    }

    public static p10.t0 Z0(f2 f2Var, p10.q0 q0Var, p10.t0 t0Var) {
        e30.r0 p11 = f2Var.p(t0Var.getType(), Variance.IN_VARIANCE);
        if (p11 == null) {
            return null;
        }
        return new n0(q0Var, new y20.c(q0Var, p11, ((y20.f) t0Var.getValue()).a(), t0Var.getValue()), t0Var.getAnnotations());
    }

    public static p10.t0 a1(f2 f2Var, p10.q0 q0Var, p10.t0 t0Var) {
        e30.r0 p11 = f2Var.p(t0Var.getType(), Variance.IN_VARIANCE);
        if (p11 == null) {
            return null;
        }
        return new n0(q0Var, new y20.d(q0Var, p11, t0Var.getValue()), t0Var.getAnnotations());
    }

    @Override // p10.l1
    public boolean B0() {
        return this.f87224p;
    }

    @Override // p10.q0
    @m80.l
    public p10.r F() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public p10.q0 g0(p10.h hVar, Modality modality, p10.p pVar, CallableMemberDescriptor.Kind kind, boolean z11) {
        p10.q0 n11 = T0().u(hVar).t(null).s(modality).w(pVar).r(kind).q(z11).n();
        if (n11 == null) {
            C(42);
        }
        return n11;
    }

    @m80.k
    public k0 L0(@m80.k p10.h hVar, @m80.k Modality modality, @m80.k p10.p pVar, @m80.l p10.q0 q0Var, @m80.k CallableMemberDescriptor.Kind kind, @m80.k n20.f fVar, @m80.k p10.x0 x0Var) {
        if (hVar == null) {
            C(32);
        }
        if (modality == null) {
            C(33);
        }
        if (pVar == null) {
            C(34);
        }
        if (kind == null) {
            C(35);
        }
        if (fVar == null) {
            C(36);
        }
        if (x0Var == null) {
            C(37);
        }
        return new k0(hVar, q0Var, getAnnotations(), modality, pVar, E(), fVar, kind, x0Var, B0(), isConst(), q0(), k0(), isExternal(), Y());
    }

    @m80.l
    public p10.q0 M0(@m80.k a aVar) {
        p10.t0 t0Var;
        x00.a<d30.j<s20.g<?>>> aVar2;
        if (aVar == null) {
            C(29);
        }
        k0 L0 = L0(aVar.f87235a, aVar.f87236b, aVar.f87237c, aVar.f87238d, aVar.f87240f, aVar.f87245k, O0(aVar.f87239e, aVar.f87238d));
        List<c1> typeParameters = aVar.f87244j == null ? getTypeParameters() : aVar.f87244j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        f2 b11 = e30.b0.b(typeParameters, aVar.f87241g, L0, arrayList);
        e30.r0 r0Var = aVar.f87246l;
        e30.r0 p11 = b11.p(r0Var, Variance.OUT_VARIANCE);
        if (p11 == null) {
            return null;
        }
        e30.r0 p12 = b11.p(r0Var, Variance.IN_VARIANCE);
        if (p12 != null) {
            L0.V0(p12);
        }
        p10.t0 t0Var2 = aVar.f87243i;
        if (t0Var2 != null) {
            p10.t0 c11 = t0Var2.c(b11);
            if (c11 == null) {
                return null;
            }
            t0Var = c11;
        } else {
            t0Var = null;
        }
        p10.t0 t0Var3 = this.f87232x;
        p10.t0 a12 = t0Var3 != null ? a1(b11, L0, t0Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<p10.t0> it = this.f87230v.iterator();
        while (it.hasNext()) {
            p10.t0 Z0 = Z0(b11, L0, it.next());
            if (Z0 != null) {
                arrayList2.add(Z0);
            }
        }
        L0.X0(p11, arrayList, t0Var, a12, arrayList2);
        l0 l0Var = this.f87234z == null ? null : new l0(L0, this.f87234z.getAnnotations(), aVar.f87236b, U0(this.f87234z.getVisibility(), aVar.f87240f), this.f87234z.Z(), this.f87234z.isExternal(), this.f87234z.isInline(), aVar.f87240f, aVar.o(), p10.x0.f78622a);
        if (l0Var != null) {
            e30.r0 returnType = this.f87234z.getReturnType();
            l0Var.I0(P0(b11, this.f87234z));
            l0Var.L0(returnType != null ? b11.p(returnType, Variance.OUT_VARIANCE) : null);
        }
        m0 m0Var = this.A == null ? null : new m0(L0, this.A.getAnnotations(), aVar.f87236b, U0(this.A.getVisibility(), aVar.f87240f), this.A.Z(), this.A.isExternal(), this.A.isInline(), aVar.f87240f, aVar.p(), p10.x0.f78622a);
        if (m0Var != null) {
            List<j1> K0 = s.K0(m0Var, this.A.g(), b11, false, false, null);
            if (K0 == null) {
                L0.W0(true);
                K0 = Collections.singletonList(m0.K0(m0Var, u20.e.m(aVar.f87235a).H(), this.A.g().get(0).getAnnotations()));
            }
            if (K0.size() != 1) {
                throw new IllegalStateException();
            }
            m0Var.I0(P0(b11, this.A));
            m0Var.M0(K0.get(0));
        }
        p10.r rVar = this.C;
        r rVar2 = rVar == null ? null : new r(rVar.getAnnotations(), L0);
        p10.r rVar3 = this.D;
        L0.R0(l0Var, m0Var, rVar2, rVar3 == null ? null : new r(rVar3.getAnnotations(), L0));
        if (aVar.f87242h) {
            o30.l a11 = o30.l.a();
            Iterator<? extends p10.q0> it2 = e().iterator();
            while (it2.hasNext()) {
                a11.add(it2.next().c(b11));
            }
            L0.T(a11);
        }
        if (isConst() && (aVar2 = this.f87361i) != null) {
            L0.G0(this.f87360h, aVar2);
        }
        return L0;
    }

    @Override // p10.q0
    @m80.l
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public l0 getGetter() {
        return this.f87234z;
    }

    @m80.k
    public final p10.x0 O0(boolean z11, @m80.l p10.q0 q0Var) {
        p10.x0 x0Var;
        if (z11) {
            if (q0Var == null) {
                q0Var = a();
            }
            x0Var = q0Var.getSource();
        } else {
            x0Var = p10.x0.f78622a;
        }
        if (x0Var == null) {
            C(28);
        }
        return x0Var;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public <V> V P(a.InterfaceC0792a<V> interfaceC0792a) {
        return null;
    }

    @Override // p10.q0
    @m80.l
    public p10.r Q() {
        return this.C;
    }

    public void Q0(@m80.l l0 l0Var, @m80.l p10.s0 s0Var) {
        R0(l0Var, s0Var, null, null);
    }

    public void R0(@m80.l l0 l0Var, @m80.l p10.s0 s0Var, @m80.l p10.r rVar, @m80.l p10.r rVar2) {
        this.f87234z = l0Var;
        this.A = s0Var;
        this.C = rVar;
        this.D = rVar2;
    }

    public boolean S0() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void T(@m80.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            C(40);
        }
        this.f87221m = collection;
    }

    @m80.k
    public a T0() {
        return new a();
    }

    public void V0(@m80.k e30.r0 r0Var) {
        if (r0Var == null) {
            C(14);
        }
    }

    public void W0(boolean z11) {
        this.B = z11;
    }

    public void X0(@m80.k e30.r0 r0Var, @m80.k List<? extends c1> list, @m80.l p10.t0 t0Var, @m80.l p10.t0 t0Var2, @m80.k List<p10.t0> list2) {
        if (r0Var == null) {
            C(17);
        }
        if (list == null) {
            C(18);
        }
        if (list2 == null) {
            C(19);
        }
        F0(r0Var);
        this.f87233y = new ArrayList(list);
        this.f87232x = t0Var2;
        this.f87231w = t0Var;
        this.f87230v = list2;
    }

    @Override // p10.m1
    public boolean Y() {
        return this.f87229u;
    }

    public void Y0(@m80.k p10.p pVar) {
        if (pVar == null) {
            C(20);
        }
        this.f87220l = pVar;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public p10.t0 d0() {
        return this.f87231w;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public Collection<? extends p10.q0> e() {
        Collection<? extends p10.q0> collection = this.f87221m;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            C(41);
        }
        return collection;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.l
    public p10.t0 f0() {
        return this.f87232x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @m80.k
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f87223o;
        if (kind == null) {
            C(39);
        }
        return kind;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public e30.r0 getReturnType() {
        e30.r0 type = getType();
        if (type == null) {
            C(23);
        }
        return type;
    }

    @Override // p10.q0
    @m80.l
    public p10.s0 getSetter() {
        return this.A;
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<c1> getTypeParameters() {
        List<c1> list = this.f87233y;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p pVar = this.f87220l;
        if (pVar == null) {
            C(25);
        }
        return pVar;
    }

    @Override // s10.w0, p10.l1
    public boolean isConst() {
        return this.f87225q;
    }

    public boolean isExternal() {
        return this.f87228t;
    }

    @Override // p10.x
    @m80.k
    public Modality k() {
        Modality modality = this.f87219k;
        if (modality == null) {
            C(24);
        }
        return modality;
    }

    @Override // p10.x
    public boolean k0() {
        return this.f87227s;
    }

    @Override // p10.x
    public boolean q0() {
        return this.f87226r;
    }

    @Override // p10.q0
    @m80.k
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f> x() {
        ArrayList arrayList = new ArrayList(2);
        l0 l0Var = this.f87234z;
        if (l0Var != null) {
            arrayList.add(l0Var);
        }
        p10.s0 s0Var = this.A;
        if (s0Var != null) {
            arrayList.add(s0Var);
        }
        return arrayList;
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.h(this, d11);
    }

    @Override // s10.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @m80.k
    public List<p10.t0> z0() {
        List<p10.t0> list = this.f87230v;
        if (list == null) {
            C(22);
        }
        return list;
    }

    @Override // s10.w0, p10.z0
    public p10.q0 c(@m80.k f2 f2Var) {
        if (f2Var == null) {
            C(27);
        }
        return f2Var.k() ? this : T0().v(f2Var.j()).t(a()).n();
    }

    @Override // s10.w0, s10.n
    @m80.k
    public p10.q0 a() {
        p10.q0 q0Var = this.f87222n;
        p10.q0 a11 = q0Var == this ? this : q0Var.a();
        if (a11 == null) {
            C(38);
        }
        return a11;
    }
}
