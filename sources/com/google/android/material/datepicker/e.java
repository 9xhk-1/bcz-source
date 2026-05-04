package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class e extends c0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f31155a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31156b;

    /* renamed from: c, reason: collision with root package name */
    public final DateFormat f31157c;

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f31158d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31159e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f31160f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f31161g;

    /* renamed from: h, reason: collision with root package name */
    public int f31162h = 0;

    public e(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f31156b = str;
        this.f31157c = dateFormat;
        this.f31155a = textInputLayout;
        this.f31158d = calendarConstraints;
        this.f31159e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f31160f = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                e.b(e.this, str);
            }
        };
    }

    public static /* synthetic */ void a(e eVar, long j11) {
        eVar.getClass();
        eVar.f31155a.setError(String.format(eVar.f31159e, eVar.g(h.c(j11))));
        eVar.d();
    }

    public static /* synthetic */ void b(e eVar, String str) {
        TextInputLayout textInputLayout = eVar.f31155a;
        DateFormat dateFormat = eVar.f31157c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), eVar.g(str)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), eVar.g(dateFormat.format(new Date(v.v().getTimeInMillis())))));
        eVar.d();
    }

    @Override // com.google.android.material.internal.c0, android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f31156b.length() && editable.length() >= this.f31162h) {
            char charAt = this.f31156b.charAt(editable.length());
            if (Character.isLetterOrDigit(charAt)) {
                return;
            }
            editable.append(charAt);
        }
    }

    @Override // com.google.android.material.internal.c0, android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        this.f31162h = charSequence.length();
    }

    public final Runnable c(final long j11) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.a(e.this, j11);
            }
        };
    }

    public abstract void e(@Nullable Long l11);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    public final String g(String str) {
        return str.replace(' ', u0.f91711g);
    }

    @Override // com.google.android.material.internal.c0, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        this.f31155a.removeCallbacks(this.f31160f);
        this.f31155a.removeCallbacks(this.f31161g);
        this.f31155a.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f31156b.length()) {
            return;
        }
        try {
            Date parse = this.f31157c.parse(charSequence.toString());
            this.f31155a.setError(null);
            long time = parse.getTime();
            if (this.f31158d.h().f(time) && this.f31158d.s(time)) {
                e(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable c11 = c(time);
            this.f31161g = c11;
            f(this.f31155a, c11);
        } catch (ParseException unused) {
            f(this.f31155a, this.f31160f);
        }
    }

    public void d() {
    }
}
