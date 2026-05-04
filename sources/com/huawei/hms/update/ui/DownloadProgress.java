package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.text.NumberFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DownloadProgress extends AbstractDialog {

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f36549c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36550d;

    /* renamed from: e, reason: collision with root package name */
    private int f36551e = 0;

    /* renamed from: f, reason: collision with root package name */
    private DialogInterface.OnKeyListener f36552f = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements DialogInterface.OnKeyListener {
        private b() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
            return i11 == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    public void a(int i11) {
        ProgressBar progressBar;
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            HMSLog.w("DownloadProgress", "In setDownloading, The activity is null or finishing.");
        } else {
            if (this.f36550d == null || (progressBar = this.f36549c) == null) {
                return;
            }
            progressBar.setProgress(i11);
            this.f36550d.setText(NumberFormat.getPercentInstance().format(i11 / 100.0f));
        }
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    public int getDialogThemeId() {
        return a(getActivity()) != 0 ? 0 : 3;
    }

    public void intProgress(int i11) {
        this.f36551e = i11;
    }

    @Override // com.huawei.hms.update.ui.AbstractDialog
    public AlertDialog onCreateDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        View inflate = View.inflate(getActivity(), ResourceLoaderUtil.getLayoutId("hms_download_progress"), null);
        builder.setView(inflate);
        builder.setCancelable(false);
        builder.setOnKeyListener(this.f36552f);
        View findViewById = inflate.findViewById(ResourceLoaderUtil.getIdId("download_info_progress"));
        if (findViewById instanceof ProgressBar) {
            this.f36549c = (ProgressBar) findViewById;
        }
        View findViewById2 = inflate.findViewById(ResourceLoaderUtil.getIdId("hms_progress_text"));
        if (findViewById2 instanceof TextView) {
            this.f36550d = (TextView) findViewById2;
        }
        a(this.f36551e);
        return builder.create();
    }

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }
}
