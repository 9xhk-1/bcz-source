package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class KeyMappingKt {

    @k
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping commonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m3592isCtrlPressedZmokQxo(((KeyEvent) obj).m3577unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1052mapZmokQxo(android.view.KeyEvent keyEvent) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m3594isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m3592isCtrlPressedZmokQxo(keyEvent)) {
                    long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1091getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1092getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1093getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1090getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m3592isCtrlPressedZmokQxo(keyEvent)) {
                    long m3588getKeyZmokQxo2 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1091getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1092getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1093getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1090getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1095getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1089getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1085getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1084getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m3594isShiftPressedZmokQxo(keyEvent)) {
                    long m3588getKeyZmokQxo3 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1098getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1097getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m3591isAltPressedZmokQxo(keyEvent)) {
                    long m3588getKeyZmokQxo4 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo4, mappedKeys4.m1085getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo4, mappedKeys4.m1089getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? KeyMapping.this.mo1052mapZmokQxo(keyEvent) : keyCommand;
            }
        };
    }

    @k
    public static final KeyMapping commonKeyMapping(@k final l<? super KeyEvent, Boolean> lVar) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1052mapZmokQxo(android.view.KeyEvent keyEvent) {
                if (lVar.invoke(KeyEvent.m3571boximpl(keyEvent)).booleanValue() && KeyEvent_androidKt.m3594isShiftPressedZmokQxo(keyEvent)) {
                    if (Key.m3280equalsimpl0(KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m1107getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (lVar.invoke(KeyEvent.m3571boximpl(keyEvent)).booleanValue()) {
                    long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1086getCEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1096getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1104getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1105getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1083getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1106getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, mappedKeys.m1107getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m3592isCtrlPressedZmokQxo(keyEvent)) {
                    return null;
                }
                if (KeyEvent_androidKt.m3594isShiftPressedZmokQxo(keyEvent)) {
                    long m3588getKeyZmokQxo2 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1091getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1092getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1093getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1090getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1101getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1100getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1098getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1097getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, mappedKeys2.m1096getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long m3588getKeyZmokQxo3 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1091getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1092getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1093getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1090getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1101getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1100getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1098getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1097getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1094getEnterEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1099getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1085getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1089getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1102getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1088getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1087getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo3, mappedKeys3.m1103getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @k
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
