package com.badlogic.gdx.maps.tiled;

import q2.g;
import q2.h;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface TiledMapTile {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum BlendMode {
        NONE,
        ALPHA
    }

    h a();

    o b();

    float c();

    void d(int i11);

    g e();

    float f();

    void g(float f11);

    int getId();

    void h(float f11);

    void i(BlendMode blendMode);

    void j(o oVar);

    BlendMode k();
}
