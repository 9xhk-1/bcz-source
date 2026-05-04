package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class TableLayoutBindingAdapter {
    private static final int MAX_COLUMNS = 20;
    private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    private static SparseBooleanArray parseColumns(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence != null) {
            for (String str : sColumnPattern.split(charSequence)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= 0) {
                        sparseBooleanArray.put(parseInt, true);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return sparseBooleanArray;
    }

    @BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray parseColumns = parseColumns(charSequence);
        for (int i11 = 0; i11 < 20; i11++) {
            boolean z11 = parseColumns.get(i11, false);
            if (z11 != tableLayout.isColumnCollapsed(i11)) {
                tableLayout.setColumnCollapsed(i11, z11);
            }
        }
    }

    @BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray parseColumns = parseColumns(charSequence);
        int size = parseColumns.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = parseColumns.keyAt(i11);
            boolean valueAt = parseColumns.valueAt(i11);
            if (valueAt) {
                tableLayout.setColumnShrinkable(keyAt, valueAt);
            }
        }
    }

    @BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray parseColumns = parseColumns(charSequence);
        int size = parseColumns.size();
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = parseColumns.keyAt(i11);
            boolean valueAt = parseColumns.valueAt(i11);
            if (valueAt) {
                tableLayout.setColumnStretchable(keyAt, valueAt);
            }
        }
    }
}
