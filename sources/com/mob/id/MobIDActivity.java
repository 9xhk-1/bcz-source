package com.mob.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.mob.MobSDK;
import com.mob.mgs.impl.e;
import com.mob.mgs.impl.g;
import com.mob.tools.proguard.ClassKeeper;

/* loaded from: classes7.dex */
public class MobIDActivity extends Activity implements ClassKeeper {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            MobSDK.init(getApplicationContext());
            e.a().a("[MobGod] MobIDActivity onCreate");
            Intent intent = getIntent();
            if (intent == null) {
                return;
            }
            g.a(getApplicationContext(), intent, true);
            finish();
        } catch (Throwable unused) {
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
