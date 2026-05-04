package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;

    @m80.l
    private ActionMode actionMode;

    @m80.k
    private final View view;

    @m80.k
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new x00.a<g2>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
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
            AndroidTextToolbar.this.actionMode = null;
        }
    }, null, null, null, null, null, null, 126, null);

    @m80.k
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(@m80.k View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    @m80.k
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@m80.k Rect rect, @m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2, @m80.l x00.a<g2> aVar3, @m80.l x00.a<g2> aVar4, @m80.l x00.a<g2> aVar5) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(aVar);
        this.textActionModeCallback.setOnCutRequested(aVar3);
        this.textActionModeCallback.setOnPasteRequested(aVar2);
        this.textActionModeCallback.setOnSelectAllRequested(aVar4);
        this.textActionModeCallback.setOnAutofillRequested(aVar5);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@m80.k Rect rect, @m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2, @m80.l x00.a<g2> aVar3, @m80.l x00.a<g2> aVar4) {
        showMenu(rect, aVar, aVar2, aVar3, aVar4, null);
    }
}
