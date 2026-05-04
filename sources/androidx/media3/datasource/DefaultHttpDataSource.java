package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.HttpDataSource;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.q8;
import com.google.common.collect.w4;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {

    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;

    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;

    @Nullable
    private HttpURLConnection connection;

    @Nullable
    private final ho.i0<String> contentTypePredicate;
    private final boolean crossProtocolRedirectsForceOriginal;

    @Nullable
    private DataSpec dataSpec;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private boolean transferStarted;

    @Nullable
    private final String userAgent;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;

        @Nullable
        private ho.i0<String> contentTypePredicate;
        private boolean crossProtocolRedirectsForceOriginal;
        private boolean keepPostFor302Redirects;

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @UnstableApi
        @uo.a
        public Factory setAllowCrossProtocolRedirects(boolean z11) {
            this.allowCrossProtocolRedirects = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setConnectTimeoutMs(int i11) {
            this.connectTimeoutMs = i11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setContentTypePredicate(@Nullable ho.i0<String> i0Var) {
            this.contentTypePredicate = i0Var;
            return this;
        }

        @UnstableApi
        @uo.a
        public Factory setCrossProtocolRedirectsForceOriginal(boolean z11) {
            this.crossProtocolRedirectsForceOriginal = z11;
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

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @UnstableApi
        @uo.a
        public Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.crossProtocolRedirectsForceOriginal, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NullFilteringHeadersMap extends w4<String, List<String>> {
        private final Map<String, List<String>> headers;

        public NullFilteringHeadersMap(Map<String, List<String>> map) {
            this.headers = map;
        }

        public static /* synthetic */ boolean w(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean x(String str) {
            return str != null;
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return q8.i(super.entrySet(), new ho.i0() { // from class: androidx.media3.datasource.g
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return DefaultHttpDataSource.NullFilteringHeadersMap.w((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public Set<String> keySet() {
            return q8.i(super.keySet(), new ho.i0() { // from class: androidx.media3.datasource.h
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return DefaultHttpDataSource.NullFilteringHeadersMap.x((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.w4, com.google.common.collect.c5
        public Map<String, List<String>> delegate() {
            return this.headers;
        }

        @Override // com.google.common.collect.w4, java.util.Map
        @Nullable
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                Log.e(TAG, "Unexpected error while disconnecting", e11);
            }
        }
    }

    private URL handleRedirect(URL url, @Nullable String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.crossProtocolRedirectsForceOriginal) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e11) {
                    throw new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2001, 1);
                }
            }
            throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + pn.j.f81007d, dataSpec, 2001, 1);
        } catch (MalformedURLException e12) {
            throw new HttpDataSource.HttpDataSourceException(e12, dataSpec, 2001, 1);
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        HttpURLConnection makeConnection;
        URL url = new URL(dataSpec.uri.toString());
        int i11 = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j11 = dataSpec.position;
        long j12 = dataSpec.length;
        int i12 = 1;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects && !this.crossProtocolRedirectsForceOriginal && !this.keepPostFor302Redirects) {
            return makeConnection(url, i11, bArr, j11, j12, isFlagSet, true, dataSpec.httpRequestHeaders);
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (i13 > 20) {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i14), dataSpec, 2001, 1);
            }
            makeConnection = makeConnection(url, i11, bArr, j11, j12, isFlagSet, false, dataSpec.httpRequestHeaders);
            int responseCode = makeConnection.getResponseCode();
            String headerField = makeConnection.getHeaderField("Location");
            if ((i11 == i12 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                makeConnection.disconnect();
                url = handleRedirect(url, headerField, dataSpec);
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                makeConnection.disconnect();
                if (!this.keepPostFor302Redirects || responseCode != 302) {
                    bArr = null;
                    i11 = 1;
                }
                url = handleRedirect(url, headerField, dataSpec);
            }
            i13 = i14;
            i12 = 1;
        }
        return makeConnection;
    }

    private int readInternal(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesToRead;
        if (j11 != -1) {
            long j12 = j11 - this.bytesRead;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i11, i12);
        if (read == -1) {
            return -1;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private void skipFully(long j11, DataSpec dataSpec) throws IOException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, 0, (int) Math.min(j11, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j11 -= read;
            bytesTransferred(read);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new HttpDataSource.HttpDataSourceException(e11, (DataSpec) Util.castNonNull(this.dataSpec), 2000, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        int i11;
        if (this.connection == null || (i11 = this.responseCode) <= 0) {
            return -1;
        }
        return i11;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? ImmutableMap.of() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        this.dataSpec = dataSpec;
        long j11 = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection makeConnection = makeConnection(dataSpec);
            this.connection = makeConnection;
            this.responseCode = makeConnection.getResponseCode();
            String responseMessage = makeConnection.getResponseMessage();
            int i11 = this.responseCode;
            if (i11 < 200 || i11 > 299) {
                Map<String, List<String>> headerFields = makeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(makeConnection.getHeaderField("Content-Range"))) {
                        this.transferStarted = true;
                        transferStarted(dataSpec);
                        long j12 = dataSpec.length;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = makeConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? po.g.u(errorStream) : Util.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    bArr = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr2 = bArr;
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new DataSourceException(2008) : null, headerFields, dataSpec, bArr2);
            }
            String contentType = makeConnection.getContentType();
            ho.i0<String> i0Var = this.contentTypePredicate;
            if (i0Var != null && !i0Var.apply(contentType)) {
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.responseCode == 200) {
                long j13 = dataSpec.position;
                if (j13 != 0) {
                    j11 = j13;
                }
            }
            boolean isCompressed = isCompressed(makeConnection);
            if (isCompressed) {
                this.bytesToRead = dataSpec.length;
            } else {
                long j14 = dataSpec.length;
                if (j14 != -1) {
                    this.bytesToRead = j14;
                } else {
                    long contentLength = HttpUtil.getContentLength(makeConnection.getHeaderField("Content-Length"), makeConnection.getHeaderField("Content-Range"));
                    this.bytesToRead = contentLength != -1 ? contentLength - j11 : -1L;
                }
            }
            try {
                this.inputStream = makeConnection.getInputStream();
                if (isCompressed) {
                    this.inputStream = new GZIPInputStream(this.inputStream);
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j11, dataSpec);
                    return this.bytesToRead;
                } catch (IOException e11) {
                    closeConnectionQuietly();
                    if (e11 instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e11);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2000, 1);
                }
            } catch (IOException e12) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException(e12, dataSpec, 2000, 1);
            }
        } catch (IOException e13) {
            closeConnectionQuietly();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e13, dataSpec, 1);
        }
    }

    @VisibleForTesting
    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i11, i12);
        } catch (IOException e11) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e11, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    private DefaultHttpDataSource(@Nullable String str, int i11, int i12, boolean z11, boolean z12, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable ho.i0<String> i0Var, boolean z13) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.allowCrossProtocolRedirects = z11;
        this.crossProtocolRedirectsForceOriginal = z12;
        if (z11 && z12) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = i0Var;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z13;
    }

    private HttpURLConnection makeConnection(URL url, int i11, @Nullable byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map<String, String> map) throws IOException {
        HttpURLConnection openConnection = openConnection(url);
        openConnection.setConnectTimeout(this.connectTimeoutMillis);
        openConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String buildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j11, j12);
        if (buildRangeRequestHeader != null) {
            openConnection.setRequestProperty("Range", buildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            openConnection.setRequestProperty("User-Agent", str);
        }
        openConnection.setRequestProperty("Accept-Encoding", z11 ? "gzip" : "identity");
        openConnection.setInstanceFollowRedirects(z12);
        openConnection.setDoOutput(bArr != null);
        openConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i11));
        if (bArr != null) {
            openConnection.setFixedLengthStreamingMode(bArr.length);
            openConnection.connect();
            OutputStream outputStream = openConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return openConnection;
        }
        openConnection.connect();
        return openConnection;
    }
}
