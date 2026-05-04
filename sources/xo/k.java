package xo;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.c f98189a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.c f98190b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.d f98191c;

    /* renamed from: d, reason: collision with root package name */
    public final e f98192d;

    /* renamed from: e, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f98193e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f98194d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Field f98195e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f98196f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s f98197g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.d f98198h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ bp.a f98199i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f98200j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z11, boolean z12, boolean z13, Field field, boolean z14, s sVar, com.google.gson.d dVar, bp.a aVar, boolean z15) {
            super(str, z11, z12);
            this.f98194d = z13;
            this.f98195e = field;
            this.f98196f = z14;
            this.f98197g = sVar;
            this.f98198h = dVar;
            this.f98199i = aVar;
            this.f98200j = z15;
        }

        @Override // xo.k.c
        public void a(cp.a aVar, Object obj) throws IOException, IllegalAccessException {
            Object e11 = this.f98197g.e(aVar);
            if (e11 == null && this.f98200j) {
                return;
            }
            if (this.f98194d) {
                k.c(obj, this.f98195e);
            }
            this.f98195e.set(obj, e11);
        }

        @Override // xo.k.c
        public void b(cp.c cVar, Object obj) throws IOException, IllegalAccessException {
            if (this.f98205b) {
                if (this.f98194d) {
                    k.c(obj, this.f98195e);
                }
                Object obj2 = this.f98195e.get(obj);
                if (obj2 == obj) {
                    return;
                }
                cVar.H(this.f98204a);
                (this.f98196f ? this.f98197g : new m(this.f98198h, this.f98197g, this.f98199i.getType())).i(cVar, obj2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.gson.internal.h<T> f98202a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, c> f98203b;

        public b(com.google.gson.internal.h<T> hVar, Map<String, c> map) {
            this.f98202a = hVar;
            this.f98203b = map;
        }

        @Override // com.google.gson.s
        public T e(cp.a aVar) throws IOException {
            if (aVar.k0() == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            T a11 = this.f98202a.a();
            try {
                aVar.c();
                while (aVar.E()) {
                    c cVar = this.f98203b.get(aVar.a0());
                    if (cVar != null && cVar.f98206c) {
                        cVar.a(aVar, a11);
                    }
                    aVar.C0();
                }
                aVar.q();
                return a11;
            } catch (IllegalAccessException e11) {
                throw zo.a.b(e11);
            } catch (IllegalStateException e12) {
                throw new JsonSyntaxException(e12);
            }
        }

        @Override // com.google.gson.s
        public void i(cp.c cVar, T t11) throws IOException {
            if (t11 == null) {
                cVar.L();
                return;
            }
            cVar.f();
            try {
                Iterator<c> it = this.f98203b.values().iterator();
                while (it.hasNext()) {
                    it.next().b(cVar, t11);
                }
                cVar.k();
            } catch (IllegalAccessException e11) {
                throw zo.a.b(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f98204a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98205b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f98206c;

        public c(String str, boolean z11, boolean z12) {
            this.f98204a = str;
            this.f98205b = z11;
            this.f98206c = z12;
        }

        public abstract void a(cp.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(cp.c cVar, Object obj) throws IOException, IllegalAccessException;
    }

    public k(com.google.gson.internal.c cVar, com.google.gson.c cVar2, com.google.gson.internal.d dVar, e eVar, List<ReflectionAccessFilter> list) {
        this.f98189a = cVar;
        this.f98190b = cVar2;
        this.f98191c = dVar;
        this.f98192d = eVar;
        this.f98193e = list;
    }

    public static void c(Object obj, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (com.google.gson.internal.k.a(field, obj)) {
            return;
        }
        throw new JsonIOException("Field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
    }

    @Override // com.google.gson.t
    public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult b11 = com.google.gson.internal.k.b(this.f98193e, rawType);
        if (b11 != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            return new b(this.f98189a.a(aVar), e(dVar, aVar, rawType, b11 == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final c d(com.google.gson.d dVar, Field field, String str, bp.a<?> aVar, boolean z11, boolean z12, boolean z13) {
        boolean a11 = com.google.gson.internal.j.a(aVar.getRawType());
        wo.b bVar = (wo.b) field.getAnnotation(wo.b.class);
        s<?> b11 = bVar != null ? this.f98192d.b(this.f98189a, dVar, aVar, bVar) : null;
        boolean z14 = b11 != null;
        if (b11 == null) {
            b11 = dVar.p(aVar);
        }
        return new a(str, z11, z12, z13, field, z14, b11, dVar, aVar, a11);
    }

    public final Map<String, c> e(com.google.gson.d dVar, bp.a<?> aVar, Class<?> cls, boolean z11) {
        bp.a<?> aVar2;
        int i11;
        int i12;
        k kVar = this;
        Class<?> cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls2.isInterface()) {
            Type type = aVar.getType();
            bp.a<?> aVar3 = aVar;
            boolean z12 = z11;
            Class<?> cls3 = cls2;
            while (cls3 != Object.class) {
                Field[] declaredFields = cls3.getDeclaredFields();
                boolean z13 = true;
                boolean z14 = false;
                if (cls3 != cls2 && declaredFields.length > 0) {
                    ReflectionAccessFilter.FilterResult b11 = com.google.gson.internal.k.b(kVar.f98193e, cls3);
                    if (b11 == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z12 = b11 == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
                }
                boolean z15 = z12;
                int length = declaredFields.length;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13;
                    Field field = declaredFields[i14];
                    boolean g11 = kVar.g(field, z13);
                    boolean g12 = kVar.g(field, z14);
                    if (g11 || g12) {
                        if (!z15) {
                            zo.a.c(field);
                        }
                        Type o11 = com.google.gson.internal.b.o(aVar3.getType(), cls3, field.getGenericType());
                        List<String> f11 = kVar.f(field);
                        int size = f11.size();
                        c cVar = null;
                        aVar2 = aVar3;
                        int i15 = 0;
                        while (i15 < size) {
                            String str = f11.get(i15);
                            if (i15 != 0) {
                                g11 = false;
                            }
                            List<String> list = f11;
                            boolean z16 = g11;
                            int i16 = i14;
                            int i17 = length;
                            c cVar2 = (c) linkedHashMap.put(str, kVar.d(dVar, field, str, bp.a.get(o11), z16, g12, z15));
                            if (cVar == null) {
                                cVar = cVar2;
                            }
                            i15++;
                            kVar = this;
                            g11 = z16;
                            length = i17;
                            i14 = i16;
                            f11 = list;
                        }
                        i11 = length;
                        i12 = i14;
                        if (cVar != null) {
                            throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar.f98204a);
                        }
                    } else {
                        i11 = length;
                        i12 = i14;
                        aVar2 = aVar3;
                    }
                    i13 = i12 + 1;
                    kVar = this;
                    aVar3 = aVar2;
                    length = i11;
                    z13 = true;
                    z14 = false;
                }
                aVar3 = bp.a.get(com.google.gson.internal.b.o(aVar3.getType(), cls3, cls3.getGenericSuperclass()));
                cls3 = aVar3.getRawType();
                kVar = this;
                cls2 = cls;
                z12 = z15;
            }
        }
        return linkedHashMap;
    }

    public final List<String> f(Field field) {
        wo.c cVar = (wo.c) field.getAnnotation(wo.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f98190b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final boolean g(Field field, boolean z11) {
        return (this.f98191c.d(field.getType(), z11) || this.f98191c.g(field, z11)) ? false : true;
    }
}
