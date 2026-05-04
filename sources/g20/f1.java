package g20;

import a00.k1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementInfo\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n462#2:316\n412#2:317\n1246#3,4:318\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementInfo\n*L\n28#1:316\n28#1:317\n28#1:318,4\n*E\n"})
/* loaded from: classes8.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<Integer, h> f52597a;

    public f1(@m80.k Map<Integer, h> map) {
        kotlin.jvm.internal.g0.p(map, "map");
        this.f52597a = map;
    }

    @m80.k
    public final f1 a() {
        Map<Integer, h> map = this.f52597a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), h.c((h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new f1(linkedHashMap);
    }

    @m80.k
    public final Map<Integer, h> b() {
        return this.f52597a;
    }
}
