package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Header;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class BasicNetwork implements Network {
    private static final int DEFAULT_POOL_SIZE = 4096;
    private final BaseHttpStack mBaseHttpStack;

    @Deprecated
    protected final HttpStack mHttpStack;
    protected final ByteArrayPool mPool;

    @Deprecated
    public BasicNetwork(HttpStack httpStack) {
        this(httpStack, new ByteArrayPool(4096));
    }

    @Deprecated
    public static Map<String, String> convertHeaders(Header[] headerArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i11 = 0; i11 < headerArr.length; i11++) {
            treeMap.put(headerArr[i11].getName(), headerArr[i11].getValue());
        }
        return treeMap;
    }

    @Override // com.android.volley.Network
    public NetworkResponse performRequest(Request<?> request) throws VolleyError {
        IOException iOException;
        HttpResponse httpResponse;
        byte[] bArr;
        Request<?> request2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                HttpResponse executeRequest = this.mBaseHttpStack.executeRequest(request, HttpHeaderParser.getCacheHeaders(request.getCacheEntry()));
                try {
                    int statusCode = executeRequest.getStatusCode();
                    List<Header> headers = executeRequest.getHeaders();
                    if (statusCode == 304) {
                        return NetworkUtility.getNotModifiedNetworkResponse(request, SystemClock.elapsedRealtime() - elapsedRealtime, headers);
                    }
                    InputStream content = executeRequest.getContent();
                    byte[] inputStreamToBytes = content != null ? NetworkUtility.inputStreamToBytes(content, executeRequest.getContentLength(), this.mPool) : new byte[0];
                    try {
                        NetworkUtility.logSlowRequests(SystemClock.elapsedRealtime() - elapsedRealtime, request, inputStreamToBytes, statusCode);
                        if (statusCode < 200 || statusCode > 299) {
                            throw new IOException();
                        }
                        return new NetworkResponse(statusCode, inputStreamToBytes, false, SystemClock.elapsedRealtime() - elapsedRealtime, headers);
                    } catch (IOException e11) {
                        e = e11;
                        request2 = request;
                        httpResponse = executeRequest;
                        bArr = inputStreamToBytes;
                        iOException = e;
                        NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, iOException, elapsedRealtime, httpResponse, bArr));
                        request = request2;
                    }
                } catch (IOException e12) {
                    e = e12;
                    bArr = null;
                    httpResponse = executeRequest;
                    request2 = request;
                }
            } catch (IOException e13) {
                iOException = e13;
                httpResponse = null;
                bArr = null;
                request2 = request;
            }
            NetworkUtility.attemptRetryOnException(request2, NetworkUtility.shouldRetryException(request2, iOException, elapsedRealtime, httpResponse, bArr));
            request = request2;
        }
    }

    @Deprecated
    public BasicNetwork(HttpStack httpStack, ByteArrayPool byteArrayPool) {
        this.mHttpStack = httpStack;
        this.mBaseHttpStack = new AdaptedHttpStack(httpStack);
        this.mPool = byteArrayPool;
    }

    public BasicNetwork(BaseHttpStack baseHttpStack) {
        this(baseHttpStack, new ByteArrayPool(4096));
    }

    public BasicNetwork(BaseHttpStack baseHttpStack, ByteArrayPool byteArrayPool) {
        this.mBaseHttpStack = baseHttpStack;
        this.mHttpStack = baseHttpStack;
        this.mPool = byteArrayPool;
    }
}
