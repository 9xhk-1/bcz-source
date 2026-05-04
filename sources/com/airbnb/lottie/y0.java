package com.airbnb.lottie;

import android.util.Log;
import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10243a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Set<b> f10244b = new ArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, j1.h> f10245c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Comparator<Pair<String, Float>> f10246d = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<Pair<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(float f11);
    }

    public void a(b bVar) {
        this.f10244b.add(bVar);
    }

    public void b() {
        this.f10245c.clear();
    }

    public List<Pair<String, Float>> c() {
        if (!this.f10243a) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f10245c.size());
        for (Map.Entry<String, j1.h> entry : this.f10245c.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f10246d);
        return arrayList;
    }

    public void d() {
        if (this.f10243a) {
            List<Pair<String, Float>> c11 = c();
            Log.d(e.f9936b, "Render times:");
            for (int i11 = 0; i11 < c11.size(); i11++) {
                Pair<String, Float> pair = c11.get(i11);
                Log.d(e.f9936b, String.format("\t\t%30s:%.2f", pair.first, pair.second));
            }
        }
    }

    public void e(String str, float f11) {
        if (this.f10243a) {
            j1.h hVar = this.f10245c.get(str);
            if (hVar == null) {
                hVar = new j1.h();
                this.f10245c.put(str, hVar);
            }
            hVar.a(f11);
            if (str.equals("__container")) {
                Iterator<b> it = this.f10244b.iterator();
                while (it.hasNext()) {
                    it.next().a(f11);
                }
            }
        }
    }

    public void f(b bVar) {
        this.f10244b.remove(bVar);
    }

    public void g(boolean z11) {
        this.f10243a = z11;
    }
}
