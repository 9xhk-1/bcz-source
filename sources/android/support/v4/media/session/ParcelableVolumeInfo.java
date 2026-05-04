package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f3044a;

    /* renamed from: b, reason: collision with root package name */
    public int f3045b;

    /* renamed from: c, reason: collision with root package name */
    public int f3046c;

    /* renamed from: d, reason: collision with root package name */
    public int f3047d;

    /* renamed from: e, reason: collision with root package name */
    public int f3048e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    public ParcelableVolumeInfo(int i11, int i12, int i13, int i14, int i15) {
        this.f3044a = i11;
        this.f3045b = i12;
        this.f3046c = i13;
        this.f3047d = i14;
        this.f3048e = i15;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3044a);
        parcel.writeInt(this.f3046c);
        parcel.writeInt(this.f3047d);
        parcel.writeInt(this.f3048e);
        parcel.writeInt(this.f3045b);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f3044a = parcel.readInt();
        this.f3046c = parcel.readInt();
        this.f3047d = parcel.readInt();
        this.f3048e = parcel.readInt();
        this.f3045b = parcel.readInt();
    }
}
