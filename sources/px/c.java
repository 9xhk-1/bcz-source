package px;

import a00.h0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import m80.k;
import ox.e;
import ox.h;
import ox.i;
import ox.j;
import ox.m;
import ox.q;
import ox.r;
import ox.t;
import ox.u;
import s60.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRegexParserGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexParserGenerator.kt\nio/ktor/http/parsing/regex/RegexParserGeneratorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1872#2,3:73\n*S KotlinDebug\n*F\n+ 1 RegexParserGenerator.kt\nio/ktor/http/parsing/regex/RegexParserGeneratorKt\n*L\n41#1:73,3\n*E\n"})
/* loaded from: classes8.dex */
public final class c {
    public static final void a(Map<String, List<Integer>> map, String str, int i11) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        Integer valueOf = Integer.valueOf(i11);
        List<Integer> list = map.get(str);
        g0.m(list);
        list.add(valueOf);
    }

    @k
    public static final m b(@k e eVar) {
        g0.p(eVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new b(new Regex(d(eVar, linkedHashMap, 0, false, 6, null).b()), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a c(e eVar, Map<String, List<Integer>> map, int i11, boolean z11) {
        char c11;
        if (eVar instanceof u) {
            return new a(Regex.Companion.c(((u) eVar).c()), 0, false, 6, null);
        }
        if (eVar instanceof r) {
            return new a(((r) eVar).c(), 0, false, 6, null);
        }
        if (eVar instanceof j) {
            j jVar = (j) eVar;
            a d11 = d(jVar.b(), map, i11 + 1, false, 4, null);
            a(map, jVar.c(), i11);
            return new a(d11.b(), d11.a(), true);
        }
        if (eVar instanceof ox.c) {
            StringBuilder sb2 = new StringBuilder();
            int i12 = z11 ? i11 + 1 : i11;
            int i13 = 0;
            for (Object obj : ((ox.c) eVar).a()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    h0.b0();
                }
                a c12 = c((e) obj, map, i12, true);
                if (i13 != 0 && (eVar instanceof ox.k)) {
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
                sb2.append(c12.b());
                i12 += c12.a();
                i13 = i14;
            }
            int i15 = i12 - i11;
            if (z11) {
                i15--;
            }
            String sb3 = sb2.toString();
            g0.o(sb3, "toString(...)");
            return new a(sb3, i15, z11);
        }
        if (eVar instanceof t) {
            if (eVar instanceof i) {
                c11 = d.f88057a;
            } else if (eVar instanceof h) {
                c11 = '*';
            } else {
                if (!(eVar instanceof ox.b)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + eVar).toString());
                }
                c11 = '+';
            }
            a c13 = c(((t) eVar).b(), map, i11, true);
            return new a(c13.b() + c11, c13.a(), false, 4, null);
        }
        if (eVar instanceof ox.a) {
            return new a('[' + Regex.Companion.c(((ox.a) eVar).c()) + l50.b.f69930l, 0, false, 6, null);
        }
        if (!(eVar instanceof q)) {
            throw new IllegalStateException(("Unsupported grammar element: " + eVar).toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append('[');
        q qVar = (q) eVar;
        sb4.append(qVar.c());
        sb4.append('-');
        sb4.append(qVar.d());
        sb4.append(l50.b.f69930l);
        return new a(sb4.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ a d(e eVar, Map map, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return c(eVar, map, i11, z11);
    }
}
