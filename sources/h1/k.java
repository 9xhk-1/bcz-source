package h1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    public static final JsonReader.a f57914f = JsonReader.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    public static final JsonReader.a f57915g = JsonReader.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    public d1.a f57916a;

    /* renamed from: b, reason: collision with root package name */
    public d1.b f57917b;

    /* renamed from: c, reason: collision with root package name */
    public d1.b f57918c;

    /* renamed from: d, reason: collision with root package name */
    public d1.b f57919d;

    /* renamed from: e, reason: collision with root package name */
    public d1.b f57920e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        if (r0.equals("Opacity") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.airbnb.lottie.parser.moshi.JsonReader r6, com.airbnb.lottie.k r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.e()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.k()
            if (r1 == 0) goto L90
            com.airbnb.lottie.parser.moshi.JsonReader$a r1 = h1.k.f57915g
            int r1 = r6.S(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.U()
            r6.V()
            goto L5
        L1d:
            r0.getClass()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r4
            goto L5f
        L2b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5e
            goto L29
        L5e:
            r2 = r3
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.V()
            goto L5
        L66:
            d1.b r1 = h1.d.e(r6, r7)
            r5.f57920e = r1
            goto L5
        L6d:
            d1.a r1 = h1.d.c(r6, r7)
            r5.f57916a = r1
            goto L5
        L74:
            d1.b r1 = h1.d.f(r6, r7, r3)
            r5.f57918c = r1
            goto L5
        L7b:
            d1.b r1 = h1.d.f(r6, r7, r3)
            r5.f57917b = r1
            goto L5
        L82:
            d1.b r1 = h1.d.e(r6, r7)
            r5.f57919d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.E()
            goto L5
        L90:
            r6.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.k.a(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.k):void");
    }

    @Nullable
    public j b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        d1.b bVar;
        d1.b bVar2;
        d1.b bVar3;
        d1.b bVar4;
        while (jsonReader.k()) {
            if (jsonReader.S(f57914f) != 0) {
                jsonReader.U();
                jsonReader.V();
            } else {
                jsonReader.c();
                while (jsonReader.k()) {
                    a(jsonReader, kVar);
                }
                jsonReader.f();
            }
        }
        d1.a aVar = this.f57916a;
        if (aVar == null || (bVar = this.f57917b) == null || (bVar2 = this.f57918c) == null || (bVar3 = this.f57919d) == null || (bVar4 = this.f57920e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
