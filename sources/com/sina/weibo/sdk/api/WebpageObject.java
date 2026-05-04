package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WebpageObject extends MediaObject {
    public static final Parcelable.Creator<WebpageObject> CREATOR = new Parcelable.Creator<WebpageObject>() { // from class: com.sina.weibo.sdk.api.WebpageObject.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebpageObject createFromParcel(Parcel parcel) {
            return new WebpageObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebpageObject[] newArray(int i11) {
            return new WebpageObject[i11];
        }
    };
    private static final long serialVersionUID = 7142128794153927442L;
    public String defaultText;

    public WebpageObject() {
    }

    @Override // com.sina.weibo.sdk.api.MediaObject, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
    }

    public WebpageObject(Parcel parcel) {
        super(parcel);
    }
}
