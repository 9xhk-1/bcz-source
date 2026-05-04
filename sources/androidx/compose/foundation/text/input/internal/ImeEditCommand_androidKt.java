package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(@m80.k ImeEditCommandScope imeEditCommandScope, @m80.k final String str, final int i11) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$commitText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                TextRange m1179getCompositionMzsxiRA$foundation_release = textFieldBuffer.m1179getCompositionMzsxiRA$foundation_release();
                if (m1179getCompositionMzsxiRA$foundation_release != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m4559getStartimpl(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl()), TextRange.m4554getEndimpl(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl()), str);
                } else {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()), TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()), str);
                }
                int m4559getStartimpl = TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                int i12 = i11;
                textFieldBuffer.m1183setSelection5zctL8(TextRangeKt.TextRange(g10.u.I(i12 > 0 ? (m4559getStartimpl + i12) - 1 : (m4559getStartimpl + i12) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static final void deleteSurroundingText(@m80.k ImeEditCommandScope imeEditCommandScope, final int i11, final int i12) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$deleteSurroundingText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                int i13 = i11;
                boolean z11 = i13 >= 0 && i12 >= 0;
                int i14 = i12;
                if (!z11) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i14 + " respectively.");
                }
                int m4554getEndimpl = TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                int i15 = i12;
                int i16 = m4554getEndimpl + i15;
                if (((m4554getEndimpl ^ i16) & (i15 ^ i16)) < 0) {
                    i16 = textFieldBuffer.getLength();
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()), Math.min(i16, textFieldBuffer.getLength()));
                int m4559getStartimpl = TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                int i17 = i11;
                int i18 = m4559getStartimpl - i17;
                if (((m4559getStartimpl ^ i18) & (i17 ^ m4559getStartimpl)) < 0) {
                    i18 = 0;
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, Math.max(0, i18), TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()));
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(@m80.k ImeEditCommandScope imeEditCommandScope, final int i11, final int i12) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$deleteSurroundingTextInCodePoints$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                boolean isSurrogatePair;
                boolean isSurrogatePair2;
                int i13 = i11;
                int i14 = 0;
                boolean z11 = i13 >= 0 && i12 >= 0;
                int i15 = i12;
                if (!z11) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i13 + " and " + i15 + " respectively.");
                }
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i16 < i11) {
                        int i18 = i17 + 1;
                        if (TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) <= i18) {
                            i17 = TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                            break;
                        } else {
                            isSurrogatePair2 = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) - i18) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) - i18));
                            i17 = isSurrogatePair2 ? i17 + 2 : i18;
                            i16++;
                        }
                    } else {
                        break;
                    }
                }
                int i19 = 0;
                while (true) {
                    if (i14 >= i12) {
                        break;
                    }
                    int i21 = i19 + 1;
                    if (TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) + i21 >= textFieldBuffer.getLength()) {
                        i19 = textFieldBuffer.getLength() - TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                        break;
                    } else {
                        isSurrogatePair = ImeEditCommand_androidKt.isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) + i21) - 1), textFieldBuffer.asCharSequence().charAt(TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) + i21));
                        i19 = isSurrogatePair ? i19 + 2 : i21;
                        i14++;
                    }
                }
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()), TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) + i19);
                ImeEditCommand_androidKt.imeDelete(textFieldBuffer, TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()) - i17, TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE()));
            }
        });
    }

    public static final void finishComposingText(@m80.k ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$finishComposingText$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                textFieldBuffer.commitComposition$foundation_release();
            }
        });
    }

    @VisibleForTesting
    public static final void imeDelete(@m80.k TextFieldBuffer textFieldBuffer, int i11, int i12) {
        TextRange m1179getCompositionMzsxiRA$foundation_release = textFieldBuffer.m1179getCompositionMzsxiRA$foundation_release();
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        TextFieldBufferKt.delete(textFieldBuffer, min, max);
        if (m1179getCompositionMzsxiRA$foundation_release != null) {
            m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl();
            long m1187adjustTextRangevJH6DeI = TextFieldBufferKt.m1187adjustTextRangevJH6DeI(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl(), min, max, 0);
            if (TextRange.m4553getCollapsedimpl(m1187adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, TextRange.m4557getMinimpl(m1187adjustTextRangevJH6DeI), TextRange.m4556getMaximpl(m1187adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r6.commitComposition$foundation_release();
        r6.clearHighlight$foundation_release();
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void imeReplace(@m80.k androidx.compose.foundation.text.input.TextFieldBuffer r6, int r7, int r8, @m80.k java.lang.CharSequence r9) {
        /*
            int r0 = java.lang.Math.min(r7, r8)
            int r7 = java.lang.Math.max(r7, r8)
            r8 = 0
            r1 = r0
        La:
            if (r1 >= r7) goto L25
            int r2 = r9.length()
            if (r8 >= r2) goto L25
            char r2 = r9.charAt(r8)
            java.lang.CharSequence r3 = r6.asCharSequence()
            char r3 = r3.charAt(r1)
            if (r2 != r3) goto L25
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto La
        L25:
            int r2 = r9.length()
        L29:
            if (r7 <= r1) goto L44
            if (r2 <= r8) goto L44
            int r3 = r2 + (-1)
            char r3 = r9.charAt(r3)
            java.lang.CharSequence r4 = r6.asCharSequence()
            int r5 = r7 + (-1)
            char r4 = r4.charAt(r5)
            if (r3 != r4) goto L44
            int r2 = r2 + (-1)
            int r7 = r7 + (-1)
            goto L29
        L44:
            if (r1 != r7) goto L50
            if (r8 == r2) goto L49
            goto L50
        L49:
            r6.commitComposition$foundation_release()
            r6.clearHighlight$foundation_release()
            goto L57
        L50:
            java.lang.CharSequence r8 = r9.subSequence(r8, r2)
            r6.replace(r1, r7, r8)
        L57:
            int r7 = r9.length()
            int r0 = r0 + r7
            long r7 = androidx.compose.ui.text.TextRangeKt.TextRange(r0)
            r6.m1183setSelection5zctL8(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.imeReplace(androidx.compose.foundation.text.input.TextFieldBuffer, int, int, java.lang.CharSequence):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c11, char c12) {
        return Character.isHighSurrogate(c11) && Character.isLowSurrogate(c12);
    }

    public static final void setComposingRegion(@m80.k ImeEditCommandScope imeEditCommandScope, final int i11, final int i12) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setComposingRegion$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                if (textFieldBuffer.hasComposition$foundation_release()) {
                    textFieldBuffer.commitComposition$foundation_release();
                }
                int I = g10.u.I(i11, 0, textFieldBuffer.getLength());
                int I2 = g10.u.I(i12, 0, textFieldBuffer.getLength());
                if (I != I2) {
                    if (I < I2) {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, I, I2, null, 4, null);
                    } else {
                        TextFieldBuffer.setComposition$foundation_release$default(textFieldBuffer, I2, I, null, 4, null);
                    }
                }
            }
        });
    }

    public static final void setComposingText(@m80.k ImeEditCommandScope imeEditCommandScope, @m80.k final String str, final int i11, @m80.l final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setComposingText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                TextRange m1179getCompositionMzsxiRA$foundation_release = textFieldBuffer.m1179getCompositionMzsxiRA$foundation_release();
                if (m1179getCompositionMzsxiRA$foundation_release != null) {
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, TextRange.m4559getStartimpl(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl()), TextRange.m4554getEndimpl(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(TextRange.m4559getStartimpl(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl()), TextRange.m4559getStartimpl(m1179getCompositionMzsxiRA$foundation_release.m4563unboximpl()) + str.length(), list);
                    }
                } else {
                    int m4559getStartimpl = TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                    ImeEditCommand_androidKt.imeReplace(textFieldBuffer, m4559getStartimpl, TextRange.m4554getEndimpl(textFieldBuffer.m1181getSelectiond9O1mEE()), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation_release(m4559getStartimpl, str.length() + m4559getStartimpl, list);
                    }
                }
                int m4559getStartimpl2 = TextRange.m4559getStartimpl(textFieldBuffer.m1181getSelectiond9O1mEE());
                int i12 = i11;
                textFieldBuffer.m1183setSelection5zctL8(TextRangeKt.TextRange(g10.u.I(i12 > 0 ? (m4559getStartimpl2 + i12) - 1 : (m4559getStartimpl2 + i12) - str.length(), 0, textFieldBuffer.getLength())));
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i11, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i11, list);
    }

    public static final void setSelection(@m80.k final ImeEditCommandScope imeEditCommandScope, final int i11, final int i12) {
        imeEditCommandScope.edit(new x00.l<TextFieldBuffer, g2>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$setSelection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer textFieldBuffer) {
                long mo1218mapToTransformedGEjPoXI = ImeEditCommandScope.this.mo1218mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
                int i13 = i11;
                int m4557getMinimpl = TextRange.m4557getMinimpl(mo1218mapToTransformedGEjPoXI);
                int m4556getMaximpl = TextRange.m4556getMaximpl(mo1218mapToTransformedGEjPoXI);
                if (i13 < m4557getMinimpl) {
                    i13 = m4557getMinimpl;
                }
                if (i13 <= m4556getMaximpl) {
                    m4556getMaximpl = i13;
                }
                int i14 = i12;
                int m4557getMinimpl2 = TextRange.m4557getMinimpl(mo1218mapToTransformedGEjPoXI);
                int m4556getMaximpl2 = TextRange.m4556getMaximpl(mo1218mapToTransformedGEjPoXI);
                if (i14 < m4557getMinimpl2) {
                    i14 = m4557getMinimpl2;
                }
                if (i14 <= m4556getMaximpl2) {
                    m4556getMaximpl2 = i14;
                }
                textFieldBuffer.m1183setSelection5zctL8(ImeEditCommandScope.this.mo1217mapFromTransformedGEjPoXI(TextRangeKt.TextRange(m4556getMaximpl, m4556getMaximpl2)));
            }
        });
    }
}
