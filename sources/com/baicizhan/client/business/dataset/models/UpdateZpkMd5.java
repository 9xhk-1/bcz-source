package com.baicizhan.client.business.dataset.models;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UpdateZpkMd5 implements Parcelable {
    public static final Parcelable.Creator<UpdateZpkMd5> CREATOR = new Parcelable.Creator<UpdateZpkMd5>() { // from class: com.baicizhan.client.business.dataset.models.UpdateZpkMd5.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UpdateZpkMd5 createFromParcel(Parcel in2) {
            return new UpdateZpkMd5(in2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UpdateZpkMd5[] newArray(int size) {
            return new UpdateZpkMd5[size];
        }
    };
    public String updateFlagMD5;
    public int updateZpkversion;
    public int zpkVersion;

    public UpdateZpkMd5(String updateFlagMD5, int zpkVersion, int updateZpkversion) {
        this.updateFlagMD5 = updateFlagMD5;
        this.zpkVersion = zpkVersion;
        this.updateZpkversion = updateZpkversion;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.updateFlagMD5);
        dest.writeInt(this.zpkVersion);
        dest.writeInt(this.updateZpkversion);
    }

    public UpdateZpkMd5(Parcel in2) {
        this.updateFlagMD5 = in2.readString();
        this.zpkVersion = in2.readInt();
        this.updateZpkversion = in2.readInt();
    }
}
