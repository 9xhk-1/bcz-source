package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.NoWhenBranchMatchedException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@kotlin.jvm.internal.u0({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n85#2:747\n113#2,2:748\n254#3,15:750\n254#3,15:765\n254#3,15:780\n254#3,15:795\n254#3,15:810\n260#3,9:825\n260#3,9:834\n254#3,15:843\n254#3,15:858\n254#3,15:873\n1#4:888\n314#5,11:889\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n175#1:747\n175#1:748,2\n199#1:750,15\n206#1:765,15\n213#1:780,15\n221#1:795,15\n225#1:810,15\n246#1:825,9\n265#1:834,9\n284#1:843,15\n291#1:858,15\n320#1:873,15\n457#1:889,11\n*E\n"})
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;

    @m80.k
    private static final Companion Companion = new Companion(null);

    @m80.l
    private final CodepointTransformation codepointTransformation;

    @m80.l
    private final State<TransformedText> codepointTransformedText;

    @m80.l
    private InputTransformation inputTransformation;

    @m80.l
    private final OutputTransformation outputTransformation;

    @m80.l
    private final State<TransformedText> outputTransformedText;

    @m80.k
    private final MutableState selectionWedgeAffinity$delegate;

    @m80.k
    private final TextFieldState textFieldState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
    public static final class Companion {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @w00.o
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, null, null, offsetMappingCalculator, 6, null);
            outputTransformation.transformOutput(textFieldBuffer);
            TextRange textRange = null;
            if (textFieldBuffer.getChanges().getChangeCount() == 0) {
                return null;
            }
            long m1322mapToTransformedXGyztTk = m1322mapToTransformedXGyztTk(textFieldCharSequence.m1189getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange m1188getCompositionMzsxiRA = textFieldCharSequence.m1188getCompositionMzsxiRA();
            if (m1188getCompositionMzsxiRA != null) {
                textRange = TextRange.m4547boximpl(TransformedTextFieldState.Companion.m1322mapToTransformedXGyztTk(m1188getCompositionMzsxiRA.m4563unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(TextFieldBuffer.m1178toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, m1322mapToTransformedXGyztTk, textRange, null, 4, null), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @w00.o
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m1321mapFromTransformedxdX6G0(long j11, OffsetMappingCalculator offsetMappingCalculator) {
            long m1262mapFromDestjx7JFs = offsetMappingCalculator.m1262mapFromDestjx7JFs(TextRange.m4559getStartimpl(j11));
            long m1262mapFromDestjx7JFs2 = TextRange.m4553getCollapsedimpl(j11) ? m1262mapFromDestjx7JFs : offsetMappingCalculator.m1262mapFromDestjx7JFs(TextRange.m4554getEndimpl(j11));
            int min = Math.min(TextRange.m4557getMinimpl(m1262mapFromDestjx7JFs), TextRange.m4557getMinimpl(m1262mapFromDestjx7JFs2));
            int max = Math.max(TextRange.m4556getMaximpl(m1262mapFromDestjx7JFs), TextRange.m4556getMaximpl(m1262mapFromDestjx7JFs2));
            return TextRange.m4558getReversedimpl(j11) ? TextRangeKt.TextRange(max, min) : TextRangeKt.TextRange(min, max);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @w00.o
        /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m1322mapToTransformedXGyztTk(long j11, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            long TextRange;
            long m1263mapFromSourcejx7JFs = offsetMappingCalculator.m1263mapFromSourcejx7JFs(TextRange.m4559getStartimpl(j11));
            long m1263mapFromSourcejx7JFs2 = TextRange.m4553getCollapsedimpl(j11) ? m1263mapFromSourcejx7JFs : offsetMappingCalculator.m1263mapFromSourcejx7JFs(TextRange.m4554getEndimpl(j11));
            WedgeAffinity wedgeAffinity = null;
            WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
            if (TextRange.m4553getCollapsedimpl(j11)) {
                wedgeAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                wedgeAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !TextRange.m4553getCollapsedimpl(m1263mapFromSourcejx7JFs)) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i11 == 1) {
                    m1263mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m4559getStartimpl(m1263mapFromSourcejx7JFs));
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m1263mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m4554getEndimpl(m1263mapFromSourcejx7JFs));
                }
            }
            if (wedgeAffinity != null && !TextRange.m4553getCollapsedimpl(m1263mapFromSourcejx7JFs2)) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
                if (i12 == 1) {
                    TextRange = TextRangeKt.TextRange(TextRange.m4559getStartimpl(m1263mapFromSourcejx7JFs2));
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextRange = TextRangeKt.TextRange(TextRange.m4554getEndimpl(m1263mapFromSourcejx7JFs2));
                }
                m1263mapFromSourcejx7JFs2 = TextRange;
            }
            int min = Math.min(TextRange.m4557getMinimpl(m1263mapFromSourcejx7JFs), TextRange.m4557getMinimpl(m1263mapFromSourcejx7JFs2));
            int max = Math.max(TextRange.m4556getMaximpl(m1263mapFromSourcejx7JFs), TextRange.m4556getMaximpl(m1263mapFromSourcejx7JFs2));
            return TextRange.m4558getReversedimpl(j11) ? TextRangeKt.TextRange(max, min) : TextRangeKt.TextRange(min, max);
        }

        /* renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        public static /* synthetic */ long m1323mapToTransformedXGyztTk$default(Companion companion, long j11, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m1322mapToTransformedXGyztTk(j11, offsetMappingCalculator, selectionWedgeAffinity);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @w00.o
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            TextRange textRange = null;
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long m1322mapToTransformedXGyztTk = m1322mapToTransformedXGyztTk(textFieldCharSequence.m1189getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange m1188getCompositionMzsxiRA = textFieldCharSequence.m1188getCompositionMzsxiRA();
            if (m1188getCompositionMzsxiRA != null) {
                textRange = TextRange.m4547boximpl(TransformedTextFieldState.Companion.m1322mapToTransformedXGyztTk(m1188getCompositionMzsxiRA.m4563unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(visualText, m1322mapToTransformedXGyztTk, textRange, null, null, 24, null), offsetMappingCalculator);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TransformedText {

        @m80.k
        private final OffsetMappingCalculator offsetMapping;

        @m80.k
        private final TextFieldCharSequence text;

        public TransformedText(@m80.k TextFieldCharSequence textFieldCharSequence, @m80.k OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i11 & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        @m80.k
        public final TextFieldCharSequence component1() {
            return this.text;
        }

        @m80.k
        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        @m80.k
        public final TransformedText copy(@m80.k TextFieldCharSequence textFieldCharSequence, @m80.k OffsetMappingCalculator offsetMappingCalculator) {
            return new TransformedText(textFieldCharSequence, offsetMappingCalculator);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return kotlin.jvm.internal.g0.g(this.text, transformedText.text) && kotlin.jvm.internal.g0.g(this.offsetMapping, transformedText.offsetMapping);
        }

        @m80.k
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        @m80.k
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        @m80.k
        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    public TransformedTextFieldState(@m80.k TextFieldState textFieldState, @m80.l InputTransformation inputTransformation, @m80.l final CodepointTransformation codepointTransformation, @m80.l final OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new x00.a<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final TransformedTextFieldState.TransformedText invoke() {
                return TransformedTextFieldState.Companion.calculateTransformedText(TransformedTextFieldState.this.textFieldState.getValue$foundation_release(), outputTransformation, TransformedTextFieldState.this.getSelectionWedgeAffinity());
            }
        }) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new x00.a<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final TransformedTextFieldState.TransformedText invoke() {
                State state;
                TextFieldCharSequence value$foundation_release;
                TransformedTextFieldState.TransformedText transformedText;
                TransformedTextFieldState.Companion companion = TransformedTextFieldState.Companion;
                state = TransformedTextFieldState.this.outputTransformedText;
                if (state == null || (transformedText = (TransformedTextFieldState.TransformedText) state.getValue()) == null || (value$foundation_release = transformedText.getText()) == null) {
                    value$foundation_release = TransformedTextFieldState.this.textFieldState.getValue$foundation_release();
                }
                return companion.calculateTransformedText(value$foundation_release, codepointTransformation, TransformedTextFieldState.this.getSelectionWedgeAffinity());
            }
        }) : null;
        this.selectionWedgeAffinity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    @w00.o
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectImeNotifications$lambda$18(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z11) {
        TextFieldCharSequence text;
        TransformedText calculateTransformedText = Companion.calculateTransformedText(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
        if (calculateTransformedText != null && (text = calculateTransformedText.getText()) != null) {
            textFieldCharSequence = text;
        }
        notifyImeListener.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z11);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        lVar.invoke(mainBuffer$foundation_release);
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    @w00.o
    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1308mapFromTransformedxdX6G0(long j11, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1321mapFromTransformedxdX6G0(j11, offsetMappingCalculator);
    }

    @w00.o
    /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m1309mapToTransformedXGyztTk(long j11, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m1322mapToTransformedXGyztTk(j11, offsetMappingCalculator, selectionWedgeAffinity);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z11, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z11, textFieldEditUndoBehavior, z12);
    }

    /* renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m1310replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j11, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        transformedTextFieldState.m1316replaceTextM8tDOmk(charSequence, j11, textFieldEditUndoBehavior2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWedgeAffinity(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChangeTracker$foundation_release().getChangeCount() <= 0 || !TextRange.m4553getCollapsedimpl(textFieldBuffer.m1181getSelectiond9O1mEE())) {
            return;
        }
        setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m4554getEndimpl(mainBuffer$foundation_release.m1181getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m4556getMaximpl(mainBuffer$foundation_release.m1181getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImeNotifications(@m80.k final androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener r5, @m80.k j00.c<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 r0 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener r5 = (androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener) r5
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r5 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) r5
            kotlin.e.n(r6)
            goto L77
        L39:
            kotlin.e.n(r6)
            androidx.compose.foundation.text.input.OutputTransformation r6 = r4.outputTransformation
            if (r6 == 0) goto L46
            androidx.compose.foundation.text.input.internal.f1 r6 = new androidx.compose.foundation.text.input.internal.f1
            r6.<init>()
            r5 = r6
        L46:
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            c40.p r6 = new c40.p
            j00.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r6.<init>(r2, r3)
            r6.y()
            androidx.compose.foundation.text.input.TextFieldState r2 = access$getTextFieldState$p(r4)
            r2.addNotifyImeListener$foundation_release(r5)
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1 r2 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
            r2.<init>()
            r6.p(r2)
            java.lang.Object r5 = r6.F()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
            if (r5 != r6) goto L74
            l00.f.c(r0)
        L74:
            if (r5 != r1) goto L77
            return r1
        L77:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.collectImeNotifications(androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener, j00.c):java.lang.Object");
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.delete(mainBuffer$foundation_release, TextRange.m4557getMinimpl(mainBuffer$foundation_release.m1181getSelectiond9O1mEE()), TextRange.m4556getMaximpl(mainBuffer$foundation_release.m1181getSelectiond9O1mEE()));
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m4557getMinimpl(mainBuffer$foundation_release.m1181getSelectiond9O1mEE()), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean z11, @m80.k x00.l<? super TextFieldBuffer, g2> lVar) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        lVar.invoke(mainBuffer$foundation_release);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (kotlin.jvm.internal.g0.g(this.textFieldState, transformedTextFieldState.textFieldState) && kotlin.jvm.internal.g0.g(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return kotlin.jvm.internal.g0.g(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    @m80.k
    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity$delegate.getValue();
    }

    @m80.k
    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation_release();
    }

    @m80.k
    public final TextFieldCharSequence getVisualText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.codepointTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    public int hashCode() {
        int hashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int hashCode2 = (hashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return hashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    /* renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m1311highlightCharsIn7RAjNK8(int i11, long j11) {
        long m1313mapFromTransformedGEjPoXI = m1313mapFromTransformedGEjPoXI(j11);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        textFieldState.getMainBuffer$foundation_release().m1182setHighlightK7f2yys$foundation_release(i11, TextRange.m4559getStartimpl(m1313mapFromTransformedGEjPoXI), TextRange.m4554getEndimpl(m1313mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m1312mapFromTransformedjx7JFs(int i11) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        long m1262mapFromDestjx7JFs = offsetMappingCalculator != null ? offsetMappingCalculator.m1262mapFromDestjx7JFs(i11) : TextRangeKt.TextRange(i11);
        return offsetMapping != null ? Companion.m1321mapFromTransformedxdX6G0(m1262mapFromDestjx7JFs, offsetMapping) : m1262mapFromDestjx7JFs;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m1313mapFromTransformedGEjPoXI(long j11) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        if (offsetMappingCalculator != null) {
            j11 = Companion.m1321mapFromTransformedxdX6G0(j11, offsetMappingCalculator);
        }
        return offsetMapping != null ? Companion.m1321mapFromTransformedxdX6G0(j11, offsetMapping) : j11;
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m1314mapToTransformedjx7JFs(int i11) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        long m1263mapFromSourcejx7JFs = offsetMapping != null ? offsetMapping.m1263mapFromSourcejx7JFs(i11) : TextRangeKt.TextRange(i11);
        return offsetMappingCalculator != null ? Companion.m1322mapToTransformedXGyztTk(m1263mapFromSourcejx7JFs, offsetMappingCalculator, getSelectionWedgeAffinity()) : m1263mapFromSourcejx7JFs;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m1315mapToTransformedGEjPoXI(long j11) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            j11 = Companion.m1323mapToTransformedXGyztTk$default(Companion, j11, offsetMapping, null, 4, null);
        }
        return offsetMappingCalculator != null ? Companion.m1322mapToTransformedXGyztTk(j11, offsetMappingCalculator, getSelectionWedgeAffinity()) : j11;
    }

    public final void placeCursorBeforeCharAt(int i11) {
        m1317selectCharsIn5zctL8(TextRangeKt.TextRange(i11));
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public final void replaceAll(@m80.k CharSequence charSequence) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.delete(mainBuffer$foundation_release, 0, mainBuffer$foundation_release.getLength());
        mainBuffer$foundation_release.append(charSequence.toString());
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(@m80.k CharSequence charSequence, boolean z11, @m80.k TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z12) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        if (z11) {
            mainBuffer$foundation_release.commitComposition$foundation_release();
        }
        long m1181getSelectiond9O1mEE = mainBuffer$foundation_release.m1181getSelectiond9O1mEE();
        mainBuffer$foundation_release.replace(TextRange.m4557getMinimpl(m1181getSelectiond9O1mEE), TextRange.m4556getMaximpl(m1181getSelectiond9O1mEE), charSequence);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m4557getMinimpl(m1181getSelectiond9O1mEE) + charSequence.length(), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z12, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m1316replaceTextM8tDOmk(@m80.k CharSequence charSequence, long j11, @m80.k TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z11) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        long m1313mapFromTransformedGEjPoXI = m1313mapFromTransformedGEjPoXI(j11);
        mainBuffer$foundation_release.replace(TextRange.m4557getMinimpl(m1313mapFromTransformedGEjPoXI), TextRange.m4556getMaximpl(m1313mapFromTransformedGEjPoXI), charSequence);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation_release, TextRange.m4557getMinimpl(m1313mapFromTransformedGEjPoXI) + charSequence.length(), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, z11, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation_release, 0, mainBuffer$foundation_release.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1317selectCharsIn5zctL8(long j11) {
        m1318selectUntransformedCharsIn5zctL8(m1313mapFromTransformedGEjPoXI(j11));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1318selectUntransformedCharsIn5zctL8(long j11) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBufferKt.setSelectionCoerced(textFieldState.getMainBuffer$foundation_release(), TextRange.m4559getStartimpl(j11), TextRange.m4554getEndimpl(j11));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void setSelectionWedgeAffinity(@m80.k SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity$delegate.setValue(selectionWedgeAffinity);
    }

    @m80.k
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void update(@m80.l InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    @w00.o
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i11, kotlin.jvm.internal.v vVar) {
        this(textFieldState, (i11 & 2) != 0 ? null : inputTransformation, (i11 & 4) != 0 ? null : codepointTransformation, (i11 & 8) != 0 ? null : outputTransformation);
    }
}
