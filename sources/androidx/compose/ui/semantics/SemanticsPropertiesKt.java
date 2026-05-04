package androidx.compose.ui.semantics;

import a00.g0;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import h10.n;
import j00.c;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;
import yz.w;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), o0.k(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.getStateDescription();
        semanticsProperties.getProgressBarRangeInfo();
        semanticsProperties.getPaneTitle();
        semanticsProperties.getLiveRegion();
        semanticsProperties.getFocused();
        semanticsProperties.getIsContainer();
        semanticsProperties.getIsTraversalGroup();
        semanticsProperties.getContentType();
        semanticsProperties.getContentDataType();
        semanticsProperties.getTraversalIndex();
        semanticsProperties.getHorizontalScrollAxisRange();
        semanticsProperties.getVerticalScrollAxisRange();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.getTextSubstitution();
        semanticsProperties.getIsShowingTextSubstitution();
        semanticsProperties.getInputText();
        semanticsProperties.getEditableText();
        semanticsProperties.getTextSelectionRange();
        semanticsProperties.getImeAction();
        semanticsProperties.getSelected();
        semanticsProperties.getCollectionInfo();
        semanticsProperties.getCollectionItemInfo();
        semanticsProperties.getToggleableState();
        semanticsProperties.getIsEditable();
        semanticsProperties.getMaxTextLength();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    @k
    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(@k String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    private static final <T extends w<? extends Boolean>> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return AccessibilityKey(str, SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE);
    }

    public static final void clearTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void clearTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, aVar);
    }

    public static final void collapse(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, aVar);
    }

    public static final void copyText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void cutText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, aVar);
    }

    public static final void dialog(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), g2.f100423a);
    }

    public static final void disabled(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), g2.f100423a);
    }

    public static final void dismiss(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, aVar);
    }

    public static final void error(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void expand(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, aVar);
    }

    @k
    public static final CollectionInfo getCollectionInfo(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[21]);
    }

    @k
    public static final CollectionItemInfo getCollectionItemInfo(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[22]);
    }

    @k
    public static final ContentDataType getContentDataType(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentDataType().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]);
    }

    @k
    public static final String getContentDescription(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (String) throwSemanticsGetNotSupported();
    }

    @k
    public static final ContentType getContentType(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentType().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]);
    }

    @k
    public static final List<CustomAccessibilityAction> getCustomActions(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[26]);
    }

    @k
    public static final AnnotatedString getEditableText(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]);
    }

    public static final boolean getFocused(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    @k
    public static final ScrollAxisRange getHorizontalScrollAxisRange(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]);
    }

    @yz.n(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[19]).m4728unboximpl();
    }

    @k
    public static final AnnotatedString getInputText(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getInputText().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]);
    }

    public static final int getLiveRegion(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).m4313unboximpl();
    }

    public static final int getMaxTextLength(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getMaxTextLength().getValue(semanticsPropertyReceiver, $$delegatedProperties[25]).intValue();
    }

    @k
    public static final String getPaneTitle(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    @k
    public static final ProgressBarRangeInfo getProgressBarRangeInfo(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final int getRole(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]).m4322unboximpl();
    }

    public static final void getScrollViewportLength(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @k final a<Float> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetScrollViewportLength(), new AccessibilityAction(str, new x00.l<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(List<Float> list) {
                boolean z11;
                Float invoke = aVar.invoke();
                if (invoke == null) {
                    z11 = false;
                } else {
                    list.add(invoke);
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        }));
    }

    public static /* synthetic */ void getScrollViewportLength$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        getScrollViewportLength(semanticsPropertyReceiver, str, aVar);
    }

    public static final boolean getSelected(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[20]).booleanValue();
    }

    @k
    public static final String getStateDescription(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @k
    public static final String getTestTag(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]);
    }

    @k
    public static final AnnotatedString getText(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void getTextLayoutResult(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super List<TextLayoutResult>, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, lVar);
    }

    public static final long getTextSelectionRange(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[18]).m4563unboximpl();
    }

    @k
    public static final AnnotatedString getTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    @k
    public static final ToggleableState getToggleableState(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[23]);
    }

    public static final float getTraversalIndex(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]).floatValue();
    }

    @k
    public static final ScrollAxisRange getVerticalScrollAxisRange(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]);
    }

    public static final void heading(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), g2.f100423a);
    }

    public static final void hideFromAccessibility(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHideFromAccessibility(), g2.f100423a);
    }

    public static final void indexForKey(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k x00.l<Object, Integer> lVar) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), lVar);
    }

    public static final void insertTextAtCursor(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, lVar);
    }

    @yz.n(message = "Use `hideFromAccessibility()` instead.", replaceWith = @w0(expression = "hideFromAccessibility()", imports = {}))
    public static final void invisibleToUser(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), g2.f100423a);
    }

    public static final boolean isContainer(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsContainer().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    public static final boolean isEditable(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsEditable().getValue(semanticsPropertyReceiver, $$delegatedProperties[24]).booleanValue();
    }

    public static final boolean isShowingTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]).booleanValue();
    }

    public static final boolean isTraversalGroup(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]).booleanValue();
    }

    public static final void onAutofillText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnAutofillText(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void onAutofillText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        onAutofillText(semanticsPropertyReceiver, str, lVar);
    }

    public static final void onClick(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, aVar);
    }

    /* renamed from: onImeAction-9UiTYpY, reason: not valid java name */
    public static final void m4338onImeAction9UiTYpY(@k SemanticsPropertyReceiver semanticsPropertyReceiver, int i11, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getImeAction(), ImeAction.m4722boximpl(i11));
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, aVar));
    }

    /* renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static /* synthetic */ void m4339onImeAction9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver, int i11, String str, a aVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        m4338onImeAction9UiTYpY(semanticsPropertyReceiver, i11, str, aVar);
    }

    public static final void onLongClick(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageDown(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageLeft(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageRight(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, aVar);
    }

    public static final void pageUp(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, aVar);
    }

    public static final void password(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), g2.f100423a);
    }

    public static final void pasteText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, aVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @w0(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, aVar);
    }

    public static final void popup(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), g2.f100423a);
    }

    public static final void requestFocus(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l a<Boolean> aVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, aVar));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, aVar);
    }

    public static final void scrollBy(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l p<? super Float, ? super Float, Boolean> pVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, pVar));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, pVar);
    }

    public static final void scrollByOffset(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k p<? super Offset, ? super c<? super Offset>, ? extends Object> pVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollByOffset(), pVar);
    }

    public static final void scrollToIndex(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @k x00.l<? super Integer, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, lVar);
    }

    public static final void selectableGroup(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), g2.f100423a);
    }

    public static final void setCollectionInfo(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k CollectionInfo collectionInfo) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[21], collectionInfo);
    }

    public static final void setCollectionItemInfo(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k CollectionItemInfo collectionItemInfo) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[22], collectionItemInfo);
    }

    public static final void setContainer(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsProperties.INSTANCE.getIsContainer().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], Boolean.valueOf(z11));
    }

    public static final void setContentDataType(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k ContentDataType contentDataType) {
        SemanticsProperties.INSTANCE.getContentDataType().setValue(semanticsPropertyReceiver, $$delegatedProperties[8], contentDataType);
    }

    public static final void setContentDescription(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), g0.l(str));
    }

    public static final void setContentType(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k ContentType contentType) {
        SemanticsProperties.INSTANCE.getContentType().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], contentType);
    }

    public static final void setCustomActions(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k List<CustomAccessibilityAction> list) {
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[26], list);
    }

    public static final void setEditable(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsProperties.INSTANCE.getIsEditable().setValue(semanticsPropertyReceiver, $$delegatedProperties[24], Boolean.valueOf(z11));
    }

    public static final void setEditableText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], annotatedString);
    }

    public static final void setFocused(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z11));
    }

    public static final void setHorizontalScrollAxisRange(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], scrollAxisRange);
    }

    @yz.n(message = "Pass the ImeAction to onImeAction instead.")
    /* renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m4340setImeAction4L7nppU(@k SemanticsPropertyReceiver semanticsPropertyReceiver, int i11) {
        SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, $$delegatedProperties[19], ImeAction.m4722boximpl(i11));
    }

    public static final void setInputText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getInputText().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], annotatedString);
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m4341setLiveRegionhR3wRGc(@k SemanticsPropertyReceiver semanticsPropertyReceiver, int i11) {
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, $$delegatedProperties[3], LiveRegionMode.m4307boximpl(i11));
    }

    public static final void setMaxTextLength(@k SemanticsPropertyReceiver semanticsPropertyReceiver, int i11) {
        SemanticsProperties.INSTANCE.getMaxTextLength().setValue(semanticsPropertyReceiver, $$delegatedProperties[25], Integer.valueOf(i11));
    }

    public static final void setPaneTitle(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k String str) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void setProgress(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super Float, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, lVar);
    }

    public static final void setProgressBarRangeInfo(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m4342setRolekuIjeqM(@k SemanticsPropertyReceiver semanticsPropertyReceiver, int i11) {
        SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, $$delegatedProperties[12], Role.m4316boximpl(i11));
    }

    public static final void setSelected(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[20], Boolean.valueOf(z11));
    }

    public static final void setSelection(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, qVar));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, qVar);
    }

    public static final void setShowingTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], Boolean.valueOf(z11));
    }

    public static final void setStateDescription(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k String str) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final void setTestTag(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k String str) {
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], str);
    }

    public static final void setText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k AnnotatedString annotatedString) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), g0.l(annotatedString));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, lVar);
    }

    /* renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m4343setTextSelectionRangeFDrldGo(@k SemanticsPropertyReceiver semanticsPropertyReceiver, long j11) {
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[18], TextRange.m4547boximpl(j11));
    }

    public static final void setTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], annotatedString);
    }

    public static /* synthetic */ void setTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, lVar);
    }

    public static final void setToggleableState(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k ToggleableState toggleableState) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[23], toggleableState);
    }

    public static final void setTraversalGroup(@k SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z11) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], Boolean.valueOf(z11));
    }

    public static final void setTraversalIndex(@k SemanticsPropertyReceiver semanticsPropertyReceiver, float f11) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], Float.valueOf(f11));
    }

    public static final void setVerticalScrollAxisRange(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @k ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[11], scrollAxisRange);
    }

    public static final void showTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super Boolean, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), new AccessibilityAction(str, lVar));
    }

    public static /* synthetic */ void showTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    @k
    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(@k String str, @k p<? super T, ? super T, ? extends T> pVar) {
        return new SemanticsPropertyKey<>(str, true, pVar);
    }

    public static final void setText(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, lVar));
    }

    public static final void setTextSubstitution(@k SemanticsPropertyReceiver semanticsPropertyReceiver, @l String str, @l x00.l<? super AnnotatedString, Boolean> lVar) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(str, lVar));
    }

    @yz.n(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void getImeAction$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @yz.n(message = "Use `isTraversalGroup` instead.", replaceWith = @w0(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
