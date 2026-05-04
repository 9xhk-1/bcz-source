package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class aj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected int f42258a;

    /* renamed from: b, reason: collision with root package name */
    protected long f42259b;

    /* renamed from: c, reason: collision with root package name */
    protected long f42260c;

    /* renamed from: d, reason: collision with root package name */
    private int f42261d;

    /* renamed from: e, reason: collision with root package name */
    private int f42262e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f42263f;

    /* renamed from: g, reason: collision with root package name */
    private final int f42264g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f42265h;

    /* renamed from: i, reason: collision with root package name */
    private final aa f42266i;

    /* renamed from: j, reason: collision with root package name */
    private final ac f42267j;

    /* renamed from: k, reason: collision with root package name */
    private final af f42268k;

    /* renamed from: l, reason: collision with root package name */
    private final ai f42269l;

    /* renamed from: m, reason: collision with root package name */
    private final int f42270m;

    /* renamed from: n, reason: collision with root package name */
    private final ah f42271n;

    /* renamed from: o, reason: collision with root package name */
    private final ah f42272o;

    /* renamed from: p, reason: collision with root package name */
    private String f42273p;

    /* renamed from: q, reason: collision with root package name */
    private final String f42274q;

    /* renamed from: r, reason: collision with root package name */
    private final Map<String, String> f42275r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f42276s;

    public aj(Context context, int i11, int i12, byte[] bArr, String str, String str2, ah ahVar, boolean z11) {
        this(context, i11, i12, bArr, str, str2, ahVar, 2, 30000, z11);
    }

    private static void a(String str) {
        al.e("[Upload] Failed to upload(%d): %s", 1, str);
    }

    public final void b(long j11) {
        this.f42260c += j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ac acVar;
        Pair pair;
        boolean booleanValue;
        try {
            this.f42258a = 0;
            this.f42259b = 0L;
            this.f42260c = 0L;
            if (ab.c(this.f42263f) == null) {
                str = "network is not available";
            } else {
                byte[] bArr = this.f42265h;
                if (bArr != null && bArr.length != 0) {
                    if (this.f42263f != null && this.f42266i != null && (acVar = this.f42267j) != null && this.f42268k != null) {
                        str = acVar.c() == null ? "illegal local strategy" : null;
                    }
                    str = "illegal access error";
                }
                str = "request package is empty!";
            }
            if (str != null) {
                a(false, 0, str);
                return;
            }
            byte[] a11 = ap.a(this.f42265h);
            if (a11 == null) {
                a(false, 0, "failed to zip request body");
                return;
            }
            HashMap hashMap = new HashMap(10);
            hashMap.put("tls", "1");
            hashMap.put("prodId", this.f42266i.e());
            hashMap.put("bundleId", this.f42266i.f42186c);
            hashMap.put("appVer", this.f42266i.f42198o);
            Map<String, String> map = this.f42275r;
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("cmd", Integer.toString(this.f42264g));
            hashMap.put(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, Byte.toString((byte) 1));
            hashMap.put("sdkVer", this.f42266i.f42191h);
            hashMap.put("strategylastUpdateTime", Long.toString(this.f42267j.c().f42093o));
            this.f42269l.a(this.f42270m, System.currentTimeMillis());
            String str2 = this.f42273p;
            this.f42267j.c();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= this.f42261d) {
                    a(false, i12, "failed after many attempts");
                    return;
                }
                if (i13 > 1) {
                    al.d("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i13));
                    ap.b(this.f42262e);
                    if (i13 == this.f42261d) {
                        al.d("[Upload] Use the back-up url at the last time: %s", this.f42274q);
                        str2 = this.f42274q;
                    }
                }
                al.c("[Upload] Send %d bytes", Integer.valueOf(a11.length));
                str2 = b(str2);
                al.c("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", str2, Integer.valueOf(this.f42264g), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                byte[] a12 = this.f42268k.a(str2, a11, this, hashMap);
                Map<String, String> map2 = this.f42268k.f42225c;
                Pair<Boolean, Boolean> a13 = a(a12, map2);
                if (((Boolean) a13.first).booleanValue()) {
                    Pair<Boolean, Boolean> a14 = a(map2);
                    if (((Boolean) a14.first).booleanValue()) {
                        byte[] b11 = ap.b(a12);
                        if (b11 != null) {
                            a12 = b11;
                        }
                        br a15 = ae.a(a12);
                        if (a15 == null) {
                            a(false, 1, "failed to decode response package");
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        } else {
                            Integer valueOf = Integer.valueOf(a15.f42541b);
                            byte[] bArr2 = a15.f42542c;
                            al.c("[Upload] Response cmd is: %d, length of sBuffer is: %d", valueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
                            if (a(a15, this.f42266i, this.f42267j)) {
                                a(true, 2, "successfully uploaded");
                                Boolean bool2 = Boolean.TRUE;
                                pair = new Pair(bool2, bool2);
                            } else {
                                a(false, 2, "failed to process response package");
                                Boolean bool3 = Boolean.FALSE;
                                pair = new Pair(bool3, bool3);
                            }
                        }
                        booleanValue = !((Boolean) pair.first).booleanValue() ? ((Boolean) pair.second).booleanValue() : false;
                    } else {
                        booleanValue = ((Boolean) a14.second).booleanValue();
                    }
                } else {
                    booleanValue = ((Boolean) a13.second).booleanValue();
                }
                if (!booleanValue) {
                    return;
                }
                i12 = 1;
                i11 = i13;
            }
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public aj(Context context, int i11, int i12, byte[] bArr, String str, String str2, ah ahVar, int i13, int i14, boolean z11) {
        this.f42261d = 2;
        this.f42262e = 30000;
        this.f42273p = null;
        this.f42258a = 0;
        this.f42259b = 0L;
        this.f42260c = 0L;
        this.f42276s = false;
        this.f42263f = context;
        this.f42266i = aa.a(context);
        this.f42265h = bArr;
        this.f42267j = ac.a();
        if (af.f42223a == null) {
            af.f42223a = new af(context);
        }
        this.f42268k = af.f42223a;
        ai a11 = ai.a();
        this.f42269l = a11;
        this.f42270m = i11;
        this.f42273p = str;
        this.f42274q = str2;
        this.f42271n = ahVar;
        this.f42272o = a11.f42242a;
        this.f42264g = i12;
        if (i13 > 0) {
            this.f42261d = i13;
        }
        if (i14 > 0) {
            this.f42262e = i14;
        }
        this.f42276s = z11;
        this.f42275r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = r4.f42264g
            r1 = 630(0x276, float:8.83E-43)
            if (r0 == r1) goto L1a
            r1 = 640(0x280, float:8.97E-43)
            if (r0 == r1) goto L17
            r1 = 830(0x33e, float:1.163E-42)
            if (r0 == r1) goto L1a
            r1 = 840(0x348, float:1.177E-42)
            if (r0 == r1) goto L17
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L1c
        L17:
            java.lang.String r0 = "userinfo"
            goto L1c
        L1a:
            java.lang.String r0 = "crash"
        L1c:
            if (r5 == 0) goto L28
            java.lang.String r6 = "[Upload] Success: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.bugly.proguard.al.a(r6, r0)
            goto L35
        L28:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7}
            java.lang.String r0 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.al.e(r0, r6)
        L35:
            long r0 = r4.f42259b
            long r2 = r4.f42260c
            long r0 = r0 + r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L55
            com.tencent.bugly.proguard.ai r6 = r4.f42269l
            boolean r0 = r4.f42276s
            long r0 = r6.a(r0)
            long r2 = r4.f42259b
            long r0 = r0 + r2
            long r2 = r4.f42260c
            long r0 = r0 + r2
            com.tencent.bugly.proguard.ai r6 = r4.f42269l
            boolean r2 = r4.f42276s
            r6.a(r0, r2)
        L55:
            com.tencent.bugly.proguard.ah r6 = r4.f42271n
            if (r6 == 0) goto L5c
            r6.a(r5, r7)
        L5c:
            com.tencent.bugly.proguard.ah r6 = r4.f42272o
            if (r6 == 0) goto L63
            r6.a(r5, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.aj.a(boolean, int, java.lang.String):void");
    }

    private static String b(String str) {
        if (ap.b(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th2) {
            al.a(th2);
            return str;
        }
    }

    private static boolean a(br brVar, aa aaVar, ac acVar) {
        if (brVar == null) {
            al.d("resp == null!", new Object[0]);
            return false;
        }
        byte b11 = brVar.f42540a;
        if (b11 != 0) {
            al.e("resp result error %d", Byte.valueOf(b11));
            return false;
        }
        try {
            if (!ap.b(brVar.f42546g) && !aa.b().i().equals(brVar.f42546g)) {
                w.a().a(ac.f42213a, "device", brVar.f42546g.getBytes("UTF-8"), true);
                aaVar.d(brVar.f42546g);
            }
        } catch (Throwable th2) {
            al.a(th2);
        }
        aaVar.f42196m = brVar.f42544e;
        int i11 = brVar.f42541b;
        if (i11 == 510) {
            byte[] bArr = brVar.f42542c;
            if (bArr == null) {
                al.e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i11));
                return false;
            }
            bt btVar = (bt) ae.a(bArr, bt.class);
            if (btVar == null) {
                al.e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(brVar.f42541b));
                return false;
            }
            acVar.a(btVar);
        }
        return true;
    }

    private Pair<Boolean, Boolean> a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            a("Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        al.c("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            a(false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    al.c("[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    public final void a(long j11) {
        this.f42258a++;
        this.f42259b += j11;
    }

    private Pair<Boolean, Boolean> a(Map<String, String> map) {
        int i11;
        if (map != null && map.size() != 0) {
            if (!map.containsKey("status")) {
                al.d("[Upload] Headers does not contain %s", "status");
            } else if (!map.containsKey("Bugly-Version")) {
                al.d("[Upload] Headers does not contain %s", "Bugly-Version");
            } else {
                String str = map.get("Bugly-Version");
                if (!str.contains("bugly")) {
                    al.d("[Upload] Bugly version is not valid: %s", str);
                } else {
                    al.c("[Upload] Bugly version from headers is: %s", str);
                    try {
                        i11 = Integer.parseInt(map.get("status"));
                    } catch (Throwable unused) {
                        i11 = -1;
                    }
                    try {
                        al.c("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i11), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (i11 != 0) {
                            a(false, 1, "status of server is ".concat(String.valueOf(i11)));
                            Boolean bool = Boolean.FALSE;
                            return new Pair<>(bool, bool);
                        }
                        Boolean bool2 = Boolean.TRUE;
                        return new Pair<>(bool2, bool2);
                    } catch (Throwable unused2) {
                        a("[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i11));
                        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            }
        } else {
            al.d("[Upload] Headers is empty.", new Object[0]);
        }
        al.c("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        a("[Upload] Failed to upload for no status header.");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                al.c(String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
            }
        }
        al.c("[Upload] Failed to upload for no status header.", new Object[0]);
        return new Pair<>(Boolean.FALSE, Boolean.TRUE);
    }
}
