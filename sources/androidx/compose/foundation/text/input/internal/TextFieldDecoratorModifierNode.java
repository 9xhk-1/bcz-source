package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.l2;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 5 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,809:1\n85#2:810\n113#2,2:811\n1#3:813\n316#4,6:814\n324#4,3:828\n327#4:837\n254#5,8:820\n263#5,6:831\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n401#1:810\n401#1:811,2\n648#1:814,6\n648#1:828,3\n648#1:837\n648#1:820,8\n648#1:831,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;

    @m80.k
    private final MutableState autofillHighlightOn$delegate;

    @m80.k
    private final x00.l<? super KeyCommand, ? extends g2> clipboardKeyCommandsHandler;

    @m80.k
    private final DragAndDropTargetModifierNode dragAndDropNode;

    @m80.l
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;

    @m80.l
    private InputTransformation filter;

    @m80.l
    private l2 inputSessionJob;

    @m80.k
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private boolean isPassword;

    @m80.l
    private KeyboardActionHandler keyboardActionHandler;

    @m80.k
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;

    @m80.k
    private KeyboardOptions keyboardOptions;

    @m80.l
    private l2 observeChangesJob;

    @m80.k
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;

    @m80.k
    private final x00.a<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;

    @m80.l
    private kotlinx.coroutines.flow.x<g2> stylusHandwritingTrigger;

    @m80.k
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;

    @m80.k
    private TextFieldSelectionState textFieldSelectionState;

    @m80.k
    private TransformedTextFieldState textFieldState;

    @m80.k
    private TextLayoutState textLayoutState;

    @m80.l
    private WindowInfo windowInfo;

    public TextFieldDecoratorModifierNode(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.l InputTransformation inputTransformation, boolean z11, boolean z12, @m80.k KeyboardOptions keyboardOptions, @m80.l KeyboardActionHandler keyboardActionHandler, boolean z13, @m80.k MutableInteractionSource mutableInteractionSource, boolean z14, @m80.l kotlinx.coroutines.flow.x<g2> xVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z11;
        this.readOnly = z12;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z13;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z14;
        this.stylusHandwritingTrigger = xVar;
        textFieldSelectionState.setRequestAutofillAction(new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
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
                DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
            }
        });
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    c40.r0 r0Var = (c40.r0) this.L$0;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    x00.a<g2> aVar = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r8v0 'aVar' x00.a<yz.g2>) = 
                          (r12v4 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r6v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:28) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        kotlin.coroutines.intrinsics.b.l()
                        int r0 = r11.label
                        if (r0 != 0) goto L4c
                        kotlin.e.n(r12)
                        java.lang.Object r12 = r11.L$0
                        r0 = r12
                        c40.r0 r0 = (c40.r0) r0
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r12 = r11.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r12.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r11.this$0
                        androidx.compose.ui.input.pointer.PointerInputScope r7 = r11.$this_SuspendingPointerInputModifierNode
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r8 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                        r8.<init>(r12, r6)
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r9 = 0
                        r3.<init>(r12, r7, r9)
                        r4 = 1
                        r5 = 0
                        r1 = 0
                        c40.i.e(r0, r1, r2, r3, r4, r5)
                        r10 = r2
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r2 = r6
                        r6 = 0
                        r3 = r12
                        r4 = r7
                        r5 = r8
                        r1.<init>(r2, r3, r4, r5, r6)
                        r6 = r4
                        r7 = r5
                        r4 = 1
                        r5 = 0
                        r3 = r1
                        r1 = 0
                        r2 = r10
                        c40.i.e(r0, r1, r2, r3, r4, r5)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r3.<init>(r12, r6, r7, r9)
                        c40.i.e(r0, r1, r2, r3, r4, r5)
                        yz.g2 r12 = yz.g2.f100423a
                        return r12
                    L4c:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object g11 = c40.s0.g(new AnonymousClass1(TextFieldDecoratorModifierNode.this, pointerInputScope, null), cVar);
                return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
            }
        }));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new x00.a<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            {
                super(0);
            }

            @Override // x00.a
            public final Set<? extends MediaType> invoke() {
                Set<? extends MediaType> set;
                Set<? extends MediaType> set2;
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this) != null) {
                    set2 = TextFieldDecoratorModifierKt.MediaTypesAll;
                    return set2;
                }
                set = TextFieldDecoratorModifierKt.MediaTypesText;
                return set;
            }
        }, new x00.p<ClipEntry, ClipMetadata, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
            {
                super(2);
            }

            @Override // x00.p
            public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                ClipEntry clipEntry2;
                TextFieldDecoratorModifierNode.this.emitDragExitEvent();
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().clearHandleDragging();
                String readPlainText = TransferableContent_androidKt.readPlainText(clipEntry);
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
                if (receiveContentConfiguration != null) {
                    TransferableContent onReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m337getDragAndDropkB6V9T0(), null, 8, null));
                    readPlainText = (onReceive == null || (clipEntry2 = onReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
                }
                String str = readPlainText;
                if (str != null) {
                    TransformedTextFieldState.replaceSelectedText$default(TextFieldDecoratorModifierNode.this.getTextFieldState(), str, false, null, false, 14, null);
                }
                return Boolean.TRUE;
            }
        }, new x00.l<DragAndDropEvent, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(TextFieldDecoratorModifierNode.this, dragAndDropEvent);
                }
            }
        }, null, new x00.l<DragAndDropEvent, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                HoverInteraction.Enter enter = new HoverInteraction.Enter();
                TextFieldDecoratorModifierNode.this.getInteractionSource().tryEmit(enter);
                textFieldDecoratorModifierNode.dragEnterEvent = enter;
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragEnter();
            }
        }, new x00.l<Offset, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m1285invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1285invokek4lQ0M(long j11) {
                long m1307fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m1307fromWindowToDecorationUv8p0NA(TextFieldDecoratorModifierNode.this.getTextLayoutState(), j11);
                TextFieldDecoratorModifierNode.this.getTextFieldState().m1317selectCharsIn5zctL8(TextRangeKt.TextRange(TextLayoutState.m1297getOffsetForPosition3MmeM6k$default(TextFieldDecoratorModifierNode.this.getTextLayoutState(), m1307fromWindowToDecorationUv8p0NA, false, 2, null)));
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().m1367updateHandleDraggingUv8p0NA(Handle.Cursor, m1307fromWindowToDecorationUv8p0NA);
            }
        }, null, new x00.l<DragAndDropEvent, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                TextFieldDecoratorModifierNode.this.emitDragExitEvent();
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().clearHandleDragging();
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragExit();
            }
        }, new x00.l<DragAndDropEvent, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                TextFieldDecoratorModifierNode.this.emitDragExitEvent();
            }
        }, 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m1221constructorimpl(new x00.l<KeyCommand, g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {382, 383, 384}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
                final /* synthetic */ KeyCommand $keyCommand;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[KeyCommand.values().length];
                        try {
                            iArr[KeyCommand.COPY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[KeyCommand.CUT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[KeyCommand.PASTE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$keyCommand = keyCommand;
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    return new AnonymousClass1(this.$keyCommand, this.this$0, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
                
                    if (r6.paste(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
                
                    if (r6.cut(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
                
                    if (r6.copy(false, r5) == r0) goto L23;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r5.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L1d
                        if (r1 == r4) goto L11
                        if (r1 == r3) goto L11
                        if (r1 != r2) goto L15
                    L11:
                        kotlin.e.n(r6)
                        goto L5f
                    L15:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1d:
                        kotlin.e.n(r6)
                        androidx.compose.foundation.text.KeyCommand r6 = r5.$keyCommand
                        int[] r1 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                        int r6 = r6.ordinal()
                        r6 = r1[r6]
                        if (r6 == r4) goto L4f
                        if (r6 == r3) goto L40
                        if (r6 == r2) goto L31
                        goto L5f
                    L31:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r2
                        java.lang.Object r6 = r6.paste(r5)
                        if (r6 != r0) goto L5f
                        goto L5e
                    L40:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r3
                        java.lang.Object r6 = r6.cut(r5)
                        if (r6 != r0) goto L5f
                        goto L5e
                    L4f:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r4
                        r1 = 0
                        java.lang.Object r6 = r6.copy(r1, r5)
                        if (r6 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(KeyCommand keyCommand) {
                invoke2(keyCommand);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyCommand keyCommand) {
                c40.k.f(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(keyCommand, TextFieldDecoratorModifierNode.this, null), 1, null);
            }
        });
        this.receiveContentConfigurationProvider = new x00.a<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
            }
        };
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final void disposeInputSession() {
        l2 l2Var = this.inputSessionJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.inputSessionJob = null;
        kotlinx.coroutines.flow.x<g2> xVar = this.stylusHandwritingTrigger;
        if (xVar != null) {
            xVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.isWindowFocused());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUntransformedTextChanges(j00.c<? super g2> cVar) {
        Object collect = kotlinx.coroutines.flow.k.W1(kotlinx.coroutines.flow.k.l0(SnapshotStateKt.snapshotFlow(new x00.a<String>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2
            {
                super(0);
            }

            @Override // x00.a
            public final String invoke() {
                return TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText().toString();
            }
        }), 1), 1).collect(new kotlinx.coroutines.flow.j() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar2) {
                return emit((String) obj, (j00.c<? super g2>) cVar2);
            }

            public final Object emit(String str, j00.c<? super g2> cVar2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return g2.f100423a;
            }
        }, cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        l2 f11;
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.observeChangesJob == null) {
            f11 = c40.k.f(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$onFocusChange$1(this, null), 3, null);
            this.observeChangesJob = f11;
        } else {
            if (isFocused()) {
                return;
            }
            l2 l2Var = this.observeChangesJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            this.observeChangesJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m1284onImeActionPerformedKlQnJC8(final int i11) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m4725equalsimpl0(i11, companion.m4742getNoneeUduSuo()) || ImeAction.m4725equalsimpl0(i11, companion.m4738getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo1053defaultKeyboardActionKlQnJC8(i11);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    TextFieldDecoratorModifierNode$keyboardActionScope$1 textFieldDecoratorModifierNode$keyboardActionScope$1;
                    textFieldDecoratorModifierNode$keyboardActionScope$1 = TextFieldDecoratorModifierNode.this.keyboardActionScope;
                    textFieldDecoratorModifierNode$keyboardActionScope$1.mo1053defaultKeyboardActionKlQnJC8(i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutofillHighlightOn(boolean z11) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean z11) {
        l2 f11;
        if (z11 || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            f11 = c40.k.f(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
            this.inputSessionJob = f11;
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long m1189getSelectiond9O1mEE = outputText.m1189getSelectiond9O1mEE();
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, 2, null));
        SemanticsPropertiesKt.m4343setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, m1189getSelectiond9O1mEE);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z11 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z11);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {525}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    return new AnonymousClass1(this.this$0, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object observeUntransformedTextChanges;
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.label;
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                        this.label = 1;
                        observeUntransformedTextChanges = textFieldDecoratorModifierNode.observeUntransformedTextChanges(this);
                        if (observeUntransformedTextChanges == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    return g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(AnnotatedString annotatedString) {
                if (!z11) {
                    return Boolean.FALSE;
                }
                this.getTextFieldState().replaceAll(annotatedString);
                this.setAutofillHighlightOn(true);
                c40.k.f(this.getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new x00.l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (z11) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z11) {
                        return Boolean.FALSE;
                    }
                    this.getTextFieldState().replaceAll(annotatedString);
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new x00.l<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z11) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(this.getTextFieldState(), annotatedString, true, null, false, 12, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new x00.q<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$5
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i11, int i12, boolean z12) {
                TextFieldCharSequence untransformedText = z12 ? TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText() : TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                long m1189getSelectiond9O1mEE2 = untransformedText.m1189getSelectiond9O1mEE();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i11, i12) < 0 || Math.max(i11, i12) > untransformedText.length()) {
                    return Boolean.FALSE;
                }
                if (i11 == TextRange.m4559getStartimpl(m1189getSelectiond9O1mEE2) && i12 == TextRange.m4554getEndimpl(m1189getSelectiond9O1mEE2)) {
                    return Boolean.TRUE;
                }
                long TextRange = TextRangeKt.TextRange(i11, i12);
                if (z12 || i11 == i12) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z12) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1318selectUntransformedCharsIn5zctL8(TextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1317selectCharsIn5zctL8(TextRange);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        final int m1067getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m1067getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m4339onImeAction9UiTYpY$default(semanticsPropertyReceiver, m1067getImeActionOrDefaulteUduSuo$foundation_release, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m1284onImeActionPerformedKlQnJC8(m1067getImeActionOrDefaulteUduSuo$foundation_release);
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                boolean isFocused;
                SoftwareKeyboardController requireKeyboardController;
                isFocused = TextFieldDecoratorModifierNode.this.isFocused();
                if (!isFocused) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    requireKeyboardController = TextFieldDecoratorModifierNode.this.requireKeyboardController();
                    requireKeyboardController.show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                boolean isFocused;
                isFocused = TextFieldDecoratorModifierNode.this.isFocused();
                if (!isFocused) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m4553getCollapsedimpl(m1189getSelectiond9O1mEE) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, j00.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object l11 = kotlin.coroutines.intrinsics.b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (TextFieldSelectionState.copy$default(textFieldSelectionState, false, this, 1, null) == l11) {
                                return l11;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.e.n(obj);
                        }
                        return g2.f100423a;
                    }
                }

                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    c40.k.f(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
                        int label;
                        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, j00.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.this$0 = textFieldDecoratorModifierNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                            return new AnonymousClass1(this.this$0, cVar);
                        }

                        @Override // x00.p
                        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object l11 = kotlin.coroutines.intrinsics.b.l();
                            int i11 = this.label;
                            if (i11 == 0) {
                                kotlin.e.n(obj);
                                TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                                this.label = 1;
                                if (textFieldSelectionState.cut(this) == l11) {
                                    return l11;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.e.n(obj);
                            }
                            return g2.f100423a;
                        }
                    }

                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        c40.k.f(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (z11) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new x00.a<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, j00.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, cVar);
                    }

                    @Override // x00.p
                    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object l11 = kotlin.coroutines.intrinsics.b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (textFieldSelectionState.paste(this) == l11) {
                                return l11;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.e.n(obj);
                        }
                        return g2.f100423a;
                    }
                }

                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    c40.k.f(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            DrawScope.m3054drawRectnJ9OG0$default(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m2519unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m80.l
    public final InputTransformation getFilter() {
        return this.filter;
    }

    @m80.k
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @m80.l
    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    @m80.k
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @m80.l
    public final kotlinx.coroutines.flow.x<g2> getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    @m80.k
    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    @m80.k
    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    @m80.k
    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@m80.k FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        boolean z11 = this.enabled && !this.readOnly;
        if (focusState.isFocused()) {
            if (z11) {
                startInputSession(false);
                return;
            }
            return;
        }
        disposeInputSession();
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.commitComposition$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        this.textFieldState.collapseSelectionToMax();
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo204onKeyEventZmokQxo(@m80.k KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1215onKeyEventCJ9ybgU(keyEvent, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, this.enabled && !this.readOnly, this.singleLine, new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.m1284onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m1067getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onObservedReadsChanged$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@m80.k LayoutCoordinates layoutCoordinates) {
        this.dragAndDropNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@m80.k PointerEvent pointerEvent, @m80.k PointerEventPass pointerEventPass, long j11) {
        this.pointerInputNode.mo205onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j11);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo206onPreKeyEventZmokQxo(@m80.k KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1216onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo365onRemeasuredozmzZPI(long j11) {
        this.dragAndDropNode.mo365onRemeasuredozmzZPI(j11);
    }

    public final void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public final void setFilter(@m80.l InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setInteractionSource(@m80.k MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setKeyboardActionHandler(@m80.l KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final void setKeyboardOptions(@m80.k KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final void setPassword(boolean z11) {
        this.isPassword = z11;
    }

    public final void setReadOnly(boolean z11) {
        this.readOnly = z11;
    }

    public final void setSingleLine(boolean z11) {
        this.singleLine = z11;
    }

    public final void setStylusHandwritingTrigger(@m80.l kotlinx.coroutines.flow.x<g2> xVar) {
        this.stylusHandwritingTrigger = xVar;
    }

    public final void setTextFieldSelectionState(@m80.k TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(@m80.k TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(@m80.k TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final void updateNode(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k TextFieldSelectionState textFieldSelectionState, @m80.l InputTransformation inputTransformation, boolean z11, boolean z12, @m80.k KeyboardOptions keyboardOptions, @m80.l KeyboardActionHandler keyboardActionHandler, boolean z13, @m80.k MutableInteractionSource mutableInteractionSource, boolean z14, @m80.l kotlinx.coroutines.flow.x<g2> xVar) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z15;
        boolean z16 = this.enabled;
        boolean z17 = z16 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
        boolean z18 = this.isPassword;
        kotlinx.coroutines.flow.x<g2> xVar2 = this.stylusHandwritingTrigger;
        if (!z11 || z12) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z15 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z15 = true;
        }
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z11;
        this.readOnly = z12;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z13;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z14;
        this.stylusHandwritingTrigger = xVar;
        if (z15 != z17 || !kotlin.jvm.internal.g0.g(transformedTextFieldState, transformedTextFieldState2) || !kotlin.jvm.internal.g0.g(keyboardOptions, keyboardOptions2) || !kotlin.jvm.internal.g0.g(xVar, xVar2)) {
            if (z15 && isFocused()) {
                startInputSession(false);
            } else if (!z15) {
                disposeInputSession();
            }
        }
        if (z11 != z16 || z15 != z17 || !ImeAction.m4725equalsimpl0(keyboardOptions.m1067getImeActionOrDefaulteUduSuo$foundation_release(), keyboardOptions2.m1067getImeActionOrDefaulteUduSuo$foundation_release()) || z14 != z18) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!kotlin.jvm.internal.g0.g(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (isAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
            }
            textFieldSelectionState.setRequestAutofillAction(new x00.a<g2>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1
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
                    DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
                }
            });
        }
        if (kotlin.jvm.internal.g0.g(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }
}
