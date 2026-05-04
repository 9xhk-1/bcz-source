package androidx.compose.foundation.text;

import a90.c3;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,396:1\n110#2:397\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt\n*L\n64#1:397\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @k
    public static final Modifier defaultTextFieldScroll(@k Modifier modifier, @k TextFieldScrollerPosition textFieldScrollerPosition, @k TextFieldValue textFieldValue, @k VisualTransformation visualTransformation, @k x00.a<TextLayoutResultProxy> aVar) {
        Modifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int m1156getOffsetToFollow5zctL8 = textFieldScrollerPosition.m1156getOffsetToFollow5zctL8(textFieldValue.m4807getSelectiond9O1mEE());
        textFieldScrollerPosition.m1158setPreviousSelection5zctL8(textFieldValue.m4807getSelectiond9O1mEE());
        TransformedText filterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        int i11 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i11 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, m1156getOffsetToFollow5zctL8, filterWithValidation, aVar);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, m1156getOffsetToFollow5zctL8, filterWithValidation, aVar);
        }
        return ClipKt.clipToBounds(modifier).then(verticalScrollLayoutModifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i11, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z11, int i12) {
        Rect zero;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i11))) == null) {
            zero = Rect.Companion.getZero();
        }
        Rect rect = zero;
        int mo371roundToPx0680j_4 = density.mo371roundToPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness());
        return Rect.copy$default(rect, z11 ? (i12 - rect.getLeft()) - mo371roundToPx0680j_4 : rect.getLeft(), 0.0f, z11 ? i12 - rect.getLeft() : mo371roundToPx0680j_4 + rect.getLeft(), 0.0f, 10, null);
    }

    @k
    public static final Modifier textFieldScrollable(@k Modifier modifier, @k final TextFieldScrollerPosition textFieldScrollerPosition, @l final MutableInteractionSource mutableInteractionSource, final boolean z11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("textFieldScrollable");
                inspectorInfo.getProperties().set("scrollerPosition", TextFieldScrollerPosition.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(805428266);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(805428266, i11, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
                }
                boolean z12 = TextFieldScrollerPosition.this.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
                boolean changed = composer.changed(TextFieldScrollerPosition.this);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = TextFieldScrollerPosition.this;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.l<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                            return invoke(f11.floatValue());
                        }

                        public final Float invoke(float f11) {
                            float offset = TextFieldScrollerPosition.this.getOffset() + f11;
                            if (offset > TextFieldScrollerPosition.this.getMaximum()) {
                                f11 = TextFieldScrollerPosition.this.getMaximum() - TextFieldScrollerPosition.this.getOffset();
                            } else if (offset < 0.0f) {
                                f11 = -TextFieldScrollerPosition.this.getOffset();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition3 = TextFieldScrollerPosition.this;
                            textFieldScrollerPosition3.setOffset(textFieldScrollerPosition3.getOffset() + f11);
                            return Float.valueOf(f11);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                final ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState((x00.l) rememberedValue, composer, 0);
                boolean changed2 = composer.changed(rememberScrollableState) | composer.changed(TextFieldScrollerPosition.this);
                final TextFieldScrollerPosition textFieldScrollerPosition3 = TextFieldScrollerPosition.this;
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new ScrollableState(textFieldScrollerPosition3) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        private final State canScrollBackward$delegate;
                        private final State canScrollForward$delegate;

                        {
                            this.canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // x00.a
                                public final Boolean invoke() {
                                    return Boolean.valueOf(TextFieldScrollerPosition.this.getOffset() < TextFieldScrollerPosition.this.getMaximum());
                                }
                            });
                            this.canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // x00.a
                                public final Boolean invoke() {
                                    return Boolean.valueOf(TextFieldScrollerPosition.this.getOffset() > 0.0f);
                                }
                            });
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public float dispatchRawDelta(float f11) {
                            return ScrollableState.this.dispatchRawDelta(f11);
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollBackward() {
                            return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getCanScrollForward() {
                            return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getLastScrolledBackward() {
                            return ScrollableState.this.getLastScrolledBackward();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean getLastScrolledForward() {
                            return ScrollableState.this.getLastScrolledForward();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public boolean isScrollInProgress() {
                            return ScrollableState.this.isScrollInProgress();
                        }

                        @Override // androidx.compose.foundation.gestures.ScrollableState
                        public Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super g2> cVar) {
                            return ScrollableState.this.scroll(mutatePriority, pVar, cVar);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Modifier scrollable$default = ScrollableKt.scrollable$default(Modifier.Companion, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) rememberedValue2, TextFieldScrollerPosition.this.getOrientation(), z11 && TextFieldScrollerPosition.this.getMaximum() != 0.0f, z12, null, mutableInteractionSource, 16, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return scrollable$default;
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            mutableInteractionSource = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z11);
    }
}
