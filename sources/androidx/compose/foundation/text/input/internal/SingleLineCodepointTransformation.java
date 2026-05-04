package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SingleLineCodepointTransformation implements CodepointTransformation {
    public static final int $stable = 0;
    private static final int CARRIAGE_RETURN = 13;

    @m80.k
    public static final SingleLineCodepointTransformation INSTANCE = new SingleLineCodepointTransformation();
    private static final int LINE_FEED = 10;
    private static final int WHITESPACE = 32;
    private static final int ZERO_WIDTH_SPACE = 65279;

    private SingleLineCodepointTransformation() {
    }

    @m80.k
    public String toString() {
        return "SingleLineCodepointTransformation";
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int i11, int i12) {
        if (i12 == 10) {
            return 32;
        }
        return i12 == 13 ? ZERO_WIDTH_SPACE : i12;
    }
}
