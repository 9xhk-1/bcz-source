package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f31104a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward createFromParcel(@NonNull Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DateValidatorPointForward[] newArray(int i11) {
            return new DateValidatorPointForward[i11];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j11, a aVar) {
        this(j11);
    }

    @NonNull
    public static DateValidatorPointForward a(long j11) {
        return new DateValidatorPointForward(j11);
    }

    @NonNull
    public static DateValidatorPointForward b() {
        return a(v.v().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f31104a == ((DateValidatorPointForward) obj).f31104a;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean f(long j11) {
        return j11 >= this.f31104a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31104a)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeLong(this.f31104a);
    }

    public DateValidatorPointForward(long j11) {
        this.f31104a = j11;
    }
}
