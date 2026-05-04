package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,373:1\n1247#2,6:374\n1247#2,6:380\n1247#2,6:386\n1247#2,6:392\n1247#2,6:399\n75#3:398\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/BasicSecureTextFieldKt\n*L\n136#1:374,6\n137#1:380,6\n148#1:386,6\n155#1:392,6\n309#1:399,6\n307#1:398\n*E\n"})
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use the overload that takes in readOnly parameter.")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1025BasicSecureTextFieldJb9bMDk(final androidx.compose.foundation.text.input.TextFieldState r36, androidx.compose.ui.Modifier r37, boolean r38, androidx.compose.foundation.text.input.InputTransformation r39, androidx.compose.ui.text.TextStyle r40, androidx.compose.foundation.text.KeyboardOptions r41, androidx.compose.foundation.text.input.KeyboardActionHandler r42, x00.p r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.ui.graphics.Brush r45, androidx.compose.foundation.text.input.TextFieldDecorator r46, int r47, char r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.m1025BasicSecureTextFieldJb9bMDk(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, x00.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: BasicSecureTextField-egD4TGM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1026BasicSecureTextFieldegD4TGM(@m80.k final androidx.compose.foundation.text.input.TextFieldState r34, @m80.l androidx.compose.ui.Modifier r35, boolean r36, boolean r37, @m80.l androidx.compose.foundation.text.input.InputTransformation r38, @m80.l androidx.compose.ui.text.TextStyle r39, @m80.l androidx.compose.foundation.text.KeyboardOptions r40, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r41, @m80.l x00.p<? super androidx.compose.ui.unit.Density, ? super x00.a<androidx.compose.ui.text.TextLayoutResult>, yz.g2> r42, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r43, @m80.l androidx.compose.ui.graphics.Brush r44, @m80.l androidx.compose.foundation.text.input.TextFieldDecorator r45, int r46, char r47, @m80.l androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.m1026BasicSecureTextFieldegD4TGM(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, x00.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_egD4TGM$lambda$4$lambda$3(State state, int i11, int i12) {
        return ((Character) state.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableCutCopy(final p<? super Composer, ? super Integer, g2> pVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1085555050);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, i12, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:305)");
            }
            final TextToolbar textToolbar = (TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            boolean changed = startRestartGroup.changed(textToolbar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    {
                        this.$$delegate_0 = TextToolbar.this;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, x00.a<g2> aVar, x00.a<g2> aVar2, x00.a<g2> aVar3, x00.a<g2> aVar4) {
                        this.$$delegate_0.showMenu(rect, aVar, aVar2, aVar3, aVar4);
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, x00.a<g2> aVar, x00.a<g2> aVar2, x00.a<g2> aVar3, x00.a<g2> aVar4, x00.a<g2> aVar5) {
                        TextToolbar.this.showMenu(rect, null, aVar2, null, aVar4, aVar5);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) rememberedValue), pVar, startRestartGroup, ((i12 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$1
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
                    BasicSecureTextFieldKt.DisableCutCopy(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }
}
