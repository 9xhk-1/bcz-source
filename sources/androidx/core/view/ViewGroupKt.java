package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ViewGroupKt {
    public static final boolean contains(@m80.k ViewGroup viewGroup, @m80.k View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(@m80.k ViewGroup viewGroup, @m80.k x00.l<? super View, yz.g2> lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            lVar.invoke(viewGroup.getChildAt(i11));
        }
    }

    public static final void forEachIndexed(@m80.k ViewGroup viewGroup, @m80.k x00.p<? super Integer, ? super View, yz.g2> pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pVar.invoke(Integer.valueOf(i11), viewGroup.getChildAt(i11));
        }
    }

    @m80.k
    public static final View get(@m80.k ViewGroup viewGroup, int i11) {
        View childAt = viewGroup.getChildAt(i11);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + viewGroup.getChildCount());
    }

    @m80.k
    public static final q30.m<View> getChildren(@m80.k final ViewGroup viewGroup) {
        return new q30.m<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // q30.m
            @m80.k
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    @m80.k
    public static final q30.m<View> getDescendants(@m80.k final ViewGroup viewGroup) {
        return new q30.m<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // q30.m
            @m80.k
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), new x00.l<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // x00.l
                    @m80.l
                    public final Iterator<View> invoke(@m80.k View view) {
                        q30.m<View> children;
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 == null || (children = ViewGroupKt.getChildren(viewGroup2)) == null) {
                            return null;
                        }
                        return children.iterator();
                    }
                });
            }
        };
    }

    @m80.k
    public static final g10.l getIndices(@m80.k ViewGroup viewGroup) {
        return g10.u.W1(0, viewGroup.getChildCount());
    }

    public static final int getSize(@m80.k ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(@m80.k ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(@m80.k ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @m80.k
    public static final Iterator<View> iterator(@m80.k ViewGroup viewGroup) {
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(@m80.k ViewGroup viewGroup, @m80.k View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(@m80.k ViewGroup viewGroup, @m80.k View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(@m80.k ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i11) {
        marginLayoutParams.setMargins(i11, i11, i11, i11);
    }

    public static final void updateMargins(@m80.k ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        marginLayoutParams.setMargins(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = marginLayoutParams.leftMargin;
        }
        if ((i15 & 2) != 0) {
            i12 = marginLayoutParams.topMargin;
        }
        if ((i15 & 4) != 0) {
            i13 = marginLayoutParams.rightMargin;
        }
        if ((i15 & 8) != 0) {
            i14 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i11, i12, i13, i14);
    }

    public static final void updateMarginsRelative(@m80.k ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.setMarginEnd(i13);
        marginLayoutParams.bottomMargin = i14;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = marginLayoutParams.getMarginStart();
        }
        if ((i15 & 2) != 0) {
            i12 = marginLayoutParams.topMargin;
        }
        if ((i15 & 4) != 0) {
            i13 = marginLayoutParams.getMarginEnd();
        }
        if ((i15 & 8) != 0) {
            i14 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i11);
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.setMarginEnd(i13);
        marginLayoutParams.bottomMargin = i14;
    }
}
