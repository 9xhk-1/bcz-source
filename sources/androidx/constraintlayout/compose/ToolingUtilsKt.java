package androidx.constraintlayout.compose;

import a00.h0;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h10.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import org.json.JSONArray;
import org.json.JSONObject;
import u30.e0;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nToolingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingUtils.kt\nandroidx/constraintlayout/compose/ToolingUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,193:1\n33#2,4:194\n33#2,6:198\n38#2:204\n33#2,6:205\n*S KotlinDebug\n*F\n+ 1 ToolingUtils.kt\nandroidx/constraintlayout/compose/ToolingUtilsKt\n*L\n75#1:194,4\n85#1:198,6\n75#1:204\n185#1:205,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ToolingUtilsKt {
    private static final int BOUNDS = 1;
    private static final int CONSTRAINTS = 0;
    private static final int CONSTRAINTS_JSON_VERSION = 1;
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(ToolingUtilsKt.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1))};

    @k
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i11 = helperWidget.mWidgetsCount;
        for (int i12 = 0; i12 < i11; i12++) {
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i12];
            list.add(g0.g(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
        }
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i11, int i12) {
        return new JSONObject().put(TtmlNode.LEFT, constraintWidget.getLeft() + i11).put("top", constraintWidget.getTop() + i12).put(TtmlNode.RIGHT, constraintWidget.getRight() + i11).put("bottom", constraintWidget.getBottom() + i12);
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        return new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
    }

    @k
    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    @k
    public static final DesignInfoProvider getDesignInfoProvider(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return DesignInfoDataKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        g0.n(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
        return String.valueOf(state.getKeyId$constraintlayout_compose_release((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        String obj;
        Object companionWidget = constraintWidget != null ? constraintWidget.getCompanionWidget() : null;
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (obj = layoutId.toString()) == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return obj;
    }

    @k
    public static final String parseConstraintsToJson(@k ConstraintWidgetContainer constraintWidgetContainer, @k State state, int i11, int i12, @k String str) {
        boolean z11;
        boolean z12;
        int i13;
        JSONObject jSONObject;
        String str2;
        int i14;
        String valueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject2 = new JSONObject();
        Integer p12 = e0.p1(str);
        if (p12 != null) {
            int intValue = p12.intValue();
            boolean z13 = (intValue >> 1) == 1;
            z11 = intValue == 1;
            z12 = z13;
        } else {
            z11 = true;
            z12 = true;
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        int i15 = 0;
        while (i15 < size) {
            ConstraintWidget constraintWidget = children.get(i15);
            boolean z14 = z12;
            JSONArray jSONArray = new JSONArray();
            boolean z15 = z11;
            ArrayList arrayList = new ArrayList();
            boolean z16 = constraintWidget instanceof HelperWidget;
            int i16 = i15;
            String str3 = constraintWidget.stringId;
            if (z16) {
                g0.n(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
                addReferencesIds((HelperWidget) constraintWidget, arrayList, constraintWidgetContainer, valueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            int size2 = anchors.size();
            ArrayList<ConstraintWidget> arrayList2 = children;
            int i17 = 0;
            while (i17 < size2) {
                ConstraintAnchor constraintAnchor = anchors.get(i17);
                if (constraintAnchor.isConnected()) {
                    i13 = i17;
                    ConstraintWidget owner = constraintAnchor.getTarget().getOwner();
                    jSONObject = jSONObject2;
                    String helperId = g0.g(constraintWidgetContainer, owner) ? valueOf : owner instanceof HelperWidget ? getHelperId(owner, state) : getRefId(owner);
                    str2 = valueOf;
                    i14 = size;
                    JSONObject put = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    g0.m(target);
                    jSONArray.put(put.put("targetAnchor", target.getType()).put(TypedValues.AttributesType.S_TARGET, helperId).put("margin", constraintAnchor.getMargin()));
                } else {
                    i13 = i17;
                    jSONObject = jSONObject2;
                    str2 = valueOf;
                    i14 = size;
                }
                i17 = i13 + 1;
                valueOf = str2;
                jSONObject2 = jSONObject;
                size = i14;
            }
            JSONObject jSONObject3 = jSONObject2;
            putViewIdToBoundsAndConstraints(jSONObject3, str3, boundsToJson(constraintWidget, i11, i12), constraintWidget instanceof HelperWidget, false, arrayList, jSONArray, z15, z14);
            jSONObject2 = jSONObject3;
            i15 = i16 + 1;
            z11 = z15;
            z12 = z14;
            children = arrayList2;
            size = size;
        }
        putViewIdToBoundsAndConstraints(jSONObject2, valueOf, boundsToJson(constraintWidgetContainer, i11, i12), false, true, h0.J(), new JSONArray(), z11, z12);
        return createDesignInfoJson(jSONObject2);
    }

    private static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z11, boolean z12, List<String> list, JSONArray jSONArray, boolean z13, boolean z14) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z14) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z11);
        jSONObject3.put("isRoot", z12);
        JSONArray jSONArray2 = new JSONArray();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            jSONArray2.put(list.get(i11));
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z13) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }

    public static /* synthetic */ void putViewIdToBoundsAndConstraints$default(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z11, boolean z12, List list, JSONArray jSONArray, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 64) != 0) {
            z13 = true;
        }
        if ((i11 & 128) != 0) {
            z14 = true;
        }
        putViewIdToBoundsAndConstraints(jSONObject, str, jSONObject2, z11, z12, list, jSONArray, z13, z14);
    }

    public static final void setDesignInfoProvider(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k DesignInfoProvider designInfoProvider) {
        DesignInfoDataKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }

    @v0
    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
