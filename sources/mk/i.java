package mk;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kk.u;
import mk.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends fl.j<ik.b, u<?>> implements j {

    /* renamed from: e, reason: collision with root package name */
    public j.a f73453e;

    public i(long j11) {
        super(j11);
    }

    @Override // mk.j
    @SuppressLint({"InlinedApi"})
    public void b(int i11) {
        if (i11 >= 40) {
            c();
        } else if (i11 >= 20 || i11 == 15) {
            p(a() / 2);
        }
    }

    @Override // mk.j
    @Nullable
    public /* bridge */ /* synthetic */ u e(@NonNull ik.b bVar, @Nullable u uVar) {
        return (u) super.n(bVar, uVar);
    }

    @Override // mk.j
    @Nullable
    public /* bridge */ /* synthetic */ u f(@NonNull ik.b bVar) {
        return (u) super.o(bVar);
    }

    @Override // mk.j
    public void g(@NonNull j.a aVar) {
        this.f73453e = aVar;
    }

    @Override // fl.j
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int l(@Nullable u<?> uVar) {
        return uVar == null ? super.l(null) : uVar.getSize();
    }

    @Override // fl.j
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@NonNull ik.b bVar, @Nullable u<?> uVar) {
        j.a aVar = this.f73453e;
        if (aVar == null || uVar == null) {
            return;
        }
        aVar.b(uVar);
    }
}
