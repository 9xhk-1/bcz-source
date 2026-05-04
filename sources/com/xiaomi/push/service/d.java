package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static List<a> f46369a = new CopyOnWriteArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46370a;

        /* renamed from: a, reason: collision with other field name */
        public final long f1007a;

        /* renamed from: a, reason: collision with other field name */
        public final String f1008a;

        /* renamed from: a, reason: collision with other field name */
        public final Notification.Action[] f1009a;

        public a(String str, long j11, int i11, Notification.Action[] actionArr) {
            this.f1008a = str;
            this.f1007a = j11;
            this.f46370a = i11;
            this.f1009a = actionArr;
        }
    }

    private static void a() {
        for (int size = f46369a.size() - 1; size >= 0; size--) {
            a aVar = f46369a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f1007a > 5000) {
                f46369a.remove(aVar);
            }
        }
        if (f46369a.size() > 10) {
            f46369a.remove(0);
        }
    }

    public static void a(Context context, StatusBarNotification statusBarNotification, int i11) {
        if (!com.xiaomi.push.j.m6172a(context) || i11 <= 0 || statusBarNotification == null) {
            return;
        }
        a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i11, ay.m6251a(statusBarNotification.getNotification())));
    }

    private static void a(a aVar) {
        f46369a.add(aVar);
        a();
    }
}
