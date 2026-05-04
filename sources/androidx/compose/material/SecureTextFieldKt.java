package androidx.compose.material;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecureTextField.kt\nandroidx/compose/material/SecureTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n75#2:312\n75#2:321\n75#2:330\n1247#3,6:313\n1247#3,6:322\n708#4:319\n696#4:320\n708#4:328\n696#4:329\n1#5:331\n*S KotlinDebug\n*F\n+ 1 SecureTextField.kt\nandroidx/compose/material/SecureTextFieldKt\n*L\n108#1:312\n231#1:321\n252#1:330\n124#1:313,6\n247#1:322,6\n126#1:319\n126#1:320\n249#1:328\n249#1:329\n*E\n"})
/* loaded from: classes.dex */
public final class SecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;

    @k
    private static final KeyboardOptions SecureTextFieldKeyboardOptions = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m4797getPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (v) null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0242  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: OutlinedSecureTextField-0vce7ms, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1756OutlinedSecureTextField0vce7ms(@m80.k final androidx.compose.foundation.text.input.TextFieldState r69, @m80.l androidx.compose.ui.Modifier r70, boolean r71, @m80.l androidx.compose.ui.text.TextStyle r72, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r73, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r74, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r75, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r76, boolean r77, @m80.l androidx.compose.foundation.text.input.InputTransformation r78, int r79, char r80, @m80.l androidx.compose.foundation.text.KeyboardOptions r81, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r82, @m80.l androidx.compose.ui.graphics.Shape r83, @m80.l androidx.compose.material.TextFieldColors r84, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r85, @m80.l androidx.compose.runtime.Composer r86, final int r87, final int r88, final int r89) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SecureTextFieldKt.m1756OutlinedSecureTextField0vce7ms(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.foundation.text.input.InputTransformation, int, char, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0245  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SecureTextField-0vce7ms, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1757SecureTextField0vce7ms(@m80.k final androidx.compose.foundation.text.input.TextFieldState r70, @m80.l androidx.compose.ui.Modifier r71, boolean r72, @m80.l androidx.compose.ui.text.TextStyle r73, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r74, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r75, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r76, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r77, boolean r78, @m80.l androidx.compose.foundation.text.input.InputTransformation r79, int r80, char r81, @m80.l androidx.compose.foundation.text.KeyboardOptions r82, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r83, @m80.l androidx.compose.ui.graphics.Shape r84, @m80.l androidx.compose.material.TextFieldColors r85, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r86, @m80.l androidx.compose.runtime.Composer r87, final int r88, final int r89, final int r90) {
        /*
            Method dump skipped, instructions count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SecureTextFieldKt.m1757SecureTextField0vce7ms(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.foundation.text.input.InputTransformation, int, char, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
