package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.gg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class x {

    /* renamed from: a, reason: collision with other field name */
    private static final Map<String, byte[]> f1041a = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private static ArrayList<Pair<String, byte[]>> f46412a = new ArrayList<>();

    public static void a(Context context, int i11, String str) {
        Map<String, byte[]> map = f1041a;
        synchronized (map) {
            try {
                for (String str2 : map.keySet()) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("notify registration error. " + str2);
                    a(context, str2, f1041a.get(str2), i11, str);
                }
                f1041a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(String str, byte[] bArr) {
        synchronized (f46412a) {
            try {
                f46412a.add(new Pair<>(str, bArr));
                if (f46412a.size() > 50) {
                    f46412a.remove(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i11, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i11);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, ah.a(str));
    }

    public static void a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f46412a) {
                arrayList = f46412a;
                f46412a = new ArrayList<>();
            }
            boolean a11 = com.xiaomi.push.t.a();
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair<String, byte[]> next = it.next();
                ah.a(xMPushService, (String) next.first, (byte[]) next.second);
                if (!a11) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error when process pending message. " + e11);
            xMPushService.a(10, e11);
        }
    }

    public static void a(XMPushService xMPushService, boolean z11) {
        try {
            Map<String, byte[]> map = f1041a;
            synchronized (map) {
                for (String str : map.keySet()) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("processing pending registration request. " + str);
                    ah.a(xMPushService, str, f1041a.get(str));
                    if (z11 && !com.xiaomi.push.t.a()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f1041a.clear();
            }
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to deal with pending register request. " + e11);
            xMPushService.a(10, e11);
        }
    }

    public static void a(String str, byte[] bArr) {
        Map<String, byte[]> map = f1041a;
        synchronized (map) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("pending registration request. " + str);
            map.put(str, bArr);
        }
    }
}
