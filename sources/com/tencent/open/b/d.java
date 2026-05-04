package com.tencent.open.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f44465a;

    /* renamed from: b, reason: collision with root package name */
    private static String f44466b;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f44465a)) {
            return f44465a;
        }
        if (context == null) {
            return "";
        }
        f44465a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f44465a = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f44465a;
    }

    public static String a() {
        return Locale.getDefault().getLanguage();
    }
}
