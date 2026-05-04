package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes2.dex */
public class Space extends View {
    @Deprecated
    public Space(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int getDefaultSize2(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i11 : size : Math.min(i11, size);
    }

    @Override // android.view.View
    @Deprecated
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(getDefaultSize2(getSuggestedMinimumWidth(), i11), getDefaultSize2(getSuggestedMinimumHeight(), i12));
    }

    @Deprecated
    public Space(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }
}
