package com.baicizhan.client.business.webview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@e50.g
/* loaded from: classes4.dex */
public final class StatusBarOption implements Parcelable {

    @l
    @wo.c("color")
    private final String foregroundColor;
    private final boolean visible;

    @k
    public static final Parcelable.Creator<StatusBarOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<StatusBarOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StatusBarOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new StatusBarOption(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StatusBarOption[] newArray(int i11) {
            return new StatusBarOption[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public StatusBarOption() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StatusBarOption copy$default(StatusBarOption statusBarOption, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = statusBarOption.visible;
        }
        if ((i11 & 2) != 0) {
            str = statusBarOption.foregroundColor;
        }
        return statusBarOption.copy(z11, str);
    }

    public final boolean component1() {
        return this.visible;
    }

    @l
    public final String component2() {
        return this.foregroundColor;
    }

    @k
    public final StatusBarOption copy(boolean z11, @l String str) {
        return new StatusBarOption(z11, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusBarOption)) {
            return false;
        }
        StatusBarOption statusBarOption = (StatusBarOption) obj;
        return this.visible == statusBarOption.visible && g0.g(this.foregroundColor, statusBarOption.foregroundColor);
    }

    @l
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.visible) * 31;
        String str = this.foregroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        return "StatusBarOption(visible=" + this.visible + ", foregroundColor=" + this.foregroundColor + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.visible ? 1 : 0);
        dest.writeString(this.foregroundColor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public StatusBarOption(boolean z11) {
        this(z11, null, 2, 0 == true ? 1 : 0);
    }

    @w00.k
    public StatusBarOption(boolean z11, @l String str) {
        this.visible = z11;
        this.foregroundColor = str;
    }

    public /* synthetic */ StatusBarOption(boolean z11, String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? null : str);
    }
}
