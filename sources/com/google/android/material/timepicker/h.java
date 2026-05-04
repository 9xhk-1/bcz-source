package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h implements ClockHandView.c, TimePickerView.f, TimePickerView.e, ClockHandView.b, j {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f32653f = {Constants.VIA_REPORT_TYPE_SET_AVATAR, "1", "2", "3", "4", "5", Constants.VIA_SHARE_TYPE_INFO, "7", Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, Constants.VIA_SHARE_TYPE_MINI_PROGRAM, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f32654g = {ChipTextInputComboView.b.f32535b, "1", "2", "3", "4", "5", Constants.VIA_SHARE_TYPE_INFO, "7", Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, Constants.VIA_SHARE_TYPE_MINI_PROGRAM, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, Constants.VIA_REPORT_TYPE_SET_AVATAR, "13", Constants.VIA_REPORT_TYPE_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_WPA_STATE, "16", Constants.VIA_REPORT_TYPE_START_GROUP, "18", Constants.VIA_ACT_TYPE_NINETEEN, "20", "21", Constants.VIA_REPORT_TYPE_DATALINE, Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f32655h = {ChipTextInputComboView.b.f32535b, "5", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, Constants.VIA_REPORT_TYPE_WPA_STATE, "20", Constants.VIA_REPORT_TYPE_CHAT_AUDIO, "30", "35", "40", "45", "50", "55"};

    /* renamed from: i, reason: collision with root package name */
    public static final int f32656i = 30;

    /* renamed from: j, reason: collision with root package name */
    public static final int f32657j = 6;

    /* renamed from: a, reason: collision with root package name */
    public final TimePickerView f32658a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeModel f32659b;

    /* renamed from: c, reason: collision with root package name */
    public float f32660c;

    /* renamed from: d, reason: collision with root package name */
    public float f32661d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32662e = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.google.android.material.timepicker.a {
        public a(Context context, int i11) {
            super(context, i11);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(h.this.f32659b.c(), String.valueOf(h.this.f32659b.d())));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends com.google.android.material.timepicker.a {
        public b(Context context, int i11) {
            super(context, i11);
        }

        @Override // com.google.android.material.timepicker.a, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(h.this.f32659b.f32593e)));
        }
    }

    public h(TimePickerView timePickerView, TimeModel timeModel) {
        this.f32658a = timePickerView;
        this.f32659b = timeModel;
        initialize();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f11, boolean z11) {
        this.f32662e = true;
        TimeModel timeModel = this.f32659b;
        int i11 = timeModel.f32593e;
        int i12 = timeModel.f32592d;
        if (timeModel.f32594f == 10) {
            this.f32658a.n(this.f32661d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(this.f32658a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                i(12, true);
            }
        } else {
            int round = Math.round(f11);
            if (!z11) {
                this.f32659b.k(((round + 15) / 30) * 5);
                this.f32660c = this.f32659b.f32593e * 6;
            }
            this.f32658a.n(this.f32660c, z11);
        }
        this.f32662e = false;
        k();
        h(i12, i11);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    public void b(int i11) {
        this.f32659b.l(i11);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i11) {
        i(i11, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f11, boolean z11) {
        if (this.f32662e) {
            return;
        }
        TimeModel timeModel = this.f32659b;
        int i11 = timeModel.f32592d;
        int i12 = timeModel.f32593e;
        int round = Math.round(f11);
        TimeModel timeModel2 = this.f32659b;
        if (timeModel2.f32594f == 12) {
            timeModel2.k((round + 3) / 6);
            this.f32660c = (float) Math.floor(this.f32659b.f32593e * 6);
        } else {
            int i13 = (round + 15) / 30;
            if (timeModel2.f32591c == 1) {
                i13 %= 12;
                if (this.f32658a.k() == 2) {
                    i13 += 12;
                }
            }
            this.f32659b.i(i13);
            this.f32661d = g();
        }
        if (z11) {
            return;
        }
        k();
        h(i11, i12);
    }

    public final String[] f() {
        return this.f32659b.f32591c == 1 ? f32654g : f32653f;
    }

    public final int g() {
        return (this.f32659b.d() * 30) % 360;
    }

    public final void h(int i11, int i12) {
        TimeModel timeModel = this.f32659b;
        if (timeModel.f32593e == i12 && timeModel.f32592d == i11) {
            return;
        }
        this.f32658a.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.j
    public void hide() {
        this.f32658a.setVisibility(8);
    }

    public void i(int i11, boolean z11) {
        boolean z12 = i11 == 12;
        this.f32658a.l(z12);
        this.f32659b.f32594f = i11;
        this.f32658a.c(z12 ? f32655h : f(), z12 ? R.string.material_minute_suffix : this.f32659b.c());
        j();
        this.f32658a.n(z12 ? this.f32660c : this.f32661d, z11);
        this.f32658a.a(i11);
        this.f32658a.p(new a(this.f32658a.getContext(), R.string.material_hour_selection));
        this.f32658a.o(new b(this.f32658a.getContext(), R.string.material_minute_selection));
    }

    @Override // com.google.android.material.timepicker.j
    public void initialize() {
        if (this.f32659b.f32591c == 0) {
            this.f32658a.w();
        }
        this.f32658a.j(this);
        this.f32658a.t(this);
        this.f32658a.s(this);
        this.f32658a.q(this);
        l();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.j
    public void invalidate() {
        this.f32661d = g();
        TimeModel timeModel = this.f32659b;
        this.f32660c = timeModel.f32593e * 6;
        i(timeModel.f32594f, false);
        k();
    }

    public final void j() {
        TimeModel timeModel = this.f32659b;
        int i11 = 1;
        if (timeModel.f32594f == 10 && timeModel.f32591c == 1 && timeModel.f32592d >= 12) {
            i11 = 2;
        }
        this.f32658a.m(i11);
    }

    public final void k() {
        TimePickerView timePickerView = this.f32658a;
        TimeModel timeModel = this.f32659b;
        timePickerView.b(timeModel.f32595g, timeModel.d(), this.f32659b.f32593e);
    }

    public final void l() {
        m(f32653f, TimeModel.f32588i);
        m(f32655h, TimeModel.f32587h);
    }

    public final void m(String[] strArr, String str) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = TimeModel.b(this.f32658a.getResources(), strArr[i11], str);
        }
    }

    @Override // com.google.android.material.timepicker.j
    public void show() {
        this.f32658a.setVisibility(0);
    }
}
