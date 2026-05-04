package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public int f32651a;

    public e(int i11) {
        this.f32651a = i11;
    }

    public int a() {
        return this.f32651a;
    }

    public void b(int i11) {
        this.f32651a = i11;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i13, i14, charSequence.subSequence(i11, i12).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f32651a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
