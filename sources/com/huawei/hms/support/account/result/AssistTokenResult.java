package com.huawei.hms.support.account.result;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AssistTokenResult implements Parcelable {
    public static final Parcelable.Creator<AssistTokenResult> CREATOR = new Parcelable.Creator<AssistTokenResult>() { // from class: com.huawei.hms.support.account.result.AssistTokenResult.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AssistTokenResult createFromParcel(Parcel parcel) {
            return new AssistTokenResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AssistTokenResult[] newArray(int i11) {
            return new AssistTokenResult[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f36257a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAssistToken() {
        return this.f36257a;
    }

    public void setAssistToken(String str) {
        this.f36257a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f36257a);
    }

    public AssistTokenResult() {
    }

    private AssistTokenResult(Parcel parcel) {
        this.f36257a = parcel.readString();
    }
}
