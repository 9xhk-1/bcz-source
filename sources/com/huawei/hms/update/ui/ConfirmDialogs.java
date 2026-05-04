package com.huawei.hms.update.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ConfirmDialogs {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NetTypeConfirm extends b {
        public NetTypeConfirm() {
            super();
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getMessageResId() {
            return ResourceLoaderUtil.getStringId("hms_update_nettype");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getNegativeButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_cancel");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getPositiveButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_update_continue");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b, com.huawei.hms.update.ui.AbstractDialog
        public /* bridge */ /* synthetic */ AlertDialog onCreateDialog() {
            return super.onCreateDialog();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RetryConfirm extends b {
        public RetryConfirm() {
            super();
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getMessageResId() {
            return ResourceLoaderUtil.getStringId("hms_download_retry");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getNegativeButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_cancel");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getPositiveButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_retry");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b, com.huawei.hms.update.ui.AbstractDialog
        public /* bridge */ /* synthetic */ AlertDialog onCreateDialog() {
            return super.onCreateDialog();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StopConfirm extends b {
        public StopConfirm() {
            super();
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getMessageResId() {
            return ResourceLoaderUtil.getStringId("hms_abort_message");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getNegativeButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_cancel");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b
        public int getPositiveButtonResId() {
            return ResourceLoaderUtil.getStringId("hms_abort");
        }

        @Override // com.huawei.hms.update.ui.ConfirmDialogs.b, com.huawei.hms.update.ui.AbstractDialog
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

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.huawei.hms.update.ui.ConfirmDialogs$b$b, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0449b implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0449b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                b.this.cancel();
            }
        }

        private b() {
        }

        public abstract int getMessageResId();

        public abstract int getNegativeButtonResId();

        public abstract int getPositiveButtonResId();

        @Override // com.huawei.hms.update.ui.AbstractDialog
        public AlertDialog onCreateDialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
            builder.setMessage(getMessageResId());
            builder.setPositiveButton(getPositiveButtonResId(), new a());
            builder.setNegativeButton(getNegativeButtonResId(), new DialogInterfaceOnClickListenerC0449b());
            return builder.create();
        }
    }
}
