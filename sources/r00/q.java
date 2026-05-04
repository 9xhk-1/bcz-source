package r00;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements q30.m<String> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final BufferedReader f82817a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<String>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public String f82818a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f82819b;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f82818a;
            this.f82818a = null;
            g0.m(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f82818a == null && !this.f82819b) {
                String readLine = q.this.f82817a.readLine();
                this.f82818a = readLine;
                if (readLine == null) {
                    this.f82819b = true;
                }
            }
            return this.f82818a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(@m80.k BufferedReader reader) {
        g0.p(reader, "reader");
        this.f82817a = reader;
    }

    @Override // q30.m
    @m80.k
    public Iterator<String> iterator() {
        return new a();
    }
}
