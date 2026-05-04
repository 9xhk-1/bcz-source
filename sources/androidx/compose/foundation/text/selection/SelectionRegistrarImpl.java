package androidx.compose.foundation.text.selection;

import a00.l0;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import e00.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import x00.r;
import x00.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,217:1\n85#2:218\n113#2,2:219\n96#3,5:221\n96#3,5:226\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n100#1:218\n100#1:219,2\n103#1:221,5\n106#1:226,5\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    @k
    private final MutableLongObjectMap<Selectable> _selectableMap;

    @k
    private final List<Selectable> _selectables;

    @l
    private x00.l<? super Long, g2> afterSelectableUnsubscribe;

    @k
    private AtomicLong incrementId;

    @l
    private x00.l<? super Long, g2> onPositionChangeCallback;

    @l
    private x00.l<? super Long, g2> onSelectableChangeCallback;

    @l
    private t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;

    @l
    private x00.a<g2> onSelectionUpdateEndCallback;

    @l
    private p<? super Boolean, ? super Long, g2> onSelectionUpdateSelectAll;

    @l
    private r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, g2> onSelectionUpdateStartCallback;
    private boolean sorted;

    @k
    private final MutableState subselections$delegate;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new p<SaverScope, SelectionRegistrarImpl, Long>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // x00.p
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            AtomicLong atomicLong;
            atomicLong = selectionRegistrarImpl.incrementId;
            return Long.valueOf(atomicLong.get());
        }
    }, new x00.l<Long, SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ SelectionRegistrarImpl invoke(Long l11) {
            return invoke(l11.longValue());
        }

        public final SelectionRegistrarImpl invoke(long j11) {
            return new SelectionRegistrarImpl(j11, null);
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j11, v vVar) {
        this(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    @l
    public final x00.l<Long, g2> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    @l
    public final x00.l<Long, g2> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    @l
    public final x00.l<Long, g2> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    @l
    public final t<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    @l
    public final x00.a<g2> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    @l
    public final p<Boolean, Long, g2> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    @l
    public final r<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, g2> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    @k
    public final LongObjectMap<Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    @k
    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final boolean getSorted$foundation_release() {
        return this.sorted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @k
    public LongObjectMap<Selection> getSubselections() {
        return (LongObjectMap) this.subselections$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j11) {
        this.sorted = false;
        x00.l<? super Long, g2> lVar = this.onPositionChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j11));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j11) {
        x00.l<? super Long, g2> lVar = this.onSelectableChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j11));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo1494notifySelectionUpdatenjBpvok(@k LayoutCoordinates layoutCoordinates, long j11, long j12, boolean z11, @k SelectionAdjustment selectionAdjustment, boolean z12) {
        t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> tVar = this.onSelectionUpdateCallback;
        if (tVar != null) {
            return tVar.invoke(Boolean.valueOf(z12), layoutCoordinates, Offset.m2257boximpl(j11), Offset.m2257boximpl(j12), Boolean.valueOf(z11), selectionAdjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        x00.a<g2> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j11, boolean z11) {
        p<? super Boolean, ? super Long, g2> pVar = this.onSelectionUpdateSelectAll;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z11), Long.valueOf(j11));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo1495notifySelectionUpdateStartubNVwUQ(@k LayoutCoordinates layoutCoordinates, long j11, @k SelectionAdjustment selectionAdjustment, boolean z11) {
        r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, g2> rVar = this.onSelectionUpdateStartCallback;
        if (rVar != null) {
            rVar.invoke(Boolean.valueOf(z11), layoutCoordinates, Offset.m2257boximpl(j11), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@l x00.l<? super Long, g2> lVar) {
        this.afterSelectableUnsubscribe = lVar;
    }

    public final void setOnPositionChangeCallback$foundation_release(@l x00.l<? super Long, g2> lVar) {
        this.onPositionChangeCallback = lVar;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@l x00.l<? super Long, g2> lVar) {
        this.onSelectableChangeCallback = lVar;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@l t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> tVar) {
        this.onSelectionUpdateCallback = tVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@l x00.a<g2> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@l p<? super Boolean, ? super Long, g2> pVar) {
        this.onSelectionUpdateSelectAll = pVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@l r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, g2> rVar) {
        this.onSelectionUpdateStartCallback = rVar;
    }

    public final void setSorted$foundation_release(boolean z11) {
        this.sorted = z11;
    }

    public void setSubselections(@k LongObjectMap<Selection> longObjectMap) {
        this.subselections$delegate.setValue(longObjectMap);
    }

    @k
    public final List<Selectable> sort(@k final LayoutCoordinates layoutCoordinates) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final p<Selectable, Selectable, Integer> pVar = new p<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$sort$1
                {
                    super(2);
                }

                @Override // x00.p
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
                    long mo3866localPositionOfR5De75A = layoutCoordinates2 != null ? LayoutCoordinates.this.mo3866localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m2284getZeroF1C5BW0()) : Offset.Companion.m2284getZeroF1C5BW0();
                    long mo3866localPositionOfR5De75A2 = layoutCoordinates3 != null ? LayoutCoordinates.this.mo3866localPositionOfR5De75A(layoutCoordinates3, Offset.Companion.m2284getZeroF1C5BW0()) : Offset.Companion.m2284getZeroF1C5BW0();
                    int i11 = (int) (mo3866localPositionOfR5De75A & 4294967295L);
                    int i12 = (int) (4294967295L & mo3866localPositionOfR5De75A2);
                    return Integer.valueOf(Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12) ? g.l(Float.valueOf(Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A >> 32))), Float.valueOf(Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A2 >> 32)))) : g.l(Float.valueOf(Float.intBitsToFloat(i11)), Float.valueOf(Float.intBitsToFloat(i12))));
                }
            };
            l0.r0(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int sort$lambda$2;
                    sort$lambda$2 = SelectionRegistrarImpl.sort$lambda$2(p.this, obj, obj2);
                    return sort$lambda$2;
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @k
    public Selectable subscribe(@k Selectable selectable) {
        if (!(selectable.getSelectableId() != 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The selectable contains an invalid id: " + selectable.getSelectableId());
        }
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            InlineClassHelperKt.throwIllegalArgumentException("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.set(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(@k Selectable selectable) {
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(selectable.getSelectableId());
            x00.l<? super Long, g2> lVar = this.afterSelectableUnsubscribe;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    private SelectionRegistrarImpl(long j11) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.mutableLongObjectMapOf();
        this.incrementId = new AtomicLong(j11);
        this.subselections$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
