package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableObjectList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,463:1\n260#2:464\n919#3,2:465\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat_androidKt\n*L\n448#1:464\n455#1:465,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFocusableViews(View view, MutableObjectList<View> mutableObjectList, int i11) {
        addFocusableViews(view, mutableObjectList, i11, view.isInTouchMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findUserSetNextFocus(final View view, final View view2, int i11) {
        int nextFocusForwardId;
        if (i11 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return findViewByPredicateInsideOut(view2, view, new x00.l<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findUserSetNextFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(View view3) {
                    View findViewInsideOutShouldExist;
                    findViewInsideOutShouldExist = FocusFinderCompat_androidKt.findViewInsideOutShouldExist(view2, view3, view3.getNextFocusForwardId());
                    return Boolean.valueOf(findViewInsideOutShouldExist == view);
                }
            });
        }
        if (i11 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return findViewInsideOutShouldExist(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.View findViewByPredicateInsideOut(android.view.View r4, android.view.View r5, x00.l<? super android.view.View, java.lang.Boolean> r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = findViewByPredicateTraversal(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findViewByPredicateInsideOut(android.view.View, android.view.View, x00.l):android.view.View");
    }

    private static final View findViewByPredicateTraversal(View view, x00.l<? super View, Boolean> lVar, View view2) {
        View findViewByPredicateTraversal;
        if (lVar.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != view2 && (findViewByPredicateTraversal = findViewByPredicateTraversal(childAt, lVar, view2)) != null) {
                return findViewByPredicateTraversal;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewInsideOutShouldExist(View view, View view2, final int i11) {
        return findViewByPredicateInsideOut(view, view2, new x00.l<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt$findViewInsideOutShouldExist$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(View view3) {
                return Boolean.valueOf(view3.getId() == i11);
            }
        });
    }

    private static final void addFocusableViews(View view, MutableObjectList<View> mutableObjectList, int i11, boolean z11) {
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z11 || view.isFocusableInTouchMode())) {
            mutableObjectList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                addFocusableViews(viewGroup.getChildAt(i12), mutableObjectList, i11, z11);
            }
        }
    }
}
