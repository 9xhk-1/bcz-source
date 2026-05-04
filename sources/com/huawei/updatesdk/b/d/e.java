package com.huawei.updatesdk.b.d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.updatesdk.support.pm.PackageInstallerActivity;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {
    public static void a(int i11, int i12) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("INSTALL_STATE", i11);
        bundle.putInt("INSTALL_TYPE", i12);
        intent.putExtras(bundle);
        com.huawei.updatesdk.b.f.c.b().c(com.huawei.updatesdk.a.b.b.b.a(intent));
    }

    public static void a(Context context, String str, String str2, String str3) {
        a(3, 1);
        File file = new File(str);
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("InstallProcess", "system install failed,file not existed filePath:" + str);
            a(4, -10003);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PackageInstallerActivity.class);
        intent.putExtra("install_path", str);
        intent.putExtra("install_packagename", str2);
        intent.putExtra("apk_sha256", str3);
        if (!(context instanceof Activity)) {
            intent.setFlags(402653184);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            a(4, -10002);
            com.huawei.updatesdk.a.a.c.a.a.a.a("InstallProcess", " can not start install !", e11);
        }
    }
}
