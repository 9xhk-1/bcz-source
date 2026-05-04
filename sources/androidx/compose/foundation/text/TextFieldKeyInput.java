package androidx.compose.foundation.text;

import a00.r0;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final boolean editable;
    private final int imeAction;

    @k
    private final DeadKeyCombiner keyCombiner;

    @k
    private final KeyMapping keyMapping;

    @k
    private final OffsetMapping offsetMapping;

    @k
    private final l<TextFieldValue, g2> onValueChange;

    @k
    private final TextPreparedSelectionState preparedSelectionState;

    @k
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;

    @k
    private final LegacyTextFieldState state;

    @m80.l
    private final UndoManager undoManager;

    @k
    private final TextFieldValue value;

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z11, boolean z12, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l lVar, int i11, v vVar) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z11, z12, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, lVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        List<? extends EditCommand> d62 = r0.d6(list);
        d62.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(d62));
    }

    private final void commandExecutionContext(l<? super TextFieldPreparedSelection, g2> lVar) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        lVar.invoke(textFieldPreparedSelection);
        if (TextRange.m4552equalsimpl0(textFieldPreparedSelection.m1432getSelectiond9O1mEE(), this.value.m4807getSelectiond9O1mEE()) && g0.g(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m1148typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer m1050consumeZmokQxo;
        if (TextFieldKeyInput_androidKt.m1153isTypedEventZmokQxo(keyEvent) && (m1050consumeZmokQxo = this.keyCombiner.m1050consumeZmokQxo(keyEvent)) != null) {
            return new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), m1050consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @k
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @k
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @k
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @k
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    @m80.l
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @k
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m1149processZmokQxo(@k KeyEvent keyEvent) {
        final KeyCommand mo1052mapZmokQxo;
        CommitTextCommand m1148typedCommandZmokQxo = m1148typedCommandZmokQxo(keyEvent);
        if (m1148typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(m1148typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY()) || (mo1052mapZmokQxo = this.keyMapping.mo1052mapZmokQxo(keyEvent)) == null || (mo1052mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        commandExecutionContext(new l<TextFieldPreparedSelection, g2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                invoke2(textFieldPreparedSelection);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection) {
                int i11;
                TextFieldValue undo;
                l lVar;
                TextFieldValue redo;
                l lVar2;
                switch (WhenMappings.$EnumSwitchMapping$0[KeyCommand.this.ordinal()]) {
                    case 1:
                        this.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        this.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        this.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        textFieldPreparedSelection.collapseLeftOr(new l<TextFieldPreparedSelection, g2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorLeft();
                            }
                        });
                        break;
                    case 5:
                        textFieldPreparedSelection.collapseRightOr(new l<TextFieldPreparedSelection, g2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                invoke2(textFieldPreparedSelection2);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorRight();
                            }
                        });
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorLeftByWord();
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorRightByWord();
                        break;
                    case 8:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        break;
                    case 10:
                        textFieldPreparedSelection.moveCursorUpByLine();
                        break;
                    case 11:
                        textFieldPreparedSelection.moveCursorDownByLine();
                        break;
                    case 12:
                        textFieldPreparedSelection.moveCursorUpByPage();
                        break;
                    case 13:
                        textFieldPreparedSelection.moveCursorDownByPage();
                        break;
                    case 14:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        break;
                    case 15:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        break;
                    case 16:
                        textFieldPreparedSelection.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        textFieldPreparedSelection.moveCursorToLineRightSide();
                        break;
                    case 18:
                        textFieldPreparedSelection.moveCursorToHome();
                        break;
                    case 19:
                        textFieldPreparedSelection.moveCursorToEnd();
                        break;
                    case 20:
                        List<EditCommand> deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // x00.l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                return new DeleteSurroundingTextCommand(TextRange.m4554getEndimpl(textFieldPreparedSelection2.m1432getSelectiond9O1mEE()) - textFieldPreparedSelection2.getPrecedingCharacterIndex(), 0);
                            }
                        });
                        if (deleteIfSelectedOr != null) {
                            this.apply((List<? extends EditCommand>) deleteIfSelectedOr);
                            break;
                        }
                        break;
                    case 21:
                        List<EditCommand> deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // x00.l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                int nextCharacterIndex = textFieldPreparedSelection2.getNextCharacterIndex();
                                if (nextCharacterIndex != -1) {
                                    return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m4554getEndimpl(textFieldPreparedSelection2.m1432getSelectiond9O1mEE()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr2 != null) {
                            this.apply((List<? extends EditCommand>) deleteIfSelectedOr2);
                            break;
                        }
                        break;
                    case 22:
                        List<EditCommand> deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // x00.l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer previousWordOffset = textFieldPreparedSelection2.getPreviousWordOffset();
                                if (previousWordOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m4554getEndimpl(textFieldPreparedSelection2.m1432getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
                            }
                        });
                        if (deleteIfSelectedOr3 != null) {
                            this.apply((List<? extends EditCommand>) deleteIfSelectedOr3);
                            break;
                        }
                        break;
                    case 23:
                        List<EditCommand> deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // x00.l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer nextWordOffset = textFieldPreparedSelection2.getNextWordOffset();
                                if (nextWordOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m4554getEndimpl(textFieldPreparedSelection2.m1432getSelectiond9O1mEE()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr4 != null) {
                            this.apply((List<? extends EditCommand>) deleteIfSelectedOr4);
                            break;
                        }
                        break;
                    case 24:
                        List<EditCommand> deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // x00.l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer lineStartByOffset = textFieldPreparedSelection2.getLineStartByOffset();
                                if (lineStartByOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m4554getEndimpl(textFieldPreparedSelection2.m1432getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
                            }
                        });
                        if (deleteIfSelectedOr5 != null) {
                            this.apply((List<? extends EditCommand>) deleteIfSelectedOr5);
                            break;
                        }
                        break;
                    case 25:
                        List<EditCommand> deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new l<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // x00.l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer lineEndByOffset = textFieldPreparedSelection2.getLineEndByOffset();
                                if (lineEndByOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m4554getEndimpl(textFieldPreparedSelection2.m1432getSelectiond9O1mEE()));
                                }
                                return null;
                            }
                        });
                        if (deleteIfSelectedOr6 != null) {
                            this.apply((List<? extends EditCommand>) deleteIfSelectedOr6);
                            break;
                        }
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\n", 1));
                            break;
                        } else {
                            l<ImeAction, g2> onImeActionPerformed = this.getState().getOnImeActionPerformed();
                            i11 = this.imeAction;
                            onImeActionPerformed.invoke(ImeAction.m4722boximpl(i11));
                            break;
                        }
                    case 27:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\t", 1));
                            break;
                        } else {
                            booleanRef.element = false;
                            break;
                        }
                    case 28:
                        textFieldPreparedSelection.selectAll();
                        break;
                    case 29:
                        textFieldPreparedSelection.moveCursorLeft().selectMovement();
                        break;
                    case 30:
                        textFieldPreparedSelection.moveCursorRight().selectMovement();
                        break;
                    case 31:
                        textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                        break;
                    case 32:
                        textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                        break;
                    case 33:
                        textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                        break;
                    case 34:
                        textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                        break;
                    case 35:
                        textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                        break;
                    case 36:
                        textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                        break;
                    case 37:
                        textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                        break;
                    case 38:
                        textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                        break;
                    case 39:
                        textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                        break;
                    case 40:
                        textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                        break;
                    case 41:
                        textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                        break;
                    case 42:
                        textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                        break;
                    case 43:
                        textFieldPreparedSelection.moveCursorToHome().selectMovement();
                        break;
                    case 44:
                        textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                        break;
                    case 45:
                        textFieldPreparedSelection.deselect();
                        break;
                    case 46:
                        UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                        }
                        UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (undo = undoManager2.undo()) != null) {
                            lVar = this.onValueChange;
                            lVar.invoke(undo);
                            break;
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (redo = undoManager3.redo()) != null) {
                            lVar2 = this.onValueChange;
                            lVar2.invoke(redo);
                            break;
                        }
                        break;
                    case 48:
                        KeyEventHelpers_androidKt.showCharacterPalette();
                        break;
                }
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return booleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z11, boolean z12, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l<? super TextFieldValue, g2> lVar, int i11) {
        this.state = legacyTextFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z11;
        this.singleLine = z12;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = lVar;
        this.imeAction = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        apply(a00.g0.l(editCommand));
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z11, boolean z12, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, l lVar, int i11, int i12, v vVar) {
        this(legacyTextFieldState, textFieldSelectionManager, (i12 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (v) null) : textFieldValue, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, textPreparedSelectionState, (i12 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i12 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i12 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i12 & 1024) != 0 ? new l<TextFieldValue, g2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue2) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldValue textFieldValue2) {
                invoke2(textFieldValue2);
                return g2.f100423a;
            }
        } : lVar, i11, null);
    }
}
