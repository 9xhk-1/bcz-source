package androidx.databinding.adapters;

import android.widget.CalendarView;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.InverseBindingMethod;
import androidx.databinding.InverseBindingMethods;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@InverseBindingMethods({@InverseBindingMethod(attribute = "android:date", type = CalendarView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class CalendarViewBindingAdapter {
    @BindingAdapter({"android:date"})
    public static void setDate(CalendarView calendarView, long j11) {
        if (calendarView.getDate() != j11) {
            calendarView.setDate(j11);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void setListeners(CalendarView calendarView, final CalendarView.OnDateChangeListener onDateChangeListener, final InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() { // from class: androidx.databinding.adapters.CalendarViewBindingAdapter.1
                @Override // android.widget.CalendarView.OnDateChangeListener
                public void onSelectedDayChange(CalendarView calendarView2, int i11, int i12, int i13) {
                    CalendarView.OnDateChangeListener onDateChangeListener2 = onDateChangeListener;
                    if (onDateChangeListener2 != null) {
                        onDateChangeListener2.onSelectedDayChange(calendarView2, i11, i12, i13);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
