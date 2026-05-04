package androidx.compose.ui.graphics.colorspace;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TransferParameters {

    /* renamed from: a, reason: collision with root package name */
    private final double f4146a;

    /* renamed from: b, reason: collision with root package name */
    private final double f4147b;

    /* renamed from: c, reason: collision with root package name */
    private final double f4148c;

    /* renamed from: d, reason: collision with root package name */
    private final double f4149d;

    /* renamed from: e, reason: collision with root package name */
    private final double f4150e;

    /* renamed from: f, reason: collision with root package name */
    private final double f4151f;
    private final double gamma;

    public TransferParameters(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        boolean isSpecialG;
        this.gamma = d11;
        this.f4146a = d12;
        this.f4147b = d13;
        this.f4148c = d14;
        this.f4149d = d15;
        this.f4150e = d16;
        this.f4151f = d17;
        if (Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        isSpecialG = TransferParametersKt.isSpecialG(d11);
        if (isSpecialG) {
            return;
        }
        if (d15 < 0.0d || d15 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d15);
        }
        if (d15 == 0.0d && (d12 == 0.0d || d11 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d15 >= 1.0d && d14 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d12 == 0.0d || d11 == 0.0d) && d14 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d14 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d12 < 0.0d || d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f4146a;
    }

    public final double component3() {
        return this.f4147b;
    }

    public final double component4() {
        return this.f4148c;
    }

    public final double component5() {
        return this.f4149d;
    }

    public final double component6() {
        return this.f4150e;
    }

    public final double component7() {
        return this.f4151f;
    }

    @m80.k
    public final TransferParameters copy(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return new TransferParameters(d11, d12, d13, d14, d15, d16, d17);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f4146a, transferParameters.f4146a) == 0 && Double.compare(this.f4147b, transferParameters.f4147b) == 0 && Double.compare(this.f4148c, transferParameters.f4148c) == 0 && Double.compare(this.f4149d, transferParameters.f4149d) == 0 && Double.compare(this.f4150e, transferParameters.f4150e) == 0 && Double.compare(this.f4151f, transferParameters.f4151f) == 0;
    }

    public final double getA() {
        return this.f4146a;
    }

    public final double getB() {
        return this.f4147b;
    }

    public final double getC() {
        return this.f4148c;
    }

    public final double getD() {
        return this.f4149d;
    }

    public final double getE() {
        return this.f4150e;
    }

    public final double getF() {
        return this.f4151f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f4146a)) * 31) + Double.hashCode(this.f4147b)) * 31) + Double.hashCode(this.f4148c)) * 31) + Double.hashCode(this.f4149d)) * 31) + Double.hashCode(this.f4150e)) * 31) + Double.hashCode(this.f4151f);
    }

    public final boolean isHLGish$ui_graphics_release() {
        return this.gamma == -3.0d;
    }

    public final boolean isPQish$ui_graphics_release() {
        return this.gamma == -2.0d;
    }

    @m80.k
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f4146a + ", b=" + this.f4147b + ", c=" + this.f4148c + ", d=" + this.f4149d + ", e=" + this.f4150e + ", f=" + this.f4151f + ')';
    }

    public /* synthetic */ TransferParameters(double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i11, kotlin.jvm.internal.v vVar) {
        this(d11, d12, d13, d14, d15, (i11 & 32) != 0 ? 0.0d : d16, (i11 & 64) != 0 ? 0.0d : d17);
    }
}
