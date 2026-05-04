package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,405:1\n75#2:406\n75#2:407\n75#2:408\n75#2:417\n75#2:418\n75#2:419\n75#2:420\n75#2:429\n75#2:430\n696#3:409\n696#3:410\n696#3:421\n696#3:422\n1247#4,6:411\n1247#4,6:423\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material/TextKt\n*L\n110#1:406\n129#1:407\n130#1:408\n184#1:417\n283#1:418\n302#1:419\n303#1:420\n359#1:429\n402#1:430\n132#1:409\n134#1:410\n305#1:421\n307#1:422\n159#1:411,6\n333#1:423,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextKt {

    @k
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new a<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final TextStyle invoke() {
            return TypographyKt.getDefaultTextStyle();
        }
    });

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(@k final TextStyle textStyle, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i12, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(textStyle)), pVar, startRestartGroup, (i12 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
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
                    TextKt.ProvideTextStyle(TextStyle.this, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0443  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1845Text4IGK_g(@m80.k final java.lang.String r67, @m80.l androidx.compose.ui.Modifier r68, long r69, long r71, @m80.l androidx.compose.ui.text.font.FontStyle r73, @m80.l androidx.compose.ui.text.font.FontWeight r74, @m80.l androidx.compose.ui.text.font.FontFamily r75, long r76, @m80.l androidx.compose.ui.text.style.TextDecoration r78, @m80.l androidx.compose.ui.text.style.TextAlign r79, long r80, int r82, boolean r83, int r84, int r85, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r86, @m80.l androidx.compose.ui.text.TextStyle r87, @m80.l androidx.compose.runtime.Composer r88, final int r89, final int r90, final int r91) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1845Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, x00.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1846TextIbK3jfQ(@m80.k final androidx.compose.ui.text.AnnotatedString r60, @m80.l androidx.compose.ui.Modifier r61, long r62, long r64, @m80.l androidx.compose.ui.text.font.FontStyle r66, @m80.l androidx.compose.ui.text.font.FontWeight r67, @m80.l androidx.compose.ui.text.font.FontFamily r68, long r69, @m80.l androidx.compose.ui.text.style.TextDecoration r71, @m80.l androidx.compose.ui.text.style.TextAlign r72, long r73, int r75, boolean r76, int r77, int r78, @m80.l java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r79, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r80, @m80.l androidx.compose.ui.text.TextStyle r81, @m80.l androidx.compose.runtime.Composer r82, final int r83, final int r84, final int r85) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1846TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, x00.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1847TextfLXpl1I(final java.lang.String r43, androidx.compose.ui.Modifier r44, long r45, long r47, androidx.compose.ui.text.font.FontStyle r49, androidx.compose.ui.text.font.FontWeight r50, androidx.compose.ui.text.font.FontFamily r51, long r52, androidx.compose.ui.text.style.TextDecoration r54, androidx.compose.ui.text.style.TextAlign r55, long r56, int r58, boolean r59, int r60, x00.l r61, androidx.compose.ui.text.TextStyle r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1847TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, x00.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @k
    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1844Text4IGK_g(final androidx.compose.ui.text.AnnotatedString r44, androidx.compose.ui.Modifier r45, long r46, long r48, androidx.compose.ui.text.font.FontStyle r50, androidx.compose.ui.text.font.FontWeight r51, androidx.compose.ui.text.font.FontFamily r52, long r53, androidx.compose.ui.text.style.TextDecoration r55, androidx.compose.ui.text.style.TextAlign r56, long r57, int r59, boolean r60, int r61, java.util.Map r62, x00.l r63, androidx.compose.ui.text.TextStyle r64, androidx.compose.runtime.Composer r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1844Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, x00.l, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
