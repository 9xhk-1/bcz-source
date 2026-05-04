package com.mob.commons;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.MobSDK;
import com.mob.commons.clt.PClt;
import com.mob.commons.clt.PSClt;
import com.mob.commons.clt.PaClt;
import com.mob.commons.clt.VplClt;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f40141c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f40142d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private static AtomicBoolean f40143e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private static volatile HashMap<String, Object> f40144f = null;

    /* renamed from: a, reason: collision with root package name */
    public static volatile HashSet<Class<? extends com.mob.commons.a.c>> f40139a = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f40145g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f40146h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static CountDownLatch f40147i = new CountDownLatch(1);

    /* renamed from: j, reason: collision with root package name */
    private static CountDownLatch f40148j = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f40140b = false;

    public static boolean d() {
        return ((Integer) a(n.a("002Fcjcg"), 0)).intValue() == 1 || s.a();
    }

    public static boolean e() {
        return d();
    }

    public static ConcurrentHashMap<String, Object> f() {
        return f40145g;
    }

    public static ConcurrentHashMap<String, Object> g() {
        return f40146h;
    }

    public static ArrayList<String> h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.a("004.dgdgdfeh"));
        arrayList.add(n.a("005^eidgdgdfeh"));
        arrayList.add(n.a("0052dcKhih dc"));
        arrayList.add(n.a("009LegcgEhj?cb8hOcjcfch"));
        arrayList.add(n.a("0103cccccccfcbcgfedbcjcj"));
        return (ArrayList) a(n.a("004Yeccdefcf"), arrayList);
    }

    public static void i() {
        if (b()) {
            b(3);
        }
    }

    public static boolean j() {
        return d("ie");
    }

    public static boolean k() {
        return d("is");
    }

    private static void o() {
        HashMap fromJson = HashonHelper.fromJson(v.a().b());
        if (a((HashMap<String, Object>) fromJson)) {
            v.a().a((String) null);
            fromJson = null;
        }
        if (b()) {
            a((HashMap<String, Object>) fromJson, false);
            b(1);
        }
    }

    private static HashSet<Class<? extends com.mob.commons.a.c>> p() {
        HashSet<Class<? extends com.mob.commons.a.c>> hashSet = new HashSet<>();
        try {
            hashSet.add(com.mob.commons.a.a.class);
        } catch (Throwable unused) {
        }
        try {
            hashSet.add(com.mob.commons.a.b.class);
        } catch (Throwable unused2) {
        }
        try {
            hashSet.add(com.mob.commons.a.d.class);
        } catch (Throwable unused3) {
        }
        try {
            hashSet.add(com.mob.commons.a.e.class);
        } catch (Throwable unused4) {
        }
        try {
            hashSet.add(com.mob.commons.a.f.class);
        } catch (Throwable unused5) {
        }
        try {
            hashSet.add(com.mob.commons.a.g.class);
        } catch (Throwable unused6) {
        }
        try {
            hashSet.add(com.mob.commons.a.h.class);
        } catch (Throwable unused7) {
        }
        try {
            hashSet.add(PaClt.class);
        } catch (Throwable unused8) {
        }
        try {
            hashSet.add(com.mob.commons.a.i.class);
        } catch (Throwable unused9) {
        }
        try {
            hashSet.add(PClt.class);
        } catch (Throwable unused10) {
        }
        try {
            hashSet.add(PSClt.class);
        } catch (Throwable unused11) {
        }
        try {
            hashSet.add(com.mob.commons.a.j.class);
        } catch (Throwable unused12) {
        }
        try {
            hashSet.add(com.mob.commons.a.k.class);
        } catch (Throwable unused13) {
        }
        try {
            hashSet.add(VplClt.class);
        } catch (Throwable unused14) {
        }
        try {
            hashSet.add(com.mob.commons.a.m.class);
        } catch (Throwable unused15) {
        }
        try {
            hashSet.add(com.mob.commons.a.n.class);
        } catch (Throwable unused16) {
        }
        return hashSet;
    }

    private static void q() {
        Object obj = l.f40361g;
        synchronized (obj) {
            f.a().a(10);
            obj.notifyAll();
        }
    }

    private static void r() {
        Object obj = l.f40362h;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    private static HashMap s() {
        HashMap<String, Object> t11 = t();
        long j11 = 1;
        long j12 = 2;
        while (true) {
            if (t11 != null) {
                try {
                    if (!t11.isEmpty()) {
                        break;
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
            try {
                Thread.sleep(1000 * j11);
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
            }
            t11 = t();
            if (t11 == null || t11.isEmpty()) {
                boolean checkNetworkAvailable = DeviceHelper.getInstance(MobSDK.getContext()).checkNetworkAvailable();
                if (checkNetworkAvailable) {
                    if (j12 <= 0) {
                        break;
                    }
                    j12--;
                }
                j11 *= 2;
                if (!checkNetworkAvailable && j11 < 8) {
                    j11 = 8;
                }
                if (j11 > 300) {
                    j11 = 8;
                }
            }
        }
        return t11;
    }

    private static HashMap<String, Object> t() {
        try {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            if (!deviceHelper.checkNetworkAvailable()) {
                return null;
            }
            String packageName = deviceHelper.getPackageName();
            HashMap<String, Object> f11 = q.f();
            String appkey = MobSDK.getAppkey();
            f11.put(n.a("006IceAdd+ci]h ch"), appkey);
            f11.put(n.a("006Xce8ddd.ciee"), packageName);
            f11.put(n.a("003Wceeeef"), String.valueOf(deviceHelper.isPackageInstalled(n.a("022;cfdb7k'dkeedbdbeedcZh;dkcecjAgYcgdbcd:gZdkeeUk4ef")) ? 1 : -1));
            f11.put(n.a("002c;ef"), String.valueOf(System.currentTimeMillis()));
            int privacyGrantedStatus = MobSDK.getPrivacyGrantedStatus();
            if (privacyGrantedStatus != -1) {
                f11.put(n.a("009(cdefdieecgVhh-ff@d"), String.valueOf(privacyGrantedStatus == 1));
            }
            f11.put(n.a("002iRhd"), String.valueOf(MobSDK.checkV6() ? 1 : -1));
            f11.put(n.a("002%cbcf"), String.valueOf(deviceHelper.checkUA() ? 1 : 0));
            f11.put(n.a("002%cb:g"), String.valueOf(deviceHelper.usbEnable() ? 1 : 0));
            f11.put(n.a("002gi"), String.valueOf(deviceHelper.devEnable() ? 1 : 0));
            f11.put(n.a("002id"), String.valueOf(deviceHelper.vpn() ? 1 : 0));
            f11.put(n.a("002^ec'd"), String.valueOf(deviceHelper.isWifiProxy() ? 1 : 0));
            f11.put(n.a("002Zcg7c"), String.valueOf(deviceHelper.isRooted() ? 1 : 0));
            f11.put(n.a("002WckVd"), String.valueOf(deviceHelper.cx() ? 1 : 0));
            f11.put(n.a("002!ce;g"), String.valueOf(deviceHelper.debugable() ? 1 : 0));
            String httpGet = new NetworkHelper().httpGet(c.a(c.f40220b) + n.a("007fi.gdLf0eecfeg"), f11, NetCommunicator.getCommonDefaultHeaders());
            HashMap fromJson = HashonHelper.fromJson(httpGet);
            if (fromJson == null) {
                return null;
            }
            if (!BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get(n.a("0061ef<cCce7c$cbef"))))) {
                throw new Throwable("RS is illegal: " + httpGet);
            }
            byte[] rawMD5 = Data.rawMD5((appkey + ":" + packageName + ":" + fromJson.get(n.a("009c9cd[khPef8c ce1kd"))).getBytes("utf-8"));
            String str = (String) ResHelper.forceCast(fromJson.get(n.a("002Zefcf")));
            if (str == null) {
                throw new Throwable("RS is illegal: " + httpGet);
            }
            String str2 = new String(Data.AES128Decode(rawMD5, Base64.decode(str, 2)), "utf-8");
            MobLog.getInstance().d("sw: " + str2, new Object[0]);
            HashMap<String, Object> fromJson2 = HashonHelper.fromJson(str2);
            if (fromJson2 == null || fromJson2.isEmpty()) {
                throw new Throwable("RS is illegal: " + httpGet);
            }
            fromJson2.put(n.a("010ghi5cdcf*h dhcd]kh"), Long.valueOf(SystemClock.elapsedRealtime()));
            v.a().a(str2);
            a(fromJson2.remove(n.a("011FcddcdcXhDeecedcfgcecfef")));
            return fromJson2;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            try {
                v.a().a((String) null);
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    public static void a() {
        o();
    }

    public static boolean b() {
        return ((Integer) a(n.a("002c,db"), 0)).intValue() == 0;
    }

    public static boolean c() {
        return ((Integer) a(n.a("004<cfdbcjcj"), 0)).intValue() == 1;
    }

    private static boolean e(String str) {
        List list = (List) a(n.a("002*cfdc"), (Object) null);
        return (list == null || list.size() == 0 || !list.contains(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.mob.tools.network.NetworkHelper] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.mob.commons.b$4, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.mob.tools.network.NetworkHelper] */
    public static void f(String str) {
        String b11;
        File file;
        ?? fileOutputStream;
        File file2 = null;
        try {
            f.a().a(0);
            b11 = r.b(str);
            file = new File(MobSDK.getContext().getFilesDir(), n.a("003Iefcfcf"));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!g.a().b()) {
                f.a().a(18);
                ResHelper.deleteFileAndFolder(file);
                return;
            }
            if (TextUtils.isEmpty(b11)) {
                f.a().a(1);
                ResHelper.deleteFileAndFolder(file);
                return;
            }
            try {
                if (d()) {
                    f.a().a(2);
                    HashMap hashMap = (HashMap) new NetCommunicator(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestSynchronized(q.g(), b11, false);
                    f.a().a(3);
                    String str2 = (String) hashMap.get(n.a("002%egdc"));
                    String str3 = (String) hashMap.get("m");
                    Boolean bool = (Boolean) hashMap.get(n.a("002Vceef"));
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    String str4 = (String) hashMap.get(n.a("002Nceci"));
                    String str5 = (String) hashMap.get(n.a("002^cfcj"));
                    String str6 = (String) hashMap.get(n.a("002-egcj"));
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str4)) {
                        synchronized (l.f40361g) {
                            try {
                                f40145g.clear();
                                f40145g.put(CmcdData.STREAMING_FORMAT_HLS, str3);
                                f40145g.put("k", str4);
                                f40145g.put(n.a("002=cfcj"), str5);
                                f40145g.put(n.a("002Pegcj"), str6);
                                if (booleanValue) {
                                    f.a().a(5);
                                    File file3 = new File(file, n.a("008Rcfdbcjegdkefcfcf"));
                                    if (file3.exists()) {
                                        if (!str3.equals(Data.MD5(file3))) {
                                        }
                                    }
                                    f.a().a(6);
                                    ResHelper.deleteFileAndFolder(file);
                                    file.mkdirs();
                                    try {
                                        fileOutputStream = new FileOutputStream(file3);
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    try {
                                        new NetworkHelper().download(str2, fileOutputStream, null);
                                        f.a().a(7);
                                        r.a((Closeable[]) new Closeable[]{fileOutputStream});
                                    } catch (Throwable th4) {
                                        th = th4;
                                        file2 = fileOutputStream;
                                        r.a((Closeable[]) new Closeable[]{file2});
                                        throw th;
                                    }
                                } else {
                                    f.a().a(8);
                                    ResHelper.deleteFileAndFolder(file);
                                    final byte[][] bArr = new byte[1][];
                                    final int[] iArr = new int[1];
                                    try {
                                        ?? r72 = new ByteArrayOutputStream() { // from class: com.mob.commons.b.4
                                            @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                            public void close() throws IOException {
                                                super.close();
                                                bArr[0] = ((ByteArrayOutputStream) this).buf;
                                                iArr[0] = ((ByteArrayOutputStream) this).count;
                                            }
                                        };
                                        try {
                                            new NetworkHelper().download(str2, r72, null);
                                            f.a().a(9);
                                            r.a((Closeable[]) new Closeable[]{r72});
                                            f40145g.put(n.a("001Jeb"), bArr[0]);
                                            f40145g.put("s", Integer.valueOf(iArr[0]));
                                        } catch (Throwable th5) {
                                            th = th5;
                                            file2 = r72;
                                            r.a((Closeable[]) new Closeable[]{file2});
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    f.a().a(4);
                    ResHelper.deleteFileAndFolder(file);
                }
            } finally {
                q();
            }
        } catch (Throwable th7) {
            th = th7;
            file2 = file;
            if (file2 != null) {
                try {
                    ResHelper.deleteFileAndFolder(file2);
                } catch (Throwable unused) {
                }
            }
            f.a().a(2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(String str) {
        File file = null;
        try {
            String b11 = r.b(str);
            File file2 = new File(MobSDK.getContext().getFilesDir(), n.a("003Tefebdc"));
            try {
                if (!g.a().b()) {
                    ResHelper.deleteFileAndFolder(file2);
                } else if (TextUtils.isEmpty(b11)) {
                    ResHelper.deleteFileAndFolder(file2);
                } else {
                    if (!d()) {
                        r();
                        return;
                    }
                    HashMap<String, Object> g11 = q.g();
                    g11.put(n.a("007ihZcgefcddbcj"), String.valueOf(com.mob.commons.cc.b.a()));
                    ArrayList arrayList = (ArrayList) ((HashMap) new NetCommunicator(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").requestSynchronized(g11, b11, false)).get(n.a("004!dccdefVc"));
                    synchronized (l.f40362h) {
                        f40146h.clear();
                        f40146h.put(n.a("002<dcGc"), arrayList);
                    }
                }
                r();
            } catch (Throwable unused) {
                file = file2;
                if (file != null) {
                    try {
                        ResHelper.deleteFileAndFolder(file);
                    } catch (Throwable unused2) {
                    }
                }
                r();
            }
        } catch (Throwable unused3) {
        }
    }

    public static <T> T a(String str, T t11) {
        if (TextUtils.isEmpty(str) || f40144f == null) {
            return t11;
        }
        if (a(f40144f)) {
            f40144f.clear();
            f40144f = new HashMap<>();
            b(2);
        }
        return (T) ResHelper.forceCast(f40144f.get(str), t11);
    }

    private static boolean d(String str) {
        List list = (List) a(n.a("003bKcdNg"), (Object) null);
        return (list == null || list.isEmpty() || !list.contains(str)) ? false : true;
    }

    private static void b(final int i11) {
        if (f40143e.compareAndSet(false, true)) {
            final String format = String.format(n.a("005Ufegcghigef"), Integer.valueOf(i11));
            if (i11 == 2) {
                t.f40414c.execute(new com.mob.tools.utils.d() { // from class: com.mob.commons.b.1
                    @Override // com.mob.tools.utils.d
                    public void a() {
                        if (!TextUtils.isEmpty("M-")) {
                            Thread.currentThread().setName("M-" + format);
                        }
                        try {
                            b.c(i11);
                        } finally {
                            b.f40143e.set(false);
                        }
                    }
                });
                return;
            }
            if (!TextUtils.isEmpty("M-")) {
                Thread.currentThread().setName("M-" + format);
            }
            try {
                c(i11);
            } finally {
                f40143e.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i11) {
        HashMap s11 = s();
        a((HashMap<String, Object>) s11, true);
        if (s11 != null && !s11.isEmpty()) {
            if (b() && c()) {
                final String str = (String) a(n.a("003]egcjcf"), (Object) null);
                if (TextUtils.isEmpty(str)) {
                    if (i11 == 3 || s.b()) {
                        q();
                    }
                } else if (i11 == 3 || f40141c.compareAndSet(false, true)) {
                    new com.mob.tools.utils.e(n.a("003Wehhhgh") + i11) { // from class: com.mob.commons.b.2
                        @Override // com.mob.tools.utils.e
                        public void a() {
                            l.a(l.a(l.f40358d), false, new k() { // from class: com.mob.commons.b.2.1
                                @Override // com.mob.commons.k
                                public boolean a(FileLocker fileLocker) {
                                    try {
                                        synchronized (b.f40145g) {
                                            b.f(str);
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        f.a().a(1, th2);
                                        return false;
                                    }
                                }
                            });
                        }
                    }.start();
                }
                if (b() && c()) {
                    final String str2 = (String) a("sbr", (Object) null);
                    if (TextUtils.isEmpty(str2)) {
                        r();
                    } else if (i11 == 3 || f40142d.compareAndSet(false, true)) {
                        new com.mob.tools.utils.e("DS-" + i11) { // from class: com.mob.commons.b.3
                            @Override // com.mob.tools.utils.e
                            public void a() {
                                l.a(l.a(l.f40359e), false, new k() { // from class: com.mob.commons.b.3.1
                                    @Override // com.mob.commons.k
                                    public boolean a(FileLocker fileLocker) {
                                        try {
                                            synchronized (b.f40146h) {
                                                b.g(str2);
                                            }
                                            return false;
                                        } catch (Throwable th2) {
                                            MobLog.getInstance().d(th2);
                                            return false;
                                        }
                                    }
                                });
                            }
                        }.start();
                    }
                } else {
                    r();
                    return;
                }
            } else {
                if (i11 == 3 || s.b()) {
                    q();
                    return;
                }
                return;
            }
        }
        if (MobSDK.getDomain() != InternationalDomain.DEFAULT || MobSDK.checkV6()) {
            return;
        }
        c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x002c, B:9:0x0032, B:13:0x0040, B:14:0x0048, B:18:0x0011, B:22:0x001f, B:23:0x0027), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #0 {all -> 0x000f, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x002c, B:9:0x0032, B:13:0x0040, B:14:0x0048, B:18:0x0011, B:22:0x001f, B:23:0x0027), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T a(java.lang.String r5, T r6, long r7) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.mob.commons.b.f40144f     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r0 == 0) goto L11
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.mob.commons.b.f40144f     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L2c
            goto L11
        Lf:
            r7 = move-exception
            goto L4e
        L11:
            java.util.concurrent.CountDownLatch r0 = com.mob.commons.b.f40147i     // Catch: java.lang.Throwable -> Lf
            long r3 = r0.getCount()     // Catch: java.lang.Throwable -> Lf
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2c
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.concurrent.CountDownLatch r0 = com.mob.commons.b.f40147i     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lf
            r0.await(r7, r3)     // Catch: java.lang.Throwable -> Lf
            goto L2c
        L27:
            java.util.concurrent.CountDownLatch r0 = com.mob.commons.b.f40147i     // Catch: java.lang.Throwable -> Lf
            r0.await()     // Catch: java.lang.Throwable -> Lf
        L2c:
            boolean r0 = e(r5)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L55
            java.util.concurrent.CountDownLatch r0 = com.mob.commons.b.f40148j     // Catch: java.lang.Throwable -> Lf
            long r3 = r0.getCount()     // Catch: java.lang.Throwable -> Lf
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L48
            java.util.concurrent.CountDownLatch r0 = com.mob.commons.b.f40148j     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lf
            r0.await(r7, r1)     // Catch: java.lang.Throwable -> Lf
            goto L55
        L48:
            java.util.concurrent.CountDownLatch r7 = com.mob.commons.b.f40148j     // Catch: java.lang.Throwable -> Lf
            r7.await()     // Catch: java.lang.Throwable -> Lf
            goto L55
        L4e:
            com.mob.tools.log.NLog r8 = com.mob.tools.MobLog.getInstance()
            r8.d(r7)
        L55:
            java.lang.Object r5 = a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.a(java.lang.String, java.lang.Object, long):java.lang.Object");
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && b() && c() && ((Integer) a(str, 0)).intValue() != 0;
    }

    private static void a(HashMap<String, Object> hashMap, boolean z11) {
        f40144f = new HashMap<>();
        if (hashMap != null) {
            f40144f.putAll(hashMap);
        }
        try {
            if (z11) {
                f40147i.countDown();
                f40148j.countDown();
            } else {
                f40147i.countDown();
            }
        } catch (Throwable unused) {
        }
        if (c()) {
            e.a((MobProduct) null);
            m.a().b();
            a(z11);
        }
    }

    private static synchronized void a(boolean z11) {
        synchronized (b.class) {
            HashSet<Class<? extends com.mob.commons.a.c>> p11 = p();
            try {
                Iterator<Class<? extends com.mob.commons.a.c>> it = p11.iterator();
                while (it.hasNext()) {
                    Class<? extends com.mob.commons.a.c> next = it.next();
                    try {
                        if (!f40139a.contains(next)) {
                            com.mob.commons.a.c newInstance = next.newInstance();
                            if (z11 || e(newInstance.d())) {
                                if (newInstance.g()) {
                                    f40139a.add(next);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
                p11.clear();
                MobLog.getInstance().d("clt(" + z11 + ") over", new Object[0]);
            } catch (Throwable th3) {
                p11.clear();
                throw th3;
            }
        }
    }

    private static boolean a(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            long longValue = ((Long) ResHelper.forceCast(hashMap.get(n.a("010ghiMcdcf7h2dhcd kh")), 0L)).longValue();
            if (longValue != 0 && SystemClock.elapsedRealtime() - longValue >= 86400000) {
                return true;
            }
        }
        return false;
    }

    private static void a(Object obj) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(n.a("004;dccdefJc"), obj);
            File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), n.a("005Hdk>k]cfdccd"));
            ResHelper.saveObjectToFile(dataCacheFile.getPath(), Data.AES128Encode(n.a("016YfjfiibihgdhdhgfhggedceebcfHgAegcd"), HashonHelper.fromHashMap(hashMap)));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
