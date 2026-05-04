package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.BindingAdapter;
import com.aigestudio.wheelpicker.WheelPicker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l2 {
    @BindingAdapter({"android:layout_height"})
    public static final void a(@m80.k View view, @m80.k Number height) {
        kotlin.jvm.internal.g0.p(view, "view");
        kotlin.jvm.internal.g0.p(height, "height");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.g0.o(layoutParams, "getLayoutParams(...)");
        layoutParams.height = height.intValue();
        view.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"android:layout_width"})
    public static final void b(@m80.k View view, float f11) {
        kotlin.jvm.internal.g0.p(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) f11;
        view.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"wheel_visible_item_count"})
    public static final void c(@m80.k WheelPicker picker, int i11) {
        kotlin.jvm.internal.g0.p(picker, "picker");
        picker.setVisibleItemCount(i11);
    }
}
