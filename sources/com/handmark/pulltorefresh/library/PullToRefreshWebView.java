package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PullToRefreshWebView extends PullToRefreshBase<WebView> {
    public static final PullToRefreshBase.j<WebView> S = new a();
    public final WebChromeClient R;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PullToRefreshBase.j<WebView> {
        @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.j
        public void a(PullToRefreshBase<WebView> refreshView) {
            refreshView.getRefreshableView().reload();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int newProgress) {
            if (newProgress == 100) {
                PullToRefreshWebView.this.g();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(9)
    public final class c extends WebView {

        /* renamed from: b, reason: collision with root package name */
        public static final int f35148b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final float f35149c = 1.5f;

        public c(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public final int a() {
            return (int) Math.max(0.0d, Math.floor(((WebView) PullToRefreshWebView.this.f35097k).getContentHeight() * ((WebView) PullToRefreshWebView.this.f35097k).getScale()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }

        @Override // android.view.View
        public boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
            boolean overScrollBy = super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
            com.handmark.pulltorefresh.library.b.b(PullToRefreshWebView.this, deltaX, scrollX, deltaY, scrollY, a(), 2, 1.5f, isTouchEvent);
            return overScrollBy;
        }
    }

    public PullToRefreshWebView(Context context) {
        super(context);
        b bVar = new b();
        this.R = bVar;
        setOnRefreshListener(S);
        ((WebView) this.f35097k).setWebChromeClient(bVar);
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public WebView q(Context context, AttributeSet attrs) {
        c cVar = new c(context, attrs);
        cVar.setId(R.id.webview);
        return cVar;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public final PullToRefreshBase.Orientation getPullToRefreshScrollDirection() {
        return PullToRefreshBase.Orientation.VERTICAL;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public boolean w() {
        return ((float) ((WebView) this.f35097k).getScrollY()) >= ((float) Math.floor((double) (((float) ((WebView) this.f35097k).getContentHeight()) * ((WebView) this.f35097k).getScale()))) - ((float) ((WebView) this.f35097k).getHeight());
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public boolean x() {
        return ((WebView) this.f35097k).getScrollY() == 0;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void y(Bundle savedInstanceState) {
        super.y(savedInstanceState);
        ((WebView) this.f35097k).restoreState(savedInstanceState);
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase
    public void z(Bundle saveState) {
        super.z(saveState);
        ((WebView) this.f35097k).saveState(saveState);
    }

    public PullToRefreshWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        b bVar = new b();
        this.R = bVar;
        setOnRefreshListener(S);
        ((WebView) this.f35097k).setWebChromeClient(bVar);
    }

    public PullToRefreshWebView(Context context, PullToRefreshBase.Mode mode) {
        super(context, mode);
        b bVar = new b();
        this.R = bVar;
        setOnRefreshListener(S);
        ((WebView) this.f35097k).setWebChromeClient(bVar);
    }

    public PullToRefreshWebView(Context context, PullToRefreshBase.Mode mode, PullToRefreshBase.AnimationStyle style) {
        super(context, mode, style);
        b bVar = new b();
        this.R = bVar;
        setOnRefreshListener(S);
        ((WebView) this.f35097k).setWebChromeClient(bVar);
    }
}
