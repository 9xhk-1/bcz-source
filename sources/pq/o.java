package pq;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class o implements oq.c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f81154a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final m f81155b;

    public o(Context context, String str) {
        this.f81155b = new m(context, str);
    }

    @Override // oq.c
    public String getString(String str, String str2) {
        String str3 = this.f81154a.get(str);
        if (str3 != null) {
            return str3;
        }
        String b11 = this.f81155b.b(str, str2);
        if (b11 == null) {
            return str2;
        }
        this.f81154a.put(str, b11);
        return b11;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
