package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.Pixmap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        public static q a(Pixmap.Format format, boolean z11, v1.a... aVarArr) {
            return new n2.c(format, z11, aVarArr);
        }
    }

    boolean a();

    boolean b();

    int c();

    int d();

    void e();

    int getDepth();

    int getHeight();

    int getWidth();

    void prepare();
}
