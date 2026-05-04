package x20;

import a00.m0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,261:1\n230#2,2:262\n295#2,2:264\n774#2:271\n865#2,2:272\n206#3,5:266\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n*L\n71#1:262,2\n74#1:264,2\n87#1:271\n87#1:272,2\n77#1:266,5\n*E\n"})
/* loaded from: classes8.dex */
public final class m {
    @m80.l
    public static final Set<n20.f> a(@m80.k Iterable<? extends k> iterable) {
        g0.p(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends k> it = iterable.iterator();
        while (it.hasNext()) {
            Set<n20.f> g11 = it.next().g();
            if (g11 == null) {
                return null;
            }
            m0.s0(hashSet, g11);
        }
        return hashSet;
    }
}
