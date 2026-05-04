package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class x extends s {

    /* renamed from: e, reason: collision with root package name */
    public int f32517e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public EditText f32518f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f32519g;

    public x(@NonNull r rVar, @DrawableRes int i11) {
        super(rVar);
        this.f32517e = R.drawable.design_password_eye;
        this.f32519g = new View.OnClickListener() { // from class: com.google.android.material.textfield.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.v(x.this, view);
            }
        };
        if (i11 != 0) {
            this.f32517e = i11;
        }
    }

    public static /* synthetic */ void v(x xVar, View view) {
        EditText editText = xVar.f32518f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (xVar.w()) {
            xVar.f32518f.setTransformationMethod(null);
        } else {
            xVar.f32518f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            xVar.f32518f.setSelection(selectionEnd);
        }
        xVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void b(CharSequence charSequence, int i11, int i12, int i13) {
        r();
    }

    @Override // com.google.android.material.textfield.s
    @StringRes
    public int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.s
    @DrawableRes
    public int d() {
        return this.f32517e;
    }

    @Override // com.google.android.material.textfield.s
    public View.OnClickListener f() {
        return this.f32519g;
    }

    @Override // com.google.android.material.textfield.s
    public boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    public boolean m() {
        return !w();
    }

    @Override // com.google.android.material.textfield.s
    public void n(@Nullable EditText editText) {
        this.f32518f = editText;
        r();
    }

    @Override // com.google.android.material.textfield.s
    public void s() {
        if (x(this.f32518f)) {
            this.f32518f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.s
    public void u() {
        EditText editText = this.f32518f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f32518f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
