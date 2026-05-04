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
public final class HwPayResponse implements Parcelable {

    @k
    @wo.c("orderId")
    private final String orderId;

    @wo.c("result")
    private final int result;

    @k
    public static final Parcelable.Creator<HwPayResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<HwPayResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HwPayResponse createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new HwPayResponse(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HwPayResponse[] newArray(int i11) {
            return new HwPayResponse[i11];
        }
    }

    public HwPayResponse(int i11, @k String orderId) {
        g0.p(orderId, "orderId");
        this.result = i11;
        this.orderId = orderId;
    }

    public static /* synthetic */ HwPayResponse copy$default(HwPayResponse hwPayResponse, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = hwPayResponse.result;
        }
        if ((i12 & 2) != 0) {
            str = hwPayResponse.orderId;
        }
        return hwPayResponse.copy(i11, str);
    }

    public final int component1() {
        return this.result;
    }

    @k
    public final String component2() {
        return this.orderId;
    }

    @k
    public final HwPayResponse copy(int i11, @k String orderId) {
        g0.p(orderId, "orderId");
        return new HwPayResponse(i11, orderId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HwPayResponse)) {
            return false;
        }
        HwPayResponse hwPayResponse = (HwPayResponse) obj;
        return this.result == hwPayResponse.result && g0.g(this.orderId, hwPayResponse.orderId);
    }

    @k
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getResult() {
        return this.result;
    }

    public int hashCode() {
        return (Integer.hashCode(this.result) * 31) + this.orderId.hashCode();
    }

    @k
    public String toString() {
        return "HwPayResponse(result=" + this.result + ", orderId=" + this.orderId + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.result);
        dest.writeString(this.orderId);
    }
}
