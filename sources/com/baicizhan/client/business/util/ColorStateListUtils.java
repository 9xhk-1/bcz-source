package com.baicizhan.client.business.util;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ColorStateListUtils {
    public static ColorStateList getSimpleColorStateList(int defColor, int pressedColor) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{pressedColor, pressedColor, defColor});
    }

    public static ColorStateList getSimpleThemeColorStateListWithAttr(Context context, int defAttr, int pressedAttr) {
        return getSimpleColorStateList(ThemeUtil.getThemeColorWithAttr(context, defAttr), ThemeUtil.getThemeColorWithAttr(context, pressedAttr));
    }
}
