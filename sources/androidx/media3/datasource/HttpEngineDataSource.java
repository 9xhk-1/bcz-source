package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HeaderBlock;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresExtension;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresExtension(extension = 31, version = 7)
@UnstableApi
/* loaded from: classes2.dex */
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {

    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;

    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int READ_BUFFER_SIZE_BYTES = 32768;
    private static final String TAG = "HttpEngineDataSource";
    private long bytesRemaining;
    private final Clock clock;
    private final int connectTimeoutMs;

    @Nullable
    private ho.i0<String> contentTypePredicate;
    private volatile long currentConnectTimeoutMs;

    @Nullable
    private DataSpec currentDataSpec;

    @Nullable
    private UrlRequestWrapper currentUrlRequestWrapper;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private IOException exception;
    private final Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final HttpEngine httpEngine;
    private final boolean keepPostFor302Redirects;
    private final ConditionVariable operation;

    @Nullable
    private ByteBuffer readBuffer;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;

    @Nullable
    private UrlResponseInfo responseInfo;
    private boolean transferStarted;

    @Nullable
    private final String userAgent;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements HttpDataSource.Factory {

        @Nullable
        private ho.i0<String> contentTypePredicate;
        private final Executor executor;
        private boolean handleSetCookieRequests;
        private final HttpEngine httpEngine;
        private boolean keepPostFor302Redirects;
        private boolean resetTimeoutOnRedirects;

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int requestPriority = 3;
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        public Factory(HttpEngine httpEngine, Executor executor) {
            this.httpEngine = u.a(Assertions.checkNotNull(httpEngine));
            this.executor = executor;
        }

        @UnstableApi
        @uo.a
        public Factory setConnectionTimeoutMs(int i11) {
            this.connectTimeoutMs = i11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setContentTypePredicate(@Nullable ho.i0<String> i0Var) {
            this.contentTypePredicate = i0Var;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @UnstableApi
        @uo.a
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @UnstableApi
        @uo.a
        public Factory setHandleSetCookieRequests(boolean z11) {
            this.handleSetCookieRequests = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setKeepPostFor302Redirects(boolean z11) {
            this.keepPostFor302Redirects = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setReadTimeoutMs(int i11) {
            this.readTimeoutMs = i11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setRequestPriority(int i11) {
            this.requestPriority = i11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setResetTimeoutOnRedirects(boolean z11) {
            this.resetTimeoutOnRedirects = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setUserAgent(@Nullable String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        public HttpDataSource createDataSource() {
            HttpEngineDataSource httpEngineDataSource = new HttpEngineDataSource(this.httpEngine, this.executor, this.requestPriority, this.connectTimeoutMs, this.readTimeoutMs, this.resetTimeoutOnRedirects, this.handleSetCookieRequests, this.userAgent, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                httpEngineDataSource.addTransferListener(transferListener);
            }
            return httpEngineDataSource;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @UnstableApi
        @uo.a
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class UrlRequestCallback implements UrlRequest$Callback {
        private volatile boolean isClosed = false;

        public UrlRequestCallback() {
        }

        public void close() {
            this.isClosed = true;
        }

        public synchronized void onCanceled(UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo) {
        }

        public synchronized void onFailed(UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo, HttpException httpException) {
            int errorCode;
            try {
                if (this.isClosed) {
                    return;
                }
                if (a0.a(httpException)) {
                    errorCode = b0.a(httpException).getErrorCode();
                    if (errorCode == 1) {
                        HttpEngineDataSource.this.exception = new UnknownHostException();
                        HttpEngineDataSource.this.operation.open();
                    }
                }
                HttpEngineDataSource.this.exception = httpException;
                HttpEngineDataSource.this.operation.open();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.operation.open();
        }

        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            int httpStatusCode;
            String url;
            HeaderBlock headers;
            Map asMap;
            String httpStatusText;
            HeaderBlock headers2;
            Map asMap2;
            if (this.isClosed) {
                return;
            }
            DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(HttpEngineDataSource.this.currentDataSpec);
            httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (dataSpec.httpMethod == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                HttpEngineDataSource httpEngineDataSource = HttpEngineDataSource.this;
                httpStatusText = urlResponseInfo.getHttpStatusText();
                headers2 = urlResponseInfo.getHeaders();
                asMap2 = headers2.getAsMap();
                httpEngineDataSource.exception = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, httpStatusText, null, asMap2, dataSpec, Util.EMPTY_BYTE_ARRAY);
                HttpEngineDataSource.this.operation.open();
                return;
            }
            if (HttpEngineDataSource.this.resetTimeoutOnRedirects) {
                HttpEngineDataSource.this.resetConnectTimeout();
            }
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler == null && HttpEngineDataSource.this.handleSetCookieRequests) {
                cookieHandler = new CookieManager();
            }
            HttpEngineDataSource.storeCookiesFromHeaders(urlResponseInfo, cookieHandler);
            url = urlResponseInfo.getUrl();
            headers = urlResponseInfo.getHeaders();
            asMap = headers.getAsMap();
            String cookieHeader = HttpEngineDataSource.getCookieHeader(url, asMap, cookieHandler);
            boolean z11 = HttpEngineDataSource.this.keepPostFor302Redirects && dataSpec.httpMethod == 2 && httpStatusCode == 302;
            if (!z11 && (!HttpEngineDataSource.this.handleSetCookieRequests || TextUtils.isEmpty(cookieHeader))) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest.cancel();
            DataSpec withUri = (z11 || dataSpec.httpMethod != 2) ? dataSpec.withUri(Uri.parse(str)) : dataSpec.buildUpon().setUri(str).setHttpMethod(1).setHttpBody(null).build();
            if (!TextUtils.isEmpty(cookieHeader)) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(dataSpec.httpRequestHeaders);
                hashMap.put("Cookie", cookieHeader);
                withUri = withUri.buildUpon().setHttpRequestHeaders(hashMap).build();
            }
            try {
                UrlRequestWrapper buildRequestWrapper = HttpEngineDataSource.this.buildRequestWrapper(withUri);
                if (HttpEngineDataSource.this.currentUrlRequestWrapper != null) {
                    HttpEngineDataSource.this.currentUrlRequestWrapper.close();
                }
                HttpEngineDataSource.this.currentUrlRequestWrapper = buildRequestWrapper;
                HttpEngineDataSource.this.currentUrlRequestWrapper.start();
            } catch (IOException e11) {
                HttpEngineDataSource.this.exception = e11;
            }
        }

        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.storeCookiesFromHeaders(urlResponseInfo);
            HttpEngineDataSource.this.responseInfo = urlResponseInfo;
            HttpEngineDataSource.this.operation.open();
        }

        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.finished = true;
            HttpEngineDataSource.this.operation.open();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UrlRequestWrapper {
        private final UrlRequest urlRequest;
        private final UrlRequestCallback urlRequestCallback;

        public UrlRequestWrapper(UrlRequest urlRequest, UrlRequestCallback urlRequestCallback) {
            this.urlRequest = urlRequest;
            this.urlRequestCallback = urlRequestCallback;
        }

        public void close() {
            this.urlRequestCallback.close();
            this.urlRequest.cancel();
        }

        public int getStatus() throws InterruptedException {
            final ConditionVariable conditionVariable = new ConditionVariable();
            final int[] iArr = new int[1];
            this.urlRequest.getStatus(new UrlRequest$StatusListener() { // from class: androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper.1
                public void onStatus(int i11) {
                    iArr[0] = i11;
                    conditionVariable.open();
                }
            });
            conditionVariable.block();
            return iArr[0];
        }

        public UrlRequestCallback getUrlRequestCallback() {
            return this.urlRequestCallback;
        }

        public void read(ByteBuffer byteBuffer) {
            this.urlRequest.read(byteBuffer);
        }

        public void start() {
            this.urlRequest.start();
        }
    }

    @UnstableApi
    public HttpEngineDataSource(HttpEngine httpEngine, Executor executor, int i11, int i12, int i13, boolean z11, boolean z12, @Nullable String str, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable ho.i0<String> i0Var, boolean z13) {
        super(true);
        this.httpEngine = u.a(Assertions.checkNotNull(httpEngine));
        this.executor = (Executor) Assertions.checkNotNull(executor);
        this.requestPriority = i11;
        this.connectTimeoutMs = i12;
        this.readTimeoutMs = i13;
        this.resetTimeoutOnRedirects = z11;
        this.handleSetCookieRequests = z12;
        this.userAgent = str;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = i0Var;
        this.keepPostFor302Redirects = z13;
        this.clock = Clock.DEFAULT;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.operation = new ConditionVariable();
    }

    private boolean blockUntilConnectTimeout() throws InterruptedException {
        long elapsedRealtime = this.clock.elapsedRealtime();
        boolean z11 = false;
        while (!z11 && elapsedRealtime < this.currentConnectTimeoutMs) {
            z11 = this.operation.block((this.currentConnectTimeoutMs - elapsedRealtime) + 5);
            elapsedRealtime = this.clock.elapsedRealtime();
        }
        return z11;
    }

    private UrlRequest.Builder buildRequestBuilder(DataSpec dataSpec, UrlRequest$Callback urlRequest$Callback) throws IOException {
        UrlRequest.Builder newUrlRequestBuilder;
        UrlRequest.Builder priority;
        UrlRequest.Builder directExecutorAllowed;
        newUrlRequestBuilder = this.httpEngine.newUrlRequestBuilder(dataSpec.uri.toString(), this.executor, urlRequest$Callback);
        priority = newUrlRequestBuilder.setPriority(this.requestPriority);
        directExecutorAllowed = priority.setDirectExecutorAllowed(true);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : hashMap.entrySet()) {
            directExecutorAllowed.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (dataSpec.httpBody != null && !hashMap.containsKey("Content-Type")) {
            throw new OpenException("HTTP request with non-empty body must set Content-Type", dataSpec, 1004, 0);
        }
        String buildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(dataSpec.position, dataSpec.length);
        if (buildRangeRequestHeader != null) {
            directExecutorAllowed.addHeader("Range", buildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            directExecutorAllowed.addHeader("User-Agent", str);
        }
        directExecutorAllowed.setHttpMethod(dataSpec.getHttpMethodString());
        if (dataSpec.httpBody != null) {
            directExecutorAllowed.setUploadDataProvider(new ByteArrayUploadDataProvider(dataSpec.httpBody), this.executor);
        }
        return directExecutorAllowed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UrlRequestWrapper buildRequestWrapper(DataSpec dataSpec) throws IOException {
        UrlRequest build;
        UrlRequestCallback urlRequestCallback = new UrlRequestCallback();
        build = buildRequestBuilder(dataSpec, urlRequestCallback).build();
        return new UrlRequestWrapper(build, urlRequestCallback);
    }

    private static int copyByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(limit);
        return min;
    }

    @VisibleForTesting
    public static String getCookieHeader(String str) {
        return getCookieHeader(str, ImmutableMap.of(), CookieHandler.getDefault());
    }

    @Nullable
    private static String getFirstHeader(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private ByteBuffer getOrCreateReadBuffer() {
        if (this.readBuffer == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32768);
            this.readBuffer = allocateDirect;
            allocateDirect.limit(0);
        }
        return this.readBuffer;
    }

    private static boolean isCompressed(UrlResponseInfo urlResponseInfo) {
        HeaderBlock headers;
        List asList;
        headers = urlResponseInfo.getHeaders();
        asList = headers.getAsList();
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            if (((String) ((Map.Entry) it.next()).getKey()).equalsIgnoreCase("Content-Encoding")) {
                return !((String) r0.getValue()).equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    private void readInternal(ByteBuffer byteBuffer, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        ((UrlRequestWrapper) Util.castNonNull(this.currentUrlRequestWrapper)).read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            Thread.currentThread().interrupt();
            this.exception = new InterruptedIOException();
        } catch (SocketTimeoutException e11) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            this.exception = new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2002, 2);
        }
        if (!this.operation.block(this.readTimeoutMs)) {
            throw new SocketTimeoutException();
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            if (!(iOException instanceof HttpDataSource.HttpDataSourceException)) {
                throw HttpDataSource.HttpDataSourceException.createForIOException(iOException, dataSpec, 2);
            }
            throw ((HttpDataSource.HttpDataSourceException) iOException);
        }
    }

    private byte[] readResponseBody() throws IOException {
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.finished) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArr.length;
                bArr = Arrays.copyOf(bArr, bArr.length + orCreateReadBuffer.remaining());
                orCreateReadBuffer.get(bArr, length, orCreateReadBuffer.remaining());
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.currentConnectTimeoutMs = this.clock.elapsedRealtime() + this.connectTimeoutMs;
    }

    private void skipFully(long j11, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (j11 == 0) {
            return;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j11 > 0) {
            try {
                this.operation.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, dataSpec);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.finished) {
                    throw new OpenException(dataSpec, 2008, 14);
                }
                orCreateReadBuffer.flip();
                Assertions.checkState(orCreateReadBuffer.hasRemaining());
                int min = (int) Math.min(orCreateReadBuffer.remaining(), j11);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + min);
                j11 -= min;
            } catch (IOException e11) {
                if (e11 instanceof HttpDataSource.HttpDataSourceException) {
                    throw ((HttpDataSource.HttpDataSourceException) e11);
                }
                throw new OpenException(e11, dataSpec, e11 instanceof SocketTimeoutException ? 2002 : 2001, 14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void storeCookiesFromHeaders(UrlResponseInfo urlResponseInfo) {
        storeCookiesFromHeaders(urlResponseInfo, CookieHandler.getDefault());
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public synchronized void close() {
        try {
            UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
            if (urlRequestWrapper != null) {
                urlRequestWrapper.close();
                this.currentUrlRequestWrapper = null;
            }
            ByteBuffer byteBuffer = this.readBuffer;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.currentDataSpec = null;
            this.responseInfo = null;
            this.exception = null;
            this.finished = false;
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    @VisibleForTesting
    @UnstableApi
    public UrlRequestCallback getCurrentUrlRequestCallback() {
        UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper == null) {
            return null;
        }
        return urlRequestWrapper.getUrlRequestCallback();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        int httpStatusCode;
        int httpStatusCode2;
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null) {
            return -1;
        }
        httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode <= 0) {
            return -1;
        }
        httpStatusCode2 = this.responseInfo.getHttpStatusCode();
        return httpStatusCode2;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        HeaderBlock headers;
        Map<String, List<String>> asMap;
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null) {
            return Collections.EMPTY_MAP;
        }
        headers = urlResponseInfo.getHeaders();
        asMap = headers.getAsMap();
        return asMap;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        String url;
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo != null) {
            url = urlResponseInfo.getUrl();
            return Uri.parse(url);
        }
        DataSpec dataSpec = this.currentDataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        int httpStatusCode;
        HeaderBlock headers;
        Map asMap;
        byte[] bArr;
        String httpStatusText;
        String firstHeader;
        Assertions.checkNotNull(dataSpec);
        Assertions.checkState(!this.transferStarted);
        this.operation.close();
        resetConnectTimeout();
        this.currentDataSpec = dataSpec;
        try {
            UrlRequestWrapper buildRequestWrapper = buildRequestWrapper(dataSpec);
            this.currentUrlRequestWrapper = buildRequestWrapper;
            buildRequestWrapper.start();
            transferInitializing(dataSpec);
            try {
                boolean blockUntilConnectTimeout = blockUntilConnectTimeout();
                IOException iOException = this.exception;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !ho.c.g(message).contains("err_cleartext_not_permitted")) {
                        throw new OpenException(iOException, dataSpec, 2001, buildRequestWrapper.getStatus());
                    }
                    throw new HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
                }
                if (!blockUntilConnectTimeout) {
                    throw new OpenException(new SocketTimeoutException(), dataSpec, 2002, buildRequestWrapper.getStatus());
                }
                UrlResponseInfo a11 = n.a(Assertions.checkNotNull(this.responseInfo));
                httpStatusCode = a11.getHttpStatusCode();
                headers = a11.getHeaders();
                asMap = headers.getAsMap();
                long j11 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (dataSpec.position == HttpUtil.getDocumentSize(getFirstHeader(asMap, "Content-Range"))) {
                            this.transferStarted = true;
                            transferStarted(dataSpec);
                            long j12 = dataSpec.length;
                            if (j12 != -1) {
                                return j12;
                            }
                            return 0L;
                        }
                    }
                    try {
                        bArr = readResponseBody();
                    } catch (IOException unused) {
                        bArr = Util.EMPTY_BYTE_ARRAY;
                    }
                    byte[] bArr2 = bArr;
                    DataSourceException dataSourceException = httpStatusCode == 416 ? new DataSourceException(2008) : null;
                    httpStatusText = a11.getHttpStatusText();
                    throw new HttpDataSource.InvalidResponseCodeException(httpStatusCode, httpStatusText, dataSourceException, asMap, dataSpec, bArr2);
                }
                ho.i0<String> i0Var = this.contentTypePredicate;
                if (i0Var != null && (firstHeader = getFirstHeader(asMap, "Content-Type")) != null && !i0Var.apply(firstHeader)) {
                    throw new HttpDataSource.InvalidContentTypeException(firstHeader, dataSpec);
                }
                if (httpStatusCode == 200) {
                    long j13 = dataSpec.position;
                    if (j13 != 0) {
                        j11 = j13;
                    }
                }
                if (isCompressed(a11)) {
                    this.bytesRemaining = dataSpec.length;
                } else {
                    long j14 = dataSpec.length;
                    if (j14 != -1) {
                        this.bytesRemaining = j14;
                    } else {
                        long contentLength = HttpUtil.getContentLength(getFirstHeader(asMap, "Content-Length"), getFirstHeader(asMap, "Content-Range"));
                        this.bytesRemaining = contentLength != -1 ? contentLength - j11 : -1L;
                    }
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                skipFully(j11, dataSpec);
                return this.bytesRemaining;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new OpenException(new InterruptedIOException(), dataSpec, 1004, -1);
            }
        } catch (IOException e11) {
            if (e11 instanceof HttpDataSource.HttpDataSourceException) {
                throw ((HttpDataSource.HttpDataSourceException) e11);
            }
            throw new OpenException(e11, dataSpec, 2000, 0);
        }
    }

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource.HttpDataSourceException {
        Assertions.checkState(this.transferStarted);
        if (i12 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            Assertions.checkState(orCreateReadBuffer.hasRemaining());
        }
        long j11 = this.bytesRemaining;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        int u11 = (int) ro.k.u(j11, orCreateReadBuffer.remaining(), i12);
        orCreateReadBuffer.get(bArr, i11, u11);
        long j12 = this.bytesRemaining;
        if (j12 != -1) {
            this.bytesRemaining = j12 - u11;
        }
        bytesTransferred(u11);
        return u11;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        this.requestProperties.set(str, str2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public static final class OpenException extends HttpDataSource.HttpDataSourceException {
        public final int httpEngineConnectionStatus;

        public OpenException(IOException iOException, DataSpec dataSpec, int i11, int i12) {
            super(iOException, dataSpec, i11, 1);
            this.httpEngineConnectionStatus = i12;
        }

        public OpenException(String str, DataSpec dataSpec, int i11, int i12) {
            super(str, dataSpec, i11, 1);
            this.httpEngineConnectionStatus = i12;
        }

        public OpenException(DataSpec dataSpec, int i11, int i12) {
            super(dataSpec, i11, 1);
            this.httpEngineConnectionStatus = i12;
        }
    }

    @VisibleForTesting
    public static String getCookieHeader(String str, @Nullable CookieHandler cookieHandler) {
        return getCookieHeader(str, ImmutableMap.of(), cookieHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void storeCookiesFromHeaders(UrlResponseInfo urlResponseInfo, @Nullable CookieHandler cookieHandler) {
        String url;
        HeaderBlock headers;
        Map<String, List<String>> asMap;
        if (cookieHandler == null) {
            return;
        }
        try {
            url = urlResponseInfo.getUrl();
            URI uri = new URI(url);
            headers = urlResponseInfo.getHeaders();
            asMap = headers.getAsMap();
            cookieHandler.put(uri, asMap);
        } catch (Exception e11) {
            Log.w(TAG, "Failed to store cookies in CookieHandler", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getCookieHeader(String str, Map<String, List<String>> map, @Nullable CookieHandler cookieHandler) {
        List<String> list;
        if (cookieHandler == null) {
            return "";
        }
        Map<String, List<String>> of2 = ImmutableMap.of();
        try {
            of2 = cookieHandler.get(new URI(str), map);
        } catch (Exception e11) {
            Log.w(TAG, "Failed to read cookies from CookieHandler", e11);
        }
        StringBuilder sb2 = new StringBuilder();
        if (of2.containsKey("Cookie") && (list = of2.get("Cookie")) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append("; ");
            }
        }
        return z.a(sb2.toString());
    }

    @UnstableApi
    public int read(ByteBuffer byteBuffer) throws HttpDataSource.HttpDataSourceException {
        int copyByteBuffer;
        Assertions.checkState(this.transferStarted);
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.bytesRemaining == 0) {
                return -1;
            }
            int remaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.readBuffer;
            if (byteBuffer2 != null && (copyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
                long j11 = this.bytesRemaining;
                if (j11 != -1) {
                    this.bytesRemaining = j11 - copyByteBuffer;
                }
                bytesTransferred(copyByteBuffer);
                return copyByteBuffer;
            }
            this.operation.close();
            readInternal(byteBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            Assertions.checkState(remaining > byteBuffer.remaining());
            int remaining2 = remaining - byteBuffer.remaining();
            long j12 = this.bytesRemaining;
            if (j12 != -1) {
                this.bytesRemaining = j12 - remaining2;
            }
            bytesTransferred(remaining2);
            return remaining2;
        }
        throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
    }
}
