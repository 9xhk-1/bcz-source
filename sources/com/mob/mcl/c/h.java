package com.mob.mcl.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.api.ConnectionResult;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.MobSDK;
import com.mob.mcl.BusinessCallBack;
import com.mob.mcl.BusinessMessageListener;
import com.mob.mcl.MobMCL;
import com.mob.mcl.a;
import com.mob.mgs.OnIdChangeListener;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.ActivityTracker;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.UIHandler;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class h implements d {

    /* renamed from: m, reason: collision with root package name */
    private static volatile h f40509m;

    /* renamed from: a, reason: collision with root package name */
    public long f40510a;

    /* renamed from: b, reason: collision with root package name */
    public String f40511b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<String> f40513d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40515f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40516g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40517h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f40518i;

    /* renamed from: j, reason: collision with root package name */
    public String f40519j;

    /* renamed from: k, reason: collision with root package name */
    public long f40520k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40521l;

    /* renamed from: n, reason: collision with root package name */
    private NetworkHelper f40522n;

    /* renamed from: o, reason: collision with root package name */
    private Hashon f40523o;

    /* renamed from: p, reason: collision with root package name */
    private f f40524p;

    /* renamed from: q, reason: collision with root package name */
    private String f40525q;

    /* renamed from: r, reason: collision with root package name */
    private String f40526r;

    /* renamed from: s, reason: collision with root package name */
    private Context f40527s;

    /* renamed from: t, reason: collision with root package name */
    private MobMCL.ELPMessageListener f40528t;

    /* renamed from: u, reason: collision with root package name */
    private HashMap<Integer, HashSet<BusinessMessageListener>> f40529u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f40530v;

    /* renamed from: w, reason: collision with root package name */
    private com.mob.mcl.d.c f40531w;

    /* renamed from: x, reason: collision with root package name */
    private OnIdChangeListener f40532x;

    /* renamed from: c, reason: collision with root package name */
    public AtomicLong f40512c = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    public int f40514e = 270;

    /* renamed from: y, reason: collision with root package name */
    private int f40533y = 1;

    /* renamed from: z, reason: collision with root package name */
    private AtomicBoolean f40534z = new AtomicBoolean(false);

    private h() {
        com.mob.mcl.d.b.a().b("tpHelper init");
        this.f40524p = new f(this);
        this.f40522n = new NetworkHelper();
        this.f40523o = new Hashon();
        this.f40529u = new HashMap<>();
        this.f40531w = new com.mob.mcl.d.c(MobSDK.getContext());
        this.f40527s = MobSDK.getContext();
    }

    public static h b() {
        if (f40509m == null) {
            synchronized (h.class) {
                try {
                    if (f40509m == null) {
                        f40509m = new h();
                    }
                } finally {
                }
            }
        }
        return f40509m;
    }

    private String k() {
        return this.f40526r + this.f40527s.getPackageName();
    }

    private String l() {
        Object obj;
        HashMap hashMap = new HashMap();
        hashMap.put(com.alipay.sdk.m.s.a.f11004r, this.f40525q);
        hashMap.put("apppkg", this.f40527s.getPackageName());
        hashMap.put("plat", 1);
        hashMap.put("pushId", k());
        hashMap.put("guardId", this.f40519j);
        try {
            Bundle bundle = this.f40527s.getPackageManager().getPackageInfo(this.f40527s.getPackageName(), 128).applicationInfo.metaData;
            if (bundle != null && !bundle.isEmpty() && (obj = bundle.get("mob_id_ver")) != null) {
                hashMap.put("version", String.valueOf(obj));
            }
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
        }
        return this.f40523o.fromHashMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (c()) {
            return;
        }
        n();
    }

    private void n() {
        com.mob.mcl.b.a.f40475a.execute(new Runnable() { // from class: com.mob.mcl.c.h.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (h.this.c()) {
                        return;
                    }
                    if (!h.this.d()) {
                        h.this.f();
                    }
                    h.this.g();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void o() {
        if (com.mob.mgs.impl.f.a().d() && this.f40534z.compareAndSet(false, true)) {
            b().b(com.mob.mgs.impl.f.a().c(), com.mob.mgs.impl.f.a().e());
        }
    }

    public boolean c() {
        f fVar = this.f40524p;
        return (fVar == null || !fVar.b() || this.f40512c.get() == 0) ? false : true;
    }

    public boolean d() {
        ArrayList<String> arrayList;
        return this.f40515f && this.f40516g && !this.f40530v && (arrayList = this.f40513d) != null && arrayList.size() > 0 && !TextUtils.isEmpty(this.f40511b);
    }

    public boolean e() {
        return d() && this.f40517h;
    }

    public void f() {
        boolean isInMainProcess = DeviceHelper.getInstance(this.f40527s).isInMainProcess();
        com.mob.mcl.d.b.a().b("tp cf, main p: " + isInMainProcess);
        if (isInMainProcess) {
            if (TextUtils.isEmpty(this.f40526r) || this.f40527s == null) {
                com.mob.mcl.d.b.a().b("mcl has not been initialized");
                return;
            }
            try {
                String a11 = com.mob.mcl.d.d.a();
                if (!TextUtils.isEmpty(a11)) {
                    HashMap<String, Object> fromJson = this.f40523o.fromJson(a11);
                    if (fromJson.containsKey("requestTimes")) {
                        Object obj = fromJson.get("requestTimes");
                        if (((obj == null || !(obj instanceof Long)) ? (obj == null || !(obj instanceof Integer)) ? 0L : ((Integer) obj).intValue() : ((Long) obj).longValue()) + 86400000 > System.currentTimeMillis() && b().a(fromJson) && com.mob.mcl.d.d.b()) {
                            com.mob.mcl.d.b.a().b(" cf cc : " + a11);
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                com.mob.mcl.d.b.a().b(th2.getMessage());
            }
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 10000;
            networkTimeOut.connectionTimeout = 5000;
            try {
                ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
                arrayList2.add(new KVPair<>(com.alipay.sdk.m.s.a.f11004r, this.f40525q));
                arrayList2.add(new KVPair<>("pushId", k()));
                String dynamicModifyUrl = NetCommunicator.dynamicModifyUrl("m.mpl.dutils.com/tcp/config/init");
                String httpPost = this.f40522n.httpPost(dynamicModifyUrl, arrayList2, (KVPair<String>) null, arrayList, networkTimeOut);
                com.mob.mcl.d.b.a().b("tp cf url : " + dynamicModifyUrl + " -> rp : " + httpPost);
                HashMap<String, Object> fromJson2 = this.f40523o.fromJson(httpPost);
                fromJson2.put("requestTimes", Long.valueOf(System.currentTimeMillis()));
                if (b().a(fromJson2)) {
                    com.mob.mcl.d.d.a(true);
                    com.mob.mcl.d.d.a(this.f40523o.fromHashMap(fromJson2));
                }
            } catch (Throwable th3) {
                com.mob.mcl.d.b.a().b(th3.getMessage());
            }
        }
    }

    public boolean g() {
        return a(5000);
    }

    public void h() {
        if (TextUtils.isEmpty(this.f40519j) || this.f40520k <= 0) {
            String c11 = com.mob.mcl.d.d.c();
            long d11 = com.mob.mcl.d.d.d();
            if (TextUtils.isEmpty(c11)) {
                c11 = UUID.randomUUID().toString();
            }
            if (d11 <= 0) {
                d11 = System.currentTimeMillis();
            }
            a(c11, d11);
        }
    }

    public boolean i() {
        return a(1003, l()) != null;
    }

    public String j() {
        return String.format("%16s", Integer.valueOf(Math.abs(Arrays.hashCode(new Object[]{this.f40525q, k()})))).replaceAll(" ", "0").substring(0, 16);
    }

    public boolean a() {
        return (this.f40515f && this.f40516g && !this.f40530v) ? false : true;
    }

    private String c(String str, String str2) throws Throwable {
        return Base64.encodeToString(Data.AES128Encode(str, str2), 2);
    }

    public void a(OnIdChangeListener onIdChangeListener) {
        this.f40532x = onIdChangeListener;
    }

    public void a(String str) {
        this.f40531w.b(str);
    }

    public void a(MobMCL.ELPMessageListener eLPMessageListener) {
        this.f40528t = eLPMessageListener;
    }

    public void a(int i11, BusinessMessageListener businessMessageListener) {
        HashSet<BusinessMessageListener> hashSet;
        try {
            com.mob.mcl.d.b.a().b("tpHelper addBMListener: bisType = " + i11 + ", listener = " + businessMessageListener);
            Integer valueOf = Integer.valueOf(i11);
            if (businessMessageListener == null) {
                com.mob.mcl.d.b.a().b("tpHelper addBMListener: remove key = " + valueOf);
                this.f40529u.remove(valueOf);
                return;
            }
            if (this.f40529u.containsKey(valueOf)) {
                hashSet = this.f40529u.get(valueOf);
            } else {
                hashSet = new HashSet<>();
                this.f40529u.put(valueOf, hashSet);
            }
            hashSet.add(businessMessageListener);
            if (g.a().b()) {
                com.mob.mcl.d.b.a().b("tpHelper addBMListener: has cached msg");
                List<Map<String, Object>> c11 = g.a().c();
                ArrayList<Map<String, Object>> arrayList = new ArrayList();
                for (Map<String, Object> map : c11) {
                    Object obj = map.get("bisType");
                    final int intValue = obj != null ? ((Integer) obj).intValue() : 0;
                    final String str = (String) map.get("workId");
                    final String str2 = (String) map.get("json");
                    com.mob.mcl.d.b.a().b("tpHelper addBMListener: cachedBisType = " + intValue + ", target bisType = " + valueOf);
                    if (intValue == i11) {
                        Iterator<BusinessMessageListener> it = hashSet.iterator();
                        while (it.hasNext()) {
                            final BusinessMessageListener next = it.next();
                            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.mcl.c.h.1
                                @Override // android.os.Handler.Callback
                                public boolean handleMessage(Message message) {
                                    if (next == null) {
                                        return false;
                                    }
                                    com.mob.mcl.d.b.a().b("tpHelper addBMListener: callback to messageReceived. bisType: " + intValue + ", workId: " + str + ", msg: " + str2);
                                    next.messageReceived(intValue, str, str2);
                                    return false;
                                }
                            });
                        }
                        com.mob.mcl.d.b.a().b("tpHelper addBMListener: mark msg to rm. msg = " + map);
                        arrayList.add(map);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (Map<String, Object> map2 : arrayList) {
                    com.mob.mcl.d.b.a().b("tpHelper addBMListener: rm msg = " + map2);
                    g.a().b(map2);
                }
                return;
            }
            com.mob.mcl.d.b.a().b("tpHelper addBMListener: no cached msg");
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().b("tpHelper addBMListener: error");
            com.mob.mcl.d.b.a().a(th2);
        }
    }

    private void b(long j11, boolean z11) {
        if (this.f40524p != null) {
            try {
                String b11 = b(this.f40512c.get());
                HashMap hashMap = new HashMap();
                hashMap.put("repeat", Boolean.valueOf(z11));
                String fromHashMap = this.f40523o.fromHashMap(hashMap);
                e eVar = new e(1007, c(b11, fromHashMap));
                eVar.f40502c = j11;
                this.f40524p.a(eVar);
                com.mob.mcl.d.b.a().b("tp sd ty = " + eVar.f40501b + " , u = " + j11 + " bo : " + fromHashMap);
            } catch (Throwable th2) {
                com.mob.mcl.d.b.a().a(th2);
            }
        }
    }

    public void b(final BusinessCallBack<Boolean> businessCallBack) {
        com.mob.mcl.b.a.f40475a.execute(new Runnable() { // from class: com.mob.mcl.c.h.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final boolean a11 = h.this.c() ? h.b().a(3000, 3) : false;
                    UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.mcl.c.h.4.1
                        @Override // android.os.Handler.Callback
                        public boolean handleMessage(Message message) {
                            try {
                                BusinessCallBack businessCallBack2 = businessCallBack;
                                if (businessCallBack2 == null) {
                                    return false;
                                }
                                businessCallBack2.callback(Boolean.valueOf(a11));
                                return false;
                            } catch (Throwable unused) {
                                return false;
                            }
                        }
                    });
                    if (a11) {
                        return;
                    }
                    if (!h.b().d()) {
                        h.b().f();
                    }
                    h.this.g();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private String b(long j11) {
        return String.format("%16s", Integer.valueOf(Math.abs(Arrays.hashCode(new long[]{j11})))).replaceAll(" ", "0").substring(0, 16);
    }

    private HashMap<String, Object> b(HashMap<String, Object> hashMap) {
        return (a(hashMap, "code", 0) == 200 && hashMap.containsKey("data")) ? (HashMap) hashMap.get("data") : new HashMap<>();
    }

    private HashMap<String, Object> b(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            if (TextUtils.isEmpty(str) || !str.startsWith("{")) {
                return hashMap;
            }
            com.mob.mcl.d.b.a().b(str);
            return b(this.f40523o.fromJson(str));
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
            return hashMap;
        }
    }

    public void b(String str, String str2) {
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            NetworkHelper networkHelper = new NetworkHelper();
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.connectionTimeout = 2000;
            networkTimeOut.readTimout = 5000;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(com.alipay.sdk.m.s.a.f11004r, MobSDK.getAppkey());
            hashMap.put(com.igexin.push.core.b.aC, deviceHelper.getPackageName());
            hashMap.put("duidOld", str2);
            hashMap.put("duidNew", str);
            hashMap.put("appVer", deviceHelper.getAppVersionName());
            hashMap.put("plat", Integer.valueOf(deviceHelper.getPlatformCode()));
            String dynamicModifyUrl = NetCommunicator.dynamicModifyUrl("m.mpl.dutils.com/tcp/push/pbsd");
            com.mob.mcl.d.b.a().b("[Request] url = " + dynamicModifyUrl + "\nheaders = " + ((Object) null) + "\nvalues = " + hashMap);
            String httpPostNew = networkHelper.httpPostNew(dynamicModifyUrl, hashMap, null, networkTimeOut);
            com.mob.mcl.d.b.a().b("[Response] url = " + dynamicModifyUrl + "\nresp = " + httpPostNew);
            HashMap fromJson = HashonHelper.fromJson(httpPostNew);
            if (fromJson != null && !fromJson.isEmpty() && !BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get("code")))) {
                throw new Throwable("Req failed: " + httpPostNew);
            }
            this.f40533y = 1;
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
            if (this.f40533y < 3) {
                try {
                    Thread.sleep(r2 * 1000);
                } catch (InterruptedException unused) {
                    com.mob.mcl.d.b.a().a(th2);
                }
                this.f40533y++;
                b(str, str2);
                return;
            }
            this.f40533y = 1;
        }
    }

    public void a(Context context, String str, String str2) {
        this.f40527s = context;
        this.f40525q = str;
        if (!TextUtils.isEmpty(str2)) {
            this.f40526r = str2;
        }
        h();
        ActivityTracker.getInstance(context).addTracker(com.mob.mcl.a.a(new a.C0484a() { // from class: com.mob.mcl.c.h.2
            @Override // com.mob.mcl.a.C0484a
            public void a() {
                h.this.m();
            }

            @Override // com.mob.mcl.a.C0484a
            public void b() {
                h.this.m();
            }
        }));
        this.f40531w.a();
    }

    public HashMap<String, Object> a(String str, String str2, int i11) throws Throwable {
        if (this.f40524p == null) {
            return null;
        }
        com.mob.mcl.d.b.a().b("tp rg main = " + str + " , bo = " + str2 + " , out = " + i11);
        String[] split = str.split(":");
        this.f40524p.a(new InetSocketAddress(split[0], Integer.parseInt(split[1])), true, true, 5000);
        this.f40512c.set(0L);
        e eVar = new e(1001, c(this.f40511b, str2));
        eVar.f40502c = this.f40510a;
        e eVar2 = this.f40524p.a(eVar).get((long) i11, TimeUnit.MILLISECONDS);
        if (eVar2 != null && eVar2.f40501b == 1000) {
            String a11 = a(this.f40511b, eVar2.f40503d);
            eVar2.f40503d = a11;
            return b(a11);
        }
        com.mob.mcl.d.b.a().b("tp rp : " + eVar2);
        return null;
    }

    public HashMap<String, Object> a(int i11, String str) {
        return a(i11, 10000, str);
    }

    public HashMap<String, Object> a(int i11, int i12, String str) {
        e eVar;
        if (this.f40524p == null) {
            return null;
        }
        try {
            String b11 = b(this.f40512c.get());
            com.mob.mcl.d.b.a().b("tp sd ty = " + i11 + " , bo = " + str + " , out = " + i12);
            if (TextUtils.isEmpty(str)) {
                eVar = new e(i11);
            } else {
                eVar = new e(i11, c(b11, str));
            }
            e eVar2 = this.f40524p.a(eVar).get(i12, TimeUnit.MILLISECONDS);
            if (eVar2 != null && eVar2.f40501b == 1000) {
                String a11 = a(b11, eVar2.f40503d);
                eVar2.f40503d = a11;
                return b(a11);
            }
            com.mob.mcl.d.b.a().b(" tp rp : " + eVar2);
            return null;
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
            return null;
        }
    }

    private void a(long j11, boolean z11) {
        if (this.f40524p != null) {
            try {
                String b11 = b(this.f40512c.get());
                HashMap hashMap = new HashMap();
                hashMap.put("state", Boolean.valueOf(z11));
                String fromHashMap = this.f40523o.fromHashMap(hashMap);
                e eVar = new e(1006, c(b11, fromHashMap));
                com.mob.mcl.d.b.a().b("tp sd ty = " + eVar.f40501b + " , u = " + j11 + " bo : " + fromHashMap);
                eVar.f40502c = j11;
                this.f40524p.a(eVar);
            } catch (Throwable th2) {
                com.mob.mcl.d.b.a().a(th2);
            }
        }
    }

    private void a(long j11) {
        if (this.f40524p != null) {
            try {
                e eVar = new e(1005);
                eVar.f40502c = j11;
                this.f40524p.a(eVar);
                com.mob.mcl.d.b.a().b("tp sd ty = " + eVar.f40501b + " , u = " + j11 + " bo : " + eVar.f40503d);
            } catch (Throwable th2) {
                com.mob.mcl.d.b.a().a(th2);
            }
        }
    }

    public boolean a(int i11, int i12) {
        if (i12 >= 4) {
            return false;
        }
        if (a(1002, i11, (String) null) != null) {
            return true;
        }
        if (i12 != 0 && i12 != 1) {
            a(3000, i12 + 1);
            return false;
        }
        a(1000, i12 + 1);
        return false;
    }

    public void a(BusinessCallBack<Boolean> businessCallBack) {
        boolean c11 = c();
        if (businessCallBack != null) {
            businessCallBack.callback(Boolean.valueOf(c11));
        }
        if (c11) {
            return;
        }
        com.mob.mcl.b.a.f40475a.execute(new Runnable() { // from class: com.mob.mcl.c.h.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!h.b().d()) {
                        h.b().f();
                    }
                    h.this.g();
                } catch (Throwable unused) {
                }
            }
        });
    }

    private boolean a(HashMap<String, Object> hashMap) {
        try {
            this.f40521l = false;
            HashMap<String, Object> b11 = b(hashMap);
            if (b11.containsKey("domains") && b11.containsKey("uniqueId") && b11.containsKey("uniqueKey")) {
                this.f40513d = (ArrayList) b11.get("domains");
                this.f40510a = ((Long) b11.get("uniqueId")).longValue();
                this.f40511b = (String) b11.get("uniqueKey");
                this.f40514e = a(b11, "tick", this.f40514e);
                this.f40515f = a(b11, "globalSwitch", 0) == 1;
                this.f40516g = a(b11, "connectSwitch", 0) == 1;
                this.f40517h = a(b11, "forwardSwitch", 0) == 1;
                this.f40518i = a(b11, "bindRequestSwitch", 0) == 1;
                if (b11.containsKey("determineDomain")) {
                    String str = (String) b11.get("determineDomain");
                    if (!TextUtils.isEmpty(str)) {
                        if (this.f40513d == null) {
                            this.f40513d = new ArrayList<>();
                        }
                        this.f40513d.remove(str);
                        this.f40513d.add(0, str);
                    }
                }
                ArrayList<String> arrayList = this.f40513d;
                if (arrayList != null && arrayList.size() > 0) {
                    if (!TextUtils.isEmpty(this.f40511b)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
        }
        return false;
    }

    public synchronized boolean a(int i11) {
        try {
            try {
                if (!d()) {
                    return false;
                }
                return a(this.f40521l, this.f40513d.get(0), 0, l(), i11);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean a(boolean r10, java.lang.String r11, int r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.mcl.c.h.a(boolean, java.lang.String, int, java.lang.String, int):boolean");
    }

    public synchronized void a(String str, long j11) {
        try {
            if (this.f40532x != null && !String.valueOf(this.f40519j).equals(str)) {
                this.f40532x.onChanged(this.f40519j, str);
            }
            this.f40519j = str;
            this.f40520k = j11;
            com.mob.mcl.d.d.b(str);
            com.mob.mcl.d.d.a(this.f40520k);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar, e eVar) {
        try {
            if (TextUtils.isEmpty(eVar.f40503d)) {
                return;
            }
            if (this.f40512c.get() == 0) {
                com.mob.mcl.d.b.a().b("tcp received push msg, but send token is 0");
                return;
            }
            String a11 = a(b(this.f40512c.get()), eVar.f40503d);
            eVar.f40503d = a11;
            int i11 = eVar.f40501b;
            if (i11 == 9001) {
                com.mob.mcl.d.b.a().b(" tcp msg push msgType: " + eVar.f40501b + " body = " + eVar.f40503d);
                a(eVar.f40502c);
                HashMap<String, Object> b11 = b(eVar.f40503d);
                if (b11.containsKey("data")) {
                    int a12 = a(b11, "expire", 0);
                    String str = (String) b11.get("workId");
                    String str2 = (String) b11.get("data");
                    boolean z11 = a(b11, "needRepeat", 0) == 1;
                    int a13 = a(b11, "type", 0);
                    if (a13 != 1 && a13 != 2) {
                        boolean a14 = a(eVar.f40502c, str, a12, a13, str2);
                        if (z11) {
                            b(eVar.f40502c, a14);
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("data", str2);
                    bundle.putInt("expire", a12);
                    bundle.putString("workId", str);
                    bundle.putLong("uniqueId", eVar.f40502c);
                    bundle.putInt("msgType", a13);
                    boolean z12 = a(bundle) == 1;
                    if (z11) {
                        b(eVar.f40502c, z12);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 9002) {
                String str3 = (String) b(a11).get("domain");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                this.f40521l = true;
                a(true, str3, 2, l(), 5000);
                return;
            }
            if (i11 == 9004) {
                com.mob.mcl.d.b.a().b(" tp mg ty: " + eVar.f40501b + " bo = " + eVar.f40503d);
                a(eVar.f40502c);
                HashMap<String, Object> b12 = b(eVar.f40503d);
                if (b12.containsKey("data") && b12.containsKey("targetPackage")) {
                    String str4 = (String) b12.get("targetPackage");
                    String str5 = (String) b12.get("data");
                    int a15 = a(b12, "logicTimeout", 1000);
                    if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data", str5);
                    bundle2.putLong("uniqueId", eVar.f40502c);
                    com.mob.apc.a a16 = com.mob.mcl.a.a.a().a(ConnectionResult.SERVICE_UPDATING, bundle2, str4, a15);
                    if (a16 != null && a16.f40055e != null) {
                        a(eVar.f40502c, true);
                    } else {
                        com.mob.mcl.d.b.a().b("apc fw rp mg is null");
                        a(eVar.f40502c, false);
                    }
                }
            }
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
        }
    }

    public int a(Bundle bundle) {
        if (this.f40528t == null) {
            return -1;
        }
        if (a(bundle.getString("workId"), bundle.getInt("expire"))) {
            return 1;
        }
        return this.f40528t.messageReceived(bundle) ? 1 : 0;
    }

    private synchronized boolean a(String str, int i11) {
        if (i11 != 0) {
            if (!TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() <= this.f40531w.a(str)) {
                    return true;
                }
                this.f40531w.a(str, System.currentTimeMillis() + (i11 * 1000));
            }
        }
        return false;
    }

    public boolean a(long j11, String str, int i11, int i12, String str2) {
        try {
        } catch (Throwable th2) {
            com.mob.mcl.d.b.a().a(th2);
        }
        if (a(str, i11)) {
            return true;
        }
        HashMap fromJson = this.f40523o.fromJson(str2);
        fromJson.put("uniqueId", Long.valueOf(j11));
        final String fromHashMap = this.f40523o.fromHashMap(fromJson);
        final Integer valueOf = Integer.valueOf(i12);
        if (this.f40529u.containsKey(valueOf)) {
            com.mob.mcl.d.b.a().b("[dealBusinessMsg]Biz msg listener detected, callback directly. bisType: " + valueOf);
            Iterator<BusinessMessageListener> it = this.f40529u.get(valueOf).iterator();
            while (it.hasNext()) {
                final BusinessMessageListener next = it.next();
                final String str3 = str;
                UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.mcl.c.h.5
                    @Override // android.os.Handler.Callback
                    public boolean handleMessage(Message message) {
                        if (next == null) {
                            return false;
                        }
                        com.mob.mcl.d.b.a().b("[dealBusinessMsg]callback to messageReceived. bisType: " + valueOf + ", workId: " + str3 + ", msg: " + fromHashMap);
                        next.messageReceived(valueOf.intValue(), str3, fromHashMap);
                        return false;
                    }
                });
                str = str3;
            }
        } else {
            com.mob.mcl.d.b.a().b("[dealBusinessMsg]No biz msg listener detected, cache msg. bisType: " + valueOf);
            HashMap hashMap = new HashMap();
            hashMap.put("bisType", valueOf);
            hashMap.put("workId", str);
            hashMap.put("json", fromHashMap);
            g.a().a(hashMap);
        }
        return false;
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar, Throwable th2) {
        com.mob.mcl.d.b a11 = com.mob.mcl.d.b.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("exceptionCaught : ");
        sb2.append(th2 != null ? th2.getMessage() : "");
        a11.b(sb2.toString());
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar) {
        com.mob.mcl.d.b.a().b("sessionOpened");
    }

    @Override // com.mob.mcl.c.d
    public void a(a aVar, boolean z11) {
        com.mob.mcl.d.b.a().b("sc " + z11);
        if (z11) {
            n();
        }
    }

    public String a(String str, String str2) throws Throwable {
        return Data.AES128Decode(str, Base64.decode(str2, 2));
    }

    public static int a(HashMap<String, Object> hashMap, String str, int i11) {
        if (hashMap != null && hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return i11;
    }
}
