package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ix.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.k0;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n1#2:2304\n361#3,7:2305\n33#4,6:2312\n33#4,4:2318\n38#4:2324\n33#4,4:2331\n38#4:2377\n288#5,2:2322\n1225#6,6:2325\n149#7:2335\n149#7:2372\n71#8:2336\n68#8,6:2337\n74#8:2371\n78#8:2376\n79#9,6:2343\n86#9,4:2358\n90#9,2:2368\n94#9:2375\n368#10,9:2349\n377#10:2370\n378#10,2:2373\n4034#11,6:2362\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n*L\n1752#1:2305,7\n1989#1:2312,6\n1996#1:2318,4\n1996#1:2324\n2129#1:2331,4\n2129#1:2377\n2000#1:2322,2\n2078#1:2325,6\n2145#1:2335\n2156#1:2372\n2154#1:2336\n2154#1:2337,6\n2154#1:2371\n2154#1:2376\n2154#1:2343,6\n2154#1:2358,4\n2154#1:2368,2\n2154#1:2375\n2154#1:2349,9\n2154#1:2370\n2154#1:2373,2\n2154#1:2362,6\n*E\n"})
@v0
@n(message = "Replace with Measurer2 instead for proper Measure/Layout handling.", replaceWith = @w0(expression = "Measurer2", imports = {}))
/* loaded from: classes2.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {
    public static final int $stable = 8;

    @k
    private String computedLayoutResult = "";

    @k
    private ArrayList<ConstraintSetParser.DesignElement> designElements;
    private float forcedScaleFactor;

    @k
    private final Map<Measurable, WidgetFrame> frameCache;

    @k
    private final int[] heightConstraintsHolder;

    @k
    private final Map<String, Integer[]> lastMeasures;

    @l
    private LayoutInformationReceiver layoutInformationReceiver;

    @k
    private final Map<Measurable, Placeable> placeables;

    @k
    private final ConstraintWidgetContainer root;

    @k
    private final State state;

    @k
    private final int[] widthConstraintsHolder;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Measurer(@k Density density) {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new State(density);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    private final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* renamed from: getColor-wrIjXm8, reason: not valid java name */
    private final long m5509getColorwrIjXm8(String str, long j11) {
        if (str != null && k0.A5(str, '#', false, 2, null)) {
            String substring = str.substring(1);
            g0.o(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = "FF" + substring;
            }
            try {
                return ColorKt.Color((int) Long.parseLong(substring, 16));
            } catch (Exception unused) {
            }
        }
        return j11;
    }

    /* renamed from: getColor-wrIjXm8$default, reason: not valid java name */
    public static /* synthetic */ long m5510getColorwrIjXm8$default(Measurer measurer, String str, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i11 & 2) != 0) {
            j11 = Color.Companion.m2535getBlack0d7_KjU();
        }
        return measurer.m5509getColorwrIjXm8(str, j11);
    }

    private final TextStyle getTextStyle(HashMap<String, String> hashMap) {
        String str = hashMap.get(g.b.f62794h);
        long m5320getUnspecifiedXSAIIZE = TextUnit.Companion.m5320getUnspecifiedXSAIIZE();
        if (str != null) {
            m5320getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m5510getColorwrIjXm8$default(this, hashMap.get("color"), 0L, 2, null), m5320getUnspecifiedXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (v) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureWidget-yQShABA, reason: not valid java name */
    private final long m5511measureWidgetyQShABA(ConstraintWidget constraintWidget, long j11) {
        Object companionWidget = constraintWidget.getCompanionWidget();
        String str = constraintWidget.stringId;
        int i11 = 0;
        if (constraintWidget instanceof VirtualLayout) {
            int i12 = Constraints.m5066getHasFixedWidthimpl(j11) ? 1073741824 : Constraints.m5064getHasBoundedWidthimpl(j11) ? Integer.MIN_VALUE : 0;
            if (Constraints.m5065getHasFixedHeightimpl(j11)) {
                i11 = 1073741824;
            } else if (Constraints.m5063getHasBoundedHeightimpl(j11)) {
                i11 = Integer.MIN_VALUE;
            }
            VirtualLayout virtualLayout = (VirtualLayout) constraintWidget;
            virtualLayout.measure(i12, Constraints.m5068getMaxWidthimpl(j11), i11, Constraints.m5067getMaxHeightimpl(j11));
            return IntIntPair.m17constructorimpl(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
        if (companionWidget instanceof Measurable) {
            Placeable mo3857measureBRTryo0 = ((Measurable) companionWidget).mo3857measureBRTryo0(j11);
            this.placeables.put(companionWidget, mo3857measureBRTryo0);
            return IntIntPair.m17constructorimpl(mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return IntIntPair.m17constructorimpl(0, 0);
    }

    private final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int[] iArr) {
        int i15 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i15 == 1) {
            iArr[0] = i11;
            iArr[1] = i11;
            return false;
        }
        if (i15 == 2) {
            iArr[0] = 0;
            iArr[1] = i14;
            return true;
        }
        if (i15 == 3) {
            boolean z13 = z12 || ((i13 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i13 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (i13 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || i12 != 1 || z11));
            iArr[0] = z13 ? i11 : 0;
            if (!z13) {
                i11 = i14;
            }
            iArr[1] = i11;
            return !z13;
        }
        if (i15 == 4) {
            iArr[0] = i14;
            iArr[1] = i14;
            return false;
        }
        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
    }

    public final void addLayoutInformationReceiver(@l LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(this.computedLayoutResult);
        }
    }

    /* renamed from: applyRootSize-BRTryo0, reason: not valid java name */
    public final void m5512applyRootSizeBRTryo0(long j11) {
        this.root.setWidth(Constraints.m5068getMaxWidthimpl(j11));
        this.root.setHeight(Constraints.m5067getMaxHeightimpl(j11));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null && (layoutInformationReceiver == null || layoutInformationReceiver.getForcedWidth() != Integer.MIN_VALUE)) {
            LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
            g0.m(layoutInformationReceiver2);
            int forcedWidth = layoutInformationReceiver2.getForcedWidth();
            if (forcedWidth > this.root.getWidth()) {
                this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
            } else {
                this.forcedScaleFactor = 1.0f;
            }
            this.root.setWidth(forcedWidth);
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            if (layoutInformationReceiver3 == null || layoutInformationReceiver3.getForcedHeight() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                g0.m(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.root.getWidth() + " ,");
        sb2.append("  bottom:  " + this.root.getHeight() + " ,");
        sb2.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId != null ? layoutId.toString() : null;
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb2.append(' ' + next.stringId + ": {");
                    sb2.append(" interpolated : ");
                    widgetFrame.serialize(sb2, true);
                    sb2.append("}, ");
                }
            } else if (next instanceof Guideline) {
                sb2.append(' ' + next.stringId + ": {");
                Guideline guideline = (Guideline) next;
                if (guideline.getOrientation() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        this.computedLayoutResult = sb3;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            layoutInformationReceiver.setLayoutInformation(sb3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void createDesignElements(@l Composer composer, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1750959258);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1750959258, i12, -1, "androidx.constraintlayout.compose.Measurer.createDesignElements (ConstraintLayout.kt:2127)");
            }
            ArrayList<ConstraintSetParser.DesignElement> arrayList = this.designElements;
            int size = arrayList.size();
            int i19 = 0;
            int i21 = 0;
            while (i21 < size) {
                ConstraintSetParser.DesignElement designElement = arrayList.get(i21);
                String id2 = designElement.getId();
                r<String, HashMap<String, String>, Composer, Integer, g2> rVar = DesignElements.INSTANCE.getMap().get(designElement.getType());
                if (rVar != null) {
                    startRestartGroup.startReplaceGroup(-208717382);
                    rVar.invoke(id2, designElement.getParams(), startRestartGroup, Integer.valueOf(i19));
                    startRestartGroup.endReplaceGroup();
                    i13 = i19;
                    i14 = i21;
                    i15 = size;
                } else {
                    startRestartGroup.startReplaceGroup(-208578533);
                    String type = designElement.getType();
                    if (type != null) {
                        switch (type.hashCode()) {
                            case -1377687758:
                                i13 = i19;
                                i14 = i21;
                                i15 = size;
                                if (type.equals(ma.b.f72893b1)) {
                                    startRestartGroup.startReplaceGroup(-208561607);
                                    String str = designElement.getParams().get("text");
                                    BasicTextKt.m1036BasicTextVhcvRP8(str != null ? str : "text", PaddingKt.m726padding3ABfNKs(BackgroundKt.m235backgroundbw27NRU$default(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, id2), RoundedCornerShapeKt.RoundedCornerShape(20)), m5509getColorwrIjXm8(designElement.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.Companion.m2541getLightGray0d7_KjU()), null, 2, null), Dp.m5115constructorimpl(8)), getTextStyle(designElement.getParams()), (x00.l) null, 0, false, 0, 0, (ColorProducer) null, startRestartGroup, 0, 504);
                                    startRestartGroup.endReplaceGroup();
                                    break;
                                }
                                startRestartGroup.startReplaceGroup(-206260074);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case -1031434259:
                                i14 = i21;
                                i16 = size;
                                int i22 = i19;
                                i17 = i22;
                                if (type.equals("textfield")) {
                                    startRestartGroup.startReplaceGroup(-206910206);
                                    String str2 = designElement.getParams().get("text");
                                    if (str2 == null) {
                                        str2 = "text";
                                    }
                                    Modifier layoutId = LayoutIdKt.layoutId(Modifier.Companion, id2);
                                    Measurer$createDesignElements$1$2 measurer$createDesignElements$1$2 = new x00.l<String, g2>() { // from class: androidx.constraintlayout.compose.Measurer$createDesignElements$1$2
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(String str3) {
                                        }

                                        @Override // x00.l
                                        public /* bridge */ /* synthetic */ g2 invoke(String str3) {
                                            invoke2(str3);
                                            return g2.f100423a;
                                        }
                                    };
                                    Composer composer2 = startRestartGroup;
                                    i13 = i22 == true ? 1 : 0;
                                    i15 = i16;
                                    BasicTextFieldKt.BasicTextField(str2, (x00.l<? super String, g2>) measurer$createDesignElements$1$2, layoutId, false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (x00.l<? super TextLayoutResult, g2>) null, (MutableInteractionSource) null, (Brush) null, (q<? super p<? super Composer, ? super Integer, g2>, ? super Composer, ? super Integer, g2>) null, composer2, 48, 0, 65528);
                                    startRestartGroup = composer2;
                                    startRestartGroup.endReplaceGroup();
                                    break;
                                }
                                i15 = i16;
                                i13 = i17;
                                startRestartGroup.startReplaceGroup(-206260074);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case 97739:
                                i14 = i21;
                                i16 = size;
                                boolean z11 = i19;
                                i17 = z11;
                                if (type.equals("box")) {
                                    startRestartGroup.startReplaceGroup(-207870648);
                                    String str3 = designElement.getParams().get("text");
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    long m5509getColorwrIjXm8 = m5509getColorwrIjXm8(designElement.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.Companion.m2541getLightGray0d7_KjU());
                                    Modifier.Companion companion = Modifier.Companion;
                                    Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(LayoutIdKt.layoutId(companion, id2), m5509getColorwrIjXm8, null, 2, null);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), z11);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z11 ? 1 : 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m235backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    BasicTextKt.m1036BasicTextVhcvRP8(str3, PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(8)), getTextStyle(designElement.getParams()), (x00.l) null, 0, false, 0, 0, (ColorProducer) null, startRestartGroup, 48, 504);
                                    startRestartGroup.endNode();
                                    startRestartGroup.endReplaceGroup();
                                    i18 = z11;
                                    i15 = i16;
                                    i13 = i18;
                                    break;
                                }
                                i15 = i16;
                                i13 = i17;
                                startRestartGroup.startReplaceGroup(-206260074);
                                startRestartGroup.endReplaceGroup();
                                break;
                            case 3556653:
                                if (type.equals("text")) {
                                    startRestartGroup.startReplaceGroup(-207262986);
                                    String str4 = designElement.getParams().get("text");
                                    i16 = size;
                                    i14 = i21;
                                    i18 = i19;
                                    BasicTextKt.m1036BasicTextVhcvRP8(str4 != null ? str4 : "text", LayoutIdKt.layoutId(Modifier.Companion, id2), getTextStyle(designElement.getParams()), (x00.l) null, 0, false, 0, 0, (ColorProducer) null, startRestartGroup, 0, 504);
                                    startRestartGroup.endReplaceGroup();
                                    i15 = i16;
                                    i13 = i18;
                                    break;
                                }
                                break;
                            case 100313435:
                                if (type.equals("image")) {
                                    startRestartGroup.startReplaceGroup(-206572957);
                                    Composer composer3 = startRestartGroup;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(android.R.drawable.ic_menu_gallery, startRestartGroup, 6), "Placeholder Image", LayoutIdKt.layoutId(Modifier.Companion, id2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                                    startRestartGroup = composer3;
                                    startRestartGroup.endReplaceGroup();
                                    i13 = i19;
                                    i14 = i21;
                                    i15 = size;
                                    break;
                                }
                                break;
                        }
                        startRestartGroup.endReplaceGroup();
                    }
                    i13 = i19;
                    i14 = i21;
                    i15 = size;
                    startRestartGroup.startReplaceGroup(-206260074);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endReplaceGroup();
                }
                i21 = i14 + 1;
                size = i15;
                i19 = i13;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.Measurer$createDesignElements$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer4, int i23) {
                    Measurer.this.createDesignElements(composer4, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void drawDebugBounds(@k final BoxScope boxScope, final float f11, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(2126574786);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126574786, i12, -1, "androidx.constraintlayout.compose.Measurer.drawDebugBounds (ConstraintLayout.kt:2076)");
            }
            Modifier matchParentSize = boxScope.matchParentSize(Modifier.Companion);
            boolean changedInstance = ((i12 & 112) == 32) | startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l<DrawScope, g2>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        Measurer.this.drawDebugBounds(drawScope, f11);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(matchParentSize, (x00.l) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.constraintlayout.compose.Measurer$drawDebugBounds$2
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
                    Measurer.this.drawDebugBounds(boxScope, f11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    @k
    public String getDesignInfo(int i11, int i12, @k String str) {
        return ToolingUtilsKt.parseConstraintsToJson(this.root, this.state, i11, i12, str);
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    @k
    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    public final int getLayoutCurrentHeight() {
        return this.root.getHeight();
    }

    public final int getLayoutCurrentWidth() {
        return this.root.getWidth();
    }

    @l
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    @k
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    @k
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    @k
    public final State getState() {
        return this.state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r18.mMatchConstraintDefaultHeight == 0) goto L54;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(@m80.k androidx.constraintlayout.core.widgets.ConstraintWidget r18, @m80.k androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure r19) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.measure(androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure):void");
    }

    public final void parseDesignElements(@k ConstraintSet constraintSet) {
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(@k Placeable.PlacementScope placementScope, @k List<? extends Measurable> list) {
        Measurable measurable;
        Placeable placeable;
        Placeable.PlacementScope placementScope2;
        int i11 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            int size = children.size();
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget = children.get(i12);
                Object companionWidget = constraintWidget.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(constraintWidget.frame.update()));
                }
            }
        }
        int size2 = list.size();
        while (true) {
            if (i11 >= size2) {
                LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
                if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
                    computeLayoutResult();
                    return;
                }
                return;
            }
            Measurable measurable2 = list.get(i11);
            if (this.frameCache.containsKey(measurable2)) {
                measurable = measurable2;
            } else {
                Iterator<T> it = this.frameCache.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Measurable measurable3 = (Measurable) next;
                    if (LayoutIdKt.getLayoutId(measurable3) != null && g0.g(LayoutIdKt.getLayoutId(measurable3), LayoutIdKt.getLayoutId(measurable2))) {
                        r2 = next;
                        break;
                    }
                }
                measurable = (Measurable) r2;
                if (measurable == null) {
                    placementScope2 = placementScope;
                    i11++;
                    placementScope = placementScope2;
                }
            }
            WidgetFrame widgetFrame = this.frameCache.get(measurable);
            if (widgetFrame == null || (placeable = this.placeables.get(measurable)) == null) {
                return;
            }
            if (this.frameCache.containsKey(measurable2)) {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m5457placeWithFrameTransformKtjjmr4$default(placementScope2, placeable, widgetFrame, 0L, 4, null);
            } else {
                placementScope2 = placementScope;
                ConstraintLayoutKt.m5457placeWithFrameTransformKtjjmr4$default(placementScope2, measurable2.mo3857measureBRTryo0(Constraints.Companion.m5078fixedJhjzzOo(placeable.getWidth(), placeable.getHeight())), widgetFrame, 0L, 4, null);
            }
            i11++;
            placementScope = placementScope2;
        }
    }

    /* renamed from: performMeasure-2eBlSMk, reason: not valid java name */
    public final long m5513performMeasure2eBlSMk(long j11, @k LayoutDirection layoutDirection, @k ConstraintSet constraintSet, @k List<? extends Measurable> list, int i11) {
        if (list.isEmpty()) {
            return IntSizeKt.IntSize(Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11));
        }
        this.state.width(Constraints.m5066getHasFixedWidthimpl(j11) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m5068getMaxWidthimpl(j11)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m5070getMinWidthimpl(j11)));
        this.state.height(Constraints.m5065getHasFixedHeightimpl(j11) ? androidx.constraintlayout.core.state.Dimension.createFixed(Constraints.m5067getMaxHeightimpl(j11)) : androidx.constraintlayout.core.state.Dimension.createWrap().min(Constraints.m5069getMinHeightimpl(j11)));
        this.state.mParent.getWidth().apply(this.state, this.root, 0);
        this.state.mParent.getHeight().apply(this.state, this.root, 1);
        this.state.m5584setRootIncomingConstraintsBRTryo0(j11);
        this.state.setRtl(layoutDirection == LayoutDirection.Rtl);
        resetMeasureState$constraintlayout_compose_release();
        if (constraintSet.isDirty(list)) {
            this.state.reset();
            constraintSet.applyTo(this.state, list);
            ConstraintLayoutKt.buildMapping(this.state, list);
            this.state.apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(this.state, list);
        }
        m5512applyRootSizeBRTryo0(j11);
        this.root.updateHierarchy();
        this.root.setOptimizationLevel(i11);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$constraintlayout_compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    public final void setForcedScaleFactor(float f11) {
        this.forcedScaleFactor = f11;
    }

    public final void setLayoutInformationReceiver(@l LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    public final void drawDebugBounds(@k DrawScope drawScope, float f11) {
        float layoutCurrentWidth = getLayoutCurrentWidth() * f11;
        float layoutCurrentHeight = getLayoutCurrentHeight() * f11;
        float m2337getWidthimpl = (Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
        float m2334getHeightimpl = (Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
        Color.Companion companion = Color.Companion;
        long m2546getWhite0d7_KjU = companion.m2546getWhite0d7_KjU();
        float f12 = m2337getWidthimpl + layoutCurrentWidth;
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2546getWhite0d7_KjU, OffsetKt.Offset(m2337getWidthimpl, m2334getHeightimpl), OffsetKt.Offset(f12, m2334getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        long Offset = OffsetKt.Offset(f12, m2334getHeightimpl);
        float f13 = m2334getHeightimpl + layoutCurrentHeight;
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2546getWhite0d7_KjU, Offset, OffsetKt.Offset(f12, f13), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2546getWhite0d7_KjU, OffsetKt.Offset(f12, f13), OffsetKt.Offset(m2337getWidthimpl, f13), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2546getWhite0d7_KjU, OffsetKt.Offset(m2337getWidthimpl, f13), OffsetKt.Offset(m2337getWidthimpl, m2334getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        float f14 = 1;
        float f15 = m2337getWidthimpl + f14;
        float f16 = m2334getHeightimpl + f14;
        long m2535getBlack0d7_KjU = companion.m2535getBlack0d7_KjU();
        float f17 = f15 + layoutCurrentWidth;
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2535getBlack0d7_KjU, OffsetKt.Offset(f15, f16), OffsetKt.Offset(f17, f16), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        float f18 = f16 + layoutCurrentHeight;
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2535getBlack0d7_KjU, OffsetKt.Offset(f17, f16), OffsetKt.Offset(f17, f18), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2535getBlack0d7_KjU, OffsetKt.Offset(f17, f18), OffsetKt.Offset(f15, f18), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2535getBlack0d7_KjU, OffsetKt.Offset(f15, f18), OffsetKt.Offset(f15, f16), 0.0f, 0, null, 0.0f, null, 0, 504, null);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }
}
