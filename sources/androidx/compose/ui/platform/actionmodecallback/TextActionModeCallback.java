package androidx.compose.ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes2.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;

    @l
    private final a<g2> onActionModeDestroy;

    @l
    private a<g2> onAutofillRequested;

    @l
    private a<g2> onCopyRequested;

    @l
    private a<g2> onCutRequested;

    @l
    private a<g2> onPasteRequested;

    @l
    private a<g2> onSelectAllRequested;

    @k
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, a<g2> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else {
            if (aVar != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(@k Menu menu, @k MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    @l
    public final a<g2> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    @l
    public final a<g2> getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    @l
    public final a<g2> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @l
    public final a<g2> getOnCutRequested() {
        return this.onCutRequested;
    }

    @l
    public final a<g2> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @l
    public final a<g2> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @k
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@l ActionMode actionMode, @l MenuItem menuItem) {
        g0.m(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            a<g2> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            a<g2> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            a<g2> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            a<g2> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            a<g2> aVar5 = this.onAutofillRequested;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(@l ActionMode actionMode, @l Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        addMenuItem$ui_release(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        a<g2> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean onPrepareActionMode(@l ActionMode actionMode, @l Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnAutofillRequested(@l a<g2> aVar) {
        this.onAutofillRequested = aVar;
    }

    public final void setOnCopyRequested(@l a<g2> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void setOnCutRequested(@l a<g2> aVar) {
        this.onCutRequested = aVar;
    }

    public final void setOnPasteRequested(@l a<g2> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void setOnSelectAllRequested(@l a<g2> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void setRect(@k Rect rect) {
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@k Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public TextActionModeCallback(@l a<g2> aVar, @k Rect rect, @l a<g2> aVar2, @l a<g2> aVar3, @l a<g2> aVar4, @l a<g2> aVar5, @l a<g2> aVar6) {
        this.onActionModeDestroy = aVar;
        this.rect = rect;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
        this.onAutofillRequested = aVar6;
    }

    public /* synthetic */ TextActionModeCallback(a aVar, Rect rect, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? Rect.Companion.getZero() : rect, (i11 & 4) != 0 ? null : aVar2, (i11 & 8) != 0 ? null : aVar3, (i11 & 16) != 0 ? null : aVar4, (i11 & 32) != 0 ? null : aVar5, (i11 & 64) != 0 ? null : aVar6);
    }
}
