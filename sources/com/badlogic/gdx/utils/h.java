package com.badlogic.gdx.utils;

import a3.d0;
import a3.y0;
import com.badlogic.gdx.utils.JsonWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public a f13305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13306d;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f13304b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: e, reason: collision with root package name */
    public JsonWriter.OutputType f13307e = JsonWriter.OutputType.json;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13308f = false;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f13303a = new y0();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13309a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13310b;

        public a(boolean z11) {
            this.f13309a = z11;
            h.this.f13303a.append(z11 ? '[' : l50.b.f69927i);
        }

        public void a() {
            h.this.f13303a.append(this.f13309a ? l50.b.f69930l : l50.b.f69928j);
        }
    }

    public h a() {
        k();
        com.badlogic.gdx.utils.a<a> aVar = this.f13304b;
        a aVar2 = new a(true);
        this.f13305c = aVar2;
        aVar.a(aVar2);
        return this;
    }

    public h b(String str) {
        return g(str).a();
    }

    public h c() {
        while (this.f13304b.f13179b > 0) {
            j();
        }
        return this;
    }

    public y0 d() {
        return this.f13303a;
    }

    public h e(String str) {
        k();
        this.f13303a.O(str);
        return this;
    }

    public h f(String str, String str2) {
        return g(str).e(str2);
    }

    public h g(String str) {
        a aVar = this.f13305c;
        if (aVar == null || aVar.f13309a) {
            throw new IllegalStateException("Current item must be an object.");
        }
        if (aVar.f13310b) {
            this.f13303a.append(',');
        } else {
            aVar.f13310b = true;
        }
        this.f13303a.O(this.f13307e.quoteName(str));
        this.f13303a.append(':');
        this.f13306d = true;
        return this;
    }

    public h h() {
        k();
        com.badlogic.gdx.utils.a<a> aVar = this.f13304b;
        a aVar2 = new a(false);
        this.f13305c = aVar2;
        aVar.a(aVar2);
        return this;
    }

    public h i(String str) {
        return g(str).h();
    }

    public h j() {
        if (this.f13306d) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        this.f13304b.pop().a();
        com.badlogic.gdx.utils.a<a> aVar = this.f13304b;
        this.f13305c = aVar.f13179b == 0 ? null : aVar.peek();
        return this;
    }

    public final void k() {
        a aVar = this.f13305c;
        if (aVar == null) {
            return;
        }
        if (!aVar.f13309a) {
            if (!this.f13306d) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f13306d = false;
        } else if (aVar.f13310b) {
            this.f13303a.append(',');
        } else {
            aVar.f13310b = true;
        }
    }

    public void l() {
        this.f13303a.clear();
        this.f13304b.clear();
        this.f13305c = null;
        this.f13306d = false;
    }

    public h m(String str, Object obj) {
        return g(str).p(obj);
    }

    public void n(JsonWriter.OutputType outputType) {
        this.f13307e = outputType;
    }

    public void o(boolean z11) {
        this.f13308f = z11;
    }

    public h p(@d0 Object obj) {
        if (this.f13308f && ((obj instanceof Long) || (obj instanceof Double) || (obj instanceof BigDecimal) || (obj instanceof BigInteger))) {
            obj = obj.toString();
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            long longValue = number.longValue();
            if (number.doubleValue() == longValue) {
                obj = Long.valueOf(longValue);
            }
        }
        k();
        this.f13303a.O(this.f13307e.quoteValue(obj));
        return this;
    }

    public String toString() {
        return this.f13303a.toString();
    }
}
