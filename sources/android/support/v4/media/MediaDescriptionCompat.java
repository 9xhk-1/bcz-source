package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f2805j = "android.media.extra.BT_FOLDER_TYPE";

    /* renamed from: k, reason: collision with root package name */
    public static final long f2806k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f2807l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final long f2808m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final long f2809n = 3;

    /* renamed from: o, reason: collision with root package name */
    public static final long f2810o = 4;

    /* renamed from: p, reason: collision with root package name */
    public static final long f2811p = 5;

    /* renamed from: q, reason: collision with root package name */
    public static final long f2812q = 6;

    /* renamed from: r, reason: collision with root package name */
    public static final String f2813r = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: s, reason: collision with root package name */
    public static final long f2814s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final long f2815t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final long f2816u = 2;

    /* renamed from: v, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f2817v = "android.support.v4.media.description.MEDIA_URI";

    /* renamed from: w, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f2818w = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* renamed from: a, reason: collision with root package name */
    public final String f2819a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2820b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f2821c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f2822d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f2823e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f2824f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2825g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f2826h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2827i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(d.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i11) {
            return new MediaDescriptionCompat[i11];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f2828a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f2829b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f2830c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f2831d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap f2832e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f2833f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f2834g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f2835h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f2828a, this.f2829b, this.f2830c, this.f2831d, this.f2832e, this.f2833f, this.f2834g, this.f2835h);
        }

        public b b(@Nullable CharSequence charSequence) {
            this.f2831d = charSequence;
            return this;
        }

        public b c(@Nullable Bundle bundle) {
            this.f2834g = bundle;
            return this;
        }

        public b d(@Nullable Bitmap bitmap) {
            this.f2832e = bitmap;
            return this;
        }

        public b e(@Nullable Uri uri) {
            this.f2833f = uri;
            return this;
        }

        public b f(@Nullable String str) {
            this.f2828a = str;
            return this;
        }

        public b g(@Nullable Uri uri) {
            this.f2835h = uri;
            return this;
        }

        public b h(@Nullable CharSequence charSequence) {
            this.f2830c = charSequence;
            return this;
        }

        public b i(@Nullable CharSequence charSequence) {
            this.f2829b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2819a = str;
        this.f2820b = charSequence;
        this.f2821c = charSequence2;
        this.f2822d = charSequence3;
        this.f2823e = bitmap;
        this.f2824f = uri;
        this.f2825g = bundle;
        this.f2826h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L74
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.d.f(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.h(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.g(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.d.b(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.d.d(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.d.e(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.d.c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L44
            android.support.v4.media.session.MediaSessionCompat.b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L45
        L44:
            r4 = r0
        L45:
            if (r4 == 0) goto L5d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L57
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L57
            goto L5e
        L57:
            r2.remove(r3)
            r2.remove(r5)
        L5d:
            r0 = r2
        L5e:
            r1.c(r0)
            if (r4 == 0) goto L67
            r1.g(r4)
            goto L6e
        L67:
            android.net.Uri r0 = android.support.v4.media.e.a(r8)
            r1.g(r0)
        L6e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f2827i = r8
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Nullable
    public CharSequence b() {
        return this.f2822d;
    }

    @Nullable
    public Bundle c() {
        return this.f2825g;
    }

    @Nullable
    public Bitmap d() {
        return this.f2823e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Uri e() {
        return this.f2824f;
    }

    public Object g() {
        Object obj = this.f2827i;
        if (obj != null) {
            return obj;
        }
        Object b11 = d.a.b();
        d.a.g(b11, this.f2819a);
        d.a.i(b11, this.f2820b);
        d.a.h(b11, this.f2821c);
        d.a.c(b11, this.f2822d);
        d.a.e(b11, this.f2823e);
        d.a.f(b11, this.f2824f);
        d.a.d(b11, this.f2825g);
        e.a.a(b11, this.f2826h);
        Object a11 = d.a.a(b11);
        this.f2827i = a11;
        return a11;
    }

    @Nullable
    public String h() {
        return this.f2819a;
    }

    @Nullable
    public Uri i() {
        return this.f2826h;
    }

    @Nullable
    public CharSequence j() {
        return this.f2821c;
    }

    @Nullable
    public CharSequence k() {
        return this.f2820b;
    }

    public String toString() {
        return ((Object) this.f2820b) + j2.O + ((Object) this.f2821c) + j2.O + ((Object) this.f2822d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        d.i(g(), parcel, i11);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f2819a = parcel.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2820b = (CharSequence) creator.createFromParcel(parcel);
        this.f2821c = (CharSequence) creator.createFromParcel(parcel);
        this.f2822d = (CharSequence) creator.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f2823e = (Bitmap) parcel.readParcelable(classLoader);
        this.f2824f = (Uri) parcel.readParcelable(classLoader);
        this.f2825g = parcel.readBundle(classLoader);
        this.f2826h = (Uri) parcel.readParcelable(classLoader);
    }
}
