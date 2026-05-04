package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.badlogic.gdx.Net;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @Deprecated
    public final long absoluteStreamPosition;

    @Nullable
    public final Object customData;
    public final int flags;

    @Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;

    @Nullable
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {

        @Nullable
        private Object customData;
        private int flags;

        @Nullable
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;

        @Nullable
        private String key;
        private long length;
        private long position;

        @Nullable
        private Uri uri;
        private long uriPositionOffset;

        public DataSpec build() {
            Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }

        @uo.a
        public Builder setCustomData(@Nullable Object obj) {
            this.customData = obj;
            return this;
        }

        @uo.a
        public Builder setFlags(int i11) {
            this.flags = i11;
            return this;
        }

        @uo.a
        public Builder setHttpBody(@Nullable byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        @uo.a
        public Builder setHttpMethod(int i11) {
            this.httpMethod = i11;
            return this;
        }

        @uo.a
        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        @uo.a
        public Builder setKey(@Nullable String str) {
            this.key = str;
            return this;
        }

        @uo.a
        public Builder setLength(long j11) {
            this.length = j11;
            return this;
        }

        @uo.a
        public Builder setPosition(long j11) {
            this.position = j11;
            return this;
        }

        @uo.a
        public Builder setUri(String str) {
            this.uri = Uri.parse(str);
            return this;
        }

        @uo.a
        public Builder setUriPositionOffset(long j11) {
            this.uriPositionOffset = j11;
            return this;
        }

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = Collections.EMPTY_MAP;
            this.length = -1L;
        }

        @uo.a
        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        private Builder(DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        MediaLibraryInfo.registerModule("media3.datasource");
    }

    public static String getStringForHttpMethod(int i11) {
        if (i11 == 1) {
            return "GET";
        }
        if (i11 == 2) {
            return "POST";
        }
        if (i11 == 3) {
            return Net.a.f11462a;
        }
        throw new IllegalStateException();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i11) {
        return (this.flags & i11) == i11;
    }

    public DataSpec subrange(long j11) {
        long j12 = this.length;
        return subrange(j11, j12 != -1 ? j12 - j11 : -1L);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + " " + this.uri + j2.O + this.position + j2.O + this.length + j2.O + this.key + j2.O + this.flags + "]";
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap(this.httpRequestHeaders);
        hashMap.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, hashMap, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec subrange(long j11, long j12) {
        return (j11 == 0 && this.length == j12) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j11, j12, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri, long j11, long j12) {
        this(uri, j11, j12, null);
    }

    @Deprecated
    public DataSpec(Uri uri, long j11, long j12, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j11, j12, str, 0, null);
    }

    private DataSpec(Uri uri, long j11, int i11, @Nullable byte[] bArr, Map<String, String> map, long j12, long j13, @Nullable String str, int i12, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j14 = j11 + j12;
        Assertions.checkArgument(j14 >= 0);
        Assertions.checkArgument(j12 >= 0);
        Assertions.checkArgument(j13 > 0 || j13 == -1);
        this.uri = (Uri) Assertions.checkNotNull(uri);
        this.uriPositionOffset = j11;
        this.httpMethod = i11;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j12;
        this.absoluteStreamPosition = j14;
        this.length = j13;
        this.key = str;
        this.flags = i12;
        this.customData = obj;
    }
}
