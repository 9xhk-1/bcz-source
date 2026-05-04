package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ResHelper;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class e extends c {
    public e() {
        super(com.mob.commons.o.a("002hj"), 0L, com.mob.commons.o.a("004hj!dg^c"), 3600L);
    }

    private HashMap<String, Object> n() {
        HashMap<String, Object> hashMap = new HashMap<>();
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        hashMap.putAll(deviceHelper.getCPUFreq());
        hashMap.put(com.mob.commons.o.a("010ecCecNd5ecgfecdcdk0d"), Integer.valueOf(deviceHelper.getAlbumCount()));
        hashMap.putAll(deviceHelper.getTraffic());
        hashMap.putAll(deviceHelper.getDeviceMemUsage());
        hashMap.put(com.mob.commons.o.a("010TdgdhRi+dfQdi8eideXli"), Long.valueOf(System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.mob.commons.a.c
    public void a() {
        try {
            String str = com.mob.commons.j.f40349c;
            HashMap hashMap = (HashMap) ResHelper.readEncodedData(str, HashMap.class);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            HashMap<String, Object> n11 = n();
            ArrayList arrayList = (ArrayList) hashMap.get(com.mob.commons.o.a("004)eddefgWd"));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(n11);
            hashMap.put(com.mob.commons.o.a("004+eddefg2d"), arrayList);
            ResHelper.saveAndEncodeData(str, hashMap);
            v a11 = v.a();
            String str2 = v.f40436m;
            long b11 = a11.b(str2, 0L);
            long longValue = ((Long) a(com.mob.commons.o.a("004hj-dc[c"), (String) 3600L)).longValue() * 1000;
            if (b11 != 0 && System.currentTimeMillis() - longValue < b11) {
                return;
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.putAll(hashMap);
            a("DEXTVARMT", hashMap2);
            ResHelper.saveAndEncodeData(str, null);
            v.a().a(str2, System.currentTimeMillis());
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
