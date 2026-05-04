package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j11, final a<? extends LayoutCoordinates> aVar) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;

            /* JADX WARN: Multi-variable type inference failed */
            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m2284getZeroF1C5BW0();
                this.dragTotalDistance = companion.m2284getZeroF1C5BW0();
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j11)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1133onDragk4lQ0M(long j12) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j13 = j11;
                    if (invoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j13)) {
                        long m2273plusMKHz9U = Offset.m2273plusMKHz9U(this.dragTotalDistance, j12);
                        this.dragTotalDistance = m2273plusMKHz9U;
                        long m2273plusMKHz9U2 = Offset.m2273plusMKHz9U(this.lastPosition, m2273plusMKHz9U);
                        if (selectionRegistrar2.mo1494notifySelectionUpdatenjBpvok(invoke, m2273plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.Companion.getWord(), true)) {
                            this.lastPosition = m2273plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m2284getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1134onStartk4lQ0M(long j12) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!invoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo1495notifySelectionUpdateStartubNVwUQ(invoke, j12, SelectionAdjustment.Companion.getWord(), true);
                    this.lastPosition = j12;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j11)) {
                    this.dragTotalDistance = Offset.Companion.m2284getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j11)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            public final void setDragTotalDistance(long j12) {
                this.dragTotalDistance = j12;
            }

            public final void setLastPosition(long j12) {
                this.lastPosition = j12;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1132onDownk4lQ0M(long j12) {
            }
        };
        return SelectionGesturesKt.selectionGestureInput(Modifier.Companion, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m2284getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1369onDrag3MmeM6k(long j12, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j13 = j11;
                if (!invoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j13)) {
                    return false;
                }
                if (!selectionRegistrar2.mo1494notifySelectionUpdatenjBpvok(invoke, j12, this.lastPosition, false, selectionAdjustment, false)) {
                    return true;
                }
                this.lastPosition = j12;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1370onExtendk4lQ0M(long j12) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j13 = j11;
                if (!invoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo1494notifySelectionUpdatenjBpvok(invoke, j12, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j12;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j13);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1371onExtendDragk4lQ0M(long j12) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j13 = j11;
                if (!invoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j13)) {
                    return false;
                }
                if (!selectionRegistrar2.mo1494notifySelectionUpdatenjBpvok(invoke, j12, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    return true;
                }
                this.lastPosition = j12;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo1372onStart3MmeM6k(long j12, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j13 = j11;
                if (!invoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo1495notifySelectionUpdateStartubNVwUQ(invoke, j12, selectionAdjustment, false);
                this.lastPosition = j12;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j13);
            }

            public final void setLastPosition(long j12) {
                this.lastPosition = j12;
            }
        }, textDragObserver);
    }
}
