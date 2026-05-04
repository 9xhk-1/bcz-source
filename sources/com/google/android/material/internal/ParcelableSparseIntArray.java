package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<ParcelableSparseIntArray> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray createFromParcel(@NonNull Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i11 = 0; i11 < readInt; i11++) {
                parcelableSparseIntArray.put(iArr[i11], iArr2[i11]);
            }
            return parcelableSparseIntArray;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray[] newArray(int i11) {
            return new ParcelableSparseIntArray[i11];
        }
    }

    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i12 = 0; i12 < size(); i12++) {
            iArr[i12] = keyAt(i12);
            iArr2[i12] = valueAt(i12);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ParcelableSparseIntArray(int i11) {
        super(i11);
    }

    public ParcelableSparseIntArray(@NonNull SparseIntArray sparseIntArray) {
        for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
            put(sparseIntArray.keyAt(i11), sparseIntArray.valueAt(i11));
        }
    }
}
