package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kk.s;
import kk.u;
import pk.o;
import pk.p;
import pk.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Registry {

    /* renamed from: k, reason: collision with root package name */
    public static final String f28622k = "Animation";

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final String f28623l = "Animation";

    /* renamed from: m, reason: collision with root package name */
    public static final String f28624m = "Bitmap";

    /* renamed from: n, reason: collision with root package name */
    public static final String f28625n = "BitmapDrawable";

    /* renamed from: o, reason: collision with root package name */
    public static final String f28626o = "legacy_prepend_all";

    /* renamed from: p, reason: collision with root package name */
    public static final String f28627p = "legacy_append";

    /* renamed from: a, reason: collision with root package name */
    public final q f28628a;

    /* renamed from: b, reason: collision with root package name */
    public final al.a f28629b;

    /* renamed from: c, reason: collision with root package name */
    public final al.e f28630c;

    /* renamed from: d, reason: collision with root package name */
    public final al.f f28631d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f28632e;

    /* renamed from: f, reason: collision with root package name */
    public final xk.f f28633f;

    /* renamed from: g, reason: collision with root package name */
    public final al.b f28634g;

    /* renamed from: h, reason: collision with root package name */
    public final al.d f28635h = new al.d();

    /* renamed from: i, reason: collision with root package name */
    public final al.c f28636i = new al.c();

    /* renamed from: j, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f28637j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m11, @NonNull List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m11);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> g11 = gl.a.g();
        this.f28637j = g11;
        this.f28628a = new q(g11);
        this.f28629b = new al.a();
        this.f28630c = new al.e();
        this.f28631d = new al.f();
        this.f28632e = new com.bumptech.glide.load.data.f();
        this.f28633f = new xk.f();
        this.f28634g = new al.b();
        z(Arrays.asList("Animation", f28624m, f28625n));
    }

    @NonNull
    public <Data> Registry a(@NonNull Class<Data> cls, @NonNull ik.a<Data> aVar) {
        this.f28629b.a(cls, aVar);
        return this;
    }

    @NonNull
    public <TResource> Registry b(@NonNull Class<TResource> cls, @NonNull ik.g<TResource> gVar) {
        this.f28631d.a(cls, gVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ik.f<Data, TResource> fVar) {
        e(f28627p, cls, cls2, fVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<Model, Data> pVar) {
        this.f28628a.a(cls, cls2, pVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ik.f<Data, TResource> fVar) {
        this.f28630c.a(str, fVar, cls, cls2);
        return this;
    }

    @NonNull
    public final <Data, TResource, Transcode> List<kk.i<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f28630c.d(cls, cls2)) {
            for (Class cls5 : this.f28633f.b(cls4, cls3)) {
                arrayList.add(new kk.i(cls, cls4, cls5, this.f28630c.b(cls, cls4), this.f28633f.a(cls4, cls5), this.f28637j));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b11 = this.f28634g.b();
        if (b11.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b11;
    }

    @Nullable
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        s<Data, TResource, Transcode> a11 = this.f28636i.a(cls, cls2, cls3);
        s<Data, TResource, Transcode> sVar = null;
        if (this.f28636i.c(a11)) {
            return null;
        }
        if (a11 != null) {
            return a11;
        }
        List<kk.i<Data, TResource, Transcode>> f11 = f(cls, cls2, cls3);
        if (f11.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            sVar = new s<>(cls4, cls5, cls6, f11, this.f28637j);
        }
        this.f28636i.d(cls4, cls5, cls6, sVar);
        return sVar;
    }

    @NonNull
    public <Model> List<o<Model, ?>> i(@NonNull Model model) {
        return this.f28628a.e(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> b11 = this.f28635h.b(cls, cls2, cls3);
        if (b11 == null) {
            b11 = new ArrayList<>();
            Iterator<Class<?>> it = this.f28628a.d(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f28630c.d(it.next(), cls2)) {
                    if (!this.f28633f.b(cls4, cls3).isEmpty() && !b11.contains(cls4)) {
                        b11.add(cls4);
                    }
                }
            }
            this.f28635h.c(cls, cls2, cls3, Collections.unmodifiableList(b11));
        }
        return b11;
    }

    @NonNull
    public <X> ik.g<X> k(@NonNull u<X> uVar) throws NoResultEncoderAvailableException {
        ik.g<X> b11 = this.f28631d.b(uVar.a());
        if (b11 != null) {
            return b11;
        }
        throw new NoResultEncoderAvailableException(uVar.a());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.e<X> l(@NonNull X x11) {
        return this.f28632e.a(x11);
    }

    @NonNull
    public <X> ik.a<X> m(@NonNull X x11) throws NoSourceEncoderAvailableException {
        ik.a<X> b11 = this.f28629b.b(x11.getClass());
        if (b11 != null) {
            return b11;
        }
        throw new NoSourceEncoderAvailableException(x11.getClass());
    }

    public boolean n(@NonNull u<?> uVar) {
        return this.f28631d.b(uVar.a()) != null;
    }

    @NonNull
    public <Data> Registry o(@NonNull Class<Data> cls, @NonNull ik.a<Data> aVar) {
        this.f28629b.c(cls, aVar);
        return this;
    }

    @NonNull
    public <TResource> Registry p(@NonNull Class<TResource> cls, @NonNull ik.g<TResource> gVar) {
        this.f28631d.c(cls, gVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry q(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ik.f<Data, TResource> fVar) {
        s(f28626o, cls, cls2, fVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry r(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<Model, Data> pVar) {
        this.f28628a.g(cls, cls2, pVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry s(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ik.f<Data, TResource> fVar) {
        this.f28630c.e(str, fVar, cls, cls2);
        return this;
    }

    @NonNull
    public Registry t(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f28634g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public Registry u(@NonNull e.a<?> aVar) {
        this.f28632e.b(aVar);
        return this;
    }

    @NonNull
    @Deprecated
    public <Data> Registry v(@NonNull Class<Data> cls, @NonNull ik.a<Data> aVar) {
        return a(cls, aVar);
    }

    @NonNull
    @Deprecated
    public <TResource> Registry w(@NonNull Class<TResource> cls, @NonNull ik.g<TResource> gVar) {
        return b(cls, gVar);
    }

    @NonNull
    public <TResource, Transcode> Registry x(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull xk.e<TResource, Transcode> eVar) {
        this.f28633f.c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry y(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
        this.f28628a.i(cls, cls2, pVar);
        return this;
    }

    @NonNull
    public final Registry z(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f28626o);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(f28627p);
        this.f28630c.f(arrayList);
        return this;
    }
}
