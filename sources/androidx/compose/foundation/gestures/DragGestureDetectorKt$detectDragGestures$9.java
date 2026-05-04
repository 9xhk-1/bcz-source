package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7}, l = {R.styleable.Theme_drawable_walk_sound1, R.styleable.Theme_drawable_wiki_sound, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "initialDown", "awaitTouchSlop", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "drag", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "$this$awaitEachGesture", "down", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "F$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "F$0", "L$0", "L$2", "L$3", "L$4"})
@u0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1045:1\n787#2,17:1046\n804#2,4:1072\n808#2,9:1083\n817#2,11:1093\n794#2,10:1140\n804#2,4:1159\n808#2,9:1172\n817#2,11:1182\n702#2,7:1193\n746#2,4:1200\n750#2,2:1213\n752#2,7:1222\n709#2,6:1229\n715#2:1238\n710#2,8:1241\n759#2:1249\n718#2:1250\n707#2:1251\n720#2,10:1252\n117#3,2:1063\n34#3,6:1065\n119#3:1071\n34#3,6:1076\n119#3:1082\n102#3,2:1104\n34#3,6:1106\n104#3:1112\n102#3,2:1113\n34#3,6:1115\n104#3:1121\n102#3,2:1122\n34#3,6:1124\n104#3:1130\n102#3,2:1131\n34#3,6:1133\n104#3:1139\n117#3,2:1150\n34#3,6:1152\n119#3:1158\n117#3,2:1163\n34#3,6:1165\n119#3:1171\n117#3,2:1204\n34#3,6:1206\n119#3:1212\n34#3,6:1215\n119#3:1221\n273#4:1092\n273#4:1181\n69#5:1235\n65#5:1239\n70#6:1236\n60#6:1240\n22#7:1237\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$9\n*L\n257#1:1046,17\n257#1:1072,4\n257#1:1083,9\n257#1:1093,11\n291#1:1140,10\n291#1:1159,4\n291#1:1172,9\n291#1:1182,11\n308#1:1193,7\n308#1:1200,4\n308#1:1213,2\n308#1:1222,7\n308#1:1229,6\n308#1:1238\n308#1:1241,8\n308#1:1249\n308#1:1250\n308#1:1251\n308#1:1252,10\n257#1:1063,2\n257#1:1065,6\n257#1:1071\n257#1:1076,6\n257#1:1082\n272#1:1104,2\n272#1:1106,6\n272#1:1112\n280#1:1113,2\n280#1:1115,6\n280#1:1121\n280#1:1122,2\n280#1:1124,6\n280#1:1130\n284#1:1131,2\n284#1:1133,6\n284#1:1139\n291#1:1150,2\n291#1:1152,6\n291#1:1158\n291#1:1163,2\n291#1:1165,6\n291#1:1171\n308#1:1204,2\n308#1:1206,6\n308#1:1212\n308#1:1215,6\n308#1:1221\n257#1:1092\n291#1:1181\n308#1:1235\n308#1:1239\n308#1:1236\n308#1:1240\n308#1:1237\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$9 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ p<PointerInputChange, Offset, g2> $onDrag;
    final /* synthetic */ a<g2> $onDragCancel;
    final /* synthetic */ l<PointerInputChange, g2> $onDragEnd;
    final /* synthetic */ q<PointerInputChange, PointerInputChange, Offset, g2> $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ a<Boolean> $shouldAwaitTouchSlop;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$9(a<Boolean> aVar, Ref.LongRef longRef, Orientation orientation, q<? super PointerInputChange, ? super PointerInputChange, ? super Offset, g2> qVar, p<? super PointerInputChange, ? super Offset, g2> pVar, a<g2> aVar2, l<? super PointerInputChange, g2> lVar, c<? super DragGestureDetectorKt$detectDragGestures$9> cVar) {
        super(2, cVar);
        this.$shouldAwaitTouchSlop = aVar;
        this.$overSlop = longRef;
        this.$orientationLock = orientation;
        this.$onDragStart = qVar;
        this.$onDrag = pVar;
        this.$onDragCancel = aVar2;
        this.$onDragEnd = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.$shouldAwaitTouchSlop, this.$overSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, cVar);
        dragGestureDetectorKt$detectDragGestures$9.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03bc, code lost:
    
        if (r9 != r6) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04b8, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m435isPointerUpDmW0f2w(r2.getCurrentEvent(), r0) != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01e2, code lost:
    
        if (r7 != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0154, code lost:
    
        if (r1 == r6) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x04e0, code lost:
    
        if (r9 != r6) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x056d, code lost:
    
        if (r8 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02fb, code lost:
    
        if (r4 == r6) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x051a, B:46:0x0546], limit reached: 221 */
    /* JADX WARN: Removed duplicated region for block: B:149:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d6  */
    /* JADX WARN: Type inference failed for: r13v10, types: [kotlin.jvm.internal.v] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x03f7 -> B:61:0x038b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0453 -> B:92:0x03a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x044c -> B:62:0x02be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0473 -> B:58:0x0475). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0485 -> B:62:0x02be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x01b2 -> B:143:0x02a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x021d -> B:142:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x026f -> B:143:0x02a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x0297 -> B:139:0x029a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x04e0 -> B:7:0x04e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0333 -> B:70:0x02e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0389 -> B:61:0x038b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
