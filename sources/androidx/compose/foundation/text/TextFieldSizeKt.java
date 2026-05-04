package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    @k
    public static final Modifier textFieldMinSize(@k Modifier modifier, @k final TextStyle textStyle) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(1582736677);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582736677, i11, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                boolean changed = composer.changed(TextStyle.this) | composer.changed(layoutDirection);
                TextStyle textStyle2 = TextStyle.this;
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
                TextStyle textStyle4 = TextStyle.this;
                Object rememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new TextFieldSize(layoutDirection, density, resolver, textStyle4, state.getValue());
                    composer.updateRememberedValue(rememberedValue3);
                }
                final TextFieldSize textFieldSize = (TextFieldSize) rememberedValue3;
                textFieldSize.update(layoutDirection, density, resolver, textStyle3, state.getValue());
                Modifier.Companion companion2 = Modifier.Companion;
                boolean changedInstance = composer.changedInstance(textFieldSize);
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1
                        {
                            super(3);
                        }

                        @Override // x00.q
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m1161invoke3p2s80s(measureScope, measurable, constraints.m5074unboximpl());
                        }

                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m1161invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                            long m1160getMinSizeYbymL2g = TextFieldSize.this.m1160getMinSizeYbymL2g();
                            final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, u.I((int) (m1160getMinSizeYbymL2g >> 32), Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11)), 0, u.I((int) (m1160getMinSizeYbymL2g & 4294967295L), Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11)), 0, 10, null));
                            return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1.1
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                Modifier layout = LayoutModifierKt.layout(companion2, (q) rememberedValue4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return layout;
            }
        }, 1, null);
    }
}
