package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.Pixmap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface TextureData {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TextureDataType {
        Pixmap,
        Custom
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public static TextureData a(v1.a aVar, Pixmap.Format format, boolean z11) {
            if (aVar == null) {
                return null;
            }
            return aVar.z().endsWith(".cim") ? new n2.d(aVar, m.a(aVar), format, z11) : aVar.z().endsWith(".etc1") ? new com.badlogic.gdx.graphics.glutils.a(aVar, z11) : (aVar.z().endsWith(".ktx") || aVar.z().endsWith(".zktx")) ? new com.badlogic.gdx.graphics.glutils.c(aVar, z11) : new n2.d(aVar, new Pixmap(aVar), format, z11);
        }

        public static TextureData b(v1.a aVar, boolean z11) {
            return a(aVar, null, z11);
        }
    }

    boolean a();

    boolean b();

    void c(int i11);

    Pixmap d();

    boolean e();

    boolean g();

    Pixmap.Format getFormat();

    int getHeight();

    TextureDataType getType();

    int getWidth();

    void prepare();
}
