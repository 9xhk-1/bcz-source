package com.getui.gtc.entity;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes6.dex */
public class Ie implements Parcelable {
    public static final Parcelable.Creator<Ie> CREATOR = new Parcelable.Creator<Ie>() { // from class: com.getui.gtc.entity.Ie.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Ie createFromParcel(Parcel parcel) {
            return new Ie(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Ie[] newArray(int i11) {
            return new Ie[i11];
        }
    };
    private String aid;

    /* renamed from: cn, reason: collision with root package name */
    private String f30042cn;

    /* renamed from: cs, reason: collision with root package name */
    private String f30043cs;

    /* renamed from: k, reason: collision with root package name */
    private String f30044k;

    public Ie() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.f30042cn;
            String str2 = ((Ie) obj).f30042cn;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getAid() {
        return this.aid;
    }

    public String getCn() {
        return this.f30042cn;
    }

    public String getCs() {
        return this.f30043cs;
    }

    public String getK() {
        return this.f30044k;
    }

    public int hashCode() {
        String str = this.f30042cn;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCn(String str) {
        this.f30042cn = str;
    }

    public void setCs(String str) {
        this.f30043cs = str;
    }

    public void setK(String str) {
        this.f30044k = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f30042cn);
        parcel.writeString(this.aid);
        parcel.writeString(this.f30043cs);
        parcel.writeString(this.f30044k);
    }

    public Ie(Parcel parcel) {
        this.f30042cn = parcel.readString();
        this.aid = parcel.readString();
        this.f30043cs = parcel.readString();
        this.f30044k = parcel.readString();
    }
}
