package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Month f31082a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Month f31083b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final DateValidator f31084c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Month f31085d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31086e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31087f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31088g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface DateValidator extends Parcelable {
        boolean f(long j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i11) {
            return new CalendarConstraints[i11];
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i11, a aVar) {
        this(month, month2, dateValidator, month3, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f31082a.equals(calendarConstraints.f31082a) && this.f31083b.equals(calendarConstraints.f31083b) && ObjectsCompat.equals(this.f31085d, calendarConstraints.f31085d) && this.f31086e == calendarConstraints.f31086e && this.f31084c.equals(calendarConstraints.f31084c);
    }

    public Month g(Month month) {
        return month.compareTo(this.f31082a) < 0 ? this.f31082a : month.compareTo(this.f31083b) > 0 ? this.f31083b : month;
    }

    public DateValidator h() {
        return this.f31084c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31082a, this.f31083b, this.f31085d, Integer.valueOf(this.f31086e), this.f31084c});
    }

    @NonNull
    public Month i() {
        return this.f31083b;
    }

    public long j() {
        return this.f31083b.f31113f;
    }

    public int k() {
        return this.f31086e;
    }

    public int l() {
        return this.f31088g;
    }

    @Nullable
    public Month m() {
        return this.f31085d;
    }

    @Nullable
    public Long n() {
        Month month = this.f31085d;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f31113f);
    }

    @NonNull
    public Month o() {
        return this.f31082a;
    }

    public long p() {
        return this.f31082a.f31113f;
    }

    public int r() {
        return this.f31087f;
    }

    public boolean s(long j11) {
        if (this.f31082a.g(1) > j11) {
            return false;
        }
        Month month = this.f31083b;
        return j11 <= month.g(month.f31112e);
    }

    public void t(@Nullable Month month) {
        this.f31085d = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f31082a, 0);
        parcel.writeParcelable(this.f31083b, 0);
        parcel.writeParcelable(this.f31085d, 0);
        parcel.writeParcelable(this.f31084c, 0);
        parcel.writeInt(this.f31086e);
    }

    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3, int i11) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f31082a = month;
        this.f31083b = month2;
        this.f31085d = month3;
        this.f31086e = i11;
        this.f31084c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i11 < 0 || i11 > v.x().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f31088g = month.o(month2) + 1;
        this.f31087f = (month2.f31110c - month.f31110c) + 1;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f31089f = v.a(Month.b(1900, 0).f31113f);

        /* renamed from: g, reason: collision with root package name */
        public static final long f31090g = v.a(Month.b(2100, 11).f31113f);

        /* renamed from: h, reason: collision with root package name */
        public static final String f31091h = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: a, reason: collision with root package name */
        public long f31092a;

        /* renamed from: b, reason: collision with root package name */
        public long f31093b;

        /* renamed from: c, reason: collision with root package name */
        public Long f31094c;

        /* renamed from: d, reason: collision with root package name */
        public int f31095d;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f31096e;

        public b() {
            this.f31092a = f31089f;
            this.f31093b = f31090g;
            this.f31096e = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f31091h, this.f31096e);
            Month c11 = Month.c(this.f31092a);
            Month c12 = Month.c(this.f31093b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f31091h);
            Long l11 = this.f31094c;
            return new CalendarConstraints(c11, c12, dateValidator, l11 == null ? null : Month.c(l11.longValue()), this.f31095d, null);
        }

        @NonNull
        @uo.a
        public b b(long j11) {
            this.f31093b = j11;
            return this;
        }

        @NonNull
        @uo.a
        public b c(int i11) {
            this.f31095d = i11;
            return this;
        }

        @NonNull
        @uo.a
        public b d(long j11) {
            this.f31094c = Long.valueOf(j11);
            return this;
        }

        @NonNull
        @uo.a
        public b e(long j11) {
            this.f31092a = j11;
            return this;
        }

        @NonNull
        @uo.a
        public b f(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f31096e = dateValidator;
            return this;
        }

        public b(@NonNull CalendarConstraints calendarConstraints) {
            this.f31092a = f31089f;
            this.f31093b = f31090g;
            this.f31096e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f31092a = calendarConstraints.f31082a.f31113f;
            this.f31093b = calendarConstraints.f31083b.f31113f;
            this.f31094c = Long.valueOf(calendarConstraints.f31085d.f31113f);
            this.f31095d = calendarConstraints.f31086e;
            this.f31096e = calendarConstraints.f31084c;
        }
    }
}
