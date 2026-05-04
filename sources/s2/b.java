package s2;

import a3.d0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.a;
import java.util.StringTokenizer;
import s1.p;
import s2.b.C1125b;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class b<P extends C1125b> extends s1.b<f, P> {

    /* renamed from: l, reason: collision with root package name */
    public static final int f87378l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public static final int f87379m = 1073741824;

    /* renamed from: n, reason: collision with root package name */
    public static final int f87380n = 536870912;

    /* renamed from: o, reason: collision with root package name */
    public static final int f87381o = -536870912;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87382b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87383c;

    /* renamed from: d, reason: collision with root package name */
    public int f87384d;

    /* renamed from: e, reason: collision with root package name */
    public int f87385e;

    /* renamed from: f, reason: collision with root package name */
    public int f87386f;

    /* renamed from: g, reason: collision with root package name */
    public int f87387g;

    /* renamed from: h, reason: collision with root package name */
    public f f87388h;

    /* renamed from: i, reason: collision with root package name */
    public com.badlogic.gdx.utils.d<q2.f> f87389i;

    /* renamed from: j, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<Runnable> f87390j;

    /* renamed from: k, reason: collision with root package name */
    public com.badlogic.gdx.utils.l<String, com.badlogic.gdx.utils.a<c>> f87391k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f87392a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q2.h f87393b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f87394c;

        public a(int i11, q2.h hVar, String str) {
            this.f87392a = i11;
            this.f87393b = hVar;
            this.f87394c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f87393b.h(this.f87394c, b.this.f87389i.get(this.f87392a));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: s2.b$b, reason: collision with other inner class name */
    public static class C1125b extends r1.c<f> {

        /* renamed from: b, reason: collision with root package name */
        public boolean f87396b = false;

        /* renamed from: c, reason: collision with root package name */
        public Texture.TextureFilter f87397c;

        /* renamed from: d, reason: collision with root package name */
        public Texture.TextureFilter f87398d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f87399e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f87400f;

        /* renamed from: g, reason: collision with root package name */
        public String f87401g;

        public C1125b() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.f87397c = textureFilter;
            this.f87398d = textureFilter;
            this.f87399e = false;
            this.f87400f = true;
            this.f87401g = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f87402a;

        /* renamed from: b, reason: collision with root package name */
        public String f87403b;

        /* renamed from: c, reason: collision with root package name */
        public String f87404c;

        /* renamed from: d, reason: collision with root package name */
        public JsonValue f87405d;

        public String toString() {
            return "ProjectClassMember{name='" + this.f87402a + "', type='" + this.f87403b + "', propertyType='" + this.f87404c + "', defaultValue=" + this.f87405d + com.alipay.sdk.m.u.i.f11099d;
        }
    }

    public b(s1.e eVar) {
        super(eVar);
        this.f87383c = true;
    }

    public static v1.a k(v1.a aVar, String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\\/");
        v1.a B = aVar.B();
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            B = nextToken.equals(zr.m.f102856e) ? B.B() : B.a(nextToken);
        }
        return B;
    }

    public static String q(String str) {
        String substring = str.length() == 9 ? str.substring(1, 3) : "ff";
        return (str.length() == 9 ? str.substring(3) : str.substring(1)) + substring;
    }

    public static int r(byte b11) {
        return b11 & 255;
    }

    public void f(j jVar, o oVar, int i11, float f11, float f12) {
        v2.b bVar = new v2.b(oVar);
        bVar.d(i11);
        bVar.g(f11);
        if (this.f87383c) {
            f12 = -f12;
        }
        bVar.h(f12);
        jVar.f(i11, bVar);
    }

    public Object g(String str, String str2, String str3) {
        if (str3 == null || TypedValues.Custom.S_STRING.equals(str3) || "file".equals(str3)) {
            return str2;
        }
        if (str3.equals("int")) {
            return Integer.valueOf(str2);
        }
        if (str3.equals(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(str2);
        }
        if (str3.equals("bool")) {
            return Boolean.valueOf(str2);
        }
        if (str3.equals("color")) {
            return com.badlogic.gdx.graphics.b.R(q(str2));
        }
        throw new GdxRuntimeException("Wrong type given for property " + str + ", given : " + str3 + ", supported : string, file, bool, int, float, color");
    }

    public i.a h(boolean z11, boolean z12, boolean z13) {
        i.a aVar = new i.a();
        if (!z13) {
            aVar.e(z11);
            aVar.f(z12);
            return aVar;
        }
        if (z11 && z12) {
            aVar.e(true);
            aVar.g(3);
            return aVar;
        }
        if (z11) {
            aVar.g(3);
            return aVar;
        }
        if (z12) {
            aVar.g(1);
            return aVar;
        }
        aVar.f(true);
        aVar.g(3);
        return aVar;
    }

    public abstract com.badlogic.gdx.utils.a<r1.a> i(v1.a aVar, p.b bVar);

    @d0
    public com.badlogic.gdx.utils.d<q2.f> j() {
        return this.f87389i;
    }

    public void l(q2.h hVar, String str, String str2, String str3) {
        hVar.h(str, g(str, str2, str3));
    }

    public void m(String str, q2.h hVar, JsonValue jsonValue) {
        com.badlogic.gdx.utils.l<String, com.badlogic.gdx.utils.a<c>> lVar = this.f87391k;
        if (lVar == null) {
            throw new GdxRuntimeException("No class information loaded to support class properties. Did you set the 'projectFilePath' parameter?");
        }
        if (lVar.isEmpty()) {
            throw new GdxRuntimeException("No class information available. Did you set the correct Tiled project path in the 'projectFilePath' parameter?");
        }
        com.badlogic.gdx.utils.a<c> k11 = this.f87391k.k(str);
        if (k11 == null) {
            throw new GdxRuntimeException("There is no class with name '" + str + "' in given Tiled project file.");
        }
        a.b<c> it = k11.iterator();
        while (it.hasNext()) {
            c next = it.next();
            String str2 = next.f87402a;
            JsonValue z11 = jsonValue.z(str2);
            String str3 = next.f87403b;
            str3.getClass();
            if (str3.equals("object")) {
                n(hVar, str2, z11 == null ? next.f87405d.v() : z11.v());
            } else if (str3.equals("class")) {
                if (z11 == null) {
                    z11 = next.f87405d;
                }
                q2.h hVar2 = new q2.h();
                String str4 = next.f87404c;
                hVar2.h("type", str4);
                hVar.h(str2, hVar2);
                m(str4, hVar2, z11);
            } else {
                if (z11 == null) {
                    z11 = next.f87405d;
                }
                l(hVar, str2, z11.v(), next.f87403b);
            }
        }
    }

    public void n(q2.h hVar, String str, String str2) {
        try {
            this.f87390j.a(new a(Integer.parseInt(str2), hVar, str));
        } catch (Exception e11) {
            throw new GdxRuntimeException("Error parsing property [\" + name + \"] of type \"object\" with value: [" + str2 + "]", e11);
        }
    }

    public void o(String str) {
        this.f87391k = new com.badlogic.gdx.utils.l<>();
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        JsonValue z11 = new com.badlogic.gdx.utils.g().a(b(str)).z("propertyTypes");
        if (z11 == null) {
            return;
        }
        JsonValue.b it = z11.iterator();
        while (it.hasNext()) {
            JsonValue next = it.next();
            if ("class".equals(next.V("type"))) {
                String V = next.V("name");
                JsonValue z12 = next.z("members");
                if (!z12.isEmpty()) {
                    com.badlogic.gdx.utils.a<c> aVar = new com.badlogic.gdx.utils.a<>();
                    this.f87391k.r(V, aVar);
                    JsonValue.b it2 = z12.iterator();
                    while (it2.hasNext()) {
                        JsonValue next2 = it2.next();
                        c cVar = new c();
                        cVar.f87402a = next2.V("name");
                        cVar.f87403b = next2.V("type");
                        cVar.f87404c = next2.W("propertyType", null);
                        cVar.f87405d = next2.z("value");
                        aVar.a(cVar);
                    }
                }
            }
        }
    }

    public abstract f p(v1.a aVar, P p11, q2.a aVar2);
}
