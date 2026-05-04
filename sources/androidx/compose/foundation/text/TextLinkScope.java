package androidx.compose.foundation.text;

import a00.h0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.r0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.v0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextLinkScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,382:1\n85#2:383\n113#2,2:384\n30#3:386\n53#4,3:387\n150#5:390\n75#6:391\n34#7,4:392\n39#7:426\n34#7,6:427\n1247#8,6:396\n1247#8,6:402\n1247#8,6:408\n1247#8,6:414\n1247#8,6:420\n1247#8,6:433\n*S KotlinDebug\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n*L\n66#1:383\n66#1:384,2\n180#1:386\n180#1:387,3\n180#1:390\n216#1:391\n219#1:392,4\n219#1:426\n307#1:427,6\n221#1:396,6\n235#1:402,6\n244#1:408,6\n247#1:414,6\n257#1:420,6\n317#1:433,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextLinkScope {
    public static final int $stable = 8;

    @k
    private final AnnotatedString initialText;

    @k
    private AnnotatedString text;

    @k
    private final MutableState textLayoutResult$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @k
    private final SnapshotStateList<l<TextAnnotatorScope, g2>> annotators = SnapshotStateKt.mutableStateListOf();

    public TextLinkScope(@k AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.text = annotatedString.flatMapAnnotations(new l<AnnotatedString.Range<? extends AnnotatedString.Annotation>, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>>() { // from class: androidx.compose.foundation.text.TextLinkScope.1
            @Override // x00.l
            public final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> invoke(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
                boolean isNullOrEmpty;
                SpanStyle spanStyle;
                if (range.getItem() instanceof LinkAnnotation) {
                    AnnotatedString.Annotation item = range.getItem();
                    g0.n(item, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                    isNullOrEmpty = TextLinkScopeKt.isNullOrEmpty(((LinkAnnotation) item).getStyles());
                    if (!isNullOrEmpty) {
                        AnnotatedString.Annotation item2 = range.getItem();
                        g0.n(item2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                        TextLinkStyles styles = ((LinkAnnotation) item2).getStyles();
                        if (styles == null || (spanStyle = styles.getStyle()) == null) {
                            spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (v) null);
                        }
                        return h0.t(range, new AnnotatedString.Range(spanStyle, range.getStart(), range.getEnd()));
                    }
                }
                return h0.t(range);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public final void StyleAnnotation(final Object[] objArr, final l<? super TextAnnotatorScope, g2> lVar, Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-2083052099);
        int i12 = (i11 & 48) == 0 ? (startRestartGroup.changedInstance(lVar) ? 32 : 16) | i11 : i11;
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        startRestartGroup.startMovableGroup(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i12 |= startRestartGroup.changedInstance(obj) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083052099, i12, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            v0 v0Var = new v0(2);
            v0Var.a(lVar);
            v0Var.b(objArr);
            Object[] d11 = v0Var.d(new Object[v0Var.c()]);
            boolean changedInstance = startRestartGroup.changedInstance(this) | ((i12 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        SnapshotStateList snapshotStateList;
                        snapshotStateList = TextLinkScope.this.annotators;
                        snapshotStateList.add(lVar);
                        final TextLinkScope textLinkScope = TextLinkScope.this;
                        final l<TextAnnotatorScope, g2> lVar2 = lVar;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                SnapshotStateList snapshotStateList2;
                                snapshotStateList2 = TextLinkScope.this.annotators;
                                snapshotStateList2.remove(lVar2);
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(d11, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$2
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
                    TextLinkScope textLinkScope = TextLinkScope.this;
                    Object[] objArr2 = objArr;
                    textLinkScope.StyleAnnotation(Arrays.copyOf(objArr2, objArr2.length), lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private final AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange(AnnotatedString.Range<LinkAnnotation> range, TextLayoutResult textLayoutResult) {
        int lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult, textLayoutResult.getLineCount() - 1, false, 2, null);
        if (range.getStart() < lineEnd$default) {
            return AnnotatedString.Range.copy$default(range, null, 0, Math.min(range.getEnd(), lineEnd$default), null, 11, null);
        }
        return null;
    }

    private final Modifier clipLink(Modifier modifier, final AnnotatedString.Range<LinkAnnotation> range) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.foundation.text.TextLinkScope$clipLink$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                Shape shapeForRange;
                shapeForRange = TextLinkScope.this.shapeForRange(range);
                if (shapeForRange != null) {
                    graphicsLayerScope.setShape(shapeForRange);
                    graphicsLayerScope.setClip(true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLink(LinkAnnotation linkAnnotation, UriHandler uriHandler) {
        LinkInteractionListener linkInteractionListener;
        g2 g2Var;
        if (!(linkAnnotation instanceof LinkAnnotation.Url)) {
            if (!(linkAnnotation instanceof LinkAnnotation.Clickable) || (linkInteractionListener = linkAnnotation.getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.onClick(linkAnnotation);
            return;
        }
        LinkInteractionListener linkInteractionListener2 = linkAnnotation.getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.onClick(linkAnnotation);
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            try {
                uriHandler.openUri(((LinkAnnotation.Url) linkAnnotation).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle mergeOrUse(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle merge;
        return (spanStyle == null || (merge = spanStyle.merge(spanStyle2)) == null) ? spanStyle2 : merge;
    }

    private final Path pathForRangeInRangeCoordinates(AnnotatedString.Range<LinkAnnotation> range) {
        Path path = null;
        if (!getShouldMeasureLinks().invoke().booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResult = getTextLayoutResult();
        if (textLayoutResult != null) {
            AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange = calculateVisibleLinkRange(range, textLayoutResult);
            if (calculateVisibleLinkRange == null) {
                return null;
            }
            path = textLayoutResult.getPathForRange(calculateVisibleLinkRange.getStart(), calculateVisibleLinkRange.getEnd());
            float min = textLayoutResult.getLineForOffset(calculateVisibleLinkRange.getStart()) == textLayoutResult.getLineForOffset(calculateVisibleLinkRange.getEnd() + (-1)) ? Math.min(textLayoutResult.getBoundingBox(calculateVisibleLinkRange.getEnd() - 1).getLeft(), textLayoutResult.getBoundingBox(calculateVisibleLinkRange.getStart()).getLeft()) : 0.0f;
            path.mo2404translatek4lQ0M(Offset.m2260constructorimpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(r2.getTop()) & 4294967295L)) ^ (-9223372034707292160L)));
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Shape shapeForRange(AnnotatedString.Range<LinkAnnotation> range) {
        final Path pathForRangeInRangeCoordinates = pathForRangeInRangeCoordinates(range);
        if (pathForRangeInRangeCoordinates != null) {
            return new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo291createOutlinePq9zytI(long j11, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Generic(Path.this);
                }
            };
        }
        return null;
    }

    private final Modifier textRange(Modifier modifier, final AnnotatedString.Range<LinkAnnotation> range) {
        return modifier.then(new TextRangeLayoutModifier(new TextRangeScopeMeasurePolicy() { // from class: androidx.compose.foundation.text.c
            @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
            public final TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
                TextRangeLayoutMeasureResult textRange$lambda$0;
                textRange$lambda$0 = TextLinkScope.textRange$lambda$0(TextLinkScope.this, range, textRangeLayoutMeasureScope);
                return textRange$lambda$0;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRangeLayoutMeasureResult textRange$lambda$0(TextLinkScope textLinkScope, AnnotatedString.Range range, TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResult = textLinkScope.getTextLayoutResult();
        if (textLayoutResult == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new x00.a<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$layoutResult$1
                @Override // x00.a
                public /* bridge */ /* synthetic */ IntOffset invoke() {
                    return IntOffset.m5234boximpl(m1173invokenOccac());
                }

                /* renamed from: invoke-nOcc-ac, reason: not valid java name */
                public final long m1173invokenOccac() {
                    return IntOffset.Companion.m5254getZeronOccac();
                }
            });
        }
        AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange = textLinkScope.calculateVisibleLinkRange(range, textLayoutResult);
        if (calculateVisibleLinkRange == null) {
            return textRangeLayoutMeasureScope.layout(0, 0, new x00.a<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$updatedRange$1
                @Override // x00.a
                public /* bridge */ /* synthetic */ IntOffset invoke() {
                    return IntOffset.m5234boximpl(m1174invokenOccac());
                }

                /* renamed from: invoke-nOcc-ac, reason: not valid java name */
                public final long m1174invokenOccac() {
                    return IntOffset.Companion.m5254getZeronOccac();
                }
            });
        }
        final IntRect roundToIntRect = IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(calculateVisibleLinkRange.getStart(), calculateVisibleLinkRange.getEnd()).getBounds());
        return textRangeLayoutMeasureScope.layout(roundToIntRect.getWidth(), roundToIntRect.getHeight(), new x00.a<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ IntOffset invoke() {
                return IntOffset.m5234boximpl(m1172invokenOccac());
            }

            /* renamed from: invoke-nOcc-ac, reason: not valid java name */
            public final long m1172invokenOccac() {
                return IntRect.this.m5272getTopLeftnOccac();
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void LinksComposables(@m80.l Composer composer, final int i11) {
        int i12;
        boolean isNullOrEmpty;
        Composer startRestartGroup = composer.startRestartGroup(1154651354);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = 1;
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154651354, i12, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final UriHandler uriHandler = (UriHandler) startRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            AnnotatedString annotatedString = this.text;
            List<AnnotatedString.Range<LinkAnnotation>> linkAnnotations = annotatedString.getLinkAnnotations(0, annotatedString.length());
            int size = linkAnnotations.size();
            int i14 = 0;
            while (i14 < size) {
                final AnnotatedString.Range<LinkAnnotation> range = linkAnnotations.get(i14);
                if (range.getStart() != range.getEnd()) {
                    startRestartGroup.startReplaceGroup(1386075176);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(textRange(SemanticsModifierKt.semantics$default(clipLink(Modifier.Companion, range), false, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1
                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getLinkTestMarker(), g2.f100423a);
                        }
                    }, i13, null), range), mutableInteractionSource, false, 2, null), PointerIcon.Companion.getHand(), false, 2, null);
                    boolean changedInstance = startRestartGroup.changedInstance(this) | startRestartGroup.changed(range) | startRestartGroup.changedInstance(uriHandler);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new x00.a<g2>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // x00.a
                            public /* bridge */ /* synthetic */ g2 invoke() {
                                invoke2();
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                TextLinkScope.this.handleLink(range.getItem(), uriHandler);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    BoxKt.Box(ClickableKt.m273combinedClickableauXiCPI$default(pointerHoverIcon$default, mutableInteractionSource, null, false, null, null, null, null, null, false, (x00.a) rememberedValue2, TypedValues.PositionType.TYPE_CURVE_FIT, null), startRestartGroup, 0);
                    isNullOrEmpty = TextLinkScopeKt.isNullOrEmpty(range.getItem().getStyles());
                    if (isNullOrEmpty) {
                        startRestartGroup.startReplaceGroup(1388926990);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1386898319);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new LinkStateInteractionSourceObserver(mutableInteractionSource);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        final LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) rememberedValue3;
                        g2 g2Var = g2.f100423a;
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == companion.getEmpty()) {
                            rememberedValue4 = new TextLinkScope$LinksComposables$1$3$1(linkStateInteractionSourceObserver, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        EffectsKt.LaunchedEffect(g2Var, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue4, startRestartGroup, 6);
                        Boolean valueOf = Boolean.valueOf(linkStateInteractionSourceObserver.isHovered());
                        Boolean valueOf2 = Boolean.valueOf(linkStateInteractionSourceObserver.isFocused());
                        Boolean valueOf3 = Boolean.valueOf(linkStateInteractionSourceObserver.isPressed());
                        TextLinkStyles styles = range.getItem().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        TextLinkStyles styles2 = range.getItem().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        TextLinkStyles styles3 = range.getItem().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        TextLinkStyles styles4 = range.getItem().getStyles();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean changedInstance2 = startRestartGroup.changedInstance(this) | startRestartGroup.changed(range);
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                            rememberedValue5 = new l<TextAnnotatorScope, g2>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(TextAnnotatorScope textAnnotatorScope) {
                                    invoke2(textAnnotatorScope);
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(TextAnnotatorScope textAnnotatorScope) {
                                    SpanStyle mergeOrUse;
                                    SpanStyle mergeOrUse2;
                                    SpanStyle mergeOrUse3;
                                    TextLinkStyles styles5;
                                    TextLinkStyles styles6;
                                    TextLinkStyles styles7;
                                    TextLinkScope textLinkScope = TextLinkScope.this;
                                    TextLinkStyles styles8 = range.getItem().getStyles();
                                    SpanStyle spanStyle = null;
                                    mergeOrUse = textLinkScope.mergeOrUse(styles8 != null ? styles8.getStyle() : null, (!linkStateInteractionSourceObserver.isFocused() || (styles7 = range.getItem().getStyles()) == null) ? null : styles7.getFocusedStyle());
                                    mergeOrUse2 = textLinkScope.mergeOrUse(mergeOrUse, (!linkStateInteractionSourceObserver.isHovered() || (styles6 = range.getItem().getStyles()) == null) ? null : styles6.getHoveredStyle());
                                    if (linkStateInteractionSourceObserver.isPressed() && (styles5 = range.getItem().getStyles()) != null) {
                                        spanStyle = styles5.getPressedStyle();
                                    }
                                    mergeOrUse3 = textLinkScope.mergeOrUse(mergeOrUse2, spanStyle);
                                    textAnnotatorScope.replaceStyle(range, mergeOrUse3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        StyleAnnotation(objArr, (l) rememberedValue5, startRestartGroup, (i12 << 6) & 896);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1388940878);
                    startRestartGroup.endReplaceGroup();
                }
                i14++;
                i13 = 1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i15) {
                    TextLinkScope.this.LinksComposables(composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @k
    public final AnnotatedString applyAnnotators$foundation_release() {
        AnnotatedString styledText;
        if (this.annotators.isEmpty()) {
            styledText = this.text;
        } else {
            TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(this.text);
            SnapshotStateList<l<TextAnnotatorScope, g2>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i11 = 0; i11 < size; i11++) {
                snapshotStateList.get(i11).invoke(textAnnotatorScope);
            }
            styledText = textAnnotatorScope.getStyledText();
        }
        this.text = styledText;
        return styledText;
    }

    @k
    public final AnnotatedString getInitialText$foundation_release() {
        return this.initialText;
    }

    @k
    public final x00.a<Boolean> getShouldMeasureLinks() {
        return new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.TextLinkScope$shouldMeasureLinks$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                TextLayoutInput layoutInput;
                AnnotatedString text$foundation_release = TextLinkScope.this.getText$foundation_release();
                TextLayoutResult textLayoutResult = TextLinkScope.this.getTextLayoutResult();
                return Boolean.valueOf(g0.g(text$foundation_release, (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null) ? null : layoutInput.getText()));
            }
        };
    }

    @k
    public final AnnotatedString getText$foundation_release() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public final TextLayoutResult getTextLayoutResult() {
        return (TextLayoutResult) this.textLayoutResult$delegate.getValue();
    }

    public final void setText$foundation_release(@k AnnotatedString annotatedString) {
        this.text = annotatedString;
    }

    public final void setTextLayoutResult(@m80.l TextLayoutResult textLayoutResult) {
        this.textLayoutResult$delegate.setValue(textLayoutResult);
    }
}
