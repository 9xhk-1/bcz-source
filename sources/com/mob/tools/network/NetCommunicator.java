package com.mob.tools.network;

import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.MobProduct;
import com.mob.commons.b.d;
import com.mob.commons.c;
import com.mob.commons.e;
import com.mob.commons.o;
import com.mob.commons.r;
import com.mob.commons.u;
import com.mob.mcl.b.a;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.UIHandler;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes7.dex */
public final class NetCommunicator implements PublicMemberKeeper {
    public static final String KEY_DUID_PREVIOUS = "duidPrevious";
    public static final String KEY_IS_MODIFIED = "isModified";

    /* renamed from: c, reason: collision with root package name */
    private BigInteger f41323c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f41324d;

    /* renamed from: e, reason: collision with root package name */
    private MobRSA f41325e;

    /* renamed from: g, reason: collision with root package name */
    private NetworkHelper.NetworkTimeOut f41327g;

    /* renamed from: h, reason: collision with root package name */
    private ThreadPoolExecutor f41328h;
    public static final String KEY_DUID = o.a("004h.dcde0h");

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadPoolExecutor f41321a = new ThreadPoolExecutor(3, 20, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* renamed from: b, reason: collision with root package name */
    private SecureRandom f41322b = new SecureRandom();

    /* renamed from: f, reason: collision with root package name */
    private NetworkHelper f41326f = new NetworkHelper();

    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
            super(str);
        }
    }

    public NetCommunicator(int i11, String str, String str2) {
        this.f41325e = new MobRSA(i11);
        this.f41323c = new BigInteger(str, 16);
        this.f41324d = new BigInteger(str2, 16);
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        this.f41327g = networkTimeOut;
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 5000;
        this.f41328h = f41321a;
    }

    public static String checkHttpRequestUrl(String str) {
        return r.b(str);
    }

    public static String dynamicModifyUrl(String str) {
        return r.a(str);
    }

    public static HashMap<String, String> getCommonDefaultHeaders() throws Throwable {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(o.a("003VdjSi9di"), MobSDK.getAppkey());
        hashMap.put(o.a("013IeefgYiTdhhieg5hiLdkSd6de8dLdi"), u.c());
        hashMap.put(o.a("004lHecdeCh"), d.d(MobSDK.getContext()));
        return hashMap;
    }

    public static synchronized String getDUID(MobProduct mobProduct) {
        String a11;
        synchronized (NetCommunicator.class) {
            a11 = e.a(mobProduct);
        }
        return a11;
    }

    public static synchronized HashMap<String, Object> getDUIDWithModifyInfo(MobProduct mobProduct) {
        HashMap<String, Object> b11;
        synchronized (NetCommunicator.class) {
            b11 = e.b(mobProduct);
        }
        return b11;
    }

    public static String getSDKDomain(String str, String str2) {
        return c.a(str, str2);
    }

    public static boolean initSDKDM(HashMap<String, List<String>> hashMap) {
        return c.a(hashMap);
    }

    public void addTcpIntercept(String str) {
        try {
            a.a(str);
        } catch (Throwable unused) {
        }
    }

    public void removeTcpIntercept(String str) {
        try {
            a.b(str);
        } catch (Throwable unused) {
        }
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z11, Callback<T> callback) {
        request(true, null, hashMap, str, z11, callback);
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z11) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, hashMap, str, z11);
    }

    public String requestSynchronizedGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        try {
            a.a((String) null);
            String a11 = a.a(false, str, hashMap, hashMap2, this.f41327g);
            MobLog.getInstance().d(">>> gt res:  " + a11, new Object[0]);
            return a11;
        } catch (Throwable unused) {
            return this.f41326f.httpGetNew(str, hashMap, hashMap2, this.f41327g);
        }
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.f41328h = threadPoolExecutor;
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z11, Callback<T> callback) {
        request(true, hashMap, hashMap2, str, z11, callback);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z11) throws Throwable {
        return (T) requestSynchronized(true, hashMap, hashMap2, str, z11);
    }

    private byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(byteArrayOutputStream));
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public <T> void request(final boolean z11, final HashMap<String, String> hashMap, final HashMap<String, Object> hashMap2, final String str, final boolean z12, final Callback<T> callback) {
        this.f41328h.execute(new com.mob.tools.utils.d() { // from class: com.mob.tools.network.NetCommunicator.1
            @Override // com.mob.tools.utils.d
            public void a() {
                try {
                    final Object requestSynchronized = NetCommunicator.this.requestSynchronized(z11, hashMap, hashMap2, str, z12);
                    if (callback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.network.NetCommunicator.1.1
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                callback.onResultOk(requestSynchronized);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                    if (callback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.network.NetCommunicator.1.2
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                callback.onResultError(th2);
                                return false;
                            }
                        });
                    }
                }
            }
        });
    }

    public <T> T requestSynchronized(String str, String str2, boolean z11) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, str, str2, z11);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z11) throws Throwable {
        return (T) requestSynchronized(true, hashMap, str, str2, z11);
    }

    public <T> T requestSynchronized(boolean z11, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z12) throws Throwable {
        NetCommunicator netCommunicator;
        boolean z13;
        HashMap<String, String> hashMap3;
        String str2;
        String str3;
        boolean z14;
        if (hashMap2 != null) {
            String fromHashMap = HashonHelper.fromHashMap(hashMap2);
            if (fromHashMap.length() != 0) {
                netCommunicator = this;
                z13 = z11;
                hashMap3 = hashMap;
                str2 = fromHashMap;
                str3 = str;
                z14 = z12;
                return (T) netCommunicator.requestSynchronized(z13, hashMap3, str2, str3, z14);
            }
        }
        netCommunicator = this;
        z13 = z11;
        hashMap3 = hashMap;
        str3 = str;
        z14 = z12;
        str2 = "{}";
        return (T) netCommunicator.requestSynchronized(z13, hashMap3, str2, str3, z14);
    }

    public <T> T requestSynchronized(boolean z11, HashMap<String, String> hashMap, String str, String str2, boolean z12) throws Throwable {
        String str3;
        byte[] a11 = a();
        String a12 = a(a11, str, z12);
        HashMap<String, String> a13 = a(z11, hashMap, str, a12.getBytes("utf-8").length);
        String[] strArr = new String[1];
        HttpResponseCallback a14 = a(a11, strArr);
        StringPart stringPart = new StringPart();
        stringPart.append(a12);
        MobLog.getInstance().d(">>>  request(" + str2 + "): " + str + "\nheader = " + a13.toString(), new Object[0]);
        try {
            a.a((String) null);
            str3 = str2;
            a.a(false, str3, a13, stringPart, -1, a14, this.f41327g);
        } catch (Throwable unused) {
            str3 = str2;
            this.f41326f.rawPost(str3, a13, stringPart, -1, a14, this.f41327g);
        }
        if (strArr[0] == null) {
            return null;
        }
        MobLog.getInstance().d(">>> response(" + str3 + "): " + strArr[0], new Object[0]);
        return (T) a(strArr[0]);
    }

    private byte[] a() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        this.f41322b.setSeed(System.currentTimeMillis());
        dataOutputStream.writeLong(this.f41322b.nextLong());
        dataOutputStream.writeLong(this.f41322b.nextLong());
        dataOutputStream.flush();
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private String a(byte[] bArr, String str, boolean z11) throws Throwable {
        byte[] bytes = str.getBytes("utf-8");
        if (z11) {
            bytes = a(bytes);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] encode = this.f41325e.encode(bArr, this.f41323c, this.f41324d);
        dataOutputStream.writeInt(encode.length);
        dataOutputStream.write(encode);
        byte[] AES128Encode = Data.AES128Encode(bArr, bytes);
        dataOutputStream.writeInt(AES128Encode.length);
        dataOutputStream.write(AES128Encode);
        dataOutputStream.flush();
        dataOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th2) {
        }

        public void onResultOk(T t11) {
        }
    }

    private HashMap<String, String> a(boolean z11, HashMap<String, String> hashMap, String str, int i11) throws Throwable {
        HashMap<String, String> a11 = z11 ? a(str, i11) : null;
        if (a11 == null) {
            a11 = new HashMap<>();
        }
        if (hashMap != null) {
            a11.putAll(hashMap);
        }
        return a11;
    }

    private HashMap<String, String> a(String str, int i11) throws Throwable {
        HashMap<String, String> commonDefaultHeaders = getCommonDefaultHeaders();
        commonDefaultHeaders.put(o.a("004Lfgdeffdk"), Data.MD5(str + MobSDK.getAppSecret()));
        commonDefaultHeaders.put(o.a("003!djPi8di"), MobSDK.getAppkey());
        commonDefaultHeaders.put(o.a("014HgfecdkCdiBdk>dZhiekBi_dkffNdc"), String.valueOf(i11));
        return commonDefaultHeaders;
    }

    private HttpResponseCallback a(final byte[] bArr, final String[] strArr) {
        return new HttpResponseCallback() { // from class: com.mob.tools.network.NetCommunicator.2
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                int responseCode = httpConnection.getResponseCode();
                InputStream inputStream = responseCode == 200 ? httpConnection.getInputStream() : httpConnection.getErrorStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                for (int read = inputStream.read(bArr2); read != -1; read = inputStream.read(bArr2)) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                inputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (responseCode != 200) {
                    HashMap fromJson = HashonHelper.fromJson(new String(byteArray, "utf-8"));
                    fromJson.put(o.a("010cddeHehSdVdf-d4dcfg"), Integer.valueOf(responseCode));
                    throw new NetworkError(HashonHelper.fromHashMap(fromJson));
                }
                long a11 = NetCommunicator.this.a(httpConnection);
                if (a11 != -1 && a11 == byteArray.length) {
                    strArr[0] = NetCommunicator.this.a(bArr, byteArray);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(o.a("010cdde-eh@d%df5dKdcfg"), Integer.valueOf(responseCode));
                hashMap.put(o.a("006=fg]d^df3d(dcfg"), -2);
                hashMap.put(o.a("005i[dhdhecdh"), "Illegal content length");
                throw new NetworkError(HashonHelper.fromHashMap(hashMap));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(HttpConnection httpConnection) throws Throwable {
        List<String> a11 = a(httpConnection, o.a("014,gfecdk,di%dk2d+hiekRi[dkff1dc"));
        if (a11 == null || a11.size() <= 0) {
            return -1L;
        }
        return Long.parseLong(a11.get(0));
    }

    private List<String> a(HttpConnection httpConnection, String str) throws Throwable {
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty()) {
            return null;
        }
        for (String str2 : headerFields.keySet()) {
            if (str2 != null && str2.equals(str)) {
                return headerFields.get(str2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(byte[] bArr, byte[] bArr2) throws Throwable {
        return new String(Data.AES128Decode(bArr, Base64.decode(bArr2, 2)), "utf-8");
    }

    private Object a(String str) throws Throwable {
        if (str != null) {
            HashMap fromJson = HashonHelper.fromJson(str.trim());
            if (!fromJson.isEmpty()) {
                Object obj = fromJson.get(o.a("003-dh(iXfg"));
                return obj == null ? fromJson.get(o.a("004h9dfKdDdf")) : obj;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(o.a("006VfgOdMdfYd9dcfg"), -1);
            hashMap.put(o.a("005i'dhdhecdh"), "RS is empty");
            throw new NetworkError(HashonHelper.fromHashMap(hashMap));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(o.a("006Vfg=d_dfNdAdcfg"), -1);
        hashMap2.put(o.a("005i;dhdhecdh"), "RS is empty");
        throw new NetworkError(HashonHelper.fromHashMap(hashMap2));
    }
}
