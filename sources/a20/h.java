package a20;

import a00.i0;
import c20.z0;
import e30.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import p10.j1;
import p10.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1557#2:69\n1628#2,3:70\n*S KotlinDebug\n*F\n+ 1 util.kt\norg/jetbrains/kotlin/load/java/descriptors/UtilKt\n*L\n40#1:69\n40#1:70,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h {
    @k
    public static final List<j1> a(@k Collection<? extends r0> newValueParameterTypes, @k Collection<? extends j1> oldValueParameters, @k kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        g0.p(newValueParameterTypes, "newValueParameterTypes");
        g0.p(oldValueParameters, "oldValueParameters");
        kotlin.reflect.jvm.internal.impl.descriptors.a newOwner = aVar;
        g0.p(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> o62 = a00.r0.o6(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(i0.d0(o62, 10));
        for (Pair pair : o62) {
            r0 r0Var = (r0) pair.component1();
            j1 j1Var = (j1) pair.component2();
            int index = j1Var.getIndex();
            q10.g annotations = j1Var.getAnnotations();
            n20.f name = j1Var.getName();
            g0.o(name, "getName(...)");
            boolean S = j1Var.S();
            boolean v02 = j1Var.v0();
            boolean u02 = j1Var.u0();
            r0 k11 = j1Var.y0() != null ? u20.e.s(newOwner).q().k(r0Var) : null;
            x0 source = j1Var.getSource();
            g0.o(source, "getSource(...)");
            arrayList.add(new s10.u0(newOwner, null, index, annotations, name, r0Var, S, v02, u02, k11, source));
            newOwner = aVar;
        }
        return arrayList;
    }

    @l
    public static final z0 b(@k p10.b bVar) {
        g0.p(bVar, "<this>");
        p10.b x11 = u20.e.x(bVar);
        if (x11 == null) {
            return null;
        }
        x20.k r02 = x11.r0();
        z0 z0Var = r02 instanceof z0 ? (z0) r02 : null;
        return z0Var == null ? b(x11) : z0Var;
    }
}
