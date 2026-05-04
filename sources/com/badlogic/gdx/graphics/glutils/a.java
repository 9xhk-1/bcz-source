package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.glutils.ETC1;
import com.badlogic.gdx.utils.GdxRuntimeException;
import n2.t;
import q1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements TextureData {

    /* renamed from: a, reason: collision with root package name */
    public v1.a f12230a;

    /* renamed from: b, reason: collision with root package name */
    public ETC1.a f12231b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12232c;

    /* renamed from: d, reason: collision with root package name */
    public int f12233d;

    /* renamed from: e, reason: collision with root package name */
    public int f12234e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12235f;

    public a(v1.a aVar) {
        this(aVar, false);
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean a() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean b() {
        return this.f12235f;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void c(int i11) {
        if (!this.f12235f) {
            throw new GdxRuntimeException("Call prepare() before calling consumeCompressedData()");
        }
        if (g.f81379b.d("GL_OES_compressed_ETC1_RGB8_texture")) {
            f fVar = g.f81384g;
            int i12 = ETC1.f12207b;
            int i13 = this.f12233d;
            int i14 = this.f12234e;
            int capacity = this.f12231b.f12210c.capacity();
            ETC1.a aVar = this.f12231b;
            fVar.glCompressedTexImage2D(i11, 0, i12, i13, i14, 0, capacity - aVar.f12211d, aVar.f12210c);
            if (e()) {
                g.f81385h.l3(f.f11552a0);
            }
        } else {
            Pixmap a11 = ETC1.a(this.f12231b, Pixmap.Format.RGB565);
            g.f81384g.glTexImage2D(i11, 0, a11.d1(), a11.i1(), a11.f1(), 0, a11.c1(), a11.e1(), a11.h1());
            if (this.f12232c) {
                t.a(i11, a11, a11.i1(), a11.f1());
            }
            a11.dispose();
            this.f12232c = false;
        }
        this.f12231b.dispose();
        this.f12231b = null;
        this.f12235f = false;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap d() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean e() {
        return this.f12232c;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public boolean g() {
        throw new GdxRuntimeException("This TextureData implementation does not return a Pixmap");
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public Pixmap.Format getFormat() {
        return Pixmap.Format.RGB565;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getHeight() {
        return this.f12234e;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public TextureData.TextureDataType getType() {
        return TextureData.TextureDataType.Custom;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public int getWidth() {
        return this.f12233d;
    }

    @Override // com.badlogic.gdx.graphics.TextureData
    public void prepare() {
        if (this.f12235f) {
            throw new GdxRuntimeException("Already prepared");
        }
        v1.a aVar = this.f12230a;
        if (aVar == null && this.f12231b == null) {
            throw new GdxRuntimeException("Can only load once from ETC1Data");
        }
        if (aVar != null) {
            this.f12231b = new ETC1.a(aVar);
        }
        ETC1.a aVar2 = this.f12231b;
        this.f12233d = aVar2.f12208a;
        this.f12234e = aVar2.f12209b;
        this.f12235f = true;
    }

    public a(v1.a aVar, boolean z11) {
        this.f12233d = 0;
        this.f12234e = 0;
        this.f12235f = false;
        this.f12230a = aVar;
        this.f12232c = z11;
    }

    public a(ETC1.a aVar, boolean z11) {
        this.f12233d = 0;
        this.f12234e = 0;
        this.f12235f = false;
        this.f12231b = aVar;
        this.f12232c = z11;
    }
}
