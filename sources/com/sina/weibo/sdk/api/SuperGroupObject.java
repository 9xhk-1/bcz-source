package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class SuperGroupObject extends MediaObject {
    public static final Parcelable.Creator<SuperGroupObject> CREATOR = new Parcelable.Creator<SuperGroupObject>() { // from class: com.sina.weibo.sdk.api.SuperGroupObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SuperGroupObject createFromParcel(Parcel parcel) {
            return new SuperGroupObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SuperGroupObject[] newArray(int i11) {
            return new SuperGroupObject[i11];
        }
    };
    public String secName;
    public String sgExtParam;
    public String sgName;

    public SuperGroupObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.sgName);
        parcel.writeString(this.secName);
        parcel.writeString(this.sgExtParam);
    }

    public SuperGroupObject(Parcel parcel) {
        this.sgName = parcel.readString();
        this.secName = parcel.readString();
        this.sgExtParam = parcel.readString();
    }
}
