package com.mob.mgs.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.heytap.mcssdk.constant.IntentConstant;
import com.mob.MobSDK;
import com.mob.apc.b;
import com.mob.commons.authorize.DeviceAuthorizer;
import com.mob.elp.MobELP;
import com.mob.mcl.MobMCL;
import com.mob.mcl.a;
import com.mob.mgs.MobMGS;
import com.mob.tools.utils.ActivityTracker;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.m;

/* loaded from: classes7.dex */
public class c implements b.a, b.InterfaceC0482b, b.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f40574a = {"com.mob.intent.MOB_GUARD_SERVICE", "com.mob.intent.MOB_ID_SERVICE"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f40575b = {"com.mob.guard.MobGuardPullUpService", "com.mob.id.MobIDService"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f40576c = {"com.mob.guard.MobTranPullUpActivity", "com.mob.id.MobIDActivity"};

    /* renamed from: d, reason: collision with root package name */
    private static c f40577d = new c();

    /* renamed from: e, reason: collision with root package name */
    private static AtomicBoolean f40578e = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    private boolean f40586m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f40587n;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f40579f = Executors.newSingleThreadExecutor();

    /* renamed from: g, reason: collision with root package name */
    private String f40580g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40581h = false;

    /* renamed from: i, reason: collision with root package name */
    private int f40582i = 0;

    /* renamed from: j, reason: collision with root package name */
    private int f40583j = 0;

    /* renamed from: k, reason: collision with root package name */
    private List<HashMap<String, Object>> f40584k = null;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<String, Integer> f40585l = null;

    /* renamed from: o, reason: collision with root package name */
    private Context f40588o = MobSDK.getContext();

    private c() {
        ActivityTracker.getInstance(MobSDK.getContext()).addTracker(com.mob.mcl.a.a(new a.C0484a() { // from class: com.mob.mgs.impl.c.1
            @Override // com.mob.mcl.a.C0484a
            public void a() {
                if (c.this.f40586m) {
                    c.this.a((String) null, true);
                }
            }
        }));
    }

