package fl;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.g;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class p<T> implements g.b<T>, cl.o {

    /* renamed from: a, reason: collision with root package name */
    public int[] f52026a;

    /* renamed from: b, reason: collision with root package name */
    public a f52027b;

    public p() {
    }

    @Override // com.bumptech.glide.g.b
    @Nullable
    public int[] a(@NonNull T t11, int i11, int i12) {
        int[] iArr = this.f52026a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@NonNull View view) {
        if (this.f52026a == null && this.f52027b == null) {
            a aVar = new a(view);
            this.f52027b = aVar;
            aVar.j(this);
        }
    }

    @Override // cl.o
    public void e(int i11, int i12) {
        this.f52026a = new int[]{i11, i12};
        this.f52027b = null;
    }

    public p(@NonNull View view) {
        a aVar = new a(view);
        this.f52027b = aVar;
        aVar.j(this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends cl.f<View, Object> {
        public a(@NonNull View view) {
            super(view);
        }

        @Override // cl.p
        public void m(@Nullable Drawable drawable) {
        }

        @Override // cl.f
        public void n(@Nullable Drawable drawable) {
        }

        @Override // cl.p
        public void h(@NonNull Object obj, @Nullable dl.f<? super Object> fVar) {
        }
    }
}
