package com.mob.id;

import android.app.Activity;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.MotionEvent;
import c6.d;

/* loaded from: classes7.dex */
public class MobIDSYActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (getIntent() != null) {
                for (int i11 : getIntent().getIntArrayExtra("fg")) {
                    getWindow().addFlags(i11);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        try {
            if (((PowerManager) getSystemService(d.f8118j)).isScreenOn()) {
                finish();
            }
        } catch (Throwable unused) {
        }
        super.onResume();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            finish();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
