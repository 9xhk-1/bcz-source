package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.hh;
import com.xiaomi.push.hl;
import com.xiaomi.push.hu;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.bz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static volatile a f45167a;

        /* renamed from: a, reason: collision with other field name */
        private Context f66a;

        /* renamed from: a, reason: collision with other field name */
        private Boolean f68a;

        /* renamed from: a, reason: collision with other field name */
        private String f69a;

        /* renamed from: a, reason: collision with other field name */
        private C0531a f67a = new C0531a();

        /* renamed from: a, reason: collision with other field name */
        private final ArrayList<hl> f70a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a, reason: collision with other inner class name */
        public class C0531a {

            /* renamed from: a, reason: collision with other field name */
            private ScheduledFuture<?> f73a;

            /* renamed from: a, reason: collision with other field name */
            private ScheduledThreadPoolExecutor f74a = new ScheduledThreadPoolExecutor(1);

            /* renamed from: a, reason: collision with other field name */
            public final ArrayList<hl> f72a = new ArrayList<>();

            /* renamed from: a, reason: collision with other field name */
            private final Runnable f71a = new ab(this);

            public C0531a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b() {
                hl remove = this.f72a.remove(0);
                for (ig igVar : bz.a(Arrays.asList(remove), a.this.f66a.getPackageName(), b.m5683a(a.this.f66a).m5684a(), 30720)) {
                    com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.d());
                    ao.a(a.this.f66a).a((ao) igVar, hh.Notification, true, (hu) null);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (this.f73a == null) {
                    this.f73a = this.f74a.scheduleAtFixedRate(this.f71a, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            public void a(hl hlVar) {
                this.f74a.execute(new aa(this, hlVar));
            }
        }

        public void b(String str) {
            com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient.processPendingList(" + str + pn.j.f81007d);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f70a) {
                arrayList.addAll(this.f70a);
                this.f70a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m5656a((hl) it.next());
            }
        }

        public static a a() {
            if (f45167a == null) {
                synchronized (a.class) {
                    try {
                        if (f45167a == null) {
                            f45167a = new a();
                        }
                    } finally {
                    }
                }
            }
            return f45167a;
        }

        private boolean b(Context context) {
            return b.m5683a(context).m5684a() == null && !a(this.f66a);
        }

        private boolean b(hl hlVar) {
            if (bz.a(hlVar, false)) {
                return false;
            }
            if (!this.f68a.booleanValue()) {
                this.f67a.a(hlVar);
                return true;
            }
            com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + hlVar.d());
            ao.a(this.f66a).a(hlVar);
            return true;
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m5654a(Context context) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f66a = context;
            this.f68a = Boolean.valueOf(a(context));
            b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        private void a(hl hlVar) {
            synchronized (this.f70a) {
                try {
                    if (!this.f70a.contains(hlVar)) {
                        this.f70a.add(hlVar);
                        if (this.f70a.size() > 100) {
                            this.f70a.remove(0);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public synchronized void a(String str) {
            if (TextUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
            } else {
                this.f69a = str;
                b(MiTinyDataClient.PENDING_REASON_CHANNEL);
            }
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m5655a() {
            return this.f66a != null;
        }

        private boolean a(Context context) {
            if (!ao.a(context).m5676a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                if (packageInfo == null) {
                    return false;
                }
                return packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
        
            r0 = new java.lang.StringBuilder();
            r0.append("MiTinyDataClient Pending ");
            r0.append(r6.b());
            r0.append(" reason is ");
            r0.append(com.xiaomi.mipush.sdk.MiTinyDataClient.PENDING_REASON_CHANNEL);
         */
        /* renamed from: a, reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized boolean m5656a(com.xiaomi.push.hl r6) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiTinyDataClient.a.m5656a(com.xiaomi.push.hl):boolean");
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        a.a().m5654a(context);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            a.a().a(str);
        }
    }

    public static boolean upload(Context context, hl hlVar) {
        com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient.upload " + hlVar.d());
        if (!a.a().m5655a()) {
            a.a().m5654a(context);
        }
        return a.a().m5656a(hlVar);
    }

    public static boolean upload(Context context, String str, String str2, long j11, String str3) {
        hl hlVar = new hl();
        hlVar.d(str);
        hlVar.c(str2);
        hlVar.a(j11);
        hlVar.b(str3);
        hlVar.a(true);
        hlVar.a("push_sdk_channel");
        return upload(context, hlVar);
    }

    public static boolean upload(String str, String str2, long j11, String str3) {
        hl hlVar = new hl();
        hlVar.d(str);
        hlVar.c(str2);
        hlVar.a(j11);
        hlVar.b(str3);
        return a.a().m5656a(hlVar);
    }
}
