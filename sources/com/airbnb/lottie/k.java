package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    public Map<String, List<Layer>> f9967c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, p0> f9968d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, c1.b> f9969e;

    /* renamed from: f, reason: collision with root package name */
    public List<c1.g> f9970f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArrayCompat<c1.c> f9971g;

    /* renamed from: h, reason: collision with root package name */
    public LongSparseArray<Layer> f9972h;

    /* renamed from: i, reason: collision with root package name */
    public List<Layer> f9973i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f9974j;

    /* renamed from: k, reason: collision with root package name */
    public float f9975k;

    /* renamed from: l, reason: collision with root package name */
    public float f9976l;

    /* renamed from: m, reason: collision with root package name */
    public float f9977m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9978n;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f9965a = new y0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<String> f9966b = new HashSet<>();

    /* renamed from: o, reason: collision with root package name */
    public int f9979o = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Deprecated
    public static class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements q0<k>, com.airbnb.lottie.b {

            /* renamed from: a, reason: collision with root package name */
            public final x0 f9980a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f9981b;

            @Override // com.airbnb.lottie.q0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(k kVar) {
                if (this.f9981b) {
                    return;
                }
                this.f9980a.b(kVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f9981b = true;
            }

            public a(x0 x0Var) {
                this.f9981b = false;
                this.f9980a = x0Var;
            }
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, x0 x0Var) {
            a aVar = new a(x0Var);
            x.o(context, str).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k b(Context context, String str) {
            return x.q(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, x0 x0Var) {
            a aVar = new a(x0Var);
            x.t(inputStream, null).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k d(InputStream inputStream) {
            return x.u(inputStream, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k e(InputStream inputStream, boolean z11) {
            if (z11) {
                j1.f.e("Lottie now auto-closes input stream!");
            }
            return x.u(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(JsonReader jsonReader, x0 x0Var) {
            a aVar = new a(x0Var);
            x.w(jsonReader, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, x0 x0Var) {
            a aVar = new a(x0Var);
            x.z(str, null).d(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k h(Resources resources, JSONObject jSONObject) {
            return x.B(jSONObject, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k i(JsonReader jsonReader) {
            return x.x(jsonReader, null).b();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static k j(String str) {
            return x.A(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @RawRes int i11, x0 x0Var) {
            a aVar = new a(x0Var);
            x.C(context, i11).d(aVar);
            return aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        j1.f.e(str);
        this.f9966b.add(str);
    }

    public Rect b() {
        return this.f9974j;
    }

    public SparseArrayCompat<c1.c> c() {
        return this.f9971g;
    }

    public float d() {
        return (long) ((e() / this.f9977m) * 1000.0f);
    }

    public float e() {
        return this.f9976l - this.f9975k;
    }

    public float f() {
        return this.f9976l;
    }

    public Map<String, c1.b> g() {
        return this.f9969e;
    }

    public float h(float f11) {
        return j1.i.k(this.f9975k, this.f9976l, f11);
    }

    public float i() {
        return this.f9977m;
    }

    public Map<String, p0> j() {
        return this.f9968d;
    }

    public List<Layer> k() {
        return this.f9973i;
    }

    @Nullable
    public c1.g l(String str) {
        int size = this.f9970f.size();
        for (int i11 = 0; i11 < size; i11++) {
            c1.g gVar = this.f9970f.get(i11);
            if (gVar.d(str)) {
                return gVar;
            }
        }
        return null;
    }

    public List<c1.g> m() {
        return this.f9970f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int n() {
        return this.f9979o;
    }

    public y0 o() {
        return this.f9965a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> p(String str) {
        return this.f9967c.get(str);
    }

    public float q(float f11) {
        float f12 = this.f9975k;
        return (f11 - f12) / (this.f9976l - f12);
    }

    public float r() {
        return this.f9975k;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.f9966b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean t() {
        return this.f9978n;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f9973i.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().y("\t"));
        }
        return sb2.toString();
    }

    public boolean u() {
        return !this.f9968d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void v(int i11) {
        this.f9979o += i11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void w(Rect rect, float f11, float f12, float f13, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, p0> map2, SparseArrayCompat<c1.c> sparseArrayCompat, Map<String, c1.b> map3, List<c1.g> list2) {
        this.f9974j = rect;
        this.f9975k = f11;
        this.f9976l = f12;
        this.f9977m = f13;
        this.f9973i = list;
        this.f9972h = longSparseArray;
        this.f9967c = map;
        this.f9968d = map2;
        this.f9971g = sparseArrayCompat;
        this.f9969e = map3;
        this.f9970f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer x(long j11) {
        return this.f9972h.get(j11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void y(boolean z11) {
        this.f9978n = z11;
    }

    public void z(boolean z11) {
        this.f9965a.g(z11);
    }
}
