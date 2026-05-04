package com.google.gson;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface ReflectionAccessFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final ReflectionAccessFilter f34916a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ReflectionAccessFilter f34917b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final ReflectionAccessFilter f34918c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final ReflectionAccessFilter f34919d = new d();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum FilterResult {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult a(Class<?> cls) {
            return com.google.gson.internal.k.f(cls) ? FilterResult.BLOCK_INACCESSIBLE : FilterResult.INDECISIVE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult a(Class<?> cls) {
            return com.google.gson.internal.k.f(cls) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult a(Class<?> cls) {
            return com.google.gson.internal.k.c(cls) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements ReflectionAccessFilter {
        @Override // com.google.gson.ReflectionAccessFilter
        public FilterResult a(Class<?> cls) {
            return com.google.gson.internal.k.e(cls) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
        }
    }

    FilterResult a(Class<?> cls);
}
