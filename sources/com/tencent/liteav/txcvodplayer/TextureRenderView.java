package com.tencent.liteav.txcvodplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.ISurfaceTextureHolder;
import com.tencent.ijk.media.player.ISurfaceTextureHost;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.txcvodplayer.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TargetApi(14)
/* loaded from: classes6.dex */
public class TextureRenderView extends TextureView implements com.tencent.liteav.txcvodplayer.a {
    private static final String TAG = "TextureRenderView";
    private c mMeasureHelper;
    private b mSurfaceCallback;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* renamed from: a, reason: collision with root package name */
        private SurfaceTexture f44190a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f44191b;

        /* renamed from: c, reason: collision with root package name */
        private int f44192c;

        /* renamed from: d, reason: collision with root package name */
        private int f44193d;

        /* renamed from: h, reason: collision with root package name */
        private WeakReference<TextureRenderView> f44197h;

        /* renamed from: e, reason: collision with root package name */
        private boolean f44194e = true;

        /* renamed from: f, reason: collision with root package name */
        private boolean f44195f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f44196g = false;

        /* renamed from: i, reason: collision with root package name */
        private Map<a.InterfaceC0518a, Object> f44198i = new ConcurrentHashMap();

        public b(@NonNull TextureRenderView textureRenderView) {
            this.f44197h = new WeakReference<>(textureRenderView);
        }

        public void b(@NonNull a.InterfaceC0518a interfaceC0518a) {
            this.f44198i.remove(interfaceC0518a);
        }

