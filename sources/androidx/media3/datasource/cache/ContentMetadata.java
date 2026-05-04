package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ContentMetadata {
    public static final String KEY_CONTENT_LENGTH = "exo_len";
    public static final String KEY_CUSTOM_PREFIX = "custom_";
    public static final String KEY_REDIRECTED_URI = "exo_redir";

    static long getContentLength(ContentMetadata contentMetadata) {
        return contentMetadata.get(KEY_CONTENT_LENGTH, -1L);
    }

    @Nullable
    static Uri getRedirectedUri(ContentMetadata contentMetadata) {
        String str = contentMetadata.get(KEY_REDIRECTED_URI, (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    boolean contains(String str);

    long get(String str, long j11);

    @Nullable
    String get(String str, @Nullable String str2);

    @Nullable
    byte[] get(String str, @Nullable byte[] bArr);
}
