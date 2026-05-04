package com.google.gson.internal;

import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d implements t, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final double f35020g = -1.0d;

    /* renamed from: h, reason: collision with root package name */
    public static final d f35021h = new d();

    /* renamed from: a, reason: collision with root package name */
    public double f35022a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    public int f35023b = 136;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35024c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35025d;

    /* renamed from: e, reason: collision with root package name */
    public List<com.google.gson.a> f35026e;

    /* renamed from: f, reason: collision with root package name */
    public List<com.google.gson.a> f35027f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> extends s<T> {

        /* renamed from: a, reason: collision with root package name */
        public s<T> f35028a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f35029b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f35030c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.d f35031d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ bp.a f35032e;

        public a(boolean z11, boolean z12, com.google.gson.d dVar, bp.a aVar) {
            this.f35029b = z11;
            this.f35030c = z12;
            this.f35031d = dVar;
            this.f35032e = aVar;
        }

        @Override // com.google.gson.s
        public T e(cp.a aVar) throws IOException {
            if (!this.f35029b) {
                return j().e(aVar);
            }
            aVar.C0();
            return null;
        }

        @Override // com.google.gson.s
        public void i(cp.c cVar, T t11) throws IOException {
            if (this.f35030c) {
                cVar.L();
            } else {
                j().i(cVar, t11);
            }
        }

        public final s<T> j() {
            s<T> sVar = this.f35028a;
            if (sVar != null) {
                return sVar;
            }
            s<T> r11 = this.f35031d.r(d.this, this.f35032e);
            this.f35028a = r11;
            return r11;
        }
    }

    public d() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f35026e = list;
        this.f35027f = list;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean e11 = e(rawType);
        boolean z11 = e11 || f(rawType, true);
        boolean z12 = e11 || f(rawType, false);
        if (z11 || z12) {
            return new a(z12, z11, dVar, aVar);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public d c() {
        d clone = clone();
        clone.f35024c = false;
        return clone;
    }

    public boolean d(Class<?> cls, boolean z11) {
        return e(cls) || f(cls, z11);
    }

    public final boolean e(Class<?> cls) {
        if (this.f35022a == -1.0d || o((wo.d) cls.getAnnotation(wo.d.class), (wo.e) cls.getAnnotation(wo.e.class))) {
            return (!this.f35024c && j(cls)) || i(cls);
        }
        return true;
    }

    public final boolean f(Class<?> cls, boolean z11) {
        Iterator<com.google.gson.a> it = (z11 ? this.f35026e : this.f35027f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Field field, boolean z11) {
        wo.a aVar;
        if ((this.f35023b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f35022a != -1.0d && !o((wo.d) field.getAnnotation(wo.d.class), (wo.e) field.getAnnotation(wo.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f35025d && ((aVar = (wo.a) field.getAnnotation(wo.a.class)) == null || (!z11 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f35024c && j(field.getType())) || i(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z11 ? this.f35026e : this.f35027f;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public d h() {
        d clone = clone();
        clone.f35025d = true;
        return clone;
    }

    public final boolean i(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || l(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final boolean j(Class<?> cls) {
        return cls.isMemberClass() && !l(cls);
    }

    public final boolean l(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean m(wo.d dVar) {
        return dVar == null || dVar.value() <= this.f35022a;
    }

    public final boolean n(wo.e eVar) {
        return eVar == null || eVar.value() > this.f35022a;
    }

    public final boolean o(wo.d dVar, wo.e eVar) {
        return m(dVar) && n(eVar);
    }

    public d p(com.google.gson.a aVar, boolean z11, boolean z12) {
        d clone = clone();
        if (z11) {
            ArrayList arrayList = new ArrayList(this.f35026e);
            clone.f35026e = arrayList;
            arrayList.add(aVar);
        }
        if (z12) {
            ArrayList arrayList2 = new ArrayList(this.f35027f);
            clone.f35027f = arrayList2;
            arrayList2.add(aVar);
        }
        return clone;
    }

    public d q(int... iArr) {
        d clone = clone();
        clone.f35023b = 0;
        for (int i11 : iArr) {
            clone.f35023b = i11 | clone.f35023b;
        }
        return clone;
    }

    public d s(double d11) {
        d clone = clone();
        clone.f35022a = d11;
        return clone;
    }
}