        public void c() {
            TXCLog.i(TextureRenderView.TAG, "onAttachFromWindow()");
            this.f44195f = false;
            this.f44196g = false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f44190a = surfaceTexture;
            this.f44191b = false;
            this.f44192c = 0;
            this.f44193d = 0;
            a aVar = new a(this.f44197h.get(), surfaceTexture, this);
            Iterator<a.InterfaceC0518a> it = this.f44198i.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f44190a = surfaceTexture;
            this.f44191b = false;
            this.f44192c = 0;
            this.f44193d = 0;
            a aVar = new a(this.f44197h.get(), surfaceTexture, this);
            Iterator<a.InterfaceC0518a> it = this.f44198i.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
            TXCLog.i(TextureRenderView.TAG, "onSurfaceTextureDestroyed: destroy: " + this.f44194e);
            return this.f44194e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            this.f44190a = surfaceTexture;
            this.f44191b = true;
            this.f44192c = i11;
            this.f44193d = i12;
            a aVar = new a(this.f44197h.get(), surfaceTexture, this);
            Iterator<a.InterfaceC0518a> it = this.f44198i.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(aVar, 0, i11, i12);
            }
        }

        @Override // com.tencent.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: null");
                return;
            }
            if (this.f44196g) {
                if (surfaceTexture != this.f44190a) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f44194e) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView");
                    return;
                } else {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture");
                    surfaceTexture.release();
                    return;
                }
            }
            if (this.f44195f) {
                if (surfaceTexture != this.f44190a) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture");
                    surfaceTexture.release();
                    return;
                } else if (this.f44194e) {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView");
                    return;
                } else {
                    TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView");
                    a(true);
                    return;
                }
            }
            if (surfaceTexture != this.f44190a) {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: release different SurfaceTexture");
                surfaceTexture.release();
            } else if (this.f44194e) {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: will released by TextureView");
            } else {
                TXCLog.i(TextureRenderView.TAG, "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView");
                a(true);
            }
        }

        public void a(boolean z11) {
            this.f44194e = z11;
        }

        public void b() {
            TXCLog.i(TextureRenderView.TAG, "didDetachFromWindow()");
            this.f44196g = true;
        }

        public void a(SurfaceTexture surfaceTexture) {
            this.f44190a = surfaceTexture;
        }

        public void a(@NonNull a.InterfaceC0518a interfaceC0518a) {
            a aVar;
            this.f44198i.put(interfaceC0518a, interfaceC0518a);
            if (this.f44190a != null) {
                aVar = new a(this.f44197h.get(), this.f44190a, this);
                interfaceC0518a.a(aVar, this.f44192c, this.f44193d);
            } else {
                aVar = null;
            }
            if (this.f44191b) {
                if (aVar == null) {
                    aVar = new a(this.f44197h.get(), this.f44190a, this);
                }
                interfaceC0518a.a(aVar, 0, this.f44192c, this.f44193d);
            }
        }

        public void a() {
            TXCLog.i(TextureRenderView.TAG, "willDetachFromWindow()");
            this.f44195f = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TextureRenderView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        this.mMeasureHelper = new c(this);
        b bVar = new b(this);
        this.mSurfaceCallback = bVar;
        setSurfaceTextureListener(bVar);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void addRenderCallback(a.InterfaceC0518a interfaceC0518a) {
        this.mSurfaceCallback.a(interfaceC0518a);
    }

    public a.b getSurfaceHolder() {
        return new a(this, this.mSurfaceCallback.f44190a, this.mSurfaceCallback);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mSurfaceCallback.c();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            this.mSurfaceCallback.a();
            super.onDetachedFromWindow();
            this.mSurfaceCallback.b();
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        this.mMeasureHelper.c(i11, i12);
        setMeasuredDimension(this.mMeasureHelper.a(), this.mMeasureHelper.b());
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void removeRenderCallback(a.InterfaceC0518a interfaceC0518a) {
        this.mSurfaceCallback.b(interfaceC0518a);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setAspectRatio(int i11) {
        this.mMeasureHelper.b(i11);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoRotation(int i11) {
        this.mMeasureHelper.a(i11);
        setRotation(i11);
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSampleAspectRatio(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.mMeasureHelper.b(i11, i12);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public void setVideoSize(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.mMeasureHelper.a(i11, i12);
        requestLayout();
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public boolean shouldWaitForResize() {
        return false;
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        initView(context);
    }

    @TargetApi(21)
    public TextureRenderView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        initView(context);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        private TextureRenderView f44186a;

        /* renamed from: b, reason: collision with root package name */
        private SurfaceTexture f44187b;

        /* renamed from: c, reason: collision with root package name */
        private ISurfaceTextureHost f44188c;

        /* renamed from: d, reason: collision with root package name */
        private Surface f44189d;

        public a(@NonNull TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture, @NonNull ISurfaceTextureHost iSurfaceTextureHost) {
            this.f44186a = textureRenderView;
            this.f44187b = surfaceTexture;
            this.f44188c = iSurfaceTextureHost;
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        @TargetApi(16)
        public void a(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer == null) {
                return;
            }
            if (!(iMediaPlayer instanceof ISurfaceTextureHolder)) {
                Surface b11 = b();
                this.f44189d = b11;
                iMediaPlayer.setSurface(b11);
                return;
            }
            ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
            this.f44186a.mSurfaceCallback.a(false);
            if (this.f44186a.getSurfaceTexture() != null) {
                this.f44187b = this.f44186a.getSurfaceTexture();
            }
            try {
                SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
                if (surfaceTexture != null) {
                    iSurfaceTextureHolder.setSurfaceTextureHost(this.f44186a.mSurfaceCallback);
                    this.f44186a.setSurfaceTexture(surfaceTexture);
                    this.f44186a.mSurfaceCallback.a(surfaceTexture);
                } else {
                    Surface surface = this.f44189d;
                    if (surface != null) {
                        iMediaPlayer.setSurface(surface);
                    }
                    iSurfaceTextureHolder.setSurfaceTexture(this.f44187b);
                    iSurfaceTextureHolder.setSurfaceTextureHost(this.f44186a.mSurfaceCallback);
                }
                this.f44189d = iMediaPlayer.getSurface();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Nullable
        public Surface b() {
            if (this.f44187b == null) {
                return null;
            }
            if (this.f44189d == null) {
                this.f44189d = new Surface(this.f44187b);
            }
            return this.f44189d;
        }

        @Override // com.tencent.liteav.txcvodplayer.a.b
        @NonNull
        public com.tencent.liteav.txcvodplayer.a a() {
            return this.f44186a;
        }
    }

    @Override // com.tencent.liteav.txcvodplayer.a
    public View getView() {
        return this;
    }
}
