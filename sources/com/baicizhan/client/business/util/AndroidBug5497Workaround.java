package com.baicizhan.client.business.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AndroidBug5497Workaround {
    private ViewGroup.LayoutParams frameLayoutParams;
    private View mChildOfContent;
    private int usableHeightPrevious;

    private AndroidBug5497Workaround(View content) {
        if (content != null) {
            this.mChildOfContent = content;
            content.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.baicizhan.client.business.util.AndroidBug5497Workaround.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    AndroidBug5497Workaround.this.possiblyResizeChildOfContent();
                }
            });
            this.frameLayoutParams = this.mChildOfContent.getLayoutParams();
        }
    }

    public static void assistActivity(View content) {
        new AndroidBug5497Workaround(content);
    }

    private int computeUsableHeight() {
        Rect rect = new Rect();
        this.mChildOfContent.getWindowVisibleDisplayFrame(rect);
        return rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void possiblyResizeChildOfContent() {
        int computeUsableHeight = computeUsableHeight();
        if (computeUsableHeight != this.usableHeightPrevious) {
            this.frameLayoutParams.height = computeUsableHeight;
            this.mChildOfContent.requestLayout();
            this.usableHeightPrevious = computeUsableHeight;
        }
    }
}
