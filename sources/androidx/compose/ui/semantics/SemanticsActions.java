package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import j00.c;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1523:1\n502#2:1524\n501#2,9:1525\n502#2:1534\n501#2,9:1535\n502#2:1544\n501#2,9:1545\n502#2:1554\n501#2,9:1555\n502#2:1564\n501#2,9:1565\n502#2:1574\n501#2,9:1575\n502#2:1584\n501#2,9:1585\n502#2:1594\n501#2,9:1595\n502#2:1604\n501#2,9:1605\n502#2:1614\n501#2,9:1615\n502#2:1624\n501#2,9:1625\n502#2:1634\n501#2,9:1635\n502#2:1644\n501#2,9:1645\n502#2:1654\n501#2,9:1655\n502#2:1664\n501#2,9:1665\n502#2:1674\n501#2,9:1675\n502#2:1684\n501#2,9:1685\n502#2:1694\n501#2,9:1695\n502#2:1704\n501#2,9:1705\n502#2:1714\n501#2,9:1715\n502#2:1724\n501#2,9:1725\n502#2:1734\n501#2,9:1735\n502#2:1744\n501#2,9:1745\n502#2:1754\n501#2,9:1755\n502#2:1764\n501#2,9:1765\n502#2:1774\n501#2,9:1775\n502#2:1784\n501#2,9:1785\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n271#1:1524\n271#1:1525,9\n274#1:1534\n274#1:1535,9\n277#1:1544\n277#1:1545,9\n280#1:1554\n280#1:1555,9\n286#1:1564\n286#1:1565,9\n289#1:1574\n289#1:1575,9\n292#1:1584\n292#1:1585,9\n295#1:1594\n295#1:1595,9\n298#1:1604\n298#1:1605,9\n301#1:1614\n301#1:1615,9\n304#1:1624\n304#1:1625,9\n307#1:1634\n307#1:1635,9\n310#1:1644\n310#1:1645,9\n313#1:1654\n313#1:1655,9\n326#1:1664\n326#1:1665,9\n329#1:1674\n329#1:1675,9\n332#1:1684\n332#1:1685,9\n335#1:1694\n335#1:1695,9\n338#1:1704\n338#1:1705,9\n341#1:1714\n341#1:1715,9\n344#1:1724\n344#1:1725,9\n347#1:1734\n347#1:1735,9\n353#1:1744\n353#1:1745,9\n356#1:1754\n356#1:1755,9\n359#1:1764\n359#1:1765,9\n362#1:1774\n362#1:1775,9\n366#1:1784\n366#1:1785,9\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsActions {
    public static final int $stable;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> ClearTextSubstitution;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Collapse;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> CopyText;

    @k
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> CutText;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Dismiss;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Expand;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<List<Float>, Boolean>>> GetScrollViewportLength;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    @k
    public static final SemanticsActions INSTANCE = new SemanticsActions();

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> InsertTextAtCursor;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> OnAutofillText;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnClick;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnImeAction;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnLongClick;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageDown;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageLeft;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageRight;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageUp;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PasteText;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PerformImeAction;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> RequestFocus;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> ScrollBy;

    @k
    private static final SemanticsPropertyKey<p<Offset, c<? super Offset>, Object>> ScrollByOffset;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<Integer, Boolean>>> ScrollToIndex;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<Float, Boolean>>> SetProgress;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> SetText;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> SetTextSubstitution;

    @k
    private static final SemanticsPropertyKey<AccessibilityAction<l<Boolean, Boolean>>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        OnAutofillText = SemanticsPropertiesKt.AccessibilityKey("OnAutofillText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", semanticsPropertiesKt$ActionPropertyKey$1);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", semanticsPropertiesKt$ActionPropertyKey$1);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
        GetScrollViewportLength = SemanticsPropertiesKt.AccessibilityKey("GetScrollViewportLength", semanticsPropertiesKt$ActionPropertyKey$1);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCollapse() {
        return Collapse;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCopyText() {
        return CopyText;
    }

    @k
    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCutText() {
        return CutText;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getDismiss() {
        return Dismiss;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getExpand() {
        return Expand;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<List<Float>, Boolean>>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getOnAutofillText() {
        return OnAutofillText;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnClick() {
        return OnClick;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageDown() {
        return PageDown;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageRight() {
        return PageRight;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageUp() {
        return PageUp;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPasteText() {
        return PasteText;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    @k
    public final SemanticsPropertyKey<p<Offset, c<? super Offset>, Object>> getScrollByOffset() {
        return ScrollByOffset;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    @k
    public final SemanticsPropertyKey<AccessibilityAction<l<Boolean, Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    @n(level = DeprecationLevel.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @w0(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }
}
