package ik;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fl.m;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final b<Object> f60688e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final T f60689a;

    /* renamed from: b, reason: collision with root package name */
    public final b<T> f60690b;

    /* renamed from: c, reason: collision with root package name */
    public final String f60691c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f60692d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t11, @NonNull MessageDigest messageDigest);
    }

    public d(@NonNull String str, @Nullable T t11, @NonNull b<T> bVar) {
        this.f60691c = m.c(str);
        this.f60689a = t11;
        this.f60690b = (b) m.e(bVar);
    }

    @NonNull
    public static <T> d<T> a(@NonNull String str, @NonNull b<T> bVar) {
        return new d<>(str, null, bVar);
    }

    @NonNull
    public static <T> d<T> b(@NonNull String str, @Nullable T t11, @NonNull b<T> bVar) {
        return new d<>(str, t11, bVar);
    }

    @NonNull
    public static <T> b<T> c() {
        return (b<T>) f60688e;
    }

    @NonNull
    public static <T> d<T> f(@NonNull String str) {
        return new d<>(str, null, c());
    }

    @NonNull
    public static <T> d<T> g(@NonNull String str, @NonNull T t11) {
        return new d<>(str, t11, c());
    }

    @Nullable
    public T d() {
        return this.f60689a;
    }

    @NonNull
    public final byte[] e() {
        if (this.f60692d == null) {
            this.f60692d = this.f60691c.getBytes(ik.b.f60686b);
        }
        return this.f60692d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f60691c.equals(((d) obj).f60691c);
        }
        return false;
    }

    public void h(@NonNull T t11, @NonNull MessageDigest messageDigest) {
        this.f60690b.a(e(), t11, messageDigest);
    }

    public int hashCode() {
        return this.f60691c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f60691c + '\'' + l50.b.f69928j;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b<Object> {
        @Override // ik.d.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
