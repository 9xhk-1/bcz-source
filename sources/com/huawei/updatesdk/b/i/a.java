package com.huawei.updatesdk.b.i;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private com.huawei.updatesdk.b.i.b f36926a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36927b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f36928c;

    /* renamed from: d, reason: collision with root package name */
    private final AlertDialog.Builder f36929d;

    /* renamed from: e, reason: collision with root package name */
    private DialogInterface.OnShowListener f36930e;

    /* renamed from: f, reason: collision with root package name */
    private DialogInterface.OnDismissListener f36931f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.updatesdk.b.i.a$a, reason: collision with other inner class name */
    public class DialogInterfaceOnShowListenerC0456a implements DialogInterface.OnShowListener {
        public DialogInterfaceOnShowListenerC0456a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            a.this.a(dialogInterface);
            if (a.this.f36930e != null) {
                a.this.f36930e.onShow(dialogInterface);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements DialogInterface.OnDismissListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (a.this.f36931f != null) {
                a.this.f36931f.onDismiss(dialogInterface);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f36926a != null) {
                a.this.f36926a.a();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f36926a != null) {
                a.this.f36926a.b();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a();
    }

    public a(Context context, String str, CharSequence charSequence) {
        this.f36927b = context;
        this.f36929d = com.huawei.updatesdk.a.a.d.i.c.l() ? new AlertDialog.Builder(context) : ((context.getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Light.Dialog.Alert) : new AlertDialog.Builder(context, R.style.Theme.DeviceDefault.Dialog.Alert);
        this.f36929d.setTitle(str);
        this.f36929d.setPositiveButton(com.huawei.updatesdk.b.h.c.c(context, "upsdk_third_app_dl_sure_cancel_download"), (DialogInterface.OnClickListener) null);
        this.f36929d.setNegativeButton(com.huawei.updatesdk.b.h.c.c(context, "upsdk_cancel"), (DialogInterface.OnClickListener) null);
        this.f36929d.setMessage(charSequence);
    }

    public static a a(Context context, String str, CharSequence charSequence) {
        return new a(context, str, charSequence);
    }

    private void b(e eVar) {
        try {
            this.f36928c = this.f36929d.create();
            com.huawei.updatesdk.a.a.d.i.c.f().a(this.f36928c.getWindow());
            this.f36928c.setCanceledOnTouchOutside(false);
            this.f36928c.setOnShowListener(new DialogInterfaceOnShowListenerC0456a());
            this.f36928c.setOnDismissListener(new b());
            this.f36928c.show();
            this.f36928c.getButton(-1).requestFocus();
        } catch (Exception e11) {
            if (eVar != null) {
                eVar.a();
            }
            com.huawei.updatesdk.a.a.a.a("BaseAlertDialog", "show dlg error, e: " + e11.getMessage());
        }
    }

    public void c() {
        AlertDialog.Builder builder = this.f36929d;
        if (builder == null) {
            return;
        }
        builder.setNegativeButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public void a() {
        try {
            AlertDialog alertDialog = this.f36928c;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f36928c = null;
            }
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.a.a.a.b("BaseAlertDialog", "dialog dismiss IllegalArgumentException");
        }
    }

    public boolean b() {
        AlertDialog alertDialog = this.f36928c;
        return alertDialog != null && alertDialog.isShowing();
    }

    public void a(int i11, String str) {
        Button button;
        AlertDialog alertDialog = this.f36928c;
        if (alertDialog == null || (button = alertDialog.getButton(i11)) == null) {
            return;
        }
        button.setText(str);
        button.setAllCaps(true);
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        this.f36931f = onDismissListener;
    }

    public void a(DialogInterface.OnKeyListener onKeyListener) {
        AlertDialog alertDialog = this.f36928c;
        if (alertDialog != null) {
            alertDialog.setOnKeyListener(onKeyListener);
        }
    }

    public void a(DialogInterface.OnShowListener onShowListener) {
        this.f36930e = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DialogInterface dialogInterface) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setOnClickListener(new c());
        Button button = alertDialog.getButton(-2);
        if (button != null) {
            button.setOnClickListener(new d());
        }
    }

    public void a(View view) {
        ImageView imageView;
        if (this.f36929d != null) {
            if ((com.huawei.updatesdk.b.h.a.f().a() >= 17 || com.huawei.updatesdk.b.h.a.f().b() > 0) && (imageView = (ImageView) view.findViewById(com.huawei.updatesdk.b.h.c.a(view.getContext(), "divider"))) != null) {
                imageView.setVisibility(8);
            }
            this.f36929d.setMessage((CharSequence) null);
            this.f36929d.setView(view);
        }
    }

    public void a(e eVar) {
        Context context = this.f36927b;
        if (context != null && !((Activity) context).isFinishing()) {
            if (b()) {
                return;
            }
            b(eVar);
        } else {
            com.huawei.updatesdk.a.a.a.b("BaseAlertDialog", "context == null or activity isFinishing");
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void a(com.huawei.updatesdk.b.i.b bVar) {
        this.f36926a = bVar;
    }

    public void a(boolean z11) {
        AlertDialog alertDialog = this.f36928c;
        if (alertDialog != null) {
            alertDialog.setCancelable(z11);
        }
    }
}
