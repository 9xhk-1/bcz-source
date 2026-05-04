package com.baicizhan.client.business.webview;

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
public final class TurnOnNotifPushOption implements Parcelable {

    @k
    private final String mode;

    @k
    public static final Parcelable.Creator<TurnOnNotifPushOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<TurnOnNotifPushOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TurnOnNotifPushOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new TurnOnNotifPushOption(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TurnOnNotifPushOption[] newArray(int i11) {
            return new TurnOnNotifPushOption[i11];
        }
    }

    public TurnOnNotifPushOption(@k String mode) {
        g0.p(mode, "mode");
        this.mode = mode;
    }

    public static /* synthetic */ TurnOnNotifPushOption copy$default(TurnOnNotifPushOption turnOnNotifPushOption, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = turnOnNotifPushOption.mode;
        }
        return turnOnNotifPushOption.copy(str);
    }

    @k
    public final String component1() {
        return this.mode;
    }

    @k
    public final TurnOnNotifPushOption copy(@k String mode) {
        g0.p(mode, "mode");
        return new TurnOnNotifPushOption(mode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TurnOnNotifPushOption) && g0.g(this.mode, ((TurnOnNotifPushOption) obj).mode);
    }

    @k
    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.mode.hashCode();
    }

    @k
    public String toString() {
        return "TurnOnNotifPushOption(mode=" + this.mode + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeString(this.mode);
    }
}
