package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import c60.c;
import com.alipay.sdk.m.k.b;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.ClientError;
import com.android.volley.Header;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class NetworkUtility {
    private static final int SLOW_REQUEST_THRESHOLD_MS = 3000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RetryInfo {
        private final VolleyError errorToRetry;
        private final String logPrefix;

        private RetryInfo(String str, VolleyError volleyError) {
            this.logPrefix = str;
            this.errorToRetry = volleyError;
        }
    }

    private NetworkUtility() {
    }

    public static void attemptRetryOnException(Request<?> request, RetryInfo retryInfo) throws VolleyError {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(retryInfo.errorToRetry);
            request.addMarker(String.format("%s-retry [timeout=%s]", retryInfo.logPrefix, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e11) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", retryInfo.logPrefix, Integer.valueOf(timeoutMs)));
            throw e11;
        }
    }

    public static NetworkResponse getNotModifiedNetworkResponse(Request<?> request, long j11, List<Header> list) {
        Cache.Entry cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new NetworkResponse(304, (byte[]) null, true, j11, list);
        }
        return new NetworkResponse(304, cacheEntry.data, true, j11, HttpHeaderParser.combineHeaders(list, cacheEntry));
    }

    public static byte[] inputStreamToBytes(InputStream inputStream, int i11, ByteArrayPool byteArrayPool) throws IOException {
        byte[] bArr;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(byteArrayPool, i11);
        try {
            bArr = byteArrayPool.getBuf(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    byteArrayPool.returnBuf(bArr);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
            }
            byteArrayPool.returnBuf(bArr);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    public static void logSlowRequests(long j11, Request<?> request, byte[] bArr, int i11) {
        if (VolleyLog.DEBUG || j11 > 3000) {
            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(j11), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i11), Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount()));
        }
    }

    public static RetryInfo shouldRetryException(Request<?> request, IOException iOException, long j11, @Nullable HttpResponse httpResponse, @Nullable byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new RetryInfo("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + request.getUrl(), iOException);
        }
        if (httpResponse == null) {
            if (!request.shouldRetryConnectionErrors()) {
                throw new NoConnectionError(iOException);
            }
            return new RetryInfo(c.f8163j, new NoConnectionError());
        }
        int statusCode = httpResponse.getStatusCode();
        VolleyLog.e("Unexpected response code %d for %s", Integer.valueOf(statusCode), request.getUrl());
        if (bArr == null) {
            return new RetryInfo("network", new NetworkError());
        }
        NetworkResponse networkResponse = new NetworkResponse(statusCode, bArr, false, SystemClock.elapsedRealtime() - j11, httpResponse.getHeaders());
        if (statusCode == 401 || statusCode == 403) {
            return new RetryInfo(b.f10657n, new AuthFailureError(networkResponse));
        }
        if (statusCode >= 400 && statusCode <= 499) {
            throw new ClientError(networkResponse);
        }
        if (statusCode < 500 || statusCode > 599 || !request.shouldRetryServerErrors()) {
            throw new ServerError(networkResponse);
        }
        return new RetryInfo("server", new ServerError(networkResponse));
    }
}
