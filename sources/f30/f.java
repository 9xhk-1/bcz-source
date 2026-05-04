package f30;

import a00.h0;
import e30.a2;
import e30.c1;
import e30.h2;
import e30.i0;
import e30.j2;
import e30.k2;
import e30.q0;
import e30.r0;
import e30.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinTypePreparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,76:1\n1#2:77\n1557#3:78\n1628#3,3:79\n1557#3:82\n1628#3,3:83\n1557#3:92\n1628#3,2:93\n1630#3:102\n98#4,6:86\n104#4:95\n105#4,5:97\n112#4,7:103\n99#5:96\n*S KotlinDebug\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n*L\n27#1:78\n27#1:79,3\n37#1:82\n37#1:83,3\n48#1:92\n48#1:93,2\n48#1:102\n48#1:86,6\n48#1:95\n48#1:97,5\n48#1:103,7\n48#1:96\n*E\n"})
/* loaded from: classes8.dex */
public abstract class f extends e30.p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f50431a = new a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReference implements x00.l<i30.g, k2> {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2 invoke(i30.g p02) {
            g0.p(p02, "p0");
            return ((f) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.d(f.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    @Override // e30.p
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k2 a(@m80.k i30.g type) {
        k2 e11;
        g0.p(type, "type");
        if (!(type instanceof r0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        k2 L0 = ((r0) type).L0();
        if (L0 instanceof c1) {
            e11 = c((c1) L0);
        } else {
            if (!(L0 instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            i0 i0Var = (i0) L0;
            c1 c11 = c(i0Var.Q0());
            c1 c12 = c(i0Var.R0());
            e11 = (c11 == i0Var.Q0() && c12 == i0Var.R0()) ? L0 : e30.u0.e(c11, c12);
        }
        return j2.c(e11, L0, new b(this));
    }

    public final c1 c(c1 c1Var) {
        r0 type;
        u1 I0 = c1Var.I0();
        q0 q0Var = null;
        r3 = null;
        k2 k2Var = null;
        if (I0 instanceof r20.c) {
            r20.c cVar = (r20.c) I0;
            a2 b11 = cVar.b();
            if (b11.b() != Variance.IN_VARIANCE) {
                b11 = null;
            }
            if (b11 != null && (type = b11.getType()) != null) {
                k2Var = type.L0();
            }
            k2 k2Var2 = k2Var;
            if (cVar.f() == null) {
                a2 b12 = cVar.b();
                Collection<r0> c11 = cVar.c();
                ArrayList arrayList = new ArrayList(a00.i0.d0(c11, 10));
                Iterator<T> it = c11.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r0) it.next()).L0());
                }
                cVar.h(new n(b12, arrayList, null, 4, null));
            }
            CaptureStatus captureStatus = CaptureStatus.FOR_SUBTYPING;
            n f11 = cVar.f();
            g0.m(f11);
            return new i(captureStatus, f11, k2Var2, c1Var.H0(), c1Var.J0(), false, 32, null);
        }
        boolean z11 = false;
        if (I0 instanceof s20.s) {
            Collection<r0> c12 = ((s20.s) I0).c();
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(c12, 10));
            Iterator<T> it2 = c12.iterator();
            while (it2.hasNext()) {
                r0 p11 = h2.p((r0) it2.next(), c1Var.J0());
                g0.o(p11, "makeNullableAsSpecified(...)");
                arrayList2.add(p11);
            }
            return e30.u0.o(c1Var.H0(), new q0(arrayList2), h0.J(), false, c1Var.r());
        }
        if (!(I0 instanceof q0) || !c1Var.J0()) {
            return c1Var;
        }
        q0 q0Var2 = (q0) I0;
        Collection<r0> c13 = q0Var2.c();
        ArrayList arrayList3 = new ArrayList(a00.i0.d0(c13, 10));
        Iterator<T> it3 = c13.iterator();
        while (it3.hasNext()) {
            arrayList3.add(j30.e.C((r0) it3.next()));
            z11 = true;
        }
        if (z11) {
            r0 k11 = q0Var2.k();
            q0Var = new q0(arrayList3).t(k11 != null ? j30.e.C(k11) : null);
        }
        if (q0Var != null) {
            q0Var2 = q0Var;
        }
        return q0Var2.i();
    }
}
