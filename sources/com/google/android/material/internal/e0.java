package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes7.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<View> f31576a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    @Nullable
    public static ActionMenuItemView a(@NonNull Toolbar toolbar, @IdRes int i11) {
        ActionMenuView b11 = b(toolbar);
        if (b11 == null) {
            return null;
        }
        for (int i12 = 0; i12 < b11.getChildCount(); i12++) {
            View childAt = b11.getChildAt(i12);
            if (childAt instanceof ActionMenuItemView) {
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) childAt;
                if (actionMenuItemView.getItemData().getItemId() == i11) {
                    return actionMenuItemView;
                }
            }
        }
        return null;
    }

    @Nullable
    public static ActionMenuView b(@NonNull Toolbar toolbar) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    @Nullable
    public static ImageView c(@NonNull Toolbar toolbar, @Nullable Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    @Nullable
    public static ImageView d(@NonNull Toolbar toolbar) {
        return c(toolbar, toolbar.getLogo());
    }

    @Nullable
    public static ImageButton e(@NonNull Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    @Nullable
    public static View f(@NonNull Toolbar toolbar) {
        ActionMenuView b11 = b(toolbar);
        if (b11 == null || b11.getChildCount() <= 1) {
            return null;
        }
        return b11.getChildAt(0);
    }

    @Nullable
    public static TextView g(@NonNull Toolbar toolbar) {
        List<TextView> h11 = h(toolbar, toolbar.getSubtitle());
        if (h11.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(h11, f31576a);
    }

    public static List<TextView> h(@NonNull Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static TextView i(@NonNull Toolbar toolbar) {
        List<TextView> h11 = h(toolbar, toolbar.getTitle());
        if (h11.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(h11, f31576a);
    }
}
