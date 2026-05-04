package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface MarqueeSpacing {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int fractionOfContainer$lambda$0(float f11, Density density, int i11, int i12) {
            return c10.d.L0(f11 * i12);
        }

        @m80.k
        public final MarqueeSpacing fractionOfContainer(final float f11) {
            return new MarqueeSpacing() { // from class: androidx.compose.foundation.d
                @Override // androidx.compose.foundation.MarqueeSpacing
                public final int calculateSpacing(Density density, int i11, int i12) {
                    int fractionOfContainer$lambda$0;
                    fractionOfContainer$lambda$0 = MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f11, density, i11, i12);
                    return fractionOfContainer$lambda$0;
                }
            };
        }
    }

    int calculateSpacing(@m80.k Density density, int i11, int i12);
}
