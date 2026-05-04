package com.baicizhan.main.activity.daka.imagedaka.imagedakav2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import e50.g;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@g
/* loaded from: classes4.dex */
public final class BonusUiData implements Parcelable {

    @k
    public static final Parcelable.Creator<BonusUiData> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final int f18394e = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f18395a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f18396b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f18397c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f18398d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<BonusUiData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BonusUiData createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new BonusUiData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BonusUiData[] newArray(int i11) {
            return new BonusUiData[i11];
        }
    }

    public BonusUiData(@k String title, @l String str, @l String str2, @k String button) {
        g0.p(title, "title");
        g0.p(button, "button");
        this.f18395a = title;
        this.f18396b = str;
        this.f18397c = str2;
        this.f18398d = button;
    }

    public static /* synthetic */ BonusUiData g(BonusUiData bonusUiData, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bonusUiData.f18395a;
        }
        if ((i11 & 2) != 0) {
            str2 = bonusUiData.f18396b;
        }
        if ((i11 & 4) != 0) {
            str3 = bonusUiData.f18397c;
        }
        if ((i11 & 8) != 0) {
            str4 = bonusUiData.f18398d;
        }
        return bonusUiData.e(str, str2, str3, str4);
    }

    @k
    public final String a() {
        return this.f18395a;
    }

    @l
    public final String b() {
        return this.f18396b;
    }

    @l
    public final String c() {
        return this.f18397c;
    }

    @k
    public final String d() {
        return this.f18398d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final BonusUiData e(@k String title, @l String str, @l String str2, @k String button) {
        g0.p(title, "title");
        g0.p(button, "button");
        return new BonusUiData(title, str, str2, button);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusUiData)) {
            return false;
        }
        BonusUiData bonusUiData = (BonusUiData) obj;
        return g0.g(this.f18395a, bonusUiData.f18395a) && g0.g(this.f18396b, bonusUiData.f18396b) && g0.g(this.f18397c, bonusUiData.f18397c) && g0.g(this.f18398d, bonusUiData.f18398d);
    }

    @k
    public final String h() {
        return this.f18398d;
    }

    public int hashCode() {
        int hashCode = this.f18395a.hashCode() * 31;
        String str = this.f18396b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18397c;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f18398d.hashCode();
    }

    @l
    public final String i() {
        return this.f18396b;
    }

    @k
    public final String j() {
        return this.f18395a;
    }

    @l
    public final String k() {
        return this.f18397c;
    }

    @k
    public String toString() {
        return "BonusUiData(title=" + this.f18395a + ", content=" + this.f18396b + ", url=" + this.f18397c + ", button=" + this.f18398d + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeString(this.f18395a);
        dest.writeString(this.f18396b);
        dest.writeString(this.f18397c);
        dest.writeString(this.f18398d);
    }
}
