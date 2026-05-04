package jl;

import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final ol.c f64379a;

    /* renamed from: b, reason: collision with root package name */
    public float f64380b = 1.0f;

    public j(com.badlogic.gdx.graphics.g2d.e eVar) {
        this.f64379a = new ol.a(eVar);
    }

    public float a() {
        return this.f64380b;
    }

    public abstract i b(InputStream inputStream);

    public abstract i c(v1.a aVar);

    public void d(float f11) {
        if (f11 == 0.0f) {
            throw new IllegalArgumentException("scale cannot be 0.");
        }
        this.f64380b = f11;
    }

    public j(ol.c cVar) {
        if (cVar != null) {
            this.f64379a = cVar;
            return;
        }
        throw new IllegalArgumentException("attachmentLoader cannot be null.");
    }
}
