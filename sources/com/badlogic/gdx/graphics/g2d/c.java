package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.utils.a;
import n2.w;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends com.badlogic.gdx.graphics.g2d.a {

    /* renamed from: j, reason: collision with root package name */
    public float f12055j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends b {
        public a(c cVar) {
            super(cVar, cVar.l1());
        }

        public final float O() {
            c cVar = (c) super.m();
            return cVar.n1() * cVar.V0();
        }

        public final void P(w1.a aVar, float f11) {
            aVar.flush();
            aVar.getShader().W1("u_smoothing", f11);
        }

        @Override // com.badlogic.gdx.graphics.g2d.b
        public void i(w1.a aVar) {
            P(aVar, O());
            super.i(aVar);
            P(aVar, 0.0f);
        }

        @Override // com.badlogic.gdx.graphics.g2d.b
        public void k(w1.a aVar, int i11, int i12) {
            P(aVar, O());
            super.k(aVar, i11, i12);
            P(aVar, 0.0f);
        }

        public a(c cVar, boolean z11) {
            super(cVar, z11);
        }
    }

    public c(a.C0189a c0189a, com.badlogic.gdx.utils.a<o> aVar, boolean z11) {
        super(c0189a, aVar, z11);
    }

    public static w m1() {
        w wVar = new w("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main() {\n\tv_color = a_color;\n\tv_color.a = v_color.a * (255.0/254.0);\n\tv_texCoords = a_texCoord0;\n\tgl_Position =  u_projTrans * a_position;\n}\n", "#ifdef GL_ES\n\tprecision mediump float;\n\tprecision mediump int;\n#endif\n\nuniform sampler2D u_texture;\nuniform float u_smoothing;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main() {\n\tif (u_smoothing > 0.0) {\n\t\tfloat smoothing = 0.25 / u_smoothing;\n\t\tfloat distance = texture2D(u_texture, v_texCoords).a;\n\t\tfloat alpha = smoothstep(0.5 - smoothing, 0.5 + smoothing, distance);\n\t\tgl_FragColor = vec4(v_color.rgb, alpha * v_color.a);\n\t} else {\n\t\tgl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n\t}\n}\n");
        if (wVar.q1()) {
            return wVar;
        }
        throw new IllegalArgumentException("Error compiling distance field shader: " + wVar.f1());
    }

    @Override // com.badlogic.gdx.graphics.g2d.a
    public void f1(a.C0189a c0189a) {
        super.f1(c0189a);
        a.b<o> it = Q0().iterator();
        while (it.hasNext()) {
            Texture f11 = it.next().f();
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            f11.a1(textureFilter, textureFilter);
        }
    }

    @Override // com.badlogic.gdx.graphics.g2d.a
    public b g1() {
        return new a(this, this.f11999e);
    }

    public float n1() {
        return this.f12055j;
    }

    public void o1(float f11) {
        this.f12055j = f11;
    }

    public c(a.C0189a c0189a, o oVar, boolean z11) {
        super(c0189a, oVar, z11);
    }

    public c(v1.a aVar, boolean z11) {
        super(aVar, z11);
    }

    public c(v1.a aVar, v1.a aVar2, boolean z11, boolean z12) {
        super(aVar, aVar2, z11, z12);
    }

    public c(v1.a aVar, v1.a aVar2, boolean z11) {
        super(aVar, aVar2, z11);
    }

    public c(v1.a aVar, o oVar, boolean z11) {
        super(aVar, oVar, z11);
    }

    public c(v1.a aVar, o oVar) {
        super(aVar, oVar);
    }

    public c(v1.a aVar) {
        super(aVar);
    }
}
