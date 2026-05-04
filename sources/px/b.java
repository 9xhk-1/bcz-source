package px;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import ox.m;
import u30.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRegexParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegexParser.kt\nio/ktor/http/parsing/regex/RegexParser\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n216#2:34\n217#2:38\n1863#3:35\n1864#3:37\n1#4:36\n*S KotlinDebug\n*F\n+ 1 RegexParser.kt\nio/ktor/http/parsing/regex/RegexParser\n*L\n20#1:34\n20#1:38\n21#1:35\n21#1:37\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Regex f81298a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, List<Integer>> f81299b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Regex expression, @k Map<String, ? extends List<Integer>> indexes) {
        g0.p(expression, "expression");
        g0.p(indexes, "indexes");
        this.f81298a = expression;
        this.f81299b = indexes;
    }

    @Override // ox.m
    public boolean a(@k String input) {
        g0.p(input, "input");
        return this.f81298a.matches(input);
    }

    @Override // ox.m
    @l
    public ox.l parse(@k String input) {
        g0.p(input, "input");
        o matchEntire = this.f81298a.matchEntire(input);
        if (matchEntire == null || matchEntire.getValue().length() != input.length()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<Integer>> entry : this.f81299b.entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                ArrayList arrayList = new ArrayList();
                u30.l lVar = matchEntire.c().get(intValue);
                if (lVar != null) {
                    arrayList.add(lVar.f());
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(key, arrayList);
                }
            }
        }
        return new ox.l(linkedHashMap);
    }
}
