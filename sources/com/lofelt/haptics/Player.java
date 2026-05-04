package com.lofelt.haptics;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.LongStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 26)
/* loaded from: classes7.dex */
class Player {
    private boolean clipLoaded = false;
    private boolean clipLoopingEnabled = false;
    private final Context context;
    private VibrationEffect effect;
    private Vibrator vibrator;

    public Player(Context context) {
        this.context = context;
    }

    public static /* synthetic */ boolean a(int i11) {
        return i11 == 0;
    }

    public static /* synthetic */ boolean b(long j11) {
        return j11 == 0;
    }

    private long calculatePaddingTiming(long[] timings) {
        double sum = LongStream.of(timings).sum();
        double length = timings.length;
        if (sum < 100.0d || length < 50.0d) {
            return 0L;
        }
        return Math.round(length * 4.0d * ((Math.log(sum) * 0.39d) - 1.53d));
    }

    private VibrationEffect getPaddedEffect(long[] timings, int[] amplitudes) {
        VibrationEffect createWaveform;
        VibrationEffect createWaveform2;
        long[] copyOf = Arrays.copyOf(timings, timings.length + 1);
        int[] copyOf2 = Arrays.copyOf(amplitudes, amplitudes.length + 1);
        long calculatePaddingTiming = calculatePaddingTiming(timings);
        if (calculatePaddingTiming <= 0) {
            createWaveform = VibrationEffect.createWaveform(timings, amplitudes, getRepeatValue());
            return createWaveform;
        }
        copyOf[timings.length] = calculatePaddingTiming;
        copyOf2[amplitudes.length] = 1;
        createWaveform2 = VibrationEffect.createWaveform(copyOf, copyOf2, getRepeatValue());
        return createWaveform2;
    }

    private int getRepeatValue() {
        return this.clipLoopingEnabled ? 0 : -1;
    }

    private void loadCallback(long[] timings, int[] amplitudes, boolean loopEnabled) {
        VibrationEffect createWaveform;
        this.clipLoaded = true;
        this.clipLoopingEnabled = loopEnabled;
        if (timings.length == 0 || amplitudes.length == 0 || Arrays.stream(timings).allMatch(new LongPredicate() { // from class: com.lofelt.haptics.b
            @Override // java.util.function.LongPredicate
            public final boolean test(long j11) {
                return Player.b(j11);
            }
        }) || Arrays.stream(amplitudes).allMatch(new IntPredicate() { // from class: com.lofelt.haptics.c
            @Override // java.util.function.IntPredicate
            public final boolean test(int i11) {
                return Player.a(i11);
            }
        })) {
            this.effect = null;
            return;
        }
        this.vibrator = (Vibrator) this.context.getSystemService("vibrator");
        if (Build.VERSION.SDK_INT <= 30 && !this.clipLoopingEnabled) {
            this.effect = getPaddedEffect(timings, amplitudes);
        } else {
            createWaveform = VibrationEffect.createWaveform(timings, amplitudes, getRepeatValue());
            this.effect = createWaveform;
        }
    }

    private void playCallback() {
        if (!this.clipLoaded) {
            throw new RuntimeException("Unable to play, no clip loaded");
        }
        if (this.effect == null) {
            return;
        }
        if (this.vibrator == null) {
            throw new RuntimeException("Unable to play, Vibrator service unavailable");
        }
        stopCallback();
        this.vibrator.vibrate(this.effect);
    }

    private void seekCallback(long[] timings, int[] amplitudes) {
        loadCallback(timings, amplitudes, false);
        stopCallback();
    }

    private void stopCallback() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    private void unloadCallback() {
        this.clipLoaded = false;
        this.clipLoopingEnabled = false;
        this.vibrator = null;
        this.effect = null;
    }
}
