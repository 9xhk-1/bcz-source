package com.mob.commons.a;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.r;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class n extends c {
    public n() {
        super(com.mob.commons.i.a("002Rhfgf"), 0L, com.mob.commons.i.a("0041hfgfhifj"), 300L);
        c();
    }

    private void n() {
        try {
            ArrayList<HashMap<String, Object>> b11 = r.b();
            if (b11 == null || b11.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<HashMap<String, Object>> it = b11.iterator();
            while (it.hasNext()) {
                Object obj = it.next().get(com.mob.commons.i.a("005Khlgjgjgihk"));
                if (obj != null) {
                    arrayList.add(String.valueOf(obj));
                }
            }
            Collections.sort(arrayList);
            String MD5 = Data.MD5(TextUtils.join("", arrayList));
            v a11 = v.a();
            String str = v.f40441r;
            String b12 = a11.b(str, (String) null);
            long currentTimeMillis = System.currentTimeMillis();
            v a12 = v.a();
            String str2 = v.f40442s;
            long b13 = a12.b(str2, 0L);
            long intValue = ((Integer) a(com.mob.commons.i.a("005AhfgfhhfhKg"), (String) 7200)).intValue() * 1000;
            if (b12 == null || !b12.equals(MD5) || currentTimeMillis - intValue >= b13) {
                a(0L, "WLMT", (Object) b11, true);
                v.a().a(str, MD5);
                v.a().a(str2, currentTimeMillis);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            if (deviceHelper.checkPermission("android.permission.CHANGE_WIFI_STATE") && deviceHelper.checkPermission("android.permission.ACCESS_WIFI_STATE")) {
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                deviceHelper.registerWifiScanReceiver(linkedBlockingQueue);
                deviceHelper.scanWifiList();
                Boolean poll = linkedBlockingQueue.poll(60L, TimeUnit.SECONDS);
                if (poll == null || !poll.booleanValue()) {
                    return;
                }
                n();
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
