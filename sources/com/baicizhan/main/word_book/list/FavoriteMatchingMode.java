package com.baicizhan.main.word_book.list;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public abstract class FavoriteMatchingMode implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f26729b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f26730a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @e50.g
    public static final class BytesByOcr extends FavoriteMatchingMode {

        @m80.k
        public static final Parcelable.Creator<BytesByOcr> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f26734d = 8;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Uri f26735c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Parcelable.Creator<BytesByOcr> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BytesByOcr createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.g0.p(parcel, "parcel");
                return new BytesByOcr((Uri) parcel.readParcelable(BytesByOcr.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BytesByOcr[] newArray(int i11) {
                return new BytesByOcr[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BytesByOcr(@m80.k Uri uri) {
            super(0L, 1, null);
            kotlin.jvm.internal.g0.p(uri, "uri");
            this.f26735c = uri;
        }

        @m80.k
        public final Uri b() {
            return this.f26735c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@m80.k Parcel dest, int i11) {
            kotlin.jvm.internal.g0.p(dest, "dest");
            dest.writeParcelable(this.f26735c, i11);
        }
    }

    public /* synthetic */ FavoriteMatchingMode(long j11, kotlin.jvm.internal.v vVar) {
        this(j11);
    }

    public long a() {
        return this.f26730a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @e50.g
    public static final class Bytes extends FavoriteMatchingMode {

        @m80.k
        public static final Parcelable.Creator<Bytes> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public static final int f26731e = 8;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Uri f26732c;

        /* renamed from: d, reason: collision with root package name */
        public final long f26733d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Parcelable.Creator<Bytes> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bytes createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.g0.p(parcel, "parcel");
                return new Bytes((Uri) parcel.readParcelable(Bytes.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Bytes[] newArray(int i11) {
                return new Bytes[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bytes(@m80.k Uri uri, long j11) {
            super(j11, null);
            kotlin.jvm.internal.g0.p(uri, "uri");
            this.f26732c = uri;
            this.f26733d = j11;
        }

        @Override // com.baicizhan.main.word_book.list.FavoriteMatchingMode
        public long a() {
            return this.f26733d;
        }

        @m80.k
        public final Uri b() {
            return this.f26732c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@m80.k Parcel dest, int i11) {
            kotlin.jvm.internal.g0.p(dest, "dest");
            dest.writeParcelable(this.f26732c, i11);
            dest.writeLong(this.f26733d);
        }

        public /* synthetic */ Bytes(Uri uri, long j11, int i11, kotlin.jvm.internal.v vVar) {
            this(uri, (i11 & 2) != 0 ? -1L : j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @e50.g
    public static final class Description extends FavoriteMatchingMode {

        @m80.k
        public static final Parcelable.Creator<Description> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public static final int f26736e = 8;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f26737c;

        /* renamed from: d, reason: collision with root package name */
        public final long f26738d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Description createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.g0.p(parcel, "parcel");
                return new Description(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Description[] newArray(int i11) {
                return new Description[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Description(@m80.k String description, long j11) {
            super(j11, null);
            kotlin.jvm.internal.g0.p(description, "description");
            this.f26737c = description;
            this.f26738d = j11;
        }

        @Override // com.baicizhan.main.word_book.list.FavoriteMatchingMode
        public long a() {
            return this.f26738d;
        }

        @m80.k
        public final String b() {
            return this.f26737c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@m80.k Parcel dest, int i11) {
            kotlin.jvm.internal.g0.p(dest, "dest");
            dest.writeString(this.f26737c);
            dest.writeLong(this.f26738d);
        }

        public /* synthetic */ Description(String str, long j11, int i11, kotlin.jvm.internal.v vVar) {
            this(str, (i11 & 2) != 0 ? -1L : j11);
        }
    }

    public FavoriteMatchingMode(long j11) {
        this.f26730a = j11;
    }

    public /* synthetic */ FavoriteMatchingMode(long j11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? -1L : j11, null);
    }
}
