package com.huawei.hms.update.ui;

import android.R;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.widget.Button;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.ButtonConfig;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class HwDialogUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f36617a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static TypedValue f36618b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.update.ui.HwDialogUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36619a;

        static {
            int[] iArr = new int[ButtonConfig.Level.values().length];
            f36619a = iArr;
            try {
                iArr[ButtonConfig.Level.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36619a[ButtonConfig.Level.STRONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static int a(Context context, float f11) {
        if (context == null) {
            return 0;
        }
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(Button button, int i11, int i12) {
        if (button == null) {
            return;
        }
        button.setTextColor(a(i11, i12));
    }

    public static int c(Context context, ButtonConfig.Level level) {
        return a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_pressed"));
    }

    public static int d(Context context, ButtonConfig.Level level) {
        return level == ButtonConfig.Level.NORMAL ? a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color")) : a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_strong_text_color"));
    }

    public static ColorStateList a(int i11, int i12) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i11, i12});
    }

    public static int b(Context context, ButtonConfig.Level level) {
        return level == ButtonConfig.Level.NORMAL ? a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color")) : a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_strong_text_color"));
    }

    public static void a(Button button, int i11, int i12) {
        if (button == null) {
            return;
        }
        button.setBackground(b(button.getContext(), ResourceLoaderUtil.getDrawableId("dialog_insert_bg")));
        button.setBackgroundTintList(a(i11, i12));
    }

    public static Drawable b(Context context, int i11) {
        return context.getDrawable(i11);
    }

    public static StateListDrawable a(Context context, int i11, int i12) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(a(context, 25.0f));
        gradientDrawable.setColor(i11);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(a(context, 25.0f));
        gradientDrawable2.setColor(i12);
        int a11 = a(context, 4.0f);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, a11, 0, a11, 0);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new InsetDrawable((Drawable) gradientDrawable2, a11, 0, a11, 0));
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, insetDrawable);
        return stateListDrawable;
    }

    public static int a(Context context, ButtonConfig.Level level) {
        int i11 = AnonymousClass1.f36619a[level.ordinal()];
        if (i11 == 1) {
            return a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_error"));
        }
        if (i11 != 2) {
            return a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_normal"));
        }
        return a(context, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_strong"));
    }

    public static int a(Context context, int i11) {
        return context.getColor(i11);
    }

    public static int a(Context context) {
        try {
            return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
        } catch (Exception e11) {
            HMSLog.e("HwDialogUtil", "getCurrentUiModeType failed, " + e11.getMessage());
            return 1;
        }
    }
}
