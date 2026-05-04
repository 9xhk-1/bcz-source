package kotlin.reflect.jvm.internal.impl.resolve;

import a00.r0;
import e30.l0;
import e30.u1;
import e30.v0;
import f30.e;
import f30.f;
import f30.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import m80.k;
import p10.c1;
import p10.j1;
import p10.o;
import p10.q0;
import p10.t0;
import p10.x;
import q20.m;
import q20.u;
import s10.j0;
import s10.k0;
import s10.s;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class OverridingUtil {

    /* renamed from: e, reason: collision with root package name */
    public static final List<ExternalOverridabilityCondition> f67633e = r0.a6(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* renamed from: f, reason: collision with root package name */
    public static final OverridingUtil f67634f;

    /* renamed from: g, reason: collision with root package name */
    public static final e.a f67635g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f67636h = false;

    /* renamed from: a, reason: collision with root package name */
    public final f30.g f67637a;

    /* renamed from: b, reason: collision with root package name */
    public final f30.f f67638b;

    /* renamed from: c, reason: collision with root package name */
    public final e.a f67639c;

    /* renamed from: d, reason: collision with root package name */
    public final p<e30.r0, e30.r0, Boolean> f67640d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OverrideCompatibilityInfo {

        /* renamed from: c, reason: collision with root package name */
        public static final OverrideCompatibilityInfo f67641c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, com.alipay.sdk.m.f0.c.f10532p);

        /* renamed from: a, reason: collision with root package name */
        public final Result f67642a;

        /* renamed from: b, reason: collision with root package name */
        public final String f67643b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(@k Result result, @k String str) {
            if (result == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f67642a = result;
            this.f67643b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(int):void");
        }

        @k
        public static OverrideCompatibilityInfo b(@k String str) {
            if (str == null) {
                a(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        @k
        public static OverrideCompatibilityInfo d(@k String str) {
            if (str == null) {
                a(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        @k
        public static OverrideCompatibilityInfo e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f67641c;
            if (overrideCompatibilityInfo == null) {
                a(0);
            }
            return overrideCompatibilityInfo;
        }

        @k
        public Result c() {
            Result result = this.f67642a;
            if (result == null) {
                a(5);
            }
            return result;
        }

        public String toString() {
            return this.f67642a + ": " + this.f67643b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements e.a {
        public static /* synthetic */ void b(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = yr.e.f100279a;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // f30.e.a
        public boolean a(@k u1 u1Var, @k u1 u1Var2) {
            if (u1Var == null) {
                b(0);
            }
            if (u1Var2 == null) {
                b(1);
            }
            return u1Var.equals(u1Var2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<D> implements p<D, D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> {
        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            return new Pair(aVar, aVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements l<CallableMemberDescriptor, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p10.h f67644a;

        public c(p10.h hVar) {
            this.f67644a = hVar;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return Boolean.valueOf(callableMemberDescriptor.b() == this.f67644a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements l<CallableMemberDescriptor, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p10.b f67645a;

        public e(p10.b bVar) {
            this.f67645a = bVar;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z11 = false;
            if (!o.g(callableMemberDescriptor.getVisibility()) && o.h(callableMemberDescriptor, this.f67645a, false)) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements l<CallableMemberDescriptor, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q20.l f67646a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CallableMemberDescriptor f67647b;

        public g(q20.l lVar, CallableMemberDescriptor callableMemberDescriptor) {
            this.f67646a = lVar;
            this.f67647b = callableMemberDescriptor;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f67646a.b(this.f67647b, callableMemberDescriptor);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67648a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f67649b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f67650c;

        static {
            int[] iArr = new int[Modality.values().length];
            f67650c = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67650c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67650c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67650c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f67649b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67649b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67649b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f67648a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67648a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67648a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        a aVar = new a();
        f67635g = aVar;
        f67634f = new OverridingUtil(aVar, g.a.f50432a, f.a.f50431a, null);
    }

    public OverridingUtil(@k e.a aVar, @k f30.g gVar, @k f30.f fVar, @m80.l p<e30.r0, e30.r0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f67639c = aVar;
        this.f67637a = gVar;
        this.f67638b = fVar;
        this.f67640d = pVar;
    }

    public static boolean A(@m80.l kotlin.reflect.jvm.internal.impl.descriptors.f fVar, @m80.l kotlin.reflect.jvm.internal.impl.descriptors.f fVar2) {
        if (fVar == null || fVar2 == null) {
            return true;
        }
        return H(fVar, fVar2);
    }

    public static boolean B(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if (aVar == null) {
            a(65);
        }
        if (aVar2 == null) {
            a(66);
        }
        e30.r0 returnType = aVar.getReturnType();
        e30.r0 returnType2 = aVar2.getReturnType();
        if (!H(aVar, aVar2)) {
            return false;
        }
        TypeCheckerState l11 = f67634f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return G(aVar, returnType, aVar2, returnType2, l11);
        }
        if (!(aVar instanceof q0)) {
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        }
        q0 q0Var = (q0) aVar;
        q0 q0Var2 = (q0) aVar2;
        if (A(q0Var.getSetter(), q0Var2.getSetter())) {
            return (q0Var.E() && q0Var2.E()) ? kotlin.reflect.jvm.internal.impl.types.b.f67667a.m(l11, returnType.L0(), returnType2.L0()) : (q0Var.E() || !q0Var2.E()) && G(aVar, returnType, aVar2, returnType2, l11);
        }
        return false;
    }

    public static boolean C(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k Collection<kotlin.reflect.jvm.internal.impl.descriptors.a> collection) {
        if (aVar == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k e30.r0 r0Var, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @k e30.r0 r0Var2, @k TypeCheckerState typeCheckerState) {
        if (aVar == null) {
            a(71);
        }
        if (r0Var == null) {
            a(72);
        }
        if (aVar2 == null) {
            a(73);
        }
        if (r0Var2 == null) {
            a(74);
        }
        if (typeCheckerState == null) {
            a(75);
        }
        return kotlin.reflect.jvm.internal.impl.types.b.f67667a.t(typeCheckerState, r0Var.L0(), r0Var2.L0());
    }

    public static boolean H(@k p10.l lVar, @k p10.l lVar2) {
        if (lVar == null) {
            a(67);
        }
        if (lVar2 == null) {
            a(68);
        }
        Integer d11 = o.d(lVar.getVisibility(), lVar2.getVisibility());
        return d11 == null || d11.intValue() >= 0;
    }

    public static boolean I(@k x xVar, @k x xVar2, boolean z11) {
        if (xVar == null) {
            a(55);
        }
        if (xVar2 == null) {
            a(56);
        }
        return !o.g(xVar2.getVisibility()) && o.h(xVar2, xVar, z11);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> boolean J(@k D d11, @k D d12, boolean z11, boolean z12) {
        if (d11 == null) {
            a(13);
        }
        if (d12 == null) {
            a(14);
        }
        if (!d11.equals(d12) && kotlin.reflect.jvm.internal.impl.resolve.a.f67651a.k(d11.a(), d12.a(), z11, z12)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a a11 = d12.a();
        Iterator it = q20.h.d(d11).iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.impl.resolve.a.f67651a.k(a11, (kotlin.reflect.jvm.internal.impl.descriptors.a) it.next(), z11, z12)) {
                return true;
            }
        }
        return false;
    }

    public static void K(@k CallableMemberDescriptor callableMemberDescriptor, @m80.l l<CallableMemberDescriptor, g2> lVar) {
        p10.p pVar;
        if (callableMemberDescriptor == null) {
            a(105);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.e()) {
            if (callableMemberDescriptor2.getVisibility() == o.f78592g) {
                K(callableMemberDescriptor2, lVar);
            }
        }
        if (callableMemberDescriptor.getVisibility() != o.f78592g) {
            return;
        }
        p10.p h11 = h(callableMemberDescriptor);
        if (h11 == null) {
            if (lVar != null) {
                lVar.invoke(callableMemberDescriptor);
            }
            pVar = o.f78590e;
        } else {
            pVar = h11;
        }
        if (callableMemberDescriptor instanceof k0) {
            ((k0) callableMemberDescriptor).Y0(pVar);
            Iterator<kotlin.reflect.jvm.internal.impl.descriptors.f> it = ((q0) callableMemberDescriptor).x().iterator();
            while (it.hasNext()) {
                K(it.next(), h11 == null ? null : lVar);
            }
            return;
        }
        if (callableMemberDescriptor instanceof s) {
            ((s) callableMemberDescriptor).e1(pVar);
            return;
        }
        j0 j0Var = (j0) callableMemberDescriptor;
        j0Var.J0(pVar);
        if (pVar != j0Var.j0().getVisibility()) {
            j0Var.H0(false);
        }
    }

    @k
    public static <H> H L(@k Collection<H> collection, @k l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        H h11;
        if (collection == null) {
            a(76);
        }
        if (lVar == null) {
            a(77);
        }
        if (collection.size() == 1) {
            H h12 = (H) r0.E2(collection);
            if (h12 == null) {
                a(78);
            }
            return h12;
        }
        ArrayList arrayList = new ArrayList(2);
        List C3 = r0.C3(collection, lVar);
        H h13 = (H) r0.E2(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.a invoke = lVar.invoke(h13);
        for (H h14 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.a invoke2 = lVar.invoke(h14);
            if (C(invoke2, C3)) {
                arrayList.add(h14);
            }
            if (B(invoke2, invoke) && !B(invoke, invoke2)) {
                h13 = h14;
            }
        }
        if (arrayList.isEmpty()) {
            if (h13 == null) {
                a(79);
            }
            return h13;
        }
        if (arrayList.size() == 1) {
            H h15 = (H) r0.E2(arrayList);
            if (h15 == null) {
                a(80);
            }
            return h15;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h11 = null;
                break;
            }
            h11 = (H) it.next();
            if (!l0.b(lVar.invoke(h11).getReturnType())) {
                break;
            }
        }
        if (h11 != null) {
            return h11;
        }
        H h16 = (H) r0.E2(arrayList);
        if (h16 == null) {
            a(82);
        }
        return h16;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.a(int):void");
    }

    public static boolean b(@k Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return r0.A1(collection, new c(collection.iterator().next().b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(@m80.k p10.c1 r4, @m80.k p10.c1 r5, @m80.k kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            e30.r0 r5 = (e30.r0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            e30.r0 r3 = (e30.r0) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.c(p10.c1, p10.c1, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState):boolean");
    }

    public static boolean d(@k e30.r0 r0Var, @k e30.r0 r0Var2, @k TypeCheckerState typeCheckerState) {
        if (r0Var == null) {
            a(44);
        }
        if (r0Var2 == null) {
            a(45);
        }
        if (typeCheckerState == null) {
            a(46);
        }
        if (v0.a(r0Var) && v0.a(r0Var2)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.types.b.f67667a.m(typeCheckerState, r0Var.L0(), r0Var2.L0());
    }

    @m80.l
    public static OverrideCompatibilityInfo e(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        if ((aVar.f0() == null) != (aVar2.f0() == null)) {
            return OverrideCompatibilityInfo.d("Receiver presence mismatch");
        }
        if (aVar.g().size() != aVar2.g().size()) {
            return OverrideCompatibilityInfo.d("Value parameter number mismatch");
        }
        return null;
    }

    public static void f(@k CallableMemberDescriptor callableMemberDescriptor, @k Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.e().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    public static List<e30.r0> g(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        t0 f02 = aVar.f0();
        ArrayList arrayList = new ArrayList();
        if (f02 != null) {
            arrayList.add(f02.getType());
        }
        Iterator<j1> it = aVar.g().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    @m80.l
    public static p10.p h(@k CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(106);
        }
        Collection<? extends CallableMemberDescriptor> e11 = callableMemberDescriptor.e();
        p10.p u11 = u(e11);
        if (u11 == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return u11.f();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : e11) {
            if (callableMemberDescriptor2.k() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(u11)) {
                return null;
            }
        }
        return u11;
    }

    @k
    public static OverridingUtil i(@k f30.g gVar, @k e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new OverridingUtil(aVar, gVar, f.a.f50431a, null);
    }

    public static void j(@k Collection<CallableMemberDescriptor> collection, @k p10.b bVar, @k q20.l lVar) {
        if (collection == null) {
            a(83);
        }
        if (bVar == null) {
            a(84);
        }
        if (lVar == null) {
            a(85);
        }
        Collection<CallableMemberDescriptor> t11 = t(bVar, collection);
        boolean isEmpty = t11.isEmpty();
        if (!isEmpty) {
            collection = t11;
        }
        CallableMemberDescriptor g02 = ((CallableMemberDescriptor) L(collection, new d())).g0(bVar, n(collection, bVar), isEmpty ? o.f78593h : o.f78592g, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        lVar.d(g02, collection);
        lVar.a(g02);
    }

    public static void k(@k p10.b bVar, @k Collection<CallableMemberDescriptor> collection, @k q20.l lVar) {
        if (bVar == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (lVar == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator<CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), bVar, lVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(u.a(linkedList), linkedList, lVar), bVar, lVar);
            }
        }
    }

    @k
    public static OverridingUtil m(@k f30.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new OverridingUtil(f67635g, gVar, f.a.f50431a, null);
    }

    @k
    public static Modality n(@k Collection<CallableMemberDescriptor> collection, @k p10.b bVar) {
        if (collection == null) {
            a(86);
        }
        if (bVar == null) {
            a(87);
        }
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i11 = h.f67650c[callableMemberDescriptor.k().ordinal()];
            if (i11 == 1) {
                Modality modality = Modality.FINAL;
                if (modality == null) {
                    a(88);
                }
                return modality;
            }
            if (i11 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
            }
            if (i11 == 3) {
                z12 = true;
            } else if (i11 == 4) {
                z13 = true;
            }
        }
        if (bVar.q0() && bVar.k() != Modality.ABSTRACT && bVar.k() != Modality.SEALED) {
            z11 = true;
        }
        if (z12 && !z13) {
            Modality modality2 = Modality.OPEN;
            if (modality2 == null) {
                a(89);
            }
            return modality2;
        }
        if (!z12 && z13) {
            Modality k11 = z11 ? bVar.k() : Modality.ABSTRACT;
            if (k11 == null) {
                a(90);
            }
            return k11;
        }
        HashSet hashSet = new HashSet();
        Iterator<CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z11, bVar.k());
    }

    @k
    public static <H> Collection<H> p(@k H h11, @k Collection<H> collection, @k l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> lVar, @k l<H, g2> lVar2) {
        if (h11 == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (lVar == null) {
            a(99);
        }
        if (lVar2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h11);
        kotlin.reflect.jvm.internal.impl.descriptors.a invoke = lVar.invoke(h11);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.a invoke2 = lVar.invoke(next);
            if (h11 == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result x11 = x(invoke, invoke2);
                if (x11 == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x11 == OverrideCompatibilityInfo.Result.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @k
    public static Collection<CallableMemberDescriptor> q(@k CallableMemberDescriptor callableMemberDescriptor, @k Queue<CallableMemberDescriptor> queue, @k q20.l lVar) {
        if (callableMemberDescriptor == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (lVar == null) {
            a(104);
        }
        return p(callableMemberDescriptor, queue, new f(), new g(lVar, callableMemberDescriptor));
    }

    @k
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> r(@k Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && u20.e.y(u20.e.s(set.iterator().next())), null, new b());
    }

    @k
    public static <D> Set<D> s(@k Set<D> set, boolean z11, @m80.l x00.a<?> aVar, @k p<? super D, ? super D, Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> invoke = pVar.invoke(obj, (Object) it.next());
                kotlin.reflect.jvm.internal.impl.descriptors.a component1 = invoke.component1();
                kotlin.reflect.jvm.internal.impl.descriptors.a component2 = invoke.component2();
                if (!J(component1, component2, z11, true)) {
                    if (J(component2, component1, z11, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    @k
    public static Collection<CallableMemberDescriptor> t(@k p10.b bVar, @k Collection<CallableMemberDescriptor> collection) {
        if (bVar == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List r22 = r0.r2(collection, new e(bVar));
        if (r22 == null) {
            a(96);
        }
        return r22;
    }

    @m80.l
    public static p10.p u(@k Collection<? extends CallableMemberDescriptor> collection) {
        p10.p pVar;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return o.f78597l;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            pVar = null;
            while (it.hasNext()) {
                p10.p visibility = it.next().getVisibility();
                if (pVar != null) {
                    Integer d11 = o.d(visibility, pVar);
                    if (d11 == null) {
                        break;
                    }
                    if (d11.intValue() > 0) {
                    }
                }
                pVar = visibility;
            }
        }
        if (pVar == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer d12 = o.d(pVar, it2.next().getVisibility());
            if (d12 == null || d12.intValue() < 0) {
                return null;
            }
        }
        return pVar;
    }

    @m80.l
    public static OverrideCompatibilityInfo w(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        boolean z11;
        if (aVar == null) {
            a(38);
        }
        if (aVar2 == null) {
            a(39);
        }
        boolean z12 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
        if ((z12 && !(aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) || (((z11 = aVar instanceof q0)) && !(aVar2 instanceof q0))) {
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        if (!z12 && !z11) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return OverrideCompatibilityInfo.d("Name mismatch");
        }
        OverrideCompatibilityInfo e11 = e(aVar, aVar2);
        if (e11 != null) {
            return e11;
        }
        return null;
    }

    @m80.l
    public static OverrideCompatibilityInfo.Result x(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        OverridingUtil overridingUtil = f67634f;
        OverrideCompatibilityInfo.Result c11 = overridingUtil.D(aVar2, aVar, null).c();
        OverrideCompatibilityInfo.Result c12 = overridingUtil.D(aVar, aVar2, null).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (c11 == result && c12 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (c11 == result2 || c12 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    @k
    public static Modality y(@k Collection<CallableMemberDescriptor> collection, boolean z11, @k Modality modality) {
        if (collection == null) {
            a(91);
        }
        if (modality == null) {
            a(92);
        }
        Modality modality2 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Modality k11 = (z11 && callableMemberDescriptor.k() == Modality.ABSTRACT) ? modality : callableMemberDescriptor.k();
            if (k11.compareTo(modality2) < 0) {
                modality2 = k11;
            }
        }
        if (modality2 == null) {
            a(93);
        }
        return modality2;
    }

    @k
    public static Set<CallableMemberDescriptor> z(@k CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    @k
    public OverrideCompatibilityInfo D(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @m80.l p10.b bVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        OverrideCompatibilityInfo E = E(aVar, aVar2, bVar, false);
        if (E == null) {
            a(21);
        }
        return E;
    }

    @k
    public OverrideCompatibilityInfo E(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, @m80.l p10.b bVar, boolean z11) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        OverrideCompatibilityInfo F = F(aVar, aVar2, z11);
        boolean z12 = F.c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f67633e) {
            if (externalOverridabilityCondition.b() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z12 || externalOverridabilityCondition.b() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i11 = h.f67648a[externalOverridabilityCondition.a(aVar, aVar2, bVar).ordinal()];
                if (i11 == 1) {
                    z12 = true;
                } else if (i11 == 2) {
                    OverrideCompatibilityInfo d11 = OverrideCompatibilityInfo.d("External condition");
                    if (d11 == null) {
                        a(24);
                    }
                    return d11;
                }
            }
        }
        if (!z12) {
            return F;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f67633e) {
            if (externalOverridabilityCondition2.b() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i12 = h.f67648a[externalOverridabilityCondition2.a(aVar, aVar2, bVar).ordinal()];
                if (i12 == 1) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i12 == 2) {
                    OverrideCompatibilityInfo d12 = OverrideCompatibilityInfo.d("External condition");
                    if (d12 == null) {
                        a(26);
                    }
                    return d12;
                }
            }
        }
        OverrideCompatibilityInfo e11 = OverrideCompatibilityInfo.e();
        if (e11 == null) {
            a(27);
        }
        return e11;
    }

    @k
    public OverrideCompatibilityInfo F(@k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z11) {
        if (aVar == null) {
            a(28);
        }
        if (aVar2 == null) {
            a(29);
        }
        OverrideCompatibilityInfo w11 = w(aVar, aVar2);
        if (w11 != null) {
            return w11;
        }
        List<e30.r0> g11 = g(aVar);
        List<e30.r0> g12 = g(aVar2);
        List<c1> typeParameters = aVar.getTypeParameters();
        List<c1> typeParameters2 = aVar2.getTypeParameters();
        int i11 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i11 < g11.size()) {
                if (!f30.e.f50430a.b(g11.get(i11), g12.get(i11))) {
                    OverrideCompatibilityInfo d11 = OverrideCompatibilityInfo.d("Type parameter number mismatch");
                    if (d11 == null) {
                        a(31);
                    }
                    return d11;
                }
                i11++;
            }
            OverrideCompatibilityInfo b11 = OverrideCompatibilityInfo.b("Type parameter number mismatch");
            if (b11 == null) {
                a(32);
            }
            return b11;
        }
        TypeCheckerState l11 = l(typeParameters, typeParameters2);
        for (int i12 = 0; i12 < typeParameters.size(); i12++) {
            if (!c(typeParameters.get(i12), typeParameters2.get(i12), l11)) {
                OverrideCompatibilityInfo d12 = OverrideCompatibilityInfo.d("Type parameter bounds mismatch");
                if (d12 == null) {
                    a(33);
                }
                return d12;
            }
        }
        while (i11 < g11.size()) {
            if (!d(g11.get(i11), g12.get(i11), l11)) {
                OverrideCompatibilityInfo d13 = OverrideCompatibilityInfo.d("Value parameter type mismatch");
                if (d13 == null) {
                    a(34);
                }
                return d13;
            }
            i11++;
        }
        if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar).isSuspend() != ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2).isSuspend()) {
            OverrideCompatibilityInfo b12 = OverrideCompatibilityInfo.b("Incompatible suspendability");
            if (b12 == null) {
                a(35);
            }
            return b12;
        }
        if (z11) {
            e30.r0 returnType = aVar.getReturnType();
            e30.r0 returnType2 = aVar2.getReturnType();
            if (returnType != null && returnType2 != null && ((!v0.a(returnType2) || !v0.a(returnType)) && !kotlin.reflect.jvm.internal.impl.types.b.f67667a.t(l11, returnType2.L0(), returnType.L0()))) {
                OverrideCompatibilityInfo b13 = OverrideCompatibilityInfo.b("Return type mismatch");
                if (b13 == null) {
                    a(36);
                }
                return b13;
            }
        }
        OverrideCompatibilityInfo e11 = OverrideCompatibilityInfo.e();
        if (e11 == null) {
            a(37);
        }
        return e11;
    }

    @k
    public final TypeCheckerState l(@k List<c1> list, @k List<c1> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            TypeCheckerState L0 = new m(null, this.f67639c, this.f67637a, this.f67638b, this.f67640d).L0(true, true);
            if (L0 == null) {
                a(42);
            }
            return L0;
        }
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < list.size(); i11++) {
            hashMap.put(list.get(i11).o(), list2.get(i11).o());
        }
        TypeCheckerState L02 = new m(hashMap, this.f67639c, this.f67637a, this.f67638b, this.f67640d).L0(true, true);
        if (L02 == null) {
            a(43);
        }
        return L02;
    }

    public final Collection<CallableMemberDescriptor> o(@k CallableMemberDescriptor callableMemberDescriptor, @k Collection<? extends CallableMemberDescriptor> collection, @k p10.b bVar, @k q20.l lVar) {
        if (callableMemberDescriptor == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (bVar == null) {
            a(59);
        }
        if (lVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        o30.l a11 = o30.l.a();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result c11 = D(callableMemberDescriptor2, callableMemberDescriptor, bVar).c();
            boolean I = I(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i11 = h.f67649b[c11.ordinal()];
            if (i11 == 1) {
                if (I) {
                    a11.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i11 == 2) {
                if (I) {
                    lVar.c(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        lVar.d(callableMemberDescriptor, a11);
        return arrayList;
    }

    public void v(@k n20.f fVar, @k Collection<? extends CallableMemberDescriptor> collection, @k Collection<? extends CallableMemberDescriptor> collection2, @k p10.b bVar, @k q20.l lVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (bVar == null) {
            a(53);
        }
        if (lVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, bVar, lVar));
        }
        k(bVar, linkedHashSet, lVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements l<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements l<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a> {
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.a invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }
}
