package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
/* loaded from: classes7.dex */
public class n extends DatePickerDialog {

    /* renamed from: c, reason: collision with root package name */
    @AttrRes
    public static final int f31265c = 16843612;

    /* renamed from: d, reason: collision with root package name */
    @StyleRes
    public static final int f31266d = R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Drawable f31267a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Rect f31268b;

    public n(@NonNull Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f31267a);
        getWindow().getDecorView().setOnTouchListener(new in.a(this, this.f31268b));
    }

    public n(@NonNull Context context, int i11) {
        this(context, i11, null, -1, -1, -1);
    }

    public n(@NonNull Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13) {
        this(context, 0, onDateSetListener, i11, i12, i13);
    }

    public n(@NonNull Context context, int i11, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i12, int i13, int i14) {
        super(context, i11, onDateSetListener, i12, i13, i14);
        Context context2 = getContext();
        int g11 = sn.b.g(getContext(), R.attr.colorSurface, getClass().getCanonicalName());
        int i15 = f31266d;
        vn.k kVar = new vn.k(context2, null, 16843612, i15);
        kVar.p0(ColorStateList.valueOf(g11));
        Rect a11 = in.c.a(context2, 16843612, i15);
        this.f31268b = a11;
        this.f31267a = in.c.b(kVar, a11);
    }
}
