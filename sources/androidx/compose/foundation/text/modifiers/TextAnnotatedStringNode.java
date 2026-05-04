package androidx.compose.foundation.text.modifiers;

import a00.h0;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,588:1\n1#2:589\n26#3:590\n26#3:591\n54#4:592\n54#4:594\n59#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:605\n59#4:607\n85#5:593\n85#5:595\n90#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:606\n90#5:608\n53#5,3:610\n233#6:604\n33#7:609\n635#8:613\n635#8:614\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n437#1:590\n438#1:591\n449#1:592\n450#1:594\n451#1:596\n452#1:598\n456#1:600\n456#1:602\n528#1:605\n529#1:607\n449#1:593\n450#1:595\n451#1:597\n452#1:599\n456#1:601\n456#1:603\n528#1:606\n529#1:608\n530#1:610,3\n522#1:604\n530#1:609\n552#1:613\n554#1:614\n*E\n"})
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @l
    private MultiParagraphLayoutCache _layoutCache;

    @l
    private TextAutoSize autoSize;

    @l
    private Map<AlignmentLine, Integer> baselineCache;

    @k
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;

    @l
    private x00.l<? super List<Rect>, g2> onPlaceholderLayout;

    @l
    private x00.l<? super TextSubstitutionValue, g2> onShowTranslation;

    @l
    private x00.l<? super TextLayoutResult, g2> onTextLayout;
    private int overflow;

    @l
    private ColorProducer overrideColor;

    @l
    private List<AnnotatedString.Range<Placeholder>> placeholders;

    @l
    private SelectionController selectionController;

    @l
    private x00.l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;

    @k
    private TextStyle style;

    @k
    private AnnotatedString text;

    @l
    private TextSubstitutionValue textSubstitution;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l lVar3, v vVar) {
        this(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, selectionController, colorProducer, textAutoSize, lVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        g0.m(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setSubstitution(AnnotatedString annotatedString) {
        g2 g2Var;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, annotatedString, false, null, 12, null);
            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, h0.J(), this.autoSize, null);
            multiParagraphLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
            textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (g0.g(annotatedString, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.setSubstitution(annotatedString);
        MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.m1411updateJ2qo7bo(annotatedString, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, h0.J(), this.autoSize);
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
            lVar = new x00.l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00bc  */
                @Override // x00.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.TextLayoutResult> r38) {
                    /*
                        r37 = this;
                        r0 = r37
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.foundation.text.modifiers.MultiParagraphLayoutCache r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getLayoutCache(r1)
                        androidx.compose.ui.text.TextLayoutResult r2 = r1.getLayoutOrNull()
                        if (r2 == 0) goto Lb7
                        androidx.compose.ui.text.TextLayoutInput r3 = new androidx.compose.ui.text.TextLayoutInput
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.AnnotatedString r4 = r1.getText()
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getStyle$p(r1)
                        androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.this
                        androidx.compose.ui.graphics.ColorProducer r1 = androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.access$getOverrideColor$p(r1)
                        if (r1 == 0) goto L2b
                        long r6 = r1.mo1642invoke0d7_KjU()
                        goto L31
                    L2b:
                        androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.ui.graphics.Color.Companion
                        long r6 = r1.m2545getUnspecified0d7_KjU()
                    L31:
                        r35 = 16777214(0xfffffe, float:2.3509884E-38)
                        r36 = 0
                        r8 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r29 = 0
                        r30 = 0
                        r31 = 0
                        r32 = 0
                        r33 = 0
                        r34 = 0
                        androidx.compose.ui.text.TextStyle r5 = androidx.compose.ui.text.TextStyle.m4579mergedA7vx0o$default(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        java.util.List r6 = r1.getPlaceholders()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r7 = r1.getMaxLines()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        boolean r8 = r1.getSoftWrap()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        int r9 = r1.m4526getOverflowgIe3tQ8()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.Density r10 = r1.getDensity()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.unit.LayoutDirection r11 = r1.getLayoutDirection()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        androidx.compose.ui.text.font.FontFamily$Resolver r12 = r1.getFontFamilyResolver()
                        androidx.compose.ui.text.TextLayoutInput r1 = r2.getLayoutInput()
                        long r13 = r1.m4525getConstraintsmsEJaDk()
                        r15 = 0
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                        r6 = 2
                        r7 = 0
                        r4 = 0
                        androidx.compose.ui.text.TextLayoutResult r1 = androidx.compose.ui.text.TextLayoutResult.m4527copyO0kMr_c$default(r2, r3, r4, r6, r7)
                        if (r1 == 0) goto Lb7
                        r2 = r38
                        r2.add(r1)
                        goto Lb8
                    Lb7:
                        r1 = 0
                    Lb8:
                        if (r1 == 0) goto Lbc
                        r1 = 1
                        goto Lbd
                    Lbc:
                        r1 = 0
                    Lbd:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1.invoke(java.util.List):java.lang.Boolean");
                }
            };
            this.semanticsTextLayoutResult = lVar;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver, textSubstitutionValue.isShowingSubstitution());
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(AnnotatedString annotatedString) {
                TextAnnotatedStringNode.this.setSubstitution(annotatedString);
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver, null, new x00.l<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }

            public final Boolean invoke(boolean z11) {
                x00.l lVar2;
                if (TextAnnotatedStringNode.this.getTextSubstitution$foundation_release() == null) {
                    return Boolean.FALSE;
                }
                lVar2 = TextAnnotatedStringNode.this.onShowTranslation;
                if (lVar2 != null) {
                    TextAnnotatedStringNode.TextSubstitutionValue textSubstitution$foundation_release = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                    g0.m(textSubstitution$foundation_release);
                    lVar2.invoke(textSubstitution$foundation_release);
                }
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitution$foundation_release2 = TextAnnotatedStringNode.this.getTextSubstitution$foundation_release();
                if (textSubstitution$foundation_release2 != null) {
                    textSubstitution$foundation_release2.setShowingSubstitution(z11);
                }
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                TextAnnotatedStringNode.this.clearSubstitution$foundation_release();
                TextAnnotatedStringNode.this.invalidateForTranslate();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, lVar, 1, null);
    }

    public final void clearSubstitution$foundation_release() {
        this.textSubstitution = null;
    }

    public final void doInvalidations(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (z12 || z13 || z14) {
            getLayoutCache().m1411updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (isAttached()) {
            if (z12 || (z11 && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            if (z12 || z13 || z14) {
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
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.draw(contentDrawScope);
            }
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            TextLayoutResult textLayoutResult = getLayoutCache(contentDrawScope).getTextLayoutResult();
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            boolean z11 = true;
            boolean z12 = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m5019equalsimpl0(this.overflow, TextOverflow.Companion.m5032getVisiblegIe3tQ8());
            if (z12) {
                Rect m2308Recttz77jQw = RectKt.m2308Recttz77jQw(Offset.Companion.m2284getZeroF1C5BW0(), Size.m2328constructorimpl((Float.floatToRawIntBits((int) (textLayoutResult.m4530getSizeYbymL2g() >> 32)) << 32) | (Float.floatToRawIntBits((int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L)) & 4294967295L)));
                canvas.save();
                Canvas.m2482clipRectmtrdDE$default(canvas, m2308Recttz77jQw, 0, 2, null);
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
                    MultiParagraph.m4408painthn5TExg$default(multiParagraph, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long mo1642invoke0d7_KjU = colorProducer != null ? colorProducer.mo1642invoke0d7_KjU() : Color.Companion.m2545getUnspecified0d7_KjU();
                    if (mo1642invoke0d7_KjU == 16) {
                        mo1642invoke0d7_KjU = this.style.m4589getColor0d7_KjU() != 16 ? this.style.m4589getColor0d7_KjU() : Color.Companion.m2535getBlack0d7_KjU();
                    }
                    multiParagraph.m4413paintLG529CI(canvas, (r14 & 2) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : mo1642invoke0d7_KjU, (r14 & 4) != 0 ? null : shadow2, (r14 & 8) != 0 ? null : textDecoration2, (r14 & 16) == 0 ? drawStyle2 : null, (r14 & 32) != 0 ? DrawScope.Companion.m3062getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z12) {
                    canvas.restore();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.isShowingSubstitution()) ? TextAnnotatedStringNodeKt.hasLinks(this.text) : false)) {
                    List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z11 = false;
                    }
                    if (z11) {
                        return;
                    }
                }
                contentDrawScope.drawContent();
            } catch (Throwable th2) {
                if (z12) {
                    canvas.restore();
                }
                throw th2;
            }
        }
    }

    public final void drawNonExtension(@k ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @l
    public final TextSubstitutionValue getTextSubstitution$foundation_release() {
        return this.textSubstitution;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i11, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
        boolean m1410layoutWithConstraintsK40F9xA = layoutCache.m1410layoutWithConstraintsK40F9xA(j11, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m1410layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            x00.l<? super TextLayoutResult, g2> lVar = this.onTextLayout;
            if (lVar != null) {
                lVar.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            Map<AlignmentLine, Integer> map = this.baselineCache;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResult.getFirstBaseline())));
            map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResult.getLastBaseline())));
            this.baselineCache = map;
        }
        x00.l<? super List<Rect>, g2> lVar2 = this.onPlaceholderLayout;
        if (lVar2 != null) {
            lVar2.invoke(textLayoutResult.getPlaceholderRects());
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA((int) (textLayoutResult.m4530getSizeYbymL2g() >> 32), (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32), (int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L), (int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L)));
        int m4530getSizeYbymL2g = (int) (textLayoutResult.m4530getSizeYbymL2g() >> 32);
        int m4530getSizeYbymL2g2 = (int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L);
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        g0.m(map2);
        return measureScope.layout(m4530getSizeYbymL2g, m4530getSizeYbymL2g2, map2, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
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

    @k
    /* renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m1427measureNonExtension3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        return mo61measure3p2s80s(measureScope, measurable, j11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i11, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    public final void setTextSubstitution$foundation_release(@l TextSubstitutionValue textSubstitutionValue) {
        this.textSubstitution = textSubstitutionValue;
    }

    public final boolean updateCallbacks(@l x00.l<? super TextLayoutResult, g2> lVar, @l x00.l<? super List<Rect>, g2> lVar2, @l SelectionController selectionController, @l x00.l<? super TextSubstitutionValue, g2> lVar3) {
        boolean z11;
        if (this.onTextLayout != lVar) {
            this.onTextLayout = lVar;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.onPlaceholderLayout != lVar2) {
            this.onPlaceholderLayout = lVar2;
            z11 = true;
        }
        if (!g0.g(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z11 = true;
        }
        if (this.onShowTranslation == lVar3) {
            return z11;
        }
        this.onShowTranslation = lVar3;
        return true;
    }

    public final boolean updateDraw(@l ColorProducer colorProducer, @k TextStyle textStyle) {
        boolean g11 = g0.g(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        return (g11 && textStyle.hasSameDrawAffectingAttributes(this.style)) ? false : true;
    }

    /* renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m1428updateLayoutRelatedArgsy0kMQk(@k TextStyle textStyle, @l List<AnnotatedString.Range<Placeholder>> list, int i11, int i12, boolean z11, @k FontFamily.Resolver resolver, int i13, @l TextAutoSize textAutoSize) {
        boolean z12 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!g0.g(this.placeholders, list)) {
            this.placeholders = list;
            z12 = true;
        }
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
        if (!TextOverflow.m5019equalsimpl0(this.overflow, i13)) {
            this.overflow = i13;
            z12 = true;
        }
        if (g0.g(this.autoSize, textAutoSize)) {
            return z12;
        }
        this.autoSize = textAutoSize;
        return true;
    }

    public final boolean updateText$foundation_release(@k AnnotatedString annotatedString) {
        boolean g11 = g0.g(this.text.getText(), annotatedString.getText());
        boolean z11 = (g11 && this.text.hasEqualAnnotations(annotatedString)) ? false : true;
        if (z11) {
            this.text = annotatedString;
        }
        if (!g11) {
            clearSubstitution$foundation_release();
        }
        return z11;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l lVar, int i11, boolean z11, int i12, int i13, List list, x00.l lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l lVar3, int i14, v vVar) {
        this(annotatedString, textStyle, resolver, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? TextOverflow.Companion.m5028getClipgIe3tQ8() : i11, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? Integer.MAX_VALUE : i12, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : lVar2, (i14 & 1024) != 0 ? null : selectionController, (i14 & 2048) != 0 ? null : colorProducer, (i14 & 4096) != 0 ? null : textAutoSize, (i14 & 8192) != 0 ? null : lVar3, null);
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, x00.l<? super TextLayoutResult, g2> lVar, int i11, boolean z11, int i12, int i13, List<AnnotatedString.Range<Placeholder>> list, x00.l<? super List<Rect>, g2> lVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, x00.l<? super TextSubstitutionValue, g2> lVar3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = lVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = lVar3;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        private boolean isShowingSubstitution;

        @l
        private MultiParagraphLayoutCache layoutCache;

        @k
        private final AnnotatedString original;

        @k
        private AnnotatedString substitution;

        public TextSubstitutionValue(@k AnnotatedString annotatedString, @k AnnotatedString annotatedString2, boolean z11, @l MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z11;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue textSubstitutionValue, AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z11, MultiParagraphLayoutCache multiParagraphLayoutCache, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                annotatedString = textSubstitutionValue.original;
            }
            if ((i11 & 2) != 0) {
                annotatedString2 = textSubstitutionValue.substitution;
            }
            if ((i11 & 4) != 0) {
                z11 = textSubstitutionValue.isShowingSubstitution;
            }
            if ((i11 & 8) != 0) {
                multiParagraphLayoutCache = textSubstitutionValue.layoutCache;
            }
            return textSubstitutionValue.copy(annotatedString, annotatedString2, z11, multiParagraphLayoutCache);
        }

        @k
        public final AnnotatedString component1() {
            return this.original;
        }

        @k
        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        @l
        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        @k
        public final TextSubstitutionValue copy(@k AnnotatedString annotatedString, @k AnnotatedString annotatedString2, boolean z11, @l MultiParagraphLayoutCache multiParagraphLayoutCache) {
            return new TextSubstitutionValue(annotatedString, annotatedString2, z11, multiParagraphLayoutCache);
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
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        @k
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        @k
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public int hashCode() {
            int hashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return hashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(@l MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z11) {
            this.isShowingSubstitution = z11;
        }

        public final void setSubstitution(@k AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        @k
        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z11, MultiParagraphLayoutCache multiParagraphLayoutCache, int i11, v vVar) {
            this(annotatedString, annotatedString2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation_release(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation_release(density);
        return layoutCache2;
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }
}
