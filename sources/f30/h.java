package f30;

import a00.i0;
import e30.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinTypeRefiner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1557#2:91\n1628#2,3:92\n*S KotlinDebug\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n*L\n78#1:91\n78#1:92,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p10.z<t<c0>> f50433a = new p10.z<>("KotlinTypeRefiner");

    @m80.k
    public static final p10.z<t<c0>> a() {
        return f50433a;
    }

    @m80.k
    public static final List<r0> b(@m80.k g gVar, @m80.k Iterable<? extends r0> types) {
        g0.p(gVar, "<this>");
        g0.p(types, "types");
        ArrayList arrayList = new ArrayList(i0.d0(types, 10));
        Iterator<? extends r0> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a(it.next()));
        }
        return arrayList;
    }
}
