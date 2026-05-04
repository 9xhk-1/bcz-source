package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface HttpDataSource extends DataSource {

    @UnstableApi
    public static final ho.i0<String> REJECT_PAYWALL_TYPES = new ho.i0() { // from class: androidx.media3.datasource.i
        @Override // ho.i0
        public final boolean apply(Object obj) {
            return HttpDataSource.a((String) obj);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        public abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @uo.a
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        @UnstableApi
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory extends DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        HttpDataSource createDataSource();

        @UnstableApi
        Factory setDefaultRequestProperties(Map<String, String> map);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;

        @UnstableApi
        public final DataSpec dataSpec;
        public final int type;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i11) {
            this(dataSpec, 2000, i11);
        }

        private static int assignErrorCode(int i11, int i12) {
            if (i11 == 2000 && i12 == 1) {
                return 2001;
            }
            return i11;
        }

        @UnstableApi
        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i11) {
            String message = iOException.getMessage();
            int i12 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !ho.c.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i12 == 2007 ? new CleartextNotPermittedException(iOException, dataSpec) : new HttpDataSourceException(iOException, dataSpec, i12, i11);
        }

        @UnstableApi
        public HttpDataSourceException(DataSpec dataSpec, int i11, int i12) {
            super(assignErrorCode(i11, i12));
            this.dataSpec = dataSpec;
            this.type = i12;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i11) {
            this(str, dataSpec, 2000, i11);
        }

        @UnstableApi
        public HttpDataSourceException(String str, DataSpec dataSpec, int i11, int i12) {
            super(str, assignErrorCode(i11, i12));
            this.dataSpec = dataSpec;
            this.type = i12;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i11) {
            this(iOException, dataSpec, 2000, i11);
        }

        @UnstableApi
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i11, int i12) {
            super(iOException, assignErrorCode(i11, i12));
            this.dataSpec = dataSpec;
            this.type = i12;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i11) {
            this(str, iOException, dataSpec, 2000, i11);
        }

        @UnstableApi
        public HttpDataSourceException(String str, @Nullable IOException iOException, DataSpec dataSpec, int i11, int i12) {
            super(str, iOException, assignErrorCode(i11, i12));
            this.dataSpec = dataSpec;
            this.type = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        @UnstableApi
        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        @UnstableApi
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;

        @Nullable
        public final String responseMessage;

        @UnstableApi
        public InvalidResponseCodeException(int i11, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super("Response code: " + i11, iOException, dataSpec, 2004, 1);
            this.responseCode = i11;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String g11 = ho.c.g(str);
        if (TextUtils.isEmpty(g11)) {
            return false;
        }
        return ((g11.contains("text") && !g11.contains(MimeTypes.TEXT_VTT)) || g11.contains("html") || g11.contains("xml")) ? false : true;
    }

    @UnstableApi
    void clearAllRequestProperties();

    @UnstableApi
    void clearRequestProperty(String str);

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    void close() throws HttpDataSourceException;

    @UnstableApi
    int getResponseCode();

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    Map<String, List<String>> getResponseHeaders();

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    int read(byte[] bArr, int i11, int i12) throws HttpDataSourceException;

    @UnstableApi
    void setRequestProperty(String str, String str2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();

        @Nullable
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
