package androidx.compose.ui.text;

import a00.h0;
import a00.r0;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1227:1\n1092#1,11:1236\n1092#1,11:1255\n1092#1,11:1266\n114#2,8:1228\n114#2,8:1247\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1022#1:1236,11\n1048#1:1255,11\n1082#1:1266,11\n1018#1:1228,8\n1029#1:1247,8\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, l<? super T, Integer> lVar) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int intValue = lVar.invoke(list.get(i12)).intValue();
            if (intValue < 0) {
                i11 = i12 + 1;
            } else {
                if (intValue <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int findParagraphByIndex(@k List<ParagraphInfo> list, int i11) {
        int i12;
        int endIndex = ((ParagraphInfo) r0.u3(list)).getEndIndex();
        boolean z11 = false;
        if (!(i11 <= ((ParagraphInfo) r0.u3(list)).getEndIndex())) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i11 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i12 = -(i13 + 1);
                break;
            }
            i12 = (i13 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i12);
            char c11 = paragraphInfo.getStartIndex() > i11 ? (char) 1 : paragraphInfo.getEndIndex() <= i11 ? (char) 65535 : (char) 0;
            if (c11 >= 0) {
                if (c11 <= 0) {
                    break;
                }
                size = i12 - 1;
            } else {
                i13 = i12 + 1;
            }
        }
        if (i12 >= 0 && i12 < list.size()) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("Found paragraph index " + i12 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i11 + ", paragraphs=[" + ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new l<ParagraphInfo, CharSequence>() { // from class: androidx.compose.ui.text.MultiParagraphKt$findParagraphByIndex$2$1
                @Override // x00.l
                public final CharSequence invoke(ParagraphInfo paragraphInfo2) {
                    return '[' + paragraphInfo2.getStartIndex() + j2.O + paragraphInfo2.getEndIndex() + ')';
                }
            }, 31, null) + l50.b.f69930l);
        }
        return i12;
    }

    public static final int findParagraphByLineIndex(@k List<ParagraphInfo> list, int i11) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i13);
            char c11 = paragraphInfo.getStartLineIndex() > i11 ? (char) 1 : paragraphInfo.getEndLineIndex() <= i11 ? (char) 65535 : (char) 0;
            if (c11 < 0) {
                i12 = i13 + 1;
            } else {
                if (c11 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int findParagraphByY(@k List<ParagraphInfo> list, float f11) {
        if (f11 <= 0.0f) {
            return 0;
        }
        if (f11 >= ((ParagraphInfo) r0.u3(list)).getBottom()) {
            return h0.L(list);
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i12);
            char c11 = paragraphInfo.getTop() > f11 ? (char) 1 : paragraphInfo.getBottom() <= f11 ? (char) 65535 : (char) 0;
            if (c11 < 0) {
                i11 = i12 + 1;
            } else {
                if (c11 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m4416findParagraphsByRangeSbBc2M(@k List<ParagraphInfo> list, long j11, @k l<? super ParagraphInfo, g2> lVar) {
        int size = list.size();
        for (int findParagraphByIndex = findParagraphByIndex(list, TextRange.m4557getMinimpl(j11)); findParagraphByIndex < size; findParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(findParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m4556getMaximpl(j11)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                lVar.invoke(paragraphInfo);
            }
        }
    }
}
