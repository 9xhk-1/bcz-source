package com.malmstein.fenster.videorender.gles;

import com.malmstein.fenster.videorender.gles.Drawable2d;
import qs.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable2d f39264a = new Drawable2d(Drawable2d.Prefab.FULL_RECTANGLE);

    /* renamed from: b, reason: collision with root package name */
    public Texture2dProgram f39265b;

    public a(Texture2dProgram program) {
        this.f39265b = program;
    }

    public void a(Texture2dProgram program) {
        this.f39265b.d();
        this.f39265b = program;
    }

    public int b() {
        return this.f39265b.a();
    }

    public void c(int textureId, float[] texMatrix) {
        this.f39265b.b(d.f82694b, this.f39264a.d(), 0, this.f39264a.e(), this.f39264a.a(), this.f39264a.f(), texMatrix, this.f39264a.b(), textureId, this.f39264a.c());
    }

    public Texture2dProgram d() {
        return this.f39265b;
    }

    public void e(boolean doEglCleanup) {
        Texture2dProgram texture2dProgram = this.f39265b;
        if (texture2dProgram != null) {
            if (doEglCleanup) {
                texture2dProgram.d();
            }
            this.f39265b = null;
        }
    }
}
