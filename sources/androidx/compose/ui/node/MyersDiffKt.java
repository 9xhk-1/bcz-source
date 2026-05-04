package androidx.compose.ui.node;

import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n1#1,518:1\n375#1:528\n375#1:529\n329#2:519\n318#2:520\n310#2:521\n322#2:522\n314#2:523\n310#2:524\n314#2:525\n318#2:526\n322#2:527\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n203#1:528\n270#1:529\n75#1:519\n75#1:520\n75#1:521\n75#1:522\n75#1:523\n82#1:524\n84#1:525\n89#1:526\n91#1:527\n*E\n"})
/* loaded from: classes2.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < intStack.getSize()) {
            int i14 = i11 + 2;
            int i15 = intStack.get(i11) - intStack.get(i14);
            int i16 = intStack.get(i11 + 1) - intStack.get(i14);
            int i17 = intStack.get(i14);
            i11 += 3;
            while (i12 < i15) {
                diffCallback.remove(i13, i12);
                i12++;
            }
            while (i13 < i16) {
                diffCallback.insert(i13);
                i13++;
            }
            while (true) {
                int i18 = i17 - 1;
                if (i17 > 0) {
                    diffCallback.same(i12, i13);
                    i12++;
                    i13++;
                    i17 = i18;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m4075backward4l5_RBY(int i11, int i12, int i13, int i14, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        int m3969getimpl;
        int i16;
        int i17;
        int i18 = (i12 - i11) - (i14 - i13);
        boolean z11 = (i18 & 1) == 0;
        int i19 = -i15;
        for (int i21 = i19; i21 <= i15; i21 += 2) {
            if (i21 == i19 || (i21 != i15 && CenteredArray.m3969getimpl(iArr2, i21 + 1) < CenteredArray.m3969getimpl(iArr2, i21 - 1))) {
                m3969getimpl = CenteredArray.m3969getimpl(iArr2, i21 + 1);
                i16 = m3969getimpl;
            } else {
                m3969getimpl = CenteredArray.m3969getimpl(iArr2, i21 - 1);
                i16 = m3969getimpl - 1;
            }
            int i22 = i14 - ((i12 - i16) - i21);
            int i23 = ((i15 != 0 ? 1 : 0) & (i16 == m3969getimpl ? 1 : 0)) + i22;
            while (i16 > i11 && i22 > i13) {
                if (!diffCallback.areItemsTheSame(i16 - 1, i22 - 1)) {
                    break;
                }
                i16--;
                i22--;
            }
            CenteredArray.m3972setimpl(iArr2, i21, i16);
            if (z11 && (i17 = i18 - i21) >= i19 && i17 <= i15) {
                if (CenteredArray.m3969getimpl(iArr, i17) >= i16) {
                    fillSnake(i16, i22, m3969getimpl, i23, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i11, int i12, DiffCallback diffCallback) {
        char c11 = 1;
        int i13 = ((i11 + i12) + 1) / 2;
        IntStack intStack = new IntStack(i13 * 3);
        IntStack intStack2 = new IntStack(i13 * 4);
        intStack2.pushRange(0, i11, 0, i12);
        int i14 = (i13 * 2) + 1;
        int[] m3966constructorimpl = CenteredArray.m3966constructorimpl(new int[i14]);
        int[] m3966constructorimpl2 = CenteredArray.m3966constructorimpl(new int[i14]);
        int[] m4183constructorimpl = Snake.m4183constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m4183constructorimpl;
            if (m4077midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m3966constructorimpl, m3966constructorimpl2, m4183constructorimpl)) {
                char c12 = c11;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c11]) > 0) {
                    Snake.m4181addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(pop4, iArr[0], pop2, iArr[c12]);
                intStack2.pushRange(iArr[2], pop3, iArr[3], pop);
                m4183constructorimpl = iArr;
                c11 = c12;
            } else {
                m4183constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i11, i12, 0);
        return intStack;
    }

    public static final void executeDiff(int i11, int i12, @k DiffCallback diffCallback) {
        applyDiff(calculateDiff(i11, i12, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i11, int i12, int i13, int i14, boolean z11, @k int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        iArr[4] = z11 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m4076forward4l5_RBY(int i11, int i12, int i13, int i14, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        int m3969getimpl;
        int i16;
        ?? r16;
        int i17 = (i12 - i11) - (i14 - i13);
        int i18 = 1;
        boolean z11 = (Math.abs(i17) & 1) == 1;
        int i19 = -i15;
        int i21 = i19;
        while (i21 <= i15) {
            if (i21 == i19 || (i21 != i15 && CenteredArray.m3969getimpl(iArr, i21 + 1) > CenteredArray.m3969getimpl(iArr, i21 - 1))) {
                m3969getimpl = CenteredArray.m3969getimpl(iArr, i21 + 1);
                i16 = m3969getimpl;
            } else {
                m3969getimpl = CenteredArray.m3969getimpl(iArr, i21 - 1);
                i16 = m3969getimpl + 1;
            }
            int i22 = (i13 + (i16 - i11)) - i21;
            int i23 = i22 - ((i15 != 0 ? i18 : 0) & (i16 == m3969getimpl ? i18 : 0));
            while (i16 < i12 && i22 < i14) {
                if (!diffCallback.areItemsTheSame(i16, i22)) {
                    break;
                }
                i16++;
                i22++;
            }
            CenteredArray.m3972setimpl(iArr, i21, i16);
            if (z11) {
                int i24 = i17 - i21;
                r16 = i18;
                r16 = r16;
                if (i24 >= i19 + 1) {
                    r16 = r16;
                    if (i24 <= i15 - 1) {
                        if (CenteredArray.m3969getimpl(iArr2, i24) <= i16) {
                            fillSnake(m3969getimpl, i23, i16, i22, false, iArr3);
                            return r16;
                        }
                        i21 += 2;
                        i18 = r16;
                    }
                }
            } else {
                r16 = i18;
            }
            i21 += 2;
            i18 = r16;
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m4077midPointq5eDKzI(int i11, int i12, int i13, int i14, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i15 = i12 - i11;
        int i16 = i14 - i13;
        if (i15 >= 1 && i16 >= 1) {
            int i17 = ((i15 + i16) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m3972setimpl(iArr4, 1, i11);
            int[] iArr5 = iArr2;
            CenteredArray.m3972setimpl(iArr5, 1, i12);
            int i18 = 0;
            while (i18 < i17) {
                if (m4076forward4l5_RBY(i11, i12, i13, i14, diffCallback, iArr4, iArr5, i18, iArr3) || m4075backward4l5_RBY(i11, i12, i13, i14, diffCallback, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i18++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i11, int i12) {
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
    }

    private static final int toInt(boolean z11) {
        return z11 ? 1 : 0;
    }
}
