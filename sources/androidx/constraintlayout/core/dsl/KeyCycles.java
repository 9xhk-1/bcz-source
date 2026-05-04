package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyCycles extends KeyAttributes {
    private float[] mWaveOffset;
    private float[] mWavePeriod;
    private float[] mWavePhase;
    private Wave mWaveShape;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS
    }

    public KeyCycles(int i11, String... strArr) {
        super(i11, strArr);
        this.mWaveShape = null;
        this.mWavePeriod = null;
        this.mWaveOffset = null;
        this.mWavePhase = null;
        this.TYPE = TypedValues.CycleType.NAME;
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttributes
    public void attributesToString(StringBuilder sb2) {
        super.attributesToString(sb2);
        if (this.mWaveShape != null) {
            sb2.append("shape:'");
            sb2.append(this.mWaveShape);
            sb2.append("',\n");
        }
        append(sb2, TypedValues.CycleType.S_WAVE_PERIOD, this.mWavePeriod);
        append(sb2, "offset", this.mWaveOffset);
        append(sb2, TypedValues.CycleType.S_WAVE_PHASE, this.mWavePhase);
    }

    public float[] getWaveOffset() {
        return this.mWaveOffset;
    }

    public float[] getWavePeriod() {
        return this.mWavePeriod;
    }

    public float[] getWavePhase() {
        return this.mWavePhase;
    }

    public Wave getWaveShape() {
        return this.mWaveShape;
    }

    public void setWaveOffset(float... fArr) {
        this.mWaveOffset = fArr;
    }

    public void setWavePeriod(float... fArr) {
        this.mWavePeriod = fArr;
    }

    public void setWavePhase(float... fArr) {
        this.mWavePhase = fArr;
    }

    public void setWaveShape(Wave wave) {
        this.mWaveShape = wave;
    }
}
