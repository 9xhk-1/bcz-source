package h1;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57944a = JsonReader.a.a("nm", "ind", "refId", com.alipay.sdk.m.s.a.f11005s, q.a.f13044u, "sw", "sh", com.igexin.push.g.o.f38736e, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", CmcdData.STREAMING_FORMAT_HLS, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "op", "tm", "cl", "hd");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57945b = JsonReader.a.a("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f57946c = JsonReader.a.a(com.alipay.sdk.m.s.a.f11005s, "nm");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57947a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f57947a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57947a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer a(com.airbnb.lottie.k kVar) {
        Rect b11 = kVar.b();
        List list = Collections.EMPTY_LIST;
        return new Layer(list, kVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, list, new d1.l(), 0, 0, 0, 0.0f, 0.0f, b11.width(), b11.height(), null, null, list, Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        Float f11;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.e();
        Layer.MatteType matteType2 = matteType;
        String str = null;
        d1.l lVar = null;
        d1.j jVar = null;
        d1.k kVar2 = null;
        d1.b bVar = null;
        e1.a aVar = null;
        j jVar2 = null;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        long j11 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        long j12 = -1;
        float f15 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        Layer.LayerType layerType = null;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57944a)) {
                case 0:
                    str2 = jsonReader.E();
                    break;
                case 1:
                    j11 = jsonReader.w();
                    break;
                case 2:
                    str = jsonReader.E();
                    break;
                case 3:
                    int w11 = jsonReader.w();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (w11 >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[w11];
                        break;
                    }
                case 4:
                    j12 = jsonReader.w();
                    break;
                case 5:
                    i11 = (int) (jsonReader.w() * j1.j.e());
                    break;
                case 6:
                    i12 = (int) (jsonReader.w() * j1.j.e());
                    break;
                case 7:
                    i13 = Color.parseColor(jsonReader.E());
                    break;
                case 8:
                    lVar = c.g(jsonReader, kVar);
                    break;
                case 9:
                    int w12 = jsonReader.w();
                    if (w12 < Layer.MatteType.values().length) {
                        matteType2 = Layer.MatteType.values()[w12];
                        int i16 = a.f57947a[matteType2.ordinal()];
                        if (i16 == 1) {
                            kVar.a("Unsupported matte type: Luma");
                        } else if (i16 == 2) {
                            kVar.a("Unsupported matte type: Luma Inverted");
                        }
                        kVar.v(1);
                        break;
                    } else {
                        kVar.a("Unsupported matte type: " + w12);
                        break;
                    }
                case 10:
                    jsonReader.c();
                    while (jsonReader.k()) {
                        arrayList.add(x.a(jsonReader, kVar));
                    }
                    kVar.v(arrayList.size());
                    jsonReader.f();
                    break;
                case 11:
                    jsonReader.c();
                    while (jsonReader.k()) {
                        e1.c a11 = h.a(jsonReader, kVar);
                        if (a11 != null) {
                            arrayList2.add(a11);
                        }
                    }
                    jsonReader.f();
                    break;
                case 12:
                    jsonReader.e();
                    while (jsonReader.k()) {
                        int S = jsonReader.S(f57945b);
                        if (S == 0) {
                            jVar = d.d(jsonReader, kVar);
                        } else if (S != 1) {
                            jsonReader.U();
                            jsonReader.V();
                        } else {
                            jsonReader.c();
                            if (jsonReader.k()) {
                                kVar2 = b.a(jsonReader, kVar);
                            }
                            while (jsonReader.k()) {
                                jsonReader.V();
                            }
                            jsonReader.f();
                        }
                    }
                    jsonReader.j();
                    break;
                case 13:
                    jsonReader.c();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.k()) {
                        jsonReader.e();
                        while (jsonReader.k()) {
                            int S2 = jsonReader.S(f57946c);
                            if (S2 == 0) {
                                int w13 = jsonReader.w();
                                if (w13 == 29) {
                                    aVar = e.b(jsonReader, kVar);
                                } else if (w13 == 25) {
                                    jVar2 = new k().b(jsonReader, kVar);
                                }
                            } else if (S2 != 1) {
                                jsonReader.U();
                                jsonReader.V();
                            } else {
                                arrayList3.add(jsonReader.E());
                            }
                        }
                        jsonReader.j();
                    }
                    jsonReader.f();
                    kVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    f15 = (float) jsonReader.r();
                    break;
                case 15:
                    f14 = (float) jsonReader.r();
                    break;
                case 16:
                    i14 = (int) (jsonReader.w() * j1.j.e());
                    break;
                case 17:
                    i15 = (int) (jsonReader.w() * j1.j.e());
                    break;
                case 18:
                    f12 = (float) jsonReader.r();
                    break;
                case 19:
                    f13 = (float) jsonReader.r();
                    break;
                case 20:
                    bVar = d.f(jsonReader, kVar, false);
                    break;
                case 21:
                    str3 = jsonReader.E();
                    break;
                case 22:
                    z11 = jsonReader.q();
                    break;
                default:
                    jsonReader.U();
                    jsonReader.V();
                    break;
            }
        }
        jsonReader.j();
        ArrayList arrayList4 = new ArrayList();
        if (f12 > 0.0f) {
            f11 = valueOf2;
            arrayList4.add(new k1.a(kVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f12)));
        } else {
            f11 = valueOf2;
        }
        if (f13 <= 0.0f) {
            f13 = kVar.f();
        }
        arrayList4.add(new k1.a(kVar, valueOf, valueOf, null, f12, Float.valueOf(f13)));
        arrayList4.add(new k1.a(kVar, f11, f11, null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            kVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList2, kVar, str2, j11, layerType, j12, str, arrayList, lVar, i11, i12, i13, f15, f14, i14, i15, jVar, kVar2, arrayList4, matteType2, bVar, z11, aVar, jVar2);
    }
}
