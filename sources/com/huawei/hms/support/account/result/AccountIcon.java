package com.huawei.hms.support.account.result;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AccountIcon implements Parcelable {
    public static final Parcelable.Creator<AccountIcon> CREATOR = new Parcelable.Creator<AccountIcon>() { // from class: com.huawei.hms.support.account.result.AccountIcon.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon createFromParcel(Parcel parcel) {
            return new AccountIcon(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon[] newArray(int i11) {
            return new AccountIcon[i11];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f36255a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f36256b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.f36255a;
    }

    public Bitmap getIcon() {
        return this.f36256b;
    }

    public void setDescription(String str) {
        this.f36255a = str;
    }

    public void setIcon(Bitmap bitmap) {
        this.f36256b = bitmap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f36255a);
        parcel.writeParcelable(this.f36256b, i11);
    }

    public AccountIcon() {
    }

    private AccountIcon(Parcel parcel) {
        this.f36255a = parcel.readString();
        this.f36256b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public AccountIcon(String str, Bitmap bitmap) {
        this.f36255a = str;
        this.f36256b = bitmap;
    }
}
