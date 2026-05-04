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
public final class SaveToAlbumOption implements Parcelable {

    @l
    private final String imgData;

    @k
    public static final Parcelable.Creator<SaveToAlbumOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<SaveToAlbumOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SaveToAlbumOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new SaveToAlbumOption(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SaveToAlbumOption[] newArray(int i11) {
            return new SaveToAlbumOption[i11];
        }
    }

    public SaveToAlbumOption(@l String str) {
        this.imgData = str;
    }

    public static /* synthetic */ SaveToAlbumOption copy$default(SaveToAlbumOption saveToAlbumOption, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = saveToAlbumOption.imgData;
        }
        return saveToAlbumOption.copy(str);
    }

    @l
    public final String component1() {
        return this.imgData;
    }

    @k
    public final SaveToAlbumOption copy(@l String str) {
        return new SaveToAlbumOption(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveToAlbumOption) && g0.g(this.imgData, ((SaveToAlbumOption) obj).imgData);
    }

    @l
    public final String getImgData() {
        return this.imgData;
    }

    public int hashCode() {
        String str = this.imgData;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public String toString() {
        return "SaveToAlbumOption(imgData=" + this.imgData + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeString(this.imgData);
    }
}
