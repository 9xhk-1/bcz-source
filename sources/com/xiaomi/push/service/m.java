package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f46376a = new HashMap();

    private static void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f46376a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (elapsedRealtime - entry.getValue().longValue() > 60000) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f46376a.remove((String) it.next());
        }
    }

    public static boolean a(byte[] bArr, String str) {
        boolean z11 = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String a11 = com.xiaomi.push.bo.a(bArr);
            if (!TextUtils.isEmpty(a11)) {
                Map<String, Long> map = f46376a;
                synchronized (map) {
                    if (map.get(a11 + str) != null) {
                        z11 = true;
                    } else {
                        map.put(a11 + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    a();
                }
                return z11;
            }
        }
        return false;
    }
}
