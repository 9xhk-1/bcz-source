package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.bi;
import com.xiaomi.push.bj;
import com.xiaomi.push.bn;
import com.xiaomi.push.da;
import com.xiaomi.push.en;
import com.xiaomi.push.hh;
import com.xiaomi.push.hi;
import com.xiaomi.push.hl;
import com.xiaomi.push.hm;
import com.xiaomi.push.hr;
import com.xiaomi.push.hu;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.in;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.bd;
import com.xiaomi.push.service.bk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ao {

    /* renamed from: a, reason: collision with root package name */
    private static ao f45189a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final ArrayList<a> f85a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f45190b = false;

    /* renamed from: a, reason: collision with other field name */
    private long f86a;

    /* renamed from: a, reason: collision with other field name */
    private Context f87a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f89a;

    /* renamed from: a, reason: collision with other field name */
    private Messenger f90a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f94a;

    /* renamed from: a, reason: collision with other field name */
    private List<Message> f93a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f45191c = false;

    /* renamed from: b, reason: collision with other field name */
    private String f95b = null;

    /* renamed from: a, reason: collision with other field name */
    private Intent f88a = null;

    /* renamed from: a, reason: collision with other field name */
    private Integer f91a = null;

    /* renamed from: a, reason: collision with other field name */
    private String f92a = null;

    public static class a<T extends is<T, ?>> {

        /* renamed from: a, reason: collision with root package name */
        hh f45192a;

        /* renamed from: a, reason: collision with other field name */
        T f96a;

        /* renamed from: a, reason: collision with other field name */
        boolean f97a;
    }

    private ao(Context context) {
        this.f94a = false;
        this.f89a = null;
        this.f87a = context.getApplicationContext();
        this.f94a = m5669c();
        f45190b = m5670d();
        this.f89a = new ap(this, Looper.getMainLooper());
        if (com.xiaomi.push.j.m6172a(context)) {
            com.xiaomi.push.service.i.a(new aq(this));
        }
        Intent b11 = b();
        if (b11 != null) {
            b(b11);
        }
    }

    private synchronized int a() {
        return this.f87a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    private Intent b() {
        if (!"com.xiaomi.xmsf".equals(this.f87a.getPackageName())) {
            return c();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel xmsf create own channel");
        return e();
    }

    private Intent c() {
        if (m5676a()) {
            com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start miui china channel");
            return d();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start  own channel");
        return e();
    }

    private Intent d() {
        Intent intent = new Intent();
        String packageName = this.f87a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m5667a());
        intent.putExtra("mipush_app_package", packageName);
        h();
        return intent;
    }

    private Intent e() {
        Intent intent = new Intent();
        String packageName = this.f87a.getPackageName();
        i();
        intent.setComponent(new ComponentName(this.f87a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    private void g() {
        this.f86a = SystemClock.elapsedRealtime();
    }

    private void h() {
        try {
            PackageManager packageManager = this.f87a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f87a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void i() {
        try {
            PackageManager packageManager = this.f87a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f87a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    public void f() {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m5664a.putExtra(bk.B, this.f87a.getPackageName());
        m5664a.putExtra(bk.G, bn.b(this.f87a.getPackageName()));
        c(m5664a);
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m5672a() {
        return this.f86a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m5678b() {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        c(m5664a);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m5680c() {
        if (this.f88a != null) {
            g();
            c(this.f88a);
            this.f88a = null;
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m5681d() {
        ArrayList<a> arrayList = f85a;
        synchronized (arrayList) {
            boolean z11 = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                a next = it.next();
                a(next.f96a, next.f45192a, next.f97a, false, null, true);
                if (!z11) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f85a.clear();
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    public void m5682e() {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) bj.a("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f87a.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            com.xiaomi.channel.commonutils.logger.b.m5639a("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        m5664a.putExtra(bk.B, packageName);
        c(m5664a);
    }

    private synchronized void c(int i11) {
        this.f87a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i11).commit();
    }

    private synchronized void d(Intent intent) {
        try {
            if (this.f45191c) {
                Message a11 = a(intent);
                if (this.f93a.size() >= 50) {
                    this.f93a.remove(0);
                }
                this.f93a.add(a11);
                return;
            }
            if (this.f90a == null) {
                this.f87a.bindService(intent, new as(this), 1);
                this.f45191c = true;
                this.f93a.clear();
                this.f93a.add(a(intent));
            } else {
                try {
                    this.f90a.send(a(intent));
                } catch (RemoteException unused) {
                    this.f90a = null;
                    this.f45191c = false;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    private boolean m5671e() {
        String packageName = this.f87a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f87a.getApplicationInfo().flags & 1) != 0;
    }

    public void b(int i11) {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m5664a.putExtra(bk.B, this.f87a.getPackageName());
        m5664a.putExtra(bk.E, i11);
        m5664a.putExtra(bk.G, bn.b(this.f87a.getPackageName() + i11));
        c(m5664a);
    }

    /* renamed from: a, reason: collision with other method in class */
    private Intent m5664a() {
        return (!m5676a() || "com.xiaomi.xmsf".equals(this.f87a.getPackageName())) ? e() : d();
    }

    private void b(Intent intent) {
        try {
            if (com.xiaomi.push.j.m6171a() || Build.VERSION.SDK_INT < 26) {
                this.f87a.startService(intent);
            } else {
                d(intent);
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
    }

    private void c(Intent intent) {
        ba a11 = ba.a(this.f87a);
        int a12 = hm.ServiceBootMode.a();
        hi hiVar = hi.START;
        int a13 = a11.a(a12, hiVar.a());
        int a14 = a();
        hi hiVar2 = hi.BIND;
        boolean z11 = a13 == hiVar2.a() && f45190b;
        int a15 = z11 ? hiVar2.a() : hiVar.a();
        if (a15 != a14) {
            m5677a(a15);
        }
        if (z11) {
            d(intent);
        } else {
            b(intent);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    private boolean m5670d() {
        if (m5676a()) {
            try {
                return this.f87a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m5669c() {
        try {
            PackageInfo packageInfo = this.f87a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m5679b() {
        if (!m5676a() || !m5671e()) {
            return true;
        }
        if (this.f91a == null) {
            Integer valueOf = Integer.valueOf(com.xiaomi.push.service.bn.a(this.f87a).a());
            this.f91a = valueOf;
            if (valueOf.intValue() == 0) {
                this.f87a.getContentResolver().registerContentObserver(com.xiaomi.push.service.bn.a(this.f87a).m6261a(), false, new ar(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f91a.intValue() != 0;
    }

    public static synchronized ao a(Context context) {
        ao aoVar;
        synchronized (ao.class) {
            try {
                if (f45189a == null) {
                    f45189a = new ao(context);
                }
                aoVar = f45189a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aoVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    private String m5667a() {
        String str = this.f95b;
        if (str != null) {
            return str;
        }
        try {
            if (this.f87a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f95b = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f95b = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5673a() {
        b(m5664a());
    }

    public void a(int i11) {
        a(i11, 0);
    }

    public void a(int i11, int i12) {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m5664a.putExtra(bk.B, this.f87a.getPackageName());
        m5664a.putExtra(bk.C, i11);
        m5664a.putExtra(bk.D, i12);
        c(m5664a);
    }

    public void a(int i11, String str) {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.thirdparty");
        m5664a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i11);
        m5664a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        b(m5664a);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5674a(Context context) {
        ag a11 = n.a(context);
        if (ag.HUAWEI.equals(a11)) {
            a((String) null, au.UPLOAD_HUAWEI_TOKEN, e.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (ag.OPPO.equals(a11)) {
            a((String) null, au.UPLOAD_COS_TOKEN, e.ASSEMBLE_PUSH_COS, "update");
        }
        if (ag.VIVO.equals(a11)) {
            a((String) null, au.UPLOAD_FTOS_TOKEN, e.ASSEMBLE_PUSH_FTOS, "update");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5675a(Intent intent) {
        intent.fillIn(m5664a(), 24);
        c(intent);
    }

    public final void a(hl hlVar) {
        Intent m5664a = m5664a();
        byte[] a11 = ir.a(hlVar);
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        m5664a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        m5664a.putExtra("mipush_payload", a11);
        b(m5664a);
    }

    public final void a(ih ihVar, boolean z11) {
        en.a(this.f87a.getApplicationContext()).a(this.f87a.getPackageName(), "E100003", ihVar.a(), 6001, null);
        this.f88a = null;
        b.m5683a(this.f87a).f102a = ihVar.a();
        Intent m5664a = m5664a();
        byte[] a11 = ir.a(ai.a(this.f87a, ihVar, hh.Registration));
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("register fail, because msgBytes is null.");
            return;
        }
        m5664a.setAction("com.xiaomi.mipush.REGISTER_APP");
        m5664a.putExtra("mipush_app_id", b.m5683a(this.f87a).m5684a());
        m5664a.putExtra("mipush_payload", a11);
        m5664a.putExtra("mipush_session", this.f92a);
        m5664a.putExtra("mipush_env_chanage", z11);
        m5664a.putExtra("mipush_env_type", b.m5683a(this.f87a).a());
        if (!bi.b(this.f87a) || !m5679b()) {
            this.f88a = m5664a;
        } else {
            g();
            c(m5664a);
        }
    }

    public final void a(in inVar) {
        byte[] a11 = ir.a(ai.a(this.f87a, inVar, hh.UnRegistration));
        if (a11 == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        m5664a.putExtra("mipush_app_id", b.m5683a(this.f87a).m5684a());
        m5664a.putExtra("mipush_payload", a11);
        c(m5664a);
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, hu huVar) {
        a((ao) t11, hhVar, !hhVar.equals(hh.Registration), huVar);
    }

    public <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11) {
        a aVar = new a();
        aVar.f96a = t11;
        aVar.f45192a = hhVar;
        aVar.f97a = z11;
        ArrayList<a> arrayList = f85a;
        synchronized (arrayList) {
            try {
                arrayList.add(aVar);
                if (arrayList.size() > 10) {
                    arrayList.remove(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11, hu huVar) {
        a(t11, hhVar, z11, true, huVar, true);
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11, hu huVar, boolean z12) {
        a(t11, hhVar, z11, true, huVar, z12);
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11, boolean z12, hu huVar, boolean z13) {
        a(t11, hhVar, z11, z12, huVar, z13, this.f87a.getPackageName(), b.m5683a(this.f87a).m5684a());
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11, boolean z12, hu huVar, boolean z13, String str, String str2) {
        a(t11, hhVar, z11, z12, huVar, z13, str, str2, true);
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11, boolean z12, hu huVar, boolean z13, String str, String str2, boolean z14) {
        a(t11, hhVar, z11, z12, huVar, z13, str, str2, z14, true);
    }

    public final <T extends is<T, ?>> void a(T t11, hh hhVar, boolean z11, boolean z12, hu huVar, boolean z13, String str, String str2, boolean z14, boolean z15) {
        if (z15 && !b.m5683a(this.f87a).m5692c()) {
            if (z12) {
                a((ao) t11, hhVar, z11);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.b.m5639a("drop the message before initialization.");
                return;
            }
        }
        Context context = this.f87a;
        id a11 = z14 ? ai.a(context, t11, hhVar, z11, str, str2) : ai.b(context, t11, hhVar, z11, str, str2);
        if (huVar != null) {
            a11.a(huVar);
        }
        byte[] a12 = ir.a(a11);
        if (a12 == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("send message fail, because msgBytes is null.");
            return;
        }
        da.a(this.f87a.getPackageName(), this.f87a, t11, hhVar, a12.length);
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        m5664a.putExtra("mipush_payload", a12);
        m5664a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z13);
        c(m5664a);
    }

    public final void a(String str, au auVar, e eVar, String str2) {
        af.a(this.f87a).a(auVar, "syncing");
        HashMap<String, String> m5702a = i.m5702a(this.f87a, eVar);
        m5702a.put("third_sync_reason", str2);
        a(str, auVar, false, m5702a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r12, com.xiaomi.mipush.sdk.au r13, boolean r14, java.util.HashMap<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.ao.a(java.lang.String, com.xiaomi.mipush.sdk.au, boolean, java.util.HashMap):void");
    }

    public void a(String str, String str2) {
        Intent m5664a = m5664a();
        m5664a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m5664a.putExtra(bk.B, this.f87a.getPackageName());
        m5664a.putExtra(bk.H, str);
        m5664a.putExtra(bk.I, str2);
        c(m5664a);
    }

    public final void a(boolean z11) {
        a(z11, (String) null);
    }

    public final void a(boolean z11, String str) {
        au auVar;
        af a11;
        au auVar2;
        if (z11) {
            af a12 = af.a(this.f87a);
            auVar = au.DISABLE_PUSH;
            a12.a(auVar, "syncing");
            a11 = af.a(this.f87a);
            auVar2 = au.ENABLE_PUSH;
        } else {
            af a13 = af.a(this.f87a);
            auVar = au.ENABLE_PUSH;
            a13.a(auVar, "syncing");
            a11 = af.a(this.f87a);
            auVar2 = au.DISABLE_PUSH;
        }
        a11.a(auVar2, "");
        a(str, auVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5676a() {
        return this.f94a && 1 == b.m5683a(this.f87a).a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5677a(int i11) {
        if (!b.m5683a(this.f87a).m5690b()) {
            return false;
        }
        c(i11);
        ig igVar = new ig();
        igVar.a(bd.a());
        igVar.b(b.m5683a(this.f87a).m5684a());
        igVar.d(this.f87a.getPackageName());
        igVar.c(hr.ClientABTest.f538a);
        HashMap hashMap = new HashMap();
        igVar.f680a = hashMap;
        hashMap.put("boot_mode", i11 + "");
        a(this.f87a).a((ao) igVar, hh.Notification, false, (hu) null);
        return true;
    }
}
