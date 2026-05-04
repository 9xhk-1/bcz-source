package com.baicizhan.client.business.util;

import a00.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAdCommonHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdCommonHelper.kt\ncom/baicizhan/client/business/util/AdCommonHelperKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,77:1\n536#2:78\n521#2,6:79\n126#3:85\n153#3,3:86\n*S KotlinDebug\n*F\n+ 1 AdCommonHelper.kt\ncom/baicizhan/client/business/util/AdCommonHelperKt\n*L\n76#1:78\n76#1:79,6\n76#1:85\n76#1:86,3\n*E\n"})
/* loaded from: classes4.dex */
public final class AdCommonHelperKt {

    @m80.k
    private static final Map<String, Integer> adAppPackageList = l1.W(h1.a("com.jingdong.app.mall", 1), h1.a("com.taobao.taobao", 2), h1.a("com.sankuai.meituan", 3), h1.a("com.xunmeng.pinduoduo", 4));

    @m80.k
    public static final List<Integer> getAdAppInstalledList() {
        Map<String, Integer> map = adAppPackageList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (DeviceHelper.Companion.isAppInstalled(KotlinExtKt.getGlobalApplicationContext(), entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        return arrayList;
    }

    @m80.k
    public static final Map<String, Integer> getAdAppPackageList() {
        return adAppPackageList;
    }
}
