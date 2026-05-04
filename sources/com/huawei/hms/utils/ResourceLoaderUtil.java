package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a, reason: collision with root package name */
    private static Context f36757a;

    /* renamed from: b, reason: collision with root package name */
    private static String f36758b;

    public static int getAnimId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "anim", f36758b);
    }

    public static int getColorId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "color", f36758b);
    }

    public static int getDimenId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "dimen", f36758b);
    }

    public static Drawable getDrawable(String str) {
        Context context = f36757a;
        if (context == null) {
            return null;
        }
        return context.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "drawable", f36758b);
    }

    public static int getIdId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "id", f36758b);
    }

    public static int getLayoutId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", f36758b);
    }

    public static String getString(String str) {
        Context context = f36757a;
        return context == null ? "" : context.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, f36758b);
    }

    public static int getStyleId(String str) {
        Context context = f36757a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "style", f36758b);
    }

    public static Context getmContext() {
        return f36757a;
    }

    public static void setmContext(Context context) {
        f36757a = context;
        if (context != null) {
            f36758b = context.getPackageName();
        } else {
            f36758b = null;
            HMSLog.e("ResourceLoaderUtil", "context is null");
        }
    }

    public static String getString(String str, Object... objArr) {
        Context context = f36757a;
        if (context == null) {
            return "";
        }
        return context.getResources().getString(getStringId(str), objArr);
    }
}
