package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class StarRating extends Rating {
    private static final String FIELD_MAX_STARS = Util.intToStringMaxRadix(1);
    private static final String FIELD_STAR_RATING = Util.intToStringMaxRadix(2);
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;

    @IntRange(from = 1)
    private final int maxStars;
    private final float starRating;

    public StarRating(@IntRange(from = 1) int i11) {
        Assertions.checkArgument(i11 > 0, "maxStars must be a positive integer");
        this.maxStars = i11;
        this.starRating = -1.0f;
    }

    @UnstableApi
    public static StarRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 2);
        int i11 = bundle.getInt(FIELD_MAX_STARS, 5);
        float f11 = bundle.getFloat(FIELD_STAR_RATING, -1.0f);
        return f11 == -1.0f ? new StarRating(i11) : new StarRating(i11, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    @IntRange(from = 1)
    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 2);
        bundle.putInt(FIELD_MAX_STARS, this.maxStars);
        bundle.putFloat(FIELD_STAR_RATING, this.starRating);
        return bundle;
    }

    public StarRating(@IntRange(from = 1) int i11, @FloatRange(from = 0.0d) float f11) {
        boolean z11 = false;
        Assertions.checkArgument(i11 > 0, "maxStars must be a positive integer");
        if (f11 >= 0.0f && f11 <= i11) {
            z11 = true;
        }
        Assertions.checkArgument(z11, "starRating is out of range [0, maxStars]");
        this.maxStars = i11;
        this.starRating = f11;
    }
}
