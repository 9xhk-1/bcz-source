package com.baicizhan.client.business.webview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@e50.g
/* loaded from: classes4.dex */
public final class PrivacyInfoOption implements Parcelable {

    @l
    private final List<String> features;

    @k
    public static final Parcelable.Creator<PrivacyInfoOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Creator implements Parcelable.Creator<PrivacyInfoOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivacyInfoOption createFromParcel(Parcel parcel) {
            g0.p(parcel, "parcel");
            return new PrivacyInfoOption(parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrivacyInfoOption[] newArray(int i11) {
            return new PrivacyInfoOption[i11];
        }
    }

    public PrivacyInfoOption(@l List<String> list) {
        this.features = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacyInfoOption copy$default(PrivacyInfoOption privacyInfoOption, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = privacyInfoOption.features;
        }
        return privacyInfoOption.copy(list);
    }

    @l
    public final List<String> component1() {
        return this.features;
    }

    @k
    public final PrivacyInfoOption copy(@l List<String> list) {
        return new PrivacyInfoOption(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyInfoOption) && g0.g(this.features, ((PrivacyInfoOption) obj).features);
    }

    @l
    public final List<String> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        List<String> list = this.features;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public String toString() {
        return "PrivacyInfoOption(features=" + this.features + j.f81007d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel dest, int i11) {
        g0.p(dest, "dest");
        dest.writeStringList(this.features);
    }
}
