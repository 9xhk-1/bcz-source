package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import x00.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,381:1\n1247#2,6:382\n708#3:388\n696#3:389\n708#3:390\n696#3:391\n149#4:392\n149#4:393\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:382,6\n118#1:388\n118#1:389\n123#1:390\n123#1:391\n379#1:392\n380#1:393\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @k
    public static final String LabelId = "Label";

    @k
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @k
    public static final String PlaceholderId = "Hint";

    @k
    public static final String TextFieldId = "TextField";

    @k
    public static final String TrailingId = "Trailing";
    private static final float TextFieldPadding = Dp.m5115constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m5115constructorimpl(12);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(@k final TextFieldType textFieldType, @k final String str, @k final p<? super Composer, ? super Integer, g2> pVar, @k final VisualTransformation visualTransformation, @l final p<? super Composer, ? super Integer, g2> pVar2, @l final p<? super Composer, ? super Integer, g2> pVar3, @l final p<? super Composer, ? super Integer, g2> pVar4, @l final p<? super Composer, ? super Integer, g2> pVar5, final boolean z11, final boolean z12, final boolean z13, @k final InteractionSource interactionSource, @k final PaddingValues paddingValues, @k final Shape shape, @k final TextFieldColors textFieldColors, @l final p<? super Composer, ? super Integer, g2> pVar6, @l Composer composer, final int i11, final int i12) {
        TextFieldType textFieldType2;
        int i13;
        p<? super Composer, ? super Integer, g2> pVar7;
        int i14;
        int i15;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(341783750);
        if ((i11 & 6) == 0) {
            textFieldType2 = textFieldType;
            i13 = (startRestartGroup.changed(textFieldType2) ? 4 : 2) | i11;
        } else {
            textFieldType2 = textFieldType;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            pVar7 = pVar;
            i13 |= startRestartGroup.changedInstance(pVar7) ? 256 : 128;
        } else {
            pVar7 = pVar;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar2) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 = 196608;
            i13 |= startRestartGroup.changedInstance(pVar3) ? 131072 : 65536;
        } else {
            i14 = 196608;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar4) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar5) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= startRestartGroup.changed(z11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= startRestartGroup.changed(z12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (startRestartGroup.changed(z13) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i15 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= startRestartGroup.changed(textFieldColors) ? 16384 : 8192;
        }
        if ((i12 & i14) == 0) {
            i15 |= startRestartGroup.changedInstance(pVar6) ? 131072 : 65536;
        }
        int i16 = i15;
        if (startRestartGroup.shouldExecute(((i13 & 306783379) == 306783378 && (74899 & i16) == 74898) ? false : true, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(341783750, i13, i16, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z14 = ((i13 & 112) == 32) | ((i13 & 7168) == 2048);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z14 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final String text = ((TransformedText) rememberedValue).getText().getText();
            InputPhase inputPhase = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i16 >> 3) & 14).getValue().booleanValue() ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            q<InputPhase, Composer, Integer, Color> qVar = new q<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // x00.q
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer3, Integer num) {
                    return Color.m2499boximpl(m1838invokeXeAY9LY(inputPhase2, composer3, num.intValue()));
                }

                @Composable
                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1838invokeXeAY9LY(InputPhase inputPhase2, Composer composer3, int i17) {
                    composer3.startReplaceGroup(-1272940975);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1272940975, i17, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
                    }
                    long m2519unboximpl = TextFieldColors.this.labelColor(z12, inputPhase2 == InputPhase.UnfocusedEmpty ? false : z13, interactionSource, composer3, 0).getValue().m2519unboximpl();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return m2519unboximpl;
                }
            };
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(startRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long m4589getColor0d7_KjU = subtitle1.m4589getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            boolean z15 = (Color.m2510equalsimpl0(m4589getColor0d7_KjU, companion.m2545getUnspecified0d7_KjU()) && !Color.m2510equalsimpl0(caption.m4589getColor0d7_KjU(), companion.m2545getUnspecified0d7_KjU())) || (!Color.m2510equalsimpl0(subtitle1.m4589getColor0d7_KjU(), companion.m2545getUnspecified0d7_KjU()) && Color.m2510equalsimpl0(caption.m4589getColor0d7_KjU(), companion.m2545getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceGroup(1578866909);
            long m4589getColor0d7_KjU2 = materialTheme.getTypography(startRestartGroup, 6).getCaption().m4589getColor0d7_KjU();
            if (z15) {
                startRestartGroup.startReplaceGroup(-1572812364);
                if (m4589getColor0d7_KjU2 == 16) {
                    m4589getColor0d7_KjU2 = qVar.invoke(inputPhase, startRestartGroup, 0).m2519unboximpl();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(780549965);
                startRestartGroup.endReplaceGroup();
            }
            long j11 = m4589getColor0d7_KjU2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1578874175);
            long m4589getColor0d7_KjU3 = materialTheme.getTypography(startRestartGroup, 6).getSubtitle1().m4589getColor0d7_KjU();
            if (z15) {
                startRestartGroup.startReplaceGroup(-1572585196);
                if (m4589getColor0d7_KjU3 == 16) {
                    m4589getColor0d7_KjU3 = qVar.invoke(inputPhase, startRestartGroup, 0).m2519unboximpl();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(780557293);
                startRestartGroup.endReplaceGroup();
            }
            long j12 = m4589getColor0d7_KjU3;
            startRestartGroup.endReplaceGroup();
            boolean z16 = pVar2 != null;
            final boolean z17 = z15;
            final TextFieldType textFieldType3 = textFieldType2;
            final p<? super Composer, ? super Integer, g2> pVar8 = pVar7;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(225557475, true, new t<Float, Color, Color, Float, Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        try {
                            iArr[TextFieldType.Filled.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TextFieldType.Outlined.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // x00.t
                public /* bridge */ /* synthetic */ g2 invoke(Float f11, Color color, Color color2, Float f12, Composer composer3, Integer num) {
                    m1836invokeRIQooxk(f11.floatValue(), color.m2519unboximpl(), color2.m2519unboximpl(), f12.floatValue(), composer3, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m1836invokeRIQooxk(float f11, long j13, final long j14, final float f12, Composer composer3, int i17) {
                    int i18;
                    long j15;
                    int i19;
                    ComposableLambda composableLambda;
                    ComposableLambda composableLambda2;
                    ComposableLambda composableLambda3;
                    final float f13 = f11;
                    if ((i17 & 6) == 0) {
                        i18 = (composer3.changed(f13) ? 4 : 2) | i17;
                    } else {
                        i18 = i17;
                    }
                    if ((i17 & 48) == 0) {
                        j15 = j13;
                        i18 |= composer3.changed(j15) ? 32 : 16;
                    } else {
                        j15 = j13;
                    }
                    if ((i17 & 384) == 0) {
                        i18 |= composer3.changed(j14) ? 256 : 128;
                    }
                    if ((i17 & 3072) == 0) {
                        i18 |= composer3.changed(f12) ? 2048 : 1024;
                    }
                    int i21 = i18;
                    if (!composer3.shouldExecute((i21 & 9363) != 9362, i21 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(225557475, i21, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
                    }
                    final p<Composer, Integer, g2> pVar9 = pVar2;
                    ComposableLambda composableLambda4 = null;
                    if (pVar9 == null) {
                        composer3.startReplaceGroup(-1572254148);
                        composer3.endReplaceGroup();
                        i19 = 54;
                    } else {
                        composer3.startReplaceGroup(-1572254147);
                        final boolean z18 = z17;
                        i19 = 54;
                        final long j16 = j15;
                        p<Composer, Integer, g2> pVar10 = new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // x00.p
                            public /* bridge */ /* synthetic */ g2 invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return g2.f100423a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer4, int i22) {
                                if (!composer4.shouldExecute((i22 & 3) != 2, i22 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1865025495, i22, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                                }
                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                TextStyle lerp = TextStyleKt.lerp(materialTheme2.getTypography(composer4, 6).getSubtitle1(), materialTheme2.getTypography(composer4, 6).getCaption(), f13);
                                boolean z19 = z18;
                                long j17 = j16;
                                if (z19) {
                                    lerp = TextStyle.m4572copyp1EtxEg$default(lerp, j17, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                }
                                TextFieldImplKt.m1835DecorationeuL9pac(j14, lerp, null, pVar9, composer4, 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        };
                        f13 = f13;
                        composableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1865025495, true, pVar10, composer3, 54);
                        composer3.endReplaceGroup();
                    }
                    ComposableLambda composableLambda5 = composableLambda4;
                    if (pVar3 == null || text.length() != 0 || f12 <= 0.0f) {
                        composer3.startReplaceGroup(-1570844268);
                        composer3.endReplaceGroup();
                        composableLambda = null;
                    } else {
                        composer3.startReplaceGroup(-1571270300);
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        final boolean z19 = z12;
                        final p<Composer, Integer, g2> pVar11 = pVar3;
                        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-413527723, true, new q<Modifier, Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // x00.q
                            public /* bridge */ /* synthetic */ g2 invoke(Modifier modifier, Composer composer4, Integer num) {
                                invoke(modifier, composer4, num.intValue());
                                return g2.f100423a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Modifier modifier, Composer composer4, int i22) {
                                if ((i22 & 6) == 0) {
                                    i22 |= composer4.changed(modifier) ? 4 : 2;
                                }
                                if (!composer4.shouldExecute((i22 & 19) != 18, i22 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-413527723, i22, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                                }
                                Modifier alpha = AlphaKt.alpha(modifier, f12);
                                TextFieldColors textFieldColors3 = textFieldColors2;
                                boolean z21 = z19;
                                p<Composer, Integer, g2> pVar12 = pVar11;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, alpha);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                a<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer4);
                                Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                TextFieldImplKt.m1835DecorationeuL9pac(textFieldColors3.placeholderColor(z21, composer4, 0).getValue().m2519unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, pVar12, composer4, 0, 4);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, i19);
                        composer3.endReplaceGroup();
                        composableLambda = rememberComposableLambda2;
                    }
                    final long m2519unboximpl = textFieldColors.leadingIconColor(z12, z13, interactionSource, composer3, 0).getValue().m2519unboximpl();
                    final p<Composer, Integer, g2> pVar12 = pVar4;
                    if (pVar12 == null) {
                        composer3.startReplaceGroup(-1570655509);
                        composer3.endReplaceGroup();
                        composableLambda2 = null;
                    } else {
                        composer3.startReplaceGroup(-1570655508);
                        ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1165144581, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // x00.p
                            public /* bridge */ /* synthetic */ g2 invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return g2.f100423a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer4, int i22) {
                                if (!composer4.shouldExecute((i22 & 3) != 2, i22 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1165144581, i22, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                                }
                                TextFieldImplKt.m1835DecorationeuL9pac(m2519unboximpl, null, null, pVar12, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, i19);
                        composer3.endReplaceGroup();
                        composableLambda2 = rememberComposableLambda3;
                    }
                    final long m2519unboximpl2 = textFieldColors.trailingIconColor(z12, z13, interactionSource, composer3, 0).getValue().m2519unboximpl();
                    final p<Composer, Integer, g2> pVar13 = pVar5;
                    if (pVar13 == null) {
                        composer3.startReplaceGroup(-1570361846);
                        composer3.endReplaceGroup();
                        composableLambda3 = null;
                    } else {
                        composer3.startReplaceGroup(-1570361845);
                        ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1694126319, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // x00.p
                            public /* bridge */ /* synthetic */ g2 invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return g2.f100423a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer4, int i22) {
                                if (!composer4.shouldExecute((i22 & 3) != 2, i22 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1694126319, i22, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                                }
                                TextFieldImplKt.m1835DecorationeuL9pac(m2519unboximpl2, null, null, pVar13, composer4, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, i19);
                        composer3.endReplaceGroup();
                        composableLambda3 = rememberComposableLambda4;
                    }
                    Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(Modifier.Companion, textFieldColors.backgroundColor(z12, composer3, 0).getValue().m2519unboximpl(), shape);
                    int i22 = WhenMappings.$EnumSwitchMapping$0[textFieldType3.ordinal()];
                    if (i22 == 1) {
                        composer3.startReplaceGroup(-1570081481);
                        TextFieldKt.TextFieldLayout(m234backgroundbw27NRU, pVar8, composableLambda5, composableLambda, composableLambda2, composableLambda3, z11, f11, paddingValues, composer3, (i21 << 21) & 29360128);
                        composer3.endReplaceGroup();
                    } else if (i22 != 2) {
                        composer3.startReplaceGroup(-1568043975);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1569502122);
                        Object rememberedValue2 = composer3.rememberedValue();
                        Composer.Companion companion2 = Composer.Companion;
                        if (rememberedValue2 == companion2.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(Size.Companion.m2346getZeroNHjbRc()), null, 2, null);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue2;
                        final PaddingValues paddingValues2 = paddingValues;
                        final p<Composer, Integer, g2> pVar14 = pVar6;
                        ComposableLambda rememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(-1212965554, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // x00.p
                            public /* bridge */ /* synthetic */ g2 invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return g2.f100423a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer4, int i23) {
                                if (!composer4.shouldExecute((i23 & 3) != 2, i23 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1212965554, i23, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                                }
                                Modifier m1721outlineCutout12SF9DM = OutlinedTextFieldKt.m1721outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.Companion, OutlinedTextFieldKt.BorderId), mutableState.getValue().m2342unboximpl(), paddingValues2);
                                p<Composer, Integer, g2> pVar15 = pVar14;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m1721outlineCutout12SF9DM);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                a<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer4);
                                Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (pVar15 == null) {
                                    composer4.startReplaceGroup(720285106);
                                } else {
                                    composer4.startReplaceGroup(-392406993);
                                    pVar15.invoke(composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, i19);
                        p<Composer, Integer, g2> pVar15 = pVar8;
                        boolean z21 = z11;
                        boolean z22 = (i21 & 14) == 4;
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (z22 || rememberedValue3 == companion2.getEmpty()) {
                            rememberedValue3 = new x00.l<Size, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(Size size) {
                                    m1837invokeuvyYCjk(size.m2342unboximpl());
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                public final void m1837invokeuvyYCjk(long j17) {
                                    float m2337getWidthimpl = Size.m2337getWidthimpl(j17) * f13;
                                    float m2334getHeightimpl = Size.m2334getHeightimpl(j17) * f13;
                                    if (Size.m2337getWidthimpl(mutableState.getValue().m2342unboximpl()) == m2337getWidthimpl && Size.m2334getHeightimpl(mutableState.getValue().m2342unboximpl()) == m2334getHeightimpl) {
                                        return;
                                    }
                                    mutableState.setValue(Size.m2325boximpl(SizeKt.Size(m2337getWidthimpl, m2334getHeightimpl)));
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        OutlinedTextFieldKt.OutlinedTextFieldLayout(m234backgroundbw27NRU, pVar15, composableLambda, composableLambda5, composableLambda2, composableLambda3, z21, f13, (x00.l) rememberedValue3, rememberComposableLambda5, paddingValues, composer3, 805306368 | ((i21 << 21) & 29360128), 0);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            composer2 = startRestartGroup;
            textFieldTransitionScope.m1843TransitionDTcfvLk(inputPhase, j11, j12, qVar, z16, rememberComposableLambda, composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer3, int i17) {
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.this, str, pVar, visualTransformation, pVar2, pVar3, pVar4, pVar5, z11, z12, z13, interactionSource, paddingValues, shape, textFieldColors, pVar6, composer3, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    @Composable
    @ComposableOpenTarget(index = 0)
    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m1835DecorationeuL9pac(final long j11, @l TextStyle textStyle, @l Float f11, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        final TextStyle textStyle2;
        final Float f12;
        Composer startRestartGroup = composer.startRestartGroup(-399493340);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(j11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(f11) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            TextStyle textStyle3 = i14 != 0 ? null : textStyle;
            final Float f13 = i15 != 0 ? null : f11;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399493340, i13, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(494684590, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                @Composable
                public final void invoke(Composer composer2, int i16) {
                    if (!composer2.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(494684590, i16, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                    }
                    ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(j11));
                    final Float f14 = f13;
                    final p<Composer, Integer, g2> pVar2 = pVar;
                    final long j12 = j11;
                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1132188434, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return g2.f100423a;
                        }

                        @Composable
                        public final void invoke(Composer composer3, int i17) {
                            if (!composer3.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1132188434, i17, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                            }
                            if (f14 != null) {
                                composer3.startReplaceGroup(-1177895124);
                                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f14), pVar2, composer3, ProvidedValue.$stable);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1177696538);
                                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2511getAlphaimpl(j12))), pVar2, composer3, ProvidedValue.$stable);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            if (textStyle3 != null) {
                startRestartGroup.startReplaceGroup(2115981348);
                TextKt.ProvideTextStyle(textStyle3, rememberComposableLambda, startRestartGroup, ((i13 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceGroup(2115982984);
                rememberComposableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f12 = f13;
        } else {
            startRestartGroup.skipToGroupEnd();
            textStyle2 = textStyle;
            f12 = f11;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

                public final void invoke(Composer composer2, int i16) {
                    TextFieldImplKt.m1835DecorationeuL9pac(j11, textStyle2, f12, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    @k
    public static final Modifier defaultErrorSemantics(@k Modifier modifier, boolean z11, @k final String str) {
        return z11 ? SemanticsModifierKt.semantics$default(modifier, false, new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
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
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @l
    public static final Object getLayoutId(@k IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final int heightOrZero(@l Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@l Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
