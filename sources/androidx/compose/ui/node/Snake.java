package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n+ 2 MyersDiff.kt\nandroidx/compose/ui/node/MyersDiffKt\n*L\n1#1,518:1\n318#1:519\n310#1:520\n322#1:521\n314#1:522\n322#1:523\n314#1,5:524\n310#1:529\n322#1:530\n314#1,5:531\n310#1:536\n310#1:537\n314#1:538\n329#1:539\n318#1:540\n310#1:541\n322#1:542\n314#1:543\n326#1:544\n326#1:546\n318#1:548\n310#1:549\n310#1,17:550\n375#2:545\n375#2:547\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/Snake\n*L\n329#1:519\n329#1:520\n329#1:521\n329#1:522\n332#1:523\n332#1:524,5\n332#1:529\n335#1:530\n335#1:531,5\n335#1:536\n360#1:537\n361#1:538\n363#1:539\n363#1:540\n363#1:541\n363#1:542\n363#1:543\n364#1:544\n365#1:546\n367#1:548\n367#1:549\n372#1:550,17\n364#1:545\n365#1:547\n*E\n"})
/* loaded from: classes2.dex */
final class Snake {

    @k
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m4181addDiagonalToStackimpl(int[] iArr, @k IntStack intStack) {
        int i11;
        int i12 = iArr[0];
        int i13 = iArr[1];
        if (m4189getHasAdditionOrRemovalimpl(iArr)) {
            i11 = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i12 += ((iArr[4] != 0 ? 1 : 0) | (m4194isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i13 += ((!m4194isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            i11 = iArr[2] - iArr[0];
        }
        intStack.pushDiagonal(i12, i13, i11);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m4182boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4184equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && g0.g(iArr, ((Snake) obj).m4196unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4185equalsimpl0(int[] iArr, int[] iArr2) {
        return g0.g(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m4186getDiagonalSizeimpl(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m4187getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m4188getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m4189getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m4190getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m4191getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m4192getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4193hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m4194isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4195toStringimpl(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snake(");
        sb2.append(iArr[0]);
        sb2.append(',');
        sb2.append(iArr[1]);
        sb2.append(',');
        sb2.append(iArr[2]);
        sb2.append(',');
        sb2.append(iArr[3]);
        sb2.append(',');
        sb2.append(iArr[4] != 0);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m4184equalsimpl(this.data, obj);
    }

    @k
    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m4193hashCodeimpl(this.data);
    }

    @k
    public String toString() {
        return m4195toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4196unboximpl() {
        return this.data;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4183constructorimpl(@k int[] iArr) {
        return iArr;
    }
}
