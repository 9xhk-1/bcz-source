package h1;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.p0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57948a = JsonReader.a.a("w", CmcdData.STREAMING_FORMAT_HLS, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static JsonReader.a f57949b = JsonReader.a.a("id", "layers", "w", CmcdData.STREAMING_FORMAT_HLS, "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f57950c = JsonReader.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    public static final JsonReader.a f57951d = JsonReader.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0044. Please report as an issue. */
    public static com.airbnb.lottie.k a(JsonReader jsonReader) throws IOException {
        float f11;
        JsonReader jsonReader2 = jsonReader;
        float e11 = j1.j.e();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat<c1.c> sparseArrayCompat = new SparseArrayCompat<>();
        com.airbnb.lottie.k kVar = new com.airbnb.lottie.k();
        jsonReader2.e();
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        while (jsonReader2.k()) {
            switch (jsonReader2.S(f57948a)) {
                case 0:
                    i11 = jsonReader.w();
                    jsonReader2 = jsonReader;
                    break;
                case 1:
                    i12 = jsonReader.w();
                    jsonReader2 = jsonReader;
                    break;
                case 2:
                    f11 = e11;
                    f12 = (float) jsonReader.r();
                    jsonReader2 = jsonReader;
                    e11 = f11;
                    break;
                case 3:
                    f11 = e11;
                    f13 = ((float) jsonReader.r()) - 0.01f;
                    jsonReader2 = jsonReader;
                    e11 = f11;
                    break;
                case 4:
                    f11 = e11;
                    f14 = (float) jsonReader.r();
                    jsonReader2 = jsonReader;
                    e11 = f11;
                    break;
                case 5:
                    String[] split = jsonReader2.E().split("\\.");
                    if (!j1.j.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        kVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    jsonReader2 = jsonReader;
                    break;
                case 6:
                    e(jsonReader2, kVar, arrayList, longSparseArray);
                    jsonReader2 = jsonReader;
                    break;
                case 7:
                    b(jsonReader2, kVar, hashMap, hashMap2);
                    jsonReader2 = jsonReader;
                    break;
                case 8:
                    d(jsonReader2, hashMap3);
                    jsonReader2 = jsonReader;
                    break;
                case 9:
                    c(jsonReader2, kVar, sparseArrayCompat);
                    jsonReader2 = jsonReader;
                    break;
                case 10:
                    f(jsonReader2, arrayList2);
                    jsonReader2 = jsonReader;
                    break;
                default:
                    jsonReader2.U();
                    jsonReader2.V();
                    jsonReader2 = jsonReader;
                    break;
            }
        }
        float f15 = e11;
        kVar.w(new Rect(0, 0, (int) (i11 * f15), (int) (i12 * f15)), f12, f13, f14, arrayList, longSparseArray, hashMap, hashMap2, sparseArrayCompat, hashMap3, arrayList2);
        return kVar;
    }

    public static void b(JsonReader jsonReader, com.airbnb.lottie.k kVar, Map<String, List<Layer>> map, Map<String, p0> map2) throws IOException {
        jsonReader.c();
        while (jsonReader.k()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.e();
            int i11 = 0;
            int i12 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.k()) {
                int S = jsonReader.S(f57949b);
                if (S == 0) {
                    str = jsonReader.E();
                } else if (S == 1) {
                    jsonReader.c();
                    while (jsonReader.k()) {
                        Layer b11 = v.b(jsonReader, kVar);
                        longSparseArray.put(b11.d(), b11);
                        arrayList.add(b11);
                    }
                    jsonReader.f();
                } else if (S == 2) {
                    i11 = jsonReader.w();
                } else if (S == 3) {
                    i12 = jsonReader.w();
                } else if (S == 4) {
                    str2 = jsonReader.E();
                } else if (S != 5) {
                    jsonReader.U();
                    jsonReader.V();
                } else {
                    str3 = jsonReader.E();
                }
            }
            jsonReader.j();
            if (str2 != null) {
                p0 p0Var = new p0(i11, i12, str, str2, str3);
                map2.put(p0Var.e(), p0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.f();
    }

    public static void c(JsonReader jsonReader, com.airbnb.lottie.k kVar, SparseArrayCompat<c1.c> sparseArrayCompat) throws IOException {
        jsonReader.c();
        while (jsonReader.k()) {
            c1.c a11 = m.a(jsonReader, kVar);
            sparseArrayCompat.put(a11.hashCode(), a11);
        }
        jsonReader.f();
    }

    public static void d(JsonReader jsonReader, Map<String, c1.b> map) throws IOException {
        jsonReader.e();
        while (jsonReader.k()) {
            if (jsonReader.S(f57950c) != 0) {
                jsonReader.U();
                jsonReader.V();
            } else {
                jsonReader.c();
                while (jsonReader.k()) {
                    c1.b a11 = n.a(jsonReader);
                    map.put(a11.c(), a11);
                }
                jsonReader.f();
            }
        }
        jsonReader.j();
    }

    public static void e(JsonReader jsonReader, com.airbnb.lottie.k kVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.c();
        int i11 = 0;
        while (jsonReader.k()) {
            Layer b11 = v.b(jsonReader, kVar);
            if (b11.f() == Layer.LayerType.IMAGE) {
                i11++;
            }
            list.add(b11);
            longSparseArray.put(b11.d(), b11);
            if (i11 > 4) {
                j1.f.e("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.f();
    }

    public static void f(JsonReader jsonReader, List<c1.g> list) throws IOException {
        jsonReader.c();
        while (jsonReader.k()) {
            jsonReader.e();
            float f11 = 0.0f;
            String str = null;
            float f12 = 0.0f;
            while (jsonReader.k()) {
                int S = jsonReader.S(f57951d);
                if (S == 0) {
                    str = jsonReader.E();
                } else if (S == 1) {
                    f11 = (float) jsonReader.r();
                } else if (S != 2) {
                    jsonReader.U();
                    jsonReader.V();
                } else {
                    f12 = (float) jsonReader.r();
                }
            }
            jsonReader.j();
            list.add(new c1.g(str, f11, f12));
        }
        jsonReader.f();
    }
}
