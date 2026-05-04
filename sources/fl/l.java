package fl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public Class<?> f52017a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f52018b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f52019c;

    public l() {
    }

    public void a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f52017a = cls;
        this.f52018b = cls2;
        this.f52019c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f52017a.equals(lVar.f52017a) && this.f52018b.equals(lVar.f52018b) && o.e(this.f52019c, lVar.f52019c);
    }

    public int hashCode() {
        int hashCode = ((this.f52017a.hashCode() * 31) + this.f52018b.hashCode()) * 31;
        Class<?> cls = this.f52019c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f52017a + ", second=" + this.f52018b + l50.b.f69928j;
    }

    public l(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        a(cls, cls2);
    }

    public l(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
