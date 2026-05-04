package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f32480a;

    /* renamed from: b, reason: collision with root package name */
    public final r f32481b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f32482c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f32483d;

    public s(@NonNull r rVar) {
        this.f32480a = rVar.f32450a;
        this.f32481b = rVar;
        this.f32482c = rVar.getContext();
        this.f32483d = rVar.t();
    }

    @StringRes
    public int c() {
        return 0;
    }

    @DrawableRes
    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i11) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void r() {
        this.f32481b.P(false);
    }

    public boolean t() {
        return false;
    }

    public void s() {
    }

    public void u() {
    }

    public void a(Editable editable) {
    }

    public void n(@Nullable EditText editText) {
    }

    public void q(boolean z11) {
    }

    public void o(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void b(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
