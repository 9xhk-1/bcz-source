package com.esotericsoftware.spine;

import a3.d0;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.o;
import jl.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f29456a;

    /* renamed from: b, reason: collision with root package name */
    public final o<a> f29457b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<BoneData> f29458c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<jl.b> f29459d;

    /* renamed from: e, reason: collision with root package name */
    public final a f29460e;

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f29461f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f29462a;

        /* renamed from: b, reason: collision with root package name */
        public String f29463b;

        /* renamed from: c, reason: collision with root package name */
        @d0
        public ol.b f29464c;

        /* renamed from: d, reason: collision with root package name */
        public int f29465d;

        public a(int i11, String str, @d0 ol.b bVar) {
            d(i11, str);
            this.f29464c = bVar;
        }

        public ol.b a() {
            return this.f29464c;
        }

        public String b() {
            return this.f29463b;
        }

        public int c() {
            return this.f29462a;
        }

        public void d(int i11, String str) {
            if (i11 < 0) {
                throw new IllegalArgumentException("slotIndex must be >= 0.");
            }
            if (str == null) {
                throw new IllegalArgumentException("name cannot be null.");
            }
            this.f29462a = i11;
            this.f29463b = str;
            this.f29465d = str.hashCode() + (i11 * 37);
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29462a != aVar.f29462a) {
                return false;
            }
            return this.f29463b.equals(aVar.f29463b);
        }

        public int hashCode() {
            return this.f29465d;
        }

        public String toString() {
            return this.f29462a + ":" + this.f29463b;
        }
    }

    public h(String str) {
        o<a> oVar = new o<>();
        this.f29457b = oVar;
        this.f29458c = new com.badlogic.gdx.utils.a<>(0);
        this.f29459d = new com.badlogic.gdx.utils.a<>(0);
        this.f29460e = new a(0, "", null);
        this.f29461f = new com.badlogic.gdx.graphics.b(0.99607843f, 0.61960787f, 0.30980393f, 1.0f);
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f29456a = str;
        oVar.A().f13180c = false;
    }

    public void a(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("skin cannot be null.");
        }
        a.b<BoneData> it = hVar.f29458c.iterator();
        while (it.hasNext()) {
            BoneData next = it.next();
            if (!this.f29458c.l(next, true)) {
                this.f29458c.a(next);
            }
        }
        a.b<jl.b> it2 = hVar.f29459d.iterator();
        while (it2.hasNext()) {
            jl.b next2 = it2.next();
            if (!this.f29459d.l(next2, true)) {
                this.f29459d.a(next2);
            }
        }
        a.b<a> it3 = hVar.f29457b.A().iterator();
        while (it3.hasNext()) {
            a next3 = it3.next();
            m(next3.f29462a, next3.f29463b, next3.f29464c);
        }
    }

    public void b(Skeleton skeleton, h hVar) {
        ol.b e11;
        m[] mVarArr = skeleton.f29194c.f13178a;
        a.b<a> it = hVar.f29457b.A().iterator();
        while (it.hasNext()) {
            a next = it.next();
            int i11 = next.f29462a;
            m mVar = mVarArr[i11];
            if (mVar.f64411e == next.f29464c && (e11 = e(i11, next.f29463b)) != null) {
                mVar.i(e11);
            }
        }
    }

    public void c() {
        this.f29457b.j(1024);
        this.f29458c.clear();
        this.f29459d.clear();
    }

    public void d(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("skin cannot be null.");
        }
        a.b<BoneData> it = hVar.f29458c.iterator();
        while (it.hasNext()) {
            BoneData next = it.next();
            if (!this.f29458c.l(next, true)) {
                this.f29458c.a(next);
            }
        }
        a.b<jl.b> it2 = hVar.f29459d.iterator();
        while (it2.hasNext()) {
            jl.b next2 = it2.next();
            if (!this.f29459d.l(next2, true)) {
                this.f29459d.a(next2);
            }
        }
        a.b<a> it3 = hVar.f29457b.A().iterator();
        while (it3.hasNext()) {
            a next3 = it3.next();
            ol.b bVar = next3.f29464c;
            if (bVar instanceof ol.g) {
                m(next3.f29462a, next3.f29463b, ((ol.g) bVar).D());
            } else {
                m(next3.f29462a, next3.f29463b, bVar != null ? bVar.h() : null);
            }
        }
    }

    @d0
    public ol.b e(int i11, String str) {
        this.f29460e.d(i11, str);
        a l11 = this.f29457b.l(this.f29460e);
        if (l11 != null) {
            return l11.f29464c;
        }
        return null;
    }

    public com.badlogic.gdx.utils.a<a> f() {
        return this.f29457b.A();
    }

    public void g(int i11, com.badlogic.gdx.utils.a<a> aVar) {
        if (i11 < 0) {
            throw new IllegalArgumentException("slotIndex must be >= 0.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("attachments cannot be null.");
        }
        a.b<a> it = this.f29457b.A().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f29462a == i11) {
                aVar.a(next);
            }
        }
    }

    public com.badlogic.gdx.utils.a<BoneData> h() {
        return this.f29458c;
    }

    public com.badlogic.gdx.graphics.b i() {
        return this.f29461f;
    }

    public com.badlogic.gdx.utils.a<jl.b> j() {
        return this.f29459d;
    }

    public String k() {
        return this.f29456a;
    }

    public void l(int i11, String str) {
        this.f29460e.d(i11, str);
        this.f29457b.remove(this.f29460e);
    }

    public void m(int i11, String str, ol.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("attachment cannot be null.");
        }
        a aVar = new a(i11, str, bVar);
        if (this.f29457b.add(aVar)) {
            return;
        }
        this.f29457b.l(aVar).f29464c = bVar;
    }

    public String toString() {
        return this.f29456a;
    }
}
