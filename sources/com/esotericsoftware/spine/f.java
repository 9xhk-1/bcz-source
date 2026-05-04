package com.esotericsoftware.spine;

import a3.d0;
import a3.r;
import a3.v;
import com.badlogic.gdx.utils.SerializationException;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.BoneData;
import com.esotericsoftware.spine.PathConstraintData;
import com.esotericsoftware.spine.attachments.AttachmentType;
import com.esotericsoftware.spine.attachments.Sequence;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import jl.n;
import jl.o;
import ol.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f extends jl.j {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 4;
    public static final int D = 5;
    public static final int E = 6;
    public static final int F = 7;
    public static final int G = 8;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f29414d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f29415e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f29416f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f29417g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f29418h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f29419i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f29420j = 6;

    /* renamed from: k, reason: collision with root package name */
    public static final int f29421k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f29422l = 8;

    /* renamed from: m, reason: collision with root package name */
    public static final int f29423m = 9;

    /* renamed from: n, reason: collision with root package name */
    public static final int f29424n = 10;

    /* renamed from: o, reason: collision with root package name */
    public static final int f29425o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f29426p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f29427q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f29428r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f29429s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f29430t = 5;

    /* renamed from: u, reason: collision with root package name */
    public static final int f29431u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f29432v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f29433w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f29434x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f29435y = 2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f29436z = 0;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29437c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29438a;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            f29438a = iArr;
            try {
                iArr[AttachmentType.region.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29438a[AttachmentType.boundingbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29438a[AttachmentType.mesh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29438a[AttachmentType.linkedmesh.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29438a[AttachmentType.path.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29438a[AttachmentType.point.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29438a[AttachmentType.clipping.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f29439a;

        /* renamed from: b, reason: collision with root package name */
        public int f29440b;

        /* renamed from: c, reason: collision with root package name */
        public int f29441c;

        /* renamed from: d, reason: collision with root package name */
        public ol.g f29442d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f29443e;

        public b(ol.g gVar, int i11, int i12, String str, boolean z11) {
            this.f29442d = gVar;
            this.f29440b = i11;
            this.f29441c = i12;
            this.f29439a = str;
            this.f29443e = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f29446a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f29447b;

        /* renamed from: c, reason: collision with root package name */
        public float[] f29448c;
    }

    public f(ol.c cVar) {
        super(cVar);
        this.f29437c = new com.badlogic.gdx.utils.a<>();
    }

    @Override // jl.j
    public jl.i b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("dataInput cannot be null.");
        }
        float f11 = this.f64380b;
        c cVar = new c(inputStream);
        jl.i iVar = new jl.i();
        try {
            try {
                long readLong = cVar.readLong();
                iVar.f64375r = readLong == 0 ? null : Long.toString(readLong);
                String readString = cVar.readString();
                iVar.f64374q = readString;
                if (readString.isEmpty()) {
                    iVar.f64374q = null;
                }
                iVar.f64369l = cVar.readFloat();
                iVar.f64370m = cVar.readFloat();
                iVar.f64371n = cVar.readFloat();
                iVar.f64372o = cVar.readFloat();
                iVar.f64373p = cVar.readFloat() * f11;
                boolean readBoolean = cVar.readBoolean();
                if (readBoolean) {
                    iVar.f64376s = cVar.readFloat();
                    String readString2 = cVar.readString();
                    iVar.f64377t = readString2;
                    if (readString2.isEmpty()) {
                        iVar.f64377t = null;
                    }
                    String readString3 = cVar.readString();
                    iVar.f64378u = readString3;
                    if (readString3.isEmpty()) {
                        iVar.f64378u = null;
                    }
                }
                int a11 = cVar.a(true);
                String[] strArr = new String[a11];
                cVar.f29445c = strArr;
                for (int i11 = 0; i11 < a11; i11++) {
                    strArr[i11] = cVar.readString();
                }
                com.badlogic.gdx.utils.a<BoneData> aVar = iVar.f64359b;
                int a12 = cVar.a(true);
                BoneData[] L = aVar.L(a12);
                int i12 = 0;
                while (i12 < a12) {
                    BoneData boneData = new BoneData(i12, cVar.readString(), i12 == 0 ? null : L[cVar.a(true)]);
                    boneData.f29170g = cVar.readFloat();
                    boneData.f29168e = cVar.readFloat() * f11;
                    boneData.f29169f = cVar.readFloat() * f11;
                    boneData.f29171h = cVar.readFloat();
                    boneData.f29172i = cVar.readFloat();
                    boneData.f29173j = cVar.readFloat();
                    boneData.f29174k = cVar.readFloat();
                    boneData.f29167d = cVar.readFloat() * f11;
                    boneData.f29175l = BoneData.Inherit.values[cVar.readByte()];
                    boneData.f29176m = cVar.readBoolean();
                    if (readBoolean) {
                        com.badlogic.gdx.graphics.b.E(boneData.f29177n, cVar.readInt());
                        boneData.f29178o = cVar.readString();
                        boneData.f29179p = cVar.readBoolean();
                    }
                    L[i12] = boneData;
                    i12++;
                }
                com.badlogic.gdx.utils.a<n> aVar2 = iVar.f64360c;
                int a13 = cVar.a(true);
                n[] L2 = aVar2.L(a13);
                for (int i13 = 0; i13 < a13; i13++) {
                    n nVar = new n(i13, cVar.readString(), L[cVar.a(true)]);
                    com.badlogic.gdx.graphics.b.E(nVar.f64418d, cVar.readInt());
                    int readInt = cVar.readInt();
                    if (readInt != -1) {
                        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b();
                        nVar.f64419e = bVar;
                        com.badlogic.gdx.graphics.b.y(bVar, readInt);
                    }
                    nVar.f64420f = cVar.e();
                    nVar.f64421g = BlendMode.values[cVar.a(true)];
                    if (readBoolean) {
                        nVar.f64422h = cVar.readBoolean();
                    }
                    L2[i13] = nVar;
                }
                com.badlogic.gdx.utils.a<jl.e> aVar3 = iVar.f64365h;
                int a14 = cVar.a(true);
                jl.e[] L3 = aVar3.L(a14);
                for (int i14 = 0; i14 < a14; i14++) {
                    jl.e eVar = new jl.e(cVar.readString());
                    eVar.f64304b = cVar.a(true);
                    com.badlogic.gdx.utils.a<BoneData> aVar4 = eVar.f64320d;
                    int a15 = cVar.a(true);
                    BoneData[] L4 = aVar4.L(a15);
                    for (int i15 = 0; i15 < a15; i15++) {
                        L4[i15] = L[cVar.a(true)];
                    }
                    eVar.f64321e = L[cVar.a(true)];
                    int read = cVar.read();
                    eVar.f64305c = (read & 1) != 0;
                    eVar.f64322f = (read & 2) != 0 ? 1 : -1;
                    eVar.f64323g = (read & 4) != 0;
                    eVar.f64324h = (read & 8) != 0;
                    eVar.f64325i = (read & 16) != 0;
                    if ((read & 32) != 0) {
                        eVar.f64326j = (read & 64) != 0 ? cVar.readFloat() : 1.0f;
                    }
                    if ((read & 128) != 0) {
                        eVar.f64327k = cVar.readFloat() * f11;
                    }
                    L3[i14] = eVar;
                }
                com.badlogic.gdx.utils.a<o> aVar5 = iVar.f64366i;
                int a16 = cVar.a(true);
                o[] L5 = aVar5.L(a16);
                for (int i16 = 0; i16 < a16; i16++) {
                    o oVar = new o(cVar.readString());
                    oVar.f64304b = cVar.a(true);
                    com.badlogic.gdx.utils.a<BoneData> aVar6 = oVar.f64423d;
                    int a17 = cVar.a(true);
                    BoneData[] L6 = aVar6.L(a17);
                    for (int i17 = 0; i17 < a17; i17++) {
                        L6[i17] = L[cVar.a(true)];
                    }
                    oVar.f64424e = L[cVar.a(true)];
                    int read2 = cVar.read();
                    oVar.f64305c = (read2 & 1) != 0;
                    oVar.f64438s = (read2 & 2) != 0;
                    oVar.f64437r = (read2 & 4) != 0;
                    if ((read2 & 8) != 0) {
                        oVar.f64431l = cVar.readFloat();
                    }
                    if ((read2 & 16) != 0) {
                        oVar.f64432m = cVar.readFloat() * f11;
                    }
                    if ((read2 & 32) != 0) {
                        oVar.f64433n = cVar.readFloat() * f11;
                    }
                    if ((read2 & 64) != 0) {
                        oVar.f64434o = cVar.readFloat();
                    }
                    if ((read2 & 128) != 0) {
                        oVar.f64435p = cVar.readFloat();
                    }
                    int read3 = cVar.read();
                    if ((read3 & 1) != 0) {
                        oVar.f64436q = cVar.readFloat();
                    }
                    if ((read3 & 2) != 0) {
                        oVar.f64425f = cVar.readFloat();
                    }
                    if ((read3 & 4) != 0) {
                        oVar.f64426g = cVar.readFloat();
                    }
                    if ((read3 & 8) != 0) {
                        oVar.f64427h = cVar.readFloat();
                    }
                    if ((read3 & 16) != 0) {
                        oVar.f64428i = cVar.readFloat();
                    }
                    if ((read3 & 32) != 0) {
                        oVar.f64429j = cVar.readFloat();
                    }
                    if ((read3 & 64) != 0) {
                        oVar.f64430k = cVar.readFloat();
                    }
                    L5[i16] = oVar;
                }
                com.badlogic.gdx.utils.a<PathConstraintData> aVar7 = iVar.f64367j;
                int a18 = cVar.a(true);
                PathConstraintData[] L7 = aVar7.L(a18);
                for (int i18 = 0; i18 < a18; i18++) {
                    PathConstraintData pathConstraintData = new PathConstraintData(cVar.readString());
                    pathConstraintData.f64304b = cVar.a(true);
                    pathConstraintData.f64305c = cVar.readBoolean();
                    com.badlogic.gdx.utils.a<BoneData> aVar8 = pathConstraintData.f29180d;
                    int a19 = cVar.a(true);
                    BoneData[] L8 = aVar8.L(a19);
                    for (int i19 = 0; i19 < a19; i19++) {
                        L8[i19] = L[cVar.a(true)];
                    }
                    pathConstraintData.f29181e = L2[cVar.a(true)];
                    int read4 = cVar.read();
                    pathConstraintData.f29182f = PathConstraintData.PositionMode.values[read4 & 1];
                    pathConstraintData.f29183g = PathConstraintData.SpacingMode.values[(read4 >> 1) & 3];
                    pathConstraintData.f29184h = PathConstraintData.RotateMode.values[(read4 >> 3) & 3];
                    if ((read4 & 128) != 0) {
                        pathConstraintData.f29185i = cVar.readFloat();
                    }
                    float readFloat = cVar.readFloat();
                    pathConstraintData.f29186j = readFloat;
                    if (pathConstraintData.f29182f == PathConstraintData.PositionMode.fixed) {
                        pathConstraintData.f29186j = readFloat * f11;
                    }
                    float readFloat2 = cVar.readFloat();
                    pathConstraintData.f29187k = readFloat2;
                    PathConstraintData.SpacingMode spacingMode = pathConstraintData.f29183g;
                    if (spacingMode == PathConstraintData.SpacingMode.length || spacingMode == PathConstraintData.SpacingMode.fixed) {
                        pathConstraintData.f29187k = readFloat2 * f11;
                    }
                    pathConstraintData.f29188l = cVar.readFloat();
                    pathConstraintData.f29189m = cVar.readFloat();
                    pathConstraintData.f29190n = cVar.readFloat();
                    L7[i18] = pathConstraintData;
                }
                com.badlogic.gdx.utils.a<jl.f> aVar9 = iVar.f64368k;
                int a21 = cVar.a(true);
                jl.f[] L9 = aVar9.L(a21);
                for (int i21 = 0; i21 < a21; i21++) {
                    jl.f fVar = new jl.f(cVar.readString());
                    fVar.f64304b = cVar.a(true);
                    fVar.f64328d = L[cVar.a(true)];
                    int read5 = cVar.read();
                    fVar.f64305c = (read5 & 1) != 0;
                    if ((read5 & 2) != 0) {
                        fVar.f64329e = cVar.readFloat();
                    }
                    if ((read5 & 4) != 0) {
                        fVar.f64330f = cVar.readFloat();
                    }
                    if ((read5 & 8) != 0) {
                        fVar.f64331g = cVar.readFloat();
                    }
                    if ((read5 & 16) != 0) {
                        fVar.f64332h = cVar.readFloat();
                    }
                    if ((read5 & 32) != 0) {
                        fVar.f64333i = cVar.readFloat();
                    }
                    fVar.f64334j = ((read5 & 64) != 0 ? cVar.readFloat() : 5000.0f) * f11;
                    fVar.f64335k = 1.0f / cVar.readUnsignedByte();
                    fVar.f64336l = cVar.readFloat();
                    fVar.f64337m = cVar.readFloat();
                    fVar.f64338n = cVar.readFloat();
                    fVar.f64339o = (read5 & 128) != 0 ? cVar.readFloat() : 1.0f;
                    fVar.f64340p = cVar.readFloat();
                    fVar.f64341q = cVar.readFloat();
                    int read6 = cVar.read();
                    if ((read6 & 1) != 0) {
                        fVar.f64343s = true;
                    }
                    if ((read6 & 2) != 0) {
                        fVar.f64344t = true;
                    }
                    if ((read6 & 4) != 0) {
                        fVar.f64345u = true;
                    }
                    if ((read6 & 8) != 0) {
                        fVar.f64346v = true;
                    }
                    if ((read6 & 16) != 0) {
                        fVar.f64347w = true;
                    }
                    if ((read6 & 32) != 0) {
                        fVar.f64348x = true;
                    }
                    if ((read6 & 64) != 0) {
                        fVar.f64349y = true;
                    }
                    fVar.f64342r = (read6 & 128) != 0 ? cVar.readFloat() : 1.0f;
                    L9[i21] = fVar;
                }
                h j11 = j(cVar, iVar, true, readBoolean);
                if (j11 != null) {
                    iVar.f64362e = j11;
                    iVar.f64361d.a(j11);
                }
                com.badlogic.gdx.utils.a<h> aVar10 = iVar.f64361d;
                int i22 = aVar10.f13179b;
                int a22 = cVar.a(true) + i22;
                h[] L10 = aVar10.L(a22);
                while (i22 < a22) {
                    L10[i22] = j(cVar, iVar, false, readBoolean);
                    i22++;
                }
                com.badlogic.gdx.utils.a<b> aVar11 = this.f29437c;
                int i23 = aVar11.f13179b;
                b[] bVarArr = aVar11.f13178a;
                for (int i24 = 0; i24 < i23; i24++) {
                    b bVar2 = bVarArr[i24];
                    ol.b e11 = iVar.f64361d.get(bVar2.f29440b).e(bVar2.f29441c, bVar2.f29439a);
                    if (e11 == null) {
                        throw new SerializationException("Parent mesh not found: " + bVar2.f29439a);
                    }
                    ol.g gVar = bVar2.f29442d;
                    gVar.r(bVar2.f29443e ? (l) e11 : gVar);
                    bVar2.f29442d.H((ol.g) e11);
                    if (bVar2.f29442d.d() == null) {
                        bVar2.f29442d.b();
                    }
                }
                this.f29437c.clear();
                com.badlogic.gdx.utils.a<jl.d> aVar12 = iVar.f64363f;
                int a23 = cVar.a(true);
                jl.d[] L11 = aVar12.L(a23);
                for (int i25 = 0; i25 < a23; i25++) {
                    jl.d dVar = new jl.d(cVar.readString());
                    dVar.f64314b = cVar.a(false);
                    dVar.f64315c = cVar.readFloat();
                    dVar.f64316d = cVar.readString();
                    String readString4 = cVar.readString();
                    dVar.f64317e = readString4;
                    if (readString4 != null) {
                        dVar.f64318f = cVar.readFloat();
                        dVar.f64319g = cVar.readFloat();
                    }
                    L11[i25] = dVar;
                }
                com.badlogic.gdx.utils.a<Animation> aVar13 = iVar.f64364g;
                int a24 = cVar.a(true);
                Animation[] L12 = aVar13.L(a24);
                for (int i26 = 0; i26 < a24; i26++) {
                    L12[i26] = e(cVar, cVar.readString(), iVar);
                }
                try {
                    cVar.close();
                } catch (IOException unused) {
                }
                return iVar;
            } catch (IOException e12) {
                throw new SerializationException("Error reading skeleton file.", e12);
            }
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    @Override // jl.j
    public jl.i c(v1.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("file cannot be null.");
        }
        jl.i b11 = b(aVar.F());
        b11.f64358a = aVar.A();
        return b11;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final com.esotericsoftware.spine.Animation e(com.esotericsoftware.spine.f.c r47, java.lang.String r48, jl.i r49) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.spine.f.e(com.esotericsoftware.spine.f$c, java.lang.String, jl.i):com.esotericsoftware.spine.Animation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ol.b f(c cVar, jl.i iVar, h hVar, int i11, String str, boolean z11) throws IOException {
        int readInt;
        float f11;
        float f12;
        short[] sArr;
        float f13;
        float f14 = this.f64380b;
        byte readByte = cVar.readByte();
        String e11 = (readByte & 8) != 0 ? cVar.e() : str;
        switch (a.f29438a[AttachmentType.values[readByte & 7 ? 1 : 0].ordinal()]) {
            case 1:
                String e12 = (readByte & 16) != 0 ? cVar.e() : null;
                readInt = (readByte & 32) != 0 ? cVar.readInt() : -1;
                Sequence h11 = (readByte & 64) != 0 ? h(cVar) : null;
                r8 = (readByte & 128) != 0 ? cVar.readFloat() : 0.0f;
                float readFloat = cVar.readFloat();
                float readFloat2 = cVar.readFloat();
                float readFloat3 = cVar.readFloat();
                float readFloat4 = cVar.readFloat();
                float readFloat5 = cVar.readFloat();
                float readFloat6 = cVar.readFloat();
                if (e12 == null) {
                    e12 = e11;
                }
                ol.j a11 = this.f64379a.a(hVar, e11, e12, h11);
                if (a11 != null) {
                    a11.f(e12);
                    a11.z(readFloat * f14);
                    a11.A(readFloat2 * f14);
                    a11.w(readFloat3);
                    a11.x(readFloat4);
                    a11.v(r8);
                    a11.y(readFloat5 * f14);
                    a11.u(readFloat6 * f14);
                    com.badlogic.gdx.graphics.b.E(a11.e(), readInt);
                    a11.c(h11);
                    if (h11 == null) {
                        a11.b();
                        break;
                    }
                }
                break;
            case 2:
                d m11 = m(cVar, (readByte & 16) != 0);
                int readInt2 = z11 ? cVar.readInt() : 0;
                ol.d b11 = this.f64379a.b(hVar, e11);
                if (b11 != null) {
                    b11.t(m11.f29446a);
                    b11.s(m11.f29448c);
                    b11.q(m11.f29447b);
                    if (z11) {
                        com.badlogic.gdx.graphics.b.E(b11.e(), readInt2);
                        break;
                    }
                }
                break;
            case 3:
                String e13 = (readByte & 16) != 0 ? cVar.e() : e11;
                readInt = (readByte & 32) != 0 ? cVar.readInt() : -1;
                Sequence h12 = (readByte & 64) != 0 ? h(cVar) : null;
                int a12 = cVar.a(true);
                d m12 = m(cVar, (readByte & 128) != 0);
                float[] g11 = g(cVar, m12.f29446a, 1.0f);
                short[] i12 = i(cVar, ((m12.f29446a - a12) - 2) * 3);
                if (z11) {
                    sArr = i(cVar, cVar.a(true));
                    f12 = cVar.readFloat();
                    f11 = cVar.readFloat();
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                    sArr = null;
                }
                ol.g d11 = this.f64379a.d(hVar, e11, e13, h12);
                if (d11 != null) {
                    d11.f(e13);
                    com.badlogic.gdx.graphics.b.E(d11.e(), readInt);
                    d11.q(m12.f29447b);
                    d11.s(m12.f29448c);
                    d11.t(m12.f29446a);
                    d11.J(i12);
                    d11.I(g11);
                    if (h12 == null) {
                        d11.b();
                    }
                    d11.G(a12 << 1);
                    d11.c(h12);
                    if (z11) {
                        d11.E(sArr);
                        d11.L(f12 * f14);
                        d11.F(f11 * f14);
                        break;
                    }
                }
                break;
            case 4:
                String e14 = (readByte & 16) != 0 ? cVar.e() : e11;
                readInt = (readByte & 32) != 0 ? cVar.readInt() : -1;
                Sequence h13 = (readByte & 64) != 0 ? h(cVar) : null;
                boolean z12 = (readByte & 128) != 0;
                int a13 = cVar.a(true);
                String e15 = cVar.e();
                if (z11) {
                    r8 = cVar.readFloat();
                    f13 = cVar.readFloat();
                } else {
                    f13 = 0.0f;
                }
                ol.g d12 = this.f64379a.d(hVar, e11, e14, h13);
                if (d12 != null) {
                    d12.f(e14);
                    com.badlogic.gdx.graphics.b.E(d12.e(), readInt);
                    d12.c(h13);
                    if (z11) {
                        d12.L(r8 * f14);
                        d12.F(f13 * f14);
                    }
                    this.f29437c.a(new b(d12, a13, i11, e15, z12));
                    break;
                }
                break;
            case 5:
                boolean z13 = (readByte & 16) != 0;
                boolean z14 = (readByte & 32) != 0;
                d m13 = m(cVar, (readByte & 64) != 0);
                int i13 = m13.f29446a / 6;
                float[] fArr = new float[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    fArr[i14] = cVar.readFloat() * f14;
                }
                int readInt3 = z11 ? cVar.readInt() : 0;
                ol.h e16 = this.f64379a.e(hVar, e11);
                if (e16 != null) {
                    e16.y(z13);
                    e16.z(z14);
                    e16.t(m13.f29446a);
                    e16.s(m13.f29448c);
                    e16.q(m13.f29447b);
                    e16.A(fArr);
                    if (z11) {
                        com.badlogic.gdx.graphics.b.E(e16.e(), readInt3);
                        break;
                    }
                }
                break;
            case 6:
                float readFloat7 = cVar.readFloat();
                float readFloat8 = cVar.readFloat();
                float readFloat9 = cVar.readFloat();
                int readInt4 = z11 ? cVar.readInt() : 0;
                ol.i c11 = this.f64379a.c(hVar, e11);
                if (c11 != null) {
                    c11.q(readFloat8 * f14);
                    c11.r(readFloat9 * f14);
                    c11.p(readFloat7);
                    if (z11) {
                        com.badlogic.gdx.graphics.b.E(c11.e(), readInt4);
                        break;
                    }
                }
                break;
            case 7:
                int a14 = cVar.a(true);
                d m14 = m(cVar, (readByte & 16) != 0);
                int readInt5 = z11 ? cVar.readInt() : 0;
                ol.e f15 = this.f64379a.f(hVar, e11);
                if (f15 != null) {
                    f15.w(iVar.f64360c.get(a14));
                    f15.t(m14.f29446a);
                    f15.s(m14.f29448c);
                    f15.q(m14.f29447b);
                    if (z11) {
                        com.badlogic.gdx.graphics.b.E(f15.e(), readInt5);
                        break;
                    }
                }
                break;
        }
        return null;
    }

    public final float[] g(c cVar, int i11, float f11) throws IOException {
        float[] fArr = new float[i11];
        int i12 = 0;
        if (f11 == 1.0f) {
            while (i12 < i11) {
                fArr[i12] = cVar.readFloat();
                i12++;
            }
        } else {
            while (i12 < i11) {
                fArr[i12] = cVar.readFloat() * f11;
                i12++;
            }
        }
        return fArr;
    }

    public final Sequence h(c cVar) throws IOException {
        Sequence sequence = new Sequence(cVar.a(true));
        sequence.k(cVar.a(true));
        sequence.i(cVar.a(true));
        sequence.j(cVar.a(true));
        return sequence;
    }

    public final short[] i(c cVar, int i11) throws IOException {
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = (short) cVar.a(true);
        }
        return sArr;
    }

    @d0
    public final h j(c cVar, jl.i iVar, boolean z11, boolean z12) throws IOException {
        h hVar;
        int a11;
        jl.i iVar2 = iVar;
        if (z11) {
            a11 = cVar.a(true);
            if (a11 == 0) {
                return null;
            }
            hVar = new h("default");
        } else {
            hVar = new h(cVar.readString());
            if (z12) {
                com.badlogic.gdx.graphics.b.E(hVar.f29461f, cVar.readInt());
            }
            BoneData[] L = hVar.f29458c.L(cVar.a(true));
            BoneData[] boneDataArr = iVar2.f64359b.f13178a;
            int i11 = hVar.f29458c.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                L[i12] = boneDataArr[cVar.a(true)];
            }
            jl.e[] eVarArr = iVar2.f64365h.f13178a;
            int a12 = cVar.a(true);
            for (int i13 = 0; i13 < a12; i13++) {
                hVar.f29459d.a(eVarArr[cVar.a(true)]);
            }
            o[] oVarArr = iVar2.f64366i.f13178a;
            int a13 = cVar.a(true);
            for (int i14 = 0; i14 < a13; i14++) {
                hVar.f29459d.a(oVarArr[cVar.a(true)]);
            }
            PathConstraintData[] pathConstraintDataArr = iVar2.f64367j.f13178a;
            int a14 = cVar.a(true);
            for (int i15 = 0; i15 < a14; i15++) {
                hVar.f29459d.a(pathConstraintDataArr[cVar.a(true)]);
            }
            jl.f[] fVarArr = iVar2.f64368k.f13178a;
            int a15 = cVar.a(true);
            for (int i16 = 0; i16 < a15; i16++) {
                hVar.f29459d.a(fVarArr[cVar.a(true)]);
            }
            hVar.f29459d.M();
            a11 = cVar.a(true);
        }
        int i17 = a11;
        h hVar2 = hVar;
        int i18 = 0;
        while (i18 < i17) {
            int a16 = cVar.a(true);
            int a17 = cVar.a(true);
            int i19 = 0;
            while (i19 < a17) {
                String e11 = cVar.e();
                ol.b f11 = f(cVar, iVar2, hVar2, a16, e11, z12);
                if (f11 != null) {
                    hVar2.m(a16, e11, f11);
                }
                i19++;
                iVar2 = iVar;
            }
            i18++;
            iVar2 = iVar;
        }
        return hVar2;
    }

    public final void k(c cVar, com.badlogic.gdx.utils.a<Animation.m0> aVar, Animation.e eVar, float f11) throws IOException {
        float readFloat = cVar.readFloat();
        float readFloat2 = cVar.readFloat() * f11;
        int e11 = eVar.e() - 1;
        int i11 = 0;
        float f12 = readFloat;
        float f13 = readFloat2;
        int i12 = 0;
        while (true) {
            eVar.v(i12, f12, f13);
            if (i12 == e11) {
                aVar.a(eVar);
                return;
            }
            float readFloat3 = cVar.readFloat();
            float readFloat4 = cVar.readFloat() * f11;
            byte readByte = cVar.readByte();
            if (readByte == 1) {
                eVar.o(i12);
            } else if (readByte == 2) {
                n(cVar, eVar, i11, i12, 0, f12, readFloat3, f13, readFloat4, f11);
                i11++;
            }
            i12++;
            f12 = readFloat3;
            f13 = readFloat4;
        }
    }

    public final void l(c cVar, com.badlogic.gdx.utils.a<Animation.m0> aVar, Animation.f fVar, float f11) throws IOException {
        float f12;
        float f13;
        Animation.f fVar2 = fVar;
        float readFloat = cVar.readFloat();
        float readFloat2 = cVar.readFloat() * f11;
        float readFloat3 = cVar.readFloat() * f11;
        int e11 = fVar2.e() - 1;
        int i11 = 0;
        float f14 = readFloat;
        float f15 = readFloat2;
        float f16 = readFloat3;
        int i12 = 0;
        while (true) {
            fVar2.q(i11, f14, f15, f16);
            if (i11 == e11) {
                aVar.a(fVar);
                return;
            }
            float readFloat4 = cVar.readFloat();
            float readFloat5 = cVar.readFloat() * f11;
            float readFloat6 = cVar.readFloat() * f11;
            byte readByte = cVar.readByte();
            if (readByte == 1) {
                f12 = readFloat5;
                f13 = readFloat6;
                fVar2.o(i11);
            } else if (readByte != 2) {
                f12 = readFloat5;
                f13 = readFloat6;
            } else {
                n(cVar, fVar2, i12, i11, 0, f14, readFloat4, f15, readFloat5, f11);
                f12 = readFloat5;
                fVar2 = fVar;
                f13 = readFloat6;
                n(cVar, fVar2, i12 + 1, i11, 1, f14, readFloat4, f16, f13, f11);
                i12 += 2;
            }
            i11++;
            f14 = readFloat4;
            f16 = f13;
            f15 = f12;
        }
    }

    public final d m(c cVar, boolean z11) throws IOException {
        float f11 = this.f64380b;
        int a11 = cVar.a(true);
        d dVar = new d();
        int i11 = a11 << 1;
        dVar.f29446a = i11;
        if (!z11) {
            dVar.f29448c = g(cVar, i11, f11);
            return dVar;
        }
        r rVar = new r(i11 * 9);
        v vVar = new v(dVar.f29446a * 3);
        for (int i12 = 0; i12 < a11; i12++) {
            int a12 = cVar.a(true);
            vVar.a(a12);
            for (int i13 = 0; i13 < a12; i13++) {
                vVar.a(cVar.a(true));
                rVar.a(cVar.readFloat() * f11);
                rVar.a(cVar.readFloat() * f11);
                rVar.a(cVar.readFloat());
            }
        }
        dVar.f29448c = rVar.N();
        dVar.f29447b = vVar.M();
        return dVar;
    }

    public void n(c cVar, Animation.g gVar, int i11, int i12, int i13, float f11, float f12, float f13, float f14, float f15) throws IOException {
        gVar.m(i11, i12, i13, f11, f13, cVar.readFloat(), cVar.readFloat() * f15, cVar.readFloat(), cVar.readFloat() * f15, f12, f14);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends a3.n {

        /* renamed from: b, reason: collision with root package name */
        public char[] f29444b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f29445c;

        public c(InputStream inputStream) {
            super(inputStream);
            this.f29444b = new char[32];
        }

        @d0
        public String e() throws IOException {
            int a11 = a(true);
            if (a11 == 0) {
                return null;
            }
            return this.f29445c[a11 - 1];
        }

        @Override // a3.n
        public String readString() throws IOException {
            int i11;
            int a11 = a(true);
            if (a11 == 0) {
                return null;
            }
            if (a11 == 1) {
                return "";
            }
            int i12 = a11 - 1;
            if (this.f29444b.length < i12) {
                this.f29444b = new char[i12];
            }
            char[] cArr = this.f29444b;
            int i13 = 0;
            int i14 = 0;
            while (i13 < i12) {
                int read = read();
                int i15 = read >> 4;
                if (i15 == -1) {
                    throw new EOFException();
                }
                switch (i15) {
                    case 12:
                    case 13:
                        i11 = i14 + 1;
                        cArr[i14] = (char) (((read & 31) << 6) | (read() & 63));
                        i13 += 2;
                        break;
                    case 14:
                        i11 = i14 + 1;
                        cArr[i14] = (char) (((read & 15) << 12) | ((read() & 63) << 6) | (read() & 63));
                        i13 += 3;
                        break;
                    default:
                        i11 = i14 + 1;
                        cArr[i14] = (char) read;
                        i13++;
                        break;
                }
                i14 = i11;
            }
            return new String(cArr, 0, i14);
        }

        public c(v1.a aVar) {
            super(aVar.E(512));
            this.f29444b = new char[32];
        }
    }

    public f(com.badlogic.gdx.graphics.g2d.e eVar) {
        super(eVar);
        this.f29437c = new com.badlogic.gdx.utils.a<>();
    }
}
