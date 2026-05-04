package com.huawei.updatesdk.support.pm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.c.a.a.a;
import com.huawei.updatesdk.a.a.d.d;
import com.huawei.updatesdk.a.a.d.i.c;
import com.huawei.updatesdk.a.b.b.b;
import com.huawei.updatesdk.b.d.e;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PackageInstallerActivity extends Activity {
    private Intent a(Context context, String str) {
        if (d.d(str)) {
            throw new IllegalArgumentException("getNormalInstallIntent: Not a standard path");
        }
        File file = new File(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.INSTALL_PACKAGE");
        intent.addFlags(1);
        String str2 = context.getApplicationContext().getPackageName() + UpdateSdkFileProvider.AUTHORITIES_SUFFIX;
        if (!d.d(str2)) {
            intent.setData(UpdateSdkFileProvider.getUriForFile(context, str2, file));
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (1000 == i11) {
            if (i12 == 0) {
                e.a(7, 0);
            } else {
                int a11 = intent != null ? b.a(intent).a("android.intent.extra.INSTALL_RESULT", -10004) : -10004;
                if (a11 != 0 && a11 != 1) {
                    e.a(4, a11);
                }
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        c.f().a(getWindow());
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            a.b("PackageInstallerActivity", "PackageInstallerActivity error intent");
            return;
        }
        b a11 = b.a(intent);
        String a12 = a11.a("install_path");
        String a13 = a11.a("install_packagename");
        if (a(a12, a11.a("apk_sha256"))) {
            e.a(4, -3);
            finish();
            a.b("PackageInstallerActivity", "PackageInstallerActivity can not find filePath.");
            return;
        }
        try {
            Intent a14 = a(this, a12);
            a14.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            a14.putExtra("android.intent.extra.RETURN_RESULT", true);
            a.c("PackageInstallerActivity", " onCreate filePath:" + a12 + ",packageName:" + a13 + ",taskId:" + getTaskId());
            startActivityForResult(a14, 1000);
        } catch (Exception unused) {
            a.b("PackageInstallerActivity", "can not start install action");
            e.a(4, -2);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        finishActivity(1000);
        super.onDestroy();
    }

    private boolean a(String str, String str2) {
        return d.d(str) || TextUtils.isEmpty(str2) || !str2.equalsIgnoreCase(d.a(str, "SHA-256"));
    }
}
