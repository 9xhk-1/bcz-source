package com.huawei.hms.push;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b implements Parcelable.Creator<RemoteMessage> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage createFromParcel(Parcel parcel) {
        return new RemoteMessage(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage[] newArray(int i11) {
        return new RemoteMessage[i11];
    }
}
