package com.baicizhan.client.business.managers.winningstreak.data;

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
public final class CurrentCount implements Parcelable {

    @k
    public static final Parcelable.Creator<CurrentCount> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f16519c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f16520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16521b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Parcelable.Creator<CurrentCount> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CurrentCount createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new CurrentCount(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CurrentCount[] newArray(int i11) {
            return new CurrentCount[i11];
        }
    }

    public CurrentCount(int i11, int i12) {
        this.f16520a = i11;
        this.f16521b = i12;
    }

    public static /* synthetic */ CurrentCount d(CurrentCount currentCount, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = currentCount.f16520a;
        }
        if ((i13 & 2) != 0) {
            i12 = currentCount.f16521b;
        }
        return currentCount.c(i11, i12);
    }

    public final int a() {
        return this.f16520a;
    }

    public final int b() {
        return this.f16521b;
    }

    @k
    public final CurrentCount c(int i11, int i12) {
        return new CurrentCount(i11, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f16520a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentCount)) {
            return false;
        }
        CurrentCount currentCount = (CurrentCount) obj;
        return this.f16520a == currentCount.f16520a && this.f16521b == currentCount.f16521b;
    }

    public final int g() {
        return this.f16521b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f16520a) * 31) + Integer.hashCode(this.f16521b);
    }

    @k
    public String toString() {
        return "CurrentCount(count=" + this.f16520a + ", data=" + this.f16521b + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.f16520a);
        dest.writeInt(this.f16521b);
    }
}
