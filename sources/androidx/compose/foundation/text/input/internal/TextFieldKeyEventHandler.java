package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,294:1\n247#1,27:296\n1#2:295\n61#3:323\n70#4:324\n22#5:325\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n160#1:296,27\n289#1:323\n289#1:324\n289#1:325\n*E\n"})
/* loaded from: classes.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @m80.l
    private MutableLongSet currentlyConsumedDownKeys;

    @m80.k
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();

    @m80.k
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();

    @m80.k
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final float getVisibleTextLayoutHeight(TextLayoutState textLayoutState) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return Float.NaN;
        }
        Rect rect = null;
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return Float.NaN;
        }
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            if (!decoratorNodeCoordinates.isAttached()) {
                decoratorNodeCoordinates = null;
            }
            if (decoratorNodeCoordinates != null) {
                rect = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
            }
        }
        if (rect != null) {
            return Float.intBitsToFloat((int) (rect.m2301getSizeNHjbRc() & 4294967295L));
        }
        return Float.NaN;
    }

    private final void preparedSelectionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, boolean z11, x00.l<? super TextFieldPreparedSelection, g2> lVar) {
        WedgeAffinity wedgeAffinity;
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, textLayoutState.getLayoutResult(), z11, getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
        lVar.invoke(textFieldPreparedSelection);
        if (!TextRange.m4552equalsimpl0(textFieldPreparedSelection.m1351getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().m1189getSelectiond9O1mEE())) {
            transformedTextFieldState.m1317selectCharsIn5zctL8(textFieldPreparedSelection.m1351getSelectiond9O1mEE());
        }
        if (textFieldPreparedSelection.getWedgeAffinity() == null || (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) == null) {
            return;
        }
        if (TextRange.m4553getCollapsedimpl(transformedTextFieldState.getUntransformedText().m1189getSelectiond9O1mEE())) {
            transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
        } else {
            transformedTextFieldState.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: processKeyDownEvent-ZcWbMB8, reason: not valid java name */
    private final boolean m1287processKeyDownEventZcWbMB8(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, x00.l<? super KeyCommand, ? extends g2> lVar, boolean z11, boolean z12, x00.a<g2> aVar) {
        WedgeAffinity wedgeAffinity;
        Integer m1050consumeZmokQxo;
        boolean z13 = false;
        if (TextFieldKeyInput_androidKt.m1153isTypedEventZmokQxo(keyEvent) && (m1050consumeZmokQxo = this.deadKeyCombiner.m1050consumeZmokQxo(keyEvent)) != null) {
            String sb2 = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), m1050consumeZmokQxo.intValue()).toString();
            if (!z11) {
                return false;
            }
            TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, sb2, true, null, !TextFieldKeyEventHandler_androidKt.m1289isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        KeyCommand mo1052mapZmokQxo = this.keyMapping.mo1052mapZmokQxo(keyEvent);
        if (mo1052mapZmokQxo != null && (!mo1052mapZmokQxo.getEditsText() || z11)) {
            TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, textLayoutState.getLayoutResult(), TextFieldKeyEventHandler_androidKt.m1289isFromSoftKeyboardZmokQxo(keyEvent), getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
            switch (WhenMappings.$EnumSwitchMapping$0[mo1052mapZmokQxo.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    lVar.invoke(mo1052mapZmokQxo);
                    z13 = true;
                    break;
                case 4:
                    textFieldPreparedSelection.collapseLeftOr(new x00.l<TextFieldPreparedSelection, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$1
                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            invoke2(textFieldPreparedSelection2);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.moveCursorLeftByChar();
                        }
                    });
                    z13 = true;
                    break;
                case 5:
                    textFieldPreparedSelection.collapseRightOr(new x00.l<TextFieldPreparedSelection, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$2
                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            invoke2(textFieldPreparedSelection2);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.moveCursorRightByChar();
                        }
                    });
                    z13 = true;
                    break;
                case 6:
                    textFieldPreparedSelection.moveCursorLeftByWord();
                    z13 = true;
                    break;
                case 7:
                    textFieldPreparedSelection.moveCursorRightByWord();
                    z13 = true;
                    break;
                case 8:
                    textFieldPreparedSelection.moveCursorPrevByParagraph();
                    z13 = true;
                    break;
                case 9:
                    textFieldPreparedSelection.moveCursorNextByParagraph();
                    z13 = true;
                    break;
                case 10:
                    textFieldPreparedSelection.moveCursorUpByLine();
                    z13 = true;
                    break;
                case 11:
                    textFieldPreparedSelection.moveCursorDownByLine();
                    z13 = true;
                    break;
                case 12:
                    textFieldPreparedSelection.moveCursorUpByPage();
                    z13 = true;
                    break;
                case 13:
                    textFieldPreparedSelection.moveCursorDownByPage();
                    z13 = true;
                    break;
                case 14:
                    textFieldPreparedSelection.moveCursorToLineStart();
                    z13 = true;
                    break;
                case 15:
                    textFieldPreparedSelection.moveCursorToLineEnd();
                    z13 = true;
                    break;
                case 16:
                    textFieldPreparedSelection.moveCursorToLineLeftSide();
                    z13 = true;
                    break;
                case 17:
                    textFieldPreparedSelection.moveCursorToLineRightSide();
                    z13 = true;
                    break;
                case 18:
                    textFieldPreparedSelection.moveCursorToHome();
                    z13 = true;
                    break;
                case 19:
                    textFieldPreparedSelection.moveCursorToEnd();
                    z13 = true;
                    break;
                case 20:
                    textFieldPreparedSelection.moveCursorPrevByChar().deleteMovement();
                    z13 = true;
                    break;
                case 21:
                    textFieldPreparedSelection.moveCursorNextByChar().deleteMovement();
                    z13 = true;
                    break;
                case 22:
                    textFieldPreparedSelection.moveCursorPrevByWord().deleteMovement();
                    z13 = true;
                    break;
                case 23:
                    textFieldPreparedSelection.moveCursorNextByWord().deleteMovement();
                    z13 = true;
                    break;
                case 24:
                    textFieldPreparedSelection.moveCursorToLineStart().deleteMovement();
                    z13 = true;
                    break;
                case 25:
                    textFieldPreparedSelection.moveCursorToLineEnd().deleteMovement();
                    z13 = true;
                    break;
                case 26:
                    if (z12) {
                        aVar.invoke();
                    } else {
                        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\n", true, null, !TextFieldKeyEventHandler_androidKt.m1289isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
                    }
                    z13 = true;
                    break;
                case 27:
                    if (!z12) {
                        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\t", true, null, !TextFieldKeyEventHandler_androidKt.m1289isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
                        z13 = true;
                        break;
                    }
                    break;
                case 28:
                    textFieldPreparedSelection.selectAll();
                    z13 = true;
                    break;
                case 29:
                    textFieldPreparedSelection.moveCursorLeftByChar().selectMovement();
                    z13 = true;
                    break;
                case 30:
                    textFieldPreparedSelection.moveCursorRightByChar().selectMovement();
                    z13 = true;
                    break;
                case 31:
                    textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                    z13 = true;
                    break;
                case 32:
                    textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                    z13 = true;
                    break;
                case 33:
                    textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                    z13 = true;
                    break;
                case 34:
                    textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                    z13 = true;
                    break;
                case 35:
                    textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                    z13 = true;
                    break;
                case 36:
                    textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                    z13 = true;
                    break;
                case 37:
                    textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                    z13 = true;
                    break;
                case 38:
                    textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                    z13 = true;
                    break;
                case 39:
                    textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                    z13 = true;
                    break;
                case 40:
                    textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                    z13 = true;
                    break;
                case 41:
                    textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                    z13 = true;
                    break;
                case 42:
                    textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                    z13 = true;
                    break;
                case 43:
                    textFieldPreparedSelection.moveCursorToHome().selectMovement();
                    z13 = true;
                    break;
                case 44:
                    textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                    z13 = true;
                    break;
                case 45:
                    textFieldPreparedSelection.deselect();
                    z13 = true;
                    break;
                case 46:
                    transformedTextFieldState.undo();
                    z13 = true;
                    break;
                case 47:
                    transformedTextFieldState.redo();
                    z13 = true;
                    break;
                case 48:
                    KeyEventHelpers_androidKt.showCharacterPalette();
                    z13 = true;
                    break;
                default:
                    z13 = true;
                    break;
            }
            if (!TextRange.m4552equalsimpl0(textFieldPreparedSelection.m1351getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().m1189getSelectiond9O1mEE())) {
                transformedTextFieldState.m1317selectCharsIn5zctL8(textFieldPreparedSelection.m1351getSelectiond9O1mEE());
            }
            if (textFieldPreparedSelection.getWedgeAffinity() != null && (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) != null) {
                if (TextRange.m4553getCollapsedimpl(transformedTextFieldState.getUntransformedText().m1189getSelectiond9O1mEE())) {
                    transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
                    return z13;
                }
                transformedTextFieldState.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
            }
        }
        return z13;
    }

    /* renamed from: onKeyEvent-CJ9ybgU */
    public boolean mo1215onKeyEventCJ9ybgU(@m80.k KeyEvent keyEvent, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k x00.l<? super KeyCommand, ? extends g2> lVar, boolean z11, boolean z12, @m80.k x00.a<g2> aVar) {
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        int m3589getTypeZmokQxo = KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m3581equalsimpl0(m3589getTypeZmokQxo, companion.m3586getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet = this.currentlyConsumedDownKeys;
            if (mutableLongSet == null || !mutableLongSet.contains(m3588getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet2 = this.currentlyConsumedDownKeys;
            if (mutableLongSet2 != null) {
                mutableLongSet2.remove(m3588getKeyZmokQxo);
            }
            return true;
        }
        if (KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), companion.m3587getUnknownCS__XNY()) && !TextFieldKeyInput_androidKt.m1153isTypedEventZmokQxo(keyEvent)) {
            return false;
        }
        boolean m1287processKeyDownEventZcWbMB8 = m1287processKeyDownEventZcWbMB8(keyEvent, transformedTextFieldState, textLayoutState, lVar, z11, z12, aVar);
        if (m1287processKeyDownEventZcWbMB8) {
            MutableLongSet mutableLongSet3 = this.currentlyConsumedDownKeys;
            if (mutableLongSet3 == null) {
                mutableLongSet3 = new MutableLongSet(3);
                this.currentlyConsumedDownKeys = mutableLongSet3;
            }
            mutableLongSet3.plusAssign(m3588getKeyZmokQxo);
        }
        return m1287processKeyDownEventZcWbMB8;
    }

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo1216onPreKeyEventMyFupTE(@m80.k KeyEvent keyEvent, @m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.k FocusManager focusManager, @m80.k SoftwareKeyboardController softwareKeyboardController) {
        if (TextRange.m4553getCollapsedimpl(transformedTextFieldState.getVisualText().m1189getSelectiond9O1mEE()) || !KeyEventHelpers_androidKt.m1051cancelsTextSelectionZmokQxo(keyEvent)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }
}
