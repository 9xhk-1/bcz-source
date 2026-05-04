package rx.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f86703a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f86704b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f86705c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f86706d;

    /* renamed from: e, reason: collision with root package name */
    public int f86707e;

    public f(int i11) {
        this.f86703a = i11;
    }

    public void c(Object obj) {
        if (this.f86706d == 0) {
            Object[] objArr = new Object[this.f86703a + 1];
            this.f86704b = objArr;
            this.f86705c = objArr;
            objArr[0] = obj;
            this.f86707e = 1;
            this.f86706d = 1;
            return;
        }
        int i11 = this.f86707e;
        int i12 = this.f86703a;
        if (i11 != i12) {
            this.f86705c[i11] = obj;
            this.f86707e = i11 + 1;
            this.f86706d++;
        } else {
            Object[] objArr2 = new Object[i12 + 1];
            objArr2[0] = obj;
            this.f86705c[i12] = objArr2;
            this.f86705c = objArr2;
            this.f86707e = 1;
            this.f86706d++;
        }
    }

    public int d() {
        return this.f86703a;
    }

    public Object[] e() {
        return this.f86704b;
    }

    public int f() {
        return this.f86707e;
    }

    public int g() {
        return this.f86706d;
    }

    public Object[] h() {
        return this.f86705c;
    }

    public List<Object> i() {
        int i11 = this.f86703a;
        int i12 = this.f86706d;
        ArrayList arrayList = new ArrayList(i12 + 1);
        Object[] e11 = e();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            arrayList.add(e11[i14]);
            i13++;
            i14++;
            if (i14 == i11) {
                e11 = (Object[]) e11[i11];
                i14 = 0;
            }
        }
        return arrayList;
    }

    public String toString() {
        return i().toString();
    }
}
