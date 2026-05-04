package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f40338a = new g();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f40339b = false;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f40340c = 0;

    private g() {
    }

    public static g a() {
        return f40338a;
    }

    private synchronized boolean c() {
        try {
            long longValue = ((Long) b.a(i.a("004k,fi^k^fn"), 5L)).longValue() * 1000;
            if (this.f40340c != 0 && System.currentTimeMillis() - this.f40340c <= longValue) {
                return this.f40339b;
            }
            boolean a11 = a((String) b.a(i.a("002Ifi-j"), i.a("006Iililimimimim")));
            if (this.f40340c == 0 || a11 != this.f40339b) {
                a(a11);
            }
            this.f40340c = System.currentTimeMillis();
            this.f40339b = a11;
            return a11;
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return true;
        }
    }

    public synchronized boolean b() {
        return !c();
    }

    private boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            char[] charArray = str.toCharArray();
            HashMap hashMap = new HashMap();
            boolean z11 = false;
            for (int i11 = 0; i11 < charArray.length; i11++) {
                char c11 = charArray[i11];
                if (c11 == '1') {
                    z11 |= a(i11);
                } else if (c11 != '0') {
                    List list = (List) hashMap.get(Character.valueOf(c11));
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(Integer.valueOf(i11));
                    hashMap.put(Character.valueOf(charArray[i11]), list);
                }
                if (z11) {
                    return true;
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                boolean z12 = true;
                while (it2.hasNext()) {
                    z12 &= a(((Integer) it2.next()).intValue());
                }
                z11 |= z12;
                if (z11) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return true;
        }
    }

    private boolean a(int i11) {
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        if (deviceHelper == null) {
            return true;
        }
        if (i11 == 0) {
            return deviceHelper.checkUA();
        }
        if (i11 == 1) {
            return deviceHelper.usbEnable();
        }
        if (i11 == 2) {
            return deviceHelper.vpn();
        }
        if (i11 == 3) {
            return deviceHelper.isWifiProxy();
        }
        if (i11 == 4) {
            return deviceHelper.isRooted();
        }
        if (i11 != 5) {
            return true;
        }
        return deviceHelper.cx();
    }

    private void a(boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put(i.a("005_figfIk.fhfj"), Integer.valueOf(!z11 ? 1 : 0));
        hashMap.put(i.a("002Ofefi"), Integer.valueOf(a(0) ? 1 : 0));
        hashMap.put(i.a("0029feTj"), Integer.valueOf(a(1) ? 1 : 0));
        hashMap.put(i.a("002lg"), Integer.valueOf(a(2) ? 1 : 0));
        hashMap.put(i.a("002=hf,g"), Integer.valueOf(a(3) ? 1 : 0));
        hashMap.put(i.a("002WfjIf"), Integer.valueOf(a(4) ? 1 : 0));
        hashMap.put(i.a("002-fnLg"), Integer.valueOf(a(5) ? 1 : 0));
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(i.a("004f?fk)gk"), "ECMT");
        hashMap2.put(i.a("004j>fhKf,fh"), hashMap);
        hashMap2.put(i.a("008j.fh%fkfLfg@nk"), Long.valueOf(currentTimeMillis));
        d.a().a(currentTimeMillis, hashMap2);
    }
}
