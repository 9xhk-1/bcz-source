package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class Rating {
    static final String FIELD_RATING_TYPE = Util.intToStringMaxRadix(0);
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    static final float RATING_UNSET = -1.0f;

    @UnstableApi
    public static Rating fromBundle(Bundle bundle) {
        int i11 = bundle.getInt(FIELD_RATING_TYPE, -1);
        if (i11 == 0) {
            return HeartRating.fromBundle(bundle);
        }
        if (i11 == 1) {
            return PercentageRating.fromBundle(bundle);
        }
        if (i11 == 2) {
            return StarRating.fromBundle(bundle);
        }
        if (i11 == 3) {
            return ThumbRating.fromBundle(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i11);
    }

    public abstract boolean isRated();

    @UnstableApi
    public abstract Bundle toBundle();
}
