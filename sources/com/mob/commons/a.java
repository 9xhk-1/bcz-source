package com.mob.commons;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40089a = false;

    private String c() {
        return i.a("016MhiBj9flgnfigeCnnZgefmfhUgTgnhi6jOfl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File d() {
        return ResHelper.getDataCacheFile(MobSDK.getContext(), j.f40348b);
    }

    private boolean e() {
        v a11 = v.a();
        String str = v.f40424a;
        long b11 = a11.b(str, -1L);
        if (b11 != -1) {
            return System.currentTimeMillis() >= b11 + (((Long) com.mob.commons.b.a(i.a("005j]fghhfhPg"), 2592000L)).longValue() * 1000);
        }
        v.a().a(str, System.currentTimeMillis());
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized String b() {
        String str;
        String str2 = null;
        Object[] objArr = 0;
        try {
            str = a();
            try {
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
                MobLog.getInstance().d(th);
                str = str2;
                return str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C0483a a11 = new b().a();
        if (a11 != null) {
            str2 = a11.c();
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(i.a("004j-fefg-j"), str2);
            a(hashMap);
            str = str2;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0156 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #2 {all -> 0x0152, blocks: (B:44:0x0104, B:46:0x010a, B:79:0x0149, B:53:0x0156), top: B:43:0x0104, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b A[Catch: all -> 0x0027, TryCatch #5 {all -> 0x0027, blocks: (B:3:0x0002, B:5:0x0018, B:6:0x002a, B:8:0x004f, B:19:0x0090, B:21:0x009a, B:24:0x00ad, B:26:0x00b3, B:42:0x0100, B:86:0x0161, B:88:0x016b, B:89:0x0174, B:95:0x01c6, B:97:0x01d0, B:99:0x01d6, B:100:0x01d9, B:106:0x01bf, B:108:0x01a9, B:111:0x015a, B:113:0x00f9, B:115:0x00e1, B:117:0x00c9, B:120:0x00a5, B:122:0x0089, B:124:0x006d, B:33:0x00d0, B:35:0x00da, B:44:0x0104, B:46:0x010a, B:79:0x0149, B:53:0x0156, B:23:0x009f, B:91:0x0196, B:38:0x00e8, B:40:0x00f2, B:28:0x00b8, B:30:0x00c2, B:15:0x0074, B:17:0x007e, B:10:0x0058, B:12:0x0062, B:94:0x01b0), top: B:2:0x0002, inners: #0, #2, #3, #6, #7, #8, #9, #10, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.util.HashMap<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.c(java.util.HashMap):void");
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final List<String> f40099a = Arrays.asList("4c5f81a0-4728-476f-a57f-b46fa44f07d3", "f6af99e2-2b64-4eb6-aba6-4d44fb935939", "00000000-0000-0000-0000-000000000000");

        /* renamed from: b, reason: collision with root package name */
        private static final List<String> f40100b = Arrays.asList("0", "867731020001006", "00000000", "012345678912345", "1152", "000000000000000");

        /* renamed from: c, reason: collision with root package name */
        private static final List<String> f40101c = Arrays.asList("D01EB0A014660Q99", "ZTEBA611T", "C1330", "ZTEBA610T", "28Y67IJ7T3", "HMN5S1FLOQ", "01234567890123456789", i.a("0077fefmflfmgehffm"), "1234567890ABCDEF", "SY58S62YHN", "ACKRZJFKSN", "ZTEBA910", "LenovoTAB2A8", "ZTEBA520", "0123456789ABCDEF", "ZTEBA510");

        /* renamed from: d, reason: collision with root package name */
        private static final List<String> f40102d = Arrays.asList("14:63:18:3D:AB:18", "00:81:df:d5:a6:a5", "080027C446C0", "08:00:27:a9:d5:97", "00:02:00:00:00:00", i.a("0175hgilCh2hghg4h?hghg5h_hghgYhNhghgNhLhghg"), "ff:ff:ff:ff:ff:ff", "00:81:3c:75:32:e1", "A6:C0:80:E4:1A:50", i.a("0171hghgPhGhghgRh]hghg?h7hghg0h@hghgDh,hghg"), "58:02:03:04:05:06", "00:90:4c:11:22:33", "08:00:27:b2:8b:50", "90:67:1c:e6:4d:55");

        /* renamed from: e, reason: collision with root package name */
        private static final List<String> f40103e = Arrays.asList("00000000-0000-0000-0000-000000000000", "00000000000000000000000000000000");

        /* renamed from: f, reason: collision with root package name */
        private List<String> f40104f;

        /* renamed from: g, reason: collision with root package name */
        private List<String> f40105g;

        /* renamed from: h, reason: collision with root package name */
        private List<String> f40106h;

        /* renamed from: i, reason: collision with root package name */
        private List<String> f40107i;

        /* renamed from: j, reason: collision with root package name */
        private List<String> f40108j;

        private b() {
        }

        private void c() {
            this.f40104f = f40099a;
            this.f40105g = f40100b;
            this.f40106h = f40101c;
            this.f40107i = f40102d;
            this.f40108j = f40103e;
            c e11 = MobSDK.SDK_VERSION_CODE + 30 >= d() ? v.a().e() : e();
            if (e11 != null) {
                if (e11.c() != null) {
                    this.f40104f = e11.c();
                }
                if (e11.d() != null) {
                    this.f40105g = e11.d();
                }
                if (e11.e() != null) {
                    this.f40106h = e11.e();
                }
                if (e11.f() != null) {
                    this.f40107i = e11.f();
                }
                if (e11.g() != null) {
                    this.f40108j = e11.g();
                }
            }
        }

        private int d() {
            try {
                return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return 0;
            }
        }

        private c e() {
            try {
                NetworkHelper networkHelper = new NetworkHelper();
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.connectionTimeout = 2000;
                networkTimeOut.readTimout = 5000;
                String httpPostNew = networkHelper.httpPostNew(com.mob.commons.c.a(com.mob.commons.c.f40223e) + "/getDuidBlacklist", null, null, networkTimeOut);
                HashMap fromJson = HashonHelper.fromJson(httpPostNew);
                if (fromJson != null && !fromJson.isEmpty()) {
                    if (!BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get(i.a("006;hiTfUfh3f>fehi"))))) {
                        throw new Throwable("RS is illegal: " + httpPostNew);
                    }
                    String valueOf = String.valueOf(fromJson.get(i.a("004jGfhWfDfh")));
                    if (!TextUtils.isEmpty(valueOf)) {
                        c a11 = c.a(Data.AES128Decode(f(), Base64.decode(valueOf, 0)));
                        v.a().a(a11);
                        return a11;
                    }
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
            return null;
        }

        private String f() {
            String[] strArr = {"QvxJJ", "FYsAX", "cvWe", "MqlWJL"};
            return strArr[1] + strArr[3] + new String[]{"akuRE", "wbMqR", "uBs", "CDpnc"}[3];
        }

        public C0483a a() {
            try {
                c();
                return b();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(25:2|3|(1:5)(1:79)|6|(1:8)|(1:10)(1:78)|11|(1:15)|(1:17)(1:77)|18|(1:22)|23|(12:25|(2:53|(2:58|(2:60|(2:62|63)(1:64))(3:65|(2:67|(1:69)(1:70))(2:71|(2:73|(1:75)))|63))(1:57))(1:29)|30|(1:52)(1:36)|37|38|39|(4:41|(1:43)|44|45)|49|(0)|44|45)|76|30|(1:32)|52|37|38|39|(0)|49|(0)|44|45) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x013d, code lost:
        
            com.mob.tools.MobLog.getInstance().d(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0133 A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #1 {all -> 0x013c, blocks: (B:39:0x012d, B:41:0x0133), top: B:38:0x012d, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0147 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0003, B:6:0x0037, B:8:0x003d, B:11:0x004f, B:13:0x0055, B:18:0x0066, B:20:0x006c, B:23:0x0075, B:25:0x0080, B:27:0x0086, B:30:0x00fa, B:32:0x0100, B:34:0x0106, B:37:0x010f, B:43:0x0147, B:44:0x0158, B:51:0x013d, B:53:0x0091, B:55:0x0097, B:58:0x00a0, B:60:0x00a6, B:62:0x00ac, B:65:0x00bf, B:67:0x00c5, B:69:0x00cb, B:71:0x00dd, B:73:0x00e3, B:75:0x00e9, B:77:0x0062, B:78:0x004b, B:79:0x0033, B:39:0x012d, B:41:0x0133), top: B:2:0x0003, inners: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.mob.commons.a.C0483a b() {
            /*
                Method dump skipped, instructions count: 383
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.b.b():com.mob.commons.a$a");
        }

        private String a(long j11) {
            String str = null;
            try {
                str = UUID.randomUUID().toString();
                return TextUtils.isEmpty(str) ? b(j11) : str;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return str;
            }
        }

        private String b(long j11) {
            DataOutputStream dataOutputStream;
            String str = null;
            try {
                try {
                    long nextLong = new SecureRandom().nextLong();
                    long currentTimeMillis = j11 + System.currentTimeMillis();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeLong(nextLong);
                        dataOutputStream.writeLong(currentTimeMillis);
                        str = Data.byteToHex(byteArrayOutputStream.toByteArray());
                        dataOutputStream.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            MobLog.getInstance().d(th);
                            if (dataOutputStream != null) {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            }
                            return str;
                        } catch (Throwable th3) {
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (Throwable th4) {
                                    MobLog.getInstance().d(th4);
                                }
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream = null;
                }
                dataOutputStream.close();
            } catch (Throwable th6) {
                MobLog.getInstance().d(th6);
            }
            return str;
        }
    }

    public synchronized String a() {
        String str;
        str = null;
        try {
            C0483a f11 = v.a().f();
            if (f11 != null && !TextUtils.isEmpty(f11.c())) {
                str = f11.c();
            } else {
                HashMap<String, Object> a11 = a(false);
                if (a11 != null) {
                    str = (String) a11.get(i.a("004jBfefg2j"));
                }
            }
        } finally {
            return str;
        }
        return str;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f40109a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f40110b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f40111c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f40112d;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f40113e;

        public c(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.f40109a = list;
            this.f40110b = list2;
            this.f40111c = list3;
            this.f40112d = list4;
            this.f40113e = list5;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x0007, B:8:0x0013, B:10:0x0017, B:12:0x002b, B:14:0x0033, B:16:0x0037, B:18:0x0047, B:20:0x004f, B:22:0x0053, B:24:0x0063, B:26:0x006b, B:28:0x006f, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:36:0x009b, B:39:0x0093, B:41:0x0097, B:43:0x0077, B:45:0x007b, B:47:0x005b, B:49:0x005f, B:51:0x003f, B:53:0x0043, B:55:0x0023, B:57:0x0027), top: B:5:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x0007, B:8:0x0013, B:10:0x0017, B:12:0x002b, B:14:0x0033, B:16:0x0037, B:18:0x0047, B:20:0x004f, B:22:0x0053, B:24:0x0063, B:26:0x006b, B:28:0x006f, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:36:0x009b, B:39:0x0093, B:41:0x0097, B:43:0x0077, B:45:0x007b, B:47:0x005b, B:49:0x005f, B:51:0x003f, B:53:0x0043, B:55:0x0023, B:57:0x0027), top: B:5:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x0007, B:8:0x0013, B:10:0x0017, B:12:0x002b, B:14:0x0033, B:16:0x0037, B:18:0x0047, B:20:0x004f, B:22:0x0053, B:24:0x0063, B:26:0x006b, B:28:0x006f, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:36:0x009b, B:39:0x0093, B:41:0x0097, B:43:0x0077, B:45:0x007b, B:47:0x005b, B:49:0x005f, B:51:0x003f, B:53:0x0043, B:55:0x0023, B:57:0x0027), top: B:5:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:6:0x0007, B:8:0x0013, B:10:0x0017, B:12:0x002b, B:14:0x0033, B:16:0x0037, B:18:0x0047, B:20:0x004f, B:22:0x0053, B:24:0x0063, B:26:0x006b, B:28:0x006f, B:30:0x007f, B:32:0x0087, B:34:0x008b, B:36:0x009b, B:39:0x0093, B:41:0x0097, B:43:0x0077, B:45:0x007b, B:47:0x005b, B:49:0x005f, B:51:0x003f, B:53:0x0043, B:55:0x0023, B:57:0x0027), top: B:5:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.mob.commons.a.c a(java.lang.String r8) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                r1 = 0
                if (r0 != 0) goto La8
                java.util.HashMap r8 = com.mob.tools.utils.HashonHelper.fromJson(r8)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r0 = "idfas"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L2a
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L23
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r3 = r0
                goto L2b
            L1f:
                r0 = move-exception
                r8 = r0
                goto La1
            L23:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L2a
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1f
                goto L1d
            L2a:
                r3 = r1
            L2b:
                java.lang.String r0 = "ieid"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L46
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L3f
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L1f
            L3d:
                r4 = r0
                goto L47
            L3f:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L46
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1f
                goto L3d
            L46:
                r4 = r1
            L47:
                java.lang.String r0 = "snid"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L62
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L5b
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L1f
            L59:
                r5 = r0
                goto L63
            L5b:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L62
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1f
                goto L59
            L62:
                r5 = r1
            L63:
                java.lang.String r0 = "mcid"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L7e
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L77
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L1f
            L75:
                r6 = r0
                goto L7f
            L77:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L7e
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1f
                goto L75
            L7e:
                r6 = r1
            L7f:
                java.lang.String r0 = "oiid"
                java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L1f
                if (r8 == 0) goto L9a
                boolean r0 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L93
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L1f
                java.util.List r8 = b(r8)     // Catch: java.lang.Throwable -> L1f
            L91:
                r7 = r8
                goto L9b
            L93:
                boolean r0 = r8 instanceof java.util.List     // Catch: java.lang.Throwable -> L1f
                if (r0 == 0) goto L9a
                java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L1f
                goto L91
            L9a:
                r7 = r1
            L9b:
                com.mob.commons.a$c r2 = new com.mob.commons.a$c     // Catch: java.lang.Throwable -> L1f
                r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
                return r2
            La1:
                com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
                r0.d(r8)
            La8:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.c.a(java.lang.String):com.mob.commons.a$c");
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("idfas", this.f40109a);
            hashMap.put("ieid", this.f40110b);
            hashMap.put("snid", this.f40111c);
            hashMap.put("mcid", this.f40112d);
            hashMap.put("oiid", this.f40113e);
            return hashMap;
        }

        public List<String> c() {
            return this.f40109a;
        }

        public List<String> d() {
            return this.f40110b;
        }

        public List<String> e() {
            return this.f40111c;
        }

        public List<String> f() {
            return this.f40112d;
        }

        public List<String> g() {
            return this.f40113e;
        }

        private static List<String> b(String str) {
            String[] split;
            ArrayList arrayList = new ArrayList();
            try {
                return (TextUtils.isEmpty(str) || (split = str.split(",")) == null || split.length <= 0) ? arrayList : new ArrayList(Arrays.asList(split));
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return arrayList;
            }
        }

        public String a() {
            return HashonHelper.fromHashMap(b());
        }
    }

    public void a(MobProduct mobProduct) {
        boolean z11;
        MobLog.getInstance().d("di init", new Object[0]);
        String a11 = a(e.f40315a);
        HashMap<String, Object> a12 = a(false);
        if (a11 != null) {
            a12.put(i.a("004jGfefg)j"), a11);
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = b(a12) || e();
        this.f40089a = z12;
        if (z12) {
            c(a12);
            z11 = true;
        }
        boolean z13 = a(a12, mobProduct) ? true : z11;
        if (this.f40089a) {
            a(a12, (String) a12.get(i.a("004jLfefg$j")));
        }
        if (z13) {
            a(a12);
        }
    }

    private boolean b(HashMap<String, Object> hashMap) {
        HashMap hashMap2;
        String str;
        boolean z11;
        if (hashMap != null && !hashMap.isEmpty() && (hashMap2 = (HashMap) hashMap.get(i.a("010jklTfgfi1k_gifmhjge"))) != null && !hashMap2.isEmpty()) {
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            Object obj = hashMap2.get("admt");
            try {
                str = deviceHelper.getAdvertisingID();
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                str = null;
            }
            if (str != null && !str.equals(obj)) {
                return true;
            }
            Object obj2 = hashMap2.get("ssnmt");
            String simSerialNumber = deviceHelper.getSimSerialNumber();
            if (simSerialNumber != null && !simSerialNumber.equals(obj2)) {
                return true;
            }
            Object obj3 = hashMap2.get("iemt");
            String imei = deviceHelper.getIMEI();
            if (imei != null && !imei.equals(obj3)) {
                return true;
            }
            Object obj4 = hashMap2.get("snmt");
            String serialno = deviceHelper.getSerialno();
            if (serialno != null && !serialno.equals(obj4)) {
                return true;
            }
            Object obj5 = hashMap2.get(i.a("005nIgeMjk9gf"));
            String model = deviceHelper.getModel();
            if (model != null && !model.equals(obj5)) {
                return true;
            }
            Object obj6 = hashMap2.get(i.a("007>hjfhfiKfXgefjfk"));
            String manufacturer = deviceHelper.getManufacturer();
            if (manufacturer != null && !manufacturer.equals(obj6)) {
                return true;
            }
            Object obj7 = hashMap2.get(i.a("007Ififhfjfjfg.k:fj"));
            String carrier = deviceHelper.getCarrier();
            if (carrier != null && !carrier.equals(obj7)) {
                return true;
            }
            Object obj8 = hashMap2.get("ismt");
            String imsi = deviceHelper.getIMSI();
            if (imsi != null && !imsi.equals(obj8)) {
                return true;
            }
            Object obj9 = hashMap2.get("ismtarr");
            String[] queryIMSI = deviceHelper.queryIMSI();
            if (queryIMSI != null && queryIMSI.length > 0) {
                if (obj9 == null) {
                    return true;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj9;
                    if (arrayList.size() != queryIMSI.length) {
                        return true;
                    }
                    int length = queryIMSI.length;
                    int i11 = 0;
                    boolean z12 = false;
                    while (i11 < length) {
                        String str2 = queryIMSI[i11];
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            if (str2.equals((String) it.next())) {
                                z11 = false;
                                break;
                            }
                        }
                        i11++;
                        z12 = z11;
                    }
                    if (z12) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            Object obj10 = hashMap2.get(i.a("006PhifkhiElkDfj"));
            String oSVersionName = deviceHelper.getOSVersionName();
            if (oSVersionName != null && !oSVersionName.equals(obj10)) {
                return true;
            }
            Object obj11 = hashMap2.get(i.a("0023fnLg"));
            boolean cx2 = deviceHelper.cx();
            if (obj11 != null && String.valueOf(cx2 ? 1 : 0).equals(String.valueOf(obj11))) {
                Object obj12 = hashMap2.get(i.a("007Ahefj@k*fhflUkj"));
                boolean isRooted = deviceHelper.isRooted();
                if ((obj12 == null && isRooted) || (obj12 != null && !String.valueOf(obj12).equals(String.valueOf(isRooted)))) {
                    return true;
                }
                Object obj13 = hashMap2.get(i.a("004FgefhfgPj"));
                String c11 = com.mob.commons.b.d.c(MobSDK.getContext());
                return (obj13 == null && !TextUtils.isEmpty(c11)) || !(obj13 == null || String.valueOf(obj13).equals(c11));
            }
        }
        return true;
    }

    /* renamed from: com.mob.commons.a$a, reason: collision with other inner class name */
    public static class C0483a {

        /* renamed from: a, reason: collision with root package name */
        private String f40092a;

        /* renamed from: b, reason: collision with root package name */
        private long f40093b;

        /* renamed from: c, reason: collision with root package name */
        private String f40094c;

        /* renamed from: d, reason: collision with root package name */
        private long f40095d;

        /* renamed from: e, reason: collision with root package name */
        private String f40096e;

        public C0483a(String str, long j11, String str2, long j12, String str3) {
            this.f40092a = str;
            this.f40093b = j11;
            this.f40094c = str2;
            this.f40095d = j12;
            this.f40096e = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004c A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:4:0x0006, B:6:0x0022, B:8:0x0026, B:9:0x003a, B:11:0x004c, B:13:0x0050, B:14:0x0058, B:16:0x005c, B:18:0x0064, B:22:0x002d, B:24:0x0031), top: B:3:0x0006 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.mob.commons.a.C0483a a(java.lang.String r9) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r9)
                if (r0 != 0) goto L7e
                java.util.HashMap r9 = com.mob.tools.utils.HashonHelper.fromJson(r9)     // Catch: java.lang.Throwable -> L75
                java.lang.String r0 = "004j>fefgOj"
                java.lang.String r0 = com.mob.commons.i.a(r0)     // Catch: java.lang.Throwable -> L75
                java.lang.Object r0 = r9.get(r0)     // Catch: java.lang.Throwable -> L75
                java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L75
                java.lang.String r0 = "gt"
                java.lang.Object r0 = r9.get(r0)     // Catch: java.lang.Throwable -> L75
                r3 = 0
                if (r0 == 0) goto L39
                boolean r1 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L2d
                java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L75
                long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L75
                goto L3a
            L2d:
                boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L75
                if (r1 == 0) goto L39
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L75
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L75
                long r0 = (long) r0     // Catch: java.lang.Throwable -> L75
                goto L3a
            L39:
                r0 = r3
            L3a:
                java.lang.String r5 = "genType"
                java.lang.Object r5 = r9.get(r5)     // Catch: java.lang.Throwable -> L75
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L75
                java.lang.String r6 = "expTime"
                java.lang.Object r6 = r9.get(r6)     // Catch: java.lang.Throwable -> L75
                if (r6 == 0) goto L56
                boolean r7 = r6 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L75
                if (r7 == 0) goto L58
                java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L75
                long r3 = r6.longValue()     // Catch: java.lang.Throwable -> L75
            L56:
                r6 = r3
                goto L64
            L58:
                boolean r7 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L75
                if (r7 == 0) goto L56
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L75
                int r3 = r6.intValue()     // Catch: java.lang.Throwable -> L75
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L75
                goto L56
            L64:
                java.lang.String r3 = "gp"
                java.lang.Object r9 = r9.get(r3)     // Catch: java.lang.Throwable -> L75
                java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L75
                r3 = r0
                com.mob.commons.a$a r1 = new com.mob.commons.a$a     // Catch: java.lang.Throwable -> L75
                r1.<init>(r2, r3, r5, r6, r8)     // Catch: java.lang.Throwable -> L75
                return r1
            L75:
                r0 = move-exception
                r9 = r0
                com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
                r0.d(r9)
            L7e:
                r9 = 0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.C0483a.a(java.lang.String):com.mob.commons.a$a");
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(i.a("004j,fefg9j"), this.f40092a);
            hashMap.put("gt", Long.valueOf(this.f40093b));
            hashMap.put("genType", this.f40094c);
            hashMap.put("expTime", Long.valueOf(this.f40095d));
            hashMap.put("gp", this.f40096e);
            return hashMap;
        }

        public String c() {
            return this.f40092a;
        }

        public long d() {
            return this.f40093b;
        }

        public String e() {
            return this.f40094c;
        }

        public long f() {
            return this.f40095d;
        }

        public String g() {
            return this.f40096e;
        }

        public String a() {
            try {
                return HashonHelper.fromHashMap(b());
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        public boolean a(long j11) {
            long j12 = this.f40095d;
            return j12 == 0 || j11 + (j12 * 1000) <= System.currentTimeMillis();
        }
    }

    private String a(String str) {
        C0483a a11;
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        if (!com.mob.commons.b.d()) {
            return null;
        }
        C0483a f11 = v.a().f();
        if (f11 != null && !f11.a(v.a().b("key_request_duid_time", 0L))) {
            return null;
        }
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(i.a("004gFgffh?f"), 1);
        hashMap.put("iemt", deviceHelper.getIMEI());
        hashMap.put("snmt", deviceHelper.getSerialno());
        hashMap.put(i.a("005nRgeGjkIgf"), deviceHelper.getModel());
        hashMap.put(i.a("007JhjfhfiBfCgefjfk"), deviceHelper.getManufacturer());
        hashMap.put("admt", deviceHelper.getAdvertisingID());
        hashMap.put("oamt", com.mob.commons.b.d.c(MobSDK.getContext()));
        hashMap.put("ismt", deviceHelper.getIMSI());
        hashMap.put("ssnmt", deviceHelper.getSimSerialNumber());
        hashMap.put("inpkgt", Long.valueOf(deviceHelper.getAppLastUpdateTime()));
        hashMap.put("btt", Long.valueOf(SystemClock.elapsedRealtime()));
        if (f11 == null) {
            hashMap.put(i.a("004jQfefgJj"), str);
            hashMap.put("genType", "common");
        } else {
            hashMap.put(i.a("004jSfefgGj"), f11.c());
            hashMap.put("gt", Long.valueOf(f11.d()));
            hashMap.put("genType", f11.e());
            hashMap.put("expTime", Long.valueOf(f11.f()));
            hashMap.put("gp", f11.g());
        }
        HashMap hashMap2 = (HashMap) new NetCommunicator(1024, "ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", "191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd").requestSynchronized(hashMap, com.mob.commons.c.a(com.mob.commons.c.f40223e) + "/v2/dgen", false);
        if (hashMap2 != null && (a11 = C0483a.a(HashonHelper.fromHashMap(hashMap2))) != null) {
            v.a().a(a11);
            return a11.c();
        }
        v.a().a("key_request_duid_time", System.currentTimeMillis());
        return null;
    }

    private boolean a(HashMap<String, Object> hashMap, MobProduct mobProduct) {
        if (mobProduct == null) {
            mobProduct = new MobProduct() { // from class: com.mob.commons.Authorizer$1
                @Override // com.mob.commons.MobProduct
                public String getProductTag() {
                    return i.a("006Xihhmijijhmgh");
                }

                @Override // com.mob.commons.MobProduct
                public int getSdkver() {
                    return MobSDK.SDK_VERSION_CODE;
                }
            };
        }
        boolean z11 = false;
        try {
            HashMap hashMap2 = (HashMap) hashMap.get(i.a("007;fhLggUgifmhjge"));
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(i.a("007Yfh8ggAgifmhjge"), hashMap2);
                z11 = true;
            }
            HashMap hashMap3 = (HashMap) hashMap2.get(DeviceHelper.getInstance(MobSDK.getContext()).getPackageName());
            String str = hashMap3 != null ? (String) hashMap3.get(mobProduct.getProductTag()) : null;
            String appkey = MobSDK.getAppkey();
            if (str == null || !str.equals(appkey)) {
                if (a(mobProduct, hashMap)) {
                    return true;
                }
            }
            return z11;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file, HashMap<String, Object> hashMap) {
        FileOutputStream fileOutputStream;
        try {
            byte[] a11 = a(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), hashMap);
            ResHelper.deleteFileAndFolder(file);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            FileChannel fileChannel = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileChannel = fileOutputStream.getChannel();
                    fileChannel.write(ByteBuffer.wrap(a11));
                    fileChannel.force(true);
                    r.a(fileChannel, fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    r.a(fileChannel, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            MobLog.getInstance().d(th4);
        }
    }

    private boolean a(MobProduct mobProduct, HashMap<String, Object> hashMap) throws Throwable {
        if (!com.mob.commons.b.d()) {
            return false;
        }
        DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(i.a("007gEfjgeLj<fefi4f"), mobProduct.getProductTag());
        C0483a f11 = v.a().f();
        String c11 = f11 != null ? f11.c() : null;
        String valueOf = String.valueOf(deviceHelper.getPackageName());
        hashMap2.put(i.a("006,fhYggEfl!k%fk"), MobSDK.getAppkey());
        hashMap2.put(i.a("004j)fefgJj"), c11);
        hashMap2.put(i.a("006Ifh3ggg4flhh"), valueOf);
        hashMap2.put(i.a("006PfhVgglk>fj"), String.valueOf(deviceHelper.getAppVersion()));
        hashMap2.put(i.a("006%hi,j(fl lk8fj"), String.valueOf(mobProduct.getSdkver()));
        hashMap2.put(i.a("007Zfm'kf%hfgefjfl"), String.valueOf(deviceHelper.getDetailNetworkTypeForStatic()));
        String str = com.mob.commons.c.a(com.mob.commons.c.f40223e) + i.a("006ij7hifghhfm");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put(i.a("013MgghiZkRfjjkgi7jk'fm)f1fg:f^fk"), u.c());
        hashMap3.put(i.a("004nTgefg$j"), com.mob.commons.b.d.d(MobSDK.getContext()));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 10000;
        networkTimeOut.connectionTimeout = 10000;
        HashMap fromJson = HashonHelper.fromJson(new NetworkHelper().httpPostNew(str, hashMap2, hashMap3, networkTimeOut));
        if (i.a("004fWfjfe@k").equals(String.valueOf(fromJson.get(i.a("004=fjNkAfe3g"))))) {
            this.f40089a = true;
        }
        if (!BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get(i.a("006Bhi+f+fh0fGfehi"))))) {
            return false;
        }
        HashMap hashMap4 = (HashMap) hashMap.get(i.a("007<fhXggYgifmhjge"));
        HashMap hashMap5 = (HashMap) hashMap4.get(valueOf);
        if (hashMap5 == null) {
            hashMap5 = new HashMap();
        }
        hashMap5.put(mobProduct.getProductTag(), MobSDK.getAppkey());
        hashMap4.put(valueOf, hashMap5);
        hashMap.put(i.a("007 fhJgg gifmhjge"), hashMap4);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static HashMap<String, Object> b(File file) {
        FileChannel fileChannel;
        if (file.exists()) {
            FileChannel fileChannel2 = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileChannel2 = fileInputStream.getChannel();
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel2.size());
                    while (fileChannel2.read(allocate) > 0) {
                    }
                    HashMap<String, Object> a11 = a(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), allocate.array());
                    r.a(fileChannel2, fileInputStream);
                    return a11;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = fileChannel2;
                    fileChannel2 = fileInputStream;
                    try {
                        MobLog.getInstance().d(th);
                        r.a(fileChannel, fileChannel2);
                        return new HashMap<>();
                    } catch (Throwable th3) {
                        r.a(fileChannel, fileChannel2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
            }
        }
        return new HashMap<>();
    }

    private void a(HashMap<String, Object> hashMap, String str) {
        try {
            if (com.mob.commons.b.d()) {
                c(hashMap);
                HashMap hashMap2 = (HashMap) hashMap.get(i.a("010jklAfgfi-k+gifmhjge"));
                HashMap hashMap3 = new HashMap();
                hashMap3.put(i.a("005f_geflMk2fm"), w.a().b());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    hashMap3.put(entry.getKey(), entry.getValue());
                }
                try {
                    hashMap3.put(i.a("007Efifhfjfjfg$kEfj"), Integer.valueOf(Integer.parseInt(String.valueOf(hashMap3.get(i.a("0079fifhfjfjfg;k4fj"))))));
                } catch (Throwable unused) {
                }
                DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
                hashMap3.put(i.a("004j?fefgAj"), str);
                String[] queryIMEI = deviceHelper.queryIMEI();
                if (queryIMEI != null && queryIMEI.length > 0) {
                    hashMap3.put("iemtarr", queryIMEI);
                }
                HashMap<String, Long> memoryInfo = deviceHelper.getMemoryInfo();
                HashMap<String, HashMap<String, Long>> sizeInfo = deviceHelper.getSizeInfo();
                if (memoryInfo != null) {
                    hashMap3.put(i.a("003GfjfhXn"), memoryInfo.get(i.a("005fGge'fZfhgf")));
                }
                if (sizeInfo != null) {
                    HashMap<String, Long> hashMap4 = sizeInfo.get(i.a("006[hiTjQfifhfjJj"));
                    if (hashMap4 != null) {
                        hashMap3.put(i.a("0131hi j*fifhfj$jPgjCfXgefjfhhhCk"), hashMap4.get(i.a("005f7ge1fAfhgf")));
                    }
                    HashMap<String, Long> hashMap5 = sizeInfo.get(i.a("004jLfhYfEfh"));
                    if (hashMap5 != null) {
                        hashMap3.put(i.a("011jFfh.f!fhgj-f]gefjfhhhQk"), hashMap5.get(i.a("005fUge fGfhgf")));
                    }
                }
                hashMap3.put(i.a("006[fjge n[giXn@hh"), deviceHelper.getMIUIVersion());
                if (TextUtils.isEmpty((String) hashMap3.get("iemt"))) {
                    hashMap3.put("iemt", com.mob.tools.a.c.a(MobSDK.getContext()).a().a(true));
                }
                if (TextUtils.isEmpty((String) hashMap3.get("ismt"))) {
                    hashMap3.put("ismt", com.mob.tools.a.c.a(MobSDK.getContext()).a().b(true));
                }
                String encodeToString = Base64.encodeToString(Data.AES128Encode(c(), HashonHelper.fromHashMap(hashMap3)), 2);
                HashMap<String, Object> hashMap6 = new HashMap<>();
                hashMap6.put("m", encodeToString);
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 30000;
                networkTimeOut.connectionTimeout = 30000;
                NetworkHelper networkHelper = new NetworkHelper();
                String str2 = com.mob.commons.c.a(com.mob.commons.c.f40223e) + i.a("006ij4fgfmhjge");
                HashMap<String, String> hashMap7 = new HashMap<>();
                hashMap7.put(i.a("013Cgghi,k?fjjkgiGjk_fm<fYfg-fXfk"), u.c());
                hashMap7.put(i.a("004nMgefgRj"), com.mob.commons.b.d.d(MobSDK.getContext()));
                if (BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(HashonHelper.fromJson(networkHelper.httpPostNew(str2, hashMap6, hashMap7, networkTimeOut)).get(i.a("006Yhi,f3fh6f7fehi"))))) {
                    v.a().a(v.f40424a, System.currentTimeMillis());
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private HashMap<String, Object> a(boolean z11) {
        File d11;
        try {
            if (z11) {
                d11 = ResHelper.getCacheRootFile(MobSDK.getContext(), j.f40348b);
            } else {
                d11 = d();
            }
            return a(d11);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    private void a(final HashMap<String, Object> hashMap) {
        l.a(l.a(l.f40357c), new k() { // from class: com.mob.commons.a.1
            @Override // com.mob.commons.k
            public boolean a(FileLocker fileLocker) {
                try {
                    a.b(a.this.d(), hashMap);
                    return false;
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return false;
                }
            }
        });
    }

    private HashMap<String, Object> a(File file) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        HashMap<String, Object> hashMap = null;
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    hashMap = (HashMap) objectInputStream.readObject();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                objectInputStream = null;
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
            objectInputStream = null;
        }
        if (hashMap != null) {
            try {
            } catch (Throwable th2) {
                try {
                    MobLog.getInstance().w(th2);
                    r.a(fileInputStream, objectInputStream);
                } catch (Throwable th3) {
                    r.a(fileInputStream, objectInputStream);
                    throw th3;
                }
            }
            if (!hashMap.isEmpty() && hashMap.keySet().contains(i.a("004j8fefg;j"))) {
                file.delete();
                b(d(), hashMap);
                r.a(fileInputStream, objectInputStream);
                return hashMap;
            }
        }
        hashMap = b(file);
        r.a(fileInputStream, objectInputStream);
        return hashMap;
    }

    private static byte[] a(String str, HashMap<String, Object> hashMap) {
        String fromHashMap = HashonHelper.fromHashMap(hashMap);
        try {
            return Data.AES128Encode(str, fromHashMap);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return fromHashMap.getBytes();
        }
    }

    private static HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new HashMap<>();
        }
    }
}
