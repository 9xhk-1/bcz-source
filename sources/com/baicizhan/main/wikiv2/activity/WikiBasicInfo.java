package com.baicizhan.main.wikiv2.activity;

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
/* loaded from: classes3.dex */
public final class WikiBasicInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<WikiBasicInfo> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f25540c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f25541a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25542b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<WikiBasicInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WikiBasicInfo createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new WikiBasicInfo(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WikiBasicInfo[] newArray(int i11) {
            return new WikiBasicInfo[i11];
        }
    }

    public WikiBasicInfo(int i11, int i12) {
        this.f25541a = i11;
        this.f25542b = i12;
    }

    public static /* synthetic */ WikiBasicInfo d(WikiBasicInfo wikiBasicInfo, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = wikiBasicInfo.f25541a;
        }
        if ((i13 & 2) != 0) {
            i12 = wikiBasicInfo.f25542b;
        }
        return wikiBasicInfo.c(i11, i12);
    }

    public final int a() {
        return this.f25541a;
    }

    public final int b() {
        return this.f25542b;
    }

    @k
    public final WikiBasicInfo c(int i11, int i12) {
        return new WikiBasicInfo(i11, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f25542b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WikiBasicInfo)) {
            return false;
        }
        WikiBasicInfo wikiBasicInfo = (WikiBasicInfo) obj;
        return this.f25541a == wikiBasicInfo.f25541a && this.f25542b == wikiBasicInfo.f25542b;
    }

    public final int g() {
        return this.f25541a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f25541a) * 31) + Integer.hashCode(this.f25542b);
    }

    @k
    public String toString() {
        return "WikiBasicInfo(topicId=" + this.f25541a + ", bookId=" + this.f25542b + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.f25541a);
        dest.writeInt(this.f25542b);
    }
}
