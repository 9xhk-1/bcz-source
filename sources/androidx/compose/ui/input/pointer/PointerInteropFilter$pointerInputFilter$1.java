package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,339:1\n102#2,2:340\n34#2,6:342\n104#2:348\n87#2,2:349\n34#2,6:351\n89#2:357\n102#2,2:358\n34#2,6:360\n104#2:366\n34#2,6:367\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n216#1:340,2\n216#1:342,6\n216#1:348\n231#1:349,2\n231#1:351,6\n231#1:357\n269#1:358,2\n269#1:360,6\n269#1:366\n304#1:367,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (changes.get(i11).isConsumed()) {
                if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                    if (layoutCoordinates$ui_release == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    long mo3868localToRootMKHz9U = layoutCoordinates$ui_release.mo3868localToRootMKHz9U(Offset.Companion.m2284getZeroF1C5BW0());
                    final PointerInteropFilter pointerInteropFilter = this.this$0;
                    PointerInteropUtils_androidKt.m3790toCancelMotionEventScoped4ec7I(pointerEvent, mo3868localToRootMKHz9U, new l<MotionEvent, g2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(MotionEvent motionEvent) {
                            invoke2(motionEvent);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(MotionEvent motionEvent) {
                            PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                        }
                    });
                }
                this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        long mo3868localToRootMKHz9U2 = layoutCoordinates$ui_release2.mo3868localToRootMKHz9U(Offset.Companion.m2284getZeroF1C5BW0());
        final PointerInteropFilter pointerInteropFilter2 = this.this$0;
        PointerInteropUtils_androidKt.m3791toMotionEventScoped4ec7I(pointerEvent, mo3868localToRootMKHz9U2, new l<MotionEvent, g2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(MotionEvent motionEvent) {
                invoke2(motionEvent);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent);
                } else {
                    PointerInteropFilter$pointerInputFilter$1.this.state = pointerInteropFilter2.getOnTouchEvent().invoke(motionEvent).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                }
            }
        });
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                changes.get(i12).consume();
            }
            InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
            if (internalPointerEvent$ui_release == null) {
                return;
            }
            internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            long uptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.this$0;
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(uptimeMillis, new l<MotionEvent, g2>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(MotionEvent motionEvent) {
                    invoke2(motionEvent);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(MotionEvent motionEvent) {
                    PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent);
                }
            });
            reset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo3755onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent r5, androidx.compose.ui.input.pointer.PointerEventPass r6, long r7) {
        /*
            r4 = this;
            java.util.List r7 = r5.getChanges()
            androidx.compose.ui.input.pointer.PointerInteropFilter r8 = r4.this$0
            boolean r8 = r8.getDisallowIntercept$ui_release()
            r0 = 0
            if (r8 != 0) goto L2f
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r1 = r0
        L15:
            if (r1 >= r8) goto L2d
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r2)
            if (r3 != 0) goto L2f
            boolean r2 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r2)
            if (r2 == 0) goto L2a
            goto L2f
        L2a:
            int r1 = r1 + 1
            goto L15
        L2d:
            r8 = r0
            goto L30
        L2f:
            r8 = 1
        L30:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r1 = r4.state
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r1 == r2) goto L48
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            if (r6 != r1) goto L3f
            if (r8 == 0) goto L3f
            r4.dispatchToView(r5)
        L3f:
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r6 != r1) goto L48
            if (r8 != 0) goto L48
            r4.dispatchToView(r5)
        L48:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r6 != r5) goto L68
            r5 = r7
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
        L53:
            if (r0 >= r5) goto L65
            java.lang.Object r6 = r7.get(r0)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r6 != 0) goto L62
            return
        L62:
            int r0 = r0 + 1
            goto L53
        L65:
            r4.reset()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo3755onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
