package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,349:1\n202#2,4:350\n206#2:357\n207#2,3:360\n249#2,14:363\n57#3:354\n61#3:358\n60#4:355\n70#4:359\n22#5:356\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n159#1:350,4\n159#1:357\n159#1:360,3\n159#1:363,14\n159#1:354\n159#1:358\n159#1:355\n159#1:359\n159#1:356\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;

    @k
    private final Modifier modifier;

    @k
    private StaticTextSelectionParams params;

    @l
    private Selectable selectable;
    private final long selectableId;

    @k
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j11, SelectionRegistrar selectionRegistrar, long j12, StaticTextSelectionParams staticTextSelectionParams, v vVar) {
        this(j11, selectionRegistrar, j12, staticTextSelectionParams);
    }

    public final void draw(@k DrawScope drawScope) {
        Selection selection = this.selectionRegistrar.getSubselections().get(this.selectableId);
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        Path pathForRange = this.params.getPathForRange(u.B(offset, lastVisibleOffset), u.B(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            DrawScope.m3050drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L));
        int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2984clipRectN_I0leg(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, m2498getIntersectrtfAjoo);
            DrawScope.m3050drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        }
    }

    @k
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new a<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final LayoutCoordinates invoke() {
                StaticTextSelectionParams staticTextSelectionParams;
                staticTextSelectionParams = SelectionController.this.params;
                return staticTextSelectionParams.getLayoutCoordinates();
            }
        }, new a<TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$onRemembered$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final TextLayoutResult invoke() {
                StaticTextSelectionParams staticTextSelectionParams;
                staticTextSelectionParams = SelectionController.this.params;
                return staticTextSelectionParams.getTextLayoutResult();
            }
        }));
    }

    public final void updateGlobalPosition(@k LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void updateTextLayout(@k TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !g0.g(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.notifySelectableChange(this.selectableId);
        }
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    private SelectionController(long j11, SelectionRegistrar selectionRegistrar, long j12, StaticTextSelectionParams staticTextSelectionParams) {
        Modifier makeSelectionModifier;
        this.selectableId = j11;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j12;
        this.params = staticTextSelectionParams;
        makeSelectionModifier = SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j11, new a<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final LayoutCoordinates invoke() {
                StaticTextSelectionParams staticTextSelectionParams2;
                staticTextSelectionParams2 = SelectionController.this.params;
                return staticTextSelectionParams2.getLayoutCoordinates();
            }
        });
        this.modifier = PointerIconKt.pointerHoverIcon$default(makeSelectionModifier, TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    public /* synthetic */ SelectionController(long j11, SelectionRegistrar selectionRegistrar, long j12, StaticTextSelectionParams staticTextSelectionParams, int i11, v vVar) {
        this(j11, selectionRegistrar, j12, (i11 & 8) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
