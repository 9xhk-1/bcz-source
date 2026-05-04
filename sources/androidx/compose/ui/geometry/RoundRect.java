package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,422:1\n53#2:423\n48#2:426\n53#2:429\n48#2:432\n48#2:435\n53#2:438\n48#2:445\n53#2:448\n48#2:455\n53#2:458\n48#2:465\n53#2:468\n48#2:483\n53#2:487\n48#2:491\n53#2:495\n48#2:496\n53#2:499\n48#2:505\n53#2:509\n48#2:513\n53#2:517\n48#2:518\n53#2:521\n48#2:527\n53#2:531\n48#2:535\n53#2:539\n48#2:540\n53#2:543\n48#2:549\n53#2:553\n48#2:557\n53#2:561\n48#2:562\n53#2:565\n48#2:568\n53#2:571\n48#2:573\n48#2:576\n53#2:579\n70#3:424\n60#3:427\n70#3:430\n60#3:433\n60#3:436\n70#3:439\n53#3,3:442\n60#3:446\n70#3:449\n53#3,3:452\n60#3:456\n70#3:459\n53#3,3:462\n60#3:466\n70#3:469\n53#3,3:472\n60#3:476\n70#3:479\n60#3:481\n70#3:485\n60#3:489\n70#3:493\n60#3:497\n70#3:500\n60#3:503\n70#3:507\n60#3:511\n70#3:515\n60#3:519\n70#3:522\n60#3:525\n70#3:529\n60#3:533\n70#3:537\n60#3:541\n70#3:544\n60#3:547\n70#3:551\n60#3:555\n70#3:559\n60#3:563\n70#3:566\n60#3:569\n70#3:572\n60#3:574\n60#3:577\n70#3:580\n22#4:425\n22#4:428\n22#4:431\n22#4:434\n22#4:437\n22#4:440\n22#4:447\n22#4:450\n22#4:457\n22#4:460\n22#4:467\n22#4:470\n22#4:477\n22#4:482\n22#4:486\n22#4:490\n22#4:494\n22#4:498\n22#4:501\n22#4:504\n22#4:508\n22#4:512\n22#4:516\n22#4:520\n22#4:523\n22#4:526\n22#4:530\n22#4:534\n22#4:538\n22#4:542\n22#4:545\n22#4:548\n22#4:552\n22#4:556\n22#4:560\n22#4:564\n22#4:567\n22#4:570\n22#4:575\n22#4:578\n22#4:581\n33#5:441\n33#5:451\n33#5:461\n33#5:471\n65#6:475\n69#6:478\n65#6:480\n69#6:484\n65#6:488\n69#6:492\n65#6:502\n69#6:506\n65#6:510\n69#6:514\n65#6:524\n69#6:528\n65#6:532\n69#6:536\n65#6:546\n69#6:550\n65#6:554\n69#6:558\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRect\n*L\n72#1:423\n73#1:426\n75#1:429\n77#1:432\n86#1:435\n87#1:438\n91#1:445\n92#1:448\n96#1:455\n97#1:458\n101#1:465\n102#1:468\n148#1:483\n149#1:487\n151#1:491\n152#1:495\n153#1:496\n154#1:499\n156#1:505\n157#1:509\n159#1:513\n160#1:517\n161#1:518\n162#1:521\n164#1:527\n165#1:531\n167#1:535\n168#1:539\n169#1:540\n170#1:543\n172#1:549\n173#1:553\n175#1:557\n176#1:561\n177#1:562\n178#1:565\n202#1:568\n202#1:571\n203#1:573\n205#1:576\n206#1:579\n72#1:424\n73#1:427\n75#1:430\n77#1:433\n86#1:436\n87#1:439\n85#1:442,3\n91#1:446\n92#1:449\n90#1:452,3\n96#1:456\n97#1:459\n95#1:462,3\n101#1:466\n102#1:469\n100#1:472,3\n134#1:476\n134#1:479\n148#1:481\n149#1:485\n151#1:489\n152#1:493\n153#1:497\n154#1:500\n156#1:503\n157#1:507\n159#1:511\n160#1:515\n161#1:519\n162#1:522\n164#1:525\n165#1:529\n167#1:533\n168#1:537\n169#1:541\n170#1:544\n172#1:547\n173#1:551\n175#1:555\n176#1:559\n177#1:563\n178#1:566\n202#1:569\n202#1:572\n203#1:574\n205#1:577\n206#1:580\n72#1:425\n73#1:428\n75#1:431\n77#1:434\n86#1:437\n87#1:440\n91#1:447\n92#1:450\n96#1:457\n97#1:460\n101#1:467\n102#1:470\n134#1:477\n148#1:482\n149#1:486\n151#1:490\n152#1:494\n153#1:498\n154#1:501\n156#1:504\n157#1:508\n159#1:512\n160#1:516\n161#1:520\n162#1:523\n164#1:526\n165#1:530\n167#1:534\n168#1:538\n169#1:542\n170#1:545\n172#1:548\n173#1:552\n175#1:556\n176#1:560\n177#1:564\n178#1:567\n202#1:570\n203#1:575\n205#1:578\n206#1:581\n85#1:441\n90#1:451\n95#1:461\n100#1:471\n134#1:475\n134#1:478\n148#1:480\n149#1:484\n151#1:488\n152#1:492\n156#1:502\n157#1:506\n159#1:510\n160#1:514\n164#1:524\n165#1:528\n167#1:532\n168#1:536\n172#1:546\n173#1:550\n175#1:554\n176#1:558\n*E\n"})
/* loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final RoundRect Zero = RoundRectKt.m2322RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m2240getZerokKHJgLs());

    @l
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }

        @o
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public /* synthetic */ RoundRect(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, v vVar) {
        this(f11, f12, f13, f14, j11, j12, j13, j14);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m2309copyMDFrsts$default(RoundRect roundRect, float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = roundRect.left;
        }
        if ((i11 & 2) != 0) {
            f12 = roundRect.top;
        }
        if ((i11 & 4) != 0) {
            f13 = roundRect.right;
        }
        if ((i11 & 8) != 0) {
            f14 = roundRect.bottom;
        }
        if ((i11 & 16) != 0) {
            j11 = roundRect.topLeftCornerRadius;
        }
        if ((i11 & 32) != 0) {
            j12 = roundRect.topRightCornerRadius;
        }
        if ((i11 & 64) != 0) {
            j13 = roundRect.bottomRightCornerRadius;
        }
        if ((i11 & 128) != 0) {
            j14 = roundRect.bottomLeftCornerRadius;
        }
        long j15 = j14;
        long j16 = j13;
        long j17 = j12;
        long j18 = j11;
        return roundRect.m2315copyMDFrsts(f11, f12, f13, f14, j18, j17, j16, j15);
    }

    @k
    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f11, float f12, float f13, float f14) {
        float f15 = f12 + f13;
        return f15 > f14 ? f15 == 0.0f ? f11 : Math.min(f11, f14 / f15) : f11;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f11 = this.left * minRadius;
        float f12 = this.top * minRadius;
        float f13 = this.right * minRadius;
        float f14 = this.bottom * minRadius;
        float intBitsToFloat = Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * minRadius;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * minRadius;
        long m2222constructorimpl = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * minRadius;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * minRadius;
        long m2222constructorimpl2 = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * minRadius;
        float intBitsToFloat6 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * minRadius;
        long m2222constructorimpl3 = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)) * minRadius;
        float intBitsToFloat8 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * minRadius;
        RoundRect roundRect2 = new RoundRect(f11, f12, f13, f14, m2222constructorimpl, m2222constructorimpl2, m2222constructorimpl3, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat7) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m2310component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m2311component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m2312component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m2313component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m2314containsk4lQ0M(long j11) {
        float intBitsToFloat;
        float intBitsToFloat2;
        float intBitsToFloat3;
        float intBitsToFloat4;
        int i11 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i11) >= this.left && Float.intBitsToFloat(i11) < this.right) {
            int i12 = (int) (j11 & 4294967295L);
            if (Float.intBitsToFloat(i12) >= this.top && Float.intBitsToFloat(i12) < this.bottom) {
                RoundRect scaledRadiiRect = scaledRadiiRect();
                if (Float.intBitsToFloat(i11) < this.left + Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius >> 32)) && Float.intBitsToFloat(i12) < this.top + Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius & 4294967295L))) {
                    intBitsToFloat = (Float.intBitsToFloat(i11) - this.left) - Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius >> 32));
                    intBitsToFloat2 = (Float.intBitsToFloat(i12) - this.top) - Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius & 4294967295L));
                    intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.topLeftCornerRadius >> 32));
                    intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.topLeftCornerRadius));
                } else if (Float.intBitsToFloat(i11) > this.right - Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius >> 32)) && Float.intBitsToFloat(i12) < this.top + Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius & 4294967295L))) {
                    intBitsToFloat = (Float.intBitsToFloat(i11) - this.right) + Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius >> 32));
                    intBitsToFloat2 = (Float.intBitsToFloat(i12) - this.top) - Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius & 4294967295L));
                    intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.topRightCornerRadius >> 32));
                    intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.topRightCornerRadius));
                } else if (Float.intBitsToFloat(i11) > this.right - Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius >> 32)) && Float.intBitsToFloat(i12) > this.bottom - Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius & 4294967295L))) {
                    intBitsToFloat = (Float.intBitsToFloat(i11) - this.right) + Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius >> 32));
                    intBitsToFloat2 = (Float.intBitsToFloat(i12) - this.bottom) + Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius & 4294967295L));
                    intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.bottomRightCornerRadius >> 32));
                    intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.bottomRightCornerRadius));
                } else {
                    if (Float.intBitsToFloat(i11) >= this.left + Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius >> 32)) || Float.intBitsToFloat(i12) <= this.bottom - Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius & 4294967295L))) {
                        return true;
                    }
                    intBitsToFloat = (Float.intBitsToFloat(i11) - this.left) - Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius >> 32));
                    intBitsToFloat2 = (Float.intBitsToFloat(i12) - this.bottom) + Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius & 4294967295L));
                    intBitsToFloat3 = Float.intBitsToFloat((int) (scaledRadiiRect.bottomLeftCornerRadius >> 32));
                    intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & scaledRadiiRect.bottomLeftCornerRadius));
                }
                float f11 = intBitsToFloat / intBitsToFloat3;
                float f12 = intBitsToFloat2 / intBitsToFloat4;
                return (f11 * f11) + (f12 * f12) <= 1.0f;
            }
        }
        return false;
    }

    @k
    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m2315copyMDFrsts(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14) {
        return new RoundRect(f11, f12, f13, f14, j11, j12, j13, j14, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m2227equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m2227equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m2227equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m2227equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2316getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2317getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2318getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m2319getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m2230hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m2230hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m2230hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m2230hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @k
    public String toString() {
        long j11 = this.topLeftCornerRadius;
        long j12 = this.topRightCornerRadius;
        long j13 = this.bottomRightCornerRadius;
        long j14 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.top, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.right, 1) + j2.O + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m2227equalsimpl0(j11, j12) || !CornerRadius.m2227equalsimpl0(j12, j13) || !CornerRadius.m2227equalsimpl0(j13, j14)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m2236toStringimpl(j11)) + ", topRight=" + ((Object) CornerRadius.m2236toStringimpl(j12)) + ", bottomRight=" + ((Object) CornerRadius.m2236toStringimpl(j13)) + ", bottomLeft=" + ((Object) CornerRadius.m2236toStringimpl(j14)) + ')';
        }
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i11), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i11), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i12), 1) + ')';
    }

    private RoundRect(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
        this.topLeftCornerRadius = j11;
        this.topRightCornerRadius = j12;
        this.bottomRightCornerRadius = j13;
        this.bottomLeftCornerRadius = j14;
    }

    public /* synthetic */ RoundRect(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, int i11, v vVar) {
        this(f11, f12, f13, f14, (i11 & 16) != 0 ? CornerRadius.Companion.m2240getZerokKHJgLs() : j11, (i11 & 32) != 0 ? CornerRadius.Companion.m2240getZerokKHJgLs() : j12, (i11 & 64) != 0 ? CornerRadius.Companion.m2240getZerokKHJgLs() : j13, (i11 & 128) != 0 ? CornerRadius.Companion.m2240getZerokKHJgLs() : j14, null);
    }
}
