package com.huawei.hms.update.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class PromptDialogs {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CheckFailurePrompt extends b {
        public CheckFailurePrompt() {
            super();
        }

        @Override // com.huawei.hms.update.ui.PromptDialogs.b
        public int getMessageResId() {
            return ResourceLoaderUtil.getStringId("hms_check_failure");
        }

        @Override // com.huawei.hms.update.ui.PromptDialogs.b, com.huawei.hms.update.ui.AbstractDialog
        public /* bridge */ /* synthetic */ AlertDialog onCreateDialog() {
            return super.onCreateDialog();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DownloadFailurePrompt extends b {
        public DownloadFailurePrompt() {
            super();
        }

        @Override // com.huawei.hms.update.ui.PromptDialogs.b
        public int getMessageResId() {
            return ResourceLoaderUtil.getStringId("hms_download_failure");
        }

        @Override // com.huawei.hms.update.ui.PromptDialogs.b, com.huawei.hms.update.ui.AbstractDialog
        public /* bridge */ /* synthetic */ AlertDialog onCreateDialog() {
            return super.onCreateDialog();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DownloadNoSpacePrompt extends b {
        public DownloadNoSpacePrompt() {
            super();
        }

        @Override // com.huawei.hms.update.ui.PromptDialogs.b
        public int getMessageResId() {
            return ResourceLoaderUtil.getStringId("hms_download_no_space");
        }

        @Override // com.huawei.hms.update.ui.PromptDialogs.b, com.huawei.hms.update.ui.AbstractDialog
        public /* bridge */ /* synthetic */ AlertDialog onCreateDialog() {
            return super.onCreateDialog();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends AbstractDialog {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                b.this.fireDoWork();
            }
        }

        private b() {
        }

        public abstract int getMessageResId();

        public int getPositiveButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_confirm");
        }

        @Override // com.huawei.hms.update.ui.AbstractDialog
        public AlertDialog onCreateDialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
            builder.setMessage(getMessageResId());
            builder.setPositiveButton(getPositiveButtonResId(), new a());
            return builder.create();
        }
    }
}
