package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final String A = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String B = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String C = "android.media.metadata.DISPLAY_ICON";
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String D = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String E = "android.media.metadata.MEDIA_ID";
    public static final String F = "android.media.metadata.MEDIA_URI";
    public static final String G = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String H = "android.media.metadata.ADVERTISEMENT";
    public static final String I = "android.media.metadata.DOWNLOAD_STATUS";
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final ArrayMap<String, Integer> N;
    public static final String[] O;
    public static final String[] P;
    public static final String[] Q;

    /* renamed from: d, reason: collision with root package name */
    public static final String f2836d = "MediaMetadata";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2837e = "android.media.metadata.TITLE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2838f = "android.media.metadata.ARTIST";

    /* renamed from: g, reason: collision with root package name */
    public static final String f2839g = "android.media.metadata.DURATION";

    /* renamed from: h, reason: collision with root package name */
    public static final String f2840h = "android.media.metadata.ALBUM";

    /* renamed from: i, reason: collision with root package name */
    public static final String f2841i = "android.media.metadata.AUTHOR";

    /* renamed from: j, reason: collision with root package name */
    public static final String f2842j = "android.media.metadata.WRITER";

    /* renamed from: k, reason: collision with root package name */
    public static final String f2843k = "android.media.metadata.COMPOSER";

    /* renamed from: l, reason: collision with root package name */
    public static final String f2844l = "android.media.metadata.COMPILATION";

    /* renamed from: m, reason: collision with root package name */
    public static final String f2845m = "android.media.metadata.DATE";

    /* renamed from: n, reason: collision with root package name */
    public static final String f2846n = "android.media.metadata.YEAR";

    /* renamed from: o, reason: collision with root package name */
    public static final String f2847o = "android.media.metadata.GENRE";

    /* renamed from: p, reason: collision with root package name */
    public static final String f2848p = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: q, reason: collision with root package name */
    public static final String f2849q = "android.media.metadata.NUM_TRACKS";

    /* renamed from: r, reason: collision with root package name */
    public static final String f2850r = "android.media.metadata.DISC_NUMBER";

    /* renamed from: s, reason: collision with root package name */
    public static final String f2851s = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: t, reason: collision with root package name */
    public static final String f2852t = "android.media.metadata.ART";

    /* renamed from: u, reason: collision with root package name */
    public static final String f2853u = "android.media.metadata.ART_URI";

    /* renamed from: v, reason: collision with root package name */
    public static final String f2854v = "android.media.metadata.ALBUM_ART";

    /* renamed from: w, reason: collision with root package name */
    public static final String f2855w = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: x, reason: collision with root package name */
    public static final String f2856x = "android.media.metadata.USER_RATING";

    /* renamed from: y, reason: collision with root package name */
    public static final String f2857y = "android.media.metadata.RATING";

    /* renamed from: z, reason: collision with root package name */
    public static final String f2858z = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f2859a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2860b;

    /* renamed from: c, reason: collision with root package name */
    public MediaDescriptionCompat f2861c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i11) {
            return new MediaMetadataCompat[i11];
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
    public @interface d {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface e {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        N = arrayMap;
        arrayMap.put(f2837e, 1);
        arrayMap.put(f2838f, 1);
        arrayMap.put(f2839g, 0);
        arrayMap.put(f2840h, 1);
        arrayMap.put(f2841i, 1);
        arrayMap.put(f2842j, 1);
        arrayMap.put(f2843k, 1);
        arrayMap.put(f2844l, 1);
        arrayMap.put(f2845m, 1);
        arrayMap.put(f2846n, 0);
        arrayMap.put(f2847o, 1);
        arrayMap.put(f2848p, 0);
        arrayMap.put(f2849q, 0);
        arrayMap.put(f2850r, 0);
        arrayMap.put(f2851s, 1);
        arrayMap.put(f2852t, 2);
        arrayMap.put(f2853u, 1);
        arrayMap.put(f2854v, 2);
        arrayMap.put(f2855w, 1);
        arrayMap.put(f2856x, 3);
        arrayMap.put(f2857y, 3);
        arrayMap.put(f2858z, 1);
        arrayMap.put(A, 1);
        arrayMap.put(B, 1);
        arrayMap.put(C, 2);
        arrayMap.put(D, 1);
        arrayMap.put(E, 1);
        arrayMap.put(G, 0);
        arrayMap.put(F, 1);
        arrayMap.put(H, 0);
        arrayMap.put(I, 0);
        O = new String[]{f2837e, f2838f, f2840h, f2851s, f2842j, f2841i, f2843k};
        P = new String[]{C, f2852t, f2854v};
        Q = new String[]{D, f2853u, f2855w};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f2859a = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        android.support.v4.media.f.g(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f2860b = obj;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.f2859a.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.f2859a.getParcelable(str);
        } catch (Exception e11) {
            Log.w(f2836d, "Failed to retrieve a key as Bitmap.", e11);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.f2859a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f2861c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String j11 = j(E);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence k11 = k(f2858z);
        if (TextUtils.isEmpty(k11)) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < 3) {
                String[] strArr = O;
                if (i12 >= strArr.length) {
                    break;
                }
                int i13 = i12 + 1;
                CharSequence k12 = k(strArr[i12]);
                if (!TextUtils.isEmpty(k12)) {
                    charSequenceArr[i11] = k12;
                    i11++;
                }
                i12 = i13;
            }
        } else {
            charSequenceArr[0] = k11;
            charSequenceArr[1] = k(A);
            charSequenceArr[2] = k(B);
        }
        int i14 = 0;
        while (true) {
            String[] strArr2 = P;
            if (i14 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = c(strArr2[i14]);
            if (bitmap != null) {
                break;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            String[] strArr3 = Q;
            if (i15 >= strArr3.length) {
                uri = null;
                break;
            }
            String j12 = j(strArr3[i15]);
            if (!TextUtils.isEmpty(j12)) {
                uri = Uri.parse(j12);
                break;
            }
            i15++;
        }
        String j13 = j(F);
        Uri parse = TextUtils.isEmpty(j13) ? null : Uri.parse(j13);
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.f(j11);
        bVar.i(charSequenceArr[0]);
        bVar.h(charSequenceArr[1]);
        bVar.b(charSequenceArr[2]);
        bVar.d(bitmap);
        bVar.e(uri);
        bVar.g(parse);
        Bundle bundle = new Bundle();
        if (this.f2859a.containsKey(G)) {
            bundle.putLong(MediaDescriptionCompat.f2805j, g(G));
        }
        if (this.f2859a.containsKey(I)) {
            bundle.putLong(MediaDescriptionCompat.f2813r, g(I));
        }
        if (!bundle.isEmpty()) {
            bVar.c(bundle);
        }
        MediaDescriptionCompat a11 = bVar.a();
        this.f2861c = a11;
        return a11;
    }

    public long g(String str) {
        return this.f2859a.getLong(str, 0L);
    }

    public Object h() {
        if (this.f2860b == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f2860b = android.support.v4.media.f.a(obtain);
            obtain.recycle();
        }
        return this.f2860b;
    }

    public RatingCompat i(String str) {
        try {
            return RatingCompat.a(this.f2859a.getParcelable(str));
        } catch (Exception e11) {
            Log.w(f2836d, "Failed to retrieve a key as Rating.", e11);
            return null;
        }
    }

    public String j(String str) {
        CharSequence charSequence = this.f2859a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence k(String str) {
        return this.f2859a.getCharSequence(str);
    }

    public Set<String> l() {
        return this.f2859a.keySet();
    }

    public int m() {
        return this.f2859a.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeBundle(this.f2859a);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f2862a;

        public c() {
            this.f2862a = new Bundle();
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f2862a);
        }

        public c b(String str, Bitmap bitmap) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.N;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 2) {
                this.f2862a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public c c(String str, long j11) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.N;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 0) {
                this.f2862a.putLong(str, j11);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public c d(String str, RatingCompat ratingCompat) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.N;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 3) {
                this.f2862a.putParcelable(str, (Parcelable) ratingCompat.c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public c e(String str, String str2) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.N;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 1) {
                this.f2862a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public c f(String str, CharSequence charSequence) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.N;
            if (!arrayMap.containsKey(str) || arrayMap.get(str).intValue() == 1) {
                this.f2862a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        public final Bitmap g(Bitmap bitmap, int i11) {
            float f11 = i11;
            float min = Math.min(f11 / bitmap.getWidth(), f11 / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public c(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f2859a);
            this.f2862a = bundle;
            MediaSessionCompat.b(bundle);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c(MediaMetadataCompat mediaMetadataCompat, int i11) {
            this(mediaMetadataCompat);
            for (String str : this.f2862a.keySet()) {
                Object obj = this.f2862a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i11 || bitmap.getWidth() > i11) {
                        b(str, g(bitmap, i11));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f2859a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
