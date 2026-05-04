package com.sina.weibo.sdk.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class VideoSourceObject extends MediaObject {
    public static final Parcelable.Creator<VideoSourceObject> CREATOR = new Parcelable.Creator<VideoSourceObject>() { // from class: com.sina.weibo.sdk.api.VideoSourceObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VideoSourceObject createFromParcel(Parcel parcel) {
            return new VideoSourceObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VideoSourceObject[] newArray(int i11) {
            return new VideoSourceObject[i11];
        }
    };
    private static final long serialVersionUID = 2745594466460840583L;
    public Uri coverPath;
    public long during;
    public Uri videoPath;

    public VideoSourceObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeParcelable(this.coverPath, i11);
        parcel.writeParcelable(this.videoPath, i11);
        parcel.writeLong(this.during);
    }

    public VideoSourceObject(Parcel parcel) {
        super(parcel);
        this.coverPath = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.videoPath = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.during = parcel.readLong();
    }
}
