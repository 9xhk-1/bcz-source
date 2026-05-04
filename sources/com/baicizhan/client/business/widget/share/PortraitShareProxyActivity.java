package com.baicizhan.client.business.widget.share;

import android.content.DialogInterface;
import android.os.Bundle;
import com.baicizhan.client.business.widget.DialogFragmentActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PortraitShareProxyActivity extends DialogFragmentActivity {
    @Override // com.baicizhan.client.business.widget.DialogFragmentActivity
    public void J0(DialogInterface dialog) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.baicizhan.client.business.widget.DialogFragmentActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
