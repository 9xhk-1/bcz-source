package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextInclusionStrategy;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface TextInclusionStrategy {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final TextInclusionStrategy AnyOverlap = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.a
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean isIncluded(Rect rect, Rect rect2) {
                boolean overlaps;
                overlaps = rect.overlaps(rect2);
                return overlaps;
            }
        };

        @k
        private static final TextInclusionStrategy ContainsAll = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.b
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean isIncluded(Rect rect, Rect rect2) {
                boolean ContainsAll$lambda$1;
                ContainsAll$lambda$1 = TextInclusionStrategy.Companion.ContainsAll$lambda$1(rect, rect2);
                return ContainsAll$lambda$1;
            }
        };

        @k
        private static final TextInclusionStrategy ContainsCenter = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.c
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean isIncluded(Rect rect, Rect rect2) {
                boolean ContainsCenter$lambda$2;
                ContainsCenter$lambda$2 = TextInclusionStrategy.Companion.ContainsCenter$lambda$2(rect, rect2);
                return ContainsCenter$lambda$2;
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsAll$lambda$1(Rect rect, Rect rect2) {
            return !rect2.isEmpty() && rect.getLeft() >= rect2.getLeft() && rect.getRight() <= rect2.getRight() && rect.getTop() >= rect2.getTop() && rect.getBottom() <= rect2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsCenter$lambda$2(Rect rect, Rect rect2) {
            return rect2.m2294containsk4lQ0M(rect.m2298getCenterF1C5BW0());
        }

        @k
        public final TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        @k
        public final TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        @k
        public final TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }
    }

    boolean isIncluded(@k Rect rect, @k Rect rect2);
}
