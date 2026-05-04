package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMap;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,762:1\n50#2,5:763\n50#2,5:768\n50#2,5:774\n1#3:773\n70#4,6:779\n*S KotlinDebug\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n*L\n148#1:763,5\n225#1:768,5\n265#1:774,5\n282#1:779,6\n*E\n"})
/* loaded from: classes.dex */
final class MultiSelectionLayout implements SelectionLayout {
    private final int endSlot;

    @k
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;

    @l
    private final Selection previousSelection;

    @k
    private final LongIntMap selectableIdToInfoListIndex;
    private final int startSlot;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiSelectionLayout(@k LongIntMap longIntMap, @k List<SelectableInfo> list, int i11, int i12, boolean z11, @l Selection selection) {
        this.selectableIdToInfoListIndex = longIntMap;
        this.infoList = list;
        this.startSlot = i11;
        this.endSlot = i12;
        this.isStartHandle = z11;
        this.previousSelection = selection;
        if (list.size() > 1) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndPutSubSelection(MutableLongObjectMap<Selection> mutableLongObjectMap, Selection selection, SelectableInfo selectableInfo, int i11, int i12) {
        Selection makeSingleLayoutSelection = selection.getHandlesCrossed() ? selectableInfo.makeSingleLayoutSelection(i12, i11) : selectableInfo.makeSingleLayoutSelection(i11, i12);
        if (!(i11 <= i12)) {
            InlineClassHelperKt.throwIllegalStateException("minOffset should be less than or equal to maxOffset: " + makeSingleLayoutSelection);
        }
        mutableLongObjectMap.put(selectableInfo.getSelectableId(), makeSingleLayoutSelection);
    }

    private final int getInfoListIndexBySelectableId(long j11) {
        try {
            return this.selectableIdToInfoListIndex.get(j11);
        } catch (NoSuchElementException e11) {
            throw new IllegalStateException("Invalid selectableId: " + j11, e11);
        }
    }

    private final boolean shouldAnyInfoRecomputeSelection(MultiSelectionLayout multiSelectionLayout) {
        if (getSize() != multiSelectionLayout.getSize()) {
            return true;
        }
        int size = this.infoList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.infoList.get(i11).shouldRecomputeSelection(multiSelectionLayout.infoList.get(i11))) {
                return true;
            }
        }
        return false;
    }

    private final int slotToIndex(int i11, boolean z11) {
        return (i11 - (!z11 ? 1 : 0)) / 2;
    }

    private final int startOrEndSlotToIndex(int i11, boolean z11) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[getCrossStatus().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z11) {
                    z11 = false;
                }
            }
            return slotToIndex(i11, z11);
        }
        z11 = true;
        return slotToIndex(i11, z11);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public LongObjectMap<Selection> createSubSelections(@k final Selection selection) {
        if (selection.getStart().getSelectableId() != selection.getEnd().getSelectableId()) {
            final MutableLongObjectMap<Selection> mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
            createAndPutSubSelection(mutableLongObjectMapOf, selection, getFirstInfo(), (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset(), getFirstInfo().getTextLength());
            forEachMiddleInfo(new x00.l<SelectableInfo, g2>() { // from class: androidx.compose.foundation.text.selection.MultiSelectionLayout$createSubSelections$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(SelectableInfo selectableInfo) {
                    invoke2(selectableInfo);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SelectableInfo selectableInfo) {
                    MultiSelectionLayout.this.createAndPutSubSelection(mutableLongObjectMapOf, selection, selectableInfo, 0, selectableInfo.getTextLength());
                }
            });
            createAndPutSubSelection(mutableLongObjectMapOf, selection, getLastInfo(), 0, (selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset());
            return mutableLongObjectMapOf;
        }
        if (!((selection.getHandlesCrossed() && selection.getStart().getOffset() >= selection.getEnd().getOffset()) || (!selection.getHandlesCrossed() && selection.getStart().getOffset() <= selection.getEnd().getOffset()))) {
            InlineClassHelperKt.throwIllegalStateException("unexpectedly miss-crossed selection: " + selection);
        }
        return LongObjectMapKt.longObjectMapOf(selection.getStart().getSelectableId(), selection);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public void forEachMiddleInfo(@k x00.l<? super SelectableInfo, g2> lVar) {
        int infoListIndexBySelectableId = getInfoListIndexBySelectableId(getFirstInfo().getSelectableId());
        int infoListIndexBySelectableId2 = getInfoListIndexBySelectableId(getLastInfo().getSelectableId());
        int i11 = infoListIndexBySelectableId + 1;
        if (i11 >= infoListIndexBySelectableId2) {
            return;
        }
        while (i11 < infoListIndexBySelectableId2) {
            lVar.invoke(this.infoList.get(i11));
            i11++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public CrossStatus getCrossStatus() {
        return getStartSlot() < getEndSlot() ? CrossStatus.NOT_CROSSED : getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.infoList.get(getStartSlot() / 2).getRawCrossStatus();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getCurrentInfo() {
        return isStartHandle() ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getEndInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getEndSlot(), false));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getFirstInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getEndInfo() : getStartInfo();
    }

    @k
    public final List<SelectableInfo> getInfoList() {
        return this.infoList;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getLastInfo() {
        return getCrossStatus() == CrossStatus.CROSSED ? getStartInfo() : getEndInfo();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @l
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @k
    public final LongIntMap getSelectableIdToInfoListIndex() {
        return this.selectableIdToInfoListIndex;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getSize() {
        return this.infoList.size();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    @k
    public SelectableInfo getStartInfo() {
        return this.infoList.get(startOrEndSlotToIndex(getStartSlot(), true));
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean isStartHandle() {
        return this.isStartHandle;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public boolean shouldRecomputeSelection(@l SelectionLayout selectionLayout) {
        return (getPreviousSelection() != null && selectionLayout != null && (selectionLayout instanceof MultiSelectionLayout) && isStartHandle() == selectionLayout.isStartHandle() && getStartSlot() == selectionLayout.getStartSlot() && getEndSlot() == selectionLayout.getEndSlot() && !shouldAnyInfoRecomputeSelection((MultiSelectionLayout) selectionLayout)) ? false : true;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiSelectionLayout(isStartHandle=");
        sb2.append(isStartHandle());
        sb2.append(", startPosition=");
        boolean z11 = true;
        float f11 = 2;
        sb2.append((getStartSlot() + 1) / f11);
        sb2.append(", endPosition=");
        sb2.append((getEndSlot() + 1) / f11);
        sb2.append(", crossed=");
        sb2.append(getCrossStatus());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[\n\t");
        List<SelectableInfo> list = this.infoList;
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            SelectableInfo selectableInfo = list.get(i11);
            if (z11) {
                z11 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i11++;
            sb4.append(i11);
            sb4.append(" -> ");
            sb4.append(selectableInfo);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String sb5 = sb3.toString();
        g0.o(sb5, "toString(...)");
        sb2.append(sb5);
        sb2.append(')');
        return sb2.toString();
    }
}
