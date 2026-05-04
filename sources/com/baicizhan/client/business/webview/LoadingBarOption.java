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
public final class LoadingBarOption implements Parcelable {

    @l
    private final String bgColor;

    @l
    private final String color;
    private final boolean visible;

    @k
    public static final Parcelable.Creator<LoadingBarOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<LoadingBarOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoadingBarOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new LoadingBarOption(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoadingBarOption[] newArray(int i11) {
            return new LoadingBarOption[i11];
        }
    }

    @w00.k
    public LoadingBarOption() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ LoadingBarOption copy$default(LoadingBarOption loadingBarOption, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = loadingBarOption.visible;
        }
        if ((i11 & 2) != 0) {
            str = loadingBarOption.bgColor;
        }
        if ((i11 & 4) != 0) {
            str2 = loadingBarOption.color;
        }
        return loadingBarOption.copy(z11, str, str2);
    }

    public final boolean component1() {
        return this.visible;
    }

    @l
    public final String component2() {
        return this.bgColor;
    }

    @l
    public final String component3() {
        return this.color;
    }

    @k
    public final LoadingBarOption copy(boolean z11, @l String str, @l String str2) {
        return new LoadingBarOption(z11, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingBarOption)) {
            return false;
        }
        LoadingBarOption loadingBarOption = (LoadingBarOption) obj;
        return this.visible == loadingBarOption.visible && g0.g(this.bgColor, loadingBarOption.bgColor) && g0.g(this.color, loadingBarOption.color);
    }

    @l
    public final String getBgColor() {
        return this.bgColor;
    }

    @l
    public final String getColor() {
        return this.color;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.visible) * 31;
        String str = this.bgColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "LoadingBarOption(visible=" + this.visible + ", bgColor=" + this.bgColor + ", color=" + this.color + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeInt(this.visible ? 1 : 0);
        dest.writeString(this.bgColor);
        dest.writeString(this.color);
    }

    @w00.k
    public LoadingBarOption(boolean z11) {
        this(z11, null, null, 6, null);
    }

    @w00.k
    public LoadingBarOption(boolean z11, @l String str) {
        this(z11, str, null, 4, null);
    }

    @w00.k
    public LoadingBarOption(boolean z11, @l String str, @l String str2) {
        this.visible = z11;
        this.bgColor = str;
        this.color = str2;
    }

    public /* synthetic */ LoadingBarOption(boolean z11, String str, String str2, int i11, v vVar) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
