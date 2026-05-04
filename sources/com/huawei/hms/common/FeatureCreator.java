package com.huawei.hms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class FeatureCreator implements Parcelable.Creator<Feature> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final Feature createFromParcel(Parcel parcel) {
        String str = null;
        if (parcel == null) {
            return null;
        }
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        long j11 = -1;
        int i12 = 0;
        while (i11 <= validateObjectHeader && parcel.dataPosition() < validateObjectHeader) {
            i11++;
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                i12 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                j11 = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Feature(str, i12, j11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final Feature[] newArray(int i11) {
        return new Feature[i11];
    }
}
