package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;

    @m80.k
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @RequiresApi(26)
    public final int addChildCount(@m80.k ViewStructure viewStructure, int i11) {
        return viewStructure.addChildCount(i11);
    }

    @RequiresApi(26)
    public final boolean booleanValue(@m80.k AutofillValue autofillValue) {
        boolean toggleValue;
        toggleValue = autofillValue.getToggleValue();
        return toggleValue;
    }

    @m80.l
    @RequiresApi(26)
    public final AutofillId getAutofillId(@m80.k ViewStructure viewStructure) {
        AutofillId autofillId;
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    @RequiresApi(26)
    @m80.k
    public final AutofillValue getAutofillTextValue(@m80.k String str) {
        AutofillValue forText;
        forText = AutofillValue.forText(str);
        return forText;
    }

    @RequiresApi(26)
    public final boolean isDate(@m80.k AutofillValue autofillValue) {
        boolean isDate;
        isDate = autofillValue.isDate();
        return isDate;
    }

    @RequiresApi(26)
    public final boolean isList(@m80.k AutofillValue autofillValue) {
        boolean isList;
        isList = autofillValue.isList();
        return isList;
    }

    @RequiresApi(26)
    public final boolean isText(@m80.k AutofillValue autofillValue) {
        boolean isText;
        isText = autofillValue.isText();
        return isText;
    }

    @RequiresApi(26)
    public final boolean isToggle(@m80.k AutofillValue autofillValue) {
        boolean isToggle;
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    @RequiresApi(26)
    public final int listValue(@m80.k AutofillValue autofillValue) {
        int listValue;
        listValue = autofillValue.getListValue();
        return listValue;
    }

    @RequiresApi(26)
    @m80.k
    public final ViewStructure newChild(@m80.k ViewStructure viewStructure, int i11) {
        return viewStructure.newChild(i11);
    }

    @RequiresApi(26)
    public final void setAutofillHints(@m80.k ViewStructure viewStructure, @m80.k String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @RequiresApi(26)
    public final void setAutofillId(@m80.k ViewStructure viewStructure, @m80.k AutofillId autofillId, int i11) {
        viewStructure.setAutofillId(autofillId, i11);
    }

    @RequiresApi(26)
    public final void setAutofillType(@m80.k ViewStructure viewStructure, int i11) {
        viewStructure.setAutofillType(i11);
    }

    @RequiresApi(26)
    public final void setAutofillValue(@m80.k ViewStructure viewStructure, @m80.k AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    @RequiresApi(26)
    public final void setCheckable(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setCheckable(z11);
    }

    @RequiresApi(26)
    public final void setChecked(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setChecked(z11);
    }

    @RequiresApi(26)
    public final void setChildCount(@m80.k ViewStructure viewStructure, int i11) {
        viewStructure.setChildCount(i11);
    }

    @RequiresApi(26)
    public final void setClassName(@m80.k ViewStructure viewStructure, @m80.k String str) {
        viewStructure.setClassName(str);
    }

    @RequiresApi(26)
    public final void setClickable(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setClickable(z11);
    }

    @RequiresApi(26)
    public final void setContentDescription(@m80.k ViewStructure viewStructure, @m80.k CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    @RequiresApi(26)
    public final void setDataIsSensitive(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setDataIsSensitive(z11);
    }

    @RequiresApi(26)
    public final void setDimens(@m80.k ViewStructure viewStructure, int i11, int i12, int i13, int i14, int i15, int i16) {
        viewStructure.setDimens(i11, i12, i13, i14, i15, i16);
    }

    @RequiresApi(26)
    public final void setEnabled(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setEnabled(z11);
    }

    @RequiresApi(26)
    public final void setFocusable(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setFocusable(z11);
    }

    @RequiresApi(26)
    public final void setFocused(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setFocused(z11);
    }

    @RequiresApi(26)
    public final void setId(@m80.k ViewStructure viewStructure, int i11, @m80.l String str, @m80.l String str2, @m80.l String str3) {
        viewStructure.setId(i11, str, str2, str3);
    }

    @RequiresApi(26)
    public final void setInputType(@m80.k ViewStructure viewStructure, int i11) {
        viewStructure.setInputType(i11);
    }

    @RequiresApi(26)
    public final void setLongClickable(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setLongClickable(z11);
    }

    @RequiresApi(26)
    public final void setOpaque(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setOpaque(z11);
    }

    @RequiresApi(26)
    public final void setSelected(@m80.k ViewStructure viewStructure, boolean z11) {
        viewStructure.setSelected(z11);
    }

    @RequiresApi(26)
    public final void setText(@m80.k ViewStructure viewStructure, @m80.k CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    @RequiresApi(26)
    public final void setVisibility(@m80.k ViewStructure viewStructure, int i11) {
        viewStructure.setVisibility(i11);
    }

    @RequiresApi(26)
    @m80.k
    public final CharSequence textValue(@m80.k AutofillValue autofillValue) {
        CharSequence textValue;
        textValue = autofillValue.getTextValue();
        return textValue;
    }
}
