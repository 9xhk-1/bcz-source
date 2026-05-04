package com.tencent.open;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {
    public static void a(Window window) {
        if (window == null) {
            return;
        }
        window.setFlags(1024, 1024);
        int i11 = Build.VERSION.SDK_INT;
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        if (i11 >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }
}
