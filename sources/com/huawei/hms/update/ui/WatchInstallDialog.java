package com.huawei.hms.update.ui;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.ButtonConfig;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WatchInstallDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36684a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36685b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36686c;

    /* renamed from: d, reason: collision with root package name */
    private Button f36687d;

    /* renamed from: e, reason: collision with root package name */
    private Button f36688e;

    public WatchInstallDialog(Context context) {
        super(context, ResourceLoaderUtil.getStyleId("WatchDialog"));
        this.f36684a = context;
        b();
    }

    private void a() {
        addContentView(((LayoutInflater) this.f36684a.getSystemService("layout_inflater")).inflate(ResourceLoaderUtil.getLayoutId("hms_installer_update_dialog_watch"), (ViewGroup) null), new LinearLayout.LayoutParams(-1, -1));
    }

    private void b() {
        a();
        d();
        c();
    }

    private void c() {
        this.f36685b = (TextView) findViewById(ResourceLoaderUtil.getIdId("title"));
        this.f36686c = (TextView) findViewById(ResourceLoaderUtil.getIdId("message"));
        this.f36687d = (Button) findViewById(ResourceLoaderUtil.getIdId("install"));
        this.f36688e = (Button) findViewById(ResourceLoaderUtil.getIdId("cancel"));
        ButtonConfig createWatch = ButtonConfig.createWatch(this.f36684a);
        int color = this.f36684a.getResources().getColor(ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
        a(this.f36687d, createWatch, color);
        a(this.f36688e, createWatch, color);
    }

    private void d() {
        Window window = getWindow();
        if (window == null) {
            HMSLog.e("WatchInstallDialog", "getWindow is null");
            return;
        }
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 17;
    }

    public void setCancelResourceId(int i11) {
        this.f36688e.setText(i11);
    }

    public void setCancelText(CharSequence charSequence) {
        this.f36688e.setText(charSequence);
    }

    public void setInstallResourceId(int i11) {
        this.f36687d.setText(i11);
    }

    public void setInstallText(CharSequence charSequence) {
        this.f36687d.setText(charSequence);
    }

    public void setMessage(CharSequence charSequence) {
        this.f36686c.setText(charSequence);
    }

    public void setOnCancelClick(View.OnClickListener onClickListener) {
        this.f36688e.setOnClickListener(onClickListener);
    }

    public void setOnInstallClick(View.OnClickListener onClickListener) {
        this.f36687d.setOnClickListener(onClickListener);
    }

    @Override // android.app.Dialog
    public void setTitle(int i11) {
        this.f36685b.setVisibility(0);
        this.f36685b.setText(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f36685b.setVisibility(0);
        this.f36685b.setText(charSequence);
    }

    private void a(Button button, ButtonConfig buttonConfig, int i11) {
        if (button == null) {
            return;
        }
        String str = Build.MANUFACTURER;
        if (buttonConfig.f36542f == ButtonConfig.Level.NORMAL && (i11 > 0 || (str != null && str.equals(SystemUtils.PRODUCT_HUAWEI)))) {
            buttonConfig.f36539c = i11;
            buttonConfig.f36540d = i11;
        }
        HwDialogUtil.a(button, buttonConfig.f36537a, buttonConfig.f36538b);
        HwDialogUtil.b(button, buttonConfig.f36539c, buttonConfig.f36540d);
    }
}
