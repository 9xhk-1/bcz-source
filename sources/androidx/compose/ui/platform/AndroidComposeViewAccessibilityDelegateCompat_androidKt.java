package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.R;
import androidx.compose.ui.contentcapture.ContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3362:1\n34#2,6:3363\n34#2,6:3369\n34#2,6:3375\n65#3,10:3381\n26#4:3391\n1#5:3392\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n2997#1:3363,6\n3041#1:3369,6\n3089#1:3375,6\n3208#1:3381,10\n3215#1:3391\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {

    @m80.k
    private static final x00.p<SemanticsNode, SemanticsNode, Integer> UnmergedConfigComparator;

    @m80.k
    private static final Comparator<SemanticsNode>[] semanticComparators;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Comparator<SemanticsNode>[] comparatorArr = new Comparator[2];
        int i11 = 0;
        while (i11 < 2) {
            final Comparator comparator = i11 == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.Companion.getZComparator$ui_release();
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    int compare = comparator.compare(t11, t12);
                    return compare != 0 ? compare : zComparator$ui_release.compare(((SemanticsNode) t11).getLayoutNode$ui_release(), ((SemanticsNode) t12).getLayoutNode$ui_release());
                }
            };
            comparatorArr[i11] = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    int compare = comparator2.compare(t11, t12);
                    return compare != 0 ? compare : e00.g.l(Integer.valueOf(((SemanticsNode) t11).getId()), Integer.valueOf(((SemanticsNode) t12).getId()));
                }
            };
            i11++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = new x00.p<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1
            @Override // x00.p
            public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig$ui_release.getOrElse(semanticsProperties.getTraversalIndex(), new x00.a<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode2.getUnmergedConfig$ui_release().getOrElse(semanticsProperties.getTraversalIndex(), new x00.a<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!kotlin.jvm.internal.g0.g(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) {
            return accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null;
        }
        return false;
    }

    private static final String createStateDescriptionForTextField(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration config = semanticsNode.copyWithMergingEnabled$ui_release().getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Collection collection = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getContentDescription());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getText());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(R.string.state_empty);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        return !semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getEditableText()) && !kotlin.jvm.internal.g0.g(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), new x00.l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
            
                if (r3.contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText()) != false) goto L10;
             */
            @Override // x00.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r3) {
                /*
                    r2 = this;
                    androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getSemanticsConfiguration()
                    if (r3 == 0) goto L1a
                    boolean r0 = r3.isMergingSemanticsOfDescendants()
                    r1 = 1
                    if (r0 != r1) goto L1a
                    androidx.compose.ui.semantics.SemanticsProperties r0 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
                    androidx.compose.ui.semantics.SemanticsPropertyKey r0 = r0.getEditableText()
                    boolean r3 = r3.contains(r0)
                    if (r3 == 0) goto L1a
                    goto L1b
                L1a:
                    r1 = 0
                L1b:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
            }
        });
        if (findClosestParentNode != null) {
            SemanticsConfiguration semanticsConfiguration = findClosestParentNode.getSemanticsConfiguration();
            if (!(semanticsConfiguration != null ? kotlin.jvm.internal.g0.g(SemanticsConfigurationKt.getOrNull(semanticsConfiguration, semanticsProperties.getFocused()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, x00.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (lVar.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    private static final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap, IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, Resources resources) {
        boolean isRtl = isRtl(semanticsNode);
        boolean booleanValue = ((Boolean) semanticsNode.getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((booleanValue || isScreenReaderFocusable(semanticsNode, resources)) && intObjectMap.containsKey(semanticsNode.getId())) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            mutableIntObjectMap.set(semanticsNode.getId(), subtreeSortedByGeometryGrouping(isRtl, semanticsNode.getChildren(), intObjectMap, resources));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i11 = 0; i11 < size; i11++) {
            geometryDepthFirstSearch(children.get(i11), arrayList, mutableIntObjectMap, intObjectMap, resources);
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager.Companion.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        boolean z11 = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected())) != null) {
            if (!(role != null ? Role.m4319equalsimpl0(role.m4322unboximpl(), Role.Companion.m4330getTabo7Vup1c()) : false)) {
                return true;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i11 == 1) {
                if ((role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), Role.Companion.m4329getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(R.string.state_on);
                }
            } else if (i11 == 2) {
                if ((role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), Role.Companion.m4329getSwitcho7Vup1c())) && orNull == null) {
                    orNull = resources.getString(R.string.state_off);
                }
            } else if (i11 == 3 && orNull == null) {
                orNull = resources.getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m4319equalsimpl0(role.m4322unboximpl(), Role.Companion.m4330getTabo7Vup1c())) && orNull == null) {
                orNull = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    g10.f<Float> range = progressBarRangeInfo.getRange();
                    float current = ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) > 0.0f ? 1 : ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        r5 = (current == 1.0f ? 1 : 0) != 0 ? 100 : g10.u.I(Math.round(current * 100), 1, 99);
                    }
                    orNull = resources.getString(R.string.template_percent, Integer.valueOf(r5));
                }
            } else if (orNull == null) {
                orNull = resources.getString(R.string.in_progress);
            }
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            orNull = createStateDescriptionForTextField(semanticsNode, resources);
        }
        return (String) orNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        return annotatedString == null ? list != null ? (AnnotatedString) a00.r0.L2(list) : null : annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderFocusable(SemanticsNode semanticsNode, Resources resources) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        return !SemanticsUtils_androidKt.isHidden(semanticsNode) && (semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || (semanticsNode.isUnmergedLeafNode$ui_release() && ((list != null ? (String) a00.r0.L2(list) : null) != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode, resources) != null || getInfoIsCheckable(semanticsNode))));
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<Pair<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z11 = top >= bottom;
        int L = a00.h0.L(arrayList);
        if (L >= 0) {
            int i11 = 0;
            while (true) {
                Rect first = arrayList.get(i11).getFirst();
                boolean z12 = first.getTop() >= first.getBottom();
                if (!z11 && !z12 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i11, new Pair<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i11).getSecond()));
                    arrayList.get(i11).getSecond().add(semanticsNode);
                    return true;
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final void setDisableContentCapture(boolean z11) {
        ContentCaptureManager.Companion.setEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTraversalValues(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, MutableIntIntMap mutableIntIntMap, MutableIntIntMap mutableIntIntMap2, Resources resources) {
        mutableIntIntMap.clear();
        mutableIntIntMap2.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        kotlin.jvm.internal.g0.m(semanticsNode);
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(isRtl(semanticsNode), a00.g0.l(semanticsNode), intObjectMap, resources);
        int L = a00.h0.L(subtreeSortedByGeometryGrouping);
        int i11 = 1;
        if (1 > L) {
            return;
        }
        while (true) {
            int id2 = subtreeSortedByGeometryGrouping.get(i11 - 1).getId();
            int id3 = subtreeSortedByGeometryGrouping.get(i11).getId();
            mutableIntIntMap.set(id2, id3);
            mutableIntIntMap2.set(id3, id2);
            if (i11 == L) {
                return;
            } else {
                i11++;
            }
        }
    }

    private static final List<SemanticsNode> sortByGeometryGroupings(boolean z11, ArrayList<SemanticsNode> arrayList, Resources resources, MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMap) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int L = a00.h0.L(arrayList);
        int i11 = 0;
        if (L >= 0) {
            int i12 = 0;
            while (true) {
                SemanticsNode semanticsNode = arrayList.get(i12);
                if (i12 == 0 || !placedEntryRowOverlaps(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.getBoundsInWindow(), a00.h0.U(semanticsNode)));
                }
                if (i12 == L) {
                    break;
                }
                i12++;
            }
        }
        a00.l0.r0(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        Comparator<SemanticsNode> comparator = semanticComparators[!z11 ? 1 : 0];
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            Pair pair = (Pair) arrayList2.get(i13);
            a00.l0.r0((List) pair.getSecond(), comparator);
            arrayList3.addAll((Collection) pair.getSecond());
        }
        final x00.p<SemanticsNode, SemanticsNode, Integer> pVar = UnmergedConfigComparator;
        a00.l0.r0(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int sortByGeometryGroupings$lambda$5;
                sortByGeometryGroupings$lambda$5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.sortByGeometryGroupings$lambda$5(x00.p.this, obj, obj2);
                return sortByGeometryGroupings$lambda$5;
            }
        });
        while (i11 <= a00.h0.L(arrayList3)) {
            List<SemanticsNode> list = mutableIntObjectMap.get(((SemanticsNode) arrayList3.get(i11)).getId());
            if (list != null) {
                if (isScreenReaderFocusable((SemanticsNode) arrayList3.get(i11), resources)) {
                    i11++;
                } else {
                    arrayList3.remove(i11);
                }
                arrayList3.addAll(i11, list);
                i11 += list.size();
            } else {
                i11++;
            }
        }
        return arrayList3;
    }

    public static /* synthetic */ List sortByGeometryGroupings$default(boolean z11, ArrayList arrayList, Resources resources, MutableIntObjectMap mutableIntObjectMap, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            mutableIntObjectMap = IntObjectMapKt.mutableIntObjectMapOf();
        }
        return sortByGeometryGroupings(z11, arrayList, resources, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$5(x00.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private static final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z11, List<SemanticsNode> list, IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap, Resources resources) {
        MutableIntObjectMap mutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            geometryDepthFirstSearch(list.get(i11), arrayList, mutableIntObjectMapOf, intObjectMap, resources);
        }
        return sortByGeometryGroupings(z11, arrayList, resources, mutableIntObjectMapOf);
    }

    @ExperimentalComposeUiApi
    @yz.n(level = DeprecationLevel.WARNING, message = "Use ContentCapture.isEnabled instead", replaceWith = @yz.w0(expression = "!ContentCaptureManager.isEnabled", imports = {"androidx.compose.ui.contentcapture.ContentCaptureManager.Companion.isEnabled"}))
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }
}
