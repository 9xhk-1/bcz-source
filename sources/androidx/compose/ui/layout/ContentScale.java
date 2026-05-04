package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface ContentScale {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo3850computeScaleFactorH7hwNQA(long j11, long j12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
                float m3854computeFillMaxDimensioniLBOSCw;
                m3854computeFillMaxDimensioniLBOSCw = ContentScaleKt.m3854computeFillMaxDimensioniLBOSCw(j11, j12);
                return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(m3854computeFillMaxDimensioniLBOSCw) << 32) | (4294967295L & Float.floatToRawIntBits(m3854computeFillMaxDimensioniLBOSCw)));
            }
        };

        @k
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
                float m3855computeFillMinDimensioniLBOSCw;
                m3855computeFillMinDimensioniLBOSCw = ContentScaleKt.m3855computeFillMinDimensioniLBOSCw(j11, j12);
                return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(m3855computeFillMinDimensioniLBOSCw) << 32) | (4294967295L & Float.floatToRawIntBits(m3855computeFillMinDimensioniLBOSCw)));
            }
        };

        @k
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
                return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        };

        @k
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
                return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        };

        @k
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
                float m3855computeFillMinDimensioniLBOSCw;
                if (Float.intBitsToFloat((int) (j11 >> 32)) <= Float.intBitsToFloat((int) (j12 >> 32)) && Float.intBitsToFloat((int) (j11 & 4294967295L)) <= Float.intBitsToFloat((int) (j12 & 4294967295L))) {
                    return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                }
                m3855computeFillMinDimensioniLBOSCw = ContentScaleKt.m3855computeFillMinDimensioniLBOSCw(j11, j12);
                return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(m3855computeFillMinDimensioniLBOSCw) << 32) | (Float.floatToRawIntBits(m3855computeFillMinDimensioniLBOSCw) & 4294967295L));
            }
        };

        @k
        private static final FixedScale None = new FixedScale(1.0f);

        @k
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3850computeScaleFactorH7hwNQA(long j11, long j12) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (j11 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) / Float.intBitsToFloat((int) (j11 & 4294967295L));
                return ScaleFactor.m3940constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
            }
        };

        private Companion() {
        }

        @k
        public final ContentScale getCrop() {
            return Crop;
        }

        @k
        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        @k
        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        @k
        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        @k
        public final ContentScale getFit() {
            return Fit;
        }

        @k
        public final ContentScale getInside() {
            return Inside;
        }

        @k
        public final FixedScale getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
