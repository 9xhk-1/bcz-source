package com.tencent.liteav.beauty.a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.c.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a extends f {
    private static float[] C = {0.1826f, 0.6142f, 0.062f, -0.1006f, -0.3386f, 0.4392f, 0.4392f, -0.3989f, -0.0403f};
    private static float[] D = {0.256816f, 0.504154f, 0.0979137f, -0.148246f, -0.29102f, 0.439266f, 0.439271f, -0.367833f, -0.071438f};
    private static float[] E = {0.0625f, 0.5f, 0.5f};
    private String A;
    private int B;

    /* renamed from: r, reason: collision with root package name */
    private int f43473r;

    /* renamed from: s, reason: collision with root package name */
    private int f43474s;

    /* renamed from: t, reason: collision with root package name */
    private int f43475t;

    /* renamed from: u, reason: collision with root package name */
    private int f43476u;

    /* renamed from: v, reason: collision with root package name */
    private int f43477v;

    /* renamed from: w, reason: collision with root package name */
    private int f43478w;

    /* renamed from: x, reason: collision with root package name */
    private int f43479x;

    /* renamed from: y, reason: collision with root package name */
    private int f43480y;

    /* renamed from: z, reason: collision with root package name */
    private int f43481z;

    public a(int i11) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f43473r = -1;
        this.f43474s = -1;
        this.f43475t = -1;
        this.f43476u = -1;
        this.f43477v = -1;
        this.f43478w = -1;
        this.f43479x = -1;
        this.f43480y = -1;
        this.f43481z = -1;
        this.A = "RGBA2I420Filter";
        this.B = i11;
    }

    @Override // com.tencent.liteav.basic.c.f
    public boolean a() {
        int i11 = this.B;
        if (1 == i11) {
            this.f43194a = NativeLoad.nativeLoadGLProgram(8);
            TXCLog.i(this.A, "RGB-->I420 init!");
        } else if (3 == i11) {
            TXCLog.i(this.A, "RGB-->NV21 init!");
            this.f43194a = NativeLoad.nativeLoadGLProgram(11);
        } else {
            if (2 == i11) {
                TXCLog.i(this.A, "RGBA Format init!");
                return super.a();
            }
            TXCLog.i(this.A, "don't support format " + this.B + " use default I420");
            this.f43194a = NativeLoad.nativeLoadGLProgram(8);
        }
        if (this.f43194a == 0 || !b()) {
            this.f43200g = false;
        } else {
            this.f43200g = true;
        }
        c();
        return this.f43200g;
    }

    @Override // com.tencent.liteav.basic.c.f
    public boolean b() {
        super.b();
        this.f43473r = GLES20.glGetUniformLocation(this.f43194a, "width");
        this.f43474s = GLES20.glGetUniformLocation(this.f43194a, "height");
        return true;
    }

    @Override // com.tencent.liteav.basic.c.f
    public void c() {
        super.c();
    }

    @Override // com.tencent.liteav.basic.c.f
    public void a(int i11, int i12) {
        if (i11 > 0 && i12 > 0) {
            if (this.f43199f == i12 && this.f43198e == i11) {
                return;
            }
            super.a(i11, i12);
            TXCLog.i(this.A, "RGBA2I420Filter width " + i11 + " height " + i12);
            a(this.f43473r, (float) i11);
            a(this.f43474s, (float) i12);
            return;
        }
        TXCLog.e(this.A, "width or height is error!");
    }
}
