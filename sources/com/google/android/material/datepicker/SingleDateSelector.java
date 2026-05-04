package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f31131a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Long f31132b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public SimpleDateFormat f31133c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ r f31134i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f31135j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, r rVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f31134i = rVar;
            this.f31135j = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            SingleDateSelector.this.f31131a = this.f31135j.getError();
            this.f31134i.a();
        }

        @Override // com.google.android.material.datepicker.e
        public void e(@Nullable Long l11) {
            if (l11 == null) {
                SingleDateSelector.this.d();
            } else {
                SingleDateSelector.this.v0(l11.longValue());
            }
            SingleDateSelector.this.f31131a = null;
            this.f31134i.b(SingleDateSelector.this.o0());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f31132b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i11) {
            return new SingleDateSelector[i11];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String A0(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.f31132b;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l11 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : h.m(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String F0(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.f31132b;
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, h.m(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> G0() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View c0(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull r<Long> rVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.l.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.f31133c;
        boolean z11 = simpleDateFormat != null;
        if (!z11) {
            simpleDateFormat = v.g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        String pattern = z11 ? simpleDateFormat2.toPattern() : v.h(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        Long l11 = this.f31132b;
        if (l11 != null) {
            editText.setText(simpleDateFormat2.format(l11));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat2, textInputLayout, calendarConstraints, rVar, textInputLayout));
        DateSelector.N0(editText);
        return inflate;
    }

    public final void d() {
        this.f31132b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long o0() {
        return this.f31132b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void f0(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) v.q(simpleDateFormat);
        }
        this.f31133c = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void Z(@Nullable Long l11) {
        this.f31132b = l11 == null ? null : Long.valueOf(v.a(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f31131a)) {
            return null;
        }
        return this.f31131a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean h0() {
        return this.f31132b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> m0() {
        ArrayList arrayList = new ArrayList();
        Long l11 = this.f31132b;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int q() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void v0(long j11) {
        this.f31132b = Long.valueOf(j11);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int w(Context context) {
        return sn.b.g(context, R.attr.materialCalendarTheme, l.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeValue(this.f31132b);
    }
}
