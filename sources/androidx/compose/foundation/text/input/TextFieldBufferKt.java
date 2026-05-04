package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import g10.u;
import m80.k;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m1187adjustTextRangevJH6DeI(long r2, int r4, int r5, int r6) {
        /*
            int r0 = androidx.compose.ui.text.TextRange.m4557getMinimpl(r2)
            int r1 = androidx.compose.ui.text.TextRange.m4556getMaximpl(r2)
            if (r1 >= r4) goto Lb
            return r2
        Lb:
            if (r0 > r4) goto L17
            if (r5 > r1) goto L17
            int r5 = r5 - r4
            int r6 = r6 - r5
            if (r0 != r1) goto L14
            goto L22
        L14:
            int r4 = r1 + r6
            goto L2b
        L17:
            if (r0 <= r4) goto L1e
            if (r1 >= r5) goto L1e
            int r4 = r4 + r6
            r0 = r4
            goto L2b
        L1e:
            if (r0 < r5) goto L24
            int r5 = r5 - r4
            int r6 = r6 - r5
        L22:
            int r0 = r0 + r6
            goto L14
        L24:
            if (r4 >= r0) goto L2b
            int r0 = r4 + r6
            int r5 = r5 - r4
            int r6 = r6 - r5
            goto L14
        L2b:
            long r2 = androidx.compose.ui.text.TextRangeKt.TextRange(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldBufferKt.m1187adjustTextRangevJH6DeI(long, int, int, int):long");
    }

    public static final void delete(@k TextFieldBuffer textFieldBuffer, int i11, int i12) {
        textFieldBuffer.replace(i11, i12, "");
    }

    public static final void findCommonPrefixAndSuffix(@k CharSequence charSequence, @k CharSequence charSequence2, @k r<? super Integer, ? super Integer, ? super Integer, ? super Integer, g2> rVar) {
        int i11;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i12 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i11 = 0;
        } else {
            int i13 = 0;
            i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i12 == 0) {
                    if (charSequence.charAt(i13) == charSequence2.charAt(i11)) {
                        i13++;
                        i11++;
                    } else {
                        i12 = 1;
                    }
                }
                if (!z11) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z11 = true;
                    }
                }
                if (i13 >= length || i11 >= length2 || (i12 != 0 && z11)) {
                    break;
                }
            }
            i12 = i13;
        }
        if (i12 < length || i11 < length2) {
            rVar.invoke(Integer.valueOf(i12), Integer.valueOf(length), Integer.valueOf(i11), Integer.valueOf(length2));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(@k TextFieldBuffer.ChangeList changeList, @k p<? super TextRange, ? super TextRange, g2> pVar) {
        for (int i11 = 0; i11 < changeList.getChangeCount(); i11++) {
            pVar.invoke(TextRange.m4547boximpl(changeList.mo1186getRangejx7JFs(i11)), TextRange.m4547boximpl(changeList.mo1185getOriginalRangejx7JFs(i11)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(@k TextFieldBuffer.ChangeList changeList, @k p<? super TextRange, ? super TextRange, g2> pVar) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            pVar.invoke(TextRange.m4547boximpl(changeList.mo1186getRangejx7JFs(changeCount)), TextRange.m4547boximpl(changeList.mo1185getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(@k TextFieldBuffer textFieldBuffer, int i11, @k String str) {
        textFieldBuffer.replace(i11, i11, str);
    }

    public static final void placeCursorAtEnd(@k TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(@k TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m1183setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(@k TextFieldBuffer textFieldBuffer, int i11, int i12) {
        textFieldBuffer.m1183setSelection5zctL8(TextRangeKt.TextRange(u.I(i11, 0, textFieldBuffer.getLength()), u.I(i12, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = i11;
        }
        setSelectionCoerced(textFieldBuffer, i11, i12);
    }
}
