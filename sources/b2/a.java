package b2;

import a3.d;
import androidx.constraintlayout.motion.widget.Key;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.a;
import d2.e;
import d2.f;
import d2.h;
import s1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends g<g.a> {

    /* renamed from: f, reason: collision with root package name */
    public static final short f5666f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final short f5667g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final d f5668d;

    /* renamed from: e, reason: collision with root package name */
    public final Quaternion f5669e;

    public a(d dVar) {
        this(dVar, null);
    }

    @Override // s1.g
    public d2.b m(v1.a aVar, g.a aVar2) {
        return t(aVar);
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [T, com.badlogic.gdx.math.Quaternion] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [T, com.badlogic.gdx.math.Quaternion] */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, com.badlogic.gdx.math.Vector3] */
    /* JADX WARN: Type inference failed for: r9v8, types: [T, com.badlogic.gdx.math.Vector3] */
    public void o(d2.b bVar, JsonValue jsonValue) {
        d2.b bVar2 = bVar;
        JsonValue z11 = jsonValue.z("animations");
        if (z11 == null) {
            return;
        }
        bVar2.f47021f.o(z11.f13160j);
        JsonValue jsonValue2 = z11.f13156f;
        while (jsonValue2 != null) {
            JsonValue z12 = jsonValue2.z("bones");
            if (z12 != null) {
                d2.a aVar = new d2.a();
                bVar2.f47021f.a(aVar);
                aVar.f47015b.o(z12.f13160j);
                aVar.f47014a = jsonValue2.V("id");
                for (JsonValue jsonValue3 = z12.f13156f; jsonValue3 != null; jsonValue3 = jsonValue3.f13158h) {
                    f fVar = new f();
                    aVar.f47015b.a(fVar);
                    fVar.f47036a = jsonValue3.V("boneId");
                    JsonValue z13 = jsonValue3.z("keyframes");
                    float f11 = 0.0f;
                    int i11 = 2;
                    int i12 = 1;
                    int i13 = 0;
                    int i14 = 3;
                    if (z13 == null || !z13.c0()) {
                        JsonValue z14 = jsonValue3.z("translation");
                        if (z14 != null && z14.c0()) {
                            com.badlogic.gdx.utils.a<d2.g<Vector3>> aVar2 = new com.badlogic.gdx.utils.a<>();
                            fVar.f47037b = aVar2;
                            aVar2.o(z14.f13160j);
                            for (JsonValue jsonValue4 = z14.f13156f; jsonValue4 != null; jsonValue4 = jsonValue4.f13158h) {
                                d2.g<Vector3> gVar = new d2.g<>();
                                fVar.f47037b.a(gVar);
                                gVar.f47040a = jsonValue4.M("keytime", 0.0f) / 1000.0f;
                                JsonValue z15 = jsonValue4.z("value");
                                if (z15 != null && z15.f13160j >= 3) {
                                    gVar.f47041b = new Vector3(z15.getFloat(0), z15.getFloat(1), z15.getFloat(2));
                                }
                            }
                        }
                        JsonValue z16 = jsonValue3.z(Key.ROTATION);
                        if (z16 != null && z16.c0()) {
                            com.badlogic.gdx.utils.a<d2.g<Quaternion>> aVar3 = new com.badlogic.gdx.utils.a<>();
                            fVar.f47038c = aVar3;
                            aVar3.o(z16.f13160j);
                            for (JsonValue jsonValue5 = z16.f13156f; jsonValue5 != null; jsonValue5 = jsonValue5.f13158h) {
                                d2.g<Quaternion> gVar2 = new d2.g<>();
                                fVar.f47038c.a(gVar2);
                                gVar2.f47040a = jsonValue5.M("keytime", 0.0f) / 1000.0f;
                                JsonValue z17 = jsonValue5.z("value");
                                if (z17 != null && z17.f13160j >= 4) {
                                    gVar2.f47041b = new Quaternion(z17.getFloat(0), z17.getFloat(1), z17.getFloat(2), z17.getFloat(3));
                                }
                            }
                        }
                        JsonValue z18 = jsonValue3.z("scaling");
                        if (z18 != null && z18.c0()) {
                            com.badlogic.gdx.utils.a<d2.g<Vector3>> aVar4 = new com.badlogic.gdx.utils.a<>();
                            fVar.f47039d = aVar4;
                            aVar4.o(z18.f13160j);
                            for (JsonValue jsonValue6 = z18.f13156f; jsonValue6 != null; jsonValue6 = jsonValue6.f13158h) {
                                d2.g<Vector3> gVar3 = new d2.g<>();
                                fVar.f47039d.a(gVar3);
                                gVar3.f47040a = jsonValue6.M("keytime", 0.0f) / 1000.0f;
                                JsonValue z19 = jsonValue6.z("value");
                                if (z19 != null && z19.f13160j >= 3) {
                                    gVar3.f47041b = new Vector3(z19.getFloat(0), z19.getFloat(1), z19.getFloat(2));
                                }
                            }
                        }
                    } else {
                        JsonValue jsonValue7 = z13.f13156f;
                        while (jsonValue7 != null) {
                            float M = jsonValue7.M("keytime", f11) / 1000.0f;
                            JsonValue z21 = jsonValue7.z("translation");
                            if (z21 != null && z21.f13160j == i14) {
                                if (fVar.f47037b == null) {
                                    fVar.f47037b = new com.badlogic.gdx.utils.a<>();
                                }
                                d2.g<Vector3> gVar4 = new d2.g<>();
                                gVar4.f47040a = M;
                                gVar4.f47041b = new Vector3(z21.getFloat(i13), z21.getFloat(i12), z21.getFloat(i11));
                                fVar.f47037b.a(gVar4);
                            }
                            JsonValue z22 = jsonValue7.z(Key.ROTATION);
                            if (z22 != null && z22.f13160j == 4) {
                                if (fVar.f47038c == null) {
                                    fVar.f47038c = new com.badlogic.gdx.utils.a<>();
                                }
                                d2.g<Quaternion> gVar5 = new d2.g<>();
                                gVar5.f47040a = M;
                                gVar5.f47041b = new Quaternion(z22.getFloat(0), z22.getFloat(i12), z22.getFloat(i11), z22.getFloat(3));
                                fVar.f47038c.a(gVar5);
                            }
                            JsonValue z23 = jsonValue7.z("scale");
                            if (z23 != null && z23.f13160j == 3) {
                                if (fVar.f47039d == null) {
                                    fVar.f47039d = new com.badlogic.gdx.utils.a<>();
                                }
                                d2.g<Vector3> gVar6 = new d2.g<>();
                                gVar6.f47040a = M;
                                gVar6.f47041b = new Vector3(z23.getFloat(0), z23.getFloat(1), z23.getFloat(2));
                                fVar.f47039d.a(gVar6);
                            }
                            jsonValue7 = jsonValue7.f13158h;
                            f11 = 0.0f;
                            i11 = 2;
                            i12 = 1;
                            i13 = 0;
                            i14 = 3;
                        }
                    }
                }
            }
            jsonValue2 = jsonValue2.f13158h;
            bVar2 = bVar;
        }
    }

    public r[] p(JsonValue jsonValue) {
        com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a();
        int i11 = 0;
        int i12 = 0;
        for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
            String v11 = jsonValue2.v();
            if (v11.equals("POSITION")) {
                aVar.a(r.f());
            } else if (v11.equals("NORMAL")) {
                aVar.a(r.e());
            } else if (v11.equals("COLOR")) {
                aVar.a(r.d());
            } else if (v11.equals("COLORPACKED")) {
                aVar.a(r.c());
            } else if (v11.equals("TANGENT")) {
                aVar.a(r.g());
            } else if (v11.equals("BINORMAL")) {
                aVar.a(r.a());
            } else if (v11.startsWith("TEXCOORD")) {
                aVar.a(r.h(i11));
                i11++;
            } else {
                if (!v11.startsWith("BLENDWEIGHT")) {
                    throw new GdxRuntimeException("Unknown vertex attribute '" + v11 + "', should be one of position, normal, uv, tangent or binormal");
                }
                aVar.a(r.b(i12));
                i12++;
            }
        }
        return (r[]) aVar.Q(r.class);
    }

    public com.badlogic.gdx.graphics.b q(JsonValue jsonValue) {
        if (jsonValue.f13160j >= 3) {
            return new com.badlogic.gdx.graphics.b(jsonValue.getFloat(0), jsonValue.getFloat(1), jsonValue.getFloat(2), 1.0f);
        }
        throw new GdxRuntimeException("Expected Color values <> than three.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r14.endsWith("/") != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(d2.b r12, com.badlogic.gdx.utils.JsonValue r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.r(d2.b, com.badlogic.gdx.utils.JsonValue, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s(d2.b bVar, JsonValue jsonValue) {
        JsonValue z11 = jsonValue.z("meshes");
        if (z11 != null) {
            bVar.f47018c.o(z11.f13160j);
            for (JsonValue jsonValue2 = z11.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                d2.c cVar = new d2.c();
                cVar.f47022a = jsonValue2.W("id", "");
                cVar.f47023b = p(jsonValue2.F0("attributes"));
                cVar.f47024c = jsonValue2.F0("vertices").o();
                JsonValue F0 = jsonValue2.F0("parts");
                com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a();
                for (JsonValue jsonValue3 = F0.f13156f; jsonValue3 != null; jsonValue3 = jsonValue3.f13158h) {
                    d2.d dVar = new d2.d();
                    String W = jsonValue3.W("id", null);
                    if (W == null) {
                        throw new GdxRuntimeException("Not id given for mesh part");
                    }
                    a.b it = aVar.iterator();
                    while (it.hasNext()) {
                        if (((d2.d) it.next()).f47026a.equals(W)) {
                            throw new GdxRuntimeException("Mesh part with id '" + W + "' already in defined");
                        }
                    }
                    dVar.f47026a = W;
                    String W2 = jsonValue3.W("type", null);
                    if (W2 == null) {
                        throw new GdxRuntimeException("No primitive type given for mesh part '" + W + "'");
                    }
                    dVar.f47028c = x(W2);
                    dVar.f47027b = jsonValue3.F0("indices").u();
                    aVar.a(dVar);
                }
                cVar.f47025d = (d2.d[]) aVar.Q(d2.d.class);
                bVar.f47018c.a(cVar);
            }
        }
    }

    public d2.b t(v1.a aVar) {
        JsonValue a11 = this.f5668d.a(aVar);
        d2.b bVar = new d2.b();
        JsonValue F0 = a11.F0("version");
        bVar.f47017b[0] = F0.R(0);
        bVar.f47017b[1] = F0.R(1);
        short[] sArr = bVar.f47017b;
        if (sArr[0] != 0 || sArr[1] != 1) {
            throw new GdxRuntimeException("Model version not supported");
        }
        bVar.f47016a = a11.W("id", "");
        s(bVar, a11);
        r(bVar, a11, aVar.B().C());
        u(bVar, a11);
        o(bVar, a11);
        return bVar;
    }

    public com.badlogic.gdx.utils.a<e> u(d2.b bVar, JsonValue jsonValue) {
        JsonValue z11 = jsonValue.z("nodes");
        if (z11 != null) {
            bVar.f47020e.o(z11.f13160j);
            for (JsonValue jsonValue2 = z11.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                bVar.f47020e.a(v(jsonValue2));
            }
        }
        return bVar.f47020e;
    }

    public e v(JsonValue jsonValue) {
        char c11;
        int i11;
        String str;
        String str2;
        int i12;
        int i13;
        e eVar = new e();
        String str3 = null;
        String W = jsonValue.W("id", null);
        if (W == null) {
            throw new GdxRuntimeException("Node id missing.");
        }
        eVar.f47029a = W;
        String str4 = "translation";
        JsonValue z11 = jsonValue.z("translation");
        char c12 = 3;
        if (z11 != null && z11.f13160j != 3) {
            throw new GdxRuntimeException("Node translation incomplete");
        }
        int i14 = 0;
        boolean z12 = true;
        eVar.f47030b = z11 == null ? null : new Vector3(z11.getFloat(0), z11.getFloat(1), z11.getFloat(2));
        String str5 = Key.ROTATION;
        JsonValue z13 = jsonValue.z(Key.ROTATION);
        if (z13 != null && z13.f13160j != 4) {
            throw new GdxRuntimeException("Node rotation incomplete");
        }
        eVar.f47031c = z13 == null ? null : new Quaternion(z13.getFloat(0), z13.getFloat(1), z13.getFloat(2), z13.getFloat(3));
        JsonValue z14 = jsonValue.z("scale");
        if (z14 != null && z14.f13160j != 3) {
            throw new GdxRuntimeException("Node scale incomplete");
        }
        eVar.f47032d = z14 == null ? null : new Vector3(z14.getFloat(0), z14.getFloat(1), z14.getFloat(2));
        String W2 = jsonValue.W("mesh", null);
        if (W2 != null) {
            eVar.f47033e = W2;
        }
        JsonValue z15 = jsonValue.z("parts");
        if (z15 != null) {
            eVar.f47034f = new h[z15.f13160j];
            JsonValue jsonValue2 = z15.f13156f;
            int i15 = 0;
            while (jsonValue2 != null) {
                h hVar = new h();
                String W3 = jsonValue2.W("meshpartid", str3);
                String W4 = jsonValue2.W("materialid", str3);
                if (W3 == null || W4 == null) {
                    throw new GdxRuntimeException("Node " + W + " part is missing meshPartId or materialId");
                }
                hVar.f47042a = W4;
                hVar.f47043b = W3;
                JsonValue z16 = jsonValue2.z("bones");
                if (z16 != null) {
                    hVar.f47044c = new com.badlogic.gdx.utils.b<>(z12, z16.f13160j, String.class, Matrix4.class);
                    JsonValue jsonValue3 = z16.f13156f;
                    while (jsonValue3 != null) {
                        String W5 = jsonValue3.W("node", null);
                        if (W5 == null) {
                            throw new GdxRuntimeException("Bone node ID missing");
                        }
                        Matrix4 matrix4 = new Matrix4();
                        JsonValue z17 = jsonValue3.z(str4);
                        if (z17 == null || z17.f13160j < 3) {
                            str = str4;
                        } else {
                            str = str4;
                            matrix4.translate(z17.getFloat(0), z17.getFloat(1), z17.getFloat(2));
                        }
                        JsonValue z18 = jsonValue3.z(str5);
                        if (z18 == null || z18.f13160j < 4) {
                            str2 = str5;
                            i12 = i15;
                            i13 = 3;
                        } else {
                            str2 = str5;
                            i12 = i15;
                            i13 = 3;
                            matrix4.rotate(this.f5669e.set(z18.getFloat(0), z18.getFloat(1), z18.getFloat(2), z18.getFloat(3)));
                        }
                        JsonValue z19 = jsonValue3.z("scale");
                        if (z19 != null && z19.f13160j >= i13) {
                            matrix4.scale(z19.getFloat(0), z19.getFloat(1), z19.getFloat(2));
                        }
                        hVar.f47044c.x(W5, matrix4);
                        jsonValue3 = jsonValue3.f13158h;
                        str4 = str;
                        str5 = str2;
                        i15 = i12;
                    }
                    i11 = 0;
                    c11 = 3;
                } else {
                    c11 = c12;
                    i11 = i14;
                }
                String str6 = str4;
                String str7 = str5;
                int i16 = i15;
                eVar.f47034f[i16] = hVar;
                jsonValue2 = jsonValue2.f13158h;
                i15 = i16 + 1;
                i14 = i11;
                c12 = c11;
                str4 = str6;
                str5 = str7;
                str3 = null;
                z12 = true;
            }
        }
        int i17 = i14;
        JsonValue z21 = jsonValue.z("children");
        if (z21 != null) {
            eVar.f47035g = new e[z21.f13160j];
            JsonValue jsonValue4 = z21.f13156f;
            int i18 = i17;
            while (jsonValue4 != null) {
                eVar.f47035g[i18] = v(jsonValue4);
                jsonValue4 = jsonValue4.f13158h;
                i18++;
            }
        }
        return eVar;
    }

    public int w(String str) {
        if (str.equalsIgnoreCase("AMBIENT")) {
            return 4;
        }
        if (str.equalsIgnoreCase("BUMP")) {
            return 8;
        }
        if (str.equalsIgnoreCase("DIFFUSE")) {
            return 2;
        }
        if (str.equalsIgnoreCase("EMISSIVE")) {
            return 3;
        }
        if (str.equalsIgnoreCase("NONE")) {
            return 1;
        }
        if (str.equalsIgnoreCase("NORMAL")) {
            return 7;
        }
        if (str.equalsIgnoreCase("REFLECTION")) {
            return 10;
        }
        if (str.equalsIgnoreCase("SHININESS")) {
            return 6;
        }
        if (str.equalsIgnoreCase("SPECULAR")) {
            return 5;
        }
        return str.equalsIgnoreCase("TRANSPARENCY") ? 9 : 0;
    }

    public int x(String str) {
        if (str.equals("TRIANGLES")) {
            return 4;
        }
        if (str.equals("LINES")) {
            return 1;
        }
        if (str.equals("POINTS")) {
            return 0;
        }
        if (str.equals("TRIANGLE_STRIP")) {
            return 5;
        }
        if (str.equals("LINE_STRIP")) {
            return 3;
        }
        throw new GdxRuntimeException("Unknown primitive type '" + str + "', should be one of triangle, trianglestrip, line, linestrip or point");
    }

    public Vector2 y(JsonValue jsonValue, float f11, float f12) {
        if (jsonValue == null) {
            return new Vector2(f11, f12);
        }
        if (jsonValue.f13160j == 2) {
            return new Vector2(jsonValue.getFloat(0), jsonValue.getFloat(1));
        }
        throw new GdxRuntimeException("Expected Vector2 values <> than two.");
    }

    public a(d dVar, s1.e eVar) {
        super(eVar);
        this.f5669e = new Quaternion();
        this.f5668d = dVar;
    }
}
