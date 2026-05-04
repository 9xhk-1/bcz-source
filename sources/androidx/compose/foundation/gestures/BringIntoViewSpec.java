package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Stable;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface BringIntoViewSpec {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final AnimationSpec<Float> DefaultScrollAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

        @k
        private static final BringIntoViewSpec DefaultBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
        };

        private Companion() {
        }

        public final float defaultCalculateScrollDistance$foundation_release(float f11, float f12, float f13) {
            float f14 = f12 + f11;
            if (f11 >= 0.0f && f14 <= f13) {
                return 0.0f;
            }
            if (f11 < 0.0f && f14 > f13) {
                return 0.0f;
            }
            float f15 = f14 - f13;
            return Math.abs(f11) < Math.abs(f15) ? f11 : f15;
        }

        @k
        public final BringIntoViewSpec getDefaultBringIntoViewSpec$foundation_release() {
            return DefaultBringIntoViewSpec;
        }

        @k
        public final AnimationSpec<Float> getDefaultScrollAnimationSpec$foundation_release() {
            return DefaultScrollAnimationSpec;
        }
    }

    default float calculateScrollDistance(float f11, float f12, float f13) {
        return Companion.defaultCalculateScrollDistance$foundation_release(f11, f12, f13);
    }

    @n(message = "Animation spec customization is no longer supported.")
    @k
    default AnimationSpec<Float> getScrollAnimationSpec() {
        return Companion.getDefaultScrollAnimationSpec$foundation_release();
    }

    @n(message = "Animation spec customization is no longer supported.")
    static /* synthetic */ void getScrollAnimationSpec$annotations() {
    }
}
