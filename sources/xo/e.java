package xo;

import com.google.gson.p;
import com.google.gson.s;
import com.google.gson.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e implements t {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.c f98168a;

    public e(com.google.gson.internal.c cVar) {
        this.f98168a = cVar;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
        wo.b bVar = (wo.b) aVar.getRawType().getAnnotation(wo.b.class);
        if (bVar == null) {
            return null;
        }
        return (s<T>) b(this.f98168a, dVar, aVar, bVar);
    }

    public s<?> b(com.google.gson.internal.c cVar, com.google.gson.d dVar, bp.a<?> aVar, wo.b bVar) {
        s<?> lVar;
        Object a11 = cVar.a(bp.a.get((Class) bVar.value())).a();
        if (a11 instanceof s) {
            lVar = (s) a11;
        } else if (a11 instanceof t) {
            lVar = ((t) a11).a(dVar, aVar);
        } else {
            boolean z11 = a11 instanceof p;
            if (!z11 && !(a11 instanceof com.google.gson.i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a11.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            lVar = new l(z11 ? (p) a11 : null, a11 instanceof com.google.gson.i ? (com.google.gson.i) a11 : null, dVar, aVar, null);
        }
        return (lVar == null || !bVar.nullSafe()) ? lVar : lVar.d();
    }
}
