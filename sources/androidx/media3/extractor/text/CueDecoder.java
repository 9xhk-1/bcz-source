package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class CueDecoder {
    static final String BUNDLE_FIELD_CUES = "c";
    static final String BUNDLE_FIELD_DURATION_US = "d";

    public CuesWithTiming decode(long j11, byte[] bArr, int i11, int i12) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i11, i12);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new CuesWithTiming(BundleCollectionUtil.fromBundleList(new androidx.media3.common.text.a(), (ArrayList) Assertions.checkNotNull(readBundle.getParcelableArrayList("c"))), j11, readBundle.getLong("d"));
    }
}
