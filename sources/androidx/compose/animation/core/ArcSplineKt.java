package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ArcSplineKt {
    public static final int ArcSplineArcAbove = 5;
    public static final int ArcSplineArcBelow = 4;
    public static final int ArcSplineArcStartFlip = 3;
    public static final int ArcSplineArcStartHorizontal = 2;
    public static final int ArcSplineArcStartLinear = 0;
    public static final int ArcSplineArcStartVertical = 1;
    private static final int DownArc = 4;
    private static final float Epsilon = 0.001f;
    private static final float HalfPi = 1.5707964f;
    private static final int LutSize = 101;

    @k
    private static final float[] OurPercentCache = new float[91];
    private static final int StartHorizontal = 2;
    private static final int StartLinear = 3;
    private static final int StartVertical = 1;
    private static final int UpArc = 5;
}
