package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n+ 2 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4891:1\n29#2,8:4892\n37#2:4906\n287#3,6:4900\n287#3,6:4913\n919#4,2:4907\n174#5,4:4909\n179#5,3:4920\n1#6:4919\n4643#7,5:4923\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n*L\n422#1:4892,8\n422#1:4906\n422#1:4900,6\n445#1:4913,6\n422#1:4907,2\n426#1:4909,4\n426#1:4920,3\n426#1:4919\n442#1:4923,5\n*E\n"})
/* loaded from: classes.dex */
public final class MovableContentState {
    public static final int $stable = 8;

    @k
    private final SlotTable slotTable;

    public MovableContentState(@k SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    private static final void extractNestedStates$lambda$3$closeToGroupContaining(SlotWriter slotWriter, int i11) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i11) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$3$openParent(SlotWriter slotWriter, int i11) {
        int nextGroup;
        extractNestedStates$lambda$3$closeToGroupContaining(slotWriter, i11);
        while (slotWriter.getCurrentGroup() != i11 && !slotWriter.isGroupEnd()) {
            nextGroup = ComposerKt.getNextGroup(slotWriter);
            if (i11 < nextGroup) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i11)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    @k
    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime_release(@k Applier<?> applier, @k ObjectList<MovableContentStateReference> objectList) {
        Object[] objArr = objectList.content;
        int i11 = objectList._size;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            if (this.slotTable.ownsAnchor(((MovableContentStateReference) objArr[i12]).getAnchor$runtime_release())) {
                i12++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i13 = objectList._size;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object obj = objArr2[i14];
                    if (this.slotTable.ownsAnchor(((MovableContentStateReference) obj).getAnchor$runtime_release())) {
                        mutableObjectList.add(obj);
                    }
                }
                objectList = mutableObjectList;
            }
        }
        ObjectList sortedBy = ExtensionsKt.sortedBy(objectList, new l<MovableContentStateReference, Integer>() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // x00.l
            public final Integer invoke(MovableContentStateReference movableContentStateReference) {
                return Integer.valueOf(MovableContentState.this.getSlotTable$runtime_release().anchorIndex(movableContentStateReference.getAnchor$runtime_release()));
            }
        });
        if (sortedBy.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotWriter openWriter = this.slotTable.openWriter();
        try {
            Object[] objArr3 = sortedBy.content;
            int i15 = sortedBy._size;
            for (int i16 = 0; i16 < i15; i16++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i16];
                int anchorIndex = openWriter.anchorIndex(movableContentStateReference.getAnchor$runtime_release());
                int parent = openWriter.parent(anchorIndex);
                extractNestedStates$lambda$3$closeToGroupContaining(openWriter, parent);
                extractNestedStates$lambda$3$openParent(openWriter, parent);
                openWriter.advanceBy(anchorIndex - openWriter.getCurrentGroup());
                mutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition$runtime_release(), movableContentStateReference, openWriter, applier));
            }
            extractNestedStates$lambda$3$closeToGroupContaining(openWriter, Integer.MAX_VALUE);
            g2 g2Var = g2.f100423a;
            openWriter.close(true);
            return mutableScatterMapOf;
        } catch (Throwable th2) {
            openWriter.close(false);
            throw th2;
        }
    }

    @k
    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }
}
