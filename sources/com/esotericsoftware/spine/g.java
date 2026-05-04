package com.esotericsoftware.spine;

import a3.d0;
import a3.r;
import a3.v;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.SerializationException;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.BoneData;
import com.esotericsoftware.spine.PathConstraintData;
import com.esotericsoftware.spine.attachments.AttachmentType;
import com.esotericsoftware.spine.attachments.Sequence;
import java.io.InputStream;
import jl.n;
import jl.o;
import ol.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends jl.j {

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29449c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29450a;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            f29450a = iArr;
            try {
                iArr[AttachmentType.region.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29450a[AttachmentType.boundingbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29450a[AttachmentType.mesh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29450a[AttachmentType.linkedmesh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29450a[AttachmentType.path.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29450a[AttachmentType.point.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29450a[AttachmentType.clipping.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f29451a;

        /* renamed from: b, reason: collision with root package name */
        public String f29452b;

        /* renamed from: c, reason: collision with root package name */
        public int f29453c;

        /* renamed from: d, reason: collision with root package name */
        public ol.g f29454d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f29455e;

        public b(ol.g gVar, String str, int i11, String str2, boolean z11) {
            this.f29454d = gVar;
            this.f29452b = str;
            this.f29453c = i11;
            this.f29451a = str2;
            this.f29455e = z11;
        }
    }

    public g(ol.c cVar) {
        super(cVar);
        this.f29449c = new com.badlogic.gdx.utils.a<>();
    }

    public static void m(Animation.g gVar, int i11, int i12, int i13, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        gVar.m(i13, i11, i12, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    @Override // jl.j
    public jl.i b(InputStream inputStream) {
        if (inputStream != null) {
            return i(new com.badlogic.gdx.utils.g().b(inputStream));
        }
        throw new IllegalArgumentException("dataInput cannot be null.");
    }

    @Override // jl.j
    public jl.i c(v1.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("file cannot be null.");
        }
        jl.i i11 = i(new com.badlogic.gdx.utils.g().a(aVar));
        i11.f64358a = aVar.A();
        return i11;
    }

    public final void e(JsonValue jsonValue, String str, jl.i iVar) {
        jl.i iVar2;
        float f11;
        int[] iArr;
        h hVar;
        JsonValue jsonValue2;
        n nVar;
        JsonValue jsonValue3;
        ol.b bVar;
        JsonValue jsonValue4;
        String str2;
        JsonValue jsonValue5;
        ol.b bVar2;
        JsonValue jsonValue6;
        n nVar2;
        float[] fArr;
        float[] fArr2;
        JsonValue jsonValue7;
        JsonValue jsonValue8;
        JsonValue jsonValue9;
        JsonValue jsonValue10;
        ol.b bVar3;
        JsonValue jsonValue11;
        float f12;
        String str3;
        int i11;
        n nVar3;
        int i12;
        int i13;
        Object obj;
        Animation.e tVar;
        PathConstraintData pathConstraintData;
        int i14;
        JsonValue jsonValue12;
        Object obj2;
        String str4;
        JsonValue jsonValue13;
        Object obj3;
        Animation.m mVar;
        String str5;
        JsonValue jsonValue14;
        JsonValue jsonValue15;
        String str6;
        PathConstraintData pathConstraintData2;
        Animation.m mVar2;
        String str7;
        String str8;
        float f13;
        float f14;
        Object obj4;
        JsonValue jsonValue16;
        float f15;
        Animation.n0 n0Var;
        String str9;
        String str10;
        String str11;
        float f16;
        float f17;
        JsonValue jsonValue17;
        int i15;
        float f18;
        float f19;
        float f21;
        Animation.n0 n0Var2;
        String str12;
        Animation.k kVar;
        String str13;
        Animation.k kVar2;
        JsonValue jsonValue18;
        float f22;
        String str14;
        String str15;
        float f23;
        int i16;
        float f24;
        JsonValue jsonValue19;
        String str16;
        float f25;
        String str17;
        String str18;
        float f26;
        JsonValue jsonValue20;
        n nVar4;
        String str19;
        Animation.z zVar;
        com.badlogic.gdx.utils.a aVar;
        JsonValue jsonValue21;
        float f27;
        float f28;
        float f29;
        float f31;
        float f32;
        float f33;
        com.badlogic.gdx.utils.a aVar2;
        float f34;
        JsonValue jsonValue22;
        String str20;
        String str21;
        Animation.a0 a0Var;
        String str22;
        JsonValue jsonValue23;
        String str23;
        String str24;
        float f35;
        float f36;
        float f37;
        float f38;
        float f39;
        Animation.a0 a0Var2;
        com.badlogic.gdx.utils.a aVar3;
        int i17;
        String str25;
        JsonValue jsonValue24;
        float f41;
        String str26;
        float f42;
        float f43;
        int i18;
        Animation.b0 b0Var;
        JsonValue jsonValue25;
        String str27;
        JsonValue jsonValue26;
        String str28;
        int i19;
        String str29;
        float f44;
        float f45;
        String str30;
        n nVar5;
        JsonValue jsonValue27;
        float f46;
        Animation.b0 b0Var2;
        g gVar = this;
        jl.i iVar3 = iVar;
        float f47 = gVar.f64380b;
        com.badlogic.gdx.utils.a aVar4 = new com.badlogic.gdx.utils.a();
        JsonValue I = jsonValue.I("slots");
        while (true) {
            String str31 = "name";
            String str32 = "Slot not found: ";
            String str33 = "curve";
            String str34 = "time";
            float f48 = 0.0f;
            if (I == null) {
                String str35 = "name";
                String str36 = "curve";
                float f49 = f47;
                boolean z11 = true;
                JsonValue I2 = jsonValue.I("bones");
                while (I2 != null) {
                    BoneData b11 = iVar.b(I2.f13155e);
                    if (b11 == null) {
                        throw new SerializationException("Bone not found: " + I2.f13155e);
                    }
                    JsonValue jsonValue28 = I2.f13156f;
                    while (jsonValue28 != null) {
                        JsonValue jsonValue29 = jsonValue28.f13156f;
                        if (jsonValue29 == null) {
                            str16 = str32;
                        } else {
                            int i21 = jsonValue28.f13160j;
                            String str37 = jsonValue28.f13155e;
                            if (str37.equals("rotate")) {
                                aVar4.a(gVar.j(jsonValue29, new Animation.d0(i21, i21, b11.f29164a), 0.0f, 1.0f));
                                str16 = str32;
                            } else {
                                if (str37.equals("translate")) {
                                    str16 = str32;
                                    float f51 = f49;
                                    f25 = f51;
                                    aVar4.a(gVar.k(jsonValue29, new Animation.o0(i21, i21 << 1, b11.f29164a), "x", "y", 0.0f, f51));
                                } else {
                                    str16 = str32;
                                    f25 = f49;
                                    if (str37.equals("translatex")) {
                                        aVar4.a(gVar.j(jsonValue29, new Animation.p0(i21, i21, b11.f29164a), 0.0f, f25));
                                    } else if (str37.equals("translatey")) {
                                        aVar4.a(gVar.j(jsonValue29, new Animation.q0(i21, i21, b11.f29164a), 0.0f, f25));
                                    } else if (str37.equals("scale")) {
                                        f49 = f25;
                                        aVar4.a(gVar.k(jsonValue29, new Animation.e0(i21, i21 << 1, b11.f29164a), "x", "y", 1.0f, 1.0f));
                                    } else {
                                        f49 = f25;
                                        if (str37.equals("scalex")) {
                                            aVar4.a(gVar.j(jsonValue29, new Animation.f0(i21, i21, b11.f29164a), 1.0f, 1.0f));
                                        } else if (str37.equals("scaley")) {
                                            aVar4.a(gVar.j(jsonValue29, new Animation.g0(i21, i21, b11.f29164a), 1.0f, 1.0f));
                                        } else if (str37.equals(TtmlNode.ATTR_TTS_SHEAR)) {
                                            aVar4.a(gVar.k(jsonValue29, new Animation.i0(i21, i21 << 1, b11.f29164a), "x", "y", 0.0f, 1.0f));
                                        } else if (str37.equals("shearx")) {
                                            aVar4.a(gVar.j(jsonValue29, new Animation.j0(i21, i21, b11.f29164a), 0.0f, 1.0f));
                                        } else {
                                            float f52 = 0.0f;
                                            if (str37.equals("sheary")) {
                                                aVar4.a(gVar.j(jsonValue29, new Animation.k0(i21, i21, b11.f29164a), 0.0f, 1.0f));
                                            } else {
                                                if (!str37.equals("inherit")) {
                                                    throw new RuntimeException("Invalid timeline type for a bone: " + str37 + " (" + I2.f13155e + pn.j.f81007d);
                                                }
                                                Animation.l lVar = new Animation.l(i21, b11.f29164a);
                                                int i22 = 0;
                                                while (jsonValue29 != null) {
                                                    lVar.k(i22, jsonValue29.M("time", f52), BoneData.Inherit.valueOf(jsonValue29.W("inherit", BoneData.Inherit.normal.name())));
                                                    jsonValue29 = jsonValue29.f13158h;
                                                    i22++;
                                                    f52 = 0.0f;
                                                }
                                                aVar4.a(lVar);
                                            }
                                        }
                                    }
                                }
                                f49 = f25;
                            }
                        }
                        jsonValue28 = jsonValue28.f13158h;
                        str32 = str16;
                    }
                    I2 = I2.f13158h;
                    str32 = str32;
                }
                jl.i iVar4 = iVar;
                String str38 = str32;
                float f53 = 1.0f;
                JsonValue I3 = jsonValue.I("ik");
                while (true) {
                    String str39 = "mix";
                    if (I3 == null) {
                        break;
                    }
                    JsonValue jsonValue30 = I3.f13156f;
                    if (jsonValue30 != null) {
                        jl.e d11 = iVar4.d(I3.f13155e);
                        int i23 = I3.f13160j;
                        boolean z12 = z11;
                        Animation.k kVar3 = new Animation.k(i23, i23 << 1, iVar4.r().q(d11, z12));
                        float M = jsonValue30.M("time", 0.0f);
                        float M2 = jsonValue30.M("mix", f53);
                        float M3 = jsonValue30.M("softness", 0.0f) * f49;
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            int i26 = i24;
                            kVar = kVar3;
                            kVar.r(i26, M, M2, M3, jsonValue30.B("bendPositive", z12) ? 1 : -1, jsonValue30.B("compress", false), jsonValue30.B("stretch", false));
                            float f54 = M;
                            JsonValue jsonValue31 = jsonValue30.f13158h;
                            if (jsonValue31 == null) {
                                break;
                            }
                            float M4 = jsonValue31.M("time", 0.0f);
                            float M5 = jsonValue31.M(str39, f53);
                            float M6 = jsonValue31.M("softness", 0.0f) * f49;
                            JsonValue z13 = jsonValue30.z(str36);
                            if (z13 != null) {
                                f22 = M4;
                                str13 = str39;
                                kVar2 = kVar;
                                jsonValue18 = jsonValue31;
                                str14 = str36;
                                str15 = str38;
                                i16 = i26;
                                f24 = 1.0f;
                                jsonValue19 = I3;
                                int g11 = gVar.g(z13, kVar2, i25, i16, 0, f54, f22, M2, M5, 1.0f);
                                M2 = M5;
                                f23 = M6;
                                i25 = g(z13, kVar2, g11, i16, 1, f54, f22, M3, f23, f49);
                            } else {
                                str13 = str39;
                                kVar2 = kVar;
                                jsonValue18 = jsonValue31;
                                f22 = M4;
                                str14 = str36;
                                str15 = str38;
                                M2 = M5;
                                f23 = M6;
                                i16 = i26;
                                f24 = 1.0f;
                                jsonValue19 = I3;
                            }
                            i24 = i16 + 1;
                            gVar = this;
                            kVar3 = kVar2;
                            M = f22;
                            M3 = f23;
                            f53 = f24;
                            I3 = jsonValue19;
                            jsonValue30 = jsonValue18;
                            str36 = str14;
                            str38 = str15;
                            str39 = str13;
                            z12 = true;
                        }
                        kVar.p(i25);
                        aVar4.a(kVar);
                    }
                    I3 = I3.f13158h;
                    z11 = true;
                }
                Object obj5 = "mix";
                String str40 = str36;
                String str41 = str38;
                float f55 = f53;
                JsonValue I4 = jsonValue.I("transform");
                while (true) {
                    String str42 = "mixY";
                    String str43 = "mixX";
                    String str44 = "mixRotate";
                    if (I4 == null) {
                        break;
                    }
                    JsonValue jsonValue32 = I4.f13156f;
                    if (jsonValue32 == null) {
                        f15 = f55;
                    } else {
                        o i27 = iVar4.i(I4.f13155e);
                        int i28 = I4.f13160j;
                        Animation.n0 n0Var3 = new Animation.n0(i28, i28 * 6, iVar4.z().q(i27, true));
                        float M7 = jsonValue32.M("time", 0.0f);
                        float M8 = jsonValue32.M("mixRotate", f55);
                        float M9 = jsonValue32.M("mixX", f55);
                        float M10 = jsonValue32.M("mixY", M9);
                        float M11 = jsonValue32.M("mixScaleX", f55);
                        float M12 = jsonValue32.M("mixScaleY", M11);
                        Animation.n0 n0Var4 = n0Var3;
                        f15 = 1.0f;
                        float M13 = jsonValue32.M("mixShearY", 1.0f);
                        float f56 = M8;
                        float f57 = M9;
                        float f58 = M10;
                        float f59 = M11;
                        float f61 = M12;
                        float f62 = M7;
                        int i29 = 0;
                        int i31 = 0;
                        while (true) {
                            n0Var4.r(i31, f62, f56, f57, f58, f59, f61, M13);
                            n0Var = n0Var4;
                            int i32 = i31;
                            float f63 = f62;
                            float f64 = f56;
                            float f65 = f57;
                            float f66 = f58;
                            float f67 = f59;
                            float f68 = f61;
                            float f69 = M13;
                            JsonValue jsonValue33 = jsonValue32.f13158h;
                            if (jsonValue33 == null) {
                                break;
                            }
                            JsonValue jsonValue34 = I4;
                            float M14 = jsonValue33.M("time", 0.0f);
                            int i33 = i29;
                            float M15 = jsonValue33.M(str44, f15);
                            float M16 = jsonValue33.M(str43, f15);
                            float M17 = jsonValue33.M(str42, M16);
                            float M18 = jsonValue33.M("mixScaleX", f15);
                            float M19 = jsonValue33.M("mixScaleY", M18);
                            float M20 = jsonValue33.M("mixShearY", 1.0f);
                            String str45 = str40;
                            JsonValue z14 = jsonValue32.z(str45);
                            if (z14 != null) {
                                jsonValue17 = jsonValue33;
                                str12 = str42;
                                i15 = i32;
                                str11 = str44;
                                f16 = M16;
                                str9 = str45;
                                str10 = str43;
                                n0Var2 = n0Var;
                                f17 = M15;
                                int g12 = g(z14, n0Var2, g(z14, n0Var2, g(z14, n0Var2, i33, i15, 0, f63, M14, f64, M15, 1.0f), i15, 1, f63, M14, f65, f16, 1.0f), i15, 2, f63, M14, f66, M17, 1.0f);
                                f18 = M17;
                                int g13 = g(z14, n0Var2, g(z14, n0Var2, g12, i15, 3, f63, M14, f67, M18, 1.0f), i15, 4, f63, M14, f68, M19, 1.0f);
                                f19 = M19;
                                f21 = M20;
                                i29 = g(z14, n0Var2, g13, i15, 5, f63, M14, f69, f21, 1.0f);
                            } else {
                                str9 = str45;
                                str10 = str43;
                                str11 = str44;
                                f16 = M16;
                                f17 = M15;
                                jsonValue17 = jsonValue33;
                                i15 = i32;
                                f18 = M17;
                                f19 = M19;
                                f21 = M20;
                                n0Var2 = n0Var;
                                str12 = str42;
                                i29 = i33;
                            }
                            i31 = i15 + 1;
                            n0Var4 = n0Var2;
                            f62 = M14;
                            M13 = f21;
                            str44 = str11;
                            f57 = f16;
                            f58 = f18;
                            f61 = f19;
                            jsonValue32 = jsonValue17;
                            I4 = jsonValue34;
                            str42 = str12;
                            f59 = M18;
                            str43 = str10;
                            f56 = f17;
                            str40 = str9;
                            f15 = 1.0f;
                        }
                        n0Var.p(i29);
                        aVar4.a(n0Var);
                    }
                    I4 = I4.f13158h;
                    f55 = f15;
                }
                g gVar2 = this;
                String str46 = "mixY";
                String str47 = "mixX";
                String str48 = "mixRotate";
                String str49 = str40;
                JsonValue I5 = jsonValue.I("path");
                while (I5 != null) {
                    PathConstraintData e11 = iVar4.e(I5.f13155e);
                    if (e11 == null) {
                        throw new SerializationException("Path constraint not found: " + I5.f13155e);
                    }
                    int q11 = iVar4.f64367j.q(e11, true);
                    JsonValue jsonValue35 = I5.f13156f;
                    while (jsonValue35 != null) {
                        JsonValue jsonValue36 = jsonValue35.f13156f;
                        if (jsonValue36 != null) {
                            int i34 = jsonValue35.f13160j;
                            String str50 = jsonValue35.f13155e;
                            if (str50.equals("position")) {
                                aVar4.a(gVar2.j(jsonValue36, new Animation.n(i34, i34, q11), 0.0f, e11.f29182f == PathConstraintData.PositionMode.fixed ? f49 : 1.0f));
                            } else if (str50.equals("spacing")) {
                                Animation.e oVar = new Animation.o(i34, i34, q11);
                                PathConstraintData.SpacingMode spacingMode = e11.f29183g;
                                aVar4.a(gVar2.j(jsonValue36, oVar, 0.0f, (spacingMode == PathConstraintData.SpacingMode.length || spacingMode == PathConstraintData.SpacingMode.fixed) ? f49 : 1.0f));
                            } else {
                                Object obj6 = obj5;
                                if (str50.equals(obj6)) {
                                    Animation.m mVar3 = new Animation.m(i34, i34 * 3, q11);
                                    float M21 = jsonValue36.M("time", 0.0f);
                                    float M22 = jsonValue36.M(str48, 1.0f);
                                    String str51 = str47;
                                    float M23 = jsonValue36.M(str51, 1.0f);
                                    String str52 = str46;
                                    float M24 = jsonValue36.M(str52, M23);
                                    float f71 = M23;
                                    int i35 = q11;
                                    float f72 = M21;
                                    float f73 = M22;
                                    float f74 = M24;
                                    int i36 = 0;
                                    int i37 = 0;
                                    Animation.m mVar4 = mVar3;
                                    while (true) {
                                        mVar4.r(i37, f72, f73, f71, f74);
                                        jsonValue13 = jsonValue35;
                                        obj3 = obj6;
                                        mVar = mVar4;
                                        int i38 = i37;
                                        float f75 = f72;
                                        float f76 = f73;
                                        float f77 = f71;
                                        float f78 = f74;
                                        JsonValue jsonValue37 = jsonValue36.f13158h;
                                        if (jsonValue37 == null) {
                                            break;
                                        }
                                        int i39 = i35;
                                        float M25 = jsonValue37.M("time", 0.0f);
                                        float M26 = jsonValue37.M(str48, 1.0f);
                                        String str53 = str48;
                                        float M27 = jsonValue37.M(str51, 1.0f);
                                        float M28 = jsonValue37.M(str52, M27);
                                        String str54 = str49;
                                        JsonValue z15 = jsonValue36.z(str54);
                                        if (z15 != null) {
                                            str8 = str52;
                                            pathConstraintData2 = e11;
                                            mVar2 = mVar;
                                            jsonValue14 = jsonValue37;
                                            jsonValue15 = jsonValue13;
                                            str6 = str54;
                                            str7 = str51;
                                            f13 = M27;
                                            jsonValue16 = I5;
                                            obj4 = obj3;
                                            f14 = M28;
                                            i36 = g(z15, mVar2, g(z15, mVar2, g(z15, mVar2, i36, i38, 0, f75, M25, f76, M26, 1.0f), i38, 1, f75, M25, f77, f13, 1.0f), i38, 2, f75, M25, f78, f14, 1.0f);
                                        } else {
                                            jsonValue14 = jsonValue37;
                                            jsonValue15 = jsonValue13;
                                            str6 = str54;
                                            pathConstraintData2 = e11;
                                            mVar2 = mVar;
                                            str7 = str51;
                                            str8 = str52;
                                            f13 = M27;
                                            f14 = M28;
                                            obj4 = obj3;
                                            jsonValue16 = I5;
                                        }
                                        PathConstraintData pathConstraintData3 = pathConstraintData2;
                                        mVar4 = mVar2;
                                        e11 = pathConstraintData3;
                                        f72 = M25;
                                        i37 = i38 + 1;
                                        I5 = jsonValue16;
                                        jsonValue35 = jsonValue15;
                                        i35 = i39;
                                        jsonValue36 = jsonValue14;
                                        f73 = M26;
                                        str48 = str53;
                                        str52 = str8;
                                        f71 = f13;
                                        obj6 = obj4;
                                        str49 = str6;
                                        f74 = f14;
                                        str51 = str7;
                                    }
                                    mVar.p(i36);
                                    aVar4.a(mVar);
                                    i14 = i35;
                                    pathConstraintData = e11;
                                    jsonValue12 = jsonValue13;
                                    str47 = str51;
                                    str46 = str52;
                                    str4 = str48;
                                    obj2 = obj3;
                                    str5 = str49;
                                    gVar2 = this;
                                    JsonValue jsonValue38 = I5;
                                    jsonValue35 = jsonValue12.f13158h;
                                    I5 = jsonValue38;
                                    e11 = pathConstraintData;
                                    q11 = i14;
                                    str48 = str4;
                                    obj5 = obj2;
                                    str49 = str5;
                                } else {
                                    pathConstraintData = e11;
                                    i14 = q11;
                                    jsonValue12 = jsonValue35;
                                    obj2 = obj6;
                                    str4 = str48;
                                    str5 = str49;
                                    JsonValue jsonValue382 = I5;
                                    jsonValue35 = jsonValue12.f13158h;
                                    I5 = jsonValue382;
                                    e11 = pathConstraintData;
                                    q11 = i14;
                                    str48 = str4;
                                    obj5 = obj2;
                                    str49 = str5;
                                }
                            }
                        }
                        pathConstraintData = e11;
                        i14 = q11;
                        jsonValue12 = jsonValue35;
                        str4 = str48;
                        obj2 = obj5;
                        str5 = str49;
                        JsonValue jsonValue3822 = I5;
                        jsonValue35 = jsonValue12.f13158h;
                        I5 = jsonValue3822;
                        e11 = pathConstraintData;
                        q11 = i14;
                        str48 = str4;
                        obj5 = obj2;
                        str49 = str5;
                    }
                    I5 = I5.f13158h;
                    iVar4 = iVar;
                    str48 = str48;
                }
                Object obj7 = obj5;
                String str55 = str49;
                for (JsonValue I6 = jsonValue.I("physics"); I6 != null; I6 = I6.f13158h) {
                    if (I6.f13155e.isEmpty()) {
                        i13 = -1;
                    } else {
                        jl.f f79 = iVar.f(I6.f13155e);
                        if (f79 == null) {
                            throw new SerializationException("Physics constraint not found: " + I6.f13155e);
                        }
                        i13 = iVar.f64368k.q(f79, true);
                    }
                    JsonValue jsonValue39 = I6.f13156f;
                    while (jsonValue39 != null) {
                        JsonValue jsonValue40 = jsonValue39.f13156f;
                        if (jsonValue40 != null) {
                            int i41 = jsonValue39.f13160j;
                            String str56 = jsonValue39.f13155e;
                            if (str56.equals("reset")) {
                                Animation.u uVar = new Animation.u(i41, i13);
                                int i42 = 0;
                                while (jsonValue40 != null) {
                                    uVar.l(i42, jsonValue40.M("time", 0.0f));
                                    jsonValue40 = jsonValue40.f13158h;
                                    i42++;
                                }
                                aVar4.a(uVar);
                            } else {
                                if (str56.equals("inertia")) {
                                    tVar = new Animation.r(i41, i41, i13);
                                } else if (str56.equals("strength")) {
                                    tVar = new Animation.v(i41, i41, i13);
                                } else if (str56.equals("damping")) {
                                    tVar = new Animation.p(i41, i41, i13);
                                } else if (str56.equals("mass")) {
                                    tVar = new Animation.s(i41, i41, i13);
                                } else if (str56.equals("wind")) {
                                    tVar = new Animation.x(i41, i41, i13);
                                } else if (str56.equals("gravity")) {
                                    tVar = new Animation.q(i41, i41, i13);
                                } else {
                                    obj = obj7;
                                    if (str56.equals(obj)) {
                                        tVar = new Animation.t(i41, i41, i13);
                                        aVar4.a(gVar2.j(jsonValue40, tVar, 0.0f, 1.0f));
                                        jsonValue39 = jsonValue39.f13158h;
                                        obj7 = obj;
                                    } else {
                                        jsonValue39 = jsonValue39.f13158h;
                                        obj7 = obj;
                                    }
                                }
                                obj = obj7;
                                aVar4.a(gVar2.j(jsonValue40, tVar, 0.0f, 1.0f));
                                jsonValue39 = jsonValue39.f13158h;
                                obj7 = obj;
                            }
                        }
                        obj = obj7;
                        jsonValue39 = jsonValue39.f13158h;
                        obj7 = obj;
                    }
                }
                jl.i iVar5 = iVar;
                JsonValue I7 = jsonValue.I("attachments");
                while (I7 != null) {
                    h g14 = iVar5.g(I7.f13155e);
                    if (g14 == null) {
                        throw new SerializationException("Skin not found: " + I7.f13155e);
                    }
                    JsonValue jsonValue41 = I7.f13156f;
                    while (jsonValue41 != null) {
                        n h11 = iVar5.h(jsonValue41.f13155e);
                        if (h11 == null) {
                            throw new SerializationException(str41 + jsonValue41.f13155e);
                        }
                        JsonValue jsonValue42 = jsonValue41.f13156f;
                        while (jsonValue42 != null) {
                            ol.b e12 = g14.e(h11.f64415a, jsonValue42.f13155e);
                            if (e12 == null) {
                                throw new SerializationException("Timeline attachment not found: " + jsonValue42.f13155e);
                            }
                            JsonValue jsonValue43 = jsonValue42.f13156f;
                            while (jsonValue43 != null) {
                                JsonValue jsonValue44 = jsonValue43.f13156f;
                                int i43 = jsonValue43.f13160j;
                                String str57 = jsonValue43.f13155e;
                                if (str57.equals("deform")) {
                                    l lVar2 = (l) e12;
                                    boolean z16 = lVar2.k() != null;
                                    float[] n11 = lVar2.n();
                                    int length = n11.length;
                                    if (z16) {
                                        length = (length / 3) << 1;
                                    }
                                    JsonValue jsonValue45 = jsonValue41;
                                    hVar = g14;
                                    Animation.h hVar2 = new Animation.h(i43, i43, h11.f64415a, lVar2);
                                    float M29 = jsonValue44.M("time", 0.0f);
                                    n nVar6 = h11;
                                    JsonValue jsonValue46 = jsonValue42;
                                    int i44 = 0;
                                    int i45 = 0;
                                    while (true) {
                                        JsonValue z17 = jsonValue44.z("vertices");
                                        if (z17 == null) {
                                            fArr2 = z16 ? new float[length] : n11;
                                            bVar2 = e12;
                                            jsonValue6 = jsonValue43;
                                            nVar2 = nVar6;
                                            fArr = n11;
                                        } else {
                                            bVar2 = e12;
                                            float[] fArr3 = new float[length];
                                            jsonValue6 = jsonValue43;
                                            nVar2 = nVar6;
                                            int O = jsonValue44.O("offset", 0);
                                            fArr = n11;
                                            pl.g.a(z17.o(), 0, fArr3, O, z17.f13160j);
                                            if (f49 != 1.0f) {
                                                int i46 = z17.f13160j + O;
                                                while (O < i46) {
                                                    fArr3[O] = fArr3[O] * f49;
                                                    O++;
                                                }
                                            }
                                            if (!z16) {
                                                for (int i47 = 0; i47 < length; i47++) {
                                                    fArr3[i47] = fArr3[i47] + fArr[i47];
                                                }
                                            }
                                            fArr2 = fArr3;
                                        }
                                        hVar2.t(i45, M29, fArr2);
                                        JsonValue jsonValue47 = jsonValue44.f13158h;
                                        if (jsonValue47 == null) {
                                            break;
                                        }
                                        float M30 = jsonValue47.M("time", 0.0f);
                                        String str58 = str55;
                                        JsonValue z18 = jsonValue44.z(str58);
                                        if (z18 != null) {
                                            str3 = str58;
                                            f12 = M30;
                                            i11 = i45;
                                            JsonValue jsonValue48 = jsonValue46;
                                            jsonValue7 = I7;
                                            jsonValue8 = jsonValue6;
                                            jsonValue9 = jsonValue48;
                                            JsonValue jsonValue49 = jsonValue45;
                                            jsonValue10 = jsonValue47;
                                            bVar3 = bVar2;
                                            jsonValue11 = jsonValue49;
                                            nVar3 = nVar2;
                                            i12 = length;
                                            i44 = g(z18, hVar2, i44, i11, 0, M29, f12, 0.0f, 1.0f, 1.0f);
                                        } else {
                                            JsonValue jsonValue50 = jsonValue46;
                                            jsonValue7 = I7;
                                            jsonValue8 = jsonValue6;
                                            jsonValue9 = jsonValue50;
                                            JsonValue jsonValue51 = jsonValue45;
                                            jsonValue10 = jsonValue47;
                                            bVar3 = bVar2;
                                            jsonValue11 = jsonValue51;
                                            f12 = M30;
                                            str3 = str58;
                                            i11 = i45;
                                            nVar3 = nVar2;
                                            i12 = length;
                                        }
                                        i45 = i11 + 1;
                                        M29 = f12;
                                        jsonValue43 = jsonValue8;
                                        nVar6 = nVar3;
                                        e12 = bVar3;
                                        jsonValue44 = jsonValue10;
                                        I7 = jsonValue7;
                                        jsonValue45 = jsonValue11;
                                        jsonValue46 = jsonValue9;
                                        length = i12;
                                        n11 = fArr;
                                        str55 = str3;
                                    }
                                    hVar2.p(i44);
                                    aVar4.a(hVar2);
                                    JsonValue jsonValue52 = jsonValue46;
                                    jsonValue4 = I7;
                                    jsonValue5 = jsonValue6;
                                    jsonValue3 = jsonValue52;
                                    bVar = bVar2;
                                    nVar = nVar2;
                                    str2 = str55;
                                    jsonValue2 = jsonValue45;
                                } else {
                                    hVar = g14;
                                    jsonValue2 = jsonValue41;
                                    nVar = h11;
                                    jsonValue3 = jsonValue42;
                                    bVar = e12;
                                    jsonValue4 = I7;
                                    str2 = str55;
                                    jsonValue5 = jsonValue43;
                                    if (str57.equals("sequence")) {
                                        Animation.h0 h0Var = new Animation.h0(i43, nVar.f64415a, bVar);
                                        int i48 = 0;
                                        float f81 = 0.0f;
                                        while (jsonValue44 != null) {
                                            f81 = jsonValue44.M("delay", f81);
                                            h0Var.l(i48, jsonValue44.M("time", 0.0f), Sequence.SequenceMode.valueOf(jsonValue44.W("mode", "hold")), jsonValue44.O("index", 0), f81);
                                            jsonValue44 = jsonValue44.f13158h;
                                            i48++;
                                        }
                                        aVar4.a(h0Var);
                                    }
                                }
                                jsonValue43 = jsonValue5.f13158h;
                                h11 = nVar;
                                e12 = bVar;
                                g14 = hVar;
                                I7 = jsonValue4;
                                jsonValue41 = jsonValue2;
                                jsonValue42 = jsonValue3;
                                str55 = str2;
                            }
                            jsonValue42 = jsonValue42.f13158h;
                        }
                        jsonValue41 = jsonValue41.f13158h;
                        iVar5 = iVar;
                    }
                    I7 = I7.f13158h;
                    iVar5 = iVar;
                }
                int i49 = 0;
                JsonValue z19 = jsonValue.z("drawOrder");
                if (z19 != null) {
                    Animation.i iVar6 = new Animation.i(z19.f13160j);
                    iVar2 = iVar;
                    int i51 = iVar2.f64360c.f13179b;
                    JsonValue jsonValue53 = z19.f13156f;
                    int i52 = 0;
                    while (jsonValue53 != null) {
                        JsonValue z21 = jsonValue53.z("offsets");
                        if (z21 != null) {
                            iArr = new int[i51];
                            int i53 = i51 - 1;
                            for (int i54 = i53; i54 >= 0; i54--) {
                                iArr[i54] = -1;
                            }
                            int[] iArr2 = new int[i51 - z21.f13160j];
                            JsonValue jsonValue54 = z21.f13156f;
                            int i55 = i49;
                            int i56 = i55;
                            while (jsonValue54 != null) {
                                n h12 = iVar2.h(jsonValue54.V("slot"));
                                if (h12 == null) {
                                    throw new SerializationException(str41 + jsonValue54.V("slot"));
                                }
                                while (i55 != h12.f64415a) {
                                    iArr2[i56] = i55;
                                    i56++;
                                    i55++;
                                }
                                iArr[jsonValue54.N("offset") + i55] = i55;
                                jsonValue54 = jsonValue54.f13158h;
                                i55++;
                            }
                            while (i55 < i51) {
                                iArr2[i56] = i55;
                                i56++;
                                i55++;
                            }
                            while (i53 >= 0) {
                                if (iArr[i53] == -1) {
                                    i56--;
                                    iArr[i53] = iArr2[i56];
                                }
                                i53--;
                            }
                        } else {
                            iArr = null;
                        }
                        iVar6.l(i52, jsonValue53.M("time", 0.0f), iArr);
                        jsonValue53 = jsonValue53.f13158h;
                        i52++;
                        i49 = 0;
                    }
                    aVar4.a(iVar6);
                } else {
                    iVar2 = iVar;
                }
                JsonValue z22 = jsonValue.z("events");
                if (z22 != null) {
                    Animation.j jVar = new Animation.j(z22.f13160j);
                    JsonValue jsonValue55 = z22.f13156f;
                    int i57 = 0;
                    while (jsonValue55 != null) {
                        String str59 = str35;
                        jl.d c11 = iVar2.c(jsonValue55.V(str59));
                        if (c11 == null) {
                            throw new SerializationException("Event not found: " + jsonValue55.V(str59));
                        }
                        jl.c cVar = new jl.c(jsonValue55.M("time", 0.0f), c11);
                        cVar.f64307b = jsonValue55.O("int", c11.f64314b);
                        cVar.f64308c = jsonValue55.M(TypedValues.Custom.S_FLOAT, c11.f64315c);
                        cVar.f64309d = jsonValue55.W(TypedValues.Custom.S_STRING, c11.f64316d);
                        if (cVar.b().f64317e != null) {
                            cVar.f64310e = jsonValue55.M("volume", c11.f64318f);
                            cVar.f64311f = jsonValue55.M("balance", c11.f64319g);
                        }
                        jVar.l(i57, cVar);
                        jsonValue55 = jsonValue55.f13158h;
                        i57++;
                        str35 = str59;
                    }
                    f11 = 0.0f;
                    aVar4.a(jVar);
                } else {
                    f11 = 0.0f;
                }
                aVar4.M();
                Object[] objArr = aVar4.f13178a;
                int i58 = aVar4.f13179b;
                float f82 = f11;
                for (int i59 = 0; i59 < i58; i59++) {
                    f82 = Math.max(f82, ((Animation.m0) objArr[i59]).d());
                }
                iVar2.f64364g.a(new Animation(str, aVar4, f82));
                return;
            }
            n h13 = iVar3.h(I.f13155e);
            if (h13 == null) {
                throw new SerializationException("Slot not found: " + I.f13155e);
            }
            JsonValue jsonValue56 = I.f13156f;
            while (jsonValue56 != null) {
                JsonValue jsonValue57 = jsonValue56.f13156f;
                if (jsonValue57 == null) {
                    str17 = str31;
                    str19 = str33;
                    str18 = str34;
                    jsonValue21 = jsonValue56;
                    f26 = f47;
                    aVar = aVar4;
                    jsonValue20 = I;
                } else {
                    int i61 = jsonValue56.f13160j;
                    String str60 = jsonValue56.f13155e;
                    if (str60.equals("attachment")) {
                        Animation.c cVar2 = new Animation.c(i61, h13.f64415a);
                        int i62 = 0;
                        while (jsonValue57 != null) {
                            cVar2.m(i62, jsonValue57.M(str34, f48), jsonValue57.W(str31, null));
                            jsonValue57 = jsonValue57.f13158h;
                            i62++;
                            f48 = 0.0f;
                        }
                        aVar4.a(cVar2);
                        str17 = str31;
                        str19 = str33;
                        str18 = str34;
                        jsonValue21 = jsonValue56;
                        f26 = f47;
                        aVar = aVar4;
                        jsonValue20 = I;
                    } else {
                        boolean equals = str60.equals("rgba");
                        String str61 = "color";
                        if (equals) {
                            Animation.b0 b0Var3 = new Animation.b0(i61, i61 << 2, h13.f64415a);
                            float M31 = jsonValue57.M(str34, 0.0f);
                            String V = jsonValue57.V("color");
                            String str62 = str31;
                            float parseInt = Integer.parseInt(V.substring(6, 8), 16) / 255.0f;
                            float parseInt2 = Integer.parseInt(V.substring(4, 6), 16) / 255.0f;
                            float parseInt3 = Integer.parseInt(V.substring(0, 2), 16) / 255.0f;
                            Animation.b0 b0Var4 = b0Var3;
                            float parseInt4 = Integer.parseInt(V.substring(2, 4), 16) / 255.0f;
                            int i63 = 0;
                            int i64 = 0;
                            float f83 = M31;
                            while (true) {
                                b0Var4.q(i64, f83, parseInt3, parseInt4, parseInt2, parseInt);
                                b0Var = b0Var4;
                                int i65 = i64;
                                float f84 = f83;
                                float f85 = parseInt3;
                                float f86 = parseInt4;
                                float f87 = parseInt2;
                                float f88 = parseInt;
                                f26 = f47;
                                JsonValue jsonValue58 = jsonValue57.f13158h;
                                if (jsonValue58 == null) {
                                    break;
                                }
                                JsonValue jsonValue59 = jsonValue56;
                                float M32 = jsonValue58.M(str34, 0.0f);
                                String V2 = jsonValue58.V(str61);
                                int i66 = i63;
                                String str63 = str34;
                                float parseInt5 = Integer.parseInt(V2.substring(0, 2), 16) / 255.0f;
                                String str64 = str61;
                                float parseInt6 = Integer.parseInt(V2.substring(2, 4), 16) / 255.0f;
                                float parseInt7 = Integer.parseInt(V2.substring(4, 6), 16) / 255.0f;
                                float parseInt8 = Integer.parseInt(V2.substring(6, 8), 16) / 255.0f;
                                JsonValue z23 = jsonValue57.z(str33);
                                if (z23 != null) {
                                    jsonValue25 = jsonValue58;
                                    str27 = str63;
                                    jsonValue26 = jsonValue59;
                                    str28 = str64;
                                    i19 = i65;
                                    str29 = str62;
                                    str30 = str33;
                                    nVar5 = h13;
                                    jsonValue27 = I;
                                    b0Var2 = b0Var;
                                    int g15 = g(z23, b0Var2, g(z23, b0Var2, i66, i19, 0, f84, M32, f85, parseInt5, 1.0f), i19, 1, f84, M32, f86, parseInt6, 1.0f);
                                    f44 = parseInt6;
                                    int g16 = g(z23, b0Var2, g15, i19, 2, f84, M32, f87, parseInt7, 1.0f);
                                    f45 = parseInt7;
                                    f46 = parseInt8;
                                    i63 = g(z23, b0Var2, g16, i19, 3, f84, M32, f88, f46, 1.0f);
                                } else {
                                    jsonValue25 = jsonValue58;
                                    str27 = str63;
                                    jsonValue26 = jsonValue59;
                                    str28 = str64;
                                    i19 = i65;
                                    str29 = str62;
                                    f44 = parseInt6;
                                    f45 = parseInt7;
                                    str30 = str33;
                                    nVar5 = h13;
                                    jsonValue27 = I;
                                    f46 = parseInt8;
                                    b0Var2 = b0Var;
                                    i63 = i66;
                                }
                                b0Var4 = b0Var2;
                                parseInt = f46;
                                str61 = str28;
                                str34 = str27;
                                h13 = nVar5;
                                I = jsonValue27;
                                parseInt2 = f45;
                                str33 = str30;
                                f47 = f26;
                                parseInt4 = f44;
                                parseInt3 = parseInt5;
                                jsonValue57 = jsonValue25;
                                str62 = str29;
                                f83 = M32;
                                i64 = i19 + 1;
                                jsonValue56 = jsonValue26;
                            }
                            b0Var.p(i63);
                            aVar4.a(b0Var);
                            str19 = str33;
                            str18 = str34;
                            jsonValue21 = jsonValue56;
                            nVar4 = h13;
                            aVar = aVar4;
                            jsonValue20 = I;
                            str17 = str62;
                        } else {
                            str17 = str31;
                            String str65 = str33;
                            str18 = str34;
                            String str66 = "color";
                            JsonValue jsonValue60 = jsonValue56;
                            f26 = f47;
                            jsonValue20 = I;
                            nVar4 = h13;
                            if (str60.equals("rgb")) {
                                Animation.c0 c0Var = new Animation.c0(i61, i61 * 3, nVar4.f64415a);
                                float M33 = jsonValue57.M(str18, 0.0f);
                                String V3 = jsonValue57.V(str66);
                                int i67 = 0;
                                int i68 = 16;
                                float parseInt9 = Integer.parseInt(V3.substring(4, 6), 16) / 255.0f;
                                float f89 = M33;
                                int i69 = 0;
                                int i71 = 0;
                                float parseInt10 = Integer.parseInt(V3.substring(0, 2), 16) / 255.0f;
                                float parseInt11 = Integer.parseInt(V3.substring(2, 4), 16) / 255.0f;
                                while (true) {
                                    Animation.c0 c0Var2 = c0Var;
                                    c0Var2.q(i71, f89, parseInt10, parseInt11, parseInt9);
                                    c0Var = c0Var2;
                                    int i72 = i71;
                                    float f91 = f89;
                                    float f92 = parseInt10;
                                    float f93 = parseInt11;
                                    float f94 = parseInt9;
                                    JsonValue jsonValue61 = jsonValue57.f13158h;
                                    if (jsonValue61 == null) {
                                        break;
                                    }
                                    float M34 = jsonValue61.M(str18, 0.0f);
                                    String V4 = jsonValue61.V(str66);
                                    float parseInt12 = Integer.parseInt(V4.substring(i67, 2), i68) / 255.0f;
                                    float parseInt13 = Integer.parseInt(V4.substring(2, 4), i68) / 255.0f;
                                    float parseInt14 = Integer.parseInt(V4.substring(4, 6), i68) / 255.0f;
                                    String str67 = str65;
                                    JsonValue z24 = jsonValue57.z(str67);
                                    if (z24 != null) {
                                        jsonValue24 = jsonValue61;
                                        str25 = str67;
                                        f41 = M34;
                                        str26 = str66;
                                        i18 = 0;
                                        int g17 = g(z24, c0Var, g(z24, c0Var, i69, i72, 0, f91, f41, f92, parseInt12, 1.0f), i72, 1, f91, f41, f93, parseInt13, 1.0f);
                                        f42 = parseInt13;
                                        f43 = parseInt14;
                                        i69 = g(z24, c0Var, g17, i72, 2, f91, f41, f94, f43, 1.0f);
                                    } else {
                                        str25 = str67;
                                        jsonValue24 = jsonValue61;
                                        f41 = M34;
                                        str26 = str66;
                                        f42 = parseInt13;
                                        f43 = parseInt14;
                                        i18 = 0;
                                    }
                                    i71 = i72 + 1;
                                    f89 = f41;
                                    parseInt9 = f43;
                                    i67 = i18;
                                    parseInt11 = f42;
                                    jsonValue57 = jsonValue24;
                                    str66 = str26;
                                    parseInt10 = parseInt12;
                                    str65 = str25;
                                    i68 = 16;
                                }
                                c0Var.p(i69);
                                aVar4.a(c0Var);
                                aVar = aVar4;
                                jsonValue21 = jsonValue60;
                                str19 = str65;
                            } else {
                                String str68 = str65;
                                if (str60.equals("alpha")) {
                                    aVar4.a(j(jsonValue57, new Animation.b(i61, i61, nVar4.f64415a), 0.0f, 1.0f));
                                } else {
                                    boolean equals2 = str60.equals("rgba2");
                                    String str69 = "dark";
                                    String str70 = "light";
                                    if (equals2) {
                                        Animation.a0 a0Var3 = new Animation.a0(i61, i61 * 7, nVar4.f64415a);
                                        float M35 = jsonValue57.M(str18, 0.0f);
                                        String V5 = jsonValue57.V("light");
                                        int i73 = 16;
                                        float parseInt15 = Integer.parseInt(V5.substring(0, 2), 16) / 255.0f;
                                        float parseInt16 = Integer.parseInt(V5.substring(2, 4), 16) / 255.0f;
                                        float parseInt17 = Integer.parseInt(V5.substring(4, 6), 16) / 255.0f;
                                        String V6 = jsonValue57.V("dark");
                                        Animation.a0 a0Var4 = a0Var3;
                                        float parseInt18 = Integer.parseInt(V6.substring(0, 2), 16) / 255.0f;
                                        float parseInt19 = Integer.parseInt(V6.substring(2, 4), 16) / 255.0f;
                                        float parseInt20 = Integer.parseInt(V6.substring(4, 6), 16) / 255.0f;
                                        float f95 = parseInt16;
                                        float f96 = M35;
                                        float parseInt21 = Integer.parseInt(V5.substring(6, 8), 16) / 255.0f;
                                        float f97 = parseInt15;
                                        float f98 = parseInt17;
                                        int i74 = 0;
                                        int i75 = 0;
                                        while (true) {
                                            float f99 = parseInt18;
                                            a0Var4.q(i75, f96, f97, f95, f98, parseInt21, f99, parseInt19, parseInt20);
                                            a0Var = a0Var4;
                                            int i76 = i75;
                                            float f100 = f96;
                                            float f101 = f97;
                                            float f102 = f95;
                                            float f103 = f98;
                                            float f104 = parseInt21;
                                            float f105 = parseInt19;
                                            float f106 = parseInt20;
                                            JsonValue jsonValue62 = jsonValue57.f13158h;
                                            if (jsonValue62 == null) {
                                                break;
                                            }
                                            float M36 = jsonValue62.M(str18, 0.0f);
                                            String V7 = jsonValue62.V(str70);
                                            int i77 = i74;
                                            float parseInt22 = Integer.parseInt(V7.substring(0, 2), i73) / 255.0f;
                                            float parseInt23 = Integer.parseInt(V7.substring(2, 4), i73) / 255.0f;
                                            float parseInt24 = Integer.parseInt(V7.substring(4, 6), i73) / 255.0f;
                                            float parseInt25 = Integer.parseInt(V7.substring(6, 8), i73) / 255.0f;
                                            String V8 = jsonValue62.V(str69);
                                            float parseInt26 = Integer.parseInt(V8.substring(0, 2), i73) / 255.0f;
                                            float parseInt27 = Integer.parseInt(V8.substring(2, 4), i73) / 255.0f;
                                            float parseInt28 = Integer.parseInt(V8.substring(4, 6), i73) / 255.0f;
                                            String str71 = str68;
                                            JsonValue z25 = jsonValue57.z(str71);
                                            if (z25 != null) {
                                                str23 = str69;
                                                str24 = str70;
                                                str22 = str71;
                                                aVar3 = aVar4;
                                                i17 = i73;
                                                jsonValue23 = jsonValue62;
                                                a0Var2 = a0Var;
                                                f35 = parseInt22;
                                                f36 = parseInt23;
                                                int g18 = g(z25, a0Var2, g(z25, a0Var2, g(z25, a0Var2, i77, i76, 0, f100, M36, f101, parseInt22, 1.0f), i76, 1, f100, M36, f102, parseInt23, 1.0f), i76, 2, f100, M36, f103, parseInt24, 1.0f);
                                                f37 = parseInt24;
                                                int g19 = g(z25, a0Var2, g(z25, a0Var2, g18, i76, 3, f100, M36, f104, parseInt25, 1.0f), i76, 4, f100, M36, f99, parseInt26, 1.0f);
                                                parseInt18 = parseInt26;
                                                f38 = parseInt27;
                                                f39 = parseInt28;
                                                i74 = g(z25, a0Var2, g(z25, a0Var2, g19, i76, 5, f100, M36, f105, parseInt27, 1.0f), i76, 6, f100, M36, f106, f39, 1.0f);
                                            } else {
                                                str22 = str71;
                                                jsonValue23 = jsonValue62;
                                                str23 = str69;
                                                str24 = str70;
                                                i74 = i77;
                                                f35 = parseInt22;
                                                f36 = parseInt23;
                                                f37 = parseInt24;
                                                parseInt18 = parseInt26;
                                                f38 = parseInt27;
                                                f39 = parseInt28;
                                                a0Var2 = a0Var;
                                                aVar3 = aVar4;
                                                i17 = i73;
                                            }
                                            a0Var4 = a0Var2;
                                            f96 = M36;
                                            i75 = i76 + 1;
                                            parseInt20 = f39;
                                            str69 = str23;
                                            i73 = i17;
                                            str70 = str24;
                                            parseInt21 = parseInt25;
                                            parseInt19 = f38;
                                            jsonValue57 = jsonValue23;
                                            f95 = f36;
                                            f98 = f37;
                                            aVar4 = aVar3;
                                            f97 = f35;
                                            str68 = str22;
                                        }
                                        a0Var.p(i74);
                                        aVar4.a(a0Var);
                                    } else {
                                        String str72 = "dark";
                                        com.badlogic.gdx.utils.a aVar5 = aVar4;
                                        str19 = str68;
                                        int i78 = 16;
                                        if (!str60.equals("rgb2")) {
                                            throw new RuntimeException("Invalid timeline type for a slot: " + str60 + " (" + jsonValue20.f13155e + pn.j.f81007d);
                                        }
                                        Animation.z zVar2 = new Animation.z(i61, i61 * 6, nVar4.f64415a);
                                        float M37 = jsonValue57.M(str18, 0.0f);
                                        String V9 = jsonValue57.V("light");
                                        float parseInt29 = Integer.parseInt(V9.substring(0, 2), 16) / 255.0f;
                                        float parseInt30 = Integer.parseInt(V9.substring(2, 4), 16) / 255.0f;
                                        String V10 = jsonValue57.V(str72);
                                        float parseInt31 = Integer.parseInt(V9.substring(4, 6), 16) / 255.0f;
                                        float f107 = M37;
                                        float parseInt32 = Integer.parseInt(V10.substring(2, 4), 16) / 255.0f;
                                        float f108 = parseInt29;
                                        float f109 = parseInt30;
                                        float parseInt33 = Integer.parseInt(V10.substring(4, 6), 16) / 255.0f;
                                        float parseInt34 = Integer.parseInt(V10.substring(0, 2), 16) / 255.0f;
                                        int i79 = 0;
                                        int i81 = 0;
                                        while (true) {
                                            zVar = zVar2;
                                            zVar.q(i81, f107, f108, f109, parseInt31, parseInt34, parseInt32, parseInt33);
                                            int i82 = i81;
                                            float f110 = f107;
                                            float f111 = f108;
                                            float f112 = f109;
                                            float f113 = parseInt31;
                                            float f114 = parseInt34;
                                            float f115 = parseInt32;
                                            float f116 = parseInt33;
                                            JsonValue jsonValue63 = jsonValue57.f13158h;
                                            if (jsonValue63 == null) {
                                                break;
                                            }
                                            float M38 = jsonValue63.M(str18, 0.0f);
                                            String V11 = jsonValue63.V("light");
                                            float parseInt35 = Integer.parseInt(V11.substring(0, 2), i78) / 255.0f;
                                            float parseInt36 = Integer.parseInt(V11.substring(2, 4), i78) / 255.0f;
                                            float parseInt37 = Integer.parseInt(V11.substring(4, 6), i78) / 255.0f;
                                            String V12 = jsonValue63.V(str72);
                                            float parseInt38 = Integer.parseInt(V12.substring(0, 2), i78) / 255.0f;
                                            float parseInt39 = Integer.parseInt(V12.substring(2, 4), i78) / 255.0f;
                                            float parseInt40 = Integer.parseInt(V12.substring(4, 6), i78) / 255.0f;
                                            String str73 = str19;
                                            JsonValue z26 = jsonValue57.z(str73);
                                            if (z26 != null) {
                                                f27 = M38;
                                                aVar2 = aVar5;
                                                jsonValue22 = jsonValue63;
                                                str20 = str72;
                                                zVar2 = zVar;
                                                str21 = str73;
                                                f28 = parseInt35;
                                                int g21 = g(z26, zVar2, g(z26, zVar2, i79, i82, 0, f110, f27, f111, parseInt35, 1.0f), i82, 1, f110, f27, f112, parseInt36, 1.0f);
                                                f29 = parseInt36;
                                                int g22 = g(z26, zVar2, g21, i82, 2, f110, f27, f113, parseInt37, 1.0f);
                                                f31 = parseInt37;
                                                int g23 = g(z26, zVar2, g22, i82, 3, f110, f27, f114, parseInt38, 1.0f);
                                                f33 = parseInt38;
                                                f32 = parseInt39;
                                                f34 = parseInt40;
                                                i79 = g(z26, zVar2, g(z26, zVar2, g23, i82, 4, f110, f27, f115, parseInt39, 1.0f), i82, 5, f110, f27, f116, f34, 1.0f);
                                            } else {
                                                f27 = M38;
                                                f28 = parseInt35;
                                                f29 = parseInt36;
                                                f31 = parseInt37;
                                                f32 = parseInt39;
                                                f33 = parseInt38;
                                                aVar2 = aVar5;
                                                f34 = parseInt40;
                                                zVar2 = zVar;
                                                jsonValue22 = jsonValue63;
                                                str20 = str72;
                                                str21 = str73;
                                            }
                                            f107 = f27;
                                            i81 = i82 + 1;
                                            parseInt33 = f34;
                                            str19 = str21;
                                            f109 = f29;
                                            jsonValue57 = jsonValue22;
                                            parseInt31 = f31;
                                            parseInt34 = f33;
                                            parseInt32 = f32;
                                            str72 = str20;
                                            f108 = f28;
                                            aVar5 = aVar2;
                                            i78 = 16;
                                        }
                                        zVar.p(i79);
                                        aVar = aVar5;
                                        aVar.a(zVar);
                                        jsonValue21 = jsonValue60;
                                    }
                                }
                                aVar = aVar4;
                                jsonValue21 = jsonValue60;
                                str19 = str68;
                            }
                        }
                        jsonValue56 = jsonValue21.f13158h;
                        gVar = this;
                        aVar4 = aVar;
                        str34 = str18;
                        h13 = nVar4;
                        I = jsonValue20;
                        f47 = f26;
                        str31 = str17;
                        str33 = str19;
                        f48 = 0.0f;
                    }
                }
                nVar4 = h13;
                jsonValue56 = jsonValue21.f13158h;
                gVar = this;
                aVar4 = aVar;
                str34 = str18;
                h13 = nVar4;
                I = jsonValue20;
                f47 = f26;
                str31 = str17;
                str33 = str19;
                f48 = 0.0f;
            }
            I = I.f13158h;
            iVar3 = iVar;
        }
    }

    public final ol.b f(JsonValue jsonValue, h hVar, int i11, String str, jl.i iVar) {
        float f11 = this.f64380b;
        String W = jsonValue.W("name", str);
        switch (a.f29450a[AttachmentType.valueOf(jsonValue.W("type", AttachmentType.region.name())).ordinal()]) {
            case 1:
                String W2 = jsonValue.W("path", W);
                Sequence h11 = h(jsonValue.z("sequence"));
                ol.j a11 = this.f64379a.a(hVar, W, W2, h11);
                if (a11 == null) {
                    return null;
                }
                a11.f(W2);
                a11.z(jsonValue.M("x", 0.0f) * f11);
                a11.A(jsonValue.M("y", 0.0f) * f11);
                a11.w(jsonValue.M("scaleX", 1.0f));
                a11.x(jsonValue.M("scaleY", 1.0f));
                a11.v(jsonValue.M(Key.ROTATION, 0.0f));
                a11.y(jsonValue.L("width") * f11);
                a11.u(jsonValue.L("height") * f11);
                a11.c(h11);
                String W3 = jsonValue.W("color", null);
                if (W3 != null) {
                    com.badlogic.gdx.graphics.b.S(W3, a11.e());
                }
                if (a11.g() != null) {
                    a11.b();
                }
                return a11;
            case 2:
                ol.d b11 = this.f64379a.b(hVar, W);
                if (b11 == null) {
                    return null;
                }
                l(jsonValue, b11, jsonValue.N("vertexCount") << 1);
                String W4 = jsonValue.W("color", null);
                if (W4 != null) {
                    com.badlogic.gdx.graphics.b.S(W4, b11.e());
                }
                return b11;
            case 3:
            case 4:
                String W5 = jsonValue.W("path", W);
                Sequence h12 = h(jsonValue.z("sequence"));
                ol.g d11 = this.f64379a.d(hVar, W, W5, h12);
                if (d11 == null) {
                    return null;
                }
                d11.f(W5);
                String W6 = jsonValue.W("color", null);
                if (W6 != null) {
                    com.badlogic.gdx.graphics.b.S(W6, d11.e());
                }
                d11.L(jsonValue.M("width", 0.0f) * f11);
                d11.F(jsonValue.M("height", 0.0f) * f11);
                d11.c(h12);
                String W7 = jsonValue.W(q.a.f13044u, null);
                if (W7 != null) {
                    this.f29449c.a(new b(d11, jsonValue.W("skin", null), i11, W7, jsonValue.B("timelines", true)));
                    return d11;
                }
                float[] o11 = jsonValue.F0("uvs").o();
                l(jsonValue, d11, o11.length);
                d11.J(jsonValue.F0("triangles").u());
                d11.I(o11);
                if (d11.g() != null) {
                    d11.b();
                }
                if (jsonValue.X("hull")) {
                    d11.G(jsonValue.F0("hull").p() << 1);
                }
                if (jsonValue.X("edges")) {
                    d11.E(jsonValue.F0("edges").u());
                }
                return d11;
            case 5:
                ol.h e11 = this.f64379a.e(hVar, W);
                if (e11 == null) {
                    return null;
                }
                int i12 = 0;
                e11.y(jsonValue.B("closed", false));
                e11.z(jsonValue.B("constantSpeed", true));
                int N = jsonValue.N("vertexCount");
                l(jsonValue, e11, N << 1);
                float[] fArr = new float[N / 3];
                JsonValue jsonValue2 = jsonValue.F0("lengths").f13156f;
                while (jsonValue2 != null) {
                    fArr[i12] = jsonValue2.n() * f11;
                    jsonValue2 = jsonValue2.f13158h;
                    i12++;
                }
                e11.A(fArr);
                String W8 = jsonValue.W("color", null);
                if (W8 != null) {
                    com.badlogic.gdx.graphics.b.S(W8, e11.e());
                }
                return e11;
            case 6:
                ol.i c11 = this.f64379a.c(hVar, W);
                if (c11 == null) {
                    return null;
                }
                c11.q(jsonValue.M("x", 0.0f) * f11);
                c11.r(jsonValue.M("y", 0.0f) * f11);
                c11.p(jsonValue.M(Key.ROTATION, 0.0f));
                String W9 = jsonValue.W("color", null);
                if (W9 != null) {
                    com.badlogic.gdx.graphics.b.S(W9, c11.e());
                }
                return c11;
            case 7:
                ol.e f12 = this.f64379a.f(hVar, W);
                if (f12 == null) {
                    return null;
                }
                String W10 = jsonValue.W(TtmlNode.END, null);
                if (W10 != null) {
                    n h13 = iVar.h(W10);
                    if (h13 == null) {
                        throw new SerializationException("Clipping end slot not found: " + W10);
                    }
                    f12.w(h13);
                }
                l(jsonValue, f12, jsonValue.N("vertexCount") << 1);
                String W11 = jsonValue.W("color", null);
                if (W11 != null) {
                    com.badlogic.gdx.graphics.b.S(W11, f12.e());
                }
                return f12;
            default:
                return null;
        }
    }

    public int g(JsonValue jsonValue, Animation.g gVar, int i11, int i12, int i13, float f11, float f12, float f13, float f14, float f15) {
        if (jsonValue.l0()) {
            if (jsonValue.v().equals("stepped")) {
                gVar.o(i12);
            }
            return i11;
        }
        JsonValue y11 = jsonValue.y(i13 << 2);
        float n11 = y11.n();
        JsonValue jsonValue2 = y11.f13158h;
        float n12 = jsonValue2.n() * f15;
        JsonValue jsonValue3 = jsonValue2.f13158h;
        m(gVar, i12, i13, i11, f11, f13, n11, n12, jsonValue3.n(), jsonValue3.f13158h.n() * f15, f12, f14);
        return i11 + 1;
    }

    public final Sequence h(@d0 JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        Sequence sequence = new Sequence(jsonValue.N("count"));
        sequence.k(jsonValue.O(TtmlNode.START, 1));
        sequence.i(jsonValue.O("digits", 0));
        sequence.j(jsonValue.O("setup", 0));
        return sequence;
    }

    public jl.i i(JsonValue jsonValue) {
        int i11;
        BoneData boneData;
        if (jsonValue == null) {
            throw new IllegalArgumentException("root cannot be null.");
        }
        float f11 = this.f64380b;
        jl.i iVar = new jl.i();
        JsonValue z11 = jsonValue.z("skeleton");
        String str = "audio";
        String str2 = "fps";
        if (z11 != null) {
            iVar.f64375r = z11.W("hash", null);
            iVar.f64374q = z11.W("spine", null);
            iVar.f64369l = z11.M("x", 0.0f);
            iVar.f64370m = z11.M("y", 0.0f);
            iVar.f64371n = z11.M("width", 0.0f);
            iVar.f64372o = z11.M("height", 0.0f);
            iVar.f64373p = z11.M("referenceScale", 100.0f) * f11;
            iVar.f64376s = z11.M("fps", 30.0f);
            iVar.f64377t = z11.W("images", null);
            iVar.f64378u = z11.W("audio", null);
        }
        String str3 = "bones";
        JsonValue I = jsonValue.I("bones");
        while (true) {
            String str4 = "shearY";
            String str5 = "shearX";
            String str6 = "length";
            String str7 = "color";
            String str8 = Key.ROTATION;
            float f12 = f11;
            String str9 = str;
            String str10 = str2;
            if (I == null) {
                String str11 = str3;
                JsonValue I2 = jsonValue.I("slots");
                while (I2 != null) {
                    String V = I2.V("name");
                    String V2 = I2.V("bone");
                    String str12 = str5;
                    BoneData b11 = iVar.b(V2);
                    if (b11 == null) {
                        throw new SerializationException("Slot bone not found: " + V2);
                    }
                    String str13 = str6;
                    n nVar = new n(iVar.f64360c.f13179b, V, b11);
                    String W = I2.W("color", null);
                    if (W != null) {
                        com.badlogic.gdx.graphics.b.S(W, nVar.d());
                    }
                    String W2 = I2.W("dark", null);
                    if (W2 != null) {
                        nVar.k(com.badlogic.gdx.graphics.b.R(W2));
                    }
                    nVar.f64420f = I2.W("attachment", null);
                    nVar.f64421g = BlendMode.valueOf(I2.W("blend", BlendMode.normal.name()));
                    nVar.f64422h = I2.B("visible", true);
                    iVar.f64360c.a(nVar);
                    I2 = I2.f13158h;
                    str5 = str12;
                    str6 = str13;
                }
                String str14 = str6;
                String str15 = str5;
                JsonValue I3 = jsonValue.I("ik");
                while (I3 != null) {
                    jl.e eVar = new jl.e(I3.V("name"));
                    eVar.f64304b = I3.O("order", 0);
                    eVar.f64305c = I3.B("skin", false);
                    String str16 = str11;
                    JsonValue I4 = I3.I(str16);
                    while (I4 != null) {
                        String str17 = str7;
                        BoneData b12 = iVar.b(I4.v());
                        if (b12 == null) {
                            throw new SerializationException("IK bone not found: " + I4);
                        }
                        eVar.f64320d.a(b12);
                        I4 = I4.f13158h;
                        str7 = str17;
                        str4 = str4;
                    }
                    String str18 = str7;
                    String str19 = str4;
                    String V3 = I3.V(TypedValues.AttributesType.S_TARGET);
                    BoneData b13 = iVar.b(V3);
                    eVar.f64321e = b13;
                    if (b13 == null) {
                        throw new SerializationException("IK target bone not found: " + V3);
                    }
                    eVar.f64326j = I3.M("mix", 1.0f);
                    eVar.f64327k = I3.M("softness", 0.0f) * f12;
                    eVar.f64322f = I3.B("bendPositive", true) ? 1 : -1;
                    eVar.f64323g = I3.B("compress", false);
                    eVar.f64324h = I3.B("stretch", false);
                    eVar.f64325i = I3.B("uniform", false);
                    iVar.f64365h.a(eVar);
                    I3 = I3.f13158h;
                    str7 = str18;
                    str4 = str19;
                    str11 = str16;
                }
                String str20 = str4;
                String str21 = str11;
                String str22 = str7;
                JsonValue I5 = jsonValue.I("transform");
                while (I5 != null) {
                    o oVar = new o(I5.V("name"));
                    oVar.f64304b = I5.O("order", 0);
                    oVar.f64305c = I5.B("skin", false);
                    JsonValue I6 = I5.I(str21);
                    while (I6 != null) {
                        BoneData b14 = iVar.b(I6.v());
                        if (b14 == null) {
                            throw new SerializationException("Transform constraint bone not found: " + I6);
                        }
                        oVar.f64423d.a(b14);
                        I6 = I6.f13158h;
                        str21 = str21;
                    }
                    String str23 = str21;
                    String V4 = I5.V(TypedValues.AttributesType.S_TARGET);
                    BoneData b15 = iVar.b(V4);
                    oVar.f64424e = b15;
                    if (b15 == null) {
                        throw new SerializationException("Transform constraint target bone not found: " + V4);
                    }
                    oVar.f64438s = I5.B("local", false);
                    oVar.f64437r = I5.B("relative", false);
                    oVar.f64431l = I5.M(Key.ROTATION, 0.0f);
                    oVar.f64432m = I5.M("x", 0.0f) * f12;
                    oVar.f64433n = I5.M("y", 0.0f) * f12;
                    oVar.f64434o = I5.M("scaleX", 0.0f);
                    oVar.f64435p = I5.M("scaleY", 0.0f);
                    oVar.f64436q = I5.M(str20, 0.0f);
                    oVar.f64425f = I5.M("mixRotate", 1.0f);
                    float M = I5.M("mixX", 1.0f);
                    oVar.f64426g = M;
                    oVar.f64427h = I5.M("mixY", M);
                    float M2 = I5.M("mixScaleX", 1.0f);
                    oVar.f64428i = M2;
                    oVar.f64429j = I5.M("mixScaleY", M2);
                    oVar.f64430k = I5.M("mixShearY", 1.0f);
                    iVar.f64366i.a(oVar);
                    I5 = I5.f13158h;
                    str21 = str23;
                }
                String str24 = str21;
                JsonValue I7 = jsonValue.I("path");
                while (I7 != null) {
                    PathConstraintData pathConstraintData = new PathConstraintData(I7.V("name"));
                    pathConstraintData.f64304b = I7.O("order", 0);
                    pathConstraintData.f64305c = I7.B("skin", false);
                    String str25 = str24;
                    for (JsonValue I8 = I7.I(str25); I8 != null; I8 = I8.f13158h) {
                        BoneData b16 = iVar.b(I8.v());
                        if (b16 == null) {
                            throw new SerializationException("Path bone not found: " + I8);
                        }
                        pathConstraintData.f29180d.a(b16);
                    }
                    String V5 = I7.V(TypedValues.AttributesType.S_TARGET);
                    n h11 = iVar.h(V5);
                    pathConstraintData.f29181e = h11;
                    if (h11 == null) {
                        throw new SerializationException("Path target slot not found: " + V5);
                    }
                    pathConstraintData.f29182f = PathConstraintData.PositionMode.valueOf(I7.W("positionMode", "percent"));
                    String str26 = str14;
                    pathConstraintData.f29183g = PathConstraintData.SpacingMode.valueOf(I7.W("spacingMode", str26));
                    pathConstraintData.f29184h = PathConstraintData.RotateMode.valueOf(I7.W("rotateMode", "tangent"));
                    pathConstraintData.f29185i = I7.M(str8, 0.0f);
                    float M3 = I7.M("position", 0.0f);
                    pathConstraintData.f29186j = M3;
                    String str27 = str8;
                    if (pathConstraintData.f29182f == PathConstraintData.PositionMode.fixed) {
                        pathConstraintData.f29186j = M3 * f12;
                    }
                    float M4 = I7.M("spacing", 0.0f);
                    pathConstraintData.f29187k = M4;
                    PathConstraintData.SpacingMode spacingMode = pathConstraintData.f29183g;
                    if (spacingMode == PathConstraintData.SpacingMode.length || spacingMode == PathConstraintData.SpacingMode.fixed) {
                        pathConstraintData.f29187k = M4 * f12;
                    }
                    pathConstraintData.f29188l = I7.M("mixRotate", 1.0f);
                    pathConstraintData.f29189m = I7.M("mixX", 1.0f);
                    pathConstraintData.f29190n = I7.M("mixY", 1.0f);
                    iVar.f64367j.a(pathConstraintData);
                    I7 = I7.f13158h;
                    str14 = str26;
                    str8 = str27;
                    str24 = str25;
                }
                String str28 = str24;
                for (JsonValue I9 = jsonValue.I("physics"); I9 != null; I9 = I9.f13158h) {
                    jl.f fVar = new jl.f(I9.V("name"));
                    fVar.f64304b = I9.O("order", 0);
                    fVar.f64305c = I9.B("skin", false);
                    String V6 = I9.V("bone");
                    BoneData b17 = iVar.b(V6);
                    fVar.f64328d = b17;
                    if (b17 == null) {
                        throw new SerializationException("Physics bone not found: " + V6);
                    }
                    fVar.f64329e = I9.M("x", 0.0f);
                    fVar.f64330f = I9.M("y", 0.0f);
                    fVar.f64331g = I9.M("rotate", 0.0f);
                    fVar.f64332h = I9.M("scaleX", 0.0f);
                    fVar.f64333i = I9.M(str15, 0.0f);
                    fVar.f64334j = I9.M("limit", 5000.0f) * f12;
                    fVar.f64335k = 1.0f / I9.O(str10, 60);
                    fVar.f64336l = I9.M("inertia", 1.0f);
                    fVar.f64337m = I9.M("strength", 100.0f);
                    fVar.f64338n = I9.M("damping", 1.0f);
                    fVar.f64339o = 1.0f / I9.M("mass", 1.0f);
                    fVar.f64340p = I9.M("wind", 0.0f);
                    fVar.f64341q = I9.M("gravity", 0.0f);
                    fVar.f64342r = I9.M("mix", 1.0f);
                    fVar.f64343s = I9.B("inertiaGlobal", false);
                    fVar.f64344t = I9.B("strengthGlobal", false);
                    fVar.f64345u = I9.B("dampingGlobal", false);
                    fVar.f64346v = I9.B("massGlobal", false);
                    fVar.f64347w = I9.B("windGlobal", false);
                    fVar.f64348x = I9.B("gravityGlobal", false);
                    fVar.f64349y = I9.B("mixGlobal", false);
                    iVar.f64368k.a(fVar);
                }
                int i12 = 0;
                JsonValue I10 = jsonValue.I("skins");
                while (I10 != null) {
                    h hVar = new h(I10.V("name"));
                    for (JsonValue I11 = I10.I(str28); I11 != null; I11 = I11.f13158h) {
                        BoneData b18 = iVar.b(I11.v());
                        if (b18 == null) {
                            throw new SerializationException("Skin bone not found: " + I11);
                        }
                        hVar.f29458c.a(b18);
                    }
                    hVar.f29458c.M();
                    for (JsonValue I12 = I10.I("ik"); I12 != null; I12 = I12.f13158h) {
                        jl.e d11 = iVar.d(I12.v());
                        if (d11 == null) {
                            throw new SerializationException("Skin IK constraint not found: " + I12);
                        }
                        hVar.f29459d.a(d11);
                    }
                    for (JsonValue I13 = I10.I("transform"); I13 != null; I13 = I13.f13158h) {
                        o i13 = iVar.i(I13.v());
                        if (i13 == null) {
                            throw new SerializationException("Skin transform constraint not found: " + I13);
                        }
                        hVar.f29459d.a(i13);
                    }
                    for (JsonValue I14 = I10.I("path"); I14 != null; I14 = I14.f13158h) {
                        PathConstraintData e11 = iVar.e(I14.v());
                        if (e11 == null) {
                            throw new SerializationException("Skin path constraint not found: " + I14);
                        }
                        hVar.f29459d.a(e11);
                    }
                    for (JsonValue I15 = I10.I("physics"); I15 != null; I15 = I15.f13158h) {
                        jl.f f13 = iVar.f(I15.v());
                        if (f13 == null) {
                            throw new SerializationException("Skin physics constraint not found: " + I15);
                        }
                        hVar.f29459d.a(f13);
                    }
                    hVar.f29459d.M();
                    for (JsonValue I16 = I10.I("attachments"); I16 != null; I16 = I16.f13158h) {
                        n h12 = iVar.h(I16.f13155e);
                        if (h12 == null) {
                            throw new SerializationException("Slot not found: " + I16.f13155e);
                        }
                        JsonValue jsonValue2 = I16.f13156f;
                        while (jsonValue2 != null) {
                            try {
                                i11 = i12;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                ol.b f14 = f(jsonValue2, hVar, h12.f64415a, jsonValue2.f13155e, iVar);
                                if (f14 != null) {
                                    hVar.m(h12.f64415a, jsonValue2.f13155e, f14);
                                }
                                jsonValue2 = jsonValue2.f13158h;
                                i12 = i11;
                            } catch (Throwable th3) {
                                th = th3;
                                throw new SerializationException("Error reading attachment: " + jsonValue2.f13155e + ", skin: " + hVar, th);
                            }
                        }
                    }
                    int i14 = i12;
                    String str29 = str22;
                    String W3 = I10.W(str29, null);
                    if (W3 != null) {
                        com.badlogic.gdx.graphics.b.S(W3, hVar.i());
                    }
                    iVar.f64361d.a(hVar);
                    if (hVar.f29456a.equals("default")) {
                        iVar.f64362e = hVar;
                    }
                    I10 = I10.f13158h;
                    str22 = str29;
                    i12 = i14;
                }
                int i15 = i12;
                com.badlogic.gdx.utils.a<b> aVar = this.f29449c;
                b[] bVarArr = aVar.f13178a;
                int i16 = aVar.f13179b;
                for (int i17 = i15; i17 < i16; i17++) {
                    b bVar = bVarArr[i17];
                    String str30 = bVar.f29452b;
                    h m11 = str30 == null ? iVar.m() : iVar.g(str30);
                    if (m11 == null) {
                        throw new SerializationException("Skin not found: " + bVar.f29452b);
                    }
                    ol.b e12 = m11.e(bVar.f29453c, bVar.f29451a);
                    if (e12 == null) {
                        throw new SerializationException("Parent mesh not found: " + bVar.f29451a);
                    }
                    ol.g gVar = bVar.f29454d;
                    gVar.r(bVar.f29455e ? (l) e12 : gVar);
                    bVar.f29454d.H((ol.g) e12);
                    if (bVar.f29454d.g() != null) {
                        bVar.f29454d.b();
                    }
                }
                this.f29449c.clear();
                JsonValue I17 = jsonValue.I("events");
                while (I17 != null) {
                    jl.d dVar = new jl.d(I17.f13155e);
                    dVar.f64314b = I17.O("int", i15);
                    dVar.f64315c = I17.M(TypedValues.Custom.S_FLOAT, 0.0f);
                    dVar.f64316d = I17.W(TypedValues.Custom.S_STRING, "");
                    String str31 = str9;
                    String W4 = I17.W(str31, null);
                    dVar.f64317e = W4;
                    if (W4 != null) {
                        dVar.f64318f = I17.M("volume", 1.0f);
                        dVar.f64319g = I17.M("balance", 0.0f);
                    }
                    iVar.f64363f.a(dVar);
                    I17 = I17.f13158h;
                    str9 = str31;
                }
                for (JsonValue I18 = jsonValue.I("animations"); I18 != null; I18 = I18.f13158h) {
                    try {
                        e(I18, I18.f13155e, iVar);
                    } catch (Throwable th4) {
                        throw new SerializationException("Error reading animation: " + I18.f13155e, th4);
                    }
                }
                iVar.f64359b.M();
                iVar.f64360c.M();
                iVar.f64361d.M();
                iVar.f64363f.M();
                iVar.f64364g.M();
                iVar.f64365h.M();
                return iVar;
            }
            String str32 = str3;
            String W5 = I.W(q.a.f13044u, null);
            if (W5 != null) {
                boneData = iVar.b(W5);
                if (boneData == null) {
                    throw new SerializationException("Parent bone not found: " + W5);
                }
            } else {
                boneData = null;
            }
            BoneData boneData2 = new BoneData(iVar.f64359b.f13179b, I.V("name"), boneData);
            boneData2.f29167d = I.M("length", 0.0f) * f12;
            boneData2.f29168e = I.M("x", 0.0f) * f12;
            boneData2.f29169f = I.M("y", 0.0f) * f12;
            boneData2.f29170g = I.M(Key.ROTATION, 0.0f);
            boneData2.f29171h = I.M("scaleX", 1.0f);
            boneData2.f29172i = I.M("scaleY", 1.0f);
            boneData2.f29173j = I.M("shearX", 0.0f);
            boneData2.f29174k = I.M("shearY", 0.0f);
            boneData2.f29175l = BoneData.Inherit.valueOf(I.W("inherit", BoneData.Inherit.normal.name()));
            boneData2.f29176m = I.B("skin", false);
            String W6 = I.W("color", null);
            if (W6 != null) {
                com.badlogic.gdx.graphics.b.S(W6, boneData2.a());
            }
            boneData2.f29178o = I.W("icon", null);
            boneData2.f29179p = I.B("visible", true);
            iVar.f64359b.a(boneData2);
            I = I.f13158h;
            f11 = f12;
            str = str9;
            str2 = str10;
            str3 = str32;
        }
    }

    public final Animation.m0 j(JsonValue jsonValue, Animation.e eVar, float f11, float f12) {
        JsonValue jsonValue2 = jsonValue;
        Animation.e eVar2 = eVar;
        int i11 = 0;
        float M = jsonValue2.M("time", 0.0f);
        float M2 = jsonValue2.M("value", f11) * f12;
        int i12 = 0;
        while (true) {
            eVar2.v(i11, M, M2);
            JsonValue jsonValue3 = jsonValue2.f13158h;
            if (jsonValue3 == null) {
                eVar2.p(i12);
                return eVar2;
            }
            float M3 = jsonValue3.M("time", 0.0f);
            float M4 = jsonValue3.M("value", f11) * f12;
            JsonValue z11 = jsonValue2.z("curve");
            if (z11 != null) {
                i12 = g(z11, eVar2, i12, i11, 0, M, M3, M2, M4, f12);
            }
            i11++;
            eVar2 = eVar;
            M = M3;
            M2 = M4;
            jsonValue2 = jsonValue3;
        }
    }

    public final Animation.m0 k(JsonValue jsonValue, Animation.f fVar, String str, String str2, float f11, float f12) {
        JsonValue jsonValue2;
        float f13;
        float f14;
        JsonValue jsonValue3 = jsonValue;
        Animation.f fVar2 = fVar;
        float M = jsonValue3.M("time", 0.0f);
        float M2 = jsonValue3.M(str, f11) * f12;
        float M3 = jsonValue3.M(str2, f11) * f12;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            fVar2.q(i12, M, M2, M3);
            JsonValue jsonValue4 = jsonValue3.f13158h;
            if (jsonValue4 == null) {
                fVar2.p(i11);
                return fVar2;
            }
            float M4 = jsonValue4.M("time", 0.0f);
            float M5 = jsonValue4.M(str, f11) * f12;
            float M6 = jsonValue4.M(str2, f11) * f12;
            JsonValue z11 = jsonValue3.z("curve");
            if (z11 != null) {
                jsonValue2 = jsonValue4;
                int g11 = g(z11, fVar2, i11, i12, 0, M, M4, M2, M5, f12);
                f13 = M5;
                f14 = M6;
                i11 = g(z11, fVar, g11, i12, 1, M, M4, M3, f14, f12);
            } else {
                jsonValue2 = jsonValue4;
                f13 = M5;
                f14 = M6;
            }
            i12++;
            fVar2 = fVar;
            M = M4;
            M3 = f14;
            jsonValue3 = jsonValue2;
            M2 = f13;
        }
    }

    public final void l(JsonValue jsonValue, l lVar, int i11) {
        lVar.t(i11);
        float[] o11 = jsonValue.F0("vertices").o();
        int i12 = 0;
        if (i11 == o11.length) {
            if (this.f64380b != 1.0f) {
                int length = o11.length;
                while (i12 < length) {
                    o11[i12] = o11[i12] * this.f64380b;
                    i12++;
                }
            }
            lVar.s(o11);
            return;
        }
        r rVar = new r(i11 * 9);
        v vVar = new v(i11 * 3);
        int length2 = o11.length;
        while (i12 < length2) {
            int i13 = i12 + 1;
            int i14 = (int) o11[i12];
            vVar.a(i14);
            int i15 = (i14 << 2) + i13;
            while (i13 < i15) {
                vVar.a((int) o11[i13]);
                rVar.a(o11[i13 + 1] * this.f64380b);
                rVar.a(o11[i13 + 2] * this.f64380b);
                rVar.a(o11[i13 + 3]);
                i13 += 4;
            }
            i12 = i13;
        }
        lVar.q(vVar.M());
        lVar.s(rVar.N());
    }

    public g(com.badlogic.gdx.graphics.g2d.e eVar) {
        super(eVar);
        this.f29449c = new com.badlogic.gdx.utils.a<>();
    }
}
