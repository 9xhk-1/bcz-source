package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1123:1\n1247#2,6:1124\n1247#2,6:1130\n1247#2,6:1136\n65#3:1142\n60#4:1143\n85#4:1146\n53#4,3:1148\n22#5:1144\n54#6:1145\n30#7:1147\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n1031#1:1124,6\n1034#1:1130,6\n1040#1:1136,6\n1091#1:1142\n1091#1:1143\n1111#1:1146\n1121#1:1148,3\n1091#1:1144\n1111#1:1145\n1121#1:1147\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(final boolean z11, @k final ResolvedTextDirection resolvedTextDirection, @k final TextFieldSelectionManager textFieldSelectionManager, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(resolvedTextDirection) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344558920, i12, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1029)");
            }
            int i13 = i12 & 14;
            boolean changed = (i13 == 4) | startRestartGroup.changed(textFieldSelectionManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z11);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionManager) | (i13 == 4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0 */
                    public final long mo1028provideF1C5BW0() {
                        return TextFieldSelectionManager.this.m1506getHandlePositiontuRUvjQ$foundation_release(z11);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
            boolean m4558getReversedimpl = TextRange.m4558getReversedimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE());
            float handleLineHeight$foundation_release = textFieldSelectionManager.getHandleLineHeight$foundation_release(z11);
            Modifier.Companion companion = Modifier.Companion;
            boolean changedInstance2 = startRestartGroup.changedInstance(textDragObserver);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                        Object detectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, TextDragObserver.this, cVar);
                        return detectDownAndDragGesturesWithObserver == kotlin.coroutines.intrinsics.b.l() ? detectDownAndDragGesturesWithObserver : g2.f100423a;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AndroidSelectionHandles_androidKt.m1430SelectionHandlewLIcFTc(offsetProvider, z11, resolvedTextDirection, m4558getReversedimpl, 0L, handleLineHeight$foundation_release, SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) rememberedValue3), startRestartGroup, (i12 << 3) & 1008, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    TextFieldSelectionManagerKt.TextFieldSelectionHandle(z11, resolvedTextDirection, textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1510calculateSelectionMagnifierCenterAndroidO0kMr_c(@k TextFieldSelectionManager textFieldSelectionManager, long j11) {
        int m4559getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextDelegate textDelegate;
        AnnotatedString text;
        Offset m1504getCurrentDragPosition_m7T9E = textFieldSelectionManager.m1504getCurrentDragPosition_m7T9E();
        if (m1504getCurrentDragPosition_m7T9E == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        long m2278unboximpl = m1504getCurrentDragPosition_m7T9E.m2278unboximpl();
        AnnotatedString transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release();
        if (transformedText$foundation_release == null || transformedText$foundation_release.length() == 0) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i11 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i11 == -1) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (i11 == 1 || i11 == 2) {
            m4559getStartimpl = TextRange.m4559getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE());
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m4559getStartimpl = TextRange.m4554getEndimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE());
        }
        LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        int I = u.I(textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(m4559getStartimpl), 0, text.length());
        float intBitsToFloat = Float.intBitsToFloat((int) (layoutResult.m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m2278unboximpl) >> 32));
        TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(I);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float H = u.H(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m5284equalsimpl0(j11, IntSize.Companion.m5291getZeroYbymL2g()) && Math.abs(intBitsToFloat - H) > ((int) (j11 >> 32)) / 2) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(H) << 32) | (Float.floatToRawIntBits(((value.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop) & 4294967295L));
    }

    public static final boolean isSelectionHandleInVisibleBound(@k TextFieldSelectionManager textFieldSelectionManager, boolean z11) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m1485containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1506getHandlePositiontuRUvjQ$foundation_release(z11));
    }
}
