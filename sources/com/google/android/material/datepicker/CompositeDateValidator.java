package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: c, reason: collision with root package name */
    public static final int f31097c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f31098d = 2;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final d f31101a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<CalendarConstraints.DateValidator> f31102b;

    /* renamed from: e, reason: collision with root package name */
    public static final d f31099e = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final d f31100f = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j11) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.f(j11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j11) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.f(j11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            return new CompositeDateValidator((List) Preconditions.checkNotNull(readArrayList), readInt == 2 ? CompositeDateValidator.f31100f : readInt == 1 ? CompositeDateValidator.f31099e : CompositeDateValidator.f31100f, null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i11) {
            return new CompositeDateValidator[i11];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j11);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @NonNull
    public static CalendarConstraints.DateValidator c(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f31100f);
    }

    @NonNull
    public static CalendarConstraints.DateValidator d(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f31099e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f31102b.equals(compositeDateValidator.f31102b) && this.f31101a.getId() == compositeDateValidator.f31101a.getId();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean f(long j11) {
        return this.f31101a.a(this.f31102b, j11);
    }

    public int hashCode() {
        return this.f31102b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeList(this.f31102b);
        parcel.writeInt(this.f31101a.getId());
    }

    public CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f31102b = list;
        this.f31101a = dVar;
    }
}
