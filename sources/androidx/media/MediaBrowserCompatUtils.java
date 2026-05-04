package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MediaBrowserCompatUtils {
    private MediaBrowserCompatUtils() {
    }

    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt(MediaBrowserCompat.f2696d, -1) == -1 && bundle2.getInt(MediaBrowserCompat.f2697e, -1) == -1 : bundle2 == null ? bundle.getInt(MediaBrowserCompat.f2696d, -1) == -1 && bundle.getInt(MediaBrowserCompat.f2697e, -1) == -1 : bundle.getInt(MediaBrowserCompat.f2696d, -1) == bundle2.getInt(MediaBrowserCompat.f2696d, -1) && bundle.getInt(MediaBrowserCompat.f2697e, -1) == bundle2.getInt(MediaBrowserCompat.f2697e, -1);
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i11;
        int i12;
        int i13;
        int i14 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.f2696d, -1);
        int i15 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.f2696d, -1);
        int i16 = bundle == null ? -1 : bundle.getInt(MediaBrowserCompat.f2697e, -1);
        int i17 = bundle2 == null ? -1 : bundle2.getInt(MediaBrowserCompat.f2697e, -1);
        int i18 = Integer.MAX_VALUE;
        if (i14 == -1 || i16 == -1) {
            i11 = Integer.MAX_VALUE;
            i12 = 0;
        } else {
            i12 = i14 * i16;
            i11 = (i16 + i12) - 1;
        }
        if (i15 == -1 || i17 == -1) {
            i13 = 0;
        } else {
            i13 = i15 * i17;
            i18 = (i17 + i13) - 1;
        }
        return i11 >= i13 && i18 >= i12;
    }
}
