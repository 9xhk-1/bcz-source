package h1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h0 implements n0<e1.i> {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f57903a = new h0();

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57904b = JsonReader.a.a("c", "v", "i", "o");

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e1.i a(JsonReader jsonReader, float f11) throws IOException {
        if (jsonReader.I() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.c();
        }
        jsonReader.e();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z11 = false;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57904b);
            if (S == 0) {
                z11 = jsonReader.q();
            } else if (S == 1) {
                list = s.f(jsonReader, f11);
            } else if (S == 2) {
                list2 = s.f(jsonReader, f11);
            } else if (S != 3) {
                jsonReader.U();
                jsonReader.V();
            } else {
                list3 = s.f(jsonReader, f11);
            }
        }
        jsonReader.j();
        if (jsonReader.I() == JsonReader.Token.END_ARRAY) {
            jsonReader.f();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new e1.i(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 1; i11 < size; i11++) {
            PointF pointF2 = list.get(i11);
            int i12 = i11 - 1;
            arrayList.add(new c1.a(j1.i.a(list.get(i12), list3.get(i12)), j1.i.a(pointF2, list2.get(i11)), pointF2));
        }
        if (z11) {
            PointF pointF3 = list.get(0);
            int i13 = size - 1;
            arrayList.add(new c1.a(j1.i.a(list.get(i13), list3.get(i13)), j1.i.a(pointF3, list2.get(0)), pointF3));
        }
        return new e1.i(pointF, z11, arrayList);
    }
}
