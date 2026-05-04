package ik;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e implements b {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayMap<d<?>, Object> f60693c = new fl.b();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void g(@NonNull d<T> dVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        dVar.h(obj, messageDigest);
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        for (int i11 = 0; i11 < this.f60693c.size(); i11++) {
            g(this.f60693c.keyAt(i11), this.f60693c.valueAt(i11), messageDigest);
        }
    }

    @Nullable
    public <T> T c(@NonNull d<T> dVar) {
        return this.f60693c.containsKey(dVar) ? (T) this.f60693c.get(dVar) : dVar.d();
    }

    public void d(@NonNull e eVar) {
        this.f60693c.putAll((SimpleArrayMap<? extends d<?>, ? extends Object>) eVar.f60693c);
    }

    public e e(@NonNull d<?> dVar) {
        this.f60693c.remove(dVar);
        return this;
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f60693c.equals(((e) obj).f60693c);
        }
        return false;
    }

    @NonNull
    public <T> e f(@NonNull d<T> dVar, @NonNull T t11) {
        this.f60693c.put(dVar, t11);
        return this;
    }

    @Override // ik.b
    public int hashCode() {
        return this.f60693c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f60693c + l50.b.f69928j;
    }
}
