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
public final class InterceptNavCloseOption implements Parcelable {
    private final boolean enabled;

    @k
    public static final Parcelable.Creator<InterceptNavCloseOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<InterceptNavCloseOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InterceptNavCloseOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new InterceptNavCloseOption(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InterceptNavCloseOption[] newArray(int i11) {
            return new InterceptNavCloseOption[i11];
        }
    }

    public InterceptNavCloseOption(boolean z11) {
        this.enabled = z11;
    }

    public static /* synthetic */ InterceptNavCloseOption copy$default(InterceptNavCloseOption interceptNavCloseOption, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = interceptNavCloseOption.enabled;
        }
        return interceptNavCloseOption.copy(z11);
    }

    public final boolean component1() {
        return this.enabled;
    }

    @k
    public final InterceptNavCloseOption copy(boolean z11) {
        return new InterceptNavCloseOption(z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterceptNavCloseOption) && this.enabled == ((InterceptNavCloseOption) obj).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    @k
    public String toString() {
        return "InterceptNavCloseOption(enabled=" + this.enabled + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.enabled ? 1 : 0);
    }
}
