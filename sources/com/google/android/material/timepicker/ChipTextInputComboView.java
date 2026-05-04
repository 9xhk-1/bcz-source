package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.m0;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f32530a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f32531b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f32532c;

    /* renamed from: d, reason: collision with root package name */
    public TextWatcher f32533d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f32534e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c0 {

        /* renamed from: b, reason: collision with root package name */
        public static final String f32535b = "00";

        public b() {
        }

        @Override // com.google.android.material.internal.c0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f32530a.setText(ChipTextInputComboView.this.d(f32535b));
                return;
            }
            String d11 = ChipTextInputComboView.this.d(editable);
            Chip chip = ChipTextInputComboView.this.f32530a;
            if (TextUtils.isEmpty(d11)) {
                d11 = ChipTextInputComboView.this.d(f32535b);
            }
            chip.setText(d11);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.f32532c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f32532c.setFilters(inputFilterArr);
    }

    public final String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    @VisibleForTesting
    public CharSequence e() {
        return this.f32530a.getText();
    }

    public TextInputLayout f() {
        return this.f32531b;
    }

    public void g(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f32530a, accessibilityDelegateCompat);
    }

    public void h(boolean z11) {
        this.f32532c.setCursorVisible(z11);
    }

    public void i(CharSequence charSequence) {
        this.f32534e.setText(charSequence);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f32530a.isChecked();
    }

    public void j(CharSequence charSequence) {
        String d11 = d(charSequence);
        this.f32530a.setText(d11);
        if (TextUtils.isEmpty(d11)) {
            return;
        }
        this.f32532c.removeTextChangedListener(this.f32533d);
        this.f32532c.setText(d11);
        this.f32532c.addTextChangedListener(this.f32533d);
    }

    public final void k() {
        this.f32532c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        this.f32530a.setChecked(z11);
        this.f32532c.setVisibility(z11 ? 0 : 4);
        this.f32530a.setVisibility(z11 ? 8 : 0);
        if (isChecked()) {
            m0.y(this.f32532c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f32530a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        this.f32530a.setTag(i11, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f32530a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f32530a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f32531b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f32532c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f32533d = bVar;
        editText.addTextChangedListener(bVar);
        k();
        addView(chip);
        addView(textInputLayout);
        this.f32534e = (TextView) findViewById(R.id.material_label);
        editText.setId(ViewCompat.generateViewId());
        ViewCompat.setLabelFor(this.f32534e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
