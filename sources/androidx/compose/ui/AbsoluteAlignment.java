package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AbsoluteAlignment {
    public static final int $stable = 0;

    @k
    public static final AbsoluteAlignment INSTANCE = new AbsoluteAlignment();

    @k
    private static final Alignment TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    @k
    private static final Alignment TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    @k
    private static final Alignment CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    @k
    private static final Alignment CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    @k
    private static final Alignment BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    @k
    private static final Alignment BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    @k
    private static final Alignment.Horizontal Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    @k
    private static final Alignment.Horizontal Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    private AbsoluteAlignment() {
    }

    @k
    public final Alignment getBottomLeft() {
        return BottomLeft;
    }

    @k
    public final Alignment getBottomRight() {
        return BottomRight;
    }

    @k
    public final Alignment getCenterLeft() {
        return CenterLeft;
    }

    @k
    public final Alignment getCenterRight() {
        return CenterRight;
    }

    @k
    public final Alignment.Horizontal getLeft() {
        return Left;
    }

    @k
    public final Alignment.Horizontal getRight() {
        return Right;
    }

    @k
    public final Alignment getTopLeft() {
        return TopLeft;
    }

    @k
    public final Alignment getTopRight() {
        return TopRight;
    }

    @Stable
    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBottomRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopRight$annotations() {
    }
}
