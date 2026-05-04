package ko;

import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@f
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<char[]> f66908a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    public static char[] a() {
        char[] cArr = f66908a.get();
        Objects.requireNonNull(cArr);
        return cArr;
    }
}
