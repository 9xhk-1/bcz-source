package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class es {

    /* renamed from: a, reason: collision with root package name */
    private static Vector<Pair<String, Long>> f45489a = new Vector<>();

    /* renamed from: a, reason: collision with other field name */
    private static ConcurrentHashMap<String, Long> f358a = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f45489a) {
            for (int i11 = 0; i11 < f45489a.size(); i11++) {
                try {
                    Pair<String, Long> elementAt = f45489a.elementAt(i11);
                    sb2.append((String) elementAt.first);
                    sb2.append(":");
                    sb2.append(elementAt.second);
                    if (i11 < f45489a.size() - 1) {
                        sb2.append(com.alipay.sdk.m.u.i.f11097b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f45489a.clear();
        }
        return sb2.toString();
    }
}
