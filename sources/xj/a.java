package xj;

import a00.h0;
import a00.i0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wordlistv2.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSidebarUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SidebarUtils.kt\ncom/baicizhan/main/wordlistv2/sidebar/SidebarUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1563#2:15\n1634#2,3:16\n*S KotlinDebug\n*F\n+ 1 SidebarUtils.kt\ncom/baicizhan/main/wordlistv2/sidebar/SidebarUtils\n*L\n10#1:15\n10#1:16,3\n*E\n"})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f98126a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f98127b = 0;

    @k
    public final List<String> a(@k List<c1> list) {
        g0.p(list, "list");
        List U = h0.U("#");
        List<c1> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String valueOf = String.valueOf(r0.x7(((c1) it.next()).w()));
            g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            g0.o(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        U.addAll(a00.r0.e2(arrayList));
        return a00.r0.a6(U);
    }
}
