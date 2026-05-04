package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n55#2,6:346\n55#2,6:352\n1855#3,2:358\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n112#1:346,6\n134#1:352,6\n218#1:358,2\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentContainerView extends FrameLayout {

    @m80.l
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    @m80.k
    private final List<View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;

    @m80.k
    private final List<View> transitioningFragmentViews;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(20)
    public static final class Api20Impl {

        @m80.k
        public static final Api20Impl INSTANCE = new Api20Impl();

        private Api20Impl() {
        }

        @m80.k
        public final WindowInsets onApplyWindowInsets(@m80.k View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @m80.k View v11, @m80.k WindowInsets insets) {
            g0.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            g0.p(v11, "v");
            g0.p(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v11, insets);
            g0.o(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public FragmentContainerView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    private final void addDisappearingFragmentView(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@m80.k View child, int i11, @m80.l ViewGroup.LayoutParams layoutParams) {
        g0.p(child, "child");
        if (FragmentManager.getViewFragment(child) != null) {
            super.addView(child, i11, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(20)
    @m80.k
    public WindowInsets dispatchApplyWindowInsets(@m80.k WindowInsets insets) {
        WindowInsetsCompat onApplyWindowInsets;
        g0.p(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        g0.o(windowInsetsCompat, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            Api20Impl api20Impl = Api20Impl.INSTANCE;
            g0.m(onApplyWindowInsetsListener);
            onApplyWindowInsets = WindowInsetsCompat.toWindowInsetsCompat(api20Impl.onApplyWindowInsets(onApplyWindowInsetsListener, this, insets));
        } else {
            onApplyWindowInsets = ViewCompat.onApplyWindowInsets(this, windowInsetsCompat);
        }
        g0.o(onApplyWindowInsets, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!onApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i11), onApplyWindowInsets);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@m80.k Canvas canvas) {
        g0.p(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@m80.k Canvas canvas, @m80.k View child, long j11) {
        g0.p(canvas, "canvas");
        g0.p(child, "child");
        if (this.drawDisappearingViewsFirst && !this.disappearingFragmentChildren.isEmpty() && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j11);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@m80.k View view) {
        g0.p(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    @Override // android.view.View
    @RequiresApi(20)
    @m80.k
    public WindowInsets onApplyWindowInsets(@m80.k WindowInsets insets) {
        g0.p(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                g0.o(view, "view");
                addDisappearingFragmentView(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@m80.k View view) {
        g0.p(view, "view");
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i11) {
        View view = getChildAt(i11);
        g0.o(view, "view");
        addDisappearingFragmentView(view);
        super.removeViewAt(i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@m80.k View view) {
        g0.p(view, "view");
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View view = getChildAt(i14);
            g0.o(view, "view");
            addDisappearingFragmentView(view);
        }
        super.removeViews(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View view = getChildAt(i14);
            g0.o(view, "view");
            addDisappearingFragmentView(view);
        }
        super.removeViewsInLayout(i11, i12);
    }

    @w00.j(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z11) {
        this.drawDisappearingViewsFirst = z11;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@m80.l LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@m80.l View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.applyWindowInsetsListener = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@m80.k View view) {
        g0.p(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@m80.k Context context) {
        super(context);
        g0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public FragmentContainerView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String str;
        g0.p(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = R.styleable.FragmentContainerView;
            g0.o(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@m80.k Context context, @m80.k AttributeSet attrs, @m80.k FragmentManager fm2) {
        super(context, attrs);
        String str;
        g0.p(context, "context");
        g0.p(attrs, "attrs");
        g0.p(fm2, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = R.styleable.FragmentContainerView;
        g0.o(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment findFragmentById = fm2.findFragmentById(id2);
        if (classAttribute != null && findFragmentById == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment instantiate = fm2.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            g0.o(instantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            instantiate.mFragmentId = id2;
            instantiate.mContainerId = id2;
            instantiate.mTag = string;
            instantiate.mFragmentManager = fm2;
            instantiate.mHost = fm2.getHost();
            instantiate.onInflate(context, attrs, (Bundle) null);
            fm2.beginTransaction().setReorderingAllowed(true).add(this, instantiate, string).commitNowAllowingStateLoss();
        }
        fm2.onContainerAvailable(this);
    }
}
