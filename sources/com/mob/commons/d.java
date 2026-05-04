package com.mob.commons;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.SQLiteHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import org.junit.jupiter.api.j2;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f40302a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile SQLiteHelper.SingleTableDB f40303b;

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private static final b[] f40310a = new b[3];

        /* renamed from: b, reason: collision with root package name */
        private long f40311b;

        /* renamed from: c, reason: collision with root package name */
        private HashMap<String, Object> f40312c;

        private b(long j11, HashMap<String, Object> hashMap) {
            this.f40311b = j11;
            this.f40312c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                l.a(l.a(l.f40356b), new k() { // from class: com.mob.commons.d.b.1
                    @Override // com.mob.commons.k
                    public boolean a(FileLocker fileLocker) {
                        c b11;
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(o.a("004d+deJli"), String.valueOf(b.this.f40311b));
                            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
                            if (b.this.f40312c != null) {
                                b.this.f40312c.put(o.a("0068df ee6dj%iDdi"), MobSDK.getAppkey());
                                b.this.f40312c.put(o.a("0068dfLeeeOdjff"), deviceHelper.getPackageName());
                                b.this.f40312c.put(o.a("006Sdf5eeji^dh"), deviceHelper.getAppVersionName());
                                Long l11 = (Long) com.mob.commons.b.a(o.a("010EfgWdRdhdfWdiLffdieg h"), 0L);
                                if (l11.longValue() != 0) {
                                    b.this.f40312c.put(o.a("010?fg2d@dhdfRdiSffdiegGh"), l11);
                                }
                            }
                            contentValues.put(o.a("004h9df0d6df"), Base64.encodeToString(Data.AES128Encode(Data.rawMD5(deviceHelper.getManufacturer()), HashonHelper.fromHashMap(b.this.f40312c).getBytes("utf-8")), 2));
                            SQLiteHelper.insert(d.f40303b, contentValues);
                            long longValue = ((Long) com.mob.commons.b.a(o.a("004hi(dcUe"), 2L)).longValue();
                            String networkType = deviceHelper.getNetworkType();
                            if (networkType == null || o.a("004-dkecdkTi").equals(networkType)) {
                                longValue = 120;
                            }
                            if (!com.mob.commons.b.d() || (b11 = c.b()) == null) {
                                return false;
                            }
                            if (longValue <= 0) {
                                b11.run();
                                return false;
                            }
                            if (com.mob.commons.a.l.a().a(longValue, b11)) {
                                return false;
                            }
                            b11.c();
                            return false;
                        } catch (Throwable th2) {
                            MobLog.getInstance().w(th2);
                            return false;
                        }
                    }
                });
            } catch (Throwable th2) {
                try {
                    MobLog.getInstance().d(th2);
                } finally {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(long j11, HashMap<String, Object> hashMap) {
            b[] bVarArr = f40310a;
            synchronized (bVarArr) {
                for (int i11 = 0; i11 < 3; i11++) {
                    try {
                        b bVar = bVarArr[i11];
                        if (bVar != null) {
                            bVar.f40311b = j11;
                            HashMap<String, Object> hashMap2 = bVar.f40312c;
                            if (hashMap2 != null) {
                                hashMap2.clear();
                            }
                            bVar.f40312c = hashMap;
                            bVarArr[i11] = null;
                            return bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new b(j11, hashMap);
            }
        }

        private void a() {
            try {
                b[] bVarArr = f40310a;
                synchronized (bVarArr) {
                    for (int i11 = 0; i11 < 3; i11++) {
                        try {
                            if (bVarArr[i11] == null) {
                                this.f40311b = 0L;
                                HashMap<String, Object> hashMap = this.f40312c;
                                if (hashMap != null) {
                                    hashMap.clear();
                                }
                                this.f40312c = null;
                                bVarArr[i11] = this;
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
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private static final c[] f40314a = {new c()};

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b() {
            c[] cVarArr = f40314a;
            synchronized (cVarArr) {
                try {
                    c cVar = cVarArr[0];
                    if (cVar == null) {
                        return null;
                    }
                    cVarArr[0] = null;
                    return cVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            try {
                c[] cVarArr = f40314a;
                synchronized (cVarArr) {
                    try {
                        if (cVarArr[0] == null) {
                            cVarArr[0] = this;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String[][] strArr = new String[50][];
                int a11 = a(strArr);
                while (a11 > 0) {
                    SparseArray<String> a12 = a(strArr, a11);
                    if (a12 == null) {
                        break;
                    }
                    if (a12.size() > 0) {
                        a(a12);
                    }
                    if (a11 < 50) {
                        break;
                    } else {
                        a11 = a(strArr);
                    }
                }
            } catch (Throwable th2) {
                try {
                    MobLog.getInstance().d(th2);
                } finally {
                    c();
                }
            }
        }

        private int a(String[][] strArr) {
            long j11;
            int i11 = 0;
            Cursor cursor = null;
            try {
                cursor = SQLiteHelper.query(d.f40303b, new String[]{o.a("004d;de'li"), o.a("004hXdf]dAdf")}, null, null, null);
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return 0;
                }
                if (!cursor.moveToFirst()) {
                    try {
                        cursor.close();
                    } catch (Throwable unused2) {
                    }
                    return 0;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i12 = 0;
                try {
                    do {
                        try {
                            String[] strArr2 = {cursor.getString(0), cursor.getString(1)};
                            try {
                                j11 = Long.parseLong(strArr2[0]);
                            } catch (Throwable unused3) {
                                j11 = -1;
                            }
                            if (j11 <= currentTimeMillis) {
                                strArr[i12] = strArr2;
                                i12++;
                            }
                            if (i12 < strArr.length) {
                            }
                            cursor.close();
                            return i12;
                        } catch (Throwable th2) {
                            th = th2;
                            i11 = i12;
                            try {
                                MobLog.getInstance().w(th);
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                return i11;
                            } catch (Throwable th3) {
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                throw th3;
                            }
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return i12;
                } catch (Throwable unused6) {
                    return i12;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        private int a(SparseArray<String> sparseArray) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (sb2.length() > 0) {
                        sb2.append(j2.O);
                    }
                    sb2.append('\'');
                    sb2.append(sparseArray.valueAt(i11));
                    sb2.append('\'');
                }
                try {
                    return SQLiteHelper.delete(d.f40303b, "time in (" + sb2.toString() + pn.j.f81007d, null);
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return SQLiteHelper.delete(d.f40303b, "time in (" + sb2.toString() + pn.j.f81007d, null);
                }
            } catch (Throwable th3) {
                MobLog.getInstance().w(th3);
                return 0;
            }
        }

        private SparseArray<String> a(String[][] strArr, int i11) {
            try {
                SparseArray<String> sparseArray = new SparseArray<>();
                HashMap hashMap = new HashMap();
                DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
                hashMap.put(o.a("004e*eddfId"), Integer.valueOf(deviceHelper.getPlatformCode()));
                hashMap.put(o.a("006hij(dedgNi"), deviceHelper.getDeviceKey());
                hashMap.put(o.a("005l ecDhi0ed"), deviceHelper.getModel());
                hashMap.put(o.a("004h-dcdeIh"), e.a((MobProduct) null));
                hashMap.put("iemt", deviceHelper.getIMEI());
                hashMap.put("snmt", deviceHelper.getSerialno());
                hashMap.put(o.a("011]dkYid%fdecdhdj!dSdi-ei"), deviceHelper.getDetailNetworkTypeForStatic());
                hashMap.put(o.a("015h0dfTd4dfef+id4fdecdhdjeidiJei"), Integer.valueOf(deviceHelper.getDataNtType()));
                ArrayList arrayList = new ArrayList();
                byte[] rawMD5 = Data.rawMD5(deviceHelper.getManufacturer());
                for (int i12 = 0; i12 < i11; i12++) {
                    String[] strArr2 = strArr[i12];
                    try {
                        HashMap fromJson = HashonHelper.fromJson(new String(Data.AES128Decode(rawMD5, Base64.decode(strArr2[1], 2)), "utf-8").trim());
                        sparseArray.put(i12, strArr2[0]);
                        arrayList.add(fromJson);
                    } catch (Throwable th2) {
                        MobLog.getInstance().w(th2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new SparseArray<>();
                }
                hashMap.put(o.a("005hYdf:d=dffg"), arrayList);
                hashMap.put(o.a("005d0ecdjLi6dk"), w.a().b());
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put(o.a("013%eefgYi2dhhiegEhiNdk-dZdeBdSdi"), u.c());
                hashMap2.put(o.a("004l1ecde1h"), com.mob.commons.b.d.d(MobSDK.getContext()));
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 30000;
                networkTimeOut.connectionTimeout = 30000;
                if (BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(HashonHelper.fromJson(new NetworkHelper().httpPostWithBytes(com.mob.commons.c.a(com.mob.commons.c.f40221c) + "/v6/gcl", a(HashonHelper.fromHashMap(hashMap)), hashMap2, networkTimeOut)).get(o.a("006!fgCd[df_d dcfg"))))) {
                    return sparseArray;
                }
                return null;
            } catch (Throwable th3) {
                MobLog.getInstance().w(th3);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static byte[] a(String str) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = null;
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                try {
                    SecureRandom secureRandom = new SecureRandom();
                    dataOutputStream2.writeLong(secureRandom.nextLong());
                    dataOutputStream2.writeLong(secureRandom.nextLong());
                    dataOutputStream2.flush();
                    r.a(dataOutputStream2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(byteArrayOutputStream2));
                        try {
                            bufferedOutputStream.write(str.getBytes("utf-8"));
                            bufferedOutputStream.flush();
                            r.a(bufferedOutputStream);
                            byte[] AES128Encode = Data.AES128Encode(byteArray, byteArrayOutputStream2.toByteArray());
                            byte[] encode = new MobRSA(1024).encode(byteArray, new BigInteger("ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", 16), new BigInteger("191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", 16));
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                            try {
                                DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream3);
                                try {
                                    dataOutputStream3.writeInt(encode.length);
                                    dataOutputStream3.write(encode);
                                    dataOutputStream3.writeInt(AES128Encode.length);
                                    dataOutputStream3.write(AES128Encode);
                                    dataOutputStream3.flush();
                                    r.a(dataOutputStream3);
                                    return byteArrayOutputStream3.toByteArray();
                                } catch (Throwable th2) {
                                    th = th2;
                                    dataOutputStream2 = dataOutputStream3;
                                    r.a(dataOutputStream2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            dataOutputStream = bufferedOutputStream;
                            r.a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    dataOutputStream = dataOutputStream2;
                    r.a(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    private d() {
        try {
            Context context = MobSDK.getContext();
            String str = j.f40347a;
            File dataCacheFile = ResHelper.getDataCacheFile(context, str);
            if (dataCacheFile.exists() && dataCacheFile.length() > 209715200) {
                dataCacheFile.delete();
                dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str);
            }
            f40303b = SQLiteHelper.getDatabase(dataCacheFile.getAbsolutePath(), o.a("008Sfidf[d7dfhc$iUdf>e") + "_1");
            f40303b.addField(o.a("004dTde,li"), o.a("004di=dl0d"), true);
            f40303b.addField(o.a("004hRdf+dAdf"), o.a("004di[dl%d"), true);
            c b11 = c.b();
            if (b11 != null) {
                t.f40415d.execute(b11);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f40302a == null) {
                    f40302a = new d();
                }
                dVar = f40302a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0109 -> B:36:0x00fc). Please report as a decompilation issue!!! */
    private static File b(Object... objArr) throws Throwable {
        int i11;
        InputStream inputStream;
        File file;
        FileOutputStream fileOutputStream;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[4];
        String str4 = (String) objArr[5];
        InputStream inputStream2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            File file2 = new File(MobSDK.getContext().getFilesDir(), o.a("003Cfgdgdg"));
            byte[] bArr = (byte[]) objArr[2];
            try {
                i11 = Integer.parseInt(String.valueOf(objArr[3]));
            } catch (Throwable unused) {
                i11 = 0;
            }
            if (bArr == null || i11 <= 0 || bArr.length < i11 || !str.equals(Data.MD5(bArr, 0, i11))) {
                File file3 = new File(file2, o.a("008,dgecdkfhelfgdgdg"));
                if (file3.exists() && str.equals(Data.MD5(file3))) {
                    inputStream = new FileInputStream(file3);
                } else {
                    f.a().a(20);
                    file3.delete();
                    inputStream = null;
                }
            } else {
                inputStream = new ByteArrayInputStream(bArr, 0, i11);
            }
            if (inputStream != null) {
                try {
                    file = new File(file2, String.valueOf(System.currentTimeMillis()));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file4 = new File(file, file.getName() + o.a("004QelfldeIe"));
                    try {
                        fileOutputStream = new FileOutputStream(file4);
                        try {
                            Data.AES128Decode(str2, inputStream, fileOutputStream);
                            r.a(inputStream, fileOutputStream);
                            try {
                                try {
                                    if (g.a().b()) {
                                        f.a().a(14);
                                        com.mob.commons.a.c.a(str, file4, str3, str4);
                                    } else {
                                        f.a().a(19);
                                    }
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                            } catch (Throwable th2) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r.a(inputStream, fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream2 = inputStream;
                    r.a(inputStream2);
                    throw th;
                }
            } else {
                file = null;
                inputStream2 = inputStream;
            }
            r.a(inputStream2);
            return file;
        } catch (Throwable th6) {
            th = th6;
            r.a(inputStream2);
            throw th;
        }
    }

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        boolean f40306a = false;

        /* renamed from: b, reason: collision with root package name */
        private String f40307b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f40308c;

        /* renamed from: d, reason: collision with root package name */
        private String f40309d;

        public a(String str, String str2) {
            this.f40307b = str;
            this.f40309d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f40306a) {
                    com.mob.commons.cc.b.a(MobSDK.getContext(), this.f40308c, this.f40309d);
                } else {
                    com.mob.commons.cc.b.a(MobSDK.getContext(), this.f40307b, this.f40309d);
                }
            } catch (Throwable th2) {
                try {
                    f.a().b(6, th2);
                    MobLog.getInstance().d(th2);
                } catch (Throwable unused) {
                }
            }
        }

        public a(byte[] bArr, String str) {
            this.f40308c = bArr;
            this.f40309d = str;
        }
    }

    public void a(long j11, HashMap<String, Object> hashMap) {
        boolean b11 = com.mob.commons.b.b();
        MobLog.getInstance().d("DH PD: " + hashMap.get(o.a("004dJdiRei")) + ", to: " + b11, new Object[0]);
        if (b11) {
            t.f40415d.execute(b.b(j11, hashMap));
        }
    }

    public static void a(Object... objArr) {
        try {
            try {
                f.a().a(13);
                ResHelper.deleteFileAndFolder(b(objArr));
            } catch (Throwable th2) {
                f.a().a(4, th2);
            }
        } catch (Throwable th3) {
            try {
                f.a().a(5, th3);
                ResHelper.deleteFileAndFolder(null);
            } catch (Throwable th4) {
                try {
                    ResHelper.deleteFileAndFolder(null);
                } catch (Throwable th5) {
                    f.a().a(4, th5);
                }
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ArrayList<HashMap<String, Object>> arrayList) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        File file = new File(MobSDK.getContext().getFilesDir(), o.a("003?fgfced"));
        Iterator<HashMap<String, Object>> it = arrayList.iterator();
        while (it.hasNext()) {
            HashMap<String, Object> next = it.next();
            Boolean bool = (Boolean) next.get(o.a("002Ldffg"));
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            String str = (String) next.get(o.a("002Cfhed"));
            String str2 = (String) next.get("m");
            String str3 = (String) next.get("args");
            Object obj = next.get(o.a("002,de*h"));
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                return;
            }
            FileOutputStream fileOutputStream = null;
            String a11 = e.a((MobProduct) null);
            HashMap hashMap = new HashMap();
            hashMap.put(o.a("004h8dcdePh"), a11);
            hashMap.put(o.a("005d+ecdj7iWdk"), w.a().b());
            hashMap.put(o.a("004l'ecde1h"), com.mob.commons.b.d.c(MobSDK.getContext()));
            hashMap.put(o.a("010 fgZhPdjge)iAdhfgdeecdk"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
            hashMap.put(o.a("006CdfJee>dj*i%di"), MobSDK.getAppkey());
            hashMap.put(o.a("009;df)eeJehCi]dgdhWid"), MobSDK.getAppSecret());
            hashMap.put(o.a("006h5ecMlDdfdedk"), MobSDK.getDomain().getDomain());
            hashMap.put(o.a("010HfhecdhdgJi=hc0dde[fg"), Boolean.valueOf(MobSDK.checkForceHttps()));
            Long l11 = (Long) com.mob.commons.b.a(o.a("004iSdg=i0dl"), 5L);
            l11.longValue();
            hashMap.put(o.a("004i1dgJiFdl"), l11);
            hashMap.put(o.a("002@dgGh"), (String) com.mob.commons.b.a(o.a("002Tdg1h"), o.a("0067gjgjgkgkgkgk")));
            hashMap.put("usridt", u.e());
            hashMap.put(o.a("002FdeWh"), obj);
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("args", HashonHelper.fromJson(str3));
            }
            DeviceHelper deviceHelper = DeviceHelper.getInstance(MobSDK.getContext());
            hashMap.put(o.a("008hij]dedg*iTeg4h"), deviceHelper.getDeviceKey());
            hashMap.put(o.a("004!deXli!de"), deviceHelper.getIMEI());
            hashMap.put(o.a("004:de$l?fgde"), deviceHelper.getIMSI());
            hashMap.put("sno", deviceHelper.getSerialno());
            hashMap.put("ssno", deviceHelper.getSimSerialNumber());
            hashMap.put("miui", deviceHelper.getMIUIVersion());
            hashMap.put(o.a("005lPecWhiJed"), deviceHelper.getModel());
            hashMap.put(o.a("007MfhdfdgDd<ecdhdi"), deviceHelper.getManufacturer());
            hashMap.put(o.a("005^fcdhdfdk-h"), deviceHelper.getBrand());
            hashMap.put(o.a("005GdfWhOfgde%h"), deviceHelper.getAdvertisingID());
            hashMap.put(o.a("006AdfEeeji)dh"), deviceHelper.getAppVersionName());
            hashMap.put(o.a("011eUdfdgdjdfff9i0efdfNli"), deviceHelper.getPackageName());
            hashMap.put(o.a("005+fcfgfgde*h"), deviceHelper.getBssid());
            hashMap.put("osint", Integer.valueOf(deviceHelper.getOSVersionInt()));
            hashMap.put("osname", deviceHelper.getOSVersionName());
            String fromHashMap = HashonHelper.fromHashMap(hashMap);
            String checkHttpRequestUrl = NetCommunicator.checkHttpRequestUrl(str);
            if (booleanValue) {
                File file2 = new File(file, str2);
                if (!file2.exists() || !str2.equals(Data.MD5(file2))) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file.mkdirs();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            new NetworkHelper().download(checkHttpRequestUrl, fileOutputStream2, null);
                            r.a(fileOutputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            r.a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                new Thread(new a(file2.getAbsolutePath(), fromHashMap)).start();
            } else {
                File file3 = new File(file, str2);
                if (file3.exists()) {
                    file3.delete();
                }
                final byte[][] bArr = new byte[1][];
                final int[] iArr = new int[1];
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream() { // from class: com.mob.commons.d.1
                        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() throws IOException {
                            super.close();
                            bArr[0] = ((ByteArrayOutputStream) this).buf;
                            iArr[0] = ((ByteArrayOutputStream) this).count;
                        }
                    };
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    new NetworkHelper().download(checkHttpRequestUrl, byteArrayOutputStream, null);
                    r.a(byteArrayOutputStream);
                    new Thread(new a(byteArrayOutputStream.toByteArray(), fromHashMap)).start();
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = byteArrayOutputStream;
                    r.a(fileOutputStream);
                    throw th;
                }
            }
        }
    }

    public static String a(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] < s.e().length()) {
                sb2.append((char) (r2.charAt(iArr[i11]) - 2));
            }
        }
        return sb2.toString();
    }
}
