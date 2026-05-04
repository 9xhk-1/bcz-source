package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p implements e {

    /* renamed from: b, reason: collision with root package name */
    public final LruCache<String, b> f41923b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends LruCache<String, b> {
        public a(int i11) {
            super(i11);
        }

        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f41926b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f41925a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41926b;

        public b(Bitmap bitmap, int i11) {
            this.f41925a = bitmap;
            this.f41926b = i11;
        }
    }

    public p(@NonNull Context context) {
        this(h0.b(context));
    }

    @Override // com.squareup.picasso.e
    public int a() {
        return this.f41923b.maxSize();
    }

    @Override // com.squareup.picasso.e
    public void b(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int j11 = h0.j(bitmap);
        if (j11 > a()) {
            this.f41923b.remove(str);
        } else {
            this.f41923b.put(str, new b(bitmap, j11));
        }
    }

    @Override // com.squareup.picasso.e
    public void c(String str) {
        for (String str2 : this.f41923b.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.f41923b.remove(str2);
            }
        }
    }

    @Override // com.squareup.picasso.e
    public void clear() {
        this.f41923b.evictAll();
    }

    public int d() {
        return this.f41923b.evictionCount();
    }

    public int e() {
        return this.f41923b.hitCount();
    }

    public int f() {
        return this.f41923b.missCount();
    }

    public int g() {
        return this.f41923b.putCount();
    }

    @Override // com.squareup.picasso.e
    @Nullable
    public Bitmap get(@NonNull String str) {
        b bVar = this.f41923b.get(str);
        if (bVar != null) {
            return bVar.f41925a;
        }
        return null;
    }

    @Override // com.squareup.picasso.e
    public int size() {
        return this.f41923b.size();
    }

    public p(int i11) {
        this.f41923b = new a(i11);
    }
}
