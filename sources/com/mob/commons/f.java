package com.mob.commons;

import android.os.Message;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40327a = com.mob.commons.a.l.a("004Cfm i@ejfe");

    /* renamed from: b, reason: collision with root package name */
    private static f f40328b;

    /* renamed from: c, reason: collision with root package name */
    private NetCommunicator f40329c;

    /* renamed from: f, reason: collision with root package name */
    private String f40332f;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f40334h;

    /* renamed from: d, reason: collision with root package name */
    private SimpleDateFormat f40330d = new SimpleDateFormat(com.mob.commons.a.l.a("025@ejejejejijhihiijHii>jdididRgmmg_ghghfmfififijdgm"));

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f40331e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private int f40333g = -1;

    private f() {
        this.f40332f = null;
        try {
            this.f40332f = UUID.randomUUID().toString();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        this.f40334h = new com.mob.tools.utils.d() { // from class: com.mob.commons.f.1
            @Override // com.mob.tools.utils.d
            public void a() {
                if (b.d()) {
                    f.this.c();
                }
            }
        };
    }

    private synchronized int b() {
        return this.f40333g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z11;
        File[] listFiles;
        if (this.f40331e.size() > 0) {
            z11 = a(this.f40331e);
            if (!z11) {
                c(this.f40331e);
            }
            this.f40331e.clear();
        } else {
            z11 = true;
        }
        if (z11) {
            File f11 = f();
            if (!f11.exists() || !f11.isDirectory() || (listFiles = f11.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                if (a((HashMap<String, Object>) ResHelper.readObjectFromFile(file.getAbsolutePath())) && !file.delete()) {
                    file.delete();
                }
            }
        }
    }

    private void d() {
        if (this.f40329c == null) {
            this.f40329c = new NetCommunicator(1024, "ab0a0a6473d1891d388773574764b239d4ad80cb2fd3a83d81d03901c1548c13fee7c9692c326e6682b239d4c5d0021d1b607642c47ec29f10b0602908c3e6c9", "23c3c8cb41c47dd288cc7f4c218fbc7c839a34e0a0d1b2130e87b7914936b120a2d6570ee7ac66282328d50f2acfd82f2259957c89baea32547758db05de9cd7c6822304c8e45742f24bbbe41c1e12f09e18c6fab4d078065f2e5aaed94c900c66e8bbf8a120eefa7bd1fb52114d529250084f5f6f369ed4ce9645978dd30c51");
        }
    }

    private boolean e() {
        String networkType = DeviceHelper.getInstance(MobSDK.getContext()).getNetworkType();
        return (networkType == null || com.mob.commons.a.l.a("004JelfdelRj").equals(networkType)) ? false : true;
    }

    private File f() {
        return new File(ResHelper.getDataCache(MobSDK.getContext()), f40327a);
    }

    public synchronized void b(int i11, Throwable th2) {
        a(i11, th2, null, true);
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f40328b == null) {
                    f40328b = new f();
                }
                fVar = f40328b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    private void d(HashMap<String, Object> hashMap) throws Throwable {
        File[] listFiles;
        File f11 = f();
        if (!f11.exists() || !f11.isDirectory()) {
            f11.delete();
            f11.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        String str = f40327a;
        sb2.append(str);
        sb2.append("_");
        int i11 = 0;
        sb2.append(0);
        File file = new File(f11, sb2.toString());
        if (file.exists() && (listFiles = f11.listFiles()) != null && listFiles.length > 0) {
            file = new File(f11, str + "_0");
            while (file.exists()) {
                i11++;
                file = new File(f11, f40327a + "_" + i11);
            }
        }
        ResHelper.saveObjectToFile(file.getPath(), hashMap);
    }

    private boolean b(HashMap<String, Object> hashMap) throws Throwable {
        if (hashMap != null && !hashMap.isEmpty()) {
            HashMap<String, Object> g11 = q.g();
            g11.put(com.mob.commons.a.l.a("006jTeieifdeigh"), hashMap);
            d();
            String str = c.a(c.f40224f) + com.mob.commons.a.l.a("004hi7eife");
            if ("1".equals(String.valueOf(hashMap.get("saa")))) {
                str = c.a("sdrl") + "/sdrl";
            }
            HashMap hashMap2 = (HashMap) this.f40329c.requestSynchronized(g11, str, false);
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void a(int i11) {
        this.f40333g = i11;
        if (i11 == 1 || i11 == 4 || i11 == 17 || i11 == 18 || i11 == 19 || i11 == 20) {
            a(8, null, "ld vr " + i11, false);
        }
    }

    public synchronized void a(int i11, Throwable th2) {
        a(i11, th2, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void a(int i11, Throwable th2, String str, boolean z11) {
        try {
            if (th2 == null) {
                MobLog.getInstance().d(str, new Object[0]);
            } else {
                MobLog.getInstance().d(th2);
            }
            if (e.a()) {
                return;
            }
            final Message message = new Message();
            message.what = 1;
            message.arg1 = z11 ? 1 : 0;
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (th2 == null) {
                th2 = str;
            }
            message.obj = new Object[]{valueOf, th2, Integer.valueOf(i11), Integer.valueOf(b())};
            t.f40415d.execute(new com.mob.tools.utils.d() { // from class: com.mob.commons.f.2
                @Override // com.mob.tools.utils.d
                public void a() {
                    f.this.a(message);
                }
            });
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void c(HashMap<String, Object> hashMap) {
        try {
            d(hashMap);
        } catch (Throwable th2) {
            try {
                d(hashMap);
            } catch (Throwable unused) {
                MobLog.getInstance().d(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        String valueOf;
        if (this.f40331e.size() > 10) {
            c(this.f40331e);
            this.f40331e.clear();
        }
        Object[] objArr = (Object[]) message.obj;
        this.f40331e.put("saa", Integer.valueOf(message.arg1));
        this.f40331e.put(com.mob.commons.a.l.a("002;ghIi"), this.f40332f);
        ArrayList arrayList = (ArrayList) this.f40331e.get(com.mob.commons.a.l.a("004)feefghEe"));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.mob.commons.a.l.a("002Xeh6e"), objArr[0]);
        Object obj = objArr[1];
        if (obj instanceof Throwable) {
            valueOf = a((Throwable) obj);
        } else {
            valueOf = String.valueOf(obj);
        }
        if (!TextUtils.isEmpty(valueOf)) {
            valueOf = valueOf.replaceAll("\r\n\t", " ").replaceAll(ta0.b.f90407c, " ").replaceAll("\n", " ");
        }
        hashMap.put(com.mob.commons.a.l.a("002mCgg"), "[" + this.f40330d.format(objArr[0]) + "][" + objArr[2] + "][" + objArr[3] + "] " + valueOf);
        hashMap.put(com.mob.commons.a.l.a("002je"), objArr[2]);
        hashMap.put(com.mob.commons.a.l.a("002f^fd"), objArr[3]);
        arrayList.add(hashMap);
        this.f40331e.put(com.mob.commons.a.l.a("004Rfeefgh(e"), arrayList);
        if (e.a()) {
            return;
        }
        com.mob.commons.a.l.a().b(!e() ? 120L : 10L, this.f40334h);
    }

    private boolean a(HashMap<String, Object> hashMap) {
        try {
            return b(hashMap);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            try {
                return b(hashMap);
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0015, code lost:
    
        r0 = new java.io.StringWriter();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x001a, code lost:
    
        r1 = new java.io.PrintWriter(r0);
        r5.printStackTrace(r1);
        r1.flush();
        r5 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0029, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x002d, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002e, code lost:
    
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.Throwable r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            r1 = r5
        L6:
            r2 = 0
            if (r1 == 0) goto L15
            boolean r3 = r1 instanceof java.net.UnknownHostException     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto Le
            return r0
        Le:
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L13
            goto L6
        L13:
            r5 = move-exception
            goto L2f
        L15:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            r5.printStackTrace(r1)     // Catch: java.lang.Throwable -> L2d
            r1.flush()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r5
        L2d:
            r5 = move-exception
            r2 = r0
        L2f:
            boolean r0 = r5 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L41
            java.lang.String r5 = "0234ggWjeIfi8e[egehekfjeiegeh=j^fi:e2eiefelggjdfdfd(m"
            java.lang.String r5 = com.mob.commons.a.l.a(r5)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L3e
            r2.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r5
        L3f:
            r5 = move-exception
            goto L4b
        L41:
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            return r5
        L4b:
            if (r2 == 0) goto L50
            r2.close()     // Catch: java.lang.Throwable -> L50
        L50:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.f.a(java.lang.Throwable):java.lang.String");
    }
}
