package en;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @ColorRes
    public final int[] f50028a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final q f50029b;

    /* renamed from: c, reason: collision with root package name */
    @AttrRes
    public final int f50030c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public q f50032b;

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        @ColorRes
        public int[] f50031a = new int[0];

        /* renamed from: c, reason: collision with root package name */
        @AttrRes
        public int f50033c = R.attr.colorPrimary;

        @NonNull
        public s d() {
            return new s(this);
        }

        @NonNull
        @uo.a
        public b e(@AttrRes int i11) {
            this.f50033c = i11;
            return this;
        }

        @NonNull
        @uo.a
        public b f(@Nullable q qVar) {
            this.f50032b = qVar;
            return this;
        }

        @NonNull
        @uo.a
        public b g(@NonNull @ColorRes int[] iArr) {
            this.f50031a = iArr;
            return this;
        }
    }

    @NonNull
    public static s a() {
        return new b().f(q.c()).d();
    }

    @AttrRes
    public int b() {
        return this.f50030c;
    }

    @Nullable
    public q c() {
        return this.f50029b;
    }

    @NonNull
    @ColorRes
    public int[] d() {
        return this.f50028a;
    }

    @StyleRes
    public int e(@StyleRes int i11) {
        q qVar = this.f50029b;
        return (qVar == null || qVar.e() == 0) ? i11 : this.f50029b.e();
    }

    public s(b bVar) {
        this.f50028a = bVar.f50031a;
        this.f50029b = bVar.f50032b;
        this.f50030c = bVar.f50033c;
    }
}
