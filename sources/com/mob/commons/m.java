package com.mob.commons;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.a;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f40366a = false;

    /* renamed from: b, reason: collision with root package name */
    private static m f40367b;

    /* renamed from: c, reason: collision with root package name */
    private File f40368c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f40369d;

    /* renamed from: e, reason: collision with root package name */
    private BigInteger f40370e;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private static final a[] f40373a = new a[2];

        /* renamed from: b, reason: collision with root package name */
        private int f40374b;

        /* renamed from: c, reason: collision with root package name */
        private int f40375c;

        /* renamed from: d, reason: collision with root package name */
        private String f40376d;

        /* renamed from: e, reason: collision with root package name */
        private String f40377e;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b() {
            a[] aVarArr = f40373a;
            synchronized (aVarArr) {
                for (int i11 = 0; i11 < 2; i11++) {
                    try {
                        a aVar = aVarArr[i11];
                        if (aVar != null) {
                            aVarArr[i11] = null;
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new a();
            }
        }

        private void c() {
            try {
                a[] aVarArr = f40373a;
                synchronized (aVarArr) {
                    for (int i11 = 0; i11 < 2; i11++) {
                        try {
                            if (aVarArr[i11] == null) {
                                aVarArr[i11] = this;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b(this.f40374b, this.f40375c, this.f40376d, this.f40377e);
            } catch (Throwable th2) {
                try {
                    MobLog.getInstance().w(th2);
                } finally {
                    c();
                }
            }
        }

        public a a(int i11, int i12, String str, String str2) {
            this.f40374b = i11;
            this.f40375c = i12;
            this.f40376d = str;
            this.f40377e = str2;
            return this;
        }

        private void b(final int i11, final int i12, final String str, final String str2) {
            if (m.a().a(new com.mob.tools.utils.d() { // from class: com.mob.commons.m.a.1
                @Override // com.mob.tools.utils.d
                public void a() {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put(j.a("010JdeNf bhec1gEbfdebccabi"), Integer.valueOf(i11));
                        hashMap.put(j.a("0068de:f=bhcgbddd"), str);
                        hashMap.put(j.a("004bPbg%cg"), Integer.valueOf(i12));
                        hashMap.put(j.a("005g(bfbfbdEb"), Long.valueOf(System.currentTimeMillis()));
                        hashMap.put(j.a("003j dedd"), Base64.encodeToString(str2.getBytes("utf-8"), 2));
                        hashMap.put(j.a("005bFbc0jgQde"), 1);
                        m.b(i12).a(HashonHelper.fromHashMap(hashMap));
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
            })) {
                c.b().run();
            }
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private static final c[] f40386a = new c[2];

        /* renamed from: b, reason: collision with root package name */
        private Runnable f40387b = new com.mob.tools.utils.d() { // from class: com.mob.commons.m.c.1
            @Override // com.mob.tools.utils.d
            public void a() {
                m.b(1).a(new b());
            }
        };

        /* renamed from: c, reason: collision with root package name */
        private Runnable f40388c = new com.mob.tools.utils.d() { // from class: com.mob.commons.m.c.2
            @Override // com.mob.tools.utils.d
            public void a() {
                m.b(2).a(new b());
            }
        };

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b() {
            c[] cVarArr = f40386a;
            synchronized (cVarArr) {
                for (int i11 = 0; i11 < 2; i11++) {
                    try {
                        c cVar = cVarArr[i11];
                        if (cVar != null) {
                            cVarArr[i11] = null;
                            return cVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new c();
            }
        }

        private void c() {
            try {
                c[] cVarArr = f40386a;
                synchronized (cVarArr) {
                    for (int i11 = 0; i11 < 2; i11++) {
                        try {
                            if (cVarArr[i11] == null) {
                                cVarArr[i11] = this;
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mob.commons.b.d()) {
                    if (j.a("004%bicabi2g").equals(DeviceHelper.getInstance(MobSDK.getContext()).getDetailNetworkTypeForStatic())) {
                        return;
                    }
                    if (((Integer) com.mob.commons.b.a(j.a("004EbeVgMbfbf"), 1)).intValue() == 1) {
                        m.a().a(this.f40387b);
                    } else {
                        m.b(1).a(((Long) com.mob.commons.b.a("cerr_max", Long.valueOf(gi.e.f53744c))).longValue());
                    }
                    if (((Integer) com.mob.commons.b.a(j.a("004Sde*gXbfbf"), 0)).intValue() == 1) {
                        m.a().a(this.f40388c);
                    } else {
                        m.b(2).a(((Long) com.mob.commons.b.a("serr_max", 20971520L)).longValue());
                    }
                }
            } catch (Throwable th2) {
                try {
                    MobLog.getInstance().w(th2);
                } finally {
                    c();
                }
            }
        }
    }

    private m() {
    }

    private byte[] c() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            try {
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.setSeed(System.currentTimeMillis());
                dataOutputStream2.writeLong(secureRandom.nextLong());
                dataOutputStream2.writeLong(secureRandom.nextLong());
                dataOutputStream2.flush();
                r.a(dataOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                r.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void b() {
        t.f40414c.execute(c.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mob.tools.a b(int i11) {
        return new com.mob.tools.a(j.a("005@cjQj]becbdd"), j.a("005@cjQj]becbdd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i11, 50);
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f40367b == null) {
                    f40367b = new m();
                }
                mVar = f40367b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    public static class b implements a.InterfaceC0492a {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<HashMap<String, Object>> f40383a;

        /* renamed from: b, reason: collision with root package name */
        int f40384b;

        /* renamed from: c, reason: collision with root package name */
        String f40385c;

        private b() {
            this.f40383a = new ArrayList<>();
            this.f40384b = -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String b(String str) throws Throwable {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th2;
            byte[] bArr;
            GZIPOutputStream gZIPOutputStream;
            Throwable th3;
            try {
                bArr = str.getBytes();
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = byteArrayInputStream.read(bArr2, 0, 1024);
                                    if (read != -1) {
                                        gZIPOutputStream.write(bArr2, 0, read);
                                    } else {
                                        try {
                                            break;
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                gZIPOutputStream.flush();
                                r.a(gZIPOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.flush();
                                String encodeToString = Base64.encodeToString(byteArray, 2);
                                r.a(byteArrayOutputStream, byteArrayInputStream);
                                return encodeToString;
                            } catch (Throwable th4) {
                                th3 = th4;
                                r.a(gZIPOutputStream);
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            gZIPOutputStream = null;
                            th3 = th5;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        bArr = null;
                        r.a(bArr, byteArrayInputStream);
                        throw th2;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    r.a(bArr, byteArrayInputStream);
                    throw th2;
                }
            } catch (Throwable th8) {
                byteArrayInputStream = null;
                th2 = th8;
                bArr = null;
            }
        }

        @Override // com.mob.tools.a.InterfaceC0492a
        public void a(String str) {
            HashMap<String, Object> fromJson = HashonHelper.fromJson(str);
            try {
                this.f40384b = Integer.parseInt(String.valueOf(fromJson.get(j.a("010 de3fIbhec;gAbfdebccabi"))));
            } catch (Throwable unused) {
            }
            this.f40385c = (String) fromJson.get(j.a("006'deUf3bhcgbddd"));
            this.f40383a.add(fromJson);
        }

        @Override // com.mob.tools.a.InterfaceC0492a
        public boolean a() {
            HashMap<String, Object> a11 = a(this.f40384b, this.f40385c);
            a11.put(j.a("006g$bfbf-jMdedd"), this.f40383a);
            try {
                String fromHashMap = HashonHelper.fromHashMap(a11);
                this.f40383a.clear();
                String b11 = b(fromHashMap);
                if (!j.a("004Fbicabi5g").equals(DeviceHelper.getInstance(MobSDK.getContext()).getDetailNetworkTypeForStatic())) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("m", b11);
                    NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                    networkTimeOut.readTimout = 10000;
                    networkTimeOut.connectionTimeout = 10000;
                    String str = com.mob.commons.c.a(com.mob.commons.c.f40222d) + "/errlog";
                    MobLog.getInstance().d(String.format("Response(%s): %s", str, new NetworkHelper().httpPostNew(str, hashMap, null, networkTimeOut)), new Object[0]);
                    return true;
                }
                throw new IllegalStateException("network is disconnected!");
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return false;
            }
        }

        private HashMap<String, Object> a(int i11, String str) {
            HashMap<String, Object> hashMap = new HashMap<>();
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            hashMap.put(j.a("003(bhAgJbg"), MobSDK.getAppkey());
            hashMap.put(j.a("004cMcbbdTb"), Integer.valueOf(deviceHelper.getPlatformCode()));
            hashMap.put(j.a("003RdeHfJbh"), str);
            hashMap.put(j.a("006+de8fTbh hg bf"), Integer.valueOf(i11));
            hashMap.put(j.a("007*bd]cc3bibd5jg"), deviceHelper.getAppName());
            hashMap.put(j.a("006Jbd4ccc'bhdd"), deviceHelper.getPackageName());
            hashMap.put(j.a("006Xbd3cchgFbf"), String.valueOf(deviceHelper.getAppVersion()));
            hashMap.put(j.a("005j=ca[fgQcb"), deviceHelper.getModel());
            if (com.mob.commons.b.c()) {
                hashMap.put(j.a("008fgh,bcbe5gZbcBf"), deviceHelper.getDeviceKey());
                hashMap.put(j.a("004'ba-f;bc:f"), deviceHelper.getDeviceId());
            }
            hashMap.put(j.a("006)debgde-hgQbf"), String.valueOf(deviceHelper.getOSVersionInt()));
            hashMap.put(j.a("011Lbi.gbIdbcabfbhEbDbg!cg"), deviceHelper.getDetailNetworkTypeForStatic());
            return hashMap;
        }
    }

    public void a(int i11, String str, int i12, String str2) {
        t.f40414c.execute(a.b().a(i12, i11, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final Runnable runnable) {
        if (this.f40368c == null) {
            File file = new File(MobSDK.getContext().getFilesDir(), j.a("005*cjcbcabebh"));
            this.f40368c = file;
            if (!file.exists()) {
                try {
                    this.f40368c.createNewFile();
                } catch (Throwable unused) {
                }
            }
        }
        return l.a(this.f40368c, new k() { // from class: com.mob.commons.m.1
            @Override // com.mob.commons.k
            public boolean a(FileLocker fileLocker) {
                try {
                    runnable.run();
                    return false;
                } catch (Throwable th2) {
                    MobLog.getInstance().i(th2);
                    return false;
                }
            }
        });
    }

    public int a(int i11, String str) {
        if (MobSDK.getContextSafely() == null || !f40366a) {
            return 0;
        }
        try {
            Intent intent = new Intent();
            intent.setPackage(j.a("0158bebicjde0a7bdbf=g2de^f*bhcjcbcadd"));
            intent.putExtra(j.a("007c6bdbebhbddd(g"), MobSDK.getContext().getPackageName());
            intent.putExtra(j.a("008cZbfbccabfbc!b+bg"), i11);
            intent.putExtra("ver", MobSDK.SDK_VERSION_CODE);
            intent.putExtra(j.a("003j_dedd"), a(str));
            MobSDK.getContextSafely().sendBroadcast(intent);
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private String a(String str) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (this.f40369d == null) {
                this.f40369d = new BigInteger("f53c224aefb38daa0825c1b8ea691b16d2e16db10880548afddd780c6670a091a11dafa954ea4a9483797fda1045d2693a08daa48cf9cedce1e8733b857304cb", 16);
                this.f40370e = new BigInteger("27749621e6ca022469645faed16e8261acf6af822467382d55c24bb9bc02356ab16e76ddc799dc8ba6b4f110411996eeb63505c9dcf969d3fc085d712f0f1a9713b67aa1128d7cc41bda363afb0ec7ade60e542a4e22869395331cc0096de412034551e98bb2629ae1b7168b8bc82006d064ab335d8567283e70beb6a49e9423", 16);
            }
            byte[] c11 = c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
            try {
                byte[] encode = new MobRSA(1024).encode(c11, this.f40369d, this.f40370e);
                dataOutputStream.writeInt(encode.length);
                dataOutputStream.write(encode);
                byte[] AES128Encode = Data.AES128Encode(c11, str.getBytes("utf-8"));
                dataOutputStream.writeInt(AES128Encode.length);
                dataOutputStream.write(AES128Encode);
                dataOutputStream.flush();
                r.a(dataOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            } catch (Throwable th3) {
                th = th3;
                r.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            MobLog.getInstance().d(th4);
            return null;
        }
    }
}
