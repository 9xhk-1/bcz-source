package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ResHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40450a = o.a("002]eihd");

    /* renamed from: b, reason: collision with root package name */
    private static final String f40451b = o.a("005Velec%ed dk");

    /* renamed from: c, reason: collision with root package name */
    private static final String f40452c = o.a("0055elec,ehBdk");

    /* renamed from: d, reason: collision with root package name */
    private static final String f40453d = o.a("016Dgkgjjcjiheieihgihhfedffcdg(h(fhde");

    /* renamed from: e, reason: collision with root package name */
    private static w f40454e;

    /* renamed from: f, reason: collision with root package name */
    private String f40455f;

    /* renamed from: g, reason: collision with root package name */
    private DeviceHelper f40456g;

    /* renamed from: h, reason: collision with root package name */
    private Context f40457h;

    /* renamed from: i, reason: collision with root package name */
    private TreeMap<String, Object> f40458i;

    private w() {
        Context context = MobSDK.getContext();
        this.f40457h = context;
        this.f40456g = DeviceHelper.getInstance(context);
    }

    public static w a() {
        if (f40454e == null) {
            synchronized (w.class) {
                try {
                    if (f40454e == null) {
                        f40454e = new w();
                    }
                } finally {
                }
            }
        }
        return f40454e;
    }

    private String d() {
        this.f40458i = new TreeMap<>();
        String str = null;
        try {
            String e11 = e();
            boolean a11 = a(f());
            if (TextUtils.isEmpty(e11)) {
                str = a(this.f40458i);
            } else {
                MobLog.getInstance().d("[%s] %s", f40450a, "tk status: " + a11);
                str = !a11 ? e11 : a(this.f40458i);
            }
            f40454e.f40455f = str;
            return str;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return str;
        }
    }

    private String e() {
        DataInputStream dataInputStream;
        String str;
        DataInputStream dataInputStream2 = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f40457h, f40451b);
            if (dataCacheFile == null || !dataCacheFile.exists()) {
                str = null;
            } else {
                dataInputStream = new DataInputStream(new FileInputStream(dataCacheFile));
                try {
                    str = dataInputStream.readUTF();
                    dataInputStream2 = dataInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        MobLog.getInstance().d(th);
                        r.a(dataInputStream);
                        return null;
                    } catch (Throwable th3) {
                        r.a(dataInputStream);
                        throw th3;
                    }
                }
            }
            r.a(dataInputStream2);
            return str;
        } catch (Throwable th4) {
            th = th4;
            dataInputStream = null;
        }
    }

    private HashMap<String, Object> f() {
        FileChannel fileChannel;
        HashMap<String, Object> hashMap;
        FileChannel fileChannel2 = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f40457h, f40452c);
            if (dataCacheFile == null || !dataCacheFile.exists()) {
                hashMap = null;
            } else {
                fileChannel = new FileInputStream(dataCacheFile).getChannel();
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    while (fileChannel.read(allocate) > 0) {
                    }
                    hashMap = a(f40453d, allocate.array());
                    fileChannel2 = fileChannel;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        MobLog.getInstance().d(th);
                        r.a(fileChannel);
                        return null;
                    } catch (Throwable th3) {
                        r.a(fileChannel);
                        throw th3;
                    }
                }
            }
            r.a(fileChannel2);
            return hashMap;
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f40455f)) {
            synchronized (w.class) {
                try {
                    if (TextUtils.isEmpty(this.f40455f)) {
                        return d();
                    }
                } finally {
                }
            }
        }
        return this.f40455f;
    }

    public String c() {
        return this.f40455f;
    }

    private boolean a(HashMap<String, Object> hashMap) {
        try {
            this.f40458i.put(o.a("007<fhdfdg:d-ecdhdi"), this.f40456g.getManufacturer());
            this.f40458i.put(o.a("005l4ec2hi[ed"), this.f40456g.getModel());
            this.f40458i.put(o.a("0069fgdifg$jiLdh"), Integer.valueOf(this.f40456g.getOSVersionInt()));
            this.f40458i.put(o.a("008hij8dedg=iBeg!h"), this.f40456g.getDeviceKey());
            this.f40458i.put(o.a("004h1dcdeRh"), e.a((MobProduct) null));
            String MD5 = Data.MD5(new JSONObject(this.f40458i).toString());
            TreeMap<String, Object> treeMap = new TreeMap<>();
            treeMap.put(o.a("0101ff0i-dkIi$dhdfedghLh_he"), MD5);
            b(treeMap);
            if (hashMap == null || hashMap.isEmpty() || !MD5.equals((String) hashMap.get(o.a("010;ff*i*dk+i3dhdfedgh=hYhe")))) {
                return true;
            }
            MobLog.getInstance().d("[%s] %s", f40450a, "No changes");
            return false;
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return false;
        }
    }

    private void b(String str) {
        DataOutputStream dataOutputStream = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f40457h, f40451b);
            if (dataCacheFile != null) {
                DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(dataCacheFile));
                try {
                    dataOutputStream2.writeUTF(str);
                    dataOutputStream2.flush();
                    dataOutputStream = dataOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    try {
                        MobLog.getInstance().d(th);
                        r.a(dataOutputStream);
                        return;
                    } catch (Throwable th3) {
                        r.a(dataOutputStream);
                        throw th3;
                    }
                }
            }
            r.a(dataOutputStream);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void b(TreeMap<String, Object> treeMap) {
        FileChannel fileChannel = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f40457h, f40452c);
            byte[] a11 = a(f40453d, treeMap);
            if (a11 != null && a11.length > 0) {
                fileChannel = new FileOutputStream(dataCacheFile).getChannel();
                fileChannel.write(ByteBuffer.wrap(a11));
                fileChannel.force(true);
            }
            r.a(fileChannel);
        } catch (Throwable th2) {
            try {
                MobLog.getInstance().d(th2);
                r.a(fileChannel);
            } catch (Throwable th3) {
                r.a(fileChannel);
                throw th3;
            }
        }
    }

    private String a(TreeMap<String, Object> treeMap) {
        HashMap hashMap;
        String str = null;
        if (!b.d()) {
            return null;
        }
        if (treeMap != null && !treeMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(o.a("007Xfhdfdg.dKecdhdi"), treeMap.get(o.a("007Xfhdfdg.dKecdhdi")));
                hashMap2.put(o.a("005l,ecEhi;ed"), treeMap.get(o.a("005l,ecEhi;ed")));
                hashMap2.put(o.a("006>fgdifg*jiOdh"), treeMap.get(o.a("006>fgdifg*jiOdh")));
                hashMap2.put(o.a("008hijXdedg:i3eg?h"), treeMap.get(o.a("008hijXdedg:i3eg?h")));
                hashMap2.put(o.a("004h1dcde8h"), treeMap.get(o.a("004h1dcde8h")));
                HashMap<String, Object> hashMap3 = new HashMap<>();
                hashMap3.put(o.a("0066df%ee7dj3i8di"), MobSDK.getAppkey());
                hashMap3.put("m", a(HashonHelper.fromHashMap(hashMap2)));
                HashMap<String, String> hashMap4 = new HashMap<>();
                hashMap4.put(o.a("013FeefgTi<dhhieg(hiZdk]d dePd=di"), u.c());
                hashMap4.put(o.a("004l(ecde<h"), com.mob.commons.b.d.d(MobSDK.getContext()));
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 30000;
                networkTimeOut.connectionTimeout = 30000;
                HashMap fromJson = HashonHelper.fromJson(new NetworkHelper().httpPostNew(c.a(c.f40221c) + o.a("007gMec]ei;dkdeOh"), hashMap3, hashMap4, networkTimeOut));
                if (BasicPushStatus.SUCCESS_CODE.equals(String.valueOf(fromJson.get(o.a("004Odgec>hi")))) && (hashMap = (HashMap) fromJson.get(o.a("004hXdf8d.df"))) != null) {
                    String str2 = (String) hashMap.get(o.a("005d+ecdjLiZdk"));
                    try {
                        f40454e.f40455f = str2;
                        b(str2);
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        str = str2;
                        MobLog.getInstance().e(th);
                        return str;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(String str) throws Throwable {
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
                        DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream3);
                        try {
                            dataOutputStream3.writeInt(encode.length);
                            dataOutputStream3.write(encode);
                            dataOutputStream3.writeInt(AES128Encode.length);
                            dataOutputStream3.write(AES128Encode);
                            dataOutputStream3.flush();
                            r.a(dataOutputStream3);
                            return Base64.encodeToString(byteArrayOutputStream3.toByteArray(), 2);
                        } catch (Throwable th2) {
                            r.a(dataOutputStream3);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream = bufferedOutputStream;
                        r.a(dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                dataOutputStream = dataOutputStream2;
                r.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private byte[] a(String str, TreeMap<String, Object> treeMap) {
        try {
            return Data.AES128Encode(str, new JSONObject(treeMap).toString());
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new HashMap<>();
        }
    }
}
