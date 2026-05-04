package h5;

import com.baicizhan.app.api.service.model.game.RewardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRewardModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewardModel.kt\ncom/baicizhan/app/biz/game/model/RewardModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1491#2:32\n1516#2,3:33\n1519#2,3:43\n382#3,7:36\n126#4:46\n153#4,2:47\n155#4:50\n1#5:49\n*S KotlinDebug\n*F\n+ 1 RewardModel.kt\ncom/baicizhan/app/biz/game/model/RewardModelKt\n*L\n27#1:32\n27#1:33,3\n27#1:43,3\n27#1:36,7\n28#1:46\n28#1:47,2\n28#1:50\n*E\n"})
/* loaded from: classes3.dex */
public final class d0 {
    @m80.k
    public static final List<m3.v0> a(@m80.k List<m3.v0> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            RewardType j11 = ((m3.v0) obj).j();
            Object obj2 = linkedHashMap.get(j11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(j11, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            RewardType rewardType = (RewardType) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                i11 += ((m3.v0) it.next()).f();
            }
            arrayList.add(new m3.v0(rewardType, i11, (String) null, 4, (kotlin.jvm.internal.v) null));
        }
        return arrayList;
    }
}
