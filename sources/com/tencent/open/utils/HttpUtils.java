package com.tencent.open.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IRequestListener;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.zip.ZipException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class HttpUtils {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NetworkUnavailableException extends Exception {
        public static final String ERROR_INFO = "network unavailable";

        public NetworkUnavailableException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f44569a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44570b;

        private a(String str, int i11) {
            this.f44569a = str;
            this.f44570b = i11;
        }
    }

    private HttpUtils() {
    }

    private static void a(Context context, QQToken qQToken, String str) {
        if (str.indexOf("add_share") > -1 || str.indexOf("upload_pic") > -1 || str.indexOf("add_topic") > -1 || str.indexOf("set_user_face") > -1 || str.indexOf("add_t") > -1 || str.indexOf("add_pic_t") > -1 || str.indexOf("add_pic_url") > -1 || str.indexOf("add_video") > -1) {
            com.tencent.connect.a.a.a(context, qQToken, "requireApi", str);
        }
    }

    private static Map<String, byte[]> b(Bundle bundle) {
        HashMap hashMap = new HashMap(0);
        if (bundle != null && bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof byte[]) {
                    hashMap.put(str, (byte[]) obj);
                }
            }
        }
        return hashMap;
    }

    public static String encodeUrl(Bundle bundle) {
        return encodeUrl(a(bundle));
    }

    public static int getErrorCodeFromException(IOException iOException) {
        if (iOException instanceof CharConversionException) {
            return -20;
        }
        if (iOException instanceof MalformedInputException) {
            return -21;
        }
        if (iOException instanceof UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof EOFException) {
            return -26;
        }
        if (iOException instanceof FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof HttpRetryException) {
            return -29;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof MalformedURLException) {
            return -3;
        }
        if (iOException instanceof InvalidClassException) {
            return -33;
        }
        if (iOException instanceof InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof NotActiveException) {
            return -35;
        }
        if (iOException instanceof NotSerializableException) {
            return -36;
        }
        if (iOException instanceof OptionalDataException) {
            return -37;
        }
        if (iOException instanceof StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof ProtocolException) {
            return -40;
        }
        if (iOException instanceof SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof SSLKeyException) {
            return -42;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof BindException) {
            return -45;
        }
        if (iOException instanceof ConnectException) {
            return -46;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof SyncFailedException) {
            return -49;
        }
        if (iOException instanceof UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof UnknownHostException) {
            return -51;
        }
        if (iOException instanceof UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof UnsupportedEncodingException) {
            return -53;
        }
        return iOException instanceof ZipException ? -54 : -2;
    }

    public static a getProxy(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.getType() == 0) {
            String b11 = b(context);
            int a11 = a(context);
            if (!TextUtils.isEmpty(b11) && a11 >= 0) {
                return new a(b11, a11);
            }
        }
        return null;
    }

    public static JSONObject request(QQToken qQToken, Context context, String str, Bundle bundle, String str2) throws IOException, JSONException, NetworkUnavailableException, HttpStatusException {
        String str3;
        String str4;
        int i11;
        long j11;
        long j12;
        int i12;
        SLog.i("openSDK_LOG.HttpUtils", "OpenApi request");
        if (!m.b(context)) {
            throw new NetworkUnavailableException(NetworkUnavailableException.ERROR_INFO);
        }
        if (str.toLowerCase().startsWith("http")) {
            str3 = str;
            str4 = str3;
        } else {
            str3 = j.a().a(context, "https://openmobile.qq.com/") + str;
            str4 = j.a().a(context, "https://openmobile.qq.com/") + str;
        }
        a(context, qQToken, str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int a11 = i.a(context, qQToken.getAppId()).a("Common_HttpRetryCount");
        SLog.v("OpenConfig_test", "config 1:Common_HttpRetryCount            config_value:" + a11 + "   appid:" + qQToken.getAppId() + "     url:" + str4);
        if (a11 == 0) {
            a11 = 3;
        }
        int i13 = a11;
        SLog.v("OpenConfig_test", "config 1:Common_HttpRetryCount            result_value:" + i13 + "   appid:" + qQToken.getAppId() + "     url:" + str4);
        int i14 = 0;
        JSONObject jSONObject = null;
        while (true) {
            int i15 = i14 + 1;
            try {
                try {
                    try {
                        com.tencent.open.a.g a12 = a(str3, str2, bundle);
                        int d11 = a12.d();
                        SLog.i("openSDK_LOG.HttpUtils", "request statusCode " + d11);
                        if (d11 != 200) {
                            com.tencent.open.b.h.a().a(str4, elapsedRealtime, 0L, 0L, d11);
                            throw new HttpStatusException(d11);
                        }
                        JSONObject d12 = m.d(a12.a());
                        try {
                            try {
                                i12 = d12.getInt("ret");
                            } catch (JSONException unused) {
                                i12 = -4;
                            }
                            jSONObject = d12;
                            i11 = i12;
                            j11 = a12.c();
                            j12 = a12.b();
                            break;
                        } catch (SocketTimeoutException e11) {
                            e = e11;
                            jSONObject = d12;
                            e.printStackTrace();
                            i11 = -8;
                            j11 = 0;
                            j12 = 0;
                            if (i15 >= i13) {
                                com.tencent.open.b.h.a().a(str4, elapsedRealtime, 0L, 0L, -8);
                                throw e;
                            }
                            elapsedRealtime = SystemClock.elapsedRealtime();
                            if (i15 >= i13) {
                                com.tencent.open.b.h.a().a(str4, elapsedRealtime, j11, j12, i11);
                                return jSONObject;
                            }
                            i14 = i15;
                        }
                    } catch (SocketTimeoutException e12) {
                        e = e12;
                    }
                    i14 = i15;
                } catch (JSONException e13) {
                    e13.printStackTrace();
                    com.tencent.open.b.h.a().a(str4, elapsedRealtime, 0L, 0L, -4);
                    throw e13;
                }
            } catch (MalformedURLException e14) {
                e14.printStackTrace();
                com.tencent.open.b.h.a().a(str4, elapsedRealtime, 0L, 0L, -3);
                throw e14;
            } catch (IOException e15) {
                e15.printStackTrace();
                com.tencent.open.b.h.a().a(str4, elapsedRealtime, 0L, 0L, getErrorCodeFromException(e15));
                throw e15;
            }
        }
        com.tencent.open.b.h.a().a(str4, elapsedRealtime, j11, j12, i11);
        return jSONObject;
    }

    public static void requestAsync(final QQToken qQToken, final Context context, final String str, final Bundle bundle, final String str2, final IRequestListener iRequestListener) {
        SLog.i("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
        l.a(new Runnable() { // from class: com.tencent.open.utils.HttpUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject request = HttpUtils.request(QQToken.this, context, str, bundle, str2);
                    IRequestListener iRequestListener2 = iRequestListener;
                    if (iRequestListener2 != null) {
                        iRequestListener2.onComplete(request);
                        SLog.i("openSDK_LOG.HttpUtils", "OpenApi onComplete");
                    }
                } catch (HttpStatusException e11) {
                    IRequestListener iRequestListener3 = iRequestListener;
                    if (iRequestListener3 != null) {
                        iRequestListener3.onHttpStatusException(e11);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onHttpStatusException" + e11.toString());
                    }
                } catch (NetworkUnavailableException e12) {
                    IRequestListener iRequestListener4 = iRequestListener;
                    if (iRequestListener4 != null) {
                        iRequestListener4.onNetworkUnavailableException(e12);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onNetworkUnavailableException" + e12.toString());
                    }
                } catch (MalformedURLException e13) {
                    IRequestListener iRequestListener5 = iRequestListener;
                    if (iRequestListener5 != null) {
                        iRequestListener5.onMalformedURLException(e13);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync MalformedURLException" + e13.toString());
                    }
                } catch (SocketTimeoutException e14) {
                    IRequestListener iRequestListener6 = iRequestListener;
                    if (iRequestListener6 != null) {
                        iRequestListener6.onSocketTimeoutException(e14);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onSocketTimeoutException" + e14.toString());
                    }
                } catch (IOException e15) {
                    IRequestListener iRequestListener7 = iRequestListener;
                    if (iRequestListener7 != null) {
                        iRequestListener7.onIOException(e15);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync IOException" + e15.toString());
                    }
                } catch (JSONException e16) {
                    IRequestListener iRequestListener8 = iRequestListener;
                    if (iRequestListener8 != null) {
                        iRequestListener8.onJSONException(e16);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync JSONException" + e16.toString());
                    }
                } catch (Exception e17) {
                    IRequestListener iRequestListener9 = iRequestListener;
                    if (iRequestListener9 != null) {
                        iRequestListener9.onUnknowException(e17);
                        SLog.e("openSDK_LOG.HttpUtils", "OpenApi requestAsync onUnknowException" + e17.toString());
                    }
                }
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HttpStatusException extends Exception {
        public static final String ERROR_INFO = "http status code error:";
        public final int statusCode;

        public HttpStatusException(String str) {
            super(str);
            this.statusCode = -1;
        }

        public HttpStatusException(int i11) {
            super(ERROR_INFO + i11);
            this.statusCode = i11;
        }
    }

    public static String encodeUrl(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = true;
            for (String str : map.keySet()) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append("&");
                }
                sb2.append(URLEncoder.encode(str));
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(map.get(str)));
            }
            return sb2.toString();
        }
        return "";
    }

    private static String b(Context context) {
        return System.getProperty("http.proxyHost");
    }

    private static com.tencent.open.a.g a(String str, String str2, Bundle bundle) throws IOException {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        if (str2.equalsIgnoreCase("GET")) {
            Map<String, String> a11 = a(bundle2);
            Bundle b11 = com.tencent.open.log.d.b(bundle2);
            if (b11 != bundle2) {
                SLog.i("openSDK_LOG.HttpUtils", "-->openUrl encodedParam =" + b11.toString() + " -- url = " + str);
            } else {
                SLog.i("openSDK_LOG.HttpUtils", "-->openUrl encodedParam =" + a11.toString() + " -- url = " + str);
            }
            return com.tencent.open.a.f.a().a(str, a11);
        }
        if (str2.equalsIgnoreCase("POST")) {
            Map<String, String> a12 = a(bundle2);
            Map<String, byte[]> b12 = b(bundle2);
            if (b12 != null && b12.size() != 0) {
                SLog.w("openSDK_LOG.HttpUtils", "openUrl: has binary " + b12.size());
                return com.tencent.open.a.f.a().a(str, a12, b12);
            }
            return com.tencent.open.a.f.a().b(str, a12);
        }
        SLog.e("openSDK_LOG.HttpUtils", "openUrl: http method " + str2 + " is not supported.");
        throw new IOException("http method is not supported.");
    }

    private static Map<String, String> a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null && bundle.size() != 0) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (!(obj instanceof String) && !(obj instanceof String[])) {
                    SLog.w("openSDK_LOG.HttpUtils", "parseBundleToMap: the type " + obj.getClass() + " is unsupported");
                } else if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < strArr.length; i11++) {
                        if (i11 != 0) {
                            sb2.append(",");
                        }
                        sb2.append(strArr[i11]);
                    }
                    hashMap.put(str, sb2.toString());
                } else {
                    hashMap.put(str, (String) obj);
                }
            }
        }
        return hashMap;
    }

    private static int a(Context context) {
        String property = System.getProperty("http.proxyPort");
        if (TextUtils.isEmpty(property)) {
            return -1;
        }
        try {
            return Integer.parseInt(property);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
