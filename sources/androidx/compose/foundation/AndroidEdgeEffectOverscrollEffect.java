package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1073:1\n69#2:1074\n69#2:1077\n69#2:1080\n69#2:1083\n69#2:1086\n65#2:1089\n65#2:1092\n65#2:1095\n65#2:1098\n65#2:1101\n65#2:1108\n69#2:1111\n65#2:1113\n69#2:1116\n65#2:1118\n65#2:1121\n69#2:1124\n69#2:1127\n65#2:1155\n69#2:1159\n65#2:1172\n65#2:1175\n65#2:1178\n65#2:1181\n69#2:1184\n69#2:1187\n69#2:1190\n69#2:1193\n65#2:1196\n69#2:1199\n69#2:1206\n65#2:1209\n69#2:1212\n69#2:1219\n69#2:1222\n65#2:1225\n65#2:1232\n69#2:1235\n65#2:1238\n65#2:1245\n70#3:1075\n70#3:1078\n70#3:1081\n70#3:1084\n70#3:1087\n60#3:1090\n60#3:1093\n60#3:1096\n60#3:1099\n60#3:1102\n53#3,3:1105\n60#3:1109\n70#3:1112\n60#3:1114\n70#3:1117\n60#3:1119\n60#3:1122\n70#3:1125\n70#3:1128\n60#3:1131\n60#3:1134\n70#3:1137\n70#3:1140\n60#3:1148\n70#3:1151\n80#3:1153\n60#3:1156\n70#3:1160\n53#3,3:1164\n60#3:1173\n60#3:1176\n60#3:1179\n60#3:1182\n70#3:1185\n70#3:1188\n70#3:1191\n70#3:1194\n60#3:1197\n70#3:1200\n70#3:1204\n70#3:1207\n60#3:1210\n70#3:1213\n70#3:1217\n70#3:1220\n70#3:1223\n60#3:1226\n60#3:1230\n60#3:1233\n70#3:1236\n60#3:1239\n60#3:1243\n60#3:1246\n22#4:1076\n22#4:1079\n22#4:1082\n22#4:1085\n22#4:1088\n22#4:1091\n22#4:1094\n22#4:1097\n22#4:1100\n22#4:1103\n22#4:1110\n22#4:1115\n22#4:1120\n22#4:1123\n22#4:1126\n22#4:1129\n22#4:1132\n22#4:1135\n22#4:1138\n22#4:1141\n22#4:1149\n22#4:1157\n22#4:1161\n22#4:1174\n22#4:1177\n22#4:1180\n22#4:1183\n22#4:1186\n22#4:1189\n22#4:1192\n22#4:1195\n22#4:1198\n22#4:1201\n22#4:1205\n22#4:1208\n22#4:1211\n22#4:1214\n22#4:1218\n22#4:1221\n22#4:1224\n22#4:1227\n22#4:1231\n22#4:1234\n22#4:1237\n22#4:1240\n22#4:1244\n22#4:1247\n30#5:1104\n273#5:1154\n30#5:1163\n57#6:1130\n57#6:1133\n61#6:1136\n61#6:1139\n57#6:1147\n61#6:1150\n57#6:1158\n61#6:1162\n61#6:1202\n61#6:1203\n61#6:1215\n61#6:1216\n57#6:1228\n57#6:1229\n57#6:1241\n57#6:1242\n948#7,5:1142\n948#7,5:1167\n30#8:1152\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n562#1:1074\n563#1:1077\n572#1:1080\n574#1:1083\n583#1:1086\n589#1:1089\n590#1:1092\n599#1:1095\n601#1:1098\n610#1:1101\n628#1:1108\n628#1:1111\n629#1:1113\n629#1:1116\n648#1:1118\n651#1:1121\n658#1:1124\n661#1:1127\n776#1:1155\n777#1:1159\n850#1:1172\n851#1:1175\n854#1:1178\n855#1:1181\n858#1:1184\n859#1:1187\n862#1:1190\n863#1:1193\n870#1:1196\n871#1:1199\n877#1:1206\n884#1:1209\n885#1:1212\n892#1:1219\n899#1:1222\n900#1:1225\n907#1:1232\n914#1:1235\n915#1:1238\n922#1:1245\n562#1:1075\n563#1:1078\n572#1:1081\n574#1:1084\n583#1:1087\n589#1:1090\n590#1:1093\n599#1:1096\n601#1:1099\n610#1:1102\n614#1:1105,3\n628#1:1109\n628#1:1112\n629#1:1114\n629#1:1117\n648#1:1119\n651#1:1122\n658#1:1125\n661#1:1128\n696#1:1131\n700#1:1134\n708#1:1137\n712#1:1140\n764#1:1148\n764#1:1151\n764#1:1153\n776#1:1156\n777#1:1160\n778#1:1164,3\n850#1:1173\n851#1:1176\n854#1:1179\n855#1:1182\n858#1:1185\n859#1:1188\n862#1:1191\n863#1:1194\n870#1:1197\n871#1:1200\n873#1:1204\n877#1:1207\n884#1:1210\n885#1:1213\n888#1:1217\n892#1:1220\n899#1:1223\n900#1:1226\n903#1:1230\n907#1:1233\n914#1:1236\n915#1:1239\n918#1:1243\n922#1:1246\n562#1:1076\n563#1:1079\n572#1:1082\n574#1:1085\n583#1:1088\n589#1:1091\n590#1:1094\n599#1:1097\n601#1:1100\n610#1:1103\n628#1:1110\n629#1:1115\n648#1:1120\n651#1:1123\n658#1:1126\n661#1:1129\n696#1:1132\n700#1:1135\n708#1:1138\n712#1:1141\n764#1:1149\n776#1:1157\n777#1:1161\n850#1:1174\n851#1:1177\n854#1:1180\n855#1:1183\n858#1:1186\n859#1:1189\n862#1:1192\n863#1:1195\n870#1:1198\n871#1:1201\n873#1:1205\n877#1:1208\n884#1:1211\n885#1:1214\n888#1:1218\n892#1:1221\n899#1:1224\n900#1:1227\n903#1:1231\n907#1:1234\n914#1:1237\n915#1:1240\n918#1:1244\n922#1:1247\n614#1:1104\n775#1:1154\n778#1:1163\n696#1:1130\n700#1:1133\n708#1:1136\n712#1:1139\n764#1:1147\n764#1:1150\n776#1:1158\n777#1:1162\n871#1:1202\n873#1:1203\n885#1:1215\n888#1:1216\n900#1:1228\n903#1:1229\n915#1:1241\n918#1:1242\n755#1:1142,5\n834#1:1167,5\n764#1:1152\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;
    private long containerSize;

    @m80.k
    private final Density density;

    @m80.k
    private final EdgeEffectWrapper edgeEffectWrapper;
    private boolean invalidationEnabled;

    @m80.k
    private final DelegatableNode node;
    private long pointerId;

    @m80.k
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private long pointerPosition;

    @m80.k
    private final MutableState<g2> redrawSignal;
    private boolean scrollCycleInProgress;

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j11, PaddingValues paddingValues, v vVar) {
        this(context, density, j11, paddingValues);
    }

    private final void animateToReleaseIfNeeded() {
        boolean z11;
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        boolean z12 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = !edgeEffect.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 = !edgeEffect2.isFinished() || z11;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 = !edgeEffect3.isFinished() || z11;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z11) {
                z12 = false;
            }
            z11 = z12;
        }
        if (z11) {
            invalidateOverscroll$foundation_release();
        }
    }

    /* renamed from: pullBottom-k-4lQ0M, reason: not valid java name */
    private final float m208pullBottomk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m215displacementF1C5BW0$foundation_release() >> 32));
        int i11 = (int) (j11 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateBottomEffect = this.edgeEffectWrapper.getOrCreateBottomEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateBottomEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(orCreateBottomEffect, -intBitsToFloat2, 1 - intBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i11);
    }

    /* renamed from: pullLeft-k-4lQ0M, reason: not valid java name */
    private final float m209pullLeftk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m215displacementF1C5BW0$foundation_release() & 4294967295L));
        int i11 = (int) (j11 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateLeftEffect = this.edgeEffectWrapper.getOrCreateLeftEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateLeftEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(orCreateLeftEffect, intBitsToFloat2, 1 - intBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i11);
    }

    /* renamed from: pullRight-k-4lQ0M, reason: not valid java name */
    private final float m210pullRightk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m215displacementF1C5BW0$foundation_release() & 4294967295L));
        int i11 = (int) (j11 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        EdgeEffect orCreateRightEffect = this.edgeEffectWrapper.getOrCreateRightEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateRightEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(orCreateRightEffect, -intBitsToFloat2, intBitsToFloat)) * Float.intBitsToFloat((int) (this.containerSize >> 32)) : Float.intBitsToFloat(i11);
    }

    /* renamed from: pullTop-k-4lQ0M, reason: not valid java name */
    private final float m211pullTopk4lQ0M(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (m215displacementF1C5BW0$foundation_release() >> 32));
        int i11 = (int) (j11 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i11) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        EdgeEffect orCreateTopEffect = this.edgeEffectWrapper.getOrCreateTopEffect();
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(orCreateTopEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(orCreateTopEffect, intBitsToFloat2, intBitsToFloat) * Float.intBitsToFloat((int) (this.containerSize & 4294967295L)) : Float.intBitsToFloat(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m212releaseOppositeOverscrollk4lQ0M(long r11) {
        /*
            r10 = this;
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r5 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r5 = r5.getOrCreateLeftEffect()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.onReleaseWithOppositeDelta(r5, r0)
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isLeftAnimating()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            androidx.compose.foundation.EdgeEffectWrapper r4 = r10.edgeEffectWrapper
            boolean r4 = r4.isRightAnimating()
            r5 = 1
            if (r4 == 0) goto L5f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r6 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r6 = r6.getOrCreateRightEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.onReleaseWithOppositeDelta(r6, r1)
            if (r0 != 0) goto L5e
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isRightAnimating()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            r0 = r3
            goto L5f
        L5e:
            r0 = r5
        L5f:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isTopAnimating()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L94
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L94
            androidx.compose.foundation.EdgeEffectCompat r4 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r8 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r8 = r8.getOrCreateTopEffect()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.onReleaseWithOppositeDelta(r8, r1)
            if (r0 != 0) goto L93
            androidx.compose.foundation.EdgeEffectWrapper r0 = r10.edgeEffectWrapper
            boolean r0 = r0.isTopAnimating()
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = r3
            goto L94
        L93:
            r0 = r5
        L94:
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            boolean r1 = r1.isBottomAnimating()
            if (r1 == 0) goto Lc2
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto Lc2
            androidx.compose.foundation.EdgeEffectCompat r12 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE
            androidx.compose.foundation.EdgeEffectWrapper r1 = r10.edgeEffectWrapper
            android.widget.EdgeEffect r1 = r1.getOrCreateBottomEffect()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12.onReleaseWithOppositeDelta(r1, r11)
            if (r0 != 0) goto Lc1
            androidx.compose.foundation.EdgeEffectWrapper r11 = r10.edgeEffectWrapper
            boolean r11 = r11.isBottomAnimating()
            if (r11 == 0) goto Lc0
            goto Lc1
        Lc0:
            return r3
        Lc1:
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.m212releaseOppositeOverscrollk4lQ0M(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @m80.l
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo213applyToFlingBMRW4eQ(long r12, @m80.k x00.p<? super androidx.compose.ui.unit.Velocity, ? super j00.c<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo213applyToFlingBMRW4eQ(long, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo214applyToScrollRhakbz0(long r20, int r22, @m80.k x00.l<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> r23) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo214applyToScrollRhakbz0(long, int, x00.l):long");
    }

    /* renamed from: displacement-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m215displacementF1C5BW0$foundation_release() {
        long j11 = this.pointerPosition;
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            j11 = SizeKt.m2347getCenteruvyYCjk(this.containerSize);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (this.containerSize >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (this.containerSize & 4294967295L));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @m80.k
    public DelegatableNode getNode() {
        return this.node;
    }

    @m80.k
    public final MutableState<g2> getRedrawSignal$foundation_release() {
        return this.redrawSignal;
    }

    public final void invalidateOverscroll$foundation_release() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(g2.f100423a);
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = edgeEffectWrapper.topEffect;
        if (edgeEffect != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.bottomEffect;
        if (edgeEffect2 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.leftEffect;
        if (edgeEffect3 != null && EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.rightEffect;
        return (edgeEffect4 == null || EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z11) {
        this.invalidationEnabled = z11;
    }

    /* renamed from: updateSize-uvyYCjk$foundation_release, reason: not valid java name */
    public final void m216updateSizeuvyYCjk$foundation_release(long j11) {
        boolean m2333equalsimpl0 = Size.m2333equalsimpl0(this.containerSize, Size.Companion.m2346getZeroNHjbRc());
        boolean m2333equalsimpl02 = Size.m2333equalsimpl0(j11, this.containerSize);
        this.containerSize = j11;
        if (!m2333equalsimpl02) {
            this.edgeEffectWrapper.m289updateSizeozmzZPI(IntSize.m5281constructorimpl((c10.d.L0(Float.intBitsToFloat((int) (j11 & 4294967295L))) & 4294967295L) | (c10.d.L0(Float.intBitsToFloat((int) (j11 >> 32))) << 32)));
        }
        if (m2333equalsimpl0 || m2333equalsimpl02) {
            return;
        }
        animateToReleaseIfNeeded();
    }

    private AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j11, PaddingValues paddingValues) {
        this.density = density;
        this.pointerPosition = Offset.Companion.m2283getUnspecifiedF1C5BW0();
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m2563toArgb8_81llA(j11));
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m2346getZeroNHjbRc();
        this.pointerId = PointerId.m3712constructorimpl(-1L);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {783, 787}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
            @u0({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n230#2,3:1074\n34#2,6:1077\n233#2:1083\n117#2,2:1084\n34#2,6:1086\n119#2:1092\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n*L\n787#1:1074,3\n787#1:1077,6\n787#1:1083\n791#1:1084,2\n791#1:1086,6\n791#1:1092\n*E\n"})
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = androidEdgeEffectOverscrollEffect;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
                
                    if (r15 != r0) goto L18;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:6:0x0061). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 227
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(AndroidEdgeEffectOverscrollEffect.this, null), cVar);
                return awaitEachGesture == kotlin.coroutines.intrinsics.b.l() ? awaitEachGesture : g2.f100423a;
            }
        });
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        this.node = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper) : new GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }
}
