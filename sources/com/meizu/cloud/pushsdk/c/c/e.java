package com.meizu.cloud.pushsdk.c.c;

import android.net.TrafficStats;
import com.badlogic.gdx.Net;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes7.dex */
public class e implements a {
    private HttpURLConnection b(i iVar) throws IOException {
        URL url = new URL(iVar.a().toString());
        if (MinSdkChecker.isSupportNotificationChannel()) {
            TrafficStats.setThreadStatsTag(2006537699);
        }
        HttpURLConnection a11 = a(url);
        a11.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
        a11.setReadTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
        a11.setUseCaches(false);
        a11.setDoInput(true);
        return a11;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.a
    public k a(i iVar) throws IOException {
        HttpURLConnection b11 = b(iVar);
        for (String str : iVar.d().b()) {
            String a11 = iVar.a(str);
            com.meizu.cloud.pushsdk.c.a.a.b("current header name " + str + " value " + a11);
            b11.addRequestProperty(str, a11);
        }
        a(b11, iVar);
        return new k.a().a(b11.getResponseCode()).a(iVar.d()).a(b11.getResponseMessage()).a(iVar).a(a(b11)).a();
    }

    private static l a(final HttpURLConnection httpURLConnection) throws IOException {
        if (!httpURLConnection.getDoInput()) {
            return null;
        }
        final com.meizu.cloud.pushsdk.c.g.d a11 = com.meizu.cloud.pushsdk.c.g.g.a(com.meizu.cloud.pushsdk.c.g.g.a(a(httpURLConnection.getResponseCode()) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()));
        return new l() { // from class: com.meizu.cloud.pushsdk.c.c.e.1
            @Override // com.meizu.cloud.pushsdk.c.c.l
            public com.meizu.cloud.pushsdk.c.g.d a() {
                return a11;
            }
        };
    }

    private static void b(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        j e11 = iVar.e();
        if (e11 != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", e11.a().toString());
            com.meizu.cloud.pushsdk.c.g.c a11 = com.meizu.cloud.pushsdk.c.g.g.a(com.meizu.cloud.pushsdk.c.g.g.a(httpURLConnection.getOutputStream()));
            e11.a(a11);
            a11.close();
        }
    }

    public HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        int c11 = iVar.c();
        if (c11 == 0) {
            httpURLConnection.setRequestMethod("GET");
            return;
        }
        if (c11 == 1) {
            httpURLConnection.setRequestMethod("POST");
            b(httpURLConnection, iVar);
            return;
        }
        if (c11 == 2) {
            httpURLConnection.setRequestMethod(Net.a.f11465d);
            b(httpURLConnection, iVar);
        } else {
            if (c11 == 3) {
                httpURLConnection.setRequestMethod(Net.a.f11467f);
                return;
            }
            if (c11 == 4) {
                httpURLConnection.setRequestMethod(Net.a.f11462a);
            } else {
                if (c11 != 5) {
                    throw new IllegalStateException("Unknown method type.");
                }
                httpURLConnection.setRequestMethod("PATCH");
                b(httpURLConnection, iVar);
            }
        }
    }

    public static boolean a(int i11) {
        return i11 >= 200 && i11 < 300;
    }
}
