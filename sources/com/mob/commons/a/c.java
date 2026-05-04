package com.mob.commons.a;

import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.MobProduct;
import com.mob.commons.t;
import com.mob.commons.u;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import java.io.File;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.junit.jupiter.api.j2;

/* loaded from: classes7.dex */
public abstract class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    private static final WeakHashMap<String, Object> f40114g = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    protected Object f40115a;

    /* renamed from: b, reason: collision with root package name */
    protected int f40116b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40117c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40118d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40119e;

    /* renamed from: f, reason: collision with root package name */
    private final long f40120f;

    /* renamed from: h, reason: collision with root package name */
    private int f40121h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f40122i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static WeakHashMap<Integer, c> f40125a = new WeakHashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static synchronized void c(c cVar) {
            synchronized (a.class) {
                f40125a.put(Integer.valueOf(cVar.getClass().getName().hashCode()), cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static synchronized void d(c cVar) {
            synchronized (a.class) {
                f40125a.remove(Integer.valueOf(cVar.getClass().getName().hashCode()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static synchronized c b(Class<? extends c> cls) {
            c cVar;
            synchronized (a.class) {
                cVar = f40125a.get(Integer.valueOf(cls.getName().hashCode()));
            }
            return cVar;
        }
    }

    public c(String str, String str2) {
        this(str, 0L, str2, 0L);
    }

    public static c a(Class<? extends c> cls) {
        c b11 = a.b(cls);
        if (b11 == null) {
            try {
                return cls.newInstance();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return b11;
    }

    public abstract void a();

    public void b() {
        long k11 = k();
        if (k11 <= 0 || k11 >= 604800) {
            return;
        }
        a(k11);
    }

    public void c() {
        this.f40122i = true;
    }

    public String d() {
        return this.f40117c;
    }

    public boolean e() {
        return ((Long) com.mob.commons.b.a(this.f40117c, Long.valueOf(this.f40119e))).longValue() != 0 && m();
    }

    public boolean f() {
        return this.f40116b == 0;
    }

    public boolean g() {
        return h();
    }

    public boolean h() {
        if (!e()) {
            return false;
        }
        t.f40414c.execute(this);
        return true;
    }

    public boolean i() {
        boolean b11 = com.mob.commons.b.b();
        boolean c11 = com.mob.commons.b.c();
        if (!b11 || !c11) {
            MobLog.getInstance().d("run clt: " + d() + ", to: " + b11 + ", conn: " + c11, new Object[0]);
            return false;
        }
        boolean e11 = e();
        MobLog.getInstance().d("run clt: " + getClass().getSimpleName() + ", to: " + b11 + ", conn: " + c11 + j2.O + this.f40117c + ": " + e11 + ", key: " + a(this.f40117c, (String) 0) + ", gp: " + k(), new Object[0]);
        return e11;
    }

    public long k() {
        try {
            String str = this.f40118d;
            if (str != null) {
                return Long.parseLong(String.valueOf(com.mob.commons.b.a(str, Long.valueOf(this.f40120f))));
            }
            return 0L;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0L;
        }
    }

    public HashMap<String, Object> l() {
        if (((Integer) a(com.mob.commons.n.a("002Ldbdc"), (String) 0)).intValue() == 1) {
            return a(DeviceHelper.getInstance(MobSDK.getContext()).getLocation(0, 0, true), true);
        }
        return null;
    }

    public final boolean m() {
        if ("bs,l,ol,wi,wl,ext,aa,".contains(this.f40117c + ",")) {
            return com.mob.commons.g.a().b();
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                if (i()) {
                    if (!com.mob.commons.b.e()) {
                        a(60000L);
                        try {
                            return;
                        } catch (Throwable th2) {
                            return;
                        }
                    } else {
                        a();
                        if (this.f40122i) {
                            a.c(this);
                        } else {
                            a.d(this);
                        }
                        b();
                    }
                }
                j();
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
            }
        } catch (Throwable th4) {
            try {
                MobLog.getInstance().d(th4);
                j();
            } finally {
                try {
                    j();
                } catch (Throwable th22) {
                    MobLog.getInstance().d(th22);
                }
            }
        }
    }

    public c(String str, long j11, String str2, long j12) {
        this.f40116b = 0;
        this.f40121h = 2;
        this.f40122i = false;
        this.f40117c = str;
        this.f40118d = str2;
        this.f40119e = j11;
        this.f40120f = j12;
    }

    public void a(int i11) {
        this.f40121h = i11;
    }

    public void a(long j11) {
        a(j11, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(long j11, Object obj) {
        l.a().a(j11, getClass(), new Object[]{Integer.valueOf(this.f40116b + 1), obj}, this.f40121h);
    }

    public <T> T a(String str, T t11) {
        return (T) com.mob.commons.b.a(str, t11);
    }

    public void a(long j11, String str, Object obj, boolean z11) {
        a(j11, str, obj, null, z11);
    }

    public void a(long j11, String str, Object obj, HashMap<String, Object> hashMap, boolean z11) {
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = j11 > 0 ? (j11 * 1000) + currentTimeMillis : currentTimeMillis;
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(com.mob.commons.n.a("004c9ch%dh"), str);
        hashMap2.put(com.mob.commons.n.a("0043dccdefGc"), obj);
        hashMap2.put(com.mob.commons.n.a("008g+ceNchcZcd0kh"), Long.valueOf(currentTimeMillis));
        if (hashMap != null && !hashMap.isEmpty()) {
            hashMap2.putAll(hashMap);
        }
        if (z11) {
            hashMap2.put(com.mob.commons.n.a("002-cfdc"), l());
        }
        com.mob.commons.d.a().a(j12, hashMap2);
    }

    public void a(String str, HashMap<String, Object> hashMap) {
        a(str, hashMap, false);
    }

    public void j() {
    }

    public void a(String str, HashMap<String, Object> hashMap, boolean z11) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(com.mob.commons.n.a("004c-chHdh"), str);
        if (hashMap != null) {
            hashMap2.put(com.mob.commons.n.a("004g7ceDcUce"), hashMap);
        }
        hashMap2.put(com.mob.commons.n.a("008gTceQchc-cdOkh"), Long.valueOf(currentTimeMillis));
        if (z11) {
            hashMap2.put(com.mob.commons.n.a("002-cfdc"), l());
        }
        com.mob.commons.d.a().a(currentTimeMillis, hashMap2);
    }

    public HashMap<String, Object> a(Location location, boolean z11) {
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        if (location == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("accmt", Float.valueOf(location.getAccuracy()));
        if (Build.VERSION.SDK_INT >= 26) {
            hasVerticalAccuracy = location.hasVerticalAccuracy();
            if (hasVerticalAccuracy) {
                verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                hashMap.put("vacmt", Float.valueOf(verticalAccuracyMeters));
            }
        }
        hashMap.put("ltdmt", Double.valueOf(location.getLatitude()));
        hashMap.put("lndmt", Double.valueOf(location.getLongitude()));
        hashMap.put(com.mob.commons.n.a("005Tdc7c(cd^kh"), Long.valueOf(location.getTime()));
        hashMap.put("prvmt", location.getProvider());
        hashMap.put("atdmt", Double.valueOf(location.getAltitude()));
        hashMap.put("brmt", Float.valueOf(location.getBearing()));
        hashMap.put("spmt", Float.valueOf(location.getSpeed()));
        if (!z11) {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            String ssid = deviceHelper.getSSID();
            String bssid = deviceHelper.getBssid();
            if (!TextUtils.isEmpty(bssid)) {
                hashMap.put("cbsmt", bssid);
            }
            if (!TextUtils.isEmpty(ssid)) {
                hashMap.put("cssmt", ssid);
            }
        }
        return hashMap;
    }

    public static void a(String str, File file, String str2, String str3) throws Throwable {
        Object obj;
        Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(MobSDK.getContext(), com.mob.commons.n.a("014*ee'hcDfedcceefefdjdbce!gh(cg"), new Object[0]);
        ReflectHelper.importClass(com.mob.commons.n.a("028g4cedcBi cdcidkefchefQchk,dkehDhSckfedcceefefdjdbce[ghIcg"), com.mob.commons.n.a("028g4cedcBi cdcidkefchefQchk,dkehDhSckfedcceefefdjdbce[ghIcg"));
        File parentFile = file.getParentFile();
        WeakHashMap<String, Object> weakHashMap = f40114g;
        synchronized (weakHashMap) {
            try {
                obj = weakHashMap.get(str);
                if (obj == null) {
                    obj = ReflectHelper.newInstance(com.mob.commons.n.a("028g cedcNiDcdcidkefchef chk_dkehZhNckfedcceefefdjdbce?ghBcg"), file.getAbsolutePath(), parentFile.getAbsolutePath(), parentFile.getAbsolutePath(), invokeInstanceMethod);
                    weakHashMap.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ResHelper.deleteFileAndFolder(parentFile);
        String a11 = com.mob.commons.e.a((MobProduct) null);
        final Object invokeInstanceMethod2 = ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(obj, com.mob.commons.n.a("009Rdcdbce@g0fedcceefef"), str2), com.mob.commons.n.a("009Gee(hcRfg7hcbPdb7g"), str3, String.class);
        HashMap hashMap = new HashMap();
        hashMap.put(com.mob.commons.n.a("004g%cbcd_g"), a11);
        hashMap.put(com.mob.commons.n.a("004k0dbcd@g"), com.mob.commons.b.d.c(MobSDK.getContext()));
        hashMap.put(com.mob.commons.n.a("010Fef1gIcifdEhPcgefcddbcj"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
        hashMap.put(com.mob.commons.n.a("006+ceWddWgiPhRch"), MobSDK.getAppkey());
        hashMap.put(com.mob.commons.n.a("009;ce'dd^dgPhCcfcg2hc"), MobSDK.getAppSecret());
        hashMap.put(com.mob.commons.n.a("006g6dbLk9cecdcj"), MobSDK.getDomain().getDomain());
        hashMap.put(com.mob.commons.n.a("010Megdbcgcf!h[gb?ccdHef"), Boolean.valueOf(MobSDK.checkForceHttps()));
        Long l11 = (Long) com.mob.commons.b.a(com.mob.commons.n.a("004h8cfThQck"), 5L);
        l11.longValue();
        hashMap.put(com.mob.commons.n.a("004hScf4hIck"), l11);
        hashMap.put(com.mob.commons.n.a("0020cfUg"), (String) com.mob.commons.b.a(com.mob.commons.n.a("002;cf+g"), com.mob.commons.n.a("006,fififjfjfjfj")));
        hashMap.put("usridt", u.d());
        final String fromHashMap = HashonHelper.fromHashMap(hashMap);
        ReflectHelper.invokeInstanceMethod(invokeInstanceMethod2, com.mob.commons.n.a("0139ef[hc;dicfcf+h(efefcdebdcFh"), Boolean.TRUE);
        com.mob.commons.f.a().a(15);
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.commons.a.c.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                try {
                    com.mob.commons.f.a().a(16);
                    ReflectHelper.invokeInstanceMethod(invokeInstanceMethod2, com.mob.commons.n.a("006NcdcjJi+dbciTh"), null, new Object[]{fromHashMap});
                    com.mob.commons.f.a().a(17);
                    return false;
                } catch (Throwable th3) {
                    com.mob.commons.f.a().a(7, th3);
                    return false;
                }
            }
        });
    }
}
