package com.mob.commons.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class m extends c {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f40136a = new a();

        /* renamed from: b, reason: collision with root package name */
        private BroadcastReceiver f40137b;

        private a() {
            this.f40137b = null;
            try {
                this.f40137b = new BroadcastReceiver() { // from class: com.mob.commons.a.m.a.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        a.f40136a.a(context, intent);
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.i.a("016 fjXkYhhfghi[fk8fjif=k6fi9k^fgNlk,fj"), new Object[]{this.f40137b, intentFilter}, new Class[]{BroadcastReceiver.class, IntentFilter.class});
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }

        public static a a() {
            return f40136a;
        }

        public void a(Context context, Intent intent) {
            Parcelable parcelableExtra;
            if (intent == null) {
                return;
            }
            try {
                if (!"android.net.wifi.STATE_CHANGE".equals(intent.getAction()) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
                    return;
                }
                l.a().a(2L, m.class, new Object[]{-1, parcelableExtra}, 1);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
    }

    public m() {
        super(com.mob.commons.i.a("002Rhffg"), 0L, com.mob.commons.i.a("0055hffghhfhRg"), 3600L);
    }

    private void n() {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            String bssid = deviceHelper.getBssid();
            String ssid = deviceHelper.getSSID();
            if (!TextUtils.isEmpty(bssid)) {
                ArrayList<HashMap<String, Object>> availableWifiList = deviceHelper.getAvailableWifiList();
                if (availableWifiList != null && !availableWifiList.isEmpty()) {
                    Iterator<HashMap<String, Object>> it = availableWifiList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        HashMap<String, Object> next = it.next();
                        Object obj = next.get(com.mob.commons.i.a("0056hlgjgjgihk"));
                        if (obj != null && String.valueOf(obj).equals(bssid)) {
                            hashMap.putAll(next);
                            break;
                        }
                    }
                    hashMap.remove(com.mob.commons.i.a("005Vhlgjgjgihk"));
                    hashMap.remove(com.mob.commons.i.a("004@gjgjgihk"));
                }
            } else {
                if (TextUtils.isEmpty(ssid)) {
                    return;
                }
                if (com.mob.commons.i.a("014[jnfefmflfmgehffmkehihifg]j,kf").equalsIgnoreCase(ssid)) {
                    return;
                }
            }
            Map<? extends String, ? extends Object> currentWifiInfo = deviceHelper.getCurrentWifiInfo();
            if (currentWifiInfo != null) {
                hashMap.putAll(currentWifiInfo);
            }
            hashMap.put("ssmt", ssid);
            hashMap.put("bsmt", bssid);
            a("WIMT", hashMap, true);
            TreeMap treeMap = new TreeMap();
            treeMap.put("ssmt", ssid);
            treeMap.put("bsmt", bssid);
            v.a().a(v.f40440q, Data.MD5(new JSONObject(treeMap).toString()));
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private void o() {
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            String ssid = deviceHelper.getSSID();
            String bssid = deviceHelper.getBssid();
            if (!TextUtils.isEmpty(bssid) || (!TextUtils.isEmpty(ssid) && !com.mob.commons.i.a("0141jnfefmflfmgehffmkehihifg4j*kf").equalsIgnoreCase(ssid))) {
                TreeMap treeMap = new TreeMap();
                treeMap.put("ssmt", ssid);
                treeMap.put("bsmt", bssid);
                String MD5 = Data.MD5(new JSONObject(treeMap).toString());
                String b11 = v.a().b(v.f40440q, (String) null);
                if (e()) {
                    if (b11 == null || !b11.equals(MD5)) {
                        n();
                    }
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        if (this.f40115a != null) {
            o();
        } else {
            n();
            a.a();
        }
    }
}
