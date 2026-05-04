package androidx.compose.foundation.layout;

import a00.a0;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import org.junit.jupiter.api.j2;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,711:1\n702#1,2:717\n705#1,5:722\n702#1,2:727\n705#1,5:732\n702#1,2:740\n705#1,5:746\n702#1,2:754\n705#1,5:760\n702#1,2:768\n705#1,5:774\n702#1,2:782\n705#1,5:788\n113#2:712\n113#2:713\n12762#3,3:714\n13404#3,3:719\n13404#3,3:729\n12762#3,3:737\n13404#3,2:742\n13406#3:745\n12762#3,3:751\n13404#3,2:756\n13406#3:759\n12762#3,3:765\n13404#3,2:770\n13406#3:773\n12762#3,3:779\n13404#3,2:784\n13406#3:787\n13404#3,3:793\n26#4:744\n26#4:758\n26#4:772\n26#4:786\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n614#1:717,2\n614#1:722,5\n622#1:727,2\n622#1:732,5\n636#1:740,2\n636#1:746,5\n651#1:754,2\n651#1:760,5\n675#1:768,2\n675#1:774,5\n695#1:782,2\n695#1:788,5\n339#1:712\n351#1:713\n612#1:714,3\n614#1:719,3\n622#1:729,3\n634#1:737,3\n636#1:742,2\n636#1:745\n648#1:751,3\n651#1:756,2\n651#1:759\n665#1:765,3\n675#1:770,2\n675#1:773\n687#1:779,3\n695#1:784,2\n695#1:787\n703#1:793,3\n637#1:744\n652#1:758\n676#1:772\n696#1:786\n*E\n"})
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;

    @m80.k
    public static final Arrangement INSTANCE = new Arrangement();

    @m80.k
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i11, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };

    @m80.k
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i11, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    };

    @m80.k
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i11, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };

    @m80.k
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i11, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i11, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };

    @m80.k
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m5115constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i11, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i11, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
        public float mo613getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i11, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i11, iArr, iArr2, false);
        }
    };

    @m80.k
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m5115constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i11, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i11, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo613getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i11, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i11, iArr, iArr2, false);
        }
    };

    @m80.k
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m5115constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i11, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i11, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo613getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i11, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i11, iArr, iArr2, false);
        }
    };

    @m80.k
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m5115constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i11, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i11, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo613getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i11, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i11, iArr, iArr2, false);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n554#1:712\n*E\n"})
    @Immutable
    public static final class Absolute {
        public static final int $stable = 0;

        @m80.k
        public static final Absolute INSTANCE = new Absolute();

        @m80.k
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };

        @m80.k
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };

        @m80.k
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };

        @m80.k
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };

        @m80.k
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };

        @m80.k
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i11, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i11, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        @Stable
        @m80.k
        public final Horizontal aligned(@m80.k final Alignment.Horizontal horizontal) {
            return new SpacedAligned(Dp.m5115constructorimpl(0), false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                    return Integer.valueOf(Alignment.Horizontal.this.align(0, i11, layoutDirection));
                }
            }, null);
        }

        @m80.k
        public final Horizontal getCenter() {
            return Center;
        }

        @m80.k
        public final Horizontal getLeft() {
            return Left;
        }

        @m80.k
        public final Horizontal getRight() {
            return Right;
        }

        @m80.k
        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        @m80.k
        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        @m80.k
        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Stable
        @m80.k
        /* renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m610spacedBy0680j_4(float f11) {
            return new SpacedAligned(f11, false, null, 0 == true ? 1 : 0);
        }

        @Stable
        @m80.k
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m611spacedByD5KLDUw(float f11, @m80.k final Alignment.Horizontal horizontal) {
            return new SpacedAligned(f11, false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                    return Integer.valueOf(Alignment.Horizontal.this.align(0, i11, layoutDirection));
                }
            }, null);
        }

        @Stable
        @m80.k
        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m612spacedByD5KLDUw(float f11, @m80.k final Alignment.Vertical vertical) {
            return new SpacedAligned(f11, false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                    return Integer.valueOf(Alignment.Vertical.this.align(0, i11));
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }
            }, null);
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:712\n*E\n"})
    @Stable
    public interface Horizontal {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m615getSpacingD9Ej5fM(@m80.k Horizontal horizontal) {
                return Horizontal.super.mo613getSpacingD9Ej5fM();
            }
        }

        void arrange(@m80.k Density density, int i11, @m80.k int[] iArr, @m80.k LayoutDirection layoutDirection, @m80.k int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo613getSpacingD9Ej5fM() {
            return Dp.m5115constructorimpl(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n101#1:712\n*E\n"})
    @Stable
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m617getSpacingD9Ej5fM(@m80.k HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.mo613getSpacingD9Ej5fM();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        default float mo613getSpacingD9Ej5fM() {
            return Dp.m5115constructorimpl(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,711:1\n702#2,2:712\n705#2,5:717\n13404#3,3:714\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n584#1:712,2\n584#1:717,5\n584#1:714,3\n*E\n"})
    @Immutable
    public static final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;

        @l
        private final p<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f11, boolean z11, p pVar, v vVar) {
            this(f11, z11, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m618copy8Feqmps$default(SpacedAligned spacedAligned, float f11, boolean z11, p pVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = spacedAligned.space;
            }
            if ((i11 & 2) != 0) {
                z11 = spacedAligned.rtlMirror;
            }
            if ((i11 & 4) != 0) {
                pVar = spacedAligned.alignment;
            }
            return spacedAligned.m620copy8Feqmps(f11, z11, pVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@m80.k Density density, int i11, @m80.k int[] iArr, @m80.k LayoutDirection layoutDirection, @m80.k int[] iArr2) {
            int i12;
            int i13;
            if (iArr.length == 0) {
                return;
            }
            int mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(this.space);
            boolean z11 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (z11) {
                i12 = 0;
                i13 = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i14 = iArr[length];
                    int min = Math.min(i12, i11 - i14);
                    iArr2[length] = min;
                    i13 = Math.min(mo371roundToPx0680j_4, (i11 - min) - i14);
                    i12 = iArr2[length] + i14 + i13;
                }
            } else {
                int length2 = iArr.length;
                int i15 = 0;
                i12 = 0;
                i13 = 0;
                int i16 = 0;
                while (i15 < length2) {
                    int i17 = iArr[i15];
                    int min2 = Math.min(i12, i11 - i17);
                    iArr2[i16] = min2;
                    int min3 = Math.min(mo371roundToPx0680j_4, (i11 - min2) - i17);
                    int i18 = iArr2[i16] + i17 + min3;
                    i15++;
                    i13 = min3;
                    i12 = i18;
                    i16++;
                }
            }
            int i19 = i12 - i13;
            p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            if (pVar == null || i19 >= i11) {
                return;
            }
            int intValue = pVar.invoke(Integer.valueOf(i11 - i19), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i21 = 0; i21 < length3; i21++) {
                iArr2[i21] = iArr2[i21] + intValue;
            }
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name */
        public final float m619component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        @l
        public final p<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        @m80.k
        /* renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m620copy8Feqmps(float f11, boolean z11, @l p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            return new SpacedAligned(f11, z11, pVar, null);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.m5120equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && g0.g(this.alignment, spacedAligned.alignment);
        }

        @l
        public final p<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m621getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo613getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int m5121hashCodeimpl = ((Dp.m5121hashCodeimpl(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            p<Integer, LayoutDirection, Integer> pVar = this.alignment;
            return m5121hashCodeimpl + (pVar == null ? 0 : pVar.hashCode());
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) Dp.m5126toStringimpl(this.space));
            sb2.append(j2.O);
            sb2.append(this.alignment);
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f11, boolean z11, p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.space = f11;
            this.rtlMirror = z11;
            this.alignment = pVar;
            this.spacing = f11;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@m80.k Density density, int i11, @m80.k int[] iArr, @m80.k int[] iArr2) {
            arrange(density, i11, iArr, LayoutDirection.Ltr, iArr2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n78#1:712\n*E\n"})
    @Stable
    public interface Vertical {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m623getSpacingD9Ej5fM(@m80.k Vertical vertical) {
                return Vertical.super.mo613getSpacingD9Ej5fM();
            }
        }

        void arrange(@m80.k Density density, int i11, @m80.k int[] iArr, @m80.k int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo613getSpacingD9Ej5fM() {
            return Dp.m5115constructorimpl(0);
        }
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z11, p<? super Integer, ? super Integer, g2> pVar) {
        if (!z11) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                pVar.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i11]));
                i11++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @Stable
    @m80.k
    public final Horizontal aligned(@m80.k final Alignment.Horizontal horizontal) {
        return new SpacedAligned(Dp.m5115constructorimpl(0), true, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$aligned$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Horizontal.this.align(0, i11, layoutDirection));
            }
        }, null);
    }

    @m80.k
    public final Vertical getBottom() {
        return Bottom;
    }

    @m80.k
    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    @m80.k
    public final Horizontal getEnd() {
        return End;
    }

    @m80.k
    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    @m80.k
    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    @m80.k
    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    @m80.k
    public final Horizontal getStart() {
        return Start;
    }

    @m80.k
    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout_release(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float f11 = (i11 - i13) / 2;
        if (!z11) {
            int length = iArr.length;
            int i15 = 0;
            while (i12 < length) {
                int i16 = iArr[i12];
                iArr2[i15] = Math.round(f11);
                f11 += i16;
                i12++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = Math.round(f11);
            f11 += i17;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(@m80.k int[] iArr, @m80.k int[] iArr2, boolean z11) {
        int i11 = 0;
        if (!z11) {
            int length = iArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = iArr[i11];
                iArr2[i12] = i13;
                i13 += i14;
                i11++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = i11;
            i11 += i15;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        int i15 = i11 - i13;
        if (!z11) {
            int length = iArr.length;
            int i16 = 0;
            while (i12 < length) {
                int i17 = iArr[i12];
                iArr2[i16] = i15;
                i15 += i17;
                i12++;
                i16++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i18 = iArr[length2];
            iArr2[length2] = i15;
            i15 += i18;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = !(iArr.length == 0) ? (i11 - i13) / iArr.length : 0.0f;
        float f11 = length / 2;
        if (z11) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f11);
                f11 += i15 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i16 = 0;
        while (i12 < length3) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f11);
            f11 += i17 + length;
            i12++;
            i16++;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, boolean z11) {
        if (iArr.length == 0) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float max = (i11 - i13) / Math.max(a0.Me(iArr), 1);
        float f11 = (z11 && iArr.length == 1) ? max : 0.0f;
        if (z11) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i15 = iArr[length];
                iArr2[length] = Math.round(f11);
                f11 += i15 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i16 = 0;
        while (i12 < length2) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f11);
            f11 += i17 + max;
            i12++;
            i16++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i11, @m80.k int[] iArr, @m80.k int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = (i11 - i13) / (iArr.length + 1);
        if (z11) {
            float f11 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f11);
                f11 += i15 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f12 = length;
        int i16 = 0;
        while (i12 < length3) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f12);
            f12 += i17 + length;
            i12++;
            i16++;
        }
    }

    @Stable
    @m80.k
    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m607spacedBy0680j_4(float f11) {
        return new SpacedAligned(f11, true, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Companion.getStart().align(0, i11, layoutDirection));
            }
        }, null);
    }

    @Stable
    @m80.k
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m608spacedByD5KLDUw(float f11, @m80.k final Alignment.Horizontal horizontal) {
        return new SpacedAligned(f11, true, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Horizontal.this.align(0, i11, layoutDirection));
            }
        }, null);
    }

    @Stable
    @m80.k
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m609spacedByD5KLDUw(float f11, @m80.k final Alignment.Vertical vertical) {
        return new SpacedAligned(f11, false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Vertical.this.align(0, i11));
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @Stable
    @m80.k
    public final Vertical aligned(@m80.k final Alignment.Vertical vertical) {
        return new SpacedAligned(Dp.m5115constructorimpl(0), false, new p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$aligned$2
            {
                super(2);
            }

            public final Integer invoke(int i11, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Vertical.this.align(0, i11));
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }
}
