package com.baicizhan.client.business.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AppCompatActivity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ThemeUtil {
    public static Context ensureThemeContext(Context context) {
        Resources.Theme theme = context.getTheme();
        return (theme == null || !theme.resolveAttribute(R.attr.color_common_bg, new TypedValue(), true)) ? new ContextThemeWrapper(context, getCurrentSettingThemeId()) : context;
    }

    public static int getCurrentAppCompatSettingThemeId() {
        return R.style.AppCompatStandardDefault;
    }

    public static int getCurrentSettingThemeId() {
        return R.style.StandardDefault;
    }

    public static ColorStateList getThemeColorStateListWithAttr(Context context, int attr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static int getThemeColorWithAttr(Context context, int attr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static Drawable getThemeDrawableWithAttr(Context context, int attr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static int getThemeResourceIdWithAttr(Context context, int attr) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void setThemeOnActivityCreate(Activity activity) {
        activity.setTheme(getCurrentSettingThemeId());
    }

    public static void setThemeOnAppCompatActivityCreate(AppCompatActivity activity) {
        activity.setTheme(getCurrentAppCompatSettingThemeId());
    }

    public static void updateTheme(Activity dest) {
        dest.finish();
        dest.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        dest.startActivity(new Intent(dest, dest.getClass()));
        dest.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
