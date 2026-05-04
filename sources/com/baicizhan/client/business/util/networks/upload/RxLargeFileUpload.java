package com.baicizhan.client.business.util.networks.upload;

import android.text.TextUtils;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import qb.c;
import qb0.g;
import rx.c;
import vb0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RxLargeFileUpload {
    public static final String TAG = "RxLargeFileUpload";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Response {
        public int code;
        public String msg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Response realUpload(final String url, final File file, final Map<String, String> head, final Map<String, String> formData, String fileName, String contentType, boolean needDelete, g<? super Integer> subscriber) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        httpURLConnection.setChunkedStreamingMode(131072);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.setReadTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
        if (head != null && !head.isEmpty()) {
            for (Map.Entry<String, String> entry : head.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=******");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        if (formData != null && !formData.isEmpty()) {
            for (Map.Entry<String, String> entry2 : formData.entrySet()) {
                dataOutputStream.writeBytes(HttpRequest.f17578o + "******\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + entry2.getKey() + "\"; \r\n");
                dataOutputStream.writeBytes("\r\n");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(entry2.getValue());
                sb2.append("\r\n");
                dataOutputStream.writeBytes(sb2.toString());
            }
        }
        dataOutputStream.writeBytes(HttpRequest.f17578o + "******\r\n");
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + fileName + "\"; filename=\"" + file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf("/") + 1) + "\"\r\n");
        if (!TextUtils.isEmpty(contentType)) {
            dataOutputStream.writeBytes("Content-Type:" + contentType + "\r\n");
        }
        dataOutputStream.writeBytes("\r\n");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        long length = file.length();
        long j11 = 0;
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            }
            dataOutputStream.write(bArr, 0, read);
            j11 += read;
            if (subscriber != null) {
                subscriber.onNext(Integer.valueOf((int) ((j11 / length) * 100.0f)));
            }
        }
        fileInputStream.close();
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes(HttpRequest.f17578o + "******" + HttpRequest.f17578o + "\r\n");
        dataOutputStream.flush();
        Response response = new Response();
        int responseCode = httpURLConnection.getResponseCode();
        response.code = responseCode;
        InputStream inputStream = responseCode == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            stringBuffer.append(readLine);
        }
        response.msg = stringBuffer.toString();
        c.i(TAG, "%d , %s", Integer.valueOf(response.code), response.msg);
        dataOutputStream.close();
        inputStream.close();
        if (needDelete) {
            file.delete();
        }
        return response;
    }

    public static rx.c<Integer> upload(String url, File file, boolean needDelete) {
        return upload(url, file, null, needDelete);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadLog(final String url, final File file, final Map<String, String> head, boolean needDelete, g<? super Integer> subscriber) throws Exception {
        realUpload(url, file, head, null, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_UPLOAD_LOG_FILE, null, needDelete, subscriber);
    }

    public static rx.c<Integer> upload(final String url, final File file, final Map<String, String> head, final boolean needDelete) {
        return rx.c.j1(new c.a<Integer>() { // from class: com.baicizhan.client.business.util.networks.upload.RxLargeFileUpload.1
            @Override // wb0.b
            public void call(g<? super Integer> subscriber) {
                try {
                    RxLargeFileUpload.uploadLog(url, file, head, needDelete, subscriber);
                    subscriber.onCompleted();
                    subscriber.onCompleted();
                } catch (Exception e11) {
                    throw a.c(e11);
                }
            }
        }).w5(bc0.c.e());
    }

    public static rx.c<Response> upload(final String url, final String path, final String formFileName, final String formFileContentType, final Map<String, String> head, final Map<String, String> formData) {
        return rx.c.j1(new c.a<Response>() { // from class: com.baicizhan.client.business.util.networks.upload.RxLargeFileUpload.2
            @Override // wb0.b
            public void call(g<? super Response> subscriber) {
                File file = new File(path);
                try {
                } catch (Exception e11) {
                    qb.c.c(RxLargeFileUpload.TAG, "", e11);
                    subscriber.onError(e11);
                }
                if (!file.exists()) {
                    throw new RuntimeException("file not exist");
                }
                subscriber.onNext(RxLargeFileUpload.realUpload(url, file, head, formData, formFileName, formFileContentType, false, null));
                subscriber.onCompleted();
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
    }
}
