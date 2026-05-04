package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.s0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {
    @l
    public static final Object detectDownAndDragGesturesWithObserver(@k PointerInputScope pointerInputScope, @k TextDragObserver textDragObserver, @k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @l
    public static final Object detectDragGesturesAfterLongPressWithObserver(@k PointerInputScope pointerInputScope, @k final TextDragObserver textDragObserver, @k j00.c<? super g2> cVar) {
        Object detectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m1079invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1079invokek4lQ0M(long j11) {
                TextDragObserver.this.mo1134onStartk4lQ0M(j11);
            }
        }, new x00.a<g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextDragObserver.this.onStop();
            }
        }, new x00.a<g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextDragObserver.this.onCancel();
            }
        }, new p<PointerInputChange, Offset, g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                m1080invokeUv8p0NA(pointerInputChange, offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m1080invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                TextDragObserver.this.mo1133onDragk4lQ0M(j11);
            }
        }, cVar);
        return detectDragGesturesAfterLongPress == kotlin.coroutines.intrinsics.b.l() ? detectDragGesturesAfterLongPress : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, j00.c<? super g2> cVar) {
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m1081invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1081invokek4lQ0M(long j11) {
                TextDragObserver.this.mo1134onStartk4lQ0M(j11);
            }
        }, new x00.a<g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$3
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextDragObserver.this.onStop();
            }
        }, new x00.a<g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$4
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextDragObserver.this.onCancel();
            }
        }, new p<PointerInputChange, Offset, g2>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDragGesturesWithObserver$5
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                m1082invokeUv8p0NA(pointerInputChange, offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m1082invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                TextDragObserver.this.mo1133onDragk4lQ0M(j11);
            }
        }, cVar);
        return detectDragGestures == kotlin.coroutines.intrinsics.b.l() ? detectDragGestures : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, j00.c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, null), cVar);
        return awaitEachGesture == kotlin.coroutines.intrinsics.b.l() ? awaitEachGesture : g2.f100423a;
    }
}
