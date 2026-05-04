package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final ChipTextInputComboView f32665a;

    /* renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f32666b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeModel f32667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32668d = false;

    public k(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f32665a = chipTextInputComboView;
        this.f32666b = chipTextInputComboView2;
        this.f32667c = timeModel;
    }

    public void a() {
        TextInputLayout f11 = this.f32665a.f();
        TextInputLayout f12 = this.f32666b.f();
        EditText editText = f11.getEditText();
        EditText editText2 = f12.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public final void b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    public final void c(int i11) {
        this.f32666b.setChecked(i11 == 12);
        this.f32665a.setChecked(i11 == 10);
        this.f32667c.f32594f = i11;
    }

    public final boolean d(int i11, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i11 >= 7 && i11 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            c(12);
            return true;
        }
        b(editText);
        return false;
    }

    public final boolean e(int i11, KeyEvent keyEvent, EditText editText) {
        if (i11 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            c(10);
            return true;
        }
        b(editText);
        return false;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean z11 = i11 == 5;
        if (z11) {
            c(12);
        }
        return z11;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (this.f32668d) {
            return false;
        }
        this.f32668d = true;
        EditText editText = (EditText) view;
        boolean e11 = this.f32667c.f32594f == 12 ? e(i11, keyEvent, editText) : d(i11, keyEvent, editText);
        this.f32668d = false;
        return e11;
    }
}
