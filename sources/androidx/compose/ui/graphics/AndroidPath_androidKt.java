package androidx.compose.ui.graphics;

import android.graphics.Path;
import androidx.compose.ui.graphics.Path;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidPath_androidKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    @m80.k
    public static final android.graphics.Path asAndroidPath(@m80.k Path path) {
        if (path instanceof AndroidPath) {
            return ((AndroidPath) path).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @m80.k
    public static final Path asComposePath(@m80.k android.graphics.Path path) {
        return new AndroidPath(path);
    }

    public static final void throwIllegalStateException(@m80.k String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction toPlatformPathDirection(Path.Direction direction) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i11 == 1) {
            return Path.Direction.CCW;
        }
        if (i11 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
