package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f31115a;

    /* renamed from: b, reason: collision with root package name */
    public String f31116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31117c = " ";

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Long f31118d = null;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Long f31119e = null;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Long f31120f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public Long f31121g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public SimpleDateFormat f31122h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f31123i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f31124j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r f31125k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f31123i = textInputLayout2;
            this.f31124j = textInputLayout3;
            this.f31125k = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            RangeDateSelector.this.f31120f = null;
            RangeDateSelector.this.m(this.f31123i, this.f31124j, this.f31125k);
        }

        @Override // com.google.android.material.datepicker.e
        public void e(@Nullable Long l11) {
            RangeDateSelector.this.f31120f = l11;
            RangeDateSelector.this.m(this.f31123i, this.f31124j, this.f31125k);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f31127i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f31128j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r f31129k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f31127i = textInputLayout2;
            this.f31128j = textInputLayout3;
            this.f31129k = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            RangeDateSelector.this.f31121g = null;
            RangeDateSelector.this.m(this.f31127i, this.f31128j, this.f31129k);
        }

        @Override // com.google.android.material.datepicker.e
        public void e(@Nullable Long l11) {
            RangeDateSelector.this.f31121g = l11;
            RangeDateSelector.this.m(this.f31127i, this.f31128j, this.f31129k);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f31118d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f31119e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i11) {
            return new RangeDateSelector[i11];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String A0(@NonNull Context context) {
        Resources resources = context.getResources();
        Pair<String, String> a11 = h.a(this.f31118d, this.f31119e);
        String str = a11.first;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = a11.second;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String F0(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.f31118d;
        if (l11 == null && this.f31119e == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l12 = this.f31119e;
        if (l12 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, h.c(l11.longValue()));
        }
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, h.c(l12.longValue()));
        }
        Pair<String, String> a11 = h.a(l11, l12);
        return resources.getString(R.string.mtrl_picker_range_header_selected, a11.first, a11.second);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> G0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f31118d, this.f31119e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View c0(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull r<Pair<Long, Long>> rVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.l.b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f31116b = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.f31122h;
        boolean z11 = simpleDateFormat != null;
        if (!z11) {
            simpleDateFormat = v.g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l11 = this.f31118d;
        if (l11 != null) {
            editText.setText(simpleDateFormat2.format(l11));
            this.f31120f = this.f31118d;
        }
        Long l12 = this.f31119e;
        if (l12 != null) {
            editText2.setText(simpleDateFormat2.format(l12));
            this.f31121g = this.f31119e;
        }
        String pattern = z11 ? simpleDateFormat2.toPattern() : v.h(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat2, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat2, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        DateSelector.N0(editText, editText2);
        return inflate;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void f0(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) v.q(simpleDateFormat);
        }
        this.f31122h = simpleDateFormat;
    }

    public final void g(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f31116b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f31115a)) {
            return null;
        }
        return this.f31115a.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pair<Long, Long> o0() {
        return new Pair<>(this.f31118d, this.f31119e);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean h0() {
        Long l11 = this.f31118d;
        return (l11 == null || this.f31119e == null || !i(l11.longValue(), this.f31119e.longValue())) ? false : true;
    }

    public final boolean i(long j11, long j12) {
        return j11 <= j12;
    }

    public final void j(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f31116b);
        textInputLayout2.setError(" ");
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void Z(@NonNull Pair<Long, Long> pair) {
        Long l11 = pair.first;
        if (l11 != null && pair.second != null) {
            Preconditions.checkArgument(i(l11.longValue(), pair.second.longValue()));
        }
        Long l12 = pair.first;
        this.f31118d = l12 == null ? null : Long.valueOf(v.a(l12.longValue()));
        Long l13 = pair.second;
        this.f31119e = l13 != null ? Long.valueOf(v.a(l13.longValue())) : null;
    }

    public final void l(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f31115a = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f31115a = null;
        } else {
            this.f31115a = textInputLayout2.getError();
        }
    }

    public final void m(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull r<Pair<Long, Long>> rVar) {
        Long l11 = this.f31120f;
        if (l11 == null || this.f31121g == null) {
            g(textInputLayout, textInputLayout2);
            rVar.a();
        } else if (i(l11.longValue(), this.f31121g.longValue())) {
            this.f31118d = this.f31120f;
            this.f31119e = this.f31121g;
            rVar.b(o0());
        } else {
            j(textInputLayout, textInputLayout2);
            rVar.a();
        }
        l(textInputLayout, textInputLayout2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> m0() {
        ArrayList arrayList = new ArrayList();
        Long l11 = this.f31118d;
        if (l11 != null) {
            arrayList.add(l11);
        }
        Long l12 = this.f31119e;
        if (l12 != null) {
            arrayList.add(l12);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int q() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void v0(long j11) {
        Long l11 = this.f31118d;
        if (l11 == null) {
            this.f31118d = Long.valueOf(j11);
        } else if (this.f31119e == null && i(l11.longValue(), j11)) {
            this.f31119e = Long.valueOf(j11);
        } else {
            this.f31119e = null;
            this.f31118d = Long.valueOf(j11);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int w(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return sn.b.g(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, l.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeValue(this.f31118d);
        parcel.writeValue(this.f31119e);
    }
}
