package com.meizu.cloud.pushsdk.c.e;

import com.meizu.cloud.pushsdk.c.a.e;
import com.meizu.cloud.pushsdk.c.c.k;

/* loaded from: classes7.dex */
public final class c {
    public static <T> com.meizu.cloud.pushsdk.c.a.c<T> a(com.meizu.cloud.pushsdk.c.a.b bVar) {
        int g11 = bVar.g();
        return g11 != 0 ? g11 != 1 ? g11 != 2 ? new com.meizu.cloud.pushsdk.c.a.c<>(new com.meizu.cloud.pushsdk.c.b.a()) : d(bVar) : c(bVar) : b(bVar);
    }

    private static <T> com.meizu.cloud.pushsdk.c.a.c<T> b(com.meizu.cloud.pushsdk.c.a.b bVar) {
        try {
            try {
                k a11 = a.a(bVar);
                if (a11 == null) {
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a()));
                    com.meizu.cloud.pushsdk.c.h.a.a(a11, bVar);
                    return cVar;
                }
                if (bVar.f() == e.OK_HTTP_RESPONSE) {
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.c.a.c<>(a11);
                    cVar2.a(a11);
                    com.meizu.cloud.pushsdk.c.h.a.a(a11, bVar);
                    return cVar2;
                }
                if (a11.a() >= 400) {
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar3 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(a11), bVar, a11.a()));
                    cVar3.a(a11);
                    com.meizu.cloud.pushsdk.c.h.a.a(a11, bVar);
                    return cVar3;
                }
                com.meizu.cloud.pushsdk.c.a.c<T> a12 = bVar.a(a11);
                a12.a(a11);
                com.meizu.cloud.pushsdk.c.h.a.a(a11, bVar);
                return a12;
            } catch (com.meizu.cloud.pushsdk.c.b.a e11) {
                com.meizu.cloud.pushsdk.c.a.c<T> cVar4 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(e11)));
                com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
                return cVar4;
            } catch (Exception e12) {
                com.meizu.cloud.pushsdk.c.a.c<T> cVar5 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e12));
                com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
                return cVar5;
            }
        } catch (Throwable th2) {
            com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
            throw th2;
        }
    }

    private static <T> com.meizu.cloud.pushsdk.c.a.c<T> c(com.meizu.cloud.pushsdk.c.a.b bVar) {
        try {
            k b11 = a.b(bVar);
            if (b11 == null) {
                return new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a()));
            }
            if (b11.a() >= 400) {
                com.meizu.cloud.pushsdk.c.a.c<T> cVar = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(b11), bVar, b11.a()));
                cVar.a(b11);
                return cVar;
            }
            com.meizu.cloud.pushsdk.c.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.c.a.c<>("success");
            cVar2.a(b11);
            return cVar2;
        } catch (com.meizu.cloud.pushsdk.c.b.a e11) {
            return new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(e11)));
        } catch (Exception e12) {
            return new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e12));
        }
    }

    private static <T> com.meizu.cloud.pushsdk.c.a.c<T> d(com.meizu.cloud.pushsdk.c.a.b bVar) {
        try {
            try {
                k c11 = a.c(bVar);
                if (c11 == null) {
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a()));
                    com.meizu.cloud.pushsdk.c.h.a.a(c11, bVar);
                    return cVar;
                }
                if (bVar.f() == e.OK_HTTP_RESPONSE) {
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar2 = new com.meizu.cloud.pushsdk.c.a.c<>(c11);
                    cVar2.a(c11);
                    com.meizu.cloud.pushsdk.c.h.a.a(c11, bVar);
                    return cVar2;
                }
                if (c11.a() >= 400) {
                    com.meizu.cloud.pushsdk.c.a.c<T> cVar3 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(new com.meizu.cloud.pushsdk.c.b.a(c11), bVar, c11.a()));
                    cVar3.a(c11);
                    com.meizu.cloud.pushsdk.c.h.a.a(c11, bVar);
                    return cVar3;
                }
                com.meizu.cloud.pushsdk.c.a.c<T> a11 = bVar.a(c11);
                a11.a(c11);
                com.meizu.cloud.pushsdk.c.h.a.a(c11, bVar);
                return a11;
            } catch (com.meizu.cloud.pushsdk.c.b.a e11) {
                com.meizu.cloud.pushsdk.c.a.c<T> cVar4 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e11));
                com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
                return cVar4;
            } catch (Exception e12) {
                com.meizu.cloud.pushsdk.c.a.c<T> cVar5 = new com.meizu.cloud.pushsdk.c.a.c<>(com.meizu.cloud.pushsdk.c.h.b.a(e12));
                com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
                return cVar5;
            }
        } catch (Throwable th2) {
            com.meizu.cloud.pushsdk.c.h.a.a(null, bVar);
            throw th2;
        }
    }
}
