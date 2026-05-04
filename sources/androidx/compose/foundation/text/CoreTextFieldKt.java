package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import c40.r0;
import c40.s0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1129:1\n1247#2,6:1130\n1247#2,6:1136\n1247#2,6:1142\n1247#2,6:1154\n1247#2,3:1160\n1250#2,3:1164\n1247#2,6:1167\n1247#2,6:1173\n1247#2,3:1186\n1250#2,3:1190\n1247#2,6:1193\n1247#2,6:1199\n1247#2,6:1208\n1247#2,6:1214\n1247#2,6:1220\n1247#2,6:1226\n1247#2,6:1232\n1247#2,6:1238\n1247#2,6:1244\n1247#2,6:1250\n1247#2,6:1256\n1247#2,6:1263\n1247#2,6:1312\n1247#2,6:1319\n1247#2,6:1325\n1247#2,6:1331\n75#3:1148\n75#3:1149\n75#3:1150\n75#3:1151\n75#3:1152\n75#3:1153\n75#3:1205\n75#3:1206\n75#3:1207\n75#3:1262\n75#3:1318\n1#4:1163\n557#5:1179\n554#5,6:1180\n555#6:1189\n70#7:1269\n67#7,9:1270\n77#7:1309\n79#8,6:1279\n86#8,3:1294\n89#8,2:1303\n93#8:1308\n347#9,9:1285\n356#9,3:1305\n4206#10,6:1297\n59#11:1310\n90#12:1311\n602#13,8:1337\n85#14:1345\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n206#1:1130,6\n207#1:1136,6\n208#1:1142,6\n225#1:1154,6\n239#1:1160,3\n239#1:1164,3\n253#1:1167,6\n282#1:1173,6\n285#1:1186,3\n285#1:1190,3\n286#1:1193,6\n288#1:1199,6\n308#1:1208,6\n344#1:1214,6\n370#1:1220,6\n371#1:1226,6\n400#1:1232,6\n418#1:1238,6\n471#1:1244,6\n473#1:1250,6\n505#1:1256,6\n524#1:1263,6\n1068#1:1312,6\n1071#1:1319,6\n1073#1:1325,6\n1085#1:1331,6\n213#1:1148\n214#1:1149\n215#1:1150\n216#1:1151\n217#1:1152\n218#1:1153\n294#1:1205\n296#1:1206\n297#1:1207\n522#1:1262\n1069#1:1318\n285#1:1179\n285#1:1180,6\n285#1:1189\n670#1:1269\n670#1:1270,9\n670#1:1309\n670#1:1279,6\n670#1:1294,3\n670#1:1303,2\n670#1:1308\n670#1:1285,9\n670#1:1305,3\n670#1:1297,6\n1012#1:1310\n1012#1:1311\n1114#1:1337,8\n343#1:1345\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03fe, code lost:
    
        if (r14 == r5.getEmpty()) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x08a1, code lost:
    
        if (r6 == r5.getEmpty()) goto L438;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0861 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c4  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CoreTextField(@m80.k final androidx.compose.ui.text.input.TextFieldValue r48, @m80.k final x00.l<? super androidx.compose.ui.text.input.TextFieldValue, yz.g2> r49, @m80.l androidx.compose.ui.Modifier r50, @m80.l androidx.compose.ui.text.TextStyle r51, @m80.l androidx.compose.ui.text.input.VisualTransformation r52, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r53, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r54, @m80.l androidx.compose.ui.graphics.Brush r55, boolean r56, int r57, int r58, @m80.l androidx.compose.ui.text.input.ImeOptions r59, @m80.l androidx.compose.foundation.text.KeyboardActions r60, boolean r61, boolean r62, @m80.l x00.q<? super x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r63, @m80.l androidx.compose.foundation.text.TextFieldScrollerPosition r64, @m80.l androidx.compose.runtime.Composer r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, x00.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, x00.q, androidx.compose.foundation.text.TextFieldScrollerPosition, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, i12, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, pVar, startRestartGroup, (i12 >> 3) & 126);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z11, Composer composer, final int i11) {
        int i12;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i12, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
            }
            if (z11) {
                startRestartGroup.startReplaceGroup(-1290924834);
                LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
                TextLayoutResult textLayoutResult = null;
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
                    if (!(state$foundation_release2 != null ? state$foundation_release2.isLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    startRestartGroup.startReplaceGroup(-1290601288);
                } else {
                    startRestartGroup.startReplaceGroup(-1290601287);
                    if (TextRange.m4553getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE())) {
                        startRestartGroup.startReplaceGroup(-1684179174);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1685230508);
                        int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4559getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE()));
                        int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4554getEndimpl(textFieldSelectionManager.getValue$foundation_release().m4807getSelectiond9O1mEE()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                        LegacyTextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                        if (state$foundation_release3 == null || !state$foundation_release3.getShowSelectionHandleStart()) {
                            startRestartGroup.startReplaceGroup(-1684548198);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1684812473);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, ((i12 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                        if (state$foundation_release4 == null || !state$foundation_release4.getShowSelectionHandleEnd()) {
                            startRestartGroup.startReplaceGroup(-1684200998);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1684464312);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, ((i12 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                            state$foundation_release5.setShowFloatingToolbar(false);
                        }
                        if (state$foundation_release5.getHasFocus()) {
                            if (state$foundation_release5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                            }
                        }
                        g2 g2Var = g2.f100423a;
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(651160447);
                startRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
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
                    CoreTextFieldKt.SelectionToolbarAndHandles(TextFieldSelectionManager.this, z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@k final TextFieldSelectionManager textFieldSelectionManager, @l Composer composer, final int i11) {
        int i12;
        AnnotatedString transformedText$foundation_release;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i12, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)");
            }
            LegacyTextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
            if (state$foundation_release == null || !state$foundation_release.getShowCursorHandle() || (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) == null || transformedText$foundation_release.length() <= 0) {
                startRestartGroup.startReplaceGroup(-288632802);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-289940723);
                boolean changed = startRestartGroup.changed(textFieldSelectionManager);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                final long m1505getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m1505getCursorPositiontuRUvjQ$foundation_release((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                boolean changed2 = startRestartGroup.changed(m1505getCursorPositiontuRUvjQ$foundation_release);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1028provideF1C5BW0() {
                            return m1505getCursorPositiontuRUvjQ$foundation_release;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                Modifier.Companion companion = Modifier.Companion;
                boolean changedInstance = startRestartGroup.changedInstance(textDragObserver) | startRestartGroup.changedInstance(textFieldSelectionManager);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                        @d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ TextDragObserver $observer;
                            final /* synthetic */ PointerInputScope $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            @d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", i = {}, l = {1078}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            public static final class C00591 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                                final /* synthetic */ TextDragObserver $observer;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C00591(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, j00.c<? super C00591> cVar) {
                                    super(2, cVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = textDragObserver;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                                    return new C00591(this.$this_pointerInput, this.$observer, cVar);
                                }

                                @Override // x00.p
                                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                                    return ((C00591) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                                    int i11 = this.label;
                                    if (i11 == 0) {
                                        e.n(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        TextDragObserver textDragObserver = this.$observer;
                                        this.label = 1;
                                        if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == l11) {
                                            return l11;
                                        }
                                    } else {
                                        if (i11 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        e.n(obj);
                                    }
                                    return g2.f100423a;
                                }
                            }

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            @d(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", i = {}, l = {1081}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            public static final class AnonymousClass2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, j00.c<? super AnonymousClass2> cVar) {
                                    super(2, cVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$manager = textFieldSelectionManager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, cVar);
                                }

                                @Override // x00.p
                                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                                    return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                                    int i11 = this.label;
                                    if (i11 == 0) {
                                        e.n(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                        x00.l<Offset, g2> lVar = new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.2.1.1.2.1
                                            {
                                                super(1);
                                            }

                                            @Override // x00.l
                                            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                                                m1048invokek4lQ0M(offset.m2278unboximpl());
                                                return g2.f100423a;
                                            }

                                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                            public final void m1048invokek4lQ0M(long j11) {
                                                TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                                            }
                                        };
                                        this.label = 1;
                                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, lVar, this, 7, null) == l11) {
                                            return l11;
                                        }
                                    } else {
                                        if (i11 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        e.n(obj);
                                    }
                                    return g2.f100423a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, j00.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$this_pointerInput = pointerInputScope;
                                this.$observer = textDragObserver;
                                this.$manager = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$observer, this.$manager, cVar);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // x00.p
                            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                                return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                kotlin.coroutines.intrinsics.b.l();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                e.n(obj);
                                r0 r0Var = (r0) this.L$0;
                                CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                                c40.k.f(r0Var, null, coroutineStart, new C00591(this.$this_pointerInput, this.$observer, null), 1, null);
                                c40.k.f(r0Var, null, coroutineStart, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1, null);
                                return g2.f100423a;
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                            Object g11 = s0.g(new AnonymousClass1(pointerInputScope, TextDragObserver.this, textFieldSelectionManager, null), cVar);
                            return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) rememberedValue3);
                boolean changed3 = startRestartGroup.changed(m1505getCursorPositiontuRUvjQ$foundation_release);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m1505getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                AndroidCursorHandle_androidKt.m1022CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(pointerInput, false, (x00.l) rememberedValue4, 1, null), 0L, startRestartGroup, 0, 4);
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$4
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
                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @l
    public static final Object bringSelectionEndIntoView(@k BringIntoViewRequester bringIntoViewRequester, @k TextFieldValue textFieldValue, @k TextDelegate textDelegate, @k TextLayoutResult textLayoutResult, @k OffsetMapping offsetMapping, @k j00.c<? super g2> cVar) {
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()));
        Object bringIntoView = bringIntoViewRequester.bringIntoView(originalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(originalToTransformed) : originalToTransformed != 0 ? textLayoutResult.getBoundingBox(originalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L)), cVar);
        return bringIntoView == kotlin.coroutines.intrinsics.b.l() ? bringIntoView : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
            g2 g2Var = g2.f100423a;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new x00.l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1049invokeZmokQxo(keyEvent.m3577unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1049invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z11;
                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m1051cancelsTextSelectionZmokQxo(keyEvent)) {
                    z11 = true;
                    TextFieldSelectionManager.m1500deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    public static final void tapToFocus(@k LegacyTextFieldState legacyTextFieldState, @k FocusRequester focusRequester, boolean z11) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            FocusRequester.m2179requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        } else {
            if (!z11 || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }
}
