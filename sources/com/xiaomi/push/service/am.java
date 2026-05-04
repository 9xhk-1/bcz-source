package com.xiaomi.push.service;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes8.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private static Object f46244a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, Queue<String>> f929a = new HashMap();

    public static boolean a(XMPushService xMPushService, String str, String str2) {
        synchronized (f46244a) {
            try {
                SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
                Queue<String> queue = f929a.get(str);
                if (queue == null) {
                    String[] split = sharedPreferences.getString(str, "").split(",");
                    LinkedList linkedList = new LinkedList();
                    for (String str3 : split) {
                        linkedList.add(str3);
                    }
                    f929a.put(str, linkedList);
                    queue = linkedList;
                }
                if (queue.contains(str2)) {
                    return true;
                }
                queue.add(str2);
                if (queue.size() > 25) {
                    queue.poll();
                }
                String a11 = com.xiaomi.push.bo.a(queue, ",");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str, a11);
                edit.commit();
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
