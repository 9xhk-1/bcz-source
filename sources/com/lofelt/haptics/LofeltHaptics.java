package com.lofelt.haptics;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 26)
/* loaded from: classes7.dex */
public class LofeltHaptics {
    private static final String LOG_TAG = "lofelt-sdk";
    private final Context context;
    private long controllerHandle;

    static {
        if (!deviceSupportsMinimumPlatformVersion()) {
            Log.d(LOG_TAG, "Lofelt SDK shared library was not loaded. It only can be loaded from API level 26 on");
        } else {
            Log.d(LOG_TAG, "Initializing Lofelt SDK version 1.3.4");
            System.loadLibrary("lofelt_sdk");
        }
    }

    public LofeltHaptics(Context context) {
        this.controllerHandle = 0L;
        Log.d(LOG_TAG, "Creating LofeltHaptics instance");
        this.context = context;
        if (deviceMeetsMinimumRequirements()) {
            this.controllerHandle = create(new Player(context));
        }
    }

    private native long create(Object callbackObject);

    private native void destroy(long controllerHandle);

    @ChecksSdkIntAtLeast(api = 26)
    public static boolean deviceSupportsMinimumPlatformVersion() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private native float getClipDuration(long controllerHandle);

    private native void load(long controllerHandle, byte[] clip);

    private native void loop(long controllerHandle, boolean enable);

    private native void play(long controllerHandle);

    private native void seek(long controllerHandle, float time);

    private native void setAmplitudeMultiplication(long controllerHandle, float amplitudeMultiplication);

    private native void stop(long controllerHandle);

    public boolean deviceMeetsMinimumRequirements() {
        Vibrator vibrator;
        boolean hasAmplitudeControl;
        if (deviceSupportsMinimumPlatformVersion() && (vibrator = (Vibrator) this.context.getSystemService("vibrator")) != null && vibrator.hasVibrator()) {
            hasAmplitudeControl = vibrator.hasAmplitudeControl();
            if (hasAmplitudeControl) {
                return true;
            }
        }
        return false;
    }

    public void finalize() throws Throwable {
        try {
            try {
                Log.d(LOG_TAG, "Finalizing LofeltHaptics instance");
                if (deviceMeetsMinimumRequirements()) {
                    destroy(this.controllerHandle);
                }
                this.controllerHandle = 0L;
                super.finalize();
            } catch (RuntimeException e11) {
                Log.e(LOG_TAG, "Error finalizing LofeltHaptics: " + e11);
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public float getClipDuration() {
        if (deviceMeetsMinimumRequirements()) {
            return getClipDuration(this.controllerHandle);
        }
        return 0.0f;
    }

    public long getControllerHandle() {
        return this.controllerHandle;
    }

    public void load(byte[] clip) {
        if (deviceMeetsMinimumRequirements()) {
            load(this.controllerHandle, clip);
        }
    }

    public void loop(boolean enabled) {
        if (deviceMeetsMinimumRequirements()) {
            loop(this.controllerHandle, enabled);
        }
    }

    public void play() {
        if (!deviceMeetsMinimumRequirements()) {
            throw new RuntimeException("Unable to play, device doesn't meet the minimum requirements to play haptics");
        }
        play(this.controllerHandle);
    }

    public void seek(float time) {
        if (deviceMeetsMinimumRequirements()) {
            seek(this.controllerHandle, time);
        }
    }

    public void setAmplitudeMultiplication(float amplitudeMultiplication) {
        if (deviceMeetsMinimumRequirements()) {
            setAmplitudeMultiplication(this.controllerHandle, amplitudeMultiplication);
        }
    }

    public void stop() {
        if (deviceMeetsMinimumRequirements()) {
            stop(this.controllerHandle);
        }
    }
}
