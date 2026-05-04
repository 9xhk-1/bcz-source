package com.mob.tools.network;

import android.content.Context;
import androidx.media3.common.MimeTypes;
import com.alipay.sdk.m.p.e;
import com.badlogic.gdx.Net;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.mob.MobSDK;
import com.mob.commons.i;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileUtils;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import ku.r0;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import u30.u0;

/* loaded from: classes7.dex */
public class NetworkHelper implements EverythingKeeper {
    public static int connectionTimeout = 0;
    private static boolean followRedirects = true;
    public static int readTimout;
    protected boolean instanceFollowRedirects = followRedirects;

    public static class NetworkTimeOut implements PublicMemberKeeper {
        public int connectionTimeout;
        public int readTimout;
    }

    public static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private Object f41354a;

        /* renamed from: b, reason: collision with root package name */
        private String f41355b;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            if (!name.equals(i.a("018Jfi*ekKfiflihgffg)kSfm+f_gkfjfehi;fkj"))) {
                if (name.equals(i.a("018$fiRek@fiflgj,k*fjGlk=fjgkfjfehi?fkj"))) {
                    Object[] objArr2 = (Object[]) objArr[0];
                    String str = (String) objArr[1];
                    if (objArr2 == null) {
                        throw new IllegalArgumentException("there were no certificates.");
                    }
                    if (objArr2.length == 1) {
                        try {
                            Method declaredMethod = objArr2[0].getClass().getDeclaredMethod(i.a("0136fi)ek_fifligfhgffgUjOfgVfIfk"), null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(objArr2[0], null);
                        } catch (Throwable th2) {
                            MobLog.getInstance().e(th2);
                        }
                    } else {
                        if (this.f41354a == null) {
                            throw new CertificateException("there were one more certificates but no trust manager found.");
                        }
                        try {
                            Object newInstance = Class.forName("android.net.http.X509TrustManagerExtensions").getConstructor(Class.forName(i.a("030?jhfh3lTfhfngnfmPkfFgnhihigfgnjijghgjjgkfjfehi^fQijfhfmfhhh3kJfj"))).newInstance(this.f41354a);
                            Method declaredMethod2 = newInstance.getClass().getDeclaredMethod(i.a("018,fi3ek>fiflgjEk]fj+lk)fjgkfjfehiGfkj"), Array.newInstance(Class.forName(i.a("034Gjhfh:l<fhgnhi)kXfifefjfg^fSfkgnfi-k0fjFfMgnjijghgjjih*k*fj0fUfghjfgfifhGfk")), 0).getClass(), String.class, String.class);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(newInstance, objArr2, str, this.f41355b);
                        } catch (Throwable th3) {
                            MobLog.getInstance().e(th3);
                        }
                    }
                } else if (name.equals(i.a("018JhhOkf5glfifiAkgfkjTgihihifeAk7fjhi"))) {
                    try {
                        return Array.newInstance(Class.forName(i.a("034Sjhfh4l'fhgnhi)kGfifefjfg2f6fkgnfiMk9fjZf7gnjijghgjjihZk%fjGfGfghjfgfifh8fk")), 0);
                    } catch (Throwable th4) {
                        MobLog.getInstance().e(th4);
                    }
                } else {
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name.equals("toString")) {
                        return toString();
                    }
                }
            }
            return null;
        }

        private a(String str) {
            try {
                this.f41355b = str;
                Method declaredMethod = Class.forName(i.a("033>jhfhUl7fhfngnfmSkf?gnhihigfgngkfjfehiWf*ijfhfmfhhhNk'fjjffhfi(f6gefjfk")).getDeclaredMethod(i.a("011YhhOkfCgifmhi>fKfhfmfi_k"), String.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, i.a("0041jijghgjj"));
                Method method = invoke.getClass().getMethod(i.a("004<fgfmfg?f"), Class.forName(i.a("022_jhfh3l0fhgnhi_kTfifefjfgOf<fkgnjlGk]fkgjMf1gefj!k")));
                method.setAccessible(true);
                method.invoke(invoke, null);
                Method method2 = invoke.getClass().getMethod(i.a("0167hh!kf.gkfjfehi2f[ijfhfmfhhhHkYfjhi"), null);
                method2.setAccessible(true);
                Object[] objArr = (Object[]) method2.invoke(invoke, null);
                if (objArr == null || objArr.length == 0) {
                    throw new NoSuchAlgorithmException("no trust manager found.");
                }
                this.f41354a = objArr[0];
            } catch (Exception e11) {
                MobLog.getInstance().d("failed to initialize the standard trust manager: " + e11.getMessage(), new Object[0]);
                this.f41354a = null;
            }
        }
    }

    @Deprecated
    public static String checkHttpRequestUrl(String str) {
        return NetCommunicator.checkHttpRequestUrl(str);
    }

    private HttpURLConnection getConnection(String str, NetworkTimeOut networkTimeOut) throws Throwable {
        Object obj;
        boolean z11;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String a11 = i.a("012nkfeRgeTjEgkgefl!kPfmhi");
        try {
            obj = ReflectHelper.getInstanceField(httpURLConnection, a11);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            a11 = "PERMITTED_USER_METHODS";
            try {
                obj = ReflectHelper.getStaticField("HttpURLConnection", "PERMITTED_USER_METHODS");
            } catch (Throwable unused2) {
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (obj != null) {
            String[] strArr = (String[]) obj;
            String[] strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[strArr.length] = i.a("005'iiglgkihje");
            if (z11) {
                ReflectHelper.setStaticField("HttpURLConnection", a11, strArr2);
            } else {
                ReflectHelper.setInstanceField(httpURLConnection, a11, strArr2);
            }
        }
        System.setProperty("http.keepAlive", "false");
        if (httpURLConnection instanceof HttpsURLConnection) {
            X509HostnameVerifier x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLContext sSLContext = SSLContext.getInstance(i.a("003Ogkgmgj"));
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) getTrustManager(httpsURLConnection.getURL().getHost())};
            } catch (Throwable th2) {
                MobLog.getInstance().e(th2);
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(x509HostnameVerifier);
        }
        int i11 = networkTimeOut == null ? connectionTimeout : networkTimeOut.connectionTimeout;
        if (i11 > 0) {
            httpURLConnection.setConnectTimeout(i11);
        }
        int i12 = networkTimeOut == null ? readTimout : networkTimeOut.readTimout;
        if (i12 > 0) {
            httpURLConnection.setReadTimeout(i12);
        }
        return httpURLConnection;
    }

    @Deprecated
    private HTTPPart getDataPostHttpPart(HttpURLConnection httpURLConnection, String str, byte[] bArr) throws Throwable {
        ByteArrayPart byteArrayPart = new ByteArrayPart();
        byteArrayPart.append(bArr);
        return byteArrayPart;
    }

    @Deprecated
    private HTTPPart getFilePostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2) throws Throwable {
        FileInputStream fileInputStream;
        String uuid = UUID.randomUUID().toString();
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + uuid);
        MultiPart multiPart = new MultiPart();
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                stringPart.append(HttpRequest.f17578o).append(uuid).append("\r\n");
                stringPart.append("Content-Disposition: form-data; name=\"").append(next.name).append("\"\r\n\r\n");
                stringPart.append(next.value).append("\r\n");
            }
        }
        multiPart.append(stringPart);
        Iterator<KVPair<String>> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KVPair<String> next2 = it2.next();
            StringPart stringPart2 = new StringPart();
            File file = new File(next2.value);
            stringPart2.append(HttpRequest.f17578o).append(uuid).append("\r\n");
            stringPart2.append("Content-Disposition: form-data; name=\"").append(next2.name).append("\"; filename=\"").append(file.getName()).append("\"\r\n");
            String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(next2.value);
            if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                if (next2.value.toLowerCase().endsWith("jpg") || next2.value.toLowerCase().endsWith("jpeg")) {
                    contentTypeFor = "image/jpeg";
                } else if (next2.value.toLowerCase().endsWith("png")) {
                    contentTypeFor = MimeTypes.IMAGE_PNG;
                } else if (next2.value.toLowerCase().endsWith("gif")) {
                    contentTypeFor = "image/gif";
                } else {
                    FileInputStream fileInputStream2 = null;
                    try {
                        fileInputStream = new FileInputStream(next2.value);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        String guessContentTypeFromStream = URLConnection.guessContentTypeFromStream(fileInputStream);
                        FileUtils.closeIO(fileInputStream);
                        contentTypeFor = (guessContentTypeFromStream == null || guessContentTypeFromStream.length() <= 0) ? "application/octet-stream" : guessContentTypeFromStream;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        FileUtils.closeIO(fileInputStream2);
                        throw th;
                    }
                }
            }
            stringPart2.append("Content-Type: ").append(contentTypeFor).append("\r\n\r\n");
            multiPart.append(stringPart2);
            FilePart filePart = new FilePart();
            filePart.setFile(next2.value);
            multiPart.append(filePart);
            StringPart stringPart3 = new StringPart();
            stringPart3.append("\r\n");
            multiPart.append(stringPart3);
        }
        StringPart stringPart4 = new StringPart();
        stringPart4.append(HttpRequest.f17578o).append(uuid).append("--\r\n");
        multiPart.append(stringPart4);
        return multiPart;
    }

    @Deprecated
    private HTTPPart getTextPostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList) throws Throwable {
        httpURLConnection.setRequestProperty("Content-Type", i.a("033QfhHggSgffgfifhWfQfggefm:iOfnjkhfhfhfjkhjgefj:n6jkfefjgfWkKfmfige4jkj"));
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            stringPart.append(requestParamsToUrl(kvPairsToObjHashMap(arrayList)));
        }
        return stringPart;
    }

    public static Object getTrustManager(String str) throws Throwable {
        Class<?> cls = Class.forName(i.a("030!jhfhYl]fhfngnfm9kf*gnhihigfgnjijghgjjgkfjfehi.fWijfhfmfhhhQk2fj"));
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls}, new a(str));
    }

    @Deprecated
    private HashMap<String, Object> kvPairsToObjHashMap(ArrayList<KVPair<String>> arrayList) throws Throwable {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    @Deprecated
    private HashMap<String, String> kvPairsToStrHashMap(ArrayList<KVPair<String>> arrayList) throws Throwable {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    private String requestParamsToUrl(HashMap<String, Object> hashMap) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String urlEncode = Data.urlEncode(entry.getKey(), "utf-8");
            String urlEncode2 = entry.getValue() == null ? "" : Data.urlEncode(String.valueOf(entry.getValue()), "utf-8");
            if (sb2.length() > 0) {
                sb2.append(u0.f91708d);
            }
            sb2.append(urlEncode);
            sb2.append('=');
            sb2.append(urlEncode2);
        }
        return sb2.toString();
    }

    private void setHeader(URLConnection uRLConnection, HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public void download(String str, final OutputStream outputStream, NetworkTimeOut networkTimeOut) throws Throwable {
        final byte[] bArr = new byte[1024];
        rawGet(str, new RawNetworkCallback() { // from class: com.mob.tools.network.NetworkHelper.1
            @Override // com.mob.tools.network.RawNetworkCallback
            public void onResponse(InputStream inputStream) throws Throwable {
                int read = inputStream.read(bArr);
                while (read != -1) {
                    outputStream.write(bArr, 0, read);
                    read = inputStream.read(bArr);
                }
            }
        }, networkTimeOut);
        outputStream.flush();
    }

    public String downloadCache(Context context, String str, String str2, boolean z11, NetworkTimeOut networkTimeOut) throws Throwable {
        return downloadCache(context, str, str2, z11, networkTimeOut, null);
    }

    @Deprecated
    public String httpGet(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpGetNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    public String httpGetNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader;
        MobLog.getInstance().d(String.format("hgt: %s", str), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = str + "?" + requestParamsToUrl;
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap2);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        BufferedReader bufferedReader2 = null;
        if (responseCode == 200) {
            StringBuilder sb2 = new StringBuilder();
            try {
                inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader2);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader2 = null;
            }
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(readLine);
                }
                FileUtils.closeIO(bufferedReader, inputStreamReader2);
                connection.disconnect();
                String sb3 = sb2.toString();
                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return sb3;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = bufferedReader;
                FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                throw th;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        try {
            inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
            try {
                BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader);
                try {
                    for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                        if (sb4.length() > 0) {
                            sb4.append('\n');
                        }
                        sb4.append(readLine2);
                    }
                    FileUtils.closeIO(bufferedReader3, inputStreamReader);
                    connection.disconnect();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(i.a("005kEfjfjgefj"), sb4.toString());
                    hashMap3.put(i.a("0066hiKf>fh^f_fehi"), Integer.valueOf(responseCode));
                    throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader2 = bufferedReader3;
                    FileUtils.closeIO(bufferedReader2, inputStreamReader);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStreamReader = null;
        }
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpPostNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    @Deprecated
    public String httpPostFiles(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i11, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, arrayList2, arrayList3, i11, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.3
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                }
                                FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                hashMap.put("resp", sb2.toString());
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                FileUtils.closeIO(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                }
                                FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(i.a("005k]fjfjgefj"), sb3.toString());
                                hashMap2.put(i.a("006)hi>f[fh%f2fehi"), Integer.valueOf(responseCode));
                                throw new Throwable(new Hashon().fromHashMap(hashMap2));
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = bufferedReader3;
                                FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public String httpPostFilesChecked(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i11, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, bArr, arrayList2, i11, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.4
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                }
                                FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                hashMap.put("resp", sb2.toString());
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                FileUtils.closeIO(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                }
                                FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(i.a("005k,fjfjgefj"), sb3.toString());
                                hashMap2.put(i.a("0069hiMfQfhHf-fehi"), Integer.valueOf(responseCode));
                                throw new Throwable(new Hashon().fromHashMap(hashMap2));
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = bufferedReader3;
                                FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.io.Closeable[]] */
    public String httpPostNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) throws Throwable {
        ?? r17;
        OutputStream outputStream;
        InputStream inputStream;
        String str2;
        int responseCode;
        InputStreamReader inputStreamReader;
        char c11;
        InputStreamReader inputStreamReader2;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("hpt: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap2);
        connection.setRequestProperty(i.a("010-ihgefmfm]k+fi,f0fggefm"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", i.a("0331fhFggHgffgfifhJf>fggefmEi6fnjkhfhfhfjkhjgefjGnDjkfefjgf^kOfmfigeKjkj"));
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(requestParamsToUrl(hashMap));
        }
        connection.setFixedLengthStreamingMode((int) stringPart.b());
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    responseCode = connection.getResponseCode();
                } catch (Throwable th2) {
                    th = th2;
                    str2 = 1;
                }
            } catch (Throwable th3) {
                th = th3;
                r17 = 1;
            }
            try {
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            ?? bufferedReader = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                }
                                FileUtils.closeIO(new Closeable[]{bufferedReader, inputStreamReader});
                                String sb3 = sb2.toString();
                                connection.disconnect();
                                FileUtils.closeIO(inputStream, outputStream);
                                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                                return sb3;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream2 = bufferedReader;
                                FileUtils.closeIO(inputStream2, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    try {
                        c11 = 1;
                    } catch (Throwable th7) {
                        th = th7;
                        c11 = 1;
                    }
                    try {
                        inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            ?? bufferedReader2 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine2 = bufferedReader2.readLine(); readLine2 != null; readLine2 = bufferedReader2.readLine()) {
                                    if (sb4.length() > 0) {
                                        sb4.append('\n');
                                    }
                                    sb4.append(readLine2);
                                }
                                FileUtils.closeIO(new Closeable[]{bufferedReader2, inputStreamReader2});
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put(i.a("005k.fjfjgefj"), sb4.toString());
                                hashMap3.put(i.a("006;hiFf_fh)f?fehi"), Integer.valueOf(responseCode));
                                throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                            } catch (Throwable th8) {
                                th = th8;
                                inputStream2 = bufferedReader2;
                                Closeable[] closeableArr = new Closeable[2];
                                closeableArr[0] = inputStream2;
                                closeableArr[c11] = inputStreamReader2;
                                FileUtils.closeIO(closeableArr);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        inputStreamReader2 = null;
                        Closeable[] closeableArr2 = new Closeable[2];
                        closeableArr2[0] = inputStream2;
                        closeableArr2[c11] = inputStreamReader2;
                        FileUtils.closeIO(closeableArr2);
                        throw th;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                str2 = str;
                inputStream2 = inputStream;
                r17 = str2;
                connection.disconnect();
                Closeable[] closeableArr3 = new Closeable[2];
                closeableArr3[0] = inputStream2;
                closeableArr3[r17] = outputStream;
                FileUtils.closeIO(closeableArr3);
                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                throw th;
            }
        } catch (Throwable th12) {
            th = th12;
            r17 = 1;
            outputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.Closeable[]] */
    public String httpPostWithBytes(String str, byte[] bArr, HashMap<String, String> hashMap, NetworkTimeOut networkTimeOut) throws Throwable {
        ?? r17;
        OutputStream outputStream;
        ByteArrayInputStream byteArrayInputStream;
        String str2;
        int responseCode;
        InputStreamReader inputStreamReader;
        char c11;
        InputStreamReader inputStreamReader2;
        ?? bufferedReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("hpt: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap);
        connection.setRequestProperty(i.a("010Nihgefmfm$k4fi;f+fggefm"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", "application/octet-stream");
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                byte[] bytes = MobSDK.getAppkey().getBytes("utf-8");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                dataOutputStream.write(bArr);
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byte[] bArr2 = new byte[65536];
                    for (int read = byteArrayInputStream.read(bArr2); read > 0; read = byteArrayInputStream.read(bArr2)) {
                        outputStream.write(bArr2, 0, read);
                    }
                    outputStream.flush();
                    responseCode = connection.getResponseCode();
                } catch (Throwable th2) {
                    th = th2;
                    str2 = 1;
                }
            } catch (Throwable th3) {
                th = th3;
                r17 = 1;
            }
            try {
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            ?? bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                }
                                FileUtils.closeIO(new Closeable[]{bufferedReader2, inputStreamReader});
                                String sb3 = sb2.toString();
                                connection.disconnect();
                                FileUtils.closeIO(byteArrayInputStream, outputStream);
                                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                                return sb3;
                            } catch (Throwable th4) {
                                th = th4;
                                byteArrayInputStream2 = bufferedReader2;
                                FileUtils.closeIO(byteArrayInputStream2, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    try {
                        c11 = 1;
                        try {
                            inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader2);
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            try {
                                for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                                    if (sb4.length() > 0) {
                                        sb4.append('\n');
                                    }
                                    sb4.append(readLine2);
                                }
                                FileUtils.closeIO(new Closeable[]{bufferedReader, inputStreamReader2});
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(i.a("005k6fjfjgefj"), sb4.toString());
                                hashMap2.put(i.a("006(hi=f1fh?fAfehi"), Integer.valueOf(responseCode));
                                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                            } catch (Throwable th8) {
                                th = th8;
                                byteArrayInputStream2 = bufferedReader;
                                Closeable[] closeableArr = new Closeable[2];
                                closeableArr[0] = byteArrayInputStream2;
                                closeableArr[c11] = inputStreamReader2;
                                FileUtils.closeIO(closeableArr);
                                throw th;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            inputStreamReader2 = null;
                            Closeable[] closeableArr2 = new Closeable[2];
                            closeableArr2[0] = byteArrayInputStream2;
                            closeableArr2[c11] = inputStreamReader2;
                            FileUtils.closeIO(closeableArr2);
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        c11 = 1;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                str2 = str;
                byteArrayInputStream2 = byteArrayInputStream;
                r17 = str2;
                connection.disconnect();
                Closeable[] closeableArr3 = new Closeable[2];
                closeableArr3[0] = byteArrayInputStream2;
                closeableArr3[r17] = outputStream;
                FileUtils.closeIO(closeableArr3);
                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                throw th;
            }
        } catch (Throwable th12) {
            th = th12;
            r17 = 1;
            outputStream = null;
        }
    }

    @Deprecated
    public String httpPut(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpPut(str, kvPairsToObjHashMap(arrayList), kVPair, arrayList2, networkTimeOut, null);
    }

    @Deprecated
    public String jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        jsonPost(str, arrayList, arrayList2, networkTimeOut, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.2
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode == 201) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                }
                                FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                hashMap.put(i.a("003.fjZk!hi"), sb2.toString());
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                FileUtils.closeIO(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                }
                                FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(i.a("005kMfjfjgefj"), sb3.toString());
                                hashMap2.put(i.a("006PhiKf_fh=fLfehi"), Integer.valueOf(responseCode));
                                throw new Throwable(new Hashon().fromHashMap(hashMap2));
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = bufferedReader3;
                                FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        });
        if (hashMap.containsKey(i.a("003WfjPk(hi"))) {
            return (String) hashMap.get(i.a("003UfjNk:hi"));
        }
        return null;
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, kvPairsToStrHashMap(arrayList), rawNetworkCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawPost(str, arrayList, hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f A[Catch: all -> 0x022c, TryCatch #7 {all -> 0x022c, blocks: (B:110:0x0222, B:115:0x024f, B:117:0x0255, B:119:0x025b, B:120:0x025e, B:124:0x026c, B:125:0x027b, B:131:0x023f), top: B:109:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String downloadCache(android.content.Context r21, java.lang.String r22, java.lang.String r23, boolean r24, com.mob.tools.network.NetworkHelper.NetworkTimeOut r25, com.mob.tools.network.FileDownloadListener r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.network.NetworkHelper.downloadCache(android.content.Context, java.lang.String, java.lang.String, boolean, com.mob.tools.network.NetworkHelper$NetworkTimeOut, com.mob.tools.network.FileDownloadListener):java.lang.String");
    }

    public String httpGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        NetworkTimeOut networkTimeOut = new NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 10000;
        return httpGetNew(str, hashMap, hashMap2, networkTimeOut);
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i11, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(i.a("010^ihgefmfmEk-fiCfMfggefm"), "Keep-Alive");
        if (arrayList2 == null || arrayList2.size() <= 0) {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        } else {
            textPostHTTPPart = getFilePostHTTPPart(connection, str, arrayList, arrayList2);
            if (i11 >= 0) {
                connection.setChunkedStreamingMode(i11);
            }
        }
        if (arrayList3 != null) {
            Iterator<KVPair<String>> it = arrayList3.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            inputStream = textPostHTTPPart.toInputStream();
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                    connection.disconnect();
                } finally {
                }
            }
            MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th3) {
            th = th3;
            FileUtils.closeIO(inputStream, outputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public String httpPut(String str, HashMap<String, Object> hashMap, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, OnReadListener onReadListener) throws Throwable {
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPut: " + str);
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = str + "?" + requestParamsToUrl;
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestMethod(Net.a.f11465d);
        connection.setRequestProperty("Content-Type", "application/octet-stream");
        setHeader(connection, kvPairsToStrHashMap(arrayList));
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                FilePart filePart = new FilePart();
                if (onReadListener != null) {
                    filePart.setOnReadListener(onReadListener);
                }
                filePart.setFile(kVPair.value);
                InputStream inputStream2 = filePart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = inputStream2.read(bArr); read > 0; read = inputStream2.read(bArr)) {
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    FileUtils.closeIO(inputStream2, outputStream);
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200 || responseCode == 201) {
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                            try {
                                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                                try {
                                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                        if (sb2.length() > 0) {
                                            sb2.append('\n');
                                        }
                                        sb2.append(readLine);
                                    }
                                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                                    connection.disconnect();
                                    String sb3 = sb2.toString();
                                    MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
                                    return sb3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = bufferedReader;
                                    FileUtils.closeIO(inputStream, inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStreamReader = null;
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        try {
                            inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                                try {
                                    for (String readLine2 = bufferedReader2.readLine(); readLine2 != null; readLine2 = bufferedReader2.readLine()) {
                                        if (sb4.length() > 0) {
                                            sb4.append('\n');
                                        }
                                        sb4.append(readLine2);
                                    }
                                    FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put(i.a("005k0fjfjgefj"), sb4.toString());
                                    hashMap2.put(i.a("006_hi$f-fh'f*fehi"), Integer.valueOf(responseCode));
                                    throw new Throwable(new Hashon().fromHashMap(hashMap2));
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream = bufferedReader2;
                                    FileUtils.closeIO(inputStream, inputStreamReader2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            inputStreamReader2 = null;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = inputStream2;
                    FileUtils.closeIO(inputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            outputStream = null;
        }
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, kvPairsToStrHashMap(arrayList), httpResponseCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, int i11, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawPost(str, kvPairsToStrHashMap(arrayList), hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new HashMap<>(), rawNetworkCallback, networkTimeOut);
    }

    public void rawPost(String str, HashMap<String, String> hashMap, HTTPPart hTTPPart, int i11, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("hptr: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        if (i11 >= 0) {
            connection.setChunkedStreamingMode(0);
        }
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = hTTPPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                FileUtils.closeIO(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                FileUtils.closeIO(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public void rawGet(String str, HashMap<String, String> hashMap, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStreamReader inputStreamReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("rawGet: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            if (rawNetworkCallback != null) {
                rawNetworkCallback.onResponse(connection.getInputStream());
            }
            connection.disconnect();
            MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                try {
                    for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                    }
                    FileUtils.closeIO(bufferedReader2, inputStreamReader);
                    connection.disconnect();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(i.a("005kFfjfjgefj"), sb2.toString());
                    hashMap2.put(i.a("0060hi[f6fh%fXfehi"), Integer.valueOf(responseCode));
                    throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
    }

    @Deprecated
    private void jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) throws Throwable {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        jsonPost(str, hashMap, arrayList2, networkTimeOut, httpResponseCallback);
    }

    @Deprecated
    public void jsonPost(String str, HashMap<String, Object> hashMap, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("jsonPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestProperty(e.f10902f, r0.f68791f);
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(new Hashon().fromHashMap(hashMap));
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                FileUtils.closeIO(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th2) {
                th = th2;
                FileUtils.closeIO(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("rawpost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = hTTPPart.toInputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                if (rawNetworkCallback != null) {
                    InputStream inputStream3 = connection.getInputStream();
                    try {
                        rawNetworkCallback.onResponse(inputStream3);
                        FileUtils.closeIO(inputStream3);
                        connection.disconnect();
                    } finally {
                    }
                } else {
                    connection.disconnect();
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            try {
                inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(readLine);
                }
                FileUtils.closeIO(bufferedReader, inputStreamReader);
                connection.disconnect();
                HashMap hashMap = new HashMap();
                hashMap.put(i.a("005k>fjfjgefj"), sb2.toString());
                hashMap.put(i.a("0068hi'f1fh@fYfehi"), Integer.valueOf(responseCode));
                throw new Throwable(new Hashon().fromHashMap(hashMap));
            } catch (Throwable th6) {
                th = th6;
                inputStream2 = bufferedReader;
                FileUtils.closeIO(inputStream2, inputStreamReader);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream2 = inputStream;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    public void rawGet(String str, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new HashMap<>(), httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, HashMap<String, String> hashMap, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("rawGet: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        if (connection.getResponseCode() == 301) {
            rawGet(connection.getHeaderField(i.a("0086gmgefifhTfVfggefm")), new HashMap<>(), httpResponseCallback, networkTimeOut);
        } else if (httpResponseCallback != null) {
            try {
                httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                connection.disconnect();
            } finally {
            }
        }
        MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i11, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(i.a("010Hihgefmfm=k9fi?f]fggefm"), "Keep-Alive");
        if (bArr != null && bArr.length > 0) {
            textPostHTTPPart = getDataPostHttpPart(connection, str, bArr);
            if (i11 >= 0) {
                connection.setChunkedStreamingMode(i11);
            }
        } else {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        }
        if (arrayList2 != null) {
            Iterator<KVPair<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = textPostHTTPPart.toInputStream();
                byte[] bArr2 = new byte[65536];
                for (int read = inputStream.read(bArr2); read > 0; read = inputStream.read(bArr2)) {
                    outputStream.write(bArr2, 0, read);
                }
                outputStream.flush();
                FileUtils.closeIO(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th2) {
                th = th2;
                FileUtils.closeIO(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, int i11, NetworkTimeOut networkTimeOut) throws Throwable {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, i11, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.5
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                }
                                FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                hashMap.put("resp", sb2.toString());
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                FileUtils.closeIO(bufferedReader, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            try {
                                for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                }
                                FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(i.a("005k_fjfjgefj"), sb3.toString());
                                hashMap2.put(i.a("006LhiBfJfhMf@fehi"), Integer.valueOf(responseCode));
                                throw new Throwable(new Hashon().fromHashMap(hashMap2));
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = bufferedReader3;
                                FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, int i11, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(i.a("0106ihgefmfm$k+fi fKfggefm"), "Keep-Alive");
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        InputStream inputStream = null;
        stringPart.append(null);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
                byte[] bArr = new byte[65536];
                for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                    outputStream.write(bArr, 0, read);
                }
                outputStream.flush();
                FileUtils.closeIO(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th2) {
                th = th2;
                FileUtils.closeIO(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }
}
