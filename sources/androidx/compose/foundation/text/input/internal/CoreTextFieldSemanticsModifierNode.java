package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nCoreTextFieldSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextFieldSemanticsModifier.kt\nandroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean enabled;

    @m80.k
    private FocusRequester focusRequester;

    @m80.k
    private ImeOptions imeOptions;
    private boolean isPassword;

    @m80.k
    private TextFieldSelectionManager manager;

    @m80.k
    private OffsetMapping offsetMapping;
    private boolean readOnly;

    @m80.k
    private LegacyTextFieldState state;

    @m80.k
    private TransformedText transformedText;

    @m80.k
    private TextFieldValue value;

    public CoreTextFieldSemanticsModifierNode(@m80.k TransformedText transformedText, @m80.k TextFieldValue textFieldValue, @m80.k LegacyTextFieldState legacyTextFieldState, boolean z11, boolean z12, boolean z13, @m80.k OffsetMapping offsetMapping, @m80.k TextFieldSelectionManager textFieldSelectionManager, @m80.k ImeOptions imeOptions, @m80.k FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z11;
        this.enabled = z12;
        this.isPassword = z13;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
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
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextUpdateFromSemantics(LegacyTextFieldState legacyTextFieldState, String str, boolean z11, boolean z12) {
        g2 g2Var;
        if (z11 || !z12) {
            return;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onEditCommand$foundation_release(a00.h0.Q(new DeleteAllCommand(), new CommitTextCommand(str, 1)), legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange(), inputSession);
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            legacyTextFieldState.getOnValueChange().invoke(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (kotlin.jvm.internal.v) null));
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m4343setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.m4807getSelectiond9O1mEE());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$1
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(AnnotatedString annotatedString) {
                CoreTextFieldSemanticsModifierNode.this.getState().setJustAutofilled(true);
                CoreTextFieldSemanticsModifierNode.this.getState().setAutofillHighlightOn(true);
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifierNode.this.getReadOnly(), CoreTextFieldSemanticsModifierNode.this.getEnabled());
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z11 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z11);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new x00.l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z12;
                if (CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult();
                    kotlin.jvm.internal.g0.m(layoutResult);
                    list.add(layoutResult.getValue());
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            }
        }, 1, null);
        if (z11) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$3
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                    coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifierNode.this.getReadOnly(), CoreTextFieldSemanticsModifierNode.this.getEnabled());
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    g2 g2Var;
                    if (CoreTextFieldSemanticsModifierNode.this.getReadOnly() || !CoreTextFieldSemanticsModifierNode.this.getEnabled()) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.ui.text.input.TextInputSession inputSession = CoreTextFieldSemanticsModifierNode.this.getState().getInputSession();
                    if (inputSession != null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                        TextFieldDelegate.Companion.onEditCommand$foundation_release(a00.h0.Q(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)), coreTextFieldSemanticsModifierNode.getState().getProcessor(), coreTextFieldSemanticsModifierNode.getState().getOnValueChange(), inputSession);
                        g2Var = g2.f100423a;
                    } else {
                        g2Var = null;
                    }
                    if (g2Var == null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = CoreTextFieldSemanticsModifierNode.this;
                        coreTextFieldSemanticsModifierNode2.getState().getOnValueChange().invoke(new TextFieldValue(u30.k0.d5(coreTextFieldSemanticsModifierNode2.getValue().getText(), TextRange.m4559getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().m4807getSelectiond9O1mEE()), TextRange.m4554getEndimpl(coreTextFieldSemanticsModifierNode2.getValue().m4807getSelectiond9O1mEE()), annotatedString).toString(), TextRangeKt.TextRange(TextRange.m4559getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().m4807getSelectiond9O1mEE()) + annotatedString.length()), (TextRange) null, 4, (kotlin.jvm.internal.v) null));
                    }
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new x00.q<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$5
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i11, int i12, boolean z12) {
                if (!z12) {
                    i11 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i11);
                }
                if (!z12) {
                    i12 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i12);
                }
                boolean z13 = false;
                if (CoreTextFieldSemanticsModifierNode.this.getEnabled() && (i11 != TextRange.m4559getStartimpl(CoreTextFieldSemanticsModifierNode.this.getValue().m4807getSelectiond9O1mEE()) || i12 != TextRange.m4554getEndimpl(CoreTextFieldSemanticsModifierNode.this.getValue().m4807getSelectiond9O1mEE()))) {
                    if (Math.min(i11, i12) < 0 || Math.max(i11, i12) > CoreTextFieldSemanticsModifierNode.this.getValue().getAnnotatedString().length()) {
                        CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                    } else {
                        if (z12 || i11 == i12) {
                            CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                        } else {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                        }
                        CoreTextFieldSemanticsModifierNode.this.getState().getOnValueChange().invoke(new TextFieldValue(CoreTextFieldSemanticsModifierNode.this.getValue().getAnnotatedString(), TextRangeKt.TextRange(i11, i12), (TextRange) null, 4, (kotlin.jvm.internal.v) null));
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
            }
        }, 1, null);
        SemanticsPropertiesKt.m4339onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.m4754getImeActioneUduSuo(), null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getState().getOnImeActionPerformed().invoke(ImeAction.m4722boximpl(CoreTextFieldSemanticsModifierNode.this.getImeOptions().m4754getImeActioneUduSuo()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                CoreTextFieldKt.tapToFocus(CoreTextFieldSemanticsModifierNode.this.getState(), CoreTextFieldSemanticsModifierNode.this.getFocusRequester(), !CoreTextFieldSemanticsModifierNode.this.getReadOnly());
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m4553getCollapsedimpl(this.value.m4807getSelectiond9O1mEE()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$9
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    TextFieldSelectionManager.copy$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        CoreTextFieldSemanticsModifierNode.this.getManager().cut$foundation_release();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getManager().paste$foundation_release();
                return Boolean.TRUE;
            }
        }, 1, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m80.k
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @m80.k
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    @m80.k
    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    @m80.k
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @m80.k
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    @m80.k
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    @m80.k
    public final TextFieldValue getValue() {
        return this.value;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public final void setFocusRequester(@m80.k FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setImeOptions(@m80.k ImeOptions imeOptions) {
        this.imeOptions = imeOptions;
    }

    public final void setManager(@m80.k TextFieldSelectionManager textFieldSelectionManager) {
        this.manager = textFieldSelectionManager;
    }

    public final void setOffsetMapping(@m80.k OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setPassword(boolean z11) {
        this.isPassword = z11;
    }

    public final void setReadOnly(boolean z11) {
        this.readOnly = z11;
    }

    public final void setState(@m80.k LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTransformedText(@m80.k TransformedText transformedText) {
        this.transformedText = transformedText;
    }

    public final void setValue(@m80.k TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final void updateNodeSemantics(@m80.k TransformedText transformedText, @m80.k TextFieldValue textFieldValue, @m80.k LegacyTextFieldState legacyTextFieldState, boolean z11, boolean z12, boolean z13, @m80.k OffsetMapping offsetMapping, @m80.k TextFieldSelectionManager textFieldSelectionManager, @m80.k ImeOptions imeOptions, @m80.k FocusRequester focusRequester) {
        boolean z14 = this.enabled;
        boolean z15 = false;
        boolean z16 = z14 && !this.readOnly;
        boolean z17 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager2 = this.manager;
        if (z12 && !z11) {
            z15 = true;
        }
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z11;
        this.enabled = z12;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (z12 != z14 || z15 != z16 || !kotlin.jvm.internal.g0.g(imeOptions, imeOptions2) || z13 != z17 || !TextRange.m4553getCollapsedimpl(textFieldValue.m4807getSelectiond9O1mEE())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (kotlin.jvm.internal.g0.g(textFieldSelectionManager, textFieldSelectionManager2)) {
            return;
        }
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1
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
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }
}
