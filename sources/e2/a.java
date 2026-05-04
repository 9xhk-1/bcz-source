package e2;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public int f48328b;

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<AbstractC0581a> f48327a = new com.badlogic.gdx.utils.a<>(false, 2, AbstractC0581a.class);

    /* renamed from: c, reason: collision with root package name */
    public int f48329c = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: e2.a$a, reason: collision with other inner class name */
    public abstract class AbstractC0581a {

        /* renamed from: a, reason: collision with root package name */
        public int f48330a;

        /* renamed from: b, reason: collision with root package name */
        public Object f48331b;

        /* renamed from: c, reason: collision with root package name */
        public int f48332c;

        public AbstractC0581a(int i11, Object obj, int i12) {
            this.f48330a = i11;
            this.f48332c = i12;
            this.f48331b = obj;
        }

        public abstract void a(int i11, Object... objArr);

        public abstract void b(int i11);

        public abstract void c(int i11, int i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f48334a;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f48335b;

        /* renamed from: c, reason: collision with root package name */
        public int f48336c;

        public b(int i11, Class<?> cls, int i12) {
            this.f48334a = i11;
            this.f48335b = cls;
            this.f48336c = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c<T extends AbstractC0581a> {
        void a(T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AbstractC0581a {

        /* renamed from: e, reason: collision with root package name */
        public float[] f48337e;

        public d(int i11, int i12, int i13) {
            super(i11, new float[i13 * i12], i12);
            this.f48337e = (float[]) this.f48331b;
        }

        @Override // e2.a.AbstractC0581a
        public void a(int i11, Object... objArr) {
            int i12 = this.f48332c;
            int i13 = a.this.f48329c * i12;
            int i14 = i12 + i13;
            int i15 = 0;
            while (i13 < i14) {
                this.f48337e[i13] = ((Float) objArr[i15]).floatValue();
                i13++;
                i15++;
            }
        }

        @Override // e2.a.AbstractC0581a
        public void b(int i11) {
            int i12 = this.f48332c * i11;
            float[] fArr = new float[i12];
            float[] fArr2 = this.f48337e;
            System.arraycopy(fArr2, 0, fArr, 0, Math.min(fArr2.length, i12));
            this.f48337e = fArr;
            this.f48331b = fArr;
        }

        @Override // e2.a.AbstractC0581a
        public void c(int i11, int i12) {
            int i13 = this.f48332c;
            int i14 = i11 * i13;
            int i15 = i12 * i13;
            int i16 = i13 + i14;
            while (i14 < i16) {
                float[] fArr = this.f48337e;
                float f11 = fArr[i14];
                fArr[i14] = fArr[i15];
                fArr[i15] = f11;
                i14++;
                i15++;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends AbstractC0581a {

        /* renamed from: e, reason: collision with root package name */
        public int[] f48339e;

        public e(int i11, int i12, int i13) {
            super(i11, new int[i13 * i12], i12);
            this.f48339e = (int[]) this.f48331b;
        }

        @Override // e2.a.AbstractC0581a
        public void a(int i11, Object... objArr) {
            int i12 = this.f48332c;
            int i13 = a.this.f48329c * i12;
            int i14 = i12 + i13;
            int i15 = 0;
            while (i13 < i14) {
                this.f48339e[i13] = ((Integer) objArr[i15]).intValue();
                i13++;
                i15++;
            }
        }

        @Override // e2.a.AbstractC0581a
        public void b(int i11) {
            int i12 = this.f48332c * i11;
            int[] iArr = new int[i12];
            int[] iArr2 = this.f48339e;
            System.arraycopy(iArr2, 0, iArr, 0, Math.min(iArr2.length, i12));
            this.f48339e = iArr;
            this.f48331b = iArr;
        }

        @Override // e2.a.AbstractC0581a
        public void c(int i11, int i12) {
            int i13 = this.f48332c;
            int i14 = i11 * i13;
            int i15 = i12 * i13;
            int i16 = i13 + i14;
            while (i14 < i16) {
                int[] iArr = this.f48339e;
                int i17 = iArr[i14];
                iArr[i14] = iArr[i15];
                iArr[i15] = i17;
                i14++;
                i15++;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f<T> extends AbstractC0581a {

        /* renamed from: e, reason: collision with root package name */
        public Class<T> f48341e;

        /* renamed from: f, reason: collision with root package name */
        public T[] f48342f;

        public f(int i11, int i12, int i13, Class<T> cls) {
            super(i11, g3.b.c(cls, i13 * i12), i12);
            this.f48341e = cls;
            this.f48342f = (T[]) ((Object[]) this.f48331b);
        }

        @Override // e2.a.AbstractC0581a
        public void a(int i11, Object... objArr) {
            int i12 = this.f48332c;
            int i13 = a.this.f48329c * i12;
            int i14 = i12 + i13;
            int i15 = 0;
            while (i13 < i14) {
                ((T[]) this.f48342f)[i13] = objArr[i15];
                i13++;
                i15++;
            }
        }

        @Override // e2.a.AbstractC0581a
        public void b(int i11) {
            T[] tArr = (T[]) ((Object[]) g3.b.c(this.f48341e, this.f48332c * i11));
            T[] tArr2 = this.f48342f;
            System.arraycopy(tArr2, 0, tArr, 0, Math.min(tArr2.length, tArr.length));
            this.f48342f = tArr;
            this.f48331b = tArr;
        }

        @Override // e2.a.AbstractC0581a
        public void c(int i11, int i12) {
            int i13 = this.f48332c;
            int i14 = i11 * i13;
            int i15 = i12 * i13;
            int i16 = i13 + i14;
            while (i14 < i16) {
                T[] tArr = this.f48342f;
                T t11 = tArr[i14];
                tArr[i14] = tArr[i15];
                tArr[i15] = t11;
                i14++;
                i15++;
            }
        }
    }

    public a(int i11) {
        this.f48328b = i11;
    }

    public <T extends AbstractC0581a> T a(b bVar) {
        return (T) b(bVar, null);
    }

    public <T extends AbstractC0581a> T b(b bVar, c<T> cVar) {
        T t11 = (T) g(bVar);
        if (t11 != null) {
            return t11;
        }
        T t12 = (T) d(bVar);
        if (cVar != null) {
            cVar.a(t12);
        }
        this.f48327a.a(t12);
        return t12;
    }

    public void c(Object... objArr) {
        if (this.f48329c == this.f48328b) {
            throw new GdxRuntimeException("Capacity reached, cannot add other elements");
        }
        a.b<AbstractC0581a> it = this.f48327a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            AbstractC0581a next = it.next();
            next.a(i11, objArr);
            i11 += next.f48332c;
        }
        this.f48329c++;
    }

    public final <T extends AbstractC0581a> T d(b bVar) {
        Class<?> cls = bVar.f48335b;
        return cls == Float.TYPE ? new d(bVar.f48334a, bVar.f48336c, this.f48328b) : cls == Integer.TYPE ? new e(bVar.f48334a, bVar.f48336c, this.f48328b) : new f(bVar.f48334a, bVar.f48336c, this.f48328b, cls);
    }

    public void e() {
        this.f48327a.clear();
        this.f48329c = 0;
    }

    public final int f(int i11) {
        int i12 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<AbstractC0581a> aVar = this.f48327a;
            if (i12 >= aVar.f13179b) {
                return -1;
            }
            if (aVar.f13178a[i12].f48330a == i11) {
                return i12;
            }
            i12++;
        }
    }

    public <T extends AbstractC0581a> T g(b bVar) {
        a.b<AbstractC0581a> it = this.f48327a.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (t11.f48330a == bVar.f48334a) {
                return t11;
            }
        }
        return null;
    }

    public <T> void h(int i11) {
        this.f48327a.A(f(i11));
    }

    public void i(int i11) {
        int i12 = this.f48329c - 1;
        a.b<AbstractC0581a> it = this.f48327a.iterator();
        while (it.hasNext()) {
            it.next().c(i11, i12);
        }
        this.f48329c = i12;
    }

    public void j(int i11) {
        if (this.f48328b != i11) {
            a.b<AbstractC0581a> it = this.f48327a.iterator();
            while (it.hasNext()) {
                it.next().b(i11);
            }
            this.f48328b = i11;
        }
    }
}
