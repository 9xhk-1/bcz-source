package com.igexin.push.core.g;

/* loaded from: classes7.dex */
public abstract class a<T> {
    public final a<T> a(final a<? super T> aVar) {
        return new a<T>() { // from class: com.igexin.push.core.g.a.1
            @Override // com.igexin.push.core.g.a
            public final void a(T t11) {
                a.this.a((a) t11);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a((a) t11);
                }
            }
        };
    }

    public abstract void a(T t11);
}
