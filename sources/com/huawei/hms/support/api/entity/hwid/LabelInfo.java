package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class LabelInfo implements Parcelable {
    public static final Parcelable.Creator<LabelInfo> CREATOR = new Parcelable.Creator<LabelInfo>() { // from class: com.huawei.hms.support.api.entity.hwid.LabelInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo createFromParcel(Parcel parcel) {
            return new LabelInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LabelInfo[] newArray(int i11) {
            return new LabelInfo[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private int f36293a;

    /* renamed from: b, reason: collision with root package name */
    private String f36294b;

    public LabelInfo() {
        this.f36293a = -1;
        this.f36294b = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getLabelName() {
        return this.f36294b;
    }

    public int getLabelType() {
        return this.f36293a;
    }

    public boolean isEquals(LabelInfo labelInfo) {
        return labelInfo != null && getLabelType() == labelInfo.getLabelType() && getLabelName().equals(labelInfo.getLabelName());
    }

    public void setLabelName(String str) {
        this.f36294b = str;
    }

    public void setLabelType(int i11) {
        this.f36293a = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36293a);
        parcel.writeString(this.f36294b);
    }

    public LabelInfo(Parcel parcel) {
        this.f36293a = parcel.readInt();
        this.f36294b = parcel.readString();
    }
}
