package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f31497a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final void c(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f31497a = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f31497a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        c(i11, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31497a = getVisibility();
    }
}
