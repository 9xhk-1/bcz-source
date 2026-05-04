package d2;

import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f47016a;

    /* renamed from: b, reason: collision with root package name */
    public final short[] f47017b = new short[2];

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c> f47018c = new com.badlogic.gdx.utils.a<>();

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<ModelMaterial> f47019d = new com.badlogic.gdx.utils.a<>();

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<e> f47020e = new com.badlogic.gdx.utils.a<>();

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f47021f = new com.badlogic.gdx.utils.a<>();

    public void a(c cVar) {
        a.b<c> it = this.f47018c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f47022a.equals(cVar.f47022a)) {
                throw new GdxRuntimeException("Mesh with id '" + next.f47022a + "' already in model");
            }
        }
        this.f47018c.a(cVar);
    }
}
