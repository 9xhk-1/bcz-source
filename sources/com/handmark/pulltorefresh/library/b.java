package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.view.View;
import com.handmark.pulltorefresh.library.PullToRefreshBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(9)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35153a = "OverscrollHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final float f35154b = 1.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35155a;

        static {
            int[] iArr = new int[PullToRefreshBase.Orientation.values().length];
            f35155a = iArr;
            try {
                iArr[PullToRefreshBase.Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35155a[PullToRefreshBase.Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static boolean a(View view) {
        return view.getOverScrollMode() != 2;
    }

    public static void b(final PullToRefreshBase<?> view, final int deltaX, final int scrollX, final int deltaY, final int scrollY, final int scrollRange, final int fuzzyThreshold, final float scaleFactor, final boolean isTouchEvent) {
        int scrollX2;
        if (a.f35155a[view.getPullToRefreshScrollDirection().ordinal()] != 1) {
            scrollX2 = view.getScrollY();
            deltaX = deltaY;
            scrollX = scrollY;
        } else {
            scrollX2 = view.getScrollX();
        }
        if (!view.h() || view.a()) {
            return;
        }
        PullToRefreshBase.Mode mode = view.getMode();
        if (!mode.permitsPullToRefresh() || isTouchEvent || deltaX == 0) {
            if (isTouchEvent && PullToRefreshBase.State.OVERSCROLLING == view.getState()) {
                view.L(PullToRefreshBase.State.RESET, new boolean[0]);
                return;
            }
            return;
        }
        int i11 = deltaX + scrollX;
        if (i11 < 0 - fuzzyThreshold) {
            if (mode.showHeaderLoadingLayout()) {
                if (scrollX2 == 0) {
                    view.L(PullToRefreshBase.State.OVERSCROLLING, new boolean[0]);
                }
                view.setHeaderScroll((int) (scaleFactor * (scrollX2 + i11)));
                return;
            }
            return;
        }
        if (i11 <= scrollRange + fuzzyThreshold) {
            if (Math.abs(i11) <= fuzzyThreshold || Math.abs(i11 - scrollRange) <= fuzzyThreshold) {
                view.L(PullToRefreshBase.State.RESET, new boolean[0]);
                return;
            }
            return;
        }
        if (mode.showFooterLoadingLayout()) {
            if (scrollX2 == 0) {
                view.L(PullToRefreshBase.State.OVERSCROLLING, new boolean[0]);
            }
            view.setHeaderScroll((int) (scaleFactor * ((scrollX2 + i11) - scrollRange)));
        }
    }

    public static void c(final PullToRefreshBase<?> view, final int deltaX, final int scrollX, final int deltaY, final int scrollY, final int scrollRange, final boolean isTouchEvent) {
        b(view, deltaX, scrollX, deltaY, scrollY, scrollRange, 0, 1.0f, isTouchEvent);
    }

    public static void d(final PullToRefreshBase<?> view, final int deltaX, final int scrollX, final int deltaY, final int scrollY, final boolean isTouchEvent) {
        c(view, deltaX, scrollX, deltaY, scrollY, 0, isTouchEvent);
    }
}
