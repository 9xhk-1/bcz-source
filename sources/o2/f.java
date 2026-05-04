package o2;

import com.badlogic.gdx.math.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class f implements com.badlogic.gdx.graphics.f {

    /* renamed from: gi, reason: collision with root package name */
    public int f75579gi;

    /* renamed from: hi, reason: collision with root package name */
    public int f75580hi;

    /* renamed from: ii, reason: collision with root package name */
    public int f75581ii;

    /* renamed from: ji, reason: collision with root package name */
    public int f75582ji;

    /* renamed from: ki, reason: collision with root package name */
    public final i f75583ki = new i(0);

    /* renamed from: li, reason: collision with root package name */
    public g f75584li;

    public f(g gVar) {
        this.f75584li = gVar;
    }

    public static String t5(int i11) {
        switch (i11) {
            case 1280:
                return "GL_INVALID_ENUM";
            case com.badlogic.gdx.graphics.f.f11624m0 /* 1281 */:
                return "GL_INVALID_VALUE";
            case com.badlogic.gdx.graphics.f.f11630n0 /* 1282 */:
                return "GL_INVALID_OPERATION";
            case com.badlogic.gdx.graphics.i.f12418se /* 1283 */:
            case com.badlogic.gdx.graphics.i.f12422te /* 1284 */:
            default:
                return "number " + i11;
            case com.badlogic.gdx.graphics.f.f11636o0 /* 1285 */:
                return "GL_OUT_OF_MEMORY";
            case com.badlogic.gdx.graphics.f.S4 /* 1286 */:
                return "GL_INVALID_FRAMEBUFFER_OPERATION";
        }
    }

    public int n5() {
        return this.f75579gi;
    }

    public int o5() {
        return this.f75581ii;
    }

    public int p5() {
        return this.f75582ji;
    }

    public int q5() {
        return this.f75580hi;
    }

    public i r5() {
        return this.f75583ki;
    }

    public void s5() {
        this.f75579gi = 0;
        this.f75580hi = 0;
        this.f75581ii = 0;
        this.f75582ji = 0;
        this.f75583ki.reset();
    }
}
