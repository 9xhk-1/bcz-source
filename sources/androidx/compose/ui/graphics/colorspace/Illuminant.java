package androidx.compose.ui.graphics.colorspace;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Illuminant {

    @m80.k
    public static final Illuminant INSTANCE = new Illuminant();

    @m80.k
    private static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    @m80.k
    private static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    @m80.k
    private static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    @m80.k
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    @m80.k
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    @m80.k
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    @m80.k
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    @m80.k
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    @m80.k
    private static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    @m80.k
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private Illuminant() {
    }

    @m80.k
    public final WhitePoint getA() {
        return A;
    }

    @m80.k
    public final WhitePoint getB() {
        return B;
    }

    @m80.k
    public final WhitePoint getC() {
        return C;
    }

    @m80.k
    public final WhitePoint getD50() {
        return D50;
    }

    @m80.k
    public final float[] getD50Xyz$ui_graphics_release() {
        return D50Xyz;
    }

    @m80.k
    public final WhitePoint getD55() {
        return D55;
    }

    @m80.k
    public final WhitePoint getD60() {
        return D60;
    }

    @m80.k
    public final WhitePoint getD65() {
        return D65;
    }

    @m80.k
    public final WhitePoint getD75() {
        return D75;
    }

    @m80.k
    public final WhitePoint getE() {
        return E;
    }

    @m80.k
    public final float[] newD50Xyz$ui_graphics_release() {
        return new float[]{0.964212f, 1.0f, 0.825188f};
    }
}
