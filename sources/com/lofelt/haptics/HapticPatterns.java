package com.lofelt.haptics;

import android.content.Context;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 17)
/* loaded from: classes7.dex */
public class HapticPatterns {
    private final Vibrator vibrator;

    public HapticPatterns(Context context) {
        this.vibrator = (Vibrator) context.getSystemService("vibrator");
    }

    public void playMaximumAmplitudePattern(float[] patternPoints) {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (patternPoints.length > 1) {
            long[] jArr = new long[patternPoints.length];
            jArr[0] = 0;
            for (int i11 = 1; i11 < patternPoints.length; i11++) {
                jArr[i11] = (long) ((patternPoints[i11] - patternPoints[i11 - 1]) * 1000.0f);
            }
            this.vibrator.vibrate(jArr, -1);
        }
    }

    public void stopPattern() {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.vibrator.cancel();
    }
}
