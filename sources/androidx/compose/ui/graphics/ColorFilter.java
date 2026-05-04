package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public class ColorFilter {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private final android.graphics.ColorFilter nativeColorFilter;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m2550tintxETnrds$default(Companion companion, long j11, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = BlendMode.Companion.m2449getSrcIn0nO6VwU();
            }
            return companion.m2553tintxETnrds(j11, i11);
        }

        @Stable
        @m80.k
        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m2551colorMatrixjHGOpc(@m80.k float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (kotlin.jvm.internal.v) null);
        }

        @Stable
        @m80.k
        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m2552lightingOWjLjI(long j11, long j12) {
            return new LightingColorFilter(j11, j12, (kotlin.jvm.internal.v) null);
        }

        @Stable
        @m80.k
        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m2553tintxETnrds(long j11, int i11) {
            return new BlendModeColorFilter(j11, i11, (kotlin.jvm.internal.v) null);
        }

        private Companion() {
        }
    }

    public ColorFilter(@m80.k android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    @m80.k
    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}
