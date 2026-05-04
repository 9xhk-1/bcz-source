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
public final class InterceptNavBackOption implements Parcelable {
    private final boolean enabled;

    @k
    public static final Parcelable.Creator<InterceptNavBackOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<InterceptNavBackOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InterceptNavBackOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new InterceptNavBackOption(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InterceptNavBackOption[] newArray(int i11) {
            return new InterceptNavBackOption[i11];
        }
    }

    public InterceptNavBackOption(boolean z11) {
        this.enabled = z11;
    }

    public static /* synthetic */ InterceptNavBackOption copy$default(InterceptNavBackOption interceptNavBackOption, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = interceptNavBackOption.enabled;
        }
        return interceptNavBackOption.copy(z11);
    }

    public final boolean component1() {
        return this.enabled;
    }

    @k
    public final InterceptNavBackOption copy(boolean z11) {
        return new InterceptNavBackOption(z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterceptNavBackOption) && this.enabled == ((InterceptNavBackOption) obj).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    @k
    public String toString() {
        return "InterceptNavBackOption(enabled=" + this.enabled + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.enabled ? 1 : 0);
    }
}
