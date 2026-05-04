package com.alipay.sdk.m.x;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
            return i11 == 4;
        }
    }

    public static Dialog a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder a11 = a(context, str, str3, onClickListener, str4, onClickListener2);
        a11.setTitle(str);
        a11.setMessage(str2);
        AlertDialog create = a11.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new a());
        try {
            create.show();
            return create;
        } catch (Throwable th2) {
            com.alipay.sdk.m.u.e.a(com.alipay.sdk.m.l.a.A, "showDialog ", th2);
            return create;
        }
    }

    public static AlertDialog.Builder a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
            builder.setPositiveButton(str3, onClickListener2);
        }
        if (!TextUtils.isEmpty(str2) && onClickListener != null) {
            builder.setNegativeButton(str2, onClickListener);
        }
        return builder;
    }
}
