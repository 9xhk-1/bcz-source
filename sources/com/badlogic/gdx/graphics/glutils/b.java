package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.glutils.GLVersion;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.FloatBuffer;
import q1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements TextureData {

    /* renamed from: a, reason: collision with root package name */
    public int f12236a;

    /* renamed from: b, reason: collision with root package name */
    public int f12237b;

    /* renamed from: c, reason: collision with root package name */
    public int f12238c;

    /* renamed from: d, reason: collision with root package name */
    public int f12239d;

    /* renamed from: e, reason: collision with root package name */
    public int f12240e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12242g = false;

    /* renamed from: h, reason: collision with root package name */
    public FloatBuffer f12243h;

    public b(int i11, int i12, int i13, int i14, int i15, boolean z11) {
        this.f12236a = i11;
        this.f12237b = i12;
        this.f12238c = i13;
        this.f12239d = i14;
        this.f12240e = i15;
        this.f12241f = z11;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return this.f12242g;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        if (g.f81378a.getType() == Application.ApplicationType.Android || g.f81378a.getType() == Application.ApplicationType.iOS || (g.f81378a.getType() == Application.ApplicationType.WebGL && !g.f81379b.m())) {
            if (!g.f81379b.d("OES_texture_float")) {
                throw new GdxRuntimeException("Extension OES_texture_float not supported!");
            }
            g.f81384g.glTexImage2D(i11, 0, 6408, this.f12236a, this.f12237b, 0, 6408, f.f11703z1, this.f12243h);
        } else {
            if (!g.f81379b.m() && !g.f81379b.d("GL_ARB_texture_float")) {
                throw new GdxRuntimeException("Extension GL_ARB_texture_float not supported!");
            }
            g.f81384g.glTexImage2D(i11, 0, this.f12238c, this.f12236a, this.f12237b, 0, this.f12239d, f.f11703z1, this.f12243h);
        }
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return false;
    }

    public FloatBuffer f() {
        return this.f12243h;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return Pixmap.Format.RGBA8888;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f12237b;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f12236a;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.f12242g) {
            throw new GdxRuntimeException("Already prepared");
        }
        if (!this.f12241f) {
            if (g.f81379b.M().g().equals(GLVersion.Type.OpenGL)) {
                int i11 = this.f12238c;
                if (i11 != 34842) {
                }
                r2 = (i11 == 34843 || i11 == 34837) ? 3 : 4;
                if (i11 == 33327 || i11 == 33328) {
                    r2 = 2;
                }
                if (i11 == 33325 || i11 == 33326) {
                    r2 = 1;
                }
            }
            this.f12243h = BufferUtils.F(this.f12236a * this.f12237b * r2);
        }
        this.f12242g = true;
    }
}
