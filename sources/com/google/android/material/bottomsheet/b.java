package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends AppCompatDialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30800a;

    public b() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (x(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (x(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }

    public final void v() {
        if (this.f30800a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final void w(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z11) {
        this.f30800a = z11;
        if (bottomSheetBehavior.getState() == 5) {
            v();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).j();
        }
        bottomSheetBehavior.B(new C0367b());
        bottomSheetBehavior.g(5);
    }

    public final boolean x(boolean z11) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior<FrameLayout> g11 = aVar.g();
        if (!g11.n0() || !aVar.h()) {
            return false;
        }
        w(g11, z11);
        return true;
    }

    @SuppressLint({"ValidFragment"})
    public b(@LayoutRes int i11) {
        super(i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public class C0367b extends BottomSheetBehavior.g {
        public C0367b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(@NonNull View view, int i11) {
            if (i11 == 5) {
                b.this.v();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@NonNull View view, float f11) {
        }
    }
}
