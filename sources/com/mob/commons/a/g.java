package com.mob.commons.a;

import android.location.Location;
import com.mob.MobSDK;
import com.mob.commons.r;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class g extends c {
    public g() {
        super("l", 0L, l.a("004>feggegQf"), 86400L);
    }

    @Override // com.mob.commons.a.c
    public void a() {
        ArrayList<HashMap<String, Object>> arrayList;
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        try {
            if (deviceHelper.checkPermission("android.permission.CHANGE_WIFI_STATE") && deviceHelper.checkPermission("android.permission.ACCESS_WIFI_STATE")) {
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                deviceHelper.registerWifiScanReceiver(linkedBlockingQueue);
                deviceHelper.scanWifiList();
                Boolean poll = linkedBlockingQueue.poll(5L, TimeUnit.SECONDS);
                if (poll != null && poll.booleanValue()) {
                    arrayList = r.b();
                    a(arrayList);
                }
            }
            arrayList = null;
            a(arrayList);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private void a(ArrayList<HashMap<String, Object>> arrayList) {
        try {
            if (e()) {
                a(arrayList, 2);
                a(arrayList, 1);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private void a(ArrayList<HashMap<String, Object>> arrayList, int i11) {
        Location location;
        HashMap<String, Object> a11;
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        if (i11 == 1) {
            location = deviceHelper.getLocation(30, 0, true);
        } else {
            location = deviceHelper.getLocation(0, 15, true);
        }
        if (location == null || (a11 = a(location, false)) == null || a11.isEmpty()) {
            return;
        }
        a11.put("lctpmt", Integer.valueOf(i11));
        if (arrayList != null && !arrayList.isEmpty()) {
            a11.put("wilmt", arrayList);
        }
        a("LCMT", a11);
    }
}
