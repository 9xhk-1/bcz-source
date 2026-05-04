package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"})
/* loaded from: classes2.dex */
public final class FocusFinderCompat {

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };

    @m80.k
    private final Rect focusedRect = new Rect();

    @m80.k
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.z
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final View get(View view, View view2) {
            View userSpecifiedFocusComparator$lambda$0;
            userSpecifiedFocusComparator$lambda$0 = FocusFinderCompat.userSpecifiedFocusComparator$lambda$0(FocusFinderCompat.this, view, view2);
            return userSpecifiedFocusComparator$lambda$0;
        }
    });

    @m80.k
    private final MutableObjectList<View> tmpList = new MutableObjectList<>(0, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final FocusFinderCompat getInstance() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.FocusFinderThreadLocal.get();
            kotlin.jvm.internal.g0.m(focusFinderCompat);
            return focusFinderCompat;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,463:1\n301#2,6:464\n84#2:470\n84#2:471\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n*L\n265#1:464,6\n267#1:470\n276#1:471\n*E\n"})
    public static final class UserSpecifiedFocusComparator implements Comparator<View> {

        @m80.k
        private final NextFocusGetter mNextFocusGetter;

        @m80.l
        private View root;

        @m80.k
        private final MutableScatterMap<View, View> nextFoci = ScatterMapKt.mutableScatterMapOf();

        @m80.k
        private final MutableScatterSet<View> isConnectedTo = ScatterSetKt.mutableScatterSetOf();

        @m80.k
        private final MutableScatterMap<View, View> headsOfChains = ScatterMapKt.mutableScatterMapOf();

        @m80.k
        private final MutableObjectIntMap<View> originalOrdinal = ObjectIntMapKt.mutableObjectIntMapOf();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface NextFocusGetter {
            @m80.l
            View get(@m80.k View view, @m80.k View view2);
        }

        public UserSpecifiedFocusComparator(@m80.k NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.clear();
            this.isConnectedTo.clear();
            this.originalOrdinal.clear();
            this.nextFoci.clear();
        }

        public final void setFocusables(@m80.k ObjectList<View> objectList, @m80.k View view) {
            this.root = view;
            Object[] objArr = objectList.content;
            int i11 = objectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                this.originalOrdinal.set((View) objArr[i12], i12);
            }
            g10.l W1 = g10.u.W1(0, objectList._size);
            int d11 = W1.d();
            int f11 = W1.f();
            if (d11 <= f11) {
                while (true) {
                    View view2 = objectList.get(f11);
                    View view3 = this.mNextFocusGetter.get(view, view2);
                    if (view3 != null && this.originalOrdinal.containsKey(view3)) {
                        this.nextFoci.set(view2, view3);
                        this.isConnectedTo.add(view3);
                    }
                    if (f11 == d11) {
                        break;
                    } else {
                        f11--;
                    }
                }
            }
            g10.l W12 = g10.u.W1(0, objectList._size);
            int d12 = W12.d();
            int f12 = W12.f();
            if (d12 > f12) {
                return;
            }
            while (true) {
                View view4 = objectList.get(f12);
                if (this.nextFoci.get(view4) != null && !this.isConnectedTo.contains(view4)) {
                    setHeadOfChain(view4);
                }
                if (f12 == d12) {
                    return;
                } else {
                    f12--;
                }
            }
        }

        public final void setHeadOfChain(@m80.k View view) {
            View view2 = view;
            while (view != null) {
                View view3 = this.headsOfChains.get(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.headsOfChains.set(view, view2);
                view = this.nextFoci.get(view);
            }
        }

        @Override // java.util.Comparator
        public int compare(@m80.l View view, @m80.l View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = this.headsOfChains.get(view);
            View view4 = this.headsOfChains.get(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.nextFoci.get(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.originalOrdinal.get(view) < this.originalOrdinal.get(view2) ? -1 : 1;
        }
    }

    private final View findNextFocus(ViewGroup viewGroup, View view, int i11, MutableObjectList<View> mutableObjectList) {
        Rect rect = this.focusedRect;
        view.getFocusedRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return findNextFocusInRelativeDirection(mutableObjectList, viewGroup, view, i11);
    }

    @SuppressLint({"AsCollectionCall"})
    private final View findNextFocusInRelativeDirection(MutableObjectList<View> mutableObjectList, ViewGroup viewGroup, View view, int i11) {
        try {
            UserSpecifiedFocusComparator userSpecifiedFocusComparator = this.userSpecifiedFocusComparator;
            kotlin.jvm.internal.g0.m(viewGroup);
            userSpecifiedFocusComparator.setFocusables(mutableObjectList, viewGroup);
            Collections.sort(mutableObjectList.asMutableList(), this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.recycle();
            int size = mutableObjectList.getSize();
            View view2 = null;
            if (size < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (i11 == 1) {
                view2 = getPreviousFocusable(view, mutableObjectList, size, zArr);
            } else if (i11 == 2) {
                view2 = getNextFocusable(view, mutableObjectList, size, zArr);
            }
            return view2 == null ? mutableObjectList.get(size - 1) : view2;
        } catch (Throwable th2) {
            this.userSpecifiedFocusComparator.recycle();
            throw th2;
        }
    }

    private final View findNextUserSpecifiedFocus(ViewGroup viewGroup, View view, int i11) {
        View findUserSetNextFocus;
        findUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(view, viewGroup, i11);
        boolean z11 = true;
        View view2 = findUserSetNextFocus;
        while (findUserSetNextFocus != null) {
            if (findUserSetNextFocus.isFocusable() && findUserSetNextFocus.getVisibility() == 0 && (!findUserSetNextFocus.isInTouchMode() || findUserSetNextFocus.isFocusableInTouchMode())) {
                return findUserSetNextFocus;
            }
            findUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(findUserSetNextFocus, viewGroup, i11);
            boolean z12 = !z11;
            if (!z11) {
                view2 = view2 != null ? FocusFinderCompat_androidKt.findUserSetNextFocus(view2, viewGroup, i11) : null;
                if (view2 == findUserSetNextFocus) {
                    break;
                }
            }
            z11 = z12;
        }
        return null;
    }

    private final ViewGroup getEffectiveRoot(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup2 == null) {
                        break;
                    }
                    return viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    private final View getNextFocusable(View view, ObjectList<View> objectList, int i11, boolean[] zArr) {
        int i12;
        if (i11 < 2) {
            return null;
        }
        int lastIndexOf = objectList.lastIndexOf(view);
        if (lastIndexOf >= 0 && (i12 = lastIndexOf + 1) < i11) {
            return objectList.get(i12);
        }
        zArr[0] = true;
        return objectList.get(0);
    }

    private final View getPreviousFocusable(View view, ObjectList<View> objectList, int i11, boolean[] zArr) {
        int indexOf;
        if (i11 < 2) {
            return null;
        }
        if (view != null && (indexOf = objectList.indexOf(view)) > 0) {
            return objectList.get(indexOf - 1);
        }
        zArr[0] = true;
        return objectList.get(i11 - 1);
    }

    private final boolean isValidId(int i11) {
        return (i11 == 0 || i11 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat focusFinderCompat, View view, View view2) {
        View findUserSetNextFocus;
        if (!focusFinderCompat.isValidId(view2.getNextFocusForwardId())) {
            return null;
        }
        findUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(view2, view, 2);
        return findUserSetNextFocus;
    }

    @m80.l
    public final View findNextFocus1d(@m80.k ViewGroup viewGroup, @m80.k View view, int i11) {
        ViewGroup effectiveRoot = getEffectiveRoot(viewGroup, view);
        View findNextUserSpecifiedFocus = findNextUserSpecifiedFocus(effectiveRoot, view, i11);
        if (findNextUserSpecifiedFocus != null) {
            return findNextUserSpecifiedFocus;
        }
        MutableObjectList<View> mutableObjectList = this.tmpList;
        try {
            mutableObjectList.clear();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, mutableObjectList, i11);
            if (!mutableObjectList.isEmpty()) {
                findNextUserSpecifiedFocus = findNextFocus(effectiveRoot, view, i11, mutableObjectList);
            }
            return findNextUserSpecifiedFocus;
        } finally {
            mutableObjectList.clear();
        }
    }

    private final void FocusFinder() {
    }
}
