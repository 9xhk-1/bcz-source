package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class WebServerPicCreator implements Parcelable.Creator<WebServerPic> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public WebServerPic createFromParcel(Parcel parcel) {
        return new WebServerPic((Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public WebServerPic[] newArray(int i11) {
        return new WebServerPic[i11];
    }
}
