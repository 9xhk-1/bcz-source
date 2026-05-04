package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i11, int i12, float[] fArr) {
        boolean z11 = false;
        Assertions.checkArgument(i11 > 0, "Input channel count must be positive.");
        Assertions.checkArgument(i12 > 0, "Output channel count must be positive.");
        Assertions.checkArgument(fArr.length == i11 * i12, "Coefficient array length is invalid.");
        this.inputChannelCount = i11;
        this.outputChannelCount = i12;
        this.coefficients = checkCoefficientsValid(fArr);
        int i13 = 0;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        while (i13 < i11) {
            int i14 = 0;
            while (i14 < i12) {
                float mixingCoefficient = getMixingCoefficient(i13, i14);
                boolean z15 = i13 == i14;
                if (mixingCoefficient != 1.0f && z15) {
                    z14 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z12 = false;
                    if (!z15) {
                        z13 = false;
                    }
                }
                i14++;
            }
            i13++;
        }
        this.isZero = z12;
        boolean z16 = isSquare() && z13;
        this.isDiagonal = z16;
        if (z16 && z14) {
            z11 = true;
        }
        this.isIdentity = z11;
    }

    @uo.a
    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i11 = 0; i11 < fArr.length; i11++) {
            if (fArr[i11] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i11 + " is negative.");
            }
        }
        return fArr;
    }

    public static ChannelMixingMatrix create(int i11, int i12) {
        return new ChannelMixingMatrix(i11, i12, createConstantGainMixingCoefficients(i11, i12));
    }

    private static float[] createConstantGainMixingCoefficients(int i11, int i12) {
        if (i11 == i12) {
            return initializeIdentityMatrix(i12);
        }
        if (i11 == 1 && i12 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i11 == 2 && i12 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i11 + "->" + i12 + " are not yet implemented.");
    }

    private static float[] createConstantPowerMixingCoefficients(int i11, int i12) {
        if (i12 == 1) {
            return getConstantPowerCoefficientsToMono(i11);
        }
        if (i12 == 2) {
            return getConstantPowerCoefficientsToStereo(i11);
        }
        if (i11 == i12) {
            return initializeIdentityMatrix(i12);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i11 + "->" + i12 + " are not implemented.");
    }

    public static ChannelMixingMatrix createForConstantPower(int i11, int i12) {
        return new ChannelMixingMatrix(i11, i12, createConstantPowerMixingCoefficients(i11, i12));
    }

    private static float[] getConstantPowerCoefficientsToMono(int i11) {
        switch (i11) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i11 + "->1 are not implemented.");
        }
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i11) {
        switch (i11) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i11 + "->2 are not implemented.");
        }
    }

    private static float[] initializeIdentityMatrix(int i11) {
        float[] fArr = new float[i11 * i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[(i11 * i12) + i12] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i11, int i12) {
        return this.coefficients[(i11 * this.outputChannelCount) + i12];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f11) {
        float[] fArr = new float[this.coefficients.length];
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i11 >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i11] = fArr2[i11] * f11;
            i11++;
        }
    }
}
