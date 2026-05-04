package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.ISurfaceTextureHolder;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.txcvodplayer.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SurfaceRenderView extends SurfaceView implements com.tencent.liteav.txcvodplayer.a {

    /* renamed from: a, reason: collision with root package name */
    private c f44123a;

    /* renamed from: b, reason: collision with root package name */
    private b f44124b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        private SurfaceHolder f44127a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f44128b;

        /* renamed from: c, reason: collision with root package name */
        private int f44129c;

        /* renamed from: d, reason: collision with root package name */
        private int f44130d;

        /* renamed from: e, reason: collision with root package name */
        private int f44131e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<SurfaceRenderView> f44132f;

        /* renamed from: g, reason: collision with root package name */
        private Map<a.InterfaceC0518a, Object> f44133g = new ConcurrentHashMap();

        public b(@NonNull SurfaceRenderView surfaceRenderView) {
            this.f44132f = new WeakReference<>(surfaceRenderView);
        }

        public void a(@NonNull a.InterfaceC0518a interfaceC0518a) {
            a aVar;
            this.f44133g.put(interfaceC0518a, interfaceC0518a);
            if (this.f44127a != null) {
                aVar = new a(this.f44132f.get(), this.f44127a);
                interfaceC0518a.a(aVar, this.f44130d, this.f44131e);
            } else {
                aVar = null;
            }
            if (this.f44128b) {
                if (aVar == null) {
                    aVar = new a(this.f44132f.get(), this.f44127a);
                }
                interfaceC0518a.a(aVar, this.f44129c, this.f44130d, this.f44131e);
            }
        }

        public void b(@NonNull a.InterfaceC0518a interfaceC0518a) {
            this.f44133g.remove(interfaceC0518a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            this.f44127a = surfaceHolder;
            this.f44128b = true;
            this.f44129c = i11;
            this.f44130d = i12;
            this.f44131e = i13;
            a aVar = new a(this.f44132f.get(), this.f44127a);
            Iterator<a.InterfaceC0518a> it = this.f44133g.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, i11, i12, i13);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f44127a = surfaceHolder;
            this.f44128b = false;
            this.f44129c = 0;
            this.f44130d = 0;
            this.f44131e = 0;
            a aVar = new a(this.f44132f.get(), this.f44127a);
            Iterator<a.InterfaceC0518a> it = this.f44133g.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f44127a = null;
            this.f44128b = false;
            this.f44129c = 0;
            this.f44130d = 0;
            this.f44131e = 0;
            a aVar = new a(this.f44132f.get(), this.f44127a);
            Iterator<a.InterfaceC0518a> it = this.f44133g.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    public SurfaceRenderView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.f44123a = new c(this);
        this.f44124b = new b(this);
        getHolder().addCallback(this.f44124b);
        getHolder().setType(0);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void addRenderCallback(a.InterfaceC0518a interfaceC0518a) {
        this.f44124b.a(interfaceC0518a);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i11, int i12) {
        this.f44123a.c(i11, i12);
        setMeasuredDimension(this.f44123a.a(), this.f44123a.b());
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void removeRenderCallback(a.InterfaceC0518a interfaceC0518a) {
        this.f44124b.b(interfaceC0518a);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setAspectRatio(int i11) {
        this.f44123a.b(i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoRotation(int i11) {
        TXCLog.e("", "SurfaceView doesn't support rotation (" + i11 + ")!\n");
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSampleAspectRatio(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f44123a.b(i11, i12);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSize(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f44123a.a(i11, i12);
        getHolder().setFixedSize(i11, i12);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public boolean shouldWaitForResize() {
        return true;
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        private SurfaceRenderView f44125a;

        /* renamed from: b, reason: collision with root package name */
        private SurfaceHolder f44126b;

        public a(@NonNull SurfaceRenderView surfaceRenderView, @Nullable SurfaceHolder surfaceHolder) {
            this.f44125a = surfaceRenderView;
            this.f44126b = surfaceHolder;
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        public void a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (iMediaPlayer instanceof ISurfaceTextureHolder) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.f44126b);
            }
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        @NonNull
        public com.tencent.liteav.txcvodplayer.a a() {
            return this.f44125a;
        }
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public View getView() {
        return this;
    }
}
