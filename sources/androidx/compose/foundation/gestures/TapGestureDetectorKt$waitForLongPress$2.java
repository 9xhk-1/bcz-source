package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", i = {0, 1}, l = {386, 409}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"})
@u0({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n87#2,2:551\n34#2,6:553\n89#2:559\n102#2,2:560\n34#2,6:562\n104#2:568\n102#2,2:569\n34#2,6:571\n104#2:577\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n*L\n387#1:551,2\n387#1:553,6\n387#1:559\n399#1:560,2\n399#1:562,6\n399#1:568\n410#1:569,2\n410#1:571,6\n410#1:577\n*E\n"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ Ref.ObjectRef<LongPressResult> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref.ObjectRef<LongPressResult> objectRef, c<? super TapGestureDetectorKt$waitForLongPress$2> cVar) {
        super(2, cVar);
        this.$pass = pointerEventPass;
        this.$result = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.$pass, this.$result, cVar);
        tapGestureDetectorKt$waitForLongPress$2.L$0 = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c6, code lost:
    
        r13.$result.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(r14) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r13.$result.element = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        r14 = r14.getChanges();
        r5 = r14.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r6 >= r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r7 = r14.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r7.isConsumed() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.m3677isOutOfBoundsjwHxaWs(r7, r1.mo3641getSizeYbymL2g(), r1.mo3640getExtendedTouchPaddingNHjbRc()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r13.$result.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r14 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r13.L$0 = r1;
        r13.label = 2;
        r14 = r1.awaitPointerEvent(r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        if (r14 != r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.foundation.gestures.LongPressResult$Success] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.gestures.LongPressResult$Released] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a7 -> B:6:0x00aa). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
