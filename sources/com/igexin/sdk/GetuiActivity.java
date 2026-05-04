package com.igexin.sdk;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.igexin.push.a.a;
import com.igexin.push.a.b;

/* loaded from: classes7.dex */
public class GetuiActivity extends Activity {
    private b activityAction;

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = this.activityAction;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.a();
        b a11 = a.a(this);
        this.activityAction = a11;
        if (a11 != null) {
            a11.b(this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        b bVar = this.activityAction;
        if (bVar != null) {
            bVar.i();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
