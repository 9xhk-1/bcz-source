package py;

import a00.h0;
import a00.i0;
import ix.p1;
import ix.q1;
import ix.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPipelineRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PipelineRequest.kt\nio/ktor/server/request/PipelineRequestKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1863#2:101\n1557#2:102\n1628#2,3:103\n1864#2:106\n*S KotlinDebug\n*F\n+ 1 PipelineRequest.kt\nio/ktor/server/request/PipelineRequestKt\n*L\n94#1:101\n95#1:102\n95#1:103,3\n94#1:106\n*E\n"})
/* loaded from: classes8.dex */
public final class h {
    @m80.k
    public static final p1 a(@m80.k d dVar, @m80.k p1 parameters) {
        List list;
        g0.p(dVar, "<this>");
        g0.p(parameters, "parameters");
        q1 b11 = t1.b(0, 1, null);
        for (String str : dVar.d().names()) {
            List<String> a11 = parameters.a(str);
            if (a11 != null) {
                List<String> list2 = a11;
                list = new ArrayList(i0.d0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    list.add(ix.f.k((String) it.next(), 0, 0, true, null, 11, null));
                }
            } else {
                list = null;
            }
            if (list == null) {
                list = h0.J();
            }
            b11.f(ix.f.k(str, 0, 0, false, null, 15, null), list);
        }
        return b11.build();
    }
}
