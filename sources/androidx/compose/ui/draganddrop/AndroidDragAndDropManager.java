package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAndroidDragAndDropManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDragAndDropManager.android.kt\nandroidx/compose/ui/draganddrop/AndroidDragAndDropManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1#2:127\n1855#3,2:128\n*S KotlinDebug\n*F\n+ 1 AndroidDragAndDropManager.android.kt\nandroidx/compose/ui/draganddrop/AndroidDragAndDropManager\n*L\n91#1:128,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, DragAndDropManager {
    public static final int $stable = 8;

    @k
    private final q<DragAndDropTransferData, Size, l<? super DrawScope, g2>, Boolean> startDrag;

    @k
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);

    @k
    private final ArraySet<DragAndDropTarget> interestedTargets = new ArraySet<>(0, 1, null);

    @k
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = AndroidDragAndDropManager.this.rootDragAndDropNode;
            return dragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = AndroidDragAndDropManager.this.rootDragAndDropNode;
            return dragAndDropNode;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidDragAndDropManager(@k q<? super DragAndDropTransferData, ? super Size, ? super l<? super DrawScope, g2>, Boolean> qVar) {
        this.startDrag = qVar;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    @k
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedTarget(@k DragAndDropTarget dragAndDropTarget) {
        return this.interestedTargets.contains(dragAndDropTarget);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isRequestDragAndDropTransferRequired() {
        return true;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(@k View view, @k DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean acceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator<DragAndDropTarget> it = this.interestedTargets.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                break;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                this.interestedTargets.clear();
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerTargetInterest(@k DragAndDropTarget dragAndDropTarget) {
        this.interestedTargets.add(dragAndDropTarget);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* renamed from: requestDragAndDropTransfer-Uv8p0NA, reason: not valid java name */
    public void mo2104requestDragAndDropTransferUv8p0NA(@k DragAndDropNode dragAndDropNode, long j11) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        dragAndDropNode.m2110startDragAndDropTransferd4ec7I(new DragAndDropStartTransferScope() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1
            @Override // androidx.compose.ui.draganddrop.DragAndDropStartTransferScope
            /* renamed from: startDragAndDropTransfer-12SF9DM, reason: not valid java name */
            public boolean mo2105startDragAndDropTransfer12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j12, l<? super DrawScope, g2> lVar) {
                q qVar;
                Ref.BooleanRef booleanRef2 = Ref.BooleanRef.this;
                qVar = this.startDrag;
                booleanRef2.element = ((Boolean) qVar.invoke(dragAndDropTransferData, Size.m2325boximpl(j12), lVar)).booleanValue();
                return Ref.BooleanRef.this.element;
            }
        }, j11, new a<Boolean>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$requestDragAndDropTransfer$1$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.valueOf(Ref.BooleanRef.this.element);
            }
        });
    }
}
