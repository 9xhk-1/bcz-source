package com.baicizhan.client.business.webview.hwpay;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@e50.g
/* loaded from: classes4.dex */
public final class SupportHuaweiPay implements Parcelable {
    private final boolean isSupport;

    @k
    public static final Parcelable.Creator<SupportHuaweiPay> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<SupportHuaweiPay> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportHuaweiPay createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new SupportHuaweiPay(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportHuaweiPay[] newArray(int i11) {
            return new SupportHuaweiPay[i11];
        }
    }

    public SupportHuaweiPay(boolean z11) {
        this.isSupport = z11;
    }

    public static /* synthetic */ SupportHuaweiPay copy$default(SupportHuaweiPay supportHuaweiPay, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = supportHuaweiPay.isSupport;
        }
        return supportHuaweiPay.copy(z11);
    }

    public final boolean component1() {
        return this.isSupport;
    }

    @k
    public final SupportHuaweiPay copy(boolean z11) {
        return new SupportHuaweiPay(z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportHuaweiPay) && this.isSupport == ((SupportHuaweiPay) obj).isSupport;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSupport);
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @k
    public String toString() {
        return "SupportHuaweiPay(isSupport=" + this.isSupport + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.isSupport ? 1 : 0);
    }
}
