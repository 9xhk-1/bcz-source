package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@RequiresApi(26)
@u0({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n89#2,7:149\n26#3:156\n26#3:157\n26#3:158\n26#3:159\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n53#1:149,7\n67#1:156\n68#1:157\n69#1:158\n70#1:159\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;

    @m80.k
    private final android.view.autofill.AutofillManager autofillManager;

    @m80.k
    private final AutofillTree autofillTree;

    @m80.k
    private AutofillId rootAutofillId;

    @m80.k
    private final View view;

    public AndroidAutofill(@m80.k View view, @m80.k AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        android.view.autofill.AutofillManager a11 = d.a(view.getContext().getSystemService(c.a()));
        if (a11 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = a11;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 != null) {
            this.rootAutofillId = autofillId2;
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(@m80.k AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    @m80.k
    public final android.view.autofill.AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @m80.k
    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @m80.k
    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    @m80.k
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(@m80.k AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
    }

    public final void setRootAutofillId(@m80.k AutofillId autofillId) {
        this.rootAutofillId = autofillId;
    }
}
