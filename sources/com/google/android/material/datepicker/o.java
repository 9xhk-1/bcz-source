package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class o<S> extends s<S> {

    /* renamed from: e, reason: collision with root package name */
    public static final String f31269e = "THEME_RES_ID_KEY";

    /* renamed from: f, reason: collision with root package name */
    public static final String f31270f = "DATE_SELECTOR_KEY";

    /* renamed from: g, reason: collision with root package name */
    public static final String f31271g = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: b, reason: collision with root package name */
    @StyleRes
    public int f31272b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f31273c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f31274d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends r<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            Iterator<r<S>> it = o.this.f31294a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // com.google.android.material.datepicker.r
        public void b(S s11) {
            Iterator<r<S>> it = o.this.f31294a.iterator();
            while (it.hasNext()) {
                it.next().b(s11);
            }
        }
    }

    @NonNull
    public static <T> o<T> y(DateSelector<T> dateSelector, @StyleRes int i11, @NonNull CalendarConstraints calendarConstraints) {
        o<T> oVar = new o<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        oVar.setArguments(bundle);
        return oVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f31272b = bundle.getInt("THEME_RES_ID_KEY");
        this.f31273c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f31274d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return this.f31273c.c0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f31272b)), viewGroup, bundle, this.f31274d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f31272b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f31273c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f31274d);
    }

    @Override // com.google.android.material.datepicker.s
    @NonNull
    public DateSelector<S> w() {
        DateSelector<S> dateSelector = this.f31273c;
        if (dateSelector != null) {
            return dateSelector;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }
}
