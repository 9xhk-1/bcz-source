package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(26)
@u0({"SMAP\nAndroidAutofillManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,314:1\n89#2,7:315\n80#3:322\n80#3:323\n34#4,6:324\n*S KotlinDebug\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n*L\n69#1:315,7\n172#1:322\n173#1:323\n175#1:324,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 8;

    @m80.k
    private MutableIntSet currentlyDisplayedIDs;

    @m80.k
    private final String packageName;
    private boolean pendingAutofillCommit;

    @m80.k
    private PlatformAutofillManager platformAutofillManager;

    @m80.k
    private final RectManager rectManager;

    @m80.k
    private Rect reusableRect = new Rect();

    @m80.k
    private AutofillId rootAutofillId;

    @m80.k
    private final SemanticsOwner semanticsOwner;

    @m80.k
    private final View view;

    public AndroidAutofillManager(@m80.k PlatformAutofillManager platformAutofillManager, @m80.k SemanticsOwner semanticsOwner, @m80.k View view, @m80.k RectManager rectManager, @m80.k String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new KotlinNothingValueException();
        }
        this.rootAutofillId = autofillId2;
        this.currentlyDisplayedIDs = new MutableIntSet(0, 1, null);
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    @m80.k
    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void onDetach$ui_release(@m80.k SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onEndApplyChanges$ui_release() {
        if (this.currentlyDisplayedIDs.isEmpty() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.isNotEmpty()) {
            this.pendingAutofillCommit = true;
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(@m80.l FocusTargetModifierNode focusTargetModifierNode, @m80.l FocusTargetModifierNode focusTargetModifierNode2) {
        SemanticsInfo requireSemanticsInfo;
        SemanticsConfiguration semanticsConfiguration;
        boolean isAutofillable;
        SemanticsInfo requireSemanticsInfo2;
        SemanticsConfiguration semanticsConfiguration2;
        boolean isAutofillable2;
        if (focusTargetModifierNode != null && (requireSemanticsInfo2 = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode)) != null && (semanticsConfiguration2 = requireSemanticsInfo2.getSemanticsConfiguration()) != null) {
            isAutofillable2 = AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2);
            if (isAutofillable2) {
                this.platformAutofillManager.notifyViewExited(this.view, requireSemanticsInfo2.getSemanticsId());
            }
        }
        if (focusTargetModifierNode2 == null || (requireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode2)) == null || (semanticsConfiguration = requireSemanticsInfo.getSemanticsConfiguration()) == null) {
            return;
        }
        isAutofillable = AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration);
        if (isAutofillable) {
            final int semanticsId = requireSemanticsInfo.getSemanticsId();
            this.rectManager.getRects().withRect(semanticsId, new x00.r<Integer, Integer, Integer, Integer, g2>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                    invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                    return g2.f100423a;
                }

                public final void invoke(int i11, int i12, int i13, int i14) {
                    View view;
                    PlatformAutofillManager platformAutofillManager = AndroidAutofillManager.this.getPlatformAutofillManager();
                    view = AndroidAutofillManager.this.view;
                    platformAutofillManager.notifyViewEntered(view, semanticsId, new Rect(i11, i12, i13, i14));
                }
            });
        }
    }

    public final void onLayoutNodeDeactivated$ui_release(@m80.k SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onPostAttach$ui_release(@m80.k SemanticsInfo semanticsInfo) {
        boolean isRelatedToAutoCommit;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            isRelatedToAutoCommit = AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
            if (isRelatedToAutoCommit) {
                this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
            }
        }
    }

    public final void onPostLayoutNodeReused$ui_release(@m80.k SemanticsInfo semanticsInfo, int i11) {
        boolean isRelatedToAutoCommit;
        if (this.currentlyDisplayedIDs.remove(i11)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i11, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            isRelatedToAutoCommit = AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
            if (isRelatedToAutoCommit) {
                this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.semantics.SemanticsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSemanticsChanged(@m80.k androidx.compose.ui.semantics.SemanticsInfo r9, @m80.l androidx.compose.ui.semantics.SemanticsConfiguration r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.AndroidAutofillManager.onSemanticsChanged(androidx.compose.ui.semantics.SemanticsInfo, androidx.compose.ui.semantics.SemanticsConfiguration):void");
    }

    public final void performAutofill(@m80.k SparseArray<AutofillValue> sparseArray) {
        SemanticsConfiguration semanticsConfiguration;
        AccessibilityAction accessibilityAction;
        x00.l lVar;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            AutofillValue a11 = f.a(sparseArray.get(keyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(a11)) {
                SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui_release(keyAt);
                if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnAutofillText())) != null && (lVar = (x00.l) accessibilityAction.getAction()) != null) {
                }
            } else if (autofillApi26Helper.isDate(a11)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillApi26Helper.isList(a11)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillApi26Helper.isToggle(a11)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void populateViewStructure(@m80.k ViewStructure viewStructure) {
        boolean isRelatedToAutofill;
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui_release = this.semanticsOwner.getRootInfo$ui_release();
        PopulateViewStructure_androidKt.populate(viewStructure, rootInfo$ui_release, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList mutableObjectListOf = ObjectListKt.mutableObjectListOf(rootInfo$ui_release, viewStructure);
        while (mutableObjectListOf.isNotEmpty()) {
            Object removeAt = mutableObjectListOf.removeAt(mutableObjectListOf._size - 1);
            g0.n(removeAt, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) removeAt;
            Object removeAt2 = mutableObjectListOf.removeAt(mutableObjectListOf._size - 1);
            g0.n(removeAt2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) removeAt2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i11);
                if (!semanticsInfo.isDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration != null) {
                        isRelatedToAutofill = AndroidAutofillManager_androidKt.isRelatedToAutofill(semanticsConfiguration);
                        if (isRelatedToAutofill) {
                            ViewStructure newChild = autofillApi26Helper.newChild(viewStructure2, autofillApi26Helper.addChildCount(viewStructure2, 1));
                            PopulateViewStructure_androidKt.populate(newChild, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                            mutableObjectListOf.add(semanticsInfo);
                            mutableObjectListOf.add(newChild);
                        }
                    }
                    mutableObjectListOf.add(semanticsInfo);
                    mutableObjectListOf.add(viewStructure2);
                }
            }
        }
    }

    public final void requestAutofill$ui_release(@m80.k final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new x00.r<Integer, Integer, Integer, Integer, g2>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return g2.f100423a;
            }

            public final void invoke(int i11, int i12, int i13, int i14) {
                Rect rect;
                View view;
                Rect rect2;
                rect = AndroidAutofillManager.this.reusableRect;
                rect.set(i11, i12, i13, i14);
                PlatformAutofillManager platformAutofillManager = AndroidAutofillManager.this.getPlatformAutofillManager();
                view = AndroidAutofillManager.this.view;
                int semanticsId = semanticsInfo.getSemanticsId();
                rect2 = AndroidAutofillManager.this.reusableRect;
                platformAutofillManager.requestAutofill(view, semanticsId, rect2);
            }
        });
    }

    public final void setPlatformAutofillManager(@m80.k PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }
}
