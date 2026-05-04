package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,473:1\n1#2:474\n26#3:475\n26#3:476\n54#4:477\n54#4:479\n59#4:481\n59#4:483\n54#4:485\n59#4:487\n54#4:497\n59#4:499\n85#5:478\n85#5:480\n90#5:482\n90#5:484\n85#5:486\n90#5:488\n85#5:498\n90#5:500\n107#6,7:489\n233#7:496\n635#8:501\n635#8:502\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n369#1:475\n370#1:476\n377#1:477\n378#1:479\n379#1:481\n380#1:483\n384#1:485\n384#1:487\n427#1:497\n428#1:499\n377#1:478\n378#1:480\n379#1:482\n380#1:484\n384#1:486\n384#1:488\n427#1:498\n428#1:500\n420#1:489,7\n424#1:496\n450#1:501\n452#1:502\n*E\n"})
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @l
    private ParagraphLayoutCache _layoutCache;

    @l
    private Map<AlignmentLine, Integer> baselineCache;

    @k
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;

    @l
    private ColorProducer overrideColor;

    @l
    private x00.l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;

    @k
    private TextStyle style;

    @k
    private String text;

    @l
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, ColorProducer colorProducer, v vVar) {
        this(str, textStyle, resolver, i11, z11, i12, i13, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearSubstitution() {
        this.textSubstitution = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        g0.m(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache getLayoutCacheForMeasure(IntrinsicMeasureScope intrinsicMeasureScope) {
        ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
        layoutCacheOrSubstitute.setDensity$foundation_release(intrinsicMeasureScope);
        return layoutCacheOrSubstitute;
    }

    @j(name = "getLayoutCacheOrSubstitute")
    private final ParagraphLayoutCache getLayoutCacheOrSubstitute() {
        ParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (!textSubstitutionValue.isShowingSubstitution()) {
                textSubstitutionValue = null;
            }
            if (textSubstitutionValue != null && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return getLayoutCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(String str) {
        g2 g2Var;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, str, false, null, 12, null);
            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            paragraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
            textSubstitutionValue2.setLayoutCache(paragraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (g0.g(str, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.setSubstitution(str);
        ParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m1422updateL6sJoHM(str, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        return g2Var != null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        x00.l lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new x00.l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(List<TextLayoutResult> list) {
                    ParagraphLayoutCache layoutCache;
                    TextStyle textStyle;
                    ColorProducer colorProducer;
                    TextStyle m4604mergedA7vx0o;
                    layoutCache = TextStringSimpleNode.this.getLayoutCache();
                    textStyle = TextStringSimpleNode.this.style;
                    colorProducer = TextStringSimpleNode.this.overrideColor;
                    m4604mergedA7vx0o = textStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : colorProducer != null ? colorProducer.mo1642invoke0d7_KjU() : Color.Companion.m2545getUnspecified0d7_KjU(), (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : null, (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
                    TextLayoutResult slowCreateTextLayoutResultOrNull = layoutCache.slowCreateTextLayoutResultOrNull(m4604mergedA7vx0o);
                    if (slowCreateTextLayoutResultOrNull != null) {
                        list.add(slowCreateTextLayoutResultOrNull);
                    } else {
                        slowCreateTextLayoutResultOrNull = null;
                    }
                    return Boolean.valueOf(slowCreateTextLayoutResultOrNull != null);
                }
            };
            this.semanticsTextLayoutResult = lVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, 2, null));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, new AnnotatedString(textSubstitutionValue.getSubstitution(), null, 2, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$2
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextStringSimpleNode.this.setSubstitution(annotatedString.getText());
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new x00.l<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z11) {
                TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2;
                TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue3;
                textSubstitutionValue2 = TextStringSimpleNode.this.textSubstitution;
                if (textSubstitutionValue2 == null) {
                    return Boolean.FALSE;
                }
                textSubstitutionValue3 = TextStringSimpleNode.this.textSubstitution;
                if (textSubstitutionValue3 != null) {
                    textSubstitutionValue3.setShowingSubstitution(z11);
                }
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                TextStringSimpleNode.this.clearSubstitution();
                TextStringSimpleNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, lVar, 1, null);
    }

    public final void doInvalidations(boolean z11, boolean z12, boolean z13) {
        if (z12 || z13) {
            getLayoutCache().m1422updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (isAttached()) {
            if (z12 || (z11 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z12 || z13) {
                LayoutModifierNodeKt.invalidateMeasurement(this);
                DrawModifierNodeKt.invalidateDraw(this);
            }
            if (z11) {
                DrawModifierNodeKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@k ContentDrawScope contentDrawScope) {
        if (isAttached()) {
            ParagraphLayoutCache layoutCacheOrSubstitute = getLayoutCacheOrSubstitute();
            Paragraph paragraph$foundation_release = layoutCacheOrSubstitute.getParagraph$foundation_release();
            if (paragraph$foundation_release == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
                throw new KotlinNothingValueException();
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = layoutCacheOrSubstitute.getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                float m1418getLayoutSizeYbymL2g$foundation_release = (int) (layoutCacheOrSubstitute.m1418getLayoutSizeYbymL2g$foundation_release() >> 32);
                float m1418getLayoutSizeYbymL2g$foundation_release2 = (int) (layoutCacheOrSubstitute.m1418getLayoutSizeYbymL2g$foundation_release() & 4294967295L);
                canvas.save();
                Canvas.m2481clipRectN_I0leg$default(canvas, 0.0f, 0.0f, m1418getLayoutSizeYbymL2g$foundation_release, m1418getLayoutSizeYbymL2g$foundation_release2, 0, 16, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    Paragraph.m4419painthn5TExg$default(paragraph$foundation_release, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long mo1642invoke0d7_KjU = colorProducer != null ? colorProducer.mo1642invoke0d7_KjU() : Color.Companion.m2545getUnspecified0d7_KjU();
                    if (mo1642invoke0d7_KjU == 16) {
                        mo1642invoke0d7_KjU = this.style.m4589getColor0d7_KjU() != 16 ? this.style.m4589getColor0d7_KjU() : Color.Companion.m2535getBlack0d7_KjU();
                    }
                    Paragraph.m4417paintLG529CI$default(paragraph$foundation_release, canvas, mo1642invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
            } catch (Throwable th2) {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
                throw th2;
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i11, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        ParagraphLayoutCache layoutCacheForMeasure = getLayoutCacheForMeasure(measureScope);
        boolean m1420layoutWithConstraintsK40F9xA = layoutCacheForMeasure.m1420layoutWithConstraintsK40F9xA(j11, measureScope.getLayoutDirection());
        layoutCacheForMeasure.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = layoutCacheForMeasure.getParagraph$foundation_release();
        g0.m(paragraph$foundation_release);
        long m1418getLayoutSizeYbymL2g$foundation_release = layoutCacheForMeasure.m1418getLayoutSizeYbymL2g$foundation_release();
        if (m1420layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map map = this.baselineCache;
            if (map == null) {
                map = new HashMap(2);
                this.baselineCache = map;
            }
            map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getFirstBaseline())));
            map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(paragraph$foundation_release.getLastBaseline())));
        }
        int i11 = (int) (m1418getLayoutSizeYbymL2g$foundation_release >> 32);
        int i12 = (int) (m1418getLayoutSizeYbymL2g$foundation_release & 4294967295L);
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA(i11, i11, i12, i12));
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        g0.m(map2);
        return measureScope.layout(i11, i12, map2, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).intrinsicHeight(i11, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCacheForMeasure(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final boolean updateDraw(@l ColorProducer colorProducer, @k TextStyle textStyle) {
        boolean g11 = g0.g(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (g11 && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m1429updateLayoutRelatedArgsHuAbxIM(@k TextStyle textStyle, int i11, int i12, boolean z11, @k FontFamily.Resolver resolver, int i13) {
        boolean z12 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (this.minLines != i11) {
            this.minLines = i11;
            z12 = true;
        }
        if (this.maxLines != i12) {
            this.maxLines = i12;
            z12 = true;
        }
        if (this.softWrap != z11) {
            this.softWrap = z11;
            z12 = true;
        }
        if (!g0.g(this.fontFamilyResolver, resolver)) {
            this.fontFamilyResolver = resolver;
            z12 = true;
        }
        if (TextOverflow.m5019equalsimpl0(this.overflow, i13)) {
            return z12;
        }
        this.overflow = i13;
        return true;
    }

    public final boolean updateText(@k String str) {
        if (g0.g(this.text, str)) {
            return false;
        }
        this.text = str;
        clearSubstitution();
        return true;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, ColorProducer colorProducer, int i14, v vVar) {
        this(str, textStyle, resolver, (i14 & 8) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 16) != 0 ? true : z11, (i14 & 32) != 0 ? Integer.MAX_VALUE : i12, (i14 & 64) != 0 ? 1 : i13, (i14 & 128) != 0 ? null : colorProducer, null);
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i11, boolean z11, int i12, int i13, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.overrideColor = colorProducer;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;

        @l
        private ParagraphLayoutCache layoutCache;

        @k
        private final String original;

        @k
        private String substitution;

        public TextSubstitutionValue(@k String str, @k String str2, boolean z11, @l ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z11;
            this.layoutCache = paragraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, String str, String str2, boolean z11, ParagraphLayoutCache paragraphLayoutCache, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textSubstitutionValue.original;
            }
            if ((i11 & 2) != 0) {
                str2 = textSubstitutionValue.substitution;
            }
            if ((i11 & 4) != 0) {
                z11 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i11 & 8) != 0) {
                paragraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(str, str2, z11, paragraphLayoutCache);
        }

        @k
        public final String component1() {
            return this.original;
        }

        @k
        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        @l
        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        @k
        public final TextSubstitutionValue copy(@k String str, @k String str2, boolean z11, @l ParagraphLayoutCache paragraphLayoutCache) {
            return new TextSubstitutionValue(str, str2, z11, paragraphLayoutCache);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return g0.g(this.original, textSubstitutionValue.original) && g0.g(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && g0.g(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        @l
        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @k
        public final String getOriginal() {
            return this.original;
        }

        @k
        public final String getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int hashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return hashCode + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(@l ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z11) {
            this.isShowingSubstitution = z11;
        }

        public final void setSubstitution(@k String str) {
            this.substitution = str;
        }

        @k
        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitutionValue(String str, String str2, boolean z11, ParagraphLayoutCache paragraphLayoutCache, int i11, v vVar) {
            this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : paragraphLayoutCache);
        }
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }
}
