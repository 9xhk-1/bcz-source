package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.liteav.i;
import com.tencent.liteav.renderer.TXCFocusIndicatorView;
import com.tencent.liteav.renderer.TXCGLSurfaceView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCloudVideoView extends FrameLayout implements View.OnTouchListener {
    private static final int FOCUS_AREA_SIZE_DP = 70;
    private static final String TAG = "TXCloudVideoView";
    private float mBottom;
    private i mCapture;
    private int mCaptureHeight;
    private int mCaptureWidth;
    private int mCurrentScale;
    protected TXDashBoard mDashBoard;
    private boolean mFocus;
    private int mFocusAreaSize;
    protected TXCFocusIndicatorView mFocusIndicatorView;
    protected Object mGLContext;
    protected TXCGLSurfaceView mGLSurfaceView;
    private float mLeft;
    private float mRight;
    private ScaleGestureDetector mScaleGestureDetector;
    private ScaleGestureDetector.OnScaleGestureListener mScaleGestureListener;
    protected SurfaceView mSurfaceView;
    private float mTop;
    private a mTouchFocusRunnable;
    private String mUserId;
    protected TextureView mVideoView;
    private boolean mZoom;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private View f44695b;

        /* renamed from: c, reason: collision with root package name */
        private MotionEvent f44696c;

        private a() {
        }

        public void a(View view) {
            this.f44695b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TXCloudVideoView.this.mCapture != null && TXCloudVideoView.this.mFocus) {
                TXCloudVideoView.this.mCapture.a(this.f44696c.getX() / this.f44695b.getWidth(), this.f44696c.getY() / this.f44695b.getHeight());
            }
            if (TXCloudVideoView.this.mFocus) {
                TXCloudVideoView.this.onTouchFocus((int) this.f44696c.getX(), (int) this.f44696c.getY());
            }
        }

        public void a(MotionEvent motionEvent) {
            this.f44696c = motionEvent;
        }
    }

    public TXCloudVideoView(Context context) {
        this(context, null);
    }

    private int clamp(int i11, int i12, int i13) {
        return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
    }

    private Rect getTouchRect(int i11, int i12, int i13, int i14, float f11) {
        TXCGLSurfaceView tXCGLSurfaceView;
        if (this.mFocusAreaSize == 0 && (tXCGLSurfaceView = this.mGLSurfaceView) != null) {
            this.mFocusAreaSize = (int) ((tXCGLSurfaceView.getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        }
        int intValue = Float.valueOf(this.mFocusAreaSize * f11).intValue();
        int i15 = intValue / 2;
        int clamp = clamp(i11 - i15, 0, i13 - intValue);
        int clamp2 = clamp(i12 - i15, 0, i14 - intValue);
        return new Rect(clamp, clamp2, clamp + intValue, intValue + clamp2);
    }

    public static int px2dip(Context context, float f11) {
        return (int) ((f11 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void updateDbMargin() {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a((int) this.mLeft, (int) this.mTop, (int) this.mRight, (int) this.mBottom);
        }
    }

    public void addVideoView(TXCGLSurfaceView tXCGLSurfaceView) {
        TXCGLSurfaceView tXCGLSurfaceView2 = this.mGLSurfaceView;
        if (tXCGLSurfaceView2 != null) {
            removeView(tXCGLSurfaceView2);
        }
        this.mGLSurfaceView = tXCGLSurfaceView;
        addView(tXCGLSurfaceView);
        resetLogView();
    }

    public void appendEventInfo(String str) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a(str);
        }
    }

    public void clearLastFrame(boolean z11) {
        if (z11) {
            setVisibility(8);
        }
    }

    public void clearLog() {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a();
        }
    }

    public void disableLog(boolean z11) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a(z11);
        }
    }

    public TXCGLSurfaceView getGLSurfaceView() {
        return this.mGLSurfaceView;
    }

    public TextureView getHWVideoView() {
        return this.mVideoView;
    }

    public Object getOpenGLContext() {
        return this.mGLContext;
    }

    public SurfaceView getSurfaceView() {
        return this.mSurfaceView;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public TextureView getVideoView() {
        return this.mVideoView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        super.onLayout(z11, i11, i12, i13, i14);
        updateDbMargin();
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.setStatusTextSize((float) (px2dip(getContext(), getWidth()) / 30.0d));
            this.mDashBoard.setEventTextSize((float) (px2dip(getContext(), getWidth()) / 25.0d));
        }
        int i16 = this.mCaptureWidth;
        if (i16 == 0 || (i15 = this.mCaptureHeight) == 0) {
            return;
        }
        updateVideoViewSize(i16, i15);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            this.mTouchFocusRunnable.a(view);
            this.mTouchFocusRunnable.a(motionEvent);
            postDelayed(this.mTouchFocusRunnable, 100L);
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2) {
            removeCallbacks(this.mTouchFocusRunnable);
            onTouchFocus(-1, -1);
            ScaleGestureDetector scaleGestureDetector = this.mScaleGestureDetector;
            if (scaleGestureDetector != null && this.mZoom) {
                scaleGestureDetector.onTouchEvent(motionEvent);
            }
        }
        if (this.mZoom && motionEvent.getAction() == 0) {
            performClick();
        }
        return this.mZoom;
    }

    public void onTouchFocus(int i11, int i12) {
        if (this.mGLSurfaceView == null) {
            return;
        }
        if (i11 < 0 || i12 < 0) {
            TXCFocusIndicatorView tXCFocusIndicatorView = this.mFocusIndicatorView;
            if (tXCFocusIndicatorView != null) {
                tXCFocusIndicatorView.setVisibility(8);
                return;
            }
            return;
        }
        TXCFocusIndicatorView tXCFocusIndicatorView2 = this.mFocusIndicatorView;
        if (tXCFocusIndicatorView2 == null) {
            TXCFocusIndicatorView tXCFocusIndicatorView3 = new TXCFocusIndicatorView(getContext());
            this.mFocusIndicatorView = tXCFocusIndicatorView3;
            tXCFocusIndicatorView3.setVisibility(0);
            addView(this.mFocusIndicatorView);
        } else if (indexOfChild(tXCFocusIndicatorView2) != getChildCount() - 1) {
            removeView(this.mFocusIndicatorView);
            addView(this.mFocusIndicatorView);
        }
        Rect touchRect = getTouchRect(i11, i12, this.mGLSurfaceView.getWidth(), this.mGLSurfaceView.getHeight(), 1.0f);
        TXCFocusIndicatorView tXCFocusIndicatorView4 = this.mFocusIndicatorView;
        int i13 = touchRect.left;
        tXCFocusIndicatorView4.show(i13, touchRect.top, touchRect.right - i13);
    }

    public void removeFocusIndicatorView() {
        TXCFocusIndicatorView tXCFocusIndicatorView = this.mFocusIndicatorView;
        if (tXCFocusIndicatorView != null) {
            removeView(tXCFocusIndicatorView);
            this.mFocusIndicatorView = null;
        }
    }

    public void removeVideoView() {
        TextureView textureView = this.mVideoView;
        if (textureView != null) {
            removeView(textureView);
            this.mVideoView = null;
        }
        TXCGLSurfaceView tXCGLSurfaceView = this.mGLSurfaceView;
        if (tXCGLSurfaceView != null) {
            removeView(tXCGLSurfaceView);
            this.mGLSurfaceView = null;
        }
        this.mSurfaceView = null;
    }

    public void resetLogView() {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            removeView(tXDashBoard);
            addView(this.mDashBoard);
        }
    }

    public void setDashBoardStatusInfo(CharSequence charSequence) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a(charSequence);
        }
    }

    public void setLogMargin(float f11, float f12, float f13, float f14) {
        this.mLeft = f11;
        this.mRight = f12;
        this.mTop = f13;
        this.mBottom = f14;
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a((int) f11, (int) f13, (int) f12, (int) f14);
        }
    }

    public void setLogMarginRatio(final float f11, final float f12, final float f13, final float f14) {
        getWidth();
        getHeight();
        postDelayed(new Runnable() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView.this.mLeft = r0.getWidth() * f11;
                TXCloudVideoView.this.mRight = r0.getWidth() * f12;
                TXCloudVideoView.this.mTop = r0.getHeight() * f13;
                TXCloudVideoView.this.mBottom = r0.getHeight() * f14;
                TXCloudVideoView tXCloudVideoView = TXCloudVideoView.this;
                TXDashBoard tXDashBoard = tXCloudVideoView.mDashBoard;
                if (tXDashBoard != null) {
                    tXDashBoard.a((int) tXCloudVideoView.mLeft, (int) TXCloudVideoView.this.mTop, (int) TXCloudVideoView.this.mRight, (int) TXCloudVideoView.this.mBottom);
                }
            }
        }, 100L);
    }

    public void setLogText(Bundle bundle, Bundle bundle2, int i11) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.a(bundle, bundle2, i11);
        }
    }

    public void setOpenGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void showLog(boolean z11) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.setShowLevel(z11 ? 2 : 0);
        }
    }

    public void showVideoDebugLog(int i11) {
        TXDashBoard tXDashBoard = this.mDashBoard;
        if (tXDashBoard != null) {
            tXDashBoard.setShowLevel(i11);
        }
    }

    public void start(boolean z11, boolean z12, i iVar) {
        this.mFocus = z11;
        this.mZoom = z12;
        if (z11 || z12) {
            setOnTouchListener(this);
            this.mCapture = iVar;
        }
        TXCGLSurfaceView tXCGLSurfaceView = this.mGLSurfaceView;
        if (tXCGLSurfaceView != null) {
            tXCGLSurfaceView.setVisibility(0);
        }
    }

    public void stop(boolean z11) {
        TXCGLSurfaceView tXCGLSurfaceView;
        if (this.mFocus || this.mZoom) {
            setOnTouchListener(null);
        }
        this.mCapture = null;
        if (!z11 || (tXCGLSurfaceView = this.mGLSurfaceView) == null) {
            return;
        }
        tXCGLSurfaceView.setVisibility(8);
    }

    public void updateVideoViewSize(int i11, int i12) {
        int i13;
        FrameLayout.LayoutParams layoutParams;
        View view = this.mGLSurfaceView;
        if (view == null && (view = this.mVideoView) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (i12 == 0 || height == 0) {
            return;
        }
        this.mCaptureWidth = i11;
        this.mCaptureHeight = i12;
        float f11 = (i11 * 1.0f) / i12;
        float f12 = width;
        float f13 = height;
        int i14 = 0;
        if (f11 > (1.0f * f12) / f13) {
            height = (int) (f12 / f11);
            i13 = (getHeight() - height) / 2;
        } else {
            width = (int) (f13 * f11);
            i14 = (getWidth() - width) / 2;
            i13 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            if (layoutParams.width == width && layoutParams.height == height) {
                return;
            }
            layoutParams.width = width;
            layoutParams.height = height;
        } else {
            layoutParams = new FrameLayout.LayoutParams(width, height);
        }
        layoutParams.leftMargin = i14;
        layoutParams.topMargin = i13;
        view.setLayoutParams(layoutParams);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCaptureWidth = 0;
        this.mCaptureHeight = 0;
        this.mLeft = 0.0f;
        this.mRight = 0.0f;
        this.mTop = 0.0f;
        this.mBottom = 0.0f;
        this.mFocusAreaSize = 0;
        this.mUserId = "";
        this.mFocus = false;
        this.mZoom = false;
        this.mCurrentScale = 1;
        this.mScaleGestureDetector = null;
        this.mScaleGestureListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.2
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
            
                if (r6 >= 0.9f) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
            
                if (r6 <= 1.1f) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
            
                r6 = r3;
             */
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean onScale(android.view.ScaleGestureDetector r6) {
                /*
                    r5 = this;
                    com.tencent.rtmp.ui.TXCloudVideoView r0 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    com.tencent.liteav.i r0 = com.tencent.rtmp.ui.TXCloudVideoView.access$400(r0)
                    r1 = 0
                    if (r0 == 0) goto L14
                    com.tencent.rtmp.ui.TXCloudVideoView r0 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    com.tencent.liteav.i r0 = com.tencent.rtmp.ui.TXCloudVideoView.access$400(r0)
                    int r0 = r0.a()
                    goto L15
                L14:
                    r0 = r1
                L15:
                    if (r0 <= 0) goto Lbd
                    float r6 = r6.getScaleFactor()
                    r2 = 1065353216(0x3f800000, float:1.0)
                    int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    r4 = 1045220557(0x3e4ccccd, float:0.2)
                    if (r3 <= 0) goto L3b
                    float r6 = (float) r0
                    float r4 = r4 / r6
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r6 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r6)
                    int r6 = r0 - r6
                    float r6 = (float) r6
                    float r4 = r4 * r6
                    float r6 = r4 + r2
                    r3 = 1066192077(0x3f8ccccd, float:1.1)
                    int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r4 > 0) goto L53
                L39:
                    r6 = r3
                    goto L53
                L3b:
                    int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r3 >= 0) goto L53
                    float r6 = (float) r0
                    float r4 = r4 / r6
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r6 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r6)
                    float r6 = (float) r6
                    float r4 = r4 * r6
                    float r6 = r2 - r4
                    r3 = 1063675494(0x3f666666, float:0.9)
                    int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                    if (r4 < 0) goto L53
                    goto L39
                L53:
                    com.tencent.rtmp.ui.TXCloudVideoView r3 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r3 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r3)
                    float r3 = (float) r3
                    float r3 = r3 * r6
                    int r3 = java.lang.Math.round(r3)
                    com.tencent.rtmp.ui.TXCloudVideoView r4 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r4 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r4)
                    if (r3 != r4) goto L74
                    int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r4 <= 0) goto L6e
                    int r3 = r3 + 1
                    goto L74
                L6e:
                    int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r4 >= 0) goto L74
                    int r3 = r3 + (-1)
                L74:
                    if (r3 < r0) goto L77
                    goto L78
                L77:
                    r0 = r3
                L78:
                    r3 = 1
                    if (r0 > r3) goto L7c
                    r0 = r3
                L7c:
                    int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r3 <= 0) goto L8f
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r6 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r6)
                    if (r0 >= r6) goto La1
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r0 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r6)
                    goto La1
                L8f:
                    int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                    if (r6 >= 0) goto La1
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r6 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r6)
                    if (r0 <= r6) goto La1
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r0 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r6)
                La1:
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    com.tencent.rtmp.ui.TXCloudVideoView.access$502(r6, r0)
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    com.tencent.liteav.i r6 = com.tencent.rtmp.ui.TXCloudVideoView.access$400(r6)
                    if (r6 == 0) goto Lbd
                    com.tencent.rtmp.ui.TXCloudVideoView r6 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    com.tencent.liteav.i r6 = com.tencent.rtmp.ui.TXCloudVideoView.access$400(r6)
                    com.tencent.rtmp.ui.TXCloudVideoView r0 = com.tencent.rtmp.ui.TXCloudVideoView.this
                    int r0 = com.tencent.rtmp.ui.TXCloudVideoView.access$500(r0)
                    r6.a(r0)
                Lbd:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.rtmp.ui.TXCloudVideoView.AnonymousClass2.onScale(android.view.ScaleGestureDetector):boolean");
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }
        };
        this.mTouchFocusRunnable = new a();
        this.mDashBoard = new TXDashBoard(context);
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this.mScaleGestureListener);
    }

    public void addVideoView(TextureView textureView) {
        TextureView textureView2 = this.mVideoView;
        if (textureView2 != null) {
            removeView(textureView2);
        }
        this.mVideoView = textureView;
        addView(textureView);
        resetLogView();
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), null);
        this.mSurfaceView = surfaceView;
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void setMirror(boolean z11) {
    }

    public void setRenderMode(int i11) {
    }

    public void setRenderRotation(int i11) {
    }
}
