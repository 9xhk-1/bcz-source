package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import java.util.Calendar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f31105a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31106b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public static int d(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public static boolean e(@Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14) {
        return l11 == null || l12 == null || l13 == null || l14 == null || l13.longValue() > l12.longValue() || l14.longValue() < l11.longValue();
    }

    public final void a(int i11, Rect rect) {
        if (i11 == 33) {
            setSelection(getAdapter().n());
        } else if (i11 == 130) {
            setSelection(getAdapter().c());
        } else {
            super.onFocusChanged(true, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public p getAdapter2() {
        return (p) super.getAdapter();
    }

    public final View c(int i11) {
        return getChildAt(i11 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int b11;
        int d11;
        int b12;
        int d12;
        int width;
        int i11;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        p adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.f31280b;
        b bVar = adapter.f31282d;
        int max = Math.max(adapter.c(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.n(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        for (Pair<Long, Long> pair : dateSelector.G0()) {
            Long l11 = pair.first;
            if (l11 == null) {
                materialCalendarGridView = this;
            } else if (pair.second != null) {
                Long l12 = l11;
                long longValue = l12.longValue();
                Long l13 = pair.second;
                long longValue2 = l13.longValue();
                if (!e(item, item2, l12, l13)) {
                    boolean s11 = m0.s(materialCalendarGridView);
                    if (longValue < item.longValue()) {
                        d11 = adapter.i(max) ? 0 : !s11 ? materialCalendarGridView.c(max - 1).getRight() : materialCalendarGridView.c(max - 1).getLeft();
                        b11 = max;
                    } else {
                        materialCalendarGridView.f31105a.setTimeInMillis(longValue);
                        b11 = adapter.b(materialCalendarGridView.f31105a.get(5));
                        d11 = d(materialCalendarGridView.c(b11));
                    }
                    if (longValue2 > item2.longValue()) {
                        d12 = adapter.j(min) ? materialCalendarGridView.getWidth() : !s11 ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        b12 = min;
                    } else {
                        materialCalendarGridView.f31105a.setTimeInMillis(longValue2);
                        b12 = adapter.b(materialCalendarGridView.f31105a.get(5));
                        d12 = d(materialCalendarGridView.c(b12));
                    }
                    int itemId = (int) adapter.getItemId(b11);
                    int i12 = max;
                    int i13 = min;
                    int itemId2 = (int) adapter.getItemId(b12);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View c11 = materialCalendarGridView.c(numColumns);
                        int top = c11.getTop() + bVar.f31143a.e();
                        p pVar = adapter;
                        int bottom = c11.getBottom() - bVar.f31143a.b();
                        if (s11) {
                            int i14 = b12 > numColumns2 ? 0 : d12;
                            width = numColumns > b11 ? getWidth() : d11;
                            i11 = i14;
                        } else {
                            i11 = numColumns > b11 ? 0 : d11;
                            width = b12 > numColumns2 ? getWidth() : d12;
                        }
                        canvas.drawRect(i11, top, width, bottom, bVar.f31150h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = pVar;
                    }
                    materialCalendarGridView = this;
                    max = i12;
                    min = i13;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (z11) {
            a(i11, rect);
        } else {
            super.onFocusChanged(false, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!super.onKeyDown(i11, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().c()) {
            return true;
        }
        if (19 != i11) {
            return false;
        }
        setSelection(getAdapter().c());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (!this.f31106b) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i11) {
        if (i11 < getAdapter().c()) {
            super.setSelection(getAdapter().c());
        } else {
            super.setSelection(i11);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof p)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31105a = v.x();
        if (l.S(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f31106b = l.U(getContext());
        ViewCompat.setAccessibilityDelegate(this, new a());
    }
}
