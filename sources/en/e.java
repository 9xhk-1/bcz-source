package en;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    @StyleRes
    public final int f49922a;

    /* renamed from: b, reason: collision with root package name */
    @StyleRes
    public final int f49923b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @StyleRes
        public int f49924a;

        /* renamed from: b, reason: collision with root package name */
        @StyleRes
        public int f49925b;

        @NonNull
        public e c() {
            return new e(this);
        }

        @NonNull
        @uo.a
        public b d(@StyleRes int i11) {
            this.f49925b = i11;
            return this;
        }

        @NonNull
        @uo.a
        public b e(@StyleRes int i11) {
            this.f49924a = i11;
            return this;
        }
    }

    @StyleRes
    public int a() {
        return this.f49923b;
    }

    @StyleRes
    public int b() {
        return this.f49922a;
    }

    public e(b bVar) {
        this.f49922a = bVar.f49924a;
        this.f49923b = bVar.f49925b;
    }
}
