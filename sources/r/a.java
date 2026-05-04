package r;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    public static d a(c cVar) {
        String str = cVar.f82758a;
        Bundle bundle = cVar.f82759b;
        if (bundle != null && bundle.size() != 0 && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (!bundle.isEmpty()) {
                Uri.Builder buildUpon = parse.buildUpon();
                for (String str2 : bundle.keySet()) {
                    buildUpon.appendQueryParameter(str2, String.valueOf(bundle.get(str2)));
                }
                parse = buildUpon.build();
            }
            if (parse != null) {
                str = parse.toString();
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                Bundle bundle2 = new Bundle();
                bundle2.putString("Content-Type", "application/x-www-form-urlencoded");
                c(httpURLConnection, bundle2);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setReadTimeout(cVar.f82764g);
                httpURLConnection.setConnectTimeout(cVar.f82763f);
                httpURLConnection.connect();
                b(httpURLConnection.getOutputStream(), cVar);
                d dVar = new d(httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream());
                httpURLConnection.disconnect();
                return dVar;
            } catch (Exception e11) {
                throw new Throwable(e11.getMessage());
            }
        } catch (Throwable th2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    public static void b(OutputStream outputStream, c cVar) {
        Bundle bundle = cVar.f82760c;
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (String str : bundle.keySet()) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append("&");
            }
            String valueOf = String.valueOf(bundle.get(str));
            try {
                sb2.append(URLEncoder.encode(str, "UTF-8"));
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(valueOf, "UTF-8"));
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
            }
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(sb2.toString().getBytes("UTF-8"));
            dataOutputStream.close();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    public static void c(HttpURLConnection httpURLConnection, Bundle bundle) {
        for (String str : bundle.keySet()) {
            httpURLConnection.addRequestProperty(str, String.valueOf(bundle.get(str)));
        }
    }
}
