package com.tencent.liteav.basic.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXHttpRequest {
    private static final int CON_TIMEOUT = 5000;
    private static final int READ_TIMEOUT = 5000;
    private static final String TAG = "TXHttpRequest";
    private long mNativeHttps;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f43417a = 1;

        /* renamed from: b, reason: collision with root package name */
        public String f43418b = "";

        /* renamed from: c, reason: collision with root package name */
        public byte[] f43419c = "".getBytes();

        /* renamed from: d, reason: collision with root package name */
        public Map<String, String> f43420d;
    }

    public TXHttpRequest(long j11) {
        this.mNativeHttps = j11;
    }

    public static b downloadFileInternal(String str, String str2) {
        HttpsURLConnection httpsURLConnection;
        b bVar = new b();
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.setReadTimeout(5000);
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("download file failed with " + responseCode);
            }
            bVar.f43420d = getHeaders(httpsURLConnection);
            c.a(httpsURLConnection.getInputStream(), str2);
            bVar.f43417a = 0;
            httpsURLConnection.disconnect();
            return bVar;
        } catch (Exception e12) {
            e = e12;
            httpsURLConnection2 = httpsURLConnection;
            bVar.f43418b = e.getMessage();
            TXCLog.e(TAG, "download file failed. " + str, e);
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            return bVar;
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection2 = httpsURLConnection;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
            throw th;
        }
    }

    private static Map<String, String> getHeaders(HttpsURLConnection httpsURLConnection) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : httpsURLConnection.getHeaderFields().entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return hashMap;
    }

    public static b getHttpsPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.i(TAG, "getHttpsPostRsp->request: " + str);
        TXCLog.i(TAG, "getHttpsPostRsp->data: " + bArr.length);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str.replace(" ", "%20")).openConnection();
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setConnectTimeout(5000);
        httpsURLConnection.setReadTimeout(5000);
        httpsURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpsURLConnection.getResponseCode();
        b bVar = new b();
        if (responseCode != 200) {
            TXCLog.i(TAG, "getHttpsPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byteArrayOutputStream.flush();
        bVar.f43420d = new HashMap();
        for (Map.Entry<String, List<String>> entry2 : httpsURLConnection.getHeaderFields().entrySet()) {
            if (!TextUtils.isEmpty(entry2.getKey())) {
                bVar.f43420d.put(entry2.getKey(), entry2.getValue().get(0));
            }
        }
        inputStream.close();
        httpsURLConnection.disconnect();
        bVar.f43419c = byteArrayOutputStream.toByteArray();
        bVar.f43417a = 0;
        TXCLog.i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnRecvMessage(long j11, int i11, byte[] bArr, Map<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyResult(Handler handler, final b bVar) {
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.basic.util.TXHttpRequest.2
                @Override // java.lang.Runnable
                public void run() {
                    TXHttpRequest tXHttpRequest = TXHttpRequest.this;
                    long j11 = tXHttpRequest.mNativeHttps;
                    b bVar2 = bVar;
                    tXHttpRequest.nativeOnRecvMessage(j11, bVar2.f43417a, bVar2.f43419c, bVar2.f43420d);
                }
            });
        } else {
            nativeOnRecvMessage(this.mNativeHttps, bVar.f43417a, bVar.f43419c, bVar.f43420d);
        }
    }

    public void asyncPostRequest(Map<String, String> map, byte[] bArr, byte[] bArr2) {
        new a(this, map).execute(bArr, bArr2);
    }

    public int downloadFile(final String str, final String str2) {
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Looper myLooper = Looper.myLooper();
        final Handler handler = myLooper == null ? null : new Handler(myLooper);
        newSingleThreadExecutor.submit(new Runnable() { // from class: com.tencent.liteav.basic.util.TXHttpRequest.1
            @Override // java.lang.Runnable
            public void run() {
                TXHttpRequest.this.notifyResult(handler, TXHttpRequest.downloadFileInternal(str, str2));
                newSingleThreadExecutor.shutdown();
            }
        });
        return 0;
    }

    public int sendHttpsRequest(Map<String, String> map, String str, byte[] bArr) {
        TXCLog.i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(map, str.getBytes(), bArr);
        return 0;
    }

    public int sendHttpsRequest(String str, byte[] bArr) {
        TXCLog.i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(null, str.getBytes(), bArr);
        return 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends AsyncTask<byte[], Void, b> {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<TXHttpRequest> f43411a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f43412b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f43413c;

        public a(TXHttpRequest tXHttpRequest, Map<String, String> map) {
            this.f43412b = null;
            this.f43413c = map;
            this.f43411a = new WeakReference<>(tXHttpRequest);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.f43412b = new Handler(myLooper);
            } else {
                this.f43412b = null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b doInBackground(byte[]... bArr) {
            b bVar = new b();
            try {
                if (new String(bArr[0]).startsWith("https")) {
                    bVar = TXHttpRequest.getHttpsPostRsp(this.f43413c, new String(bArr[0]), bArr[1]);
                    bVar.f43417a = 0;
                } else {
                    bVar.f43417a = 1;
                    bVar.f43418b = "http request not support";
                }
            } catch (Exception e11) {
                bVar.f43418b = e11.toString();
                bVar.f43417a = 1;
            }
            TXCLog.i(TXHttpRequest.TAG, "TXPostRequest->result: " + bVar.f43417a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bVar.f43418b);
            return bVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(final b bVar) {
            super.onPostExecute(bVar);
            final TXHttpRequest tXHttpRequest = this.f43411a.get();
            if (tXHttpRequest == null || tXHttpRequest.mNativeHttps == 0) {
                return;
            }
            Handler handler = this.f43412b;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.basic.util.TXHttpRequest.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCLog.i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + bVar.f43417a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bVar.f43418b);
                        TXHttpRequest tXHttpRequest2 = tXHttpRequest;
                        long j11 = tXHttpRequest2.mNativeHttps;
                        b bVar2 = bVar;
                        tXHttpRequest2.nativeOnRecvMessage(j11, bVar2.f43417a, bVar2.f43419c, bVar2.f43420d);
                    }
                });
                return;
            }
            TXCLog.i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + bVar.f43417a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bVar.f43418b);
            tXHttpRequest.nativeOnRecvMessage(tXHttpRequest.mNativeHttps, bVar.f43417a, bVar.f43419c, bVar.f43420d);
        }
    }
}
