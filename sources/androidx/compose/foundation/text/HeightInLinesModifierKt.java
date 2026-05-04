package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,130:1\n110#2:131\n96#3,5:132\n96#3,5:137\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n56#1:131\n123#1:132,5\n126#1:137,5\n*E\n"})
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    @k
    public static final Modifier heightInLines(@k Modifier modifier, @k final TextStyle textStyle, final int i11, final int i12) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i11));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i12));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i13) {
                composer.startReplaceGroup(408240218);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i13, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i11, i12);
                if (i11 == 1 && i12 == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.Companion;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                boolean changed = composer.changed(textStyle) | composer.changed(layoutDirection);
                TextStyle textStyle2 = textStyle;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(rememberedValue);
                }
                TextStyle textStyle3 = (TextStyle) rememberedValue;
                boolean changed2 = composer.changed(resolver) | composer.changed(textStyle3);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.Companion.getNormal();
                    }
                    FontStyle m4591getFontStyle4Lr2A7w = textStyle3.m4591getFontStyle4Lr2A7w();
                    int m4673unboximpl = m4591getFontStyle4Lr2A7w != null ? m4591getFontStyle4Lr2A7w.m4673unboximpl() : FontStyle.Companion.m4677getNormal_LCdwA();
                    FontSynthesis m4592getFontSynthesisZQGJjVo = textStyle3.m4592getFontSynthesisZQGJjVo();
                    rememberedValue2 = resolver.mo4643resolveDPcqOEQ(fontFamily, fontWeight, m4673unboximpl, m4592getFontSynthesisZQGJjVo != null ? m4592getFontSynthesisZQGJjVo.m4686unboximpl() : FontSynthesis.Companion.m4687getAllGVVA2EU());
                    composer.updateRememberedValue(rememberedValue2);
                }
                State state = (State) rememberedValue2;
                boolean changed3 = composer.changed(state.getValue()) | composer.changed(density) | composer.changed(resolver) | composer.changed(textStyle) | composer.changed(layoutDirection);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1) & 4294967295L));
                    composer.updateRememberedValue(rememberedValue3);
                }
                int intValue = ((Number) rememberedValue3).intValue();
                boolean changed4 = composer.changed(layoutDirection) | composer.changed(density) | composer.changed(resolver) | composer.changed(textStyle) | composer.changed(state.getValue());
                Object rememberedValue4 = composer.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle3, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2) & 4294967295L));
                    composer.updateRememberedValue(rememberedValue4);
                }
                int intValue2 = ((Number) rememberedValue4).intValue() - intValue;
                int i14 = i11;
                Integer valueOf = i14 == 1 ? null : Integer.valueOf(((i14 - 1) * intValue2) + intValue);
                int i15 = i12;
                Integer valueOf2 = i15 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i15 - 1))) : null;
                Modifier m760heightInVpY3zN4 = SizeKt.m760heightInVpY3zN4(Modifier.Companion, valueOf != null ? density.mo374toDpu2uoSUM(valueOf.intValue()) : Dp.Companion.m5135getUnspecifiedD9Ej5fM(), valueOf2 != null ? density.mo374toDpu2uoSUM(valueOf2.intValue()) : Dp.Companion.m5135getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m760heightInVpY3zN4;
            }
        });
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 1;
        }
        if ((i13 & 4) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i11, i12);
    }

    public static final void validateMinMaxLines(int i11, int i12) {
        if (!(i11 > 0 && i12 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("both minLines " + i11 + " and maxLines " + i12 + " must be greater than zero");
        }
        if (i11 <= i12) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines " + i11 + " must be less than or equal to maxLines " + i12);
    }
}
