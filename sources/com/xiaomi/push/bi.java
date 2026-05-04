package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes8.dex */
public class bi {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f45305a = Pattern.compile("([^\\s;]+)(.*)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f45306b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f45307c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    public static final class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private boolean f45308a;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            int read;
            if (!this.f45308a && (read = super.read(bArr, i11, i12)) != -1) {
                return read;
            }
            this.f45308a = true;
            return -1;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f45309a;

        /* renamed from: a, reason: collision with other field name */
        public Map<String, String> f173a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.f45309a), this.f173a.toString());
        }
    }

    public static int a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.getType();
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static boolean b(Context context) {
        return a(context) >= 0;
    }

    public static boolean c(Context context) {
        NetworkCapabilities networkCapabilities;
        boolean hasCapability;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (Exception unused) {
            }
            if (networkCapabilities != null) {
                hasCapability = networkCapabilities.hasCapability(16);
                return hasCapability && d(context);
            }
        }
        hasCapability = false;
        if (hasCapability) {
            return false;
        }
    }

    public static boolean d(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean e(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && 1 == activeNetworkInfo.getType();
    }

    public static boolean f(Context context) {
        NetworkInfo m5746a = m5746a(context);
        return m5746a != null && m5746a.getType() == 0 && 20 == m5746a.getSubtype();
    }

    public static boolean g(Context context) {
        NetworkInfo m5746a = m5746a(context);
        return m5746a != null && m5746a.getType() == 0 && 13 == m5746a.getSubtype();
    }

    public static boolean h(Context context) {
        NetworkInfo m5746a = m5746a(context);
        if (m5746a == null || m5746a.getType() != 0) {
            return false;
        }
        String subtypeName = m5746a.getSubtypeName();
        if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName)) {
            switch (m5746a.getSubtype()) {
            }
            return false;
        }
        return true;
    }

    public static boolean i(Context context) {
        NetworkInfo m5746a = m5746a(context);
        if (m5746a == null || m5746a.getType() != 0) {
            return false;
        }
        int subtype = m5746a.getSubtype();
        return subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static NetworkInfo m5746a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static bg a(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean z11;
        BufferedReader bufferedReader;
        bg bgVar = new bg();
        try {
            try {
                try {
                    HttpURLConnection m5748a = m5748a(context, m5749a(str));
                    m5748a.setConnectTimeout(10000);
                    m5748a.setReadTimeout(15000);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    m5748a.setRequestMethod(str4);
                    int i11 = 0;
                    if (map != null) {
                        z11 = "gzip".equalsIgnoreCase(map.get("Content-Encoding"));
                        for (String str5 : map.keySet()) {
                            m5748a.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        z11 = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        m5748a.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        OutputStream gZIPOutputStream = z11 ? new GZIPOutputStream(m5748a.getOutputStream()) : m5748a.getOutputStream();
                        try {
                            gZIPOutputStream.write(bytes, 0, bytes.length);
                            gZIPOutputStream.flush();
                            gZIPOutputStream.close();
                        } catch (IOException e11) {
                            e = e11;
                            throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
                        } catch (Throwable th2) {
                            th = th2;
                            throw new IOException(th.getMessage());
                        }
                    }
                    bgVar.f45304a = m5748a.getResponseCode();
                    com.xiaomi.channel.commonutils.logger.b.m5639a("Http POST Response Code: " + bgVar.f45304a);
                    while (true) {
                        String headerFieldKey = m5748a.getHeaderFieldKey(i11);
                        String headerField = m5748a.getHeaderField(i11);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new a(m5748a.getErrorStream())));
                            }
                        } else {
                            bgVar.f172a.put(headerFieldKey, headerField);
                            i11 += 2;
                        }
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new a(m5748a.getInputStream())));
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                String property = System.getProperty("line.separator");
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    stringBuffer.append(readLine);
                    stringBuffer.append(property);
                }
                bgVar.f171a = stringBuffer.toString();
                bufferedReader.close();
                y.a((Closeable) null);
                y.a((Closeable) null);
                return bgVar;
            } catch (IOException e13) {
                e = e13;
                throw new IOException("err while request " + str + ":" + e.getClass().getSimpleName());
            } catch (Throwable th4) {
                th = th4;
                throw new IOException(th.getMessage());
            }
        } finally {
            y.a((Closeable) null);
            y.a((Closeable) str2);
        }
    }

    public static bg a(Context context, String str, Map<String, String> map) {
        return a(context, str, "POST", (Map<String, String>) null, a(map));
    }

    public static InputStream a(Context context, URL url, boolean z11, String str, String str2) {
        return a(context, url, z11, str, str2, null, null);
    }

    public static InputStream a(Context context, URL url, boolean z11, String str, String str2, Map<String, String> map, b bVar) {
        if (context == null) {
            throw new IllegalArgumentException(c90.k.f8409a);
        }
        if (url == null) {
            throw new IllegalArgumentException("url");
        }
        URL url2 = !z11 ? new URL(a(url.toString())) : url;
        try {
            HttpURLConnection.setFollowRedirects(true);
            HttpURLConnection m5748a = m5748a(context, url2);
            m5748a.setConnectTimeout(10000);
            m5748a.setReadTimeout(15000);
            if (!TextUtils.isEmpty(str)) {
                m5748a.setRequestProperty("User-Agent", str);
            }
            if (str2 != null) {
                m5748a.setRequestProperty("Cookie", str2);
            }
            if (map != null) {
                for (String str3 : map.keySet()) {
                    m5748a.setRequestProperty(str3, map.get(str3));
                }
            }
            if (bVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                bVar.f45309a = m5748a.getResponseCode();
                if (bVar.f173a == null) {
                    bVar.f173a = new HashMap();
                }
                int i11 = 0;
                while (true) {
                    String headerFieldKey = m5748a.getHeaderFieldKey(i11);
                    String headerField = m5748a.getHeaderField(i11);
                    if (headerFieldKey == null && headerField == null) {
                        break;
                    }
                    if (!TextUtils.isEmpty(headerFieldKey) && !TextUtils.isEmpty(headerField)) {
                        bVar.f173a.put(headerFieldKey, headerField);
                    }
                    i11++;
                }
            }
            return new a(m5748a.getInputStream());
        } catch (IOException e11) {
            throw new IOException("IOException:" + e11.getClass().getSimpleName());
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m5747a(Context context) {
        if (e(context)) {
            return "wifi";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "";
            }
            return (activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getExtraInfo()).toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context, URL url) {
        return a(context, url, false, null, "UTF-8", null);
    }

    public static String a(Context context, URL url, boolean z11, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = a(context, url, z11, str, str3);
            try {
                StringBuilder sb2 = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 == read) {
                        y.a((Closeable) inputStream);
                        return sb2.toString();
                    }
                    sb2.append(cArr, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                y.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, bn.a(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, Map<String, String> map, File file, String str2) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes("\r\n");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                        dataOutputStream.flush();
                    }
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes(HttpRequest.f17578o);
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes(HttpRequest.f17578o);
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new a(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                String stringBuffer2 = stringBuffer.toString();
                                y.a((Closeable) fileInputStream);
                                y.a(bufferedReader);
                                return stringBuffer2;
                            }
                            stringBuffer.append(readLine);
                        } catch (IOException e11) {
                            e = e11;
                            throw new IOException("IOException:" + e.getClass().getSimpleName());
                        } catch (Throwable th2) {
                            th = th2;
                            throw new IOException(th.getMessage());
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (Throwable th3) {
                    th = th3;
                }
            } finally {
                y.a((Closeable) null);
                y.a((Closeable) file);
            }
        } catch (IOException e13) {
            e = e13;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e11) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("Failed to convert from params map to string: " + e11);
                    com.xiaomi.channel.commonutils.logger.b.m5639a("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static HttpURLConnection m5748a(Context context, URL url) {
        return (HttpURLConnection) (("http".equals(url.getProtocol()) && m5750a(context)) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
    }

    /* renamed from: a, reason: collision with other method in class */
    private static URL m5749a(String str) {
        return new URL(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5750a(Context context) {
        ConnectivityManager connectivityManager;
        if (!"CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso())) {
            return false;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        return !TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && extraInfo.contains("ctwap");
    }
}
