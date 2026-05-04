package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> editedValues = new HashMap();
    private final List<String> removedValues = new ArrayList();

    @uo.a
    private ContentMetadataMutations checkAndSet(String str, Object obj) {
        this.editedValues.put((String) Assertions.checkNotNull(str), Assertions.checkNotNull(obj));
        this.removedValues.remove(str);
        return this;
    }

    public static ContentMetadataMutations setContentLength(ContentMetadataMutations contentMetadataMutations, long j11) {
        return contentMetadataMutations.set(ContentMetadata.KEY_CONTENT_LENGTH, j11);
    }

    public static ContentMetadataMutations setRedirectedUri(ContentMetadataMutations contentMetadataMutations, @Nullable Uri uri) {
        return uri == null ? contentMetadataMutations.remove(ContentMetadata.KEY_REDIRECTED_URI) : contentMetadataMutations.set(ContentMetadata.KEY_REDIRECTED_URI, uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap hashMap = new HashMap(this.editedValues);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List<String> getRemovedValues() {
        return Collections.unmodifiableList(new ArrayList(this.removedValues));
    }

    @uo.a
    public ContentMetadataMutations remove(String str) {
        this.removedValues.add(str);
        this.editedValues.remove(str);
        return this;
    }

    @uo.a
    public ContentMetadataMutations set(String str, String str2) {
        return checkAndSet(str, str2);
    }

    @uo.a
    public ContentMetadataMutations set(String str, long j11) {
        return checkAndSet(str, Long.valueOf(j11));
    }

    @uo.a
    public ContentMetadataMutations set(String str, byte[] bArr) {
        return checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
    }
}
