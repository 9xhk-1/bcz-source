package androidx.databinding.adapters;

import android.widget.NumberPicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@BindingMethods({@BindingMethod(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @BindingMethod(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:value", type = NumberPicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class NumberPickerBindingAdapter {
    @BindingAdapter(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void setListeners(NumberPicker numberPicker, final NumberPicker.OnValueChangeListener onValueChangeListener, final InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: androidx.databinding.adapters.NumberPickerBindingAdapter.1
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public void onValueChange(NumberPicker numberPicker2, int i11, int i12) {
                    NumberPicker.OnValueChangeListener onValueChangeListener2 = onValueChangeListener;
                    if (onValueChangeListener2 != null) {
                        onValueChangeListener2.onValueChange(numberPicker2, i11, i12);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }

    @BindingAdapter({"android:value"})
    public static void setValue(NumberPicker numberPicker, int i11) {
        if (numberPicker.getValue() != i11) {
            numberPicker.setValue(i11);
        }
    }
}
