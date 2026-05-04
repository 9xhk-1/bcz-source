package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.k;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long A = 16384;
    public static final long B = 32768;
    public static final long C = 65536;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final long D = 131072;
    public static final long E = 262144;

    @Deprecated
    public static final long F = 524288;
    public static final long G = 1048576;
    public static final long H = 2097152;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    public static final int N = 5;
    public static final int O = 6;
    public static final int P = 7;
    public static final int Q = 8;
    public static final int R = 9;
    public static final int S = 10;
    public static final int T = 11;
    public static final long U = -1;
    public static final int V = -1;
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f3049f0 = -1;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f3050f1 = 0;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f3051h1 = 1;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f3052i1 = 2;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f3053j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f3054k1 = 1;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f3055l1 = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final long f3056m = 1;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f3057m1 = 3;

    /* renamed from: n, reason: collision with root package name */
    public static final long f3058n = 2;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f3059n1 = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final long f3060o = 4;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f3061o1 = 5;

    /* renamed from: p, reason: collision with root package name */
    public static final long f3062p = 8;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f3063p1 = 6;

    /* renamed from: q, reason: collision with root package name */
    public static final long f3064q = 16;

    /* renamed from: q1, reason: collision with root package name */
    public static final int f3065q1 = 7;

    /* renamed from: r, reason: collision with root package name */
    public static final long f3066r = 32;

    /* renamed from: r1, reason: collision with root package name */
    public static final int f3067r1 = 8;

    /* renamed from: s, reason: collision with root package name */
    public static final long f3068s = 64;

    /* renamed from: s1, reason: collision with root package name */
    public static final int f3069s1 = 9;

    /* renamed from: t, reason: collision with root package name */
    public static final long f3070t = 128;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f3071t1 = 10;

    /* renamed from: u, reason: collision with root package name */
    public static final long f3072u = 256;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f3073u1 = 11;

    /* renamed from: v, reason: collision with root package name */
    public static final long f3074v = 512;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f3075v1 = 127;

    /* renamed from: w, reason: collision with root package name */
    public static final long f3076w = 1024;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f3077w1 = 126;

    /* renamed from: x, reason: collision with root package name */
    public static final long f3078x = 2048;

    /* renamed from: y, reason: collision with root package name */
    public static final long f3079y = 4096;

    /* renamed from: z, reason: collision with root package name */
    public static final long f3080z = 8192;

    /* renamed from: a, reason: collision with root package name */
    public final int f3081a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3082b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3083c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3084d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3085e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3086f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f3087g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3088h;

    /* renamed from: i, reason: collision with root package name */
    public List<CustomAction> f3089i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3090j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f3091k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3092l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i11) {
            return new PlaybackStateCompat[i11];
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface g {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface h {
    }

    public PlaybackStateCompat(int i11, long j11, long j12, float f11, long j13, int i12, CharSequence charSequence, long j14, List<CustomAction> list, long j15, Bundle bundle) {
        this.f3081a = i11;
        this.f3082b = j11;
        this.f3083c = j12;
        this.f3084d = f11;
        this.f3085e = j13;
        this.f3086f = i12;
        this.f3087g = charSequence;
        this.f3088h = j14;
        this.f3089i = new ArrayList(list);
        this.f3090j = j15;
        this.f3091k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        List<Object> d11 = k.d(obj);
        if (d11 != null) {
            arrayList = new ArrayList(d11.size());
            Iterator<Object> it = d11.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle a11 = l.a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(k.i(obj), k.h(obj), k.c(obj), k.g(obj), k.a(obj), 0, k.e(obj), k.f(obj), arrayList, k.b(obj), a11);
        playbackStateCompat.f3092l = obj;
        return playbackStateCompat;
    }

    public static int p(long j11) {
        if (j11 == 4) {
            return 126;
        }
        if (j11 == 2) {
            return 127;
        }
        if (j11 == 32) {
            return 87;
        }
        if (j11 == 16) {
            return 88;
        }
        if (j11 == 1) {
            return 86;
        }
        if (j11 == 64) {
            return 90;
        }
        if (j11 == 8) {
            return 89;
        }
        return j11 == 512 ? 85 : 0;
    }

    public long b() {
        return this.f3085e;
    }

    public long c() {
        return this.f3090j;
    }

    public long d() {
        return this.f3083c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public long e(Long l11) {
        return Math.max(0L, this.f3082b + ((long) (this.f3084d * (l11 != null ? l11.longValue() : SystemClock.elapsedRealtime() - this.f3088h))));
    }

    public List<CustomAction> g() {
        return this.f3089i;
    }

    public int h() {
        return this.f3086f;
    }

    public CharSequence i() {
        return this.f3087g;
    }

    @Nullable
    public Bundle j() {
        return this.f3091k;
    }

    public long k() {
        return this.f3088h;
    }

    public float l() {
        return this.f3084d;
    }

    public Object m() {
        ArrayList arrayList;
        if (this.f3092l == null) {
            if (this.f3089i != null) {
                arrayList = new ArrayList(this.f3089i.size());
                Iterator<CustomAction> it = this.f3089i.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
            } else {
                arrayList = null;
            }
            this.f3092l = l.b(this.f3081a, this.f3082b, this.f3083c, this.f3084d, this.f3085e, this.f3087g, this.f3088h, arrayList, this.f3090j, this.f3091k);
        }
        return this.f3092l;
    }

    public long n() {
        return this.f3082b;
    }

    public int o() {
        return this.f3081a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f3081a + ", position=" + this.f3082b + ", buffered position=" + this.f3083c + ", speed=" + this.f3084d + ", updated=" + this.f3088h + ", actions=" + this.f3085e + ", error code=" + this.f3086f + ", error message=" + this.f3087g + ", custom actions=" + this.f3089i + ", active item id=" + this.f3090j + com.alipay.sdk.m.u.i.f11099d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3081a);
        parcel.writeLong(this.f3082b);
        parcel.writeFloat(this.f3084d);
        parcel.writeLong(this.f3088h);
        parcel.writeLong(this.f3083c);
        parcel.writeLong(this.f3085e);
        TextUtils.writeToParcel(this.f3087g, parcel, i11);
        parcel.writeTypedList(this.f3089i);
        parcel.writeLong(this.f3090j);
        parcel.writeBundle(this.f3091k);
        parcel.writeInt(this.f3086f);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final List<CustomAction> f3102a;

        /* renamed from: b, reason: collision with root package name */
        public int f3103b;

        /* renamed from: c, reason: collision with root package name */
        public long f3104c;

        /* renamed from: d, reason: collision with root package name */
        public long f3105d;

        /* renamed from: e, reason: collision with root package name */
        public float f3106e;

        /* renamed from: f, reason: collision with root package name */
        public long f3107f;

        /* renamed from: g, reason: collision with root package name */
        public int f3108g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f3109h;

        /* renamed from: i, reason: collision with root package name */
        public long f3110i;

        /* renamed from: j, reason: collision with root package name */
        public long f3111j;

        /* renamed from: k, reason: collision with root package name */
        public Bundle f3112k;

        public c() {
            this.f3102a = new ArrayList();
            this.f3111j = -1L;
        }

        public c a(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
            }
            this.f3102a.add(customAction);
            return this;
        }

        public c b(String str, String str2, int i11) {
            return a(new CustomAction(str, str2, i11, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.f3103b, this.f3104c, this.f3105d, this.f3106e, this.f3107f, this.f3108g, this.f3109h, this.f3110i, this.f3102a, this.f3111j, this.f3112k);
        }

        public c d(long j11) {
            this.f3107f = j11;
            return this;
        }

        public c e(long j11) {
            this.f3111j = j11;
            return this;
        }

        public c f(long j11) {
            this.f3105d = j11;
            return this;
        }

        public c g(int i11, CharSequence charSequence) {
            this.f3108g = i11;
            this.f3109h = charSequence;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.f3109h = charSequence;
            return this;
        }

        public c i(Bundle bundle) {
            this.f3112k = bundle;
            return this;
        }

        public c j(int i11, long j11, float f11) {
            return k(i11, j11, f11, SystemClock.elapsedRealtime());
        }

        public c k(int i11, long j11, float f11, long j12) {
            this.f3103b = i11;
            this.f3104c = j11;
            this.f3110i = j12;
            this.f3106e = f11;
            return this;
        }

        public c(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f3102a = arrayList;
            this.f3111j = -1L;
            this.f3103b = playbackStateCompat.f3081a;
            this.f3104c = playbackStateCompat.f3082b;
            this.f3106e = playbackStateCompat.f3084d;
            this.f3110i = playbackStateCompat.f3088h;
            this.f3105d = playbackStateCompat.f3083c;
            this.f3107f = playbackStateCompat.f3085e;
            this.f3108g = playbackStateCompat.f3086f;
            this.f3109h = playbackStateCompat.f3087g;
            List<CustomAction> list = playbackStateCompat.f3089i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f3111j = playbackStateCompat.f3090j;
            this.f3112k = playbackStateCompat.f3091k;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f3093a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f3094b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3095c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f3096d;

        /* renamed from: e, reason: collision with root package name */
        public Object f3097e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i11) {
                return new CustomAction[i11];
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f3098a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f3099b;

            /* renamed from: c, reason: collision with root package name */
            public final int f3100c;

            /* renamed from: d, reason: collision with root package name */
            public Bundle f3101d;

            public b(String str, CharSequence charSequence, int i11) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                }
                if (i11 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                }
                this.f3098a = str;
                this.f3099b = charSequence;
                this.f3100c = i11;
            }

            public CustomAction a() {
                return new CustomAction(this.f3098a, this.f3099b, this.f3100c, this.f3101d);
            }

            public b b(Bundle bundle) {
                this.f3101d = bundle;
                return this;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i11, Bundle bundle) {
            this.f3093a = str;
            this.f3094b = charSequence;
            this.f3095c = i11;
            this.f3096d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(k.a.a(obj), k.a.d(obj), k.a.c(obj), k.a.b(obj));
            customAction.f3097e = obj;
            return customAction;
        }

        public String b() {
            return this.f3093a;
        }

        public Object c() {
            Object obj = this.f3097e;
            if (obj != null) {
                return obj;
            }
            Object e11 = k.a.e(this.f3093a, this.f3094b, this.f3095c, this.f3096d);
            this.f3097e = e11;
            return e11;
        }

        public Bundle d() {
            return this.f3096d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.f3095c;
        }

        public CharSequence g() {
            return this.f3094b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f3094b) + ", mIcon=" + this.f3095c + ", mExtras=" + this.f3096d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f3093a);
            TextUtils.writeToParcel(this.f3094b, parcel, i11);
            parcel.writeInt(this.f3095c);
            parcel.writeBundle(this.f3096d);
        }

        public CustomAction(Parcel parcel) {
            this.f3093a = parcel.readString();
            this.f3094b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3095c = parcel.readInt();
            this.f3096d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3081a = parcel.readInt();
        this.f3082b = parcel.readLong();
        this.f3084d = parcel.readFloat();
        this.f3088h = parcel.readLong();
        this.f3083c = parcel.readLong();
        this.f3085e = parcel.readLong();
        this.f3087g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3089i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3090j = parcel.readLong();
        this.f3091k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f3086f = parcel.readInt();
    }
}
