package w1;

import a3.x0;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends s1.n<g, a> {

    /* renamed from: b, reason: collision with root package name */
    public a f94489b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.math.h f94490c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends r1.c<g> {

        /* renamed from: b, reason: collision with root package name */
        public String f94491b = "i ";

        /* renamed from: c, reason: collision with root package name */
        public int f94492c = 1024;

        /* renamed from: d, reason: collision with root package name */
        public String[] f94493d = {"png", "PNG", "jpeg", "JPEG", "jpg", "JPG", "cim", "CIM", "etc1", "ETC1", "ktx", "KTX", "zktx", "ZKTX"};
    }

    public h() {
        this(new t1.d());
    }

    @Override // s1.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.badlogic.gdx.utils.a<r1.a> a(String str, v1.a aVar, a aVar2) {
        String str2;
        String[] strArr;
        if (aVar2 == null) {
            aVar2 = this.f94489b;
        }
        try {
            BufferedReader K = aVar.K(aVar2.f94492c);
            while (true) {
                String readLine = K.readLine();
                if (readLine == null) {
                    str2 = null;
                    break;
                }
                if (readLine.startsWith(aVar2.f94491b)) {
                    str2 = readLine.substring(aVar2.f94491b.length());
                    break;
                }
            }
            K.close();
            if (str2 == null && (strArr = aVar2.f94493d) != null) {
                for (String str3 : strArr) {
                    v1.a O = aVar.O(aVar.A().concat("." + str3));
                    if (O.l()) {
                        str2 = O.z();
                    }
                }
            }
            if (str2 == null) {
                return null;
            }
            com.badlogic.gdx.utils.a<r1.a> aVar3 = new com.badlogic.gdx.utils.a<>(1);
            aVar3.a(new r1.a(aVar.O(str2), Texture.class));
            return aVar3;
        } catch (IOException e11) {
            throw new GdxRuntimeException("Error reading " + str, e11);
        }
    }

    @Override // s1.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g c(r1.e eVar, String str, v1.a aVar, a aVar2) {
        return f(new o((Texture) eVar.n0(eVar.d1(str).first())), aVar);
    }

    public g f(o oVar, v1.a aVar) {
        String readLine;
        BufferedReader K = aVar.K(256);
        do {
            try {
                try {
                    readLine = K.readLine();
                    if (readLine == null) {
                        x0.a(K);
                        throw new GdxRuntimeException("Polygon shape not found: " + aVar);
                    }
                } catch (IOException e11) {
                    throw new GdxRuntimeException("Error reading polygon shape file: " + aVar, e11);
                }
            } catch (Throwable th2) {
                x0.a(K);
                throw th2;
            }
        } while (!readLine.startsWith("s"));
        String[] split = readLine.substring(1).trim().split(",");
        int length = split.length;
        float[] fArr = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr[i11] = Float.parseFloat(split[i11]);
        }
        g gVar = new g(oVar, fArr, this.f94490c.d(fArr).N());
        x0.a(K);
        return gVar;
    }

    public h(s1.e eVar) {
        super(eVar);
        this.f94489b = new a();
        this.f94490c = new com.badlogic.gdx.math.h();
    }
}
