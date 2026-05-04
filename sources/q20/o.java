package q20;

import a00.a0;
import a00.r0;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1628#2,3:85\n855#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
/* loaded from: classes8.dex */
public final class o {
    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <H> Collection<H> b(@m80.k Collection<? extends H> collection, @m80.k x00.l<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> descriptorByHandle) {
        g0.p(collection, "<this>");
        g0.p(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        o30.l a11 = o30.l.f75704c.a();
        while (!linkedList.isEmpty()) {
            Object G2 = r0.G2(linkedList);
            o30.l a12 = o30.l.f75704c.a();
            Collection<a0.d> p11 = OverridingUtil.p(G2, linkedList, descriptorByHandle, new n(a12));
            g0.o(p11, "extractMembersOverridableInBothWays(...)");
            if (p11.size() == 1 && a12.isEmpty()) {
                Object k52 = r0.k5(p11);
                g0.o(k52, "single(...)");
                a11.add(k52);
            } else {
                a0.e eVar = (Object) OverridingUtil.L(p11, descriptorByHandle);
                kotlin.reflect.jvm.internal.impl.descriptors.a invoke = descriptorByHandle.invoke(eVar);
                for (a0.d dVar : p11) {
                    g0.m(dVar);
                    if (!OverridingUtil.B(invoke, descriptorByHandle.invoke(dVar))) {
                        a12.add(dVar);
                    }
                }
                if (!a12.isEmpty()) {
                    a11.addAll(a12);
                }
                a11.add(eVar);
            }
        }
        return a11;
    }

    public static final g2 c(o30.l lVar, Object obj) {
        g0.m(obj);
        lVar.add(obj);
        return g2.f100423a;
    }
}
