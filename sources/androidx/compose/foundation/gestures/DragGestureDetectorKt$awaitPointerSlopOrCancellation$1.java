package androidx.compose.foundation.gestures;

import com.tencent.ijk.media.player.IMediaPlayer;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {IMediaPlayer.MEDIA_INFO_METADATA_UPDATE, 825}, m = "awaitPointerSlopOrCancellation-6ksA65w", n = {"$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "touchSlop", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "dragEvent", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(c<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m424awaitPointerSlopOrCancellation6ksA65w(null, 0L, 0, null, 0L, null, this);
    }
}
