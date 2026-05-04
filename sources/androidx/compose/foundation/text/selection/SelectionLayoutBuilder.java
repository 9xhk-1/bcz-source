package androidx.compose.foundation.text.selection;

import a00.r0;
import androidx.collection.LongIntMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;

    @k
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;

    @k
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;

    @l
    private final Selection previousSelection;

    @k
    private final Comparator<Long> selectableIdOrderingComparator;

    @k
    private final MutableLongIntMap selectableIdToInfoListIndex;
    private int startSlot;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SelectionLayoutBuilder(long j11, long j12, LayoutCoordinates layoutCoordinates, boolean z11, Selection selection, Comparator comparator, v vVar) {
        this(j11, j12, layoutCoordinates, z11, selection, comparator);
    }

    private final int updateSlot(int i11, Direction direction, Direction direction2) {
        if (i11 == -1) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(direction, direction2).ordinal()];
            if (i12 == 1) {
                return this.currentSlot - 1;
            }
            if (i12 == 2) {
                return this.currentSlot;
            }
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i11;
    }

    @k
    public final SelectableInfo appendInfo(long j11, int i11, @k Direction direction, @k Direction direction2, int i12, @k Direction direction3, @k Direction direction4, int i13, @k TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(j11, this.currentSlot, i11, i12, i13, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, direction, direction2);
        this.endSlot = updateSlot(this.endSlot, direction3, direction4);
        this.selectableIdToInfoListIndex.set(j11, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    @l
    public final SelectionLayout build() {
        int i11 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            SelectableInfo selectableInfo = (SelectableInfo) r0.m5(this.infoList);
            int i12 = this.startSlot;
            int i13 = i12 == -1 ? i11 : i12;
            int i14 = this.endSlot;
            return new SingleSelectionLayout(this.isStartHandle, i13, i14 == -1 ? i11 : i14, this.previousSelection, selectableInfo);
        }
        MutableLongIntMap mutableLongIntMap = this.selectableIdToInfoListIndex;
        List<SelectableInfo> list = this.infoList;
        int i15 = this.startSlot;
        int i16 = i15 == -1 ? i11 : i15;
        int i17 = this.endSlot;
        return new MultiSelectionLayout(mutableLongIntMap, list, i16, i17 == -1 ? i11 : i17, this.isStartHandle, this.previousSelection);
    }

    @k
    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name */
    public final long m1450getCurrentPositionF1C5BW0() {
        return this.currentPosition;
    }

    /* renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name */
    public final long m1451getPreviousHandlePositionF1C5BW0() {
        return this.previousHandlePosition;
    }

    @l
    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @k
    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    public final boolean isStartHandle() {
        return this.isStartHandle;
    }

    private SelectionLayoutBuilder(long j11, long j12, LayoutCoordinates layoutCoordinates, boolean z11, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j11;
        this.previousHandlePosition = j12;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z11;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        this.selectableIdToInfoListIndex = LongIntMapKt.mutableLongIntMapOf();
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }
}
