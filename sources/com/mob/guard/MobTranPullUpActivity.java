package com.mob.guard;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.mob.MobSDK;
import com.mob.mgs.impl.e;
import com.mob.mgs.impl.g;
import com.mob.tools.proguard.ClassKeeper;

@Deprecated
/* loaded from: classes7.dex */
public class MobTranPullUpActivity extends Activity implements ClassKeeper {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            MobSDK.init(getApplicationContext());
        } catch (Throwable unused) {
        }
        try {
            e.a().a("[MobGuard] MobTranPullUpActivity onCreate");
            Intent intent = getIntent();
            if (intent == null) {
                return;
            }
            g.a(getApplicationContext(), intent, true);
            finish();
        } catch (Throwable th2) {
            e.a().a(th2);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                if (!isFinishing()) {
                    finish();
                }
            } catch (Throwable th2) {
                e.a().a(th2);
            }
        }
        super.onResume();
    }
}
