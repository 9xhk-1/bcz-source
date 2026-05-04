package m90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.c0;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.s;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<T> implements s<T, y> {

    /* renamed from: a, reason: collision with root package name */
    public final org.junit.jupiter.params.shadow.com.univocity.parsers.common.b f72701a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m90.a$a, reason: collision with other inner class name */
    public class C0882a implements c0<T, y> {

        /* renamed from: a, reason: collision with root package name */
        public T f72702a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f72703b;

        public C0882a() {
        }

        @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.c0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y getContext() {
            return a.this.f72701a.m();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f72703b) {
                return this.f72702a != null;
            }
            this.f72703b = true;
            if (a.this.f72701a.m() == null) {
                a.this.a();
            }
            T t11 = (T) a.this.d();
            this.f72702a = t11;
            return t11 != null;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f72703b) {
                hasNext();
            }
            T t11 = this.f72702a;
            this.f72702a = (T) a.this.d();
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove row");
        }
    }

    public a(org.junit.jupiter.params.shadow.com.univocity.parsers.common.b bVar) {
        this.f72701a = bVar;
    }

    public abstract void a();

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y getContext() {
        if (this.f72701a.m() == null) {
            a();
        }
        return this.f72701a.m();
    }

    public abstract T d();

    @Override // java.lang.Iterable
    public final c0<T, y> iterator() {
        return new C0882a();
    }
}
