package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c40.s0;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import m00.c;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1568:1\n85#2:1569\n113#2,2:1570\n85#2:1572\n113#2,2:1573\n85#2:1575\n113#2,2:1576\n85#2:1580\n113#2,2:1581\n85#2:1583\n113#2,2:1584\n85#2:1586\n113#2,2:1587\n85#2:1589\n113#2,2:1590\n278#3:1578\n278#3:1579\n30#3:1626\n30#3:1633\n273#3:1649\n273#3:1650\n1#4:1592\n602#5,8:1593\n54#6:1601\n85#7:1602\n53#7,3:1627\n70#7:1631\n53#7,3:1634\n70#7:1638\n60#7:1641\n60#7:1644\n70#7:1647\n722#8,23:1603\n69#9:1630\n69#9:1637\n65#9:1640\n65#9:1643\n69#9:1646\n22#10:1632\n22#10:1639\n22#10:1642\n22#10:1645\n22#10:1648\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n127#1:1569\n127#1:1570,2\n145#1:1572\n145#1:1573,2\n163#1:1575\n163#1:1576,2\n195#1:1580\n195#1:1581,2\n208#1:1583\n208#1:1584,2\n211#1:1586\n211#1:1587,2\n217#1:1589\n217#1:1590,2\n178#1:1578\n183#1:1579\n1138#1:1626\n1147#1:1633\n602#1:1649\n967#1:1650\n297#1:1593,8\n330#1:1601\n330#1:1602\n1138#1:1627,3\n1143#1:1631\n1147#1:1634,3\n1152#1:1638\n1155#1:1641\n1156#1:1644\n1158#1:1647\n544#1:1603,23\n1143#1:1630\n1152#1:1637\n1155#1:1640\n1156#1:1643\n1158#1:1646\n1143#1:1632\n1152#1:1639\n1155#1:1642\n1156#1:1645\n1158#1:1648\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;

    @l
    private Clipboard clipboard;

    @k
    private Density density;

    @k
    private final MutableState directDragGestureInitiator$delegate;

    @k
    private final MutableState draggingHandle$delegate;
    private boolean enabled;

    @l
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;

    @k
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private boolean isPassword;

    @l
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;

    @l
    private SelectionLayout previousSelectionLayout;

    @k
    private final MutableState rawHandleDragPosition$delegate;
    private boolean readOnly;

    @l
    private a<? extends ReceiveContentConfiguration> receiveContentConfiguration;

    @l
    private a<g2> requestAutofillAction;

    @k
    private final MutableState showCursorHandle$delegate;

    @k
    private final MutableState startTextLayoutPositionInWindow$delegate;

    @k
    private final TransformedTextFieldState textFieldState;

    @k
    private final TextLayoutState textLayoutState;

    @l
    private TextToolbarHandler textToolbarHandler;

    @k
    private final MutableState textToolbarState$delegate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InputType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType None = new InputType("None", 0);
        public static final InputType Touch = new InputType("Touch", 1);
        public static final InputType Mouse = new InputType("Mouse", 2);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{None, Touch, Mouse};
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private InputType(String str, int i11) {
        }

        @k
        public static m00.a<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1568:1\n1#2:1569\n*E\n"})
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m2283getUnspecifiedF1C5BW0();

        @k
        private final a<g2> requestFocus;

        public TextFieldMouseSelectionObserver(@k a<g2> aVar) {
            this.requestFocus = aVar;
        }

        /* renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m1368updateSelectionr1Wruf4(long j11, SelectionAdjustment selectionAdjustment, boolean z11) {
            Integer valueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m1300getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            int m1300getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m1300getOffsetForPosition3MmeM6k(j11, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long m1364updateSelectionSsLRf8 = textFieldSelectionState.m1364updateSelectionSsLRf8(textFieldSelectionState.textFieldState.getVisualText(), intValue, m1300getOffsetForPosition3MmeM6k, false, selectionAdjustment, false, z11);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m4553getCollapsedimpl(m1364updateSelectionSsLRf8)) {
                this.dragBeginOffsetInText = TextRange.m4559getStartimpl(m1364updateSelectionSsLRf8);
            }
            if (TextRange.m4558getReversedimpl(m1364updateSelectionSsLRf8)) {
                m1364updateSelectionSsLRf8 = TextFieldSelectionStateKt.m1381reverse5zctL8(m1364updateSelectionSsLRf8);
            }
            TextFieldSelectionState.this.textFieldState.m1317selectCharsIn5zctL8(m1364updateSelectionSsLRf8);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return m1364updateSelectionSsLRf8;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo1369onDrag3MmeM6k(final long j11, @k SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.m2276toStringimpl(j11));
                }
            });
            m1368updateSelectionr1Wruf4(j11, selectionAdjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // x00.a
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo1370onExtendk4lQ0M(long j11) {
            TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // x00.a
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo1371onExtendDragk4lQ0M(long j11) {
            TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // x00.a
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo1372onStart3MmeM6k(long j11, @k SelectionAdjustment selectionAdjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                @Override // x00.a
                public final String invoke() {
                    return "Mouse.onStart";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = j11;
            this.dragBeginOffsetInText = TextRange.m4559getStartimpl(m1368updateSelectionr1Wruf4(j11, selectionAdjustment, true));
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextFieldSelectionState(@k TransformedTextFieldState transformedTextFieldState, @k TextLayoutState textLayoutState, @k Density density, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z11;
        this.readOnly = z12;
        this.isFocused = z13;
        this.isPassword = z14;
        Offset.Companion companion = Offset.Companion;
        this.startTextLayoutPositionInWindow$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2257boximpl(companion.m2283getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2257boximpl(companion.m2283getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.directDragGestureInitiator$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.textToolbarState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.previousRawDragOffset = -1;
    }

    public static /* synthetic */ Object copy$default(TextFieldSelectionState textFieldSelectionState, boolean z11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return textFieldSelectionState.copy(z11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r9, j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 != r2) goto L3c
            java.lang.Object r9 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r9 = (kotlin.jvm.internal.Ref.LongRef) r9
            java.lang.Object r0 = r6.L$1
            r1 = r0
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref.LongRef) r1
            java.lang.Object r0 = r6.L$0
            r2 = r0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L39
            goto L87
        L39:
            r0 = move-exception
            r10 = r0
            goto L93
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            kotlin.e.n(r10)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r3 = r1.m2283getUnspecifiedF1C5BW0()
            r10.element = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            long r3 = r1.m2283getUnspecifiedF1C5BW0()
            r7.element = r3
            r1 = r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L8d
            r3.<init>()     // Catch: java.lang.Throwable -> L8d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L8d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            r6.L$0 = r8     // Catch: java.lang.Throwable -> L8d
            r6.L$1 = r10     // Catch: java.lang.Throwable -> L8d
            r6.L$2 = r7     // Catch: java.lang.Throwable -> L8d
            r6.label = r1     // Catch: java.lang.Throwable -> L8d
            r1 = r9
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
            if (r9 != r0) goto L84
            return r0
        L84:
            r2 = r8
            r1 = r10
            r9 = r7
        L87:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r2)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        L8d:
            r0 = move-exception
            r9 = r0
            r2 = r8
            r1 = r10
            r10 = r9
            r9 = r7
        L93:
            detectCursorHandleDragGestures$onDragStop(r1, r9, r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if ((longRef.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            Offset.Companion companion = Offset.Companion;
            longRef.element = companion.m2283getUnspecifiedF1C5BW0();
            longRef2.element = companion.m2283getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r15, final boolean r16, j00.c<? super yz.g2> r17) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$6(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if ((longRef.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.Companion;
            longRef.element = companion.m2283getUnspecifiedF1C5BW0();
            longRef2.element = companion.m2284getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        float f11;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m4553getCollapsedimpl(visualText.m1189getSelectiond9O1mEE())) {
            Rect cursorRect3 = getCursorRect();
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m2308Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo3868localToRootMKHz9U(cursorRect3.m2303getTopLeftF1C5BW0()) : Offset.Companion.m2284getZeroF1C5BW0(), cursorRect3.m2301getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long mo3868localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo3868localToRootMKHz9U(m1357getHandlePositiontuRUvjQ(true)) : Offset.Companion.m2284getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long mo3868localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo3868localToRootMKHz9U(m1357getHandlePositiontuRUvjQ(false)) : Offset.Companion.m2284getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float f12 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            f11 = Float.intBitsToFloat((int) (textLayoutCoordinates4.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m4559getStartimpl(visualText.m1189getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L))) & 4294967295L));
        } else {
            f11 = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            f12 = Float.intBitsToFloat((int) (textLayoutCoordinates5.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m4554getEndimpl(visualText.m1189getSelectiond9O1mEE()))) == null) ? 0.0f : cursorRect.getTop()) & 4294967295L))) & 4294967295L));
        }
        int i11 = (int) (mo3868localToRootMKHz9U >> 32);
        int i12 = (int) (mo3868localToRootMKHz9U2 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(f11, f12), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat((int) (mo3868localToRootMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (mo3868localToRootMKHz9U2 & 4294967295L))));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1356getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.Companion.m2283getUnspecifiedF1C5BW0();
    }

    private final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m1357getHandlePositiontuRUvjQ(boolean z11) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        long m1189getSelectiond9O1mEE = this.textFieldState.getVisualText().m1189getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, z11 ? TextRange.m4559getStartimpl(m1189getSelectiond9O1mEE) : TextRange.m4554getEndimpl(m1189getSelectiond9O1mEE), z11, TextRange.m4558getReversedimpl(m1189getSelectiond9O1mEE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m1358getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition$delegate.getValue()).m2278unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1359getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow$delegate.getValue()).m2278unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m1360getTextFieldSelectionqeG_v_k(int i11, int i12, TextRange textRange, boolean z11, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        if (textRange == null && g0.g(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return TextRangeKt.TextRange(i11, i12);
        }
        SelectionLayout m1452getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1452getTextFieldSelectionLayoutRcvTLA(layoutResult, i11, i12, this.previousRawDragOffset, textRange != null ? textRange.m4563unboximpl() : TextRange.Companion.m4564getZerod9O1mEE(), textRange == null, z11);
        if (textRange != null && !m1452getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return textRange.m4563unboximpl();
        }
        long m1441toTextRanged9O1mEE = selectionAdjustment.adjust(m1452getTextFieldSelectionLayoutRcvTLA).m1441toTextRanged9O1mEE();
        this.previousSelectionLayout = m1452getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = z11 ? i11 : i12;
        return m1441toTextRanged9O1mEE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
        if (textToolbarHandler != null) {
            textToolbarHandler.hideTextToolbar();
        }
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Rect visibleBounds;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        x00.l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long m2295getBottomCenterF1C5BW0 = getCursorRect().m2295getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m1485containsInclusiveUv8p0NA(visibleBounds, m2295getBottomCenterF1C5BW0);
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m1363setStartTextLayoutPositionInWindowk4lQ0M(m1356getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(j00.c<? super g2> cVar) {
        Object collect = kotlinx.coroutines.flow.k.l0(kotlinx.coroutines.flow.k.j0(SnapshotStateKt.snapshotFlow(new a<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final TextFieldCharSequence invoke() {
                return TextFieldSelectionState.this.textFieldState.getVisualText();
            }
        }), TextFieldSelectionState$observeTextChanges$3.INSTANCE), 1).collect(new j() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar2) {
                return emit((TextFieldCharSequence) obj, (j00.c<? super g2>) cVar2);
            }

            public final Object emit(TextFieldCharSequence textFieldCharSequence, j00.c<? super g2> cVar2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return g2.f100423a;
            }
        }, cVar);
        return collect == b.l() ? collect : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(j00.c<? super g2> cVar) {
        Object collect = SnapshotStateKt.snapshotFlow(new a<Rect>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
            
                if (r0 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
            
                if (r0 == null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            
                r2 = r6.this$0.getTextLayoutCoordinates();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (r2 == null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
            
                r2 = androidx.compose.ui.geometry.Offset.m2257boximpl(r2.mo3868localToRootMKHz9U(r0.m2303getTopLeftF1C5BW0()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
            
                kotlin.jvm.internal.g0.m(r2);
                r0 = androidx.compose.ui.geometry.RectKt.m2308Recttz77jQw(r2.m2278unboximpl(), r0.m2301getSizeNHjbRc());
                r2 = r6.this$0.getContentRect();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
            
                if (r0.overlaps(r2) == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
            
                r1 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
            
                if (r1 == null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
            
                r0 = r1.intersect(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
            
                if (r0 == null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
            
                return androidx.compose.ui.geometry.Rect.Companion.getZero();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
            
                return androidx.compose.ui.geometry.Rect.Companion.getZero();
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0028, code lost:
            
                if (r0 == androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
            
                if (r1 != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Cursor) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
            
                if (r6.this$0.getDraggingHandle() != null) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
            
                if (r6.this$0.isInTouchMode() == false) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
            
                r0 = r6.this$0.getTextLayoutCoordinates();
                r1 = null;
             */
            @Override // x00.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.compose.ui.geometry.Rect invoke() {
                /*
                    r6 = this;
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextFieldState$p(r0)
                    androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
                    long r0 = r0.m1189getSelectiond9O1mEE()
                    boolean r0 = androidx.compose.ui.text.TextRange.m4553getCollapsedimpl(r0)
                    if (r0 == 0) goto L1e
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextToolbarState(r1)
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Cursor
                    if (r1 == r2) goto L2a
                L1e:
                    if (r0 != 0) goto L94
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextToolbarState(r0)
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection
                    if (r0 != r1) goto L94
                L2a:
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.Handle r0 = r0.getDraggingHandle()
                    if (r0 != 0) goto L94
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    boolean r0 = r0.isInTouchMode()
                    if (r0 == 0) goto L94
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.ui.layout.LayoutCoordinates r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextLayoutCoordinates(r0)
                    r1 = 0
                    if (r0 == 0) goto L48
                    androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
                    goto L49
                L48:
                    r0 = r1
                L49:
                    if (r0 == 0) goto L8d
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.ui.layout.LayoutCoordinates r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextLayoutCoordinates(r2)
                    if (r2 == 0) goto L60
                    long r3 = r0.m2303getTopLeftF1C5BW0()
                    long r2 = r2.mo3868localToRootMKHz9U(r3)
                    androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m2257boximpl(r2)
                    goto L61
                L60:
                    r2 = r1
                L61:
                    kotlin.jvm.internal.g0.m(r2)
                    long r2 = r2.m2278unboximpl()
                    long r4 = r0.m2301getSizeNHjbRc()
                    androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.RectKt.m2308Recttz77jQw(r2, r4)
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.ui.geometry.Rect r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getContentRect(r2)
                    boolean r3 = r0.overlaps(r2)
                    if (r3 == 0) goto L7d
                    r1 = r2
                L7d:
                    if (r1 == 0) goto L86
                    androidx.compose.ui.geometry.Rect r0 = r1.intersect(r0)
                    if (r0 == 0) goto L86
                    return r0
                L86:
                    androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
                    androidx.compose.ui.geometry.Rect r0 = r0.getZero()
                    return r0
                L8d:
                    androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
                    androidx.compose.ui.geometry.Rect r0 = r0.getZero()
                    return r0
                L94:
                    androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
                    androidx.compose.ui.geometry.Rect r0 = r0.getZero()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2.invoke():androidx.compose.ui.geometry.Rect");
            }
        }).collect(new j() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar2) {
                return emit((Rect) obj, (j00.c<? super g2>) cVar2);
            }

            public final Object emit(Rect rect, j00.c<? super g2> cVar2) {
                TextToolbarHandler textToolbarHandler;
                if (g0.g(rect, Rect.Companion.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    textToolbarHandler = TextFieldSelectionState.this.textToolbarHandler;
                    if (textToolbarHandler != null) {
                        Object showTextToolbar = textToolbarHandler.showTextToolbar(TextFieldSelectionState.this, rect, cVar2);
                        return showTextToolbar == b.l() ? showTextToolbar : g2.f100423a;
                    }
                }
                return g2.f100423a;
            }
        }, cVar);
        return collect == b.l() ? collect : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pasteAsPlainText(j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.e.n(r9)
            goto L48
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.e.n(r9)
            androidx.compose.ui.platform.Clipboard r9 = r8.clipboard
            if (r9 == 0) goto L62
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.getClipEntry(r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            r0 = r8
        L48:
            androidx.compose.ui.platform.ClipEntry r9 = (androidx.compose.ui.platform.ClipEntry) r9
            if (r9 == 0) goto L62
            java.lang.String r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.readText(r9)
            if (r2 != 0) goto L53
            goto L62
        L53:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r1 = r0.textFieldState
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r4 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r6 = 10
            r7 = 0
            r3 = 0
            r5 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r1, r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        L62:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.pasteAsPlainText(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m1361placeCursorAtNearestOffsetk4lQ0M(long j11) {
        int m4529getOffsetForPositionk4lQ0M;
        int m4559getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (m4529getOffsetForPositionk4lQ0M = layoutResult.m4529getOffsetForPositionk4lQ0M(j11)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long m1312mapFromTransformedjx7JFs = transformedTextFieldState.m1312mapFromTransformedjx7JFs(m4529getOffsetForPositionk4lQ0M);
        long m1315mapToTransformedGEjPoXI = transformedTextFieldState.m1315mapToTransformedGEjPoXI(m1312mapFromTransformedjx7JFs);
        int i11 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) && TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) || TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? (!TextRange.m4553getCollapsedimpl(m1312mapFromTransformedjx7JFs) || TextRange.m4553getCollapsedimpl(m1315mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i11 == 1) {
            m4559getStartimpl = TextRange.m4559getStartimpl(m1312mapFromTransformedjx7JFs);
        } else if (i11 == 2) {
            m4559getStartimpl = TextRange.m4559getStartimpl(m1312mapFromTransformedjx7JFs);
        } else if (i11 == 3) {
            selectionWedgeAffinity = MathUtilsKt.m1259findClosestRect9KIMszo(j11, layoutResult.getCursorRect(TextRange.m4559getStartimpl(m1315mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m4554getEndimpl(m1315mapToTransformedGEjPoXI))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            m4559getStartimpl = TextRange.m4559getStartimpl(m1312mapFromTransformedjx7JFs);
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m4559getStartimpl = MathUtilsKt.m1259findClosestRect9KIMszo(j11, layoutResult.getCursorRect(TextRange.m4559getStartimpl(m1315mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m4554getEndimpl(m1315mapToTransformedGEjPoXI))) < 0 ? TextRange.m4559getStartimpl(m1312mapFromTransformedjx7JFs) : TextRange.m4554getEndimpl(m1312mapFromTransformedjx7JFs);
        }
        long TextRange = TextRangeKt.TextRange(m4559getStartimpl);
        if (TextRange.m4552equalsimpl0(TextRange, this.textFieldState.getUntransformedText().m1189getSelectiond9O1mEE()) && (selectionWedgeAffinity == null || g0.g(selectionWedgeAffinity, this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m1318selectUntransformedCharsIn5zctL8(TextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m1362setRawHandleDragPositionk4lQ0M(long j11) {
        this.rawHandleDragPosition$delegate.setValue(Offset.m2257boximpl(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z11) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m1363setStartTextLayoutPositionInWindowk4lQ0M(long j11) {
        this.startTextLayoutPositionInWindow$delegate.setValue(Offset.m2257boximpl(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    public final long m1364updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int i11, int i12, boolean z11, SelectionAdjustment selectionAdjustment, boolean z12, boolean z13) {
        HapticFeedback hapticFeedback;
        TextRange m4547boximpl = TextRange.m4547boximpl(textFieldCharSequence.m1189getSelectiond9O1mEE());
        long m4563unboximpl = m4547boximpl.m4563unboximpl();
        if (z13 || (!z12 && TextRange.m4553getCollapsedimpl(m4563unboximpl))) {
            m4547boximpl = null;
        }
        long m1360getTextFieldSelectionqeG_v_k = m1360getTextFieldSelectionqeG_v_k(i11, i12, m4547boximpl, z11, selectionAdjustment);
        if (!TextRange.m4552equalsimpl0(m1360getTextFieldSelectionqeG_v_k, textFieldCharSequence.m1189getSelectiond9O1mEE())) {
            boolean z14 = TextRange.m4558getReversedimpl(m1360getTextFieldSelectionqeG_v_k) != TextRange.m4558getReversedimpl(textFieldCharSequence.m1189getSelectiond9O1mEE()) && TextRange.m4552equalsimpl0(TextRangeKt.TextRange(TextRange.m4554getEndimpl(m1360getTextFieldSelectionqeG_v_k), TextRange.m4559getStartimpl(m1360getTextFieldSelectionqeG_v_k)), textFieldCharSequence.m1189getSelectiond9O1mEE());
            if (isInTouchMode() && !z14 && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
            }
        }
        return m1360getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: updateSelection-SsL-Rf8$default, reason: not valid java name */
    public static /* synthetic */ long m1365updateSelectionSsLRf8$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i11, int i12, boolean z11, SelectionAdjustment selectionAdjustment, boolean z12, boolean z13, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z12 = false;
        }
        if ((i13 & 64) != 0) {
            z13 = false;
        }
        return textFieldSelectionState.m1364updateSelectionSsLRf8(textFieldCharSequence, i11, i12, z11, selectionAdjustment, z12, z13);
    }

    public final void autofill() {
        a<g2> aVar = this.requestAutofillAction;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean canAutofill() {
        return getEditable() && TextRange.m4553getCollapsedimpl(this.textFieldState.getVisualText().m1189getSelectiond9O1mEE());
    }

    public final boolean canCopy() {
        return (TextRange.m4553getCollapsedimpl(this.textFieldState.getVisualText().m1189getSelectiond9O1mEE()) || this.isPassword) ? false : true;
    }

    public final boolean canCut() {
        return (TextRange.m4553getCollapsedimpl(this.textFieldState.getVisualText().m1189getSelectiond9O1mEE()) || !getEditable() || this.isPassword) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r8 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object canPaste(@m80.k j00.c<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            kotlin.e.n(r8)
            goto L91
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r2
            kotlin.e.n(r8)
            goto L5c
        L3e:
            kotlin.e.n(r8)
            boolean r8 = r7.getEditable()
            if (r8 != 0) goto L4c
            java.lang.Boolean r8 = l00.a.a(r4)
            return r8
        L4c:
            androidx.compose.ui.platform.Clipboard r8 = r7.clipboard
            if (r8 == 0) goto L6a
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.getClipEntry(r0)
            if (r8 != r1) goto L5b
            goto L90
        L5b:
            r2 = r7
        L5c:
            androidx.compose.ui.platform.ClipEntry r8 = (androidx.compose.ui.platform.ClipEntry) r8
            if (r8 == 0) goto L68
            boolean r8 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.hasText(r8)
            if (r8 != r5) goto L68
            r8 = r5
            goto L6c
        L68:
            r8 = r4
            goto L6c
        L6a:
            r2 = r7
            goto L68
        L6c:
            if (r8 == 0) goto L73
            java.lang.Boolean r8 = l00.a.a(r5)
            return r8
        L73:
            x00.a<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> r8 = r2.receiveContentConfiguration
            r6 = 0
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r8.invoke()
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r8 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r8
            goto L80
        L7f:
            r8 = r6
        L80:
            if (r8 == 0) goto L97
            androidx.compose.ui.platform.Clipboard r8 = r2.clipboard
            if (r8 == 0) goto L94
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r8.getClipEntry(r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            r6 = r8
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.ui.platform.ClipEntry) r6
        L94:
            if (r6 == 0) goto L97
            r4 = r5
        L97:
            java.lang.Boolean r8 = l00.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.canPaste(j00.c):java.lang.Object");
    }

    public final boolean canSelectAll() {
        return TextRange.m4555getLengthimpl(this.textFieldState.getVisualText().m1189getSelectiond9O1mEE()) != this.textFieldState.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.Companion;
        m1362setRawHandleDragPositionk4lQ0M(companion.m2283getUnspecifiedF1C5BW0());
        m1363setStartTextLayoutPositionInWindowk4lQ0M(companion.m2283getUnspecifiedF1C5BW0());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object copy(boolean r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r7 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.e.n(r8)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.e.n(r8)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r8 = r6.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r8 = r8.getVisualText()
            long r4 = r8.m1189getSelectiond9O1mEE()
            boolean r2 = androidx.compose.ui.text.TextRange.m4553getCollapsedimpl(r4)
            if (r2 == 0) goto L4d
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L4d:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r8 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(r8)
            java.lang.String r8 = r8.toString()
            r4 = 2
            r5 = 0
            r2.<init>(r8, r5, r4, r5)
            androidx.compose.ui.platform.Clipboard r8 = r6.clipboard
            if (r8 == 0) goto L71
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(r2)
            r0.L$0 = r6
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.setClipEntry(r2, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            r0 = r6
        L72:
            if (r7 != 0) goto L77
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L77:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.textFieldState
            r7.collapseSelectionToMax()
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.copy(boolean, j00.c):java.lang.Object");
    }

    @l
    public final Object cursorHandleGestures(@k PointerInputScope pointerInputScope, @k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cut(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.e.n(r7)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.e.n(r7)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r6.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r7 = r7.getVisualText()
            long r4 = r7.m1189getSelectiond9O1mEE()
            boolean r2 = androidx.compose.ui.text.TextRange.m4553getCollapsedimpl(r4)
            if (r2 == 0) goto L4b
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L4b:
            androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
            java.lang.CharSequence r7 = androidx.compose.foundation.text.input.TextFieldCharSequenceKt.getSelectedText(r7)
            java.lang.String r7 = r7.toString()
            r4 = 2
            r5 = 0
            r2.<init>(r7, r5, r4, r5)
            androidx.compose.ui.platform.Clipboard r7 = r6.clipboard
            if (r7 == 0) goto L6d
            androidx.compose.ui.platform.ClipEntry r2 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.toClipEntry(r2)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.setClipEntry(r2, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r0 = r6
        L6e:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r7 = r0.textFieldState
            r7.deleteSelectedText()
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.cut(j00.c):java.lang.Object");
    }

    public final void deselect() {
        if (!TextRange.m4553getCollapsedimpl(this.textFieldState.getVisualText().m1189getSelectiond9O1mEE())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    @l
    public final Object detectTextFieldTapGestures(@k PointerInputScope pointerInputScope, @l MutableInteractionSource mutableInteractionSource, @k final a<g2> aVar, @k final a<g2> aVar2, @k j00.c<? super g2> cVar) {
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new TextFieldSelectionState$detectTextFieldTapGestures$2(mutableInteractionSource, this, null), new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m1379invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1379invokek4lQ0M(long j11) {
                boolean z11;
                TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3.1
                    @Override // x00.a
                    public final String invoke() {
                        return "onTapTextField";
                    }
                });
                aVar.invoke();
                if (this.enabled && this.isFocused()) {
                    z11 = this.readOnly;
                    if (!z11) {
                        aVar2.invoke();
                        if (this.textFieldState.getVisualText().length() > 0) {
                            this.setShowCursorHandle(true);
                        }
                    }
                    this.updateTextToolbarState(TextToolbarState.None);
                    long m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = this.textLayoutState.m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j11);
                    TextFieldSelectionState textFieldSelectionState = this;
                    textFieldSelectionState.m1361placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m1305fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
                }
            }
        }, cVar);
        return detectTapAndPress == b.l() ? detectTapAndPress : g2.f100423a;
    }

    @l
    public final Object detectTouchMode(@k PointerInputScope pointerInputScope, @k j00.c<? super g2> cVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TextFieldSelectionState$detectTouchMode$2(this, null), cVar);
        return awaitPointerEventScope == b.l() ? awaitPointerEventScope : g2.f100423a;
    }

    public final void dispose() {
        hideTextToolbar();
        this.clipboard = null;
        this.hapticFeedBack = null;
    }

    @k
    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean z11) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z12 = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle && z12 && TextRange.m4553getCollapsedimpl(visualText.m1189getSelectiond9O1mEE()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == Handle.Cursor || isCursorHandleInVisibleBounds())) {
            return new TextFieldHandleState(true, z11 ? getCursorRect().m2295getBottomCenterF1C5BW0() : Offset.Companion.m2283getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
        }
        return TextFieldHandleState.Companion.getHidden();
    }

    @k
    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (!TextRange.m4553getCollapsedimpl(visualText.m1189getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m4559getStartimpl(visualText.m1189getSelectiond9O1mEE()));
        float t11 = u.t((float) Math.floor(this.density.mo377toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
        float f11 = t11 / 2;
        float t12 = u.t(u.A(layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr ? cursorRect.getLeft() + (t11 / 2) : cursorRect.getRight() - (t11 / 2), ((int) (layoutResult.m4530getSizeYbymL2g() >> 32)) - f11), f11);
        float floor = ((int) t11) % 2 == 1 ? ((float) Math.floor(t12)) + 0.5f : (float) Math.rint(t12);
        return new Rect(floor - f11, cursorRect.getTop(), floor + f11, cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m1366getHandleDragPositionF1C5BW0() {
        return (m1358getRawHandleDragPositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? Offset.Companion.m2283getUnspecifiedF1C5BW0() : (m1359getStartTextLayoutPositionInWindowF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? TextLayoutStateKt.m1305fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1358getRawHandleDragPositionF1C5BW0()) : Offset.m2273plusMKHz9U(m1358getRawHandleDragPositionF1C5BW0(), Offset.m2272minusMKHz9U(m1359getStartTextLayoutPositionInWindowF1C5BW0(), m1356getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    @l
    public final a<ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    @l
    public final a<g2> getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (((r0 == null || (r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)) == null) ? false : androidx.compose.foundation.text.selection.SelectionManagerKt.m1485containsInclusiveUv8p0NA(r0, r4)) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState getSelectionHandleState$foundation_release(boolean r15, boolean r16) {
        /*
            r14 = this;
            if (r15 == 0) goto L5
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionStart
            goto L7
        L5:
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionEnd
        L7:
            androidx.compose.foundation.text.input.internal.TextLayoutState r1 = r14.textLayoutState
            androidx.compose.ui.text.TextLayoutResult r1 = r1.getLayoutResult()
            if (r1 != 0) goto L16
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L16:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r2 = r14.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r2 = r2.getVisualText()
            long r2 = r2.m1189getSelectiond9O1mEE()
            boolean r4 = androidx.compose.ui.text.TextRange.m4553getCollapsedimpl(r2)
            if (r4 == 0) goto L2d
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L2d:
            long r4 = r14.m1357getHandlePositiontuRUvjQ(r15)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r6 = r14.getDirectDragGestureInitiator()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r7 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.None
            r8 = 1
            r9 = 0
            if (r6 != r7) goto L57
            androidx.compose.foundation.text.Handle r6 = r14.getDraggingHandle()
            if (r6 == r0) goto L55
            androidx.compose.ui.layout.LayoutCoordinates r0 = r14.getTextLayoutCoordinates()
            if (r0 == 0) goto L52
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L52
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1485containsInclusiveUv8p0NA(r0, r4)
            goto L53
        L52:
            r0 = r9
        L53:
            if (r0 == 0) goto L57
        L55:
            r0 = r8
            goto L58
        L57:
            r0 = r9
        L58:
            if (r0 != 0) goto L61
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L61:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r14.textFieldState
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
            boolean r0 = r0.shouldShowSelection()
            if (r0 != 0) goto L74
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState$Companion r15 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r15 = r15.getHidden()
            return r15
        L74:
            if (r15 == 0) goto L7b
            int r0 = androidx.compose.ui.text.TextRange.m4559getStartimpl(r2)
            goto L84
        L7b:
            int r0 = androidx.compose.ui.text.TextRange.m4554getEndimpl(r2)
            int r0 = r0 - r8
            int r0 = java.lang.Math.max(r0, r9)
        L84:
            androidx.compose.ui.text.style.ResolvedTextDirection r11 = r1.getBidiRunDirection(r0)
            boolean r12 = androidx.compose.ui.text.TextRange.m4558getReversedimpl(r2)
            if (r16 == 0) goto La0
            androidx.compose.ui.layout.LayoutCoordinates r0 = r14.getTextLayoutCoordinates()
            if (r0 == 0) goto L9e
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L9e
            long r4 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m1304coerceIn3MmeM6k(r4, r0)
        L9e:
            r8 = r4
            goto La7
        La0:
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r0.m2283getUnspecifiedF1C5BW0()
            goto L9e
        La7:
            if (r15 == 0) goto Lae
            int r15 = androidx.compose.ui.text.TextRange.m4559getStartimpl(r2)
            goto Lb2
        Lae:
            int r15 = androidx.compose.ui.text.TextRange.m4554getEndimpl(r2)
        Lb2:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState
            float r10 = androidx.compose.foundation.text.TextLayoutHelperKt.getLineHeight(r1, r15)
            r13 = 0
            r7 = 1
            r6.<init>(r7, r8, r10, r11, r12, r13)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.getSelectionHandleState$foundation_release(boolean, boolean):androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState");
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeChanges(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L2e:
            r6 = move-exception
            goto L60
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.e.n(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L5e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r0.label = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = c40.s0.g(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r6 == r1) goto L5b
            r0.hideTextToolbar()
        L5b:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L5e:
            r6 = move-exception
            r0 = r5
        L60:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r2) goto L6e
            r0.hideTextToolbar()
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeChanges(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r4.pasteAsPlainText(r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (pasteAsPlainText(r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object paste(@m80.k j00.c<? super yz.g2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.e.n(r13)
            goto Lb9
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r2 = r0.L$1
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r4
            kotlin.e.n(r13)
            goto L6c
        L44:
            kotlin.e.n(r13)
            goto Lc5
        L49:
            kotlin.e.n(r13)
            x00.a<? extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration> r13 = r12.receiveContentConfiguration
            if (r13 == 0) goto Lbc
            java.lang.Object r13 = r13.invoke()
            r2 = r13
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            if (r2 != 0) goto L5a
            goto Lbc
        L5a:
            androidx.compose.ui.platform.Clipboard r13 = r12.clipboard
            if (r13 == 0) goto Laa
            r0.L$0 = r12
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r13 = r13.getClipEntry(r0)
            if (r13 != r1) goto L6b
            goto Lc4
        L6b:
            r4 = r12
        L6c:
            r6 = r13
            androidx.compose.ui.platform.ClipEntry r6 = (androidx.compose.ui.platform.ClipEntry) r6
            if (r6 != 0) goto L72
            goto Lab
        L72:
            androidx.compose.ui.platform.ClipMetadata r7 = r6.getClipMetadata()
            androidx.compose.foundation.content.ReceiveContentListener r13 = r2.getReceiveContentListener()
            androidx.compose.foundation.content.TransferableContent$Source$Companion r0 = androidx.compose.foundation.content.TransferableContent.Source.Companion
            int r8 = r0.m336getClipboardkB6V9T0()
            androidx.compose.foundation.content.TransferableContent r5 = new androidx.compose.foundation.content.TransferableContent
            r10 = 8
            r11 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.content.TransferableContent r13 = r13.onReceive(r5)
            if (r13 == 0) goto La7
            androidx.compose.ui.platform.ClipEntry r13 = r13.getClipEntry()
            if (r13 == 0) goto La7
            java.lang.String r6 = androidx.compose.foundation.content.TransferableContent_androidKt.readPlainText(r13)
            if (r6 == 0) goto La7
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = r4.textFieldState
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r8 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge
            r10 = 10
            r11 = 0
            r7 = 0
            r9 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(r5, r6, r7, r8, r9, r10, r11)
        La7:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        Laa:
            r4 = r12
        Lab:
            r13 = 0
            r0.L$0 = r13
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r13 = r4.pasteAsPlainText(r0)
            if (r13 != r1) goto Lb9
            goto Lc4
        Lb9:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        Lbc:
            r0.label = r5
            java.lang.Object r13 = r12.pasteAsPlainText(r0)
            if (r13 != r1) goto Lc5
        Lc4:
            return r1
        Lc5:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.paste(j00.c):java.lang.Object");
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    @l
    public final Object selectionHandleGestures(@k PointerInputScope pointerInputScope, boolean z11, @k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z11, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    public final void setDirectDragGestureInitiator(@k InputType inputType) {
        this.directDragGestureInitiator$delegate.setValue(inputType);
    }

    public final void setDraggingHandle(@l Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    public final void setFocused(boolean z11) {
        this.isFocused = z11;
    }

    public final void setInTouchMode(boolean z11) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setReceiveContentConfiguration(@l a<? extends ReceiveContentConfiguration> aVar) {
        this.receiveContentConfiguration = aVar;
    }

    public final void setRequestAutofillAction(@l a<g2> aVar) {
        this.requestAutofillAction = aVar;
    }

    @l
    public final Object textFieldSelectionGestures(@k PointerInputScope pointerInputScope, @k a<g2> aVar, @k j00.c<? super g2> cVar) {
        Object selectionGesturePointerInputBtf2 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope, new TextFieldMouseSelectionObserver(aVar), new TextFieldTextDragObserver(aVar), cVar);
        return selectionGesturePointerInputBtf2 == b.l() ? selectionGesturePointerInputBtf2 : g2.f100423a;
    }

    public final void update(@k HapticFeedback hapticFeedback, @k Clipboard clipboard, @k TextToolbarHandler textToolbarHandler, @k Density density, boolean z11, boolean z12, boolean z13) {
        if (!z11) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedback;
        this.clipboard = clipboard;
        this.textToolbarHandler = textToolbarHandler;
        this.density = density;
        this.enabled = z11;
        this.readOnly = z12;
        this.isPassword = z13;
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m1367updateHandleDraggingUv8p0NA(@k Handle handle, long j11) {
        setDraggingHandle(handle);
        m1362setRawHandleDragPositionk4lQ0M(j11);
    }

    public final void updateTextToolbarState(@k TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1568:1\n273#2:1569\n1#3:1570\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver\n*L\n770#1:1569\n*E\n"})
    public final class TextFieldTextDragObserver implements TextDragObserver {

        @k
        private Handle actingHandle;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition;
        private long dragTotalDistance;

        @k
        private final a<g2> requestFocus;

        public TextFieldTextDragObserver(@k a<g2> aVar) {
            this.requestFocus = aVar;
            Offset.Companion companion = Offset.Companion;
            this.dragBeginPosition = companion.m2283getUnspecifiedF1C5BW0();
            this.dragTotalDistance = companion.m2284getZeroF1C5BW0();
            this.actingHandle = Handle.SelectionEnd;
        }

        private final void onDragStop() {
            if ((this.dragBeginPosition & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // x00.a
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                Offset.Companion companion = Offset.Companion;
                this.dragBeginPosition = companion.m2283getUnspecifiedF1C5BW0();
                this.dragTotalDistance = companion.m2284getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
                this.requestFocus.invoke();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo1133onDragk4lQ0M(long j11) {
            int intValue;
            int m1300getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return;
            }
            long m2273plusMKHz9U = Offset.m2273plusMKHz9U(this.dragTotalDistance, j11);
            this.dragTotalDistance = m2273plusMKHz9U;
            final long m2273plusMKHz9U2 = Offset.m2273plusMKHz9U(this.dragBeginPosition, m2273plusMKHz9U);
            TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public final String invoke() {
                    return "Touch.onDrag at " + ((Object) Offset.m2276toStringimpl(m2273plusMKHz9U2));
                }
            });
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.textLayoutState.m1301isPositionOnTextk4lQ0M(m2273plusMKHz9U2)) {
                Integer valueOf = Integer.valueOf(this.dragBeginOffsetInText);
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m1300getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                m1300getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m1300getOffsetForPosition3MmeM6k(m2273plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && intValue == m1300getOffsetForPosition3MmeM6k) {
                    return;
                }
                word = SelectionAdjustment.Companion.getWord();
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            } else {
                intValue = TextLayoutState.m1297getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                m1300getOffsetForPosition3MmeM6k = TextLayoutState.m1297getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, m2273plusMKHz9U2, false, 2, null);
                word = intValue == m1300getOffsetForPosition3MmeM6k ? SelectionAdjustment.Companion.getNone() : SelectionAdjustment.Companion.getWord();
            }
            int i11 = intValue;
            int i12 = m1300getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = word;
            long m1189getSelectiond9O1mEE = TextFieldSelectionState.this.textFieldState.getVisualText().m1189getSelectiond9O1mEE();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long m1365updateSelectionSsLRf8$default = TextFieldSelectionState.m1365updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), i11, i12, false, selectionAdjustment, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m4553getCollapsedimpl(m1365updateSelectionSsLRf8$default)) {
                this.dragBeginOffsetInText = TextRange.m4559getStartimpl(m1365updateSelectionSsLRf8$default);
            }
            if (TextRange.m4558getReversedimpl(m1365updateSelectionSsLRf8$default)) {
                m1365updateSelectionSsLRf8$default = TextFieldSelectionStateKt.m1381reverse5zctL8(m1365updateSelectionSsLRf8$default);
            }
            if (!TextRange.m4552equalsimpl0(m1365updateSelectionSsLRf8$default, m1189getSelectiond9O1mEE)) {
                this.actingHandle = (TextRange.m4559getStartimpl(m1365updateSelectionSsLRf8$default) == TextRange.m4559getStartimpl(m1189getSelectiond9O1mEE) || TextRange.m4554getEndimpl(m1365updateSelectionSsLRf8$default) != TextRange.m4554getEndimpl(m1189getSelectiond9O1mEE)) ? (TextRange.m4559getStartimpl(m1365updateSelectionSsLRf8$default) != TextRange.m4559getStartimpl(m1189getSelectiond9O1mEE) || TextRange.m4554getEndimpl(m1365updateSelectionSsLRf8$default) == TextRange.m4554getEndimpl(m1189getSelectiond9O1mEE)) ? ((float) (TextRange.m4559getStartimpl(m1365updateSelectionSsLRf8$default) + TextRange.m4554getEndimpl(m1365updateSelectionSsLRf8$default))) / 2.0f > ((float) (TextRange.m4559getStartimpl(m1189getSelectiond9O1mEE) + TextRange.m4554getEndimpl(m1189getSelectiond9O1mEE))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart : Handle.SelectionEnd : Handle.SelectionStart;
            }
            if (TextRange.m4553getCollapsedimpl(m1189getSelectiond9O1mEE) || !TextRange.m4553getCollapsedimpl(m1365updateSelectionSsLRf8$default)) {
                TextFieldSelectionState.this.textFieldState.m1317selectCharsIn5zctL8(m1365updateSelectionSsLRf8$default);
            }
            TextFieldSelectionState.this.m1367updateHandleDraggingUv8p0NA(this.actingHandle, m2273plusMKHz9U2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-k-4lQ0M */
        public void mo1134onStartk4lQ0M(final long j11) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.logDebug(new a<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.m2276toStringimpl(j11));
                    }
                });
                TextFieldSelectionState.this.m1367updateHandleDraggingUv8p0NA(this.actingHandle, j11);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = j11;
                this.dragTotalDistance = Offset.Companion.m2284getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (TextFieldSelectionState.this.textLayoutState.m1301isPositionOnTextk4lQ0M(j11)) {
                    if (TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                        return;
                    }
                    int m1297getOffsetForPosition3MmeM6k$default = TextLayoutState.m1297getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j11, false, 2, null);
                    long m1365updateSelectionSsLRf8$default = TextFieldSelectionState.m1365updateSelectionSsLRf8$default(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.textFieldState.getVisualText(), TextRange.Companion.m4564getZerod9O1mEE(), null, null, null, 28, null), m1297getOffsetForPosition3MmeM6k$default, m1297getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord(), false, false, 96, null);
                    TextFieldSelectionState.this.textFieldState.m1317selectCharsIn5zctL8(m1365updateSelectionSsLRf8$default);
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                    this.dragBeginOffsetInText = TextRange.m4559getStartimpl(m1365updateSelectionSsLRf8$default);
                    return;
                }
                int m1297getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m1297getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, j11, false, 2, null);
                HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                if (hapticFeedback != null) {
                    hapticFeedback.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
                }
                TextFieldSelectionState.this.textFieldState.placeCursorBeforeCharAt(m1297getOffsetForPosition3MmeM6k$default2);
                TextFieldSelectionState.this.setShowCursorHandle(true);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public void mo1132onDownk4lQ0M(long j11) {
        }
    }
}
