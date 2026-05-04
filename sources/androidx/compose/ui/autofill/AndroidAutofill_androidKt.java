package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n150#2,3:149\n34#2,6:152\n153#2:158\n37#3,2:159\n26#4:161\n26#4:162\n26#4:163\n26#4:164\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n101#1:149,3\n101#1:152,6\n101#1:158\n101#1:159,2\n114#1:161\n115#1:162\n116#1:163\n117#1:164\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    public static final void performAutofill(@m80.k AndroidAutofill androidAutofill, @m80.k SparseArray<AutofillValue> sparseArray) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = sparseArray.keyAt(i11);
            AutofillValue a11 = f.a(sparseArray.get(keyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(a11)) {
                androidAutofill.getAutofillTree().performAutofill(keyAt, autofillApi26Helper.textValue(a11).toString());
            } else {
                if (autofillApi26Helper.isDate(a11)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillApi26Helper.isList(a11)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillApi26Helper.isToggle(a11)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @RequiresApi(26)
    public static final void populateViewStructure(@m80.k AndroidAutofill androidAutofill, @m80.k ViewStructure viewStructure) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int addChildCount = AutofillApi26Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            ViewStructure newChild = autofillApi26Helper.newChild(viewStructure, addChildCount);
            autofillApi26Helper.setAutofillId(newChild, androidAutofill.getRootAutofillId(), intValue);
            autofillApi26Helper.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), null, null);
            autofillApi26Helper.setAutofillType(newChild, ContentDataType_androidKt.getDataType(ContentDataType.Companion.getText()));
            List<AutofillType> autofillTypes = value.getAutofillTypes();
            ArrayList arrayList = new ArrayList(autofillTypes.size());
            int size = autofillTypes.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i11)));
            }
            autofillApi26Helper.setAutofillHints(newChild, (String[]) arrayList.toArray(new String[0]));
            Rect boundingBox = value.getBoundingBox();
            if (boundingBox == null) {
                Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int round = Math.round(boundingBox.getLeft());
                int round2 = Math.round(boundingBox.getTop());
                int round3 = Math.round(boundingBox.getRight());
                AutofillApi26Helper.INSTANCE.setDimens(newChild, round, round2, 0, 0, round3 - round, Math.round(boundingBox.getBottom()) - round2);
            }
            addChildCount++;
        }
    }
}
