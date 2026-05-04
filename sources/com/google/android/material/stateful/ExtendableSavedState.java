package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;
import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SimpleArrayMap<String, Bundle> f32221a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel) {
            return new ExtendableSavedState(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState[] newArray(int i11) {
            return new ExtendableSavedState[i11];
        }
    }

    public /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f32221a + i.f11099d;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        int size = this.f32221a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i12 = 0; i12 < size; i12++) {
            strArr[i12] = this.f32221a.keyAt(i12);
            bundleArr[i12] = this.f32221a.valueAt(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f32221a = new SimpleArrayMap<>();
    }

    public ExtendableSavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f32221a = new SimpleArrayMap<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f32221a.put(strArr[i11], bundleArr[i11]);
        }
    }
}
