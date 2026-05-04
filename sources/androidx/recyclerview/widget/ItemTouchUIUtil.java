package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface ItemTouchUIUtil {
    @SuppressLint({"UnknownNullness"})
    void clearView(View view);

    @SuppressLint({"UnknownNullness"})
    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11);

    @SuppressLint({"UnknownNullness"})
    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11);

    @SuppressLint({"UnknownNullness"})
    void onSelected(View view);
}
