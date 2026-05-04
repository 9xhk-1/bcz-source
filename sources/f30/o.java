package f30;

import a00.i0;
import a00.r0;
import e30.a2;
import e30.f2;
import e30.k2;
import e30.v1;
import f30.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1663#3,8:292\n1611#3,9:300\n1863#3:309\n1864#3:311\n1620#3:312\n1734#3,3:313\n1557#3:316\n1628#3,3:317\n1628#3,3:320\n1557#3:323\n1628#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
/* loaded from: classes8.dex */
public final class o {
    public static final List<a2> a(k2 k2Var, CaptureStatus captureStatus) {
        if (k2Var.G0().size() != k2Var.I0().getParameters().size()) {
            return null;
        }
        List<a2> G0 = k2Var.G0();
        List<a2> list = G0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((a2) it.next()).b() != Variance.INVARIANT) {
                    List<c1> parameters = k2Var.I0().getParameters();
                    g0.o(parameters, "getParameters(...)");
                    List<Pair> o62 = r0.o6(list, parameters);
                    ArrayList arrayList = new ArrayList(i0.d0(o62, 10));
                    for (Pair pair : o62) {
                        a2 a2Var = (a2) pair.component1();
                        c1 c1Var = (c1) pair.component2();
                        if (a2Var.b() != Variance.INVARIANT) {
                            k2 L0 = (a2Var.a() || a2Var.b() != Variance.IN_VARIANCE) ? null : a2Var.getType().L0();
                            g0.m(c1Var);
                            a2Var = j30.e.e(new i(captureStatus, L0, a2Var, c1Var));
                        }
                        arrayList.add(a2Var);
                    }
                    f2 c11 = v1.f48674c.b(k2Var.I0(), arrayList).c();
                    int size = G0.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        a2 a2Var2 = G0.get(i11);
                        a2 a2Var3 = (a2) arrayList.get(i11);
                        if (a2Var2.b() != Variance.INVARIANT) {
                            List<e30.r0> upperBounds = k2Var.I0().getParameters().get(i11).getUpperBounds();
                            g0.o(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f50431a.a(c11.n((e30.r0) it2.next(), Variance.INVARIANT).L0()));
                            }
                            if (!a2Var2.a() && a2Var2.b() == Variance.OUT_VARIANCE) {
                                arrayList2.add(f.a.f50431a.a(a2Var2.getType().L0()));
                            }
                            e30.r0 type = a2Var3.getType();
                            g0.n(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).I0().m(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    @m80.l
    public static final e30.c1 b(@m80.k e30.c1 type, @m80.k CaptureStatus status) {
        g0.p(type, "type");
        g0.p(status, "status");
        List<a2> a11 = a(type, status);
        if (a11 != null) {
            return c(type, a11);
        }
        return null;
    }

    public static final e30.c1 c(k2 k2Var, List<? extends a2> list) {
        return e30.u0.m(k2Var.H0(), k2Var.I0(), list, k2Var.J0(), null, 16, null);
    }
}
