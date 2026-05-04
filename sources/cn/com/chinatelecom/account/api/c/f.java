package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.SSLCertificateSocketFactory;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public abstract class f implements e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8921b = "f";

    /* renamed from: a, reason: collision with root package name */
    protected Context f8922a;

    public f(Context context) {
        this.f8922a = context;
    }

    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                int a11 = cn.com.chinatelecom.account.api.b.c.a(cn.com.chinatelecom.account.api.b.c.b(str));
                Class<?> cls = Class.forName("android.net.ConnectivityManager");
                Class cls2 = Integer.TYPE;
                ((Boolean) cls.getMethod("requestRouteToHost", cls2, cls2).invoke(connectivityManager, 5, Integer.valueOf(a11))).getClass();
            }
        } catch (Throwable th2) {
            cn.com.chinatelecom.account.api.a.a(f8921b, "http doPost > requestUrlToRoute error", th2);
        }
    }

    private boolean b() {
        return cn.com.chinatelecom.account.api.d.g.c(this.f8922a);
    }

    public HttpURLConnection d(String str, String str2, int i11, g gVar) {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((gVar.f8927a == null || !a()) ? url.openConnection() : gVar.f8927a.openConnection(url));
        httpURLConnection.setRequestProperty("accept", "*/*");
        if (i11 == 0) {
            httpURLConnection.setRequestMethod("GET");
        } else {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        httpURLConnection.setConnectTimeout(gVar.a());
        httpURLConnection.setReadTimeout(gVar.b());
        httpURLConnection.setUseCaches(false);
        if (!b() && !a()) {
            httpURLConnection.setInstanceFollowRedirects(false);
        }
        httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
        httpURLConnection.addRequestProperty("reqId", gVar.f8930d);
        httpURLConnection.addRequestProperty("deviceId", cn.com.chinatelecom.account.api.d.d.a(this.f8922a));
        if (TextUtils.isEmpty(str2)) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
        dataOutputStream.write(str2.getBytes("UTF-8"));
        dataOutputStream.flush();
        dataOutputStream.close();
        return httpURLConnection;
    }

    public HttpsURLConnection e(String str, String str2, int i11, g gVar) {
        URL url = new URL(str);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((gVar.f8927a == null || !a()) ? url.openConnection() : gVar.f8927a.openConnection(url));
        httpsURLConnection.setRequestProperty("accept", "*/*");
        if (a(gVar.f8932f, gVar.f8933g)) {
            httpsURLConnection.addRequestProperty("Host", gVar.f8934h);
            a(httpsURLConnection, gVar.f8934h);
        }
        if (i11 == 0) {
            httpsURLConnection.setRequestMethod("GET");
        } else {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
        }
        httpsURLConnection.setConnectTimeout(gVar.a());
        httpsURLConnection.setReadTimeout(gVar.b());
        httpsURLConnection.setUseCaches(false);
        if (!b() && !a()) {
            httpsURLConnection.setInstanceFollowRedirects(false);
        }
        httpsURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
        httpsURLConnection.addRequestProperty("reqId", gVar.f8930d);
        httpsURLConnection.addRequestProperty("deviceId", cn.com.chinatelecom.account.api.d.d.a(this.f8922a));
        if (TextUtils.isEmpty(str2)) {
            httpsURLConnection.connect();
            return httpsURLConnection;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpsURLConnection.getOutputStream()));
        dataOutputStream.write(str2.getBytes("UTF-8"));
        dataOutputStream.flush();
        dataOutputStream.close();
        return httpsURLConnection;
    }

    private void a(HttpsURLConnection httpsURLConnection, final String str) {
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: cn.com.chinatelecom.account.api.c.f.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str2, SSLSession sSLSession) {
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
        });
        httpsURLConnection.setSSLSocketFactory(new SSLSocketFactory() { // from class: cn.com.chinatelecom.account.api.c.f.2
            @Override // javax.net.SocketFactory
            public Socket createSocket(String str2, int i11) {
                return null;
            }

            @Override // javax.net.ssl.SSLSocketFactory
            public String[] getDefaultCipherSuites() {
                return new String[0];
            }

            @Override // javax.net.ssl.SSLSocketFactory
            public String[] getSupportedCipherSuites() {
                return new String[0];
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(String str2, int i11, InetAddress inetAddress, int i12) {
                return null;
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(InetAddress inetAddress, int i11) {
                return null;
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) {
                return null;
            }

            @Override // javax.net.ssl.SSLSocketFactory
            public Socket createSocket(Socket socket, String str2, int i11, boolean z11) {
                SSLCertificateSocketFactory sSLCertificateSocketFactory;
                SSLSocket sSLSocket;
                SSLSocket sSLSocket2 = null;
                try {
                    sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
                    sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, str, i11, z11);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
                    sSLCertificateSocketFactory.setHostname(sSLSocket, str);
                    return sSLSocket;
                } catch (Throwable th3) {
                    th = th3;
                    sSLSocket2 = sSLSocket;
                    th.printStackTrace();
                    return sSLSocket2;
                }
            }
        });
    }

    public boolean a() {
        return true;
    }

    public boolean a(String str) {
        return str.startsWith("https");
    }

    public boolean a(boolean z11, String str) {
        return z11 && str != null;
    }
}
