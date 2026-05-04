package com.mob.commons.a;

import android.location.Location;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.v;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import java.util.HashMap;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class h extends c {
    public h() {
        super(com.mob.commons.j.a("002Ocacb"), 0L, com.mob.commons.j.a("006*cacbddbdWca"), 60L);
        c();
    }

    private void n() {
        HashMap<String, Object> a11;
        Location location = DeviceHelper.getInstance(MobSDK.getContext()).getLocation(0, 0, true);
        if (location == null || (a11 = a(location, false)) == null || a11.isEmpty()) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("ltdmt", Double.valueOf(location.getLatitude()));
        treeMap.put("lndmt", Double.valueOf(location.getLongitude()));
        String MD5 = Data.MD5(new JSONObject(treeMap).toString());
        v a12 = v.a();
        String str = v.f40437n;
        String b11 = a12.b(str, (String) null);
        v a13 = v.a();
        String str2 = v.f40438o;
        long b12 = a13.b(str2, 0L);
        long longValue = ((Long) a(com.mob.commons.j.a("006TcacbddbdRc7cb"), (String) 3600L)).longValue() * 1000;
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(b11) || !b11.equals(MD5) || currentTimeMillis - b12 >= longValue) {
            a("O_LCMT", a11);
            v.a().a(str, MD5);
            v.a().a(str2, currentTimeMillis);
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        n();
    }
}
