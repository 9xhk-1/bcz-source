package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.m0;
import com.google.android.material.timepicker.TimePickerView;
import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m implements TimePickerView.f, j {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f32670a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeModel f32671b;

    /* renamed from: c, reason: collision with root package name */
    public final TextWatcher f32672c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final TextWatcher f32673d = new b();

    /* renamed from: e, reason: collision with root package name */
    public final ChipTextInputComboView f32674e;

    /* renamed from: f, reason: collision with root package name */
    public final ChipTextInputComboView f32675f;

    /* renamed from: g, reason: collision with root package name */
    public final k f32676g;

    /* renamed from: h, reason: collision with root package name */
    public final EditText f32677h;

    /* renamed from: i, reason: collision with root package name */
    public final EditText f32678i;

    /* renamed from: j, reason: collision with root package name */
    public MaterialButtonToggleGroup f32679j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c0 {
        public a() {
        }

        @Override // com.google.android.material.internal.c0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    m.this.f32671b.k(0);
                } else {
                    m.this.f32671b.k(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends c0 {
        public b() {
        }

        @Override // com.google.android.material.internal.c0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    m.this.f32671b.i(0);
                } else {
                    m.this.f32671b.i(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.c(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends com.google.android.material.timepicker.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeModel f32683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i11, TimeModel timeModel) {
            super(context, i11);
            this.f32683b = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(this.f32683b.c(), String.valueOf(this.f32683b.d())));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends com.google.android.material.timepicker.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeModel f32685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i11, TimeModel timeModel) {
            super(context, i11);
            this.f32685b = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f32685b.f32593e)));
        }
    }

    public m(LinearLayout linearLayout, TimeModel timeModel) {
        this.f32670a = linearLayout;
        this.f32671b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f32674e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f32675f = chipTextInputComboView2;
        int i11 = R.id.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i11);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i11);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        int i12 = R.id.selection_type;
        chipTextInputComboView.setTag(i12, 12);
        chipTextInputComboView2.setTag(i12, 10);
        if (timeModel.f32591c == 0) {
            j();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.e());
        chipTextInputComboView.c(timeModel.g());
        this.f32677h = chipTextInputComboView2.f().getEditText();
        this.f32678i = chipTextInputComboView.f().getEditText();
        this.f32676g = new k(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.g(new d(linearLayout.getContext(), R.string.material_hour_selection, timeModel));
        chipTextInputComboView.g(new e(linearLayout.getContext(), R.string.material_minute_selection, timeModel));
        initialize();
    }

    public static /* synthetic */ void a(m mVar, MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
        mVar.getClass();
        if (z11) {
            mVar.f32671b.l(i11 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    public static void h(EditText editText, @ColorInt int i11) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i12 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawable = AppCompatResources.getDrawable(context, i12);
            drawable.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{drawable, drawable});
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i11) {
        this.f32671b.f32594f = i11;
        this.f32674e.setChecked(i11 == 12);
        this.f32675f.setChecked(i11 == 10);
        k();
    }

    public final void d() {
        this.f32677h.addTextChangedListener(this.f32673d);
        this.f32678i.addTextChangedListener(this.f32672c);
    }

    public void e() {
        this.f32674e.setChecked(false);
        this.f32675f.setChecked(false);
    }

    public final void f() {
        this.f32677h.removeTextChangedListener(this.f32673d);
        this.f32678i.removeTextChangedListener(this.f32672c);
    }

    public void g() {
        this.f32674e.setChecked(this.f32671b.f32594f == 12);
        this.f32675f.setChecked(this.f32671b.f32594f == 10);
    }

    @Override // com.google.android.material.timepicker.j
    public void hide() {
        View focusedChild = this.f32670a.getFocusedChild();
        if (focusedChild != null) {
            m0.r(focusedChild, false);
        }
        this.f32670a.setVisibility(8);
    }

    public final void i(TimeModel timeModel) {
        f();
        Locale locale = this.f32670a.getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.f32587h, Integer.valueOf(timeModel.f32593e));
        String format2 = String.format(locale, TimeModel.f32587h, Integer.valueOf(timeModel.d()));
        this.f32674e.j(format);
        this.f32675f.j(format2);
        d();
        k();
    }

    @Override // com.google.android.material.timepicker.j
    public void initialize() {
        d();
        i(this.f32671b);
        this.f32676g.a();
    }

    @Override // com.google.android.material.timepicker.j
    public void invalidate() {
        i(this.f32671b);
    }

    public final void j() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f32670a.findViewById(R.id.material_clock_period_toggle);
        this.f32679j = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.l
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z11) {
                m.a(m.this, materialButtonToggleGroup2, i11, z11);
            }
        });
        this.f32679j.setVisibility(0);
        k();
    }

    public final void k() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f32679j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.e(this.f32671b.f32595g == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
    }

    @Override // com.google.android.material.timepicker.j
    public void show() {
        this.f32670a.setVisibility(0);
        c(this.f32671b.f32594f);
    }
}
