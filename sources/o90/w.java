package o90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w<T> {

    /* renamed from: a, reason: collision with root package name */
    public List<List<T>> f76708a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f76709b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f76710c;

    /* renamed from: d, reason: collision with root package name */
    public long f76711d;

    /* renamed from: e, reason: collision with root package name */
    public long f76712e;

    public w(int i11) {
        this.f76710c = 1000;
        if (i11 <= 0) {
            throw new IllegalArgumentException("Expected row count must be positive");
        }
        this.f76710c = i11;
    }

    public void a(T[] tArr, org.junit.jupiter.params.shadow.com.univocity.parsers.common.i iVar) {
        if (this.f76708a == null) {
            j(iVar);
        }
        if (this.f76708a.size() < tArr.length) {
            int length = tArr.length - this.f76708a.size();
            while (true) {
                int i11 = length - 1;
                if (length <= 0) {
                    break;
                }
                long p11 = iVar.p() - this.f76712e;
                int i12 = this.f76710c;
                if (i12 < p11) {
                    i12 = (int) p11;
                }
                ArrayList arrayList = new ArrayList(i12);
                while (true) {
                    p11--;
                    if (p11 > 0) {
                        arrayList.add(null);
                    }
                }
                this.f76708a.add(arrayList);
                length = i11;
            }
        }
        for (int i13 = 0; i13 < tArr.length; i13++) {
            this.f76708a.get(i13).add(tArr[i13]);
        }
        if (tArr.length < this.f76708a.size()) {
            for (int length2 = tArr.length; length2 < this.f76708a.size(); length2++) {
                this.f76708a.get(length2).add(null);
            }
        }
        this.f76711d++;
    }

    public void b() {
        this.f76712e = this.f76711d;
        this.f76708a = null;
    }

    public List<List<T>> c() {
        return this.f76708a;
    }

    public <V> List<V> d(int i11, Class<V> cls) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Column index must be positive");
        }
        if (i11 < this.f76708a.size()) {
            return this.f76708a.get(i11);
        }
        throw new IllegalArgumentException("Column index must be less than " + this.f76708a.size() + ". Got " + i11);
    }

    public <V> List<V> e(String str, Class<V> cls) {
        int f11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f(this.f76709b, str);
        if (f11 != -1) {
            return d(f11, cls);
        }
        throw new IllegalArgumentException("No column named '" + str + "' has been found. Available column headers: " + Arrays.toString(this.f76709b));
    }

    public Map<Integer, List<T>> f() {
        HashMap hashMap = new HashMap();
        k(hashMap);
        return hashMap;
    }

    public Map<String, List<T>> g() {
        HashMap hashMap = new HashMap();
        l(hashMap);
        return hashMap;
    }

    public String h(int i11) {
        String[] strArr = this.f76709b;
        if (i11 < strArr.length) {
            return strArr[i11];
        }
        return null;
    }

    public String[] i() {
        return this.f76709b;
    }

    public final void j(org.junit.jupiter.params.shadow.com.univocity.parsers.common.i iVar) {
        if (this.f76709b == null) {
            String[] a11 = iVar.a();
            if (a11 == null) {
                this.f76709b = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78085a;
            } else if (iVar.c()) {
                int[] g11 = iVar.g();
                int min = Math.min(a11.length, g11.length);
                this.f76709b = new String[g11.length];
                for (int i11 = 0; i11 < min; i11++) {
                    int i12 = g11[i11];
                    if (i12 < a11.length) {
                        this.f76709b[i11] = a11[i12];
                    }
                }
            } else {
                this.f76709b = a11;
            }
        }
        String[] strArr = this.f76709b;
        this.f76708a = new ArrayList(strArr.length > 0 ? strArr.length : 10);
    }

    public void k(Map<Integer, List<T>> map) {
        if (this.f76708a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f76708a.size(); i11++) {
            map.put(Integer.valueOf(i11), this.f76708a.get(i11));
        }
    }

    public void l(Map<String, List<T>> map) {
        if (this.f76708a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f76708a.size(); i11++) {
            String h11 = h(i11);
            if (h11 == null) {
                throw new DataProcessingException("Parsed input does not have header for column at index '" + i11 + "'. Parsed header names: " + Arrays.toString(i()), i11);
            }
            map.put(h11, this.f76708a.get(i11));
        }
    }

    public void m() {
        this.f76708a = null;
        this.f76709b = null;
        this.f76712e = 0L;
        this.f76711d = 0L;
    }
}
