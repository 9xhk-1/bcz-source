package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,963:1\n75#2:964\n75#2:965\n75#2:966\n75#2:1012\n75#2:1013\n75#2:1014\n1247#3,6:967\n1247#3,6:973\n1247#3,3:979\n1250#3,3:983\n1247#3,6:986\n1247#3,6:992\n1247#3,3:1005\n1250#3,3:1009\n1247#3,6:1015\n1247#3,6:1021\n1247#3,6:1027\n1247#3,6:1033\n1247#3,6:1080\n1247#3,6:1086\n1247#3,6:1092\n1247#3,6:1098\n1247#3,6:1104\n1247#3,6:1110\n1247#3,6:1116\n1247#3,6:1122\n1247#3,6:1128\n1247#3,6:1134\n1247#3,6:1140\n1247#3,6:1146\n1247#3,6:1152\n1247#3,6:1158\n1247#3,6:1164\n1247#3,6:1170\n1#4:982\n557#5:998\n554#5,6:999\n555#6:1008\n70#7:1039\n67#7,9:1040\n77#7:1079\n79#8,6:1049\n86#8,3:1064\n89#8,2:1073\n93#8:1078\n347#9,9:1055\n356#9,3:1075\n4206#10,6:1067\n85#11:1176\n85#11:1177\n85#11:1178\n85#11:1179\n113#11,2:1180\n85#11:1182\n113#11,2:1183\n113#12:1185\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n246#1:964\n247#1:965\n248#1:966\n300#1:1012\n301#1:1013\n302#1:1014\n252#1:967,6\n257#1:973,6\n262#1:979,3\n262#1:983,3\n280#1:986,6\n288#1:992,6\n299#1:1005,3\n299#1:1009,3\n305#1:1015,6\n349#1:1021,6\n365#1:1027,6\n390#1:1033,6\n505#1:1080,6\n510#1:1086,6\n514#1:1092,6\n525#1:1098,6\n532#1:1104,6\n541#1:1110,6\n550#1:1116,6\n557#1:1122,6\n566#1:1128,6\n705#1:1134,6\n711#1:1140,6\n722#1:1146,6\n726#1:1152,6\n862#1:1158,6\n899#1:1164,6\n939#1:1170,6\n299#1:998\n299#1:999,6\n299#1:1008\n430#1:1039\n430#1:1040,9\n430#1:1079\n430#1:1049,6\n430#1:1064,3\n430#1:1073,2\n430#1:1078\n430#1:1055,9\n430#1:1075,3\n430#1:1067,6\n505#1:1176\n525#1:1177\n550#1:1178\n705#1:1179\n705#1:1180,2\n722#1:1182\n722#1:1183,2\n586#1:1185\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextFieldKt {

    @k
    private static final TextFieldDecorator DefaultTextFieldDecorator = new TextFieldDecorator() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1
        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void Decoration(p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
            composer.startReplaceGroup(-1669748801);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1669748801, i11, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:574)");
            }
            pVar.invoke(composer, Integer.valueOf(i11 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    };
    private static final long MinTouchTargetSizeForHandles;

    static {
        float f11 = 40;
        MinTouchTargetSizeForHandles = DpKt.m5137DpSizeYgX7TsA(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@m80.k final androidx.compose.foundation.text.input.TextFieldState r36, @m80.l androidx.compose.ui.Modifier r37, boolean r38, boolean r39, @m80.l androidx.compose.foundation.text.input.InputTransformation r40, @m80.l androidx.compose.ui.text.TextStyle r41, @m80.l androidx.compose.foundation.text.KeyboardOptions r42, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r43, @m80.l androidx.compose.foundation.text.input.TextFieldLineLimits r44, @m80.l x00.p<? super androidx.compose.ui.unit.Density, ? super x00.a<androidx.compose.ui.text.TextLayoutResult>, yz.g2> r45, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r46, @m80.l androidx.compose.ui.graphics.Brush r47, @m80.l androidx.compose.foundation.text.input.OutputTransformation r48, @m80.l androidx.compose.foundation.text.input.TextFieldDecorator r49, @m80.l androidx.compose.foundation.ScrollState r50, @m80.l androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, x00.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$24(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@k final TextFieldSelectionState textFieldSelectionState, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1991581797);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i12, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:501)");
            }
            boolean changed = startRestartGroup.changed(textFieldSelectionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new x00.a<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getCursorHandleState$foundation_release(false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            if (TextFieldCursorHandle$lambda$12((State) rememberedValue).getVisible()) {
                startRestartGroup.startReplaceGroup(-311835217);
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo1028provideF1C5BW0() {
                            return TextFieldSelectionState.this.getCursorHandleState$foundation_release(true).m1341getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                Modifier.Companion companion = Modifier.Companion;
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                            Object cursorHandleGestures = TextFieldSelectionState.this.cursorHandleGestures(pointerInputScope, cVar);
                            return cursorHandleGestures == kotlin.coroutines.intrinsics.b.l() ? cursorHandleGestures : g2.f100423a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                AndroidCursorHandle_androidKt.m1022CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) rememberedValue3), MinTouchTargetSizeForHandles, startRestartGroup, 384, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-311451778);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    BasicTextFieldKt.TextFieldCursorHandle(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$12(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandles(@k final TextFieldSelectionState textFieldSelectionState, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(2025287684);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i12, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:522)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new x00.a<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            if (TextFieldSelectionHandles$lambda$16(state).getVisible()) {
                startRestartGroup.startReplaceGroup(-1348757769);
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1028provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, true).m1341getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$16(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$16(state).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.Companion;
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                            Object selectionHandleGestures = TextFieldSelectionState.this.selectionHandleGestures(pointerInputScope, true, cVar);
                            return selectionHandleGestures == kotlin.coroutines.intrinsics.b.l() ? selectionHandleGestures : g2.f100423a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                AndroidSelectionHandles_androidKt.m1430SelectionHandlewLIcFTc(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$16(state).getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (PointerInputEventHandler) rememberedValue3), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1348106211);
                startRestartGroup.endReplaceGroup();
            }
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new x00.a<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            State state2 = (State) rememberedValue4;
            if (TextFieldSelectionHandles$lambda$20(state2).getVisible()) {
                startRestartGroup.startReplaceGroup(-1347810502);
                boolean changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1028provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, true).m1341getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) rememberedValue5;
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$20(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$20(state2).getHandlesCrossed();
                Modifier.Companion companion3 = Modifier.Companion;
                boolean changedInstance4 = startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                            Object selectionHandleGestures = TextFieldSelectionState.this.selectionHandleGestures(pointerInputScope, false, cVar);
                            return selectionHandleGestures == kotlin.coroutines.intrinsics.b.l() ? selectionHandleGestures : g2.f100423a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                AndroidSelectionHandles_androidKt.m1430SelectionHandlewLIcFTc(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, TextFieldSelectionHandles$lambda$20(state2).getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion3, textFieldSelectionState, (PointerInputEventHandler) rememberedValue6), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1347161827);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    BasicTextFieldKt.TextFieldSelectionHandles(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$16(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$20(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x04df, code lost:
    
        if (r3 == r17.getEmpty()) goto L323;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0251  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@m80.k final androidx.compose.foundation.text.input.TextFieldState r49, @m80.l androidx.compose.ui.Modifier r50, boolean r51, boolean r52, @m80.l androidx.compose.foundation.text.input.InputTransformation r53, @m80.l androidx.compose.ui.text.TextStyle r54, @m80.l androidx.compose.foundation.text.KeyboardOptions r55, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r56, @m80.l androidx.compose.foundation.text.input.TextFieldLineLimits r57, @m80.l x00.p<? super androidx.compose.ui.unit.Density, ? super x00.a<androidx.compose.ui.text.TextLayoutResult>, yz.g2> r58, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r59, @m80.l androidx.compose.ui.graphics.Brush r60, @m80.l androidx.compose.foundation.text.input.internal.CodepointTransformation r61, @m80.l androidx.compose.foundation.text.input.OutputTransformation r62, @m80.l androidx.compose.foundation.text.input.TextFieldDecorator r63, @m80.l androidx.compose.foundation.ScrollState r64, boolean r65, @m80.l androidx.compose.runtime.Composer r66, final int r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, x00.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@m80.k final java.lang.String r37, @m80.k final x00.l<? super java.lang.String, yz.g2> r38, @m80.l androidx.compose.ui.Modifier r39, boolean r40, boolean r41, @m80.l androidx.compose.ui.text.TextStyle r42, @m80.l androidx.compose.foundation.text.KeyboardOptions r43, @m80.l androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, @m80.l androidx.compose.ui.text.input.VisualTransformation r48, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r49, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r50, @m80.l androidx.compose.ui.graphics.Brush r51, @m80.l x00.q<? super x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r52, @m80.l androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, x00.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0230  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(@m80.k final androidx.compose.ui.text.input.TextFieldValue r38, @m80.k final x00.l<? super androidx.compose.ui.text.input.TextFieldValue, yz.g2> r39, @m80.l androidx.compose.ui.Modifier r40, boolean r41, boolean r42, @m80.l androidx.compose.ui.text.TextStyle r43, @m80.l androidx.compose.foundation.text.KeyboardOptions r44, @m80.l androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, int r48, @m80.l androidx.compose.ui.text.input.VisualTransformation r49, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r50, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r51, @m80.l androidx.compose.ui.graphics.Brush r52, @m80.l x00.q<? super x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r53, @m80.l androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, x00.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032b  */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r36, final x00.l r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, androidx.compose.ui.text.input.VisualTransformation r46, x00.l r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.ui.graphics.Brush r49, x00.q r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, x00.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032b  */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r36, final x00.l r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, androidx.compose.ui.text.input.VisualTransformation r46, x00.l r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.ui.graphics.Brush r49, x00.q r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, x00.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
