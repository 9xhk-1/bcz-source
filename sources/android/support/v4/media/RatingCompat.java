package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final String f2863d = "Rating";

    /* renamed from: e, reason: collision with root package name */
    public static final int f2864e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2865f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2866g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2867h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2868i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2869j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2870k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final float f2871l = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public final int f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2873b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2874c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i11) {
            return new RatingCompat[i11];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    public RatingCompat(int i11, float f11) {
        this.f2872a = i11;
        this.f2873b = f11;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = j(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = l(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = k(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = n(ratingStyle);
            }
            ratingCompat.f2874c = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat j(boolean z11) {
        return new RatingCompat(1, z11 ? 1.0f : 0.0f);
    }

    public static RatingCompat k(float f11) {
        if (f11 >= 0.0f && f11 <= 100.0f) {
            return new RatingCompat(6, f11);
        }
        Log.e(f2863d, "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat l(int i11, float f11) {
        float f12;
        if (i11 == 3) {
            f12 = 3.0f;
        } else if (i11 == 4) {
            f12 = 4.0f;
        } else {
            if (i11 != 5) {
                Log.e(f2863d, "Invalid rating style (" + i11 + ") for a star rating");
                return null;
            }
            f12 = 5.0f;
        }
        if (f11 >= 0.0f && f11 <= f12) {
            return new RatingCompat(i11, f11);
        }
        Log.e(f2863d, "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat m(boolean z11) {
        return new RatingCompat(2, z11 ? 1.0f : 0.0f);
    }

    public static RatingCompat n(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i11, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f2872a == 6 && h()) {
            return this.f2873b;
        }
        return -1.0f;
    }

    public Object c() {
        if (this.f2874c == null) {
            if (h()) {
                int i11 = this.f2872a;
                switch (i11) {
                    case 1:
                        this.f2874c = Rating.newHeartRating(g());
                        break;
                    case 2:
                        this.f2874c = Rating.newThumbRating(i());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f2874c = Rating.newStarRating(i11, e());
                        break;
                    case 6:
                        this.f2874c = Rating.newPercentageRating(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f2874c = Rating.newUnratedRating(this.f2872a);
            }
        }
        return this.f2874c;
    }

    public int d() {
        return this.f2872a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f2872a;
    }

    public float e() {
        int i11 = this.f2872a;
        if ((i11 == 3 || i11 == 4 || i11 == 5) && h()) {
            return this.f2873b;
        }
        return -1.0f;
    }

    public boolean g() {
        return this.f2872a == 1 && this.f2873b == 1.0f;
    }

    public boolean h() {
        return this.f2873b >= 0.0f;
    }

    public boolean i() {
        return this.f2872a == 2 && this.f2873b == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f2872a);
        sb2.append(" rating=");
        float f11 = this.f2873b;
        sb2.append(f11 < 0.0f ? "unrated" : String.valueOf(f11));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f2872a);
        parcel.writeFloat(this.f2873b);
    }
}
