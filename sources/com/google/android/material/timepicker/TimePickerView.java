package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class TimePickerView extends ConstraintLayout implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final String f32596j = "android.view.View";

    /* renamed from: a, reason: collision with root package name */
    public final Chip f32597a;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f32598b;

    /* renamed from: c, reason: collision with root package name */
    public final ClockHandView f32599c;

    /* renamed from: d, reason: collision with root package name */
    public final ClockFaceView f32600d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButtonToggleGroup f32601e;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f32602f;

    /* renamed from: g, reason: collision with root package name */
    public e f32603g;

    /* renamed from: h, reason: collision with root package name */
    public f f32604h;

    /* renamed from: i, reason: collision with root package name */
    public d f32605i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f32604h != null) {
                TimePickerView.this.f32604h.c(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.f32605i;
            if (dVar == null) {
                return false;
            }
            dVar.a();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f32608a;

        public c(GestureDetector gestureDetector) {
            this.f32608a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f32608a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void b(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f {
        void c(int i11);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void g(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11) {
        if (!z11) {
            timePickerView.getClass();
            return;
        }
        e eVar = timePickerView.f32603g;
        if (eVar != null) {
            eVar.b(i11 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    @Override // com.google.android.material.timepicker.i
    public void a(int i11) {
        x(this.f32597a, i11 == 12);
        x(this.f32598b, i11 == 10);
    }

    @Override // com.google.android.material.timepicker.i
    @SuppressLint({"DefaultLocale"})
    public void b(int i11, int i12, int i13) {
        this.f32601e.e(i11 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.f32587h, Integer.valueOf(i13));
        String format2 = String.format(locale, TimeModel.f32587h, Integer.valueOf(i12));
        if (!TextUtils.equals(this.f32597a.getText(), format)) {
            this.f32597a.setText(format);
        }
        if (TextUtils.equals(this.f32598b.getText(), format2)) {
            return;
        }
        this.f32598b.setText(format2);
    }

    @Override // com.google.android.material.timepicker.i
    public void c(String[] strArr, @StringRes int i11) {
        this.f32600d.c(strArr, i11);
    }

    @Override // com.google.android.material.timepicker.i
    public void f(float f11) {
        this.f32599c.p(f11);
    }

    public void j(ClockHandView.c cVar) {
        this.f32599c.b(cVar);
    }

    public int k() {
        return this.f32600d.t();
    }

    public void l(boolean z11) {
        this.f32599c.m(z11);
    }

    public void m(int i11) {
        this.f32600d.x(i11);
    }

    public void n(float f11, boolean z11) {
        this.f32599c.q(f11, z11);
    }

    public void o(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f32597a, accessibilityDelegateCompat);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (view == this && i11 == 0) {
            this.f32598b.sendAccessibilityEvent(8);
        }
    }

    public void p(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f32598b, accessibilityDelegateCompat);
    }

    public void q(ClockHandView.b bVar) {
        this.f32599c.t(bVar);
    }

    public void r(@Nullable d dVar) {
        this.f32605i = dVar;
    }

    public void s(e eVar) {
        this.f32603g = eVar;
    }

    public void t(f fVar) {
        this.f32604h = fVar;
    }

    public final void u() {
        Chip chip = this.f32597a;
        int i11 = R.id.selection_type;
        chip.setTag(i11, 12);
        this.f32598b.setTag(i11, 10);
        this.f32597a.setOnClickListener(this.f32602f);
        this.f32598b.setOnClickListener(this.f32602f);
        this.f32597a.setAccessibilityClassName("android.view.View");
        this.f32598b.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void v() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f32597a.setOnTouchListener(cVar);
        this.f32598b.setOnTouchListener(cVar);
    }

    public void w() {
        this.f32601e.setVisibility(0);
    }

    public final void x(Chip chip, boolean z11) {
        chip.setChecked(z11);
        ViewCompat.setAccessibilityLiveRegion(chip, z11 ? 2 : 0);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f32602f = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f32600d = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f32601e = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.n
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i12, boolean z11) {
                TimePickerView.g(TimePickerView.this, materialButtonToggleGroup2, i12, z11);
            }
        });
        this.f32597a = (Chip) findViewById(R.id.material_minute_tv);
        this.f32598b = (Chip) findViewById(R.id.material_hour_tv);
        this.f32599c = (ClockHandView) findViewById(R.id.material_clock_hand);
        v();
        u();
    }
}
