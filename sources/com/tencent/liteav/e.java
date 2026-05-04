package com.tencent.liteav;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f43540a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f43541b = "";

    /* renamed from: c, reason: collision with root package name */
    private int f43542c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f43543d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f43544e = "";

    /* renamed from: f, reason: collision with root package name */
    private long f43545f = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(long j11);
    }

    public long a() {
        return System.currentTimeMillis() - this.f43545f;
    }

    public String a(long j11) {
        String format = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(this.f43545f + (j11 * 1000)));
        int i11 = this.f43542c;
        if (i11 < 0) {
            return String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=%d", this.f43540a, this.f43544e, this.f43541b, Long.valueOf(((System.currentTimeMillis() - this.f43545f) - j11) / 1000));
        }
        return String.format("http://%s/%s/%s/timeshift.m3u8?starttime=%s&appid=%s&txKbps=0", this.f43540a, Integer.valueOf(i11), this.f43541b, format, this.f43543d);
    }

    public int a(final String str, final String str2, final int i11, final a aVar) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        String appID = TXCCommonUtil.getAppID();
        this.f43543d = appID;
        if (TextUtils.isEmpty(appID)) {
            return -2;
        }
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.e.1
            @Override // java.lang.Runnable
            public void run() {
                e.this.f43545f = System.currentTimeMillis();
                String str3 = "";
                e.this.f43541b = "";
                e.this.f43542c = i11;
                e.this.f43540a = str2;
                e.this.f43541b = TXCCommonUtil.getStreamIDByStreamUrl(str);
                e.this.f43544e = TXCCommonUtil.getAppNameByStreamUrl(str);
                if (e.this.f43544e == null) {
                    e.this.f43544e = "live";
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e.this.f43542c < 0 ? String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=0", e.this.f43540a, e.this.f43544e, e.this.f43541b) : String.format("http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0", e.this.f43540a, Integer.valueOf(e.this.f43542c), e.this.f43541b, e.this.f43543d)).openConnection();
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("Charsert", "UTF-8");
                    httpURLConnection.setRequestProperty("Content-Type", "text/plain;");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str3 = str3 + readLine;
                    }
                    TXCLog.i("TXCTimeShiftUtil", "prepareSeekTime: receive response, strResponse = " + str3);
                    String a11 = e.this.a(str3);
                    if (a11 != null) {
                        e.this.f43545f = Long.parseLong(a11) * 1000;
                    }
                } catch (Exception e11) {
                    e.this.f43545f = System.currentTimeMillis();
                    TXCLog.e("TXCTimeShiftUtil", "prepareSeekTime error " + e11.toString());
                }
                long currentTimeMillis = System.currentTimeMillis();
                TXCLog.i("TXCTimeShiftUtil", "live start time:" + e.this.f43545f + ",currentTime:" + currentTimeMillis + ",diff:" + (currentTimeMillis - e.this.f43545f));
                final long j11 = currentTimeMillis - e.this.f43545f;
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.e.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.a(j11);
                        }
                    });
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        if (!str.contains("#EXT-TX-TS-START-TIME") || (indexOf = str.indexOf("#EXT-TX-TS-START-TIME:") + 22) <= 0 || (indexOf2 = (substring = str.substring(indexOf)).indexOf("#")) <= 0) {
            return null;
        }
        return substring.substring(0, indexOf2).replaceAll("\r\n", "");
    }
}
