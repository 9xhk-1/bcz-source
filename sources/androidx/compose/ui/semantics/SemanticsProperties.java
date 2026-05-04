package androidx.compose.ui.semantics;

import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsProperties {

    @k
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    @k
    private static final SemanticsPropertyKey<List<String>> ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", new p<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            return invoke2((List<String>) list, (List<String>) list2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<String> invoke2(List<String> list, List<String> list2) {
            List<String> d62;
            if (list == null || (d62 = r0.d6(list)) == null) {
                return list2;
            }
            d62.addAll(list2);
            return d62;
        }
    });

    @k
    private static final SemanticsPropertyKey<String> StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");

    @k
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");

    @k
    private static final SemanticsPropertyKey<String> PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", new p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // x00.p
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    @k
    private static final SemanticsPropertyKey<g2> SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");

    @k
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");

    @k
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");

    @k
    private static final SemanticsPropertyKey<g2> Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");

    @k
    private static final SemanticsPropertyKey<g2> Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");

    @k
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");

    @k
    private static final SemanticsPropertyKey<Boolean> Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");

    @k
    private static final SemanticsPropertyKey<Boolean> IsContainer = SemanticsPropertiesKt.AccessibilityKey("IsContainer");

    @k
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", null, 2, null);

    @k
    private static final SemanticsPropertyKey<g2> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new p<g2, g2, g2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // x00.p
        public final g2 invoke(g2 g2Var, g2 g2Var2) {
            return g2Var;
        }
    });

    @k
    private static final SemanticsPropertyKey<g2> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", new p<g2, g2, g2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // x00.p
        public final g2 invoke(g2 g2Var, g2 g2Var2) {
            return g2Var;
        }
    });

    @k
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", new p<ContentType, ContentType, ContentType>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // x00.p
        public final ContentType invoke(ContentType contentType, ContentType contentType2) {
            return contentType;
        }
    });

    @k
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new p<ContentDataType, ContentDataType, ContentDataType>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // x00.p
        public final ContentDataType invoke(ContentDataType contentDataType, ContentDataType contentDataType2) {
            return contentDataType;
        }
    });

    @k
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", new p<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f11, float f12) {
            return f11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12) {
            return invoke(f11, f12.floatValue());
        }
    });

    @k
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");

    @k
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");

    @k
    private static final SemanticsPropertyKey<g2> IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", new p<g2, g2, g2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // x00.p
        public final g2 invoke(g2 g2Var, g2 g2Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    @k
    private static final SemanticsPropertyKey<g2> IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", new p<g2, g2, g2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // x00.p
        public final g2 invoke(g2 g2Var, g2 g2Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    @k
    private static final SemanticsPropertyKey<Role> Role = SemanticsPropertiesKt.AccessibilityKey("Role", new p<Role, Role, Role>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Role invoke(Role role, Role role2) {
            return m4337invokeqtAw6s(role, role2.m4322unboximpl());
        }

        /* renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final Role m4337invokeqtAw6s(Role role, int i11) {
            return role;
        }
    });

    @k
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new p<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // x00.p
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    @k
    private static final SemanticsPropertyKey<g2> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, new p<g2, g2, g2>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // x00.p
        public final g2 invoke(g2 g2Var, g2 g2Var2) {
            return g2Var;
        }
    });

    @k
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = SemanticsPropertiesKt.AccessibilityKey("Text", new p<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
            return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<AnnotatedString> invoke2(List<AnnotatedString> list, List<AnnotatedString> list2) {
            List<AnnotatedString> d62;
            if (list == null || (d62 = r0.d6(list)) == null) {
                return list2;
            }
            d62.addAll(list2);
            return d62;
        }
    });

    @k
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);

    @k
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);

    @k
    private static final SemanticsPropertyKey<AnnotatedString> InputText = SemanticsPropertiesKt.AccessibilityKey("InputText");

    @k
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");

    @k
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");

    @k
    private static final SemanticsPropertyKey<ImeAction> ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");

    @k
    private static final SemanticsPropertyKey<Boolean> Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");

    @k
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");

    @k
    private static final SemanticsPropertyKey<g2> Password = SemanticsPropertiesKt.AccessibilityKey("Password");

    @k
    private static final SemanticsPropertyKey<String> Error = SemanticsPropertiesKt.AccessibilityKey("Error");

    @k
    private static final SemanticsPropertyKey<l<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    @k
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", null, 2, null);

    @k
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", null, 2, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    @k
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    @k
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    @k
    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    @k
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    @k
    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    @k
    public final SemanticsPropertyKey<g2> getDisabled() {
        return Disabled;
    }

    @k
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    @k
    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    @k
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    @k
    public final SemanticsPropertyKey<g2> getHeading() {
        return Heading;
    }

    @k
    public final SemanticsPropertyKey<g2> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    @k
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    @k
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    @k
    public final SemanticsPropertyKey<l<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    @k
    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    @k
    public final SemanticsPropertyKey<g2> getInvisibleToUser() {
        return InvisibleToUser;
    }

    @k
    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    @k
    public final SemanticsPropertyKey<g2> getIsDialog() {
        return IsDialog;
    }

    @k
    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    @k
    public final SemanticsPropertyKey<g2> getIsPopup() {
        return IsPopup;
    }

    @k
    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    @k
    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    @k
    public final SemanticsPropertyKey<g2> getLinkTestMarker() {
        return LinkTestMarker;
    }

    @k
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    @k
    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    @k
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    @k
    public final SemanticsPropertyKey<g2> getPassword() {
        return Password;
    }

    @k
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    @k
    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    @k
    public final SemanticsPropertyKey<g2> getSelectableGroup() {
        return SelectableGroup;
    }

    @k
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    @k
    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    @k
    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    @k
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    @k
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    @k
    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    @k
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    @k
    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    @k
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    @n(message = "Use `hideFromAccessibility` instead.", replaceWith = @w0(expression = "HideFromAccessibility", imports = {}))
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @n(message = "Use `isTraversalGroup` instead.", replaceWith = @w0(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }
}