    private boolean c(String str) {
        try {
            String string = Settings.Secure.getString(MobSDK.getContext().getContentResolver(), "app_lock_list");
            if (!TextUtils.isEmpty(string)) {
                for (String str2 : string.split(com.alipay.sdk.m.u.i.f11097b)) {
                    if (str2 != null && str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void e() {
        try {
            if (f40578e.compareAndSet(false, true)) {
                MobSDK.init(MobSDK.getContext());
                com.mob.apc.b.a(MobSDK.getContext());
                String f11 = f.a().f();
                try {
                    MobELP.init(f11);
                } catch (Throwable unused) {
                    e.a().a("No [MobELP] module.");
                }
                com.mob.apc.b.a(MobMGS.MGS_TAG, this);
                com.mob.apc.b.a((b.c) this);
                com.mob.apc.b.a((b.a) this);
                MobMCL.initMCLink(MobSDK.getContext(), MobSDK.getAppkey(), f11);
                MobMCL.getSuid();
                e.a().a("[Guard] init guardId:" + MobMCL.getSuid() + ", time: " + MobMCL.getCreateSuidTime());
            }
        } catch (Throwable th2) {
            e.a().b(th2);
        }
    }

    private List<HashMap<String, String>> f() {
        Bundle bundle;
        int i11;
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = MobSDK.getContext().getPackageName();
            HashSet hashSet = new HashSet();
            ArrayList<ResolveInfo> arrayList2 = new ArrayList();
            int i12 = 0;
            while (true) {
                String[] strArr = f40574a;
                if (i12 >= strArr.length) {
                    break;
                }
                ReflectHelper.importClass("android.content.Intent");
                List<ResolveInfo> queryIntentServices = DeviceHelper.getInstance(MobSDK.getContext()).queryIntentServices((Intent) ReflectHelper.newInstance("Intent", strArr[i12]), 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    arrayList2.addAll(queryIntentServices);
                }
                i12++;
            }
            this.f40585l = new HashMap<>();
            for (ResolveInfo resolveInfo : arrayList2) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo.exported && !packageName.equals(serviceInfo.packageName) && (bundle = MobSDK.getContext().getPackageManager().getPackageInfo(resolveInfo.serviceInfo.packageName, 128).applicationInfo.metaData) != null && !bundle.isEmpty()) {
                    Object obj = bundle.get("mob_id_ver");
                    if (obj == null) {
                        obj = bundle.get("mob_guard_version");
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                    if (obj != null && !hashSet.contains(resolveInfo.serviceInfo.packageName) && !c(resolveInfo.serviceInfo.packageName)) {
                        hashSet.add(resolveInfo.serviceInfo.packageName);
                        String valueOf = String.valueOf(obj);
                        HashMap hashMap = new HashMap();
                        hashMap.put(IntentConstant.APP_PACKAGE, resolveInfo.serviceInfo.packageName);
                        hashMap.put("targetVer", valueOf);
                        arrayList.add(hashMap);
                        this.f40585l.put(resolveInfo.serviceInfo.packageName, Integer.valueOf(i11));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            e.a().b(th2);
            return arrayList;
        }
    }

    private boolean g() {
        try {
            HashMap hashMap = (HashMap) d.a(f(), MobMCL.getSuid(), MobMGS.getDS());
            e.a().a("[Guard] getGuardListV5 response:" + hashMap);
            if (hashMap != null && !hashMap.isEmpty()) {
                this.f40580g = (String) ResHelper.forceCast(hashMap.get("workId"), null);
                this.f40581h = ((Boolean) ResHelper.forceCast(hashMap.get("syncIdState"), Boolean.FALSE)).booleanValue();
                this.f40583j = ((Integer) ResHelper.forceCast(hashMap.get("asMaster"), 0)).intValue();
                this.f40582i = ((Integer) ResHelper.forceCast(hashMap.get("pollTotal"), 0)).intValue();
                this.f40584k = (List) hashMap.get("pkgList");
                return true;
            }
        } catch (Throwable th2) {
            e.a().b(th2);
        }
        return false;
    }

    private void h() {
        Bundle bundle;
        e.a().a("[Guard] syncId upPkgList: " + this.f40584k);
        List<HashMap<String, Object>> list = this.f40584k;
        if (list == null || list.size() == 0) {
            return;
        }
        String suid = MobMCL.getSuid();
        long createSuidTime = MobMCL.getCreateSuidTime();
        Iterator<HashMap<String, Object>> it = this.f40584k.iterator();
        String str = suid;
        while (it.hasNext()) {
            com.mob.apc.a aVar = null;
            String str2 = (String) ResHelper.forceCast(it.next().get(com.igexin.push.core.b.aC), null);
            com.mob.apc.a aVar2 = new com.mob.apc.a();
            aVar2.f40051a = 1001;
            try {
                aVar = com.mob.apc.b.a(1, str2, MobMGS.MGS_TAG, aVar2, 5000L);
            } catch (Throwable th2) {
                e.a().b(th2);
            }
            e.a().a("[Guard] syncId getClientIDs sendAPCMessage pkg: " + str2 + ", response:" + aVar);
            if (aVar != null && (bundle = aVar.f40055e) != null) {
                String string = bundle.getString("guardId");
                long j11 = bundle.getLong(com.alipay.sdk.m.t.a.f11034k);
                if (!TextUtils.isEmpty(string) && j11 > 0 && j11 < createSuidTime) {
                    str = string;
                    createSuidTime = j11;
                }
            }
        }
        e.a().a("[Guard] syncId update guardId :" + str + ", oldId: " + suid);
        boolean equals = str.equals(suid);
        if (!equals) {
            MobMCL.syncSuid(str, createSuidTime);
        }
        a(str, createSuidTime);
        if (equals) {
            return;
        }
        try {
            d.a(suid, str, this.f40580g);
        } catch (Throwable th3) {
            e.a().a(th3);
        }
    }

    public void d() {
        if (this.f40581h) {
            h();
        }
    }

    public void b() throws Throwable {
        Object obj;
        e();
        if (!UpdateV5.getDS()) {
            e.a().a("DS off");
            return;
        }
        Bundle bundle = MobSDK.getContext().getPackageManager().getPackageInfo(MobSDK.getContext().getPackageName(), 128).applicationInfo.metaData;
        String valueOf = (bundle == null || bundle.isEmpty() || (obj = bundle.get("disable_mob_a_guard")) == null) ? null : String.valueOf(obj);
        e.a().a("[Guard] run disable_mob_a_guard:" + valueOf);
        if (m.f74525c.equals(valueOf)) {
            return;
        }
        com.mob.commons.b.a("cd", "221111", 0L);
        boolean isClear = DeviceAuthorizer.isClear();
        e.a().a("[EC] isClear init: " + isClear);
        if (isClear) {
            boolean z11 = ((Integer) com.mob.commons.b.a(TtmlNode.COMBINE_ALL, 1, 0L)).intValue() == 1;
            e.a().a("als on: " + z11);
            if (z11) {
                boolean g11 = g();
                e.a().a("[Guard] checkAndInitGuardParams:" + g11);
                if (g11) {
                    if (c()) {
                        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                        e.a().a("[Guard] registerServerSocket");
                        a.a().a(linkedBlockingQueue);
                        boolean booleanValue = ((Boolean) linkedBlockingQueue.take()).booleanValue();
                        e.a().a("[Guard] registerServerSocket: " + booleanValue);
                        if (booleanValue) {
                            a(this.f40581h, (String) null);
                            if (this.f40581h) {
                                Thread.sleep(500L);
                                h();
                                return;
                            }
                            return;
                        }
                    }
                    e.a().a("[Guard] registerClientSocket");
                    a.a().b();
                }
            }
        }
    }

    public static c a() {
        return f40577d;
    }

    private boolean d(String str) {
        Boolean bool;
        boolean z11 = false;
        int i11 = -1;
        try {
        } catch (Throwable th2) {
            e.a().a(th2);
        }
        if (this.f40588o.equals(str)) {
            return true;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        i11 = a.a().a(str, linkedBlockingQueue);
        if (i11 == 0) {
            z11 = a(this.f40588o, str);
        } else if (i11 == 1 && (bool = (Boolean) linkedBlockingQueue.poll(2000L, TimeUnit.MILLISECONDS)) != null) {
            z11 = bool.booleanValue();
        }
        e.a().a("checkAppLive appStatus: " + i11 + ", isLive: " + z11);
        return z11;
    }

    public void a(final String str, final boolean z11) {
        this.f40579f.execute(new Runnable() { // from class: com.mob.mgs.impl.c.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(200L);
                    c.this.a(false, str);
                    if (z11) {
                        Thread.sleep(500L);
                        c.this.d();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x000a, B:8:0x002a, B:10:0x0031, B:11:0x003b, B:15:0x0067, B:16:0x0072, B:18:0x0078, B:21:0x009e, B:62:0x00aa, B:26:0x00b7, B:29:0x00ef, B:31:0x00f7, B:32:0x0119, B:34:0x0149, B:36:0x015f, B:37:0x0167, B:39:0x016f, B:40:0x0172, B:41:0x0184, B:45:0x017f, B:47:0x0105, B:49:0x0112, B:55:0x0198, B:57:0x01b6), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x000a, B:8:0x002a, B:10:0x0031, B:11:0x003b, B:15:0x0067, B:16:0x0072, B:18:0x0078, B:21:0x009e, B:62:0x00aa, B:26:0x00b7, B:29:0x00ef, B:31:0x00f7, B:32:0x0119, B:34:0x0149, B:36:0x015f, B:37:0x0167, B:39:0x016f, B:40:0x0172, B:41:0x0184, B:45:0x017f, B:47:0x0105, B:49:0x0112, B:55:0x0198, B:57:0x01b6), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.mgs.impl.c.a(boolean, java.lang.String):void");
    }

    public boolean c() {
        return this.f40583j == 1;
    }

    public void b(String str) {
        e.a().a("[Guard] syncId newClientPkg : " + str + " syncIdFailed : " + this.f40587n);
        if (this.f40587n) {
            this.f40579f.execute(new Runnable() { // from class: com.mob.mgs.impl.c.3
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f40587n) {
                        c.this.d();
                    }
                }
            });
        }
    }

    public HashMap<String, Object> b(int i11, String str) {
        return a(i11, str, this.f40580g, f.a().f());
    }

    private void a(String str, long j11) {
        this.f40587n = false;
        Iterator<HashMap<String, Object>> it = this.f40584k.iterator();
        while (it.hasNext()) {
            String str2 = (String) ResHelper.forceCast(it.next().get(com.igexin.push.core.b.aC), null);
            try {
                com.mob.apc.a aVar = new com.mob.apc.a();
                aVar.f40051a = 1003;
                Bundle bundle = new Bundle();
                bundle.putString("guardId", str);
                bundle.putLong(com.alipay.sdk.m.t.a.f11034k, j11);
                bundle.putString("workId", this.f40580g);
                aVar.f40055e = bundle;
                com.mob.apc.a a11 = com.mob.apc.b.a(1, str2, MobMGS.MGS_TAG, aVar, 5000L);
                e.a().a("[Guard] syncId updateClientIDs sendAPCMessage :" + str2 + ", response: " + a11);
            } catch (Throwable th2) {
                e.a().a(th2);
                this.f40587n = true;
            }
        }
    }

    @Override // com.mob.apc.b.InterfaceC0482b
    public com.mob.apc.a a(String str, com.mob.apc.a aVar, long j11) {
        Bundle bundle;
        e.a().a("[Guard] onAPCMessageReceive APCMessage:" + aVar + ", pkg:" + str);
        com.mob.apc.a aVar2 = new com.mob.apc.a();
        final String suid = MobMCL.getSuid();
        long createSuidTime = MobMCL.getCreateSuidTime();
        int i11 = aVar.f40051a;
        if (i11 == 1001) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("guardId", suid);
            bundle2.putLong(com.alipay.sdk.m.t.a.f11034k, createSuidTime);
            bundle2.putString(com.igexin.push.core.b.aC, MobSDK.getContext().getPackageName());
            aVar2.f40055e = bundle2;
            return aVar2;
        }
        if (i11 == 1003 && (bundle = aVar.f40055e) != null) {
            final String string = bundle.getString("guardId");
            final long j12 = bundle.getLong(com.alipay.sdk.m.t.a.f11034k);
            final String string2 = bundle.getString("workId");
            if (string != null && j12 > 0 && !suid.equals(string) && j12 < createSuidTime) {
                new h() { // from class: com.mob.mgs.impl.c.4
                    @Override // com.mob.mgs.impl.h
                    public void a() throws Throwable {
                        MobMCL.syncSuid(string, j12);
                        d.a(suid, string, string2);
                    }
                }.start();
            }
        }
        return aVar2;
    }

    @Override // com.mob.apc.b.c
    public void a(Bundle bundle) {
        if (bundle != null) {
            Intent intent = new Intent();
            intent.putExtra("workId", bundle.getString("workId"));
            intent.putExtra(com.alipay.sdk.m.s.a.f11004r, bundle.getString(com.alipay.sdk.m.s.a.f11004r));
            intent.putExtra("duid", bundle.getString("duid"));
            intent.putExtra("guardId", bundle.getString("guardId"));
            intent.putExtra(com.igexin.push.core.b.aC, bundle.getString(com.igexin.push.core.b.aC));
            intent.putExtra("acServiceType", bundle.getInt("acsActType"));
        }
    }

    @Override // com.mob.apc.b.a
    public HashMap<String, Object> a(int i11, String str) {
        int i12 = i11 == 1 ? 2001 : i11 == 2 ? 2002 : -1;
        e.a().a("[requestInvokeGd]finalBusType: " + i12);
        if (i12 != -1) {
            return b(i12, str);
        }
        return new HashMap<>();
    }

    @Override // com.mob.apc.b.a
    public boolean a(String str) {
        return d(str);
    }

    private static boolean a(Context context, String str) {
        try {
            int i11 = context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags;
            return ((i11 & 1) == 0 && (i11 & 128) == 0) && ((i11 & 2097152) == 0);
        } catch (PackageManager.NameNotFoundException e11) {
            e.a().b(e11);
            return false;
        }
    }

    private HashMap<String, Object> a(int i11, String str, String str2, String str3) {
        e.a().a("[GD]busType: " + i11 + ", target: " + str + ", workId: " + str2 + ", duid: " + str3);
        HashMap<String, Object> hashMap = new HashMap<>();
        boolean a11 = a(MobSDK.getContext(), str);
        e a12 = e.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[GD]target: ");
        sb2.append(str);
        sb2.append(", isLv: ");
        sb2.append(a11);
        a12.a(sb2.toString());
        if (!a11) {
            if (this.f40585l == null) {
                f();
            }
            try {
                ComponentName componentName = new ComponentName(str, f40576c[((Integer) ResHelper.forceCast(this.f40585l.get(str), 0)).intValue()]);
                Intent intent = new Intent();
                intent.addFlags(411041792);
                intent.setComponent(componentName);
                intent.putExtra("workId", str2);
                intent.putExtra("duid", str3);
                intent.putExtra(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
                intent.putExtra(com.igexin.push.core.b.aC, MobSDK.getContext().getPackageName());
                intent.putExtra("guardId", MobMCL.getSuid());
                intent.putExtra("busType", i11);
                long currentTimeMillis = System.currentTimeMillis();
                hashMap.put("startActivityTime", Long.valueOf(currentTimeMillis));
                MobSDK.getContext().startActivity(intent);
                hashMap.put("startActivityDuration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                Thread.sleep(320L);
                boolean a13 = a(MobSDK.getContext(), str);
                e.a().a("[GD] stAct rst. pkg: " + str + ", lv: " + a13);
                if (a13) {
                    hashMap.put("executeResult", "success");
                    return hashMap;
                }
                hashMap.put("executeResult", "uncertain");
                return hashMap;
            } catch (Throwable th2) {
                e.a().a(th2);
                e.a().a("[GD] stAct rst.  pkg: " + str + ", exception: " + th2.getMessage());
                hashMap.put("executeResult", "fail");
            }
        }
        return hashMap;
    }
}
