package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import e00.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.r;
import x00.t;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 8 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,1107:1\n85#2:1108\n113#2,2:1109\n85#2:1111\n113#2,2:1112\n85#2:1114\n113#2,2:1115\n85#2:1117\n113#2,2:1118\n85#2:1120\n113#2,2:1121\n85#2:1123\n113#2,2:1124\n85#2:1127\n113#2,2:1128\n1#3:1126\n1#3:1192\n278#4:1130\n278#4:1131\n278#4:1207\n107#5,7:1132\n96#5,5:1139\n269#6,3:1144\n34#6,6:1147\n272#6:1153\n87#6,2:1154\n34#6,6:1156\n89#6:1162\n34#6,6:1163\n102#6,2:1169\n34#6,6:1171\n104#6:1177\n34#6,6:1179\n439#6,3:1185\n34#6,4:1188\n39#6:1193\n442#6:1194\n70#6,6:1201\n34#6,6:1208\n102#6,2:1214\n34#6,6:1216\n104#6:1222\n102#6,2:1223\n34#6,6:1225\n104#6:1231\n1565#7:1178\n56#8,6:1195\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n131#1:1108\n131#1:1109,2\n181#1:1111\n181#1:1112,2\n188#1:1114\n188#1:1115,2\n196#1:1117\n196#1:1118,2\n204#1:1120\n204#1:1121,2\n211#1:1123\n211#1:1124,2\n234#1:1127\n234#1:1128,2\n619#1:1192\n387#1:1130\n399#1:1131\n884#1:1207\n411#1:1132,7\n412#1:1139,5\n422#1:1144,3\n422#1:1147,6\n422#1:1153\n445#1:1154,2\n445#1:1156,6\n445#1:1162\n472#1:1163,6\n532#1:1169,2\n532#1:1171,6\n532#1:1177\n545#1:1179,6\n619#1:1185,3\n619#1:1188,4\n619#1:1193\n619#1:1194\n877#1:1201,6\n895#1:1208,6\n910#1:1214,2\n910#1:1216,6\n910#1:1222\n922#1:1223,2\n922#1:1225,6\n922#1:1231\n544#1:1178\n634#1:1195,6\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;

    @l
    private LayoutCoordinates containerLayoutCoordinates;

    @k
    private final MutableState currentDragPosition$delegate;

    @k
    private final MutableState dragBeginPosition$delegate;

    @k
    private final MutableState dragTotalDistance$delegate;

    @k
    private final MutableState draggingHandle$delegate;

    @k
    private final MutableState endHandlePosition$delegate;

    @l
    private HapticFeedback hapticFeedBack;

    @l
    private x00.l<? super AnnotatedString, g2> onCopyHandler;

    @l
    private Offset previousPosition;

    @l
    private SelectionLayout previousSelectionLayout;

    @k
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;

    @k
    private final MutableState startHandlePosition$delegate;

    @l
    private TextToolbar textToolbar;

    @k
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @k
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @k
    private x00.l<? super Selection, g2> onSelectionChange = new x00.l<Selection, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Selection selection) {
            invoke2(selection);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Selection selection) {
            SelectionManager.this.setSelection(selection);
        }
    };

    @k
    private FocusRequester focusRequester = new FocusRequester();

    @k
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public SelectionManager(@k SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2257boximpl(companion.m2284getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2257boximpl(companion.m2284getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new x00.l<Long, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j11) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j11)) {
                    SelectionManager.this.updateHandleOffsets();
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new r<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                m1481invokeRg1IO4c(bool.booleanValue(), layoutCoordinates, offset.m2278unboximpl(), selectionAdjustment);
                return g2.f100423a;
            }

            /* renamed from: invoke-Rg1IO4c, reason: not valid java name */
            public final void m1481invokeRg1IO4c(boolean z11, LayoutCoordinates layoutCoordinates, long j11, SelectionAdjustment selectionAdjustment) {
                long mo3865getSizeYbymL2g = layoutCoordinates.mo3865getSizeYbymL2g();
                Rect rect = new Rect(0.0f, 0.0f, (int) (mo3865getSizeYbymL2g >> 32), (int) (mo3865getSizeYbymL2g & 4294967295L));
                if (!SelectionManagerKt.m1485containsInclusiveUv8p0NA(rect, j11)) {
                    j11 = TextLayoutStateKt.m1304coerceIn3MmeM6k(j11, rect);
                }
                long m1465convertToContainerCoordinatesR5De75A = SelectionManager.this.m1465convertToContainerCoordinatesR5De75A(layoutCoordinates, j11);
                if ((9223372034707292159L & m1465convertToContainerCoordinatesR5De75A) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    SelectionManager.this.setInTouchMode(z11);
                    SelectionManager.this.m1472startSelection9KIMszo(m1465convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                    FocusRequester.m2179requestFocus3ESFkO8$default(SelectionManager.this.getFocusRequester(), 0, 1, null);
                    SelectionManager.this.setShowToolbar$foundation_release(false);
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new p<Boolean, Long, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Boolean bool, Long l11) {
                invoke(bool.booleanValue(), l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(boolean z11, long j11) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release = selectionManager.selectAllInSelectable$foundation_release(j11, selectionManager.getSelection());
                Selection component1 = selectAllInSelectable$foundation_release.component1();
                LongObjectMap<Selection> component2 = selectAllInSelectable$foundation_release.component2();
                if (!g0.g(component1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(component2);
                    SelectionManager.this.getOnSelectionChange().invoke(component1);
                }
                SelectionManager.this.setInTouchMode(z11);
                FocusRequester.m2179requestFocus3ESFkO8$default(SelectionManager.this.getFocusRequester(), 0, 1, null);
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new t<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(6);
            }

            @Override // x00.t
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool2, SelectionAdjustment selectionAdjustment) {
                return m1482invokepGV3PM0(bool.booleanValue(), layoutCoordinates, offset.m2278unboximpl(), offset2.m2278unboximpl(), bool2.booleanValue(), selectionAdjustment);
            }

            /* renamed from: invoke-pGV3PM0, reason: not valid java name */
            public final Boolean m1482invokepGV3PM0(boolean z11, LayoutCoordinates layoutCoordinates, long j11, long j12, boolean z12, SelectionAdjustment selectionAdjustment) {
                long m1465convertToContainerCoordinatesR5De75A = SelectionManager.this.m1465convertToContainerCoordinatesR5De75A(layoutCoordinates, j11);
                long m1465convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m1465convertToContainerCoordinatesR5De75A(layoutCoordinates, j12);
                SelectionManager.this.setInTouchMode(z11);
                return Boolean.valueOf(SelectionManager.this.m1480updateSelectionqNKwrvQ$foundation_release(Offset.m2257boximpl(m1465convertToContainerCoordinatesR5De75A), m1465convertToContainerCoordinatesR5De75A2, z12, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
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
                SelectionManager.this.setShowToolbar$foundation_release(true);
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1467setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new x00.l<Long, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j11) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j11)) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new x00.l<Long, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Long l11) {
                invoke(l11.longValue());
                return g2.f100423a;
            }

            public final void invoke(long j11) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (selection != null && (start = selection.getStart()) != null && j11 == start.getSelectableId()) {
                    SelectionManager.this.m1471setStartHandlePosition_kEHs6E(null);
                }
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 != null && (end = selection2.getEnd()) != null && j11 == end.getSelectableId()) {
                    SelectionManager.this.m1470setEndHandlePosition_kEHs6E(null);
                }
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j11)) {
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m1465convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j11) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? Offset.Companion.m2283getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation_release().mo3866localPositionOfR5De75A(layoutCoordinates, j11);
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        List firstAndLast;
        Rect rect;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(sort.size());
        int size = sort.size();
        for (int i11 = 0; i11 < size; i11++) {
            Selectable selectable = sort.get(i11);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            Pair a11 = selection != null ? h1.a(selectable, selection) : null;
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        firstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (firstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(firstAndLast, layoutCoordinates);
        rect = SelectionManagerKt.invertedInfiniteRect;
        if (g0.g(selectedRegionRect, rect)) {
            return null;
        }
        Rect intersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getRight() - intersect.getLeft() < 0.0f || intersect.getBottom() - intersect.getTop() < 0.0f) {
            return null;
        }
        Rect m2305translatek4lQ0M = intersect.m2305translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(m2305translatek4lQ0M, 0.0f, 0.0f, 0.0f, m2305translatek4lQ0M.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m1466getSelectionLayoutWko1d7g(long j11, long j12, boolean z11) {
        LayoutCoordinates requireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release);
        final MutableLongIntMap mutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        List<Selectable> list = sort;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            mutableLongIntMapOf.set(sort.get(i11).getSelectableId(), i11);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j11, j12, requireContainerCoordinates$foundation_release, z11, (j12 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(Integer.valueOf(MutableLongIntMap.this.get(((Number) t11).longValue())), Integer.valueOf(MutableLongIntMap.this.get(((Number) t12).longValue())));
            }
        }, null);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sort.get(i12).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final boolean getShouldShowMagnifier() {
        return isDraggingInProgress() && isInTouchMode() && !isTriviallyCollapsedSelection$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDraggingInProgress() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, final x00.a<g2> aVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, g2.f100423a, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", i = {0}, l = {754, 760}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
                final /* synthetic */ x00.a<g2> $block;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectionManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SelectionManager selectionManager, x00.a<g2> aVar, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = selectionManager;
                    this.$block = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        kotlin.e.n(r11)
                        r7 = r10
                        goto L4d
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        java.lang.Object r1 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.e.n(r11)
                        r7 = r10
                        goto L3d
                    L24:
                        kotlin.e.n(r11)
                        java.lang.Object r11 = r10.L$0
                        r4 = r11
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        r10.L$0 = r4
                        r10.label = r3
                        r5 = 0
                        r6 = 0
                        r8 = 2
                        r9 = 0
                        r7 = r10
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown$default(r4, r5, r6, r7, r8, r9)
                        if (r11 != r0) goto L3c
                        goto L4c
                    L3c:
                        r1 = r4
                    L3d:
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r4 = 0
                        r7.L$0 = r4
                        r7.label = r2
                        java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(r1, r11, r3, r10)
                        if (r11 != r0) goto L4d
                    L4c:
                        return r0
                    L4d:
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        if (r11 != 0) goto L62
                        androidx.compose.foundation.text.selection.SelectionManager r11 = r7.this$0
                        boolean r11 = androidx.compose.foundation.text.selection.SelectionManager.access$isDraggingInProgress(r11)
                        if (r11 != 0) goto L62
                        x00.a<yz.g2> r11 = r7.$block
                        r11.invoke()
                    L62:
                        yz.g2 r11 = yz.g2.f100423a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(SelectionManager.this, aVar, null), cVar);
                return awaitEachGesture == kotlin.coroutines.intrinsics.b.l() ? awaitEachGesture : g2.f100423a;
            }
        });
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(selection));
        this.onSelectionChange.invoke(selection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1467setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m1468setDragBeginPositionk4lQ0M(long j11) {
        this.dragBeginPosition$delegate.setValue(Offset.m2257boximpl(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m1469setDragTotalDistancek4lQ0M(long j11) {
        this.dragTotalDistance$delegate.setValue(Offset.m2257boximpl(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1470setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1471setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m1472startSelection9KIMszo(long j11, boolean z11, SelectionAdjustment selectionAdjustment) {
        this.previousSelectionLayout = null;
        m1479updateSelectionjyLRC_s$foundation_release(j11, Offset.Companion.m2283getUnspecifiedF1C5BW0(), z11, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m1485containsInclusiveUv8p0NA(r8, r13) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateHandleOffsets() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.text.selection.Selection r1 = r0.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.containerLayoutCoordinates
            r3 = 0
            if (r1 == 0) goto L16
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r1.getStart()
            if (r4 == 0) goto L16
            androidx.compose.foundation.text.selection.Selectable r4 = r0.getAnchorSelectable$foundation_release(r4)
            goto L17
        L16:
            r4 = r3
        L17:
            if (r1 == 0) goto L24
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r5 = r1.getEnd()
            if (r5 == 0) goto L24
            androidx.compose.foundation.text.selection.Selectable r5 = r0.getAnchorSelectable$foundation_release(r5)
            goto L25
        L24:
            r5 = r3
        L25:
            if (r4 == 0) goto L2c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.getLayoutCoordinates()
            goto L2d
        L2c:
            r6 = r3
        L2d:
            if (r5 == 0) goto L34
            androidx.compose.ui.layout.LayoutCoordinates r7 = r5.getLayoutCoordinates()
            goto L35
        L34:
            r7 = r3
        L35:
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r8 = r2.isAttached()
            if (r8 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L7b
            r13 = 1
            long r13 = r4.mo1435getHandlePositiondBAh8RU(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7b
        L60:
            long r13 = r2.mo3866localPositionOfR5De75A(r6, r13)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m2257boximpl(r13)
            long r13 = r4.m2278unboximpl()
            androidx.compose.foundation.text.Handle r6 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r15 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r6 == r15) goto L7c
            boolean r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1485containsInclusiveUv8p0NA(r8, r13)
            if (r6 == 0) goto L7b
            goto L7c
        L7b:
            r4 = r3
        L7c:
            r0.m1471setStartHandlePosition_kEHs6E(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.mo1435getHandlePositiondBAh8RU(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L8c
            goto La7
        L8c:
            long r1 = r2.mo3866localPositionOfR5De75A(r7, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m2257boximpl(r1)
            long r4 = r1.m2278unboximpl()
            androidx.compose.foundation.text.Handle r2 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r6 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r2 == r6) goto La6
            boolean r2 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1485containsInclusiveUv8p0NA(r8, r4)
            if (r2 == 0) goto La7
        La6:
            r3 = r1
        La7:
            r0.m1470setEndHandlePosition_kEHs6E(r3)
            return
        Lab:
            r0.m1471setStartHandlePosition_kEHs6E(r3)
            r0.m1470setEndHandlePosition_kEHs6E(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        TextToolbar textToolbar;
        if (getHasFocus() && (textToolbar = this.textToolbar) != null) {
            if (!this.showToolbar || !isInTouchMode()) {
                if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                    textToolbar.hide();
                }
            } else {
                Rect contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                TextToolbar.showMenu$default(textToolbar, contentRect, isNonEmptySelection$foundation_release() ? new SelectionManager$updateSelectionToolbar$1(this) : null, null, null, isEntireContainerSelected$foundation_release() ? null : new SelectionManager$updateSelectionToolbar$2(this), null, 12, null);
            }
        }
    }

    public final void copy$foundation_release() {
        x00.l<? super AnnotatedString, g2> lVar;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (lVar = this.onCopyHandler) == null) {
                return;
            }
            lVar.invoke(selectedText$foundation_release);
        }
    }

    @l
    public final Selectable getAnchorSelectable$foundation_release(@k Selection.AnchorInfo anchorInfo) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(anchorInfo.getSelectableId());
    }

    @l
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1473getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1474getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m2278unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1475getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m2278unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final float getEndHandleLineHeight() {
        Selectable anchorSelectable$foundation_release;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation_release.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1476getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    @k
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @l
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    @k
    public final Modifier getModifier() {
        Modifier modifier = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifier, new x00.a<g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
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
                SelectionManager.this.onRelease();
            }
        }), new x00.l<LayoutCoordinates, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                SelectionManager.this.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new x00.l<FocusState, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(FocusState focusState) {
                invoke2(focusState);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusState focusState) {
                if (!focusState.getHasFocus() && SelectionManager.this.getHasFocus()) {
                    SelectionManager.this.onRelease();
                }
                SelectionManager.this.setHasFocus(focusState.getHasFocus());
            }
        }), false, null, 3, null), new x00.l<Boolean, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return g2.f100423a;
            }

            public final void invoke(boolean z11) {
                SelectionManager.this.setInTouchMode(z11);
            }
        }), new x00.l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1483invokeZmokQxo(keyEvent.m3577unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1483invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z11;
                if (SelectionManager_androidKt.m1487isCopyKeyEventZmokQxo(keyEvent)) {
                    SelectionManager.this.copy$foundation_release();
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        if (getShouldShowMagnifier()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return onKeyEvent.then(modifier);
    }

    @l
    public final x00.l<AnnotatedString, g2> getOnCopyHandler() {
        return this.onCopyHandler;
    }

    @k
    public final x00.l<Selection, g2> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    @l
    public final SelectionLayout getPreviousSelectionLayout$foundation_release() {
        return this.previousSelectionLayout;
    }

    @l
    public final AnnotatedString getSelectedText$foundation_release() {
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i11 = 0; i11 < size; i11++) {
            Selectable selectable = sort.get(i11);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection != null) {
                AnnotatedString text = selectable.getText();
                builder.append(selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset()));
            }
        }
        return builder.toAnnotatedString();
    }

    @l
    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.showToolbar;
    }

    public final float getStartHandleLineHeight() {
        Selectable anchorSelectable$foundation_release;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation_release.getLineHeight(selection.getStart().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1477getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    @l
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @k
    public final TextDragObserver handleDragObserver(final boolean z11) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            private final void done() {
                this.setShowToolbar$foundation_release(true);
                this.setDraggingHandle(null);
                this.m1467setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1132onDownk4lQ0M(long j11) {
                LayoutCoordinates layoutCoordinates;
                Offset m1477getStartHandlePosition_m7T9E = z11 ? this.m1477getStartHandlePosition_m7T9E() : this.m1476getEndHandlePosition_m7T9E();
                if (m1477getStartHandlePosition_m7T9E != null) {
                    m1477getStartHandlePosition_m7T9E.m2278unboximpl();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation_release = this.getAnchorSelectable$foundation_release(z11 ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long mo1435getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo1435getHandlePositiondBAh8RU(selection, z11);
                    if ((9223372034707292159L & mo1435getHandlePositiondBAh8RU) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                        return;
                    }
                    long m1449getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1449getAdjustedCoordinatesk4lQ0M(mo1435getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m1467setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo3866localPositionOfR5De75A(layoutCoordinates, m1449getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(z11 ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1133onDragk4lQ0M(long j11) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m1469setDragTotalDistancek4lQ0M(Offset.m2273plusMKHz9U(selectionManager.m1475getDragTotalDistanceF1C5BW0$foundation_release(), j11));
                long m2273plusMKHz9U = Offset.m2273plusMKHz9U(this.m1474getDragBeginPositionF1C5BW0$foundation_release(), this.m1475getDragTotalDistanceF1C5BW0$foundation_release());
                if (this.m1480updateSelectionqNKwrvQ$foundation_release(Offset.m2257boximpl(m2273plusMKHz9U), this.m1474getDragBeginPositionF1C5BW0$foundation_release(), z11, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    this.m1468setDragBeginPositionk4lQ0M(m2273plusMKHz9U);
                    this.m1469setDragTotalDistancek4lQ0M(Offset.Companion.m2284getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1134onStartk4lQ0M(long j11) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                g0.m(selection);
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get((z11 ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable == null) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new KotlinNothingValueException();
                }
                Selectable selectable2 = selectable;
                LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    throw new KotlinNothingValueException();
                }
                long mo1435getHandlePositiondBAh8RU = selectable2.mo1435getHandlePositiondBAh8RU(selection, z11);
                if ((9223372034707292159L & mo1435getHandlePositiondBAh8RU) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                long m1449getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1449getAdjustedCoordinatesk4lQ0M(mo1435getHandlePositiondBAh8RU);
                SelectionManager selectionManager = this;
                selectionManager.m1468setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo3866localPositionOfR5De75A(layoutCoordinates, m1449getAdjustedCoordinatesk4lQ0M));
                this.m1469setDragTotalDistancek4lQ0M(Offset.Companion.m2284getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }
        };
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        Selection selection;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (sort.isEmpty()) {
            return true;
        }
        int size = sort.size();
        for (int i11 = 0; i11 < size; i11++) {
            Selectable selectable = sort.get(i11);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null || g0.g(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i11 = 0; i11 < size; i11++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(sort.get(i11).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return g0.g(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
        }
    }

    @k
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!layoutCoordinates.isAttached()) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void selectAll$foundation_release() {
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (sort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = sort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            Selectable selectable = sort.get(i11);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            g0.m(selection);
            Selection.AnchorInfo start = selection.getStart();
            g0.m(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    @k
    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release(long j11, @l Selection selection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            Selectable selectable = sort.get(i11);
            Selection selectAllSelection = selectable.getSelectableId() == j11 ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selection2 = SelectionManagerKt.merge(selection2, selectAllSelection);
        }
        if (isInTouchMode() && !g0.g(selection2, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection2, mutableLongObjectMapOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a A[LOOP:0: B:6:0x001b->B:12:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[SYNTHETIC] */
    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1478selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long r13) {
        /*
            r12 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r12.containerLayoutCoordinates
            if (r0 != 0) goto L5
            goto L68
        L5:
            boolean r1 = r0.isAttached()
            if (r1 != 0) goto Lc
            goto L68
        Lc:
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r1 = r12.selectionRegistrar
            java.util.List r1 = r1.getSelectables$foundation_release()
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        L1b:
            r5 = 1
            if (r4 >= r2) goto L5d
            java.lang.Object r6 = r1.get(r4)
            androidx.compose.foundation.text.selection.Selectable r6 = (androidx.compose.foundation.text.selection.Selectable) r6
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r7 = r12.selectionRegistrar
            androidx.collection.LongObjectMap r7 = r7.getSubselections()
            long r8 = r6.getSelectableId()
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.foundation.text.selection.Selection r7 = (androidx.compose.foundation.text.selection.Selection) r7
            if (r7 != 0) goto L38
        L36:
            r6 = r3
            goto L56
        L38:
            androidx.compose.ui.layout.LayoutCoordinates r8 = r6.getLayoutCoordinates()
            if (r8 != 0) goto L3f
            goto L36
        L3f:
            long r8 = r8.mo3866localPositionOfR5De75A(r0, r13)
            androidx.compose.ui.text.TextLayoutResult r6 = r6.textLayoutResult()
            if (r6 != 0) goto L4a
            goto L36
        L4a:
            long r10 = r7.m1441toTextRanged9O1mEE()
            androidx.compose.ui.text.TextRange r7 = androidx.compose.ui.text.TextRange.m4547boximpl(r10)
            boolean r6 = androidx.compose.foundation.text.TextLayoutHelperKt.m1163isPositionInsideSelectionuaM50fQ(r6, r8, r7)
        L56:
            if (r6 == 0) goto L5a
            r3 = r5
            goto L5d
        L5a:
            int r4 = r4 + 1
            goto L1b
        L5d:
            if (r3 != 0) goto L68
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getWord()
            r12.m1472startSelection9KIMszo(r13, r5, r0)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.m1478selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long):void");
    }

    public final void setContainerLayoutCoordinates(@l LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset m2257boximpl = layoutCoordinates != null ? Offset.m2257boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (g0.g(this.previousPosition, m2257boximpl)) {
            return;
        }
        this.previousPosition = m2257boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    public final void setFocusRequester(@k FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@l HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z11) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setInTouchMode(boolean z11) {
        if (this._isInTouchMode.getValue().booleanValue() != z11) {
            this._isInTouchMode.setValue(Boolean.valueOf(z11));
            updateSelectionToolbar();
        }
    }

    public final void setOnCopyHandler(@l x00.l<? super AnnotatedString, g2> lVar) {
        this.onCopyHandler = lVar;
    }

    public final void setOnSelectionChange(@k final x00.l<? super Selection, g2> lVar) {
        this.onSelectionChange = new x00.l<Selection, g2>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Selection selection) {
                invoke2(selection);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Selection selection) {
                SelectionManager.this.setSelection(selection);
                lVar.invoke(selection);
            }
        };
    }

    public final void setPreviousSelectionLayout$foundation_release(@l SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final void setSelection(@l Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setShowToolbar$foundation_release(boolean z11) {
        this.showToolbar = z11;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(@l TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    @VisibleForTesting
    public final boolean shouldPerformHaptics$foundation_release() {
        if (isInTouchMode()) {
            List<Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
            int size = selectables$foundation_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (selectables$foundation_release.get(i11).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m1479updateSelectionjyLRC_s$foundation_release(long j11, long j12, boolean z11, @k SelectionAdjustment selectionAdjustment) {
        setDraggingHandle(z11 ? Handle.SelectionStart : Handle.SelectionEnd);
        m1467setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(j11));
        SelectionLayout m1466getSelectionLayoutWko1d7g = m1466getSelectionLayoutWko1d7g(j11, j12, z11);
        if (m1466getSelectionLayoutWko1d7g == null || !m1466getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection adjust = selectionAdjustment.adjust(m1466getSelectionLayoutWko1d7g);
        if (!g0.g(adjust, getSelection())) {
            selectionChanged(m1466getSelectionLayoutWko1d7g, adjust);
        }
        this.previousSelectionLayout = m1466getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m1480updateSelectionqNKwrvQ$foundation_release(@l Offset offset, long j11, boolean z11, @k SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return m1479updateSelectionjyLRC_s$foundation_release(offset.m2278unboximpl(), j11, z11, selectionAdjustment);
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }
}
